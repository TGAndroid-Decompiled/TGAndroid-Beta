package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cf0 extends org.telegram.ui.Components.tw0 {
    public int E;
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public Bundle L;
    public boolean M;
    public Timer N;
    public final Object O;
    public int P;
    public double Q;
    public boolean R;
    public Bundle S;
    public TLRPC.TL_auth_sentCode T;
    public final ze0 U;
    public final ze0 V;
    public float W;
    public final int f34925a;
    public final bh0 f34926a0;
    public final org.telegram.ui.Components.yd0 f34927b;
    public final di.g2 f34928c;
    public final org.telegram.ui.Components.voip.l2 d;
    public final TextView e;
    public final TextView f34929f;
    public final org.telegram.ui.Components.bk0 h;
    public final TextView f34930n;
    public final TextView f34931r;
    public final TextView f34932s;
    public final cg0 v;
    public boolean f34933w;
    public boolean f34934x;
    public boolean f34935y;

    public cf0(org.telegram.ui.bh0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cf0.<init>(org.telegram.ui.bh0, android.content.Context, int):void");
    }

    public static String t(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        if (i10 <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        bh0 bh0Var = this.f34926a0;
        bh0Var.k1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            bh0Var.u1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override
    public final void d() {
        this.R = false;
    }

    @Override
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.R) {
            return;
        }
        String obj = this.f34928c.getText().toString();
        if (obj.length() == 0) {
            s(false);
        } else if (!p(obj)) {
            s(true);
        } else {
            this.R = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.G;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.H;
            tL_auth_signIn.flags |= 1;
            bh0 bh0Var = this.f34926a0;
            bh0Var.n1(bh0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new ve0(this, tL_auth_signIn, 0), 10), true);
            bh0Var.v1(true, true);
        }
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ze0(this, 3), bh0.f34542t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f34925a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.f34925a, this.L);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        cg0 cg0Var = this.v;
        if (bundle == null) {
            if (this.S != null && this.T != null) {
                cg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false));
                int i13 = this.E;
                if (i13 == 17) {
                    i12 = R.string.ReturnEnteringPhrase;
                } else if (i13 == 16) {
                    i12 = R.string.ReturnEnteringWord;
                } else if (i13 == 3) {
                    i12 = R.string.ReturnPhoneCall;
                } else {
                    i12 = R.string.ReturnEnteringSMS;
                }
                cg0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i12), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        di.g2 g2Var = this.f34928c;
        g2Var.setText("");
        this.L = bundle;
        this.K = null;
        this.E = bundle.getInt("nextType");
        this.F = bundle.getInt("prevType", 0);
        this.I = bundle.getString("ephone");
        if (this.L.containsKey("beginning")) {
            this.K = this.L.getString("beginning");
        }
        this.G = bundle.getString("phoneFormated");
        this.H = bundle.getString("phoneHash");
        this.J = this.L.getString("phone");
        this.P = bundle.getInt("timeout");
        int i14 = this.F;
        org.telegram.ui.Components.voip.l2 l2Var = this.d;
        if (i14 == 17) {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 == 16) {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 3 && i14 != 15) {
            l2Var.setVisibility(8);
        } else {
            l2Var.setVisibility(0);
            l2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        bh0 bh0Var = this.f34926a0;
        bh0Var.f34561o0 = false;
        cg0Var.invalidate();
        if (this.f34925a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + jf.b.c().b(jf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.f34931r;
        if (str2 == null) {
            if (!z11) {
                i11 = R.string.SMSWordText;
            } else {
                i11 = R.string.SMSPhraseText;
            }
            org.telegram.messenger.yh.q(i11, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i10 = R.string.SMSWordBeginningText;
            } else {
                i10 = R.string.SMSPhraseBeginningText;
            }
            org.telegram.messenger.yh.q(i10, new Object[]{str, str2}, textView);
        }
        bh0.T0(bh0Var, g2Var);
        g2Var.requestFocus();
        org.telegram.ui.Components.bk0 bk0Var = this.h;
        if (bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().N(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new zz(bk0Var, 21), 500L);
        q(false);
        o(false);
        this.Q = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.g6.f20288y6;
        cg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        int i16 = this.E;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            cg0Var.setVisibility(8);
        } else if (this.N != null) {
        } else {
            cg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            cg0Var.setTag(R.id.color_key_tag, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.N = timer;
            timer.schedule(new bf0(this), 0L, 1000L);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        bh0 bh0Var = this.f34926a0;
        this.f34930n.setTextColor(bh0Var.getThemedColor(i10));
        this.f34931r.setTextColor(bh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.D6));
        int themedColor = bh0Var.getThemedColor(i10);
        di.g2 g2Var = this.f34928c;
        g2Var.setTextColor(themedColor);
        g2Var.setCursorColor(bh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20045l6));
        g2Var.setHintTextColor(bh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        this.f34927b.f();
    }

    public final void o(boolean z10) {
        float f7;
        this.f34934x = z10;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f34927b.a(f7);
        float f11 = (f7 * 0.1f) + 0.9f;
        float f12 = -5.0f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        org.telegram.messenger.yh.s(translationY, esVar, 290L);
        if (this.f34933w && !this.f34934x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        ViewPropertyAnimator alpha = this.f34929f.animate().scaleX(f13).scaleY(f13).alpha(f10);
        float f14 = 1.0f - f10;
        if (this.f34934x) {
            f12 = 5.0f;
        }
        alpha.translationY(f14 * AndroidUtilities.dp(f12)).setInterpolator(esVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.K != null) {
            String lowerCase = t(str).toLowerCase();
            String lowerCase2 = this.K.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        ze0 ze0Var = this.U;
        AndroidUtilities.cancelRunOnUIThread(ze0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f34928c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34933w != z11) {
            this.f34933w = z11;
            float f15 = -5.0f;
            float f16 = 0.9f;
            float f17 = 0.7f;
            TextView textView = this.f34932s;
            TextView textView2 = this.f34929f;
            float f18 = 0.0f;
            float f19 = 1.0f;
            if (z10) {
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (z11) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f17);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                scaleY.setInterpolator(esVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f34933w && !this.f34934x) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14);
                if (this.f34933w && !this.f34934x) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f16);
                if (!this.f34933w || this.f34934x) {
                    f19 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f19);
                if (!this.f34933w || this.f34934x) {
                    if (this.f34934x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                alpha2.translationY(f18).setInterpolator(esVar).setDuration(300L).start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                textView.setAlpha(f7);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.7f;
                }
                textView.setScaleX(f10);
                if (z11) {
                    f17 = 1.0f;
                }
                textView.setScaleY(f17);
                if (this.f34933w && !this.f34934x) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.9f;
                }
                textView2.setScaleX(f11);
                if (this.f34933w && !this.f34934x) {
                    f16 = 1.0f;
                }
                textView2.setScaleY(f16);
                if (!this.f34933w || this.f34934x) {
                    f19 = 0.0f;
                }
                textView2.setAlpha(f19);
                if (!this.f34933w || this.f34934x) {
                    if (this.f34934x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                textView2.setTranslationY(f18);
            }
        }
        AndroidUtilities.runOnUIThread(ze0Var, 5000L);
    }

    public final void r() {
        cg0 cg0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.f20288y6;
        cg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.O) {
                Timer timer = this.N;
                if (timer != null) {
                    timer.cancel();
                    this.N = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        di.g2 g2Var = this.f34928c;
        if (this.f34926a0.getParentActivity() == null) {
            return;
        }
        try {
            g2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f34925a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.e;
        if (z10) {
            if (!z11) {
                i11 = R.string.SMSWordBeginningError;
            } else {
                i11 = R.string.SMSPhraseBeginningError;
            }
            textView.setText(LocaleController.getString(i11));
        } else if (TextUtils.isEmpty(g2Var.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i10 = R.string.SMSWordError;
            } else {
                i10 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i10));
        }
        if (!this.f34934x && !this.f34935y) {
            AndroidUtilities.shakeViewSpring(g2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        ze0 ze0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(ze0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ze0Var, 10000L);
        this.W = -this.W;
    }
}
