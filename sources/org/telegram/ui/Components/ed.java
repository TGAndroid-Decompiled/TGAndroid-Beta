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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
public abstract class ed extends View {
    public static final int[] W;
    public static final int[] f26033a0;
    public static long f26034b0;
    public static Long f26035c0;
    public static Long f26036d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final o6 M;
    public final o6 N;
    public final o6 O;
    public final o6 P;
    public rg.x1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f26037a;
    public final RectF f26038b;
    public final RectF f26039c;
    public final int d;
    public final boolean f26040e;
    public final int[] f26041f;
    public boolean h;
    public final e6 f26042n;
    public boolean f26043r;
    public final e6 f26044s;
    public final cd[] v;
    public final float[] f26045w;
    public final RectF f26046x;
    public final Paint f26047y;

    static {
        int i10 = org.telegram.ui.ActionBar.i6.lj;
        int i11 = org.telegram.ui.ActionBar.i6.hj;
        int i12 = org.telegram.ui.ActionBar.i6.ij;
        int i13 = org.telegram.ui.ActionBar.i6.pj;
        int i14 = org.telegram.ui.ActionBar.i6.mj;
        int i15 = org.telegram.ui.ActionBar.i6.jj;
        int i16 = org.telegram.ui.ActionBar.i6.nj;
        int i17 = org.telegram.ui.ActionBar.i6.qj;
        int i18 = org.telegram.ui.ActionBar.i6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        f26033a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f26034b0 = -1L;
    }

    public ed(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f26037a = new RectF();
        this.f26038b = new RectF();
        this.f26039c = new RectF();
        this.h = true;
        tr trVar = tr.h;
        this.f26042n = new e6(this, 750L, trVar);
        this.f26043r = false;
        this.f26044s = new e6(this, 650L, trVar);
        this.f26045w = new float[2];
        this.f26046x = new RectF();
        Paint paint = new Paint(1);
        this.f26047y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        o6 o6Var = new o6(false, true, true, false);
        this.M = o6Var;
        o6 o6Var2 = new o6(false, true, true, false);
        this.N = o6Var2;
        o6 o6Var3 = new o6(false, true, true, false);
        this.O = o6Var3;
        o6 o6Var4 = new o6(false, true, true, false);
        this.P = o6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f26041f = iArr2;
        this.d = i11;
        this.f26040e = i11 == 0;
        this.v = new cd[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20908i6, false));
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
        o6Var.k(0.2f, 450L, trVar);
        o6Var.v = 0.6f;
        o6Var.r(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(32.0f));
        o6Var.f29239b = 17;
        o6Var2.k(0.6f, 450L, trVar);
        o6Var2.v = 0.6f;
        o6Var2.r(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21204y6, false));
        o6Var2.t(AndroidUtilities.dp(12.0f));
        o6Var2.f29239b = 17;
        o6Var3.k(0.2f, 450L, trVar);
        o6Var3.v = 0.6f;
        o6Var3.f29238a.setShader(linearGradient2);
        o6Var3.u(AndroidUtilities.bold());
        o6Var3.t(AndroidUtilities.dp(32.0f));
        o6Var3.f29239b = 17;
        o6Var4.k(0.6f, 450L, trVar);
        o6Var4.v = 0.6f;
        o6Var4.f29238a.setShader(linearGradient2);
        o6Var4.u(AndroidUtilities.bold());
        o6Var4.t(AndroidUtilities.dp(12.0f));
        o6Var4.f29239b = 17;
        int i12 = 0;
        while (true) {
            cd[] cdVarArr = this.v;
            if (i12 < cdVarArr.length) {
                cd cdVar = new cd(this);
                cdVarArr[i12] = cdVar;
                int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(null, iArr[i12], false), 50331648);
                int v9 = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                cdVar.v = radialGradient;
                Matrix matrix = new Matrix();
                cdVar.f25348w = matrix;
                radialGradient.setLocalMatrix(matrix);
                cdVar.f25343q.setShader(cdVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, o6 o6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        o6Var.f29257w = (int) (f12 * 255.0f);
        o6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        o6Var.draw(canvas);
        canvas.restore();
        return o6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ed.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ed.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.dd... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ed.f(long, boolean, org.telegram.ui.Components.dd[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            cd[] cdVarArr = this.v;
            if (i10 < cdVarArr.length) {
                cd cdVar = cdVarArr[i10];
                if (cdVar.f25330b == null) {
                    boolean z10 = this.f26040e;
                    int[] iArr = this.f26041f;
                    if (z10) {
                        cdVar.f25330b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        cdVar.f25330b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            cd[] cdVarArr = this.v;
            if (i10 < cdVarArr.length) {
                Bitmap bitmap = cdVarArr[i10].f25330b;
                if (bitmap != null) {
                    bitmap.recycle();
                    cdVarArr[i10].f25330b = null;
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
        RectF rectF = this.f26037a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        rg.x1 x1Var = this.Q;
        if (x1Var != null) {
            x1Var.f46357a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f46357a.offset((getMeasuredWidth() - this.Q.f46357a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f46357a.height()) / 2.0f);
            this.Q.f46358b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            cd[] cdVarArr = this.v;
            if (i11 < cdVarArr.length) {
                if (i10 == i11 && cdVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                cd cdVar = cdVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cdVar.f25340n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }
}
