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
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
import org.telegram.ui.it0;
public final class j implements Runnable {
    public final int f34342a;
    public final int f34343b;
    public final Object f34344c;

    public j(int i10, Object obj, int i11) {
        this.f34342a = i11;
        this.f34343b = i10;
        this.f34344c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f34342a;
        Object obj = this.f34344c;
        final int i11 = this.f34343b;
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
                b0 b0Var = new b0(notificationCenter, (b80) obj, w9);
                notificationCenter.addObserver(b0Var, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(b0Var, 10000L);
                if (w9.e == null && w9.A < 0) {
                    w9.W();
                }
                w9.U();
                b0Var.a();
                return;
            case 2:
                o5 o5Var = (o5) obj;
                AndroidUtilities.runOnUIThread(new w31(o5Var, i11, o5.h(o5Var.R, i11), 19));
                return;
            case 3:
                m6 m6Var = (m6) obj;
                if (m6Var.f34552r && !m6Var.f34555x && i11 == m6Var.f34549k0) {
                    m6Var.postDelayed(m6Var.f34550l0, 500L);
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
                            ((ga) arrayList.get(i11)).setText(split[i12]);
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
                if (!r9Var.f34791n && i11 == r9Var.I) {
                    r9Var.K = false;
                    r9Var.f31190a.W2.N(true);
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
                duration.setInterpolator(bs.f25030f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 8:
                it0 it0Var = (it0) obj;
                qg.s1 s1Var = it0Var.K1;
                it0Var.t0(s1Var, null);
                qg.u0.e(i11).j(s1Var.f44647c);
                return;
            case 9:
                rg.m2 m2Var = (rg.m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
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
        this.f34342a = i11;
        this.f34344c = obj;
        this.f34343b = i10;
    }
}
