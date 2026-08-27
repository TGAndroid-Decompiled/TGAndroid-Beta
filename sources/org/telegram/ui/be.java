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

    public final int f36785a;

    public final org.telegram.ui.Components.p71 f36786b;

    public final ae f36787c;
    public final long d;

    public final kd f36788e;

    public String f36789f;
    public final ArrayList h;

    public final ArrayList f36790n;

    public String f36791r;

    public final boolean[] f36792s;
    public final fe v;

    public be(fe feVar, Context context, int i10, long j10, int i11, kd kdVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = feVar;
        this.f36789f = "";
        this.h = new ArrayList();
        this.f36790n = new ArrayList();
        this.f36791r = "";
        this.f36792s = new boolean[]{false, false};
        this.f36785a = i10;
        this.d = j10;
        this.f36788e = kdVar;
        setOrientation(1);
        org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(context, null);
        this.f36786b = p71Var;
        ae aeVar = new ae(this, context, i10, j10, i11, c6Var);
        this.f36787c = aeVar;
        p71Var.setAdapter(aeVar);
        View viewN = p71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        addView(viewN, h7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(h7.z5.z(-1.0f), h7.z5.z(1.0f / AndroidUtilities.density)));
        addView(p71Var, h7.z5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.h.isEmpty() && this.f36790n.isEmpty()) ? false : true;
    }

    public final boolean b(int i10) {
        boolean zIsEmpty;
        if (i10 == 1) {
            zIsEmpty = this.h.isEmpty();
        } else {
            if (i10 != 0) {
                return false;
            }
            zIsEmpty = this.f36790n.isEmpty();
        }
        return !zIsEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f36792s;
        if (zArr[i10]) {
            return;
        }
        final boolean zA = a();
        final boolean zB = b(i10);
        long j10 = this.d;
        fe feVar = this.v;
        int i11 = this.f36785a;
        if (i10 == 1) {
            if (this.f36789f == null || !feVar.f38081b1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f36789f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {

                public final be f44416b;

                {
                    this.f44416b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final be beVar = this.f44416b;
                            final int i14 = i10;
                            final boolean z10 = zA;
                            final boolean z11 = zB;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i13) {
                                        case 0:
                                            be beVar2 = beVar;
                                            int i15 = beVar2.f36785a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                beVar2.f36790n.addAll(starsStatus.history);
                                                beVar2.f36791r = starsStatus.next_offset;
                                                beVar2.f36792s[i16] = false;
                                                beVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar2.a() != z10 && (kdVar = beVar2.f36788e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar2.b(i16) != z11) {
                                                beVar2.e();
                                            }
                                            break;
                                        default:
                                            be beVar3 = beVar;
                                            int i17 = beVar3.f36785a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                beVar3.h.addAll(starsStatus2.history);
                                                beVar3.f36789f = starsStatus2.next_offset;
                                                beVar3.f36792s[i18] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar3.a() != z10 && (kdVar2 = beVar3.f36788e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar3.b(i18) != z11) {
                                                beVar3.e();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final be beVar2 = this.f44416b;
                            final int i16 = i10;
                            final boolean z12 = zA;
                            final boolean z13 = zB;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i15) {
                                        case 0:
                                            be beVar3 = beVar2;
                                            int i17 = beVar3.f36785a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z14 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z14) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                                                beVar3.f36790n.addAll(starsStatus.history);
                                                beVar3.f36791r = starsStatus.next_offset;
                                                beVar3.f36792s[i18] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar3.a() != z12 && (kdVar = beVar3.f36788e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar3.b(i18) != z13) {
                                                beVar3.e();
                                            }
                                            break;
                                        default:
                                            be beVar4 = beVar2;
                                            int i19 = beVar4.f36785a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z15 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i110 = i16;
                                            if (z15) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i19).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i19).putChats(starsStatus2.chats, false);
                                                beVar4.h.addAll(starsStatus2.history);
                                                beVar4.f36789f = starsStatus2.next_offset;
                                                beVar4.f36792s[i110] = false;
                                                beVar4.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar4.a() != z12 && (kdVar2 = beVar4.f36788e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar4.b(i110) != z13) {
                                                beVar4.e();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 0 && this.f36791r != null && feVar.f38082c1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.f36791r;
            tL_payments_getStarsTransactions2.limit = this.f36790n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {

                public final be f44416b;

                {
                    this.f44416b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i14 = 1;
                            final be beVar = this.f44416b;
                            final int i15 = i10;
                            final boolean z10 = zA;
                            final boolean z11 = zB;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i14) {
                                        case 0:
                                            be beVar3 = beVar;
                                            int i17 = beVar3.f36785a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z14 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i18 = i15;
                                            if (z14) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                                                beVar3.f36790n.addAll(starsStatus.history);
                                                beVar3.f36791r = starsStatus.next_offset;
                                                beVar3.f36792s[i18] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar3.a() != z10 && (kdVar = beVar3.f36788e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar3.b(i18) != z11) {
                                                beVar3.e();
                                            }
                                            break;
                                        default:
                                            be beVar4 = beVar;
                                            int i19 = beVar4.f36785a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z15 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i110 = i15;
                                            if (z15) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i19).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i19).putChats(starsStatus2.chats, false);
                                                beVar4.h.addAll(starsStatus2.history);
                                                beVar4.f36789f = starsStatus2.next_offset;
                                                beVar4.f36792s[i110] = false;
                                                beVar4.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar4.a() != z10 && (kdVar2 = beVar4.f36788e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar4.b(i110) != z11) {
                                                beVar4.e();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i16 = 0;
                            final be beVar2 = this.f44416b;
                            final int i17 = i10;
                            final boolean z12 = zA;
                            final boolean z13 = zB;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    kd kdVar;
                                    kd kdVar2;
                                    switch (i16) {
                                        case 0:
                                            be beVar3 = beVar2;
                                            int i18 = beVar3.f36785a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z14 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i19 = i17;
                                            if (z14) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i18).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i18).putChats(starsStatus.chats, false);
                                                beVar3.f36790n.addAll(starsStatus.history);
                                                beVar3.f36791r = starsStatus.next_offset;
                                                beVar3.f36792s[i19] = false;
                                                beVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error2);
                                                }
                                            }
                                            if (beVar3.a() != z12 && (kdVar = beVar3.f36788e) != null) {
                                                kdVar.run();
                                            }
                                            if (beVar3.b(i19) != z13) {
                                                beVar3.e();
                                            }
                                            break;
                                        default:
                                            be beVar4 = beVar2;
                                            int i110 = beVar4.f36785a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z15 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i111 = i17;
                                            if (z15) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i110).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i110).putChats(starsStatus2.chats, false);
                                                beVar4.h.addAll(starsStatus2.history);
                                                beVar4.f36789f = starsStatus2.next_offset;
                                                beVar4.f36792s[i111] = false;
                                                beVar4.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.mc.b0(tL_error3);
                                                }
                                            }
                                            if (beVar4.a() != z12 && (kdVar2 = beVar4.f36788e) != null) {
                                                kdVar2.run();
                                            }
                                            if (beVar4.b(i111) != z13) {
                                                beVar4.e();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p71 p71Var = this.f36786b;
            if (i10 >= p71Var.getViewPages().length) {
                return;
            }
            View view = p71Var.getViewPages()[i10];
            if (view instanceof zd) {
                zd zdVar = (zd) view;
                org.telegram.ui.Components.k51 k51Var = zdVar.f45140a;
                k51Var.U2.N(true);
                if (!k51Var.canScrollVertically(1)) {
                    zdVar.f45143e.run();
                    break;
                    break;
                }
                for (int i11 = 0; i11 < k51Var.getChildCount(); i11++) {
                    if (k51Var.getChildAt(i11) instanceof org.telegram.ui.Components.h00) {
                        zdVar.f45143e.run();
                        break;
                    }
                }
            }
            i10++;
        }
    }

    public final void e() {
        this.f36787c.i();
        org.telegram.ui.Components.p71 p71Var = this.f36786b;
        p71Var.o(false);
        View[] viewArr = p71Var.f31545e;
        int[] iArr = p71Var.f31546f;
        if (iArr[0] != p71Var.H.h(p71Var.f31543b)) {
            p71Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                p71Var.h.put(iArr[1], view);
                p71Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.zk0 getCurrentListView() {
        View currentView = this.f36786b.getCurrentView();
        if (currentView instanceof zd) {
            return ((zd) currentView).f45140a;
        }
        return null;
    }
}
