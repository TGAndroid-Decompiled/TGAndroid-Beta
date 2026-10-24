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
public final class ee extends LinearLayout {
    public final int f36884a;
    public final org.telegram.ui.Components.l91 f36885b;
    public final de f36886c;
    public final long d;
    public final od e;
    public String f36887f;
    public final ArrayList h;
    public final ArrayList f36888n;
    public String f36889r;
    public final boolean[] f36890s;
    public final ie v;

    public ee(ie ieVar, Context context, int i10, long j10, int i11, od odVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.v = ieVar;
        this.f36887f = "";
        this.h = new ArrayList();
        this.f36888n = new ArrayList();
        this.f36889r = "";
        this.f36890s = new boolean[]{false, false};
        this.f36884a = i10;
        this.d = j10;
        this.e = odVar;
        setOrientation(1);
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(context, null);
        this.f36885b = l91Var;
        de deVar = new de(this, context, i10, j10, i11, g6Var);
        this.f36886c = deVar;
        l91Var.setAdapter(deVar);
        View n10 = l91Var.n(3, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, g6Var);
        addView(n10, w7.z5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
        addView(l91Var, w7.z5.n(-1, -1));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, this, g6Var);
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f36888n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f36888n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f36890s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.d;
            ie ieVar = this.v;
            int i12 = this.f36884a;
            if (i10 == 1) {
                if (this.f36887f != null && ieVar.f38244f1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f36887f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ee f35735b;

                        {
                            this.f35735b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ee eeVar = this.f35735b;
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
                                                    ee eeVar2 = eeVar;
                                                    int i14 = eeVar2.f36884a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        eeVar2.f36888n.addAll(starsStatus.history);
                                                        eeVar2.f36889r = starsStatus.next_offset;
                                                        eeVar2.f36890s[i15] = false;
                                                        eeVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.vc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (eeVar2.a() != z10 && (odVar = eeVar2.e) != null) {
                                                        odVar.run();
                                                    }
                                                    if (eeVar2.b(i15) != z11) {
                                                        eeVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ee eeVar3 = eeVar;
                                                    int i16 = eeVar3.f36884a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        eeVar3.h.addAll(starsStatus2.history);
                                                        eeVar3.f36887f = starsStatus2.next_offset;
                                                        eeVar3.f36890s[i17] = false;
                                                        eeVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.vc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (eeVar3.a() != z10 && (odVar2 = eeVar3.e) != null) {
                                                        odVar2.run();
                                                    }
                                                    if (eeVar3.b(i17) != z11) {
                                                        eeVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ee eeVar2 = this.f35735b;
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
                                                    ee eeVar22 = eeVar2;
                                                    int i142 = eeVar22.f36884a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        eeVar22.f36888n.addAll(starsStatus.history);
                                                        eeVar22.f36889r = starsStatus.next_offset;
                                                        eeVar22.f36890s[i15] = false;
                                                        eeVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.vc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (eeVar22.a() != z12 && (odVar = eeVar22.e) != null) {
                                                        odVar.run();
                                                    }
                                                    if (eeVar22.b(i15) != z13) {
                                                        eeVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ee eeVar3 = eeVar2;
                                                    int i16 = eeVar3.f36884a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        eeVar3.h.addAll(starsStatus2.history);
                                                        eeVar3.f36887f = starsStatus2.next_offset;
                                                        eeVar3.f36890s[i17] = false;
                                                        eeVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.vc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (eeVar3.a() != z12 && (odVar2 = eeVar3.e) != null) {
                                                        odVar2.run();
                                                    }
                                                    if (eeVar3.b(i17) != z13) {
                                                        eeVar3.e();
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
            } else if (i10 == 0 && this.f36889r != null && ieVar.f38245g1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f36889r;
                if (this.f36888n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ee f35735b;

                    {
                        this.f35735b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ee eeVar = this.f35735b;
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
                                                ee eeVar22 = eeVar;
                                                int i142 = eeVar22.f36884a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    eeVar22.f36888n.addAll(starsStatus.history);
                                                    eeVar22.f36889r = starsStatus.next_offset;
                                                    eeVar22.f36890s[i15] = false;
                                                    eeVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.vc.d0(tL_error2);
                                                    }
                                                }
                                                if (eeVar22.a() != z10 && (odVar = eeVar22.e) != null) {
                                                    odVar.run();
                                                }
                                                if (eeVar22.b(i15) != z11) {
                                                    eeVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ee eeVar3 = eeVar;
                                                int i16 = eeVar3.f36884a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    eeVar3.h.addAll(starsStatus2.history);
                                                    eeVar3.f36887f = starsStatus2.next_offset;
                                                    eeVar3.f36890s[i17] = false;
                                                    eeVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.vc.d0(tL_error3);
                                                    }
                                                }
                                                if (eeVar3.a() != z10 && (odVar2 = eeVar3.e) != null) {
                                                    odVar2.run();
                                                }
                                                if (eeVar3.b(i17) != z11) {
                                                    eeVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ee eeVar2 = this.f35735b;
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
                                                ee eeVar22 = eeVar2;
                                                int i142 = eeVar22.f36884a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    eeVar22.f36888n.addAll(starsStatus.history);
                                                    eeVar22.f36889r = starsStatus.next_offset;
                                                    eeVar22.f36890s[i15] = false;
                                                    eeVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.vc.d0(tL_error2);
                                                    }
                                                }
                                                if (eeVar22.a() != z12 && (odVar = eeVar22.e) != null) {
                                                    odVar.run();
                                                }
                                                if (eeVar22.b(i15) != z13) {
                                                    eeVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ee eeVar3 = eeVar2;
                                                int i16 = eeVar3.f36884a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    eeVar3.h.addAll(starsStatus2.history);
                                                    eeVar3.f36887f = starsStatus2.next_offset;
                                                    eeVar3.f36890s[i17] = false;
                                                    eeVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.vc.d0(tL_error3);
                                                    }
                                                }
                                                if (eeVar3.a() != z12 && (odVar2 = eeVar3.e) != null) {
                                                    odVar2.run();
                                                }
                                                if (eeVar3.b(i17) != z13) {
                                                    eeVar3.e();
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
            org.telegram.ui.Components.l91 l91Var = this.f36885b;
            if (i10 < l91Var.getViewPages().length) {
                View view = l91Var.getViewPages()[i10];
                if (view instanceof ce) {
                    ce ceVar = (ce) view;
                    org.telegram.ui.Components.i71 i71Var = ceVar.f36312a;
                    i71Var.Z2.N(true);
                    if (i71Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < i71Var.getChildCount(); i11++) {
                            if (!(i71Var.getChildAt(i11) instanceof org.telegram.ui.Components.z00)) {
                            }
                        }
                    }
                    ceVar.e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f36886c.i();
        org.telegram.ui.Components.l91 l91Var = this.f36885b;
        l91Var.o(false);
        View[] viewArr = l91Var.e;
        int[] iArr = l91Var.f28283f;
        if (iArr[0] != l91Var.L.h(l91Var.f28281b)) {
            l91Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                l91Var.h.put(iArr[1], view);
                l91Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.lm0 getCurrentListView() {
        View currentView = this.f36885b.getCurrentView();
        if (!(currentView instanceof ce)) {
            return null;
        }
        return ((ce) currentView).f36312a;
    }
}
