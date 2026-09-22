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
public final class dq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f33059a;
    public TLRPC.ChatFull f33060b;
    public long f33061c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.ll0 f33062f;
    public cq h;
    public org.telegram.ui.Cells.w8 f33063n;
    public ArrayList f33064r;
    public LinearLayout f33065s;
    public int v;
    public int f33066w;
    public org.telegram.ui.Cells.k6 f33067x;
    public org.telegram.ui.Cells.k6 f33068y;

    public final void V(int i10, boolean z10) {
        cq cqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f33064r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f33063n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.i6.f18870f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.i6.f18853e6;
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
                if (z12) {
                    this.f33063n.b(w02, z12);
                } else {
                    this.f33063n.setBackgroundColorAnimatedReverse(w02);
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
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f33063n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.i6.f18888g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f33061c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f33064r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f33063n = w8Var;
            w8Var.setHeight(56);
            this.f33063n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f33063n;
            if (w8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.i6.f18870f6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f18853e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            this.f33063n.setTypeface(AndroidUtilities.bold());
            this.f33063n.setOnClickListener(new View.OnClickListener(this) {
                public final dq f31869b;

                {
                    this.f31869b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            dq dqVar = this.f31869b;
                            if (dqVar.f33063n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            dqVar.V(i11, true);
                            return;
                        case 1:
                            final dq dqVar2 = this.f31869b;
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
                            final dq dqVar3 = this.f31869b;
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
                            final dq dqVar4 = this.f31869b;
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
            linearLayout.addView(this.f33063n, w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33065s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f33067x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f33068y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f33065s.addView(m4Var, w7.x5.n(-1, -2));
        this.f33065s.addView(this.f33067x, w7.x5.n(-1, -2));
        this.f33065s.addView(this.f33068y, w7.x5.n(-1, -2));
        this.f33065s.addView(this.E, w7.x5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f33067x);
        arrayList.add(this.f33068y);
        arrayList.add(this.E);
        this.f33067x.setOnClickListener(new View.OnClickListener(this) {
            public final dq f31869b;

            {
                this.f31869b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31869b;
                        if (dqVar.f33063n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31869b;
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
                        final dq dqVar3 = this.f31869b;
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
                        final dq dqVar4 = this.f31869b;
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
        this.f33068y.setOnClickListener(new View.OnClickListener(this) {
            public final dq f31869b;

            {
                this.f31869b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31869b;
                        if (dqVar.f33063n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31869b;
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
                        final dq dqVar3 = this.f31869b;
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
                        final dq dqVar4 = this.f31869b;
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
            public final dq f31869b;

            {
                this.f31869b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        dq dqVar = this.f31869b;
                        if (dqVar.f33063n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        dqVar.V(i11, true);
                        return;
                    case 1:
                        final dq dqVar2 = this.f31869b;
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
                        final dq dqVar3 = this.f31869b;
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
                        final dq dqVar4 = this.f31869b;
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
        int i11 = org.telegram.ui.ActionBar.i6.f18834d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f33067x;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.f18923i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.i6.g0(w02, org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        this.f33068y.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        V(this.f33066w, false);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f33062f = ll0Var;
        ll0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f33062f;
        cq cqVar = new cq(this, context);
        this.h = cqVar;
        ll0Var2.setAdapter(cqVar);
        this.f33062f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f33062f, w7.x5.l(1.0f, -1, 0));
        this.f33062f.p1();
        this.actionBar.setAdaptiveBackground(this.f33062f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f33064r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f33061c)) {
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
        return w7.a6.a(new e(this, 8), org.telegram.ui.ActionBar.i6.f18834d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f19234z6, org.telegram.ui.ActionBar.i6.f18923i6, org.telegram.ui.ActionBar.i6.f18778a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f19053p7, org.telegram.ui.ActionBar.i6.f18870f6, org.telegram.ui.ActionBar.i6.f18888g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f33061c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
