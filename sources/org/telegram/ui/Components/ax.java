package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class ax implements m2.f {
    public final boolean f25388a;
    public final mz f25389b;

    public ax(mz mzVar, boolean z4) {
        this.f25389b = mzVar;
        this.f25388a = z4;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        int i11;
        mz mzVar = this.f25389b;
        xw xwVar = mzVar.h;
        boolean z10 = false;
        if (xwVar != null) {
            int currentItem = xwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (mzVar.f29342x1 != i11) {
                mzVar.f29342x1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        mzVar.N(z4, true);
        if (i10 == 2 && (this.f25388a || mzVar.f29324s0)) {
            z10 = true;
        }
        mzVar.S(z10, true);
        if (mzVar.f29317q1.z()) {
            if (i10 == 0) {
                iw iwVar = mzVar.S;
                if (iwVar != null) {
                    iwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                ow owVar = mzVar.f29302l0;
                if (owVar != null) {
                    owVar.d.requestFocus();
                }
            } else {
                uw uwVar = mzVar.D0;
                if (uwVar != null) {
                    uwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        float f11;
        yy yyVar;
        yy yyVar2;
        int i12;
        int i13;
        int i14;
        mz mzVar = this.f25389b;
        yy yyVar3 = mzVar.D0;
        yy yyVar4 = mzVar.f29302l0;
        yy yyVar5 = mzVar.S;
        ww wwVar = mzVar.f29348z0;
        rw rwVar = mzVar.A0;
        rx rxVar = mzVar.m0;
        lw lwVar = mzVar.f29280e0;
        kx kxVar = mzVar.M;
        int i15 = 2;
        boolean z4 = true;
        if (mzVar.f29330u0 == null || mzVar.f29276d0 == null) {
            f11 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                kxVar.setVisibility(0);
                int i17 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f11 = 0.0f;
                lwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                rxVar.setVisibility(i14);
                rwVar.setVisibility(8);
                if (wwVar != null) {
                    wwVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i10 == 1) {
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(0);
                    rxVar.setVisibility(0);
                    int i18 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    rwVar.setVisibility(i12);
                    if (wwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        wwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(8);
                    rxVar.setVisibility(8);
                    rwVar.setVisibility(0);
                    if (wwVar != null) {
                        wwVar.setVisibility(0);
                    }
                }
            }
        }
        mzVar.getMeasuredWidth();
        mzVar.getPaddingLeft();
        mzVar.getPaddingRight();
        my myVar = mzVar.f29317q1;
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
        mzVar.O(true);
        int currentItem = mzVar.h.getCurrentItem();
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
                iq iqVar = yyVar2.d;
                if (yyVar2 != yyVar && iqVar != null && !iqVar.getText().toString().equals(obj)) {
                    iqVar.setText(obj);
                    iqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f10 <= f11) && i10 != 1) {
            z4 = false;
        }
        mz.a(mzVar, z4);
        mzVar.a0();
    }

    @Override
    public final void c(int i10) {
    }
}
