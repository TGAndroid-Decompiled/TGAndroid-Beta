package org.telegram.ui.Components;
public final class kw implements c5.h {
    public final boolean f36904a;
    public final ry f36905b;

    public kw(ry ryVar, boolean z10) {
        this.f36905b = ryVar;
        this.f36904a = z10;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        ry ryVar = this.f36905b;
        hw hwVar = ryVar.h;
        boolean z11 = false;
        if (hwVar != null) {
            int currentItem = hwVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (ryVar.B1 != i10) {
                ryVar.B1 = i10;
                org.telegram.messenger.mp.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ryVar.M(z10, true);
        if (i7 == 2 && (this.f36904a || ryVar.f39403w0)) {
            z11 = true;
        }
        ryVar.R(z11, true);
        if (ryVar.f39397u1.z()) {
            if (i7 == 0) {
                sv svVar = ryVar.W;
                if (svVar != null) {
                    svVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                xv xvVar = ryVar.f39379p0;
                if (xvVar != null) {
                    xvVar.d.requestFocus();
                }
            } else {
                ew ewVar = ryVar.H0;
                if (ewVar != null) {
                    ewVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        ey eyVar;
        ey eyVar2;
        int i11;
        int i12;
        int i13;
        ry ryVar = this.f36905b;
        ey eyVar3 = ryVar.H0;
        ey eyVar4 = ryVar.f39379p0;
        ey eyVar5 = ryVar.W;
        gw gwVar = ryVar.D0;
        aw awVar = ryVar.E0;
        zw zwVar = ryVar.f39382q0;
        vv vvVar = ryVar.f39360i0;
        ex exVar = ryVar.Q;
        int i14 = 2;
        boolean z10 = true;
        if (ryVar.f39411y0 == null || ryVar.f39357h0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                exVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                vvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                zwVar.setVisibility(i13);
                awVar.setVisibility(8);
                if (gwVar != null) {
                    gwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    exVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    zwVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    awVar.setVisibility(i11);
                    if (gwVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        gwVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    exVar.setVisibility(8);
                    vvVar.setVisibility(8);
                    zwVar.setVisibility(8);
                    awVar.setVisibility(0);
                    if (gwVar != null) {
                        gwVar.setVisibility(0);
                    }
                }
            }
        }
        ryVar.getMeasuredWidth();
        ryVar.getPaddingLeft();
        ryVar.getPaddingRight();
        rx rxVar = ryVar.f39397u1;
        if (rxVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                rxVar.s(i14);
            } else if (i7 == 2) {
                rxVar.s(3);
            } else {
                rxVar.s(0);
            }
        }
        ryVar.N(true);
        int currentItem = ryVar.h.getCurrentItem();
        if (currentItem == 0) {
            eyVar = eyVar5;
        } else if (currentItem == 1) {
            eyVar = eyVar4;
        } else {
            eyVar = eyVar3;
        }
        String obj = eyVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                eyVar2 = eyVar5;
            } else if (i18 == 1) {
                eyVar2 = eyVar4;
            } else {
                eyVar2 = eyVar3;
            }
            if (eyVar2 != null) {
                gq gqVar = eyVar2.d;
                if (eyVar2 != eyVar && gqVar != null && !gqVar.getText().toString().equals(obj)) {
                    gqVar.setText(obj);
                    gqVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ry.a(ryVar, z10);
        ryVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
