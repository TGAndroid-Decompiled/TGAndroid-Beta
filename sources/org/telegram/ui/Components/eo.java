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
import org.telegram.ui.kc1;
public final class eo implements TextWatcher {
    public final int f24754a;
    public final Object f24755b;
    public Object f24756c;

    public eo(int i10, Object obj, Object obj2) {
        this.f24754a = i10;
        this.f24755b = obj;
        this.f24756c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f24754a;
        s4.b1 b1Var = null;
        Object obj = this.f24755b;
        switch (i10) {
            case 0:
                io ioVar = ((go) obj).d;
                co coVar = (co) this.f24756c;
                if (coVar.getTag() == null) {
                    s4.b1 K = ioVar.f26031s.K(ioVar.f26027p0);
                    if (K != null && ioVar.f26038x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, coVar.getEditField().getPaint().getFontMetricsInt(), false);
                        ioVar.f26038x.setDirection(1);
                        ioVar.f26038x.setDelegate(coVar);
                        ioVar.f26038x.setTranslationY(K.f44838a.getY());
                        ioVar.f26038x.e();
                    }
                    ioVar.P = editable;
                    if (K != null) {
                        io.O(ioVar, K.f44838a, ioVar.f26027p0);
                    }
                    ioVar.W();
                    return;
                }
                return;
            case 1:
                io ioVar2 = ((go) obj).d;
                kc1 kc1Var = ioVar2.f26031s;
                fo foVar = (fo) this.f24756c;
                View F = kc1Var.F(foVar);
                if (F != null) {
                    b1Var = kc1Var.T(F);
                }
                if (b1Var != null) {
                    View view = b1Var.f44838a;
                    int b10 = b1Var.b();
                    int i11 = b10 - ioVar2.f26033t0;
                    if (i11 >= 0 && i11 < ioVar2.K.length) {
                        if (ioVar2.f26038x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, foVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                ioVar2.f26038x.setDirection(0);
                                ioVar2.f26038x.setTranslationY(y3);
                            } else {
                                ioVar2.f26038x.setDirection(1);
                                ioVar2.f26038x.setTranslationY(view.getY());
                            }
                            ioVar2.f26038x.setDelegate(foVar);
                            ioVar2.f26038x.e();
                        }
                        ioVar2.K[i11] = editable;
                        io.O(ioVar2, foVar, b10);
                        ioVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f32181x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f32179s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f24756c).get()) {
                            passcodeActivity.f32179s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f32179s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f32179s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f32179s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.gw0 gw0Var = ((org.telegram.ui.ew0) obj).d;
                org.telegram.ui.bw0 bw0Var = (org.telegram.ui.bw0) this.f24756c;
                if (bw0Var.getTag() == null) {
                    s4.b1 K2 = gw0Var.f36507c.K(gw0Var.f36515i0);
                    if (K2 != null && gw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, bw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        gw0Var.Q.setDirection(1);
                        gw0Var.Q.setDelegate(bw0Var);
                        gw0Var.Q.setTranslationY(K2.f44838a.getY());
                        gw0Var.Q.e();
                    }
                    gw0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.gw0.c0(gw0Var, K2.f44838a, gw0Var.f36515i0);
                    }
                    gw0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.gw0 gw0Var2 = ((org.telegram.ui.ew0) obj).d;
                org.telegram.ui.cw0 cw0Var = (org.telegram.ui.cw0) this.f24756c;
                if (cw0Var.getTag() == null) {
                    s4.b1 K3 = gw0Var2.f36507c.K(gw0Var2.f36515i0);
                    if (K3 != null && gw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, cw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        gw0Var2.Q.setDirection(1);
                        gw0Var2.Q.setDelegate(cw0Var);
                        gw0Var2.Q.setTranslationY(K3.f44838a.getY());
                        gw0Var2.Q.e();
                    }
                    gw0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.gw0.c0(gw0Var2, K3.f44838a, gw0Var2.f36516j0);
                    }
                    gw0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.gw0 gw0Var3 = ((org.telegram.ui.ew0) obj).d;
                kc1 kc1Var2 = gw0Var3.f36507c;
                org.telegram.ui.dw0 dw0Var = (org.telegram.ui.dw0) this.f24756c;
                View F2 = kc1Var2.F(dw0Var);
                if (F2 != null) {
                    b1Var = kc1Var2.T(F2);
                }
                if (b1Var != null) {
                    View view2 = b1Var.f44838a;
                    int b11 = b1Var.b() - gw0Var3.f36520n0;
                    if (b11 >= 0 && b11 < gw0Var3.v.length) {
                        if (gw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, dw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                gw0Var3.Q.setDirection(0);
                                gw0Var3.Q.setTranslationY(y10);
                            } else {
                                gw0Var3.Q.setDirection(1);
                                gw0Var3.Q.setTranslationY(view2.getY());
                            }
                            gw0Var3.Q.setDelegate(dw0Var);
                            gw0Var3.Q.e();
                        }
                        gw0Var3.v[b11] = editable;
                        org.telegram.ui.gw0.c0(gw0Var3, dw0Var, b11);
                        gw0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qg.v vVar = (qg.v) obj;
                qg.x xVar = vVar.f43594f;
                if (!vVar.e && ((String) this.f24756c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f24756c).toString(), editable.toString())) {
                    int b12 = w7.s.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f43611f), b12, Color.green(xVar.f43611f), Color.blue(xVar.f43611f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f43611f), Color.red(xVar.f43611f), Color.green(xVar.f43611f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f43611f), Color.red(xVar.f43611f), b12, Color.blue(xVar.f43611f));
                    }
                    int i13 = qg.x.f43608s;
                    xVar.n(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.f3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.d3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.e3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.a4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.b4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f24756c)[0] = editable.toString();
                ((yh.c4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24754a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f24756c;
                editText.post(new org.telegram.ui.br(this, editText, (AtomicReference) this.f24755b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f24756c = charSequence.toString();
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
        int i13 = this.f24754a;
    }

    public eo(Object obj, Object obj2, boolean z10, int i10) {
        this.f24754a = i10;
        this.f24756c = obj;
        this.f24755b = obj2;
    }

    public eo(qg.v vVar) {
        this.f24754a = 7;
        this.f24755b = vVar;
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
