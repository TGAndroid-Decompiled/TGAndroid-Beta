package org.telegram.ui.Components;
public final class yv implements c5.g {
    public final boolean f40733a;
    public final gy f40734b;

    public yv(gy gyVar, boolean z9) {
        this.f40734b = gyVar;
        this.f40733a = z9;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        int i10;
        gy gyVar = this.f40734b;
        vv vvVar = gyVar.h;
        boolean z10 = false;
        if (vvVar != null) {
            int currentItem = vvVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (gyVar.A1 != i10) {
                gyVar.A1 = i10;
                org.telegram.messenger.qp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        gyVar.L(z9, true);
        if (i7 == 2 && (this.f40733a || gyVar.f34073v0)) {
            z10 = true;
        }
        gyVar.Q(z10, true);
        if (gyVar.f34068t1.z()) {
            if (i7 == 0) {
                hv hvVar = gyVar.V;
                if (hvVar != null) {
                    hvVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                mv mvVar = gyVar.f34050o0;
                if (mvVar != null) {
                    mvVar.d.requestFocus();
                }
            } else {
                sv svVar = gyVar.G0;
                if (svVar != null) {
                    svVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        tx txVar;
        tx txVar2;
        int i11;
        int i12;
        int i13;
        gy gyVar = this.f40734b;
        tx txVar3 = gyVar.G0;
        tx txVar4 = gyVar.f34050o0;
        tx txVar5 = gyVar.V;
        uv uvVar = gyVar.C0;
        pv pvVar = gyVar.D0;
        nw nwVar = gyVar.f34053p0;
        kv kvVar = gyVar.f34031h0;
        sw swVar = gyVar.P;
        int i14 = 2;
        boolean z9 = true;
        if (gyVar.f34081x0 == null || gyVar.f34028g0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                swVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                kvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                nwVar.setVisibility(i13);
                pvVar.setVisibility(8);
                if (uvVar != null) {
                    uvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    swVar.setVisibility(8);
                    kvVar.setVisibility(0);
                    nwVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    pvVar.setVisibility(i11);
                    if (uvVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        uvVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    swVar.setVisibility(8);
                    kvVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    pvVar.setVisibility(0);
                    if (uvVar != null) {
                        uvVar.setVisibility(0);
                    }
                }
            }
        }
        gyVar.getMeasuredWidth();
        gyVar.getPaddingLeft();
        gyVar.getPaddingRight();
        hx hxVar = gyVar.f34068t1;
        if (hxVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                hxVar.s(i14);
            } else if (i7 == 2) {
                hxVar.s(3);
            } else {
                hxVar.s(0);
            }
        }
        gyVar.M(true);
        int currentItem = gyVar.h.getCurrentItem();
        if (currentItem == 0) {
            txVar = txVar5;
        } else if (currentItem == 1) {
            txVar = txVar4;
        } else {
            txVar = txVar3;
        }
        String obj = txVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                txVar2 = txVar5;
            } else if (i18 == 1) {
                txVar2 = txVar4;
            } else {
                txVar2 = txVar3;
            }
            if (txVar2 != null) {
                rp rpVar = txVar2.d;
                if (txVar2 != txVar && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z9 = false;
        }
        gy.a(gyVar, z9);
        gyVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
