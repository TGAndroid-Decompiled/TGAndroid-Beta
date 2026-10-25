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
public class z00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f35155s;
    public static Drawable[] v;
    public static Drawable[] f35156w;
    public static final int f35157x;
    public static final int f35158y;
    public final RectF f35159a;
    public long f35160b;
    public boolean f35161c;
    public boolean d;
    public float e;
    public int f35162f;
    public boolean h;
    public boolean f35163n;
    public final ArrayList f35164r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f35157x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f35158y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f35155s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f35155s;
            if (i12 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i12] = paint;
                paint.setColor(E[i12]);
                i12++;
            } else {
                return;
            }
        }
    }

    public z00(Context context) {
        super(context);
        this.f35159a = new RectF();
        this.e = 1.0f;
        this.f35164r = new ArrayList(f35157x + f35158y);
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

    public final org.telegram.ui.Components.y00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z00.a(boolean):org.telegram.ui.Components.y00");
    }

    public void c(boolean z10) {
        this.f35163n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f35161c = true;
        this.d = false;
        this.f35162f = 0;
        this.e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i10 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (z11) {
            if (v == null) {
                v = new Drawable[F.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i11].setColorFilter(new PorterDuffColorFilter(F[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (z10 && f35156w == null) {
            f35156w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f35156w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f35156w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f35157x;
        int clamp = Utilities.clamp(i13 - this.f35164r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f35164r.add(a(false));
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.f35160b);
        this.f35160b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f35164r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            y00 y00Var = (y00) arrayList.get(i11);
            z00 z00Var = y00Var.f34893l;
            byte b10 = y00Var.f34885a;
            Paint[] paintArr = f35155s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(y00Var.f34889g, y00Var.h, AndroidUtilities.dp(y00Var.d), paintArr[y00Var.f34886b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = z00Var.f35159a;
                    f10 = 16.0f;
                    rectF.set(y00Var.f34889g - AndroidUtilities.dp(y00Var.d), y00Var.h - AndroidUtilities.dp(2.0f), y00Var.f34889g + AndroidUtilities.dp(y00Var.d), y00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(y00Var.f34890i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[y00Var.f34886b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f35156w;
                        if (drawableArr != null) {
                            drawable = drawableArr[y00Var.f34886b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[y00Var.f34886b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) y00Var.f34889g;
                            int i13 = (int) y00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(y00Var.f34890i, y00Var.f34889g, y00Var.h);
                            float f11 = y00Var.d / 6.0f;
                            canvas.scale(f11, f11, y00Var.f34889g, y00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            z00 z00Var2 = y00Var.f34893l;
            float f12 = i10 / f10;
            float f13 = y00Var.f34889g;
            float f14 = y00Var.f34891j;
            y00Var.f34889g = (f14 * f12) + f13;
            y00Var.h = (y00Var.f34892k * f12) + y00Var.h;
            if (y00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (y00Var.e == 1) {
                    float u10 = c3.h0.u(dp, f12, 0.05f, y00Var.f34891j);
                    y00Var.f34891j = u10;
                    if (u10 >= dp) {
                        y00Var.e = (byte) 2;
                    }
                } else {
                    float A = org.telegram.ui.d3.A(dp, f12, 0.05f, y00Var.f34891j);
                    y00Var.f34891j = A;
                    if (A <= (-dp)) {
                        y00Var.e = (byte) 1;
                    }
                }
            } else if (y00Var.f34887c == 0) {
                if (f14 > 0.0f) {
                    float f15 = f14 - (0.05f * f12);
                    y00Var.f34891j = f15;
                    if (f15 <= 0.0f) {
                        y00Var.f34891j = 0.0f;
                        y00Var.e = y00Var.f34888f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f16 = (0.05f * f12) + f14;
                y00Var.f34891j = f16;
                if (f16 >= 0.0f) {
                    y00Var.f34891j = 0.0f;
                    y00Var.e = y00Var.f34888f;
                }
            }
            float f17 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f18 = y00Var.f34892k;
            if (f18 < f17) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f18 > f17) {
                y00Var.f34892k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * z00Var2.e) + f18;
            } else {
                y00Var.f34892k = a1.g.c(AndroidUtilities.dp(1.0f), 3.0f, f12, f18);
            }
            if (z10 && y00Var.f34892k > f17) {
                z00Var2.f35162f++;
            }
            byte b11 = y00Var.f34885a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + y00Var.f34890i);
                y00Var.f34890i = s10;
                if (s10 > 360) {
                    y00Var.f34890i = (short) (s10 - 360);
                }
            }
            if (y00Var.h >= z00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f35162f >= f35157x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f35158y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float w10 = org.telegram.messenger.vh.w(i10, 16.0f, 0.15f, this.e);
            this.e = w10;
            if (w10 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f35161c = false;
        AndroidUtilities.runOnUIThread(new bq(this, 20));
        b();
    }

    public void b() {
    }
}
