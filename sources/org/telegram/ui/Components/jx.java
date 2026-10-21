package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class jx implements z4.e {
    public final boolean f27664a;
    public final tz f27665b;

    public jx(tz tzVar, boolean z10) {
        this.f27665b = tzVar;
        this.f27664a = z10;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        float f10;
        gz gzVar;
        gz gzVar2;
        int i12;
        int i13;
        int i14;
        tz tzVar = this.f27665b;
        gz gzVar3 = tzVar.G0;
        gz gzVar4 = tzVar.f30758o0;
        gz gzVar5 = tzVar.V;
        fx fxVar = tzVar.C0;
        ax axVar = tzVar.D0;
        yx yxVar = tzVar.f30761p0;
        uw uwVar = tzVar.f30738h0;
        ey eyVar = tzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (tzVar.f30789x0 == null || tzVar.f30735g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                eyVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                uwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                yxVar.setVisibility(i14);
                axVar.setVisibility(8);
                if (fxVar != null) {
                    fxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    eyVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    yxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    axVar.setVisibility(i12);
                    if (fxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        fxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    eyVar.setVisibility(8);
                    uwVar.setVisibility(8);
                    yxVar.setVisibility(8);
                    axVar.setVisibility(0);
                    if (fxVar != null) {
                        fxVar.setVisibility(0);
                    }
                }
            }
        }
        tzVar.getMeasuredWidth();
        tzVar.getPaddingLeft();
        tzVar.getPaddingRight();
        uy uyVar = tzVar.f30776t1;
        if (uyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                uyVar.s(i15);
            } else if (i10 == 2) {
                uyVar.s(3);
            } else {
                uyVar.s(0);
            }
        }
        tzVar.M(true);
        int currentItem = tzVar.h.getCurrentItem();
        if (currentItem == 0) {
            gzVar = gzVar5;
        } else if (currentItem == 1) {
            gzVar = gzVar4;
        } else {
            gzVar = gzVar3;
        }
        String obj = gzVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                gzVar2 = gzVar5;
            } else if (i19 == 1) {
                gzVar2 = gzVar4;
            } else {
                gzVar2 = gzVar3;
            }
            if (gzVar2 != null) {
                sq sqVar = gzVar2.d;
                if (gzVar2 != gzVar && sqVar != null && !sqVar.getText().toString().equals(obj)) {
                    sqVar.setText(obj);
                    sqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        tz.c(tzVar, z10);
        tzVar.Y();
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        tz tzVar = this.f27665b;
        gx gxVar = tzVar.h;
        boolean z11 = false;
        if (gxVar != null) {
            int currentItem = gxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (tzVar.A1 != i11) {
                tzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tzVar.L(z10, true);
        if (i10 == 2 && (this.f27664a || tzVar.f30781v0)) {
            z11 = true;
        }
        tzVar.Q(z11, true);
        if (tzVar.f30776t1.z()) {
            if (i10 == 0) {
                rw rwVar = tzVar.V;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                xw xwVar = tzVar.f30758o0;
                if (xwVar != null) {
                    xwVar.d.requestFocus();
                }
            } else {
                dx dxVar = tzVar.G0;
                if (dxVar != null) {
                    dxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
    }
}
