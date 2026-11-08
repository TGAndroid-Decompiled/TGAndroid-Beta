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
    public static final Paint[] f35447s;
    public static Drawable[] f35448w;
    public static Drawable[] f35449x;
    public static final int f35450y;
    public final RectF f35451a;
    public long f35452b;
    public boolean f35453c;
    public boolean d;
    public float f35454e;
    public int f35455f;
    public boolean h;
    public boolean f35456n;
    public final ArrayList f35457r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.iz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f35450y = i7;
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
        f35447s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f35447s;
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
        this.f35451a = new RectF();
        this.f35454e = 1.0f;
        this.f35457r = new ArrayList(f35450y + D);
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
        int i7 = (int) (elapsedRealtime - this.f35452b);
        this.f35452b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f35457r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            jz jzVar = (jz) arrayList.get(i10);
            kz kzVar = jzVar.f35146l;
            byte b10 = jzVar.f35137a;
            Paint[] paintArr = f35447s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(jzVar.f35142g, jzVar.h, org.telegram.messenger.g0.L(jzVar.d), paintArr[jzVar.f35138b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = kzVar.f35451a;
                    f11 = 16.0f;
                    rectF.set(jzVar.f35142g - org.telegram.messenger.g0.L(jzVar.d), jzVar.h - org.telegram.messenger.g0.L(2.0f), jzVar.f35142g + org.telegram.messenger.g0.L(jzVar.d), jzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(jzVar.f35143i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[jzVar.f35138b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f35449x;
                        if (drawableArr != null) {
                            drawable = drawableArr[jzVar.f35138b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f35448w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[jzVar.f35138b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) jzVar.f35142g;
                            int i12 = (int) jzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(jzVar.f35143i, jzVar.f35142g, jzVar.h);
                            float f12 = jzVar.d / 6.0f;
                            canvas.scale(f12, f12, jzVar.f35142g, jzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            kz kzVar2 = jzVar.f35146l;
            float f13 = i7 / f11;
            float f14 = jzVar.f35142g;
            float f15 = jzVar.f35144j;
            jzVar.f35142g = (f15 * f13) + f14;
            jzVar.h = (jzVar.f35145k * f13) + jzVar.h;
            if (jzVar.f35140e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (jzVar.f35140e == 1) {
                    float x10 = com.google.android.recaptcha.internal.a.x(L, f13, 0.05f, jzVar.f35144j);
                    jzVar.f35144j = x10;
                    if (x10 >= L) {
                        jzVar.f35140e = (byte) 2;
                    }
                } else {
                    float x11 = org.telegram.ui.Cells.f1.x(L, f13, 0.05f, jzVar.f35144j);
                    jzVar.f35144j = x11;
                    if (x11 <= (-L)) {
                        jzVar.f35140e = (byte) 1;
                    }
                }
            } else if (jzVar.f35139c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    jzVar.f35144j = f16;
                    if (f16 <= 0.0f) {
                        jzVar.f35144j = 0.0f;
                        jzVar.f35140e = jzVar.f35141f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                jzVar.f35144j = f17;
                if (f17 >= 0.0f) {
                    jzVar.f35144j = 0.0f;
                    jzVar.f35140e = jzVar.f35141f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = jzVar.f35145k;
            if (f19 < f18) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (f19 > f18) {
                jzVar.f35145k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * kzVar2.f35454e) + f19;
            } else {
                jzVar.f35145k = com.google.android.recaptcha.internal.a.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z9 && jzVar.f35145k > f18) {
                kzVar2.f35455f++;
            }
            byte b11 = jzVar.f35137a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + jzVar.f35143i);
                jzVar.f35143i = s5;
                if (s5 > 360) {
                    jzVar.f35143i = (short) (s5 - 360);
                }
            }
            if (jzVar.h >= kzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f35455f >= f35450y / 2 && this.f35454e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < D; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v = org.telegram.messenger.camera.q.v(i7, 16.0f, 0.15f, this.f35454e);
            this.f35454e = v;
            if (v < 0.2f) {
                this.f35454e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f35453c = false;
        org.telegram.messenger.g0.h3(new gp(this, 17));
        b();
    }

    public void b() {
    }
}
