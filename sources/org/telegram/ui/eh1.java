package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class eh1 implements TextWatcher {
    public final int f33347a;
    public final hh1 f33348b;

    public eh1(hh1 hh1Var, int i10) {
        this.f33347a = i10;
        this.f33348b = hh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xi0 xi0Var;
        switch (this.f33347a) {
            case 0:
                this.f33348b.getClass();
                return;
            case 1:
                hh1 hh1Var = this.f33348b;
                if (!hh1Var.M) {
                    int i10 = hh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.xi0 animatedDrawable = hh1Var.f34268a.getAnimatedDrawable();
                        if (hh1Var.f34282n.length() > 0) {
                            if (hh1Var.f34282n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.xi0[] xi0VarArr = hh1Var.f34277f0;
                                if (animatedDrawable != xi0VarArr[3] && animatedDrawable != (xi0Var = xi0VarArr[5])) {
                                    hh1Var.f34268a.setAnimation(xi0Var);
                                    hh1Var.f34277f0[5].T(0.0f, false);
                                    hh1Var.f34268a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.xi0[] xi0VarArr2 = hh1Var.f34277f0;
                            if (animatedDrawable != xi0VarArr2[3]) {
                                org.telegram.ui.Components.xi0 xi0Var2 = xi0VarArr2[2];
                                if (animatedDrawable != xi0Var2) {
                                    hh1Var.f34268a.setAnimation(xi0Var2);
                                    hh1Var.f34277f0[2].P(49);
                                    hh1Var.f34277f0[2].T(0.0f, false);
                                    hh1Var.f34268a.d();
                                    return;
                                } else if (xi0Var2.f29943a0 < 49) {
                                    xi0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != hh1Var.f34277f0[3] || hh1Var.f34282n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xi0[] xi0VarArr3 = hh1Var.f34277f0;
                            if (animatedDrawable != xi0VarArr3[5]) {
                                xi0VarArr3[2].P(-1);
                                org.telegram.ui.Components.xi0 xi0Var3 = hh1Var.f34277f0[2];
                                if (animatedDrawable != xi0Var3) {
                                    hh1Var.f34268a.setAnimation(xi0Var3);
                                    hh1Var.f34277f0[2].N(49, false, false);
                                }
                                hh1Var.f34268a.d();
                                return;
                            }
                        }
                        hh1Var.f34268a.setAnimation(hh1Var.f34277f0[4]);
                        hh1Var.f34277f0[4].T(0.0f, false);
                        hh1Var.f34268a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            hh1Var.f34277f0[6].P((int) ((Math.min(1.0f, hh1Var.f34282n.getLayout().getLineWidth(0) / hh1Var.f34282n.getWidth()) * 142.0f) + 18.0f));
                            hh1Var.f34268a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        hh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                hh1 hh1Var2 = this.f33348b;
                if (hh1Var2.F) {
                    if (hh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(hh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (hh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(hh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f33347a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33347a;
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
