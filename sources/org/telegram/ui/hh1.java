package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class hh1 implements TextWatcher {
    public final int f38427a;
    public final kh1 f38428b;

    public hh1(kh1 kh1Var, int i10) {
        this.f38427a = i10;
        this.f38428b = kh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.fk0 fk0Var;
        switch (this.f38427a) {
            case 0:
                this.f38428b.getClass();
                return;
            case 1:
                kh1 kh1Var = this.f38428b;
                if (!kh1Var.M) {
                    int i10 = kh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.fk0 animatedDrawable = kh1Var.f39491a.getAnimatedDrawable();
                        if (kh1Var.f39506n.length() > 0) {
                            if (kh1Var.f39506n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.fk0[] fk0VarArr = kh1Var.f39501f0;
                                if (animatedDrawable != fk0VarArr[3] && animatedDrawable != (fk0Var = fk0VarArr[5])) {
                                    kh1Var.f39491a.setAnimation(fk0Var);
                                    kh1Var.f39501f0[5].T(0.0f, false);
                                    kh1Var.f39491a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.fk0[] fk0VarArr2 = kh1Var.f39501f0;
                            if (animatedDrawable != fk0VarArr2[3]) {
                                org.telegram.ui.Components.fk0 fk0Var2 = fk0VarArr2[2];
                                if (animatedDrawable != fk0Var2) {
                                    kh1Var.f39491a.setAnimation(fk0Var2);
                                    kh1Var.f39501f0[2].P(49);
                                    kh1Var.f39501f0[2].T(0.0f, false);
                                    kh1Var.f39491a.d();
                                    return;
                                } else if (fk0Var2.f26103a0 < 49) {
                                    fk0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != kh1Var.f39501f0[3] || kh1Var.f39506n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.fk0[] fk0VarArr3 = kh1Var.f39501f0;
                            if (animatedDrawable != fk0VarArr3[5]) {
                                fk0VarArr3[2].P(-1);
                                org.telegram.ui.Components.fk0 fk0Var3 = kh1Var.f39501f0[2];
                                if (animatedDrawable != fk0Var3) {
                                    kh1Var.f39491a.setAnimation(fk0Var3);
                                    kh1Var.f39501f0[2].N(49, false, false);
                                }
                                kh1Var.f39491a.d();
                                return;
                            }
                        }
                        kh1Var.f39491a.setAnimation(kh1Var.f39501f0[4]);
                        kh1Var.f39501f0[4].T(0.0f, false);
                        kh1Var.f39491a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            kh1Var.f39501f0[6].P((int) ((Math.min(1.0f, kh1Var.f39506n.getLayout().getLineWidth(0) / kh1Var.f39506n.getWidth()) * 142.0f) + 18.0f));
                            kh1Var.f39491a.d();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        kh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                kh1 kh1Var2 = this.f38428b;
                if (kh1Var2.F) {
                    if (kh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(kh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (kh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(kh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f38427a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38427a;
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
