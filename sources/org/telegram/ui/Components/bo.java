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
public final class bo implements TextWatcher {
    public final int f26920a;
    public final Object f26921b;
    public Object f26922c;

    public bo(int i10, Object obj, Object obj2) {
        this.f26920a = i10;
        this.f26921b = obj;
        this.f26922c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f26920a;
        s4.e1 e1Var = null;
        Object obj = this.f26921b;
        switch (i10) {
            case 0:
                go goVar = ((eo) obj).d;
                ao aoVar = (ao) this.f26922c;
                if (aoVar.getTag() == null) {
                    s4.e1 K = goVar.f28649s.K(goVar.f28643p0);
                    if (K != null && goVar.f28656x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, aoVar.getEditField().getPaint().getFontMetricsInt(), false);
                        goVar.f28656x.setDirection(1);
                        goVar.f28656x.setDelegate(aoVar);
                        goVar.f28656x.setTranslationY(K.f47738a.getY());
                        goVar.f28656x.e();
                    }
                    goVar.P = editable;
                    if (K != null) {
                        go.O(goVar, K.f47738a, goVar.f28643p0);
                    }
                    goVar.W();
                    return;
                }
                return;
            case 1:
                go goVar2 = ((eo) obj).d;
                org.telegram.ui.za1 za1Var = goVar2.f28649s;
                co coVar = (co) this.f26922c;
                View F = za1Var.F(coVar);
                if (F != null) {
                    e1Var = za1Var.T(F);
                }
                if (e1Var != null) {
                    View view = e1Var.f47738a;
                    int b10 = e1Var.b();
                    int i11 = b10 - goVar2.f28651t0;
                    if (i11 >= 0 && i11 < goVar2.K.length) {
                        if (goVar2.f28656x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, coVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                goVar2.f28656x.setDirection(0);
                                goVar2.f28656x.setTranslationY(y3);
                            } else {
                                goVar2.f28656x.setDirection(1);
                                goVar2.f28656x.setTranslationY(view.getY());
                            }
                            goVar2.f28656x.setDelegate(coVar);
                            goVar2.f28656x.e();
                        }
                        goVar2.K[i11] = editable;
                        go.O(goVar2, coVar, b10);
                        goVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f35601x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f35599s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f26922c).get()) {
                            passcodeActivity.f35599s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35599s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f35599s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35599s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.mv0 mv0Var = ((org.telegram.ui.kv0) obj).d;
                org.telegram.ui.hv0 hv0Var = (org.telegram.ui.hv0) this.f26922c;
                if (hv0Var.getTag() == null) {
                    s4.e1 K2 = mv0Var.f41679c.K(mv0Var.f41687i0);
                    if (K2 != null && mv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, hv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var.Q.setDirection(1);
                        mv0Var.Q.setDelegate(hv0Var);
                        mv0Var.Q.setTranslationY(K2.f47738a.getY());
                        mv0Var.Q.e();
                    }
                    mv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.mv0.d0(mv0Var, K2.f47738a, mv0Var.f41687i0);
                    }
                    mv0Var.j0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.mv0 mv0Var2 = ((org.telegram.ui.kv0) obj).d;
                org.telegram.ui.iv0 iv0Var = (org.telegram.ui.iv0) this.f26922c;
                if (iv0Var.getTag() == null) {
                    s4.e1 K3 = mv0Var2.f41679c.K(mv0Var2.f41687i0);
                    if (K3 != null && mv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, iv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var2.Q.setDirection(1);
                        mv0Var2.Q.setDelegate(iv0Var);
                        mv0Var2.Q.setTranslationY(K3.f47738a.getY());
                        mv0Var2.Q.e();
                    }
                    mv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.mv0.d0(mv0Var2, K3.f47738a, mv0Var2.f41688j0);
                    }
                    mv0Var2.j0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.mv0 mv0Var3 = ((org.telegram.ui.kv0) obj).d;
                org.telegram.ui.za1 za1Var2 = mv0Var3.f41679c;
                org.telegram.ui.jv0 jv0Var = (org.telegram.ui.jv0) this.f26922c;
                View F2 = za1Var2.F(jv0Var);
                if (F2 != null) {
                    e1Var = za1Var2.T(F2);
                }
                if (e1Var != null) {
                    View view2 = e1Var.f47738a;
                    int b11 = e1Var.b() - mv0Var3.f41692n0;
                    if (b11 >= 0 && b11 < mv0Var3.v.length) {
                        if (mv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, jv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                mv0Var3.Q.setDirection(0);
                                mv0Var3.Q.setTranslationY(y10);
                            } else {
                                mv0Var3.Q.setDirection(1);
                                mv0Var3.Q.setTranslationY(view2.getY());
                            }
                            mv0Var3.Q.setDelegate(jv0Var);
                            mv0Var3.Q.e();
                        }
                        mv0Var3.v[b11] = editable;
                        org.telegram.ui.mv0.d0(mv0Var3, jv0Var, b11);
                        mv0Var3.j0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                rg.w wVar = (rg.w) obj;
                rg.y yVar = wVar.f47584f;
                if (!wVar.e && ((String) this.f26922c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f26922c).toString(), editable.toString())) {
                    int b12 = a8.ee.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(yVar.f47596f), b12, Color.green(yVar.f47596f), Color.blue(yVar.f47596f));
                        } else {
                            argb = Color.argb(Color.alpha(yVar.f47596f), Color.red(yVar.f47596f), Color.green(yVar.f47596f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(yVar.f47596f), Color.red(yVar.f47596f), b12, Color.blue(yVar.f47596f));
                    }
                    int i13 = rg.y.f47593s;
                    yVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.g3) obj).f32152g3.O(true);
                return;
            case 9:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.e3) obj).f32152g3.O(true);
                return;
            case 10:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.f3) obj).f32152g3.O(true);
                return;
            case 11:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.b4) obj).f32152g3.O(true);
                return;
            case 12:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.c4) obj).f32152g3.O(true);
                return;
            default:
                ((String[]) this.f26922c)[0] = editable.toString();
                ((zh.d4) obj).f32152g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26920a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f26922c;
                editText.post(new org.telegram.ui.nq(this, editText, (AtomicReference) this.f26921b, 27));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f26922c = charSequence.toString();
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
        int i13 = this.f26920a;
    }

    public bo(Object obj, Object obj2, boolean z10, int i10) {
        this.f26920a = i10;
        this.f26922c = obj;
        this.f26921b = obj2;
    }

    public bo(rg.w wVar) {
        this.f26920a = 7;
        this.f26921b = wVar;
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
