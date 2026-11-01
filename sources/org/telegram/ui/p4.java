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
public final class p4 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public o4 f40360a;
    public o4 f40361b;
    public o4 f40362c;
    public o4 d;
    public o4 e;
    public LinearLayout f40363f;
    public final ArrayList h;
    public int f40364n;
    public org.telegram.ui.Components.jn0 f40365r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f40364n = 0;
    }

    public final int Z() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f22313b.f24162f) {
                    return ((o4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f40364n;
            }
        }
    }

    public final void a0(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f26523f);
        TransitionManager.beginDelayedTransition(this.f40363f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((o4) arrayList.get(i11)).e == i10) {
                    b0((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((o4) arrayList.get(i12)).d) {
                        this.f40363f.removeView((View) arrayList.get(i12));
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    } else if (i10 < ((o4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? m6Var = new org.telegram.ui.Cells.m6(getParentActivity(), null);
                m6Var.d = true;
                m6Var.e = i10;
                m6Var.c(org.telegram.messenger.dd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.dd.c0(i10 * 60)), false, true);
                arrayList.add(size, m6Var);
                this.f40363f.addView((View) m6Var, size);
                c0();
                b0(m6Var, z10);
                return;
            }
        }
    }

    public final void b0(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((o4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((o4) view).e) > 0) {
            org.telegram.messenger.a30.s(org.telegram.messenger.dd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.dd.c0(i10 * 60)), org.telegram.ui.Components.cc.a0(this), 2131624020, 36);
        }
    }

    public final void c0() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
                org.telegram.ui.ActionBar.a7.R((View) arrayList.get(i10), org.telegram.ui.ActionBar.t6.i0(x02, org.telegram.ui.ActionBar.t6.x0(null, i12, false)), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), null);
                ((o4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity());
        org.telegram.ui.Components.jn0 jn0Var = new org.telegram.ui.Components.jn0(getParentActivity(), in0Var, this.resourceProvider, true);
        this.f40365r = jn0Var;
        jn0Var.setDrawBackground(true);
        this.f40365r.setOverScrollMode(0);
        in0Var.setOrientation(1);
        this.f40365r.addView(in0Var);
        frameLayout.addView(this.f40365r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(context, this.currentAccount);
        fw0Var.setStickerNum(10);
        frameLayout2.addView(fw0Var, w7.b6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        in0Var.addView(frameLayout2, w7.b6.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f40363f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this.f40363f, null);
        in0Var.addView(this.f40363f, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(getParentActivity());
        p4Var.setText(org.telegram.messenger.dd.L0(2131748602, null));
        this.f40363f.addView(p4Var);
        ?? m6Var = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40360a = m6Var;
        m6Var.c(org.telegram.messenger.dd.L0(2131745379, null), false, true);
        o4 o4Var = this.f40360a;
        o4Var.e = 0;
        this.f40363f.addView(o4Var);
        ?? m6Var2 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40361b = m6Var2;
        m6Var2.c(org.telegram.messenger.dd.L0(2131753875, null), false, true);
        o4 o4Var2 = this.f40361b;
        o4Var2.e = 1440;
        this.f40363f.addView(o4Var2);
        ?? m6Var3 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40362c = m6Var3;
        m6Var3.c(org.telegram.messenger.dd.L0(2131753873, null), false, true);
        o4 o4Var3 = this.f40362c;
        o4Var3.e = 10080;
        this.f40363f.addView(o4Var3);
        ?? m6Var4 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.d = m6Var4;
        m6Var4.c(org.telegram.messenger.dd.L0(2131753874, null), false, true);
        o4 o4Var4 = this.d;
        o4Var4.e = 44640;
        this.f40363f.addView(o4Var4);
        ?? m6Var5 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.e = m6Var5;
        m6Var5.c(org.telegram.messenger.dd.L0(2131745551, null), false, false);
        this.e.f22313b.setVisibility(8);
        this.f40363f.addView(this.e);
        o4 o4Var5 = this.f40360a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f40361b);
        arrayList.add(this.f40362c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        c0();
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        b9Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131749545, null), new m4(this, 0)));
        in0Var.addView(b9Var, w7.b6.o(-1, -2));
        a0(this.f40364n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.jn0 getScrollViewForSimpleGlass() {
        return this.f40365r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = getUserConfig().f15527p0;
        this.f40364n = i10;
        if (i10 < 0) {
            this.f40364n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.at.f14785s5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.f14785s5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f22313b.f24162f) {
                    if (((o4) arrayList.get(i10)).e != this.f40364n) {
                        this.f40364n = ((o4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f15527p0 = this.f40364n;
                        org.telegram.messenger.at.f(this.currentAccount).k(org.telegram.messenger.at.f14785s5, new Object[0]);
                        return;
                    }
                    return;
                }
                i10++;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
