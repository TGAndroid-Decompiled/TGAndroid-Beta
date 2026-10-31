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
public final class p4 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public o4 f40461a;
    public o4 f40462b;
    public o4 f40463c;
    public o4 d;
    public o4 e;
    public LinearLayout f40464f;
    public final ArrayList h;
    public int f40465n;
    public org.telegram.ui.Components.in0 f40466r;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f40465n = 0;
    }

    public final int Y() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f22312b.f24161f) {
                    return ((o4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f40465n;
            }
        }
    }

    public final void Z(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f26495f);
        TransitionManager.beginDelayedTransition(this.f40464f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((o4) arrayList.get(i11)).e == i10) {
                    a0((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((o4) arrayList.get(i12)).d) {
                        this.f40464f.removeView((View) arrayList.get(i12));
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
                m6Var.c(org.telegram.messenger.cd.a0("AutoDeleteAfterShort", null, 2131753872, org.telegram.messenger.cd.c0(i10 * 60)), false, true);
                arrayList.add(size, m6Var);
                this.f40464f.addView((View) m6Var, size);
                b0();
                a0(m6Var, z10);
                return;
            }
        }
    }

    public final void a0(View view, boolean z10) {
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
            org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0("AutoDeleteGlobalTimerEnabled", null, 2131753857, org.telegram.messenger.cd.c0(i10 * 60)), org.telegram.ui.Components.cc.a0(this), 2131624020, 36);
        }
    }

    public final void b0() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
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
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131753850, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0(getParentActivity());
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity(), hn0Var, this.resourceProvider, true);
        this.f40466r = in0Var;
        in0Var.setDrawBackground(true);
        this.f40466r.setOverScrollMode(0);
        hn0Var.setOrientation(1);
        this.f40466r.addView(hn0Var);
        frameLayout.addView(this.f40466r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, this.currentAccount);
        ew0Var.setStickerNum(10);
        frameLayout2.addView(ew0Var, w7.b6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        hn0Var.addView(frameLayout2, w7.b6.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f40464f = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.f40464f, null);
        hn0Var.addView(this.f40464f, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(getParentActivity());
        p4Var.setText(org.telegram.messenger.cd.L0(2131748602, null));
        this.f40464f.addView(p4Var);
        ?? m6Var = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40461a = m6Var;
        m6Var.c(org.telegram.messenger.cd.L0(2131745379, null), false, true);
        o4 o4Var = this.f40461a;
        o4Var.e = 0;
        this.f40464f.addView(o4Var);
        ?? m6Var2 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40462b = m6Var2;
        m6Var2.c(org.telegram.messenger.cd.L0(2131753875, null), false, true);
        o4 o4Var2 = this.f40462b;
        o4Var2.e = 1440;
        this.f40464f.addView(o4Var2);
        ?? m6Var3 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.f40463c = m6Var3;
        m6Var3.c(org.telegram.messenger.cd.L0(2131753873, null), false, true);
        o4 o4Var3 = this.f40463c;
        o4Var3.e = 10080;
        this.f40464f.addView(o4Var3);
        ?? m6Var4 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.d = m6Var4;
        m6Var4.c(org.telegram.messenger.cd.L0(2131753874, null), false, true);
        o4 o4Var4 = this.d;
        o4Var4.e = 44640;
        this.f40464f.addView(o4Var4);
        ?? m6Var5 = new org.telegram.ui.Cells.m6(getParentActivity(), null);
        this.e = m6Var5;
        m6Var5.c(org.telegram.messenger.cd.L0(2131745551, null), false, false);
        this.e.f22312b.setVisibility(8);
        this.f40464f.addView(this.e);
        o4 o4Var5 = this.f40461a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f40462b);
        arrayList.add(this.f40463c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        b0();
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        b9Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131749545, null), new m4(this, 0)));
        hn0Var.addView(b9Var, w7.b6.o(-1, -2));
        Z(this.f40465n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.f40466r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = getUserConfig().f15168p0;
        this.f40465n = i10;
        if (i10 < 0) {
            this.f40465n = 0;
        }
        getUserConfig().t();
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19689s5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19689s5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f22312b.f24161f) {
                    if (((o4) arrayList.get(i10)).e != this.f40465n) {
                        this.f40465n = ((o4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().f15168p0 = this.f40465n;
                        org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.f19689s5, new Object[0]);
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
