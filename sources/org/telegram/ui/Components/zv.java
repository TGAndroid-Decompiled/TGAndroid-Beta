package org.telegram.ui.Components;
public final class zv implements c5.g {
    public final boolean f41153a;
    public final hy f41154b;

    public zv(hy hyVar, boolean z9) {
        this.f41154b = hyVar;
        this.f41153a = z9;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        int i10;
        hy hyVar = this.f41154b;
        wv wvVar = hyVar.h;
        boolean z10 = false;
        if (wvVar != null) {
            int currentItem = wvVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (hyVar.A1 != i10) {
                hyVar.A1 = i10;
                org.telegram.messenger.qp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        hyVar.L(z9, true);
        if (i7 == 2 && (this.f41153a || hyVar.f34457v0)) {
            z10 = true;
        }
        hyVar.Q(z10, true);
        if (hyVar.f34452t1.z()) {
            if (i7 == 0) {
                iv ivVar = hyVar.V;
                if (ivVar != null) {
                    ivVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                nv nvVar = hyVar.f34434o0;
                if (nvVar != null) {
                    nvVar.d.requestFocus();
                }
            } else {
                tv tvVar = hyVar.G0;
                if (tvVar != null) {
                    tvVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        ux uxVar;
        ux uxVar2;
        int i11;
        int i12;
        int i13;
        hy hyVar = this.f41154b;
        ux uxVar3 = hyVar.G0;
        ux uxVar4 = hyVar.f34434o0;
        ux uxVar5 = hyVar.V;
        vv vvVar = hyVar.C0;
        qv qvVar = hyVar.D0;
        ow owVar = hyVar.f34437p0;
        lv lvVar = hyVar.f34415h0;
        tw twVar = hyVar.P;
        int i14 = 2;
        boolean z9 = true;
        if (hyVar.f34465x0 == null || hyVar.f34412g0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                twVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                lvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                owVar.setVisibility(i13);
                qvVar.setVisibility(8);
                if (vvVar != null) {
                    vvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    twVar.setVisibility(8);
                    lvVar.setVisibility(0);
                    owVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    qvVar.setVisibility(i11);
                    if (vvVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        vvVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    twVar.setVisibility(8);
                    lvVar.setVisibility(8);
                    owVar.setVisibility(8);
                    qvVar.setVisibility(0);
                    if (vvVar != null) {
                        vvVar.setVisibility(0);
                    }
                }
            }
        }
        hyVar.getMeasuredWidth();
        hyVar.getPaddingLeft();
        hyVar.getPaddingRight();
        ix ixVar = hyVar.f34452t1;
        if (ixVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                ixVar.s(i14);
            } else if (i7 == 2) {
                ixVar.s(3);
            } else {
                ixVar.s(0);
            }
        }
        hyVar.M(true);
        int currentItem = hyVar.h.getCurrentItem();
        if (currentItem == 0) {
            uxVar = uxVar5;
        } else if (currentItem == 1) {
            uxVar = uxVar4;
        } else {
            uxVar = uxVar3;
        }
        String obj = uxVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                uxVar2 = uxVar5;
            } else if (i18 == 1) {
                uxVar2 = uxVar4;
            } else {
                uxVar2 = uxVar3;
            }
            if (uxVar2 != null) {
                rp rpVar = uxVar2.d;
                if (uxVar2 != uxVar && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z9 = false;
        }
        hy.a(hyVar, z9);
        hyVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
