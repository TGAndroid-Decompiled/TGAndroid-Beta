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
public class d10 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f24257s;
    public static Drawable[] v;
    public static Drawable[] f24258w;
    public static final int f24259x;
    public static final int f24260y;
    public final RectF f24261a;
    public long f24262b;
    public boolean f24263c;
    public boolean d;
    public float e;
    public int f24264f;
    public boolean h;
    public boolean f24265n;
    public final ArrayList f24266r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f24259x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f24260y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f24257s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f24257s;
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

    public d10(Context context) {
        super(context);
        this.f24261a = new RectF();
        this.e = 1.0f;
        this.f24266r = new ArrayList(f24259x + f24260y);
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

    public final org.telegram.ui.Components.c10 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.a(boolean):org.telegram.ui.Components.c10");
    }

    public void c(boolean z10) {
        this.f24265n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f24263c = true;
        this.d = false;
        this.f24264f = 0;
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
        } else if (z10 && f24258w == null) {
            f24258w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f24258w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f24258w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f24259x;
        int clamp = Utilities.clamp(i13 - this.f24266r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f24266r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f24262b);
        this.f24262b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f24266r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            c10 c10Var = (c10) arrayList.get(i11);
            d10 d10Var = c10Var.f23910l;
            byte b10 = c10Var.f23902a;
            Paint[] paintArr = f24257s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(c10Var.f23906g, c10Var.h, AndroidUtilities.dp(c10Var.d), paintArr[c10Var.f23903b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = d10Var.f24261a;
                    f10 = 16.0f;
                    rectF.set(c10Var.f23906g - AndroidUtilities.dp(c10Var.d), c10Var.h - AndroidUtilities.dp(2.0f), c10Var.f23906g + AndroidUtilities.dp(c10Var.d), c10Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(c10Var.f23907i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[c10Var.f23903b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f24258w;
                        if (drawableArr != null) {
                            drawable = drawableArr[c10Var.f23903b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[c10Var.f23903b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) c10Var.f23906g;
                            int i13 = (int) c10Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(c10Var.f23907i, c10Var.f23906g, c10Var.h);
                            float f11 = c10Var.d / 6.0f;
                            canvas.scale(f11, f11, c10Var.f23906g, c10Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            d10 d10Var2 = c10Var.f23910l;
            float f12 = i10 / f10;
            float f13 = c10Var.f23906g;
            float f14 = c10Var.f23908j;
            c10Var.f23906g = (f14 * f12) + f13;
            c10Var.h = (c10Var.f23909k * f12) + c10Var.h;
            if (c10Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (c10Var.e == 1) {
                    float t10 = com.google.android.gms.internal.play_billing.k3.t(dp, f12, 0.05f, c10Var.f23908j);
                    c10Var.f23908j = t10;
                    if (t10 >= dp) {
                        c10Var.e = (byte) 2;
                    }
                } else {
                    float f15 = c10Var.f23908j - ((dp * f12) * 0.05f);
                    c10Var.f23908j = f15;
                    if (f15 <= (-dp)) {
                        c10Var.e = (byte) 1;
                    }
                }
            } else if (c10Var.f23904c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    c10Var.f23908j = f16;
                    if (f16 <= 0.0f) {
                        c10Var.f23908j = 0.0f;
                        c10Var.e = c10Var.f23905f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                c10Var.f23908j = f17;
                if (f17 >= 0.0f) {
                    c10Var.f23908j = 0.0f;
                    c10Var.e = c10Var.f23905f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = c10Var.f23909k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                c10Var.f23909k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * d10Var2.e) + f19;
            } else {
                c10Var.f23909k = a1.g.d(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && c10Var.f23909k > f18) {
                d10Var2.f24264f++;
            }
            byte b11 = c10Var.f23902a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + c10Var.f23907i);
                c10Var.f23907i = s10;
                if (s10 > 360) {
                    c10Var.f23907i = (short) (s10 - 360);
                }
            }
            if (c10Var.h >= d10Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f24264f >= f24259x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f24260y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.yh.b(i10, 16.0f, 0.15f, this.e);
            this.e = b12;
            if (b12 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f24263c = false;
        AndroidUtilities.runOnUIThread(new kq(this, 18));
        b();
    }

    public void b() {
    }
}
