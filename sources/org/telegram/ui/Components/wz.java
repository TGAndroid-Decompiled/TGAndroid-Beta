package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public class wz extends View {
    public static final int E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] f41875s;
    public static Drawable[] f41876w;
    public static Drawable[] f41877x;
    public static final int f41878y;
    public final RectF f41879a;
    public long f41880b;
    public boolean f41881c;
    public boolean d;
    public float f41882e;
    public int f41883f;
    public boolean h;
    public boolean f41884n;
    public final ArrayList f41885r;

    static {
        int i7;
        int i10;
        if (org.telegram.messenger.cz.o() == 0) {
            i7 = 50;
        } else {
            i7 = 60;
        }
        f41878y = i7;
        if (org.telegram.messenger.cz.o() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        E = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        F = iArr;
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f41875s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f41875s;
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

    public wz(Context context) {
        super(context);
        this.f41879a = new RectF();
        this.f41882e = 1.0f;
        this.f41885r = new ArrayList(f41878y + E);
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

    public final org.telegram.ui.Components.vz a(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wz.a(boolean):org.telegram.ui.Components.vz");
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wz.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = (int) (elapsedRealtime - this.f41880b);
        this.f41880b = elapsedRealtime;
        if (i7 > 18) {
            i7 = 16;
        }
        ArrayList arrayList = this.f41885r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            vz vzVar = (vz) arrayList.get(i10);
            wz wzVar = vzVar.f41575l;
            byte b10 = vzVar.f41566a;
            Paint[] paintArr = f41875s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(vzVar.f41571g, vzVar.h, org.telegram.messenger.g0.L(vzVar.d), paintArr[vzVar.f41567b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = wzVar.f41879a;
                    f11 = 16.0f;
                    rectF.set(vzVar.f41571g - org.telegram.messenger.g0.L(vzVar.d), vzVar.h - org.telegram.messenger.g0.L(2.0f), vzVar.f41571g + org.telegram.messenger.g0.L(vzVar.d), vzVar.h + org.telegram.messenger.g0.L(2.0f));
                    canvas.save();
                    canvas.rotate(vzVar.f41572i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paintArr[vzVar.f41567b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f41877x;
                        if (drawableArr != null) {
                            drawable = drawableArr[vzVar.f41567b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = f41876w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[vzVar.f41567b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) vzVar.f41571g;
                            int i12 = (int) vzVar.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(vzVar.f41572i, vzVar.f41571g, vzVar.h);
                            float f12 = vzVar.d / 6.0f;
                            canvas.scale(f12, f12, vzVar.f41571g, vzVar.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            wz wzVar2 = vzVar.f41575l;
            float f13 = i7 / f11;
            float f14 = vzVar.f41571g;
            float f15 = vzVar.f41573j;
            vzVar.f41571g = (f15 * f13) + f14;
            vzVar.h = (vzVar.f41574k * f13) + vzVar.h;
            if (vzVar.f41569e != 0) {
                float L = org.telegram.messenger.g0.L(1.0f) * 0.5f;
                if (vzVar.f41569e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(L, f13, 0.05f, vzVar.f41573j);
                    vzVar.f41573j = x10;
                    if (x10 >= L) {
                        vzVar.f41569e = (byte) 2;
                    }
                } else {
                    float z11 = org.telegram.ui.Cells.c0.z(L, f13, 0.05f, vzVar.f41573j);
                    vzVar.f41573j = z11;
                    if (z11 <= (-L)) {
                        vzVar.f41569e = (byte) 1;
                    }
                }
            } else if (vzVar.f41568c == 0) {
                if (f15 > 0.0f) {
                    float f16 = f15 - (0.05f * f13);
                    vzVar.f41573j = f16;
                    if (f16 <= 0.0f) {
                        vzVar.f41573j = 0.0f;
                        vzVar.f41569e = vzVar.f41570f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f17 = (0.05f * f13) + f15;
                vzVar.f41573j = f17;
                if (f17 >= 0.0f) {
                    vzVar.f41573j = 0.0f;
                    vzVar.f41569e = vzVar.f41570f;
                }
            }
            float f18 = (-org.telegram.messenger.g0.L(1.0f)) / f10;
            float f19 = vzVar.f41574k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                vzVar.f41574k = ((org.telegram.messenger.g0.L(1.0f) / 3.0f) * f13 * wzVar2.f41882e) + f19;
            } else {
                vzVar.f41574k = com.google.android.gms.internal.vision.e2.c(org.telegram.messenger.g0.L(1.0f), 3.0f, f13, f19);
            }
            if (z10 && vzVar.f41574k > f18) {
                wzVar2.f41883f++;
            }
            byte b11 = vzVar.f41566a;
            if (b11 == 1 || b11 == 2) {
                short s5 = (short) ((f13 * 10.0f) + vzVar.f41572i);
                vzVar.f41572i = s5;
                if (s5 > 360) {
                    vzVar.f41572i = (short) (s5 - 360);
                }
            }
            if (vzVar.h >= wzVar2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f41883f >= f41878y / 2 && this.f41882e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < E; i13++) {
                    arrayList.add(a(true));
                }
            }
            float w10 = org.telegram.messenger.o10.w(i7, 16.0f, 0.15f, this.f41882e);
            this.f41882e = w10;
            if (w10 < 0.2f) {
                this.f41882e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f41881c = false;
        org.telegram.messenger.g0.g3(new oo(this, 19));
        b();
    }

    public void b() {
    }
}
