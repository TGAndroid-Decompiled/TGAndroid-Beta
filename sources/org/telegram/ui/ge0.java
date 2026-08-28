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
public final class ge0 extends org.telegram.ui.Components.cv0 {
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
    public final de0 Q;
    public final de0 R;
    public float S;
    public final fg0 T;
    public final int f38518a;
    public final org.telegram.ui.Components.fc0 f38519b;
    public final fg.g f38520c;
    public final org.telegram.ui.Components.voip.m2 d;
    public final TextView f38521e;
    public final TextView f38522f;
    public final org.telegram.ui.Components.pi0 h;
    public final TextView f38523n;
    public final TextView f38524r;
    public final TextView f38525s;
    public final hf0 v;
    public boolean f38526w;
    public boolean f38527x;
    public boolean f38528y;

    public ge0(org.telegram.ui.fg0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ge0.<init>(org.telegram.ui.fg0, android.content.Context, int):void");
    }

    public static String t(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length && str.charAt(i9) <= ' ') {
            i9++;
        }
        if (i9 <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i9, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        fg0 fg0Var = this.T;
        fg0Var.k1(true, true);
        int i9 = this.B;
        if (i9 != 0) {
            fg0Var.u1(i9, true, null, true);
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
        String obj = this.f38520c.getText().toString();
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
            fg0Var.n1(fg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new zd0(this, tL_auth_signIn, 0), 10), true);
            fg0Var.v1(true, true);
        }
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new de0(this, 3), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f38518a);
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.H != null) {
            bundle.putBundle("recoveryview_word" + this.f38518a, this.H);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i9;
        int i10;
        int i11;
        hf0 hf0Var = this.v;
        if (bundle == null) {
            if (this.O != null && this.P != null) {
                hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
                int i12 = this.A;
                if (i12 == 17) {
                    i11 = R.string.ReturnEnteringPhrase;
                } else if (i12 == 16) {
                    i11 = R.string.ReturnEnteringWord;
                } else if (i12 == 3) {
                    i11 = R.string.ReturnPhoneCall;
                } else {
                    i11 = R.string.ReturnEnteringSMS;
                }
                hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i11), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        fg.g gVar = this.f38520c;
        gVar.setText("");
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
        int i13 = this.B;
        org.telegram.ui.Components.voip.m2 m2Var = this.d;
        if (i13 == 17) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i13 == 16) {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i13 != 1 && i13 != 2 && i13 != 4 && i13 != 3 && i13 != 15) {
            m2Var.setVisibility(8);
        } else {
            m2Var.setVisibility(0);
            m2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        }
        this.O = null;
        this.P = null;
        this.N = false;
        this.I = false;
        fg0 fg0Var = this.T;
        fg0Var.f38274k0 = false;
        hf0Var.invalidate();
        if (this.f38518a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + ne.b.c().b(ne.b.d(this.F, false));
        String str2 = this.G;
        TextView textView = this.f38524r;
        if (str2 == null) {
            if (!z11) {
                i10 = R.string.SMSWordText;
            } else {
                i10 = R.string.SMSPhraseText;
            }
            org.telegram.messenger.ll.q(i10, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i9 = R.string.SMSWordBeginningText;
            } else {
                i9 = R.string.SMSPhraseBeginningText;
            }
            org.telegram.messenger.ll.q(i9, new Object[]{str, str2}, textView);
        }
        fg0.T0(fg0Var, gVar);
        gVar.requestFocus();
        org.telegram.ui.Components.pi0 pi0Var = this.h;
        if (pi0Var.getAnimatedDrawable() != null) {
            pi0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new o00(pi0Var, 20), 500L);
        q(false);
        o(false);
        this.M = System.currentTimeMillis();
        int i14 = org.telegram.ui.ActionBar.f6.f23369y6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        int i15 = this.A;
        if (i15 != 2 && i15 != 4 && i15 != 3) {
            hf0Var.setVisibility(8);
        } else if (this.J != null) {
        } else {
            hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i14));
            Timer timer = new Timer();
            this.J = timer;
            timer.schedule(new fe0(this), 0L, 1000L);
        }
    }

    @Override
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        fg0 fg0Var = this.T;
        this.f38523n.setTextColor(fg0Var.getThemedColor(i9));
        this.f38524r.setTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.D6));
        int themedColor = fg0Var.getThemedColor(i9);
        fg.g gVar = this.f38520c;
        gVar.setTextColor(themedColor);
        gVar.setCursorColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23144l6));
        gVar.setHintTextColor(fg0Var.getThemedColor(org.telegram.ui.ActionBar.f6.H6));
        this.f38519b.f();
    }

    public final void o(boolean z10) {
        float f10;
        this.f38527x = z10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f38519b.a(f10);
        float f12 = (f10 * 0.1f) + 0.9f;
        float f13 = -5.0f;
        ViewPropertyAnimator translationY = this.f38521e.animate().scaleX(f12).scaleY(f12).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.ll.r(translationY, grVar, 290L);
        if (this.f38526w && !this.f38527x) {
            f11 = 1.0f;
        }
        float f14 = (0.1f * f11) + 0.9f;
        ViewPropertyAnimator alpha = this.f38522f.animate().scaleX(f14).scaleY(f14).alpha(f11);
        float f15 = 1.0f - f11;
        if (this.f38527x) {
            f13 = 5.0f;
        }
        alpha.translationY(f15 * AndroidUtilities.dp(f13)).setInterpolator(grVar).setDuration(290L).start();
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        de0 de0Var = this.Q;
        AndroidUtilities.cancelRunOnUIThread(de0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f38520c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f38526w != z11) {
            this.f38526w = z11;
            float f16 = -5.0f;
            float f17 = 0.9f;
            float f18 = 0.7f;
            TextView textView = this.f38525s;
            TextView textView2 = this.f38522f;
            float f19 = 0.0f;
            float f20 = 1.0f;
            if (z10) {
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z11) {
                    f18 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                scaleY.setInterpolator(grVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f38526w && !this.f38527x) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f15);
                if (this.f38526w && !this.f38527x) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = scaleX2.scaleY(f17).alpha((!this.f38526w || this.f38527x) ? 0.0f : 0.0f);
                if (!this.f38526w || this.f38527x) {
                    if (this.f38527x) {
                        f16 = 5.0f;
                    }
                    f19 = AndroidUtilities.dp(f16);
                }
                alpha2.translationY(f19).setInterpolator(grVar).setDuration(300L).start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                textView.setScaleX(f11);
                if (z11) {
                    f18 = 1.0f;
                }
                textView.setScaleY(f18);
                if (this.f38526w && !this.f38527x) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.9f;
                }
                textView2.setScaleX(f12);
                if (this.f38526w && !this.f38527x) {
                    f17 = 1.0f;
                }
                textView2.setScaleY(f17);
                textView2.setAlpha((!this.f38526w || this.f38527x) ? 0.0f : 0.0f);
                if (!this.f38526w || this.f38527x) {
                    if (this.f38527x) {
                        f16 = 5.0f;
                    }
                    f19 = AndroidUtilities.dp(f16);
                }
                textView2.setTranslationY(f19);
            }
        }
        AndroidUtilities.runOnUIThread(de0Var, 5000L);
    }

    public final void r() {
        hf0 hf0Var = this.v;
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i9));
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
        int i9;
        int i10;
        fg.g gVar = this.f38520c;
        if (this.T.getParentActivity() == null) {
            return;
        }
        try {
            gVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f38518a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.f38521e;
        if (z10) {
            if (!z11) {
                i10 = R.string.SMSWordBeginningError;
            } else {
                i10 = R.string.SMSPhraseBeginningError;
            }
            textView.setText(LocaleController.getString(i10));
        } else if (TextUtils.isEmpty(gVar.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i9 = R.string.SMSWordError;
            } else {
                i9 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i9));
        }
        if (!this.f38527x && !this.f38528y) {
            AndroidUtilities.shakeViewSpring(gVar, this.S);
            AndroidUtilities.shakeViewSpring(textView, this.S);
        }
        de0 de0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(de0Var);
        o(true);
        AndroidUtilities.runOnUIThread(de0Var, 10000L);
        this.S = -this.S;
    }
}
