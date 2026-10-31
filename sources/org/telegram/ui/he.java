package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class he extends LinearLayout {
    public static final int f37901y = 0;
    public final int f37902a;
    public final ee f37903b;
    public final ge f37904c;
    public final l0 d;
    public final long e;
    public final md f37905f;
    public String h;
    public final ArrayList f37906n;
    public final ArrayList f37907r;
    public String f37908s;
    public final boolean[] f37909w;
    public final le f37910x;

    public he(le leVar, Context context, int i10, long j10, int i11, md mdVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f37910x = leVar;
        this.h = "";
        this.f37906n = new ArrayList();
        this.f37907r = new ArrayList();
        this.f37908s = "";
        this.f37909w = new boolean[]{false, false};
        this.f37902a = i10;
        this.e = j10;
        this.f37905f = mdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        ee eeVar = new ee(this, context, p6Var, leVar);
        this.f37903b = eeVar;
        ge geVar = new ge(this, context, i10, j10, i11, p6Var);
        this.f37904c = geVar;
        eeVar.setAdapter(geVar);
        org.telegram.ui.Components.v71 n10 = eeVar.n(-2, true);
        ei.r rVar = leVar.f39195d1;
        if (rVar != null) {
            rVar.c(eeVar);
        }
        l0 l0Var = new l0(this, context, 5);
        this.d = l0Var;
        l0Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        l0Var.addView(n10, w7.b6.e(-1, 48, 48));
        addView(eeVar, w7.b6.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f37906n.isEmpty() && this.f37907r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.f37906n.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f37907r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f37909w;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.e;
            le leVar = this.f37910x;
            int i12 = this.f37902a;
            if (i10 == 1) {
                if (this.h != null && leVar.f39193b1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = org.telegram.messenger.vp.r1(i12).i1(j10);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f37906n.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final he f36448b;

                        {
                            this.f36448b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final he heVar = this.f36448b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            md mdVar;
                                            md mdVar2;
                                            switch (r7) {
                                                case 0:
                                                    he heVar2 = heVar;
                                                    int i14 = heVar2.f37902a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.vp.r1(i14).V3(starsStatus.users, false);
                                                        org.telegram.messenger.vp.r1(i14).P3(starsStatus.chats, false);
                                                        heVar2.f37907r.addAll(starsStatus.history);
                                                        heVar2.f37908s = starsStatus.next_offset;
                                                        heVar2.f37909w[i15] = false;
                                                        heVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (heVar2.a() != z10 && (mdVar = heVar2.f37905f) != null) {
                                                        mdVar.run();
                                                    }
                                                    if (heVar2.b(i15) != z11) {
                                                        heVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    he heVar3 = heVar;
                                                    int i16 = heVar3.f37902a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.vp.r1(i16).V3(starsStatus2.users, false);
                                                        org.telegram.messenger.vp.r1(i16).P3(starsStatus2.chats, false);
                                                        heVar3.f37906n.addAll(starsStatus2.history);
                                                        heVar3.h = starsStatus2.next_offset;
                                                        heVar3.f37909w[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (heVar3.a() != z10 && (mdVar2 = heVar3.f37905f) != null) {
                                                        mdVar2.run();
                                                    }
                                                    if (heVar3.b(i17) != z11) {
                                                        heVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final he heVar2 = this.f36448b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            md mdVar;
                                            md mdVar2;
                                            switch (r7) {
                                                case 0:
                                                    he heVar22 = heVar2;
                                                    int i142 = heVar22.f37902a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.vp.r1(i142).V3(starsStatus.users, false);
                                                        org.telegram.messenger.vp.r1(i142).P3(starsStatus.chats, false);
                                                        heVar22.f37907r.addAll(starsStatus.history);
                                                        heVar22.f37908s = starsStatus.next_offset;
                                                        heVar22.f37909w[i15] = false;
                                                        heVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (heVar22.a() != z12 && (mdVar = heVar22.f37905f) != null) {
                                                        mdVar.run();
                                                    }
                                                    if (heVar22.b(i15) != z13) {
                                                        heVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    he heVar3 = heVar2;
                                                    int i16 = heVar3.f37902a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.vp.r1(i16).V3(starsStatus2.users, false);
                                                        org.telegram.messenger.vp.r1(i16).P3(starsStatus2.chats, false);
                                                        heVar3.f37906n.addAll(starsStatus2.history);
                                                        heVar3.h = starsStatus2.next_offset;
                                                        heVar3.f37909w[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (heVar3.a() != z12 && (mdVar2 = heVar3.f37905f) != null) {
                                                        mdVar2.run();
                                                    }
                                                    if (heVar3.b(i17) != z13) {
                                                        heVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                }
            } else if (i10 == 0 && this.f37908s != null && leVar.f39194c1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = org.telegram.messenger.vp.r1(i12).i1(j10);
                tL_payments_getStarsTransactions2.offset = this.f37908s;
                if (this.f37907r.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final he f36448b;

                    {
                        this.f36448b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final he heVar = this.f36448b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        md mdVar;
                                        md mdVar2;
                                        switch (r7) {
                                            case 0:
                                                he heVar22 = heVar;
                                                int i142 = heVar22.f37902a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.vp.r1(i142).V3(starsStatus.users, false);
                                                    org.telegram.messenger.vp.r1(i142).P3(starsStatus.chats, false);
                                                    heVar22.f37907r.addAll(starsStatus.history);
                                                    heVar22.f37908s = starsStatus.next_offset;
                                                    heVar22.f37909w[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error2);
                                                    }
                                                }
                                                if (heVar22.a() != z10 && (mdVar = heVar22.f37905f) != null) {
                                                    mdVar.run();
                                                }
                                                if (heVar22.b(i15) != z11) {
                                                    heVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                he heVar3 = heVar;
                                                int i16 = heVar3.f37902a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.vp.r1(i16).V3(starsStatus2.users, false);
                                                    org.telegram.messenger.vp.r1(i16).P3(starsStatus2.chats, false);
                                                    heVar3.f37906n.addAll(starsStatus2.history);
                                                    heVar3.h = starsStatus2.next_offset;
                                                    heVar3.f37909w[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error3);
                                                    }
                                                }
                                                if (heVar3.a() != z10 && (mdVar2 = heVar3.f37905f) != null) {
                                                    mdVar2.run();
                                                }
                                                if (heVar3.b(i17) != z11) {
                                                    heVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final he heVar2 = this.f36448b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        md mdVar;
                                        md mdVar2;
                                        switch (r7) {
                                            case 0:
                                                he heVar22 = heVar2;
                                                int i142 = heVar22.f37902a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.vp.r1(i142).V3(starsStatus.users, false);
                                                    org.telegram.messenger.vp.r1(i142).P3(starsStatus.chats, false);
                                                    heVar22.f37907r.addAll(starsStatus.history);
                                                    heVar22.f37908s = starsStatus.next_offset;
                                                    heVar22.f37909w[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error2);
                                                    }
                                                }
                                                if (heVar22.a() != z12 && (mdVar = heVar22.f37905f) != null) {
                                                    mdVar.run();
                                                }
                                                if (heVar22.b(i15) != z13) {
                                                    heVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                he heVar3 = heVar2;
                                                int i16 = heVar3.f37902a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.vp.r1(i16).V3(starsStatus2.users, false);
                                                    org.telegram.messenger.vp.r1(i16).P3(starsStatus2.chats, false);
                                                    heVar3.f37906n.addAll(starsStatus2.history);
                                                    heVar3.h = starsStatus2.next_offset;
                                                    heVar3.f37909w[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error3);
                                                    }
                                                }
                                                if (heVar3.a() != z12 && (mdVar2 = heVar3.f37905f) != null) {
                                                    mdVar2.run();
                                                }
                                                if (heVar3.b(i17) != z13) {
                                                    heVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ee eeVar = this.f37903b;
            if (i10 < eeVar.getViewPages().length) {
                View view = eeVar.getViewPages()[i10];
                if (view instanceof fe) {
                    fe feVar = (fe) view;
                    org.telegram.ui.Components.u51 u51Var = feVar.f37240a;
                    u51Var.f30819f3.O(true);
                    if (u51Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
                            if (!(u51Var.getChildAt(i11) instanceof org.telegram.ui.Components.zz)) {
                            }
                        }
                    }
                    feVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int h;
        ge geVar = this.f37904c;
        ArrayList arrayList = geVar.e;
        ArrayList arrayList2 = geVar.e;
        int size = arrayList.size();
        ee eeVar = this.f37903b;
        if (size == 0) {
            h = -1;
        } else {
            h = geVar.h(eeVar.getCurrentPosition());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << geVar.h(i11);
        }
        geVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = geVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        eeVar.onTouchEvent(null);
        eeVar.setPosition(i13);
        eeVar.J();
        eeVar.o(false);
        this.f37910x.p();
    }

    public org.telegram.ui.Components.tk0 getCurrentListView() {
        View currentView = this.f37903b.getCurrentView();
        if (!(currentView instanceof fe)) {
            return null;
        }
        return ((fe) currentView).f37240a;
    }
}
