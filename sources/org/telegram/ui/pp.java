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
public final class pp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f40267a;
    public TLRPC.ChatFull f40268b;
    public long f40269c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.jm0 f40270f;
    public op h;
    public org.telegram.ui.Cells.v8 f40271n;
    public ArrayList f40272r;
    public LinearLayout f40273s;
    public int v;
    public int f40274w;
    public org.telegram.ui.Cells.j6 f40275x;
    public org.telegram.ui.Cells.j6 f40276y;

    public final void V(int i10, boolean z10) {
        op opVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f40272r;
        if (this.v != i10) {
            org.telegram.ui.Cells.v8 v8Var = this.f40271n;
            if (v8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                v8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.h6.f21026f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.h6.f21007e6;
                }
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                if (z12) {
                    this.f40271n.b(x02, z12);
                } else {
                    this.f40271n.setBackgroundColorAnimatedReverse(x02);
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
                op opVar2 = this.h;
                if (opVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    opVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                op opVar3 = this.h;
                if (opVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    opVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (opVar = this.h) != null && z10) {
                opVar.m(1);
            }
            op opVar4 = this.h;
            if (opVar4 != null && !z10) {
                opVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        org.telegram.ui.Cells.v8 v8Var = this.f40271n;
        if (v8Var != null) {
            v8Var.d(org.telegram.ui.ActionBar.h6.f21043g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f40269c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f40272r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.f40271n = v8Var;
            v8Var.setHeight(56);
            this.f40271n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.v8 v8Var2 = this.f40271n;
            if (v8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.h6.f21026f6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f21007e6;
            }
            v8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            this.f40271n.setTypeface(AndroidUtilities.bold());
            this.f40271n.setOnClickListener(new View.OnClickListener(this) {
                public final pp f39325b;

                {
                    this.f39325b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            pp ppVar = this.f39325b;
                            if (ppVar.f40271n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            ppVar.V(i11, true);
                            return;
                        case 1:
                            final pp ppVar2 = this.f39325b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ppVar2.V(0, true);
                                            return;
                                        case 1:
                                            ppVar2.V(1, true);
                                            return;
                                        default:
                                            ppVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final pp ppVar3 = this.f39325b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ppVar3.V(0, true);
                                            return;
                                        case 1:
                                            ppVar3.V(1, true);
                                            return;
                                        default:
                                            ppVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final pp ppVar4 = this.f39325b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            ppVar4.V(0, true);
                                            return;
                                        case 1:
                                            ppVar4.V(1, true);
                                            return;
                                        default:
                                            ppVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f40271n, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f40273s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f40275x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f40276y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.E = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f40273s.addView(l4Var, w7.z5.n(-1, -2));
        this.f40273s.addView(this.f40275x, w7.z5.n(-1, -2));
        this.f40273s.addView(this.f40276y, w7.z5.n(-1, -2));
        this.f40273s.addView(this.E, w7.z5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f40275x);
        arrayList.add(this.f40276y);
        arrayList.add(this.E);
        this.f40275x.setOnClickListener(new View.OnClickListener(this) {
            public final pp f39325b;

            {
                this.f39325b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        pp ppVar = this.f39325b;
                        if (ppVar.f40271n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ppVar.V(i11, true);
                        return;
                    case 1:
                        final pp ppVar2 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar2.V(0, true);
                                        return;
                                    case 1:
                                        ppVar2.V(1, true);
                                        return;
                                    default:
                                        ppVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final pp ppVar3 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar3.V(0, true);
                                        return;
                                    case 1:
                                        ppVar3.V(1, true);
                                        return;
                                    default:
                                        ppVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final pp ppVar4 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar4.V(0, true);
                                        return;
                                    case 1:
                                        ppVar4.V(1, true);
                                        return;
                                    default:
                                        ppVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f40276y.setOnClickListener(new View.OnClickListener(this) {
            public final pp f39325b;

            {
                this.f39325b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        pp ppVar = this.f39325b;
                        if (ppVar.f40271n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ppVar.V(i11, true);
                        return;
                    case 1:
                        final pp ppVar2 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar2.V(0, true);
                                        return;
                                    case 1:
                                        ppVar2.V(1, true);
                                        return;
                                    default:
                                        ppVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final pp ppVar3 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar3.V(0, true);
                                        return;
                                    case 1:
                                        ppVar3.V(1, true);
                                        return;
                                    default:
                                        ppVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final pp ppVar4 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar4.V(0, true);
                                        return;
                                    case 1:
                                        ppVar4.V(1, true);
                                        return;
                                    default:
                                        ppVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final pp f39325b;

            {
                this.f39325b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        pp ppVar = this.f39325b;
                        if (ppVar.f40271n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        ppVar.V(i11, true);
                        return;
                    case 1:
                        final pp ppVar2 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar2.V(0, true);
                                        return;
                                    case 1:
                                        ppVar2.V(1, true);
                                        return;
                                    default:
                                        ppVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final pp ppVar3 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar3.V(0, true);
                                        return;
                                    case 1:
                                        ppVar3.V(1, true);
                                        return;
                                    default:
                                        ppVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final pp ppVar4 = this.f39325b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ppVar4.V(0, true);
                                        return;
                                    case 1:
                                        ppVar4.V(1, true);
                                        return;
                                    default:
                                        ppVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.h6.f20990d6;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f40275x;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.h6.f21079i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.h6.h0(x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.f40276y.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        V(this.f40274w, false);
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f40270f = jm0Var;
        jm0Var.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.jm0 jm0Var2 = this.f40270f;
        op opVar = new op(this, context);
        this.h = opVar;
        jm0Var2.setAdapter(opVar);
        this.f40270f.setOnItemClickListener(new i(this, 5));
        linearLayout.addView(this.f40270f, w7.z5.l(1.0f, -1, 0));
        this.f40270f.p1();
        this.actionBar.setAdaptiveBackground(this.f40270f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f40272r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f40269c)) {
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
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.h6.f20990d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f21395z6, org.telegram.ui.ActionBar.h6.f21079i6, org.telegram.ui.ActionBar.h6.f20932a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f21211p7, org.telegram.ui.ActionBar.h6.f21026f6, org.telegram.ui.ActionBar.h6.f21043g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pp.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f40269c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
