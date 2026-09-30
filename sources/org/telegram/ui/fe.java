package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fe extends LinearLayout {
    public final int f33728a;
    public final org.telegram.ui.Components.y81 f33729b;
    public final ee f33730c;
    public final long d;
    public final nd e;
    public String f33731f;
    public final ArrayList h;
    public final ArrayList f33732n;
    public String f33733r;
    public final boolean[] f33734s;
    public final je v;

    public fe(je jeVar, Context context, int i10, long j3, int i11, nd ndVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.v = jeVar;
        this.f33731f = "";
        this.h = new ArrayList();
        this.f33732n = new ArrayList();
        this.f33733r = "";
        this.f33734s = new boolean[]{false, false};
        this.f33728a = i10;
        this.d = j3;
        this.e = ndVar;
        setOrientation(1);
        org.telegram.ui.Components.y81 y81Var = new org.telegram.ui.Components.y81(context, null);
        this.f33729b = y81Var;
        ee eeVar = new ee(this, context, i10, j3, i11, d6Var);
        this.f33730c = eeVar;
        y81Var.setAdapter(eeVar);
        View n10 = y81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19077d7, d6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(y81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19146h5, d6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f33732n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f33732n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f33734s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            je jeVar = this.v;
            int i12 = this.f33728a;
            if (i10 == 1) {
                if (this.f33731f != null && jeVar.f34850f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f33731f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final fe f32471b;

                        {
                            this.f32471b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final fe feVar = this.f32471b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            nd ndVar;
                                            nd ndVar2;
                                            switch (r7) {
                                                case 0:
                                                    fe feVar2 = feVar;
                                                    int i14 = feVar2.f33728a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        feVar2.f33732n.addAll(starsStatus.history);
                                                        feVar2.f33733r = starsStatus.next_offset;
                                                        feVar2.f33734s[i15] = false;
                                                        feVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (feVar2.a() != z10 && (ndVar = feVar2.e) != null) {
                                                        ndVar.run();
                                                    }
                                                    if (feVar2.b(i15) != z11) {
                                                        feVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    fe feVar3 = feVar;
                                                    int i16 = feVar3.f33728a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        feVar3.h.addAll(starsStatus2.history);
                                                        feVar3.f33731f = starsStatus2.next_offset;
                                                        feVar3.f33734s[i17] = false;
                                                        feVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (feVar3.a() != z10 && (ndVar2 = feVar3.e) != null) {
                                                        ndVar2.run();
                                                    }
                                                    if (feVar3.b(i17) != z11) {
                                                        feVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final fe feVar2 = this.f32471b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            nd ndVar;
                                            nd ndVar2;
                                            switch (r7) {
                                                case 0:
                                                    fe feVar22 = feVar2;
                                                    int i142 = feVar22.f33728a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        feVar22.f33732n.addAll(starsStatus.history);
                                                        feVar22.f33733r = starsStatus.next_offset;
                                                        feVar22.f33734s[i15] = false;
                                                        feVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (feVar22.a() != z12 && (ndVar = feVar22.e) != null) {
                                                        ndVar.run();
                                                    }
                                                    if (feVar22.b(i15) != z13) {
                                                        feVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    fe feVar3 = feVar2;
                                                    int i16 = feVar3.f33728a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        feVar3.h.addAll(starsStatus2.history);
                                                        feVar3.f33731f = starsStatus2.next_offset;
                                                        feVar3.f33734s[i17] = false;
                                                        feVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (feVar3.a() != z12 && (ndVar2 = feVar3.e) != null) {
                                                        ndVar2.run();
                                                    }
                                                    if (feVar3.b(i17) != z13) {
                                                        feVar3.e();
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
            } else if (i10 == 0 && this.f33733r != null && jeVar.f34851g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f33733r;
                if (this.f33732n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final fe f32471b;

                    {
                        this.f32471b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final fe feVar = this.f32471b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        nd ndVar;
                                        nd ndVar2;
                                        switch (r7) {
                                            case 0:
                                                fe feVar22 = feVar;
                                                int i142 = feVar22.f33728a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    feVar22.f33732n.addAll(starsStatus.history);
                                                    feVar22.f33733r = starsStatus.next_offset;
                                                    feVar22.f33734s[i15] = false;
                                                    feVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (feVar22.a() != z10 && (ndVar = feVar22.e) != null) {
                                                    ndVar.run();
                                                }
                                                if (feVar22.b(i15) != z11) {
                                                    feVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                fe feVar3 = feVar;
                                                int i16 = feVar3.f33728a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    feVar3.h.addAll(starsStatus2.history);
                                                    feVar3.f33731f = starsStatus2.next_offset;
                                                    feVar3.f33734s[i17] = false;
                                                    feVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (feVar3.a() != z10 && (ndVar2 = feVar3.e) != null) {
                                                    ndVar2.run();
                                                }
                                                if (feVar3.b(i17) != z11) {
                                                    feVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final fe feVar2 = this.f32471b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        nd ndVar;
                                        nd ndVar2;
                                        switch (r7) {
                                            case 0:
                                                fe feVar22 = feVar2;
                                                int i142 = feVar22.f33728a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    feVar22.f33732n.addAll(starsStatus.history);
                                                    feVar22.f33733r = starsStatus.next_offset;
                                                    feVar22.f33734s[i15] = false;
                                                    feVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (feVar22.a() != z12 && (ndVar = feVar22.e) != null) {
                                                    ndVar.run();
                                                }
                                                if (feVar22.b(i15) != z13) {
                                                    feVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                fe feVar3 = feVar2;
                                                int i16 = feVar3.f33728a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    feVar3.h.addAll(starsStatus2.history);
                                                    feVar3.f33731f = starsStatus2.next_offset;
                                                    feVar3.f33734s[i17] = false;
                                                    feVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (feVar3.a() != z12 && (ndVar2 = feVar3.e) != null) {
                                                    ndVar2.run();
                                                }
                                                if (feVar3.b(i17) != z13) {
                                                    feVar3.e();
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
            org.telegram.ui.Components.y81 y81Var = this.f33729b;
            if (i10 < y81Var.getViewPages().length) {
                View view = y81Var.getViewPages()[i10];
                if (view instanceof de) {
                    de deVar = (de) view;
                    org.telegram.ui.Components.u61 u61Var = deVar.f33161a;
                    u61Var.f28778f3.N(true);
                    if (u61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < u61Var.getChildCount(); i11++) {
                            if (!(u61Var.getChildAt(i11) instanceof org.telegram.ui.Components.w00)) {
                            }
                        }
                    }
                    deVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f33730c.i();
        org.telegram.ui.Components.y81 y81Var = this.f33729b;
        y81Var.o(false);
        View[] viewArr = y81Var.e;
        int[] iArr = y81Var.f30672f;
        if (iArr[0] != y81Var.L.h(y81Var.f30670b)) {
            y81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                y81Var.h.put(iArr[1], view);
                y81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.zl0 getCurrentListView() {
        View currentView = this.f33729b.getCurrentView();
        if (!(currentView instanceof de)) {
            return null;
        }
        return ((de) currentView).f33161a;
    }
}
