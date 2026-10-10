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
public final class p4 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public o4 f40702a;
    public o4 f40703b;
    public o4 f40704c;
    public o4 d;
    public o4 f40705e;
    public LinearLayout f40706f;
    public final ArrayList h;
    public int f40707n;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f40707n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f22395b.f24304f) {
                    return ((o4) arrayList.get(i10)).f40456e;
                }
                i10++;
            } else {
                return this.f40707n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.is.f27443f);
        TransitionManager.beginDelayedTransition(this.f40706f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((o4) arrayList.get(i11)).f40456e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((o4) arrayList.get(i12)).d) {
                        this.f40706f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((o4) arrayList.get(i13)).f40456e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
                k6Var.d = true;
                k6Var.f40456e = i10;
                k6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, k6Var);
                this.f40706f.addView((View) k6Var, size);
                X();
                W(k6Var, z10);
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
                ((o4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((o4) view).f40456e) > 0) {
            org.telegram.ui.Components.ad.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((o4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.i6.h0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20892i6, false)));
                ((o4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 20));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        yd ydVar = new yd(getParentActivity());
        org.telegram.ui.Components.fp0 fp0Var = new org.telegram.ui.Components.fp0(getParentActivity(), ydVar, this.resourceProvider, true);
        ydVar.setOrientation(1);
        fp0Var.addView(ydVar);
        frameLayout.addView(fp0Var);
        this.actionBar.setAdaptiveBackground(fp0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(context, this.currentAccount);
        cy0Var.setStickerNum(10);
        frameLayout2.addView(cy0Var, w7.x5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        ydVar.addView(frameLayout2, w7.x5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f40706f = linearLayout;
        linearLayout.setOrientation(1);
        this.f40706f.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
        ydVar.addView(this.f40706f, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f40706f.addView(m4Var);
        ?? k6Var = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40702a = k6Var;
        k6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        o4 o4Var = this.f40702a;
        o4Var.f40456e = 0;
        this.f40706f.addView(o4Var);
        ?? k6Var2 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40703b = k6Var2;
        k6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        o4 o4Var2 = this.f40703b;
        o4Var2.f40456e = 1440;
        this.f40706f.addView(o4Var2);
        ?? k6Var3 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40704c = k6Var3;
        k6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        o4 o4Var3 = this.f40704c;
        o4Var3.f40456e = 10080;
        this.f40706f.addView(o4Var3);
        ?? k6Var4 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.d = k6Var4;
        k6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        o4 o4Var4 = this.d;
        o4Var4.f40456e = 44640;
        this.f40706f.addView(o4Var4);
        ?? k6Var5 = new org.telegram.ui.Cells.k6(getParentActivity(), null);
        this.f40705e = k6Var5;
        k6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f40705e.f22395b.setVisibility(8);
        this.f40706f.addView(this.f40705e);
        o4 o4Var5 = this.f40702a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f40703b);
        arrayList.add(this.f40704c);
        arrayList.add(this.d);
        arrayList.add(this.f40705e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new m4(this)));
        ydVar.addView(e9Var, w7.x5.n(-1, -2));
        V(this.f40707n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f40707n = globalTTl;
        if (globalTTl < 0) {
            this.f40707n = 0;
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
                if (((o4) arrayList.get(i10)).f22395b.f24304f) {
                    if (((o4) arrayList.get(i10)).f40456e != this.f40707n) {
                        this.f40707n = ((o4) arrayList.get(i10)).f40456e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i10)).f40456e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f40707n);
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
