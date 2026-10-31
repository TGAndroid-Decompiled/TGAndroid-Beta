package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class qc1 implements TextWatcher {
    public final int f40955a;
    public final tc1 f40956b;

    public qc1(tc1 tc1Var, int i10) {
        this.f40955a = i10;
        this.f40956b = tc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.bi0 bi0Var;
        switch (this.f40955a) {
            case 0:
                this.f40956b.getClass();
                return;
            case 1:
                tc1 tc1Var = this.f40956b;
                if (!tc1Var.M) {
                    int i10 = tc1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                        if (tc1Var.f41808n.length() > 0) {
                            if (tc1Var.f41808n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.bi0[] bi0VarArr = tc1Var.f41803f0;
                                if (animatedDrawable != bi0VarArr[3] && animatedDrawable != (bi0Var = bi0VarArr[5])) {
                                    tc1Var.f41794a.setAnimation(bi0Var);
                                    tc1Var.f41803f0[5].T(false, 0.0f);
                                    tc1Var.f41794a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.bi0[] bi0VarArr2 = tc1Var.f41803f0;
                            if (animatedDrawable != bi0VarArr2[3]) {
                                org.telegram.ui.Components.bi0 bi0Var2 = bi0VarArr2[2];
                                if (animatedDrawable != bi0Var2) {
                                    tc1Var.f41794a.setAnimation(bi0Var2);
                                    tc1Var.f41803f0[2].P(49);
                                    tc1Var.f41803f0[2].T(false, 0.0f);
                                    tc1Var.f41794a.d();
                                    return;
                                } else if (bi0Var2.f24752a0 < 49) {
                                    bi0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != tc1Var.f41803f0[3] || tc1Var.f41808n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.bi0[] bi0VarArr3 = tc1Var.f41803f0;
                            if (animatedDrawable != bi0VarArr3[5]) {
                                bi0VarArr3[2].P(-1);
                                org.telegram.ui.Components.bi0 bi0Var3 = tc1Var.f41803f0[2];
                                if (animatedDrawable != bi0Var3) {
                                    tc1Var.f41794a.setAnimation(bi0Var3);
                                    tc1Var.f41803f0[2].N(49, false, false);
                                }
                                tc1Var.f41794a.d();
                                return;
                            }
                        }
                        tc1Var.f41794a.setAnimation(tc1Var.f41803f0[4]);
                        tc1Var.f41803f0[4].T(false, 0.0f);
                        tc1Var.f41794a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            tc1Var.f41803f0[6].P((int) ((Math.min(1.0f, tc1Var.f41808n.getLayout().getLineWidth(0) / tc1Var.f41808n.getWidth()) * 142.0f) + 18.0f));
                            tc1Var.f41794a.d();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        tc1Var.L0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                tc1 tc1Var2 = this.f40956b;
                if (tc1Var2.F) {
                    if (tc1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(tc1Var2.E, true, 0.1f, true, true);
                        return;
                    } else if (tc1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.i0.Y3(tc1Var2.E, false, 0.1f, true, true);
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
        int i13 = this.f40955a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40955a;
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
