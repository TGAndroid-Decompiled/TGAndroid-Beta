package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ow implements m2.e {
    public final boolean f31453a;
    public final wy f31454b;

    public ow(wy wyVar, boolean z10) {
        this.f31454b = wyVar;
        this.f31453a = z10;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        int i10;
        wy wyVar = this.f31454b;
        lw lwVar = wyVar.h;
        boolean z11 = false;
        if (lwVar != null) {
            int currentItem = lwVar.getCurrentItem();
            if (currentItem == 2) {
                i10 = 1;
            } else if (currentItem == 1) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (wyVar.f34456w1 != i10) {
                wyVar.f34456w1 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i10).commit();
            }
        }
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wyVar.M(z10, true);
        if (i9 == 2 && (this.f31453a || wyVar.f34438r0)) {
            z11 = true;
        }
        wyVar.R(z11, true);
        if (wyVar.f34432p1.z()) {
            if (i9 == 0) {
                wv wvVar = wyVar.R;
                if (wvVar != null) {
                    wvVar.d.requestFocus();
                }
            } else if (i9 == 1) {
                cw cwVar = wyVar.f34417k0;
                if (cwVar != null) {
                    cwVar.d.requestFocus();
                }
            } else {
                iw iwVar = wyVar.C0;
                if (iwVar != null) {
                    iwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        float f11;
        jy jyVar;
        jy jyVar2;
        int i11;
        int i12;
        int i13;
        wy wyVar = this.f31454b;
        jy jyVar3 = wyVar.C0;
        jy jyVar4 = wyVar.f34417k0;
        jy jyVar5 = wyVar.R;
        kw kwVar = wyVar.f34463y0;
        fw fwVar = wyVar.f34466z0;
        dx dxVar = wyVar.f34420l0;
        zv zvVar = wyVar.f34394d0;
        ww wwVar = wyVar.L;
        int i14 = 2;
        boolean z10 = true;
        if (wyVar.f34445t0 == null || wyVar.f34391c0 == null) {
            f11 = 0.0f;
        } else {
            int i15 = 8;
            if (i9 == 0) {
                wwVar.setVisibility(0);
                int i16 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i16 == 0) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                f11 = 0.0f;
                zvVar.setVisibility(i12);
                if (i16 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dxVar.setVisibility(i13);
                fwVar.setVisibility(8);
                if (kwVar != null) {
                    kwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i9 == 1) {
                    wwVar.setVisibility(8);
                    zvVar.setVisibility(0);
                    dxVar.setVisibility(0);
                    int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i17 == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    fwVar.setVisibility(i11);
                    if (kwVar != null) {
                        if (i17 != 0) {
                            i15 = 0;
                        }
                        kwVar.setVisibility(i15);
                    }
                } else if (i9 == 2) {
                    wwVar.setVisibility(8);
                    zvVar.setVisibility(8);
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(0);
                    if (kwVar != null) {
                        kwVar.setVisibility(0);
                    }
                }
            }
        }
        wyVar.getMeasuredWidth();
        wyVar.getPaddingLeft();
        wyVar.getPaddingRight();
        wx wxVar = wyVar.f34432p1;
        if (wxVar != null) {
            if (i9 == 1) {
                if (i10 == 0) {
                    i14 = 0;
                }
                wxVar.s(i14);
            } else if (i9 == 2) {
                wxVar.s(3);
            } else {
                wxVar.s(0);
            }
        }
        wyVar.N(true);
        int currentItem = wyVar.h.getCurrentItem();
        if (currentItem == 0) {
            jyVar = jyVar5;
        } else if (currentItem == 1) {
            jyVar = jyVar4;
        } else {
            jyVar = jyVar3;
        }
        String obj = jyVar.d.getText().toString();
        for (int i18 = 0; i18 < 3; i18++) {
            if (i18 == 0) {
                jyVar2 = jyVar5;
            } else if (i18 == 1) {
                jyVar2 = jyVar4;
            } else {
                jyVar2 = jyVar3;
            }
            if (jyVar2 != null) {
                yp ypVar = jyVar2.d;
                if (jyVar2 != jyVar && ypVar != null && !ypVar.getText().toString().equals(obj)) {
                    ypVar.setText(obj);
                    ypVar.setSelection(obj.length());
                }
            }
        }
        if ((i9 != 0 || f10 <= f11) && i9 != 1) {
            z10 = false;
        }
        wy.b(wyVar, z10);
        wyVar.Z();
    }

    @Override
    public final void d(int i9) {
    }
}
