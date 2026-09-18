package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class fh1 implements TextWatcher {
    public final int f33690a;
    public final ih1 f33691b;

    public fh1(ih1 ih1Var, int i10) {
        this.f33690a = i10;
        this.f33691b = ih1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.yi0 yi0Var;
        switch (this.f33690a) {
            case 0:
                this.f33691b.getClass();
                return;
            case 1:
                ih1 ih1Var = this.f33691b;
                if (!ih1Var.M) {
                    int i10 = ih1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.yi0 animatedDrawable = ih1Var.f34576a.getAnimatedDrawable();
                        if (ih1Var.f34590n.length() > 0) {
                            if (ih1Var.f34590n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.yi0[] yi0VarArr = ih1Var.f34585f0;
                                if (animatedDrawable != yi0VarArr[3] && animatedDrawable != (yi0Var = yi0VarArr[5])) {
                                    ih1Var.f34576a.setAnimation(yi0Var);
                                    ih1Var.f34585f0[5].T(0.0f, false);
                                    ih1Var.f34576a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.yi0[] yi0VarArr2 = ih1Var.f34585f0;
                            if (animatedDrawable != yi0VarArr2[3]) {
                                org.telegram.ui.Components.yi0 yi0Var2 = yi0VarArr2[2];
                                if (animatedDrawable != yi0Var2) {
                                    ih1Var.f34576a.setAnimation(yi0Var2);
                                    ih1Var.f34585f0[2].P(49);
                                    ih1Var.f34585f0[2].T(0.0f, false);
                                    ih1Var.f34576a.d();
                                    return;
                                } else if (yi0Var2.f30222a0 < 49) {
                                    yi0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ih1Var.f34585f0[3] || ih1Var.f34590n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.yi0[] yi0VarArr3 = ih1Var.f34585f0;
                            if (animatedDrawable != yi0VarArr3[5]) {
                                yi0VarArr3[2].P(-1);
                                org.telegram.ui.Components.yi0 yi0Var3 = ih1Var.f34585f0[2];
                                if (animatedDrawable != yi0Var3) {
                                    ih1Var.f34576a.setAnimation(yi0Var3);
                                    ih1Var.f34585f0[2].N(49, false, false);
                                }
                                ih1Var.f34576a.d();
                                return;
                            }
                        }
                        ih1Var.f34576a.setAnimation(ih1Var.f34585f0[4]);
                        ih1Var.f34585f0[4].T(0.0f, false);
                        ih1Var.f34576a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            ih1Var.f34585f0[6].P((int) ((Math.min(1.0f, ih1Var.f34590n.getLayout().getLineWidth(0) / ih1Var.f34590n.getWidth()) * 142.0f) + 18.0f));
                            ih1Var.f34576a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        ih1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ih1 ih1Var2 = this.f33691b;
                if (ih1Var2.F) {
                    if (ih1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ih1Var2.E, true, 0.1f, true);
                        return;
                    } else if (ih1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(ih1Var2.E, false, 0.1f, true);
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
        int i13 = this.f33690a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33690a;
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
