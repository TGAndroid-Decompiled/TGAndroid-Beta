package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class nz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] f37757s;
    public static Drawable[] f37758w;
    public static Drawable[] f37759x;
    public static final int f37760y;
    public final RectF f37761a;
    public long f37762b;
    public boolean f37763c;
    public boolean d;
    public float f37764e;
    public int f37765f;
    public boolean h;
    public boolean f37766n;
    public final ArrayList f37767r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.gz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f37760y = i7;
        if (org.telegram.messenger.gz.o() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        E = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f37757s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f37757s;
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

    public nz(Context context) {
        super(context);
        this.f37761a = new RectF();
        this.f37764e = 1.0f;
        this.f37767r = new ArrayList(f37760y + E);
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

    public final org.telegram.ui.Components.mz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz.a(boolean):org.telegram.ui.Components.mz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f37762b);
        this.f37762b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f37767r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            mz mzVar = (mz) arrayList.get(i10);
            nz nzVar = mzVar.f37415l;
            byte b10 = mzVar.f37406a;
            Paint[] paintArr = f37757s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(mzVar.f37411g, mzVar.h, org.telegram.messenger.g0.L(mzVar.d), paintArr[mzVar.f37407b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = nzVar.f37761a;
                    f11 = 16.0f;
                    rectF.set(mzVar.f37411g - org.telegram.messenger.g0.L(mzVar.d), mzVar.h - org.telegram.messenger.g0.L(2.0f), mzVar.f37411g + org.telegram.messenger.g0.L(mzVar.d), mzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(mzVar.f37412i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[mzVar.f37407b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f37759x;
                        if (drawableArr != null) {
                            drawable = drawableArr[mzVar.f37407b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f37758w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[mzVar.f37407b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) mzVar.f37411g;
                            int i12 = (int) mzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(mzVar.f37412i, mzVar.f37411g, mzVar.h);
                            float f12 = mzVar.d / 6.0f;
                            canvas.scale(f12, f12, mzVar.f37411g, mzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            nz nzVar2 = mzVar.f37415l;
            float f13 = i7 / f11;
            float f14 = mzVar.f37411g;
            float f15 = mzVar.f37413j;
            mzVar.f37411g = (f15 * f13) + f14;
            mzVar.h = (mzVar.f37414k * f13) + mzVar.h;
            if (mzVar.f37409e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (mzVar.f37409e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(L, f13, 0.05f, mzVar.f37413j);
                    mzVar.f37413j = x10;
                    if (x10 >= L) {
                        mzVar.f37409e = (byte) 2;
                    }
                } else {
                    float x11 = org.telegram.ui.Cells.y0.x(L, f13, 0.05f, mzVar.f37413j);
                    mzVar.f37413j = x11;
                    if (x11 <= (-L)) {
                        mzVar.f37409e = (byte) 1;
                    }
                }
            } else if (mzVar.f37408c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    mzVar.f37413j = f16;
                    if (f16 <= 0.0f) {
                        mzVar.f37413j = 0.0f;
                        mzVar.f37409e = mzVar.f37410f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                mzVar.f37413j = f17;
                if (f17 >= 0.0f) {
                    mzVar.f37413j = 0.0f;
                    mzVar.f37409e = mzVar.f37410f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = mzVar.f37414k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                mzVar.f37414k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * nzVar2.f37764e) + f19;
            } else {
                mzVar.f37414k = com.google.android.gms.internal.vision.e2.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && mzVar.f37414k > f18) {
                nzVar2.f37765f++;
            }
            byte b11 = mzVar.f37406a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + mzVar.f37412i);
                mzVar.f37412i = s5;
                if (s5 > 360) {
                    mzVar.f37412i = (short) (s5 - 360);
                }
            }
            if (mzVar.h >= nzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f37765f >= f37760y / 2 && this.f37764e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.i20.v(i7, 16.0f, 0.15f, this.f37764e);
            this.f37764e = v;
            if (v < 0.2f) {
                this.f37764e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f37763c = false;
        org.telegram.messenger.g0.h3(new fo(this, 19));
        b();
    }

    public void b() {
    }
}
