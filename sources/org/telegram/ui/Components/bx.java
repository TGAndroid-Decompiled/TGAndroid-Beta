package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class bx implements z4.e {
    public final boolean f22823a;
    public final kz f22824b;

    public bx(kz kzVar, boolean z10) {
        this.f22824b = kzVar;
        this.f22823a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        kz kzVar = this.f22824b;
        yw ywVar = kzVar.h;
        boolean z11 = false;
        if (ywVar != null) {
            int currentItem = ywVar.getCurrentItem();
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
        kzVar.L(z10, true);
        if (i10 == 2 && (this.f22823a || kzVar.f25774v0)) {
            z11 = true;
        }
        kzVar.Q(z11, true);
        if (kzVar.f25769t1.z()) {
            if (i10 == 0) {
                jw jwVar = kzVar.V;
                if (jwVar != null) {
                    jwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                pw pwVar = kzVar.f25751o0;
                if (pwVar != null) {
                    pwVar.d.requestFocus();
                }
            } else {
                vw vwVar = kzVar.G0;
                if (vwVar != null) {
                    vwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        xy xyVar;
        xy xyVar2;
        int i12;
        int i13;
        int i14;
        kz kzVar = this.f22824b;
        xy xyVar3 = kzVar.G0;
        xy xyVar4 = kzVar.f25751o0;
        xy xyVar5 = kzVar.V;
        xw xwVar = kzVar.C0;
        sw swVar = kzVar.D0;
        qx qxVar = kzVar.f25754p0;
        mw mwVar = kzVar.f25731h0;
        vx vxVar = kzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (kzVar.f25782x0 == null || kzVar.f25728g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                vxVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f10 = 0.0f;
                mwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                qxVar.setVisibility(i14);
                swVar.setVisibility(8);
                if (xwVar != null) {
                    xwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    vxVar.setVisibility(8);
                    mwVar.setVisibility(0);
                    qxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    swVar.setVisibility(i12);
                    if (xwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        xwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    vxVar.setVisibility(8);
                    mwVar.setVisibility(8);
                    qxVar.setVisibility(8);
                    swVar.setVisibility(0);
                    if (xwVar != null) {
                        xwVar.setVisibility(0);
                    }
                }
            }
        }
        kzVar.getMeasuredWidth();
        kzVar.getPaddingLeft();
        kzVar.getPaddingRight();
        ky kyVar = kzVar.f25769t1;
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
        kzVar.M(true);
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
                iq iqVar = xyVar2.d;
                if (xyVar2 != xyVar && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        kz.a(kzVar, z10);
        kzVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
