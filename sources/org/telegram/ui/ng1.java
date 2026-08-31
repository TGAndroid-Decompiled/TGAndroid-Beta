package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ng1 implements TextWatcher {
    public final int f39438a;
    public final qg1 f39439b;

    public ng1(qg1 qg1Var, int i10) {
        this.f39438a = i10;
        this.f39439b = qg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.f39438a) {
            case 0:
                this.f39439b.getClass();
                return;
            case 1:
                qg1 qg1Var = this.f39439b;
                if (!qg1Var.J) {
                    int i10 = qg1Var.L;
                    if (i10 == 0) {
                        org.telegram.ui.Components.ij0 animatedDrawable = qg1Var.f40480a.getAnimatedDrawable();
                        if (qg1Var.f40492n.length() > 0) {
                            if (qg1Var.f40492n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = qg1Var.f40485c0;
                                if (animatedDrawable != ij0VarArr[3] && animatedDrawable != (ij0Var = ij0VarArr[5])) {
                                    qg1Var.f40480a.setAnimation(ij0Var);
                                    qg1Var.f40485c0[5].Q(0.0f, false);
                                    qg1Var.f40480a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = qg1Var.f40485c0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var2 = ij0VarArr2[2];
                                if (animatedDrawable != ij0Var2) {
                                    qg1Var.f40480a.setAnimation(ij0Var2);
                                    qg1Var.f40485c0[2].N(49);
                                    qg1Var.f40485c0[2].Q(0.0f, false);
                                    qg1Var.f40480a.d();
                                    return;
                                } else if (ij0Var2.Y < 49) {
                                    ij0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != qg1Var.f40485c0[3] || qg1Var.f40492n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = qg1Var.f40485c0;
                            if (animatedDrawable != ij0VarArr3[5]) {
                                ij0VarArr3[2].N(-1);
                                org.telegram.ui.Components.ij0 ij0Var3 = qg1Var.f40485c0[2];
                                if (animatedDrawable != ij0Var3) {
                                    qg1Var.f40480a.setAnimation(ij0Var3);
                                    qg1Var.f40485c0[2].L(49, false, false);
                                }
                                qg1Var.f40480a.d();
                                return;
                            }
                        }
                        qg1Var.f40480a.setAnimation(qg1Var.f40485c0[4]);
                        qg1Var.f40485c0[4].Q(0.0f, false);
                        qg1Var.f40480a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            qg1Var.f40485c0[6].N((int) ((Math.min(1.0f, qg1Var.f40492n.getLayout().getLineWidth(0) / qg1Var.f40492n.getWidth()) * 142.0f) + 18.0f));
                            qg1Var.f40480a.d();
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        qg1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                qg1 qg1Var2 = this.f39439b;
                if (qg1Var2.C) {
                    if (qg1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(qg1Var2.B, true, 0.1f, true);
                        return;
                    } else if (qg1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(qg1Var2.B, false, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39438a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f39438a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
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
}
