package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class jz extends View {
    public static final int D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f35077s;
    public static Drawable[] f35078w;
    public static Drawable[] f35079x;
    public static final int f35080y;
    public final RectF f35081a;
    public long f35082b;
    public boolean f35083c;
    public boolean d;
    public float f35084e;
    public int f35085f;
    public boolean h;
    public boolean f35086n;
    public final ArrayList f35087r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.iz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f35080y = i7;
        if (org.telegram.messenger.iz.o() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        D = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f35077s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f35077s;
            if (i11 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setColor(E[i11]);
                i11++;
            } else {
                return;
            }
        }
    }

    public jz(Context context) {
        super(context);
        this.f35081a = new RectF();
        this.f35084e = 1.0f;
        this.f35087r = new ArrayList(f35080y + D);
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

    public final org.telegram.ui.Components.iz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jz.a(boolean):org.telegram.ui.Components.iz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z9;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f35082b);
        this.f35082b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f35087r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            iz izVar = (iz) arrayList.get(i10);
            jz jzVar = izVar.f34799l;
            byte b10 = izVar.f34790a;
            Paint[] paintArr = f35077s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(izVar.f34795g, izVar.h, org.telegram.messenger.g0.L(izVar.d), paintArr[izVar.f34791b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = jzVar.f35081a;
                    f11 = 16.0f;
                    rectF.set(izVar.f34795g - org.telegram.messenger.g0.L(izVar.d), izVar.h - org.telegram.messenger.g0.L(2.0f), izVar.f34795g + org.telegram.messenger.g0.L(izVar.d), izVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(izVar.f34796i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[izVar.f34791b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f35079x;
                        if (drawableArr != null) {
                            drawable = drawableArr[izVar.f34791b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f35078w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[izVar.f34791b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) izVar.f34795g;
                            int i12 = (int) izVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(izVar.f34796i, izVar.f34795g, izVar.h);
                            float f12 = izVar.d / 6.0f;
                            canvas.scale(f12, f12, izVar.f34795g, izVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            jz jzVar2 = izVar.f34799l;
            float f13 = i7 / f11;
            float f14 = izVar.f34795g;
            float f15 = izVar.f34797j;
            izVar.f34795g = (f15 * f13) + f14;
            izVar.h = (izVar.f34798k * f13) + izVar.h;
            if (izVar.f34793e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (izVar.f34793e == 1) {
                    float x10 = com.google.android.recaptcha.internal.a.x(L, f13, 0.05f, izVar.f34797j);
                    izVar.f34797j = x10;
                    if (x10 >= L) {
                        izVar.f34793e = (byte) 2;
                    }
                } else {
                    float x11 = org.telegram.ui.Cells.f1.x(L, f13, 0.05f, izVar.f34797j);
                    izVar.f34797j = x11;
                    if (x11 <= (-L)) {
                        izVar.f34793e = (byte) 1;
                    }
                }
            } else if (izVar.f34792c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    izVar.f34797j = f16;
                    if (f16 <= 0.0f) {
                        izVar.f34797j = 0.0f;
                        izVar.f34793e = izVar.f34794f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                izVar.f34797j = f17;
                if (f17 >= 0.0f) {
                    izVar.f34797j = 0.0f;
                    izVar.f34793e = izVar.f34794f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = izVar.f34798k;
            if (f19 < f18) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (f19 > f18) {
                izVar.f34798k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * jzVar2.f35084e) + f19;
            } else {
                izVar.f34798k = com.google.android.recaptcha.internal.a.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z9 && izVar.f34798k > f18) {
                jzVar2.f35085f++;
            }
            byte b11 = izVar.f34790a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + izVar.f34796i);
                izVar.f34796i = s5;
                if (s5 > 360) {
                    izVar.f34796i = (short) (s5 - 360);
                }
            }
            if (izVar.h >= jzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f35085f >= f35080y / 2 && this.f35084e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < D; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.camera.q.v(i7, 16.0f, 0.15f, this.f35084e);
            this.f35084e = v;
            if (v < 0.2f) {
                this.f35084e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f35083c = false;
        org.telegram.messenger.g0.h3(new gp(this, 17));
        b();
    }

    public void b() {
    }
}
