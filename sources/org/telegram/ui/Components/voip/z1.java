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
import b8.mf;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;
public class z1 extends FrameLayout {
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
    public final boolean f39730a;
    public float f39731a0;
    public float f39732b;
    public int f39733b0;
    public boolean f39734c;
    public ValueAnimator f39735c0;
    public final y1 d;
    public boolean f39736d0;
    public final TextureView f39737e;
    public float f39738e0;
    public final ImageView f39739f;
    public boolean f39740f0;
    public boolean f39741g0;
    public final View h;
    public View f39742n;
    public final FrameLayout f39743r;
    public final ImageView f39744s;
    public final TextView f39745w;
    public Bitmap f39746x;
    public final Bitmap f39747y;

    public z1(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.F && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.I = getMeasuredHeight();
            this.J = getMeasuredWidth();
            if (this.f39741g0 && getParent() != null) {
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
            y1 y1Var = this.d;
            this.T = y1Var.getMeasuredWidth();
            y1Var.getMeasuredHeight();
            this.F = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        y1 y1Var = this.d;
        if (y1Var.getAlpha() != 1.0f) {
            y1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f39737e;
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
        if (!this.f39734c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.f39745w.setAlpha(1.0f - f10);
        if (!z10) {
            f11 = org.telegram.messenger.camera.q.v(0.4f, scaleX, f10, 1.0f / scaleX);
        } else {
            f11 = 1.0f - (0.4f * f10);
        }
        ImageView imageView = this.f39744s;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setTranslationY(org.telegram.messenger.g0.L(60.0f) * f10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = org.telegram.messenger.g0.m0;
        y1 y1Var = this.d;
        if (z10) {
            TextureView textureView = this.f39737e;
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
            if (y1Var != null) {
                canvas.save();
                canvas.translate(y1Var.getX(), y1Var.getY());
                Bitmap bitmap2 = y1Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(y1Var.getWidth() / bitmap2.getWidth(), y1Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f39739f;
        if (imageView.getVisibility() == 0 && y1Var.isFirstFrameRendered()) {
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (org.telegram.messenger.g0.m0 && (view == this.d || view == this.f39737e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.f39737e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            y1 y1Var = this.d;
            layoutParams.width = y1Var.getMeasuredWidth();
            textureView.getLayoutParams().height = y1Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f39742n == null) {
            View view = new View(getContext());
            this.f39742n = view;
            addView(view, mf.g());
        }
        return this.f39742n;
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float top;
        final float left;
        super.onLayout(z10, i3, i10, i11, i12);
        TextureView textureView = this.f39737e;
        if (textureView != null) {
            this.V = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z11 = this.f39730a;
        y1 y1Var = this.d;
        if (!z11) {
            y1Var.updateRotation();
        }
        if (this.f39733b0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
                return;
            }
            return;
        }
        if (y1Var.getMeasuredHeight() != 0 && y1Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i13 = this.f39733b0;
            if (i13 == 0) {
                this.U = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
            } else if (i13 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.U = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && y1Var.getMeasuredHeight() > y1Var.getMeasuredWidth()) {
                    this.U = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / y1Var.getMeasuredWidth());
                } else {
                    this.U = Math.min(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                }
            } else if (i13 == 1) {
                this.U = Math.min(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                if (this.f39736d0 && !this.f39741g0 && this.f39735c0 == null && !this.F) {
                    this.P = (getMeasuredWidth() - y1Var.getMeasuredWidth()) / 2.0f;
                    this.O = (getMeasuredHeight() - y1Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.U = 1.0f;
            if (this.f39735c0 == null && !this.F) {
                this.P = 0.0f;
                this.O = 0.0f;
            }
        }
        if (this.f39746x != null) {
            this.W = Math.max(getMeasuredWidth() / this.f39746x.getWidth(), getMeasuredHeight() / this.f39746x.getHeight());
        }
        if (this.F) {
            this.Q /= y1Var.getMeasuredWidth() / this.T;
            this.R /= y1Var.getMeasuredWidth() / this.T;
            this.F = false;
            if (this.f39741g0 && getParent() != null) {
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
            ValueAnimator valueAnimator = this.f39735c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f39735c0.cancel();
            }
            y1Var.setScaleX(this.Q);
            y1Var.setScaleY(this.Q);
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
            this.f39735c0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f14 = 1.0f - floatValue;
                    z1 z1Var = z1.this;
                    z1Var.f39738e0 = f14;
                    z1Var.O = z1Var.M * floatValue;
                    z1Var.P = z1Var.N * floatValue;
                    z1Var.invalidateOutline();
                    z1Var.invalidate();
                    float f15 = (z1Var.U * f14) + (f11 * floatValue);
                    y1 y1Var2 = z1Var.d;
                    y1Var2.setScaleX(f15);
                    y1Var2.setScaleY(f15);
                    float f16 = (z1Var.V * f14) + (f12 * floatValue);
                    TextureView textureView2 = z1Var.f39737e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f16);
                        textureView2.setScaleY(f16);
                    }
                    z1Var.setTranslationX(left * floatValue);
                    z1Var.setTranslationY(f10 * floatValue);
                    z1Var.f39731a0 = (z1Var.W * f14) + (f13 * floatValue);
                }
            });
            long j10 = this.G;
            if (j10 != 0) {
                this.f39735c0.setDuration(j10);
            } else {
                this.f39735c0.setDuration(350L);
            }
            this.f39735c0.setInterpolator(xq.f40452f);
            this.f39735c0.addListener(new w9(this, 16));
            this.f39735c0.start();
            ArrayList arrayList = this.H;
            if (!arrayList.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((Animator) arrayList.get(i14)).start();
                }
            }
            arrayList.clear();
            this.G = 0L;
        } else if (this.f39735c0 == null) {
            y1Var.setScaleX(this.U);
            y1Var.setScaleY(this.U);
            if (textureView != null) {
                textureView.setScaleX(this.V);
                textureView.setScaleY(this.V);
            }
            this.f39731a0 = this.W;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10 = this.f39730a;
        y1 y1Var = this.d;
        if (!z10) {
            this.f39740f0 = true;
            y1Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f39740f0 = false;
        }
        super.onMeasure(i3, i10);
        e();
        super.onMeasure(i3, i10);
        y1Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f39740f0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.G = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f39741g0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i3;
        this.f39734c = z10;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f39743r.setVisibility(i3);
        boolean z11 = this.f39734c;
        TextureView textureView = this.f39737e;
        y1 y1Var = this.d;
        if (z11) {
            y1Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f39739f.setVisibility(8);
            return;
        }
        y1Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.f39732b != f10) {
            this.f39732b = f10;
            invalidateOutline();
        }
    }

    public void setStub(z1 z1Var) {
        if (this.f39734c) {
            return;
        }
        Bitmap bitmap = z1Var.d.getBitmap();
        ImageView imageView = this.f39739f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(z1Var.f39739f.getDrawable());
        }
        this.E = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f39746x = bitmap;
    }

    public z1(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.E = 1.0f;
        this.H = new ArrayList();
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 1.0f;
        this.f39730a = z11;
        ImageView imageView = new ImageView(context);
        this.f39739f = imageView;
        y1 y1Var = new y1(this, context);
        this.d = y1Var;
        y1Var.setFpsReduction(30.0f);
        y1Var.setOpaque(false);
        y1Var.setEnableHardwareScaler(true);
        y1Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, mf.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.f39737e = textureView;
                addView(textureView, mf.e(-1, -2, 17));
            }
            y1Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(y1Var, mf.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.f39737e = textureView2;
                addView(textureView2, mf.e(-1, -2, 17));
            }
            addView(y1Var, mf.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.f39737e = textureView3;
                addView(textureView3, mf.e(-1, -2, 17));
            }
            addView(y1Var);
        }
        addView(imageView);
        TextureView textureView4 = this.f39737e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39743r = frameLayout;
        frameLayout.setBackground(new la0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, mf.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f39744s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232677);
        frameLayout.addView(imageView2, mf.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.f39745w = textView;
        textView.setText(bd.M0(2131743232, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        frameLayout.addView(textView, mf.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new gh.a(this, 7));
            setClipToOutline(true);
        }
        if (z10 && this.f39747y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.f39747y = decodeFile;
                if (decodeFile == null) {
                    this.f39747y = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f39747y);
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
