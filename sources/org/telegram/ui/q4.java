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

    public p4 f41509a;

    public p4 f41510b;

    public p4 f41511c;
    public p4 d;

    public p4 f41512e;

    public LinearLayout f41513f;
    public final ArrayList h;

    public int f41514n;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.f41514n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return this.f41514n;
            }
            if (((p4) arrayList.get(i10)).f24398b.f26504f) {
                return ((p4) arrayList.get(i10)).f41259e;
            }
            i10++;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.er.f28122f);
        TransitionManager.beginDelayedTransition(this.f41513f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f41513f.removeView((View) arrayList.get(i12));
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                int size = arrayList.size();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i10 < ((p4) arrayList.get(i13)).f41259e) {
                        size = i13 + 1;
                        break;
                    }
                }
                p4 p4Var = new p4(getParentActivity(), null);
                p4Var.d = true;
                p4Var.f41259e = i10;
                p4Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, p4Var);
                this.f41513f.addView(p4Var, size);
                X();
                W(p4Var, z10);
                return;
            }
            if (((p4) arrayList.get(i11)).f41259e == i10) {
                W((View) arrayList.get(i11), z10);
                return;
            }
            i11++;
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
        if (!z10 || (i10 = ((p4) view).f41259e) <= 0) {
            return;
        }
        org.telegram.ui.Components.mc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false)));
            ((p4) arrayList.get(i10)).setOnClickListener(new a(this, 3));
            i10++;
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AutoDeleteMessages));
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        hh.m mVar = new hh.m(getParentActivity());
        org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(getParentActivity(), mVar, this.resourceProvider, true);
        mVar.setOrientation(1);
        kn0Var.addView(mVar);
        frameLayout.addView(kn0Var);
        this.actionBar.setAdaptiveBackground(kn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(context, this.currentAccount);
        jw0Var.setStickerNum(10);
        frameLayout2.addView(jw0Var, h7.z5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        mVar.addView(frameLayout2, h7.z5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f41513f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41513f.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        mVar.addView(this.f41513f, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(getParentActivity());
        j4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f41513f.addView(j4Var);
        p4 p4Var = new p4(getParentActivity(), null);
        this.f41509a = p4Var;
        p4Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var2 = this.f41509a;
        p4Var2.f41259e = 0;
        this.f41513f.addView(p4Var2);
        p4 p4Var3 = new p4(getParentActivity(), null);
        this.f41510b = p4Var3;
        p4Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var4 = this.f41510b;
        p4Var4.f41259e = 1440;
        this.f41513f.addView(p4Var4);
        p4 p4Var5 = new p4(getParentActivity(), null);
        this.f41511c = p4Var5;
        p4Var5.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var6 = this.f41511c;
        p4Var6.f41259e = 10080;
        this.f41513f.addView(p4Var6);
        p4 p4Var7 = new p4(getParentActivity(), null);
        this.d = p4Var7;
        p4Var7.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var8 = this.d;
        p4Var8.f41259e = 44640;
        this.f41513f.addView(p4Var8);
        p4 p4Var9 = new p4(getParentActivity(), null);
        this.f41512e = p4Var9;
        p4Var9.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f41512e.f24398b.setVisibility(8);
        this.f41513f.addView(this.f41512e);
        p4 p4Var10 = this.f41509a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var10);
        arrayList.add(this.f41510b);
        arrayList.add(this.f41511c);
        arrayList.add(this.d);
        arrayList.add(this.f41512e);
        X();
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        x8Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        mVar.addView(x8Var, h7.z5.n(-1, -2));
        V(this.f41514n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f41514n = globalTTl;
        if (globalTTl < 0) {
            this.f41514n = 0;
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
            if (i10 >= arrayList.size()) {
                return;
            }
            if (((p4) arrayList.get(i10)).f24398b.f26504f) {
                if (((p4) arrayList.get(i10)).f41259e != this.f41514n) {
                    this.f41514n = ((p4) arrayList.get(i10)).f41259e;
                    TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                    tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).f41259e * 60;
                    getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new o4());
                    getUserConfig().setGlobalTtl(this.f41514n);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                    return;
                }
                return;
            }
            i10++;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
