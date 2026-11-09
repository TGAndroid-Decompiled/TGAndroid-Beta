package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class kz extends View {
    public static final int D;
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f35516s;
    public static Drawable[] f35517w;
    public static Drawable[] f35518x;
    public static final int f35519y;
    public final RectF f35520a;
    public long f35521b;
    public boolean f35522c;
    public boolean d;
    public float f35523e;
    public int f35524f;
    public boolean h;
    public boolean f35525n;
    public final ArrayList f35526r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.iz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f35519y = i7;
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
        f35516s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f35516s;
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

    public kz(Context context) {
        super(context);
        this.f35520a = new RectF();
        this.f35523e = 1.0f;
        this.f35526r = new ArrayList(f35519y + D);
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

    public final org.telegram.ui.Components.jz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz.a(boolean):org.telegram.ui.Components.jz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z9;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f35521b);
        this.f35521b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f35526r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            jz jzVar = (jz) arrayList.get(i10);
            kz kzVar = jzVar.f35193l;
            byte b10 = jzVar.f35184a;
            Paint[] paintArr = f35516s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(jzVar.f35189g, jzVar.h, org.telegram.messenger.g0.L(jzVar.d), paintArr[jzVar.f35185b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = kzVar.f35520a;
                    f11 = 16.0f;
                    rectF.set(jzVar.f35189g - org.telegram.messenger.g0.L(jzVar.d), jzVar.h - org.telegram.messenger.g0.L(2.0f), jzVar.f35189g + org.telegram.messenger.g0.L(jzVar.d), jzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(jzVar.f35190i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[jzVar.f35185b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f35518x;
                        if (drawableArr != null) {
                            drawable = drawableArr[jzVar.f35185b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f35517w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[jzVar.f35185b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) jzVar.f35189g;
                            int i12 = (int) jzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(jzVar.f35190i, jzVar.f35189g, jzVar.h);
                            float f12 = jzVar.d / 6.0f;
                            canvas.scale(f12, f12, jzVar.f35189g, jzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            kz kzVar2 = jzVar.f35193l;
            float f13 = i7 / f11;
            float f14 = jzVar.f35189g;
            float f15 = jzVar.f35191j;
            jzVar.f35189g = (f15 * f13) + f14;
            jzVar.h = (jzVar.f35192k * f13) + jzVar.h;
            if (jzVar.f35187e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (jzVar.f35187e == 1) {
                    float x10 = com.google.android.recaptcha.internal.a.x(L, f13, 0.05f, jzVar.f35191j);
                    jzVar.f35191j = x10;
                    if (x10 >= L) {
                        jzVar.f35187e = (byte) 2;
                    }
                } else {
                    float x11 = org.telegram.ui.Cells.f1.x(L, f13, 0.05f, jzVar.f35191j);
                    jzVar.f35191j = x11;
                    if (x11 <= (-L)) {
                        jzVar.f35187e = (byte) 1;
                    }
                }
            } else if (jzVar.f35186c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    jzVar.f35191j = f16;
                    if (f16 <= 0.0f) {
                        jzVar.f35191j = 0.0f;
                        jzVar.f35187e = jzVar.f35188f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                jzVar.f35191j = f17;
                if (f17 >= 0.0f) {
                    jzVar.f35191j = 0.0f;
                    jzVar.f35187e = jzVar.f35188f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = jzVar.f35192k;
            if (f19 < f18) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (f19 > f18) {
                jzVar.f35192k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * kzVar2.f35523e) + f19;
            } else {
                jzVar.f35192k = com.google.android.recaptcha.internal.a.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z9 && jzVar.f35192k > f18) {
                kzVar2.f35524f++;
            }
            byte b11 = jzVar.f35184a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + jzVar.f35190i);
                jzVar.f35190i = s5;
                if (s5 > 360) {
                    jzVar.f35190i = (short) (s5 - 360);
                }
            }
            if (jzVar.h >= kzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f35524f >= f35519y / 2 && this.f35523e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < D; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.camera.q.v(i7, 16.0f, 0.15f, this.f35523e);
            this.f35523e = v;
            if (v < 0.2f) {
                this.f35523e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f35522c = false;
        org.telegram.messenger.g0.h3(new gp(this, 17));
        b();
    }

    public void b() {
    }
}
