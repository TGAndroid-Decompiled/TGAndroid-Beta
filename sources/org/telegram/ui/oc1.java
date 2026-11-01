package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class oc1 implements TextWatcher {
    public final int f40133a;
    public final rc1 f40134b;

    public oc1(rc1 rc1Var, int i10) {
        this.f40133a = i10;
        this.f40134b = rc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ci0 ci0Var;
        switch (this.f40133a) {
            case 0:
                this.f40134b.getClass();
                return;
            case 1:
                rc1 rc1Var = this.f40134b;
                if (!rc1Var.M) {
                    int i10 = rc1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.ci0 animatedDrawable = rc1Var.f41037a.getAnimatedDrawable();
                        if (rc1Var.f41051n.length() > 0) {
                            if (rc1Var.f41051n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ci0[] ci0VarArr = rc1Var.f41046f0;
                                if (animatedDrawable != ci0VarArr[3] && animatedDrawable != (ci0Var = ci0VarArr[5])) {
                                    rc1Var.f41037a.setAnimation(ci0Var);
                                    rc1Var.f41046f0[5].T(false, 0.0f);
                                    rc1Var.f41037a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ci0[] ci0VarArr2 = rc1Var.f41046f0;
                            if (animatedDrawable != ci0VarArr2[3]) {
                                org.telegram.ui.Components.ci0 ci0Var2 = ci0VarArr2[2];
                                if (animatedDrawable != ci0Var2) {
                                    rc1Var.f41037a.setAnimation(ci0Var2);
                                    rc1Var.f41046f0[2].P(49);
                                    rc1Var.f41046f0[2].T(false, 0.0f);
                                    rc1Var.f41037a.d();
                                    return;
                                } else if (ci0Var2.f25131a0 < 49) {
                                    ci0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != rc1Var.f41046f0[3] || rc1Var.f41051n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ci0[] ci0VarArr3 = rc1Var.f41046f0;
                            if (animatedDrawable != ci0VarArr3[5]) {
                                ci0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ci0 ci0Var3 = rc1Var.f41046f0[2];
                                if (animatedDrawable != ci0Var3) {
                                    rc1Var.f41037a.setAnimation(ci0Var3);
                                    rc1Var.f41046f0[2].N(49, false, false);
                                }
                                rc1Var.f41037a.d();
                                return;
                            }
                        }
                        rc1Var.f41037a.setAnimation(rc1Var.f41046f0[4]);
                        rc1Var.f41046f0[4].T(false, 0.0f);
                        rc1Var.f41037a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            rc1Var.f41046f0[6].P((int) ((Math.min(1.0f, rc1Var.f41051n.getLayout().getLineWidth(0) / rc1Var.f41051n.getWidth()) * 142.0f) + 18.0f));
                            rc1Var.f41037a.d();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        rc1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                rc1 rc1Var2 = this.f40134b;
                if (rc1Var2.F) {
                    if (rc1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(rc1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (rc1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(rc1Var2.E, false, 0.1f, true, true);
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
        int i13 = this.f40133a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40133a;
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
