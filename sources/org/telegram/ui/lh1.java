package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class lh1 implements TextWatcher {
    public final int f38006a;
    public final oh1 f38007b;

    public lh1(oh1 oh1Var, int i10) {
        this.f38006a = i10;
        this.f38007b = oh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yj0 yj0Var;
        switch (this.f38006a) {
            case 0:
                this.f38007b.getClass();
                return;
            case 1:
                oh1 oh1Var = this.f38007b;
                if (!oh1Var.M) {
                    int i10 = oh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.yj0 animatedDrawable = oh1Var.f38960a.getAnimatedDrawable();
                        if (oh1Var.f38974n.length() > 0) {
                            if (oh1Var.f38974n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.yj0[] yj0VarArr = oh1Var.f38969f0;
                                if (animatedDrawable != yj0VarArr[3] && animatedDrawable != (yj0Var = yj0VarArr[5])) {
                                    oh1Var.f38960a.setAnimation(yj0Var);
                                    oh1Var.f38969f0[5].T(0.0f, false);
                                    oh1Var.f38960a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.yj0[] yj0VarArr2 = oh1Var.f38969f0;
                            if (animatedDrawable != yj0VarArr2[3]) {
                                org.telegram.ui.Components.yj0 yj0Var2 = yj0VarArr2[2];
                                if (animatedDrawable != yj0Var2) {
                                    oh1Var.f38960a.setAnimation(yj0Var2);
                                    oh1Var.f38969f0[2].P(49);
                                    oh1Var.f38969f0[2].T(0.0f, false);
                                    oh1Var.f38960a.d();
                                    return;
                                } else if (yj0Var2.f31602a0 < 49) {
                                    yj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != oh1Var.f38969f0[3] || oh1Var.f38974n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yj0[] yj0VarArr3 = oh1Var.f38969f0;
                            if (animatedDrawable != yj0VarArr3[5]) {
                                yj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.yj0 yj0Var3 = oh1Var.f38969f0[2];
                                if (animatedDrawable != yj0Var3) {
                                    oh1Var.f38960a.setAnimation(yj0Var3);
                                    oh1Var.f38969f0[2].N(49, false, false);
                                }
                                oh1Var.f38960a.d();
                                return;
                            }
                        }
                        oh1Var.f38960a.setAnimation(oh1Var.f38969f0[4]);
                        oh1Var.f38969f0[4].T(0.0f, false);
                        oh1Var.f38960a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            oh1Var.f38969f0[6].P((int) ((Math.min(1.0f, oh1Var.f38974n.getLayout().getLineWidth(0) / oh1Var.f38974n.getWidth()) * 142.0f) + 18.0f));
                            oh1Var.f38960a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        oh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                oh1 oh1Var2 = this.f38007b;
                if (oh1Var2.F) {
                    if (oh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (oh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(oh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f38006a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38006a;
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
