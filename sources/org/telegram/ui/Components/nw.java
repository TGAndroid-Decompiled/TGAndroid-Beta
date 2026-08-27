package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

public final class nw implements m2.e {

    public final boolean f31041a;

    public final yy f31042b;

    public nw(yy yyVar, boolean z10) {
        this.f31042b = yyVar;
        this.f31041a = z10;
    }

    @Override
    public final void b(int i10) {
        int i11;
        yy yyVar = this.f31042b;
        kw kwVar = yyVar.h;
        boolean z10 = false;
        if (kwVar != null) {
            int currentItem = kwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else {
                i11 = currentItem == 1 ? 2 : 0;
            }
            if (yyVar.f35049w1 != i11) {
                yyVar.f35049w1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        yyVar.N(i10 == 0, true);
        if (i10 == 2 && (this.f31041a || yyVar.f35031r0)) {
            z10 = true;
        }
        yyVar.S(z10, true);
        if (yyVar.f35025p1.z()) {
            if (i10 == 0) {
                vv vvVar = yyVar.R;
                if (vvVar != null) {
                    vvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                bw bwVar = yyVar.f35010k0;
                if (bwVar != null) {
                    bwVar.d.requestFocus();
                    return;
                }
                return;
            }
            hw hwVar = yyVar.C0;
            if (hwVar != null) {
                hwVar.d.requestFocus();
            }
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        float f11;
        ky kyVar;
        ky kyVar2;
        yy yyVar = this.f31042b;
        hw hwVar = yyVar.C0;
        bw bwVar = yyVar.f35010k0;
        vv vvVar = yyVar.R;
        jw jwVar = yyVar.f35056y0;
        ew ewVar = yyVar.f35059z0;
        dx dxVar = yyVar.f35013l0;
        yv yvVar = yyVar.f34987d0;
        ww wwVar = yyVar.L;
        boolean z10 = true;
        if (yyVar.f35038t0 == null || yyVar.f34984c0 == null) {
            f11 = 0.0f;
        } else {
            if (i10 == 0) {
                wwVar.setVisibility(0);
                f11 = 0.0f;
                yvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                dxVar.setVisibility(f10 == 0.0f ? 8 : 0);
                ewVar.setVisibility(8);
                if (jwVar != null) {
                    jwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    wwVar.setVisibility(8);
                    yvVar.setVisibility(0);
                    dxVar.setVisibility(0);
                    ewVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (jwVar != null) {
                        jwVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    wwVar.setVisibility(8);
                    yvVar.setVisibility(8);
                    dxVar.setVisibility(8);
                    ewVar.setVisibility(0);
                    if (jwVar != null) {
                        jwVar.setVisibility(0);
                    }
                }
            }
        }
        yyVar.getMeasuredWidth();
        yyVar.getPaddingLeft();
        yyVar.getPaddingRight();
        xx xxVar = yyVar.f35025p1;
        if (xxVar != null) {
            if (i10 == 1) {
                xxVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                xxVar.s(3);
            } else {
                xxVar.s(0);
            }
        }
        yyVar.O(true);
        int currentItem = yyVar.h.getCurrentItem();
        if (currentItem == 0) {
            kyVar = vvVar;
        } else {
            kyVar = currentItem == 1 ? bwVar : hwVar;
        }
        String string = kyVar.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            if (i12 == 0) {
                kyVar2 = vvVar;
            } else {
                kyVar2 = i12 == 1 ? bwVar : hwVar;
            }
            if (kyVar2 != null) {
                wp wpVar = kyVar2.d;
                if (kyVar2 != kyVar && wpVar != null && !wpVar.getText().toString().equals(string)) {
                    wpVar.setText(string);
                    wpVar.setSelection(string.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z10 = false;
        }
        yy.b(yyVar, z10);
        yyVar.a0();
    }

    @Override
    public final void d(int i10) {
    }
}
