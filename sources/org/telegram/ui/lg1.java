package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class lg1 implements TextWatcher {
    public final int f36082a;
    public final og1 f36083b;

    public lg1(og1 og1Var, int i10) {
        this.f36082a = i10;
        this.f36083b = og1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.gj0 gj0Var;
        switch (this.f36082a) {
            case 0:
                this.f36083b.getClass();
                return;
            case 1:
                og1 og1Var = this.f36083b;
                if (!og1Var.J) {
                    int i10 = og1Var.L;
                    if (i10 == 0) {
                        org.telegram.ui.Components.gj0 animatedDrawable = og1Var.f36893a.getAnimatedDrawable();
                        if (og1Var.f36904n.length() > 0) {
                            if (og1Var.f36904n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.gj0[] gj0VarArr = og1Var.f36898c0;
                                if (animatedDrawable != gj0VarArr[3] && animatedDrawable != (gj0Var = gj0VarArr[5])) {
                                    og1Var.f36893a.setAnimation(gj0Var);
                                    og1Var.f36898c0[5].Q(0.0f, false);
                                    og1Var.f36893a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.gj0[] gj0VarArr2 = og1Var.f36898c0;
                            if (animatedDrawable != gj0VarArr2[3]) {
                                org.telegram.ui.Components.gj0 gj0Var2 = gj0VarArr2[2];
                                if (animatedDrawable != gj0Var2) {
                                    og1Var.f36893a.setAnimation(gj0Var2);
                                    og1Var.f36898c0[2].N(49);
                                    og1Var.f36898c0[2].Q(0.0f, false);
                                    og1Var.f36893a.d();
                                    return;
                                } else if (gj0Var2.Y < 49) {
                                    gj0Var2.N(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != og1Var.f36898c0[3] || og1Var.f36904n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.gj0[] gj0VarArr3 = og1Var.f36898c0;
                            if (animatedDrawable != gj0VarArr3[5]) {
                                gj0VarArr3[2].N(-1);
                                org.telegram.ui.Components.gj0 gj0Var3 = og1Var.f36898c0[2];
                                if (animatedDrawable != gj0Var3) {
                                    og1Var.f36893a.setAnimation(gj0Var3);
                                    og1Var.f36898c0[2].L(49, false, false);
                                }
                                og1Var.f36893a.d();
                                return;
                            }
                        }
                        og1Var.f36893a.setAnimation(og1Var.f36898c0[4]);
                        og1Var.f36898c0[4].Q(0.0f, false);
                        og1Var.f36893a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            og1Var.f36898c0[6].N((int) ((Math.min(1.0f, og1Var.f36904n.getLayout().getLineWidth(0) / og1Var.f36904n.getWidth()) * 142.0f) + 18.0f));
                            og1Var.f36893a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        og1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                og1 og1Var2 = this.f36083b;
                if (og1Var2.C) {
                    if (og1Var2.B.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(og1Var2.B, true, 0.1f, true);
                        return;
                    } else if (og1Var2.B.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(og1Var2.B, false, 0.1f, true);
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
        int i13 = this.f36082a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36082a;
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
