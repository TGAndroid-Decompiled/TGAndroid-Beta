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
public abstract class wc extends View {
    public static final int[] T;
    public static final int[] U;
    public static long V;
    public static Long W;
    public static Long f32727a0;
    public RectF B;
    public final Path C;
    public final Paint D;
    public final Paint E;
    public final LinearGradient F;
    public final LinearGradient G;
    public final Matrix H;
    public final Matrix I;
    public final j6 J;
    public final j6 K;
    public final j6 L;
    public final j6 M;
    public fg.o2 N;
    public boolean O;
    public boolean P;
    public int Q;
    public int[] R;
    public float[] S;
    public final RectF f32728a;
    public final RectF f32729b;
    public final RectF f32730c;
    public final int d;
    public final boolean f32731e;
    public final int[] f32732f;
    public boolean h;
    public final z5 f32733n;
    public boolean f32734r;
    public final z5 f32735s;
    public final uc[] v;
    public final float[] f32736w;
    public final RectF f32737x;
    public final Paint f32738y;

    static {
        int i10 = org.telegram.ui.ActionBar.k6.lj;
        int i11 = org.telegram.ui.ActionBar.k6.hj;
        int i12 = org.telegram.ui.ActionBar.k6.ij;
        int i13 = org.telegram.ui.ActionBar.k6.pj;
        int i14 = org.telegram.ui.ActionBar.k6.mj;
        int i15 = org.telegram.ui.ActionBar.k6.jj;
        int i16 = org.telegram.ui.ActionBar.k6.nj;
        int i17 = org.telegram.ui.ActionBar.k6.qj;
        int i18 = org.telegram.ui.ActionBar.k6.kj;
        T = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        U = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        V = -1L;
    }

    public wc(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f32728a = new RectF();
        this.f32729b = new RectF();
        this.f32730c = new RectF();
        this.h = true;
        pr prVar = pr.h;
        this.f32733n = new z5(this, 750L, prVar);
        this.f32734r = false;
        this.f32735s = new z5(this, 650L, prVar);
        this.f32736w = new float[2];
        this.f32737x = new RectF();
        Paint paint = new Paint(1);
        this.f32738y = paint;
        this.C = new Path();
        Paint paint2 = new Paint(1);
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        j6 j6Var = new j6(false, true, true, false);
        this.J = j6Var;
        j6 j6Var2 = new j6(false, true, true, false);
        this.K = j6Var2;
        j6 j6Var3 = new j6(false, true, true, false);
        this.L = j6Var3;
        j6 j6Var4 = new j6(false, true, true, false);
        this.M = j6Var4;
        this.O = true;
        this.Q = -1;
        setLayerType(2, null);
        this.f32732f = iArr2;
        this.d = i11;
        this.f32731e = i11 == 0;
        this.v = new uc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.G = linearGradient2;
        this.H = new Matrix();
        this.I = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        j6Var.k(0.2f, 450L, prVar);
        j6Var.v = 0.6f;
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(32.0f));
        j6Var.f27999b = 17;
        j6Var2.k(0.6f, 450L, prVar);
        j6Var2.v = 0.6f;
        j6Var2.r(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y6, false));
        j6Var2.t(AndroidUtilities.dp(12.0f));
        j6Var2.f27999b = 17;
        j6Var3.k(0.2f, 450L, prVar);
        j6Var3.v = 0.6f;
        j6Var3.f27998a.setShader(linearGradient2);
        j6Var3.u(AndroidUtilities.bold());
        j6Var3.t(AndroidUtilities.dp(32.0f));
        j6Var3.f27999b = 17;
        j6Var4.k(0.6f, 450L, prVar);
        j6Var4.v = 0.6f;
        j6Var4.f27998a.setShader(linearGradient2);
        j6Var4.u(AndroidUtilities.bold());
        j6Var4.t(AndroidUtilities.dp(12.0f));
        j6Var4.f27999b = 17;
        int i12 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i12 < ucVarArr.length) {
                uc ucVar = new uc(this);
                ucVarArr[i12] = ucVar;
                int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, iArr[i12], false), 50331648);
                int v10 = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                ucVar.v = radialGradient;
                Matrix matrix = new Matrix();
                ucVar.f31606w = matrix;
                radialGradient.setLocalMatrix(matrix);
                ucVar.f31601q.setShader(ucVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, j6 j6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        j6Var.f28017w = (int) (f13 * 255.0f);
        j6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        j6Var.draw(canvas);
        canvas.restore();
        return j6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z4);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r31, boolean r33, org.telegram.ui.Components.vc... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.f(long, boolean, org.telegram.ui.Components.vc[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i10 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i10 < ucVarArr.length) {
                uc ucVar = ucVarArr[i10];
                if (ucVar.f31588b == null) {
                    boolean z4 = this.f32731e;
                    int[] iArr = this.f32732f;
                    if (z4) {
                        ucVar.f31588b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        ucVar.f31588b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
        this.P = false;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i10 < ucVarArr.length) {
                Bitmap bitmap = ucVarArr[i10].f31588b;
                if (bitmap != null) {
                    bitmap.recycle();
                    ucVarArr[i10].f31588b = null;
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
        RectF rectF = this.f32728a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.H;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.F.setLocalMatrix(matrix);
        Matrix matrix2 = this.I;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.G.setLocalMatrix(matrix2);
        fg.o2 o2Var = this.N;
        if (o2Var != null) {
            o2Var.f6451a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.N.f6451a.offset((getMeasuredWidth() - this.N.f6451a.width()) / 2.0f, (getMeasuredHeight() - this.N.f6451a.height()) / 2.0f);
            this.N.f6452b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.N.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    public void setInterceptTouch(boolean z4) {
        this.O = z4;
    }

    public void setSelected(int i10) {
        boolean z4;
        if (i10 == this.Q) {
            return;
        }
        int i11 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i11 < ucVarArr.length) {
                if (i10 == i11 && ucVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                uc ucVar = ucVarArr[i11];
                if (i10 == i11) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ucVar.f31598n = z4;
                i11++;
            } else {
                this.Q = i10;
                invalidate();
                return;
            }
        }
    }
}
