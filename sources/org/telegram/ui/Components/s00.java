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
public class s00 extends View {
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final Paint[] f28622s;
    public static Drawable[] v;
    public static Drawable[] f28623w;
    public static final int f28624x;
    public static final int f28625y;
    public final RectF f28626a;
    public long f28627b;
    public boolean f28628c;
    public boolean d;
    public float e;
    public int f28629f;
    public boolean h;
    public boolean f28630n;
    public final ArrayList f28631r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f28624x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f28625y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        B = iArr;
        C = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        D = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f28622s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f28622s;
            if (i12 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i12] = paint;
                paint.setColor(B[i12]);
                i12++;
            } else {
                return;
            }
        }
    }

    public s00(Context context) {
        super(context);
        this.f28626a = new RectF();
        this.e = 1.0f;
        this.f28631r = new ArrayList(f28624x + f28625y);
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

    public final org.telegram.ui.Components.r00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s00.a(boolean):org.telegram.ui.Components.r00");
    }

    public void c(boolean z4) {
        this.f28630n = z4;
        setLayerType(2, null);
        boolean z10 = true;
        this.f28628c = true;
        this.d = false;
        this.f28629f = 0;
        this.e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i10 != 14)) {
            z10 = false;
        }
        this.h = z10;
        if (z10) {
            if (v == null) {
                v = new Drawable[C.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i11].setColorFilter(new PorterDuffColorFilter(C[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (z4 && f28623w == null) {
            f28623w = new Drawable[D.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f28623w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f28623w[i12].setColorFilter(new PorterDuffColorFilter(D[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f28624x;
        int clamp = Utilities.clamp(i13 - this.f28631r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f28631r.add(a(false));
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Drawable drawable;
        boolean z4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.f28627b);
        this.f28627b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f28631r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            r00 r00Var = (r00) arrayList.get(i11);
            s00 s00Var = r00Var.f28355l;
            byte b10 = r00Var.f28347a;
            Paint[] paintArr = f28622s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(r00Var.f28351g, r00Var.h, AndroidUtilities.dp(r00Var.d), paintArr[r00Var.f28348b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = s00Var.f28626a;
                    f11 = 16.0f;
                    rectF.set(r00Var.f28351g - AndroidUtilities.dp(r00Var.d), r00Var.h - AndroidUtilities.dp(2.0f), r00Var.f28351g + AndroidUtilities.dp(r00Var.d), r00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(r00Var.f28352i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[r00Var.f28348b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f28623w;
                        if (drawableArr != null) {
                            drawable = drawableArr[r00Var.f28348b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[r00Var.f28348b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) r00Var.f28351g;
                            int i13 = (int) r00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(r00Var.f28352i, r00Var.f28351g, r00Var.h);
                            float f12 = r00Var.d / 6.0f;
                            canvas.scale(f12, f12, r00Var.f28351g, r00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            s00 s00Var2 = r00Var.f28355l;
            float f13 = i10 / f11;
            float f14 = r00Var.f28351g;
            float f15 = r00Var.f28353j;
            r00Var.f28351g = (f15 * f13) + f14;
            r00Var.h = (r00Var.f28354k * f13) + r00Var.h;
            if (r00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (r00Var.e == 1) {
                    float u10 = e2.c.u(dp, f13, 0.05f, r00Var.f28353j);
                    r00Var.f28353j = u10;
                    if (u10 >= dp) {
                        r00Var.e = (byte) 2;
                    }
                } else {
                    float f16 = r00Var.f28353j - ((dp * f13) * 0.05f);
                    r00Var.f28353j = f16;
                    if (f16 <= (-dp)) {
                        r00Var.e = (byte) 1;
                    }
                }
            } else if (r00Var.f28349c == 0) {
                if (f15 > 0.0f) {
                    float f17 = f15 - (0.05f * f13);
                    r00Var.f28353j = f17;
                    if (f17 <= 0.0f) {
                        r00Var.f28353j = 0.0f;
                        r00Var.e = r00Var.f28350f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f18 = (0.05f * f13) + f15;
                r00Var.f28353j = f18;
                if (f18 >= 0.0f) {
                    r00Var.f28353j = 0.0f;
                    r00Var.e = r00Var.f28350f;
                }
            }
            float f19 = (-AndroidUtilities.dp(1.0f)) / f10;
            float f20 = r00Var.f28354k;
            if (f20 < f19) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (f20 > f19) {
                r00Var.f28354k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f13 * s00Var2.e) + f20;
            } else {
                r00Var.f28354k = vh.w2.c(AndroidUtilities.dp(1.0f), 3.0f, f13, f20);
            }
            if (z4 && r00Var.f28354k > f19) {
                s00Var2.f28629f++;
            }
            byte b11 = r00Var.f28347a;
            if (b11 == 1 || b11 == 2) {
                short s6 = (short) ((f13 * 10.0f) + r00Var.f28352i);
                r00Var.f28352i = s6;
                if (s6 > 360) {
                    r00Var.f28352i = (short) (s6 - 360);
                }
            }
            if (r00Var.h >= s00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f28629f >= f28624x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f28625y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float A = org.telegram.messenger.y3.A(i10, 16.0f, 0.15f, this.e);
            this.e = A;
            if (A < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f28628c = false;
        AndroidUtilities.runOnUIThread(new up(this, 18));
        b();
    }

    public void b() {
    }
}
