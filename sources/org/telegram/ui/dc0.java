package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class dc0 extends org.telegram.ui.Components.fu0 {
    public boolean E;
    public int F;
    public int G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public Bundle M;
    public boolean N;
    public Timer O;
    public final Object P;
    public int Q;
    public double R;
    public boolean S;
    public Bundle T;
    public TLRPC.TL_auth_sentCode U;
    public final bc0 V;
    public final bc0 W;
    public final int f46912a;
    public float f46913a0;
    public final org.telegram.ui.Components.xb0 f46914b;
    public final de0 f46915b0;
    public final ah.i f46916c;
    public final db0 d;
    public final TextView f46917e;
    public final TextView f46918f;
    public final org.telegram.ui.Components.ph0 h;
    public final TextView f46919n;
    public final TextView f46920r;
    public final TextView f46921s;
    public final ed0 f46922w;
    public boolean f46923x;
    public boolean f46924y;

    public dc0(org.telegram.ui.de0 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dc0.<init>(org.telegram.ui.de0, android.content.Context, int):void");
    }

    public static String s(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length && str.charAt(i7) <= ' ') {
            i7++;
        }
        if (i7 <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i7, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        de0 de0Var = this.f46915b0;
        de0Var.C1(true, true);
        int i7 = this.G;
        if (i7 != 0) {
            de0Var.M1(i7, true, null, true);
            return false;
        }
        this.M = null;
        this.S = false;
        return true;
    }

    @Override
    public final void d() {
        this.S = false;
    }

    @Override
    public final void g() {
        org.telegram.messenger.g0.r(this.V);
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.M0(2131748074, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (this.S) {
            return;
        }
        String obj = this.f46916c.getText().toString();
        if (obj.length() == 0) {
            r(false);
        } else if (!o(obj)) {
            r(true);
        } else {
            this.S = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.H;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.I;
            tL_auth_signIn.flags |= 1;
            de0 de0Var = this.f46915b0;
            de0Var.F1(de0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new xb0(this, tL_auth_signIn, 0), 10), true);
            de0Var.N1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new bc0(this, 3), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f46912a);
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + this.f46912a, this.M);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        ed0 ed0Var = this.f46922w;
        if (bundle == null) {
            if (this.T != null && this.U != null) {
                org.telegram.ui.ActionBar.u6.U(ed0Var, org.telegram.ui.ActionBar.n6.I6, null);
                int i12 = this.F;
                if (i12 == 17) {
                    i11 = 2131745855;
                } else if (i12 == 16) {
                    i11 = 2131745853;
                } else if (i12 == 3) {
                    i11 = 2131745852;
                } else {
                    i11 = 2131745854;
                }
                ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.M0(i11, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        ah.i iVar = this.f46916c;
        iVar.setText("");
        this.M = bundle;
        this.L = null;
        this.F = bundle.getInt("nextType");
        this.G = bundle.getInt("prevType", 0);
        this.J = bundle.getString("ephone");
        if (this.M.containsKey("beginning")) {
            this.L = this.M.getString("beginning");
        }
        this.H = bundle.getString("phoneFormated");
        this.I = bundle.getString("phoneHash");
        this.K = this.M.getString("phone");
        this.Q = bundle.getInt("timeout");
        int i13 = this.G;
        db0 db0Var = this.d;
        if (i13 == 17) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.M0(2131753752, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 == 16) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.M0(2131753751, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 != 1 && i13 != 2 && i13 != 4 && i13 != 3 && i13 != 15) {
            db0Var.setVisibility(8);
        } else {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        de0 de0Var = this.f46915b0;
        de0Var.f46956r0 = false;
        ed0Var.invalidate();
        if (this.f46912a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + pf.b.c().b(pf.b.d(this.K, false));
        String str2 = this.L;
        TextView textView = this.f46920r;
        if (str2 == null) {
            if (!z11) {
                i10 = 2131745756;
            } else {
                i10 = 2131745764;
            }
            org.telegram.messenger.f3.q(null, null, i10, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i7 = 2131745760;
            } else {
                i7 = 2131745768;
            }
            org.telegram.messenger.f3.q(null, null, i7, new Object[]{str, str2}, textView);
        }
        de0.b1(de0Var, iVar);
        iVar.requestFocus();
        org.telegram.ui.Components.ph0 ph0Var = this.h;
        if (ph0Var.getAnimatedDrawable() != null) {
            ph0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.g0.h3(new lz(ph0Var, 23), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i14 = org.telegram.ui.ActionBar.n6.f29788y6;
        org.telegram.ui.ActionBar.u6.U(ed0Var, i14, null);
        int i15 = this.F;
        if (i15 != 2 && i15 != 4 && i15 != 3) {
            ed0Var.setVisibility(8);
        } else if (this.O != null) {
        } else {
            org.telegram.ui.ActionBar.u6.U(ed0Var, i14, null);
            ed0Var.setTag(2131296386, Integer.valueOf(i14));
            Timer timer = new Timer();
            this.O = timer;
            timer.schedule(new h6.r(this, 3), 0L, 1000L);
        }
    }

    public final void n(boolean z10) {
        float f10;
        this.f46924y = z10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f46914b.a(f10);
        float f12 = (f10 * 0.1f) + 0.9f;
        float f13 = -5.0f;
        ViewPropertyAnimator translationY = this.f46917e.animate().scaleX(f12).scaleY(f12).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.g0.L(-5.0f));
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        org.telegram.messenger.n10.o(translationY, lrVar, 290L);
        if (this.f46923x && !this.f46924y) {
            f11 = 1.0f;
        }
        float f14 = (0.1f * f11) + 0.9f;
        ViewPropertyAnimator alpha = this.f46918f.animate().scaleX(f14).scaleY(f14).alpha(f11);
        float f15 = 1.0f - f11;
        if (this.f46924y) {
            f13 = 5.0f;
        }
        alpha.translationY(f15 * org.telegram.messenger.g0.L(f13)).setInterpolator(lrVar).setDuration(290L).start();
    }

    public final boolean o(String str) {
        if (this.L != null) {
            String lowerCase = s(str).toLowerCase();
            String lowerCase2 = this.L.toLowerCase();
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
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        bc0 bc0Var = this.V;
        org.telegram.messenger.g0.r(bc0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f46916c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46923x != z11) {
            this.f46923x = z11;
            float f16 = -5.0f;
            float f17 = 0.9f;
            float f18 = 0.7f;
            TextView textView = this.f46921s;
            TextView textView2 = this.f46918f;
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
                org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
                scaleY.setInterpolator(lrVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f46923x && !this.f46924y) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f15);
                if (this.f46923x && !this.f46924y) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f17);
                if (!this.f46923x || this.f46924y) {
                    f20 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f20);
                if (!this.f46923x || this.f46924y) {
                    if (this.f46924y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                alpha2.translationY(f19).setInterpolator(lrVar).setDuration(300L).start();
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
                if (this.f46923x && !this.f46924y) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.9f;
                }
                textView2.setScaleX(f12);
                if (this.f46923x && !this.f46924y) {
                    f17 = 1.0f;
                }
                textView2.setScaleY(f17);
                if (!this.f46923x || this.f46924y) {
                    f20 = 0.0f;
                }
                textView2.setAlpha(f20);
                if (!this.f46923x || this.f46924y) {
                    if (this.f46924y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                textView2.setTranslationY(f19);
            }
        }
        org.telegram.messenger.g0.h3(bc0Var, 5000L);
    }

    public final void q() {
        ed0 ed0Var = this.f46922w;
        int i7 = org.telegram.ui.ActionBar.n6.f29788y6;
        org.telegram.ui.ActionBar.u6.U(ed0Var, i7, null);
        this.f46922w.setTag(2131296386, Integer.valueOf(i7));
        try {
            synchronized (this.P) {
                Timer timer = this.O;
                if (timer != null) {
                    timer.cancel();
                    this.O = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        ah.i iVar = this.f46916c;
        if (this.f46915b0.getParentActivity() == null) {
            return;
        }
        try {
            iVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f46912a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.f46917e;
        if (z10) {
            if (!z11) {
                i10 = 2131745761;
            } else {
                i10 = 2131745769;
            }
            textView.setText(org.telegram.messenger.gd.M0(i10, null));
        } else if (TextUtils.isEmpty(iVar.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i7 = 2131745759;
            } else {
                i7 = 2131745767;
            }
            textView.setText(org.telegram.messenger.gd.M0(i7, null));
        }
        if (!this.f46924y && !this.E) {
            org.telegram.messenger.g0.E3(this.f46913a0, iVar, null);
            org.telegram.messenger.g0.E3(this.f46913a0, textView, null);
        }
        bc0 bc0Var = this.W;
        org.telegram.messenger.g0.r(bc0Var);
        n(true);
        org.telegram.messenger.g0.h3(bc0Var, 10000L);
        this.f46913a0 = -this.f46913a0;
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        de0 de0Var = this.f46915b0;
        this.f46919n.setTextColor(de0Var.getThemedColor(i7));
        this.f46920r.setTextColor(de0Var.getThemedColor(org.telegram.ui.ActionBar.n6.D6));
        int themedColor = de0Var.getThemedColor(i7);
        ah.i iVar = this.f46916c;
        iVar.setTextColor(themedColor);
        iVar.setCursorColor(de0Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29543l6));
        iVar.setHintTextColor(de0Var.getThemedColor(org.telegram.ui.ActionBar.n6.H6));
        this.f46914b.f();
    }
}
