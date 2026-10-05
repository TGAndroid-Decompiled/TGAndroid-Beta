package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aq extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public TLRPC.Chat f34931a;
    public TLRPC.ChatFull f34932b;
    public final long f34933c;
    public ArrayList d;
    public FrameLayout f34934e;
    public org.telegram.ui.Components.zl0 f34935f;
    public zp h;
    public final ArrayList f34936n;
    public LinearLayout f34937r;
    public int f34938s;
    public int v;
    public org.telegram.ui.Cells.k6 f34939w;
    public org.telegram.ui.Cells.k6 f34940x;
    public org.telegram.ui.Cells.k6 f34941y;

    public aq(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.f34936n = new ArrayList();
        this.f34938s = -1;
        this.E = new ArrayList();
        this.f34933c = bundle.getLong("chat_id", 0L);
    }

    public final void T(int i10, boolean z10) {
        if (this.f34938s != i10) {
            this.f34938s = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.E;
                boolean z11 = true;
                if (i11 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) arrayList.get(i11);
                if (i10 != i11) {
                    z11 = false;
                }
                k6Var.a(z11, z10);
                i11++;
            }
            ArrayList arrayList2 = this.f34936n;
            if (i10 == 1) {
                if (z10) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
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
                zp zpVar = this.h;
                if (zpVar != null && z10) {
                    zpVar.s(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                zp zpVar2 = this.h;
                if (zpVar2 != null && z10) {
                    zpVar2.t(2, arrayList2.size() + 1);
                }
            }
            zp zpVar3 = this.h;
            if (zpVar3 != null && z10) {
                zpVar3.m(1);
            }
            zp zpVar4 = this.h;
            if (zpVar4 != null && !z10) {
                zpVar4.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34936n.addAll(getMediaDataController().getEnabledReactionsList());
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34937r = linearLayout;
        linearLayout.setOrientation(1);
        this.f34937r.setClickable(true);
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.f34939w = k6Var;
        k6Var.c(LocaleController.getString(R.string.AllReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, null);
        this.f34940x = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.SomeReactions), false, true);
        org.telegram.ui.Cells.k6 k6Var3 = new org.telegram.ui.Cells.k6(context, null);
        this.f34941y = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.NoReactions), false, false);
        this.f34937r.addView(m4Var, w7.z5.n(-1, -2));
        this.f34937r.addView(this.f34939w, w7.z5.n(-1, -2));
        this.f34937r.addView(this.f34940x, w7.z5.n(-1, -2));
        this.f34937r.addView(this.f34941y, w7.z5.n(-1, -2));
        ArrayList arrayList = this.E;
        arrayList.clear();
        arrayList.add(this.f34939w);
        arrayList.add(this.f34940x);
        arrayList.add(this.f34941y);
        this.f34939w.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42989b;

            {
                this.f42989b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final aq aqVar = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar.T(2, true);
                                        return;
                                    case 1:
                                        aqVar.T(1, true);
                                        return;
                                    default:
                                        aqVar.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final aq aqVar2 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar3 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f34940x.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42989b;

            {
                this.f42989b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final aq aqVar = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar.T(2, true);
                                        return;
                                    case 1:
                                        aqVar.T(1, true);
                                        return;
                                    default:
                                        aqVar.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final aq aqVar2 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar3 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.f34941y.setOnClickListener(new View.OnClickListener(this) {
            public final aq f42989b;

            {
                this.f42989b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        final aq aqVar = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar.T(2, true);
                                        return;
                                    case 1:
                                        aqVar.T(1, true);
                                        return;
                                    default:
                                        aqVar.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        final aq aqVar2 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar2.T(2, true);
                                        return;
                                    case 1:
                                        aqVar2.T(1, true);
                                        return;
                                    default:
                                        aqVar2.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final aq aqVar3 = this.f42989b;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        aqVar3.T(2, true);
                                        return;
                                    case 1:
                                        aqVar3.T(1, true);
                                        return;
                                    default:
                                        aqVar3.T(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        org.telegram.ui.Cells.k6 k6Var4 = this.f34939w;
        int i10 = org.telegram.ui.ActionBar.i6.f20827d6;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.i6.f20918i6;
        k6Var4.setBackground(org.telegram.ui.ActionBar.i6.g0(w02, org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        this.f34940x.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        this.f34941y.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false)));
        T(this.v, false);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f34935f = zl0Var;
        zl0Var.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f34935f;
        zp zpVar = new zp(this, context);
        this.h = zpVar;
        zl0Var2.setAdapter(zpVar);
        this.f34935f.setOnItemClickListener(new i(this, 4));
        frameLayout.addView(this.f34935f, w7.z5.g());
        this.f34935f.r1();
        this.f34935f.setSectionsDrawBackground(true);
        this.f34934e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.l();
        return this.f34934e;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                ArrayList arrayList = this.f34936n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().getEnabledReactionsList());
                this.h.l();
            } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f34933c)) {
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
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f34935f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 8), org.telegram.ui.ActionBar.i6.f20827d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21233z6, org.telegram.ui.ActionBar.i6.f20918i6, org.telegram.ui.ActionBar.i6.f20771a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21049p7, org.telegram.ui.ActionBar.i6.f20864f6, org.telegram.ui.ActionBar.i6.f20882g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.aq.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getMessagesController().setChatReactions(this.f34933c, this.f34938s, this.d);
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }
}
