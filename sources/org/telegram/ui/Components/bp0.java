package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class bp0 extends Drawable {
    public long f33901a = 0;
    public final float[] f33902b = {0.0f, -0.5f};
    public final Drawable f33903c;
    public final Drawable d;
    public final Drawable f33904e;
    public final int f33905f;

    public bp0(Context context, int i7) {
        this.f33905f = i7;
        if (i7 == 4) {
            this.f33903c = i5.c.g(context, 2131231106);
            this.d = i5.c.g(context, 2131232736);
            this.f33904e = i5.c.g(context, 2131232737);
        } else if (i7 == 5) {
            this.f33903c = i5.c.g(context, 2131231173);
            this.d = i5.c.g(context, 2131232736);
            this.f33904e = i5.c.g(context, 2131232737);
        } else if (i7 == 1) {
            this.f33903c = i5.c.g(context, 2131232735);
            this.d = i5.c.g(context, 2131232736);
            this.f33904e = i5.c.g(context, 2131232737);
        } else {
            this.f33903c = i5.c.g(context, 2131230868);
            this.d = i5.c.g(context, 2131230869);
            this.f33904e = i5.c.g(context, 2131230870);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        float[] fArr;
        int L2;
        int L3;
        int L4;
        int i7;
        int i10;
        float y10;
        Drawable drawable = this.f33903c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i11 = 3;
        int i12 = 5;
        int i13 = 1;
        int i14 = this.f33905f;
        int i15 = 4;
        if (i14 != 4 && i14 != 5) {
            if (i14 == 3) {
                L = org.telegram.messenger.g0.L(44.0f);
            } else if (i14 == 2) {
                L = org.telegram.messenger.g0.L(32.0f);
            } else if (i14 == 1) {
                L = org.telegram.messenger.g0.L(30.0f);
            } else {
                L = org.telegram.messenger.g0.L(120.0f);
            }
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - L) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L) / 2) + getBounds().left;
        int i16 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i16, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i17 = 0;
        while (true) {
            fArr = this.f33902b;
            if (i17 >= 2) {
                break;
            }
            float f10 = fArr[i17];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i14 != i15 && i14 != i12) {
                    if (i14 == i11) {
                        i10 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L5 = org.telegram.messenger.g0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L5;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                        i7 = org.telegram.ui.Cells.c0.i(2.0f, i16, L5);
                    } else if (i14 == 2) {
                        i10 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L6 = org.telegram.messenger.g0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L6;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i7 = org.telegram.ui.Cells.c0.i(2.0f, i16, L6);
                    } else if (i14 == i13) {
                        int L7 = org.telegram.messenger.g0.L(2.5f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 6.5f);
                        int L8 = org.telegram.messenger.g0.L(fArr[i17] * 6.0f);
                        L3 = (org.telegram.messenger.g0.L(7.0f) + intrinsicWidth2) - L8;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i10 = L7;
                        i7 = org.telegram.ui.Cells.c0.i(7.0f, i16, L8);
                    } else {
                        i10 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L9 = org.telegram.messenger.g0.L(fArr[i17] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(42.0f) + intrinsicWidth2) - L9;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                        i7 = org.telegram.ui.Cells.c0.i(42.0f, i16, L9);
                    }
                } else {
                    int L10 = org.telegram.messenger.g0.L(2.5f * f11);
                    L2 = org.telegram.messenger.g0.L(f11 * 6.5f);
                    int L11 = org.telegram.messenger.g0.L(fArr[i17] * 6.0f);
                    L3 = (org.telegram.messenger.g0.L(3.0f) + intrinsicWidth2) - L11;
                    L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(2.0f);
                    i7 = org.telegram.ui.Cells.c0.i(3.0f, i16, L11);
                    i10 = L10;
                }
                float f12 = fArr[i17];
                if (f12 < 0.5f) {
                    y10 = f12 / 0.5f;
                } else {
                    y10 = org.telegram.messenger.f3.y(f12, 0.5f, 0.5f, 1.0f);
                }
                int i18 = (int) (y10 * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i18);
                int i19 = L4 - L2;
                int i20 = L4 + L2;
                drawable2.setBounds(L3 - i10, i19, L3 + i10, i20);
                drawable2.draw(canvas);
                Drawable drawable3 = this.f33904e;
                drawable3.setAlpha(i18);
                drawable3.setBounds(i7 - i10, i19, i7 + i10, i20);
                drawable3.draw(canvas);
            }
            i17++;
            i11 = 3;
            i12 = 5;
            i13 = 1;
            i15 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f33901a;
        this.f33901a = currentTimeMillis;
        if (j3 > 16) {
            j3 = 16;
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (fArr[i21] >= 1.0f) {
                fArr[i21] = 0.0f;
            }
            float f13 = (((float) j3) / 1300.0f) + fArr[i21];
            fArr[i21] = f13;
            if (f13 > 1.0f) {
                fArr[i21] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f33905f;
        if (i7 != 4 && i7 != 5) {
            if (i7 == 3) {
                return org.telegram.messenger.g0.L(100.0f);
            }
            if (i7 == 2) {
                return org.telegram.messenger.g0.L(74.0f);
            }
            if (i7 == 1) {
                return org.telegram.messenger.g0.L(40.0f);
            }
            return org.telegram.messenger.g0.L(180.0f);
        }
        return org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i7 = this.f33905f;
        if (i7 != 4 && i7 != 5) {
            if (i7 == 3) {
                return org.telegram.messenger.g0.L(100.0f);
            }
            if (i7 == 2) {
                return org.telegram.messenger.g0.L(74.0f);
            }
            if (i7 == 1) {
                return org.telegram.messenger.g0.L(40.0f);
            }
            return org.telegram.messenger.g0.L(120.0f);
        }
        return org.telegram.messenger.g0.L(42.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33903c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f33904e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
