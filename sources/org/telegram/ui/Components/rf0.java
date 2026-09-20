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
public final class rf0 extends FrameLayout implements yz, ci.kc {
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
    public final org.telegram.ui.ActionBar.f6 I0;
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
    public final nf0 W;
    public boolean f27856a;
    public float f27857a0;
    public final int f27858b;
    public PointF f27859b0;
    public final int f27860c;
    public float f27861c0;
    public final int d;
    public float f27862d0;
    public final int e;
    public MediaController.SavedFilterState f27863e0;
    public final int f27864f;
    public final FrameLayout f27865f0;
    public final TextView f27866g0;
    public final int h;
    public final TextView f27867h0;
    public final TextureView f27868i0;
    public final boolean f27869j0;
    public final boolean f27870k0;
    public vz f27871l0;
    public final yh m0;
    public final int f27872n;
    public final FrameLayout f27873n0;
    public final gf0 f27874o0;
    public final if0 f27875p0;
    public final TextView f27876q0;
    public final int f27877r;
    public final TextView f27878r0;
    public final int f27879s;
    public final TextView f27880s0;
    public final FrameLayout f27881t0;
    public final RadioButton[] f27882u0;
    public final int v;
    public final od0 f27883v0;
    public final int f27884w;
    public final boolean f27885w0;
    public final int f27886x;
    public final boolean f27887x0;
    public final int f27888y;
    public int f27889y0;
    public final ImageView f27890z0;

    public rf0(android.content.Context r26, org.telegram.ui.Components.i71 r27, android.graphics.Bitmap r28, android.graphics.Bitmap r29, int r30, org.telegram.messenger.MediaController.SavedFilterState r31, org.telegram.ui.Components.od0 r32, int r33, boolean r34, boolean r35, org.telegram.ui.Components.ia r36, org.telegram.ui.ActionBar.f6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rf0.<init>(android.content.Context, org.telegram.ui.Components.i71, android.graphics.Bitmap, android.graphics.Bitmap, int, org.telegram.messenger.MediaController$SavedFilterState, org.telegram.ui.Components.od0, int, boolean, boolean, org.telegram.ui.Components.ia, org.telegram.ui.ActionBar.f6):void");
    }

    private void setShowOriginal(boolean z10) {
        if (this.f27856a != z10) {
            this.f27856a = z10;
            vz vzVar = this.f27871l0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        nf0 nf0Var = this.W;
        nf0Var.a();
        return nf0Var.e;
    }

    @Override
    public final boolean b() {
        if (!this.f27856a && !this.V) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return !this.W.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f27863e0;
        nf0 nf0Var = this.W;
        if (savedFilterState != null) {
            if (this.G != savedFilterState.enhanceValue || this.I != savedFilterState.contrastValue || this.P != savedFilterState.highlightsValue || this.H != savedFilterState.exposureValue || this.J != savedFilterState.warmthValue || this.K != savedFilterState.saturationValue || this.R != savedFilterState.vignetteValue || this.Q != savedFilterState.shadowsValue || this.S != savedFilterState.grainValue || this.U != savedFilterState.sharpenValue || this.L != savedFilterState.fadeValue || this.M != savedFilterState.softenSkinValue || this.O != savedFilterState.tintHighlightsColor || this.N != savedFilterState.tintShadowsColor || !nf0Var.b()) {
                return true;
            }
            return false;
        } else if (this.G != 0.0f || this.I != 0.0f || this.P != 0.0f || this.H != 0.0f || this.J != 0.0f || this.K != 0.0f || this.R != 0.0f || this.Q != 0.0f || this.S != 0.0f || this.U != 0.0f || this.L != 0.0f || this.M != 0.0f || this.O != 0 || this.N != 0 || !nf0Var.b()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j3);
        od0 od0Var = this.f27883v0;
        if (od0Var != null && view == (textureView = this.f27868i0)) {
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
            float measuredWidth2 = textureView.getMeasuredWidth() / od0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            od0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10 = this.f27869j0;
        TextureView textureView = this.f27868i0;
        if (z10) {
            vz vzVar = this.f27871l0;
            if (vzVar != null) {
                vzVar.postRunnable(new sz(vzVar, 0));
                this.f27871l0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof i71) {
            i71 i71Var = (i71) textureView;
            MediaController.SavedFilterState savedFilterState = this.f27863e0;
            if (savedFilterState == null) {
                i71Var.setDelegate(null);
                return;
            }
            vz vzVar2 = this.f27871l0;
            if (vzVar2 != null) {
                vzVar2.f(new wz(savedFilterState));
            }
        }
    }

    public final void f() {
        boolean z10;
        int i10 = this.f27889y0;
        yh yhVar = this.m0;
        if0 if0Var = this.f27875p0;
        FrameLayout frameLayout = this.f27881t0;
        FrameLayout frameLayout2 = this.f27873n0;
        gf0 gf0Var = this.f27874o0;
        if (i10 == 0) {
            gf0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            if0Var.setVisibility(4);
            yhVar.setVisibility(0);
        } else if (i10 == 1) {
            yhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            if0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.T != 0) {
                gf0Var.setVisibility(0);
            }
            h();
        } else if (i10 == 2) {
            yhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            gf0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            if0Var.setVisibility(0);
            this.W.f26634f = 0;
            for (int i11 = 0; i11 < 4; i11++) {
                RadioButton radioButton = this.f27882u0[i11];
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
        vz vzVar = this.f27871l0;
        if (vzVar != null && vzVar.f29867f && vzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (vzVar.postRunnable(new org.telegram.messenger.video.o(vzVar, bitmapArr, countDownLatch, 18))) {
                    countDownLatch.await();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.f27862d0;
    }

    public gf0 getBlurControl() {
        return this.f27874o0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.f27861c0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.f27859b0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.f27857a0;
    }

    @Override
    public int getBlurType() {
        return this.T;
    }

    public TextView getCancelTextView() {
        return this.f27867h0;
    }

    @Override
    public float getContrastValue() {
        return a4.a.e(this.I, 100.0f, 0.3f, 1.0f);
    }

    public if0 getCurveControl() {
        return this.f27875p0;
    }

    public TextView getDoneTextView() {
        return this.f27866g0;
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
        if (this.f27869j0 && !this.f27870k0) {
            return this.f27868i0;
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
        savedFilterState.blurExcludeSize = this.f27857a0;
        savedFilterState.blurExcludePoint = this.f27859b0;
        savedFilterState.blurExcludeBlurSize = this.f27861c0;
        savedFilterState.blurAngle = this.f27862d0;
        this.f27863e0 = savedFilterState;
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
        return this.f27865f0;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        vz vzVar = this.f27871l0;
        if (vzVar == null || (oaVar = vzVar.I) == null) {
            return null;
        }
        synchronized (oaVar.f26877n) {
            try {
                if (!oaVar.f26880q) {
                    return null;
                }
                return oaVar.f26879p;
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
        TextView textView = this.f27880s0;
        TextView textView2 = this.f27878r0;
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        TextView textView3 = this.f27876q0;
        if (i10 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i11 = org.telegram.ui.ActionBar.j6.f19505zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i12 = org.telegram.ui.ActionBar.j6.f19505zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i10 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i13 = org.telegram.ui.ActionBar.j6.f19505zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
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
            TextureView textureView = this.f27868i0;
            if (textureView instanceof i71) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                rk0 rk0Var = ((i71) textureView).f24904c;
                float f7 = rk0Var.f27913a;
                if (x10 >= f7 && x10 <= f7 + rk0Var.f27915c) {
                    float f10 = rk0Var.f27914b;
                    if (y3 >= f10 && y3 <= f10 + rk0Var.d) {
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
        if (this.f27870k0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.f27887x0;
            if (!z10) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            int i15 = size2 - (dp2 + i12);
            TextureView textureView = this.f27868i0;
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
            if (this.f27869j0) {
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
            if0 if0Var = this.f27875p0;
            rk0 rk0Var = if0Var.e;
            rk0Var.f27913a = f15;
            rk0Var.f27914b = f16;
            rk0Var.f27915c = f17;
            rk0Var.d = f18;
            gf0 gf0Var = this.f27874o0;
            uv0 uv0Var = gf0Var.d;
            uv0Var.f28868a = f17;
            uv0Var.f28869b = f18;
            ((FrameLayout.LayoutParams) gf0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i15;
            ((FrameLayout.LayoutParams) if0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i15;
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
            yh yhVar = this.m0;
            if (i10 >= yhVar.getChildCount()) {
                break;
            }
            View childAt = yhVar.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.w5) && RecyclerView.S(childAt) == this.f27858b) {
                ((org.telegram.ui.Cells.w5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.G);
                break;
            }
            i10++;
        }
        vz vzVar = this.f27871l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
    }
}
