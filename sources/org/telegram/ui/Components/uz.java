package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class uz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] f40441s;
    public static Drawable[] f40442w;
    public static Drawable[] f40443x;
    public static final int f40444y;
    public final RectF f40445a;
    public long f40446b;
    public boolean f40447c;
    public boolean d;
    public float f40448e;
    public int f40449f;
    public boolean h;
    public boolean f40450n;
    public final ArrayList f40451r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.bz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f40444y = i7;
        if (org.telegram.messenger.bz.o() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        E = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f40441s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f40441s;
            if (i11 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setColor(F[i11]);
                i11++;
            } else {
                return;
            }
        }
    }

    public uz(Context context) {
        super(context);
        this.f40445a = new RectF();
        this.f40448e = 1.0f;
        this.f40451r = new ArrayList(f40444y + E);
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

    public final org.telegram.ui.Components.tz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uz.a(boolean):org.telegram.ui.Components.tz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f40446b);
        this.f40446b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f40451r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            tz tzVar = (tz) arrayList.get(i10);
            uz uzVar = tzVar.f40148l;
            byte b10 = tzVar.f40139a;
            Paint[] paintArr = f40441s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(tzVar.f40144g, tzVar.h, org.telegram.messenger.g0.L(tzVar.d), paintArr[tzVar.f40140b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = uzVar.f40445a;
                    f11 = 16.0f;
                    rectF.set(tzVar.f40144g - org.telegram.messenger.g0.L(tzVar.d), tzVar.h - org.telegram.messenger.g0.L(2.0f), tzVar.f40144g + org.telegram.messenger.g0.L(tzVar.d), tzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(tzVar.f40145i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[tzVar.f40140b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f40443x;
                        if (drawableArr != null) {
                            drawable = drawableArr[tzVar.f40140b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f40442w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[tzVar.f40140b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) tzVar.f40144g;
                            int i12 = (int) tzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(tzVar.f40145i, tzVar.f40144g, tzVar.h);
                            float f12 = tzVar.d / 6.0f;
                            canvas.scale(f12, f12, tzVar.f40144g, tzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            uz uzVar2 = tzVar.f40148l;
            float f13 = i7 / f11;
            float f14 = tzVar.f40144g;
            float f15 = tzVar.f40146j;
            tzVar.f40144g = (f15 * f13) + f14;
            tzVar.h = (tzVar.f40147k * f13) + tzVar.h;
            if (tzVar.f40142e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (tzVar.f40142e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(L, f13, 0.05f, tzVar.f40146j);
                    tzVar.f40146j = x10;
                    if (x10 >= L) {
                        tzVar.f40142e = (byte) 2;
                    }
                } else {
                    float z11 = org.telegram.ui.Cells.c0.z(L, f13, 0.05f, tzVar.f40146j);
                    tzVar.f40146j = z11;
                    if (z11 <= (-L)) {
                        tzVar.f40142e = (byte) 1;
                    }
                }
            } else if (tzVar.f40141c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    tzVar.f40146j = f16;
                    if (f16 <= 0.0f) {
                        tzVar.f40146j = 0.0f;
                        tzVar.f40142e = tzVar.f40143f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                tzVar.f40146j = f17;
                if (f17 >= 0.0f) {
                    tzVar.f40146j = 0.0f;
                    tzVar.f40142e = tzVar.f40143f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = tzVar.f40147k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                tzVar.f40147k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * uzVar2.f40448e) + f19;
            } else {
                tzVar.f40147k = com.google.android.gms.internal.vision.e2.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && tzVar.f40147k > f18) {
                uzVar2.f40449f++;
            }
            byte b11 = tzVar.f40139a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + tzVar.f40145i);
                tzVar.f40145i = s5;
                if (s5 > 360) {
                    tzVar.f40145i = (short) (s5 - 360);
                }
            }
            if (tzVar.h >= uzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f40449f >= f40444y / 2 && this.f40448e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float w10 = org.telegram.messenger.n10.w(i7, 16.0f, 0.15f, this.f40448e);
            this.f40448e = w10;
            if (w10 < 0.2f) {
                this.f40448e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f40447c = false;
        org.telegram.messenger.g0.g3(new mo(this, 19));
        b();
    }

    public void b() {
    }
}
