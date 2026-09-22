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
public final class qn implements TextWatcher {
    public final int f27396a;
    public final Object f27397b;
    public Object f27398c;

    public qn(int i10, Object obj, Object obj2) {
        this.f27396a = i10;
        this.f27397b = obj;
        this.f27398c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27396a;
        s4.c1 c1Var = null;
        Object obj = this.f27397b;
        switch (i10) {
            case 0:
                un unVar = ((sn) obj).d;
                pn pnVar = (pn) this.f27398c;
                if (pnVar.getTag() == null) {
                    s4.c1 K = unVar.f28460s.K(unVar.f28456p0);
                    if (K != null && unVar.f28467x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        unVar.f28467x.setDirection(1);
                        unVar.f28467x.setDelegate(pnVar);
                        unVar.f28467x.setTranslationY(K.f42671a.getY());
                        unVar.f28467x.e();
                    }
                    unVar.P = editable;
                    if (K != null) {
                        un.L(unVar, K.f42671a, unVar.f28456p0);
                    }
                    unVar.T();
                    return;
                }
                return;
            case 1:
                un unVar2 = ((sn) obj).d;
                ec1 ec1Var = unVar2.f28460s;
                rn rnVar = (rn) this.f27398c;
                View F = ec1Var.F(rnVar);
                if (F != null) {
                    c1Var = ec1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f42671a;
                    int b10 = c1Var.b();
                    int i11 = b10 - unVar2.f28462t0;
                    if (i11 >= 0 && i11 < unVar2.K.length) {
                        if (unVar2.f28467x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, rnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                unVar2.f28467x.setDirection(0);
                                unVar2.f28467x.setTranslationY(y3);
                            } else {
                                unVar2.f28467x.setDirection(1);
                                unVar2.f28467x.setTranslationY(view.getY());
                            }
                            unVar2.f28467x.setDelegate(rnVar);
                            unVar2.f28467x.e();
                        }
                        unVar2.K[i11] = editable;
                        un.L(unVar2, rnVar, b10);
                        unVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f30889x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f30887s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27398c).get()) {
                            passcodeActivity.f30887s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30887s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f30887s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30887s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.aw0 aw0Var = ((org.telegram.ui.yv0) obj).d;
                org.telegram.ui.vv0 vv0Var = (org.telegram.ui.vv0) this.f27398c;
                if (vv0Var.getTag() == null) {
                    s4.c1 K2 = aw0Var.f31954c.K(aw0Var.f31962i0);
                    if (K2 != null && aw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, vv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        aw0Var.Q.setDirection(1);
                        aw0Var.Q.setDelegate(vv0Var);
                        aw0Var.Q.setTranslationY(K2.f42671a.getY());
                        aw0Var.Q.e();
                    }
                    aw0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.aw0.c0(aw0Var, K2.f42671a, aw0Var.f31962i0);
                    }
                    aw0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.aw0 aw0Var2 = ((org.telegram.ui.yv0) obj).d;
                org.telegram.ui.wv0 wv0Var = (org.telegram.ui.wv0) this.f27398c;
                if (wv0Var.getTag() == null) {
                    s4.c1 K3 = aw0Var2.f31954c.K(aw0Var2.f31962i0);
                    if (K3 != null && aw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        aw0Var2.Q.setDirection(1);
                        aw0Var2.Q.setDelegate(wv0Var);
                        aw0Var2.Q.setTranslationY(K3.f42671a.getY());
                        aw0Var2.Q.e();
                    }
                    aw0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.aw0.c0(aw0Var2, K3.f42671a, aw0Var2.f31963j0);
                    }
                    aw0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.aw0 aw0Var3 = ((org.telegram.ui.yv0) obj).d;
                ec1 ec1Var2 = aw0Var3.f31954c;
                org.telegram.ui.xv0 xv0Var = (org.telegram.ui.xv0) this.f27398c;
                View F2 = ec1Var2.F(xv0Var);
                if (F2 != null) {
                    c1Var = ec1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f42671a;
                    int b11 = c1Var.b() - aw0Var3.f31967n0;
                    if (b11 >= 0 && b11 < aw0Var3.v.length) {
                        if (aw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, xv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                aw0Var3.Q.setDirection(0);
                                aw0Var3.Q.setTranslationY(y10);
                            } else {
                                aw0Var3.Q.setDirection(1);
                                aw0Var3.Q.setTranslationY(view2.getY());
                            }
                            aw0Var3.Q.setDelegate(xv0Var);
                            aw0Var3.Q.e();
                        }
                        aw0Var3.v[b11] = editable;
                        org.telegram.ui.aw0.c0(aw0Var3, xv0Var, b11);
                        aw0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f41017f;
                if (!vVar.e && ((String) this.f27398c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27398c).toString(), editable.toString())) {
                    int b12 = w7.p.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f41034f), b12, Color.green(xVar.f41034f), Color.blue(xVar.f41034f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f41034f), Color.red(xVar.f41034f), Color.green(xVar.f41034f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f41034f), Color.red(xVar.f41034f), b12, Color.blue(xVar.f41034f));
                    }
                    int i13 = pg.x.f41031s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.g3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.e3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.f3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.b4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.c4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f27398c)[0] = editable.toString();
                ((xh.d4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27396a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27398c;
                editText.post(new org.telegram.ui.xq(this, editText, (AtomicReference) this.f27397b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27398c = charSequence.toString();
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
        int i13 = this.f27396a;
    }

    public qn(Object obj, Object obj2, boolean z10, int i10) {
        this.f27396a = i10;
        this.f27398c = obj;
        this.f27397b = obj2;
    }

    public qn(pg.v vVar) {
        this.f27396a = 7;
        this.f27397b = vVar;
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
