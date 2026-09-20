package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class fh1 implements TextWatcher {
    public final int f33649a;
    public final ih1 f33650b;

    public fh1(ih1 ih1Var, int i10) {
        this.f33649a = i10;
        this.f33650b = ih1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.hj0 hj0Var;
        switch (this.f33649a) {
            case 0:
                this.f33650b.getClass();
                return;
            case 1:
                ih1 ih1Var = this.f33650b;
                if (!ih1Var.M) {
                    int i10 = ih1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.hj0 animatedDrawable = ih1Var.f34570a.getAnimatedDrawable();
                        if (ih1Var.f34584n.length() > 0) {
                            if (ih1Var.f34584n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = ih1Var.f34579f0;
                                if (animatedDrawable != hj0VarArr[3] && animatedDrawable != (hj0Var = hj0VarArr[5])) {
                                    ih1Var.f34570a.setAnimation(hj0Var);
                                    ih1Var.f34579f0[5].T(0.0f, false);
                                    ih1Var.f34570a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = ih1Var.f34579f0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var2 = hj0VarArr2[2];
                                if (animatedDrawable != hj0Var2) {
                                    ih1Var.f34570a.setAnimation(hj0Var2);
                                    ih1Var.f34579f0[2].P(49);
                                    ih1Var.f34579f0[2].T(0.0f, false);
                                    ih1Var.f34570a.d();
                                    return;
                                } else if (hj0Var2.f24678a0 < 49) {
                                    hj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ih1Var.f34579f0[3] || ih1Var.f34584n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = ih1Var.f34579f0;
                            if (animatedDrawable != hj0VarArr3[5]) {
                                hj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.hj0 hj0Var3 = ih1Var.f34579f0[2];
                                if (animatedDrawable != hj0Var3) {
                                    ih1Var.f34570a.setAnimation(hj0Var3);
                                    ih1Var.f34579f0[2].N(49, false, false);
                                }
                                ih1Var.f34570a.d();
                                return;
                            }
                        }
                        ih1Var.f34570a.setAnimation(ih1Var.f34579f0[4]);
                        ih1Var.f34579f0[4].T(0.0f, false);
                        ih1Var.f34570a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            ih1Var.f34579f0[6].P((int) ((Math.min(1.0f, ih1Var.f34584n.getLayout().getLineWidth(0) / ih1Var.f34584n.getWidth()) * 142.0f) + 18.0f));
                            ih1Var.f34570a.d();
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
                ih1 ih1Var2 = this.f33650b;
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
        int i13 = this.f33649a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33649a;
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
