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
public final class ke extends LinearLayout {
    public final int f39460a;
    public final org.telegram.ui.Components.u91 f39461b;
    public final je f39462c;
    public final long d;
    public final sd f39463e;
    public String f39464f;
    public final ArrayList h;
    public final ArrayList f39465n;
    public String f39466r;
    public final boolean[] f39467s;
    public final oe v;

    public ke(oe oeVar, Context context, int i10, long j3, int i11, sd sdVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = oeVar;
        this.f39464f = "";
        this.h = new ArrayList();
        this.f39465n = new ArrayList();
        this.f39466r = "";
        this.f39467s = new boolean[]{false, false};
        this.f39460a = i10;
        this.d = j3;
        this.f39463e = sdVar;
        setOrientation(1);
        org.telegram.ui.Components.u91 u91Var = new org.telegram.ui.Components.u91(context, null);
        this.f39461b = u91Var;
        je jeVar = new je(this, context, i10, j3, i11, c6Var);
        this.f39462c = jeVar;
        u91Var.setAdapter(jeVar);
        View n10 = u91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, c6Var));
        addView(n10, w7.w5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.w5.z(-1.0f), w7.w5.z(1.0f / AndroidUtilities.density)));
        addView(u91Var, w7.w5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f39465n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f39465n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f39467s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.d;
            oe oeVar = this.v;
            int i12 = this.f39460a;
            if (i10 == 1) {
                if (this.f39464f != null && oeVar.f40663f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.f39464f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ke f38013b;

                        {
                            this.f38013b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ke keVar = this.f38013b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            sd sdVar;
                                            sd sdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ke keVar2 = keVar;
                                                    int i14 = keVar2.f39460a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        keVar2.f39465n.addAll(starsStatus.history);
                                                        keVar2.f39466r = starsStatus.next_offset;
                                                        keVar2.f39467s[i15] = false;
                                                        keVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (keVar2.a() != z10 && (sdVar = keVar2.f39463e) != null) {
                                                        sdVar.run();
                                                    }
                                                    if (keVar2.b(i15) != z11) {
                                                        keVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ke keVar3 = keVar;
                                                    int i16 = keVar3.f39460a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        keVar3.h.addAll(starsStatus2.history);
                                                        keVar3.f39464f = starsStatus2.next_offset;
                                                        keVar3.f39467s[i17] = false;
                                                        keVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (keVar3.a() != z10 && (sdVar2 = keVar3.f39463e) != null) {
                                                        sdVar2.run();
                                                    }
                                                    if (keVar3.b(i17) != z11) {
                                                        keVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ke keVar2 = this.f38013b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            sd sdVar;
                                            sd sdVar2;
                                            switch (r7) {
                                                case 0:
                                                    ke keVar22 = keVar2;
                                                    int i142 = keVar22.f39460a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        keVar22.f39465n.addAll(starsStatus.history);
                                                        keVar22.f39466r = starsStatus.next_offset;
                                                        keVar22.f39467s[i15] = false;
                                                        keVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (keVar22.a() != z12 && (sdVar = keVar22.f39463e) != null) {
                                                        sdVar.run();
                                                    }
                                                    if (keVar22.b(i15) != z13) {
                                                        keVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ke keVar3 = keVar2;
                                                    int i16 = keVar3.f39460a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        keVar3.h.addAll(starsStatus2.history);
                                                        keVar3.f39464f = starsStatus2.next_offset;
                                                        keVar3.f39467s[i17] = false;
                                                        keVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (keVar3.a() != z12 && (sdVar2 = keVar3.f39463e) != null) {
                                                        sdVar2.run();
                                                    }
                                                    if (keVar3.b(i17) != z13) {
                                                        keVar3.e();
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
            } else if (i10 == 0 && this.f39466r != null && oeVar.f40664g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f39466r;
                if (this.f39465n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ke f38013b;

                    {
                        this.f38013b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ke keVar = this.f38013b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        sd sdVar;
                                        sd sdVar2;
                                        switch (r7) {
                                            case 0:
                                                ke keVar22 = keVar;
                                                int i142 = keVar22.f39460a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    keVar22.f39465n.addAll(starsStatus.history);
                                                    keVar22.f39466r = starsStatus.next_offset;
                                                    keVar22.f39467s[i15] = false;
                                                    keVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error2);
                                                    }
                                                }
                                                if (keVar22.a() != z10 && (sdVar = keVar22.f39463e) != null) {
                                                    sdVar.run();
                                                }
                                                if (keVar22.b(i15) != z11) {
                                                    keVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ke keVar3 = keVar;
                                                int i16 = keVar3.f39460a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    keVar3.h.addAll(starsStatus2.history);
                                                    keVar3.f39464f = starsStatus2.next_offset;
                                                    keVar3.f39467s[i17] = false;
                                                    keVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error3);
                                                    }
                                                }
                                                if (keVar3.a() != z10 && (sdVar2 = keVar3.f39463e) != null) {
                                                    sdVar2.run();
                                                }
                                                if (keVar3.b(i17) != z11) {
                                                    keVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ke keVar2 = this.f38013b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        sd sdVar;
                                        sd sdVar2;
                                        switch (r7) {
                                            case 0:
                                                ke keVar22 = keVar2;
                                                int i142 = keVar22.f39460a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    keVar22.f39465n.addAll(starsStatus.history);
                                                    keVar22.f39466r = starsStatus.next_offset;
                                                    keVar22.f39467s[i15] = false;
                                                    keVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error2);
                                                    }
                                                }
                                                if (keVar22.a() != z12 && (sdVar = keVar22.f39463e) != null) {
                                                    sdVar.run();
                                                }
                                                if (keVar22.b(i15) != z13) {
                                                    keVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ke keVar3 = keVar2;
                                                int i16 = keVar3.f39460a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    keVar3.h.addAll(starsStatus2.history);
                                                    keVar3.f39464f = starsStatus2.next_offset;
                                                    keVar3.f39467s[i17] = false;
                                                    keVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error3);
                                                    }
                                                }
                                                if (keVar3.a() != z12 && (sdVar2 = keVar3.f39463e) != null) {
                                                    sdVar2.run();
                                                }
                                                if (keVar3.b(i17) != z13) {
                                                    keVar3.e();
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
            org.telegram.ui.Components.u91 u91Var = this.f39461b;
            if (i10 < u91Var.getViewPages().length) {
                View view = u91Var.getViewPages()[i10];
                if (view instanceof ie) {
                    ie ieVar = (ie) view;
                    org.telegram.ui.Components.p71 p71Var = ieVar.f38883a;
                    p71Var.W2.N(true);
                    if (p71Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < p71Var.getChildCount(); i11++) {
                            if (!(p71Var.getChildAt(i11) instanceof org.telegram.ui.Components.m10)) {
                            }
                        }
                    }
                    ieVar.f38886e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f39462c.i();
        org.telegram.ui.Components.u91 u91Var = this.f39461b;
        u91Var.o(false);
        View[] viewArr = u91Var.f31109e;
        int[] iArr = u91Var.f31110f;
        if (iArr[0] != u91Var.L.h(u91Var.f31107b)) {
            u91Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                u91Var.h.put(iArr[1], view);
                u91Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.wm0 getCurrentListView() {
        View currentView = this.f39461b.getCurrentView();
        if (!(currentView instanceof ie)) {
            return null;
        }
        return ((ie) currentView).f38883a;
    }
}
