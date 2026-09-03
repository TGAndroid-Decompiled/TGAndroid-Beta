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
public final class pf0 extends FrameLayout implements a00, qh.x9 {
    public final Bitmap A0;
    public final int B;
    public final Rect B0;
    public final int C;
    public final Matrix C0;
    public float D;
    public final Paint D0;
    public float E;
    public final int E0;
    public float F;
    public final org.telegram.ui.ActionBar.g6 F0;
    public float G;
    public int G0;
    public float H;
    public int H0;
    public float I;
    public float J;
    public int K;
    public int L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public float R;
    public boolean S;
    public final lf0 T;
    public float U;
    public PointF V;
    public float W;
    public boolean f30047a;
    public float f30048a0;
    public final int f30049b;
    public MediaController.SavedFilterState f30050b0;
    public final int f30051c;
    public final FrameLayout f30052c0;
    public final int d;
    public final TextView f30053d0;
    public final int f30054e;
    public final TextView f30055e0;
    public final int f30056f;
    public final TextureView f30057f0;
    public final boolean f30058g0;
    public final int h;
    public final boolean f30059h0;
    public xz f30060i0;
    public final nh f30061j0;
    public final FrameLayout f30062k0;
    public final ef0 f30063l0;
    public final gf0 m0;
    public final int f30064n;
    public final TextView f30065n0;
    public final TextView f30066o0;
    public final TextView f30067p0;
    public final FrameLayout f30068q0;
    public final int f30069r;
    public final RadioButton[] f30070r0;
    public final int f30071s;
    public final jd0 f30072s0;
    public final boolean f30073t0;
    public final boolean f30074u0;
    public final int v;
    public int f30075v0;
    public final int f30076w;
    public final ImageView f30077w0;
    public final int f30078x;
    public final ImageView f30079x0;
    public final int f30080y;
    public final ImageView f30081y0;
    public final Bitmap f30082z0;

    public pf0(android.content.Context r26, org.telegram.ui.Components.x61 r27, android.graphics.Bitmap r28, android.graphics.Bitmap r29, int r30, org.telegram.messenger.MediaController.SavedFilterState r31, org.telegram.ui.Components.jd0 r32, int r33, boolean r34, boolean r35, org.telegram.ui.Components.ba r36, org.telegram.ui.ActionBar.g6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pf0.<init>(android.content.Context, org.telegram.ui.Components.x61, android.graphics.Bitmap, android.graphics.Bitmap, int, org.telegram.messenger.MediaController$SavedFilterState, org.telegram.ui.Components.jd0, int, boolean, boolean, org.telegram.ui.Components.ba, org.telegram.ui.ActionBar.g6):void");
    }

    private void setShowOriginal(boolean z4) {
        if (this.f30047a != z4) {
            this.f30047a = z4;
            xz xzVar = this.f30060i0;
            if (xzVar != null) {
                xzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        lf0 lf0Var = this.T;
        lf0Var.a();
        return lf0Var.f28732e;
    }

    @Override
    public final boolean b() {
        if (!this.f30047a && !this.S) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return !this.T.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f30050b0;
        lf0 lf0Var = this.T;
        if (savedFilterState != null) {
            if (this.D != savedFilterState.enhanceValue || this.F != savedFilterState.contrastValue || this.M != savedFilterState.highlightsValue || this.E != savedFilterState.exposureValue || this.G != savedFilterState.warmthValue || this.H != savedFilterState.saturationValue || this.O != savedFilterState.vignetteValue || this.N != savedFilterState.shadowsValue || this.P != savedFilterState.grainValue || this.R != savedFilterState.sharpenValue || this.I != savedFilterState.fadeValue || this.J != savedFilterState.softenSkinValue || this.L != savedFilterState.tintHighlightsColor || this.K != savedFilterState.tintShadowsColor || !lf0Var.b()) {
                return true;
            }
            return false;
        } else if (this.D != 0.0f || this.F != 0.0f || this.M != 0.0f || this.E != 0.0f || this.G != 0.0f || this.H != 0.0f || this.O != 0.0f || this.N != 0.0f || this.P != 0.0f || this.R != 0.0f || this.I != 0.0f || this.J != 0.0f || this.L != 0 || this.K != 0 || !lf0Var.b()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        jd0 jd0Var = this.f30072s0;
        if (jd0Var != null && view == (textureView = this.f30057f0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.A0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.B0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.D0;
                int i10 = this.E0;
                if (i10 != 0) {
                    Matrix matrix = this.C0;
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
            float measuredWidth2 = textureView.getMeasuredWidth() / jd0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            jd0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z4 = this.f30058g0;
        TextureView textureView = this.f30057f0;
        if (z4) {
            xz xzVar = this.f30060i0;
            if (xzVar != null) {
                xzVar.postRunnable(new uz(xzVar, 0));
                this.f30060i0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof x61) {
            x61 x61Var = (x61) textureView;
            MediaController.SavedFilterState savedFilterState = this.f30050b0;
            if (savedFilterState == null) {
                x61Var.setDelegate(null);
                return;
            }
            xz xzVar2 = this.f30060i0;
            if (xzVar2 != null) {
                xzVar2.f(new yz(savedFilterState));
            }
        }
    }

    public final void f() {
        boolean z4;
        int i10 = this.f30075v0;
        nh nhVar = this.f30061j0;
        gf0 gf0Var = this.m0;
        FrameLayout frameLayout = this.f30068q0;
        FrameLayout frameLayout2 = this.f30062k0;
        ef0 ef0Var = this.f30063l0;
        if (i10 == 0) {
            ef0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            gf0Var.setVisibility(4);
            nhVar.setVisibility(0);
        } else if (i10 == 1) {
            nhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            gf0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.Q != 0) {
                ef0Var.setVisibility(0);
            }
            h();
        } else if (i10 == 2) {
            nhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            ef0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            gf0Var.setVisibility(0);
            this.T.f28733f = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                RadioButton radioButton = this.f30070r0[i11];
                if (i11 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                radioButton.a(z4, false);
            }
        }
    }

    public final void g() {
        boolean z4;
        if (Math.abs(this.D) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.E) < 0.1f && Math.abs(this.F) < 0.1f && Math.abs(this.G) < 0.1f && Math.abs(this.H) < 0.1f && Math.abs(this.I) < 0.1f && this.K == 0 && this.L == 0 && Math.abs(this.M) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.O) < 0.1f && Math.abs(this.P) < 0.1f && this.Q == 0 && Math.abs(this.R) < 0.1f && this.T.b()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.S = z4;
    }

    public Bitmap getBitmap() {
        xz xzVar = this.f30060i0;
        if (xzVar != null && xzVar.f33255f && xzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (xzVar.postRunnable(new jp(xzVar, bitmapArr, countDownLatch, 2))) {
                    countDownLatch.await();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.f30048a0;
    }

    public ef0 getBlurControl() {
        return this.f30063l0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.W;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.V;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.U;
    }

    @Override
    public int getBlurType() {
        return this.Q;
    }

    public TextView getCancelTextView() {
        return this.f30055e0;
    }

    @Override
    public float getContrastValue() {
        return w.c.c(this.F, 100.0f, 0.3f, 1.0f);
    }

    public gf0 getCurveControl() {
        return this.m0;
    }

    public TextView getDoneTextView() {
        return this.f30053d0;
    }

    @Override
    public float getEnhanceValue() {
        return this.D / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.E / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.I / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.P / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return e2.c.v(this.M, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f30058g0 && !this.f30059h0) {
            return this.f30057f0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f10 = this.H / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.D;
        savedFilterState.exposureValue = this.E;
        savedFilterState.contrastValue = this.F;
        savedFilterState.warmthValue = this.G;
        savedFilterState.saturationValue = this.H;
        savedFilterState.fadeValue = this.I;
        savedFilterState.softenSkinValue = this.J;
        savedFilterState.tintShadowsColor = this.K;
        savedFilterState.tintHighlightsColor = this.L;
        savedFilterState.highlightsValue = this.M;
        savedFilterState.shadowsValue = this.N;
        savedFilterState.vignetteValue = this.O;
        savedFilterState.grainValue = this.P;
        savedFilterState.blurType = this.Q;
        savedFilterState.sharpenValue = this.R;
        savedFilterState.curvesToolValue = this.T;
        savedFilterState.blurExcludeSize = this.U;
        savedFilterState.blurExcludePoint = this.V;
        savedFilterState.blurExcludeBlurSize = this.W;
        savedFilterState.blurAngle = this.f30048a0;
        this.f30050b0 = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return e2.c.v(this.N, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return w.c.c(this.R, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.J / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.L;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.L == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.K;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.K == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f30052c0;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        xz xzVar = this.f30060i0;
        if (xzVar == null || (haVar = xzVar.F) == null) {
            return null;
        }
        synchronized (haVar.f27455n) {
            try {
                if (!haVar.f27458q) {
                    return null;
                }
                return haVar.f27457p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.O / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.G / 100.0f;
    }

    public final void h() {
        int i10 = this.Q;
        TextView textView = this.f30067p0;
        TextView textView2 = this.f30066o0;
        org.telegram.ui.ActionBar.g6 g6Var = this.F0;
        TextView textView3 = this.f30065n0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.f22061zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.k6.f22061zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.k6.f22061zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i13, g6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        }
        g();
    }

    @Override
    public final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.f30057f0;
            if (textureView instanceof x61) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                sk0 sk0Var = ((x61) textureView).f32959c;
                float f10 = sk0Var.f31078a;
                if (x10 >= f10 && x10 <= f10 + sk0Var.f31080c) {
                    float f11 = sk0Var.f31079b;
                    if (y10 >= f11 && y10 <= f11 + sk0Var.d) {
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
        float f10;
        float f11;
        float f12;
        float ceil;
        float f13;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f30059h0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z4 = this.f30074u0;
            if (!z4) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            int i15 = size2 - (dp2 + i12);
            TextureView textureView = this.f30057f0;
            Bitmap bitmap = this.f30082z0;
            if (bitmap != null) {
                int i16 = this.E0 % 360;
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
            float f14 = dp;
            float f15 = i15;
            if (f14 / width > f15 / height) {
                f13 = (int) Math.ceil(width * f12);
                ceil = f15;
            } else {
                ceil = (int) Math.ceil(f10 * f11);
                f13 = f14;
            }
            int ceil2 = (int) Math.ceil(((f14 - f13) / 2.0f) + AndroidUtilities.dp(14.0f));
            float dp3 = ((f15 - ceil) / 2.0f) + AndroidUtilities.dp(14.0f);
            if (!z4) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            int ceil3 = (int) Math.ceil(dp3 + i13);
            int i17 = (int) f13;
            int i18 = (int) ceil;
            if (this.f30058g0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i17;
                layoutParams.height = i18;
            }
            float f16 = ceil2;
            if (!z4) {
                i14 = AndroidUtilities.statusBarHeight;
            } else {
                i14 = 0;
            }
            float f17 = ceil3 - i14;
            float f18 = i17;
            float f19 = i18;
            gf0 gf0Var = this.m0;
            sk0 sk0Var = gf0Var.f27154e;
            sk0Var.f31078a = f16;
            sk0Var.f31079b = f17;
            sk0Var.f31080c = f18;
            sk0Var.d = f19;
            ef0 ef0Var = this.f30063l0;
            jv0 jv0Var = ef0Var.d;
            jv0Var.f28201a = f18;
            jv0Var.f28202b = f19;
            ((FrameLayout.LayoutParams) ef0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i15;
            ((FrameLayout.LayoutParams) gf0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i15;
            if (AndroidUtilities.isTablet()) {
                int dp4 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30061j0.getLayoutParams();
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

    public void setEnhanceValue(float f10) {
        this.D = f10 * 100.0f;
        g();
        int i10 = 0;
        while (true) {
            nh nhVar = this.f30061j0;
            if (i10 >= nhVar.getChildCount()) {
                break;
            }
            View childAt = nhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.v5) && RecyclerView.R(childAt) == this.f30049b) {
                ((org.telegram.ui.Cells.v5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.D);
                break;
            }
            i10++;
        }
        xz xzVar = this.f30060i0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
    }
}
