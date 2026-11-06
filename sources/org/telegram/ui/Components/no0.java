package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class no0 extends Drawable {
    public long f36388a = 0;
    public final float[] f36389b = {0.0f, -0.5f};
    public final Drawable f36390c;
    public final Drawable d;
    public final Drawable f36391e;
    public final int f36392f;

    public no0(Context context, int i7) {
        this.f36392f = i7;
        if (i7 == 4) {
            this.f36390c = jg.g.h(context, 2131231106);
            this.d = jg.g.h(context, 2131232734);
            this.f36391e = jg.g.h(context, 2131232735);
        } else if (i7 == 5) {
            this.f36390c = jg.g.h(context, 2131231173);
            this.d = jg.g.h(context, 2131232734);
            this.f36391e = jg.g.h(context, 2131232735);
        } else if (i7 == 1) {
            this.f36390c = jg.g.h(context, 2131232733);
            this.d = jg.g.h(context, 2131232734);
            this.f36391e = jg.g.h(context, 2131232735);
        } else {
            this.f36390c = jg.g.h(context, 2131230868);
            this.d = jg.g.h(context, 2131230869);
            this.f36391e = jg.g.h(context, 2131230870);
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
        int i7;
        float y10;
        Drawable drawable = this.f36390c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 3;
        int i11 = 5;
        int i12 = 1;
        int i13 = this.f36392f;
        int i14 = 4;
        if (i13 != 4 && i13 != 5) {
            if (i13 == 3) {
                L = org.telegram.messenger.g0.L(44.0f);
            } else if (i13 == 2) {
                L = org.telegram.messenger.g0.L(32.0f);
            } else if (i13 == 1) {
                L = org.telegram.messenger.g0.L(30.0f);
            } else {
                L = org.telegram.messenger.g0.L(120.0f);
            }
        } else {
            L = org.telegram.messenger.g0.L(24.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - L) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - L) / 2) + getBounds().left;
        int i15 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i15, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i16 = 0;
        while (true) {
            fArr = this.f36389b;
            if (i16 >= 2) {
                break;
            }
            float f10 = fArr[i16];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i13 != i14 && i13 != i11) {
                    if (i13 == i10) {
                        i7 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L5 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L5;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                        D = org.telegram.messenger.camera.q.D(2.0f, i15, L5);
                    } else if (i13 == 2) {
                        i7 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L6 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(2.0f) + intrinsicWidth2) - L6;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        D = org.telegram.messenger.camera.q.D(2.0f, i15, L6);
                    } else if (i13 == i12) {
                        int L7 = org.telegram.messenger.g0.L(2.5f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 6.5f);
                        int L8 = org.telegram.messenger.g0.L(fArr[i16] * 6.0f);
                        L3 = (org.telegram.messenger.g0.L(7.0f) + intrinsicWidth2) - L8;
                        L4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i7 = L7;
                        D = org.telegram.messenger.camera.q.D(7.0f, i15, L8);
                    } else {
                        i7 = org.telegram.messenger.g0.L(5.0f * f11);
                        L2 = org.telegram.messenger.g0.L(f11 * 18.0f);
                        int L9 = org.telegram.messenger.g0.L(fArr[i16] * 15.0f);
                        L3 = (org.telegram.messenger.g0.L(42.0f) + intrinsicWidth2) - L9;
                        L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(7.0f);
                        D = org.telegram.messenger.camera.q.D(42.0f, i15, L9);
                    }
                } else {
                    int L10 = org.telegram.messenger.g0.L(2.5f * f11);
                    L2 = org.telegram.messenger.g0.L(f11 * 6.5f);
                    int L11 = org.telegram.messenger.g0.L(fArr[i16] * 6.0f);
                    L3 = (org.telegram.messenger.g0.L(3.0f) + intrinsicWidth2) - L11;
                    L4 = ((intrinsicHeight / 2) + intrinsicHeight2) - org.telegram.messenger.g0.L(2.0f);
                    D = org.telegram.messenger.camera.q.D(3.0f, i15, L11);
                    i7 = L10;
                }
                float f12 = fArr[i16];
                if (f12 < 0.5f) {
                    y10 = f12 / 0.5f;
                } else {
                    y10 = org.telegram.messenger.k5.y(f12, 0.5f, 0.5f, 1.0f);
                }
                int i17 = (int) (y10 * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i17);
                int i18 = L4 - L2;
                int i19 = L4 + L2;
                drawable2.setBounds(L3 - i7, i18, L3 + i7, i19);
                drawable2.draw(canvas);
                Drawable drawable3 = this.f36391e;
                drawable3.setAlpha(i17);
                drawable3.setBounds(D - i7, i18, D + i7, i19);
                drawable3.draw(canvas);
            }
            i16++;
            i10 = 3;
            i11 = 5;
            i12 = 1;
            i14 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f36388a;
        this.f36388a = currentTimeMillis;
        if (j3 > 16) {
            j3 = 16;
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (fArr[i20] >= 1.0f) {
                fArr[i20] = 0.0f;
            }
            float f13 = (((float) j3) / 1300.0f) + fArr[i20];
            fArr[i20] = f13;
            if (f13 > 1.0f) {
                fArr[i20] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i7 = this.f36392f;
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
        int i7 = this.f36392f;
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
        this.f36390c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f36391e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
