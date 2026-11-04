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
public final class nc1 extends org.telegram.ui.Components.sj0 {
    public hc1 E;
    public final WallpapersListActivity F;
    public final Context f47967c;
    public final ArrayList d = new ArrayList();
    public final HashMap f47968e = new HashMap();
    public boolean f47969f = true;
    public String h;
    public String f47970n;
    public String f47971r;
    public int f47972s;
    public int f47973w;
    public boolean f47974x;
    public String f47975y;

    public nc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.F = wallpapersListActivity;
        this.f47967c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i3;
        if (str != null && this.f47970n != null) {
            str = org.telegram.ui.Cells.f1.r(this.f47970n, " ", str, new StringBuilder("#color"));
        }
        hc1 hc1Var = this.E;
        if (hc1Var != null) {
            org.telegram.messenger.g0.r(hc1Var);
            this.E = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f47968e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f47969f = true;
            this.h = null;
            if (this.f47972s != 0) {
                i3 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i3).cancelRequest(this.f47972s, true);
                this.f47972s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f47969f = true;
                F(str, "", true);
                this.h = str;
                f();
            } else {
                hc1 hc1Var2 = new hc1(1, this, str);
                this.E = hc1Var2;
                org.telegram.messenger.g0.i3(hc1Var2, 500L);
            }
        }
        f();
    }

    public final void F(String str, String str2, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f47972s;
        WallpapersListActivity wallpapersListActivity = this.F;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f47972s, true);
            this.f47972s = 0;
        }
        this.f47975y = str;
        i3 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        i10 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        TLObject f22 = s12.f2(org.telegram.messenger.hp.s1(i10).M3);
        if (!(f22 instanceof TLRPC.User)) {
            if (z10 && !this.f47974x) {
                this.f47974x = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i15 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = org.telegram.messenger.hp.s1(i15).M3;
                i16 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new l(this, 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = t4.c.f("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = org.telegram.messenger.hp.s1(i11).q1((TLRPC.User) f22);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.f47973w + 1;
        this.f47973w = i19;
        i12 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        this.f47972s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new ci.a2(this, i19, 9));
        i13 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f47972s;
        i14 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override
    public final int b() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.F.O);
    }

    @Override
    public final int d(int i3) {
        if (TextUtils.isEmpty(this.h)) {
            if (i3 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        Object obj;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131745825, null));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
        WallpapersListActivity wallpapersListActivity = this.F;
        int i11 = i3 * wallpapersListActivity.O;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.O);
        int i12 = wallpapersListActivity.O;
        boolean z11 = true;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 / i12 != ceil - 1) {
            z11 = false;
        }
        taVar.d(i12, z10, z11);
        for (int i13 = 0; i13 < wallpapersListActivity.O; i13++) {
            int i14 = i11 + i13;
            if (i14 < arrayList.size()) {
                obj = arrayList.get(i14);
            } else {
                obj = null;
            }
            taVar.e(wallpapersListActivity.f43537r, obj, "", i13);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout piVar;
        FrameLayout frameLayout;
        Context context = this.f47967c;
        if (i3 != 0) {
            piVar = null;
            if (i3 != 1) {
                if (i3 == 2) {
                    frameLayout = new org.telegram.ui.Cells.x3(context, null);
                }
            } else {
                ?? u51Var = new u51(13, context, null);
                u51Var.setItemAnimator(null);
                u51Var.setLayoutAnimation(null);
                kg.y yVar = new kg.y(20);
                u51Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                u51Var.setClipToPadding(false);
                yVar.j1(0);
                u51Var.setLayoutManager(yVar);
                u51Var.setAdapter(new ci.r4(this, 8));
                u51Var.setOnItemClickListener(new nx0(this, 13));
                frameLayout = u51Var;
            }
            piVar = frameLayout;
        } else {
            piVar = new org.telegram.ui.Components.pi(this, context, 2);
            piVar.setTag(-33024);
        }
        if (i3 == 1) {
            piVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(60.0f)));
        } else {
            piVar.setLayoutParams(new u4.p0(-1, -2));
        }
        return new u4.d1(piVar);
    }
}
