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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public p4 f39707a;
    public p4 f39708b;
    public p4 f39709c;
    public p4 d;
    public p4 f39710e;
    public LinearLayout f39711f;
    public final ArrayList h;
    public int f39712n;
    public org.telegram.ui.Components.so0 f39713r;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.f39712n = 0;
    }

    public final int S() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p4) arrayList.get(i10)).f22410b.f24304f) {
                    return ((p4) arrayList.get(i10)).f39350e;
                }
                i10++;
            } else {
                return this.f39712n;
            }
        }
    }

    public final void T(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.tr.f31215f);
        TransitionManager.beginDelayedTransition(this.f39711f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((p4) arrayList.get(i11)).f39350e == i10) {
                    U((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f39711f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((p4) arrayList.get(i13)).f39350e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
                k6Var.d = true;
                k6Var.f39350e = i10;
                k6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, k6Var);
                this.f39711f.addView((View) k6Var, size);
                W();
                U(k6Var, z10);
                return;
            }
        }
    }

    public final void U(View view, boolean z10) {
        int i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i11) == view) {
                ((p4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((p4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((p4) view).f39350e) > 0) {
            org.telegram.ui.Components.yc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void W() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20918i6, false)));
                ((p4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ro0 ro0Var = new org.telegram.ui.Components.ro0(getParentActivity());
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(getParentActivity(), ro0Var, this.resourceProvider, true);
        this.f39713r = so0Var;
        so0Var.setDrawBackground(true);
        this.f39713r.setOverScrollMode(0);
        ro0Var.setOrientation(1);
        this.f39713r.addView(ro0Var);
        frameLayout.addView(this.f39713r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, this.currentAccount);
        vx0Var.setStickerNum(10);
        frameLayout2.addView(vx0Var, w7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        ro0Var.addView(frameLayout2, w7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f39711f = linearLayout;
        linearLayout.setOrientation(1);
        this.f39711f.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
        ro0Var.addView(this.f39711f, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f39711f.addView(m4Var);
        ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f39707a = k6Var;
        k6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var = this.f39707a;
        p4Var.f39350e = 0;
        this.f39711f.addView(p4Var);
        ?? k6Var2 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f39708b = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var2 = this.f39708b;
        p4Var2.f39350e = 1440;
        this.f39711f.addView(p4Var2);
        ?? k6Var3 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f39709c = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var3 = this.f39709c;
        p4Var3.f39350e = 10080;
        this.f39711f.addView(p4Var3);
        ?? k6Var4 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.d = k6Var4;
        k6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var4 = this.d;
        p4Var4.f39350e = 44640;
        this.f39711f.addView(p4Var4);
        ?? k6Var5 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f39710e = k6Var5;
        k6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f39710e.f22410b.setVisibility(8);
        this.f39711f.addView(this.f39710e);
        p4 p4Var5 = this.f39707a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var5);
        arrayList.add(this.f39708b);
        arrayList.add(this.f39709c);
        arrayList.add(this.d);
        arrayList.add(this.f39710e);
        W();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        ro0Var.addView(e9Var, w7.z5.n(-1, -2));
        T(this.f39712n, false);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.so0 getScrollViewForSimpleGlass() {
        return this.f39713r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f39712n = globalTTl;
        if (globalTTl < 0) {
            this.f39712n = 0;
        }
        getUserConfig().loadGlobalTTl();
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateGlobalAutoDeleteTimer);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p4) arrayList.get(i10)).f22410b.f24304f) {
                    if (((p4) arrayList.get(i10)).f39350e != this.f39712n) {
                        this.f39712n = ((p4) arrayList.get(i10)).f39350e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).f39350e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f39712n);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
