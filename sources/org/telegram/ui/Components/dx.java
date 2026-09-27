package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class dx implements z4.e {
    public final boolean f23751a;
    public final mz f23752b;

    public dx(mz mzVar, boolean z10) {
        this.f23752b = mzVar;
        this.f23751a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        mz mzVar = this.f23752b;
        ax axVar = mzVar.h;
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
            if (mzVar.A1 != i11) {
                mzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        mzVar.L(z10, true);
        if (i10 == 2 && (this.f23751a || mzVar.f26632v0)) {
            z11 = true;
        }
        mzVar.Q(z11, true);
        if (mzVar.f26627t1.z()) {
            if (i10 == 0) {
                mw mwVar = mzVar.V;
                if (mwVar != null) {
                    mwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                rw rwVar = mzVar.f26609o0;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                }
            } else {
                xw xwVar = mzVar.G0;
                if (xwVar != null) {
                    xwVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        float f10;
        zy zyVar;
        zy zyVar2;
        int i12;
        int i13;
        int i14;
        mz mzVar = this.f23752b;
        zy zyVar3 = mzVar.G0;
        zy zyVar4 = mzVar.f26609o0;
        zy zyVar5 = mzVar.V;
        zw zwVar = mzVar.C0;
        uw uwVar = mzVar.D0;
        sx sxVar = mzVar.f26612p0;
        pw pwVar = mzVar.f26589h0;
        xx xxVar = mzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (mzVar.f26640x0 == null || mzVar.f26586g0 == null) {
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
                pwVar.setVisibility(i13);
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
                    pwVar.setVisibility(0);
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
                    pwVar.setVisibility(8);
                    sxVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    if (zwVar != null) {
                        zwVar.setVisibility(0);
                    }
                }
            }
        }
        mzVar.getMeasuredWidth();
        mzVar.getPaddingLeft();
        mzVar.getPaddingRight();
        ny nyVar = mzVar.f26627t1;
        if (nyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                nyVar.s(i15);
            } else if (i10 == 2) {
                nyVar.s(3);
            } else {
                nyVar.s(0);
            }
        }
        mzVar.M(true);
        int currentItem = mzVar.h.getCurrentItem();
        if (currentItem == 0) {
            zyVar = zyVar5;
        } else if (currentItem == 1) {
            zyVar = zyVar4;
        } else {
            zyVar = zyVar3;
        }
        String obj = zyVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                zyVar2 = zyVar5;
            } else if (i19 == 1) {
                zyVar2 = zyVar4;
            } else {
                zyVar2 = zyVar3;
            }
            if (zyVar2 != null) {
                kq kqVar = zyVar2.d;
                if (zyVar2 != zyVar && kqVar != null && !kqVar.getText().toString().equals(obj)) {
                    kqVar.setText(obj);
                    kqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        mz.a(mzVar, z10);
        mzVar.Y();
    }

    @Override
    public final void c(int i10) {
    }
}
