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
public class i10 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f27192s;
    public static Drawable[] v;
    public static Drawable[] f27193w;
    public static final int f27194x;
    public static final int f27195y;
    public final RectF f27196a;
    public long f27197b;
    public boolean f27198c;
    public boolean d;
    public float f27199e;
    public int f27200f;
    public boolean h;
    public boolean f27201n;
    public final ArrayList f27202r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f27194x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f27195y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f27192s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f27192s;
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

    public i10(Context context) {
        super(context);
        this.f27196a = new RectF();
        this.f27199e = 1.0f;
        this.f27202r = new ArrayList(f27194x + f27195y);
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

    public final org.telegram.ui.Components.h10 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i10.a(boolean):org.telegram.ui.Components.h10");
    }

    public void c(boolean z10) {
        this.f27201n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f27198c = true;
        this.d = false;
        this.f27200f = 0;
        this.f27199e = 1.0f;
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
        } else if (z10 && f27193w == null) {
            f27193w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f27193w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f27193w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f27194x;
        int clamp = Utilities.clamp(i13 - this.f27202r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f27202r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f27197b);
        this.f27197b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f27202r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            h10 h10Var = (h10) arrayList.get(i11);
            i10 i10Var = h10Var.f26905l;
            byte b10 = h10Var.f26896a;
            Paint[] paintArr = f27192s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(h10Var.f26901g, h10Var.h, AndroidUtilities.dp(h10Var.d), paintArr[h10Var.f26897b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = i10Var.f27196a;
                    f10 = 16.0f;
                    rectF.set(h10Var.f26901g - AndroidUtilities.dp(h10Var.d), h10Var.h - AndroidUtilities.dp(2.0f), h10Var.f26901g + AndroidUtilities.dp(h10Var.d), h10Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(h10Var.f26902i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[h10Var.f26897b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f27193w;
                        if (drawableArr != null) {
                            drawable = drawableArr[h10Var.f26897b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[h10Var.f26897b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) h10Var.f26901g;
                            int i13 = (int) h10Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(h10Var.f26902i, h10Var.f26901g, h10Var.h);
                            float f11 = h10Var.d / 6.0f;
                            canvas.scale(f11, f11, h10Var.f26901g, h10Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            i10 i10Var2 = h10Var.f26905l;
            float f12 = i10 / f10;
            float f13 = h10Var.f26901g;
            float f14 = h10Var.f26903j;
            h10Var.f26901g = (f14 * f12) + f13;
            h10Var.h = (h10Var.f26904k * f12) + h10Var.h;
            if (h10Var.f26899e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (h10Var.f26899e == 1) {
                    float w10 = com.google.android.gms.internal.vision.e2.w(dp, f12, 0.05f, h10Var.f26903j);
                    h10Var.f26903j = w10;
                    if (w10 >= dp) {
                        h10Var.f26899e = (byte) 2;
                    }
                } else {
                    float f15 = h10Var.f26903j - ((dp * f12) * 0.05f);
                    h10Var.f26903j = f15;
                    if (f15 <= (-dp)) {
                        h10Var.f26899e = (byte) 1;
                    }
                }
            } else if (h10Var.f26898c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    h10Var.f26903j = f16;
                    if (f16 <= 0.0f) {
                        h10Var.f26903j = 0.0f;
                        h10Var.f26899e = h10Var.f26900f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                h10Var.f26903j = f17;
                if (f17 >= 0.0f) {
                    h10Var.f26903j = 0.0f;
                    h10Var.f26899e = h10Var.f26900f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = h10Var.f26904k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                h10Var.f26904k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * i10Var2.f27199e) + f19;
            } else {
                h10Var.f26904k = a1.g.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && h10Var.f26904k > f18) {
                i10Var2.f27200f++;
            }
            byte b11 = h10Var.f26896a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + h10Var.f26902i);
                h10Var.f26902i = s10;
                if (s10 > 360) {
                    h10Var.f26902i = (short) (s10 - 360);
                }
            }
            if (h10Var.h >= i10Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f27200f >= f27194x / 2 && this.f27199e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f27195y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.bi.b(i10, 16.0f, 0.15f, this.f27199e);
            this.f27199e = b12;
            if (b12 < 0.2f) {
                this.f27199e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f27198c = false;
        AndroidUtilities.runOnUIThread(new nq(this, 18));
        b();
    }

    public void b() {
    }
}
