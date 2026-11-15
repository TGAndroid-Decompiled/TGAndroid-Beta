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
public final class p4 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public o4 f50137a;
    public o4 f50138b;
    public o4 f50139c;
    public o4 d;
    public o4 f50140e;
    public LinearLayout f50141f;
    public final ArrayList h;
    public int f50142n;
    public org.telegram.ui.Components.lm0 f50143r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f50142n = 0;
    }

    public final int Z() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30405b.f32696f) {
                    return ((o4) arrayList.get(i7)).f49803e;
                }
                i7++;
            } else {
                return this.f50142n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.er.f34420f);
        TransitionManager.beginDelayedTransition(this.f50141f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f49803e == i7) {
                    b0((View) arrayList.get(i10), z10);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f50141f.removeView((View) arrayList.get(i11));
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
                    } else if (i7 < ((o4) arrayList.get(i12)).f49803e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
                h6Var.d = true;
                h6Var.f49803e = i7;
                h6Var.c(org.telegram.messenger.hd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.hd.c0(i7 * 60)), false, true);
                arrayList.add(size, h6Var);
                this.f50141f.addView((View) h6Var, size);
                c0();
                b0(h6Var, z10);
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
        if (z10 && (i7 = ((o4) view).f49803e) > 0) {
            org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.hd.c0(i7 * 60)), org.telegram.ui.Components.cc.a0(this), 2131624021, 36);
        }
    }

    public final void c0() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
                int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
                org.telegram.ui.ActionBar.q6.Q((View) arrayList.get(i7), org.telegram.ui.ActionBar.j6.i0(x02, org.telegram.ui.ActionBar.j6.x0(null, i11, false)), org.telegram.ui.ActionBar.q6.M(i10), org.telegram.ui.ActionBar.q6.M(i11), null);
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
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 25));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(getParentActivity());
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(getParentActivity(), km0Var, this.resourceProvider, true);
        this.f50143r = lm0Var;
        lm0Var.setDrawBackground(true);
        this.f50143r.setOverScrollMode(0);
        km0Var.setOrientation(1);
        this.f50143r.addView(km0Var);
        frameLayout.addView(this.f50143r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, this.currentAccount);
        dv0Var.setStickerNum(10);
        frameLayout2.addView(dv0Var, c8.ja.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        km0Var.addView(frameLayout2, c8.ja.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f50141f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this.f50141f, null);
        km0Var.addView(this.f50141f, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(getParentActivity());
        n4Var.setText(org.telegram.messenger.hd.M0(2131748587, null));
        this.f50141f.addView(n4Var);
        ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f50137a = h6Var;
        h6Var.c(org.telegram.messenger.hd.M0(2131745361, null), false, true);
        o4 o4Var = this.f50137a;
        o4Var.f49803e = 0;
        this.f50141f.addView(o4Var);
        ?? h6Var2 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f50138b = h6Var2;
        h6Var2.c(org.telegram.messenger.hd.M0(2131753875, null), false, true);
        o4 o4Var2 = this.f50138b;
        o4Var2.f49803e = 1440;
        this.f50141f.addView(o4Var2);
        ?? h6Var3 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f50139c = h6Var3;
        h6Var3.c(org.telegram.messenger.hd.M0(2131753873, null), false, true);
        o4 o4Var3 = this.f50139c;
        o4Var3.f49803e = 10080;
        this.f50141f.addView(o4Var3);
        ?? h6Var4 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.d = h6Var4;
        h6Var4.c(org.telegram.messenger.hd.M0(2131753874, null), false, true);
        o4 o4Var4 = this.d;
        o4Var4.f49803e = 44640;
        this.f50141f.addView(o4Var4);
        ?? h6Var5 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f50140e = h6Var5;
        h6Var5.c(org.telegram.messenger.hd.M0(2131745534, null), false, false);
        this.f50140e.f30405b.setVisibility(8);
        this.f50141f.addView(this.f50140e);
        o4 o4Var5 = this.f50137a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f50138b);
        arrayList.add(this.f50139c);
        arrayList.add(this.d);
        arrayList.add(this.f50140e);
        c0();
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        y8Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131749536, null), new m4(this, 0)));
        km0Var.addView(y8Var, c8.ja.o(-1, -2));
        a0(this.f50142n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
        return this.f50143r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = getUserConfig().f24957q0;
        this.f50142n = i7;
        if (i7 < 0) {
            this.f50142n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.ns.s5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.s5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((o4) arrayList.get(i7)).f30405b.f32696f) {
                    if (((o4) arrayList.get(i7)).f49803e != this.f50142n) {
                        this.f50142n = ((o4) arrayList.get(i7)).f49803e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i7)).f49803e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f24957q0 = this.f50142n;
                        org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.s5, new Object[0]);
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
