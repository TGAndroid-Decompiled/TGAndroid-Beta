package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public abstract class cd extends View implements org.telegram.ui.ActionBar.p6 {
    public static final int[] W;
    public static final int[] f27114a0;
    public static long f27115b0;
    public static Long f27116c0;
    public static Long f27117d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final r6 M;
    public final r6 N;
    public final r6 O;
    public final r6 P;
    public tg.w1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f27118a;
    public final RectF f27119b;
    public final RectF f27120c;
    public final int d;
    public final boolean e;
    public final int[] f27121f;
    public boolean h;
    public final h6 f27122n;
    public boolean f27123r;
    public final h6 f27124s;
    public final ad[] v;
    public final float[] f27125w;
    public final RectF f27126x;
    public final Paint f27127y;

    static {
        int i10 = org.telegram.ui.ActionBar.y6.lj;
        int i11 = org.telegram.ui.ActionBar.y6.hj;
        int i12 = org.telegram.ui.ActionBar.y6.ij;
        int i13 = org.telegram.ui.ActionBar.y6.pj;
        int i14 = org.telegram.ui.ActionBar.y6.mj;
        int i15 = org.telegram.ui.ActionBar.y6.jj;
        int i16 = org.telegram.ui.ActionBar.y6.nj;
        int i17 = org.telegram.ui.ActionBar.y6.qj;
        int i18 = org.telegram.ui.ActionBar.y6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        f27114a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f27115b0 = -1L;
    }

    public cd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f27118a = new RectF();
        this.f27119b = new RectF();
        this.f27120c = new RectF();
        this.h = true;
        ds dsVar = ds.h;
        this.f27122n = new h6(this, 750L, dsVar);
        this.f27123r = false;
        this.f27124s = new h6(this, 650L, dsVar);
        this.f27125w = new float[2];
        this.f27126x = new RectF();
        Paint paint = new Paint(1);
        this.f27127y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        r6 r6Var = new r6(false, true, true);
        this.M = r6Var;
        r6 r6Var2 = new r6(false, true, true);
        this.N = r6Var2;
        r6 r6Var3 = new r6(false, true, true);
        this.O = r6Var3;
        r6 r6Var4 = new r6(false, true, true);
        this.P = r6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f27121f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new ad[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        r6Var.n(0.2f, 450L, dsVar);
        r6Var.A = 0.6f;
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(32.0f));
        r6Var.f32119b = 17;
        r6Var2.n(0.6f, 450L, dsVar);
        r6Var2.A = 0.6f;
        r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false));
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.f32119b = 17;
        r6Var3.n(0.2f, 450L, dsVar);
        r6Var3.A = 0.6f;
        r6Var3.f32117a.setShader(linearGradient2);
        r6Var3.x(AndroidUtilities.bold());
        r6Var3.w(AndroidUtilities.dp(32.0f));
        r6Var3.f32119b = 17;
        r6Var4.n(0.6f, 450L, dsVar);
        r6Var4.A = 0.6f;
        r6Var4.f32117a.setShader(linearGradient2);
        r6Var4.x(AndroidUtilities.bold());
        r6Var4.w(AndroidUtilities.dp(12.0f));
        r6Var4.f32119b = 17;
        int i12 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i12 < adVarArr.length) {
                ad adVar = new ad(this);
                adVarArr[i12] = adVar;
                int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, iArr[i12], false), 50331648);
                int v10 = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                adVar.v = radialGradient;
                Matrix matrix = new Matrix();
                adVar.f26484w = matrix;
                radialGradient.setLocalMatrix(matrix);
                adVar.f26479q.setShader(adVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, r6 r6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        r6Var.B = (int) (f12 * 255.0f);
        r6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        r6Var.draw(canvas);
        canvas.restore();
        return r6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.bd... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cd.f(long, boolean, org.telegram.ui.Components.bd[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i10 < adVarArr.length) {
                ad adVar = adVarArr[i10];
                if (adVar.f26467b == null) {
                    boolean z10 = this.e;
                    int[] iArr = this.f27121f;
                    if (z10) {
                        adVar.f26467b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        adVar.f26467b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.S = false;
        while (true) {
            ad[] adVarArr = this.v;
            if (i10 < adVarArr.length) {
                Bitmap bitmap = adVarArr[i10].f26467b;
                if (bitmap != null) {
                    bitmap.recycle();
                    adVarArr[i10].f26467b = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(c());
        int dp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.f27118a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        tg.w1 w1Var = this.Q;
        if (w1Var != null) {
            w1Var.f49087a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f49087a.offset((getMeasuredWidth() - this.Q.f49087a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f49087a.height()) / 2.0f);
            this.Q.f49088b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.R = z10;
    }

    public void setSelected(int i10) {
        boolean z10;
        if (i10 == this.T) {
            return;
        }
        int i11 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i11 < adVarArr.length) {
                if (i10 == i11 && adVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                ad adVar = adVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                adVar.f26476n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.f27127y.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false));
            try {
                r6 r6Var = this.M;
                if (r6Var != null) {
                    r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                }
                r6 r6Var2 = this.N;
                if (r6Var2 != null) {
                    r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
