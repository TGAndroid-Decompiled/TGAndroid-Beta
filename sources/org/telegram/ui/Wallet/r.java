package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.tf0;
public final class r implements Runnable {
    public final int f35400a;
    public final int f35401b;
    public final Object f35402c;

    public r(int i10, Object obj, int i11) {
        this.f35400a = i11;
        this.f35401b = i10;
        this.f35402c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f35400a;
        boolean z10 = false;
        int i11 = this.f35401b;
        Object obj = this.f35402c;
        switch (i10) {
            case 0:
                k0 v = k0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                z zVar = new z(notificationCenter, (tf0) obj, v);
                notificationCenter.addObserver(zVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(zVar, 10000L);
                if (v.f35096e == null && v.f35112w < 0) {
                    v.U();
                }
                v.S();
                zVar.a();
                return;
            case 1:
                b6 b6Var = (b6) obj;
                if (b6Var.f34676r && !b6Var.f34679x && i11 == b6Var.f34673k0) {
                    b6Var.postDelayed(b6Var.f34674l0, 500L);
                    return;
                }
                return;
            case 2:
                z6 z6Var = (z6) obj;
                ArrayList arrayList = z6Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) z6Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((g9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        z6Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                r8 r8Var = (r8) obj;
                if (!r8Var.f35426n && i11 == r8Var.I) {
                    r8Var.K = false;
                    r8Var.f26290a.W2.N(true);
                    return;
                }
                return;
            case 4:
                qg.j jVar = (qg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator = jVar.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(hs.f27118f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
            case 5:
                bu0 bu0Var = (bu0) obj;
                pg.s1 s1Var = bu0Var.K1;
                bu0Var.t0(s1Var, null);
                pg.u0.e(i11).j(s1Var.f45778c);
                return;
            case 6:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                return;
            case 7:
                ea0 ea0Var = ((tg.r0) obj).f48403e;
                try {
                    if (ea0Var.getLayout().getLineForOffset(i11) == 0) {
                        ea0Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 9:
                of.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 10:
                ConnectionsManager.getInstance(((yh.m5) obj).f52878a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f54518b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f54517a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.f54519c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new r(fVar, max, 11), max);
                    return;
                }
                return;
        }
    }

    public r(Object obj, int i10, int i11) {
        this.f35400a = i11;
        this.f35402c = obj;
        this.f35401b = i10;
    }
}
