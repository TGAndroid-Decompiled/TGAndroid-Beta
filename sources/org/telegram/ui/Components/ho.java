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
public final class ho implements TextWatcher {
    public final int f27097a;
    public final Object f27098b;
    public Object f27099c;

    public ho(int i10, Object obj, Object obj2) {
        this.f27097a = i10;
        this.f27098b = obj;
        this.f27099c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f27097a;
        s4.d1 d1Var = null;
        Object obj = this.f27098b;
        switch (i10) {
            case 0:
                lo loVar = ((jo) obj).d;
                go goVar = (go) this.f27099c;
                if (goVar.getTag() == null) {
                    s4.d1 K = loVar.f28525s.K(loVar.f28521p0);
                    if (K != null && loVar.f28532x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, goVar.getEditField().getPaint().getFontMetricsInt(), false);
                        loVar.f28532x.setDirection(1);
                        loVar.f28532x.setDelegate(goVar);
                        loVar.f28532x.setTranslationY(K.f47658a.getY());
                        loVar.f28532x.e();
                    }
                    loVar.P = editable;
                    if (K != null) {
                        lo.O(loVar, K.f47658a, loVar.f28521p0);
                    }
                    loVar.W();
                    return;
                }
                return;
            case 1:
                lo loVar2 = ((jo) obj).d;
                fc1 fc1Var = loVar2.f28525s;
                io ioVar = (io) this.f27099c;
                View F = fc1Var.F(ioVar);
                if (F != null) {
                    d1Var = fc1Var.T(F);
                }
                if (d1Var != null) {
                    View view = d1Var.f47658a;
                    int b10 = d1Var.b();
                    int i11 = b10 - loVar2.f28527t0;
                    if (i11 >= 0 && i11 < loVar2.K.length) {
                        if (loVar2.f28532x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, ioVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                loVar2.f28532x.setDirection(0);
                                loVar2.f28532x.setTranslationY(y3);
                            } else {
                                loVar2.f28532x.setDirection(1);
                                loVar2.f28532x.setTranslationY(view.getY());
                            }
                            loVar2.f28532x.setDelegate(ioVar);
                            loVar2.f28532x.e();
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
                if (passcodeActivity.f33858x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33856s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f27099c).get()) {
                            passcodeActivity.f33856s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33856s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33856s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f33856s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.aw0 aw0Var = ((org.telegram.ui.yv0) obj).d;
                org.telegram.ui.vv0 vv0Var = (org.telegram.ui.vv0) this.f27099c;
                if (vv0Var.getTag() == null) {
                    s4.d1 K2 = aw0Var.f36038c.K(aw0Var.f36047i0);
                    if (K2 != null && aw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, vv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        aw0Var.Q.setDirection(1);
                        aw0Var.Q.setDelegate(vv0Var);
                        aw0Var.Q.setTranslationY(K2.f47658a.getY());
                        aw0Var.Q.e();
                    }
                    aw0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.aw0.c0(aw0Var, K2.f47658a, aw0Var.f36047i0);
                    }
                    aw0Var.i0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.aw0 aw0Var2 = ((org.telegram.ui.yv0) obj).d;
                org.telegram.ui.wv0 wv0Var = (org.telegram.ui.wv0) this.f27099c;
                if (wv0Var.getTag() == null) {
                    s4.d1 K3 = aw0Var2.f36038c.K(aw0Var2.f36047i0);
                    if (K3 != null && aw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        aw0Var2.Q.setDirection(1);
                        aw0Var2.Q.setDelegate(wv0Var);
                        aw0Var2.Q.setTranslationY(K3.f47658a.getY());
                        aw0Var2.Q.e();
                    }
                    aw0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.aw0.c0(aw0Var2, K3.f47658a, aw0Var2.f36048j0);
                    }
                    aw0Var2.i0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.aw0 aw0Var3 = ((org.telegram.ui.yv0) obj).d;
                fc1 fc1Var2 = aw0Var3.f36038c;
                org.telegram.ui.xv0 xv0Var = (org.telegram.ui.xv0) this.f27099c;
                View F2 = fc1Var2.F(xv0Var);
                if (F2 != null) {
                    d1Var = fc1Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f47658a;
                    int b11 = d1Var.b() - aw0Var3.f36052n0;
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
                pg.x xVar = vVar.f45814f;
                if (!vVar.f45813e && ((String) this.f27099c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f27099c).toString(), editable.toString())) {
                    int b12 = w7.o.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f45836f), b12, Color.green(xVar.f45836f), Color.blue(xVar.f45836f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f45836f), Color.red(xVar.f45836f), Color.green(xVar.f45836f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f45836f), Color.red(xVar.f45836f), b12, Color.blue(xVar.f45836f));
                    }
                    int i13 = pg.x.f45832s;
                    xVar.o(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.h3) obj).W2.N(true);
                return;
            case 9:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.f3) obj).W2.N(true);
                return;
            case 10:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.g3) obj).W2.N(true);
                return;
            case 11:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.c4) obj).W2.N(true);
                return;
            case 12:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.d4) obj).W2.N(true);
                return;
            default:
                ((String[]) this.f27099c)[0] = editable.toString();
                ((xh.e4) obj).W2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27097a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f27099c;
                editText.post(new org.telegram.ui.vq(this, editText, (AtomicReference) this.f27098b, 25));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f27099c = charSequence.toString();
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
        int i13 = this.f27097a;
    }

    public ho(Object obj, Object obj2, boolean z10, int i10) {
        this.f27097a = i10;
        this.f27099c = obj;
        this.f27098b = obj2;
    }

    public ho(pg.v vVar) {
        this.f27097a = 7;
        this.f27098b = vVar;
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
