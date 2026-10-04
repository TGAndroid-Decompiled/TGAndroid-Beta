package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class vf0 extends FrameLayout implements b00, ci.gc {
    public final ImageView A0;
    public final ImageView B0;
    public final Bitmap C0;
    public final Bitmap D0;
    public final int E;
    public final Rect E0;
    public final int F;
    public final Matrix F0;
    public float G;
    public final Paint G0;
    public float H;
    public final int H0;
    public float I;
    public final org.telegram.ui.ActionBar.d6 I0;
    public float J;
    public int J0;
    public float K;
    public int K0;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public float U;
    public boolean V;
    public final rf0 W;
    public boolean f31643a;
    public float f31644a0;
    public final int f31645b;
    public PointF f31646b0;
    public final int f31647c;
    public float f31648c0;
    public final int d;
    public float f31649d0;
    public final int f31650e;
    public MediaController.SavedFilterState f31651e0;
    public final int f31652f;
    public final FrameLayout f31653f0;
    public final TextView f31654g0;
    public final int h;
    public final TextView f31655h0;
    public final TextureView f31656i0;
    public final boolean f31657j0;
    public final boolean f31658k0;
    public yz f31659l0;
    public final xh m0;
    public final int f31660n;
    public final FrameLayout f31661n0;
    public final kf0 f31662o0;
    public final mf0 f31663p0;
    public final TextView f31664q0;
    public final int f31665r;
    public final TextView f31666r0;
    public final int f31667s;
    public final TextView f31668s0;
    public final FrameLayout f31669t0;
    public final RadioButton[] f31670u0;
    public final int v;
    public final sd0 f31671v0;
    public final int f31672w;
    public final boolean f31673w0;
    public final int f31674x;
    public final boolean f31675x0;
    public final int f31676y;
    public int f31677y0;
    public final ImageView f31678z0;

    public vf0(android.content.Context r26, org.telegram.ui.Components.t71 r27, android.graphics.Bitmap r28, android.graphics.Bitmap r29, int r30, org.telegram.messenger.MediaController.SavedFilterState r31, org.telegram.ui.Components.sd0 r32, int r33, boolean r34, boolean r35, org.telegram.ui.Components.ka r36, org.telegram.ui.ActionBar.d6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vf0.<init>(android.content.Context, org.telegram.ui.Components.t71, android.graphics.Bitmap, android.graphics.Bitmap, int, org.telegram.messenger.MediaController$SavedFilterState, org.telegram.ui.Components.sd0, int, boolean, boolean, org.telegram.ui.Components.ka, org.telegram.ui.ActionBar.d6):void");
    }

    private void setShowOriginal(boolean z10) {
        if (this.f31643a != z10) {
            this.f31643a = z10;
            yz yzVar = this.f31659l0;
            if (yzVar != null) {
                yzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        rf0 rf0Var = this.W;
        rf0Var.a();
        return rf0Var.f30371e;
    }

    @Override
    public final boolean b() {
        if (!this.f31643a && !this.V) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return !this.W.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f31651e0;
        rf0 rf0Var = this.W;
        if (savedFilterState != null) {
            if (this.G != savedFilterState.enhanceValue || this.I != savedFilterState.contrastValue || this.P != savedFilterState.highlightsValue || this.H != savedFilterState.exposureValue || this.J != savedFilterState.warmthValue || this.K != savedFilterState.saturationValue || this.R != savedFilterState.vignetteValue || this.Q != savedFilterState.shadowsValue || this.S != savedFilterState.grainValue || this.U != savedFilterState.sharpenValue || this.L != savedFilterState.fadeValue || this.M != savedFilterState.softenSkinValue || this.O != savedFilterState.tintHighlightsColor || this.N != savedFilterState.tintShadowsColor || !rf0Var.b()) {
                return true;
            }
            return false;
        } else if (this.G != 0.0f || this.I != 0.0f || this.P != 0.0f || this.H != 0.0f || this.J != 0.0f || this.K != 0.0f || this.R != 0.0f || this.Q != 0.0f || this.S != 0.0f || this.U != 0.0f || this.L != 0.0f || this.M != 0.0f || this.O != 0 || this.N != 0 || !rf0Var.b()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        sd0 sd0Var = this.f31671v0;
        if (sd0Var != null && view == (textureView = this.f31656i0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.D0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.E0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.G0;
                int i10 = this.H0;
                if (i10 != 0) {
                    Matrix matrix = this.F0;
                    matrix.reset();
                    matrix.postRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / sd0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            sd0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10 = this.f31657j0;
        TextureView textureView = this.f31656i0;
        if (z10) {
            yz yzVar = this.f31659l0;
            if (yzVar != null) {
                yzVar.postRunnable(new vz(yzVar, 0));
                this.f31659l0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof t71) {
            t71 t71Var = (t71) textureView;
            MediaController.SavedFilterState savedFilterState = this.f31651e0;
            if (savedFilterState == null) {
                t71Var.setDelegate(null);
                return;
            }
            yz yzVar2 = this.f31659l0;
            if (yzVar2 != null) {
                yzVar2.f(new zz(savedFilterState));
            }
        }
    }

    public final void f() {
        boolean z10;
        int i10 = this.f31677y0;
        xh xhVar = this.m0;
        mf0 mf0Var = this.f31663p0;
        FrameLayout frameLayout = this.f31669t0;
        FrameLayout frameLayout2 = this.f31661n0;
        kf0 kf0Var = this.f31662o0;
        if (i10 == 0) {
            kf0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            mf0Var.setVisibility(4);
            xhVar.setVisibility(0);
        } else if (i10 == 1) {
            xhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            mf0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                kf0Var.setVisibility(0);
            }
            h();
        } else if (i10 == 2) {
            xhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            kf0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            mf0Var.setVisibility(0);
            this.W.f30372f = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                RadioButton radioButton = this.f31670u0[i11];
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, false);
            }
        }
    }

    public final void g() {
        boolean z10;
        if (Math.abs(this.G) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && this.N == 0 && this.O == 0 && Math.abs(this.P) < 0.1f && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && this.T == 0 && Math.abs(this.U) < 0.1f && this.W.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
    }

    public Bitmap getBitmap() {
        yz yzVar = this.f31659l0;
        if (yzVar != null && yzVar.f33299f && yzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (yzVar.postRunnable(new org.telegram.messenger.video.o(yzVar, bitmapArr, countDownLatch, 18))) {
                    countDownLatch.await();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.f31649d0;
    }

    public kf0 getBlurControl() {
        return this.f31662o0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f31648c0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f31646b0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f31644a0;
    }

    @Override
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.f31655h0;
    }

    @Override
    public float getContrastValue() {
        return a4.a.e(this.I, 100.0f, 0.3f, 1.0f);
    }

    public mf0 getCurveControl() {
        return this.f31663p0;
    }

    public TextView getDoneTextView() {
        return this.f31654g0;
    }

    @Override
    public float getEnhanceValue() {
        return this.G / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.L / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.S / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f31657j0 && !this.f31658k0) {
            return this.f31656i0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f7 = this.K / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.G;
        savedFilterState.exposureValue = this.H;
        savedFilterState.contrastValue = this.I;
        savedFilterState.warmthValue = this.J;
        savedFilterState.saturationValue = this.K;
        savedFilterState.fadeValue = this.L;
        savedFilterState.softenSkinValue = this.M;
        savedFilterState.tintShadowsColor = this.N;
        savedFilterState.tintHighlightsColor = this.O;
        savedFilterState.highlightsValue = this.P;
        savedFilterState.shadowsValue = this.Q;
        savedFilterState.vignetteValue = this.R;
        savedFilterState.grainValue = this.S;
        savedFilterState.blurType = this.T;
        savedFilterState.sharpenValue = this.U;
        savedFilterState.curvesToolValue = this.W;
        savedFilterState.blurExcludeSize = this.f31644a0;
        savedFilterState.blurExcludePoint = this.f31646b0;
        savedFilterState.blurExcludeBlurSize = this.f31648c0;
        savedFilterState.blurAngle = this.f31649d0;
        this.f31651e0 = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.y(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a4.a.e(this.U, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.M / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.O;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.O == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.N;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.N == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f31653f0;
    }

    public Bitmap getUiBlurBitmap() {
        qa qaVar;
        yz yzVar = this.f31659l0;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.f29983n) {
            try {
                if (!qaVar.f29986q) {
                    return null;
                }
                return qaVar.f29985p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.R / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.J / 100.0f;
    }

    public final void h() {
        int i10 = this.T;
        TextView textView = this.f31668s0;
        TextView textView2 = this.f31666r0;
        org.telegram.ui.ActionBar.d6 d6Var = this.I0;
        TextView textView3 = this.f31664q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.i6.f21233zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.i6.f21233zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.i6.f21233zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i13, d6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        }
        g();
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f31656i0;
            if (textureView instanceof t71) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                uk0 uk0Var = ((t71) textureView).f30985c;
                float f7 = uk0Var.f31388a;
                if (x10 >= f7 && x10 <= f7 + uk0Var.f31390c) {
                    float f10 = uk0Var.f31389b;
                    if (y3 >= f10 && y3 <= f10 + uk0Var.d) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        }
        return true;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float width;
        int height;
        float f7;
        float f10;
        float f11;
        float ceil;
        float f12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f31658k0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.f31675x0;
            if (!z10) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            int i15 = size2 - (dp2 + i12);
            TextureView textureView = this.f31656i0;
            Bitmap bitmap = this.C0;
            if (bitmap != null) {
                int i16 = this.H0 % 360;
                if (i16 != 90 && i16 != 270) {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f13 = dp;
            float f14 = i15;
            if (f13 / width > f14 / height) {
                f12 = (int) Math.ceil(width * f11);
                ceil = f14;
            } else {
                ceil = (int) Math.ceil(f7 * f10);
                f12 = f13;
            }
            int ceil2 = (int) Math.ceil(((f13 - f12) / 2.0f) + AndroidUtilities.dp(14.0f));
            float dp3 = ((f14 - ceil) / 2.0f) + AndroidUtilities.dp(14.0f);
            if (!z10) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            int ceil3 = (int) Math.ceil(dp3 + i13);
            int i17 = (int) f12;
            int i18 = (int) ceil;
            if (this.f31657j0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i17;
                layoutParams.height = i18;
            }
            float f15 = ceil2;
            if (!z10) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f16 = ceil3 - i14;
            float f17 = i17;
            float f18 = i18;
            mf0 mf0Var = this.f31663p0;
            uk0 uk0Var = mf0Var.f28610e;
            uk0Var.f31388a = f15;
            uk0Var.f31389b = f16;
            uk0Var.f31390c = f17;
            uk0Var.d = f18;
            kf0 kf0Var = this.f31662o0;
            fw0 fw0Var = kf0Var.d;
            fw0Var.f26585a = f17;
            fw0Var.f26586b = f18;
            ((FrameLayout.LayoutParams) kf0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i15;
            ((FrameLayout.LayoutParams) mf0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i15;
            if (AndroidUtilities.isTablet()) {
                int dp4 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.m0.getLayoutParams();
                if (dp4 < dp) {
                    layoutParams2.width = dp4;
                    layoutParams2.leftMargin = (dp - dp4) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setEnhanceValue(float f7) {
        this.G = f7 * 100.0f;
        g();
        int i10 = 0;
        while (true) {
            xh xhVar = this.m0;
            if (i10 >= xhVar.getChildCount()) {
                break;
            }
            View childAt = xhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.v5) && RecyclerView.R(childAt) == this.f31645b) {
                ((org.telegram.ui.Cells.v5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.G);
                break;
            }
            i10++;
        }
        yz yzVar = this.f31659l0;
        if (yzVar != null) {
            yzVar.e(true, false, false);
        }
    }
}
