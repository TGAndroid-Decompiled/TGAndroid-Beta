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
public final class eq extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f37518a;
    public TLRPC.ChatFull f37519b;
    public long f37520c;
    public ArrayList d;
    public LinearLayout f37521e;
    public org.telegram.ui.Components.wm0 f37522f;
    public dq h;
    public org.telegram.ui.Cells.w8 f37523n;
    public ArrayList f37524r;
    public LinearLayout f37525s;
    public int v;
    public int f37526w;
    public org.telegram.ui.Cells.k6 f37527x;
    public org.telegram.ui.Cells.k6 f37528y;

    public final void V(int i10, boolean z10) {
        dq dqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f37524r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f37523n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.h6.f20596f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.h6.f20579e6;
                }
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                if (z12) {
                    this.f37523n.b(x02, z12);
                } else {
                    this.f37523n.setBackgroundColorAnimatedReverse(x02);
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
                dq dqVar2 = this.h;
                if (dqVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    dqVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                dq dqVar3 = this.h;
                if (dqVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    dqVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (dqVar = this.h) != null && z10) {
                dqVar.m(1);
            }
            dq dqVar4 = this.h;
            if (dqVar4 != null && !z10) {
                dqVar4.l();
            }
        }
    }

    public final void W() {
        this.f37521e.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f37523n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.h6.f20615g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f37520c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f37524r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f37523n = w8Var;
            w8Var.setHeight(56);
            this.f37523n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f37523n;
            if (w8Var2.f23451e.h) {
                i10 = org.telegram.ui.ActionBar.h6.f20596f6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f20579e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            this.f37523n.setTypeface(AndroidUtilities.bold());
            this.f37523n.setOnClickListener(new View.OnClickListener(this) {
                public final eq f36231b;

                {
                    this.f36231b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            eq eqVar = this.f36231b;
                            if (eqVar.f37523n.f23451e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            eqVar.V(i11, true);
                            return;
                        case 1:
                            final eq eqVar2 = this.f36231b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            eqVar2.V(0, true);
                                            return;
                                        case 1:
                                            eqVar2.V(1, true);
                                            return;
                                        default:
                                            eqVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final eq eqVar3 = this.f36231b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            eqVar3.V(0, true);
                                            return;
                                        case 1:
                                            eqVar3.V(1, true);
                                            return;
                                        default:
                                            eqVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final eq eqVar4 = this.f36231b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            eqVar4.V(0, true);
                                            return;
                                        case 1:
                                            eqVar4.V(1, true);
                                            return;
                                        default:
                                            eqVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f37523n, w7.w5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f37525s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f37527x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f37528y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f37525s.addView(m4Var, w7.w5.n(-1, -2));
        this.f37525s.addView(this.f37527x, w7.w5.n(-1, -2));
        this.f37525s.addView(this.f37528y, w7.w5.n(-1, -2));
        this.f37525s.addView(this.E, w7.w5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f37527x);
        arrayList.add(this.f37528y);
        arrayList.add(this.E);
        this.f37527x.setOnClickListener(new View.OnClickListener(this) {
            public final eq f36231b;

            {
                this.f36231b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f36231b;
                        if (eqVar.f37523n.f23451e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar2.V(0, true);
                                        return;
                                    case 1:
                                        eqVar2.V(1, true);
                                        return;
                                    default:
                                        eqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final eq eqVar3 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar3.V(0, true);
                                        return;
                                    case 1:
                                        eqVar3.V(1, true);
                                        return;
                                    default:
                                        eqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final eq eqVar4 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar4.V(0, true);
                                        return;
                                    case 1:
                                        eqVar4.V(1, true);
                                        return;
                                    default:
                                        eqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f37528y.setOnClickListener(new View.OnClickListener(this) {
            public final eq f36231b;

            {
                this.f36231b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f36231b;
                        if (eqVar.f37523n.f23451e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar2.V(0, true);
                                        return;
                                    case 1:
                                        eqVar2.V(1, true);
                                        return;
                                    default:
                                        eqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final eq eqVar3 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar3.V(0, true);
                                        return;
                                    case 1:
                                        eqVar3.V(1, true);
                                        return;
                                    default:
                                        eqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final eq eqVar4 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar4.V(0, true);
                                        return;
                                    case 1:
                                        eqVar4.V(1, true);
                                        return;
                                    default:
                                        eqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final eq f36231b;

            {
                this.f36231b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f36231b;
                        if (eqVar.f37523n.f23451e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar2.V(0, true);
                                        return;
                                    case 1:
                                        eqVar2.V(1, true);
                                        return;
                                    default:
                                        eqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final eq eqVar3 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar3.V(0, true);
                                        return;
                                    case 1:
                                        eqVar3.V(1, true);
                                        return;
                                    default:
                                        eqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final eq eqVar4 = this.f36231b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        eqVar4.V(0, true);
                                        return;
                                    case 1:
                                        eqVar4.V(1, true);
                                        return;
                                    default:
                                        eqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.h6.f20559d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f37527x;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.h6.f20650i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.h6.h0(x02, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.f37528y.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, i11, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        V(this.f37526w, false);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f37522f = wm0Var;
        wm0Var.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var2 = this.f37522f;
        dq dqVar = new dq(this, context);
        this.h = dqVar;
        wm0Var2.setAdapter(dqVar);
        this.f37522f.setOnItemClickListener(new i(this, 5));
        linearLayout.addView(this.f37522f, w7.w5.l(1.0f, -1, 0));
        this.f37522f.p1();
        this.actionBar.setAdaptiveBackground(this.f37522f);
        this.f37521e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f37521e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f37524r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f37520c)) {
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
        return w7.z5.a(new e(this, 8), org.telegram.ui.ActionBar.h6.f20559d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f20963z6, org.telegram.ui.ActionBar.h6.f20650i6, org.telegram.ui.ActionBar.h6.f20503a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f20780p7, org.telegram.ui.ActionBar.h6.f20596f6, org.telegram.ui.ActionBar.h6.f20615g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f37520c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
