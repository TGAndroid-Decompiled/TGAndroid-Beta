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
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.wc0;
import org.webrtc.RendererCommon;
import w7.z5;
public class q2 extends FrameLayout {
    public boolean E;
    public long F;
    public final ArrayList G;
    public int H;
    public int I;
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
    public float T;
    public float U;
    public float V;
    public float W;
    public final boolean f31690a;
    public int f31691a0;
    public float f31692b;
    public ValueAnimator f31693b0;
    public boolean f31694c;
    public boolean f31695c0;
    public final p2 d;
    public float f31696d0;
    public final TextureView e;
    public boolean f31697e0;
    public final ImageView f31698f;
    public boolean f31699f0;
    public final View h;
    public View f31700n;
    public final FrameLayout f31701r;
    public final ImageView f31702s;
    public final TextView v;
    public Bitmap f31703w;
    public final Bitmap f31704x;
    public float f31705y;

    public q2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.E && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.H = getMeasuredHeight();
            this.I = getMeasuredWidth();
            if (this.f31699f0 && getParent() != null) {
                View view = (View) getParent();
                this.J = view.getY();
                this.K = view.getX();
            } else {
                this.J = getY();
                this.K = getX();
            }
            this.P = this.T;
            this.Q = this.U;
            this.R = this.V;
            p2 p2Var = this.d;
            this.S = p2Var.getMeasuredWidth();
            p2Var.getMeasuredHeight();
            this.E = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        p2 p2Var = this.d;
        if (p2Var.getAlpha() != 1.0f) {
            p2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(150, 150);
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.blurBitmap(bitmap, 3);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg"));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(float f7, boolean z10) {
        float f10;
        if (!this.f31694c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.v.setAlpha(1.0f - f7);
        if (!z10) {
            f10 = kk.x(0.4f, scaleX, f7, 1.0f / scaleX);
        } else {
            f10 = 1.0f - (0.4f * f7);
        }
        ImageView imageView = this.f31702s;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        p2 p2Var = this.d;
        if (z10) {
            TextureView textureView = this.e;
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
            if (p2Var != null) {
                canvas.save();
                canvas.translate(p2Var.getX(), p2Var.getY());
                Bitmap bitmap2 = p2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(p2Var.getWidth() / bitmap2.getWidth(), p2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f31698f;
        if (imageView.getVisibility() == 0 && p2Var.isFirstFrameRendered()) {
            float f7 = this.f31705y - 0.10666667f;
            this.f31705y = f7;
            if (f7 <= 0.0f) {
                this.f31705y = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.f31705y);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            p2 p2Var = this.d;
            layoutParams.width = p2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = p2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f31700n == null) {
            View view = new View(getContext());
            this.f31700n = view;
            addView(view, z5.g());
        }
        return this.f31700n;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float top;
        final float left;
        super.onLayout(z10, i10, i11, i12, i13);
        TextureView textureView = this.e;
        if (textureView != null) {
            this.U = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.f31690a;
        p2 p2Var = this.d;
        if (!z11) {
            p2Var.updateRotation();
        }
        if (this.f31691a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (p2Var.getMeasuredHeight() != 0 && p2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i14 = this.f31691a0;
            if (i14 == 0) {
                this.T = Math.max(getMeasuredHeight() / p2Var.getMeasuredHeight(), getMeasuredWidth() / p2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / p2Var.getMeasuredHeight(), getMeasuredWidth() / p2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && p2Var.getMeasuredHeight() > p2Var.getMeasuredWidth()) {
                    this.T = Math.max(getMeasuredHeight() / p2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / p2Var.getMeasuredWidth());
                } else {
                    this.T = Math.min(getMeasuredHeight() / p2Var.getMeasuredHeight(), getMeasuredWidth() / p2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.T = Math.min(getMeasuredHeight() / p2Var.getMeasuredHeight(), getMeasuredWidth() / p2Var.getMeasuredWidth());
                if (this.f31695c0 && !this.f31699f0 && this.f31693b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - p2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - p2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.T = 1.0f;
            if (this.f31693b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        }
        if (this.f31703w != null) {
            this.V = Math.max(getMeasuredWidth() / this.f31703w.getWidth(), getMeasuredHeight() / this.f31703w.getHeight());
        }
        if (this.E) {
            this.P /= p2Var.getMeasuredWidth() / this.S;
            this.Q /= p2Var.getMeasuredWidth() / this.S;
            this.E = false;
            if (this.f31699f0 && getParent() != null) {
                View view = (View) getParent();
                top = this.J - view.getTop();
                left = this.K - view.getLeft();
            } else {
                top = this.J - getTop();
                left = this.K - getLeft();
            }
            this.L = 0.0f;
            this.M = 0.0f;
            if (this.H != getMeasuredHeight()) {
                float measuredHeight = (getMeasuredHeight() - this.H) / 2.0f;
                this.L = measuredHeight;
                top -= measuredHeight;
            }
            final float f7 = top;
            if (this.I != getMeasuredWidth()) {
                float measuredWidth = (getMeasuredWidth() - this.I) / 2.0f;
                this.M = measuredWidth;
                left -= measuredWidth;
            }
            setTranslationY(f7);
            setTranslationX(left);
            ValueAnimator valueAnimator = this.f31693b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31693b0.cancel();
            }
            p2Var.setScaleX(this.P);
            p2Var.setScaleY(this.P);
            if (textureView != null) {
                textureView.setScaleX(this.Q);
                textureView.setScaleY(this.Q);
            }
            this.N = this.L;
            this.O = this.M;
            invalidateOutline();
            invalidate();
            final float f10 = this.P;
            final float f11 = this.Q;
            final float f12 = this.R;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f31693b0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f13 = 1.0f - floatValue;
                    q2 q2Var = q2.this;
                    q2Var.f31696d0 = f13;
                    q2Var.N = q2Var.L * floatValue;
                    q2Var.O = q2Var.M * floatValue;
                    q2Var.invalidateOutline();
                    q2Var.invalidate();
                    float f14 = (q2Var.T * f13) + (f10 * floatValue);
                    p2 p2Var2 = q2Var.d;
                    p2Var2.setScaleX(f14);
                    p2Var2.setScaleY(f14);
                    float f15 = (q2Var.U * f13) + (f11 * floatValue);
                    TextureView textureView2 = q2Var.e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f15);
                        textureView2.setScaleY(f15);
                    }
                    q2Var.setTranslationX(left * floatValue);
                    q2Var.setTranslationY(f7 * floatValue);
                    q2Var.W = (q2Var.V * f13) + (f12 * floatValue);
                }
            });
            long j10 = this.F;
            if (j10 != 0) {
                this.f31693b0.setDuration(j10);
            } else {
                this.f31693b0.setDuration(350L);
            }
            this.f31693b0.setInterpolator(bs.f25037f);
            this.f31693b0.addListener(new n31(this, 14));
            this.f31693b0.start();
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty()) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((Animator) arrayList.get(i15)).start();
                }
            }
            arrayList.clear();
            this.F = 0L;
        } else if (this.f31693b0 == null) {
            p2Var.setScaleX(this.T);
            p2Var.setScaleY(this.T);
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
            }
            this.W = this.V;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.f31690a;
        p2 p2Var = this.d;
        if (!z10) {
            this.f31697e0 = true;
            p2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f31697e0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        p2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f31697e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.F = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f31699f0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i10;
        this.f31694c = z10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f31701r.setVisibility(i10);
        boolean z11 = this.f31694c;
        TextureView textureView = this.e;
        p2 p2Var = this.d;
        if (z11) {
            p2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f31698f.setVisibility(8);
            return;
        }
        p2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f7) {
        if (this.f31692b != f7) {
            this.f31692b = f7;
            invalidateOutline();
        }
    }

    public void setStub(q2 q2Var) {
        if (this.f31694c) {
            return;
        }
        Bitmap bitmap = q2Var.d.getBitmap();
        ImageView imageView = this.f31698f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(q2Var.f31698f.getDrawable());
        }
        this.f31705y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f31703w = bitmap;
    }

    public q2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f31705y = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.f31690a = z11;
        ImageView imageView = new ImageView(context);
        this.f31698f = imageView;
        p2 p2Var = new p2(this, context);
        this.d = p2Var;
        p2Var.setFpsReduction(30.0f);
        p2Var.setOpaque(false);
        p2Var.setEnableHardwareScaler(true);
        p2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, z5.d(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, z5.e(-1, -2, 17));
            }
            p2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(p2Var, z5.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, z5.e(-1, -2, 17));
            }
            addView(p2Var, z5.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, z5.e(-1, -2, 17));
            }
            addView(p2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f31701r = frameLayout;
        frameLayout.setBackground(new wc0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, z5.d(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f31702s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, z5.a(82.0f, 0.0f, 0.0f, 0.0f, 60.0f, 82, 17));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.g0.m(15.0f, -1, 1, textView);
        frameLayout.addView(textView, z5.a(-2.0f, 21.0f, 28.0f, 21.0f, 0.0f, -1, 17));
        if (z12) {
            setOutlineProvider(new dh.b(this, 5));
            setClipToOutline(true);
        }
        if (z10 && this.f31704x == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.f31704x = decodeFile;
                if (decodeFile == null) {
                    this.f31704x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f31704x);
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
