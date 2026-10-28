package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class cg1 implements TextWatcher {
    public final int f38342a;
    public final fg1 f38343b;

    public cg1(fg1 fg1Var, int i10) {
        this.f38342a = i10;
        this.f38343b = fg1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.f38342a) {
            case 0:
                this.f38343b.getClass();
                return;
            case 1:
                fg1 fg1Var = this.f38343b;
                if (!fg1Var.M) {
                    int i10 = fg1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.yj0 animatedDrawable = fg1Var.f39359a.getAnimatedDrawable();
                        if (fg1Var.f39373n.length() > 0) {
                            if (fg1Var.f39373n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = fg1Var.f39368f0;
                                if (animatedDrawable != yj0VarArr[3] && animatedDrawable != (yj0Var = yj0VarArr[5])) {
                                    fg1Var.f39359a.setAnimation(yj0Var);
                                    fg1Var.f39368f0[5].T(0.0f, false);
                                    fg1Var.f39359a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = fg1Var.f39368f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var2 = yj0VarArr2[2];
                                if (animatedDrawable != yj0Var2) {
                                    fg1Var.f39359a.setAnimation(yj0Var2);
                                    fg1Var.f39368f0[2].P(49);
                                    fg1Var.f39368f0[2].T(0.0f, false);
                                    fg1Var.f39359a.d();
                                    return;
                                } else if (yj0Var2.f35067a0 < 49) {
                                    yj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != fg1Var.f39368f0[3] || fg1Var.f39373n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = fg1Var.f39368f0;
                            if (animatedDrawable != yj0VarArr3[5]) {
                                yj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.yj0 yj0Var3 = fg1Var.f39368f0[2];
                                if (animatedDrawable != yj0Var3) {
                                    fg1Var.f39359a.setAnimation(yj0Var3);
                                    fg1Var.f39368f0[2].N(49, false, false);
                                }
                                fg1Var.f39359a.d();
                                return;
                            }
                        }
                        fg1Var.f39359a.setAnimation(fg1Var.f39368f0[4]);
                        fg1Var.f39368f0[4].T(0.0f, false);
                        fg1Var.f39359a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            fg1Var.f39368f0[6].P((int) ((Math.min(1.0f, fg1Var.f39373n.getLayout().getLineWidth(0) / fg1Var.f39373n.getWidth()) * 142.0f) + 18.0f));
                            fg1Var.f39359a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        fg1Var.I0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                fg1 fg1Var2 = this.f38343b;
                if (fg1Var2.F) {
                    if (fg1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(fg1Var2.E, true, 0.1f, true);
                        return;
                    } else if (fg1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(fg1Var2.E, false, 0.1f, true);
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
        int i13 = this.f38342a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38342a;
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
