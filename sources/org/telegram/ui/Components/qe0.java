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
public final class qe0 extends FrameLayout implements kz, kh.sb {
    public final int A;
    public final Rect A0;
    public final int B;
    public final Matrix B0;
    public float C;
    public final Paint C0;
    public float D;
    public final int D0;
    public float E;
    public final org.telegram.ui.ActionBar.b6 E0;
    public float F;
    public int F0;
    public float G;
    public int G0;
    public float H;
    public float I;
    public int J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public boolean R;
    public final me0 S;
    public float T;
    public PointF U;
    public float V;
    public float W;
    public boolean f31890a;
    public MediaController.SavedFilterState f31891a0;
    public final int f31892b;
    public final FrameLayout f31893b0;
    public final int f31894c;
    public final TextView f31895c0;
    public final int d;
    public final TextView f31896d0;
    public final int f31897e;
    public final TextureView f31898e0;
    public final int f31899f;
    public final boolean f31900f0;
    public final boolean f31901g0;
    public final int h;
    public hz f31902h0;
    public final nh f31903i0;
    public final FrameLayout f31904j0;
    public final fe0 f31905k0;
    public final he0 f31906l0;
    public final TextView m0;
    public final int f31907n;
    public final TextView f31908n0;
    public final TextView f31909o0;
    public final FrameLayout f31910p0;
    public final RadioButton[] f31911q0;
    public final int f31912r;
    public final mc0 f31913r0;
    public final int f31914s;
    public final boolean f31915s0;
    public final boolean f31916t0;
    public int f31917u0;
    public final int v;
    public final ImageView f31918v0;
    public final int f31919w;
    public final ImageView f31920w0;
    public final int f31921x;
    public final ImageView f31922x0;
    public final int f31923y;
    public final Bitmap f31924y0;
    public final Bitmap f31925z0;

    public qe0(android.content.Context r26, org.telegram.ui.Components.y51 r27, android.graphics.Bitmap r28, android.graphics.Bitmap r29, int r30, org.telegram.messenger.MediaController.SavedFilterState r31, org.telegram.ui.Components.mc0 r32, int r33, boolean r34, boolean r35, org.telegram.ui.Components.ba r36, org.telegram.ui.ActionBar.b6 r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qe0.<init>(android.content.Context, org.telegram.ui.Components.y51, android.graphics.Bitmap, android.graphics.Bitmap, int, org.telegram.messenger.MediaController$SavedFilterState, org.telegram.ui.Components.mc0, int, boolean, boolean, org.telegram.ui.Components.ba, org.telegram.ui.ActionBar.b6):void");
    }

    private void setShowOriginal(boolean z10) {
        if (this.f31890a != z10) {
            this.f31890a = z10;
            hz hzVar = this.f31902h0;
            if (hzVar != null) {
                hzVar.e(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        me0 me0Var = this.S;
        me0Var.a();
        return me0Var.f30805e;
    }

    @Override
    public final boolean b() {
        if (!this.f31890a && !this.R) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return !this.S.b();
    }

    public final boolean d() {
        MediaController.SavedFilterState savedFilterState = this.f31891a0;
        me0 me0Var = this.S;
        if (savedFilterState != null) {
            if (this.C != savedFilterState.enhanceValue || this.E != savedFilterState.contrastValue || this.L != savedFilterState.highlightsValue || this.D != savedFilterState.exposureValue || this.F != savedFilterState.warmthValue || this.G != savedFilterState.saturationValue || this.N != savedFilterState.vignetteValue || this.M != savedFilterState.shadowsValue || this.O != savedFilterState.grainValue || this.Q != savedFilterState.sharpenValue || this.H != savedFilterState.fadeValue || this.I != savedFilterState.softenSkinValue || this.K != savedFilterState.tintHighlightsColor || this.J != savedFilterState.tintShadowsColor || !me0Var.b()) {
                return true;
            }
            return false;
        } else if (this.C != 0.0f || this.E != 0.0f || this.L != 0.0f || this.D != 0.0f || this.F != 0.0f || this.G != 0.0f || this.N != 0.0f || this.M != 0.0f || this.O != 0.0f || this.Q != 0.0f || this.H != 0.0f || this.I != 0.0f || this.K != 0 || this.J != 0 || !me0Var.b()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j10);
        mc0 mc0Var = this.f31913r0;
        if (mc0Var != null && view == (textureView = this.f31898e0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.f31925z0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.A0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.C0;
                int i9 = this.D0;
                if (i9 != 0) {
                    Matrix matrix = this.B0;
                    matrix.reset();
                    matrix.postRotate(i9, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / mc0Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            mc0Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z10 = this.f31900f0;
        TextureView textureView = this.f31898e0;
        if (z10) {
            hz hzVar = this.f31902h0;
            if (hzVar != null) {
                hzVar.postRunnable(new ez(hzVar, 0));
                this.f31902h0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof y51) {
            y51 y51Var = (y51) textureView;
            MediaController.SavedFilterState savedFilterState = this.f31891a0;
            if (savedFilterState == null) {
                y51Var.setDelegate(null);
                return;
            }
            hz hzVar2 = this.f31902h0;
            if (hzVar2 != null) {
                hzVar2.f(new iz(savedFilterState));
            }
        }
    }

    public final void f() {
        boolean z10;
        int i9 = this.f31917u0;
        nh nhVar = this.f31903i0;
        he0 he0Var = this.f31906l0;
        FrameLayout frameLayout = this.f31910p0;
        FrameLayout frameLayout2 = this.f31904j0;
        fe0 fe0Var = this.f31905k0;
        if (i9 == 0) {
            fe0Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            nhVar.setVisibility(0);
        } else if (i9 == 1) {
            nhVar.setVisibility(4);
            frameLayout.setVisibility(4);
            he0Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.P != 0) {
                fe0Var.setVisibility(0);
            }
            h();
        } else if (i9 == 2) {
            nhVar.setVisibility(4);
            frameLayout2.setVisibility(4);
            fe0Var.setVisibility(4);
            frameLayout.setVisibility(0);
            he0Var.setVisibility(0);
            this.S.f30806f = 0;
            for (int i10 = 0; i10 < 4; i10++) {
                RadioButton radioButton = this.f31911q0[i10];
                if (i10 == 0) {
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
        if (Math.abs(this.C) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.D) < 0.1f && Math.abs(this.E) < 0.1f && Math.abs(this.F) < 0.1f && Math.abs(this.G) < 0.1f && Math.abs(this.H) < 0.1f && this.J == 0 && this.K == 0 && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.O) < 0.1f && this.P == 0 && Math.abs(this.Q) < 0.1f && this.S.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R = z10;
    }

    public Bitmap getBitmap() {
        hz hzVar = this.f31902h0;
        if (hzVar != null && hzVar.f29238f && hzVar.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (hzVar.postRunnable(new org.telegram.messenger.video.e(hzVar, bitmapArr, countDownLatch, 20))) {
                    countDownLatch.await();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.W;
    }

    public fe0 getBlurControl() {
        return this.f31905k0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.V;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.U;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.T;
    }

    @Override
    public int getBlurType() {
        return this.P;
    }

    public TextView getCancelTextView() {
        return this.f31896d0;
    }

    @Override
    public float getContrastValue() {
        return org.telegram.ui.Cells.j2.b(this.E, 100.0f, 0.3f, 1.0f);
    }

    public he0 getCurveControl() {
        return this.f31906l0;
    }

    public TextView getDoneTextView() {
        return this.f31895c0;
    }

    @Override
    public float getEnhanceValue() {
        return this.C / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.D / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.O / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return e2.c.y(this.L, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.f31900f0 && !this.f31901g0) {
            return this.f31898e0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f10 = this.G / 100.0f;
        if (f10 > 0.0f) {
            f10 *= 1.05f;
        }
        return f10 + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.C;
        savedFilterState.exposureValue = this.D;
        savedFilterState.contrastValue = this.E;
        savedFilterState.warmthValue = this.F;
        savedFilterState.saturationValue = this.G;
        savedFilterState.fadeValue = this.H;
        savedFilterState.softenSkinValue = this.I;
        savedFilterState.tintShadowsColor = this.J;
        savedFilterState.tintHighlightsColor = this.K;
        savedFilterState.highlightsValue = this.L;
        savedFilterState.shadowsValue = this.M;
        savedFilterState.vignetteValue = this.N;
        savedFilterState.grainValue = this.O;
        savedFilterState.blurType = this.P;
        savedFilterState.sharpenValue = this.Q;
        savedFilterState.curvesToolValue = this.S;
        savedFilterState.blurExcludeSize = this.T;
        savedFilterState.blurExcludePoint = this.U;
        savedFilterState.blurExcludeBlurSize = this.V;
        savedFilterState.blurAngle = this.W;
        this.f31891a0 = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return e2.c.y(this.M, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return org.telegram.ui.Cells.j2.b(this.Q, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.I / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.K;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.K == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.J;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.J == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.f31893b0;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        hz hzVar = this.f31902h0;
        if (hzVar == null || (haVar = hzVar.E) == null) {
            return null;
        }
        synchronized (haVar.f29015n) {
            try {
                if (!haVar.f29018q) {
                    return null;
                }
                return haVar.f29017p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.N / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.F / 100.0f;
    }

    public final void h() {
        int i9 = this.P;
        TextView textView = this.f31909o0;
        TextView textView2 = this.f31908n0;
        org.telegram.ui.ActionBar.b6 b6Var = this.E0;
        TextView textView3 = this.m0;
        if (i9 == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i10 = org.telegram.ui.ActionBar.f6.f23395zf;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i9 == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i11 = org.telegram.ui.ActionBar.f6.f23395zf;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i9 == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i12 = org.telegram.ui.ActionBar.f6.f23395zf;
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i12, b6Var), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
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
            TextureView textureView = this.f31898e0;
            if (textureView instanceof y51) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                wj0 wj0Var = ((y51) textureView).f34863c;
                float f10 = wj0Var.f34233a;
                if (x10 >= f10 && x10 <= f10 + wj0Var.f34235c) {
                    float f11 = wj0Var.f34234b;
                    if (y10 >= f11 && y10 <= f11 + wj0Var.d) {
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        float width;
        int height;
        float f10;
        float f11;
        float f12;
        float ceil;
        float f13;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        if (this.f31901g0) {
            int dp = size - AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(214.0f);
            boolean z10 = this.f31916t0;
            if (!z10) {
                i11 = AndroidUtilities.statusBarHeight;
            } else {
                i11 = 0;
            }
            int i14 = size2 - (dp2 + i11);
            TextureView textureView = this.f31898e0;
            Bitmap bitmap = this.f31924y0;
            if (bitmap != null) {
                int i15 = this.D0 % 360;
                if (i15 != 90 && i15 != 270) {
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
            float f15 = i14;
            if (f14 / width > f15 / height) {
                f13 = (int) Math.ceil(width * f12);
                ceil = f15;
            } else {
                ceil = (int) Math.ceil(f10 * f11);
                f13 = f14;
            }
            int ceil2 = (int) Math.ceil(((f14 - f13) / 2.0f) + AndroidUtilities.dp(14.0f));
            float dp3 = ((f15 - ceil) / 2.0f) + AndroidUtilities.dp(14.0f);
            if (!z10) {
                i12 = AndroidUtilities.statusBarHeight;
            } else {
                i12 = 0;
            }
            int ceil3 = (int) Math.ceil(dp3 + i12);
            int i16 = (int) f13;
            int i17 = (int) ceil;
            if (this.f31900f0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i16;
                layoutParams.height = i17;
            }
            float f16 = ceil2;
            if (!z10) {
                i13 = AndroidUtilities.statusBarHeight;
            } else {
                i13 = 0;
            }
            float f17 = ceil3 - i13;
            float f18 = i16;
            float f19 = i17;
            he0 he0Var = this.f31906l0;
            wj0 wj0Var = he0Var.f29058e;
            wj0Var.f34233a = f16;
            wj0Var.f34234b = f17;
            wj0Var.f34235c = f18;
            wj0Var.d = f19;
            fe0 fe0Var = this.f31905k0;
            qu0 qu0Var = fe0Var.d;
            qu0Var.f32026a = f18;
            qu0Var.f32027b = f19;
            ((FrameLayout.LayoutParams) fe0Var.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i14;
            ((FrameLayout.LayoutParams) he0Var.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i14;
            if (AndroidUtilities.isTablet()) {
                int dp4 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f31903i0.getLayoutParams();
                if (dp4 < dp) {
                    layoutParams2.width = dp4;
                    layoutParams2.leftMargin = (dp - dp4) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setEnhanceValue(float f10) {
        this.C = f10 * 100.0f;
        g();
        int i9 = 0;
        while (true) {
            nh nhVar = this.f31903i0;
            if (i9 >= nhVar.getChildCount()) {
                break;
            }
            View childAt = nhVar.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.v5) && RecyclerView.R(childAt) == this.f31892b) {
                ((org.telegram.ui.Cells.v5) childAt).a(LocaleController.getString(R.string.Enhance), 0, this.C);
                break;
            }
            i9++;
        }
        hz hzVar = this.f31902h0;
        if (hzVar != null) {
            hzVar.e(true, false, false);
        }
    }
}
