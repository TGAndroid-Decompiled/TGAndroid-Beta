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
public final class og0 extends FrameLayout implements r00, ci.hc {
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
    public final org.telegram.ui.ActionBar.c6 I0;
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
    public final kg0 W;
    public boolean f29175a;
    public float f29176a0;
    public final int f29177b;
    public PointF f29178b0;
    public final int f29179c;
    public float f29180c0;
    public final int d;
    public float f29181d0;
    public final int f29182e;
    public MediaController.SavedFilterState f29183e0;
    public final int f29184f;
    public final FrameLayout f29185f0;
    public final TextView f29186g0;
    public final int h;
    public final TextView f29187h0;
    public final TextureView f29188i0;
    public final boolean f29189j0;
    public final boolean f29190k0;
    public o00 f29191l0;
    public final di m0;
    public final int f29192n;
    public final FrameLayout f29193n0;
    public final dg0 f29194o0;
    public final fg0 f29195p0;
    public final TextView f29196q0;
    public final int f29197r;
    public final TextView f29198r0;
    public final int f29199s;
    public final TextView f29200s0;
    public final FrameLayout f29201t0;
    public final RadioButton[] f29202u0;
    public final int v;
    public final le0 f29203v0;
    public final int f29204w;
    public final boolean f29205w0;
    public final int f29206x;
    public final boolean f29207x0;
    public final int f29208y;
    public int f29209y0;
    public final ImageView f29210z0;

    public og0(android.content.Context r26, org.telegram.ui.Components.f81 r27, android.graphics.Bitmap r28, android.graphics.Bitmap r29, int r30, org.telegram.messenger.MediaController.SavedFilterState r31, org.telegram.ui.Components.le0 r32, int r33, boolean r34, boolean r35, org.telegram.ui.Components.la r36, org.telegram.ui.ActionBar.c6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.og0.<init>(android.content.Context, org.telegram.ui.Components.f81, android.graphics.Bitmap, android.graphics.Bitmap, int, org.telegram.messenger.MediaController$SavedFilterState, org.telegram.ui.Components.le0, int, boolean, boolean, org.telegram.ui.Components.la, org.telegram.ui.ActionBar.c6):void");
    }

    private void setShowOriginal(boolean z10) {
        if (this.f29175a != z10) {
            this.f29175a = z10;
            o00 o00Var = this.f29191l0;
            if (o00Var != null) {
                o00Var.e(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        kg0 kg0Var = this.W;
        kg0Var.a();
        return kg0Var.f27855e;
    }

    @Override
    public final boolean b() {
        if (!this.f29175a && !this.V) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return !this.W.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f29183e0;
        kg0 kg0Var = this.W;
        if (savedFilterState != null) {
            if (this.G != savedFilterState.enhanceValue || this.I != savedFilterState.contrastValue || this.P != savedFilterState.highlightsValue || this.H != savedFilterState.exposureValue || this.J != savedFilterState.warmthValue || this.K != savedFilterState.saturationValue || this.R != savedFilterState.vignetteValue || this.Q != savedFilterState.shadowsValue || this.S != savedFilterState.grainValue || this.U != savedFilterState.sharpenValue || this.L != savedFilterState.fadeValue || this.M != savedFilterState.softenSkinValue || this.O != savedFilterState.tintHighlightsColor || this.N != savedFilterState.tintShadowsColor || !kg0Var.b()) {
                return true;
            }
            return false;
        } else if (this.G != 0.0f || this.I != 0.0f || this.P != 0.0f || this.H != 0.0f || this.J != 0.0f || this.K != 0.0f || this.R != 0.0f || this.Q != 0.0f || this.S != 0.0f || this.U != 0.0f || this.L != 0.0f || this.M != 0.0f || this.O != 0 || this.N != 0 || !kg0Var.b()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        le0 le0Var = this.f29203v0;
        if (le0Var != null && view == (textureView = this.f29188i0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / le0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            le0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10 = this.f29189j0;
        TextureView textureView = this.f29188i0;
        if (z10) {
            o00 o00Var = this.f29191l0;
            if (o00Var != null) {
                o00Var.postRunnable(new l00(o00Var, 0));
                this.f29191l0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof f81) {
            f81 f81Var = (f81) textureView;
            MediaController.SavedFilterState savedFilterState = this.f29183e0;
            if (savedFilterState == null) {
                f81Var.setDelegate(null);
                return;
            }
            o00 o00Var2 = this.f29191l0;
            if (o00Var2 != null) {
                o00Var2.f(new p00(savedFilterState));
            }
        }
    }

    public final void f() {
        boolean z10;
        int i10 = this.f29209y0;
        di diVar = this.m0;
        fg0 fg0Var = this.f29195p0;
        FrameLayout frameLayout = this.f29201t0;
        FrameLayout frameLayout2 = this.f29193n0;
        dg0 dg0Var = this.f29194o0;
        if (i10 == 0) {
            dg0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            fg0Var.setVisibility(4);
            diVar.setVisibility(0);
        } else if (i10 == 1) {
            diVar.setVisibility(4);
            frameLayout.setVisibility(4);
            fg0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                dg0Var.setVisibility(0);
            }
            h();
        } else if (i10 == 2) {
            diVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            dg0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            fg0Var.setVisibility(0);
            this.W.f27856f = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                RadioButton radioButton = this.f29202u0[i11];
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
        o00 o00Var = this.f29191l0;
        if (o00Var != null && o00Var.f29005f && o00Var.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (o00Var.postRunnable(new org.telegram.tgnet.h(o00Var, bitmapArr, countDownLatch, 19))) {
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
        return this.f29181d0;
    }

    public dg0 getBlurControl() {
        return this.f29194o0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f29180c0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f29178b0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f29176a0;
    }

    @Override
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.f29187h0;
    }

    @Override
    public float getContrastValue() {
        return a1.g.e(this.I, 100.0f, 0.3f, 1.0f);
    }

    public fg0 getCurveControl() {
        return this.f29195p0;
    }

    public TextView getDoneTextView() {
        return this.f29186g0;
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
        return com.google.android.gms.internal.vision.e2.x(this.P, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f29189j0 && !this.f29190k0) {
            return this.f29188i0;
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
        savedFilterState.blurExcludeSize = this.f29176a0;
        savedFilterState.blurExcludePoint = this.f29178b0;
        savedFilterState.blurExcludeBlurSize = this.f29180c0;
        savedFilterState.blurAngle = this.f29181d0;
        this.f29183e0 = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return com.google.android.gms.internal.vision.e2.x(this.Q, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a1.g.e(this.U, 100.0f, 0.6f, 0.11f);
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
        return this.f29185f0;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        o00 o00Var = this.f29191l0;
        if (o00Var == null || (raVar = o00Var.I) == null) {
            return null;
        }
        synchronized (raVar.f30126n) {
            try {
                if (!raVar.f30129q) {
                    return null;
                }
                return raVar.f30128p;
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
        TextView textView = this.f29200s0;
        TextView textView2 = this.f29198r0;
        org.telegram.ui.ActionBar.c6 c6Var = this.I0;
        TextView textView3 = this.f29196q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.h6.f20972zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.h6.f20972zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.h6.f20972zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i13, c6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
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
            TextureView textureView = this.f29188i0;
            if (textureView instanceof f81) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                sl0 sl0Var = ((f81) textureView).f25965c;
                float f7 = sl0Var.f30587a;
                if (x10 >= f7 && x10 <= f7 + sl0Var.f30589c) {
                    float f10 = sl0Var.f30588b;
                    if (y3 >= f10 && y3 <= f10 + sl0Var.d) {
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
        if (this.f29190k0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.f29207x0;
            if (!z10) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            int i15 = size2 - (dp2 + i12);
            TextureView textureView = this.f29188i0;
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
            if (this.f29189j0) {
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
            fg0 fg0Var = this.f29195p0;
            sl0 sl0Var = fg0Var.f26062e;
            sl0Var.f30587a = f15;
            sl0Var.f30588b = f16;
            sl0Var.f30589c = f17;
            sl0Var.d = f18;
            dg0 dg0Var = this.f29194o0;
            sw0 sw0Var = dg0Var.d;
            sw0Var.f30696a = f17;
            sw0Var.f30697b = f18;
            ((FrameLayout.LayoutParams) dg0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i15;
            ((FrameLayout.LayoutParams) fg0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i15;
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
            di diVar = this.m0;
            if (i10 >= diVar.getChildCount()) {
                break;
            }
            View childAt = diVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.v5) && RecyclerView.R(childAt) == this.f29177b) {
                ((org.telegram.ui.Cells.v5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.G);
                break;
            }
            i10++;
        }
        o00 o00Var = this.f29191l0;
        if (o00Var != null) {
            o00Var.e(true, false, false);
        }
    }
}
