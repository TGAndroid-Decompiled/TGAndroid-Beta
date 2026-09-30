package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class fx implements z4.e {
    public final boolean f24373a;
    public final nz f24374b;

    public fx(nz nzVar, boolean z10) {
        this.f24374b = nzVar;
        this.f24373a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        nz nzVar = this.f24374b;
        cx cxVar = nzVar.h;
        boolean z11 = false;
        if (cxVar != null) {
            int currentItem = cxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (nzVar.A1 != i11) {
                nzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nzVar.L(z10, true);
        if (i10 == 2 && (this.f24373a || nzVar.f26876v0)) {
            z11 = true;
        }
        nzVar.Q(z11, true);
        if (nzVar.f26871t1.z()) {
            if (i10 == 0) {
                mw mwVar = nzVar.V;
                if (mwVar != null) {
                    mwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                sw swVar = nzVar.f26853o0;
                if (swVar != null) {
                    swVar.d.requestFocus();
                }
            } else {
                zw zwVar = nzVar.G0;
                if (zwVar != null) {
                    zwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        az azVar;
        az azVar2;
        int i12;
        int i13;
        int i14;
        nz nzVar = this.f24374b;
        az azVar3 = nzVar.G0;
        az azVar4 = nzVar.f26853o0;
        az azVar5 = nzVar.V;
        bx bxVar = nzVar.C0;
        vw vwVar = nzVar.D0;
        ux uxVar = nzVar.f26856p0;
        pw pwVar = nzVar.f26833h0;
        zx zxVar = nzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (nzVar.f26884x0 == null || nzVar.f26830g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                zxVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f10 = 0.0f;
                pwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                uxVar.setVisibility(i14);
                vwVar.setVisibility(8);
                if (bxVar != null) {
                    bxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    zxVar.setVisibility(8);
                    pwVar.setVisibility(0);
                    uxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    vwVar.setVisibility(i12);
                    if (bxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        bxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    zxVar.setVisibility(8);
                    pwVar.setVisibility(8);
                    uxVar.setVisibility(8);
                    vwVar.setVisibility(0);
                    if (bxVar != null) {
                        bxVar.setVisibility(0);
                    }
                }
            }
        }
        nzVar.getMeasuredWidth();
        nzVar.getPaddingLeft();
        nzVar.getPaddingRight();
        oy oyVar = nzVar.f26871t1;
        if (oyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                oyVar.s(i15);
            } else if (i10 == 2) {
                oyVar.s(3);
            } else {
                oyVar.s(0);
            }
        }
        nzVar.M(true);
        int currentItem = nzVar.h.getCurrentItem();
        if (currentItem == 0) {
            azVar = azVar5;
        } else if (currentItem == 1) {
            azVar = azVar4;
        } else {
            azVar = azVar3;
        }
        String obj = azVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                azVar2 = azVar5;
            } else if (i19 == 1) {
                azVar2 = azVar4;
            } else {
                azVar2 = azVar3;
            }
            if (azVar2 != null) {
                lq lqVar = azVar2.d;
                if (azVar2 != azVar && lqVar != null && !lqVar.getText().toString().equals(obj)) {
                    lqVar.setText(obj);
                    lqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        nz.a(nzVar, z10);
        nzVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
