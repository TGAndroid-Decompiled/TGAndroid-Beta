package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jw0 implements Runnable {
    public final int f49111a;
    public final int f49112b;
    public final Object f49113c;

    public jw0(int i7, Object obj, int i10) {
        this.f49111a = i10;
        this.f49112b = i7;
        this.f49113c = obj;
    }

    @Override
    public final void run() {
        String str;
        CharSequence text;
        int i7;
        int i10 = this.f49111a;
        int i11 = 0;
        int i12 = this.f49112b;
        Object obj = this.f49113c;
        switch (i10) {
            case 0:
                kw0 kw0Var = (kw0) obj;
                ProfileActivity profileActivity = kw0Var.h.f49718e;
                profileActivity.getNotificationCenter().n(profileActivity, 107);
                if (i12 == 2) {
                    profileActivity.getMessagesController().s4(0L, "PREMIUM_GRACE");
                    vf.c.t(kw0Var.getContext(), profileActivity.getMessagesController().O5);
                } else {
                    org.telegram.messenger.np messagesController = profileActivity.getMessagesController();
                    if (i12 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.s4(0L, str);
                }
                profileActivity.getNotificationCenter().c(profileActivity, 107);
                profileActivity.H5(false, false);
                return;
            case 1:
                yx0 yx0Var = (yx0) obj;
                org.telegram.messenger.g0.v1(yx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f54323a;
                    if (i11 < editTextBoldCursorArr.length) {
                        if (i11 != 0 && ((i12 != 3 || i11 != 4) && ((i12 != 2 || (i11 != 4 && i11 != 1)) && (i12 != 1 || (i11 != 1 && i11 != 2 && i11 != 3))))) {
                            editTextBoldCursorArr[i11].setText((CharSequence) null);
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
            case 2:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f43822f.remove(i12);
                sessionsActivity.r0();
                a31 a31Var = sessionsActivity.f43818a;
                if (a31Var != null) {
                    a31Var.f();
                    return;
                }
                return;
            case 3:
                hc1 hc1Var = (hc1) obj;
                hc1Var.G.setSignalBarCount(i12);
                if (i12 <= 1) {
                    org.telegram.ui.Components.voip.x2 x2Var = hc1Var.f48370w;
                    if (x2Var.W != 3) {
                        x2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(x2Var.I, 255);
                        x2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.v2(x2Var, 2));
                        x2Var.P.setDuration(500L);
                        x2Var.P.start();
                    }
                    hc1Var.G.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.x2 x2Var2 = hc1Var.f48370w;
                if (x2Var2.W != 2) {
                    x2Var2.W = 2;
                    x2Var2.c();
                    ValueAnimator valueAnimator = x2Var2.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        x2Var2.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(x2Var2.I, 0);
                    x2Var2.P = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.v2(x2Var2, 0));
                    x2Var2.P.setDuration(500L);
                    x2Var2.P.start();
                }
                hc1Var.G.c(false);
                return;
            case 4:
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i12);
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(i12);
                org.telegram.ui.Wallet.h0 h0Var = new org.telegram.ui.Wallet.h0(f10, (fe0) obj, D);
                f10.b(h0Var, 254);
                org.telegram.messenger.g0.h3(h0Var, 10000L);
                if (D.f45130e == null && D.C < 0) {
                    D.h0();
                }
                D.f0();
                h0Var.a();
                return;
            case 5:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj;
                HashSet hashSet = u0Var.G;
                hashSet.remove(Integer.valueOf(i12));
                if (hashSet.isEmpty()) {
                    u0Var.a0();
                    return;
                }
                return;
            case 6:
                org.telegram.messenger.ls.f(i12).n((org.telegram.ui.Wallet.m2) obj, 254);
                return;
            case 7:
                org.telegram.ui.Wallet.p6 p6Var = (org.telegram.ui.Wallet.p6) obj;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.f21(p6Var, i12, org.telegram.ui.Wallet.p6.h(p6Var.R, i12), 19));
                return;
            case 8:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                if (m7Var.f44630r && !m7Var.f44634y && i12 == m7Var.f44628l0) {
                    m7Var.postDelayed(m7Var.m0, 500L);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) obj;
                ArrayList arrayList = u8Var.f45190w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) u8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i12 < arrayList.size() && i11 < split.length) {
                            ((org.telegram.ui.Wallet.db) arrayList.get(i12)).setText(split[i11]);
                            i12++;
                            i11++;
                        }
                        u8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj;
                if (!naVar.f44715r && i12 == naVar.K) {
                    naVar.M = false;
                    naVar.f34681a.f35789g3.O(true);
                    return;
                }
                return;
            case 11:
                ((org.telegram.ui.Components.ox) obj).w0(i12, 0, null);
                return;
            case 12:
                tg.j jVar = (tg.j) obj;
                jVar.M = i12;
                jVar.L = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.R;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.Q = duration;
                duration.setInterpolator(org.telegram.ui.Components.nr.f37960f);
                jVar.Q.addUpdateListener(new tg.f(jVar, 5));
                jVar.Q.addListener(new tg.g(jVar, 2));
                jVar.Q.start();
                return;
            case 13:
                vp0 vp0Var = (vp0) obj;
                sg.h1 h1Var = vp0Var.f57936u1;
                vp0Var.s0(h1Var, null);
                sg.k0.e(i12).j(h1Var.f57265c);
                return;
            case 14:
                org.telegram.messenger.ls.f(i12).k(217, Boolean.FALSE);
                ((tg.f2) obj).h();
                return;
            case 15:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    try {
                        t1Var.setOnCancelListener(new i60(i12, 1));
                        t1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 16:
                org.telegram.ui.Components.m80 m80Var = ((wg.p0) obj).f59856e;
                try {
                    if (m80Var.getLayout().getLineForOffset(i12) == 0) {
                        m80Var.getEditableText().insert(i12, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                zi.d0 d0Var = ((zi.t) obj).N;
                if (d0Var != null && d0Var.f62114s != (i7 = ((i12 % 360) + 360) % 360)) {
                    d0Var.f62114s = i7;
                    d0Var.v();
                    return;
                }
                return;
        }
    }

    public jw0(Object obj, int i7, int i10) {
        this.f49111a = i10;
        this.f49113c = obj;
        this.f49112b = i7;
    }
}
