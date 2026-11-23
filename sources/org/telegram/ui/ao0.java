package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ao0 implements Runnable {
    public final int f45780a;
    public final int f45781b;
    public final Object f45782c;

    public ao0(int i7, Object obj, int i10) {
        this.f45780a = i10;
        this.f45781b = i7;
        this.f45782c = obj;
    }

    @Override
    public final void run() {
        qq0 qq0Var;
        String str;
        CharSequence text;
        int i7;
        int i10 = this.f45780a;
        int i11 = 0;
        int i12 = this.f45781b;
        Object obj = this.f45782c;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                int i13 = i12 + 1;
                if (i13 < 6 && (qq0Var = photoViewer.f43334f0) != null) {
                    qq0Var.invalidate();
                    org.telegram.messenger.g0.h3(new ao0(photoViewer, i13, 0), 100L);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N0 = org.telegram.messenger.gd.N0(2131746451, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131746452, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new ai.n1(profileActivity, i12, 19));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 2:
                iw0 iw0Var = (iw0) obj;
                ProfileActivity profileActivity2 = iw0Var.h.f49218e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i12 == 2) {
                    profileActivity2.getMessagesController().s4(0L, "PREMIUM_GRACE");
                    vf.c.t(iw0Var.getContext(), profileActivity2.getMessagesController().O5);
                } else {
                    org.telegram.messenger.mp messagesController = profileActivity2.getMessagesController();
                    if (i12 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.s4(0L, str);
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, 107);
                profileActivity2.H5(false, false);
                return;
            case 3:
                wx0 wx0Var = (wx0) obj;
                org.telegram.messenger.g0.v1(wx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = wx0Var.f53782a;
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
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f43903f.remove(i12);
                sessionsActivity.r0();
                y21 y21Var = sessionsActivity.f43899a;
                if (y21Var != null) {
                    y21Var.f();
                    return;
                }
                return;
            case 5:
                fc1 fc1Var = (fc1) obj;
                fc1Var.G.setSignalBarCount(i12);
                if (i12 <= 1) {
                    org.telegram.ui.Components.voip.y2 y2Var = fc1Var.f47792w;
                    if (y2Var.W != 3) {
                        y2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(y2Var.I, 255);
                        y2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var, 2));
                        y2Var.P.setDuration(500L);
                        y2Var.P.start();
                    }
                    fc1Var.G.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.y2 y2Var2 = fc1Var.f47792w;
                if (y2Var2.W != 2) {
                    y2Var2.W = 2;
                    y2Var2.c();
                    ValueAnimator valueAnimator = y2Var2.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        y2Var2.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(y2Var2.I, 0);
                    y2Var2.P = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.w2(y2Var2, 0));
                    y2Var2.P.setDuration(500L);
                    y2Var2.P.start();
                }
                fc1Var.G.c(false);
                return;
            case 6:
                org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i12);
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i12);
                org.telegram.ui.Wallet.i0 i0Var = new org.telegram.ui.Wallet.i0(f10, (bd0) obj, D);
                f10.b(i0Var, 254);
                org.telegram.messenger.g0.h3(i0Var, 10000L);
                if (D.f45258e == null && D.C < 0) {
                    D.h0();
                }
                D.f0();
                i0Var.a();
                return;
            case 7:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj;
                HashSet hashSet = v0Var.G;
                hashSet.remove(Integer.valueOf(i12));
                if (hashSet.isEmpty()) {
                    v0Var.a0();
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.ks.f(i12).n((org.telegram.ui.Wallet.n2) obj, 254);
                return;
            case 9:
                org.telegram.ui.Wallet.q6 q6Var = (org.telegram.ui.Wallet.q6) obj;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.e21(q6Var, i12, org.telegram.ui.Wallet.q6.h(q6Var.R, i12), 19));
                return;
            case 10:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) obj;
                if (n7Var.f44770r && !n7Var.f44774y && i12 == n7Var.f44768l0) {
                    n7Var.postDelayed(n7Var.m0, 500L);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Wallet.v8 v8Var = (org.telegram.ui.Wallet.v8) obj;
                ArrayList arrayList = v8Var.f45317w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) v8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i12 < arrayList.size() && i11 < split.length) {
                            ((org.telegram.ui.Wallet.eb) arrayList.get(i12)).setText(split[i11]);
                            i12++;
                            i11++;
                        }
                        v8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) obj;
                if (!oaVar.f44843r && i12 == oaVar.K) {
                    oaVar.M = false;
                    oaVar.f34213a.f35323g3.O(true);
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.lx) obj).w0(i12, 0, null);
                return;
            case 14:
                tg.n nVar = (tg.n) obj;
                nVar.N = i12;
                nVar.M = true;
                try {
                    nVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = nVar.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = nVar.S;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                nVar.R = duration;
                duration.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                nVar.R.addUpdateListener(new tg.j(nVar, 5));
                nVar.R.addListener(new tg.k(nVar, 2));
                nVar.R.start();
                return;
            case 15:
                vp0 vp0Var = (vp0) obj;
                sg.g1 g1Var = vp0Var.f58052u1;
                vp0Var.v0(g1Var, null);
                sg.j0.e(i12).j(g1Var.f57337c);
                return;
            case 16:
                org.telegram.messenger.ks.f(i12).k(217, Boolean.FALSE);
                ((tg.i2) obj).h();
                return;
            case 17:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                if (t1Var2 != null) {
                    try {
                        t1Var2.setOnCancelListener(new h60(i12, 1));
                        t1VarArr[0].show();
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 18:
                org.telegram.ui.Components.j80 j80Var = ((wg.o0) obj).f59916e;
                try {
                    if (j80Var.getLayout().getLineForOffset(i12) == 0) {
                        j80Var.getEditableText().insert(i12, "\n");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                zi.d0 d0Var = ((zi.t) obj).N;
                if (d0Var != null && d0Var.f62197s != (i7 = ((i12 % 360) + 360) % 360)) {
                    d0Var.f62197s = i7;
                    d0Var.v();
                    return;
                }
                return;
        }
    }

    public ao0(Object obj, int i7, int i10) {
        this.f45780a = i10;
        this.f45782c = obj;
        this.f45781b = i7;
    }
}
