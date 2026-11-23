package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class tz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] f40190s;
    public static Drawable[] f40191w;
    public static Drawable[] f40192x;
    public static final int f40193y;
    public final RectF f40194a;
    public long f40195b;
    public boolean f40196c;
    public boolean d;
    public float f40197e;
    public int f40198f;
    public boolean h;
    public boolean f40199n;
    public final ArrayList f40200r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.bz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f40193y = i7;
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
        f40190s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f40190s;
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

    public tz(Context context) {
        super(context);
        this.f40194a = new RectF();
        this.f40197e = 1.0f;
        this.f40200r = new ArrayList(f40193y + E);
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

    public final org.telegram.ui.Components.sz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tz.a(boolean):org.telegram.ui.Components.sz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f40195b);
        this.f40195b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f40200r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sz szVar = (sz) arrayList.get(i10);
            tz tzVar = szVar.f39758l;
            byte b10 = szVar.f39749a;
            Paint[] paintArr = f40190s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(szVar.f39754g, szVar.h, org.telegram.messenger.g0.L(szVar.d), paintArr[szVar.f39750b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = tzVar.f40194a;
                    f11 = 16.0f;
                    rectF.set(szVar.f39754g - org.telegram.messenger.g0.L(szVar.d), szVar.h - org.telegram.messenger.g0.L(2.0f), szVar.f39754g + org.telegram.messenger.g0.L(szVar.d), szVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(szVar.f39755i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[szVar.f39750b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f40192x;
                        if (drawableArr != null) {
                            drawable = drawableArr[szVar.f39750b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f40191w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[szVar.f39750b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) szVar.f39754g;
                            int i12 = (int) szVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(szVar.f39755i, szVar.f39754g, szVar.h);
                            float f12 = szVar.d / 6.0f;
                            canvas.scale(f12, f12, szVar.f39754g, szVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            tz tzVar2 = szVar.f39758l;
            float f13 = i7 / f11;
            float f14 = szVar.f39754g;
            float f15 = szVar.f39756j;
            szVar.f39754g = (f15 * f13) + f14;
            szVar.h = (szVar.f39757k * f13) + szVar.h;
            if (szVar.f39752e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (szVar.f39752e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(L, f13, 0.05f, szVar.f39756j);
                    szVar.f39756j = x10;
                    if (x10 >= L) {
                        szVar.f39752e = (byte) 2;
                    }
                } else {
                    float z11 = org.telegram.ui.Cells.c0.z(L, f13, 0.05f, szVar.f39756j);
                    szVar.f39756j = z11;
                    if (z11 <= (-L)) {
                        szVar.f39752e = (byte) 1;
                    }
                }
            } else if (szVar.f39751c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    szVar.f39756j = f16;
                    if (f16 <= 0.0f) {
                        szVar.f39756j = 0.0f;
                        szVar.f39752e = szVar.f39753f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                szVar.f39756j = f17;
                if (f17 >= 0.0f) {
                    szVar.f39756j = 0.0f;
                    szVar.f39752e = szVar.f39753f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = szVar.f39757k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                szVar.f39757k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * tzVar2.f40197e) + f19;
            } else {
                szVar.f39757k = com.google.android.gms.internal.vision.e2.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && szVar.f39757k > f18) {
                tzVar2.f40198f++;
            }
            byte b11 = szVar.f39749a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + szVar.f39755i);
                szVar.f39755i = s5;
                if (s5 > 360) {
                    szVar.f39755i = (short) (s5 - 360);
                }
            }
            if (szVar.h >= tzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f40198f >= f40193y / 2 && this.f40197e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float w10 = org.telegram.messenger.m10.w(i7, 16.0f, 0.15f, this.f40197e);
            this.f40197e = w10;
            if (w10 < 0.2f) {
                this.f40197e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f40196c = false;
        org.telegram.messenger.g0.g3(new lo(this, 19));
        b();
    }

    public void b() {
    }
}
