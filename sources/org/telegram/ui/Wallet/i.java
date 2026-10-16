package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gu0;
import org.telegram.ui.se0;
public final class i implements Runnable {
    public final int f33000a;
    public final int f33001b;
    public final Object f33002c;

    public i(int i10, Object obj, int i11) {
        this.f33000a = i11;
        this.f33001b = i10;
        this.f33002c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f33000a;
        final int i11 = this.f33001b;
        Object obj = this.f33002c;
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
                z zVar = new z(notificationCenter, (se0) obj, v);
                notificationCenter.addObserver(zVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(zVar, 10000L);
                if (v.e == null && v.f33110w < 0) {
                    v.U();
                }
                v.S();
                zVar.a();
                return;
            case 2:
                c6 c6Var = (c6) obj;
                if (c6Var.f32758r && !c6Var.f32761x && i11 == c6Var.f32755k0) {
                    c6Var.postDelayed(c6Var.f32756l0, 500L);
                    return;
                }
                return;
            case 3:
                a7 a7Var = (a7) obj;
                ArrayList arrayList = a7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) a7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((h9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        a7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                s8 s8Var = (s8) obj;
                if (!s8Var.f33436n && i11 == s8Var.I) {
                    s8Var.K = false;
                    s8Var.f24003a.W2.N(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    try {
                        a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(UserConfig.selectedAccount).cancelRequest(i11, true);
                            }
                        });
                        a2VarArr[0].show();
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 6:
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
                duration.setInterpolator(es.f24465f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                gu0 gu0Var = (gu0) obj;
                qg.q1 q1Var = gu0Var.K1;
                gu0Var.t0(q1Var, null);
                qg.s0.e(i11).j(q1Var.f43287c);
                return;
            case 8:
                rg.p2 p2Var = (rg.p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                return;
            case 9:
                da0 da0Var = ((ug.r0) obj).e;
                try {
                    if (da0Var.getLayout().getLineForOffset(i11) == 0) {
                        da0Var.getEditableText().insert(i11, "\n");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 10:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 11:
                pf.d.r(((zh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            default:
                ConnectionsManager.getInstance(((zh.n5) obj).f50865a).cancelRequest(i11, true);
                return;
        }
    }

    public i(Object obj, int i10, int i11) {
        this.f33000a = i11;
        this.f33002c = obj;
        this.f33001b = i10;
    }
}
