package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class yw implements m2.f {
    public final boolean f31173a;
    public final kz f31174b;

    public yw(kz kzVar, boolean z4) {
        this.f31174b = kzVar;
        this.f31173a = z4;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        int i11;
        kz kzVar = this.f31174b;
        vw vwVar = kzVar.h;
        boolean z10 = false;
        if (vwVar != null) {
            int currentItem = vwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (kzVar.f26485x1 != i11) {
                kzVar.f26485x1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        kzVar.N(z4, true);
        if (i10 == 2 && (this.f31173a || kzVar.f26467s0)) {
            z10 = true;
        }
        kzVar.S(z10, true);
        if (kzVar.f26460q1.z()) {
            if (i10 == 0) {
                gw gwVar = kzVar.S;
                if (gwVar != null) {
                    gwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                mw mwVar = kzVar.f26445l0;
                if (mwVar != null) {
                    mwVar.d.requestFocus();
                }
            } else {
                sw swVar = kzVar.D0;
                if (swVar != null) {
                    swVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        float f11;
        wy wyVar;
        wy wyVar2;
        int i12;
        int i13;
        int i14;
        kz kzVar = this.f31174b;
        wy wyVar3 = kzVar.D0;
        wy wyVar4 = kzVar.f26445l0;
        wy wyVar5 = kzVar.S;
        uw uwVar = kzVar.f26491z0;
        pw pwVar = kzVar.A0;
        px pxVar = kzVar.m0;
        jw jwVar = kzVar.f26423e0;
        ix ixVar = kzVar.M;
        int i15 = 2;
        boolean z4 = true;
        if (kzVar.f26473u0 == null || kzVar.f26420d0 == null) {
            f11 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                ixVar.setVisibility(0);
                int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f11 = 0.0f;
                jwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                pxVar.setVisibility(i14);
                pwVar.setVisibility(8);
                if (uwVar != null) {
                    uwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    ixVar.setVisibility(8);
                    jwVar.setVisibility(0);
                    pxVar.setVisibility(0);
                    int i18 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    pwVar.setVisibility(i12);
                    if (uwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        uwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    ixVar.setVisibility(8);
                    jwVar.setVisibility(8);
                    pxVar.setVisibility(8);
                    pwVar.setVisibility(0);
                    if (uwVar != null) {
                        uwVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ky kyVar = kzVar.f26460q1;
        if (kyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                kyVar.s(i15);
            } else if (i10 == 2) {
                kyVar.s(3);
            } else {
                kyVar.s(0);
            }
        }
        kzVar.O(true);
        int currentItem = kzVar.h.getCurrentItem();
        if (currentItem == 0) {
            wyVar = wyVar5;
        } else if (currentItem == 1) {
            wyVar = wyVar4;
        } else {
            wyVar = wyVar3;
        }
        String obj = wyVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                wyVar2 = wyVar5;
            } else if (i19 == 1) {
                wyVar2 = wyVar4;
            } else {
                wyVar2 = wyVar3;
            }
            if (wyVar2 != null) {
                gq gqVar = wyVar2.d;
                if (wyVar2 != wyVar && gqVar != null && !gqVar.getText().toString().equals(obj)) {
                    gqVar.setText(obj);
                    gqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z4 = false;
        }
        kz.a(kzVar, z4);
        kzVar.a0();
    }

    @Override
    public final void c(int i10) {
    }
}
