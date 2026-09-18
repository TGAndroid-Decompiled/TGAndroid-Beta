package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class ai1 implements Runnable {
    public final int f32078a;
    public final int f32079b;
    public final Object f32080c;

    public ai1(int i10, org.telegram.ui.ActionBar.d5 d5Var) {
        this.f32078a = 5;
        this.f32079b = i10;
        this.f32080c = d5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32078a;
        boolean z10 = false;
        int i11 = this.f32079b;
        Object obj = this.f32080c;
        switch (i10) {
            case 0:
                si1 si1Var = (si1) obj;
                si1Var.F.setSignalBarCount(i11);
                if (i11 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = si1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    si1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = si1Var.v;
                if (c3Var2.V != 2) {
                    c3Var2.V = 2;
                    c3Var2.c();
                    ValueAnimator valueAnimator = c3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        c3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 0);
                    c3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                    c3Var2.O.setDuration(500L);
                    c3Var2.O.start();
                }
                si1Var.F.c(false);
                return;
            case 1:
                qg.j jVar = (qg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(org.telegram.ui.Components.qr.f27715f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
            case 2:
                au0 au0Var = (au0) obj;
                pg.s1 s1Var = au0Var.K1;
                au0Var.s0(s1Var, null);
                pg.u0.e(i11).j(s1Var.f41244c);
                return;
            case 3:
                qg.m2 m2Var = (qg.m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                return;
            case 4:
                org.telegram.ui.Components.l90 l90Var = ((tg.r0) obj).e;
                try {
                    if (l90Var.getLayout().getLineForOffset(i11) == 0) {
                        l90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 6:
                nf.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 7:
                ConnectionsManager.getInstance(((yh.t5) obj).f48042a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f49277b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f49276a.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fVar.f49278c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new ai1(fVar, max, 8), max);
                    return;
                }
                return;
        }
    }

    public ai1(Object obj, int i10, int i11) {
        this.f32078a = i11;
        this.f32080c = obj;
        this.f32079b = i10;
    }
}
