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
public final class ne1 extends org.telegram.ui.Components.tk0 {
    public org.telegram.ui.Wallet.m2 D;
    public final WallpapersListActivity E;
    public final Context f39887c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f39888f = true;
    public String h;
    public String f39889n;
    public String f39890r;
    public int f39891s;
    public int f39892w;
    public boolean f39893x;
    public String f39894y;

    public ne1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f39887c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f39889n != null) {
            str = a1.g.o(this.f39889n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.m2 m2Var = this.D;
        if (m2Var != null) {
            org.telegram.messenger.i0.r(m2Var);
            this.D = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f39888f = true;
            this.h = null;
            if (this.f39891s != 0) {
                i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f39891s, true);
                this.f39891s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f39888f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                org.telegram.ui.Wallet.m2 m2Var2 = new org.telegram.ui.Wallet.m2(20, this, str);
                this.D = m2Var2;
                org.telegram.messenger.i0.h3(m2Var2, 500L);
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
        int i19 = this.f39891s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f39891s, true);
            this.f39891s = 0;
        }
        this.f39894y = str;
        i10 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
        i11 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        TLObject e22 = r12.e2(org.telegram.messenger.wp.r1(i11).N3);
        if (!(e22 instanceof TLRPC.User)) {
            if (z10 && !this.f39893x) {
                this.f39893x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.wp.r1(i16).N3;
                i17 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new k(this, 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = sc.e.h("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.wp.r1(i12).p1((TLRPC.User) e22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.f39892w + 1;
        this.f39892w = i20;
        i13 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        this.f39891s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.voip.g0(this, i20, 4));
        i14 = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f39891s;
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
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.L0(2131745832, null));
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
            uaVar.e(wallpapersListActivity.f35492r, obj, "", i14);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.f39887c;
        if (i10 != 0) {
            piVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.z3(context, null);
                }
            } else {
                ?? u71Var = new u71(11, context, null);
                u71Var.setItemAnimator(null);
                u71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(19);
                u71Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
                u71Var.setClipToPadding(false);
                fVar.j1(0);
                u71Var.setLayoutManager(fVar);
                u71Var.setAdapter(new kg.f(this, 8));
                u71Var.setOnItemClickListener(new jz0(this, 13));
                frameLayout = u71Var;
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
