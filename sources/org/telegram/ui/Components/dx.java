package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class dx implements z4.e {
    public final boolean f23722a;
    public final lz f23723b;

    public dx(lz lzVar, boolean z10) {
        this.f23723b = lzVar;
        this.f23722a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        lz lzVar = this.f23723b;
        ax axVar = lzVar.h;
        boolean z11 = false;
        if (axVar != null) {
            int currentItem = axVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (lzVar.A1 != i11) {
                lzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lzVar.L(z10, true);
        if (i10 == 2 && (this.f23722a || lzVar.f26287v0)) {
            z11 = true;
        }
        lzVar.Q(z11, true);
        if (lzVar.f26282t1.z()) {
            if (i10 == 0) {
                lw lwVar = lzVar.V;
                if (lwVar != null) {
                    lwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                rw rwVar = lzVar.f26264o0;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                }
            } else {
                xw xwVar = lzVar.G0;
                if (xwVar != null) {
                    xwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        yy yyVar;
        yy yyVar2;
        int i12;
        int i13;
        int i14;
        lz lzVar = this.f23723b;
        yy yyVar3 = lzVar.G0;
        yy yyVar4 = lzVar.f26264o0;
        yy yyVar5 = lzVar.V;
        zw zwVar = lzVar.C0;
        uw uwVar = lzVar.D0;
        sx sxVar = lzVar.f26267p0;
        ow owVar = lzVar.f26244h0;
        xx xxVar = lzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (lzVar.f26295x0 == null || lzVar.f26241g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                xxVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f10 = 0.0f;
                owVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                sxVar.setVisibility(i14);
                uwVar.setVisibility(8);
                if (zwVar != null) {
                    zwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    xxVar.setVisibility(8);
                    owVar.setVisibility(0);
                    sxVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    uwVar.setVisibility(i12);
                    if (zwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        zwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    xxVar.setVisibility(8);
                    owVar.setVisibility(8);
                    sxVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    if (zwVar != null) {
                        zwVar.setVisibility(0);
                    }
                }
            }
        }
        lzVar.getMeasuredWidth();
        lzVar.getPaddingLeft();
        lzVar.getPaddingRight();
        my myVar = lzVar.f26282t1;
        if (myVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                myVar.s(i15);
            } else if (i10 == 2) {
                myVar.s(3);
            } else {
                myVar.s(0);
            }
        }
        lzVar.M(true);
        int currentItem = lzVar.h.getCurrentItem();
        if (currentItem == 0) {
            yyVar = yyVar5;
        } else if (currentItem == 1) {
            yyVar = yyVar4;
        } else {
            yyVar = yyVar3;
        }
        String obj = yyVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                yyVar2 = yyVar5;
            } else if (i19 == 1) {
                yyVar2 = yyVar4;
            } else {
                yyVar2 = yyVar3;
            }
            if (yyVar2 != null) {
                jq jqVar = yyVar2.d;
                if (yyVar2 != yyVar && jqVar != null && !jqVar.getText().toString().equals(obj)) {
                    jqVar.setText(obj);
                    jqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        lz.a(lzVar, z10);
        lzVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
