package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.wb1;
public final class rn implements TextWatcher {
    public final int f27683a;
    public final Object f27684b;
    public Object f27685c;

    public rn(int i10, Object obj, Object obj2) {
        this.f27683a = i10;
        this.f27684b = obj;
        this.f27685c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27683a;
        s4.c1 c1Var = null;
        Object obj = this.f27684b;
        switch (i10) {
            case 0:
                vn vnVar = ((tn) obj).d;
                qn qnVar = (qn) this.f27685c;
                if (qnVar.getTag() == null) {
                    s4.c1 K = vnVar.f28805s.K(vnVar.f28801p0);
                    if (K != null && vnVar.f28812x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        vnVar.f28812x.setDirection(1);
                        vnVar.f28812x.setDelegate(qnVar);
                        vnVar.f28812x.setTranslationY(K.f42627a.getY());
                        vnVar.f28812x.e();
                    }
                    vnVar.P = editable;
                    if (K != null) {
                        vn.L(vnVar, K.f42627a, vnVar.f28801p0);
                    }
                    vnVar.T();
                    return;
                }
                return;
            case 1:
                vn vnVar2 = ((tn) obj).d;
                wb1 wb1Var = vnVar2.f28805s;
                sn snVar = (sn) this.f27685c;
                View F = wb1Var.F(snVar);
                if (F != null) {
                    c1Var = wb1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f42627a;
                    int b10 = c1Var.b();
                    int i11 = b10 - vnVar2.f28807t0;
                    if (i11 >= 0 && i11 < vnVar2.K.length) {
                        if (vnVar2.f28812x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, snVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                vnVar2.f28812x.setDirection(0);
                                vnVar2.f28812x.setTranslationY(y3);
                            } else {
                                vnVar2.f28812x.setDirection(1);
                                vnVar2.f28812x.setTranslationY(view.getY());
                            }
                            vnVar2.f28812x.setDelegate(snVar);
                            vnVar2.f28812x.e();
                        }
                        vnVar2.K[i11] = editable;
                        vn.L(vnVar2, snVar, b10);
                        vnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f30863x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f30861s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27685c).get()) {
                            passcodeActivity.f30861s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30861s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f30861s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30861s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.tv0 tv0Var = ((org.telegram.ui.rv0) obj).d;
                org.telegram.ui.ov0 ov0Var = (org.telegram.ui.ov0) this.f27685c;
                if (ov0Var.getTag() == null) {
                    s4.c1 K2 = tv0Var.f37771c.K(tv0Var.f37779i0);
                    if (K2 != null && tv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, ov0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        tv0Var.Q.setDirection(1);
                        tv0Var.Q.setDelegate(ov0Var);
                        tv0Var.Q.setTranslationY(K2.f42627a.getY());
                        tv0Var.Q.e();
                    }
                    tv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.tv0.c0(tv0Var, K2.f42627a, tv0Var.f37779i0);
                    }
                    tv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.tv0 tv0Var2 = ((org.telegram.ui.rv0) obj).d;
                org.telegram.ui.pv0 pv0Var = (org.telegram.ui.pv0) this.f27685c;
                if (pv0Var.getTag() == null) {
                    s4.c1 K3 = tv0Var2.f37771c.K(tv0Var2.f37779i0);
                    if (K3 != null && tv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, pv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        tv0Var2.Q.setDirection(1);
                        tv0Var2.Q.setDelegate(pv0Var);
                        tv0Var2.Q.setTranslationY(K3.f42627a.getY());
                        tv0Var2.Q.e();
                    }
                    tv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.tv0.c0(tv0Var2, K3.f42627a, tv0Var2.f37780j0);
                    }
                    tv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.tv0 tv0Var3 = ((org.telegram.ui.rv0) obj).d;
                wb1 wb1Var2 = tv0Var3.f37771c;
                org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) this.f27685c;
                View F2 = wb1Var2.F(qv0Var);
                if (F2 != null) {
                    c1Var = wb1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f42627a;
                    int b11 = c1Var.b() - tv0Var3.f37784n0;
                    if (b11 >= 0 && b11 < tv0Var3.v.length) {
                        if (tv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, qv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                tv0Var3.Q.setDirection(0);
                                tv0Var3.Q.setTranslationY(y10);
                            } else {
                                tv0Var3.Q.setDirection(1);
                                tv0Var3.Q.setTranslationY(view2.getY());
                            }
                            tv0Var3.Q.setDelegate(qv0Var);
                            tv0Var3.Q.e();
                        }
                        tv0Var3.v[b11] = editable;
                        org.telegram.ui.tv0.c0(tv0Var3, qv0Var, b11);
                        tv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f40972f;
                if (!vVar.e && ((String) this.f27685c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27685c).toString(), editable.toString())) {
                    int b12 = w7.p.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f40990f), b12, Color.green(xVar.f40990f), Color.blue(xVar.f40990f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f40990f), Color.red(xVar.f40990f), Color.green(xVar.f40990f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f40990f), Color.red(xVar.f40990f), b12, Color.blue(xVar.f40990f));
                    }
                    int i13 = pg.x.f40987s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.h3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.f3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.g3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.c4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.d4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f27685c)[0] = editable.toString();
                ((xh.e4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27683a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27685c;
                editText.post(new org.telegram.ui.tq(this, editText, (AtomicReference) this.f27684b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27685c = charSequence.toString();
                return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27683a;
    }

    public rn(Object obj, Object obj2, boolean z10, int i10) {
        this.f27683a = i10;
        this.f27685c = obj;
        this.f27684b = obj2;
    }

    public rn(pg.v vVar) {
        this.f27683a = 7;
        this.f27684b = vVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
