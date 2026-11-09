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
public final class p4 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public o4 f48611a;
    public o4 f48612b;
    public o4 f48613c;
    public o4 d;
    public o4 f48614e;
    public LinearLayout f48615f;
    public final ArrayList h;
    public int f48616n;
    public org.telegram.ui.Components.im0 f48617r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f48616n = 0;
    }

    public final int Z() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f29315b.f31522f) {
                    return ((o4) arrayList.get(i7)).f48334e;
                }
                i7++;
            } else {
                return this.f48616n;
            }
        }
    }

    public final void a0(int i7, boolean z9) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f40458f);
        TransitionManager.beginDelayedTransition(this.f48615f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f48334e == i7) {
                    b0((View) arrayList.get(i10), z9);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f48615f.removeView((View) arrayList.get(i11));
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
                    } else if (i7 < ((o4) arrayList.get(i12)).f48334e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
                i6Var.d = true;
                i6Var.f48334e = i7;
                i6Var.c(org.telegram.messenger.id.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.id.c0(i7 * 60)), false, true);
                arrayList.add(size, i6Var);
                this.f48615f.addView((View) i6Var, size);
                c0();
                b0(i6Var, z9);
                return;
            }
        }
    }

    public final void b0(View view, boolean z9) {
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
        if (z9 && (i7 = ((o4) view).f48334e) > 0) {
            org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.id.c0(i7 * 60)), org.telegram.ui.Components.hc.a0(this), 2131624020, 36);
        }
    }

    public final void c0() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
                org.telegram.ui.ActionBar.s6.Q((View) arrayList.get(i7), org.telegram.ui.ActionBar.l6.i0(x02, org.telegram.ui.ActionBar.l6.x0(null, i11, false)), org.telegram.ui.ActionBar.s6.M(i10), org.telegram.ui.ActionBar.s6.M(i11), null);
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
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(getParentActivity());
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(getParentActivity(), hm0Var, this.resourceProvider, true);
        this.f48617r = im0Var;
        im0Var.setDrawBackground(true);
        this.f48617r.setOverScrollMode(0);
        hm0Var.setOrientation(1);
        this.f48617r.addView(hm0Var);
        frameLayout.addView(this.f48617r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, this.currentAccount);
        dv0Var.setStickerNum(10);
        frameLayout2.addView(dv0Var, c8.ha.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        hm0Var.addView(frameLayout2, c8.ha.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f48615f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, this.f48615f, null);
        hm0Var.addView(this.f48615f, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.id.M0(2131748587, null));
        this.f48615f.addView(n4Var);
        ?? i6Var = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f48611a = i6Var;
        i6Var.c(org.telegram.messenger.id.M0(2131745361, null), false, true);
        o4 o4Var = this.f48611a;
        o4Var.f48334e = 0;
        this.f48615f.addView(o4Var);
        ?? i6Var2 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f48612b = i6Var2;
        i6Var2.c(org.telegram.messenger.id.M0(2131753875, null), false, true);
        o4 o4Var2 = this.f48612b;
        o4Var2.f48334e = 1440;
        this.f48615f.addView(o4Var2);
        ?? i6Var3 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f48613c = i6Var3;
        i6Var3.c(org.telegram.messenger.id.M0(2131753873, null), false, true);
        o4 o4Var3 = this.f48613c;
        o4Var3.f48334e = 10080;
        this.f48615f.addView(o4Var3);
        ?? i6Var4 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.d = i6Var4;
        i6Var4.c(org.telegram.messenger.id.M0(2131753874, null), false, true);
        o4 o4Var4 = this.d;
        o4Var4.f48334e = 44640;
        this.f48615f.addView(o4Var4);
        ?? i6Var5 = new org.telegram.ui.Cells.i6(getParentActivity(), null);
        this.f48614e = i6Var5;
        i6Var5.c(org.telegram.messenger.id.M0(2131745534, null), false, false);
        this.f48614e.f29315b.setVisibility(8);
        this.f48615f.addView(this.f48614e);
        o4 o4Var5 = this.f48611a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f48612b);
        arrayList.add(this.f48613c);
        arrayList.add(this.d);
        arrayList.add(this.f48614e);
        c0();
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        z8Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131749536, null), new m4(this, 0)));
        hm0Var.addView(z8Var, c8.ha.o(-1, -2));
        a0(this.f48616n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.im0 getScrollViewForSimpleGlass() {
        return this.f48617r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = getUserConfig().f24492p0;
        this.f48616n = i7;
        if (i7 < 0) {
            this.f48616n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.qs.s5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.s5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f29315b.f31522f) {
                    if (((o4) arrayList.get(i7)).f48334e != this.f48616n) {
                        this.f48616n = ((o4) arrayList.get(i7)).f48334e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i7)).f48334e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f24492p0 = this.f48616n;
                        org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.s5, new Object[0]);
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
