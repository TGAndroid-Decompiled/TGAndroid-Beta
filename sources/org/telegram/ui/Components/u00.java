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
public class u00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f31271s;
    public static Drawable[] v;
    public static Drawable[] f31272w;
    public static final int f31273x;
    public static final int f31274y;
    public final RectF f31275a;
    public long f31276b;
    public boolean f31277c;
    public boolean d;
    public float f31278e;
    public int f31279f;
    public boolean h;
    public boolean f31280n;
    public final ArrayList f31281r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f31273x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f31274y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f31271s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f31271s;
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

    public u00(Context context) {
        super(context);
        this.f31275a = new RectF();
        this.f31278e = 1.0f;
        this.f31281r = new ArrayList(f31273x + f31274y);
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

    public final org.telegram.ui.Components.t00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u00.a(boolean):org.telegram.ui.Components.t00");
    }

    public void c(boolean z10) {
        this.f31280n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f31277c = true;
        this.d = false;
        this.f31279f = 0;
        this.f31278e = 1.0f;
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
        } else if (z10 && f31272w == null) {
            f31272w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f31272w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f31272w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f31273x;
        int clamp = Utilities.clamp(i13 - this.f31281r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f31281r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f31276b);
        this.f31276b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f31281r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            t00 t00Var = (t00) arrayList.get(i11);
            u00 u00Var = t00Var.f31003l;
            byte b10 = t00Var.f30994a;
            Paint[] paintArr = f31271s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(t00Var.f30999g, t00Var.h, AndroidUtilities.dp(t00Var.d), paintArr[t00Var.f30995b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = u00Var.f31275a;
                    f10 = 16.0f;
                    rectF.set(t00Var.f30999g - AndroidUtilities.dp(t00Var.d), t00Var.h - AndroidUtilities.dp(2.0f), t00Var.f30999g + AndroidUtilities.dp(t00Var.d), t00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(t00Var.f31000i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[t00Var.f30995b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f31272w;
                        if (drawableArr != null) {
                            drawable = drawableArr[t00Var.f30995b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[t00Var.f30995b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) t00Var.f30999g;
                            int i13 = (int) t00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(t00Var.f31000i, t00Var.f30999g, t00Var.h);
                            float f11 = t00Var.d / 6.0f;
                            canvas.scale(f11, f11, t00Var.f30999g, t00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            u00 u00Var2 = t00Var.f31003l;
            float f12 = i10 / f10;
            float f13 = t00Var.f30999g;
            float f14 = t00Var.f31001j;
            t00Var.f30999g = (f14 * f12) + f13;
            t00Var.h = (t00Var.f31002k * f12) + t00Var.h;
            if (t00Var.f30997e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (t00Var.f30997e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, t00Var.f31001j);
                    t00Var.f31001j = x10;
                    if (x10 >= dp) {
                        t00Var.f30997e = (byte) 2;
                    }
                } else {
                    float f15 = t00Var.f31001j - ((dp * f12) * 0.05f);
                    t00Var.f31001j = f15;
                    if (f15 <= (-dp)) {
                        t00Var.f30997e = (byte) 1;
                    }
                }
            } else if (t00Var.f30996c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    t00Var.f31001j = f16;
                    if (f16 <= 0.0f) {
                        t00Var.f31001j = 0.0f;
                        t00Var.f30997e = t00Var.f30998f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                t00Var.f31001j = f17;
                if (f17 >= 0.0f) {
                    t00Var.f31001j = 0.0f;
                    t00Var.f30997e = t00Var.f30998f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = t00Var.f31002k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                t00Var.f31002k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * u00Var2.f31278e) + f19;
            } else {
                t00Var.f31002k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && t00Var.f31002k > f18) {
                u00Var2.f31279f++;
            }
            byte b11 = t00Var.f30994a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + t00Var.f31000i);
                t00Var.f31000i = s10;
                if (s10 > 360) {
                    t00Var.f31000i = (short) (s10 - 360);
                }
            }
            if (t00Var.h >= u00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f31279f >= f31273x / 2 && this.f31278e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f31274y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.bi.b(i10, 16.0f, 0.15f, this.f31278e);
            this.f31278e = b12;
            if (b12 < 0.2f) {
                this.f31278e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f31277c = false;
        AndroidUtilities.runOnUIThread(new aq(this, 18));
        b();
    }

    public void b() {
    }
}
