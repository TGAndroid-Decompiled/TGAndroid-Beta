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
import org.telegram.ui.fc1;
public final class qn implements TextWatcher {
    public final int f27356a;
    public final Object f27357b;
    public Object f27358c;

    public qn(int i10, Object obj, Object obj2) {
        this.f27356a = i10;
        this.f27357b = obj;
        this.f27358c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27356a;
        s4.c1 c1Var = null;
        Object obj = this.f27357b;
        switch (i10) {
            case 0:
                un unVar = ((sn) obj).d;
                pn pnVar = (pn) this.f27358c;
                if (pnVar.getTag() == null) {
                    s4.c1 L = unVar.f28441s.L(unVar.f28437p0);
                    if (L != null && unVar.f28448x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        unVar.f28448x.setDirection(1);
                        unVar.f28448x.setDelegate(pnVar);
                        unVar.f28448x.setTranslationY(L.f42697a.getY());
                        unVar.f28448x.e();
                    }
                    unVar.P = editable;
                    if (L != null) {
                        un.L(unVar, L.f42697a, unVar.f28437p0);
                    }
                    unVar.T();
                    return;
                }
                return;
            case 1:
                un unVar2 = ((sn) obj).d;
                fc1 fc1Var = unVar2.f28441s;
                rn rnVar = (rn) this.f27358c;
                View G = fc1Var.G(rnVar);
                if (G != null) {
                    c1Var = fc1Var.U(G);
                }
                if (c1Var != null) {
                    View view = c1Var.f42697a;
                    int b10 = c1Var.b();
                    int i11 = b10 - unVar2.f28443t0;
                    if (i11 >= 0 && i11 < unVar2.K.length) {
                        if (unVar2.f28448x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, rnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                unVar2.f28448x.setDirection(0);
                                unVar2.f28448x.setTranslationY(y3);
                            } else {
                                unVar2.f28448x.setDirection(1);
                                unVar2.f28448x.setTranslationY(view.getY());
                            }
                            unVar2.f28448x.setDelegate(rnVar);
                            unVar2.f28448x.e();
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
                if (passcodeActivity.f30906x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f30904s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27358c).get()) {
                            passcodeActivity.f30904s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30904s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f30904s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30904s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.cw0 cw0Var = ((org.telegram.ui.aw0) obj).d;
                org.telegram.ui.xv0 xv0Var = (org.telegram.ui.xv0) this.f27358c;
                if (xv0Var.getTag() == null) {
                    s4.c1 L2 = cw0Var.f32934c.L(cw0Var.f32942i0);
                    if (L2 != null && cw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, xv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        cw0Var.Q.setDirection(1);
                        cw0Var.Q.setDelegate(xv0Var);
                        cw0Var.Q.setTranslationY(L2.f42697a.getY());
                        cw0Var.Q.e();
                    }
                    cw0Var.E = editable;
                    if (L2 != null) {
                        org.telegram.ui.cw0.c0(cw0Var, L2.f42697a, cw0Var.f32942i0);
                    }
                    cw0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.cw0 cw0Var2 = ((org.telegram.ui.aw0) obj).d;
                org.telegram.ui.yv0 yv0Var = (org.telegram.ui.yv0) this.f27358c;
                if (yv0Var.getTag() == null) {
                    s4.c1 L3 = cw0Var2.f32934c.L(cw0Var2.f32942i0);
                    if (L3 != null && cw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, yv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        cw0Var2.Q.setDirection(1);
                        cw0Var2.Q.setDelegate(yv0Var);
                        cw0Var2.Q.setTranslationY(L3.f42697a.getY());
                        cw0Var2.Q.e();
                    }
                    cw0Var2.F = editable;
                    if (L3 != null) {
                        org.telegram.ui.cw0.c0(cw0Var2, L3.f42697a, cw0Var2.f32943j0);
                    }
                    cw0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.cw0 cw0Var3 = ((org.telegram.ui.aw0) obj).d;
                fc1 fc1Var2 = cw0Var3.f32934c;
                org.telegram.ui.zv0 zv0Var = (org.telegram.ui.zv0) this.f27358c;
                View G2 = fc1Var2.G(zv0Var);
                if (G2 != null) {
                    c1Var = fc1Var2.U(G2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f42697a;
                    int b11 = c1Var.b() - cw0Var3.f32947n0;
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
                pg.x xVar = vVar.f41043f;
                if (!vVar.e && ((String) this.f27358c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27358c).toString(), editable.toString())) {
                    int b12 = w7.p.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f41060f), b12, Color.green(xVar.f41060f), Color.blue(xVar.f41060f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f41060f), Color.red(xVar.f41060f), Color.green(xVar.f41060f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f41060f), Color.red(xVar.f41060f), b12, Color.blue(xVar.f41060f));
                    }
                    int i13 = pg.x.f41057s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.g3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.e3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.f3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.b4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.c4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f27358c)[0] = editable.toString();
                ((xh.d4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27356a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27358c;
                editText.post(new org.telegram.ui.xq(this, editText, (AtomicReference) this.f27357b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27358c = charSequence.toString();
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
        int i13 = this.f27356a;
    }

    public qn(Object obj, Object obj2, boolean z10, int i10) {
        this.f27356a = i10;
        this.f27358c = obj;
        this.f27357b = obj2;
    }

    public qn(pg.v vVar) {
        this.f27356a = 7;
        this.f27357b = vVar;
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
