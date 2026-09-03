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
    public static final Paint[] f30938s;
    public static Drawable[] v;
    public static Drawable[] f30939w;
    public static final int f30940x;
    public static final int f30941y;
    public final RectF f30942a;
    public long f30943b;
    public boolean f30944c;
    public boolean d;
    public float f30945e;
    public int f30946f;
    public boolean h;
    public boolean f30947n;
    public final ArrayList f30948r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f30940x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f30941y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        B = iArr;
        C = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        D = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f30938s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f30938s;
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
        this.f30942a = new RectF();
        this.f30945e = 1.0f;
        this.f30948r = new ArrayList(f30940x + f30941y);
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
        this.f30947n = z4;
        setLayerType(2, null);
        boolean z10 = true;
        this.f30944c = true;
        this.d = false;
        this.f30946f = 0;
        this.f30945e = 1.0f;
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
        } else if (z4 && f30939w == null) {
            f30939w = new Drawable[D.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f30939w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f30939w[i12].setColorFilter(new PorterDuffColorFilter(D[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f30940x;
        int clamp = Utilities.clamp(i13 - this.f30948r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f30948r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f30943b);
        this.f30943b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f30948r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            r00 r00Var = (r00) arrayList.get(i11);
            s00 s00Var = r00Var.f30592l;
            byte b10 = r00Var.f30583a;
            Paint[] paintArr = f30938s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(r00Var.f30588g, r00Var.h, AndroidUtilities.dp(r00Var.d), paintArr[r00Var.f30584b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = s00Var.f30942a;
                    f11 = 16.0f;
                    rectF.set(r00Var.f30588g - AndroidUtilities.dp(r00Var.d), r00Var.h - AndroidUtilities.dp(2.0f), r00Var.f30588g + AndroidUtilities.dp(r00Var.d), r00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(r00Var.f30589i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[r00Var.f30584b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f30939w;
                        if (drawableArr != null) {
                            drawable = drawableArr[r00Var.f30584b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[r00Var.f30584b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) r00Var.f30588g;
                            int i13 = (int) r00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(r00Var.f30589i, r00Var.f30588g, r00Var.h);
                            float f12 = r00Var.d / 6.0f;
                            canvas.scale(f12, f12, r00Var.f30588g, r00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            s00 s00Var2 = r00Var.f30592l;
            float f13 = i10 / f11;
            float f14 = r00Var.f30588g;
            float f15 = r00Var.f30590j;
            r00Var.f30588g = (f15 * f13) + f14;
            r00Var.h = (r00Var.f30591k * f13) + r00Var.h;
            if (r00Var.f30586e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (r00Var.f30586e == 1) {
                    float u10 = e2.c.u(dp, f13, 0.05f, r00Var.f30590j);
                    r00Var.f30590j = u10;
                    if (u10 >= dp) {
                        r00Var.f30586e = (byte) 2;
                    }
                } else {
                    float f16 = r00Var.f30590j - ((dp * f13) * 0.05f);
                    r00Var.f30590j = f16;
                    if (f16 <= (-dp)) {
                        r00Var.f30586e = (byte) 1;
                    }
                }
            } else if (r00Var.f30585c == 0) {
                if (f15 > 0.0f) {
                    float f17 = f15 - (0.05f * f13);
                    r00Var.f30590j = f17;
                    if (f17 <= 0.0f) {
                        r00Var.f30590j = 0.0f;
                        r00Var.f30586e = r00Var.f30587f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f18 = (0.05f * f13) + f15;
                r00Var.f30590j = f18;
                if (f18 >= 0.0f) {
                    r00Var.f30590j = 0.0f;
                    r00Var.f30586e = r00Var.f30587f;
                }
            }
            float f19 = (-AndroidUtilities.dp(1.0f)) / f10;
            float f20 = r00Var.f30591k;
            if (f20 < f19) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (f20 > f19) {
                r00Var.f30591k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f13 * s00Var2.f30945e) + f20;
            } else {
                r00Var.f30591k = w.c.c(AndroidUtilities.dp(1.0f), 3.0f, f13, f20);
            }
            if (z4 && r00Var.f30591k > f19) {
                s00Var2.f30946f++;
            }
            byte b11 = r00Var.f30583a;
            if (b11 == 1 || b11 == 2) {
                short s6 = (short) ((f13 * 10.0f) + r00Var.f30589i);
                r00Var.f30589i = s6;
                if (s6 > 360) {
                    r00Var.f30589i = (short) (s6 - 360);
                }
            }
            if (r00Var.h >= s00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f30946f >= f30940x / 2 && this.f30945e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f30941y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float A = org.telegram.messenger.y3.A(i10, 16.0f, 0.15f, this.f30945e);
            this.f30945e = A;
            if (A < 0.2f) {
                this.f30945e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f30944c = false;
        AndroidUtilities.runOnUIThread(new xp(this, 18));
        b();
    }

    public void b() {
    }
}
