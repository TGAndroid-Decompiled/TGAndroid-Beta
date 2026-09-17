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
    public static final Paint[] f27472s;
    public static Drawable[] v;
    public static Drawable[] f27473w;
    public static final int f27474x;
    public static final int f27475y;
    public final RectF f27476a;
    public long f27477b;
    public boolean f27478c;
    public boolean d;
    public float e;
    public int f27479f;
    public boolean h;
    public boolean f27480n;
    public final ArrayList f27481r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f27474x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f27475y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f27472s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f27472s;
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
        this.f27476a = new RectF();
        this.e = 1.0f;
        this.f27481r = new ArrayList(f27474x + f27475y);
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
        this.f27480n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f27478c = true;
        this.d = false;
        this.f27479f = 0;
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
        } else if (z10 && f27473w == null) {
            f27473w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f27473w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f27473w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f27474x;
        int clamp = Utilities.clamp(i13 - this.f27481r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f27481r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f27477b);
        this.f27477b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f27481r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            q00 q00Var = (q00) arrayList.get(i11);
            r00 r00Var = q00Var.f27183l;
            byte b10 = q00Var.f27175a;
            Paint[] paintArr = f27472s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(q00Var.f27179g, q00Var.h, AndroidUtilities.dp(q00Var.d), paintArr[q00Var.f27176b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = r00Var.f27476a;
                    f10 = 16.0f;
                    rectF.set(q00Var.f27179g - AndroidUtilities.dp(q00Var.d), q00Var.h - AndroidUtilities.dp(2.0f), q00Var.f27179g + AndroidUtilities.dp(q00Var.d), q00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(q00Var.f27180i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[q00Var.f27176b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f27473w;
                        if (drawableArr != null) {
                            drawable = drawableArr[q00Var.f27176b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[q00Var.f27176b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) q00Var.f27179g;
                            int i13 = (int) q00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(q00Var.f27180i, q00Var.f27179g, q00Var.h);
                            float f11 = q00Var.d / 6.0f;
                            canvas.scale(f11, f11, q00Var.f27179g, q00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            r00 r00Var2 = q00Var.f27183l;
            float f12 = i10 / f10;
            float f13 = q00Var.f27179g;
            float f14 = q00Var.f27181j;
            q00Var.f27179g = (f14 * f12) + f13;
            q00Var.h = (q00Var.f27182k * f12) + q00Var.h;
            if (q00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (q00Var.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, q00Var.f27181j);
                    q00Var.f27181j = x10;
                    if (x10 >= dp) {
                        q00Var.e = (byte) 2;
                    }
                } else {
                    float f15 = q00Var.f27181j - ((dp * f12) * 0.05f);
                    q00Var.f27181j = f15;
                    if (f15 <= (-dp)) {
                        q00Var.e = (byte) 1;
                    }
                }
            } else if (q00Var.f27177c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    q00Var.f27181j = f16;
                    if (f16 <= 0.0f) {
                        q00Var.f27181j = 0.0f;
                        q00Var.e = q00Var.f27178f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                q00Var.f27181j = f17;
                if (f17 >= 0.0f) {
                    q00Var.f27181j = 0.0f;
                    q00Var.e = q00Var.f27178f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = q00Var.f27182k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                q00Var.f27182k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * r00Var2.e) + f19;
            } else {
                q00Var.f27182k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && q00Var.f27182k > f18) {
                r00Var2.f27479f++;
            }
            byte b11 = q00Var.f27175a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + q00Var.f27180i);
                q00Var.f27180i = s10;
                if (s10 > 360) {
                    q00Var.f27180i = (short) (s10 - 360);
                }
            }
            if (q00Var.h >= r00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f27479f >= f27474x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f27475y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.wl.c(i10, 16.0f, 0.15f, this.e);
            this.e = c10;
            if (c10 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f27478c = false;
        AndroidUtilities.runOnUIThread(new xp(this, 18));
        b();
    }

    public void b() {
    }
}
