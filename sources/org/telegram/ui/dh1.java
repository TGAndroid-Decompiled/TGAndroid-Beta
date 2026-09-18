package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class dh1 implements TextWatcher {
    public final int f33024a;
    public final gh1 f33025b;

    public dh1(gh1 gh1Var, int i10) {
        this.f33024a = i10;
        this.f33025b = gh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.f33024a) {
            case 0:
                this.f33025b.getClass();
                return;
            case 1:
                gh1 gh1Var = this.f33025b;
                if (!gh1Var.M) {
                    int i10 = gh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.ij0 animatedDrawable = gh1Var.f33846a.getAnimatedDrawable();
                        if (gh1Var.f33860n.length() > 0) {
                            if (gh1Var.f33860n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ij0[] ij0VarArr = gh1Var.f33855f0;
                                if (animatedDrawable != ij0VarArr[3] && animatedDrawable != (ij0Var = ij0VarArr[5])) {
                                    gh1Var.f33846a.setAnimation(ij0Var);
                                    gh1Var.f33855f0[5].T(0.0f, false);
                                    gh1Var.f33846a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ij0[] ij0VarArr2 = gh1Var.f33855f0;
                            if (animatedDrawable != ij0VarArr2[3]) {
                                org.telegram.ui.Components.ij0 ij0Var2 = ij0VarArr2[2];
                                if (animatedDrawable != ij0Var2) {
                                    gh1Var.f33846a.setAnimation(ij0Var2);
                                    gh1Var.f33855f0[2].P(49);
                                    gh1Var.f33855f0[2].T(0.0f, false);
                                    gh1Var.f33846a.d();
                                    return;
                                } else if (ij0Var2.f24972a0 < 49) {
                                    ij0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != gh1Var.f33855f0[3] || gh1Var.f33860n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ij0[] ij0VarArr3 = gh1Var.f33855f0;
                            if (animatedDrawable != ij0VarArr3[5]) {
                                ij0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ij0 ij0Var3 = gh1Var.f33855f0[2];
                                if (animatedDrawable != ij0Var3) {
                                    gh1Var.f33846a.setAnimation(ij0Var3);
                                    gh1Var.f33855f0[2].N(49, false, false);
                                }
                                gh1Var.f33846a.d();
                                return;
                            }
                        }
                        gh1Var.f33846a.setAnimation(gh1Var.f33855f0[4]);
                        gh1Var.f33855f0[4].T(0.0f, false);
                        gh1Var.f33846a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            gh1Var.f33855f0[6].P((int) ((Math.min(1.0f, gh1Var.f33860n.getLayout().getLineWidth(0) / gh1Var.f33860n.getWidth()) * 142.0f) + 18.0f));
                            gh1Var.f33846a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        gh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                gh1 gh1Var2 = this.f33025b;
                if (gh1Var2.F) {
                    if (gh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(gh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (gh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(gh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f33024a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33024a;
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
