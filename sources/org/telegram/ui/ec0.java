package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class ec0 extends org.telegram.ui.Components.wt0 {
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
    public final cc0 U;
    public final cc0 V;
    public float W;
    public final int f45262a;
    public final ce0 f45263a0;
    public final org.telegram.ui.Components.lb0 f45264b;
    public final ah.i f45265c;
    public final db0 d;
    public final TextView f45266e;
    public final TextView f45267f;
    public final org.telegram.ui.Components.ch0 h;
    public final TextView f45268n;
    public final TextView f45269r;
    public final TextView f45270s;
    public final ed0 f45271w;
    public boolean f45272x;
    public boolean f45273y;

    public ec0(org.telegram.ui.ce0 r33, android.content.Context r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.<init>(org.telegram.ui.ce0, android.content.Context, int):void");
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
    public final boolean c(boolean z9) {
        ce0 ce0Var = this.f45263a0;
        ce0Var.C1(true, true);
        int i7 = this.F;
        if (i7 != 0) {
            ce0Var.M1(i7, true, null, true);
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
        org.telegram.messenger.g0.r(this.U);
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748267, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (this.R) {
            return;
        }
        String obj = this.f45265c.getText().toString();
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
            ce0 ce0Var = this.f45263a0;
            ce0Var.F1(ce0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new yb0(this, tL_auth_signIn, 0), 10), true);
            ce0Var.N1(true, true);
        }
    }

    @Override
    public final void i() {
        p(true);
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new cc0(this, 3), ce0.f44760y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f45262a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.f45262a, this.L);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        ed0 ed0Var = this.f45271w;
        if (bundle == null) {
            if (this.S != null && this.T != null) {
                org.telegram.ui.ActionBar.r6.V(ed0Var, org.telegram.ui.ActionBar.k6.I6, null);
                int i12 = this.E;
                if (i12 == 17) {
                    i11 = 2131746053;
                } else if (i12 == 16) {
                    i11 = 2131746051;
                } else if (i12 == 3) {
                    i11 = 2131746050;
                } else {
                    i11 = 2131746052;
                }
                ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(i11, null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                return;
            }
            return;
        }
        ah.i iVar = this.f45265c;
        iVar.setText("");
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
        int i13 = this.F;
        db0 db0Var = this.d;
        if (i13 == 17) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131753754, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 == 16) {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131753753, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        } else if (i13 != 1 && i13 != 2 && i13 != 4 && i13 != 3 && i13 != 15) {
            db0Var.setVisibility(8);
        } else {
            db0Var.setVisibility(0);
            db0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131753755, null), true, org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        ce0 ce0Var = this.f45263a0;
        ce0Var.f44781p0 = false;
        ed0Var.invalidate();
        if (this.f45262a == 16) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = "+" + pf.b.c().b(pf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.f45269r;
        if (str2 == null) {
            if (!z10) {
                i10 = 2131745954;
            } else {
                i10 = 2131745962;
            }
            org.telegram.messenger.k5.r(null, null, i10, new Object[]{str}, textView);
        } else {
            if (!z10) {
                i7 = 2131745958;
            } else {
                i7 = 2131745966;
            }
            org.telegram.messenger.k5.r(null, null, i7, new Object[]{str, str2}, textView);
        }
        ce0.b1(ce0Var, iVar);
        iVar.requestFocus();
        org.telegram.ui.Components.ch0 ch0Var = this.h;
        if (ch0Var.getAnimatedDrawable() != null) {
            ch0Var.getAnimatedDrawable().N(0, false, false);
        }
        org.telegram.messenger.g0.i3(new hz(ch0Var, 23), 500L);
        p(false);
        n(false);
        this.Q = System.currentTimeMillis();
        int i14 = org.telegram.ui.ActionBar.k6.f28244y6;
        org.telegram.ui.ActionBar.r6.V(ed0Var, i14, null);
        int i15 = this.E;
        if (i15 != 2 && i15 != 4 && i15 != 3) {
            ed0Var.setVisibility(8);
        } else if (this.N != null) {
        } else {
            org.telegram.ui.ActionBar.r6.V(ed0Var, i14, null);
            ed0Var.setTag(2131296386, Integer.valueOf(i14));
            Timer timer = new Timer();
            this.N = timer;
            timer.schedule(new fi.h2(this, 3), 0L, 1000L);
        }
    }

    public final void n(boolean z9) {
        float f10;
        this.f45273y = z9;
        float f11 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f45264b.a(f10);
        float f12 = (f10 * 0.1f) + 0.9f;
        float f13 = -5.0f;
        ViewPropertyAnimator translationY = this.f45266e.animate().scaleX(f12).scaleY(f12).alpha(f10).translationY((1.0f - f10) * org.telegram.messenger.g0.L(-5.0f));
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 290L);
        if (this.f45272x && !this.f45273y) {
            f11 = 1.0f;
        }
        float f14 = (0.1f * f11) + 0.9f;
        ViewPropertyAnimator alpha = this.f45267f.animate().scaleX(f14).scaleY(f14).alpha(f11);
        float f15 = 1.0f - f11;
        if (this.f45273y) {
            f13 = 5.0f;
        }
        alpha.translationY(f15 * org.telegram.messenger.g0.L(f13)).setInterpolator(xqVar).setDuration(290L).start();
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

    public final void p(boolean z9) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        cc0 cc0Var = this.U;
        org.telegram.messenger.g0.r(cc0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f45265c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45272x != z10) {
            this.f45272x = z10;
            float f16 = -5.0f;
            float f17 = 0.9f;
            float f18 = 0.7f;
            TextView textView = this.f45270s;
            TextView textView2 = this.f45267f;
            float f19 = 0.0f;
            float f20 = 1.0f;
            if (z9) {
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z10) {
                    f18 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                scaleY.setInterpolator(xqVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f45272x && !this.f45273y) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f15);
                if (this.f45272x && !this.f45273y) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f17);
                if (!this.f45272x || this.f45273y) {
                    f20 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f20);
                if (!this.f45272x || this.f45273y) {
                    if (this.f45273y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                alpha2.translationY(f19).setInterpolator(xqVar).setDuration(300L).start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                textView.setScaleX(f11);
                if (z10) {
                    f18 = 1.0f;
                }
                textView.setScaleY(f18);
                if (this.f45272x && !this.f45273y) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.9f;
                }
                textView2.setScaleX(f12);
                if (this.f45272x && !this.f45273y) {
                    f17 = 1.0f;
                }
                textView2.setScaleY(f17);
                if (!this.f45272x || this.f45273y) {
                    f20 = 0.0f;
                }
                textView2.setAlpha(f20);
                if (!this.f45272x || this.f45273y) {
                    if (this.f45273y) {
                        f16 = 5.0f;
                    }
                    f19 = org.telegram.messenger.g0.L(f16);
                }
                textView2.setTranslationY(f19);
            }
        }
        org.telegram.messenger.g0.i3(cc0Var, 5000L);
    }

    public final void q() {
        ed0 ed0Var = this.f45271w;
        int i7 = org.telegram.ui.ActionBar.k6.f28244y6;
        org.telegram.ui.ActionBar.r6.V(ed0Var, i7, null);
        this.f45271w.setTag(2131296386, Integer.valueOf(i7));
        try {
            synchronized (this.O) {
                Timer timer = this.N;
                if (timer != null) {
                    timer.cancel();
                    this.N = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        ah.i iVar = this.f45265c;
        if (this.f45263a0.getParentActivity() == null) {
            return;
        }
        try {
            iVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f45262a == 16) {
            z10 = false;
        } else {
            z10 = true;
        }
        TextView textView = this.f45266e;
        if (z9) {
            if (!z10) {
                i10 = 2131745959;
            } else {
                i10 = 2131745967;
            }
            textView.setText(org.telegram.messenger.id.M0(i10, null));
        } else if (TextUtils.isEmpty(iVar.getText())) {
            textView.setText("");
        } else {
            if (!z10) {
                i7 = 2131745957;
            } else {
                i7 = 2131745965;
            }
            textView.setText(org.telegram.messenger.id.M0(i7, null));
        }
        if (!this.f45273y && !this.D) {
            org.telegram.messenger.g0.G3(this.W, iVar, null);
            org.telegram.messenger.g0.G3(this.W, textView, null);
        }
        cc0 cc0Var = this.V;
        org.telegram.messenger.g0.r(cc0Var);
        n(true);
        org.telegram.messenger.g0.i3(cc0Var, 10000L);
        this.W = -this.W;
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        ce0 ce0Var = this.f45263a0;
        this.f45268n.setTextColor(ce0Var.getThemedColor(i7));
        this.f45269r.setTextColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.k6.D6));
        int themedColor = ce0Var.getThemedColor(i7);
        ah.i iVar = this.f45265c;
        iVar.setTextColor(themedColor);
        iVar.setCursorColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27999l6));
        iVar.setHintTextColor(ce0Var.getThemedColor(org.telegram.ui.ActionBar.k6.H6));
        this.f45264b.f();
    }
}
