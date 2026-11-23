package org.telegram.ui.Components;
public final class mw implements c5.h {
    public final boolean f37651a;
    public final ty f37652b;

    public mw(ty tyVar, boolean z10) {
        this.f37652b = tyVar;
        this.f37651a = z10;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        ty tyVar = this.f37652b;
        jw jwVar = tyVar.h;
        boolean z11 = false;
        if (jwVar != null) {
            int currentItem = jwVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (tyVar.B1 != i10) {
                tyVar.B1 = i10;
                org.telegram.messenger.np.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tyVar.M(z10, true);
        if (i7 == 2 && (this.f37651a || tyVar.f40150w0)) {
            z11 = true;
        }
        tyVar.R(z11, true);
        if (tyVar.f40144u1.z()) {
            if (i7 == 0) {
                vv vvVar = tyVar.W;
                if (vvVar != null) {
                    vvVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                aw awVar = tyVar.f40126p0;
                if (awVar != null) {
                    awVar.d.requestFocus();
                }
            } else {
                gw gwVar = tyVar.H0;
                if (gwVar != null) {
                    gwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        gy gyVar;
        gy gyVar2;
        int i11;
        int i12;
        int i13;
        ty tyVar = this.f37652b;
        gy gyVar3 = tyVar.H0;
        gy gyVar4 = tyVar.f40126p0;
        gy gyVar5 = tyVar.W;
        iw iwVar = tyVar.D0;
        dw dwVar = tyVar.E0;
        bx bxVar = tyVar.f40129q0;
        yv yvVar = tyVar.f40107i0;
        gx gxVar = tyVar.Q;
        int i14 = 2;
        boolean z10 = true;
        if (tyVar.f40158y0 == null || tyVar.f40104h0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                gxVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                yvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                bxVar.setVisibility(i13);
                dwVar.setVisibility(8);
                if (iwVar != null) {
                    iwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    gxVar.setVisibility(8);
                    yvVar.setVisibility(0);
                    bxVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    dwVar.setVisibility(i11);
                    if (iwVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        iwVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    gxVar.setVisibility(8);
                    yvVar.setVisibility(8);
                    bxVar.setVisibility(8);
                    dwVar.setVisibility(0);
                    if (iwVar != null) {
                        iwVar.setVisibility(0);
                    }
                }
            }
        }
        tyVar.getMeasuredWidth();
        tyVar.getPaddingLeft();
        tyVar.getPaddingRight();
        tx txVar = tyVar.f40144u1;
        if (txVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                txVar.s(i14);
            } else if (i7 == 2) {
                txVar.s(3);
            } else {
                txVar.s(0);
            }
        }
        tyVar.N(true);
        int currentItem = tyVar.h.getCurrentItem();
        if (currentItem == 0) {
            gyVar = gyVar5;
        } else if (currentItem == 1) {
            gyVar = gyVar4;
        } else {
            gyVar = gyVar3;
        }
        String obj = gyVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                gyVar2 = gyVar5;
            } else if (i18 == 1) {
                gyVar2 = gyVar4;
            } else {
                gyVar2 = gyVar3;
            }
            if (gyVar2 != null) {
                iq iqVar = gyVar2.d;
                if (gyVar2 != gyVar && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ty.a(tyVar, z10);
        tyVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
