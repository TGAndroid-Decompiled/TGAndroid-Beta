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
import org.telegram.ui.ua1;
public final class ao implements TextWatcher {
    public final int f24678a;
    public final Object f24679b;
    public Object f24680c;

    public ao(int i10, Object obj, Object obj2) {
        this.f24678a = i10;
        this.f24679b = obj;
        this.f24680c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f24678a;
        s4.b1 b1Var = null;
        Object obj = this.f24679b;
        switch (i10) {
            case 0:
                fo foVar = ((co) obj).d;
                zn znVar = (zn) this.f24680c;
                if (znVar.getTag() == null) {
                    s4.b1 K = foVar.f26308s.K(foVar.f26304p0);
                    if (K != null && foVar.f26315x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, znVar.getEditField().getPaint().getFontMetricsInt(), false);
                        foVar.f26315x.setDirection(1);
                        foVar.f26315x.setDelegate(znVar);
                        foVar.f26315x.setTranslationY(K.f45938a.getY());
                        foVar.f26315x.e();
                    }
                    foVar.P = editable;
                    if (K != null) {
                        fo.O(foVar, K.f45938a, foVar.f26304p0);
                    }
                    foVar.W();
                    return;
                }
                return;
            case 1:
                fo foVar2 = ((co) obj).d;
                ua1 ua1Var = foVar2.f26308s;
                bo boVar = (bo) this.f24680c;
                View F = ua1Var.F(boVar);
                if (F != null) {
                    b1Var = ua1Var.T(F);
                }
                if (b1Var != null) {
                    View view = b1Var.f45938a;
                    int b10 = b1Var.b();
                    int i11 = b10 - foVar2.f26310t0;
                    if (i11 >= 0 && i11 < foVar2.K.length) {
                        if (foVar2.f26315x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, boVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                foVar2.f26315x.setDirection(0);
                                foVar2.f26315x.setTranslationY(y3);
                            } else {
                                foVar2.f26315x.setDirection(1);
                                foVar2.f26315x.setTranslationY(view.getY());
                            }
                            foVar2.f26315x.setDelegate(boVar);
                            foVar2.f26315x.e();
                        }
                        foVar2.K[i11] = editable;
                        fo.O(foVar2, boVar, b10);
                        foVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33221x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33219s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f24680c).get()) {
                            passcodeActivity.f33219s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33219s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33219s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33219s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.hv0 hv0Var = ((org.telegram.ui.fv0) obj).d;
                org.telegram.ui.cv0 cv0Var = (org.telegram.ui.cv0) this.f24680c;
                if (cv0Var.getTag() == null) {
                    s4.b1 K2 = hv0Var.f37652c.K(hv0Var.f37660i0);
                    if (K2 != null && hv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, cv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        hv0Var.Q.setDirection(1);
                        hv0Var.Q.setDelegate(cv0Var);
                        hv0Var.Q.setTranslationY(K2.f45938a.getY());
                        hv0Var.Q.e();
                    }
                    hv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.hv0.c0(hv0Var, K2.f45938a, hv0Var.f37660i0);
                    }
                    hv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.hv0 hv0Var2 = ((org.telegram.ui.fv0) obj).d;
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) this.f24680c;
                if (dv0Var.getTag() == null) {
                    s4.b1 K3 = hv0Var2.f37652c.K(hv0Var2.f37660i0);
                    if (K3 != null && hv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, dv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        hv0Var2.Q.setDirection(1);
                        hv0Var2.Q.setDelegate(dv0Var);
                        hv0Var2.Q.setTranslationY(K3.f45938a.getY());
                        hv0Var2.Q.e();
                    }
                    hv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.hv0.c0(hv0Var2, K3.f45938a, hv0Var2.f37661j0);
                    }
                    hv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.hv0 hv0Var3 = ((org.telegram.ui.fv0) obj).d;
                ua1 ua1Var2 = hv0Var3.f37652c;
                org.telegram.ui.ev0 ev0Var = (org.telegram.ui.ev0) this.f24680c;
                View F2 = ua1Var2.F(ev0Var);
                if (F2 != null) {
                    b1Var = ua1Var2.T(F2);
                }
                if (b1Var != null) {
                    View view2 = b1Var.f45938a;
                    int b11 = b1Var.b() - hv0Var3.f37665n0;
                    if (b11 >= 0 && b11 < hv0Var3.v.length) {
                        if (hv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, ev0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                hv0Var3.Q.setDirection(0);
                                hv0Var3.Q.setTranslationY(y10);
                            } else {
                                hv0Var3.Q.setDirection(1);
                                hv0Var3.Q.setTranslationY(view2.getY());
                            }
                            hv0Var3.Q.setDelegate(ev0Var);
                            hv0Var3.Q.e();
                        }
                        hv0Var3.v[b11] = editable;
                        org.telegram.ui.hv0.c0(hv0Var3, ev0Var, b11);
                        hv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qg.w wVar = (qg.w) obj;
                qg.y yVar = wVar.f44712f;
                if (!wVar.e && ((String) this.f24680c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f24680c).toString(), editable.toString())) {
                    int b12 = w7.r.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(yVar.f44730f), b12, Color.green(yVar.f44730f), Color.blue(yVar.f44730f));
                        } else {
                            argb = Color.argb(Color.alpha(yVar.f44730f), Color.red(yVar.f44730f), Color.green(yVar.f44730f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(yVar.f44730f), Color.red(yVar.f44730f), b12, Color.blue(yVar.f44730f));
                    }
                    int i13 = qg.y.f44727s;
                    yVar.n(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.f3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.d3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.e3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.b4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.c4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f24680c)[0] = editable.toString();
                ((yh.d4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24678a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f24680c;
                editText.post(new org.telegram.ui.lq(this, editText, (AtomicReference) this.f24679b, 26));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f24680c = charSequence.toString();
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
        int i13 = this.f24678a;
    }

    public ao(Object obj, Object obj2, boolean z10, int i10) {
        this.f24678a = i10;
        this.f24680c = obj;
        this.f24679b = obj2;
    }

    public ao(qg.w wVar) {
        this.f24678a = 7;
        this.f24679b = wVar;
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
