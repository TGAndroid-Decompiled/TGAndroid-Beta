package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class nx implements z4.e {
    public final boolean f27734a;
    public final wz f27735b;

    public nx(wz wzVar, boolean z10) {
        this.f27735b = wzVar;
        this.f27734a = z10;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        float f10;
        iz izVar;
        iz izVar2;
        int i12;
        int i13;
        int i14;
        wz wzVar = this.f27735b;
        iz izVar3 = wzVar.G0;
        iz izVar4 = wzVar.f31049o0;
        iz izVar5 = wzVar.V;
        jx jxVar = wzVar.C0;
        ex exVar = wzVar.D0;
        dy dyVar = wzVar.f31052p0;
        yw ywVar = wzVar.f31029h0;
        iy iyVar = wzVar.P;
        int i15 = 2;
        boolean z10 = true;
        if (wzVar.f31080x0 == null || wzVar.f31026g0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                iyVar.setVisibility(0);
                int i17 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                f10 = 0.0f;
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                ywVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                dyVar.setVisibility(i14);
                exVar.setVisibility(8);
                if (jxVar != null) {
                    jxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    iyVar.setVisibility(8);
                    ywVar.setVisibility(0);
                    dyVar.setVisibility(0);
                    int i18 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    exVar.setVisibility(i12);
                    if (jxVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        jxVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    iyVar.setVisibility(8);
                    ywVar.setVisibility(8);
                    dyVar.setVisibility(8);
                    exVar.setVisibility(0);
                    if (jxVar != null) {
                        jxVar.setVisibility(0);
                    }
                }
            }
        }
        wzVar.getMeasuredWidth();
        wzVar.getPaddingLeft();
        wzVar.getPaddingRight();
        wy wyVar = wzVar.f31067t1;
        if (wyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                wyVar.s(i15);
            } else if (i10 == 2) {
                wyVar.s(3);
            } else {
                wyVar.s(0);
            }
        }
        wzVar.M(true);
        int currentItem = wzVar.h.getCurrentItem();
        if (currentItem == 0) {
            izVar = izVar5;
        } else if (currentItem == 1) {
            izVar = izVar4;
        } else {
            izVar = izVar3;
        }
        String obj = izVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                izVar2 = izVar5;
            } else if (i19 == 1) {
                izVar2 = izVar4;
            } else {
                izVar2 = izVar3;
            }
            if (izVar2 != null) {
                vq vqVar = izVar2.d;
                if (izVar2 != izVar && vqVar != null && !vqVar.getText().toString().equals(obj)) {
                    vqVar.setText(obj);
                    vqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        wz.c(wzVar, z10);
        wzVar.Y();
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        wz wzVar = this.f27735b;
        kx kxVar = wzVar.h;
        boolean z11 = false;
        if (kxVar != null) {
            int currentItem = kxVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (wzVar.A1 != i11) {
                wzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wzVar.L(z10, true);
        if (i10 == 2 && (this.f27734a || wzVar.f31072v0)) {
            z11 = true;
        }
        wzVar.Q(z11, true);
        if (wzVar.f31067t1.z()) {
            if (i10 == 0) {
                vw vwVar = wzVar.V;
                if (vwVar != null) {
                    vwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                bx bxVar = wzVar.f31049o0;
                if (bxVar != null) {
                    bxVar.d.requestFocus();
                }
            } else {
                hx hxVar = wzVar.G0;
                if (hxVar != null) {
                    hxVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
    }
}
