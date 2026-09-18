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
public final class dq extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f33202a;
    public TLRPC.ChatFull f33203b;
    public long f33204c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.ml0 f33205f;
    public cq h;
    public org.telegram.ui.Cells.w8 f33206n;
    public ArrayList f33207r;
    public LinearLayout f33208s;
    public int v;
    public int f33209w;
    public org.telegram.ui.Cells.j6 f33210x;
    public org.telegram.ui.Cells.j6 f33211y;

    public final void V(int i10, boolean z10) {
        cq cqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f33207r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f33206n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.j6.f18899f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f18882e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z12) {
                    this.f33206n.b(w02, z12);
                } else {
                    this.f33206n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i10;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) arrayList.get(i12);
                if (i10 == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var.a(z11, z10);
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
                cq cqVar2 = this.h;
                if (cqVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    cqVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                cq cqVar3 = this.h;
                if (cqVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    cqVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (cqVar = this.h) != null && z10) {
                cqVar.m(1);
            }
            cq cqVar4 = this.h;
            if (cqVar4 != null && !z10) {
                cqVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f33206n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.j6.f18917g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f33204c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f33207r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f33206n = w8Var;
            w8Var.setHeight(56);
            this.f33206n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f33206n;
            if (w8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f18899f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f18882e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f33206n.setTypeface(AndroidUtilities.bold());
            this.f33206n.setOnClickListener(new View.OnClickListener(this) {
                public final dq f31950b;

                {
                    this.f31950b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            dq dqVar = this.f31950b;
                            if (dqVar.f33206n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            dqVar.V(i11, true);
                            return;
                        case 1:
                            final dq dqVar2 = this.f31950b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            dqVar2.V(0, true);
                                            return;
                                        case 1:
                                            dqVar2.V(1, true);
                                            return;
                                        default:
                                            dqVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final dq dqVar3 = this.f31950b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            dqVar3.V(0, true);
                                            return;
                                        case 1:
                                            dqVar3.V(1, true);
                                            return;
                                        default:
                                            dqVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final dq dqVar4 = this.f31950b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            dqVar4.V(0, true);
                                            return;
                                        case 1:
                                            dqVar4.V(1, true);
                                            return;
                                        default:
                                            dqVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f33206n, w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33208s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f33210x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f33211y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.E = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f33208s.addView(l4Var, w7.x5.n(-1, -2));
        this.f33208s.addView(this.f33210x, w7.x5.n(-1, -2));
        this.f33208s.addView(this.f33211y, w7.x5.n(-1, -2));
        this.f33208s.addView(this.E, w7.x5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f33210x);
        arrayList.add(this.f33211y);
        arrayList.add(this.E);
        this.f33210x.setOnClickListener(new View.OnClickListener(this) {
            public final dq f31950b;

            {
                this.f31950b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31950b;
                        if (dqVar.f33206n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar2.V(0, true);
                                        return;
                                    case 1:
                                        dqVar2.V(1, true);
                                        return;
                                    default:
                                        dqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final dq dqVar3 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar3.V(0, true);
                                        return;
                                    case 1:
                                        dqVar3.V(1, true);
                                        return;
                                    default:
                                        dqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final dq dqVar4 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar4.V(0, true);
                                        return;
                                    case 1:
                                        dqVar4.V(1, true);
                                        return;
                                    default:
                                        dqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f33211y.setOnClickListener(new View.OnClickListener(this) {
            public final dq f31950b;

            {
                this.f31950b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31950b;
                        if (dqVar.f33206n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar2.V(0, true);
                                        return;
                                    case 1:
                                        dqVar2.V(1, true);
                                        return;
                                    default:
                                        dqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final dq dqVar3 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar3.V(0, true);
                                        return;
                                    case 1:
                                        dqVar3.V(1, true);
                                        return;
                                    default:
                                        dqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final dq dqVar4 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar4.V(0, true);
                                        return;
                                    case 1:
                                        dqVar4.V(1, true);
                                        return;
                                    default:
                                        dqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final dq f31950b;

            {
                this.f31950b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31950b;
                        if (dqVar.f33206n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar2.V(0, true);
                                        return;
                                    case 1:
                                        dqVar2.V(1, true);
                                        return;
                                    default:
                                        dqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final dq dqVar3 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar3.V(0, true);
                                        return;
                                    case 1:
                                        dqVar3.V(1, true);
                                        return;
                                    default:
                                        dqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final dq dqVar4 = this.f31950b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        dqVar4.V(0, true);
                                        return;
                                    case 1:
                                        dqVar4.V(1, true);
                                        return;
                                    default:
                                        dqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.j6.f18863d6;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f33210x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f18953i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f33211y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f33209w, false);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f33205f = ml0Var;
        ml0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ml0 ml0Var2 = this.f33205f;
        cq cqVar = new cq(this, context);
        this.h = cqVar;
        ml0Var2.setAdapter(cqVar);
        this.f33205f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f33205f, w7.x5.l(1.0f, -1, 0));
        this.f33205f.q1();
        this.actionBar.setAdaptiveBackground(this.f33205f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f33207r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f33204c)) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var != null && e5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 8), org.telegram.ui.ActionBar.j6.f18863d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19264z6, org.telegram.ui.ActionBar.j6.f18953i6, org.telegram.ui.ActionBar.j6.f18807a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19083p7, org.telegram.ui.ActionBar.j6.f18899f6, org.telegram.ui.ActionBar.j6.f18917g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f33204c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
