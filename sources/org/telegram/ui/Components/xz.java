package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class xz extends View {
    public static final int D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f32665s;
    public static Drawable[] f32666w;
    public static Drawable[] f32667x;
    public static final int f32668y;
    public final RectF f32669a;
    public long f32670b;
    public boolean f32671c;
    public boolean d;
    public float e;
    public int f32672f;
    public boolean h;
    public boolean f32673n;
    public final ArrayList f32674r;

    static {
        int i10;
        int i11;
        if (org.telegram.messenger.uz.o() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f32668y = i10;
        if (org.telegram.messenger.uz.o() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        D = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f32665s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f32665s;
            if (i12 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i12] = paint;
                paint.setColor(E[i12]);
                i12++;
            } else {
                return;
            }
        }
    }

    public xz(Context context) {
        super(context);
        this.f32669a = new RectF();
        this.e = 1.0f;
        this.f32674r = new ArrayList(f32668y + D);
    }

    private int getHeightForAnimation() {
        if (getMeasuredHeight() == 0) {
            return ((View) getParent()).getHeight();
        }
        return getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        if (getMeasuredWidth() == 0) {
            return ((View) getParent()).getWidth();
        }
        return getMeasuredWidth();
    }

    public final org.telegram.ui.Components.wz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xz.a(boolean):org.telegram.ui.Components.wz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.f32670b);
        this.f32670b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f32674r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            wz wzVar = (wz) arrayList.get(i11);
            xz xzVar = wzVar.f32347l;
            byte b10 = wzVar.f32339a;
            Paint[] paintArr = f32665s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(wzVar.f32343g, wzVar.h, org.telegram.messenger.i0.L(wzVar.d), paintArr[wzVar.f32340b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = xzVar.f32669a;
                    f10 = 16.0f;
                    rectF.set(wzVar.f32343g - org.telegram.messenger.i0.L(wzVar.d), wzVar.h - org.telegram.messenger.i0.L(2.0f), wzVar.f32343g + org.telegram.messenger.i0.L(wzVar.d), wzVar.h + org.telegram.messenger.i0.L(2.0f));
                    canvas.save();
                    canvas.rotate(wzVar.f32344i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paintArr[wzVar.f32340b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f32667x;
                        if (drawableArr != null) {
                            drawable = drawableArr[wzVar.f32340b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f32666w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[wzVar.f32340b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) wzVar.f32343g;
                            int i13 = (int) wzVar.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(wzVar.f32344i, wzVar.f32343g, wzVar.h);
                            float f11 = wzVar.d / 6.0f;
                            canvas.scale(f11, f11, wzVar.f32343g, wzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            xz xzVar2 = wzVar.f32347l;
            float f12 = i10 / f10;
            float f13 = wzVar.f32343g;
            float f14 = wzVar.f32345j;
            wzVar.f32343g = (f14 * f12) + f13;
            wzVar.h = (wzVar.f32346k * f12) + wzVar.h;
            if (wzVar.e != 0) {
                float L = org.telegram.messenger.i0.L(1.0f) * 0.5f;
                if (wzVar.e == 1) {
                    float u10 = c3.i0.u(L, f12, 0.05f, wzVar.f32345j);
                    wzVar.f32345j = u10;
                    if (u10 >= L) {
                        wzVar.e = (byte) 2;
                    }
                } else {
                    float x10 = org.telegram.ui.Cells.f1.x(L, f12, 0.05f, wzVar.f32345j);
                    wzVar.f32345j = x10;
                    if (x10 <= (-L)) {
                        wzVar.e = (byte) 1;
                    }
                }
            } else if (wzVar.f32341c == 0) {
                if (f14 > 0.0f) {
                    float f15 = f14 - (0.05f * f12);
                    wzVar.f32345j = f15;
                    if (f15 <= 0.0f) {
                        wzVar.f32345j = 0.0f;
                        wzVar.e = wzVar.f32342f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f16 = (0.05f * f12) + f14;
                wzVar.f32345j = f16;
                if (f16 >= 0.0f) {
                    wzVar.f32345j = 0.0f;
                    wzVar.e = wzVar.f32342f;
                }
            }
            float f17 = (-org.telegram.messenger.i0.L(1.0f)) / f7;
            float f18 = wzVar.f32346k;
            if (f18 < f17) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f18 > f17) {
                wzVar.f32346k = ((org.telegram.messenger.i0.L(1.0f) / 3.0f) * f12 * xzVar2.e) + f18;
            } else {
                wzVar.f32346k = a1.g.c(org.telegram.messenger.i0.L(1.0f), 3.0f, f12, f18);
            }
            if (z10 && wzVar.f32346k > f17) {
                xzVar2.f32672f++;
            }
            byte b11 = wzVar.f32339a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + wzVar.f32344i);
                wzVar.f32344i = s10;
                if (s10 > 360) {
                    wzVar.f32344i = (short) (s10 - 360);
                }
            }
            if (wzVar.h >= xzVar2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f32672f >= f32668y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < D; i14++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.a30.v(i10, 16.0f, 0.15f, this.e);
            this.e = v;
            if (v < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f32671c = false;
        org.telegram.messenger.i0.g3(new ho(this, 19));
        b();
    }

    public void b() {
    }
}
