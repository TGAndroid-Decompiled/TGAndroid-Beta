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
public final class p4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public o4 f41333a;
    public o4 f41334b;
    public o4 f41335c;
    public o4 d;
    public o4 f41336e;
    public LinearLayout f41337f;
    public final ArrayList h;
    public int f41338n;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f41338n = 0;
    }

    public final int T() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                if (((o4) arrayList.get(i9)).f24572b.f26508f) {
                    return ((o4) arrayList.get(i9)).f40877e;
                }
                i9++;
            } else {
                return this.f41338n;
            }
        }
    }

    public final void U(int i9, boolean z10) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.gr.f28844f);
        TransitionManager.beginDelayedTransition(this.f41337f, transitionSet);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f40877e == i9) {
                    V((View) arrayList.get(i10), z10);
                    return;
                }
                i10++;
            } else {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (((o4) arrayList.get(i11)).d) {
                        this.f41337f.removeView((View) arrayList.get(i11));
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
                    } else if (i9 < ((o4) arrayList.get(i12)).f40877e) {
                        size = i12 + 1;
                        break;
                    } else {
                        i12++;
                    }
                }
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.f40877e = i9;
                j6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i9 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f41337f.addView((View) j6Var, size);
                W();
                V(j6Var, z10);
                return;
            }
        }
    }

    public final void V(View view, boolean z10) {
        int i9;
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
        if (z10 && (i9 = ((o4) view).f40877e) > 0) {
            org.telegram.ui.Components.oc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i9 * 60)))).j();
        }
    }

    public final void W() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                ((o4) arrayList.get(i9)).setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false)));
                ((o4) arrayList.get(i9)).setOnClickListener(new a(this, 3));
                i9++;
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
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        gh.m mVar = new gh.m(getParentActivity());
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity(), mVar, this.resourceProvider, true);
        mVar.setOrientation(1);
        in0Var.addView(mVar);
        frameLayout.addView(in0Var);
        this.actionBar.setAdaptiveBackground(in0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.hw0 hw0Var = new org.telegram.ui.Components.hw0(context, this.currentAccount);
        hw0Var.setStickerNum(10);
        frameLayout2.addView(hw0Var, g7.e6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        mVar.addView(frameLayout2, g7.e6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f41337f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41337f.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        mVar.addView(this.f41337f, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(getParentActivity());
        m4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f41337f.addView(m4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41333a = j6Var;
        j6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        o4 o4Var = this.f41333a;
        o4Var.f40877e = 0;
        this.f41337f.addView(o4Var);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41334b = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        o4 o4Var2 = this.f41334b;
        o4Var2.f40877e = 1440;
        this.f41337f.addView(o4Var2);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41335c = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        o4 o4Var3 = this.f41335c;
        o4Var3.f40877e = 10080;
        this.f41337f.addView(o4Var3);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        o4 o4Var4 = this.d;
        o4Var4.f40877e = 44640;
        this.f41337f.addView(o4Var4);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f41336e = j6Var5;
        j6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f41336e.f24572b.setVisibility(8);
        this.f41337f.addView(this.f41336e);
        o4 o4Var5 = this.f41333a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f41334b);
        arrayList.add(this.f41335c);
        arrayList.add(this.d);
        arrayList.add(this.f41336e);
        W();
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 12, this.resourceProvider);
        b9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new m4(this)));
        mVar.addView(b9Var, g7.e6.n(-1, -2));
        U(this.f41338n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f41338n = globalTTl;
        if (globalTTl < 0) {
            this.f41338n = 0;
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                if (((o4) arrayList.get(i9)).f24572b.f26508f) {
                    if (((o4) arrayList.get(i9)).f40877e != this.f41338n) {
                        this.f41338n = ((o4) arrayList.get(i9)).f40877e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i9)).f40877e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f41338n);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateGlobalAutoDeleteTimer, new Object[0]);
                        return;
                    }
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
    }
}
