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
public class k10 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f27713s;
    public static Drawable[] v;
    public static Drawable[] f27714w;
    public static final int f27715x;
    public static final int f27716y;
    public final RectF f27717a;
    public long f27718b;
    public boolean f27719c;
    public boolean d;
    public float f27720e;
    public int f27721f;
    public boolean h;
    public boolean f27722n;
    public final ArrayList f27723r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f27715x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f27716y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f27713s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f27713s;
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

    public k10(Context context) {
        super(context);
        this.f27717a = new RectF();
        this.f27720e = 1.0f;
        this.f27723r = new ArrayList(f27715x + f27716y);
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

    public final org.telegram.ui.Components.j10 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k10.a(boolean):org.telegram.ui.Components.j10");
    }

    public void c(boolean z10) {
        this.f27722n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f27719c = true;
        this.d = false;
        this.f27721f = 0;
        this.f27720e = 1.0f;
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
        } else if (z10 && f27714w == null) {
            f27714w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f27714w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f27714w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f27715x;
        int clamp = Utilities.clamp(i13 - this.f27723r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f27723r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f27718b);
        this.f27718b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f27723r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            j10 j10Var = (j10) arrayList.get(i11);
            k10 k10Var = j10Var.f27329l;
            byte b10 = j10Var.f27320a;
            Paint[] paintArr = f27713s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(j10Var.f27325g, j10Var.h, AndroidUtilities.dp(j10Var.d), paintArr[j10Var.f27321b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = k10Var.f27717a;
                    f10 = 16.0f;
                    rectF.set(j10Var.f27325g - AndroidUtilities.dp(j10Var.d), j10Var.h - AndroidUtilities.dp(2.0f), j10Var.f27325g + AndroidUtilities.dp(j10Var.d), j10Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(j10Var.f27326i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[j10Var.f27321b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f27714w;
                        if (drawableArr != null) {
                            drawable = drawableArr[j10Var.f27321b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[j10Var.f27321b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) j10Var.f27325g;
                            int i13 = (int) j10Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(j10Var.f27326i, j10Var.f27325g, j10Var.h);
                            float f11 = j10Var.d / 6.0f;
                            canvas.scale(f11, f11, j10Var.f27325g, j10Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            k10 k10Var2 = j10Var.f27329l;
            float f12 = i10 / f10;
            float f13 = j10Var.f27325g;
            float f14 = j10Var.f27327j;
            j10Var.f27325g = (f14 * f12) + f13;
            j10Var.h = (j10Var.f27328k * f12) + j10Var.h;
            if (j10Var.f27323e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (j10Var.f27323e == 1) {
                    float w10 = com.google.android.gms.internal.vision.e2.w(dp, f12, 0.05f, j10Var.f27327j);
                    j10Var.f27327j = w10;
                    if (w10 >= dp) {
                        j10Var.f27323e = (byte) 2;
                    }
                } else {
                    float f15 = j10Var.f27327j - ((dp * f12) * 0.05f);
                    j10Var.f27327j = f15;
                    if (f15 <= (-dp)) {
                        j10Var.f27323e = (byte) 1;
                    }
                }
            } else if (j10Var.f27322c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    j10Var.f27327j = f16;
                    if (f16 <= 0.0f) {
                        j10Var.f27327j = 0.0f;
                        j10Var.f27323e = j10Var.f27324f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                j10Var.f27327j = f17;
                if (f17 >= 0.0f) {
                    j10Var.f27327j = 0.0f;
                    j10Var.f27323e = j10Var.f27324f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = j10Var.f27328k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                j10Var.f27328k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * k10Var2.f27720e) + f19;
            } else {
                j10Var.f27328k = a1.g.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && j10Var.f27328k > f18) {
                k10Var2.f27721f++;
            }
            byte b11 = j10Var.f27320a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + j10Var.f27326i);
                j10Var.f27326i = s10;
                if (s10 > 360) {
                    j10Var.f27326i = (short) (s10 - 360);
                }
            }
            if (j10Var.h >= k10Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f27721f >= f27715x / 2 && this.f27720e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f27716y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.am.b(i10, 16.0f, 0.15f, this.f27720e);
            this.f27720e = b12;
            if (b12 < 0.2f) {
                this.f27720e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f27719c = false;
        AndroidUtilities.runOnUIThread(new pq(this, 18));
        b();
    }

    public void b() {
    }
}
