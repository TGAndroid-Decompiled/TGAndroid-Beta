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
import org.telegram.ui.wb1;
public final class sn implements TextWatcher {
    public final int f28317a;
    public final Object f28318b;
    public Object f28319c;

    public sn(int i10, Object obj, Object obj2) {
        this.f28317a = i10;
        this.f28318b = obj;
        this.f28319c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f28317a;
        s4.c1 c1Var = null;
        Object obj = this.f28318b;
        switch (i10) {
            case 0:
                wn wnVar = ((un) obj).d;
                rn rnVar = (rn) this.f28319c;
                if (rnVar.getTag() == null) {
                    s4.c1 K = wnVar.f30137s.K(wnVar.f30133p0);
                    if (K != null && wnVar.f30144x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, rnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        wnVar.f30144x.setDirection(1);
                        wnVar.f30144x.setDelegate(rnVar);
                        wnVar.f30144x.setTranslationY(K.f42959a.getY());
                        wnVar.f30144x.e();
                    }
                    wnVar.P = editable;
                    if (K != null) {
                        wn.L(wnVar, K.f42959a, wnVar.f30133p0);
                    }
                    wnVar.T();
                    return;
                }
                return;
            case 1:
                wn wnVar2 = ((un) obj).d;
                wb1 wb1Var = wnVar2.f30137s;
                tn tnVar = (tn) this.f28319c;
                View F = wb1Var.F(tnVar);
                if (F != null) {
                    c1Var = wb1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f42959a;
                    int b10 = c1Var.b();
                    int i11 = b10 - wnVar2.f30139t0;
                    if (i11 >= 0 && i11 < wnVar2.K.length) {
                        if (wnVar2.f30144x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, tnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                wnVar2.f30144x.setDirection(0);
                                wnVar2.f30144x.setTranslationY(y3);
                            } else {
                                wnVar2.f30144x.setDirection(1);
                                wnVar2.f30144x.setTranslationY(view.getY());
                            }
                            wnVar2.f30144x.setDelegate(tnVar);
                            wnVar2.f30144x.e();
                        }
                        wnVar2.K[i11] = editable;
                        wn.L(wnVar2, tnVar, b10);
                        wnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f31177x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f31175s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f28319c).get()) {
                            passcodeActivity.f31175s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31175s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f31175s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31175s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.rv0 rv0Var = ((org.telegram.ui.pv0) obj).d;
                org.telegram.ui.mv0 mv0Var = (org.telegram.ui.mv0) this.f28319c;
                if (mv0Var.getTag() == null) {
                    s4.c1 K2 = rv0Var.f37499c.K(rv0Var.f37507i0);
                    if (K2 != null && rv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, mv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        rv0Var.Q.setDirection(1);
                        rv0Var.Q.setDelegate(mv0Var);
                        rv0Var.Q.setTranslationY(K2.f42959a.getY());
                        rv0Var.Q.e();
                    }
                    rv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.rv0.c0(rv0Var, K2.f42959a, rv0Var.f37507i0);
                    }
                    rv0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.rv0 rv0Var2 = ((org.telegram.ui.pv0) obj).d;
                org.telegram.ui.nv0 nv0Var = (org.telegram.ui.nv0) this.f28319c;
                if (nv0Var.getTag() == null) {
                    s4.c1 K3 = rv0Var2.f37499c.K(rv0Var2.f37507i0);
                    if (K3 != null && rv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, nv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        rv0Var2.Q.setDirection(1);
                        rv0Var2.Q.setDelegate(nv0Var);
                        rv0Var2.Q.setTranslationY(K3.f42959a.getY());
                        rv0Var2.Q.e();
                    }
                    rv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.rv0.c0(rv0Var2, K3.f42959a, rv0Var2.f37508j0);
                    }
                    rv0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.rv0 rv0Var3 = ((org.telegram.ui.pv0) obj).d;
                wb1 wb1Var2 = rv0Var3.f37499c;
                org.telegram.ui.ov0 ov0Var = (org.telegram.ui.ov0) this.f28319c;
                View F2 = wb1Var2.F(ov0Var);
                if (F2 != null) {
                    c1Var = wb1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f42959a;
                    int b11 = c1Var.b() - rv0Var3.f37512n0;
                    if (b11 >= 0 && b11 < rv0Var3.v.length) {
                        if (rv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, ov0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                rv0Var3.Q.setDirection(0);
                                rv0Var3.Q.setTranslationY(y10);
                            } else {
                                rv0Var3.Q.setDirection(1);
                                rv0Var3.Q.setTranslationY(view2.getY());
                            }
                            rv0Var3.Q.setDelegate(ov0Var);
                            rv0Var3.Q.e();
                        }
                        rv0Var3.v[b11] = editable;
                        org.telegram.ui.rv0.c0(rv0Var3, ov0Var, b11);
                        rv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f41287f;
                if (!vVar.e && ((String) this.f28319c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f28319c).toString(), editable.toString())) {
                    int b12 = w7.q.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f41306f), b12, Color.green(xVar.f41306f), Color.blue(xVar.f41306f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f41306f), Color.red(xVar.f41306f), Color.green(xVar.f41306f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f41306f), Color.red(xVar.f41306f), b12, Color.blue(xVar.f41306f));
                    }
                    int i13 = pg.x.f41303s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.h3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.f3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.g3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.c4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.d4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f28319c)[0] = editable.toString();
                ((xh.e4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28317a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f28319c;
                editText.post(new org.telegram.ui.sq(this, editText, (AtomicReference) this.f28318b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f28319c = charSequence.toString();
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
        int i13 = this.f28317a;
    }

    public sn(Object obj, Object obj2, boolean z10, int i10) {
        this.f28317a = i10;
        this.f28319c = obj;
        this.f28318b = obj2;
    }

    public sn(pg.v vVar) {
        this.f28317a = 7;
        this.f28318b = vVar;
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
