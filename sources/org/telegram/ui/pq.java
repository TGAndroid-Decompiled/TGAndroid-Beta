package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pq extends org.telegram.ui.Components.h41 {
    public final wa1 f48631e;
    public final long f48632f;
    public final ua1 h;
    public String f48633n;
    public org.telegram.ui.ActionBar.f5 f48634r;
    public boolean f48635s = false;

    public pq(wa1 wa1Var, long j10, ua1 ua1Var) {
        this.f48631e = wa1Var;
        this.f48632f = j10;
        this.h = ua1Var;
        oq oqVar = new oq(this, 0);
        if (wa1Var.f50763c) {
            oqVar.run();
        } else {
            wa1Var.f50765f.add(oqVar);
        }
    }

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        int i3;
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(this.f48633n);
        long j10 = this.f48632f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.r31 c2 = org.telegram.ui.Components.r31.c(1, 2131232053, org.telegram.messenger.bd.M0(2131751236, null));
            c2.f37633r = true;
            arrayList.add(c2);
            arrayList.add(org.telegram.ui.Components.r31.C(null));
        }
        if (TextUtils.isEmpty(this.f48633n)) {
            arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131751235, null)));
        }
        ArrayList arrayList2 = this.f48631e.f50764e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat != null && !org.telegram.messenger.t3.n0(chat)) {
                i10++;
                if (!TextUtils.isEmpty(this.f48633n)) {
                    String lowerCase = this.f48633n.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase) && !k2.p1.z(" ", lowerCase, lowerCase2) && !O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                    }
                }
                long j11 = chat.f27001id;
                org.telegram.ui.Components.r31 r31Var = new org.telegram.ui.Components.r31(11);
                r31Var.f37637w = true;
                r31Var.f37638x = -j11;
                if (j10 == j11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r31Var.L(z10);
                arrayList.add(r31Var);
            }
        }
        if (TextUtils.isEmpty(this.f48633n) && i10 == 0) {
            org.telegram.ui.Components.r31 c10 = org.telegram.ui.Components.r31.c(2, 2131232089, org.telegram.messenger.bd.M0(2131751233, null));
            c10.f37632q = true;
            arrayList.add(c10);
        }
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f48634r;
        if (f5Var != null) {
            if (i10 > 5) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            f5Var.setVisibility(i3);
        }
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131751232, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = r31Var.d;
        ua1 ua1Var = this.h;
        if (i3 == 1) {
            ua1Var.a(null);
            finishFragment();
        } else if (i3 == 2) {
            this.f48635s = true;
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z10 = org.telegram.messenger.r2.f25040a;
            presentFragment(new g(0));
            e12.edit().putBoolean("channel_intro", true).apply();
        } else if (r31Var.f54715a == 12) {
            finishFragment();
            ua1Var.a(getMessagesController().M0(Long.valueOf(-r31Var.f37638x)));
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.e5 o10 = this.simpleActionBar.o();
        getResourceProvider();
        org.telegram.ui.ActionBar.f5 b10 = o10.b(0, 2131232486);
        b10.N();
        b10.C0 = new lg.w1(this, 4);
        this.f48634r = b10;
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.f48634r.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        this.f48634r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f34298a.r1();
        this.f34298a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f34298a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f48635s) {
            wa1 wa1Var = this.f48631e;
            wa1Var.f50763c = false;
            wa1Var.f50765f.add(new oq(this, 1));
            this.f48635s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
