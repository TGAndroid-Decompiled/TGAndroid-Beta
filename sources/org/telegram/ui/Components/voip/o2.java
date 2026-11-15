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
import c8.ja;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ra0;
import org.webrtc.RendererCommon;
public class o2 extends FrameLayout {
    public float E;
    public boolean F;
    public long G;
    public final ArrayList H;
    public int I;
    public int J;
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
    public final boolean f40826a;
    public float f40827a0;
    public float f40828b;
    public int f40829b0;
    public boolean f40830c;
    public ValueAnimator f40831c0;
    public final n2 d;
    public boolean f40832d0;
    public final TextureView f40833e;
    public float f40834e0;
    public final ImageView f40835f;
    public boolean f40836f0;
    public boolean f40837g0;
    public final View h;
    public View f40838n;
    public final FrameLayout f40839r;
    public final ImageView f40840s;
    public final TextView f40841w;
    public Bitmap f40842x;
    public final Bitmap f40843y;

    public o2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.F && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.I = getMeasuredHeight();
            this.J = getMeasuredWidth();
            if (this.f40837g0 && getParent() != null) {
                View view = (View) getParent();
                this.K = view.getY();
                this.L = view.getX();
            } else {
                this.K = getY();
                this.L = getX();
            }
            this.Q = this.U;
            this.R = this.V;
            this.S = this.W;
            n2 n2Var = this.d;
            this.T = n2Var.getMeasuredWidth();
            n2Var.getMeasuredHeight();
            this.F = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        n2 n2Var = this.d;
        if (n2Var.getAlpha() != 1.0f) {
            n2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f40833e;
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

    public final void d(boolean z10, float f10) {
        float f11;
        if (!this.f40830c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.f40841w.setAlpha(1.0f - f10);
        if (!z10) {
            f11 = i20.v(0.4f, scaleX, f10, 1.0f / scaleX);
        } else {
            f11 = 1.0f - (0.4f * f10);
        }
        ImageView imageView = this.f40840s;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setTranslationY(org.telegram.messenger.g0.L(60.0f) * f10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = org.telegram.messenger.g0.m0;
        n2 n2Var = this.d;
        if (z10) {
            TextureView textureView = this.f40833e;
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
            if (n2Var != null) {
                canvas.save();
                canvas.translate(n2Var.getX(), n2Var.getY());
                Bitmap bitmap2 = n2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(n2Var.getWidth() / bitmap2.getWidth(), n2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f40835f;
        if (imageView.getVisibility() == 0 && n2Var.isFirstFrameRendered()) {
            float f10 = this.E - 0.10666667f;
            this.E = f10;
            if (f10 <= 0.0f) {
                this.E = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.E);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (org.telegram.messenger.g0.m0 && (view == this.d || view == this.f40833e)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public void e() {
        TextureView textureView = this.f40833e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            n2 n2Var = this.d;
            layoutParams.width = n2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = n2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f40838n == null) {
            View view = new View(getContext());
            this.f40838n = view;
            addView(view, ja.g());
        }
        return this.f40838n;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float top;
        final float left;
        super.onLayout(z10, i7, i10, i11, i12);
        TextureView textureView = this.f40833e;
        if (textureView != null) {
            this.V = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.f40826a;
        n2 n2Var = this.d;
        if (!z11) {
            n2Var.updateRotation();
        }
        if (this.f40829b0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
                return;
            }
            return;
        }
        if (n2Var.getMeasuredHeight() != 0 && n2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i13 = this.f40829b0;
            if (i13 == 0) {
                this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
            } else if (i13 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && n2Var.getMeasuredHeight() > n2Var.getMeasuredWidth()) {
                    this.U = Math.max(getMeasuredHeight() / n2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / n2Var.getMeasuredWidth());
                } else {
                    this.U = Math.min(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                }
            } else if (i13 == 1) {
                this.U = Math.min(getMeasuredHeight() / n2Var.getMeasuredHeight(), getMeasuredWidth() / n2Var.getMeasuredWidth());
                if (this.f40832d0 && !this.f40837g0 && this.f40831c0 == null && !this.F) {
                    this.P = (getMeasuredWidth() - n2Var.getMeasuredWidth()) / 2.0f;
                    this.O = (getMeasuredHeight() - n2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.U = 1.0f;
            if (this.f40831c0 == null && !this.F) {
                this.P = 0.0f;
                this.O = 0.0f;
            }
        }
        if (this.f40842x != null) {
            this.W = Math.max(getMeasuredWidth() / this.f40842x.getWidth(), getMeasuredHeight() / this.f40842x.getHeight());
        }
        if (this.F) {
            this.Q /= n2Var.getMeasuredWidth() / this.T;
            this.R /= n2Var.getMeasuredWidth() / this.T;
            this.F = false;
            if (this.f40837g0 && getParent() != null) {
                View view = (View) getParent();
                top = this.K - view.getTop();
                left = this.L - view.getLeft();
            } else {
                top = this.K - getTop();
                left = this.L - getLeft();
            }
            this.M = 0.0f;
            this.N = 0.0f;
            if (this.I != getMeasuredHeight()) {
                float measuredHeight = (getMeasuredHeight() - this.I) / 2.0f;
                this.M = measuredHeight;
                top -= measuredHeight;
            }
            final float f10 = top;
            if (this.J != getMeasuredWidth()) {
                float measuredWidth = (getMeasuredWidth() - this.J) / 2.0f;
                this.N = measuredWidth;
                left -= measuredWidth;
            }
            setTranslationY(f10);
            setTranslationX(left);
            ValueAnimator valueAnimator = this.f40831c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40831c0.cancel();
            }
            n2Var.setScaleX(this.Q);
            n2Var.setScaleY(this.Q);
            if (textureView != null) {
                textureView.setScaleX(this.R);
                textureView.setScaleY(this.R);
            }
            this.O = this.M;
            this.P = this.N;
            invalidateOutline();
            invalidate();
            final float f11 = this.Q;
            final float f12 = this.R;
            final float f13 = this.S;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f40831c0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f14 = 1.0f - floatValue;
                    o2 o2Var = o2.this;
                    o2Var.f40834e0 = f14;
                    o2Var.O = o2Var.M * floatValue;
                    o2Var.P = o2Var.N * floatValue;
                    o2Var.invalidateOutline();
                    o2Var.invalidate();
                    float f15 = (o2Var.U * f14) + (f11 * floatValue);
                    n2 n2Var2 = o2Var.d;
                    n2Var2.setScaleX(f15);
                    n2Var2.setScaleY(f15);
                    float f16 = (o2Var.V * f14) + (f12 * floatValue);
                    TextureView textureView2 = o2Var.f40833e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f16);
                        textureView2.setScaleY(f16);
                    }
                    o2Var.setTranslationX(left * floatValue);
                    o2Var.setTranslationY(f10 * floatValue);
                    o2Var.f40827a0 = (o2Var.W * f14) + (f13 * floatValue);
                }
            });
            long j3 = this.G;
            if (j3 != 0) {
                this.f40831c0.setDuration(j3);
            } else {
                this.f40831c0.setDuration(350L);
            }
            this.f40831c0.setInterpolator(er.f34420f);
            this.f40831c0.addListener(new w9(this, 17));
            this.f40831c0.start();
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Animator) arrayList.get(i14)).start();
                }
            }
            arrayList.clear();
            this.G = 0L;
        } else if (this.f40831c0 == null) {
            n2Var.setScaleX(this.U);
            n2Var.setScaleY(this.U);
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
            }
            this.f40827a0 = this.W;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10 = this.f40826a;
        n2 n2Var = this.d;
        if (!z10) {
            this.f40836f0 = true;
            n2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f40836f0 = false;
        }
        super.onMeasure(i7, i10);
        e();
        super.onMeasure(i7, i10);
        n2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f40836f0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j3) {
        this.G = j3;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f40837g0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i7;
        this.f40830c = z10;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f40839r.setVisibility(i7);
        boolean z11 = this.f40830c;
        TextureView textureView = this.f40833e;
        n2 n2Var = this.d;
        if (z11) {
            n2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f40835f.setVisibility(8);
            return;
        }
        n2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.f40828b != f10) {
            this.f40828b = f10;
            invalidateOutline();
        }
    }

    public void setStub(o2 o2Var) {
        if (this.f40830c) {
            return;
        }
        Bitmap bitmap = o2Var.d.getBitmap();
        ImageView imageView = this.f40835f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(o2Var.f40835f.getDrawable());
        }
        this.E = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f40842x = bitmap;
    }

    public o2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.E = 1.0f;
        this.H = new ArrayList();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.f40826a = z11;
        ImageView imageView = new ImageView(context);
        this.f40835f = imageView;
        n2 n2Var = new n2(this, context);
        this.d = n2Var;
        n2Var.setFpsReduction(30.0f);
        n2Var.setOpaque(false);
        n2Var.setEnableHardwareScaler(true);
        n2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, ja.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.f40833e = textureView;
                addView(textureView, ja.e(-1, -2, 17));
            }
            n2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(n2Var, ja.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.f40833e = textureView2;
                addView(textureView2, ja.e(-1, -2, 17));
            }
            addView(n2Var, ja.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.f40833e = textureView3;
                addView(textureView3, ja.e(-1, -2, 17));
            }
            addView(n2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.f40833e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f40839r = frameLayout;
        frameLayout.setBackground(new ra0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, ja.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f40840s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232680);
        frameLayout.addView(imageView2, ja.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.f40841w = textView;
        textView.setText(hd.M0(2131743222, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, ja.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new fh.a(this, 8));
            setClipToOutline(true);
        }
        if (z10 && this.f40843y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.f40843y = decodeFile;
                if (decodeFile == null) {
                    this.f40843y = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f40843y);
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
