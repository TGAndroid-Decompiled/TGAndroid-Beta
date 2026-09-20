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
    public org.telegram.ui.Cells.l6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f32508a;
    public TLRPC.ChatFull f32509b;
    public long f32510c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.vl0 f32511f;
    public aq h;
    public org.telegram.ui.Cells.x8 f32512n;
    public ArrayList f32513r;
    public LinearLayout f32514s;
    public int v;
    public int f32515w;
    public org.telegram.ui.Cells.l6 f32516x;
    public org.telegram.ui.Cells.l6 f32517y;

    public final void V(int i10, boolean z10) {
        aq aqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f32513r;
        if (this.v != i10) {
            org.telegram.ui.Cells.x8 x8Var = this.f32512n;
            if (x8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                x8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.j6.f19130f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f19113e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z12) {
                    this.f32512n.b(w02, z12);
                } else {
                    this.f32512n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) arrayList.get(i12);
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                l6Var.a(z11, z10);
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
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        org.telegram.ui.Cells.x8 x8Var = this.f32512n;
        if (x8Var != null) {
            x8Var.d(org.telegram.ui.ActionBar.j6.f19148g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f32510c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f32513r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            this.f32512n = x8Var;
            x8Var.setHeight(56);
            this.f32512n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.x8 x8Var2 = this.f32512n;
            if (x8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f19130f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19113e6;
            }
            x8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f32512n.setTypeface(AndroidUtilities.bold());
            this.f32512n.setOnClickListener(new View.OnClickListener(this) {
                public final bq f39974b;

                {
                    this.f39974b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            bq bqVar = this.f39974b;
                            if (bqVar.f32512n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            bqVar.V(i11, true);
                            return;
                        case 1:
                            final bq bqVar2 = this.f39974b;
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
                            final bq bqVar3 = this.f39974b;
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
                            final bq bqVar4 = this.f39974b;
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
            linearLayout.addView(this.f32512n, w7.y5.n(-1, -2));
        }
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        n4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f32514s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, null);
        this.f32516x = l6Var;
        l6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, null);
        this.f32517y = l6Var2;
        l6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.l6 l6Var3 = new org.telegram.ui.Cells.l6(context, null);
        this.E = l6Var3;
        l6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f32514s.addView(n4Var, w7.y5.n(-1, -2));
        this.f32514s.addView(this.f32516x, w7.y5.n(-1, -2));
        this.f32514s.addView(this.f32517y, w7.y5.n(-1, -2));
        this.f32514s.addView(this.E, w7.y5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f32516x);
        arrayList.add(this.f32517y);
        arrayList.add(this.E);
        this.f32516x.setOnClickListener(new View.OnClickListener(this) {
            public final bq f39974b;

            {
                this.f39974b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f39974b;
                        if (bqVar.f32512n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f39974b;
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
                        final bq bqVar3 = this.f39974b;
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
                        final bq bqVar4 = this.f39974b;
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
        this.f32517y.setOnClickListener(new View.OnClickListener(this) {
            public final bq f39974b;

            {
                this.f39974b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f39974b;
                        if (bqVar.f32512n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f39974b;
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
                        final bq bqVar3 = this.f39974b;
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
                        final bq bqVar4 = this.f39974b;
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
            public final bq f39974b;

            {
                this.f39974b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        bq bqVar = this.f39974b;
                        if (bqVar.f32512n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        bqVar.V(i11, true);
                        return;
                    case 1:
                        final bq bqVar2 = this.f39974b;
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
                        final bq bqVar3 = this.f39974b;
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
                        final bq bqVar4 = this.f39974b;
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
        int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
        n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.l6 l6Var4 = this.f32516x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f19184i6;
        l6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f32517y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f32515w, false);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f32511f = vl0Var;
        vl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f32511f;
        aq aqVar = new aq(this, context);
        this.h = aqVar;
        vl0Var2.setAdapter(aqVar);
        this.f32511f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f32511f, w7.y5.l(1.0f, -1, 0));
        this.f32511f.q1();
        this.actionBar.setAdaptiveBackground(this.f32511f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f32513r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f32510c)) {
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
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.j6.f19094d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19496z6, org.telegram.ui.ActionBar.j6.f19184i6, org.telegram.ui.ActionBar.j6.f19038a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19315p7, org.telegram.ui.ActionBar.j6.f19130f6, org.telegram.ui.ActionBar.j6.f19148g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f32510c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
