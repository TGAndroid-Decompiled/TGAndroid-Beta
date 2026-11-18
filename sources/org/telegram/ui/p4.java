package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p4 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public o4 f50718a;
    public o4 f50719b;
    public o4 f50720c;
    public o4 d;
    public o4 f50721e;
    public LinearLayout f50722f;
    public final ArrayList h;
    public int f50723n;
    public org.telegram.ui.Components.tm0 f50724r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f50723n = 0;
    }

    public final int Z() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30822b.f33093f) {
                    return ((o4) arrayList.get(i7)).f50460e;
                }
                i7++;
            } else {
                return this.f50723n;
            }
        }
    }

    public final void a0(int i7, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.lr.f37208f);
        TransitionManager.beginDelayedTransition(this.f50722f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f50460e == i7) {
                    b0((View) arrayList.get(i10), z10);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f50722f.removeView((View) arrayList.get(i11));
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11++;
                }
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (i7 < ((o4) arrayList.get(i12)).f50460e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
                i6Var.d = true;
                i6Var.f50460e = i7;
                i6Var.c(org.telegram.messenger.gd.a0("AutoDeleteAfterShort", null, 2131753870, org.telegram.messenger.gd.c0(i7 * 60)), false, true);
                arrayList.add(size, i6Var);
                this.f50722f.addView((View) i6Var, size);
                c0();
                b0(i6Var, z10);
                return;
            }
        }
    }

    public final void b0(View view, boolean z10) {
        int i7;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == view) {
                ((o4) arrayList.get(i10)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i10)).a(false, this.fragmentBeginToShow);
            }
            i10++;
        }
        if (z10 && (i7 = ((o4) view).f50460e) > 0) {
            org.telegram.messenger.n10.u(org.telegram.messenger.gd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753855, org.telegram.messenger.gd.c0(i7 * 60)), org.telegram.ui.Components.lc.b0(this), 2131624021, 36);
        }
    }

    public final void c0() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                int i10 = org.telegram.ui.ActionBar.n6.f29396d6;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
                org.telegram.ui.ActionBar.u6.Q((View) arrayList.get(i7), org.telegram.ui.ActionBar.n6.i0(x02, org.telegram.ui.ActionBar.n6.x0(null, i11, false)), org.telegram.ui.ActionBar.u6.M(i10), org.telegram.ui.ActionBar.u6.M(i11), null);
                ((o4) arrayList.get(i7)).setOnClickListener(new a(this, 3));
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753848, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(getParentActivity());
        org.telegram.ui.Components.tm0 tm0Var = new org.telegram.ui.Components.tm0(getParentActivity(), sm0Var, this.resourceProvider, true);
        this.f50724r = tm0Var;
        tm0Var.setDrawBackground(true);
        this.f50724r.setOverScrollMode(0);
        sm0Var.setOrientation(1);
        this.f50724r.addView(sm0Var);
        frameLayout.addView(this.f50724r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, this.currentAccount);
        lv0Var.setStickerNum(10);
        frameLayout2.addView(lv0Var, c8.ma.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        sm0Var.addView(frameLayout2, c8.ma.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f50722f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, this.f50722f, null);
        sm0Var.addView(this.f50722f, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.gd.M0(2131748395, null));
        this.f50722f.addView(n4Var);
        ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f50718a = i6Var;
        i6Var.c(org.telegram.messenger.gd.M0(2131745166, null), false, true);
        o4 o4Var = this.f50718a;
        o4Var.f50460e = 0;
        this.f50722f.addView(o4Var);
        ?? i6Var2 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f50719b = i6Var2;
        i6Var2.c(org.telegram.messenger.gd.M0(2131753873, null), false, true);
        o4 o4Var2 = this.f50719b;
        o4Var2.f50460e = 1440;
        this.f50722f.addView(o4Var2);
        ?? i6Var3 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f50720c = i6Var3;
        i6Var3.c(org.telegram.messenger.gd.M0(2131753871, null), false, true);
        o4 o4Var3 = this.f50720c;
        o4Var3.f50460e = 10080;
        this.f50722f.addView(o4Var3);
        ?? i6Var4 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.d = i6Var4;
        i6Var4.c(org.telegram.messenger.gd.M0(2131753872, null), false, true);
        o4 o4Var4 = this.d;
        o4Var4.f50460e = 44640;
        this.f50722f.addView(o4Var4);
        ?? i6Var5 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f50721e = i6Var5;
        i6Var5.c(org.telegram.messenger.gd.M0(2131745339, null), false, false);
        this.f50721e.f30822b.setVisibility(8);
        this.f50722f.addView(this.f50721e);
        o4 o4Var5 = this.f50718a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f50719b);
        arrayList.add(this.f50720c);
        arrayList.add(this.d);
        arrayList.add(this.f50721e);
        c0();
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        z8Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131749361, null), new m4(this, 0)));
        sm0Var.addView(z8Var, c8.ma.o(-1, -2));
        a0(this.f50723n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tm0 getScrollViewForSimpleGlass() {
        return this.f50724r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = getUserConfig().f24796q0;
        this.f50723n = i7;
        if (i7 < 0) {
            this.f50723n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25205u5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25205u5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30822b.f33093f) {
                    if (((o4) arrayList.get(i7)).f50460e != this.f50723n) {
                        this.f50723n = ((o4) arrayList.get(i7)).f50460e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i7)).f50460e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f24796q0 = this.f50723n;
                        org.telegram.messenger.ks.f(this.currentAccount).k(org.telegram.messenger.ks.f25205u5, new Object[0]);
                        return;
                    }
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }
}
