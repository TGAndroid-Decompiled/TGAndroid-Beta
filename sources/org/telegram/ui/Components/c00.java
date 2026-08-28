package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public class c00 extends View {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final Paint[] f27316s;
    public static Drawable[] v;
    public static Drawable[] f27317w;
    public static final int f27318x;
    public static final int f27319y;
    public final RectF f27320a;
    public long f27321b;
    public boolean f27322c;
    public boolean d;
    public float f27323e;
    public int f27324f;
    public boolean h;
    public boolean f27325n;
    public final ArrayList f27326r;

    static {
        int i9;
        int i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i9 = 50;
        } else {
            i9 = 60;
        }
        f27318x = i9;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 20;
        } else {
            i10 = 30;
        }
        f27319y = i10;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        A = iArr;
        B = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        C = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f27316s = new Paint[iArr.length];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = f27316s;
            if (i11 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setColor(A[i11]);
                i11++;
            } else {
                return;
            }
        }
    }

    public c00(Context context) {
        super(context);
        this.f27320a = new RectF();
        this.f27323e = 1.0f;
        this.f27326r = new ArrayList(f27318x + f27319y);
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

    public final org.telegram.ui.Components.b00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c00.a(boolean):org.telegram.ui.Components.b00");
    }

    public void c(boolean z10) {
        this.f27325n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f27322c = true;
        this.d = false;
        this.f27324f = 0;
        this.f27323e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i9 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i9 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (z11) {
            if (v == null) {
                v = new Drawable[B.length];
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i10 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i10] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i10].setColorFilter(new PorterDuffColorFilter(B[i10], PorterDuff.Mode.MULTIPLY));
                    i10++;
                }
            }
        } else if (z10 && f27317w == null) {
            f27317w = new Drawable[C.length];
            int i11 = 0;
            while (true) {
                Drawable[] drawableArr2 = f27317w;
                if (i11 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f27317w[i11].setColorFilter(new PorterDuffColorFilter(C[i11], PorterDuff.Mode.MULTIPLY));
                i11++;
            }
        }
        int i12 = f27318x;
        int clamp = Utilities.clamp(i12 - this.f27326r.size(), i12, i12 / 3);
        for (int i13 = 0; i13 < clamp; i13++) {
            this.f27326r.add(a(false));
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = (int) (elapsedRealtime - this.f27321b);
        this.f27321b = elapsedRealtime;
        if (i9 > 18) {
            i9 = 16;
        }
        ArrayList arrayList = this.f27326r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b00 b00Var = (b00) arrayList.get(i10);
            c00 c00Var = b00Var.f26953l;
            byte b10 = b00Var.f26944a;
            Paint[] paintArr = f27316s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(b00Var.f26949g, b00Var.h, AndroidUtilities.dp(b00Var.d), paintArr[b00Var.f26945b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = c00Var.f27320a;
                    f11 = 16.0f;
                    rectF.set(b00Var.f26949g - AndroidUtilities.dp(b00Var.d), b00Var.h - AndroidUtilities.dp(2.0f), b00Var.f26949g + AndroidUtilities.dp(b00Var.d), b00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(b00Var.f26950i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[b00Var.f26945b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f27317w;
                        if (drawableArr != null) {
                            drawable = drawableArr[b00Var.f26945b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[b00Var.f26945b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i11 = (int) b00Var.f26949g;
                            int i12 = (int) b00Var.h;
                            drawable.setBounds(i11 - intrinsicWidth, i12 - intrinsicHeight, i11 + intrinsicWidth, i12 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(b00Var.f26950i, b00Var.f26949g, b00Var.h);
                            float f12 = b00Var.d / 6.0f;
                            canvas.scale(f12, f12, b00Var.f26949g, b00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            c00 c00Var2 = b00Var.f26953l;
            float f13 = i9 / f11;
            float f14 = b00Var.f26949g;
            float f15 = b00Var.f26951j;
            b00Var.f26949g = (f15 * f13) + f14;
            b00Var.h = (b00Var.f26952k * f13) + b00Var.h;
            if (b00Var.f26947e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (b00Var.f26947e == 1) {
                    float x10 = e2.c.x(dp, f13, 0.05f, b00Var.f26951j);
                    b00Var.f26951j = x10;
                    if (x10 >= dp) {
                        b00Var.f26947e = (byte) 2;
                    }
                } else {
                    float f16 = b00Var.f26951j - ((dp * f13) * 0.05f);
                    b00Var.f26951j = f16;
                    if (f16 <= (-dp)) {
                        b00Var.f26947e = (byte) 1;
                    }
                }
            } else if (b00Var.f26946c == 0) {
                if (f15 > 0.0f) {
                    float f17 = f15 - (0.05f * f13);
                    b00Var.f26951j = f17;
                    if (f17 <= 0.0f) {
                        b00Var.f26951j = 0.0f;
                        b00Var.f26947e = b00Var.f26948f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f18 = (0.05f * f13) + f15;
                b00Var.f26951j = f18;
                if (f18 >= 0.0f) {
                    b00Var.f26951j = 0.0f;
                    b00Var.f26947e = b00Var.f26948f;
                }
            }
            float f19 = (-AndroidUtilities.dp(1.0f)) / f10;
            float f20 = b00Var.f26952k;
            if (f20 < f19) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f20 > f19) {
                b00Var.f26952k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f13 * c00Var2.f27323e) + f20;
            } else {
                b00Var.f26952k = org.telegram.ui.Cells.j2.b(AndroidUtilities.dp(1.0f), 3.0f, f13, f20);
            }
            if (z10 && b00Var.f26952k > f19) {
                c00Var2.f27324f++;
            }
            byte b11 = b00Var.f26944a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f13 * 10.0f) + b00Var.f26950i);
                b00Var.f26950i = s10;
                if (s10 > 360) {
                    b00Var.f26950i = (short) (s10 - 360);
                }
            }
            if (b00Var.h >= c00Var2.getHeightForAnimation()) {
                arrayList.remove(i10);
                i10--;
                size--;
            }
            i10++;
        }
        if (this.f27324f >= f27318x / 2 && this.f27323e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i13 = 0; i13 < f27319y; i13++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.ll.c(i9, 16.0f, 0.15f, this.f27323e);
            this.f27323e = c10;
            if (c10 < 0.2f) {
                this.f27323e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f27322c = false;
        AndroidUtilities.runOnUIThread(new np(this, 18));
        b();
    }

    public void b() {
    }
}
