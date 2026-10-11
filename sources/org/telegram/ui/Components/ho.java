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
import org.telegram.ui.ec1;
public final class ho implements TextWatcher {
    public final int f27045a;
    public final Object f27046b;
    public Object f27047c;

    public ho(int i10, Object obj, Object obj2) {
        this.f27045a = i10;
        this.f27046b = obj;
        this.f27047c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27045a;
        s4.d1 d1Var = null;
        Object obj = this.f27046b;
        switch (i10) {
            case 0:
                lo loVar = ((jo) obj).d;
                go goVar = (go) this.f27047c;
                if (goVar.getTag() == null) {
                    s4.d1 K = loVar.f28403s.K(loVar.f28399p0);
                    if (K != null && loVar.f28410x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, goVar.getEditField().getPaint().getFontMetricsInt(), false);
                        loVar.f28410x.setDirection(1);
                        loVar.f28410x.setDelegate(goVar);
                        loVar.f28410x.setTranslationY(K.f47748a.getY());
                        loVar.f28410x.e();
                    }
                    loVar.P = editable;
                    if (K != null) {
                        lo.O(loVar, K.f47748a, loVar.f28399p0);
                    }
                    loVar.W();
                    return;
                }
                return;
            case 1:
                lo loVar2 = ((jo) obj).d;
                ec1 ec1Var = loVar2.f28403s;
                io ioVar = (io) this.f27047c;
                View F = ec1Var.F(ioVar);
                if (F != null) {
                    d1Var = ec1Var.T(F);
                }
                if (d1Var != null) {
                    View view = d1Var.f47748a;
                    int b10 = d1Var.b();
                    int i11 = b10 - loVar2.f28405t0;
                    if (i11 >= 0 && i11 < loVar2.K.length) {
                        if (loVar2.f28410x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, ioVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                loVar2.f28410x.setDirection(0);
                                loVar2.f28410x.setTranslationY(y3);
                            } else {
                                loVar2.f28410x.setDirection(1);
                                loVar2.f28410x.setTranslationY(view.getY());
                            }
                            loVar2.f28410x.setDelegate(ioVar);
                            loVar2.f28410x.e();
                        }
                        loVar2.K[i11] = editable;
                        lo.O(loVar2, ioVar, b10);
                        loVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33886x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33884s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27047c).get()) {
                            passcodeActivity.f33884s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33884s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33884s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33884s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.zv0 zv0Var = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.uv0 uv0Var = (org.telegram.ui.uv0) this.f27047c;
                if (uv0Var.getTag() == null) {
                    s4.d1 K2 = zv0Var.f45092c.K(zv0Var.f45101i0);
                    if (K2 != null && zv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, uv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var.Q.setDirection(1);
                        zv0Var.Q.setDelegate(uv0Var);
                        zv0Var.Q.setTranslationY(K2.f47748a.getY());
                        zv0Var.Q.e();
                    }
                    zv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.zv0.c0(zv0Var, K2.f47748a, zv0Var.f45101i0);
                    }
                    zv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.zv0 zv0Var2 = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.vv0 vv0Var = (org.telegram.ui.vv0) this.f27047c;
                if (vv0Var.getTag() == null) {
                    s4.d1 K3 = zv0Var2.f45092c.K(zv0Var2.f45101i0);
                    if (K3 != null && zv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, vv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var2.Q.setDirection(1);
                        zv0Var2.Q.setDelegate(vv0Var);
                        zv0Var2.Q.setTranslationY(K3.f47748a.getY());
                        zv0Var2.Q.e();
                    }
                    zv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.zv0.c0(zv0Var2, K3.f47748a, zv0Var2.f45102j0);
                    }
                    zv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.zv0 zv0Var3 = ((org.telegram.ui.xv0) obj).d;
                ec1 ec1Var2 = zv0Var3.f45092c;
                org.telegram.ui.wv0 wv0Var = (org.telegram.ui.wv0) this.f27047c;
                View F2 = ec1Var2.F(wv0Var);
                if (F2 != null) {
                    d1Var = ec1Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f47748a;
                    int b11 = d1Var.b() - zv0Var3.f45106n0;
                    if (b11 >= 0 && b11 < zv0Var3.v.length) {
                        if (zv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                zv0Var3.Q.setDirection(0);
                                zv0Var3.Q.setTranslationY(y10);
                            } else {
                                zv0Var3.Q.setDirection(1);
                                zv0Var3.Q.setTranslationY(view2.getY());
                            }
                            zv0Var3.Q.setDelegate(wv0Var);
                            zv0Var3.Q.e();
                        }
                        zv0Var3.v[b11] = editable;
                        org.telegram.ui.zv0.c0(zv0Var3, wv0Var, b11);
                        zv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f45848f;
                if (!vVar.f45847e && ((String) this.f27047c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27047c).toString(), editable.toString())) {
                    int b12 = w7.o.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f45870f), b12, Color.green(xVar.f45870f), Color.blue(xVar.f45870f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f45870f), Color.red(xVar.f45870f), Color.green(xVar.f45870f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f45870f), Color.red(xVar.f45870f), b12, Color.blue(xVar.f45870f));
                    }
                    int i13 = pg.x.f45866s;
                    xVar.o(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.h3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.f3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.g3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.c4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.d4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f27047c)[0] = editable.toString();
                ((xh.e4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27045a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27047c;
                editText.post(new org.telegram.ui.vq(this, editText, (AtomicReference) this.f27046b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27047c = charSequence.toString();
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
        int i13 = this.f27045a;
    }

    public ho(Object obj, Object obj2, boolean z10, int i10) {
        this.f27045a = i10;
        this.f27047c = obj;
        this.f27046b = obj2;
    }

    public ho(pg.v vVar) {
        this.f27045a = 7;
        this.f27046b = vVar;
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
