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
    public final int f36634a;
    public final org.telegram.ui.Components.i81 f36635b;
    public final fe f36636c;
    public final long d;
    public final od f36637e;
    public String f36638f;
    public final ArrayList h;
    public final ArrayList f36639n;
    public String f36640r;
    public final boolean[] f36641s;
    public final ke v;

    public ge(ke keVar, Context context, int i10, long j3, int i11, od odVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = keVar;
        this.f36638f = "";
        this.h = new ArrayList();
        this.f36639n = new ArrayList();
        this.f36640r = "";
        this.f36641s = new boolean[]{false, false};
        this.f36634a = i10;
        this.d = j3;
        this.f36637e = odVar;
        setOrientation(1);
        org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(context, null);
        this.f36635b = i81Var;
        fe feVar = new fe(this, context, i10, j3, i11, f6Var);
        this.f36636c = feVar;
        i81Var.setAdapter(feVar);
        View n10 = i81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, f6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(i81Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f36639n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f36639n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f36641s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            ke keVar = this.v;
            int i12 = this.f36634a;
            if (i10 == 1) {
                if (this.f36638f != null && keVar.f38018f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f36638f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ge f35081b;

                        {
                            this.f35081b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ge geVar = this.f35081b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            od odVar;
                                            od odVar2;
                                            switch (r7) {
                                                case 0:
                                                    ge geVar2 = geVar;
                                                    int i14 = geVar2.f36634a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        geVar2.f36639n.addAll(starsStatus.history);
                                                        geVar2.f36640r = starsStatus.next_offset;
                                                        geVar2.f36641s[i15] = false;
                                                        geVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar2.a() != z10 && (odVar = geVar2.f36637e) != null) {
                                                        odVar.run();
                                                    }
                                                    if (geVar2.b(i15) != z11) {
                                                        geVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar;
                                                    int i16 = geVar3.f36634a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.h.addAll(starsStatus2.history);
                                                        geVar3.f36638f = starsStatus2.next_offset;
                                                        geVar3.f36641s[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z10 && (odVar2 = geVar3.f36637e) != null) {
                                                        odVar2.run();
                                                    }
                                                    if (geVar3.b(i17) != z11) {
                                                        geVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ge geVar2 = this.f35081b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            od odVar;
                                            od odVar2;
                                            switch (r7) {
                                                case 0:
                                                    ge geVar22 = geVar2;
                                                    int i142 = geVar22.f36634a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        geVar22.f36639n.addAll(starsStatus.history);
                                                        geVar22.f36640r = starsStatus.next_offset;
                                                        geVar22.f36641s[i15] = false;
                                                        geVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar22.a() != z12 && (odVar = geVar22.f36637e) != null) {
                                                        odVar.run();
                                                    }
                                                    if (geVar22.b(i15) != z13) {
                                                        geVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar2;
                                                    int i16 = geVar3.f36634a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.h.addAll(starsStatus2.history);
                                                        geVar3.f36638f = starsStatus2.next_offset;
                                                        geVar3.f36641s[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z12 && (odVar2 = geVar3.f36637e) != null) {
                                                        odVar2.run();
                                                    }
                                                    if (geVar3.b(i17) != z13) {
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
            } else if (i10 == 0 && this.f36640r != null && keVar.f38019g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f36640r;
                if (this.f36639n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ge f35081b;

                    {
                        this.f35081b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ge geVar = this.f35081b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        od odVar;
                                        od odVar2;
                                        switch (r7) {
                                            case 0:
                                                ge geVar22 = geVar;
                                                int i142 = geVar22.f36634a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f36639n.addAll(starsStatus.history);
                                                    geVar22.f36640r = starsStatus.next_offset;
                                                    geVar22.f36641s[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z10 && (odVar = geVar22.f36637e) != null) {
                                                    odVar.run();
                                                }
                                                if (geVar22.b(i15) != z11) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar;
                                                int i16 = geVar3.f36634a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.h.addAll(starsStatus2.history);
                                                    geVar3.f36638f = starsStatus2.next_offset;
                                                    geVar3.f36641s[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z10 && (odVar2 = geVar3.f36637e) != null) {
                                                    odVar2.run();
                                                }
                                                if (geVar3.b(i17) != z11) {
                                                    geVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ge geVar2 = this.f35081b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        od odVar;
                                        od odVar2;
                                        switch (r7) {
                                            case 0:
                                                ge geVar22 = geVar2;
                                                int i142 = geVar22.f36634a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f36639n.addAll(starsStatus.history);
                                                    geVar22.f36640r = starsStatus.next_offset;
                                                    geVar22.f36641s[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z12 && (odVar = geVar22.f36637e) != null) {
                                                    odVar.run();
                                                }
                                                if (geVar22.b(i15) != z13) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar2;
                                                int i16 = geVar3.f36634a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.h.addAll(starsStatus2.history);
                                                    geVar3.f36638f = starsStatus2.next_offset;
                                                    geVar3.f36641s[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z12 && (odVar2 = geVar3.f36637e) != null) {
                                                    odVar2.run();
                                                }
                                                if (geVar3.b(i17) != z13) {
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
            org.telegram.ui.Components.i81 i81Var = this.f36635b;
            if (i10 < i81Var.getViewPages().length) {
                View view = i81Var.getViewPages()[i10];
                if (view instanceof ee) {
                    ee eeVar = (ee) view;
                    org.telegram.ui.Components.d61 d61Var = eeVar.f36005a;
                    d61Var.Y2.N(true);
                    if (d61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < d61Var.getChildCount(); i11++) {
                            if (!(d61Var.getChildAt(i11) instanceof org.telegram.ui.Components.t00)) {
                            }
                        }
                    }
                    eeVar.f36008e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f36636c.i();
        org.telegram.ui.Components.i81 i81Var = this.f36635b;
        i81Var.o(false);
        View[] viewArr = i81Var.f27017e;
        int[] iArr = i81Var.f27018f;
        if (iArr[0] != i81Var.L.h(i81Var.f27015b)) {
            i81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                i81Var.h.put(iArr[1], view);
                i81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.ll0 getCurrentListView() {
        View currentView = this.f36635b.getCurrentView();
        if (!(currentView instanceof ee)) {
            return null;
        }
        return ((ee) currentView).f36005a;
    }
}
