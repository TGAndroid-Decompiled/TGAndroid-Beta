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
public abstract class uc extends View {
    public static final int[] S;
    public static final int[] T;
    public static long U;
    public static Long V;
    public static Long W;
    public RectF A;
    public final Path B;
    public final Paint C;
    public final Paint D;
    public final LinearGradient E;
    public final LinearGradient F;
    public final Matrix G;
    public final Matrix H;
    public final i6 I;
    public final i6 J;
    public final i6 K;
    public final i6 L;
    public zf.v1 M;
    public boolean N;
    public boolean O;
    public int P;
    public int[] Q;
    public float[] R;
    public final RectF f32972a;
    public final RectF f32973b;
    public final RectF f32974c;
    public final int d;
    public final boolean f32975e;
    public final int[] f32976f;
    public boolean h;
    public final y5 f32977n;
    public boolean f32978r;
    public final y5 f32979s;
    public final sc[] v;
    public final float[] f32980w;
    public final RectF f32981x;
    public final Paint f32982y;

    static {
        int i9 = org.telegram.ui.ActionBar.f6.lj;
        int i10 = org.telegram.ui.ActionBar.f6.hj;
        int i11 = org.telegram.ui.ActionBar.f6.ij;
        int i12 = org.telegram.ui.ActionBar.f6.pj;
        int i13 = org.telegram.ui.ActionBar.f6.mj;
        int i14 = org.telegram.ui.ActionBar.f6.jj;
        int i15 = org.telegram.ui.ActionBar.f6.nj;
        int i16 = org.telegram.ui.ActionBar.f6.qj;
        int i17 = org.telegram.ui.ActionBar.f6.kj;
        S = new int[]{i9, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        int i18 = R.raw.cache_photos;
        int i19 = R.raw.cache_videos;
        int i20 = R.raw.cache_documents;
        int i21 = R.raw.cache_music;
        int i22 = R.raw.cache_stickers;
        int i23 = R.raw.cache_profile_photos;
        int i24 = R.raw.cache_other;
        T = new int[]{i18, i19, i20, i21, i19, i21, i22, i23, i24, i24, i20};
        U = -1L;
    }

    public uc(Context context, int i9, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.f32972a = new RectF();
        this.f32973b = new RectF();
        this.f32974c = new RectF();
        this.h = true;
        gr grVar = gr.h;
        this.f32977n = new y5(this, 750L, grVar);
        this.f32978r = false;
        this.f32979s = new y5(this, 650L, grVar);
        this.f32980w = new float[2];
        this.f32981x = new RectF();
        Paint paint = new Paint(1);
        this.f32982y = paint;
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        Paint paint3 = new Paint(1);
        this.D = paint3;
        i6 i6Var = new i6(false, true, true, false);
        this.I = i6Var;
        i6 i6Var2 = new i6(false, true, true, false);
        this.J = i6Var2;
        i6 i6Var3 = new i6(false, true, true, false);
        this.K = i6Var3;
        i6 i6Var4 = new i6(false, true, true, false);
        this.L = i6Var4;
        this.N = true;
        this.P = -1;
        setLayerType(2, null);
        this.f32976f = iArr2;
        this.d = i10;
        this.f32975e = i10 == 0;
        this.v = new sc[i9];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.E = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient2;
        this.G = new Matrix();
        this.H = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        i6Var.k(0.2f, 450L, grVar);
        i6Var.v = 0.6f;
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(32.0f));
        i6Var.f29333b = 17;
        i6Var2.k(0.6f, 450L, grVar);
        i6Var2.v = 0.6f;
        i6Var2.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.f29333b = 17;
        i6Var3.k(0.2f, 450L, grVar);
        i6Var3.v = 0.6f;
        i6Var3.f29332a.setShader(linearGradient2);
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.t(AndroidUtilities.dp(32.0f));
        i6Var3.f29333b = 17;
        i6Var4.k(0.6f, 450L, grVar);
        i6Var4.v = 0.6f;
        i6Var4.f29332a.setShader(linearGradient2);
        i6Var4.u(AndroidUtilities.bold());
        i6Var4.t(AndroidUtilities.dp(12.0f));
        i6Var4.f29333b = 17;
        int i11 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i11 < scVarArr.length) {
                sc scVar = new sc(this);
                scVarArr[i11] = scVar;
                int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, iArr[i11], false), 50331648);
                int v4 = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, iArr[i11], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v4, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                scVar.v = radialGradient;
                Matrix matrix = new Matrix();
                scVar.f32438w = matrix;
                radialGradient.setLocalMatrix(matrix);
                scVar.f32433q.setShader(scVar.v);
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, i6 i6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        i6Var.f29351w = (int) (f13 * 255.0f);
        i6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        i6Var.draw(canvas);
        canvas.restore();
        return i6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i9, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.tc... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uc.f(long, boolean, org.telegram.ui.Components.tc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i9 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i9 < scVarArr.length) {
                sc scVar = scVarArr[i9];
                if (scVar.f32420b == null) {
                    boolean z10 = this.f32975e;
                    int[] iArr = this.f32976f;
                    if (z10) {
                        scVar.f32420b = SvgHelper.getBitmap(iArr[i9], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        scVar.f32420b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i9]);
                    }
                }
                i9++;
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
        int i9 = 0;
        this.O = false;
        while (true) {
            sc[] scVarArr = this.v;
            if (i9 < scVarArr.length) {
                Bitmap bitmap = scVarArr[i9].f32420b;
                if (bitmap != null) {
                    bitmap.recycle();
                    scVarArr[i9].f32420b = null;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(c());
        int dp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.f32972a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.G;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.E.setLocalMatrix(matrix);
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.F.setLocalMatrix(matrix2);
        zf.v1 v1Var = this.M;
        if (v1Var != null) {
            v1Var.f50733a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.M.f50733a.offset((getMeasuredWidth() - this.M.f50733a.width()) / 2.0f, (getMeasuredHeight() - this.M.f50733a.height()) / 2.0f);
            this.M.f50734b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.N = z10;
    }

    public void setSelected(int i9) {
        boolean z10;
        if (i9 == this.P) {
            return;
        }
        int i10 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i10 < scVarArr.length) {
                if (i9 == i10 && scVarArr[i10].d <= 0.0f) {
                    i9 = -1;
                }
                sc scVar = scVarArr[i10];
                if (i9 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                scVar.f32430n = z10;
                i10++;
            } else {
                this.P = i9;
                invalidate();
                return;
            }
        }
    }
}
