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
    public p4 f39718a;
    public p4 f39719b;
    public p4 f39720c;
    public p4 d;
    public p4 f39721e;
    public LinearLayout f39722f;
    public final ArrayList h;
    public int f39723n;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.f39723n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p4) arrayList.get(i10)).f22181b.f24110f) {
                    return ((p4) arrayList.get(i10)).f39403e;
                }
                i10++;
            } else {
                return this.f39723n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.pr.f29466f);
        TransitionManager.beginDelayedTransition(this.f39722f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((p4) arrayList.get(i11)).f39403e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f39722f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((p4) arrayList.get(i13)).f39403e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.f39403e = i10;
                j6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f39722f.addView((View) j6Var, size);
                X();
                W(j6Var, z10);
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
        if (z10 && (i10 = ((p4) view).f39403e) > 0) {
            org.telegram.ui.Components.yc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.j6.g0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false)));
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 21));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        yd ydVar = new yd(getParentActivity());
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(getParentActivity(), ydVar, this.resourceProvider, true);
        ydVar.setOrientation(1);
        zn0Var.addView(ydVar);
        frameLayout.addView(zn0Var);
        this.actionBar.setAdaptiveBackground(zn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, this.currentAccount);
        yw0Var.setStickerNum(10);
        frameLayout2.addView(yw0Var, w7.x5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        ydVar.addView(frameLayout2, w7.x5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f39722f = linearLayout;
        linearLayout.setOrientation(1);
        this.f39722f.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        ydVar.addView(this.f39722f, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f39722f.addView(l4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f39718a = j6Var;
        j6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var = this.f39718a;
        p4Var.f39403e = 0;
        this.f39722f.addView(p4Var);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f39719b = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var2 = this.f39719b;
        p4Var2.f39403e = 1440;
        this.f39722f.addView(p4Var2);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f39720c = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var3 = this.f39720c;
        p4Var3.f39403e = 10080;
        this.f39722f.addView(p4Var3);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var4 = this.d;
        p4Var4.f39403e = 44640;
        this.f39722f.addView(p4Var4);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f39721e = j6Var5;
        j6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f39721e.f22181b.setVisibility(8);
        this.f39722f.addView(this.f39721e);
        p4 p4Var5 = this.f39718a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var5);
        arrayList.add(this.f39719b);
        arrayList.add(this.f39720c);
        arrayList.add(this.d);
        arrayList.add(this.f39721e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        ydVar.addView(e9Var, w7.x5.n(-1, -2));
        V(this.f39723n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f39723n = globalTTl;
        if (globalTTl < 0) {
            this.f39723n = 0;
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
                if (((p4) arrayList.get(i10)).f22181b.f24110f) {
                    if (((p4) arrayList.get(i10)).f39403e != this.f39723n) {
                        this.f39723n = ((p4) arrayList.get(i10)).f39403e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).f39403e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f39723n);
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
