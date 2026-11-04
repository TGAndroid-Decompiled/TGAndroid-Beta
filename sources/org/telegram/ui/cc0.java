package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class cc0 extends org.telegram.ui.Components.vt0 {
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
    public final ac0 V;
    public final ac0 W;
    public final int f44295a;
    public float f44296a0;
    public final org.telegram.ui.Components.gb0 f44297b;
    public final xd0 f44298b0;
    public final bh.g f44299c;
    public final za0 d;
    public final TextView f44300e;
    public final TextView f44301f;
    public final org.telegram.ui.Components.fh0 h;
    public final TextView f44302n;
    public final TextView f44303r;
    public final TextView f44304s;
    public final bd0 f44305w;
    public boolean f44306x;
    public boolean f44307y;

    public cc0(org.telegram.ui.xd0 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cc0.<init>(org.telegram.ui.xd0, android.content.Context, int):void");
    }

    public static String s(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length && str.charAt(i3) <= ' ') {
            i3++;
        }
        if (i3 <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i3, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        xd0 xd0Var = this.f44298b0;
        xd0Var.t1(true, true);
        int i3 = this.G;
        if (i3 != 0) {
            xd0Var.D1(i3, true, null, true);
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
        return org.telegram.messenger.bd.M0(2131748274, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (this.S) {
            return;
        }
        String obj = this.f44299c.getText().toString();
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
            xd0 xd0Var = this.f44298b0;
            xd0Var.w1(xd0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new wb0(this, tL_auth_signIn, 0), 10), true);
            xd0Var.E1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new ac0(this, 3), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f44295a);
        this.M = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.M != null) {
            bundle.putBundle("recoveryview_word" + this.f44295a, this.M);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i3;
        int i10;
        int i11;
        bd0 bd0Var = this.f44305w;
        if (bundle == null) {
            if (this.T != null && this.U != null) {
                org.telegram.ui.ActionBar.r6.V(bd0Var, org.telegram.ui.ActionBar.k6.I6, null);
                int i12 = this.F;
                if (i12 == 17) {
                    i11 = 2131746060;
                } else if (i12 == 16) {
                    i11 = 2131746058;
                } else if (i12 == 3) {
                    i11 = 2131746057;
                } else {
                    i11 = 2131746059;
                }
                bd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(i11, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        bh.g gVar = this.f44299c;
        gVar.setText("");
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
        za0 za0Var = this.d;
        if (i13 == 17) {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 == 16) {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 != 1 && i13 != 2 && i13 != 4 && i13 != 3 && i13 != 15) {
            za0Var.setVisibility(8);
        } else {
            za0Var.setVisibility(0);
            za0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131753755, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.T = null;
        this.U = null;
        this.S = false;
        this.N = false;
        xd0 xd0Var = this.f44298b0;
        xd0Var.f51967q0 = false;
        bd0Var.invalidate();
        if (this.f44295a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + mf.b.c().b(mf.b.d(this.K, false));
        String str2 = this.L;
        TextView textView = this.f44303r;
        if (str2 == null) {
            if (!z11) {
                i10 = 2131745961;
            } else {
                i10 = 2131745969;
            }
            org.telegram.messenger.k5.r(null, null, i10, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i3 = 2131745965;
            } else {
                i3 = 2131745973;
            }
            org.telegram.messenger.k5.r(null, null, i3, new Object[]{str, str2}, textView);
        }
        xd0.a1(xd0Var, gVar);
        gVar.requestFocus();
        org.telegram.ui.Components.fh0 fh0Var = this.h;
        if (fh0Var.getAnimatedDrawable() != null) {
            fh0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.g0.i3(new fz(fh0Var, 22), 500L);
        p(false);
        n(false);
        this.R = System.currentTimeMillis();
        int i14 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i14, null);
        int i15 = this.F;
        if (i15 != 2 && i15 != 4 && i15 != 3) {
            bd0Var.setVisibility(8);
        } else if (this.O != null) {
        } else {
            org.telegram.ui.ActionBar.r6.V(bd0Var, i14, null);
            bd0Var.setTag(2131296386, Integer.valueOf(i14));
            Timer timer = new Timer();
            this.O = timer;
            timer.schedule(new g6.q(this, 4), 0L, 1000L);
        }
    }

    public final void n(boolean z10) {
        float f10;
        this.f44307y = z10;
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f44297b.a(f10);
        float f12 = (f10 * 0.1f) + 0.9f;
        float f13 = -5.0f;
        ViewPropertyAnimator translationY = this.f44300e.animate().scaleX(f12).scaleY(f12).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.g0.L(-5.0f));
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 290L);
        if (this.f44306x && !this.f44307y) {
            f11 = 1.0f;
        }
        float f14 = (0.1f * f11) + 0.9f;
        ViewPropertyAnimator alpha = this.f44301f.animate().scaleX(f14).scaleY(f14).alpha(f11);
        float f15 = 1.0f - f11;
        if (this.f44307y) {
            f13 = 5.0f;
        }
        alpha.translationY(f15 * org.telegram.messenger.g0.L(f13)).setInterpolator(xqVar).setDuration(290L).start();
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
        ac0 ac0Var = this.V;
        org.telegram.messenger.g0.r(ac0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f44299c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44306x != z11) {
            this.f44306x = z11;
            float f16 = -5.0f;
            float f17 = 0.9f;
            float f18 = 0.7f;
            TextView textView = this.f44304s;
            TextView textView2 = this.f44301f;
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
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                scaleY.setInterpolator(xqVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f44306x && !this.f44307y) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f15);
                if (this.f44306x && !this.f44307y) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f17);
                if (!this.f44306x || this.f44307y) {
                    f20 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f20);
                if (!this.f44306x || this.f44307y) {
                    if (this.f44307y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                alpha2.translationY(f19).setInterpolator(xqVar).setDuration(300L).start();
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
                if (this.f44306x && !this.f44307y) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.9f;
                }
                textView2.setScaleX(f12);
                if (this.f44306x && !this.f44307y) {
                    f17 = 1.0f;
                }
                textView2.setScaleY(f17);
                if (!this.f44306x || this.f44307y) {
                    f20 = 0.0f;
                }
                textView2.setAlpha(f20);
                if (!this.f44306x || this.f44307y) {
                    if (this.f44307y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                textView2.setTranslationY(f19);
            }
        }
        org.telegram.messenger.g0.i3(ac0Var, 5000L);
    }

    public final void q() {
        bd0 bd0Var = this.f44305w;
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.V(bd0Var, i3, null);
        this.f44305w.setTag(2131296386, Integer.valueOf(i3));
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
        int i3;
        int i10;
        bh.g gVar = this.f44299c;
        if (this.f44298b0.getParentActivity() == null) {
            return;
        }
        try {
            gVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f44295a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.f44300e;
        if (z10) {
            if (!z11) {
                i10 = 2131745966;
            } else {
                i10 = 2131745974;
            }
            textView.setText(org.telegram.messenger.bd.M0(i10, null));
        } else if (TextUtils.isEmpty(gVar.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i3 = 2131745964;
            } else {
                i3 = 2131745972;
            }
            textView.setText(org.telegram.messenger.bd.M0(i3, null));
        }
        if (!this.f44307y && !this.E) {
            org.telegram.messenger.g0.G3(this.f44296a0, gVar, null);
            org.telegram.messenger.g0.G3(this.f44296a0, textView, null);
        }
        ac0 ac0Var = this.W;
        org.telegram.messenger.g0.r(ac0Var);
        n(true);
        org.telegram.messenger.g0.i3(ac0Var, 10000L);
        this.f44296a0 = -this.f44296a0;
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        xd0 xd0Var = this.f44298b0;
        this.f44302n.setTextColor(xd0Var.getThemedColor(i3));
        this.f44303r.setTextColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.D6));
        int themedColor = xd0Var.getThemedColor(i3);
        bh.g gVar = this.f44299c;
        gVar.setTextColor(themedColor);
        gVar.setCursorColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28026l6));
        gVar.setHintTextColor(xd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        this.f44297b.f();
    }
}
