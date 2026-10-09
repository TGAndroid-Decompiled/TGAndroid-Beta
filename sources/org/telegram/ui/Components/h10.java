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
public class h10 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f26923s;
    public static Drawable[] v;
    public static Drawable[] f26924w;
    public static final int f26925x;
    public static final int f26926y;
    public final RectF f26927a;
    public long f26928b;
    public boolean f26929c;
    public boolean d;
    public float f26930e;
    public int f26931f;
    public boolean h;
    public boolean f26932n;
    public final ArrayList f26933r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f26925x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f26926y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f26923s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f26923s;
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

    public h10(Context context) {
        super(context);
        this.f26927a = new RectF();
        this.f26930e = 1.0f;
        this.f26933r = new ArrayList(f26925x + f26926y);
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

    public final org.telegram.ui.Components.g10 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h10.a(boolean):org.telegram.ui.Components.g10");
    }

    public void c(boolean z10) {
        this.f26932n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f26929c = true;
        this.d = false;
        this.f26931f = 0;
        this.f26930e = 1.0f;
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
        } else if (z10 && f26924w == null) {
            f26924w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f26924w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f26924w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f26925x;
        int clamp = Utilities.clamp(i13 - this.f26933r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f26933r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f26928b);
        this.f26928b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f26933r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            g10 g10Var = (g10) arrayList.get(i11);
            h10 h10Var = g10Var.f26551l;
            byte b10 = g10Var.f26542a;
            Paint[] paintArr = f26923s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(g10Var.f26547g, g10Var.h, AndroidUtilities.dp(g10Var.d), paintArr[g10Var.f26543b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = h10Var.f26927a;
                    f10 = 16.0f;
                    rectF.set(g10Var.f26547g - AndroidUtilities.dp(g10Var.d), g10Var.h - AndroidUtilities.dp(2.0f), g10Var.f26547g + AndroidUtilities.dp(g10Var.d), g10Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(g10Var.f26548i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[g10Var.f26543b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f26924w;
                        if (drawableArr != null) {
                            drawable = drawableArr[g10Var.f26543b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[g10Var.f26543b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) g10Var.f26547g;
                            int i13 = (int) g10Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(g10Var.f26548i, g10Var.f26547g, g10Var.h);
                            float f11 = g10Var.d / 6.0f;
                            canvas.scale(f11, f11, g10Var.f26547g, g10Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            h10 h10Var2 = g10Var.f26551l;
            float f12 = i10 / f10;
            float f13 = g10Var.f26547g;
            float f14 = g10Var.f26549j;
            g10Var.f26547g = (f14 * f12) + f13;
            g10Var.h = (g10Var.f26550k * f12) + g10Var.h;
            if (g10Var.f26545e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (g10Var.f26545e == 1) {
                    float w10 = com.google.android.gms.internal.vision.e2.w(dp, f12, 0.05f, g10Var.f26549j);
                    g10Var.f26549j = w10;
                    if (w10 >= dp) {
                        g10Var.f26545e = (byte) 2;
                    }
                } else {
                    float f15 = g10Var.f26549j - ((dp * f12) * 0.05f);
                    g10Var.f26549j = f15;
                    if (f15 <= (-dp)) {
                        g10Var.f26545e = (byte) 1;
                    }
                }
            } else if (g10Var.f26544c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    g10Var.f26549j = f16;
                    if (f16 <= 0.0f) {
                        g10Var.f26549j = 0.0f;
                        g10Var.f26545e = g10Var.f26546f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                g10Var.f26549j = f17;
                if (f17 >= 0.0f) {
                    g10Var.f26549j = 0.0f;
                    g10Var.f26545e = g10Var.f26546f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = g10Var.f26550k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                g10Var.f26550k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * h10Var2.f26930e) + f19;
            } else {
                g10Var.f26550k = a1.g.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && g10Var.f26550k > f18) {
                h10Var2.f26931f++;
            }
            byte b11 = g10Var.f26542a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + g10Var.f26548i);
                g10Var.f26548i = s10;
                if (s10 > 360) {
                    g10Var.f26548i = (short) (s10 - 360);
                }
            }
            if (g10Var.h >= h10Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f26931f >= f26925x / 2 && this.f26930e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f26926y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float b12 = org.telegram.messenger.bi.b(i10, 16.0f, 0.15f, this.f26930e);
            this.f26930e = b12;
            if (b12 < 0.2f) {
                this.f26930e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f26929c = false;
        AndroidUtilities.runOnUIThread(new nq(this, 18));
        b();
    }

    public void b() {
    }
}
