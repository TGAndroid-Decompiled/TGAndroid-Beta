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
    public final int f33355a;
    public final org.telegram.ui.Components.v81 f33356b;
    public final ge f33357c;
    public final long d;
    public final pd e;
    public String f33358f;
    public final ArrayList h;
    public final ArrayList f33359n;
    public String f33360r;
    public final boolean[] f33361s;
    public final le v;

    public he(le leVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = leVar;
        this.f33358f = "";
        this.h = new ArrayList();
        this.f33359n = new ArrayList();
        this.f33360r = "";
        this.f33361s = new boolean[]{false, false};
        this.f33355a = i10;
        this.d = j3;
        this.e = pdVar;
        setOrientation(1);
        org.telegram.ui.Components.v81 v81Var = new org.telegram.ui.Components.v81(context, null);
        this.f33356b = v81Var;
        ge geVar = new ge(this, context, i10, j3, i11, f6Var);
        this.f33357c = geVar;
        v81Var.setAdapter(geVar);
        View n10 = v81Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, f6Var));
        addView(n10, w7.a6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(1.0f / AndroidUtilities.density)));
        addView(v81Var, w7.a6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f33359n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f33359n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f33361s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            le leVar = this.v;
            int i12 = this.f33355a;
            if (i10 == 1) {
                if (this.f33358f != null && leVar.f34667f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f33358f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final he f31889b;

                        {
                            this.f31889b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final he heVar = this.f31889b;
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
                                                    int i14 = heVar2.f33355a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        heVar2.f33359n.addAll(starsStatus.history);
                                                        heVar2.f33360r = starsStatus.next_offset;
                                                        heVar2.f33361s[i15] = false;
                                                        heVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.wc.b0(tL_error2);
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
                                                    int i16 = heVar3.f33355a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        heVar3.h.addAll(starsStatus2.history);
                                                        heVar3.f33358f = starsStatus2.next_offset;
                                                        heVar3.f33361s[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.wc.b0(tL_error3);
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
                                    final he heVar2 = this.f31889b;
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
                                                    int i142 = heVar22.f33355a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        heVar22.f33359n.addAll(starsStatus.history);
                                                        heVar22.f33360r = starsStatus.next_offset;
                                                        heVar22.f33361s[i15] = false;
                                                        heVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.wc.b0(tL_error2);
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
                                                    int i16 = heVar3.f33355a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        heVar3.h.addAll(starsStatus2.history);
                                                        heVar3.f33358f = starsStatus2.next_offset;
                                                        heVar3.f33361s[i17] = false;
                                                        heVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.wc.b0(tL_error3);
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
            } else if (i10 == 0 && this.f33360r != null && leVar.f34668g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f33360r;
                if (this.f33359n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final he f31889b;

                    {
                        this.f31889b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final he heVar = this.f31889b;
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
                                                int i142 = heVar22.f33355a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    heVar22.f33359n.addAll(starsStatus.history);
                                                    heVar22.f33360r = starsStatus.next_offset;
                                                    heVar22.f33361s[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.wc.b0(tL_error2);
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
                                                int i16 = heVar3.f33355a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    heVar3.h.addAll(starsStatus2.history);
                                                    heVar3.f33358f = starsStatus2.next_offset;
                                                    heVar3.f33361s[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.wc.b0(tL_error3);
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
                                final he heVar2 = this.f31889b;
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
                                                int i142 = heVar22.f33355a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    heVar22.f33359n.addAll(starsStatus.history);
                                                    heVar22.f33360r = starsStatus.next_offset;
                                                    heVar22.f33361s[i15] = false;
                                                    heVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.wc.b0(tL_error2);
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
                                                int i16 = heVar3.f33355a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    heVar3.h.addAll(starsStatus2.history);
                                                    heVar3.f33358f = starsStatus2.next_offset;
                                                    heVar3.f33361s[i17] = false;
                                                    heVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.wc.b0(tL_error3);
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
            org.telegram.ui.Components.v81 v81Var = this.f33356b;
            if (i10 < v81Var.getViewPages().length) {
                View view = v81Var.getViewPages()[i10];
                if (view instanceof fe) {
                    fe feVar = (fe) view;
                    org.telegram.ui.Components.r61 r61Var = feVar.f32788a;
                    r61Var.Y2.N(true);
                    if (r61Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < r61Var.getChildCount(); i11++) {
                            if (!(r61Var.getChildAt(i11) instanceof org.telegram.ui.Components.a10)) {
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
        this.f33357c.i();
        org.telegram.ui.Components.v81 v81Var = this.f33356b;
        v81Var.o(false);
        View[] viewArr = v81Var.e;
        int[] iArr = v81Var.f27888f;
        if (iArr[0] != v81Var.L.h(v81Var.f27886b)) {
            v81Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                v81Var.h.put(iArr[1], view);
                v81Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.vl0 getCurrentListView() {
        View currentView = this.f33356b.getCurrentView();
        if (!(currentView instanceof fe)) {
            return null;
        }
        return ((fe) currentView).f32788a;
    }
}
