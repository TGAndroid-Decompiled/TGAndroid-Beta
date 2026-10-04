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
import org.telegram.ui.zb1;
public final class tn implements TextWatcher {
    public final int f31099a;
    public final Object f31100b;
    public Object f31101c;

    public tn(int i10, Object obj, Object obj2) {
        this.f31099a = i10;
        this.f31100b = obj;
        this.f31101c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f31099a;
        s4.c1 c1Var = null;
        Object obj = this.f31100b;
        switch (i10) {
            case 0:
                xn xnVar = ((vn) obj).d;
                sn snVar = (sn) this.f31101c;
                if (snVar.getTag() == null) {
                    s4.c1 K = xnVar.f32937s.K(xnVar.f32933p0);
                    if (K != null && xnVar.f32944x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, snVar.getEditField().getPaint().getFontMetricsInt(), false);
                        xnVar.f32944x.setDirection(1);
                        xnVar.f32944x.setDelegate(snVar);
                        xnVar.f32944x.setTranslationY(K.f46524a.getY());
                        xnVar.f32944x.e();
                    }
                    xnVar.P = editable;
                    if (K != null) {
                        xn.J(xnVar, K.f46524a, xnVar.f32933p0);
                    }
                    xnVar.R();
                    return;
                }
                return;
            case 1:
                xn xnVar2 = ((vn) obj).d;
                zb1 zb1Var = xnVar2.f32937s;
                un unVar = (un) this.f31101c;
                View F = zb1Var.F(unVar);
                if (F != null) {
                    c1Var = zb1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f46524a;
                    int b10 = c1Var.b();
                    int i11 = b10 - xnVar2.f32939t0;
                    if (i11 >= 0 && i11 < xnVar2.K.length) {
                        if (xnVar2.f32944x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, unVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                xnVar2.f32944x.setDirection(0);
                                xnVar2.f32944x.setTranslationY(y3);
                            } else {
                                xnVar2.f32944x.setDirection(1);
                                xnVar2.f32944x.setTranslationY(view.getY());
                            }
                            xnVar2.f32944x.setDelegate(unVar);
                            xnVar2.f32944x.e();
                        }
                        xnVar2.K[i11] = editable;
                        xn.J(xnVar2, unVar, b10);
                        xnVar2.R();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33849x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33847s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f31101c).get()) {
                            passcodeActivity.f33847s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33847s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33847s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33847s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.uv0 uv0Var = ((org.telegram.ui.sv0) obj).d;
                org.telegram.ui.pv0 pv0Var = (org.telegram.ui.pv0) this.f31101c;
                if (pv0Var.getTag() == null) {
                    s4.c1 K2 = uv0Var.f41328c.K(uv0Var.f41337i0);
                    if (K2 != null && uv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, pv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        uv0Var.Q.setDirection(1);
                        uv0Var.Q.setDelegate(pv0Var);
                        uv0Var.Q.setTranslationY(K2.f46524a.getY());
                        uv0Var.Q.e();
                    }
                    uv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.uv0.c0(uv0Var, K2.f46524a, uv0Var.f41337i0);
                    }
                    uv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.uv0 uv0Var2 = ((org.telegram.ui.sv0) obj).d;
                org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) this.f31101c;
                if (qv0Var.getTag() == null) {
                    s4.c1 K3 = uv0Var2.f41328c.K(uv0Var2.f41337i0);
                    if (K3 != null && uv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, qv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        uv0Var2.Q.setDirection(1);
                        uv0Var2.Q.setDelegate(qv0Var);
                        uv0Var2.Q.setTranslationY(K3.f46524a.getY());
                        uv0Var2.Q.e();
                    }
                    uv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.uv0.c0(uv0Var2, K3.f46524a, uv0Var2.f41338j0);
                    }
                    uv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.uv0 uv0Var3 = ((org.telegram.ui.sv0) obj).d;
                zb1 zb1Var2 = uv0Var3.f41328c;
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) this.f31101c;
                View F2 = zb1Var2.F(rv0Var);
                if (F2 != null) {
                    c1Var = zb1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f46524a;
                    int b11 = c1Var.b() - uv0Var3.f41342n0;
                    if (b11 >= 0 && b11 < uv0Var3.v.length) {
                        if (uv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, rv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                uv0Var3.Q.setDirection(0);
                                uv0Var3.Q.setTranslationY(y10);
                            } else {
                                uv0Var3.Q.setDirection(1);
                                uv0Var3.Q.setTranslationY(view2.getY());
                            }
                            uv0Var3.Q.setDelegate(rv0Var);
                            uv0Var3.Q.e();
                        }
                        uv0Var3.v[b11] = editable;
                        org.telegram.ui.uv0.c0(uv0Var3, rv0Var, b11);
                        uv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f44656f;
                if (!vVar.f44655e && ((String) this.f31101c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f31101c).toString(), editable.toString())) {
                    int b12 = w7.q.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f44678f), b12, Color.green(xVar.f44678f), Color.blue(xVar.f44678f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f44678f), Color.red(xVar.f44678f), Color.green(xVar.f44678f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f44678f), Color.red(xVar.f44678f), b12, Color.blue(xVar.f44678f));
                    }
                    int i13 = pg.x.f44674s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.h3) obj).f25245f3.N(true);
                return;
            case 9:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.f3) obj).f25245f3.N(true);
                return;
            case 10:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.g3) obj).f25245f3.N(true);
                return;
            case 11:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.c4) obj).f25245f3.N(true);
                return;
            case 12:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.d4) obj).f25245f3.N(true);
                return;
            default:
                ((String[]) this.f31101c)[0] = editable.toString();
                ((xh.e4) obj).f25245f3.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f31099a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f31101c;
                editText.post(new org.telegram.ui.uq(this, editText, (AtomicReference) this.f31100b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f31101c = charSequence.toString();
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
        int i13 = this.f31099a;
    }

    public tn(Object obj, Object obj2, boolean z10, int i10) {
        this.f31099a = i10;
        this.f31101c = obj;
        this.f31100b = obj2;
    }

    public tn(pg.v vVar) {
        this.f31099a = 7;
        this.f31100b = vVar;
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
