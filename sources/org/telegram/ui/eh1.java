package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class eh1 implements TextWatcher {
    public final int f37365a;
    public final hh1 f37366b;

    public eh1(hh1 hh1Var, int i10) {
        this.f37365a = i10;
        this.f37366b = hh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ek0 ek0Var;
        switch (this.f37365a) {
            case 0:
                this.f37366b.getClass();
                return;
            case 1:
                hh1 hh1Var = this.f37366b;
                if (!hh1Var.M) {
                    int i10 = hh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.ek0 animatedDrawable = hh1Var.f38413a.getAnimatedDrawable();
                        if (hh1Var.f38428n.length() > 0) {
                            if (hh1Var.f38428n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ek0[] ek0VarArr = hh1Var.f38423f0;
                                if (animatedDrawable != ek0VarArr[3] && animatedDrawable != (ek0Var = ek0VarArr[5])) {
                                    hh1Var.f38413a.setAnimation(ek0Var);
                                    hh1Var.f38423f0[5].T(0.0f, false);
                                    hh1Var.f38413a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ek0[] ek0VarArr2 = hh1Var.f38423f0;
                            if (animatedDrawable != ek0VarArr2[3]) {
                                org.telegram.ui.Components.ek0 ek0Var2 = ek0VarArr2[2];
                                if (animatedDrawable != ek0Var2) {
                                    hh1Var.f38413a.setAnimation(ek0Var2);
                                    hh1Var.f38423f0[2].P(49);
                                    hh1Var.f38423f0[2].T(0.0f, false);
                                    hh1Var.f38413a.d();
                                    return;
                                } else if (ek0Var2.f26037a0 < 49) {
                                    ek0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != hh1Var.f38423f0[3] || hh1Var.f38428n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ek0[] ek0VarArr3 = hh1Var.f38423f0;
                            if (animatedDrawable != ek0VarArr3[5]) {
                                ek0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ek0 ek0Var3 = hh1Var.f38423f0[2];
                                if (animatedDrawable != ek0Var3) {
                                    hh1Var.f38413a.setAnimation(ek0Var3);
                                    hh1Var.f38423f0[2].N(49, false, false);
                                }
                                hh1Var.f38413a.d();
                                return;
                            }
                        }
                        hh1Var.f38413a.setAnimation(hh1Var.f38423f0[4]);
                        hh1Var.f38423f0[4].T(0.0f, false);
                        hh1Var.f38413a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            hh1Var.f38423f0[6].P((int) ((Math.min(1.0f, hh1Var.f38428n.getLayout().getLineWidth(0) / hh1Var.f38428n.getWidth()) * 142.0f) + 18.0f));
                            hh1Var.f38413a.d();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                hh1 hh1Var2 = this.f37366b;
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
        int i13 = this.f37365a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37365a;
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
