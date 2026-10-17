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
import org.telegram.ui.Components.x90;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
import org.telegram.ui.it0;
public final class j implements Runnable {
    public final int f34340a;
    public final int f34341b;
    public final Object f34342c;

    public j(int i10, Object obj, int i11) {
        this.f34340a = i11;
        this.f34341b = i10;
        this.f34342c = obj;
    }

    @Override
    public final void run() {
        CharSequence text;
        int i10 = this.f34340a;
        Object obj = this.f34342c;
        final int i11 = this.f34341b;
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
                p6 p6Var = (p6) obj;
                if (p6Var.f34744r && !p6Var.f34747x && i11 == p6Var.f34741k0) {
                    p6Var.postDelayed(p6Var.f34742l0, 500L);
                    return;
                }
                return;
            case 3:
                z7 z7Var = (z7) obj;
                ArrayList arrayList = z7Var.v;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) z7Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i12 = 0; i11 < arrayList.size() && i12 < split.length; i12++) {
                            ((ia) arrayList.get(i11)).setText(split[i12]);
                            i11++;
                        }
                        z7Var.Y();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                t9 t9Var = (t9) obj;
                if (!t9Var.f34910n && i11 == t9Var.I) {
                    t9Var.K = false;
                    t9Var.f31190a.W2.N(true);
                    return;
                }
                return;
            case 5:
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
                duration.setInterpolator(bs.f25030f);
                jVar.P.addUpdateListener(new rg.f(jVar, 5));
                jVar.P.addListener(new rg.g(jVar, 2));
                jVar.P.start();
                return;
            case 7:
                it0 it0Var = (it0) obj;
                qg.s1 s1Var = it0Var.K1;
                it0Var.t0(s1Var, null);
                qg.u0.e(i11).j(s1Var.f44669c);
                return;
            case 8:
                rg.m2 m2Var = (rg.m2) obj;
                m2Var.getClass();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.customStickerCreated, Boolean.FALSE);
                m2Var.h();
                return;
            case 9:
                x90 x90Var = ((ug.p0) obj).e;
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
        this.f34340a = i11;
        this.f34342c = obj;
        this.f34341b = i10;
    }
}
