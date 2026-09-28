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
public class t00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f28407s;
    public static Drawable[] v;
    public static Drawable[] f28408w;
    public static final int f28409x;
    public static final int f28410y;
    public final RectF f28411a;
    public long f28412b;
    public boolean f28413c;
    public boolean d;
    public float e;
    public int f28414f;
    public boolean h;
    public boolean f28415n;
    public final ArrayList f28416r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f28409x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f28410y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f28407s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f28407s;
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

    public t00(Context context) {
        super(context);
        this.f28411a = new RectF();
        this.e = 1.0f;
        this.f28416r = new ArrayList(f28409x + f28410y);
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

    public final org.telegram.ui.Components.s00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t00.a(boolean):org.telegram.ui.Components.s00");
    }

    public void c(boolean z10) {
        this.f28415n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f28413c = true;
        this.d = false;
        this.f28414f = 0;
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
        } else if (z10 && f28408w == null) {
            f28408w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f28408w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f28408w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f28409x;
        int clamp = Utilities.clamp(i13 - this.f28416r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f28416r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f28412b);
        this.f28412b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f28416r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s00 s00Var = (s00) arrayList.get(i11);
            t00 t00Var = s00Var.f28100l;
            byte b10 = s00Var.f28092a;
            Paint[] paintArr = f28407s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(s00Var.f28096g, s00Var.h, AndroidUtilities.dp(s00Var.d), paintArr[s00Var.f28093b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = t00Var.f28411a;
                    f10 = 16.0f;
                    rectF.set(s00Var.f28096g - AndroidUtilities.dp(s00Var.d), s00Var.h - AndroidUtilities.dp(2.0f), s00Var.f28096g + AndroidUtilities.dp(s00Var.d), s00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(s00Var.f28097i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[s00Var.f28093b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f28408w;
                        if (drawableArr != null) {
                            drawable = drawableArr[s00Var.f28093b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[s00Var.f28093b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) s00Var.f28096g;
                            int i13 = (int) s00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(s00Var.f28097i, s00Var.f28096g, s00Var.h);
                            float f11 = s00Var.d / 6.0f;
                            canvas.scale(f11, f11, s00Var.f28096g, s00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            t00 t00Var2 = s00Var.f28100l;
            float f12 = i10 / f10;
            float f13 = s00Var.f28096g;
            float f14 = s00Var.f28098j;
            s00Var.f28096g = (f14 * f12) + f13;
            s00Var.h = (s00Var.f28099k * f12) + s00Var.h;
            if (s00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (s00Var.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, s00Var.f28098j);
                    s00Var.f28098j = x10;
                    if (x10 >= dp) {
                        s00Var.e = (byte) 2;
                    }
                } else {
                    float f15 = s00Var.f28098j - ((dp * f12) * 0.05f);
                    s00Var.f28098j = f15;
                    if (f15 <= (-dp)) {
                        s00Var.e = (byte) 1;
                    }
                }
            } else if (s00Var.f28094c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    s00Var.f28098j = f16;
                    if (f16 <= 0.0f) {
                        s00Var.f28098j = 0.0f;
                        s00Var.e = s00Var.f28095f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                s00Var.f28098j = f17;
                if (f17 >= 0.0f) {
                    s00Var.f28098j = 0.0f;
                    s00Var.e = s00Var.f28095f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = s00Var.f28099k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                s00Var.f28099k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * t00Var2.e) + f19;
            } else {
                s00Var.f28099k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && s00Var.f28099k > f18) {
                t00Var2.f28414f++;
            }
            byte b11 = s00Var.f28092a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + s00Var.f28097i);
                s00Var.f28097i = s10;
                if (s10 > 360) {
                    s00Var.f28097i = (short) (s10 - 360);
                }
            }
            if (s00Var.h >= t00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f28414f >= f28409x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f28410y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.ok.b(i10, 16.0f, 0.15f, this.e);
            this.e = b12;
            if (b12 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f28413c = false;
        AndroidUtilities.runOnUIThread(new zp(this, 18));
        b();
    }

    public void b() {
    }
}
