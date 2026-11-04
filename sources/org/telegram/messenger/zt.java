package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class zt extends xt {
    public final yt[] X;
    public final int Y;
    public int Z;
    public yt f26973a0;
    public yt f26974b0;
    public final org.telegram.ui.Cells.k9 f26975c0;

    public zt(cv cvVar, Rect rect, int i3, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        super(cvVar, rect, i3);
        this.Z = -1;
        this.f26975c0 = new org.telegram.ui.Cells.k9(new gi.v5(this, 25));
        this.X = new yt[pageblockbuttonrow.buttons.size()];
        int size = pageblockbuttonrow.buttons.size();
        for (int i10 = 0; i10 < size; i10++) {
            yt[] ytVarArr = this.X;
            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
            ytVarArr[i10] = new yt(cvVar, i3, cvVar.l(pageButton.text, cv.R(16, 13)), pageButton, pageButton.type, pageButton.style, dg.c.c(pageButton, TL_keyboard.TL_inlineButtonTypeDisabled.class), false, false, false, false, null, new vs(this, 5));
        }
        if (pageblockbuttonrow.align_left) {
            this.Y = 1;
        } else if (pageblockbuttonrow.align_center) {
            this.Y = 3;
        } else if (pageblockbuttonrow.align_right) {
            this.Y = 2;
        } else {
            this.Y = 4;
        }
        l0(k0());
    }

    public static yt i0(zt ztVar, float f10, float f11) {
        int c2;
        int i3;
        ztVar.m0();
        yt[] ytVarArr = ztVar.X;
        if (ytVarArr.length == 0) {
            c2 = g0.L(ztVar.f26434a.M + 18);
        } else {
            c2 = ytVarArr[0].c();
        }
        float I = (ztVar.I() - c2) / 2.0f;
        if (f11 >= I && f11 <= I + c2) {
            for (yt ytVar : ytVarArr) {
                if (f10 >= ytVar.d && f10 <= i3 + ytVar.f26636e) {
                    return ytVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void j0(zt ztVar, yt ytVar) {
        yt ytVar2 = ztVar.f26973a0;
        if (ytVar2 != ytVar) {
            if (ytVar2 != null) {
                ytVar2.m(false);
            }
            ztVar.f26973a0 = ytVar;
            if (ytVar != null) {
                ytVar.m(true);
            }
        }
    }

    @Override
    public final int I() {
        int c2;
        yt[] ytVarArr = this.X;
        if (ytVarArr.length == 0) {
            c2 = g0.L(this.f26434a.M + 18);
        } else {
            c2 = ytVarArr[0].c();
        }
        Rect rect = this.f26435b;
        return g0.L(4.333f) + rect.top + c2 + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f26435b;
        return k0() + rect.left + rect.right;
    }

    @Override
    public final boolean Q() {
        if (this.f26974b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void T() {
        yt[] ytVarArr;
        for (yt ytVar : this.X) {
            ytVar.f26633a.i(this.W);
        }
    }

    @Override
    public final void V() {
        yt[] ytVarArr;
        for (yt ytVar : this.X) {
            ytVar.f26633a.f(this.W);
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view == null) {
            return false;
        }
        return this.f26975c0.a(view, motionEvent);
    }

    public final int k0() {
        yt[] ytVarArr = this.X;
        int length = ytVarArr.length;
        if (length == 0) {
            return 0;
        }
        int L = (length - 1) * g0.L(7.0f);
        for (yt ytVar : ytVarArr) {
            L += ytVar.h();
        }
        return Math.min(this.f26436c, L);
    }

    public final void l0(int i3) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.Z = i3;
        yt[] ytVarArr = this.X;
        int length = ytVarArr.length;
        if (length != 0) {
            int L = g0.L(7.0f);
            int i17 = 1;
            int i18 = (length - 1) * L;
            int max = Math.max(0, i3 - i18);
            int i19 = 0;
            for (yt ytVar : ytVarArr) {
                int h = ytVar.h();
                ytVar.f26636e = h;
                i19 += h;
            }
            int i20 = this.Y;
            if (i19 > max) {
                int i21 = 0;
                for (yt ytVar2 : ytVarArr) {
                    i21 += ytVar2.f26636e - ytVar2.e();
                }
                if (i21 <= 0) {
                    for (yt ytVar3 : ytVarArr) {
                        ytVar3.f26636e = ytVar3.e();
                    }
                } else {
                    int min = Math.min(i19 - max, i21);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < ytVarArr.length) {
                        yt ytVar4 = ytVarArr[i22];
                        int e10 = ytVar4.f26636e - ytVar4.e();
                        if (i22 == ytVarArr.length - i17) {
                            i16 = min - i23;
                            i14 = i17;
                            i15 = min;
                        } else {
                            i14 = i17;
                            i15 = min;
                            i16 = (int) ((min * e10) / i21);
                        }
                        int min2 = Math.min(i16, e10);
                        ytVar4.f26636e -= min2;
                        i23 += min2;
                        i22++;
                        i17 = i14;
                        min = i15;
                    }
                }
                i10 = i17;
            } else {
                i10 = 1;
                if (i20 == 4) {
                    boolean[] zArr = new boolean[ytVarArr.length];
                    int length2 = ytVarArr.length;
                    for (boolean z11 = true; z11 && length2 > 0; z11 = z10) {
                        int i24 = max / length2;
                        z10 = false;
                        for (int i25 = 0; i25 < ytVarArr.length; i25++) {
                            if (!zArr[i25] && (i12 = ytVarArr[i25].f26636e) > i24) {
                                zArr[i25] = true;
                                max -= i12;
                                length2--;
                                z10 = true;
                            }
                        }
                    }
                    if (length2 > 0) {
                        int i26 = max / length2;
                        int i27 = max - (length2 * i26);
                        for (int i28 = 0; i28 < ytVarArr.length; i28++) {
                            if (!zArr[i28]) {
                                yt ytVar5 = ytVarArr[i28];
                                int i29 = i27 - 1;
                                if (i27 > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                ytVar5.f26636e = i11 + i26;
                                i27 = i29;
                            }
                        }
                    }
                }
            }
            for (yt ytVar6 : ytVarArr) {
                i18 += ytVar6.f26636e;
            }
            int c2 = o1.g.c(i20);
            if (c2 != i10) {
                if (c2 != 2) {
                    i13 = 0;
                } else {
                    i13 = (i3 - i18) / 2;
                }
            } else {
                i13 = i3 - i18;
            }
            for (yt ytVar7 : ytVarArr) {
                ytVar7.d = i13;
                i13 += ytVar7.f26636e + L;
            }
        }
    }

    public final void m0() {
        cv cvVar = this.f26434a;
        int i3 = cvVar.C;
        int i10 = cvVar.S;
        Rect rect = this.f26435b;
        int max = Math.max(0, ((((i3 + i10) + cvVar.T) - (i10 * 2)) - rect.left) - rect.right);
        if (this.Z != max) {
            l0(max);
        }
    }

    @Override
    public final void q(Canvas canvas) {
        yt[] ytVarArr;
        m0();
        for (yt ytVar : this.X) {
            canvas.save();
            canvas.translate(ytVar.d, Math.round((I() - ytVar.c()) / 2.0f));
            ytVar.a(canvas);
            canvas.restore();
        }
    }
}
