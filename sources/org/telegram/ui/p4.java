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
public final class p4 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public o4 f50719a;
    public o4 f50720b;
    public o4 f50721c;
    public o4 d;
    public o4 f50722e;
    public LinearLayout f50723f;
    public final ArrayList h;
    public int f50724n;
    public org.telegram.ui.Components.wm0 f50725r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f50724n = 0;
    }

    public final int Z() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30917b.f33129f) {
                    return ((o4) arrayList.get(i7)).f50469e;
                }
                i7++;
            } else {
                return this.f50724n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.nr.f37961f);
        TransitionManager.beginDelayedTransition(this.f50723f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f50469e == i7) {
                    b0((View) arrayList.get(i10), z10);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f50723f.removeView((View) arrayList.get(i11));
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
                    } else if (i7 < ((o4) arrayList.get(i12)).f50469e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.f50469e = i7;
                j6Var.c(org.telegram.messenger.hd.a0("AutoDeleteAfterShort", null, 2131753869, org.telegram.messenger.hd.c0(i7 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f50723f.addView((View) j6Var, size);
                c0();
                b0(j6Var, z10);
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
        if (z10 && (i7 = ((o4) view).f50469e) > 0) {
            org.telegram.messenger.o10.u(org.telegram.messenger.hd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753854, org.telegram.messenger.hd.c0(i7 * 60)), org.telegram.ui.Components.lc.b0(this), 2131624021, 36);
        }
    }

    public final void c0() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
                org.telegram.ui.ActionBar.t6.Q((View) arrayList.get(i7), org.telegram.ui.ActionBar.m6.i0(x02, org.telegram.ui.ActionBar.m6.x0(null, i11, false)), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), null);
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
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131753847, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vm0 vm0Var = new org.telegram.ui.Components.vm0(getParentActivity());
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(getParentActivity(), vm0Var, this.resourceProvider, true);
        this.f50725r = wm0Var;
        wm0Var.setDrawBackground(true);
        this.f50725r.setOverScrollMode(0);
        vm0Var.setOrientation(1);
        this.f50725r.addView(vm0Var);
        frameLayout.addView(this.f50725r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, this.currentAccount);
        ov0Var.setStickerNum(10);
        frameLayout2.addView(ov0Var, c8.ma.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        vm0Var.addView(frameLayout2, c8.ma.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f50723f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, this.f50723f, null);
        vm0Var.addView(this.f50723f, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(getParentActivity());
        o4Var.setText(org.telegram.messenger.hd.N0(2131748394, null));
        this.f50723f.addView(o4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f50719a = j6Var;
        j6Var.c(org.telegram.messenger.hd.N0(2131745165, null), false, true);
        o4 o4Var2 = this.f50719a;
        o4Var2.f50469e = 0;
        this.f50723f.addView(o4Var2);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f50720b = j6Var2;
        j6Var2.c(org.telegram.messenger.hd.N0(2131753872, null), false, true);
        o4 o4Var3 = this.f50720b;
        o4Var3.f50469e = 1440;
        this.f50723f.addView(o4Var3);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f50721c = j6Var3;
        j6Var3.c(org.telegram.messenger.hd.N0(2131753870, null), false, true);
        o4 o4Var4 = this.f50721c;
        o4Var4.f50469e = 10080;
        this.f50723f.addView(o4Var4);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(org.telegram.messenger.hd.N0(2131753871, null), false, true);
        o4 o4Var5 = this.d;
        o4Var5.f50469e = 44640;
        this.f50723f.addView(o4Var5);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f50722e = j6Var5;
        j6Var5.c(org.telegram.messenger.hd.N0(2131745338, null), false, false);
        this.f50722e.f30917b.setVisibility(8);
        this.f50723f.addView(this.f50722e);
        o4 o4Var6 = this.f50719a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var6);
        arrayList.add(this.f50720b);
        arrayList.add(this.f50721c);
        arrayList.add(this.d);
        arrayList.add(this.f50722e);
        c0();
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        a9Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131749360, null), new m4(this, 0)));
        vm0Var.addView(a9Var, c8.ma.o(-1, -2));
        a0(this.f50724n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
        return this.f50725r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = getUserConfig().f24991q0;
        this.f50724n = i7;
        if (i7 < 0) {
            this.f50724n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.ls.f25403v5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.f25403v5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30917b.f33129f) {
                    if (((o4) arrayList.get(i7)).f50469e != this.f50724n) {
                        this.f50724n = ((o4) arrayList.get(i7)).f50469e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i7)).f50469e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f24991q0 = this.f50724n;
                        org.telegram.messenger.ls.f(this.currentAccount).k(org.telegram.messenger.ls.f25403v5, new Object[0]);
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
