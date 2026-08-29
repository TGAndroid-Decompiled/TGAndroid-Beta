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
public final class fe0 extends org.telegram.ui.Components.mv0 {
    public int A;
    public int B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public Bundle H;
    public boolean I;
    public Timer J;
    public final Object K;
    public int L;
    public double M;
    public boolean N;
    public Bundle O;
    public TLRPC.TL_auth_sentCode P;
    public final ce0 Q;
    public final ce0 R;
    public float S;
    public final fg0 T;
    public final int f38123a;
    public final org.telegram.ui.Components.uc0 f38124b;
    public final ig.f f38125c;
    public final org.telegram.ui.Components.voip.p2 d;
    public final TextView f38126e;
    public final TextView f38127f;
    public final org.telegram.ui.Components.aj0 h;
    public final TextView f38128n;
    public final TextView f38129r;
    public final TextView f38130s;
    public final gf0 v;
    public boolean f38131w;
    public boolean f38132x;
    public boolean f38133y;

    public fe0(org.telegram.ui.fg0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fe0.<init>(org.telegram.ui.fg0, android.content.Context, int):void");
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
        fg0 fg0Var = this.T;
        fg0Var.k1(true, true);
        int i10 = this.B;
        if (i10 != 0) {
            fg0Var.u1(i10, true, null, true);
            return false;
        }
        this.H = null;
        this.N = false;
        return true;
    }

    @Override
    public final void d() {
        this.N = false;
    }

    @Override
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.N) {
            return;
        }
        String obj = this.f38125c.getText().toString();
        if (obj.length() == 0) {
            s(false);
        } else if (!p(obj)) {
            s(true);
        } else {
            this.N = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.C;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.D;
            tL_auth_signIn.flags |= 1;
            fg0 fg0Var = this.T;
            fg0Var.n1(fg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new yd0(this, tL_auth_signIn, 0), 10), true);
            fg0Var.v1(true, true);
        }
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ce0(this, 3), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f38123a);
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.H != null) {
            bundle.putBundle("recoveryview_word" + this.f38123a, this.H);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        gf0 gf0Var = this.v;
        if (bundle == null) {
            if (this.O != null && this.P != null) {
                gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
                int i13 = this.A;
                if (i13 == 17) {
                    i12 = R.string.ReturnEnteringPhrase;
                } else if (i13 == 16) {
                    i12 = R.string.ReturnEnteringWord;
                } else if (i13 == 3) {
                    i12 = R.string.ReturnPhoneCall;
                } else {
                    i12 = R.string.ReturnEnteringSMS;
                }
                gf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i12), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        ig.f fVar = this.f38125c;
        fVar.setText("");
        this.H = bundle;
        this.G = null;
        this.A = bundle.getInt("nextType");
        this.B = bundle.getInt("prevType", 0);
        this.E = bundle.getString("ephone");
        if (this.H.containsKey("beginning")) {
            this.G = this.H.getString("beginning");
        }
        this.C = bundle.getString("phoneFormated");
        this.D = bundle.getString("phoneHash");
        this.F = this.H.getString("phone");
        this.L = bundle.getInt("timeout");
        int i14 = this.B;
        org.telegram.ui.Components.voip.p2 p2Var = this.d;
        if (i14 == 17) {
            p2Var.setVisibility(0);
            p2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 == 16) {
            p2Var.setVisibility(0);
            p2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 3 && i14 != 15) {
            p2Var.setVisibility(8);
        } else {
            p2Var.setVisibility(0);
            p2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        }
        this.O = null;
        this.P = null;
        this.N = false;
        this.I = false;
        fg0 fg0Var = this.T;
        fg0Var.f38166k0 = false;
        gf0Var.invalidate();
        if (this.f38123a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + qe.b.c().b(qe.b.d(this.F, false));
        String str2 = this.G;
        TextView textView = this.f38129r;
        if (str2 == null) {
            if (!z11) {
                i11 = R.string.SMSWordText;
            } else {
                i11 = R.string.SMSPhraseText;
            }
            b.p(i11, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i10 = R.string.SMSWordBeginningText;
            } else {
                i10 = R.string.SMSPhraseBeginningText;
            }
            b.p(i10, new Object[]{str, str2}, textView);
        }
        fg0.T0(fg0Var, fVar);
        fVar.requestFocus();
        org.telegram.ui.Components.aj0 aj0Var = this.h;
        if (aj0Var.getAnimatedDrawable() != null) {
            aj0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new q00(aj0Var, 20), 500L);
        q(false);
        o(false);
        this.M = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.g6.f23433y6;
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        int i16 = this.A;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            gf0Var.setVisibility(8);
        } else if (this.J != null) {
        } else {
            gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.J = timer;
            timer.schedule(new ee0(this), 0L, 1000L);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        fg0 fg0Var = this.T;
        this.f38128n.setTextColor(fg0Var.getThemedColor(i10));
        this.f38129r.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.D6));
        int themedColor = fg0Var.getThemedColor(i10);
        ig.f fVar = this.f38125c;
        fVar.setTextColor(themedColor);
        fVar.setCursorColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23206l6));
        fVar.setHintTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        this.f38124b.f();
    }

    public final void o(boolean z10) {
        float f9;
        this.f38132x = z10;
        float f10 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f38124b.a(f9);
        float f11 = (f9 * 0.1f) + 0.9f;
        float f12 = -5.0f;
        ViewPropertyAnimator translationY = this.f38126e.animate().scaleX(f11).scaleY(f11).alpha(f9).translationY((1.0f - f9) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        b.q(translationY, jrVar, 290L);
        if (this.f38131w && !this.f38132x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        ViewPropertyAnimator alpha = this.f38127f.animate().scaleX(f13).scaleY(f13).alpha(f10);
        float f14 = 1.0f - f10;
        if (this.f38132x) {
            f12 = 5.0f;
        }
        alpha.translationY(f14 * AndroidUtilities.dp(f12)).setInterpolator(jrVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.G != null) {
            String lowerCase = t(str).toLowerCase();
            String lowerCase2 = this.G.toLowerCase();
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
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        ce0 ce0Var = this.Q;
        AndroidUtilities.cancelRunOnUIThread(ce0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f38125c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f38131w != z11) {
            this.f38131w = z11;
            float f15 = -5.0f;
            float f16 = 0.9f;
            float f17 = 0.7f;
            TextView textView = this.f38130s;
            TextView textView2 = this.f38127f;
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
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
                scaleY.setInterpolator(jrVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f38131w && !this.f38132x) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14);
                if (this.f38131w && !this.f38132x) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = scaleX2.scaleY(f16).alpha((!this.f38131w || this.f38132x) ? 0.0f : 0.0f);
                if (!this.f38131w || this.f38132x) {
                    if (this.f38132x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                alpha2.translationY(f18).setInterpolator(jrVar).setDuration(300L).start();
            } else {
                if (z11) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                textView.setAlpha(f9);
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
                if (this.f38131w && !this.f38132x) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.9f;
                }
                textView2.setScaleX(f11);
                if (this.f38131w && !this.f38132x) {
                    f16 = 1.0f;
                }
                textView2.setScaleY(f16);
                textView2.setAlpha((!this.f38131w || this.f38132x) ? 0.0f : 0.0f);
                if (!this.f38131w || this.f38132x) {
                    if (this.f38132x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                textView2.setTranslationY(f18);
            }
        }
        AndroidUtilities.runOnUIThread(ce0Var, 5000L);
    }

    public final void r() {
        gf0 gf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.g6.f23433y6;
        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.K) {
                Timer timer = this.J;
                if (timer != null) {
                    timer.cancel();
                    this.J = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        ig.f fVar = this.f38125c;
        if (this.T.getParentActivity() == null) {
            return;
        }
        try {
            fVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f38123a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.f38126e;
        if (z10) {
            if (!z11) {
                i11 = R.string.SMSWordBeginningError;
            } else {
                i11 = R.string.SMSPhraseBeginningError;
            }
            textView.setText(LocaleController.getString(i11));
        } else if (TextUtils.isEmpty(fVar.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i10 = R.string.SMSWordError;
            } else {
                i10 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i10));
        }
        if (!this.f38132x && !this.f38133y) {
            AndroidUtilities.shakeViewSpring(fVar, this.S);
            AndroidUtilities.shakeViewSpring(textView, this.S);
        }
        ce0 ce0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(ce0Var);
        o(true);
        AndroidUtilities.runOnUIThread(ce0Var, 10000L);
        this.S = -this.S;
    }
}
