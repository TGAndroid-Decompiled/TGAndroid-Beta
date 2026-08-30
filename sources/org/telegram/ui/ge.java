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
public final class ge extends LinearLayout {
    public final int f34579a;
    public final org.telegram.ui.Components.l81 f34580b;
    public final fe f34581c;
    public final long d;
    public final pd e;
    public String f34582f;
    public final ArrayList h;
    public final ArrayList f34583n;
    public String f34584r;
    public final boolean[] f34585s;
    public final ke v;

    public ge(ke keVar, Context context, int i10, long j10, int i11, pd pdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = keVar;
        this.f34582f = "";
        this.h = new ArrayList();
        this.f34583n = new ArrayList();
        this.f34584r = "";
        this.f34585s = new boolean[]{false, false};
        this.f34579a = i10;
        this.d = j10;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(context, null);
        this.f34580b = l81Var;
        fe feVar = new fe(this, context, i10, j10, i11, f6Var);
        this.f34581c = feVar;
        l81Var.setAdapter(feVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f34583n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f34583n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f34585s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.d;
            ke keVar = this.v;
            int i12 = this.f34579a;
            if (i10 == 1) {
                if (this.f34582f != null && keVar.f35632c1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f34582f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ge f33354b;

                        {
                            this.f33354b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ge geVar = this.f33354b;
                                    final int i13 = i10;
                                    final boolean z4 = a2;
                                    final boolean z10 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            pd pdVar;
                                            pd pdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ge geVar2 = geVar;
                                                    int i14 = geVar2.f34579a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z11) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        geVar2.f34583n.addAll(starsStatus.history);
                                                        geVar2.f34584r = starsStatus.next_offset;
                                                        geVar2.f34585s[i15] = false;
                                                        geVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar2.a() != z4 && (pdVar = geVar2.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (geVar2.b(i15) != z10) {
                                                        geVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar;
                                                    int i16 = geVar3.f34579a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.h.addAll(starsStatus2.history);
                                                        geVar3.f34582f = starsStatus2.next_offset;
                                                        geVar3.f34585s[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z4 && (pdVar2 = geVar3.e) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (geVar3.b(i17) != z10) {
                                                        geVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ge geVar2 = this.f33354b;
                                    final int i14 = i10;
                                    final boolean z11 = a2;
                                    final boolean z12 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            pd pdVar;
                                            pd pdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ge geVar22 = geVar2;
                                                    int i142 = geVar22.f34579a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z112) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        geVar22.f34583n.addAll(starsStatus.history);
                                                        geVar22.f34584r = starsStatus.next_offset;
                                                        geVar22.f34585s[i15] = false;
                                                        geVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar22.a() != z11 && (pdVar = geVar22.e) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (geVar22.b(i15) != z12) {
                                                        geVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar2;
                                                    int i16 = geVar3.f34579a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.h.addAll(starsStatus2.history);
                                                        geVar3.f34582f = starsStatus2.next_offset;
                                                        geVar3.f34585s[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z11 && (pdVar2 = geVar3.e) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (geVar3.b(i17) != z12) {
                                                        geVar3.e();
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
            } else if (i10 == 0 && this.f34584r != null && keVar.f35633d1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f34584r;
                if (this.f34583n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ge f33354b;

                    {
                        this.f33354b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ge geVar = this.f33354b;
                                final int i13 = i10;
                                final boolean z4 = a2;
                                final boolean z10 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        pd pdVar;
                                        pd pdVar2;
                                        switch (r7) {
                                            case 0:
                                                ge geVar22 = geVar;
                                                int i142 = geVar22.f34579a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f34583n.addAll(starsStatus.history);
                                                    geVar22.f34584r = starsStatus.next_offset;
                                                    geVar22.f34585s[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z4 && (pdVar = geVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (geVar22.b(i15) != z10) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar;
                                                int i16 = geVar3.f34579a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.h.addAll(starsStatus2.history);
                                                    geVar3.f34582f = starsStatus2.next_offset;
                                                    geVar3.f34585s[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z4 && (pdVar2 = geVar3.e) != null) {
                                                    pdVar2.run();
                                                }
                                                if (geVar3.b(i17) != z10) {
                                                    geVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ge geVar2 = this.f33354b;
                                final int i14 = i10;
                                final boolean z11 = a2;
                                final boolean z12 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        pd pdVar;
                                        pd pdVar2;
                                        switch (r7) {
                                            case 0:
                                                ge geVar22 = geVar2;
                                                int i142 = geVar22.f34579a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f34583n.addAll(starsStatus.history);
                                                    geVar22.f34584r = starsStatus.next_offset;
                                                    geVar22.f34585s[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z11 && (pdVar = geVar22.e) != null) {
                                                    pdVar.run();
                                                }
                                                if (geVar22.b(i15) != z12) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar2;
                                                int i16 = geVar3.f34579a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.h.addAll(starsStatus2.history);
                                                    geVar3.f34582f = starsStatus2.next_offset;
                                                    geVar3.f34585s[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z11 && (pdVar2 = geVar3.e) != null) {
                                                    pdVar2.run();
                                                }
                                                if (geVar3.b(i17) != z12) {
                                                    geVar3.e();
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
            org.telegram.ui.Components.l81 l81Var = this.f34580b;
            if (i10 < l81Var.getViewPages().length) {
                View view = l81Var.getViewPages()[i10];
                if (view instanceof ee) {
                    ee eeVar = (ee) view;
                    org.telegram.ui.Components.g61 g61Var = eeVar.f33998a;
                    g61Var.V2.N(true);
                    if (g61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                            if (!(g61Var.getChildAt(i11) instanceof org.telegram.ui.Components.t00)) {
                            }
                        }
                    }
                    eeVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f34581c.i();
        org.telegram.ui.Components.l81 l81Var = this.f34580b;
        l81Var.o(false);
        View[] viewArr = l81Var.e;
        int[] iArr = l81Var.f26595f;
        if (iArr[0] != l81Var.I.h(l81Var.f26593b)) {
            l81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                l81Var.h.put(iArr[1], view);
                l81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.sl0 getCurrentListView() {
        View currentView = this.f34580b.getCurrentView();
        if (!(currentView instanceof ee)) {
            return null;
        }
        return ((ee) currentView).f33998a;
    }
}
