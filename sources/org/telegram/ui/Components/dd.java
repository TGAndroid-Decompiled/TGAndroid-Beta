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
public abstract class dd extends View {
    public static final int[] W;
    public static final int[] f25559a0;
    public static long f25560b0;
    public static Long f25561c0;
    public static Long f25562d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final p6 M;
    public final p6 N;
    public final p6 O;
    public final p6 P;
    public sg.v1 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF f25563a;
    public final RectF f25564b;
    public final RectF f25565c;
    public final int d;
    public final boolean e;
    public final int[] f25566f;
    public boolean h;
    public final f6 f25567n;
    public boolean f25568r;
    public final f6 f25569s;
    public final bd[] v;
    public final float[] f25570w;
    public final RectF f25571x;
    public final Paint f25572y;

    static {
        int i10 = org.telegram.ui.ActionBar.h6.lj;
        int i11 = org.telegram.ui.ActionBar.h6.hj;
        int i12 = org.telegram.ui.ActionBar.h6.ij;
        int i13 = org.telegram.ui.ActionBar.h6.pj;
        int i14 = org.telegram.ui.ActionBar.h6.mj;
        int i15 = org.telegram.ui.ActionBar.h6.jj;
        int i16 = org.telegram.ui.ActionBar.h6.nj;
        int i17 = org.telegram.ui.ActionBar.h6.qj;
        int i18 = org.telegram.ui.ActionBar.h6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        f25559a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        f25560b0 = -1L;
    }

    public dd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f25563a = new RectF();
        this.f25564b = new RectF();
        this.f25565c = new RectF();
        this.h = true;
        bs bsVar = bs.h;
        this.f25567n = new f6(this, 750L, bsVar);
        this.f25568r = false;
        this.f25569s = new f6(this, 650L, bsVar);
        this.f25570w = new float[2];
        this.f25571x = new RectF();
        Paint paint = new Paint(1);
        this.f25572y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        p6 p6Var = new p6(false, true, true);
        this.M = p6Var;
        p6 p6Var2 = new p6(false, true, true);
        this.N = p6Var2;
        p6 p6Var3 = new p6(false, true, true);
        this.O = p6Var3;
        p6 p6Var4 = new p6(false, true, true);
        this.P = p6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f25566f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new bd[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false));
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
        p6Var.n(0.2f, 450L, bsVar);
        p6Var.A = 0.6f;
        p6Var.u(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(32.0f));
        p6Var.f29192b = 17;
        p6Var2.n(0.6f, 450L, bsVar);
        p6Var2.A = 0.6f;
        p6Var2.u(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21374y6, false));
        p6Var2.w(AndroidUtilities.dp(12.0f));
        p6Var2.f29192b = 17;
        p6Var3.n(0.2f, 450L, bsVar);
        p6Var3.A = 0.6f;
        p6Var3.f29190a.setShader(linearGradient2);
        p6Var3.x(AndroidUtilities.bold());
        p6Var3.w(AndroidUtilities.dp(32.0f));
        p6Var3.f29192b = 17;
        p6Var4.n(0.6f, 450L, bsVar);
        p6Var4.A = 0.6f;
        p6Var4.f29190a.setShader(linearGradient2);
        p6Var4.x(AndroidUtilities.bold());
        p6Var4.w(AndroidUtilities.dp(12.0f));
        p6Var4.f29192b = 17;
        int i12 = 0;
        while (true) {
            bd[] bdVarArr = this.v;
            if (i12 < bdVarArr.length) {
                bd bdVar = new bd(this);
                bdVarArr[i12] = bdVar;
                int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, iArr[i12], false), 50331648);
                int v10 = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, iArr[i12], false), 822083583);
                AndroidUtilities.dp(50.0f);
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                bdVar.v = radialGradient;
                Matrix matrix = new Matrix();
                bdVar.f24941w = matrix;
                radialGradient.setLocalMatrix(matrix);
                bdVar.f24936q.setShader(bdVar.v);
                i12++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, p6 p6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        p6Var.B = (int) (f12 * 255.0f);
        p6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        p6Var.draw(canvas);
        canvas.restore();
        return p6Var.h();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(android.graphics.Canvas r65) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dd.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long r30, boolean r32, org.telegram.ui.Components.cd... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dd.f(long, boolean, org.telegram.ui.Components.cd[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            bd[] bdVarArr = this.v;
            if (i10 < bdVarArr.length) {
                bd bdVar = bdVarArr[i10];
                if (bdVar.f24924b == null) {
                    boolean z10 = this.e;
                    int[] iArr = this.f25566f;
                    if (z10) {
                        bdVar.f24924b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                    } else {
                        bdVar.f24924b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            bd[] bdVarArr = this.v;
            if (i10 < bdVarArr.length) {
                Bitmap bitmap = bdVarArr[i10].f24924b;
                if (bitmap != null) {
                    bitmap.recycle();
                    bdVarArr[i10].f24924b = null;
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
        RectF rectF = this.f25563a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        sg.v1 v1Var = this.Q;
        if (v1Var != null) {
            v1Var.f46470a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.f46470a.offset((getMeasuredWidth() - this.Q.f46470a.width()) / 2.0f, (getMeasuredHeight() - this.Q.f46470a.height()) / 2.0f);
            this.Q.f46471b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
            bd[] bdVarArr = this.v;
            if (i11 < bdVarArr.length) {
                if (i10 == i11 && bdVarArr[i11].d <= 0.0f) {
                    i10 = -1;
                }
                bd bdVar = bdVarArr[i11];
                if (i10 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bdVar.f24933n = z10;
                i11++;
            } else {
                this.T = i10;
                invalidate();
                return;
            }
        }
    }
}
