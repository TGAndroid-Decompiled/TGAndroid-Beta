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
public final class aq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f34875a;
    public TLRPC.ChatFull f34876b;
    public long f34877c;
    public ArrayList d;
    public LinearLayout f34878e;
    public org.telegram.ui.Components.zl0 f34879f;
    public zp h;
    public org.telegram.ui.Cells.w8 f34880n;
    public ArrayList f34881r;
    public LinearLayout f34882s;
    public int v;
    public int f34883w;
    public org.telegram.ui.Cells.k6 f34884x;
    public org.telegram.ui.Cells.k6 f34885y;

    public final void T(int i10, boolean z10) {
        zp zpVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f34881r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f34880n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.i6.f20855f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.i6.f20838e6;
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
                if (z12) {
                    this.f34880n.b(w02, z12);
                } else {
                    this.f34880n.setBackgroundColorAnimatedReverse(w02);
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
                zp zpVar2 = this.h;
                if (zpVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    zpVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                zp zpVar3 = this.h;
                if (zpVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    zpVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (zpVar = this.h) != null && z10) {
                zpVar.m(1);
            }
            zp zpVar4 = this.h;
            if (zpVar4 != null && !z10) {
                zpVar4.l();
            }
        }
    }

    public final void U() {
        this.f34878e.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f34880n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.i6.f20873g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f34877c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f34881r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f34880n = w8Var;
            w8Var.setHeight(56);
            this.f34880n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f34880n;
            if (w8Var2.f23692e.h) {
                i10 = org.telegram.ui.ActionBar.i6.f20855f6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f20838e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            this.f34880n.setTypeface(AndroidUtilities.bold());
            this.f34880n.setOnClickListener(new View.OnClickListener(this) {
                public final aq f42920b;

                {
                    this.f42920b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            aq aqVar = this.f42920b;
                            if (aqVar.f34880n.f23692e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            aqVar.T(i11, true);
                            return;
                        case 1:
                            final aq aqVar2 = this.f42920b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            aqVar2.T(0, true);
                                            return;
                                        case 1:
                                            aqVar2.T(1, true);
                                            return;
                                        default:
                                            aqVar2.T(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final aq aqVar3 = this.f42920b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            aqVar3.T(0, true);
                                            return;
                                        case 1:
                                            aqVar3.T(1, true);
                                            return;
                                        default:
                                            aqVar3.T(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final aq aqVar4 = this.f42920b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            aqVar4.T(0, true);
                                            return;
                                        case 1:
                                            aqVar4.T(1, true);
                                            return;
                                        default:
                                            aqVar4.T(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f34880n, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34882s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f34884x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f34885y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f34882s.addView(m4Var, w7.z5.n(-1, -2));
        this.f34882s.addView(this.f34884x, w7.z5.n(-1, -2));
        this.f34882s.addView(this.f34885y, w7.z5.n(-1, -2));
        this.f34882s.addView(this.E, w7.z5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f34884x);
        arrayList.add(this.f34885y);
        arrayList.add(this.E);
        this.f34884x.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42920b;

            {
                this.f42920b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        aq aqVar = this.f42920b;
                        if (aqVar.f34880n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        aqVar.T(i11, true);
                        return;
                    case 1:
                        final aq aqVar2 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(0, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final aq aqVar3 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(0, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar4 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar4.T(0, true);
                                        return;
                                    case 1:
                                        aqVar4.T(1, true);
                                        return;
                                    default:
                                        aqVar4.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f34885y.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42920b;

            {
                this.f42920b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        aq aqVar = this.f42920b;
                        if (aqVar.f34880n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        aqVar.T(i11, true);
                        return;
                    case 1:
                        final aq aqVar2 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(0, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final aq aqVar3 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(0, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar4 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar4.T(0, true);
                                        return;
                                    case 1:
                                        aqVar4.T(1, true);
                                        return;
                                    default:
                                        aqVar4.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42920b;

            {
                this.f42920b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        aq aqVar = this.f42920b;
                        if (aqVar.f34880n.f23692e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        aqVar.T(i11, true);
                        return;
                    case 1:
                        final aq aqVar2 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(0, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final aq aqVar3 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(0, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar4 = this.f42920b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar4.T(0, true);
                                        return;
                                    case 1:
                                        aqVar4.T(1, true);
                                        return;
                                    default:
                                        aqVar4.T(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.i6.f20818d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f34884x;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.i6.f20909i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.i6.g0(w02, org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        this.f34885y.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i12, false)));
        T(this.f34883w, false);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f34879f = zl0Var;
        zl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f34879f;
        zp zpVar = new zp(this, context);
        this.h = zpVar;
        zl0Var2.setAdapter(zpVar);
        this.f34879f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f34879f, w7.z5.l(1.0f, -1, 0));
        this.f34879f.s1();
        this.actionBar.setAdaptiveBackground(this.f34879f);
        this.f34878e = linearLayout;
        this.fragmentView = linearLayout;
        U();
        return this.f34878e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f34881r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f34877c)) {
                org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                if (c5Var != null && c5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.i6.f20818d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21224z6, org.telegram.ui.ActionBar.i6.f20909i6, org.telegram.ui.ActionBar.i6.f20762a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21040p7, org.telegram.ui.ActionBar.i6.f20855f6, org.telegram.ui.ActionBar.i6.f20873g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f34877c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
