package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class jh1 implements TextWatcher {
    public final int f34105a;
    public final mh1 f34106b;

    public jh1(mh1 mh1Var, int i10) {
        this.f34105a = i10;
        this.f34106b = mh1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.hj0 hj0Var;
        switch (this.f34105a) {
            case 0:
                this.f34106b.getClass();
                return;
            case 1:
                mh1 mh1Var = this.f34106b;
                if (!mh1Var.M) {
                    int i10 = mh1Var.O;
                    if (i10 == 0) {
                        org.telegram.ui.Components.hj0 animatedDrawable = mh1Var.f34952a.getAnimatedDrawable();
                        if (mh1Var.f34966n.length() > 0) {
                            if (mh1Var.f34966n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.hj0[] hj0VarArr = mh1Var.f34961f0;
                                if (animatedDrawable != hj0VarArr[3] && animatedDrawable != (hj0Var = hj0VarArr[5])) {
                                    mh1Var.f34952a.setAnimation(hj0Var);
                                    mh1Var.f34961f0[5].S(0.0f, false);
                                    mh1Var.f34952a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.hj0[] hj0VarArr2 = mh1Var.f34961f0;
                            if (animatedDrawable != hj0VarArr2[3]) {
                                org.telegram.ui.Components.hj0 hj0Var2 = hj0VarArr2[2];
                                if (animatedDrawable != hj0Var2) {
                                    mh1Var.f34952a.setAnimation(hj0Var2);
                                    mh1Var.f34961f0[2].P(49);
                                    mh1Var.f34961f0[2].S(0.0f, false);
                                    mh1Var.f34952a.d();
                                    return;
                                } else if (hj0Var2.f23648b0 < 49) {
                                    hj0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != mh1Var.f34961f0[3] || mh1Var.f34966n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.hj0[] hj0VarArr3 = mh1Var.f34961f0;
                            if (animatedDrawable != hj0VarArr3[5]) {
                                hj0VarArr3[2].P(-1);
                                org.telegram.ui.Components.hj0 hj0Var3 = mh1Var.f34961f0[2];
                                if (animatedDrawable != hj0Var3) {
                                    mh1Var.f34952a.setAnimation(hj0Var3);
                                    mh1Var.f34961f0[2].N(49, false, false);
                                }
                                mh1Var.f34952a.d();
                                return;
                            }
                        }
                        mh1Var.f34952a.setAnimation(mh1Var.f34961f0[4]);
                        mh1Var.f34961f0[4].S(0.0f, false);
                        mh1Var.f34952a.d();
                        return;
                    } else if (i10 == 1) {
                        try {
                            mh1Var.f34961f0[6].P((int) ((Math.min(1.0f, mh1Var.f34966n.getLayout().getLineWidth(0) / mh1Var.f34966n.getWidth()) * 142.0f) + 18.0f));
                            mh1Var.f34952a.d();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else if (i10 == 8 && editable.length() > 0) {
                        mh1Var.H0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                mh1 mh1Var2 = this.f34106b;
                if (mh1Var2.F) {
                    if (mh1Var2.E.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(mh1Var2.E, true, 0.1f, true);
                        return;
                    } else if (mh1Var2.E.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        AndroidUtilities.updateViewVisibilityAnimated(mh1Var2.E, false, 0.1f, true);
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
        int i13 = this.f34105a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34105a;
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
