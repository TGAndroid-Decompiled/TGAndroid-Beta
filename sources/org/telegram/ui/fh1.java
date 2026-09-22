package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class fh1 implements TextWatcher {
    public final int f33674a;
    public final ih1 f33675b;

    public fh1(ih1 ih1Var, int i10) {
        this.f33674a = i10;
        this.f33675b = ih1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.kj0 kj0Var;
        switch (this.f33674a) {
            case 0:
                this.f33675b.getClass();
                return;
            case 1:
                ih1 ih1Var = this.f33675b;
                if (!ih1Var.M) {
                    int i10 = ih1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.kj0 animatedDrawable = ih1Var.f34590a.getAnimatedDrawable();
                        if (ih1Var.f34604n.length() > 0) {
                            if (ih1Var.f34604n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.kj0[] kj0VarArr = ih1Var.f34599f0;
                                if (animatedDrawable != kj0VarArr[3] && animatedDrawable != (kj0Var = kj0VarArr[5])) {
                                    ih1Var.f34590a.setAnimation(kj0Var);
                                    ih1Var.f34599f0[5].T(0.0f, false);
                                    ih1Var.f34590a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.kj0[] kj0VarArr2 = ih1Var.f34599f0;
                            if (animatedDrawable != kj0VarArr2[3]) {
                                org.telegram.ui.Components.kj0 kj0Var2 = kj0VarArr2[2];
                                if (animatedDrawable != kj0Var2) {
                                    ih1Var.f34590a.setAnimation(kj0Var2);
                                    ih1Var.f34599f0[2].P(49);
                                    ih1Var.f34599f0[2].T(0.0f, false);
                                    ih1Var.f34590a.d();
                                    return;
                                } else if (kj0Var2.f25711a0 < 49) {
                                    kj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ih1Var.f34599f0[3] || ih1Var.f34604n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.kj0[] kj0VarArr3 = ih1Var.f34599f0;
                            if (animatedDrawable != kj0VarArr3[5]) {
                                kj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.kj0 kj0Var3 = ih1Var.f34599f0[2];
                                if (animatedDrawable != kj0Var3) {
                                    ih1Var.f34590a.setAnimation(kj0Var3);
                                    ih1Var.f34599f0[2].N(49, false, false);
                                }
                                ih1Var.f34590a.d();
                                return;
                            }
                        }
                        ih1Var.f34590a.setAnimation(ih1Var.f34599f0[4]);
                        ih1Var.f34599f0[4].T(0.0f, false);
                        ih1Var.f34590a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            ih1Var.f34599f0[6].P((int) ((Math.min(1.0f, ih1Var.f34604n.getLayout().getLineWidth(0) / ih1Var.f34604n.getWidth()) * 142.0f) + 18.0f));
                            ih1Var.f34590a.d();
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
                ih1 ih1Var2 = this.f33675b;
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
        int i13 = this.f33674a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33674a;
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
