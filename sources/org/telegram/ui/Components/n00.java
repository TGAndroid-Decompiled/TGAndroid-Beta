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
public class n00 extends View {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final Paint[] f30789s;
    public static Drawable[] v;
    public static Drawable[] f30790w;
    public static final int f30791x;
    public static final int f30792y;
    public final RectF f30793a;
    public long f30794b;
    public boolean f30795c;
    public boolean d;
    public float f30796e;
    public int f30797f;
    public boolean h;
    public boolean f30798n;
    public final ArrayList f30799r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f30791x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f30792y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        A = iArr;
        B = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        C = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f30789s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f30789s;
            if (i12 < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i12] = paint;
                paint.setColor(A[i12]);
                i12++;
            } else {
                return;
            }
        }
    }

    public n00(Context context) {
        super(context);
        this.f30793a = new RectF();
        this.f30796e = 1.0f;
        this.f30799r = new ArrayList(f30791x + f30792y);
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

    public final org.telegram.ui.Components.m00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n00.a(boolean):org.telegram.ui.Components.m00");
    }

    public void c(boolean z10) {
        this.f30798n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f30795c = true;
        this.d = false;
        this.f30797f = 0;
        this.f30796e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i10 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (z11) {
            if (v == null) {
                v = new Drawable[B.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = v;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                    v[i11].setColorFilter(new PorterDuffColorFilter(B[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (z10 && f30790w == null) {
            f30790w = new Drawable[C.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f30790w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f30790w[i12].setColorFilter(new PorterDuffColorFilter(C[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f30791x;
        int clamp = Utilities.clamp(i13 - this.f30799r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f30799r.add(a(false));
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        Drawable drawable;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (elapsedRealtime - this.f30794b);
        this.f30794b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f30799r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            m00 m00Var = (m00) arrayList.get(i11);
            n00 n00Var = m00Var.f30497l;
            byte b10 = m00Var.f30488a;
            Paint[] paintArr = f30789s;
            if (b10 == 0) {
                f9 = 2.0f;
                canvas.drawCircle(m00Var.f30493g, m00Var.h, AndroidUtilities.dp(m00Var.d), paintArr[m00Var.f30489b]);
                f10 = 16.0f;
            } else {
                f9 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = n00Var.f30793a;
                    f10 = 16.0f;
                    rectF.set(m00Var.f30493g - AndroidUtilities.dp(m00Var.d), m00Var.h - AndroidUtilities.dp(2.0f), m00Var.f30493g + AndroidUtilities.dp(m00Var.d), m00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(m00Var.f30494i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[m00Var.f30489b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f30790w;
                        if (drawableArr != null) {
                            drawable = drawableArr[m00Var.f30489b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[m00Var.f30489b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) m00Var.f30493g;
                            int i13 = (int) m00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(m00Var.f30494i, m00Var.f30493g, m00Var.h);
                            float f11 = m00Var.d / 6.0f;
                            canvas.scale(f11, f11, m00Var.f30493g, m00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            n00 n00Var2 = m00Var.f30497l;
            float f12 = i10 / f10;
            float f13 = m00Var.f30493g;
            float f14 = m00Var.f30495j;
            m00Var.f30493g = (f14 * f12) + f13;
            m00Var.h = (m00Var.f30496k * f12) + m00Var.h;
            if (m00Var.f30491e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (m00Var.f30491e == 1) {
                    float x4 = com.google.android.recaptcha.internal.a.x(dp, f12, 0.05f, m00Var.f30495j);
                    m00Var.f30495j = x4;
                    if (x4 >= dp) {
                        m00Var.f30491e = (byte) 2;
                    }
                } else {
                    float f15 = m00Var.f30495j - ((dp * f12) * 0.05f);
                    m00Var.f30495j = f15;
                    if (f15 <= (-dp)) {
                        m00Var.f30491e = (byte) 1;
                    }
                }
            } else if (m00Var.f30490c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    m00Var.f30495j = f16;
                    if (f16 <= 0.0f) {
                        m00Var.f30495j = 0.0f;
                        m00Var.f30491e = m00Var.f30492f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                m00Var.f30495j = f17;
                if (f17 >= 0.0f) {
                    m00Var.f30495j = 0.0f;
                    m00Var.f30491e = m00Var.f30492f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f9;
            float f19 = m00Var.f30496k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                m00Var.f30496k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * n00Var2.f30796e) + f19;
            } else {
                m00Var.f30496k = u3.c.c(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && m00Var.f30496k > f18) {
                n00Var2.f30797f++;
            }
            byte b11 = m00Var.f30488a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + m00Var.f30494i);
                m00Var.f30494i = s10;
                if (s10 > 360) {
                    m00Var.f30494i = (short) (s10 - 360);
                }
            }
            if (m00Var.h >= n00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f30797f >= f30791x / 2 && this.f30796e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f30792y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float A2 = org.telegram.messenger.x3.A(i10, 16.0f, 0.15f, this.f30796e);
            this.f30796e = A2;
            if (A2 < 0.2f) {
                this.f30796e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f30795c = false;
        AndroidUtilities.runOnUIThread(new rp(this, 18));
        b();
    }

    public void b() {
    }
}
