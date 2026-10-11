package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class sx implements z4.e {
    public final boolean f30891a;
    public final b00 f30892b;

    public sx(b00 b00Var, boolean z10) {
        this.f30892b = b00Var;
        this.f30891a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        b00 b00Var = this.f30892b;
        px pxVar = b00Var.h;
        boolean z11 = false;
        if (pxVar != null) {
            int currentItem = pxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (b00Var.A1 != i11) {
                b00Var.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b00Var.L(z10, true);
        if (i10 == 2 && (this.f30891a || b00Var.f24721v0)) {
            z11 = true;
        }
        b00Var.Q(z11, true);
        if (b00Var.f24716t1.z()) {
            if (i10 == 0) {
                ax axVar = b00Var.V;
                if (axVar != null) {
                    axVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                gx gxVar = b00Var.f24698o0;
                if (gxVar != null) {
                    gxVar.d.requestFocus();
                }
            } else {
                mx mxVar = b00Var.G0;
                if (mxVar != null) {
                    mxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        nz nzVar;
        nz nzVar2;
        int i12;
        int i13;
        int i14;
        b00 b00Var = this.f30892b;
        nz nzVar3 = b00Var.G0;
        nz nzVar4 = b00Var.f24698o0;
        nz nzVar5 = b00Var.V;
        ox oxVar = b00Var.C0;
        jx jxVar = b00Var.D0;
        iy iyVar = b00Var.f24701p0;
        dx dxVar = b00Var.f24678h0;
        ny nyVar = b00Var.P;
        int i15 = 2;
        boolean z10 = true;
        if (b00Var.f24729x0 == null || b00Var.f24675g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                nyVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dxVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                iyVar.setVisibility(i14);
                jxVar.setVisibility(8);
                if (oxVar != null) {
                    oxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    nyVar.setVisibility(8);
                    dxVar.setVisibility(0);
                    iyVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    jxVar.setVisibility(i12);
                    if (oxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        oxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    nyVar.setVisibility(8);
                    dxVar.setVisibility(8);
                    iyVar.setVisibility(8);
                    jxVar.setVisibility(0);
                    if (oxVar != null) {
                        oxVar.setVisibility(0);
                    }
                }
            }
        }
        b00Var.getMeasuredWidth();
        b00Var.getPaddingLeft();
        b00Var.getPaddingRight();
        bz bzVar = b00Var.f24716t1;
        if (bzVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                bzVar.s(i15);
            } else if (i10 == 2) {
                bzVar.s(3);
            } else {
                bzVar.s(0);
            }
        }
        b00Var.M(true);
        int currentItem = b00Var.h.getCurrentItem();
        if (currentItem == 0) {
            nzVar = nzVar5;
        } else if (currentItem == 1) {
            nzVar = nzVar4;
        } else {
            nzVar = nzVar3;
        }
        String obj = nzVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                nzVar2 = nzVar5;
            } else if (i19 == 1) {
                nzVar2 = nzVar4;
            } else {
                nzVar2 = nzVar3;
            }
            if (nzVar2 != null) {
                yq yqVar = nzVar2.d;
                if (nzVar2 != nzVar && yqVar != null && !yqVar.getText().toString().equals(obj)) {
                    yqVar.setText(obj);
                    yqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        b00.a(b00Var, z10);
        b00Var.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
