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
public final class ie extends LinearLayout {
    public final int f34448a;
    public final org.telegram.ui.Components.y81 f34449b;
    public final he f34450c;
    public final long d;
    public final pd e;
    public String f34451f;
    public final ArrayList h;
    public final ArrayList f34452n;
    public String f34453r;
    public final boolean[] f34454s;
    public final me v;

    public ie(me meVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = meVar;
        this.f34451f = "";
        this.h = new ArrayList();
        this.f34452n = new ArrayList();
        this.f34453r = "";
        this.f34454s = new boolean[]{false, false};
        this.f34448a = i10;
        this.d = j3;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.y81 y81Var = new org.telegram.ui.Components.y81(context, null);
        this.f34449b = y81Var;
        he heVar = new he(this, context, i10, j3, i11, e6Var);
        this.f34450c = heVar;
        y81Var.setAdapter(heVar);
        View n10 = y81Var.n(3, true);
        li.l lVar = meVar.f35647g1;
        if (lVar != null) {
            lVar.c(y81Var);
        }
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, e6Var));
        addView(n10, w7.y5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.y5.z(-1.0f), w7.y5.z(1.0f / AndroidUtilities.density)));
        addView(y81Var, w7.y5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f34452n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f34452n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f34454s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            me meVar = this.v;
            int i12 = this.f34448a;
            if (i10 == 1) {
                if (this.f34451f != null && meVar.f35645e1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f34451f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ie f33225b;

                        {
                            this.f33225b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ie ieVar = this.f33225b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            pd pdVar;
                                            pd pdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ie ieVar2 = ieVar;
                                                    int i14 = ieVar2.f34448a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        ieVar2.f34452n.addAll(starsStatus.history);
                                                        ieVar2.f34453r = starsStatus.next_offset;
                                                        ieVar2.f34454s[i15] = false;
                                                        ieVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.xc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar2.a() != z10 && (pdVar = ieVar2.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (ieVar2.b(i15) != z11) {
                                                        ieVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar;
                                                    int i16 = ieVar3.f34448a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.h.addAll(starsStatus2.history);
                                                        ieVar3.f34451f = starsStatus2.next_offset;
                                                        ieVar3.f34454s[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.xc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z10 && (pdVar2 = ieVar3.e) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z11) {
                                                        ieVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ie ieVar2 = this.f33225b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            pd pdVar;
                                            pd pdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ie ieVar22 = ieVar2;
                                                    int i142 = ieVar22.f34448a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        ieVar22.f34452n.addAll(starsStatus.history);
                                                        ieVar22.f34453r = starsStatus.next_offset;
                                                        ieVar22.f34454s[i15] = false;
                                                        ieVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.xc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar22.a() != z12 && (pdVar = ieVar22.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (ieVar22.b(i15) != z13) {
                                                        ieVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar2;
                                                    int i16 = ieVar3.f34448a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.h.addAll(starsStatus2.history);
                                                        ieVar3.f34451f = starsStatus2.next_offset;
                                                        ieVar3.f34454s[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.xc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z12 && (pdVar2 = ieVar3.e) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z13) {
                                                        ieVar3.e();
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
            } else if (i10 == 0 && this.f34453r != null && meVar.f35646f1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f34453r;
                if (this.f34452n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ie f33225b;

                    {
                        this.f33225b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ie ieVar = this.f33225b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        pd pdVar;
                                        pd pdVar2;
                                        switch (r7) {
                                            case 0:
                                                ie ieVar22 = ieVar;
                                                int i142 = ieVar22.f34448a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f34452n.addAll(starsStatus.history);
                                                    ieVar22.f34453r = starsStatus.next_offset;
                                                    ieVar22.f34454s[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.xc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z10 && (pdVar = ieVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z11) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar;
                                                int i16 = ieVar3.f34448a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.h.addAll(starsStatus2.history);
                                                    ieVar3.f34451f = starsStatus2.next_offset;
                                                    ieVar3.f34454s[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.xc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z10 && (pdVar2 = ieVar3.e) != null) {
                                                    pdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z11) {
                                                    ieVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ie ieVar2 = this.f33225b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        pd pdVar;
                                        pd pdVar2;
                                        switch (r7) {
                                            case 0:
                                                ie ieVar22 = ieVar2;
                                                int i142 = ieVar22.f34448a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f34452n.addAll(starsStatus.history);
                                                    ieVar22.f34453r = starsStatus.next_offset;
                                                    ieVar22.f34454s[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.xc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z12 && (pdVar = ieVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z13) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar2;
                                                int i16 = ieVar3.f34448a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.h.addAll(starsStatus2.history);
                                                    ieVar3.f34451f = starsStatus2.next_offset;
                                                    ieVar3.f34454s[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.xc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z12 && (pdVar2 = ieVar3.e) != null) {
                                                    pdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z13) {
                                                    ieVar3.e();
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
            org.telegram.ui.Components.y81 y81Var = this.f34449b;
            if (i10 < y81Var.getViewPages().length) {
                View view = y81Var.getViewPages()[i10];
                if (view instanceof ge) {
                    ge geVar = (ge) view;
                    org.telegram.ui.Components.t61 t61Var = geVar.f33908a;
                    t61Var.Y2.N(true);
                    if (t61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < t61Var.getChildCount(); i11++) {
                            if (!(t61Var.getChildAt(i11) instanceof org.telegram.ui.Components.v00)) {
                            }
                        }
                    }
                    geVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f34450c.i();
        org.telegram.ui.Components.y81 y81Var = this.f34449b;
        y81Var.o(false);
        View[] viewArr = y81Var.e;
        int[] iArr = y81Var.f30622f;
        if (iArr[0] != y81Var.L.h(y81Var.f30620b)) {
            y81Var.J(0);
            View view = viewArr[1];
            if (view != null) {
                y81Var.h.put(iArr[1], view);
                y81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
            y81Var.x(true);
        }
    }

    public org.telegram.ui.Components.yl0 getCurrentListView() {
        View currentView = this.f34449b.getCurrentView();
        if (!(currentView instanceof ge)) {
            return null;
        }
        return ((ge) currentView).f33908a;
    }
}
