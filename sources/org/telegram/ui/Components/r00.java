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
public class r00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f29863s;
    public static Drawable[] v;
    public static Drawable[] f29864w;
    public static final int f29865x;
    public static final int f29866y;
    public final RectF f29867a;
    public long f29868b;
    public boolean f29869c;
    public boolean d;
    public float f29870e;
    public int f29871f;
    public boolean h;
    public boolean f29872n;
    public final ArrayList f29873r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f29865x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f29866y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f29863s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f29863s;
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

    public r00(Context context) {
        super(context);
        this.f29867a = new RectF();
        this.f29870e = 1.0f;
        this.f29873r = new ArrayList(f29865x + f29866y);
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

    public final org.telegram.ui.Components.q00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r00.a(boolean):org.telegram.ui.Components.q00");
    }

    public void c(boolean z10) {
        this.f29872n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f29869c = true;
        this.d = false;
        this.f29871f = 0;
        this.f29870e = 1.0f;
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
        } else if (z10 && f29864w == null) {
            f29864w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f29864w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f29864w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f29865x;
        int clamp = Utilities.clamp(i13 - this.f29873r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f29873r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f29868b);
        this.f29868b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f29873r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            q00 q00Var = (q00) arrayList.get(i11);
            r00 r00Var = q00Var.f29539l;
            byte b10 = q00Var.f29530a;
            Paint[] paintArr = f29863s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(q00Var.f29535g, q00Var.h, AndroidUtilities.dp(q00Var.d), paintArr[q00Var.f29531b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = r00Var.f29867a;
                    f10 = 16.0f;
                    rectF.set(q00Var.f29535g - AndroidUtilities.dp(q00Var.d), q00Var.h - AndroidUtilities.dp(2.0f), q00Var.f29535g + AndroidUtilities.dp(q00Var.d), q00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(q00Var.f29536i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[q00Var.f29531b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f29864w;
                        if (drawableArr != null) {
                            drawable = drawableArr[q00Var.f29531b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[q00Var.f29531b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) q00Var.f29535g;
                            int i13 = (int) q00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(q00Var.f29536i, q00Var.f29535g, q00Var.h);
                            float f11 = q00Var.d / 6.0f;
                            canvas.scale(f11, f11, q00Var.f29535g, q00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            r00 r00Var2 = q00Var.f29539l;
            float f12 = i10 / f10;
            float f13 = q00Var.f29535g;
            float f14 = q00Var.f29537j;
            q00Var.f29535g = (f14 * f12) + f13;
            q00Var.h = (q00Var.f29538k * f12) + q00Var.h;
            if (q00Var.f29533e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (q00Var.f29533e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, q00Var.f29537j);
                    q00Var.f29537j = x10;
                    if (x10 >= dp) {
                        q00Var.f29533e = (byte) 2;
                    }
                } else {
                    float f15 = q00Var.f29537j - ((dp * f12) * 0.05f);
                    q00Var.f29537j = f15;
                    if (f15 <= (-dp)) {
                        q00Var.f29533e = (byte) 1;
                    }
                }
            } else if (q00Var.f29532c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    q00Var.f29537j = f16;
                    if (f16 <= 0.0f) {
                        q00Var.f29537j = 0.0f;
                        q00Var.f29533e = q00Var.f29534f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                q00Var.f29537j = f17;
                if (f17 >= 0.0f) {
                    q00Var.f29537j = 0.0f;
                    q00Var.f29533e = q00Var.f29534f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = q00Var.f29538k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                q00Var.f29538k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * r00Var2.f29870e) + f19;
            } else {
                q00Var.f29538k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && q00Var.f29538k > f18) {
                r00Var2.f29871f++;
            }
            byte b11 = q00Var.f29530a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + q00Var.f29536i);
                q00Var.f29536i = s10;
                if (s10 > 360) {
                    q00Var.f29536i = (short) (s10 - 360);
                }
            }
            if (q00Var.h >= r00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f29871f >= f29865x / 2 && this.f29870e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f29866y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.wl.c(i10, 16.0f, 0.15f, this.f29870e);
            this.f29870e = c10;
            if (c10 < 0.2f) {
                this.f29870e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f29869c = false;
        AndroidUtilities.runOnUIThread(new wp(this, 18));
        b();
    }

    public void b() {
    }
}
