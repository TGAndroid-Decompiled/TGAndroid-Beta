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
public final class pn implements TextWatcher {
    public final int f29440a;
    public final Object f29441b;
    public Object f29442c;

    public pn(int i10, Object obj, Object obj2) {
        this.f29440a = i10;
        this.f29441b = obj;
        this.f29442c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f29440a;
        s4.c1 c1Var = null;
        Object obj = this.f29441b;
        switch (i10) {
            case 0:
                tn tnVar = ((rn) obj).d;
                on onVar = (on) this.f29442c;
                if (onVar.getTag() == null) {
                    s4.c1 K = tnVar.f30654s.K(tnVar.f30650p0);
                    if (K != null && tnVar.f30661x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
                        tnVar.f30661x.setDirection(1);
                        tnVar.f30661x.setDelegate(onVar);
                        tnVar.f30661x.setTranslationY(K.f45738a.getY());
                        tnVar.f30661x.e();
                    }
                    tnVar.P = editable;
                    if (K != null) {
                        tn.L(tnVar, K.f45738a, tnVar.f30650p0);
                    }
                    tnVar.T();
                    return;
                }
                return;
            case 1:
                tn tnVar2 = ((rn) obj).d;
                ec1 ec1Var = tnVar2.f30654s;
                qn qnVar = (qn) this.f29442c;
                View F = ec1Var.F(qnVar);
                if (F != null) {
                    c1Var = ec1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f45738a;
                    int b10 = c1Var.b();
                    int i11 = b10 - tnVar2.f30656t0;
                    if (i11 >= 0 && i11 < tnVar2.K.length) {
                        if (tnVar2.f30661x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                tnVar2.f30661x.setDirection(0);
                                tnVar2.f30661x.setTranslationY(y3);
                            } else {
                                tnVar2.f30661x.setDirection(1);
                                tnVar2.f30661x.setTranslationY(view.getY());
                            }
                            tnVar2.f30661x.setDelegate(qnVar);
                            tnVar2.f30661x.e();
                        }
                        tnVar2.K[i11] = editable;
                        tn.L(tnVar2, qnVar, b10);
                        tnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33504x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33502s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f29442c).get()) {
                            passcodeActivity.f33502s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33502s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33502s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33502s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.zv0 zv0Var = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.uv0 uv0Var = (org.telegram.ui.uv0) this.f29442c;
                if (uv0Var.getTag() == null) {
                    s4.c1 K2 = zv0Var.f43531c.K(zv0Var.f43540i0);
                    if (K2 != null && zv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, uv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var.Q.setDirection(1);
                        zv0Var.Q.setDelegate(uv0Var);
                        zv0Var.Q.setTranslationY(K2.f45738a.getY());
                        zv0Var.Q.e();
                    }
                    zv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.zv0.c0(zv0Var, K2.f45738a, zv0Var.f43540i0);
                    }
                    zv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.zv0 zv0Var2 = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.vv0 vv0Var = (org.telegram.ui.vv0) this.f29442c;
                if (vv0Var.getTag() == null) {
                    s4.c1 K3 = zv0Var2.f43531c.K(zv0Var2.f43540i0);
                    if (K3 != null && zv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, vv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var2.Q.setDirection(1);
                        zv0Var2.Q.setDelegate(vv0Var);
                        zv0Var2.Q.setTranslationY(K3.f45738a.getY());
                        zv0Var2.Q.e();
                    }
                    zv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.zv0.c0(zv0Var2, K3.f45738a, zv0Var2.f43541j0);
                    }
                    zv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.zv0 zv0Var3 = ((org.telegram.ui.xv0) obj).d;
                ec1 ec1Var2 = zv0Var3.f43531c;
                org.telegram.ui.wv0 wv0Var = (org.telegram.ui.wv0) this.f29442c;
                View F2 = ec1Var2.F(wv0Var);
                if (F2 != null) {
                    c1Var = ec1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f45738a;
                    int b11 = c1Var.b() - zv0Var3.f43545n0;
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
                qg.v vVar = (qg.v) obj;
                qg.x xVar = vVar.f44599f;
                if (!vVar.f44598e && ((String) this.f29442c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f29442c).toString(), editable.toString())) {
                    int b12 = w7.p.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f44619f), b12, Color.green(xVar.f44619f), Color.blue(xVar.f44619f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f44619f), Color.red(xVar.f44619f), Color.green(xVar.f44619f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f44619f), Color.red(xVar.f44619f), b12, Color.blue(xVar.f44619f));
                    }
                    int i13 = qg.x.f44615s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.f3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.d3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.e3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.a4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.b4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f29442c)[0] = editable.toString();
                ((yh.c4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29440a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f29442c;
                editText.post(new org.telegram.ui.yq(this, editText, (AtomicReference) this.f29441b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f29442c = charSequence.toString();
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
        int i13 = this.f29440a;
    }

    public pn(Object obj, Object obj2, boolean z10, int i10) {
        this.f29440a = i10;
        this.f29442c = obj;
        this.f29441b = obj2;
    }

    public pn(qg.v vVar) {
        this.f29440a = 7;
        this.f29441b = vVar;
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
