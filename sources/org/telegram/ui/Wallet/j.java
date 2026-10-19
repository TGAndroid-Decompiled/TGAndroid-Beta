package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gt0;
import org.telegram.ui.z70;
public final class j implements Runnable {
    public final int f34363a;
    public final int f34364b;
    public final Object f34365c;

    public j(int i10, Object obj, int i11) {
        this.f34363a = i11;
        this.f34364b = i10;
        this.f34365c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f34363a;
        Object obj = this.f34365c;
        final int i11 = this.f34364b;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj;
                HashSet hashSet = m0Var.E;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    m0Var.Q();
                    return;
                }
                return;
            case 1:
                m0 w9 = m0.w(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                b0 b0Var = new b0(notificationCenter, (z70) obj, w9);
                notificationCenter.addObserver(b0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(b0Var, 10000L);
                if (w9.e == null && w9.A < 0) {
                    w9.W();
                }
                w9.U();
                b0Var.a();
                return;
            case 2:
                p5 p5Var = (p5) obj;
                AndroidUtilities.runOnUIThread(new x31(p5Var, i11, p5.h(p5Var.R, i11), 19));
                return;
            case 3:
                m6 m6Var = (m6) obj;
                if (m6Var.f34526r && !m6Var.f34529x && i11 == m6Var.f34523k0) {
                    m6Var.postDelayed(m6Var.f34524l0, 500L);
                    return;
                }
                return;
            case 4:
                w7 w7Var = (w7) obj;
                ArrayList arrayList = w7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) w7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((ha) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        w7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                r9 r9Var = (r9) obj;
                if (!r9Var.f34809n && i11 == r9Var.I) {
                    r9Var.K = false;
                    r9Var.f32025a.W2.N(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    try {
                        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        b2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 7:
                rg.j jVar = (rg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                duration.setInterpolator(bs.f25012f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 8:
                gt0 gt0Var = (gt0) obj;
                qg.t1 t1Var = gt0Var.K1;
                gt0Var.t0(t1Var, null);
                qg.v0.e(i11).j(t1Var.f44651c);
                return;
            case 9:
                rg.n2 n2Var = (rg.n2) obj;
                n2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                n2Var.h();
                return;
            case 10:
                x90 x90Var = ((ug.q0) obj).e;
                try {
                    if (x90Var.getLayout().getLineForOffset(i11) == 0) {
                        x90Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.d5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public j(Object obj, int i10, int i11) {
        this.f34363a = i11;
        this.f34365c = obj;
        this.f34364b = i10;
    }
}
