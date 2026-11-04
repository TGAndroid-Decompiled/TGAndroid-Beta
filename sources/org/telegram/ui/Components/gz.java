package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class gz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] f34233s;
    public static Drawable[] f34234w;
    public static Drawable[] f34235x;
    public static final int f34236y;
    public final RectF f34237a;
    public long f34238b;
    public boolean f34239c;
    public boolean d;
    public float f34240e;
    public int f34241f;
    public boolean h;
    public boolean f34242n;
    public final ArrayList f34243r;

    static {
        int i3;
        int i10;
        if (org.telegram.messenger.az.o() == 0) {
            i3 = 50;
        } else {
            i3 = 60;
        }
        f34236y = i3;
        if (org.telegram.messenger.az.o() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        E = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f34233s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f34233s;
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

    public gz(Context context) {
        super(context);
        this.f34237a = new RectF();
        this.f34240e = 1.0f;
        this.f34243r = new ArrayList(f34236y + E);
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

    public final org.telegram.ui.Components.fz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz.a(boolean):org.telegram.ui.Components.fz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = (int) (elapsedRealtime - this.f34238b);
        this.f34238b = elapsedRealtime;
        if (i3 > 18) {
            i3 = 16;
        }
        ArrayList arrayList = this.f34243r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            fz fzVar = (fz) arrayList.get(i10);
            gz gzVar = fzVar.f33896l;
            byte b10 = fzVar.f33887a;
            Paint[] paintArr = f34233s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(fzVar.f33892g, fzVar.h, org.telegram.messenger.g0.L(fzVar.d), paintArr[fzVar.f33888b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = gzVar.f34237a;
                    f11 = 16.0f;
                    rectF.set(fzVar.f33892g - org.telegram.messenger.g0.L(fzVar.d), fzVar.h - org.telegram.messenger.g0.L(2.0f), fzVar.f33892g + org.telegram.messenger.g0.L(fzVar.d), fzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(fzVar.f33893i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[fzVar.f33888b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f34235x;
                        if (drawableArr != null) {
                            drawable = drawableArr[fzVar.f33888b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f34234w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[fzVar.f33888b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) fzVar.f33892g;
                            int i12 = (int) fzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(fzVar.f33893i, fzVar.f33892g, fzVar.h);
                            float f12 = fzVar.d / 6.0f;
                            canvas.scale(f12, f12, fzVar.f33892g, fzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            gz gzVar2 = fzVar.f33896l;
            float f13 = i3 / f11;
            float f14 = fzVar.f33892g;
            float f15 = fzVar.f33894j;
            fzVar.f33892g = (f15 * f13) + f14;
            fzVar.h = (fzVar.f33895k * f13) + fzVar.h;
            if (fzVar.f33890e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (fzVar.f33890e == 1) {
                    float v = com.google.android.recaptcha.internal.a.v(L, f13, 0.05f, fzVar.f33894j);
                    fzVar.f33894j = v;
                    if (v >= L) {
                        fzVar.f33890e = (byte) 2;
                    }
                } else {
                    float A = org.telegram.ui.Cells.f1.A(L, f13, 0.05f, fzVar.f33894j);
                    fzVar.f33894j = A;
                    if (A <= (-L)) {
                        fzVar.f33890e = (byte) 1;
                    }
                }
            } else if (fzVar.f33889c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    fzVar.f33894j = f16;
                    if (f16 <= 0.0f) {
                        fzVar.f33894j = 0.0f;
                        fzVar.f33890e = fzVar.f33891f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                fzVar.f33894j = f17;
                if (f17 >= 0.0f) {
                    fzVar.f33894j = 0.0f;
                    fzVar.f33890e = fzVar.f33891f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = fzVar.f33895k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                fzVar.f33895k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * gzVar2.f34240e) + f19;
            } else {
                fzVar.f33895k = a1.g.A(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && fzVar.f33895k > f18) {
                gzVar2.f34241f++;
            }
            byte b11 = fzVar.f33887a;
            if (b11 == 1 || b11 == 2) {
                short s6 = (short) ((f13 * 10.0f) + fzVar.f33893i);
                fzVar.f33893i = s6;
                if (s6 > 360) {
                    fzVar.f33893i = (short) (s6 - 360);
                }
            }
            if (fzVar.h >= gzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f34241f >= f34236y / 2 && this.f34240e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float v10 = org.telegram.messenger.camera.q.v(i3, 16.0f, 0.15f, this.f34240e);
            this.f34240e = v10;
            if (v10 < 0.2f) {
                this.f34240e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f34239c = false;
        org.telegram.messenger.g0.h3(new gp(this, 17));
        b();
    }

    public void b() {
    }
}
