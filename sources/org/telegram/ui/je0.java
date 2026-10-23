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
public final class je0 extends org.telegram.ui.Components.tw0 {
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
    public final ge0 U;
    public final ge0 V;
    public float W;
    public final int f38539a;
    public final ig0 f38540a0;
    public final org.telegram.ui.Components.vd0 f38541b;
    public final ei.e2 f38542c;
    public final gd0 d;
    public final TextView e;
    public final TextView f38543f;
    public final org.telegram.ui.Components.bk0 h;
    public final TextView f38544n;
    public final TextView f38545r;
    public final TextView f38546s;
    public final kf0 v;
    public boolean f38547w;
    public boolean f38548x;
    public boolean f38549y;

    public je0(org.telegram.ui.ig0 r32, android.content.Context r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.je0.<init>(org.telegram.ui.ig0, android.content.Context, int):void");
    }

    public static String s(String str) {
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
        ig0 ig0Var = this.f38540a0;
        ig0Var.o1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            ig0Var.y1(i10, true, null, true);
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
        String obj = this.f38542c.getText().toString();
        if (obj.length() == 0) {
            r(false);
        } else if (!o(obj)) {
            r(true);
        } else {
            this.R = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.G;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.H;
            tL_auth_signIn.flags |= 1;
            ig0 ig0Var = this.f38540a0;
            ig0Var.r1(ig0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new ce0(this, tL_auth_signIn, 0), 10), true);
            ig0Var.z1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ge0(this, 3), ig0.f38191x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f38539a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.f38539a, this.L);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        kf0 kf0Var = this.v;
        if (bundle == null) {
            if (this.S != null && this.T != null) {
                org.telegram.ui.ActionBar.r6.W(kf0Var, org.telegram.ui.ActionBar.k6.I6, null);
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
                kf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i12), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        ei.e2 e2Var = this.f38542c;
        e2Var.setText("");
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
        gd0 gd0Var = this.d;
        if (i14 == 17) {
            gd0Var.setVisibility(0);
            gd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 == 16) {
            gd0Var.setVisibility(0);
            gd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 3 && i14 != 15) {
            gd0Var.setVisibility(8);
        } else {
            gd0Var.setVisibility(0);
            gd0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        ig0 ig0Var = this.f38540a0;
        ig0Var.f38210o0 = false;
        kf0Var.invalidate();
        if (this.f38539a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + jf.b.c().b(jf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.f38545r;
        if (str2 == null) {
            if (!z11) {
                i11 = R.string.SMSWordText;
            } else {
                i11 = R.string.SMSPhraseText;
            }
            org.telegram.messenger.sl.r(i11, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i10 = R.string.SMSWordBeginningText;
            } else {
                i10 = R.string.SMSPhraseBeginningText;
            }
            org.telegram.messenger.sl.r(i10, new Object[]{str, str2}, textView);
        }
        ig0.V0(ig0Var, e2Var);
        e2Var.requestFocus();
        org.telegram.ui.Components.bk0 bk0Var = this.h;
        if (bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().N(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new fz(bk0Var, 22), 500L);
        p(false);
        n(false);
        this.Q = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.k6.f21571y6;
        org.telegram.ui.ActionBar.r6.W(kf0Var, i15, null);
        int i16 = this.E;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            kf0Var.setVisibility(8);
        } else if (this.N != null) {
        } else {
            org.telegram.ui.ActionBar.r6.W(kf0Var, i15, null);
            kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.N = timer;
            timer.schedule(new ie0(this), 0L, 1000L);
        }
    }

    public final void n(boolean z10) {
        float f7;
        this.f38548x = z10;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f38541b.a(f7);
        float f11 = (f7 * 0.1f) + 0.9f;
        float f12 = -5.0f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        org.telegram.messenger.sl.t(translationY, bsVar, 290L);
        if (this.f38547w && !this.f38548x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        ViewPropertyAnimator alpha = this.f38543f.animate().scaleX(f13).scaleY(f13).alpha(f10);
        float f14 = 1.0f - f10;
        if (this.f38548x) {
            f12 = 5.0f;
        }
        alpha.translationY(f14 * AndroidUtilities.dp(f12)).setInterpolator(bsVar).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.K != null) {
            String lowerCase = s(str).toLowerCase();
            String lowerCase2 = this.K.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }
        return true;
    }

    public final void p(boolean z10) {
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        ge0 ge0Var = this.U;
        AndroidUtilities.cancelRunOnUIThread(ge0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f38542c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f38547w != z11) {
            this.f38547w = z11;
            float f15 = -5.0f;
            float f16 = 0.9f;
            float f17 = 0.7f;
            TextView textView = this.f38546s;
            TextView textView2 = this.f38543f;
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
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                scaleY.setInterpolator(bsVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f38547w && !this.f38548x) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14);
                if (this.f38547w && !this.f38548x) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f16);
                if (!this.f38547w || this.f38548x) {
                    f19 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f19);
                if (!this.f38547w || this.f38548x) {
                    if (this.f38548x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                alpha2.translationY(f18).setInterpolator(bsVar).setDuration(300L).start();
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
                if (this.f38547w && !this.f38548x) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.9f;
                }
                textView2.setScaleX(f11);
                if (this.f38547w && !this.f38548x) {
                    f16 = 1.0f;
                }
                textView2.setScaleY(f16);
                if (!this.f38547w || this.f38548x) {
                    f19 = 0.0f;
                }
                textView2.setAlpha(f19);
                if (!this.f38547w || this.f38548x) {
                    if (this.f38548x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                textView2.setTranslationY(f18);
            }
        }
        AndroidUtilities.runOnUIThread(ge0Var, 5000L);
    }

    public final void q() {
        kf0 kf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.k6.f21571y6;
        org.telegram.ui.ActionBar.r6.W(kf0Var, i10, null);
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

    public final void r(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        ei.e2 e2Var = this.f38542c;
        if (this.f38540a0.getParentActivity() == null) {
            return;
        }
        try {
            e2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f38539a == 16) {
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
        } else if (TextUtils.isEmpty(e2Var.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i10 = R.string.SMSWordError;
            } else {
                i10 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i10));
        }
        if (!this.f38548x && !this.f38549y) {
            AndroidUtilities.shakeViewSpring(e2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        ge0 ge0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(ge0Var);
        n(true);
        AndroidUtilities.runOnUIThread(ge0Var, 10000L);
        this.W = -this.W;
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        ig0 ig0Var = this.f38540a0;
        this.f38544n.setTextColor(ig0Var.getThemedColor(i10));
        this.f38545r.setTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.k6.D6));
        int themedColor = ig0Var.getThemedColor(i10);
        ei.e2 e2Var = this.f38542c;
        e2Var.setTextColor(themedColor);
        e2Var.setCursorColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21327l6));
        e2Var.setHintTextColor(ig0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        this.f38541b.f();
    }
}
