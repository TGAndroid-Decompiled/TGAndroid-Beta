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
public final class hq extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.k6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f36623a;
    public TLRPC.ChatFull f36624b;
    public long f36625c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.mm0 f36626f;
    public gq h;
    public org.telegram.ui.Cells.w8 f36627n;
    public ArrayList f36628r;
    public LinearLayout f36629s;
    public int v;
    public int f36630w;
    public org.telegram.ui.Cells.k6 f36631x;
    public org.telegram.ui.Cells.k6 f36632y;

    public final void V(int i10, boolean z10) {
        gq gqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f36628r;
        if (this.v != i10) {
            org.telegram.ui.Cells.w8 w8Var = this.f36627n;
            if (w8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                w8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.g6.f19637f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.g6.f19618e6;
                }
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
                if (z12) {
                    this.f36627n.b(x02, z12);
                } else {
                    this.f36627n.setBackgroundColorAnimatedReverse(x02);
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
                gq gqVar2 = this.h;
                if (gqVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    gqVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                gq gqVar3 = this.h;
                if (gqVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    gqVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (gqVar = this.h) != null && z10) {
                gqVar.m(1);
            }
            gq gqVar4 = this.h;
            if (gqVar4 != null && !z10) {
                gqVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        org.telegram.ui.Cells.w8 w8Var = this.f36627n;
        if (w8Var != null) {
            w8Var.d(org.telegram.ui.ActionBar.g6.f19654g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f36625c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 5));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f36628r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.f36627n = w8Var;
            w8Var.setHeight(56);
            this.f36627n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.w8 w8Var2 = this.f36627n;
            if (w8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.g6.f19637f6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f19618e6;
            }
            w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            this.f36627n.setTypeface(AndroidUtilities.bold());
            this.f36627n.setOnClickListener(new View.OnClickListener(this) {
                public final hq f35346b;

                {
                    this.f35346b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            hq hqVar = this.f35346b;
                            if (hqVar.f36627n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            hqVar.V(i11, true);
                            return;
                        case 1:
                            final hq hqVar2 = this.f35346b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            hqVar2.V(0, true);
                                            return;
                                        case 1:
                                            hqVar2.V(1, true);
                                            return;
                                        default:
                                            hqVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final hq hqVar3 = this.f35346b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            hqVar3.V(0, true);
                                            return;
                                        case 1:
                                            hqVar3.V(1, true);
                                            return;
                                        default:
                                            hqVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final hq hqVar4 = this.f35346b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            hqVar4.V(0, true);
                                            return;
                                        case 1:
                                            hqVar4.V(1, true);
                                            return;
                                        default:
                                            hqVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f36627n, w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f36629s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f36631x = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f36632y = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.E = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f36629s.addView(m4Var, w7.z5.n(-1, -2));
        this.f36629s.addView(this.f36631x, w7.z5.n(-1, -2));
        this.f36629s.addView(this.f36632y, w7.z5.n(-1, -2));
        this.f36629s.addView(this.E, w7.z5.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f36631x);
        arrayList.add(this.f36632y);
        arrayList.add(this.E);
        this.f36631x.setOnClickListener(new View.OnClickListener(this) {
            public final hq f35346b;

            {
                this.f35346b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        hq hqVar = this.f35346b;
                        if (hqVar.f36627n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        hqVar.V(i11, true);
                        return;
                    case 1:
                        final hq hqVar2 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar2.V(0, true);
                                        return;
                                    case 1:
                                        hqVar2.V(1, true);
                                        return;
                                    default:
                                        hqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final hq hqVar3 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar3.V(0, true);
                                        return;
                                    case 1:
                                        hqVar3.V(1, true);
                                        return;
                                    default:
                                        hqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final hq hqVar4 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar4.V(0, true);
                                        return;
                                    case 1:
                                        hqVar4.V(1, true);
                                        return;
                                    default:
                                        hqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f36632y.setOnClickListener(new View.OnClickListener(this) {
            public final hq f35346b;

            {
                this.f35346b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        hq hqVar = this.f35346b;
                        if (hqVar.f36627n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        hqVar.V(i11, true);
                        return;
                    case 1:
                        final hq hqVar2 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar2.V(0, true);
                                        return;
                                    case 1:
                                        hqVar2.V(1, true);
                                        return;
                                    default:
                                        hqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final hq hqVar3 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar3.V(0, true);
                                        return;
                                    case 1:
                                        hqVar3.V(1, true);
                                        return;
                                    default:
                                        hqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final hq hqVar4 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar4.V(0, true);
                                        return;
                                    case 1:
                                        hqVar4.V(1, true);
                                        return;
                                    default:
                                        hqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final hq f35346b;

            {
                this.f35346b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        hq hqVar = this.f35346b;
                        if (hqVar.f36627n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        hqVar.V(i11, true);
                        return;
                    case 1:
                        final hq hqVar2 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar2.V(0, true);
                                        return;
                                    case 1:
                                        hqVar2.V(1, true);
                                        return;
                                    default:
                                        hqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final hq hqVar3 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar3.V(0, true);
                                        return;
                                    case 1:
                                        hqVar3.V(1, true);
                                        return;
                                    default:
                                        hqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final hq hqVar4 = this.f35346b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        hqVar4.V(0, true);
                                        return;
                                    case 1:
                                        hqVar4.V(1, true);
                                        return;
                                    default:
                                        hqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        org.telegram.ui.Cells.k6 k6Var4 = this.f36631x;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.f19690i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.g6.h0(x02, org.telegram.ui.ActionBar.g6.x0(null, i12, false)));
        this.f36632y.setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.x0(null, i11, false), org.telegram.ui.ActionBar.g6.x0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.g6.h0(org.telegram.ui.ActionBar.g6.x0(null, i11, false), org.telegram.ui.ActionBar.g6.x0(null, i12, false)));
        V(this.f36630w, false);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36626f = mm0Var;
        mm0Var.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f36626f;
        gq gqVar = new gq(this, context);
        this.h = gqVar;
        mm0Var2.setAdapter(gqVar);
        this.f36626f.setOnItemClickListener(new i(this, 5));
        linearLayout.addView(this.f36626f, w7.z5.l(1.0f, -1, 0));
        this.f36626f.p1();
        this.actionBar.setAdaptiveBackground(this.f36626f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f36628r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f36625c)) {
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
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.g6.f19601d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f20005z6, org.telegram.ui.ActionBar.g6.f19690i6, org.telegram.ui.ActionBar.g6.f19543a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f19822p7, org.telegram.ui.ActionBar.g6.f19637f6, org.telegram.ui.ActionBar.g6.f19654g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f36625c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
