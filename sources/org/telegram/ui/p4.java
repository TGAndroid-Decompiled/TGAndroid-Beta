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
    public o4 f36427a;
    public o4 f36428b;
    public o4 f36429c;
    public o4 d;
    public o4 e;
    public LinearLayout f36430f;
    public final ArrayList h;
    public int f36431n;

    public p4() {
        super(null);
        this.h = new ArrayList();
        this.f36431n = 0;
    }

    public final int U() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((o4) arrayList.get(i10)).f20321b.f22162f) {
                    return ((o4) arrayList.get(i10)).e;
                }
                i10++;
            } else {
                return this.f36431n;
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
        transitionSet.setInterpolator((TimeInterpolator) org.telegram.ui.Components.qr.f27423f);
        TransitionManager.beginDelayedTransition(this.f36430f, transitionSet);
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 < arrayList.size()) {
                if (((o4) arrayList.get(i11)).e == i10) {
                    W((View) arrayList.get(i11), z10);
                    return;
                }
                i11++;
            } else {
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (((o4) arrayList.get(i12)).d) {
                        this.f36430f.removeView((View) arrayList.get(i12));
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
                ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
                j6Var.d = true;
                j6Var.e = i10;
                j6Var.c(LocaleController.formatString("AutoDeleteAfterShort", R.string.AutoDeleteAfterShort, LocaleController.formatTTLString(i10 * 60)), false, true);
                arrayList.add(size, j6Var);
                this.f36430f.addView((View) j6Var, size);
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
                ((o4) arrayList.get(i11)).a(true, this.fragmentBeginToShow);
            } else {
                ((o4) arrayList.get(i11)).a(false, this.fragmentBeginToShow);
            }
            i11++;
        }
        if (z10 && (i10 = ((o4) view).e) > 0) {
            org.telegram.ui.Components.vc.a0(this).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutoDeleteGlobalTimerEnabled", R.string.AutoDeleteGlobalTimerEnabled, LocaleController.formatTTLString(i10 * 60)))).j();
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((o4) arrayList.get(i10)).setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18926i6, false)));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        xd xdVar = new xd(getParentActivity());
        org.telegram.ui.Components.zn0 zn0Var = new org.telegram.ui.Components.zn0(getParentActivity(), xdVar, this.resourceProvider, true);
        xdVar.setOrientation(1);
        zn0Var.addView(xdVar);
        frameLayout.addView(zn0Var);
        this.actionBar.setAdaptiveBackground(zn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, this.currentAccount);
        zw0Var.setStickerNum(10);
        frameLayout2.addView(zw0Var, w7.x5.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        xdVar.addView(frameLayout2, w7.x5.n(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f36430f = linearLayout;
        linearLayout.setOrientation(1);
        this.f36430f.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        xdVar.addView(this.f36430f, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(getParentActivity());
        l4Var.setText(LocaleController.getString(R.string.MessageLifetime));
        this.f36430f.addView(l4Var);
        ?? j6Var = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f36427a = j6Var;
        j6Var.c(LocaleController.getString(R.string.ShortMessageLifetimeForever), false, true);
        o4 o4Var = this.f36427a;
        o4Var.e = 0;
        this.f36430f.addView(o4Var);
        ?? j6Var2 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f36428b = j6Var2;
        j6Var2.c(LocaleController.getString(R.string.AutoDeleteAfter1Day), false, true);
        o4 o4Var2 = this.f36428b;
        o4Var2.e = 1440;
        this.f36430f.addView(o4Var2);
        ?? j6Var3 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.f36429c = j6Var3;
        j6Var3.c(LocaleController.getString(R.string.AutoDeleteAfter1Week), false, true);
        o4 o4Var3 = this.f36429c;
        o4Var3.e = 10080;
        this.f36430f.addView(o4Var3);
        ?? j6Var4 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.d = j6Var4;
        j6Var4.c(LocaleController.getString(R.string.AutoDeleteAfter1Month), false, true);
        o4 o4Var4 = this.d;
        o4Var4.e = 44640;
        this.f36430f.addView(o4Var4);
        ?? j6Var5 = new org.telegram.ui.Cells.j6(getParentActivity(), null);
        this.e = j6Var5;
        j6Var5.c(LocaleController.getString(R.string.SetCustomTime), false, false);
        this.e.f20321b.setVisibility(8);
        this.f36430f.addView(this.e);
        o4 o4Var5 = this.f36427a;
        ArrayList arrayList = this.h;
        arrayList.add(o4Var5);
        arrayList.add(this.f36428b);
        arrayList.add(this.f36429c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        X();
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 12, this.resourceProvider);
        e9Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GlobalAutoDeleteInfo), new m4(this)));
        xdVar.addView(e9Var, w7.x5.n(-1, -2));
        V(this.f36431n, false);
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        int globalTTl = getUserConfig().getGlobalTTl();
        this.f36431n = globalTTl;
        if (globalTTl < 0) {
            this.f36431n = 0;
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
                if (((o4) arrayList.get(i10)).f20321b.f22162f) {
                    if (((o4) arrayList.get(i10)).e != this.f36431n) {
                        this.f36431n = ((o4) arrayList.get(i10)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((o4) arrayList.get(i10)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().setGlobalTtl(this.f36431n);
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
