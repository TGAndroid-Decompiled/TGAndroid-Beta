package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class qp0 extends Drawable {
    public long f29768a = 0;
    public final float[] f29769b = {0.0f, -0.5f};
    public final Drawable f29770c;
    public final Drawable d;
    public final Drawable e;
    public final int f29771f;

    public qp0(Context context, int i10) {
        this.f29771f = i10;
        if (i10 == 4) {
            this.f29770c = i0.a.f(context, 2131231106);
            this.d = i0.a.f(context, 2131232731);
            this.e = i0.a.f(context, 2131232732);
        } else if (i10 == 5) {
            this.f29770c = i0.a.f(context, 2131231173);
            this.d = i0.a.f(context, 2131232731);
            this.e = i0.a.f(context, 2131232732);
        } else if (i10 == 1) {
            this.f29770c = i0.a.f(context, 2131232730);
            this.d = i0.a.f(context, 2131232731);
            this.e = i0.a.f(context, 2131232732);
        } else {
            this.f29770c = i0.a.f(context, 2131230868);
            this.d = i0.a.f(context, 2131230869);
            this.e = i0.a.f(context, 2131230870);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        float[] fArr;
        int L2;
        int L3;
        int L4;
        int D;
        int i10;
        float y3;
        Drawable drawable = this.f29770c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i11 = 3;
        int i12 = 5;
        int i13 = 1;
        int i14 = this.f29771f;
        int i15 = 4;
        if (i14 != 4 && i14 != 5) {
            if (i14 == 3) {
                L = org.telegram.messenger.i0.L(44.0f);
            } else if (i14 == 2) {
                L = org.telegram.messenger.i0.L(32.0f);
            } else if (i14 == 1) {
                L = org.telegram.messenger.i0.L(30.0f);
            } else {
                L = org.telegram.messenger.i0.L(120.0f);
            }
        } else {
            L = org.telegram.messenger.i0.L(24.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - L) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L) / 2) + getBounds().left;
        int i16 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i16, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i17 = 0;
        while (true) {
            fArr = this.f29769b;
            if (i17 >= 2) {
                break;
            }
            float f7 = fArr[i17];
            if (f7 >= 0.0f) {
                float f10 = (f7 * 0.5f) + 0.5f;
                if (i14 != i15 && i14 != i12) {
                    if (i14 == i11) {
                        i10 = org.telegram.messenger.i0.L(5.0f * f10);
                        L2 = org.telegram.messenger.i0.L(f10 * 18.0f);
                        int L5 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.i0.L(2.0f) + intrinsicWidth2) - L5;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(7.0f);
                        D = org.telegram.messenger.a30.D(2.0f, i16, L5);
                    } else if (i14 == 2) {
                        i10 = org.telegram.messenger.i0.L(5.0f * f10);
                        L2 = org.telegram.messenger.i0.L(f10 * 18.0f);
                        int L6 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.i0.L(2.0f) + intrinsicWidth2) - L6;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        D = org.telegram.messenger.a30.D(2.0f, i16, L6);
                    } else if (i14 == i13) {
                        int L7 = org.telegram.messenger.i0.L(2.5f * f10);
                        L2 = org.telegram.messenger.i0.L(f10 * 6.5f);
                        int L8 = org.telegram.messenger.i0.L(fArr[i17] * 6.0f);
                        L3 = (org.telegram.messenger.i0.L(7.0f) + intrinsicWidth2) - L8;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i10 = L7;
                        D = org.telegram.messenger.a30.D(7.0f, i16, L8);
                    } else {
                        i10 = org.telegram.messenger.i0.L(5.0f * f10);
                        L2 = org.telegram.messenger.i0.L(f10 * 18.0f);
                        int L9 = org.telegram.messenger.i0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.i0.L(42.0f) + intrinsicWidth2) - L9;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(7.0f);
                        D = org.telegram.messenger.a30.D(42.0f, i16, L9);
                    }
                } else {
                    int L10 = org.telegram.messenger.i0.L(2.5f * f10);
                    L2 = org.telegram.messenger.i0.L(f10 * 6.5f);
                    int L11 = org.telegram.messenger.i0.L(fArr[i17] * 6.0f);
                    L3 = (org.telegram.messenger.i0.L(3.0f) + intrinsicWidth2) - L11;
                    L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.i0.L(2.0f);
                    D = org.telegram.messenger.a30.D(3.0f, i16, L11);
                    i10 = L10;
                }
                float f11 = fArr[i17];
                if (f11 < 0.5f) {
                    y3 = f11 / 0.5f;
                } else {
                    y3 = org.telegram.messenger.m5.y(f11, 0.5f, 0.5f, 1.0f);
                }
                int i18 = (int) (y3 * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i18);
                int i19 = L4 - L2;
                int i20 = L4 + L2;
                drawable2.setBounds(L3 - i10, i19, L3 + i10, i20);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(i18);
                drawable3.setBounds(D - i10, i19, D + i10, i20);
                drawable3.draw(canvas);
            }
            i17++;
            i11 = 3;
            i12 = 5;
            i13 = 1;
            i15 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f29768a;
        this.f29768a = currentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (fArr[i21] >= 1.0f) {
                fArr[i21] = 0.0f;
            }
            float f12 = (((float) j10) / 1300.0f) + fArr[i21];
            fArr[i21] = f12;
            if (f12 > 1.0f) {
                fArr[i21] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f29771f;
        if (i10 != 4 && i10 != 5) {
            if (i10 == 3) {
                return org.telegram.messenger.i0.L(100.0f);
            }
            if (i10 == 2) {
                return org.telegram.messenger.i0.L(74.0f);
            }
            if (i10 == 1) {
                return org.telegram.messenger.i0.L(40.0f);
            }
            return org.telegram.messenger.i0.L(180.0f);
        }
        return org.telegram.messenger.i0.L(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.f29771f;
        if (i10 != 4 && i10 != 5) {
            if (i10 == 3) {
                return org.telegram.messenger.i0.L(100.0f);
            }
            if (i10 == 2) {
                return org.telegram.messenger.i0.L(74.0f);
            }
            if (i10 == 1) {
                return org.telegram.messenger.i0.L(40.0f);
            }
            return org.telegram.messenger.i0.L(120.0f);
        }
        return org.telegram.messenger.i0.L(42.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29770c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
