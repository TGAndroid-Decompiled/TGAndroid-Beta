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
    public final int f34907a;
    public final org.telegram.ui.Components.l81 f34908b;
    public final he f34909c;
    public final long d;
    public final rd e;
    public String f34910f;
    public final ArrayList h;
    public final ArrayList f34911n;
    public String f34912r;
    public final boolean[] f34913s;
    public final me v;

    public ie(me meVar, Context context, int i10, long j10, int i11, rd rdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = meVar;
        this.f34910f = "";
        this.h = new ArrayList();
        this.f34911n = new ArrayList();
        this.f34912r = "";
        this.f34913s = new boolean[]{false, false};
        this.f34907a = i10;
        this.d = j10;
        this.e = rdVar;
        setOrientation(1);
        org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(context, null);
        this.f34908b = l81Var;
        he heVar = new he(this, context, i10, j10, i11, f6Var);
        this.f34909c = heVar;
        l81Var.setAdapter(heVar);
        View n10 = l81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, f6Var));
        addView(n10, k7.b6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density)));
        addView(l81Var, k7.b6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, f6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f34911n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f34911n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f34913s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.d;
            me meVar = this.v;
            int i12 = this.f34907a;
            if (i10 == 1) {
                if (this.f34910f != null && meVar.f36039c1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f34910f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ie f33791b;

                        {
                            this.f33791b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ie ieVar = this.f33791b;
                                    final int i13 = i10;
                                    final boolean z4 = a2;
                                    final boolean z10 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            rd rdVar;
                                            rd rdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ie ieVar2 = ieVar;
                                                    int i14 = ieVar2.f34907a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z11) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        ieVar2.f34911n.addAll(starsStatus.history);
                                                        ieVar2.f34912r = starsStatus.next_offset;
                                                        ieVar2.f34913s[i15] = false;
                                                        ieVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar2.a() != z4 && (rdVar = ieVar2.e) != null) {
                                                        rdVar.run();
                                                    }
                                                    if (ieVar2.b(i15) != z10) {
                                                        ieVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar;
                                                    int i16 = ieVar3.f34907a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.h.addAll(starsStatus2.history);
                                                        ieVar3.f34910f = starsStatus2.next_offset;
                                                        ieVar3.f34913s[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z4 && (rdVar2 = ieVar3.e) != null) {
                                                        rdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z10) {
                                                        ieVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ie ieVar2 = this.f33791b;
                                    final int i14 = i10;
                                    final boolean z11 = a2;
                                    final boolean z12 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            rd rdVar;
                                            rd rdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ie ieVar22 = ieVar2;
                                                    int i142 = ieVar22.f34907a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z112) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        ieVar22.f34911n.addAll(starsStatus.history);
                                                        ieVar22.f34912r = starsStatus.next_offset;
                                                        ieVar22.f34913s[i15] = false;
                                                        ieVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar22.a() != z11 && (rdVar = ieVar22.e) != null) {
                                                        rdVar.run();
                                                    }
                                                    if (ieVar22.b(i15) != z12) {
                                                        ieVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar2;
                                                    int i16 = ieVar3.f34907a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.h.addAll(starsStatus2.history);
                                                        ieVar3.f34910f = starsStatus2.next_offset;
                                                        ieVar3.f34913s[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.qc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z11 && (rdVar2 = ieVar3.e) != null) {
                                                        rdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z12) {
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
            } else if (i10 == 0 && this.f34912r != null && meVar.f36040d1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f34912r;
                if (this.f34911n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ie f33791b;

                    {
                        this.f33791b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ie ieVar = this.f33791b;
                                final int i13 = i10;
                                final boolean z4 = a2;
                                final boolean z10 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        rd rdVar;
                                        rd rdVar2;
                                        switch (r7) {
                                            case 0:
                                                ie ieVar22 = ieVar;
                                                int i142 = ieVar22.f34907a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f34911n.addAll(starsStatus.history);
                                                    ieVar22.f34912r = starsStatus.next_offset;
                                                    ieVar22.f34913s[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z4 && (rdVar = ieVar22.e) != null) {
                                                    rdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z10) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar;
                                                int i16 = ieVar3.f34907a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.h.addAll(starsStatus2.history);
                                                    ieVar3.f34910f = starsStatus2.next_offset;
                                                    ieVar3.f34913s[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z4 && (rdVar2 = ieVar3.e) != null) {
                                                    rdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z10) {
                                                    ieVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ie ieVar2 = this.f33791b;
                                final int i14 = i10;
                                final boolean z11 = a2;
                                final boolean z12 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        rd rdVar;
                                        rd rdVar2;
                                        switch (r7) {
                                            case 0:
                                                ie ieVar22 = ieVar2;
                                                int i142 = ieVar22.f34907a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f34911n.addAll(starsStatus.history);
                                                    ieVar22.f34912r = starsStatus.next_offset;
                                                    ieVar22.f34913s[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z11 && (rdVar = ieVar22.e) != null) {
                                                    rdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z12) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar2;
                                                int i16 = ieVar3.f34907a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.h.addAll(starsStatus2.history);
                                                    ieVar3.f34910f = starsStatus2.next_offset;
                                                    ieVar3.f34913s[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.qc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z11 && (rdVar2 = ieVar3.e) != null) {
                                                    rdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z12) {
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
            org.telegram.ui.Components.l81 l81Var = this.f34908b;
            if (i10 < l81Var.getViewPages().length) {
                View view = l81Var.getViewPages()[i10];
                if (view instanceof ge) {
                    ge geVar = (ge) view;
                    org.telegram.ui.Components.g61 g61Var = geVar.f34421a;
                    g61Var.V2.N(true);
                    if (g61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                            if (!(g61Var.getChildAt(i11) instanceof org.telegram.ui.Components.u00)) {
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
        this.f34909c.i();
        org.telegram.ui.Components.l81 l81Var = this.f34908b;
        l81Var.o(false);
        View[] viewArr = l81Var.e;
        int[] iArr = l81Var.f26619f;
        if (iArr[0] != l81Var.I.h(l81Var.f26617b)) {
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

    public org.telegram.ui.Components.rl0 getCurrentListView() {
        View currentView = this.f34908b.getCurrentView();
        if (!(currentView instanceof ge)) {
            return null;
        }
        return ((ge) currentView).f34421a;
    }
}
