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
public final class eq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.j6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f36137a;
    public TLRPC.ChatFull f36138b;
    public long f36139c;
    public ArrayList d;
    public LinearLayout f36140e;
    public org.telegram.ui.Components.ll0 f36141f;
    public dq h;
    public org.telegram.ui.Cells.w8 f36142n;
    public ArrayList f36143r;
    public LinearLayout f36144s;
    public int v;
    public int f36145w;
    public org.telegram.ui.Cells.j6 f36146x;
    public org.telegram.ui.Cells.j6 f36147y;

    public final void V(int i10, boolean z10) {
        dq dqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f36143r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f36142n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.j6.f20700f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f20683e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z12) {
                    this.f36142n.b(w02, z12);
                } else {
                    this.f36142n.setBackgroundColorAnimatedReverse(w02);
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
        this.f36140e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f36142n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.j6.f20718g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f36139c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f36143r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f36142n = w8Var;
            w8Var.setHeight(56);
            this.f36142n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f36142n;
            if (w8Var2.f23490e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f20700f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20683e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f36142n.setTypeface(AndroidUtilities.bold());
            this.f36142n.setOnClickListener(new View.OnClickListener(this) {
                public final eq f34856b;

                {
                    this.f34856b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            eq eqVar = this.f34856b;
                            if (eqVar.f36142n.f23490e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            eqVar.V(i11, true);
                            return;
                        case 1:
                            final eq eqVar2 = this.f34856b;
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
                            final eq eqVar3 = this.f34856b;
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
                            final eq eqVar4 = this.f34856b;
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
            linearLayout.addView(this.f36142n, w7.x5.n(-1, -2));
        }
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f36144s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.f36146x = j6Var;
        j6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, null);
        this.f36147y = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.j6 j6Var3 = new org.telegram.ui.Cells.j6(context, null);
        this.E = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f36144s.addView(l4Var, w7.x5.n(-1, -2));
        this.f36144s.addView(this.f36146x, w7.x5.n(-1, -2));
        this.f36144s.addView(this.f36147y, w7.x5.n(-1, -2));
        this.f36144s.addView(this.E, w7.x5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f36146x);
        arrayList.add(this.f36147y);
        arrayList.add(this.E);
        this.f36146x.setOnClickListener(new View.OnClickListener(this) {
            public final eq f34856b;

            {
                this.f34856b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f34856b;
                        if (eqVar.f36142n.f23490e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f34856b;
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
                        final eq eqVar3 = this.f34856b;
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
                        final eq eqVar4 = this.f34856b;
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
        this.f36147y.setOnClickListener(new View.OnClickListener(this) {
            public final eq f34856b;

            {
                this.f34856b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f34856b;
                        if (eqVar.f36142n.f23490e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f34856b;
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
                        final eq eqVar3 = this.f34856b;
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
                        final eq eqVar4 = this.f34856b;
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
            public final eq f34856b;

            {
                this.f34856b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        eq eqVar = this.f34856b;
                        if (eqVar.f36142n.f23490e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        eqVar.V(i11, true);
                        return;
                    case 1:
                        final eq eqVar2 = this.f34856b;
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
                        final eq eqVar3 = this.f34856b;
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
                        final eq eqVar4 = this.f34856b;
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
        int i11 = org.telegram.ui.ActionBar.j6.f20663d6;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.j6 j6Var4 = this.f36146x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f20753i6;
        j6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f36147y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f36145w, false);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f36141f = ll0Var;
        ll0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f36141f;
        dq dqVar = new dq(this, context);
        this.h = dqVar;
        ll0Var2.setAdapter(dqVar);
        this.f36141f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f36141f, w7.x5.l(1.0f, -1, 0));
        this.f36141f.o1();
        this.actionBar.setAdaptiveBackground(this.f36141f);
        this.f36140e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.f36140e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f36143r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f36139c)) {
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
        return w7.a6.a(new e(this, 8), org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f21061z6, org.telegram.ui.ActionBar.j6.f20753i6, org.telegram.ui.ActionBar.j6.f20607a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20880p7, org.telegram.ui.ActionBar.j6.f20700f6, org.telegram.ui.ActionBar.j6.f20718g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f36139c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
