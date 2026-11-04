package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class oa1 implements TextWatcher {
    public final int f48247a;
    public final ra1 f48248b;

    public oa1(ra1 ra1Var, int i3) {
        this.f48247a = i3;
        this.f48248b = ra1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        org.telegram.ui.Components.ch0 ch0Var;
        switch (this.f48247a) {
            case 0:
                this.f48248b.getClass();
                return;
            case 1:
                ra1 ra1Var = this.f48248b;
                if (!ra1Var.N) {
                    int i3 = ra1Var.P;
                    if (i3 == 0) {
                        org.telegram.ui.Components.ch0 animatedDrawable = ra1Var.f49153a.getAnimatedDrawable();
                        if (ra1Var.f49169n.length() > 0) {
                            if (ra1Var.f49169n.getTransformationMethod() == null) {
                                org.telegram.ui.Components.ch0[] ch0VarArr = ra1Var.f49164g0;
                                if (animatedDrawable != ch0VarArr[3] && animatedDrawable != (ch0Var = ch0VarArr[5])) {
                                    ra1Var.f49153a.setAnimation(ch0Var);
                                    ra1Var.f49164g0[5].T(false, 0.0f);
                                    ra1Var.f49153a.d();
                                    return;
                                }
                                return;
                            }
                            org.telegram.ui.Components.ch0[] ch0VarArr2 = ra1Var.f49164g0;
                            if (animatedDrawable != ch0VarArr2[3]) {
                                org.telegram.ui.Components.ch0 ch0Var2 = ch0VarArr2[2];
                                if (animatedDrawable != ch0Var2) {
                                    ra1Var.f49153a.setAnimation(ch0Var2);
                                    ra1Var.f49164g0[2].P(49);
                                    ra1Var.f49164g0[2].T(false, 0.0f);
                                    ra1Var.f49153a.d();
                                    return;
                                } else if (ch0Var2.f32721b0 < 49) {
                                    ch0Var2.P(49);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        if (animatedDrawable != ra1Var.f49164g0[3] || ra1Var.f49169n.getTransformationMethod() != null) {
                            org.telegram.ui.Components.ch0[] ch0VarArr3 = ra1Var.f49164g0;
                            if (animatedDrawable != ch0VarArr3[5]) {
                                ch0VarArr3[2].P(-1);
                                org.telegram.ui.Components.ch0 ch0Var3 = ra1Var.f49164g0[2];
                                if (animatedDrawable != ch0Var3) {
                                    ra1Var.f49153a.setAnimation(ch0Var3);
                                    ra1Var.f49164g0[2].N(49, false, false);
                                }
                                ra1Var.f49153a.d();
                                return;
                            }
                        }
                        ra1Var.f49153a.setAnimation(ra1Var.f49164g0[4]);
                        ra1Var.f49164g0[4].T(false, 0.0f);
                        ra1Var.f49153a.d();
                        return;
                    } else if (i3 == 1) {
                        try {
                            ra1Var.f49164g0[6].P((int) ((Math.min(1.0f, ra1Var.f49169n.getLayout().getLineWidth(0) / ra1Var.f49169n.getWidth()) * 142.0f) + 18.0f));
                            ra1Var.f49153a.d();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else if (i3 == 8 && editable.length() > 0) {
                        ra1Var.M0(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                ra1 ra1Var2 = this.f48248b;
                if (ra1Var2.G) {
                    if (ra1Var2.F.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ra1Var2.F, true, 0.1f, true, true);
                        return;
                    } else if (ra1Var2.F.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                        org.telegram.messenger.g0.Z3(ra1Var2.F, false, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f48247a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f48247a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
