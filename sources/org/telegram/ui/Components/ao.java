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
import org.telegram.ui.sa1;
public final class ao implements TextWatcher {
    public final int f24682a;
    public final Object f24683b;
    public Object f24684c;

    public ao(int i10, Object obj, Object obj2) {
        this.f24682a = i10;
        this.f24683b = obj;
        this.f24684c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f24682a;
        s4.b1 b1Var = null;
        Object obj = this.f24683b;
        switch (i10) {
            case 0:
                fo foVar = ((co) obj).d;
                zn znVar = (zn) this.f24684c;
                if (znVar.getTag() == null) {
                    s4.b1 K = foVar.f26313s.K(foVar.f26309p0);
                    if (K != null && foVar.f26320x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, znVar.getEditField().getPaint().getFontMetricsInt(), false);
                        foVar.f26320x.setDirection(1);
                        foVar.f26320x.setDelegate(znVar);
                        foVar.f26320x.setTranslationY(K.f45917a.getY());
                        foVar.f26320x.e();
                    }
                    foVar.P = editable;
                    if (K != null) {
                        fo.O(foVar, K.f45917a, foVar.f26309p0);
                    }
                    foVar.W();
                    return;
                }
                return;
            case 1:
                fo foVar2 = ((co) obj).d;
                sa1 sa1Var = foVar2.f26313s;
                bo boVar = (bo) this.f24684c;
                View F = sa1Var.F(boVar);
                if (F != null) {
                    b1Var = sa1Var.T(F);
                }
                if (b1Var != null) {
                    View view = b1Var.f45917a;
                    int b10 = b1Var.b();
                    int i11 = b10 - foVar2.f26315t0;
                    if (i11 >= 0 && i11 < foVar2.K.length) {
                        if (foVar2.f26320x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, boVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                foVar2.f26320x.setDirection(0);
                                foVar2.f26320x.setTranslationY(y3);
                            } else {
                                foVar2.f26320x.setDirection(1);
                                foVar2.f26320x.setTranslationY(view.getY());
                            }
                            foVar2.f26320x.setDelegate(boVar);
                            foVar2.f26320x.e();
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
                if (passcodeActivity.f33234x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33232s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f24684c).get()) {
                            passcodeActivity.f33232s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33232s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33232s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33232s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.fv0 fv0Var = ((org.telegram.ui.dv0) obj).d;
                org.telegram.ui.av0 av0Var = (org.telegram.ui.av0) this.f24684c;
                if (av0Var.getTag() == null) {
                    s4.b1 K2 = fv0Var.f37102c.K(fv0Var.f37110i0);
                    if (K2 != null && fv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, av0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var.Q.setDirection(1);
                        fv0Var.Q.setDelegate(av0Var);
                        fv0Var.Q.setTranslationY(K2.f45917a.getY());
                        fv0Var.Q.e();
                    }
                    fv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.fv0.c0(fv0Var, K2.f45917a, fv0Var.f37110i0);
                    }
                    fv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.fv0 fv0Var2 = ((org.telegram.ui.dv0) obj).d;
                org.telegram.ui.bv0 bv0Var = (org.telegram.ui.bv0) this.f24684c;
                if (bv0Var.getTag() == null) {
                    s4.b1 K3 = fv0Var2.f37102c.K(fv0Var2.f37110i0);
                    if (K3 != null && fv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, bv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var2.Q.setDirection(1);
                        fv0Var2.Q.setDelegate(bv0Var);
                        fv0Var2.Q.setTranslationY(K3.f45917a.getY());
                        fv0Var2.Q.e();
                    }
                    fv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.fv0.c0(fv0Var2, K3.f45917a, fv0Var2.f37111j0);
                    }
                    fv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.fv0 fv0Var3 = ((org.telegram.ui.dv0) obj).d;
                sa1 sa1Var2 = fv0Var3.f37102c;
                org.telegram.ui.cv0 cv0Var = (org.telegram.ui.cv0) this.f24684c;
                View F2 = sa1Var2.F(cv0Var);
                if (F2 != null) {
                    b1Var = sa1Var2.T(F2);
                }
                if (b1Var != null) {
                    View view2 = b1Var.f45917a;
                    int b11 = b1Var.b() - fv0Var3.f37115n0;
                    if (b11 >= 0 && b11 < fv0Var3.v.length) {
                        if (fv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, cv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                fv0Var3.Q.setDirection(0);
                                fv0Var3.Q.setTranslationY(y10);
                            } else {
                                fv0Var3.Q.setDirection(1);
                                fv0Var3.Q.setTranslationY(view2.getY());
                            }
                            fv0Var3.Q.setDelegate(cv0Var);
                            fv0Var3.Q.e();
                        }
                        fv0Var3.v[b11] = editable;
                        org.telegram.ui.fv0.c0(fv0Var3, cv0Var, b11);
                        fv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qg.w wVar = (qg.w) obj;
                qg.y yVar = wVar.f44689f;
                if (!wVar.e && ((String) this.f24684c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f24684c).toString(), editable.toString())) {
                    int b12 = w7.r.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(yVar.f44708f), b12, Color.green(yVar.f44708f), Color.blue(yVar.f44708f));
                        } else {
                            argb = Color.argb(Color.alpha(yVar.f44708f), Color.red(yVar.f44708f), Color.green(yVar.f44708f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(yVar.f44708f), Color.red(yVar.f44708f), b12, Color.blue(yVar.f44708f));
                    }
                    int i13 = qg.y.f44705s;
                    yVar.n(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.e3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.c3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.d3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.a4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.b4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f24684c)[0] = editable.toString();
                ((yh.c4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f24682a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f24684c;
                editText.post(new org.telegram.ui.jq(this, editText, (AtomicReference) this.f24683b, 26));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f24684c = charSequence.toString();
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
        int i13 = this.f24682a;
    }

    public ao(Object obj, Object obj2, boolean z10, int i10) {
        this.f24682a = i10;
        this.f24684c = obj;
        this.f24683b = obj2;
    }

    public ao(qg.w wVar) {
        this.f24682a = 7;
        this.f24683b = wVar;
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
