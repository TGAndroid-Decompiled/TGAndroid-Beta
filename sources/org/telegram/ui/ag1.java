package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ag1 implements TextWatcher {
    public final int f37787a;
    public final dg1 f37788b;

    public ag1(dg1 dg1Var, int i10) {
        this.f37787a = i10;
        this.f37788b = dg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xj0 xj0Var;
        switch (this.f37787a) {
            case 0:
                this.f37788b.getClass();
                return;
            case 1:
                dg1 dg1Var = this.f37788b;
                if (!dg1Var.M) {
                    int i10 = dg1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.xj0 animatedDrawable = dg1Var.f38862a.getAnimatedDrawable();
                        if (dg1Var.f38876n.length() > 0) {
                            if (dg1Var.f38876n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.xj0[] xj0VarArr = dg1Var.f38871f0;
                                if (animatedDrawable != xj0VarArr[3] && animatedDrawable != (xj0Var = xj0VarArr[5])) {
                                    dg1Var.f38862a.setAnimation(xj0Var);
                                    dg1Var.f38871f0[5].T(0.0f, false);
                                    dg1Var.f38862a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.xj0[] xj0VarArr2 = dg1Var.f38871f0;
                            if (animatedDrawable != xj0VarArr2[3]) {
                                org.telegram.ui.Components.xj0 xj0Var2 = xj0VarArr2[2];
                                if (animatedDrawable != xj0Var2) {
                                    dg1Var.f38862a.setAnimation(xj0Var2);
                                    dg1Var.f38871f0[2].P(49);
                                    dg1Var.f38871f0[2].T(0.0f, false);
                                    dg1Var.f38862a.d();
                                    return;
                                } else if (xj0Var2.f34733a0 < 49) {
                                    xj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != dg1Var.f38871f0[3] || dg1Var.f38876n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xj0[] xj0VarArr3 = dg1Var.f38871f0;
                            if (animatedDrawable != xj0VarArr3[5]) {
                                xj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.xj0 xj0Var3 = dg1Var.f38871f0[2];
                                if (animatedDrawable != xj0Var3) {
                                    dg1Var.f38862a.setAnimation(xj0Var3);
                                    dg1Var.f38871f0[2].N(49, false, false);
                                }
                                dg1Var.f38862a.d();
                                return;
                            }
                        }
                        dg1Var.f38862a.setAnimation(dg1Var.f38871f0[4]);
                        dg1Var.f38871f0[4].T(0.0f, false);
                        dg1Var.f38862a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            dg1Var.f38871f0[6].P((int) ((Math.min(1.0f, dg1Var.f38876n.getLayout().getLineWidth(0) / dg1Var.f38876n.getWidth()) * 142.0f) + 18.0f));
                            dg1Var.f38862a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        dg1Var.I0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                dg1 dg1Var2 = this.f37788b;
                if (dg1Var2.F) {
                    if (dg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(dg1Var2.E, true, 0.1f, true);
                        return;
                    } else if (dg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(dg1Var2.E, false, 0.1f, true);
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
        int i13 = this.f37787a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37787a;
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
