package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.nb0;
import org.webrtc.RendererCommon;

public class r2 extends FrameLayout {
    public boolean A;
    public long B;
    public final ArrayList C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public ValueAnimator U;
    public boolean V;
    public float W;

    public final boolean f33822a;

    public boolean f33823a0;

    public float f33824b;

    public boolean f33825b0;

    public boolean f33826c;
    public final q2 d;

    public final TextureView f33827e;

    public final ImageView f33828f;
    public final View h;

    public View f33829n;

    public final FrameLayout f33830r;

    public final ImageView f33831s;
    public final TextView v;

    public Bitmap f33832w;

    public final Bitmap f33833x;

    public float f33834y;

    public r2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (this.A || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        this.D = getMeasuredHeight();
        this.E = getMeasuredWidth();
        if (!this.f33825b0 || getParent() == null) {
            this.F = getY();
            this.G = getX();
        } else {
            View view = (View) getParent();
            this.F = view.getY();
            this.G = view.getX();
        }
        this.L = this.P;
        this.M = this.Q;
        this.N = this.R;
        q2 q2Var = this.d;
        this.O = q2Var.getMeasuredWidth();
        q2Var.getMeasuredHeight();
        this.A = true;
        requestLayout();
    }

    public void b() {
        invalidate();
        q2 q2Var = this.d;
        if (q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f33827e;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        textureView.animate().setDuration(300L).alpha(1.0f);
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(150, 150);
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.blurBitmap(bitmap, 3);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg"));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final void d(float f10, boolean z10) {
        if (this.f33826c) {
            float scaleX = ((View) getParent()).getScaleX();
            this.v.setAlpha(1.0f - f10);
            float fC = !z10 ? rl.c(0.4f, scaleX, f10, 1.0f / scaleX) : 1.0f - (0.4f * f10);
            ImageView imageView = this.f33831s;
            imageView.setScaleX(fC);
            imageView.setScaleY(fC);
            imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f10);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        q2 q2Var = this.d;
        if (z10) {
            TextureView textureView = this.f33827e;
            if (textureView != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.scale(textureView.getWidth() / bitmap.getWidth(), textureView.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
            if (q2Var != null) {
                canvas.save();
                canvas.translate(q2Var.getX(), q2Var.getY());
                Bitmap bitmap2 = q2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(q2Var.getWidth() / bitmap2.getWidth(), q2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f33828f;
        if (imageView.getVisibility() == 0 && q2Var.isFirstFrameRendered()) {
            float f10 = this.f33834y - 0.10666667f;
            this.f33834y = f10;
            if (f10 <= 0.0f) {
                this.f33834y = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.f33834y);
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.f33827e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.f33827e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            q2 q2Var = this.d;
            layoutParams.width = q2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = q2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f33829n == null) {
            View view = new View(getContext());
            this.f33829n = view;
            addView(view, z5.g());
        }
        return this.f33829n;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float top;
        final float left;
        super.onLayout(z10, i10, i11, i12, i13);
        TextureView textureView = this.f33827e;
        if (textureView != null) {
            this.Q = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.f33822a;
        q2 q2Var = this.d;
        if (!z11) {
            q2Var.updateRotation();
        }
        if (this.T == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.Q);
                textureView.setScaleY(this.Q);
                return;
            }
            return;
        }
        if (q2Var.getMeasuredHeight() == 0 || q2Var.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.P = 1.0f;
            if (this.U == null && !this.A) {
                this.K = 0.0f;
                this.J = 0.0f;
            }
        } else {
            int i14 = this.T;
            if (i14 == 0) {
                this.P = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.P = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || q2Var.getMeasuredHeight() <= q2Var.getMeasuredWidth()) {
                    this.P = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                } else {
                    this.P = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / q2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.P = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                if (this.V && !this.f33825b0 && this.U == null && !this.A) {
                    this.K = (getMeasuredWidth() - q2Var.getMeasuredWidth()) / 2.0f;
                    this.J = (getMeasuredHeight() - q2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.f33832w != null) {
            this.R = Math.max(getMeasuredWidth() / this.f33832w.getWidth(), getMeasuredHeight() / this.f33832w.getHeight());
        }
        if (!this.A) {
            if (this.U == null) {
                q2Var.setScaleX(this.P);
                q2Var.setScaleY(this.P);
                if (textureView != null) {
                    textureView.setScaleX(this.Q);
                    textureView.setScaleY(this.Q);
                }
                this.S = this.R;
                return;
            }
            return;
        }
        this.L /= q2Var.getMeasuredWidth() / this.O;
        this.M /= q2Var.getMeasuredWidth() / this.O;
        this.A = false;
        if (!this.f33825b0 || getParent() == null) {
            top = this.F - getTop();
            left = this.G - getLeft();
        } else {
            View view = (View) getParent();
            top = this.F - view.getTop();
            left = this.G - view.getLeft();
        }
        this.H = 0.0f;
        this.I = 0.0f;
        if (this.D != getMeasuredHeight()) {
            float measuredHeight = (getMeasuredHeight() - this.D) / 2.0f;
            this.H = measuredHeight;
            top -= measuredHeight;
        }
        final float f10 = top;
        if (this.E != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.E) / 2.0f;
            this.I = measuredWidth;
            left -= measuredWidth;
        }
        setTranslationY(f10);
        setTranslationX(left);
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.U.cancel();
        }
        q2Var.setScaleX(this.L);
        q2Var.setScaleY(this.L);
        if (textureView != null) {
            textureView.setScaleX(this.M);
            textureView.setScaleY(this.M);
        }
        this.J = this.H;
        this.K = this.I;
        invalidateOutline();
        invalidate();
        final float f11 = this.L;
        final float f12 = this.M;
        final float f13 = this.N;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.U = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = 1.0f - fFloatValue;
                r2 r2Var = this.f33802a;
                r2Var.W = f14;
                r2Var.J = r2Var.H * fFloatValue;
                r2Var.K = r2Var.I * fFloatValue;
                r2Var.invalidateOutline();
                r2Var.invalidate();
                float f15 = (r2Var.P * f14) + (f11 * fFloatValue);
                q2 q2Var2 = r2Var.d;
                q2Var2.setScaleX(f15);
                q2Var2.setScaleY(f15);
                float f16 = (r2Var.Q * f14) + (f12 * fFloatValue);
                TextureView textureView2 = r2Var.f33827e;
                if (textureView2 != null) {
                    textureView2.setScaleX(f16);
                    textureView2.setScaleY(f16);
                }
                r2Var.setTranslationX(left * fFloatValue);
                r2Var.setTranslationY(f10 * fFloatValue);
                r2Var.S = (r2Var.R * f14) + (f13 * fFloatValue);
            }
        });
        long j10 = this.B;
        if (j10 != 0) {
            this.U.setDuration(j10);
        } else {
            this.U.setDuration(350L);
        }
        this.U.setInterpolator(er.f28122f);
        this.U.addListener(new f11(this, 16));
        this.U.start();
        ArrayList arrayList = this.C;
        if (!arrayList.isEmpty()) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((Animator) arrayList.get(i15)).start();
            }
        }
        arrayList.clear();
        this.B = 0L;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.f33822a;
        q2 q2Var = this.d;
        if (!z10) {
            this.f33823a0 = true;
            q2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f33823a0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        q2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f33823a0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.B = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f33825b0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        this.f33826c = z10;
        this.f33830r.setVisibility(z10 ? 0 : 8);
        boolean z11 = this.f33826c;
        TextureView textureView = this.f33827e;
        q2 q2Var = this.d;
        if (z11) {
            q2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f33828f.setVisibility(8);
            return;
        }
        q2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.f33824b != f10) {
            this.f33824b = f10;
            invalidateOutline();
        }
    }

    public void setStub(r2 r2Var) {
        if (this.f33826c) {
            return;
        }
        Bitmap bitmap = r2Var.d.getBitmap();
        ImageView imageView = this.f33828f;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(r2Var.f33828f.getDrawable());
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.f33834y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f33832w = bitmap;
    }

    public r2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f33834y = 1.0f;
        this.C = new ArrayList();
        this.L = 1.0f;
        this.M = 1.0f;
        this.N = 1.0f;
        this.f33822a = z11;
        ImageView imageView = new ImageView(context);
        this.f33828f = imageView;
        q2 q2Var = new q2(this, context);
        this.d = q2Var;
        q2Var.setFpsReduction(30.0f);
        q2Var.setOpaque(false);
        q2Var.setEnableHardwareScaler(true);
        q2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, z5.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.f33827e = textureView;
                addView(textureView, z5.e(-1, -2, 17));
            }
            q2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(q2Var, z5.e(-1, -2, 17));
        } else if (z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.f33827e = textureView2;
                addView(textureView2, z5.e(-1, -2, 17));
            }
            addView(q2Var);
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.f33827e = textureView3;
                addView(textureView3, z5.e(-1, -2, 17));
            }
            addView(q2Var, z5.e(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.f33827e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f33830r = frameLayout;
        frameLayout.setBackground(new nb0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, z5.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f33831s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, z5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.y1.s(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, z5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new lg.b(this, 5));
            setClipToOutline(true);
        }
        if (z10 && this.f33833x == null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.f33833x = bitmapDecodeFile;
                if (bitmapDecodeFile == null) {
                    this.f33833x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f33833x);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (z11) {
            return;
        }
        this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }
}
