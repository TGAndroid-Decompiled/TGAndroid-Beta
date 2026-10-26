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
    public static final int f39618x = 0;
    public final int f39619a;
    public final de f39620b;
    public final fe f39621c;
    public final k0 d;
    public final long e;
    public final pd f39622f;
    public String h;
    public final ArrayList f39623n;
    public final ArrayList f39624r;
    public String f39625s;
    public final boolean[] v;
    public final ke f39626w;

    public ge(ke keVar, Context context, int i10, long j10, int i11, pd pdVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f39626w = keVar;
        this.h = "";
        this.f39623n = new ArrayList();
        this.f39624r = new ArrayList();
        this.f39625s = "";
        this.v = new boolean[]{false, false};
        this.f39619a = i10;
        this.e = j10;
        this.f39622f = pdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        de deVar = new de(this, context, u6Var, keVar);
        this.f39620b = deVar;
        fe feVar = new fe(this, context, i10, j10, i11, u6Var);
        this.f39621c = feVar;
        deVar.setAdapter(feVar);
        org.telegram.ui.Components.t91 n10 = deVar.n(-2, true);
        oi.q qVar = keVar.f40896d1;
        if (qVar != null) {
            qVar.c(deVar);
        }
        k0 k0Var = new k0(this, context, 5);
        this.d = k0Var;
        k0Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k0Var.addView(n10, org.telegram.ui.Components.gb1.i(-1, 48, 48));
        addView(deVar, org.telegram.ui.Components.gb1.r(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f39623n.isEmpty() && this.f39624r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.f39623n.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f39624r.isEmpty();
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
            long j10 = this.e;
            ke keVar = this.f39626w;
            int i12 = this.f39619a;
            if (i10 == 1) {
                if (this.h != null && keVar.f40894b1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f39623n.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final ge f38074b;

                        {
                            this.f38074b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final ge geVar = this.f38074b;
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
                                                    ge geVar2 = geVar;
                                                    int i14 = geVar2.f39619a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        geVar2.f39624r.addAll(starsStatus.history);
                                                        geVar2.f39625s = starsStatus.next_offset;
                                                        geVar2.v[i15] = false;
                                                        geVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.wc.e0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar2.a() != z10 && (pdVar = geVar2.f39622f) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (geVar2.b(i15) != z11) {
                                                        geVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar;
                                                    int i16 = geVar3.f39619a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.f39623n.addAll(starsStatus2.history);
                                                        geVar3.h = starsStatus2.next_offset;
                                                        geVar3.v[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.wc.e0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z10 && (pdVar2 = geVar3.f39622f) != null) {
                                                        pdVar2.run();
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
                                    final ge geVar2 = this.f38074b;
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
                                                    ge geVar22 = geVar2;
                                                    int i142 = geVar22.f39619a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        geVar22.f39624r.addAll(starsStatus.history);
                                                        geVar22.f39625s = starsStatus.next_offset;
                                                        geVar22.v[i15] = false;
                                                        geVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.wc.e0(tL_error2);
                                                        }
                                                    }
                                                    if (geVar22.a() != z12 && (pdVar = geVar22.f39622f) != null) {
                                                        pdVar.run();
                                                    }
                                                    if (geVar22.b(i15) != z13) {
                                                        geVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    ge geVar3 = geVar2;
                                                    int i16 = geVar3.f39619a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        geVar3.f39623n.addAll(starsStatus2.history);
                                                        geVar3.h = starsStatus2.next_offset;
                                                        geVar3.v[i17] = false;
                                                        geVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.wc.e0(tL_error3);
                                                        }
                                                    }
                                                    if (geVar3.a() != z12 && (pdVar2 = geVar3.f39622f) != null) {
                                                        pdVar2.run();
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
            } else if (i10 == 0 && this.f39625s != null && keVar.f40895c1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f39625s;
                if (this.f39624r.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ge f38074b;

                    {
                        this.f38074b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final ge geVar = this.f38074b;
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
                                                ge geVar22 = geVar;
                                                int i142 = geVar22.f39619a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f39624r.addAll(starsStatus.history);
                                                    geVar22.f39625s = starsStatus.next_offset;
                                                    geVar22.v[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.wc.e0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z10 && (pdVar = geVar22.f39622f) != null) {
                                                    pdVar.run();
                                                }
                                                if (geVar22.b(i15) != z11) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar;
                                                int i16 = geVar3.f39619a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.f39623n.addAll(starsStatus2.history);
                                                    geVar3.h = starsStatus2.next_offset;
                                                    geVar3.v[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.wc.e0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z10 && (pdVar2 = geVar3.f39622f) != null) {
                                                    pdVar2.run();
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
                                final ge geVar2 = this.f38074b;
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
                                                ge geVar22 = geVar2;
                                                int i142 = geVar22.f39619a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    geVar22.f39624r.addAll(starsStatus.history);
                                                    geVar22.f39625s = starsStatus.next_offset;
                                                    geVar22.v[i15] = false;
                                                    geVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.wc.e0(tL_error2);
                                                    }
                                                }
                                                if (geVar22.a() != z12 && (pdVar = geVar22.f39622f) != null) {
                                                    pdVar.run();
                                                }
                                                if (geVar22.b(i15) != z13) {
                                                    geVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                ge geVar3 = geVar2;
                                                int i16 = geVar3.f39619a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    geVar3.f39623n.addAll(starsStatus2.history);
                                                    geVar3.h = starsStatus2.next_offset;
                                                    geVar3.v[i17] = false;
                                                    geVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.wc.e0(tL_error3);
                                                    }
                                                }
                                                if (geVar3.a() != z12 && (pdVar2 = geVar3.f39622f) != null) {
                                                    pdVar2.run();
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
            de deVar = this.f39620b;
            if (i10 < deVar.getViewPages().length) {
                View view = deVar.getViewPages()[i10];
                if (view instanceof ee) {
                    ee eeVar = (ee) view;
                    org.telegram.ui.Components.r71 r71Var = eeVar.f39091a;
                    r71Var.f32152g3.O(true);
                    if (r71Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < r71Var.getChildCount(); i11++) {
                            if (!(r71Var.getChildAt(i11) instanceof org.telegram.ui.Components.c10)) {
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
        int h;
        fe feVar = this.f39621c;
        ArrayList arrayList = feVar.e;
        ArrayList arrayList2 = feVar.e;
        int size = arrayList.size();
        de deVar = this.f39620b;
        if (size == 0) {
            h = -1;
        } else {
            h = feVar.h(deVar.getCurrentPosition());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            i10 |= 1 << feVar.h(i11);
        }
        feVar.i();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            int h10 = feVar.h(i14);
            i12 |= 1 << h10;
            if (h10 == h) {
                i13 = i14;
            }
        }
        if (i10 == i12) {
            return;
        }
        deVar.onTouchEvent(null);
        deVar.setPosition(i13);
        deVar.J();
        deVar.o(false);
        this.f39626w.l();
    }

    public org.telegram.ui.Components.mm0 getCurrentListView() {
        View currentView = this.f39620b.getCurrentView();
        if (!(currentView instanceof ee)) {
            return null;
        }
        return ((ee) currentView).f39091a;
    }
}
