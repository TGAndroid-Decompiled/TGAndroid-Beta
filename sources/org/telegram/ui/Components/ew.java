package org.telegram.ui.Components;
public final class ew implements c5.h {
    public final boolean f34441a;
    public final ly f34442b;

    public ew(ly lyVar, boolean z10) {
        this.f34442b = lyVar;
        this.f34441a = z10;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        ly lyVar = this.f34442b;
        bw bwVar = lyVar.h;
        boolean z11 = false;
        if (bwVar != null) {
            int currentItem = bwVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (lyVar.B1 != i10) {
                lyVar.B1 = i10;
                org.telegram.messenger.np.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lyVar.M(z10, true);
        if (i7 == 2 && (this.f34441a || lyVar.f36999w0)) {
            z11 = true;
        }
        lyVar.R(z11, true);
        if (lyVar.f36993u1.z()) {
            if (i7 == 0) {
                nv nvVar = lyVar.W;
                if (nvVar != null) {
                    nvVar.d.requestFocus();
                }
            } else if (i7 == 1) {
                sv svVar = lyVar.f36975p0;
                if (svVar != null) {
                    svVar.d.requestFocus();
                }
            } else {
                yv yvVar = lyVar.H0;
                if (yvVar != null) {
                    yvVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        yx yxVar;
        yx yxVar2;
        int i11;
        int i12;
        int i13;
        ly lyVar = this.f34442b;
        yx yxVar3 = lyVar.H0;
        yx yxVar4 = lyVar.f36975p0;
        yx yxVar5 = lyVar.W;
        aw awVar = lyVar.D0;
        vv vvVar = lyVar.E0;
        tw twVar = lyVar.f36978q0;
        qv qvVar = lyVar.f36956i0;
        yw ywVar = lyVar.Q;
        int i14 = 2;
        boolean z10 = true;
        if (lyVar.f37007y0 == null || lyVar.f36953h0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i7 == 0) {
                ywVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                f11 = 0.0f;
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                qvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                twVar.setVisibility(i13);
                vvVar.setVisibility(8);
                if (awVar != null) {
                    awVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    ywVar.setVisibility(8);
                    qvVar.setVisibility(0);
                    twVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    vvVar.setVisibility(i11);
                    if (awVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        awVar.setVisibility(i15);
                    }
                } else if (i7 == 2) {
                    ywVar.setVisibility(8);
                    qvVar.setVisibility(8);
                    twVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    if (awVar != null) {
                        awVar.setVisibility(0);
                    }
                }
            }
        }
        lyVar.getMeasuredWidth();
        lyVar.getPaddingLeft();
        lyVar.getPaddingRight();
        mx mxVar = lyVar.f36993u1;
        if (mxVar != null) {
            if (i7 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                mxVar.s(i14);
            } else if (i7 == 2) {
                mxVar.s(3);
            } else {
                mxVar.s(0);
            }
        }
        lyVar.N(true);
        int currentItem = lyVar.h.getCurrentItem();
        if (currentItem == 0) {
            yxVar = yxVar5;
        } else if (currentItem == 1) {
            yxVar = yxVar4;
        } else {
            yxVar = yxVar3;
        }
        String obj = yxVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                yxVar2 = yxVar5;
            } else if (i18 == 1) {
                yxVar2 = yxVar4;
            } else {
                yxVar2 = yxVar3;
            }
            if (yxVar2 != null) {
                zp zpVar = yxVar2.d;
                if (yxVar2 != yxVar && zpVar != null && !zpVar.getText().toString().equals(obj)) {
                    zpVar.setText(obj);
                    zpVar.setSelection(obj.length());
                }
            }
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ly.a(lyVar, z10);
        lyVar.Z();
    }

    @Override
    public final void c(int i7) {
    }
}
