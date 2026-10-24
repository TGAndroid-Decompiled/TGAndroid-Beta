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
public class x00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f32462s;
    public static Drawable[] v;
    public static Drawable[] f32463w;
    public static final int f32464x;
    public static final int f32465y;
    public final RectF f32466a;
    public long f32467b;
    public boolean f32468c;
    public boolean d;
    public float e;
    public int f32469f;
    public boolean h;
    public boolean f32470n;
    public final ArrayList f32471r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f32464x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f32465y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f32462s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f32462s;
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

    public x00(Context context) {
        super(context);
        this.f32466a = new RectF();
        this.e = 1.0f;
        this.f32471r = new ArrayList(f32464x + f32465y);
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

    public final org.telegram.ui.Components.w00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x00.a(boolean):org.telegram.ui.Components.w00");
    }

    public void c(boolean z10) {
        this.f32470n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f32468c = true;
        this.d = false;
        this.f32469f = 0;
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
        } else if (z10 && f32463w == null) {
            f32463w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f32463w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f32463w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f32464x;
        int clamp = Utilities.clamp(i13 - this.f32471r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f32471r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f32467b);
        this.f32467b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f32471r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            w00 w00Var = (w00) arrayList.get(i11);
            x00 x00Var = w00Var.f32095l;
            byte b10 = w00Var.f32087a;
            Paint[] paintArr = f32462s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(w00Var.f32091g, w00Var.h, AndroidUtilities.dp(w00Var.d), paintArr[w00Var.f32088b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = x00Var.f32466a;
                    f10 = 16.0f;
                    rectF.set(w00Var.f32091g - AndroidUtilities.dp(w00Var.d), w00Var.h - AndroidUtilities.dp(2.0f), w00Var.f32091g + AndroidUtilities.dp(w00Var.d), w00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(w00Var.f32092i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[w00Var.f32088b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f32463w;
                        if (drawableArr != null) {
                            drawable = drawableArr[w00Var.f32088b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[w00Var.f32088b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) w00Var.f32091g;
                            int i13 = (int) w00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(w00Var.f32092i, w00Var.f32091g, w00Var.h);
                            float f11 = w00Var.d / 6.0f;
                            canvas.scale(f11, f11, w00Var.f32091g, w00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            x00 x00Var2 = w00Var.f32095l;
            float f12 = i10 / f10;
            float f13 = w00Var.f32091g;
            float f14 = w00Var.f32093j;
            w00Var.f32091g = (f14 * f12) + f13;
            w00Var.h = (w00Var.f32094k * f12) + w00Var.h;
            if (w00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (w00Var.e == 1) {
                    float t10 = com.google.android.gms.internal.play_billing.k3.t(dp, f12, 0.05f, w00Var.f32093j);
                    w00Var.f32093j = t10;
                    if (t10 >= dp) {
                        w00Var.e = (byte) 2;
                    }
                } else {
                    float x10 = org.telegram.ui.Cells.b1.x(dp, f12, 0.05f, w00Var.f32093j);
                    w00Var.f32093j = x10;
                    if (x10 <= (-dp)) {
                        w00Var.e = (byte) 1;
                    }
                }
            } else if (w00Var.f32089c == 0) {
                if (f14 > 0.0f) {
                    float f15 = f14 - (0.05f * f12);
                    w00Var.f32093j = f15;
                    if (f15 <= 0.0f) {
                        w00Var.f32093j = 0.0f;
                        w00Var.e = w00Var.f32090f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f16 = (0.05f * f12) + f14;
                w00Var.f32093j = f16;
                if (f16 >= 0.0f) {
                    w00Var.f32093j = 0.0f;
                    w00Var.e = w00Var.f32090f;
                }
            }
            float f17 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f18 = w00Var.f32094k;
            if (f18 < f17) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f18 > f17) {
                w00Var.f32094k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * x00Var2.e) + f18;
            } else {
                w00Var.f32094k = a1.g.d(AndroidUtilities.dp(1.0f), 3.0f, f12, f18);
            }
            if (z10 && w00Var.f32094k > f17) {
                x00Var2.f32469f++;
            }
            byte b11 = w00Var.f32087a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + w00Var.f32092i);
                w00Var.f32092i = s10;
                if (s10 > 360) {
                    w00Var.f32092i = (short) (s10 - 360);
                }
            }
            if (w00Var.h >= x00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f32469f >= f32464x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f32465y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float x11 = org.telegram.messenger.tl.x(i10, 16.0f, 0.15f, this.e);
            this.e = x11;
            if (x11 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f32468c = false;
        AndroidUtilities.runOnUIThread(new xp(this, 19));
        b();
    }

    public void b() {
    }
}
