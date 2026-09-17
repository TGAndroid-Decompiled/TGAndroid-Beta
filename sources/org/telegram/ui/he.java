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
public final class he extends LinearLayout {
    public final int f34242a;
    public final org.telegram.ui.Components.j81 f34243b;
    public final ge f34244c;
    public final long d;
    public final pd e;
    public String f34245f;
    public final ArrayList h;
    public final ArrayList f34246n;
    public String f34247r;
    public final boolean[] f34248s;
    public final le v;

    public he(le leVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = leVar;
        this.f34245f = "";
        this.h = new ArrayList();
        this.f34246n = new ArrayList();
        this.f34247r = "";
        this.f34248s = new boolean[]{false, false};
        this.f34242a = i10;
        this.d = j3;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.j81 j81Var = new org.telegram.ui.Components.j81(context, null);
        this.f34243b = j81Var;
        ge geVar = new ge(this, context, i10, j3, i11, f6Var);
        this.f34244c = geVar;
        j81Var.setAdapter(geVar);
        View n10 = j81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(j81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18933h5, f6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f34246n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f34246n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f34248s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            le leVar = this.v;
            int i12 = this.f34242a;
            if (i10 == 1) {
                if (this.f34245f != null && leVar.f35509f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f34245f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final he f33099b;

                        {
                            this.f33099b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final he heVar = this.f33099b;
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
                                                    he heVar2 = heVar;
                                                    int i14 = heVar2.f34242a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        heVar2.f34246n.addAll(starsStatus.history);
                                                        heVar2.f34247r = starsStatus.next_offset;
                                                        heVar2.f34248s[i15] = false;
                                                        heVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.vc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (heVar2.a() != z10 && (pdVar = heVar2.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (heVar2.b(i15) != z11) {
                                                        heVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    he heVar3 = heVar;
                                                    int i16 = heVar3.f34242a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        heVar3.h.addAll(starsStatus2.history);
                                                        heVar3.f34245f = starsStatus2.next_offset;
                                                        heVar3.f34248s[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.vc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (heVar3.a() != z10 && (pdVar2 = heVar3.e) != null) {
                                                        pdVar2.run();
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
                                    final he heVar2 = this.f33099b;
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
                                                    he heVar22 = heVar2;
                                                    int i142 = heVar22.f34242a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        heVar22.f34246n.addAll(starsStatus.history);
                                                        heVar22.f34247r = starsStatus.next_offset;
                                                        heVar22.f34248s[i15] = false;
                                                        heVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.vc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (heVar22.a() != z12 && (pdVar = heVar22.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (heVar22.b(i15) != z13) {
                                                        heVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    he heVar3 = heVar2;
                                                    int i16 = heVar3.f34242a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        heVar3.h.addAll(starsStatus2.history);
                                                        heVar3.f34245f = starsStatus2.next_offset;
                                                        heVar3.f34248s[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.vc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (heVar3.a() != z12 && (pdVar2 = heVar3.e) != null) {
                                                        pdVar2.run();
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
            } else if (i10 == 0 && this.f34247r != null && leVar.f35510g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f34247r;
                if (this.f34246n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final he f33099b;

                    {
                        this.f33099b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final he heVar = this.f33099b;
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
                                                he heVar22 = heVar;
                                                int i142 = heVar22.f34242a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    heVar22.f34246n.addAll(starsStatus.history);
                                                    heVar22.f34247r = starsStatus.next_offset;
                                                    heVar22.f34248s[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.vc.b0(tL_error2);
                                                    }
                                                }
                                                if (heVar22.a() != z10 && (pdVar = heVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (heVar22.b(i15) != z11) {
                                                    heVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                he heVar3 = heVar;
                                                int i16 = heVar3.f34242a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    heVar3.h.addAll(starsStatus2.history);
                                                    heVar3.f34245f = starsStatus2.next_offset;
                                                    heVar3.f34248s[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.vc.b0(tL_error3);
                                                    }
                                                }
                                                if (heVar3.a() != z10 && (pdVar2 = heVar3.e) != null) {
                                                    pdVar2.run();
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
                                final he heVar2 = this.f33099b;
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
                                                he heVar22 = heVar2;
                                                int i142 = heVar22.f34242a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    heVar22.f34246n.addAll(starsStatus.history);
                                                    heVar22.f34247r = starsStatus.next_offset;
                                                    heVar22.f34248s[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.vc.b0(tL_error2);
                                                    }
                                                }
                                                if (heVar22.a() != z12 && (pdVar = heVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (heVar22.b(i15) != z13) {
                                                    heVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                he heVar3 = heVar2;
                                                int i16 = heVar3.f34242a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    heVar3.h.addAll(starsStatus2.history);
                                                    heVar3.f34245f = starsStatus2.next_offset;
                                                    heVar3.f34248s[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.vc.b0(tL_error3);
                                                    }
                                                }
                                                if (heVar3.a() != z12 && (pdVar2 = heVar3.e) != null) {
                                                    pdVar2.run();
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
            org.telegram.ui.Components.j81 j81Var = this.f34243b;
            if (i10 < j81Var.getViewPages().length) {
                View view = j81Var.getViewPages()[i10];
                if (view instanceof fe) {
                    fe feVar = (fe) view;
                    org.telegram.ui.Components.f61 f61Var = feVar.f33620a;
                    f61Var.Y2.N(true);
                    if (f61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < f61Var.getChildCount(); i11++) {
                            if (!(f61Var.getChildAt(i11) instanceof org.telegram.ui.Components.t00)) {
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
        this.f34244c.i();
        org.telegram.ui.Components.j81 j81Var = this.f34243b;
        j81Var.o(false);
        View[] viewArr = j81Var.e;
        int[] iArr = j81Var.f25181f;
        if (iArr[0] != j81Var.L.h(j81Var.f25179b)) {
            j81Var.J(0);
            View view = viewArr[1];
            if (view != null) {
                j81Var.h.put(iArr[1], view);
                j81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
            j81Var.x(true);
        }
    }

    public org.telegram.ui.Components.ml0 getCurrentListView() {
        View currentView = this.f34243b.getCurrentView();
        if (!(currentView instanceof fe)) {
            return null;
        }
        return ((fe) currentView).f33620a;
    }
}
