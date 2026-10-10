package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f36415a;
    public TLRPC.ChatFull f36416b;
    public long f36417c;
    public ArrayList d;
    public LinearLayout f36418e;
    public org.telegram.ui.Components.rm0 f36419f;
    public aq h;
    public org.telegram.ui.Cells.w8 f36420n;
    public ArrayList f36421r;
    public LinearLayout f36422s;
    public int v;
    public int f36423w;
    public org.telegram.ui.Cells.k6 f36424x;
    public org.telegram.ui.Cells.k6 f36425y;

    public final void V(int i10, boolean z10) {
        aq aqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f36421r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f36420n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.i6.f20838f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.i6.f20821e6;
                }
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
                if (z12) {
                    this.f36420n.b(x02, z12);
                } else {
                    this.f36420n.setBackgroundColorAnimatedReverse(x02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) arrayList.get(i12);
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k6Var.a(z11, z10);
            }
            int i13 = 2;
            if (i10 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                            this.d.add(tL_availableReaction.reaction);
                        }
                    }
                    if (this.d.isEmpty() && arrayList2.size() >= 2) {
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                    }
                }
                aq aqVar2 = this.h;
                if (aqVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    aqVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                aq aqVar3 = this.h;
                if (aqVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    aqVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (aqVar = this.h) != null && z10) {
                aqVar.m(1);
            }
            aq aqVar4 = this.h;
            if (aqVar4 != null && !z10) {
                aqVar4.l();
            }
        }
    }

    public final void W() {
        this.f36418e.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f36420n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.i6.f20857g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f36417c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f36421r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f36420n = w8Var;
            w8Var.setHeight(56);
            this.f36420n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f36420n;
            if (w8Var2.f23692e.h) {
                i10 = org.telegram.ui.ActionBar.i6.f20838f6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f20821e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            this.f36420n.setTypeface(AndroidUtilities.bold());
            this.f36420n.setOnClickListener(new View.OnClickListener(this) {
                public final bq f44429b;

                {
                    this.f44429b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            bq bqVar = this.f44429b;
                            if (bqVar.f36420n.f23692e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            bqVar.V(i11, true);
                            return;
                        case 1:
                            final bq bqVar2 = this.f44429b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            bqVar2.V(0, true);
                                            return;
                                        case 1:
                                            bqVar2.V(1, true);
                                            return;
                                        default:
                                            bqVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final bq bqVar3 = this.f44429b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            bqVar3.V(0, true);
                                            return;
                                        case 1:
                                            bqVar3.V(1, true);
                                            return;
                                        default:
                                            bqVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final bq bqVar4 = this.f44429b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            bqVar4.V(0, true);
                                            return;
                                        case 1:
                                            bqVar4.V(1, true);
                                            return;
                                        default:
                                            bqVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f36420n, w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f36422s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f36424x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f36425y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f36422s.addView(m4Var, w7.x5.n(-1, -2));
        this.f36422s.addView(this.f36424x, w7.x5.n(-1, -2));
        this.f36422s.addView(this.f36425y, w7.x5.n(-1, -2));
        this.f36422s.addView(this.E, w7.x5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f36424x);
        arrayList.add(this.f36425y);
        arrayList.add(this.E);
        this.f36424x.setOnClickListener(new View.OnClickListener(this) {
            public final bq f44429b;

            {
                this.f44429b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f44429b;
                        if (bqVar.f36420n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar2.V(0, true);
                                        return;
                                    case 1:
                                        bqVar2.V(1, true);
                                        return;
                                    default:
                                        bqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final bq bqVar3 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar3.V(0, true);
                                        return;
                                    case 1:
                                        bqVar3.V(1, true);
                                        return;
                                    default:
                                        bqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bq bqVar4 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar4.V(0, true);
                                        return;
                                    case 1:
                                        bqVar4.V(1, true);
                                        return;
                                    default:
                                        bqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f36425y.setOnClickListener(new View.OnClickListener(this) {
            public final bq f44429b;

            {
                this.f44429b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f44429b;
                        if (bqVar.f36420n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar2.V(0, true);
                                        return;
                                    case 1:
                                        bqVar2.V(1, true);
                                        return;
                                    default:
                                        bqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final bq bqVar3 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar3.V(0, true);
                                        return;
                                    case 1:
                                        bqVar3.V(1, true);
                                        return;
                                    default:
                                        bqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bq bqVar4 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar4.V(0, true);
                                        return;
                                    case 1:
                                        bqVar4.V(1, true);
                                        return;
                                    default:
                                        bqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final bq f44429b;

            {
                this.f44429b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f44429b;
                        if (bqVar.f36420n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar2.V(0, true);
                                        return;
                                    case 1:
                                        bqVar2.V(1, true);
                                        return;
                                    default:
                                        bqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final bq bqVar3 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar3.V(0, true);
                                        return;
                                    case 1:
                                        bqVar3.V(1, true);
                                        return;
                                    default:
                                        bqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final bq bqVar4 = this.f44429b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        bqVar4.V(0, true);
                                        return;
                                    case 1:
                                        bqVar4.V(1, true);
                                        return;
                                    default:
                                        bqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.i6.f20801d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f36424x;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.f20892i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.i6.h0(x02, org.telegram.ui.ActionBar.i6.x0(null, i12, false)));
        this.f36425y.setBackground(org.telegram.ui.ActionBar.i6.h0(org.telegram.ui.ActionBar.i6.x0(null, i11, false), org.telegram.ui.ActionBar.i6.x0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.i6.h0(org.telegram.ui.ActionBar.i6.x0(null, i11, false), org.telegram.ui.ActionBar.i6.x0(null, i12, false)));
        V(this.f36423w, false);
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f36419f = rm0Var;
        rm0Var.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.rm0 rm0Var2 = this.f36419f;
        aq aqVar = new aq(this, context);
        this.h = aqVar;
        rm0Var2.setAdapter(aqVar);
        this.f36419f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f36419f, w7.x5.l(1.0f, -1, 0));
        this.f36419f.p1();
        this.actionBar.setAdaptiveBackground(this.f36419f);
        this.f36418e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f36418e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f36421r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f36417c)) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var != null && d5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 8), org.telegram.ui.ActionBar.i6.f20801d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21203z6, org.telegram.ui.ActionBar.i6.f20892i6, org.telegram.ui.ActionBar.i6.f20745a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21022p7, org.telegram.ui.ActionBar.i6.f20838f6, org.telegram.ui.ActionBar.i6.f20857g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f36417c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
