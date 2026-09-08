package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class cx implements z4.e {
    public final boolean f25131a;
    public final kz f25132b;

    public cx(kz kzVar, boolean z10) {
        this.f25132b = kzVar;
        this.f25131a = z10;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        float f10;
        xy xyVar;
        xy xyVar2;
        int i12;
        int i13;
        int i14;
        kz kzVar = this.f25132b;
        xy xyVar3 = kzVar.G0;
        xy xyVar4 = kzVar.f27995o0;
        xy xyVar5 = kzVar.V;
        yw ywVar = kzVar.C0;
        tw twVar = kzVar.D0;
        rx rxVar = kzVar.f27998p0;
        nw nwVar = kzVar.f27975h0;
        kx kxVar = kzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (kzVar.f28026x0 == null || kzVar.f27972g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                kxVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f10 = 0.0f;
                nwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                rxVar.setVisibility(i14);
                twVar.setVisibility(8);
                if (ywVar != null) {
                    ywVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    kxVar.setVisibility(8);
                    nwVar.setVisibility(0);
                    rxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    twVar.setVisibility(i12);
                    if (ywVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        ywVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    kxVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    rxVar.setVisibility(8);
                    twVar.setVisibility(0);
                    if (ywVar != null) {
                        ywVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ly lyVar = kzVar.f28013t1;
        if (lyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                lyVar.s(i15);
            } else if (i10 == 2) {
                lyVar.s(3);
            } else {
                lyVar.s(0);
            }
        }
        kzVar.O(true);
        int currentItem = kzVar.h.getCurrentItem();
        if (currentItem == 0) {
            xyVar = xyVar5;
        } else if (currentItem == 1) {
            xyVar = xyVar4;
        } else {
            xyVar = xyVar3;
        }
        String obj = xyVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                xyVar2 = xyVar5;
            } else if (i19 == 1) {
                xyVar2 = xyVar4;
            } else {
                xyVar2 = xyVar3;
            }
            if (xyVar2 != null) {
                hq hqVar = xyVar2.d;
                if (xyVar2 != xyVar && hqVar != null && !hqVar.getText().toString().equals(obj)) {
                    hqVar.setText(obj);
                    hqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        kz.c(kzVar, z10);
        kzVar.a0();
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        kz kzVar = this.f25132b;
        zw zwVar = kzVar.h;
        boolean z11 = false;
        if (zwVar != null) {
            int currentItem = zwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (kzVar.A1 != i11) {
                kzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kzVar.N(z10, true);
        if (i10 == 2 && (this.f25131a || kzVar.f28018v0)) {
            z11 = true;
        }
        kzVar.S(z11, true);
        if (kzVar.f28013t1.z()) {
            if (i10 == 0) {
                kw kwVar = kzVar.V;
                if (kwVar != null) {
                    kwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                qw qwVar = kzVar.f27995o0;
                if (qwVar != null) {
                    qwVar.d.requestFocus();
                }
            } else {
                ww wwVar = kzVar.G0;
                if (wwVar != null) {
                    wwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
    }
}
