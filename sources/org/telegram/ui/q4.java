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
public final class q4 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public p4 f35962a;
    public p4 f35963b;
    public p4 f35964c;
    public p4 d;
    public p4 e;
    public LinearLayout f35965f;
    public final ArrayList h;
    public int f35966n;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.f35966n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p4) arrayList.get(i10)).f19486b.f21247f) {
                    return ((p4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f35966n;
            }
        }
    }

    public final void V(int i10, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.wr.f28819f);
        TransitionManager.beginDelayedTransition(this.f35965f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((p4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f35965f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((p4) arrayList.get(i13)).e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? l6Var = new org.telegram.ui.Cells.l6(getParentActivity(), null);
                l6Var.d = true;
                l6Var.e = i10;
                l6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, l6Var);
                this.f35965f.addView((View) l6Var, size);
                X();
                W(l6Var, z10);
                return;
            }
        }
    }

    public final void W(View view, boolean z10) {
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
        if (z10 && (i10 = ((p4) view).e) > 0) {
            org.telegram.ui.Components.wc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false)));
                ((p4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        zd zdVar = new zd(getParentActivity());
        org.telegram.ui.Components.io0 io0Var = new org.telegram.ui.Components.io0(getParentActivity(), zdVar, this.resourceProvider, true);
        zdVar.setOrientation(1);
        io0Var.addView(zdVar);
        frameLayout.addView(io0Var);
        this.actionBar.setAdaptiveBackground(io0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(context, this.currentAccount);
        kx0Var.setStickerNum(10);
        frameLayout2.addView(kx0Var, w7.a6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        zdVar.addView(frameLayout2, w7.a6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f35965f = linearLayout;
        linearLayout.setOrientation(1);
        this.f35965f.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        zdVar.addView(this.f35965f, w7.a6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f35965f.addView(m4Var);
        ?? l6Var = new org.telegram.ui.Cells.l6(getParentActivity(), null);
        this.f35962a = l6Var;
        l6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var = this.f35962a;
        p4Var.e = 0;
        this.f35965f.addView(p4Var);
        ?? l6Var2 = new org.telegram.ui.Cells.l6(getParentActivity(), null);
        this.f35963b = l6Var2;
        l6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var2 = this.f35963b;
        p4Var2.e = 1440;
        this.f35965f.addView(p4Var2);
        ?? l6Var3 = new org.telegram.ui.Cells.l6(getParentActivity(), null);
        this.f35964c = l6Var3;
        l6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var3 = this.f35964c;
        p4Var3.e = 10080;
        this.f35965f.addView(p4Var3);
        ?? l6Var4 = new org.telegram.ui.Cells.l6(getParentActivity(), null);
        this.d = l6Var4;
        l6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var4 = this.d;
        p4Var4.e = 44640;
        this.f35965f.addView(p4Var4);
        ?? l6Var5 = new org.telegram.ui.Cells.l6(getParentActivity(), null);
        this.e = l6Var5;
        l6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f19486b.setVisibility(8);
        this.f35965f.addView(this.e);
        p4 p4Var5 = this.f35962a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var5);
        arrayList.add(this.f35963b);
        arrayList.add(this.f35964c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 12, this.resourceProvider);
        f9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        zdVar.addView(f9Var, w7.a6.n(-1, -2));
        V(this.f35966n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f35966n = globalTTl;
        if (globalTTl < 0) {
            this.f35966n = 0;
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
                if (((p4) arrayList.get(i10)).f19486b.f21247f) {
                    if (((p4) arrayList.get(i10)).e != this.f35966n) {
                        this.f35966n = ((p4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f35966n);
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
