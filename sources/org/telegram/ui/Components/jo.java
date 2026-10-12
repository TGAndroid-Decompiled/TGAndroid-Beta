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
import org.telegram.ui.hc1;
public final class jo implements TextWatcher {
    public final int f27577a;
    public final Object f27578b;
    public Object f27579c;

    public jo(int i10, Object obj, Object obj2) {
        this.f27577a = i10;
        this.f27578b = obj;
        this.f27579c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27577a;
        s4.d1 d1Var = null;
        Object obj = this.f27578b;
        switch (i10) {
            case 0:
                no noVar = ((lo) obj).d;
                io ioVar = (io) this.f27579c;
                if (ioVar.getTag() == null) {
                    s4.d1 K = noVar.f28907s.K(noVar.f28903p0);
                    if (K != null && noVar.f28914x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, ioVar.getEditField().getPaint().getFontMetricsInt(), false);
                        noVar.f28914x.setDirection(1);
                        noVar.f28914x.setDelegate(ioVar);
                        noVar.f28914x.setTranslationY(K.f47897a.getY());
                        noVar.f28914x.e();
                    }
                    noVar.P = editable;
                    if (K != null) {
                        no.O(noVar, K.f47897a, noVar.f28903p0);
                    }
                    noVar.W();
                    return;
                }
                return;
            case 1:
                no noVar2 = ((lo) obj).d;
                hc1 hc1Var = noVar2.f28907s;
                ko koVar = (ko) this.f27579c;
                View F = hc1Var.F(koVar);
                if (F != null) {
                    d1Var = hc1Var.T(F);
                }
                if (d1Var != null) {
                    View view = d1Var.f47897a;
                    int b10 = d1Var.b();
                    int i11 = b10 - noVar2.f28909t0;
                    if (i11 >= 0 && i11 < noVar2.K.length) {
                        if (noVar2.f28914x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, koVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                noVar2.f28914x.setDirection(0);
                                noVar2.f28914x.setTranslationY(y3);
                            } else {
                                noVar2.f28914x.setDirection(1);
                                noVar2.f28914x.setTranslationY(view.getY());
                            }
                            noVar2.f28914x.setDelegate(koVar);
                            noVar2.f28914x.e();
                        }
                        noVar2.K[i11] = editable;
                        no.O(noVar2, koVar, b10);
                        noVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33697x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33695s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27579c).get()) {
                            passcodeActivity.f33695s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33695s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33695s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33695s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.cw0 cw0Var = ((org.telegram.ui.aw0) obj).d;
                org.telegram.ui.xv0 xv0Var = (org.telegram.ui.xv0) this.f27579c;
                if (xv0Var.getTag() == null) {
                    s4.d1 K2 = cw0Var.f36544c.K(cw0Var.f36553i0);
                    if (K2 != null && cw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, xv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        cw0Var.Q.setDirection(1);
                        cw0Var.Q.setDelegate(xv0Var);
                        cw0Var.Q.setTranslationY(K2.f47897a.getY());
                        cw0Var.Q.e();
                    }
                    cw0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.cw0.c0(cw0Var, K2.f47897a, cw0Var.f36553i0);
                    }
                    cw0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.cw0 cw0Var2 = ((org.telegram.ui.aw0) obj).d;
                org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) this.f27579c;
                if (yv0Var.getTag() == null) {
                    s4.d1 K3 = cw0Var2.f36544c.K(cw0Var2.f36553i0);
                    if (K3 != null && cw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, yv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        cw0Var2.Q.setDirection(1);
                        cw0Var2.Q.setDelegate(yv0Var);
                        cw0Var2.Q.setTranslationY(K3.f47897a.getY());
                        cw0Var2.Q.e();
                    }
                    cw0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.cw0.c0(cw0Var2, K3.f47897a, cw0Var2.f36554j0);
                    }
                    cw0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.cw0 cw0Var3 = ((org.telegram.ui.aw0) obj).d;
                hc1 hc1Var2 = cw0Var3.f36544c;
                org.telegram.ui.zv0 zv0Var = (org.telegram.ui.zv0) this.f27579c;
                View F2 = hc1Var2.F(zv0Var);
                if (F2 != null) {
                    d1Var = hc1Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f47897a;
                    int b11 = d1Var.b() - cw0Var3.f36558n0;
                    if (b11 >= 0 && b11 < cw0Var3.v.length) {
                        if (cw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, zv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                cw0Var3.Q.setDirection(0);
                                cw0Var3.Q.setTranslationY(y10);
                            } else {
                                cw0Var3.Q.setDirection(1);
                                cw0Var3.Q.setTranslationY(view2.getY());
                            }
                            cw0Var3.Q.setDelegate(zv0Var);
                            cw0Var3.Q.e();
                        }
                        cw0Var3.v[b11] = editable;
                        org.telegram.ui.cw0.c0(cw0Var3, zv0Var, b11);
                        cw0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f45707f;
                if (!vVar.f45706e && ((String) this.f27579c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27579c).toString(), editable.toString())) {
                    int b12 = w7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f45728f), b12, Color.green(xVar.f45728f), Color.blue(xVar.f45728f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f45728f), Color.red(xVar.f45728f), Color.green(xVar.f45728f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f45728f), Color.red(xVar.f45728f), b12, Color.blue(xVar.f45728f));
                    }
                    int i13 = pg.x.f45724s;
                    xVar.o(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.g3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.e3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.f3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.b4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.c4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f27579c)[0] = editable.toString();
                ((xh.d4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27577a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27579c;
                editText.post(new org.telegram.ui.yq(this, editText, (AtomicReference) this.f27578b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27579c = charSequence.toString();
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
        int i13 = this.f27577a;
    }

    public jo(Object obj, Object obj2, boolean z10, int i10) {
        this.f27577a = i10;
        this.f27579c = obj;
        this.f27578b = obj2;
    }

    public jo(pg.v vVar) {
        this.f27577a = 7;
        this.f27578b = vVar;
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
