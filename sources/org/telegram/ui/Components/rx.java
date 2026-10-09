package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class rx implements z4.e {
    public final boolean f30530a;
    public final a00 f30531b;

    public rx(a00 a00Var, boolean z10) {
        this.f30531b = a00Var;
        this.f30530a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        a00 a00Var = this.f30531b;
        ox oxVar = a00Var.h;
        boolean z11 = false;
        if (oxVar != null) {
            int currentItem = oxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (a00Var.A1 != i11) {
                a00Var.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a00Var.L(z10, true);
        if (i10 == 2 && (this.f30530a || a00Var.f24460v0)) {
            z11 = true;
        }
        a00Var.Q(z11, true);
        if (a00Var.f24455t1.z()) {
            if (i10 == 0) {
                zw zwVar = a00Var.V;
                if (zwVar != null) {
                    zwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                fx fxVar = a00Var.f24437o0;
                if (fxVar != null) {
                    fxVar.d.requestFocus();
                }
            } else {
                lx lxVar = a00Var.G0;
                if (lxVar != null) {
                    lxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        mz mzVar;
        mz mzVar2;
        int i12;
        int i13;
        int i14;
        a00 a00Var = this.f30531b;
        mz mzVar3 = a00Var.G0;
        mz mzVar4 = a00Var.f24437o0;
        mz mzVar5 = a00Var.V;
        nx nxVar = a00Var.C0;
        ix ixVar = a00Var.D0;
        hy hyVar = a00Var.f24440p0;
        cx cxVar = a00Var.f24417h0;
        my myVar = a00Var.P;
        int i15 = 2;
        boolean z10 = true;
        if (a00Var.f24468x0 == null || a00Var.f24414g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                myVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                cxVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                hyVar.setVisibility(i14);
                ixVar.setVisibility(8);
                if (nxVar != null) {
                    nxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    myVar.setVisibility(8);
                    cxVar.setVisibility(0);
                    hyVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    ixVar.setVisibility(i12);
                    if (nxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        nxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    myVar.setVisibility(8);
                    cxVar.setVisibility(8);
                    hyVar.setVisibility(8);
                    ixVar.setVisibility(0);
                    if (nxVar != null) {
                        nxVar.setVisibility(0);
                    }
                }
            }
        }
        a00Var.getMeasuredWidth();
        a00Var.getPaddingLeft();
        a00Var.getPaddingRight();
        az azVar = a00Var.f24455t1;
        if (azVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                azVar.s(i15);
            } else if (i10 == 2) {
                azVar.s(3);
            } else {
                azVar.s(0);
            }
        }
        a00Var.M(true);
        int currentItem = a00Var.h.getCurrentItem();
        if (currentItem == 0) {
            mzVar = mzVar5;
        } else if (currentItem == 1) {
            mzVar = mzVar4;
        } else {
            mzVar = mzVar3;
        }
        String obj = mzVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                mzVar2 = mzVar5;
            } else if (i19 == 1) {
                mzVar2 = mzVar4;
            } else {
                mzVar2 = mzVar3;
            }
            if (mzVar2 != null) {
                yq yqVar = mzVar2.d;
                if (mzVar2 != mzVar && yqVar != null && !yqVar.getText().toString().equals(obj)) {
                    yqVar.setText(obj);
                    yqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        a00.a(a00Var, z10);
        a00Var.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
