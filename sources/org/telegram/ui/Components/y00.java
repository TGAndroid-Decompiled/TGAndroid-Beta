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
public class y00 extends View {
    public static final int[] E;
    public static final int[] F;
    public static final int[] G;
    public static final Paint[] f29203s;
    public static Drawable[] v;
    public static Drawable[] f29204w;
    public static final int f29205x;
    public static final int f29206y;
    public final RectF f29207a;
    public long f29208b;
    public boolean f29209c;
    public boolean d;
    public float e;
    public int f29210f;
    public boolean h;
    public boolean f29211n;
    public final ArrayList f29212r;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = 50;
        } else {
            i10 = 60;
        }
        f29205x = i10;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i11 = 20;
        } else {
            i11 = 30;
        }
        f29206y = i11;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        E = iArr;
        F = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        G = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f29203s = new Paint[iArr.length];
        int i12 = 0;
        while (true) {
            Paint[] paintArr = f29203s;
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

    public y00(Context context) {
        super(context);
        this.f29207a = new RectF();
        this.e = 1.0f;
        this.f29212r = new ArrayList(f29205x + f29206y);
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

    public final org.telegram.ui.Components.x00 a(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y00.a(boolean):org.telegram.ui.Components.x00");
    }

    public void c(boolean z10) {
        this.f29211n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f29209c = true;
        this.d = false;
        this.f29210f = 0;
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
        } else if (z10 && f29204w == null) {
            f29204w = new Drawable[G.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = f29204w;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                f29204w[i12].setColorFilter(new PorterDuffColorFilter(G[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f29205x;
        int clamp = Utilities.clamp(i13 - this.f29212r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < clamp; i14++) {
            this.f29212r.add(a(false));
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
        int i10 = (int) (elapsedRealtime - this.f29208b);
        this.f29208b = elapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f29212r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            x00 x00Var = (x00) arrayList.get(i11);
            y00 y00Var = x00Var.f28899l;
            byte b10 = x00Var.f28891a;
            Paint[] paintArr = f29203s;
            if (b10 == 0) {
                f7 = 2.0f;
                canvas.drawCircle(x00Var.f28895g, x00Var.h, AndroidUtilities.dp(x00Var.d), paintArr[x00Var.f28892b]);
                f10 = 16.0f;
            } else {
                f7 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = y00Var.f29207a;
                    f10 = 16.0f;
                    rectF.set(x00Var.f28895g - AndroidUtilities.dp(x00Var.d), x00Var.h - AndroidUtilities.dp(2.0f), x00Var.f28895g + AndroidUtilities.dp(x00Var.d), x00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(x00Var.f28896i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[x00Var.f28892b]);
                    canvas.restore();
                } else {
                    f10 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f29204w;
                        if (drawableArr != null) {
                            drawable = drawableArr[x00Var.f28892b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[x00Var.f28892b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) x00Var.f28895g;
                            int i13 = (int) x00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(x00Var.f28896i, x00Var.f28895g, x00Var.h);
                            float f11 = x00Var.d / 6.0f;
                            canvas.scale(f11, f11, x00Var.f28895g, x00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            y00 y00Var2 = x00Var.f28899l;
            float f12 = i10 / f10;
            float f13 = x00Var.f28895g;
            float f14 = x00Var.f28897j;
            x00Var.f28895g = (f14 * f12) + f13;
            x00Var.h = (x00Var.f28898k * f12) + x00Var.h;
            if (x00Var.e != 0) {
                float dp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (x00Var.e == 1) {
                    float x10 = com.google.android.gms.internal.vision.e2.x(dp, f12, 0.05f, x00Var.f28897j);
                    x00Var.f28897j = x10;
                    if (x10 >= dp) {
                        x00Var.e = (byte) 2;
                    }
                } else {
                    float f15 = x00Var.f28897j - ((dp * f12) * 0.05f);
                    x00Var.f28897j = f15;
                    if (f15 <= (-dp)) {
                        x00Var.e = (byte) 1;
                    }
                }
            } else if (x00Var.f28893c == 0) {
                if (f14 > 0.0f) {
                    float f16 = f14 - (0.05f * f12);
                    x00Var.f28897j = f16;
                    if (f16 <= 0.0f) {
                        x00Var.f28897j = 0.0f;
                        x00Var.e = x00Var.f28894f;
                    }
                }
            } else if (f14 < 0.0f) {
                float f17 = (0.05f * f12) + f14;
                x00Var.f28897j = f17;
                if (f17 >= 0.0f) {
                    x00Var.f28897j = 0.0f;
                    x00Var.e = x00Var.f28894f;
                }
            }
            float f18 = (-AndroidUtilities.dp(1.0f)) / f7;
            float f19 = x00Var.f28898k;
            if (f19 < f18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (f19 > f18) {
                x00Var.f28898k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f12 * y00Var2.e) + f19;
            } else {
                x00Var.f28898k = a4.a.e(AndroidUtilities.dp(1.0f), 3.0f, f12, f19);
            }
            if (z10 && x00Var.f28898k > f18) {
                y00Var2.f29210f++;
            }
            byte b11 = x00Var.f28891a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f12 * 10.0f) + x00Var.f28896i);
                x00Var.f28896i = s10;
                if (s10 > 360) {
                    x00Var.f28896i = (short) (s10 - 360);
                }
            }
            if (x00Var.h >= y00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f29210f >= f29205x / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f29206y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float c10 = org.telegram.messenger.em.c(i10, 16.0f, 0.15f, this.e);
            this.e = c10;
            if (c10 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f29209c = false;
        AndroidUtilities.runOnUIThread(new dq(this, 18));
        b();
    }

    public void b() {
    }
}
