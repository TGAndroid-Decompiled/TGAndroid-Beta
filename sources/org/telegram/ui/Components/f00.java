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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class f00 extends View {
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;

    public static final Paint[] f28209s;
    public static Drawable[] v;

    public static Drawable[] f28210w;

    public static final int f28211x;

    public static final int f28212y;

    public final RectF f28213a;

    public long f28214b;

    public boolean f28215c;
    public boolean d;

    public float f28216e;

    public int f28217f;
    public boolean h;

    public boolean f28218n;

    public final ArrayList f28219r;

    static {
        f28211x = SharedConfig.getDevicePerformanceClass() == 0 ? 50 : 60;
        f28212y = SharedConfig.getDevicePerformanceClass() == 0 ? 20 : 30;
        int[] iArr = {-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        A = iArr;
        B = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        C = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        f28209s = new Paint[iArr.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = f28209s;
            if (i10 >= paintArr.length) {
                return;
            }
            Paint paint = new Paint(1);
            paintArr[i10] = paint;
            paint.setColor(A[i10]);
            i10++;
        }
    }

    public f00(Context context) {
        super(context);
        this.f28213a = new RectF();
        this.f28216e = 1.0f;
        this.f28219r = new ArrayList(f28211x + f28212y);
    }

    private int getHeightForAnimation() {
        return getMeasuredHeight() == 0 ? ((View) getParent()).getHeight() : getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        return getMeasuredWidth() == 0 ? ((View) getParent()).getWidth() : getMeasuredWidth();
    }

    public final e00 a(boolean z10) {
        e00 e00Var = new e00(this);
        try {
            byte bNextInt = (byte) Utilities.random.nextInt(2);
            e00Var.f27903a = bNextInt;
            if (this.h && bNextInt == 0) {
                e00Var.f27903a = (byte) 2;
                e00Var.f27904b = (byte) Utilities.random.nextInt(B.length);
            } else if (this.f28218n && Utilities.random.nextBoolean()) {
                e00Var.f27903a = (byte) 2;
                e00Var.f27904b = (byte) Utilities.random.nextInt(C.length);
            } else {
                e00Var.f27904b = (byte) Utilities.random.nextInt(A.length);
            }
            e00Var.f27905c = (byte) Utilities.random.nextInt(2);
            e00Var.f27907f = (byte) (Utilities.random.nextInt(2) + 1);
            byte b10 = e00Var.f27903a;
            if (b10 == 0 || b10 == 2) {
                e00Var.d = (byte) ((Utilities.random.nextFloat() * 2.0f) + 4.0f);
            } else {
                e00Var.d = (byte) ((Utilities.random.nextFloat() * 4.0f) + 4.0f);
            }
            if (z10) {
                e00Var.h = (-Utilities.random.nextFloat()) * getHeightForAnimation() * 1.2f;
                e00Var.f27908g = AndroidUtilities.dp(5.0f) + Utilities.random.nextInt(Math.max(1, getWidthForAnimation() - AndroidUtilities.dp(10.0f)));
                e00Var.f27906e = e00Var.f27907f;
                return e00Var;
            }
            int iDp = AndroidUtilities.dp(Utilities.random.nextInt(10) + 4);
            int heightForAnimation = getHeightForAnimation() / 4;
            if (e00Var.f27905c == 0) {
                e00Var.f27908g = -iDp;
            } else {
                e00Var.f27908g = getWidthForAnimation() + iDp;
            }
            e00Var.f27910j = com.google.android.recaptcha.internal.a.B(Utilities.random.nextFloat(), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.2f), e00Var.f27905c == 0 ? 1 : -1);
            e00Var.f27911k = -((Utilities.random.nextFloat() * AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f));
            e00Var.h = (heightForAnimation / 2) + Utilities.random.nextInt(Math.max(1, heightForAnimation * 2));
            return e00Var;
        } catch (Exception e9) {
            FileLog.e(e9);
            return e00Var;
        }
    }

    public void c(boolean z10) {
        this.f28218n = z10;
        setLayerType(2, null);
        boolean z11 = true;
        this.f28215c = true;
        this.d = false;
        this.f28217f = 0;
        this.f28216e = 1.0f;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i10 = calendar.get(5);
        if (calendar.get(2) != 1 || (!BuildVars.DEBUG_PRIVATE_VERSION && i10 != 14)) {
            z11 = false;
        }
        this.h = z11;
        if (!z11) {
            if (z10 && f28210w == null) {
                f28210w = new Drawable[C.length];
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = f28210w;
                    if (i11 >= drawableArr.length) {
                        break;
                    }
                    drawableArr[i11] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
                    f28210w[i11].setColorFilter(new PorterDuffColorFilter(C[i11], PorterDuff.Mode.MULTIPLY));
                    i11++;
                }
            }
        } else if (v == null) {
            v = new Drawable[B.length];
            int i12 = 0;
            while (true) {
                Drawable[] drawableArr2 = v;
                if (i12 >= drawableArr2.length) {
                    break;
                }
                drawableArr2[i12] = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.heart_confetti).mutate();
                v[i12].setColorFilter(new PorterDuffColorFilter(B[i12], PorterDuff.Mode.MULTIPLY));
                i12++;
            }
        }
        int i13 = f28211x;
        int iClamp = Utilities.clamp(i13 - this.f28219r.size(), i13, i13 / 3);
        for (int i14 = 0; i14 < iClamp; i14++) {
            this.f28219r.add(a(false));
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = (int) (jElapsedRealtime - this.f28214b);
        this.f28214b = jElapsedRealtime;
        if (i10 > 18) {
            i10 = 16;
        }
        ArrayList arrayList = this.f28219r;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            e00 e00Var = (e00) arrayList.get(i11);
            f00 f00Var = e00Var.f27912l;
            byte b10 = e00Var.f27903a;
            Paint[] paintArr = f28209s;
            if (b10 == 0) {
                f10 = 2.0f;
                canvas.drawCircle(e00Var.f27908g, e00Var.h, AndroidUtilities.dp(e00Var.d), paintArr[e00Var.f27904b]);
                f11 = 16.0f;
            } else {
                f10 = 2.0f;
                if (b10 == 1) {
                    RectF rectF = f00Var.f28213a;
                    f11 = 16.0f;
                    rectF.set(e00Var.f27908g - AndroidUtilities.dp(e00Var.d), e00Var.h - AndroidUtilities.dp(2.0f), e00Var.f27908g + AndroidUtilities.dp(e00Var.d), e00Var.h + AndroidUtilities.dp(2.0f));
                    canvas.save();
                    canvas.rotate(e00Var.f27909i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paintArr[e00Var.f27904b]);
                    canvas.restore();
                } else {
                    f11 = 16.0f;
                    if (b10 == 2) {
                        Drawable[] drawableArr = f28210w;
                        Drawable drawable = drawableArr != null ? drawableArr[e00Var.f27904b] : null;
                        Drawable[] drawableArr2 = v;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[e00Var.f27904b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i12 = (int) e00Var.f27908g;
                            int i13 = (int) e00Var.h;
                            drawable.setBounds(i12 - intrinsicWidth, i13 - intrinsicHeight, i12 + intrinsicWidth, i13 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(e00Var.f27909i, e00Var.f27908g, e00Var.h);
                            float f12 = e00Var.d / 6.0f;
                            canvas.scale(f12, f12, e00Var.f27908g, e00Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            f00 f00Var2 = e00Var.f27912l;
            float f13 = i10 / f11;
            float f14 = e00Var.f27908g;
            float f15 = e00Var.f27910j;
            e00Var.f27908g = (f15 * f13) + f14;
            e00Var.h = (e00Var.f27911k * f13) + e00Var.h;
            if (e00Var.f27906e != 0) {
                float fDp = AndroidUtilities.dp(1.0f) * 0.5f;
                if (e00Var.f27906e == 1) {
                    float fX = com.google.android.recaptcha.internal.a.x(fDp, f13, 0.05f, e00Var.f27910j);
                    e00Var.f27910j = fX;
                    if (fX >= fDp) {
                        e00Var.f27906e = (byte) 2;
                    }
                } else {
                    float f16 = e00Var.f27910j - ((fDp * f13) * 0.05f);
                    e00Var.f27910j = f16;
                    if (f16 <= (-fDp)) {
                        e00Var.f27906e = (byte) 1;
                    }
                }
            } else if (e00Var.f27905c == 0) {
                if (f15 > 0.0f) {
                    float f17 = f15 - (0.05f * f13);
                    e00Var.f27910j = f17;
                    if (f17 <= 0.0f) {
                        e00Var.f27910j = 0.0f;
                        e00Var.f27906e = e00Var.f27907f;
                    }
                }
            } else if (f15 < 0.0f) {
                float f18 = (0.05f * f13) + f15;
                e00Var.f27910j = f18;
                if (f18 >= 0.0f) {
                    e00Var.f27910j = 0.0f;
                    e00Var.f27906e = e00Var.f27907f;
                }
            }
            float f19 = (-AndroidUtilities.dp(1.0f)) / f10;
            float f20 = e00Var.f27911k;
            boolean z10 = f20 < f19;
            if (f20 > f19) {
                e00Var.f27911k = ((AndroidUtilities.dp(1.0f) / 3.0f) * f13 * f00Var2.f28216e) + f20;
            } else {
                e00Var.f27911k = s3.c.c(AndroidUtilities.dp(1.0f), 3.0f, f13, f20);
            }
            if (z10 && e00Var.f27911k > f19) {
                f00Var2.f28217f++;
            }
            byte b11 = e00Var.f27903a;
            if (b11 == 1 || b11 == 2) {
                short s10 = (short) ((f13 * 10.0f) + e00Var.f27909i);
                e00Var.f27909i = s10;
                if (s10 > 360) {
                    e00Var.f27909i = (short) (s10 - 360);
                }
            }
            if (e00Var.h >= f00Var2.getHeightForAnimation()) {
                arrayList.remove(i11);
                i11--;
                size--;
            }
            i11++;
        }
        if (this.f28217f >= f28211x / 2 && this.f28216e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i14 = 0; i14 < f28212y; i14++) {
                    arrayList.add(a(true));
                }
            }
            float fC = org.telegram.messenger.rl.c(i10, 16.0f, 0.15f, this.f28216e);
            this.f28216e = fC;
            if (fC < 0.2f) {
                this.f28216e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.f28215c = false;
        AndroidUtilities.runOnUIThread(new lp(this, 18));
        b();
    }

    public void b() {
    }
}
