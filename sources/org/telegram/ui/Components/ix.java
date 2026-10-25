package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ix implements a5.i {
    public final boolean f29389a;
    public final sz f29390b;

    public ix(sz szVar, boolean z10) {
        this.f29390b = szVar;
        this.f29389a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        sz szVar = this.f29390b;
        fx fxVar = szVar.h;
        boolean z11 = false;
        if (fxVar != null) {
            int currentItem = fxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (szVar.A1 != i11) {
                szVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        szVar.L(z10, true);
        if (i10 == 2 && (this.f29389a || szVar.f32774v0)) {
            z11 = true;
        }
        szVar.Q(z11, true);
        if (szVar.f32769t1.z()) {
            if (i10 == 0) {
                rw rwVar = szVar.V;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                ww wwVar = szVar.f32751o0;
                if (wwVar != null) {
                    wwVar.d.requestFocus();
                }
            } else {
                cx cxVar = szVar.G0;
                if (cxVar != null) {
                    cxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        fz fzVar;
        fz fzVar2;
        int i12;
        int i13;
        int i14;
        sz szVar = this.f29390b;
        fz fzVar3 = szVar.G0;
        fz fzVar4 = szVar.f32751o0;
        fz fzVar5 = szVar.V;
        ex exVar = szVar.C0;
        zw zwVar = szVar.D0;
        xx xxVar = szVar.f32754p0;
        uw uwVar = szVar.f32731h0;
        dy dyVar = szVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (szVar.f32782x0 == null || szVar.f32728g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                dyVar.setVisibility(0);
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
                xxVar.setVisibility(i14);
                zwVar.setVisibility(8);
                if (exVar != null) {
                    exVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    dyVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    xxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    zwVar.setVisibility(i12);
                    if (exVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        exVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    dyVar.setVisibility(8);
                    uwVar.setVisibility(8);
                    xxVar.setVisibility(8);
                    zwVar.setVisibility(0);
                    if (exVar != null) {
                        exVar.setVisibility(0);
                    }
                }
            }
        }
        szVar.getMeasuredWidth();
        szVar.getPaddingLeft();
        szVar.getPaddingRight();
        ty tyVar = szVar.f32769t1;
        if (tyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                tyVar.s(i15);
            } else if (i10 == 2) {
                tyVar.s(3);
            } else {
                tyVar.s(0);
            }
        }
        szVar.M(true);
        int currentItem = szVar.h.getCurrentItem();
        if (currentItem == 0) {
            fzVar = fzVar5;
        } else if (currentItem == 1) {
            fzVar = fzVar4;
        } else {
            fzVar = fzVar3;
        }
        String obj = fzVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                fzVar2 = fzVar5;
            } else if (i19 == 1) {
                fzVar2 = fzVar4;
            } else {
                fzVar2 = fzVar3;
            }
            if (fzVar2 != null) {
                uq uqVar = fzVar2.d;
                if (fzVar2 != fzVar && uqVar != null && !uqVar.getText().toString().equals(obj)) {
                    uqVar.setText(obj);
                    uqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        sz.a(szVar, z10);
        szVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
