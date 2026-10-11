package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class eh1 implements TextWatcher {
    public final int f37399a;
    public final hh1 f37400b;

    public eh1(hh1 hh1Var, int i10) {
        this.f37399a = i10;
        this.f37400b = hh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.dk0 dk0Var;
        switch (this.f37399a) {
            case 0:
                this.f37400b.getClass();
                return;
            case 1:
                hh1 hh1Var = this.f37400b;
                if (!hh1Var.M) {
                    int i10 = hh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.dk0 animatedDrawable = hh1Var.f38447a.getAnimatedDrawable();
                        if (hh1Var.f38462n.length() > 0) {
                            if (hh1Var.f38462n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.dk0[] dk0VarArr = hh1Var.f38457f0;
                                if (animatedDrawable != dk0VarArr[3] && animatedDrawable != (dk0Var = dk0VarArr[5])) {
                                    hh1Var.f38447a.setAnimation(dk0Var);
                                    hh1Var.f38457f0[5].T(0.0f, false);
                                    hh1Var.f38447a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.dk0[] dk0VarArr2 = hh1Var.f38457f0;
                            if (animatedDrawable != dk0VarArr2[3]) {
                                org.telegram.ui.Components.dk0 dk0Var2 = dk0VarArr2[2];
                                if (animatedDrawable != dk0Var2) {
                                    hh1Var.f38447a.setAnimation(dk0Var2);
                                    hh1Var.f38457f0[2].P(49);
                                    hh1Var.f38457f0[2].T(0.0f, false);
                                    hh1Var.f38447a.d();
                                    return;
                                } else if (dk0Var2.f25804a0 < 49) {
                                    dk0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != hh1Var.f38457f0[3] || hh1Var.f38462n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.dk0[] dk0VarArr3 = hh1Var.f38457f0;
                            if (animatedDrawable != dk0VarArr3[5]) {
                                dk0VarArr3[2].P(-1);
                                org.telegram.ui.Components.dk0 dk0Var3 = hh1Var.f38457f0[2];
                                if (animatedDrawable != dk0Var3) {
                                    hh1Var.f38447a.setAnimation(dk0Var3);
                                    hh1Var.f38457f0[2].N(49, false, false);
                                }
                                hh1Var.f38447a.d();
                                return;
                            }
                        }
                        hh1Var.f38447a.setAnimation(hh1Var.f38457f0[4]);
                        hh1Var.f38457f0[4].T(0.0f, false);
                        hh1Var.f38447a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            hh1Var.f38457f0[6].P((int) ((Math.min(1.0f, hh1Var.f38462n.getLayout().getLineWidth(0) / hh1Var.f38462n.getWidth()) * 142.0f) + 18.0f));
                            hh1Var.f38447a.d();
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
                hh1 hh1Var2 = this.f37400b;
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
        int i13 = this.f37399a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37399a;
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
