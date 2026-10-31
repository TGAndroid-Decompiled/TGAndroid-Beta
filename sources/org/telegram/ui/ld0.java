package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class ld0 extends org.telegram.ui.Components.zu0 {
    public boolean D;
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
    public final jd0 U;
    public final jd0 V;
    public float W;
    public final int f39176a;
    public final hf0 f39177a0;
    public final org.telegram.ui.Components.ec0 f39178b;
    public final org.telegram.ui.ActionBar.n0 f39179c;
    public final mc0 d;
    public final TextView e;
    public final TextView f39180f;
    public final org.telegram.ui.Components.ei0 h;
    public final TextView f39181n;
    public final TextView f39182r;
    public final TextView f39183s;
    public final ke0 f39184w;
    public boolean f39185x;
    public boolean f39186y;

    public ld0(org.telegram.ui.hf0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ld0.<init>(org.telegram.ui.hf0, android.content.Context, int):void");
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
        hf0 hf0Var = this.f39177a0;
        hf0Var.s1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            hf0Var.C1(i10, true, null, true);
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
        org.telegram.messenger.i0.r(this.U);
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748283, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (this.R) {
            return;
        }
        String obj = this.f39179c.getText().toString();
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
            hf0 hf0Var = this.f39177a0;
            hf0Var.v1(hf0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new fd0(this, tL_auth_signIn, 0), 10), true);
            hf0Var.D1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new jd0(this, 3), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f39176a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.f39176a, this.L);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        ke0 ke0Var = this.f39184w;
        if (bundle == null) {
            if (this.S != null && this.T != null) {
                org.telegram.ui.ActionBar.a7.V(ke0Var, org.telegram.ui.ActionBar.t6.I6, null);
                int i13 = this.E;
                if (i13 == 17) {
                    i12 = 2131746067;
                } else if (i13 == 16) {
                    i12 = 2131746065;
                } else if (i13 == 3) {
                    i12 = 2131746064;
                } else {
                    i12 = 2131746066;
                }
                ke0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(i12, null), true, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n0 n0Var = this.f39179c;
        n0Var.setText("");
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
        mc0 mc0Var = this.d;
        if (i14 == 17) {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753754, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else if (i14 == 16) {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753753, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        } else if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 3 && i14 != 15) {
            mc0Var.setVisibility(8);
        } else {
            mc0Var.setVisibility(0);
            mc0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131753755, null), true, org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(1.0f)));
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        hf0 hf0Var = this.f39177a0;
        hf0Var.f37937p0 = false;
        ke0Var.invalidate();
        if (this.f39176a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + af.b.c().b(af.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.f39182r;
        if (str2 == null) {
            if (!z11) {
                i11 = 2131745968;
            } else {
                i11 = 2131745976;
            }
            org.telegram.messenger.m5.q(null, null, i11, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i10 = 2131745972;
            } else {
                i10 = 2131745980;
            }
            org.telegram.messenger.m5.q(null, null, i10, new Object[]{str, str2}, textView);
        }
        hf0.Z0(hf0Var, n0Var);
        n0Var.requestFocus();
        org.telegram.ui.Components.ei0 ei0Var = this.h;
        if (ei0Var.getAnimatedDrawable() != null) {
            ei0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.i0.h3(new zy(ei0Var, 23), 500L);
        p(false);
        n(false);
        this.Q = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i15, null);
        int i16 = this.E;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            ke0Var.setVisibility(8);
        } else if (this.N != null) {
        } else {
            org.telegram.ui.ActionBar.a7.V(ke0Var, i15, null);
            ke0Var.setTag(2131296386, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.N = timer;
            timer.schedule(new e6.r(this, 3), 0L, 1000L);
        }
    }

    public final void n(boolean z10) {
        float f7;
        this.f39186y = z10;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f39178b.a(f7);
        float f11 = (f7 * 0.1f) + 0.9f;
        float f12 = -5.0f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f11).scaleY(f11).alpha(f7).translationY((1.0f - f7) * org.telegram.messenger.i0.L(-5.0f));
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.z20.m(translationY, grVar, 290L);
        if (this.f39185x && !this.f39186y) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        ViewPropertyAnimator alpha = this.f39180f.animate().scaleX(f13).scaleY(f13).alpha(f10);
        float f14 = 1.0f - f10;
        if (this.f39186y) {
            f12 = 5.0f;
        }
        alpha.translationY(f14 * org.telegram.messenger.i0.L(f12)).setInterpolator(grVar).setDuration(290L).start();
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
        jd0 jd0Var = this.U;
        org.telegram.messenger.i0.r(jd0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f39179c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f39185x != z11) {
            this.f39185x = z11;
            float f15 = -5.0f;
            float f16 = 0.9f;
            float f17 = 0.7f;
            TextView textView = this.f39183s;
            TextView textView2 = this.f39180f;
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
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                scaleY.setInterpolator(grVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f39185x && !this.f39186y) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14);
                if (this.f39185x && !this.f39186y) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f16);
                if (!this.f39185x || this.f39186y) {
                    f19 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f19);
                if (!this.f39185x || this.f39186y) {
                    if (this.f39186y) {
                        f15 = 5.0f;
                    }
                    f18 = org.telegram.messenger.i0.L(f15);
                }
                alpha2.translationY(f18).setInterpolator(grVar).setDuration(300L).start();
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
                if (this.f39185x && !this.f39186y) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.9f;
                }
                textView2.setScaleX(f11);
                if (this.f39185x && !this.f39186y) {
                    f16 = 1.0f;
                }
                textView2.setScaleY(f16);
                if (!this.f39185x || this.f39186y) {
                    f19 = 0.0f;
                }
                textView2.setAlpha(f19);
                if (!this.f39185x || this.f39186y) {
                    if (this.f39186y) {
                        f15 = 5.0f;
                    }
                    f18 = org.telegram.messenger.i0.L(f15);
                }
                textView2.setTranslationY(f18);
            }
        }
        org.telegram.messenger.i0.h3(jd0Var, 5000L);
    }

    public final void q() {
        ke0 ke0Var = this.f39184w;
        int i10 = org.telegram.ui.ActionBar.t6.f21311y6;
        org.telegram.ui.ActionBar.a7.V(ke0Var, i10, null);
        this.f39184w.setTag(2131296386, Integer.valueOf(i10));
        try {
            synchronized (this.O) {
                Timer timer = this.N;
                if (timer != null) {
                    timer.cancel();
                    this.N = null;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n0 n0Var = this.f39179c;
        if (this.f39177a0.getParentActivity() == null) {
            return;
        }
        try {
            n0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f39176a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.e;
        if (z10) {
            if (!z11) {
                i11 = 2131745973;
            } else {
                i11 = 2131745981;
            }
            textView.setText(org.telegram.messenger.cd.L0(i11, null));
        } else if (TextUtils.isEmpty(n0Var.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i10 = 2131745971;
            } else {
                i10 = 2131745979;
            }
            textView.setText(org.telegram.messenger.cd.L0(i10, null));
        }
        if (!this.f39186y && !this.D) {
            org.telegram.messenger.i0.F3(this.W, n0Var, null);
            org.telegram.messenger.i0.F3(this.W, textView, null);
        }
        jd0 jd0Var = this.V;
        org.telegram.messenger.i0.r(jd0Var);
        n(true);
        org.telegram.messenger.i0.h3(jd0Var, 10000L);
        this.W = -this.W;
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        hf0 hf0Var = this.f39177a0;
        this.f39181n.setTextColor(hf0Var.getThemedColor(i10));
        this.f39182r.setTextColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.D6));
        int themedColor = hf0Var.getThemedColor(i10);
        org.telegram.ui.ActionBar.n0 n0Var = this.f39179c;
        n0Var.setTextColor(themedColor);
        n0Var.setCursorColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21076l6));
        n0Var.setHintTextColor(hf0Var.getThemedColor(org.telegram.ui.ActionBar.t6.H6));
        this.f39178b.f();
    }
}
