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
    public static final int f37399x = 0;
    public final int f37400a;
    public final fe f37401b;
    public final he f37402c;
    public final k0 d;
    public final long f37403e;
    public final pd f37404f;
    public String h;
    public final ArrayList f37405n;
    public final ArrayList f37406r;
    public String f37407s;
    public final boolean[] v;
    public final me f37408w;

    public ie(me meVar, Context context, int i10, long j3, int i11, pd pdVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f37408w = meVar;
        this.h = "";
        this.f37405n = new ArrayList();
        this.f37406r = new ArrayList();
        this.f37407s = "";
        this.v = new boolean[]{false, false};
        this.f37400a = i10;
        this.f37403e = j3;
        this.f37404f = pdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        fe feVar = new fe(this, context, d6Var, meVar);
        this.f37401b = feVar;
        he heVar = new he(this, context, i10, j3, i11, d6Var);
        this.f37402c = heVar;
        feVar.setAdapter(heVar);
        org.telegram.ui.Components.f91 n10 = feVar.n(-2, true);
        li.m mVar = meVar.f38549g2;
        if (mVar != null) {
            mVar.c(feVar);
        }
        k0 k0Var = new k0(this, context, 5);
        this.d = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k0Var.addView(n10, w7.z5.e(-1, 48, 48));
        addView(feVar, w7.z5.n(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f37405n.isEmpty() && this.f37406r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.f37405n.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f37406r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.v;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j3 = this.f37403e;
            me meVar = this.f37408w;
            int i12 = this.f37400a;
            if (i10 == 1) {
                if (this.h != null && meVar.f38547e2) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f37405n.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ie f35749b;

                        {
                            this.f35749b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ie ieVar = this.f35749b;
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
                                                    ie ieVar2 = ieVar;
                                                    int i14 = ieVar2.f37400a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        ieVar2.f37406r.addAll(starsStatus.history);
                                                        ieVar2.f37407s = starsStatus.next_offset;
                                                        ieVar2.v[i15] = false;
                                                        ieVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar2.a() != z10 && (pdVar = ieVar2.f37404f) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (ieVar2.b(i15) != z11) {
                                                        ieVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar;
                                                    int i16 = ieVar3.f37400a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.f37405n.addAll(starsStatus2.history);
                                                        ieVar3.h = starsStatus2.next_offset;
                                                        ieVar3.v[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z10 && (pdVar2 = ieVar3.f37404f) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z11) {
                                                        ieVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final ie ieVar2 = this.f35749b;
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
                                                    ie ieVar22 = ieVar2;
                                                    int i142 = ieVar22.f37400a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        ieVar22.f37406r.addAll(starsStatus.history);
                                                        ieVar22.f37407s = starsStatus.next_offset;
                                                        ieVar22.v[i15] = false;
                                                        ieVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (ieVar22.a() != z12 && (pdVar = ieVar22.f37404f) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (ieVar22.b(i15) != z13) {
                                                        ieVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ie ieVar3 = ieVar2;
                                                    int i16 = ieVar3.f37400a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        ieVar3.f37405n.addAll(starsStatus2.history);
                                                        ieVar3.h = starsStatus2.next_offset;
                                                        ieVar3.v[i17] = false;
                                                        ieVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.yc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (ieVar3.a() != z12 && (pdVar2 = ieVar3.f37404f) != null) {
                                                        pdVar2.run();
                                                    }
                                                    if (ieVar3.b(i17) != z13) {
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
            } else if (i10 == 0 && this.f37407s != null && meVar.f38548f2) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_payments_getStarsTransactions2.offset = this.f37407s;
                if (this.f37406r.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ie f35749b;

                    {
                        this.f35749b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ie ieVar = this.f35749b;
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
                                                ie ieVar22 = ieVar;
                                                int i142 = ieVar22.f37400a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f37406r.addAll(starsStatus.history);
                                                    ieVar22.f37407s = starsStatus.next_offset;
                                                    ieVar22.v[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z10 && (pdVar = ieVar22.f37404f) != null) {
                                                    pdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z11) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar;
                                                int i16 = ieVar3.f37400a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.f37405n.addAll(starsStatus2.history);
                                                    ieVar3.h = starsStatus2.next_offset;
                                                    ieVar3.v[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z10 && (pdVar2 = ieVar3.f37404f) != null) {
                                                    pdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z11) {
                                                    ieVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final ie ieVar2 = this.f35749b;
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
                                                ie ieVar22 = ieVar2;
                                                int i142 = ieVar22.f37400a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    ieVar22.f37406r.addAll(starsStatus.history);
                                                    ieVar22.f37407s = starsStatus.next_offset;
                                                    ieVar22.v[i15] = false;
                                                    ieVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error2);
                                                    }
                                                }
                                                if (ieVar22.a() != z12 && (pdVar = ieVar22.f37404f) != null) {
                                                    pdVar.run();
                                                }
                                                if (ieVar22.b(i15) != z13) {
                                                    ieVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ie ieVar3 = ieVar2;
                                                int i16 = ieVar3.f37400a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    ieVar3.f37405n.addAll(starsStatus2.history);
                                                    ieVar3.h = starsStatus2.next_offset;
                                                    ieVar3.v[i17] = false;
                                                    ieVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.yc.b0(tL_error3);
                                                    }
                                                }
                                                if (ieVar3.a() != z12 && (pdVar2 = ieVar3.f37404f) != null) {
                                                    pdVar2.run();
                                                }
                                                if (ieVar3.b(i17) != z13) {
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
            fe feVar = this.f37401b;
            if (i10 < feVar.getViewPages().length) {
                View view = feVar.getViewPages()[i10];
                if (view instanceof ge) {
                    ge geVar = (ge) view;
                    org.telegram.ui.Components.c71 c71Var = geVar.f36598a;
                    c71Var.f25245f3.N(true);
                    if (c71Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < c71Var.getChildCount(); i11++) {
                            if (!(c71Var.getChildAt(i11) instanceof org.telegram.ui.Components.w00)) {
                            }
                        }
                    }
                    geVar.f36601e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int h;
        he heVar = this.f37402c;
        ArrayList arrayList = heVar.f37051e;
        ArrayList arrayList2 = heVar.f37051e;
        int size = arrayList.size();
        fe feVar = this.f37401b;
        if (size == 0) {
            h = -1;
        } else {
            h = heVar.h(feVar.getCurrentPosition());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << heVar.h(i11);
        }
        heVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = heVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        feVar.onTouchEvent(null);
        feVar.setPosition(i13);
        feVar.J();
        feVar.o(false);
        this.f37408w.k0();
    }

    public org.telegram.ui.Components.zl0 getCurrentListView() {
        View currentView = this.f37401b.getCurrentView();
        if (!(currentView instanceof ge)) {
            return null;
        }
        return ((ge) currentView).f36598a;
    }
}
