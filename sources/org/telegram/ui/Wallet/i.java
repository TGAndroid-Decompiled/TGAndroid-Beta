package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.is;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.tf0;
public final class i implements Runnable {
    public final int f35063a;
    public final int f35064b;
    public final Object f35065c;

    public i(int i10, Object obj, int i11) {
        this.f35063a = i11;
        this.f35064b = i10;
        this.f35065c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f35063a;
        boolean z10 = false;
        int i11 = this.f35064b;
        Object obj = this.f35065c;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                HashSet hashSet = k0Var.A;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    k0Var.P();
                    return;
                }
                return;
            case 1:
                k0 v = k0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                z zVar = new z(notificationCenter, (tf0) obj, v);
                notificationCenter.addObserver(zVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(zVar, 10000L);
                if (v.f35158e == null && v.f35174w < 0) {
                    v.U();
                }
                v.S();
                zVar.a();
                return;
            case 2:
                d6 d6Var = (d6) obj;
                if (d6Var.f34836r && !d6Var.f34839x && i11 == d6Var.f34833k0) {
                    d6Var.postDelayed(d6Var.f34834l0, 500L);
                    return;
                }
                return;
            case 3:
                b7 b7Var = (b7) obj;
                ArrayList arrayList = b7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) b7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((i9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        b7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                t8 t8Var = (t8) obj;
                if (!t8Var.f35585n && i11 == t8Var.I) {
                    t8Var.K = false;
                    t8Var.f26629a.W2.N(true);
                    return;
                }
                return;
            case 5:
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
                duration.setInterpolator(is.f27443f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
            case 6:
                bu0 bu0Var = (bu0) obj;
                pg.s1 s1Var = bu0Var.K1;
                bu0Var.t0(s1Var, null);
                pg.u0.e(i11).j(s1Var.f45824c);
                return;
            case 7:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                return;
            case 8:
                fa0 fa0Var = ((tg.r0) obj).f48449e;
                try {
                    if (fa0Var.getLayout().getLineForOffset(i11) == 0) {
                        fa0Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 10:
                of.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 11:
                ConnectionsManager.getInstance(((yh.m5) obj).f52924a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f54564b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f54563a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.f54565c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new i(fVar, max, 12), max);
                    return;
                }
                return;
        }
    }

    public i(Object obj, int i10, int i11) {
        this.f35063a = i11;
        this.f35065c = obj;
        this.f35064b = i10;
    }
}
