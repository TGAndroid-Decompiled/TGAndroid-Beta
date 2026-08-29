package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
public final class uw implements m2.e {
    public final boolean f33326a;
    public final fz f33327b;

    public uw(fz fzVar, boolean z10) {
        this.f33327b = fzVar;
        this.f33326a = z10;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        int i11;
        fz fzVar = this.f33327b;
        rw rwVar = fzVar.h;
        boolean z11 = false;
        if (rwVar != null) {
            int currentItem = rwVar.getCurrentItem();
            if (currentItem == 2) {
                i11 = 1;
            } else if (currentItem == 1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (fzVar.f28647w1 != i11) {
                fzVar.f28647w1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fzVar.M(z10, true);
        if (i10 == 2 && (this.f33326a || fzVar.f28629r0)) {
            z11 = true;
        }
        fzVar.S(z11, true);
        if (fzVar.f28623p1.z()) {
            if (i10 == 0) {
                cw cwVar = fzVar.R;
                if (cwVar != null) {
                    cwVar.d.requestFocus();
                }
            } else if (i10 == 1) {
                iw iwVar = fzVar.f28608k0;
                if (iwVar != null) {
                    iwVar.d.requestFocus();
                }
            } else {
                ow owVar = fzVar.C0;
                if (owVar != null) {
                    owVar.d.requestFocus();
                }
            }
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        float f10;
        ry ryVar;
        ry ryVar2;
        int i12;
        int i13;
        int i14;
        fz fzVar = this.f33327b;
        ry ryVar3 = fzVar.C0;
        ry ryVar4 = fzVar.f28608k0;
        ry ryVar5 = fzVar.R;
        qw qwVar = fzVar.f28654y0;
        lw lwVar = fzVar.f28657z0;
        kx kxVar = fzVar.f28611l0;
        fw fwVar = fzVar.f28585d0;
        dx dxVar = fzVar.L;
        int i15 = 2;
        boolean z10 = true;
        if (fzVar.f28636t0 == null || fzVar.f28582c0 == null) {
            f10 = 0.0f;
        } else {
            int i16 = 8;
            if (i10 == 0) {
                dxVar.setVisibility(0);
                int i17 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                if (i17 == 0) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                f10 = 0.0f;
                fwVar.setVisibility(i13);
                if (i17 == 0) {
                    i14 = 8;
                } else {
                    i14 = 0;
                }
                kxVar.setVisibility(i14);
                lwVar.setVisibility(8);
                if (qwVar != null) {
                    qwVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(0);
                    kxVar.setVisibility(0);
                    int i18 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                    if (i18 == 0) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    lwVar.setVisibility(i12);
                    if (qwVar != null) {
                        if (i18 != 0) {
                            i16 = 0;
                        }
                        qwVar.setVisibility(i16);
                    }
                } else if (i10 == 2) {
                    dxVar.setVisibility(8);
                    fwVar.setVisibility(8);
                    kxVar.setVisibility(8);
                    lwVar.setVisibility(0);
                    if (qwVar != null) {
                        qwVar.setVisibility(0);
                    }
                }
            }
        }
        fzVar.getMeasuredWidth();
        fzVar.getPaddingLeft();
        fzVar.getPaddingRight();
        fy fyVar = fzVar.f28623p1;
        if (fyVar != null) {
            if (i10 == 1) {
                if (i11 == 0) {
                    i15 = 0;
                }
                fyVar.s(i15);
            } else if (i10 == 2) {
                fyVar.s(3);
            } else {
                fyVar.s(0);
            }
        }
        fzVar.O(true);
        int currentItem = fzVar.h.getCurrentItem();
        if (currentItem == 0) {
            ryVar = ryVar5;
        } else if (currentItem == 1) {
            ryVar = ryVar4;
        } else {
            ryVar = ryVar3;
        }
        String obj = ryVar.d.getText().toString();
        for (int i19 = 0; i19 < 3; i19++) {
            if (i19 == 0) {
                ryVar2 = ryVar5;
            } else if (i19 == 1) {
                ryVar2 = ryVar4;
            } else {
                ryVar2 = ryVar3;
            }
            if (ryVar2 != null) {
                cq cqVar = ryVar2.d;
                if (ryVar2 != ryVar && cqVar != null && !cqVar.getText().toString().equals(obj)) {
                    cqVar.setText(obj);
                    cqVar.setSelection(obj.length());
                }
            }
        }
        if ((i10 != 0 || f9 <= f10) && i10 != 1) {
            z10 = false;
        }
        fz.a(fzVar, z10);
        fzVar.a0();
    }

    @Override
    public final void c(int i10) {
    }
}
