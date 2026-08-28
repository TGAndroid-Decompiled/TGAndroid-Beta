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
public final class be extends LinearLayout {
    public final int f36831a;
    public final org.telegram.ui.Components.n71 f36832b;
    public final ae f36833c;
    public final long d;
    public final kd f36834e;
    public String f36835f;
    public final ArrayList h;
    public final ArrayList f36836n;
    public String f36837r;
    public final boolean[] f36838s;
    public final fe v;

    public be(fe feVar, Context context, int i9, long j10, int i10, kd kdVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.v = feVar;
        this.f36835f = "";
        this.h = new ArrayList();
        this.f36836n = new ArrayList();
        this.f36837r = "";
        this.f36838s = new boolean[]{false, false};
        this.f36831a = i9;
        this.d = j10;
        this.f36834e = kdVar;
        setOrientation(1);
        org.telegram.ui.Components.n71 n71Var = new org.telegram.ui.Components.n71(context, null);
        this.f36832b = n71Var;
        ae aeVar = new ae(this, context, i9, j10, i10, b6Var);
        this.f36833c = aeVar;
        n71Var.setAdapter(aeVar);
        View n10 = n71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
        addView(n10, g7.e6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density)));
        addView(n71Var, g7.e6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f36836n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i9) {
        boolean isEmpty;
        if (i9 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i9 == 0) {
            isEmpty = this.f36836n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i9) {
        boolean[] zArr = this.f36838s;
        if (!zArr[i9]) {
            final boolean a2 = a();
            final boolean b10 = b(i9);
            int i10 = 20;
            long j10 = this.d;
            fe feVar = this.v;
            int i11 = this.f36831a;
            if (i9 == 1) {
                if (this.f36835f != null && feVar.f38219b1) {
                    zArr[i9] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f36835f;
                    if (this.h.isEmpty()) {
                        i10 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i10;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final be f44497b;

                        {
                            this.f44497b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final be beVar = this.f44497b;
                                    final int i12 = i9;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            kd kdVar;
                                            kd kdVar2;
                                            switch (r7) {
                                                case 0:
                                                    be beVar2 = beVar;
                                                    int i13 = beVar2.f36831a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i12;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                                                        beVar2.f36836n.addAll(starsStatus.history);
                                                        beVar2.f36837r = starsStatus.next_offset;
                                                        beVar2.f36838s[i14] = false;
                                                        beVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.oc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (beVar2.a() != z10 && (kdVar = beVar2.f36834e) != null) {
                                                        kdVar.run();
                                                    }
                                                    if (beVar2.b(i14) != z11) {
                                                        beVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    be beVar3 = beVar;
                                                    int i15 = beVar3.f36831a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i12;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i15).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i15).putChats(starsStatus2.chats, false);
                                                        beVar3.h.addAll(starsStatus2.history);
                                                        beVar3.f36835f = starsStatus2.next_offset;
                                                        beVar3.f36838s[i16] = false;
                                                        beVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.oc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (beVar3.a() != z10 && (kdVar2 = beVar3.f36834e) != null) {
                                                        kdVar2.run();
                                                    }
                                                    if (beVar3.b(i16) != z11) {
                                                        beVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final be beVar2 = this.f44497b;
                                    final int i13 = i9;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            kd kdVar;
                                            kd kdVar2;
                                            switch (r7) {
                                                case 0:
                                                    be beVar22 = beVar2;
                                                    int i132 = beVar22.f36831a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i13;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i132).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i132).putChats(starsStatus.chats, false);
                                                        beVar22.f36836n.addAll(starsStatus.history);
                                                        beVar22.f36837r = starsStatus.next_offset;
                                                        beVar22.f36838s[i14] = false;
                                                        beVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.oc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (beVar22.a() != z12 && (kdVar = beVar22.f36834e) != null) {
                                                        kdVar.run();
                                                    }
                                                    if (beVar22.b(i14) != z13) {
                                                        beVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    be beVar3 = beVar2;
                                                    int i15 = beVar3.f36831a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i13;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i15).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i15).putChats(starsStatus2.chats, false);
                                                        beVar3.h.addAll(starsStatus2.history);
                                                        beVar3.f36835f = starsStatus2.next_offset;
                                                        beVar3.f36838s[i16] = false;
                                                        beVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.oc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (beVar3.a() != z12 && (kdVar2 = beVar3.f36834e) != null) {
                                                        kdVar2.run();
                                                    }
                                                    if (beVar3.b(i16) != z13) {
                                                        beVar3.e();
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
            } else if (i9 == 0 && this.f36837r != null && feVar.f38220c1) {
                zArr[i9] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f36837r;
                if (this.f36836n.isEmpty()) {
                    i10 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i10;
                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final be f44497b;

                    {
                        this.f44497b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final be beVar = this.f44497b;
                                final int i12 = i9;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        kd kdVar;
                                        kd kdVar2;
                                        switch (r7) {
                                            case 0:
                                                be beVar22 = beVar;
                                                int i132 = beVar22.f36831a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i12;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i132).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i132).putChats(starsStatus.chats, false);
                                                    beVar22.f36836n.addAll(starsStatus.history);
                                                    beVar22.f36837r = starsStatus.next_offset;
                                                    beVar22.f36838s[i14] = false;
                                                    beVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.oc.b0(tL_error2);
                                                    }
                                                }
                                                if (beVar22.a() != z10 && (kdVar = beVar22.f36834e) != null) {
                                                    kdVar.run();
                                                }
                                                if (beVar22.b(i14) != z11) {
                                                    beVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                be beVar3 = beVar;
                                                int i15 = beVar3.f36831a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i12;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i15).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i15).putChats(starsStatus2.chats, false);
                                                    beVar3.h.addAll(starsStatus2.history);
                                                    beVar3.f36835f = starsStatus2.next_offset;
                                                    beVar3.f36838s[i16] = false;
                                                    beVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.oc.b0(tL_error3);
                                                    }
                                                }
                                                if (beVar3.a() != z10 && (kdVar2 = beVar3.f36834e) != null) {
                                                    kdVar2.run();
                                                }
                                                if (beVar3.b(i16) != z11) {
                                                    beVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final be beVar2 = this.f44497b;
                                final int i13 = i9;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        kd kdVar;
                                        kd kdVar2;
                                        switch (r7) {
                                            case 0:
                                                be beVar22 = beVar2;
                                                int i132 = beVar22.f36831a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i132).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i132).putChats(starsStatus.chats, false);
                                                    beVar22.f36836n.addAll(starsStatus.history);
                                                    beVar22.f36837r = starsStatus.next_offset;
                                                    beVar22.f36838s[i14] = false;
                                                    beVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.oc.b0(tL_error2);
                                                    }
                                                }
                                                if (beVar22.a() != z12 && (kdVar = beVar22.f36834e) != null) {
                                                    kdVar.run();
                                                }
                                                if (beVar22.b(i14) != z13) {
                                                    beVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                be beVar3 = beVar2;
                                                int i15 = beVar3.f36831a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i15).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i15).putChats(starsStatus2.chats, false);
                                                    beVar3.h.addAll(starsStatus2.history);
                                                    beVar3.f36835f = starsStatus2.next_offset;
                                                    beVar3.f36838s[i16] = false;
                                                    beVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.oc.b0(tL_error3);
                                                    }
                                                }
                                                if (beVar3.a() != z12 && (kdVar2 = beVar3.f36834e) != null) {
                                                    kdVar2.run();
                                                }
                                                if (beVar3.b(i16) != z13) {
                                                    beVar3.e();
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
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.f36832b;
            if (i9 < n71Var.getViewPages().length) {
                View view = n71Var.getViewPages()[i9];
                if (view instanceof zd) {
                    zd zdVar = (zd) view;
                    org.telegram.ui.Components.i51 i51Var = zdVar.f45112a;
                    i51Var.U2.N(true);
                    if (i51Var.canScrollVertically(1)) {
                        for (int i10 = 0; i10 < i51Var.getChildCount(); i10++) {
                            if (!(i51Var.getChildAt(i10) instanceof org.telegram.ui.Components.e00)) {
                            }
                        }
                    }
                    zdVar.f45115e.run();
                    break;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f36833c.i();
        org.telegram.ui.Components.n71 n71Var = this.f36832b;
        n71Var.o(false);
        View[] viewArr = n71Var.f31035e;
        int[] iArr = n71Var.f31036f;
        if (iArr[0] != n71Var.H.h(n71Var.f31033b)) {
            n71Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                n71Var.h.put(iArr[1], view);
                n71Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.wk0 getCurrentListView() {
        View currentView = this.f36832b.getCurrentView();
        if (!(currentView instanceof zd)) {
            return null;
        }
        return ((zd) currentView).f45112a;
    }
}
