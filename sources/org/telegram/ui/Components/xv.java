package org.telegram.ui.Components;
public final class xv implements b5.h {
    public final boolean f40503a;
    public final ey f40504b;

    public xv(ey eyVar, boolean z10) {
        this.f40504b = eyVar;
        this.f40503a = z10;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        int i10;
        ey eyVar = this.f40504b;
        uv uvVar = eyVar.h;
        boolean z11 = false;
        if (uvVar != null) {
            int currentItem = uvVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (eyVar.B1 != i10) {
                eyVar.B1 = i10;
                org.telegram.messenger.hp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        eyVar.L(z10, true);
        if (i3 == 2 && (this.f40503a || eyVar.f33588w0)) {
            z11 = true;
        }
        eyVar.Q(z11, true);
        if (eyVar.f33582u1.z()) {
            if (i3 == 0) {
                gv gvVar = eyVar.W;
                if (gvVar != null) {
                    gvVar.d.requestFocus();
                }
            } else if (i3 == 1) {
                lv lvVar = eyVar.f33564p0;
                if (lvVar != null) {
                    lvVar.d.requestFocus();
                }
            } else {
                rv rvVar = eyVar.H0;
                if (rvVar != null) {
                    rvVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        float f11;
        rx rxVar;
        rx rxVar2;
        int i11;
        int i12;
        int i13;
        ey eyVar = this.f40504b;
        rx rxVar3 = eyVar.H0;
        rx rxVar4 = eyVar.f33564p0;
        rx rxVar5 = eyVar.W;
        tv tvVar = eyVar.D0;
        ov ovVar = eyVar.E0;
        mw mwVar = eyVar.f33567q0;
        jv jvVar = eyVar.f33545i0;
        rw rwVar = eyVar.Q;
        int i14 = 2;
        boolean z10 = true;
        if (eyVar.f33596y0 == null || eyVar.f33542h0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i3 == 0) {
                rwVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                jvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                mwVar.setVisibility(i13);
                ovVar.setVisibility(8);
                if (tvVar != null) {
                    tvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i3 == 1) {
                    rwVar.setVisibility(8);
                    jvVar.setVisibility(0);
                    mwVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    ovVar.setVisibility(i11);
                    if (tvVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        tvVar.setVisibility(i15);
                    }
                } else if (i3 == 2) {
                    rwVar.setVisibility(8);
                    jvVar.setVisibility(8);
                    mwVar.setVisibility(8);
                    ovVar.setVisibility(0);
                    if (tvVar != null) {
                        tvVar.setVisibility(0);
                    }
                }
            }
        }
        eyVar.getMeasuredWidth();
        eyVar.getPaddingLeft();
        eyVar.getPaddingRight();
        fx fxVar = eyVar.f33582u1;
        if (fxVar != null) {
            if (i3 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                fxVar.s(i14);
            } else if (i3 == 2) {
                fxVar.s(3);
            } else {
                fxVar.s(0);
            }
        }
        eyVar.M(true);
        int currentItem = eyVar.h.getCurrentItem();
        if (currentItem == 0) {
            rxVar = rxVar5;
        } else if (currentItem == 1) {
            rxVar = rxVar4;
        } else {
            rxVar = rxVar3;
        }
        String obj = rxVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                rxVar2 = rxVar5;
            } else if (i18 == 1) {
                rxVar2 = rxVar4;
            } else {
                rxVar2 = rxVar3;
            }
            if (rxVar2 != null) {
                rp rpVar = rxVar2.d;
                if (rxVar2 != rxVar && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
        }
        if ((i3 != 0 || f10 <= f11) && i3 != 1) {
            z10 = false;
        }
        ey.a(eyVar, z10);
        eyVar.Z();
    }

    @Override
    public final void c(int i3) {
    }
}
