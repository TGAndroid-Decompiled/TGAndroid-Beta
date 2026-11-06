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
import c8.ha;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;
import org.webrtc.RendererCommon;
public class k2 extends FrameLayout {
    public float D;
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
    public final boolean f39277a;
    public int f39278a0;
    public float f39279b;
    public ValueAnimator f39280b0;
    public boolean f39281c;
    public boolean f39282c0;
    public final j2 d;
    public float f39283d0;
    public final TextureView f39284e;
    public boolean f39285e0;
    public final ImageView f39286f;
    public boolean f39287f0;
    public final View h;
    public View f39288n;
    public final FrameLayout f39289r;
    public final ImageView f39290s;
    public final TextView f39291w;
    public Bitmap f39292x;
    public final Bitmap f39293y;

    public k2(Context context, boolean z9, boolean z10) {
        this(context, z9, z10, true, false);
    }

    public void a() {
        if (!this.E && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.H = getMeasuredHeight();
            this.I = getMeasuredWidth();
            if (this.f39287f0 && getParent() != null) {
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
            j2 j2Var = this.d;
            this.S = j2Var.getMeasuredWidth();
            j2Var.getMeasuredHeight();
            this.E = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        j2 j2Var = this.d;
        if (j2Var.getAlpha() != 1.0f) {
            j2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f39284e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
    }

    public final void c() {
        Bitmap bitmap = this.d.getBitmap(150, 150);
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.blurBitmap(bitmap, 3);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg"));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(boolean z9, float f10) {
        float f11;
        if (!this.f39281c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.f39291w.setAlpha(1.0f - f10);
        if (!z9) {
            f11 = org.telegram.messenger.camera.q.v(0.4f, scaleX, f10, 1.0f / scaleX);
        } else {
            f11 = 1.0f - (0.4f * f10);
        }
        ImageView imageView = this.f39290s;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setTranslationY(org.telegram.messenger.g0.L(60.0f) * f10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z9 = org.telegram.messenger.g0.m0;
        j2 j2Var = this.d;
        if (z9) {
            TextureView textureView = this.f39284e;
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
            if (j2Var != null) {
                canvas.save();
                canvas.translate(j2Var.getX(), j2Var.getY());
                Bitmap bitmap2 = j2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(j2Var.getWidth() / bitmap2.getWidth(), j2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f39286f;
        if (imageView.getVisibility() == 0 && j2Var.isFirstFrameRendered()) {
            float f10 = this.D - 0.10666667f;
            this.D = f10;
            if (f10 <= 0.0f) {
                this.D = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.D);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (org.telegram.messenger.g0.m0 && (view == this.d || view == this.f39284e)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public void e() {
        TextureView textureView = this.f39284e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            j2 j2Var = this.d;
            layoutParams.width = j2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = j2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f39288n == null) {
            View view = new View(getContext());
            this.f39288n = view;
            addView(view, ha.g());
        }
        return this.f39288n;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        float top;
        final float left;
        super.onLayout(z9, i7, i10, i11, i12);
        TextureView textureView = this.f39284e;
        if (textureView != null) {
            this.U = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z10 = this.f39277a;
        j2 j2Var = this.d;
        if (!z10) {
            j2Var.updateRotation();
        }
        if (this.f39278a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (j2Var.getMeasuredHeight() != 0 && j2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i13 = this.f39278a0;
            if (i13 == 0) {
                this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
            } else if (i13 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && j2Var.getMeasuredHeight() > j2Var.getMeasuredWidth()) {
                    this.T = Math.max(getMeasuredHeight() / j2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / j2Var.getMeasuredWidth());
                } else {
                    this.T = Math.min(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                }
            } else if (i13 == 1) {
                this.T = Math.min(getMeasuredHeight() / j2Var.getMeasuredHeight(), getMeasuredWidth() / j2Var.getMeasuredWidth());
                if (this.f39282c0 && !this.f39287f0 && this.f39280b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - j2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.T = 1.0f;
            if (this.f39280b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        }
        if (this.f39292x != null) {
            this.V = Math.max(getMeasuredWidth() / this.f39292x.getWidth(), getMeasuredHeight() / this.f39292x.getHeight());
        }
        if (this.E) {
            this.P /= j2Var.getMeasuredWidth() / this.S;
            this.Q /= j2Var.getMeasuredWidth() / this.S;
            this.E = false;
            if (this.f39287f0 && getParent() != null) {
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
            final float f10 = top;
            if (this.I != getMeasuredWidth()) {
                float measuredWidth = (getMeasuredWidth() - this.I) / 2.0f;
                this.M = measuredWidth;
                left -= measuredWidth;
            }
            setTranslationY(f10);
            setTranslationX(left);
            ValueAnimator valueAnimator = this.f39280b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f39280b0.cancel();
            }
            j2Var.setScaleX(this.P);
            j2Var.setScaleY(this.P);
            if (textureView != null) {
                textureView.setScaleX(this.Q);
                textureView.setScaleY(this.Q);
            }
            this.N = this.L;
            this.O = this.M;
            invalidateOutline();
            invalidate();
            final float f11 = this.P;
            final float f12 = this.Q;
            final float f13 = this.R;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f39280b0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f14 = 1.0f - floatValue;
                    k2 k2Var = k2.this;
                    k2Var.f39283d0 = f14;
                    k2Var.N = k2Var.L * floatValue;
                    k2Var.O = k2Var.M * floatValue;
                    k2Var.invalidateOutline();
                    k2Var.invalidate();
                    float f15 = (k2Var.T * f14) + (f11 * floatValue);
                    j2 j2Var2 = k2Var.d;
                    j2Var2.setScaleX(f15);
                    j2Var2.setScaleY(f15);
                    float f16 = (k2Var.U * f14) + (f12 * floatValue);
                    TextureView textureView2 = k2Var.f39284e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f16);
                        textureView2.setScaleY(f16);
                    }
                    k2Var.setTranslationX(left * floatValue);
                    k2Var.setTranslationY(f10 * floatValue);
                    k2Var.W = (k2Var.V * f14) + (f13 * floatValue);
                }
            });
            long j3 = this.F;
            if (j3 != 0) {
                this.f39280b0.setDuration(j3);
            } else {
                this.f39280b0.setDuration(350L);
            }
            this.f39280b0.setInterpolator(xq.f40310f);
            this.f39280b0.addListener(new va(this, 16));
            this.f39280b0.start();
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Animator) arrayList.get(i14)).start();
                }
            }
            arrayList.clear();
            this.F = 0L;
        } else if (this.f39280b0 == null) {
            j2Var.setScaleX(this.T);
            j2Var.setScaleY(this.T);
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
            }
            this.W = this.V;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.f39277a;
        j2 j2Var = this.d;
        if (!z9) {
            this.f39285e0 = true;
            j2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f39285e0 = false;
        }
        super.onMeasure(i7, i10);
        e();
        super.onMeasure(i7, i10);
        j2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f39285e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j3) {
        this.F = j3;
    }

    public void setAnimateWithParent(boolean z9) {
        this.f39287f0 = z9;
    }

    public void setIsScreencast(boolean z9) {
        int i7;
        this.f39281c = z9;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f39289r.setVisibility(i7);
        boolean z10 = this.f39281c;
        TextureView textureView = this.f39284e;
        j2 j2Var = this.d;
        if (z10) {
            j2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f39286f.setVisibility(8);
            return;
        }
        j2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.f39279b != f10) {
            this.f39279b = f10;
            invalidateOutline();
        }
    }

    public void setStub(k2 k2Var) {
        if (this.f39281c) {
            return;
        }
        Bitmap bitmap = k2Var.d.getBitmap();
        ImageView imageView = this.f39286f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(k2Var.f39286f.getDrawable());
        }
        this.D = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f39292x = bitmap;
    }

    public k2(Context context, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.D = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.f39277a = z10;
        ImageView imageView = new ImageView(context);
        this.f39286f = imageView;
        j2 j2Var = new j2(this, context);
        this.d = j2Var;
        j2Var.setFpsReduction(30.0f);
        j2Var.setOpaque(false);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setIsCamera(!z10);
        if (!z9 && z10) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, ha.c(-1.0f, -1));
            if (z12) {
                TextureView textureView = new TextureView(context);
                this.f39284e = textureView;
                addView(textureView, ha.e(-1, -2, 17));
            }
            j2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(j2Var, ha.e(-1, -2, 17));
        } else if (!z9) {
            if (z12) {
                TextureView textureView2 = new TextureView(context);
                this.f39284e = textureView2;
                addView(textureView2, ha.e(-1, -2, 17));
            }
            addView(j2Var, ha.e(-1, -2, 17));
        } else {
            if (z12) {
                TextureView textureView3 = new TextureView(context);
                this.f39284e = textureView3;
                addView(textureView3, ha.e(-1, -2, 17));
            }
            addView(j2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.f39284e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39289r = frameLayout;
        frameLayout.setBackground(new qa0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, ha.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f39290s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232679);
        frameLayout.addView(imageView2, ha.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.f39291w = textView;
        textView.setText(hd.M0(2131743223, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ha.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z11) {
            setOutlineProvider(new fh.a(this, 8));
            setClipToOutline(true);
        }
        if (z9 && this.f39293y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.f39293y = decodeFile;
                if (decodeFile == null) {
                    this.f39293y = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f39293y);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (z10) {
            return;
        }
        this.d.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }
}
