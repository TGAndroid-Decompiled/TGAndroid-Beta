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
public final class q4 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public p4 f41526a;
    public p4 f41527b;
    public p4 f41528c;
    public p4 d;
    public p4 f41529e;
    public LinearLayout f41530f;
    public final ArrayList h;
    public int f41531n;

    public q4() {
        super(null);
        this.h = new ArrayList();
        this.f41531n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((p4) arrayList.get(i10)).f24459b.f26519f) {
                    return ((p4) arrayList.get(i10)).f41291e;
                }
                i10++;
            } else {
                return this.f41531n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.jr.f29800f);
        TransitionManager.beginDelayedTransition(this.f41530f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((p4) arrayList.get(i11)).f41291e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((p4) arrayList.get(i12)).d) {
                        this.f41530f.removeView((View) arrayList.get(i12));
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
                    } else if (i10 < ((p4) arrayList.get(i13)).f41291e) {
                        size = i13 + 1;
                        break;
                    } else {
                        i13++;
                    }
                }
                ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
                h6Var.d = true;
                h6Var.f41291e = i10;
                h6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, h6Var);
                this.f41530f.addView((View) h6Var, size);
                X();
                W(h6Var, z10);
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
        if (z10 && (i10 = ((p4) view).f41291e) > 0) {
            org.telegram.ui.Components.tc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((p4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false)));
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
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        bg.y3 y3Var = new bg.y3(getParentActivity());
        org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(getParentActivity(), y3Var, this.resourceProvider, true);
        y3Var.setOrientation(1);
        un0Var.addView(y3Var);
        frameLayout.addView(un0Var);
        this.actionBar.setAdaptiveBackground(un0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.rw0 rw0Var = new org.telegram.ui.Components.rw0(context, this.currentAccount);
        rw0Var.setStickerNum(10);
        frameLayout2.addView(rw0Var, i7.f6.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        y3Var.addView(frameLayout2, i7.f6.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f41530f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41530f.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        y3Var.addView(this.f41530f, i7.f6.n(-1, -2));
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(getParentActivity());
        k4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f41530f.addView(k4Var);
        ?? h6Var = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f41526a = h6Var;
        h6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        p4 p4Var = this.f41526a;
        p4Var.f41291e = 0;
        this.f41530f.addView(p4Var);
        ?? h6Var2 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f41527b = h6Var2;
        h6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        p4 p4Var2 = this.f41527b;
        p4Var2.f41291e = 1440;
        this.f41530f.addView(p4Var2);
        ?? h6Var3 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f41528c = h6Var3;
        h6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        p4 p4Var3 = this.f41528c;
        p4Var3.f41291e = 10080;
        this.f41530f.addView(p4Var3);
        ?? h6Var4 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.d = h6Var4;
        h6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        p4 p4Var4 = this.d;
        p4Var4.f41291e = 44640;
        this.f41530f.addView(p4Var4);
        ?? h6Var5 = new org.telegram.ui.Cells.h6(getParentActivity(), null);
        this.f41529e = h6Var5;
        h6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.f41529e.f24459b.setVisibility(8);
        this.f41530f.addView(this.f41529e);
        p4 p4Var5 = this.f41526a;
        ArrayList arrayList = this.h;
        arrayList.add(p4Var5);
        arrayList.add(this.f41527b);
        arrayList.add(this.f41528c);
        arrayList.add(this.d);
        arrayList.add(this.f41529e);
        X();
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 12, this.resourceProvider);
        y8Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new n4(this)));
        y3Var.addView(y8Var, i7.f6.n(-1, -2));
        V(this.f41531n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f41531n = globalTTl;
        if (globalTTl < 0) {
            this.f41531n = 0;
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
                if (((p4) arrayList.get(i10)).f24459b.f26519f) {
                    if (((p4) arrayList.get(i10)).f41291e != this.f41531n) {
                        this.f41531n = ((p4) arrayList.get(i10)).f41291e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((p4) arrayList.get(i10)).f41291e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f41531n);
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
