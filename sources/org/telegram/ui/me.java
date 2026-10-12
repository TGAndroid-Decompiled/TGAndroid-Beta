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
public final class me extends LinearLayout {
    public final int f38227a;
    public final org.telegram.ui.Components.k91 f38228b;
    public final le f38229c;
    public final long d;
    public final ud e;
    public String f38230f;
    public final ArrayList h;
    public final ArrayList f38231n;
    public String f38232r;
    public final boolean[] f38233s;
    public final qe v;

    public me(qe qeVar, Context context, int i10, long j10, int i11, ud udVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = qeVar;
        this.f38230f = "";
        this.h = new ArrayList();
        this.f38231n = new ArrayList();
        this.f38232r = "";
        this.f38233s = new boolean[]{false, false};
        this.f38227a = i10;
        this.d = j10;
        this.e = udVar;
        setOrientation(1);
        org.telegram.ui.Components.k91 k91Var = new org.telegram.ui.Components.k91(context, null);
        this.f38228b = k91Var;
        le leVar = new le(this, context, i10, j10, i11, c6Var);
        this.f38229c = leVar;
        k91Var.setAdapter(leVar);
        View n10 = k91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, c6Var));
        addView(n10, w7.a6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.a6.z(-1.0f), w7.a6.z(1.0f / AndroidUtilities.density)));
        addView(k91Var, w7.a6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f38231n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f38231n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f38233s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.d;
            qe qeVar = this.v;
            int i12 = this.f38227a;
            if (i10 == 1) {
                if (this.f38230f != null && qeVar.f39400f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f38230f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final me f37101b;

                        {
                            this.f37101b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final me meVar = this.f37101b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ud udVar;
                                            ud udVar2;
                                            switch (r7) {
                                                case 0:
                                                    me meVar2 = meVar;
                                                    int i14 = meVar2.f38227a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        meVar2.f38231n.addAll(starsStatus.history);
                                                        meVar2.f38232r = starsStatus.next_offset;
                                                        meVar2.f38233s[i15] = false;
                                                        meVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (meVar2.a() != z10 && (udVar = meVar2.e) != null) {
                                                        udVar.run();
                                                    }
                                                    if (meVar2.b(i15) != z11) {
                                                        meVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    me meVar3 = meVar;
                                                    int i16 = meVar3.f38227a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        meVar3.h.addAll(starsStatus2.history);
                                                        meVar3.f38230f = starsStatus2.next_offset;
                                                        meVar3.f38233s[i17] = false;
                                                        meVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (meVar3.a() != z10 && (udVar2 = meVar3.e) != null) {
                                                        udVar2.run();
                                                    }
                                                    if (meVar3.b(i17) != z11) {
                                                        meVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final me meVar2 = this.f37101b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ud udVar;
                                            ud udVar2;
                                            switch (r7) {
                                                case 0:
                                                    me meVar22 = meVar2;
                                                    int i142 = meVar22.f38227a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        meVar22.f38231n.addAll(starsStatus.history);
                                                        meVar22.f38232r = starsStatus.next_offset;
                                                        meVar22.f38233s[i15] = false;
                                                        meVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (meVar22.a() != z12 && (udVar = meVar22.e) != null) {
                                                        udVar.run();
                                                    }
                                                    if (meVar22.b(i15) != z13) {
                                                        meVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    me meVar3 = meVar2;
                                                    int i16 = meVar3.f38227a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        meVar3.h.addAll(starsStatus2.history);
                                                        meVar3.f38230f = starsStatus2.next_offset;
                                                        meVar3.f38233s[i17] = false;
                                                        meVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.zc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (meVar3.a() != z12 && (udVar2 = meVar3.e) != null) {
                                                        udVar2.run();
                                                    }
                                                    if (meVar3.b(i17) != z13) {
                                                        meVar3.e();
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
            } else if (i10 == 0 && this.f38232r != null && qeVar.f39401g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f38232r;
                if (this.f38231n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final me f37101b;

                    {
                        this.f37101b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final me meVar = this.f37101b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ud udVar;
                                        ud udVar2;
                                        switch (r7) {
                                            case 0:
                                                me meVar22 = meVar;
                                                int i142 = meVar22.f38227a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    meVar22.f38231n.addAll(starsStatus.history);
                                                    meVar22.f38232r = starsStatus.next_offset;
                                                    meVar22.f38233s[i15] = false;
                                                    meVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error2);
                                                    }
                                                }
                                                if (meVar22.a() != z10 && (udVar = meVar22.e) != null) {
                                                    udVar.run();
                                                }
                                                if (meVar22.b(i15) != z11) {
                                                    meVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                me meVar3 = meVar;
                                                int i16 = meVar3.f38227a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    meVar3.h.addAll(starsStatus2.history);
                                                    meVar3.f38230f = starsStatus2.next_offset;
                                                    meVar3.f38233s[i17] = false;
                                                    meVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error3);
                                                    }
                                                }
                                                if (meVar3.a() != z10 && (udVar2 = meVar3.e) != null) {
                                                    udVar2.run();
                                                }
                                                if (meVar3.b(i17) != z11) {
                                                    meVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final me meVar2 = this.f37101b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ud udVar;
                                        ud udVar2;
                                        switch (r7) {
                                            case 0:
                                                me meVar22 = meVar2;
                                                int i142 = meVar22.f38227a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    meVar22.f38231n.addAll(starsStatus.history);
                                                    meVar22.f38232r = starsStatus.next_offset;
                                                    meVar22.f38233s[i15] = false;
                                                    meVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error2);
                                                    }
                                                }
                                                if (meVar22.a() != z12 && (udVar = meVar22.e) != null) {
                                                    udVar.run();
                                                }
                                                if (meVar22.b(i15) != z13) {
                                                    meVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                me meVar3 = meVar2;
                                                int i16 = meVar3.f38227a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    meVar3.h.addAll(starsStatus2.history);
                                                    meVar3.f38230f = starsStatus2.next_offset;
                                                    meVar3.f38233s[i17] = false;
                                                    meVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.zc.d0(tL_error3);
                                                    }
                                                }
                                                if (meVar3.a() != z12 && (udVar2 = meVar3.e) != null) {
                                                    udVar2.run();
                                                }
                                                if (meVar3.b(i17) != z13) {
                                                    meVar3.e();
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
            org.telegram.ui.Components.k91 k91Var = this.f38228b;
            if (i10 < k91Var.getViewPages().length) {
                View view = k91Var.getViewPages()[i10];
                if (view instanceof ke) {
                    ke keVar = (ke) view;
                    org.telegram.ui.Components.h71 h71Var = keVar.f37629a;
                    h71Var.W2.N(true);
                    if (h71Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < h71Var.getChildCount(); i11++) {
                            if (!(h71Var.getChildAt(i11) instanceof org.telegram.ui.Components.f10)) {
                            }
                        }
                    }
                    keVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f38229c.i();
        org.telegram.ui.Components.k91 k91Var = this.f38228b;
        k91Var.o(false);
        View[] viewArr = k91Var.e;
        int[] iArr = k91Var.f26642f;
        if (iArr[0] != k91Var.L.h(k91Var.f26640b)) {
            k91Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                k91Var.h.put(iArr[1], view);
                k91Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.mm0 getCurrentListView() {
        View currentView = this.f38228b.getCurrentView();
        if (!(currentView instanceof ke)) {
            return null;
        }
        return ((ke) currentView).f37629a;
    }
}
