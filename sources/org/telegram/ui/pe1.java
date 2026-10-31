package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pe1 extends org.telegram.ui.Components.sk0 {
    public org.telegram.ui.Wallet.k3 D;
    public final WallpapersListActivity E;
    public final Context f40651c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f40652f = true;
    public String h;
    public String f40653n;
    public String f40654r;
    public int f40655s;
    public int f40656w;
    public boolean f40657x;
    public String f40658y;

    public pe1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f40651c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f40653n != null) {
            str = a1.g.o(this.f40653n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.k3 k3Var = this.D;
        if (k3Var != null) {
            org.telegram.messenger.i0.r(k3Var);
            this.D = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f40652f = true;
            this.h = null;
            if (this.f40655s != 0) {
                i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f40655s, true);
                this.f40655s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f40652f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                org.telegram.ui.Wallet.k3 k3Var2 = new org.telegram.ui.Wallet.k3(19, this, str);
                this.D = k3Var2;
                org.telegram.messenger.i0.h3(k3Var2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f40655s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f40655s, true);
            this.f40655s = 0;
        }
        this.f40658y = str;
        i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        TLObject e22 = r12.e2(org.telegram.messenger.vp.r1(i11).N3);
        if (!(e22 instanceof TLRPC.User)) {
            if (z10 && !this.f40657x) {
                this.f40657x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.vp.r1(i16).N3;
                i17 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new k(this, 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = sc.e.h("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.vp.r1(i12).p1((TLRPC.User) e22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.f40656w + 1;
        this.f40656w = i20;
        i13 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        this.f40655s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.voip.g0(this, i20, 4));
        i14 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f40655s;
        i15 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.N);
    }

    @Override
    public final int d(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            if (i10 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131745832, null));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        boolean z11 = true;
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 / i13 != ceil - 1) {
            z11 = false;
        }
        uaVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            uaVar.e(wallpapersListActivity.f35485r, obj, "", i14);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.f40651c;
        if (i10 != 0) {
            piVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.z3(context, null);
                }
            } else {
                ?? w71Var = new w71(11, context, null);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(19);
                w71Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
                w71Var.setClipToPadding(false);
                fVar.j1(0);
                w71Var.setLayoutManager(fVar);
                w71Var.setAdapter(new kg.f(this, 8));
                w71Var.setOnItemClickListener(new kz0(this, 13));
                frameLayout = w71Var;
            }
            piVar = frameLayout;
        } else {
            piVar = new org.telegram.ui.Components.pi(this, context, 2);
            piVar.setTag(-33024);
        }
        if (i10 == 1) {
            piVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(60.0f)));
        } else {
            piVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.c1(piVar);
    }
}
