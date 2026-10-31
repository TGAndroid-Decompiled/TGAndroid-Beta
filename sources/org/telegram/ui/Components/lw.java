package org.telegram.ui.Components;
public final class lw implements z4.e {
    public final boolean f28207a;
    public final vy f28208b;

    public lw(vy vyVar, boolean z10) {
        this.f28208b = vyVar;
        this.f28207a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        vy vyVar = this.f28208b;
        iw iwVar = vyVar.h;
        boolean z11 = false;
        if (iwVar != null) {
            int currentItem = iwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (vyVar.A1 != i11) {
                vyVar.A1 = i11;
                org.telegram.messenger.vp.c1().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vyVar.M(z10, true);
        if (i10 == 2 && (this.f28207a || vyVar.f31923v0)) {
            z11 = true;
        }
        vyVar.R(z11, true);
        if (vyVar.f31918t1.z()) {
            if (i10 == 0) {
                tv tvVar = vyVar.V;
                if (tvVar != null) {
                    tvVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                yv yvVar = vyVar.f31900o0;
                if (yvVar != null) {
                    yvVar.d.requestFocus();
                }
            } else {
                fw fwVar = vyVar.G0;
                if (fwVar != null) {
                    fwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        iy iyVar;
        iy iyVar2;
        int i12;
        int i13;
        int i14;
        vy vyVar = this.f28208b;
        iy iyVar3 = vyVar.G0;
        iy iyVar4 = vyVar.f31900o0;
        iy iyVar5 = vyVar.V;
        hw hwVar = vyVar.C0;
        bw bwVar = vyVar.D0;
        cx cxVar = vyVar.f31903p0;
        wv wvVar = vyVar.f31880h0;
        hx hxVar = vyVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (vyVar.f31931x0 == null || vyVar.f31877g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                hxVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                wvVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                cxVar.setVisibility(i14);
                bwVar.setVisibility(8);
                if (hwVar != null) {
                    hwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    hxVar.setVisibility(8);
                    wvVar.setVisibility(0);
                    cxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    bwVar.setVisibility(i12);
                    if (hwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        hwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    hxVar.setVisibility(8);
                    wvVar.setVisibility(8);
                    cxVar.setVisibility(8);
                    bwVar.setVisibility(0);
                    if (hwVar != null) {
                        hwVar.setVisibility(0);
                    }
                }
            }
        }
        vyVar.getMeasuredWidth();
        vyVar.getPaddingLeft();
        vyVar.getPaddingRight();
        vx vxVar = vyVar.f31918t1;
        if (vxVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                vxVar.s(i15);
            } else if (i10 == 2) {
                vxVar.s(3);
            } else {
                vxVar.s(0);
            }
        }
        vyVar.N(true);
        int currentItem = vyVar.h.getCurrentItem();
        if (currentItem == 0) {
            iyVar = iyVar5;
        } else if (currentItem == 1) {
            iyVar = iyVar4;
        } else {
            iyVar = iyVar3;
        }
        String obj = iyVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                iyVar2 = iyVar5;
            } else if (i19 == 1) {
                iyVar2 = iyVar4;
            } else {
                iyVar2 = iyVar3;
            }
            if (iyVar2 != null) {
                yp ypVar = iyVar2.d;
                if (iyVar2 != iyVar && ypVar != null && !ypVar.getText().toString().equals(obj)) {
                    ypVar.setText(obj);
                    ypVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        vy.a(vyVar, z10);
        vyVar.Z();
    }

    @Override
    public final void c(int i10) {
    }
}
