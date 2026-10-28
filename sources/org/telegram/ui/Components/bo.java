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
    public final int f26876a;
    public final Object f26877b;
    public Object f26878c;

    public bo(int i10, Object obj, Object obj2) {
        this.f26876a = i10;
        this.f26877b = obj;
        this.f26878c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f26876a;
        s4.e1 e1Var = null;
        Object obj = this.f26877b;
        switch (i10) {
            case 0:
                go goVar = ((eo) obj).d;
                ao aoVar = (ao) this.f26878c;
                if (aoVar.getTag() == null) {
                    s4.e1 K = goVar.f28696s.K(goVar.f28690p0);
                    if (K != null && goVar.f28703x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, aoVar.getEditField().getPaint().getFontMetricsInt(), false);
                        goVar.f28703x.setDirection(1);
                        goVar.f28703x.setDelegate(aoVar);
                        goVar.f28703x.setTranslationY(K.f47773a.getY());
                        goVar.f28703x.e();
                    }
                    goVar.P = editable;
                    if (K != null) {
                        go.O(goVar, K.f47773a, goVar.f28690p0);
                    }
                    goVar.W();
                    return;
                }
                return;
            case 1:
                go goVar2 = ((eo) obj).d;
                org.telegram.ui.bb1 bb1Var = goVar2.f28696s;
                co coVar = (co) this.f26878c;
                View F = bb1Var.F(coVar);
                if (F != null) {
                    e1Var = bb1Var.T(F);
                }
                if (e1Var != null) {
                    View view = e1Var.f47773a;
                    int b10 = e1Var.b();
                    int i11 = b10 - goVar2.f28698t0;
                    if (i11 >= 0 && i11 < goVar2.K.length) {
                        if (goVar2.f28703x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, coVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                goVar2.f28703x.setDirection(0);
                                goVar2.f28703x.setTranslationY(y3);
                            } else {
                                goVar2.f28703x.setDirection(1);
                                goVar2.f28703x.setTranslationY(view.getY());
                            }
                            goVar2.f28703x.setDelegate(coVar);
                            goVar2.f28703x.e();
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
                if (passcodeActivity.f35625x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f35623s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f26878c).get()) {
                            passcodeActivity.f35623s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35623s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f35623s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35623s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.ov0 ov0Var = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.jv0 jv0Var = (org.telegram.ui.jv0) this.f26878c;
                if (jv0Var.getTag() == null) {
                    s4.e1 K2 = ov0Var.f42211c.K(ov0Var.f42219i0);
                    if (K2 != null && ov0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, jv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ov0Var.Q.setDirection(1);
                        ov0Var.Q.setDelegate(jv0Var);
                        ov0Var.Q.setTranslationY(K2.f47773a.getY());
                        ov0Var.Q.e();
                    }
                    ov0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.ov0.d0(ov0Var, K2.f47773a, ov0Var.f42219i0);
                    }
                    ov0Var.j0();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ov0 ov0Var2 = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.kv0 kv0Var = (org.telegram.ui.kv0) this.f26878c;
                if (kv0Var.getTag() == null) {
                    s4.e1 K3 = ov0Var2.f42211c.K(ov0Var2.f42219i0);
                    if (K3 != null && ov0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, kv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ov0Var2.Q.setDirection(1);
                        ov0Var2.Q.setDelegate(kv0Var);
                        ov0Var2.Q.setTranslationY(K3.f47773a.getY());
                        ov0Var2.Q.e();
                    }
                    ov0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.ov0.d0(ov0Var2, K3.f47773a, ov0Var2.f42220j0);
                    }
                    ov0Var2.j0();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ov0 ov0Var3 = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.bb1 bb1Var2 = ov0Var3.f42211c;
                org.telegram.ui.lv0 lv0Var = (org.telegram.ui.lv0) this.f26878c;
                View F2 = bb1Var2.F(lv0Var);
                if (F2 != null) {
                    e1Var = bb1Var2.T(F2);
                }
                if (e1Var != null) {
                    View view2 = e1Var.f47773a;
                    int b11 = e1Var.b() - ov0Var3.f42224n0;
                    if (b11 >= 0 && b11 < ov0Var3.v.length) {
                        if (ov0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, lv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                ov0Var3.Q.setDirection(0);
                                ov0Var3.Q.setTranslationY(y10);
                            } else {
                                ov0Var3.Q.setDirection(1);
                                ov0Var3.Q.setTranslationY(view2.getY());
                            }
                            ov0Var3.Q.setDelegate(lv0Var);
                            ov0Var3.Q.e();
                        }
                        ov0Var3.v[b11] = editable;
                        org.telegram.ui.ov0.d0(ov0Var3, lv0Var, b11);
                        ov0Var3.j0();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                rg.w wVar = (rg.w) obj;
                rg.y yVar = wVar.f47619f;
                if (!wVar.e && ((String) this.f26878c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f26878c).toString(), editable.toString())) {
                    int b12 = a8.ee.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            argb = Color.argb(Color.alpha(yVar.f47631f), b12, Color.green(yVar.f47631f), Color.blue(yVar.f47631f));
                        } else {
                            argb = Color.argb(Color.alpha(yVar.f47631f), Color.red(yVar.f47631f), Color.green(yVar.f47631f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(yVar.f47631f), Color.red(yVar.f47631f), b12, Color.blue(yVar.f47631f));
                    }
                    int i13 = rg.y.f47628s;
                    yVar.m(argb, 5);
                    return;
                }
                return;
            case 8:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.g3) obj).f32504g3.O(true);
                return;
            case 9:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.e3) obj).f32504g3.O(true);
                return;
            case 10:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.f3) obj).f32504g3.O(true);
                return;
            case 11:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.b4) obj).f32504g3.O(true);
                return;
            case 12:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.c4) obj).f32504g3.O(true);
                return;
            default:
                ((String[]) this.f26878c)[0] = editable.toString();
                ((zh.d4) obj).f32504g3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26876a) {
            case 0:
            case 1:
                return;
            case 2:
                EditText editText = (EditText) this.f26878c;
                editText.post(new org.telegram.ui.pq(this, editText, (AtomicReference) this.f26877b, 28));
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                this.f26878c = charSequence.toString();
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
        int i13 = this.f26876a;
    }

    public bo(Object obj, Object obj2, boolean z10, int i10) {
        this.f26876a = i10;
        this.f26878c = obj;
        this.f26877b = obj2;
    }

    public bo(rg.w wVar) {
        this.f26876a = 7;
        this.f26877b = wVar;
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
