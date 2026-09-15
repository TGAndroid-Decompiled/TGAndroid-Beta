package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class dh1 implements TextWatcher {
    public final int f33062a;
    public final gh1 f33063b;

    public dh1(gh1 gh1Var, int i10) {
        this.f33062a = i10;
        this.f33063b = gh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.xi0 xi0Var;
        switch (this.f33062a) {
            case 0:
                this.f33063b.getClass();
                return;
            case 1:
                gh1 gh1Var = this.f33063b;
                if (!gh1Var.M) {
                    int i10 = gh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.xi0 animatedDrawable = gh1Var.f33908a.getAnimatedDrawable();
                        if (gh1Var.f33922n.length() > 0) {
                            if (gh1Var.f33922n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.xi0[] xi0VarArr = gh1Var.f33917f0;
                                if (animatedDrawable != xi0VarArr[3] && animatedDrawable != (xi0Var = xi0VarArr[5])) {
                                    gh1Var.f33908a.setAnimation(xi0Var);
                                    gh1Var.f33917f0[5].S(0.0f, false);
                                    gh1Var.f33908a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.xi0[] xi0VarArr2 = gh1Var.f33917f0;
                            if (animatedDrawable != xi0VarArr2[3]) {
                                org.telegram.ui.Components.xi0 xi0Var2 = xi0VarArr2[2];
                                if (animatedDrawable != xi0Var2) {
                                    gh1Var.f33908a.setAnimation(xi0Var2);
                                    gh1Var.f33917f0[2].P(49);
                                    gh1Var.f33917f0[2].S(0.0f, false);
                                    gh1Var.f33908a.d();
                                    return;
                                } else if (xi0Var2.f29948b0 < 49) {
                                    xi0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != gh1Var.f33917f0[3] || gh1Var.f33922n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.xi0[] xi0VarArr3 = gh1Var.f33917f0;
                            if (animatedDrawable != xi0VarArr3[5]) {
                                xi0VarArr3[2].P(-1);
                                org.telegram.ui.Components.xi0 xi0Var3 = gh1Var.f33917f0[2];
                                if (animatedDrawable != xi0Var3) {
                                    gh1Var.f33908a.setAnimation(xi0Var3);
                                    gh1Var.f33917f0[2].N(49, false, false);
                                }
                                gh1Var.f33908a.d();
                                return;
                            }
                        }
                        gh1Var.f33908a.setAnimation(gh1Var.f33917f0[4]);
                        gh1Var.f33917f0[4].S(0.0f, false);
                        gh1Var.f33908a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            gh1Var.f33917f0[6].P((int) ((Math.min(1.0f, gh1Var.f33922n.getLayout().getLineWidth(0) / gh1Var.f33922n.getWidth()) * 142.0f) + 18.0f));
                            gh1Var.f33908a.d();
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
                gh1 gh1Var2 = this.f33063b;
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
        int i13 = this.f33062a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33062a;
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
