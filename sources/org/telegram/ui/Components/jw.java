package org.telegram.ui.Components;
public final class jw implements c5.h {
    public final boolean f36524a;
    public final qy f36525b;

    public jw(qy qyVar, boolean z10) {
        this.f36525b = qyVar;
        this.f36524a = z10;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        qy qyVar = this.f36525b;
        gw gwVar = qyVar.h;
        boolean z11 = false;
        if (gwVar != null) {
            int currentItem = gwVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (qyVar.B1 != i10) {
                qyVar.B1 = i10;
                org.telegram.messenger.mp.f1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qyVar.M(z10, true);
        if (i7 == 2 && (this.f36524a || qyVar.f39105w0)) {
            z11 = true;
        }
        qyVar.R(z11, true);
        if (qyVar.f39099u1.z()) {
            if (i7 == 0) {
                sv svVar = qyVar.W;
                if (svVar != null) {
                    svVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                xv xvVar = qyVar.f39081p0;
                if (xvVar != null) {
                    xvVar.d.requestFocus();
                }
            } else {
                dw dwVar = qyVar.H0;
                if (dwVar != null) {
                    dwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        dy dyVar;
        dy dyVar2;
        int i11;
        int i12;
        int i13;
        qy qyVar = this.f36525b;
        dy dyVar3 = qyVar.H0;
        dy dyVar4 = qyVar.f39081p0;
        dy dyVar5 = qyVar.W;
        fw fwVar = qyVar.D0;
        aw awVar = qyVar.E0;
        yw ywVar = qyVar.f39084q0;
        vv vvVar = qyVar.f39062i0;
        dx dxVar = qyVar.Q;
        int i14 = 2;
        boolean z10 = true;
        if (qyVar.f39113y0 == null || qyVar.f39059h0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                dxVar.setVisibility(0);
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
                ywVar.setVisibility(i13);
                awVar.setVisibility(8);
                if (fwVar != null) {
                    fwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    dxVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    ywVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    awVar.setVisibility(i11);
                    if (fwVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        fwVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    dxVar.setVisibility(8);
                    vvVar.setVisibility(8);
                    ywVar.setVisibility(8);
                    awVar.setVisibility(0);
                    if (fwVar != null) {
                        fwVar.setVisibility(0);
                    }
                }
            }
        }
        qyVar.getMeasuredWidth();
        qyVar.getPaddingLeft();
        qyVar.getPaddingRight();
        qx qxVar = qyVar.f39099u1;
        if (qxVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                qxVar.s(i14);
            } else if (i7 == 2) {
                qxVar.s(3);
            } else {
                qxVar.s(0);
            }
        }
        qyVar.N(true);
        int currentItem = qyVar.h.getCurrentItem();
        if (currentItem == 0) {
            dyVar = dyVar5;
        } else if (currentItem == 1) {
            dyVar = dyVar4;
        } else {
            dyVar = dyVar3;
        }
        String obj = dyVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                dyVar2 = dyVar5;
            } else if (i18 == 1) {
                dyVar2 = dyVar4;
            } else {
                dyVar2 = dyVar3;
            }
            if (dyVar2 != null) {
                fq fqVar = dyVar2.d;
                if (dyVar2 != dyVar && fqVar != null && !fqVar.getText().toString().equals(obj)) {
                    fqVar.setText(obj);
                    fqVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        qy.a(qyVar, z10);
        qyVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
