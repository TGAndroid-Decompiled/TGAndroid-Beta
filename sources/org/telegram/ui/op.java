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
public final class op extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 A;
    public ArrayList B;
    public boolean C;
    public TLRPC.Chat f41217a;
    public TLRPC.ChatFull f41218b;
    public long f41219c;
    public ArrayList d;
    public LinearLayout f41220e;
    public org.telegram.ui.Components.wk0 f41221f;
    public np h;
    public org.telegram.ui.Cells.t8 f41222n;
    public ArrayList f41223r;
    public LinearLayout f41224s;
    public int v;
    public int f41225w;
    public org.telegram.ui.Cells.j6 f41226x;
    public org.telegram.ui.Cells.j6 f41227y;

    public final void U(int i9, boolean z10) {
        np npVar;
        boolean z11;
        boolean z12;
        int i10;
        ArrayList arrayList = this.B;
        ArrayList arrayList2 = this.f41223r;
        if (this.v != i9) {
            org.telegram.ui.Cells.t8 t8Var = this.f41222n;
            if (t8Var != null) {
                if (i9 != 1 && i9 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                t8Var.setChecked(z12);
                if (z12) {
                    i10 = org.telegram.ui.ActionBar.f6.f23037f6;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.f23019e6;
                }
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
                if (z12) {
                    this.f41222n.b(w02, z12);
                } else {
                    this.f41222n.setBackgroundColorAnimatedReverse(w02);
                }
            }
            this.v = i9;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) arrayList.get(i11);
                if (i9 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var.a(z11, z10);
            }
            int i12 = 2;
            if (i9 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
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
                np npVar2 = this.h;
                if (npVar2 != null && z10) {
                    if (this.C) {
                        i12 = 1;
                    }
                    npVar2.s(i12, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                np npVar3 = this.h;
                if (npVar3 != null && z10) {
                    if (this.C) {
                        i12 = 1;
                    }
                    npVar3.t(i12, arrayList2.size() + 1);
                }
            }
            if (!this.C && (npVar = this.h) != null && z10) {
                npVar.m(1);
            }
            np npVar4 = this.h;
            if (npVar4 != null && !z10) {
                npVar4.l();
            }
        }
    }

    public final void V() {
        this.f41220e.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Cells.t8 t8Var = this.f41222n;
        if (t8Var != null) {
            t8Var.d(org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i9;
        ArrayList arrayList = this.B;
        this.C = ChatObject.isChannelAndNotMegaGroup(this.f41219c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f41223r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.C) {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            this.f41222n = t8Var;
            t8Var.setHeight(56);
            this.f41222n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.t8 t8Var2 = this.f41222n;
            if (t8Var2.f25711e.h) {
                i9 = org.telegram.ui.ActionBar.f6.f23037f6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23019e6;
            }
            t8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            this.f41222n.setTypeface(AndroidUtilities.bold());
            this.f41222n.setOnClickListener(new View.OnClickListener(this) {
                public final op f40203b;

                {
                    this.f40203b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i10;
                    switch (r2) {
                        case 0:
                            op opVar = this.f40203b;
                            if (opVar.f41222n.f25711e.h) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                            opVar.U(i10, true);
                            return;
                        case 1:
                            final op opVar2 = this.f40203b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            opVar2.U(0, true);
                                            return;
                                        case 1:
                                            opVar2.U(1, true);
                                            return;
                                        default:
                                            opVar2.U(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final op opVar3 = this.f40203b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            opVar3.U(0, true);
                                            return;
                                        case 1:
                                            opVar3.U(1, true);
                                            return;
                                        default:
                                            opVar3.U(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final op opVar4 = this.f40203b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            opVar4.U(0, true);
                                            return;
                                        case 1:
                                            opVar4.U(1, true);
                                            return;
                                        default:
                                            opVar4.U(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f41222n, g7.e6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f41224s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f41226x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f41227y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.A = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f41224s.addView(m4Var, g7.e6.n(-1, -2));
        this.f41224s.addView(this.f41226x, g7.e6.n(-1, -2));
        this.f41224s.addView(this.f41227y, g7.e6.n(-1, -2));
        this.f41224s.addView(this.A, g7.e6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f41226x);
        arrayList.add(this.f41227y);
        arrayList.add(this.A);
        this.f41226x.setOnClickListener(new View.OnClickListener(this) {
            public final op f40203b;

            {
                this.f40203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r2) {
                    case 0:
                        op opVar = this.f40203b;
                        if (opVar.f41222n.f25711e.h) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        opVar.U(i10, true);
                        return;
                    case 1:
                        final op opVar2 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar2.U(0, true);
                                        return;
                                    case 1:
                                        opVar2.U(1, true);
                                        return;
                                    default:
                                        opVar2.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final op opVar3 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar3.U(0, true);
                                        return;
                                    case 1:
                                        opVar3.U(1, true);
                                        return;
                                    default:
                                        opVar3.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final op opVar4 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar4.U(0, true);
                                        return;
                                    case 1:
                                        opVar4.U(1, true);
                                        return;
                                    default:
                                        opVar4.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f41227y.setOnClickListener(new View.OnClickListener(this) {
            public final op f40203b;

            {
                this.f40203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r2) {
                    case 0:
                        op opVar = this.f40203b;
                        if (opVar.f41222n.f25711e.h) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        opVar.U(i10, true);
                        return;
                    case 1:
                        final op opVar2 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar2.U(0, true);
                                        return;
                                    case 1:
                                        opVar2.U(1, true);
                                        return;
                                    default:
                                        opVar2.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final op opVar3 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar3.U(0, true);
                                        return;
                                    case 1:
                                        opVar3.U(1, true);
                                        return;
                                    default:
                                        opVar3.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final op opVar4 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar4.U(0, true);
                                        return;
                                    case 1:
                                        opVar4.U(1, true);
                                        return;
                                    default:
                                        opVar4.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final op f40203b;

            {
                this.f40203b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r2) {
                    case 0:
                        op opVar = this.f40203b;
                        if (opVar.f41222n.f25711e.h) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        opVar.U(i10, true);
                        return;
                    case 1:
                        final op opVar2 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar2.U(0, true);
                                        return;
                                    case 1:
                                        opVar2.U(1, true);
                                        return;
                                    default:
                                        opVar2.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final op opVar3 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar3.U(0, true);
                                        return;
                                    case 1:
                                        opVar3.U(1, true);
                                        return;
                                    default:
                                        opVar3.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final op opVar4 = this.f40203b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        opVar4.U(0, true);
                                        return;
                                    case 1:
                                        opVar4.U(1, true);
                                        return;
                                    default:
                                        opVar4.U(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f41226x;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.f6.g0(w02, org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        this.f41227y.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        this.A.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        U(this.f41225w, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f41221f = wk0Var;
        wk0Var.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.f41221f;
        np npVar = new np(this, context);
        this.h = npVar;
        wk0Var2.setAdapter(npVar);
        this.f41221f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f41221f, g7.e6.l(1.0f, -1, 0));
        this.f41221f.p1();
        this.actionBar.setAdaptiveBackground(this.f41221f);
        this.f41220e = linearLayout;
        this.fragmentView = linearLayout;
        V();
        return this.f41220e;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList = this.f41223r;
        if (i10 == this.currentAccount) {
            if (i9 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i9 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f41219c)) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 8), org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.f23386z6, org.telegram.ui.ActionBar.f6.f23092i6, org.telegram.ui.ActionBar.f6.f22947a7, org.telegram.ui.ActionBar.f6.B6, org.telegram.ui.ActionBar.f6.f23212p7, org.telegram.ui.ActionBar.f6.f23037f6, org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.op.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f41219c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
