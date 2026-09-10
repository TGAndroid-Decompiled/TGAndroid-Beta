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
public final class fq extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Cells.l6 E;
    public ArrayList F;
    public boolean G;
    public TLRPC.Chat f32884a;
    public TLRPC.ChatFull f32885b;
    public long f32886c;
    public ArrayList d;
    public LinearLayout e;
    public org.telegram.ui.Components.vl0 f32887f;
    public eq h;
    public org.telegram.ui.Cells.x8 f32888n;
    public ArrayList f32889r;
    public LinearLayout f32890s;
    public int v;
    public int f32891w;
    public org.telegram.ui.Cells.l6 f32892x;
    public org.telegram.ui.Cells.l6 f32893y;

    public final void V(int i10, boolean z10) {
        eq eqVar;
        boolean z11;
        boolean z12;
        int i11;
        ArrayList arrayList = this.F;
        ArrayList arrayList2 = this.f32889r;
        if (this.v != i10) {
            org.telegram.ui.Cells.x8 x8Var = this.f32888n;
            if (x8Var != null) {
                if (i10 != 1 && i10 != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                x8Var.setChecked(z12);
                if (z12) {
                    i11 = org.telegram.ui.ActionBar.j6.f17964f6;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f17946e6;
                }
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                if (z12) {
                    this.f32888n.b(w02, z12);
                } else {
                    this.f32888n.setBackgroundColorAnimatedReverse(w02);
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
                eq eqVar2 = this.h;
                if (eqVar2 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    eqVar2.s(i13, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                eq eqVar3 = this.h;
                if (eqVar3 != null && z10) {
                    if (this.G) {
                        i13 = 1;
                    }
                    eqVar3.t(i13, arrayList2.size() + 1);
                }
            }
            if (!this.G && (eqVar = this.h) != null && z10) {
                eqVar.m(1);
            }
            eq eqVar4 = this.h;
            if (eqVar4 != null && !z10) {
                eqVar4.l();
            }
        }
    }

    public final void W() {
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Cells.x8 x8Var = this.f32888n;
        if (x8Var != null) {
            x8Var.d(org.telegram.ui.ActionBar.j6.f17982g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
        }
        this.h.l();
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ArrayList arrayList = this.F;
        this.G = ChatObject.isChannelAndNotMegaGroup(this.f32886c, this.currentAccount);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 3));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f32889r.addAll(getMediaDataController().getEnabledReactionsList());
        if (this.G) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            this.f32888n = x8Var;
            x8Var.setHeight(56);
            this.f32888n.f(LocaleController.getString(R.string.EnableReactions), !this.d.isEmpty(), false);
            org.telegram.ui.Cells.x8 x8Var2 = this.f32888n;
            if (x8Var2.e.h) {
                i10 = org.telegram.ui.ActionBar.j6.f17964f6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f17946e6;
            }
            x8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            this.f32888n.setTypeface(AndroidUtilities.bold());
            this.f32888n.setOnClickListener(new View.OnClickListener(this) {
                public final fq f31756b;

                {
                    this.f31756b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i11;
                    switch (r2) {
                        case 0:
                            fq fqVar = this.f31756b;
                            if (fqVar.f32888n.e.h) {
                                i11 = 2;
                            } else {
                                i11 = 1;
                            }
                            fqVar.V(i11, true);
                            return;
                        case 1:
                            final fq fqVar2 = this.f31756b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            fqVar2.V(0, true);
                                            return;
                                        case 1:
                                            fqVar2.V(1, true);
                                            return;
                                        default:
                                            fqVar2.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        case 2:
                            final fq fqVar3 = this.f31756b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            fqVar3.V(0, true);
                                            return;
                                        case 1:
                                            fqVar3.V(1, true);
                                            return;
                                        default:
                                            fqVar3.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final fq fqVar4 = this.f31756b;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            fqVar4.V(0, true);
                                            return;
                                        case 1:
                                            fqVar4.V(1, true);
                                            return;
                                        default:
                                            fqVar4.V(2, true);
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
            linearLayout.addView(this.f32888n, w7.a6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f32890s = linearLayout2;
        linearLayout2.setOrientation(1);
        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, null);
        this.f32892x = l6Var;
        l6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, null);
        this.f32893y = l6Var2;
        l6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.l6 l6Var3 = new org.telegram.ui.Cells.l6(context, null);
        this.E = l6Var3;
        l6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f32890s.addView(m4Var, w7.a6.n(-1, -2));
        this.f32890s.addView(this.f32892x, w7.a6.n(-1, -2));
        this.f32890s.addView(this.f32893y, w7.a6.n(-1, -2));
        this.f32890s.addView(this.E, w7.a6.n(-1, -2));
        arrayList.clear();
        arrayList.add(this.f32892x);
        arrayList.add(this.f32893y);
        arrayList.add(this.E);
        this.f32892x.setOnClickListener(new View.OnClickListener(this) {
            public final fq f31756b;

            {
                this.f31756b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        fq fqVar = this.f31756b;
                        if (fqVar.f32888n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fqVar.V(i11, true);
                        return;
                    case 1:
                        final fq fqVar2 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar2.V(0, true);
                                        return;
                                    case 1:
                                        fqVar2.V(1, true);
                                        return;
                                    default:
                                        fqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final fq fqVar3 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar3.V(0, true);
                                        return;
                                    case 1:
                                        fqVar3.V(1, true);
                                        return;
                                    default:
                                        fqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final fq fqVar4 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar4.V(0, true);
                                        return;
                                    case 1:
                                        fqVar4.V(1, true);
                                        return;
                                    default:
                                        fqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f32893y.setOnClickListener(new View.OnClickListener(this) {
            public final fq f31756b;

            {
                this.f31756b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        fq fqVar = this.f31756b;
                        if (fqVar.f32888n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fqVar.V(i11, true);
                        return;
                    case 1:
                        final fq fqVar2 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar2.V(0, true);
                                        return;
                                    case 1:
                                        fqVar2.V(1, true);
                                        return;
                                    default:
                                        fqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final fq fqVar3 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar3.V(0, true);
                                        return;
                                    case 1:
                                        fqVar3.V(1, true);
                                        return;
                                    default:
                                        fqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final fq fqVar4 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar4.V(0, true);
                                        return;
                                    case 1:
                                        fqVar4.V(1, true);
                                        return;
                                    default:
                                        fqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final fq f31756b;

            {
                this.f31756b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11;
                switch (r2) {
                    case 0:
                        fq fqVar = this.f31756b;
                        if (fqVar.f32888n.e.h) {
                            i11 = 2;
                        } else {
                            i11 = 1;
                        }
                        fqVar.V(i11, true);
                        return;
                    case 1:
                        final fq fqVar2 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar2.V(0, true);
                                        return;
                                    case 1:
                                        fqVar2.V(1, true);
                                        return;
                                    default:
                                        fqVar2.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 2:
                        final fq fqVar3 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar3.V(0, true);
                                        return;
                                    case 1:
                                        fqVar3.V(1, true);
                                        return;
                                    default:
                                        fqVar3.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final fq fqVar4 = this.f31756b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        fqVar4.V(0, true);
                                        return;
                                    case 1:
                                        fqVar4.V(1, true);
                                        return;
                                    default:
                                        fqVar4.V(2, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Cells.l6 l6Var4 = this.f32892x;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.f18017i6;
        l6Var4.setBackground(org.telegram.ui.ActionBar.j6.g0(w02, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f32893y.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.E.setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        V(this.f32891w, false);
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f32887f = vl0Var;
        vl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f32887f;
        eq eqVar = new eq(this, context);
        this.h = eqVar;
        vl0Var2.setAdapter(eqVar);
        this.f32887f.setOnItemClickListener(new i(this, 4));
        linearLayout.addView(this.f32887f, w7.a6.l(1.0f, -1, 0));
        this.f32887f.o1();
        this.actionBar.setAdaptiveBackground(this.f32887f);
        this.e = linearLayout;
        this.fragmentView = linearLayout;
        W();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList = this.f32889r;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f32886c)) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 8), org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f18325z6, org.telegram.ui.ActionBar.j6.f18017i6, org.telegram.ui.ActionBar.j6.f17872a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f18144p7, org.telegram.ui.ActionBar.j6.f17964f6, org.telegram.ui.ActionBar.j6.f17982g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f32886c, this.v, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
