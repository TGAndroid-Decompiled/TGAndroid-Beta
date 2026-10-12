package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ux implements z4.e {
    public final boolean f31277a;
    public final d00 f31278b;

    public ux(d00 d00Var, boolean z10) {
        this.f31278b = d00Var;
        this.f31277a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        d00 d00Var = this.f31278b;
        rx rxVar = d00Var.h;
        boolean z11 = false;
        if (rxVar != null) {
            int currentItem = rxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (d00Var.A1 != i11) {
                d00Var.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d00Var.L(z10, true);
        if (i10 == 2 && (this.f31277a || d00Var.f25131v0)) {
            z11 = true;
        }
        d00Var.Q(z11, true);
        if (d00Var.f25126t1.z()) {
            if (i10 == 0) {
                cx cxVar = d00Var.V;
                if (cxVar != null) {
                    cxVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                ix ixVar = d00Var.f25108o0;
                if (ixVar != null) {
                    ixVar.d.requestFocus();
                }
            } else {
                ox oxVar = d00Var.G0;
                if (oxVar != null) {
                    oxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        pz pzVar;
        pz pzVar2;
        int i12;
        int i13;
        int i14;
        d00 d00Var = this.f31278b;
        pz pzVar3 = d00Var.G0;
        pz pzVar4 = d00Var.f25108o0;
        pz pzVar5 = d00Var.V;
        qx qxVar = d00Var.C0;
        lx lxVar = d00Var.D0;
        ky kyVar = d00Var.f25111p0;
        fx fxVar = d00Var.f25088h0;
        py pyVar = d00Var.P;
        int i15 = 2;
        boolean z10 = true;
        if (d00Var.f25139x0 == null || d00Var.f25085g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                pyVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                fxVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                kyVar.setVisibility(i14);
                lxVar.setVisibility(8);
                if (qxVar != null) {
                    qxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    pyVar.setVisibility(8);
                    fxVar.setVisibility(0);
                    kyVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    lxVar.setVisibility(i12);
                    if (qxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        qxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    pyVar.setVisibility(8);
                    fxVar.setVisibility(8);
                    kyVar.setVisibility(8);
                    lxVar.setVisibility(0);
                    if (qxVar != null) {
                        qxVar.setVisibility(0);
                    }
                }
            }
        }
        d00Var.getMeasuredWidth();
        d00Var.getPaddingLeft();
        d00Var.getPaddingRight();
        dz dzVar = d00Var.f25126t1;
        if (dzVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                dzVar.s(i15);
            } else if (i10 == 2) {
                dzVar.s(3);
            } else {
                dzVar.s(0);
            }
        }
        d00Var.M(true);
        int currentItem = d00Var.h.getCurrentItem();
        if (currentItem == 0) {
            pzVar = pzVar5;
        } else if (currentItem == 1) {
            pzVar = pzVar4;
        } else {
            pzVar = pzVar3;
        }
        String obj = pzVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                pzVar2 = pzVar5;
            } else if (i19 == 1) {
                pzVar2 = pzVar4;
            } else {
                pzVar2 = pzVar3;
            }
            if (pzVar2 != null) {
                ar arVar = pzVar2.d;
                if (pzVar2 != pzVar && arVar != null && !arVar.getText().toString().equals(obj)) {
                    arVar.setText(obj);
                    arVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        d00.a(d00Var, z10);
        d00Var.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
