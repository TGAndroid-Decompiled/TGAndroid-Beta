package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class hx implements z4.f {
    public final boolean f27191a;
    public final rz f27192b;

    public hx(rz rzVar, boolean z10) {
        this.f27192b = rzVar;
        this.f27191a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        rz rzVar = this.f27192b;
        ex exVar = rzVar.h;
        boolean z11 = false;
        if (exVar != null) {
            int currentItem = exVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (rzVar.A1 != i11) {
                rzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rzVar.L(z10, true);
        if (i10 == 2 && (this.f27191a || rzVar.f30368v0)) {
            z11 = true;
        }
        rzVar.Q(z11, true);
        if (rzVar.f30363t1.z()) {
            if (i10 == 0) {
                pw pwVar = rzVar.V;
                if (pwVar != null) {
                    pwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                vw vwVar = rzVar.f30345o0;
                if (vwVar != null) {
                    vwVar.d.requestFocus();
                }
            } else {
                bx bxVar = rzVar.G0;
                if (bxVar != null) {
                    bxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        ez ezVar;
        ez ezVar2;
        int i12;
        int i13;
        int i14;
        rz rzVar = this.f27192b;
        ez ezVar3 = rzVar.G0;
        ez ezVar4 = rzVar.f30345o0;
        ez ezVar5 = rzVar.V;
        dx dxVar = rzVar.C0;
        yw ywVar = rzVar.D0;
        wx wxVar = rzVar.f30348p0;
        sw swVar = rzVar.f30325h0;
        cy cyVar = rzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (rzVar.f30376x0 == null || rzVar.f30322g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                cyVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                swVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                wxVar.setVisibility(i14);
                ywVar.setVisibility(8);
                if (dxVar != null) {
                    dxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    cyVar.setVisibility(8);
                    swVar.setVisibility(0);
                    wxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    ywVar.setVisibility(i12);
                    if (dxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        dxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    cyVar.setVisibility(8);
                    swVar.setVisibility(8);
                    wxVar.setVisibility(8);
                    ywVar.setVisibility(0);
                    if (dxVar != null) {
                        dxVar.setVisibility(0);
                    }
                }
            }
        }
        rzVar.getMeasuredWidth();
        rzVar.getPaddingLeft();
        rzVar.getPaddingRight();
        sy syVar = rzVar.f30363t1;
        if (syVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                syVar.s(i15);
            } else if (i10 == 2) {
                syVar.s(3);
            } else {
                syVar.s(0);
            }
        }
        rzVar.M(true);
        int currentItem = rzVar.h.getCurrentItem();
        if (currentItem == 0) {
            ezVar = ezVar5;
        } else if (currentItem == 1) {
            ezVar = ezVar4;
        } else {
            ezVar = ezVar3;
        }
        String obj = ezVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                ezVar2 = ezVar5;
            } else if (i19 == 1) {
                ezVar2 = ezVar4;
            } else {
                ezVar2 = ezVar3;
            }
            if (ezVar2 != null) {
                qq qqVar = ezVar2.d;
                if (ezVar2 != ezVar && qqVar != null && !qqVar.getText().toString().equals(obj)) {
                    qqVar.setText(obj);
                    qqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        rz.a(rzVar, z10);
        rzVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
