package org.telegram.ui;

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
public final class li1 implements Runnable {
    public final int f38026a;
    public final int f38027b;
    public final Object f38028c;

    public li1(int i10, Object obj, int i11) {
        this.f38026a = i11;
        this.f38027b = i10;
        this.f38028c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f38026a;
        final int i11 = this.f38027b;
        Object obj = this.f38028c;
        switch (i10) {
            case 0:
                dj1 dj1Var = (dj1) obj;
                dj1Var.F.setSignalBarCount(i11);
                if (i11 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = dj1Var.v;
                    if (b3Var.V != 3) {
                        b3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.H, 255);
                        b3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.O.setDuration(500L);
                        b3Var.O.start();
                    }
                    dj1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.b3 b3Var2 = dj1Var.v;
                if (b3Var2.V != 2) {
                    b3Var2.V = 2;
                    b3Var2.c();
                    ValueAnimator valueAnimator = b3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        b3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(b3Var2.H, 0);
                    b3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var2, 0));
                    b3Var2.O.setDuration(500L);
                    b3Var2.O.start();
                }
                dj1Var.F.c(false);
                return;
            case 1:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj;
                HashSet hashSet = j0Var.A;
                hashSet.remove(Integer.valueOf(i11));
                if (hashSet.isEmpty()) {
                    j0Var.P();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i11);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
                org.telegram.ui.Wallet.y yVar = new org.telegram.ui.Wallet.y(notificationCenter, (wc0) obj, v);
                notificationCenter.addObserver(yVar, NotificationCenter.walletUpdate);
                AndroidUtilities.runOnUIThread(yVar, 10000L);
                if (v.e == null && v.f33337w < 0) {
                    v.U();
                }
                v.S();
                yVar.a();
                return;
            case 3:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                if (b6Var.f32982r && !b6Var.f32985x && i11 == b6Var.f32979k0) {
                    b6Var.postDelayed(b6Var.f32980l0, 500L);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) obj;
                ArrayList arrayList = z6Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) z6Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((org.telegram.ui.Wallet.h9) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        z6Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj;
                if (!r8Var.f33662n && i11 == r8Var.I) {
                    r8Var.K = false;
                    r8Var.f23964a.W2.N(true);
                    return;
                }
                return;
            case 6:
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
            case 7:
                rg.j jVar = (rg.j) obj;
                jVar.L = i11;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
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
                duration.setInterpolator(org.telegram.ui.Components.es.f24771f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 8:
                hu0 hu0Var = (hu0) obj;
                qg.q1 q1Var = hu0Var.K1;
                hu0Var.t0(q1Var, null);
                qg.s0.e(i11).j(q1Var.f43545c);
                return;
            case 9:
                rg.p2 p2Var = (rg.p2) obj;
                p2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                p2Var.h();
                return;
            case 10:
                org.telegram.ui.Components.da0 da0Var = ((ug.r0) obj).e;
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
            case 11:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(i11).clientUserId);
                ((org.telegram.ui.ActionBar.b5) obj).getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                return;
            case 12:
                pf.d.s(((zh.g) obj).getParentActivity(), LocaleController.getString(i11));
                return;
            default:
                ConnectionsManager.getInstance(((zh.n5) obj).f50864a).cancelRequest(i11, true);
                return;
        }
    }

    public li1(Object obj, int i10, int i11) {
        this.f38026a = i11;
        this.f38028c = obj;
        this.f38027b = i10;
    }
}
