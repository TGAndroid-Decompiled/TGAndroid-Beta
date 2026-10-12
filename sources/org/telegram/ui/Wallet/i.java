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
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.js;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.og0;
public final class i implements Runnable {
    public final int f34874a;
    public final int f34875b;
    public final Object f34876c;

    public i(int i10, Object obj, int i11) {
        this.f34874a = i11;
        this.f34875b = i10;
        this.f34876c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f34874a;
        boolean z10 = false;
        int i11 = this.f34875b;
        Object obj = this.f34876c;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) obj;
                HashSet hashSet = l0Var.A;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    l0Var.P();
                    return;
                }
                return;
            case 1:
                l0 v = l0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                a0 a0Var = new a0(notificationCenter, (og0) obj, v);
                notificationCenter.addObserver(a0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(a0Var, 10000L);
                if (v.f34997e == null && v.f35013w < 0) {
                    v.U();
                }
                v.S();
                a0Var.a();
                return;
            case 2:
                e6 e6Var = (e6) obj;
                if (e6Var.f34675r && !e6Var.f34678x && i11 == e6Var.f34672k0) {
                    e6Var.postDelayed(e6Var.f34673l0, 500L);
                    return;
                }
                return;
            case 3:
                c7 c7Var = (c7) obj;
                ArrayList arrayList = c7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) c7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((j9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        c7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                u8 u8Var = (u8) obj;
                if (!u8Var.f35425n && i11 == u8Var.I) {
                    u8Var.K = false;
                    u8Var.f27773a.W2.N(true);
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
                duration.setInterpolator(js.f27627f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
            case 6:
                cu0 cu0Var = (cu0) obj;
                pg.r1 r1Var = cu0Var.K1;
                cu0Var.t0(r1Var, null);
                pg.t0.e(i11).j(r1Var.f45653c);
                return;
            case 7:
                qg.o2 o2Var = (qg.o2) obj;
                o2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                o2Var.h();
                return;
            case 8:
                ia0 ia0Var = ((tg.q0) obj).f48610e;
                try {
                    if (ia0Var.getLayout().getLineForOffset(i11) == 0) {
                        ia0Var.getEditableText().insert(i11, "\n");
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
                ((org.telegram.ui.ActionBar.b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 10:
                of.f.s(((yh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            case 11:
                ConnectionsManager.getInstance(((yh.n5) obj).f53134a).cancelRequest(i11, true);
                return;
            default:
                zg.f fVar = (zg.f) obj;
                if (fVar.f54744b) {
                    Utilities.Callback callback = fVar.d;
                    if (callback != null) {
                        if (i11 < 300) {
                            z10 = true;
                        }
                        callback.run(Boolean.valueOf(z10));
                        try {
                            fVar.f54743a.performHapticFeedback(3);
                        } catch (Exception unused3) {
                        }
                    }
                    fVar.f54745c = true;
                    int max = Math.max(50, i11 - 100);
                    AndroidUtilities.runOnUIThread(new i(fVar, max, 12), max);
                    return;
                }
                return;
        }
    }

    public i(Object obj, int i10, int i11) {
        this.f34874a = i11;
        this.f34876c = obj;
        this.f34875b = i10;
    }
}
