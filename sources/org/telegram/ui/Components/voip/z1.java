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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ol;
import org.telegram.ui.s9;
import org.webrtc.RendererCommon;
import w7.b6;
public class z1 extends FrameLayout {
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
    public final boolean f31847a;
    public int f31848a0;
    public float f31849b;
    public ValueAnimator f31850b0;
    public boolean f31851c;
    public boolean f31852c0;
    public final y1 d;
    public float f31853d0;
    public final TextureView e;
    public boolean f31854e0;
    public final ImageView f31855f;
    public boolean f31856f0;
    public final View h;
    public View f31857n;
    public final FrameLayout f31858r;
    public final ImageView f31859s;
    public final TextView f31860w;
    public Bitmap f31861x;
    public final Bitmap f31862y;

    public z1(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.E && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.H = getMeasuredHeight();
            this.I = getMeasuredWidth();
            if (this.f31856f0 && getParent() != null) {
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
            y1 y1Var = this.d;
            this.S = y1Var.getMeasuredWidth();
            y1Var.getMeasuredHeight();
            this.E = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        y1 y1Var = this.d;
        if (y1Var.getAlpha() != 1.0f) {
            y1Var.animate().setDuration(300L).alpha(1.0f);
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
                FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "voip_icthumb.jpg"));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(boolean z10, float f7) {
        float f10;
        if (!this.f31851c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.f31860w.setAlpha(1.0f - f7);
        if (!z10) {
            f10 = a30.v(0.4f, scaleX, f7, 1.0f / scaleX);
        } else {
            f10 = 1.0f - (0.4f * f7);
        }
        ImageView imageView = this.f31859s;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        imageView.setTranslationY(org.telegram.messenger.i0.L(60.0f) * f7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = org.telegram.messenger.i0.m0;
        y1 y1Var = this.d;
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
        ImageView imageView = this.f31855f;
        if (imageView.getVisibility() == 0 && y1Var.isFirstFrameRendered()) {
            float f7 = this.D - 0.10666667f;
            this.D = f7;
            if (f7 <= 0.0f) {
                this.D = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.D);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (org.telegram.messenger.i0.m0 && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            y1 y1Var = this.d;
            layoutParams.width = y1Var.getMeasuredWidth();
            textureView.getLayoutParams().height = y1Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f31857n == null) {
            View view = new View(getContext());
            this.f31857n = view;
            addView(view, b6.g());
        }
        return this.f31857n;
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
        boolean z11 = this.f31847a;
        y1 y1Var = this.d;
        if (!z11) {
            y1Var.updateRotation();
        }
        if (this.f31848a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (y1Var.getMeasuredHeight() != 0 && y1Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i14 = this.f31848a0;
            if (i14 == 0) {
                this.T = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && y1Var.getMeasuredHeight() > y1Var.getMeasuredWidth()) {
                    this.T = Math.max(getMeasuredHeight() / y1Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / y1Var.getMeasuredWidth());
                } else {
                    this.T = Math.min(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.T = Math.min(getMeasuredHeight() / y1Var.getMeasuredHeight(), getMeasuredWidth() / y1Var.getMeasuredWidth());
                if (this.f31852c0 && !this.f31856f0 && this.f31850b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - y1Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - y1Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.T = 1.0f;
            if (this.f31850b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        }
        if (this.f31861x != null) {
            this.V = Math.max(getMeasuredWidth() / this.f31861x.getWidth(), getMeasuredHeight() / this.f31861x.getHeight());
        }
        if (this.E) {
            this.P /= y1Var.getMeasuredWidth() / this.S;
            this.Q /= y1Var.getMeasuredWidth() / this.S;
            this.E = false;
            if (this.f31856f0 && getParent() != null) {
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
            ValueAnimator valueAnimator = this.f31850b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f31850b0.cancel();
            }
            y1Var.setScaleX(this.P);
            y1Var.setScaleY(this.P);
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
            this.f31850b0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f13 = 1.0f - floatValue;
                    z1 z1Var = z1.this;
                    z1Var.f31853d0 = f13;
                    z1Var.N = z1Var.L * floatValue;
                    z1Var.O = z1Var.M * floatValue;
                    z1Var.invalidateOutline();
                    z1Var.invalidate();
                    float f14 = (z1Var.T * f13) + (f10 * floatValue);
                    y1 y1Var2 = z1Var.d;
                    y1Var2.setScaleX(f14);
                    y1Var2.setScaleY(f14);
                    float f15 = (z1Var.U * f13) + (f11 * floatValue);
                    TextureView textureView2 = z1Var.e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f15);
                        textureView2.setScaleY(f15);
                    }
                    z1Var.setTranslationX(left * floatValue);
                    z1Var.setTranslationY(f7 * floatValue);
                    z1Var.W = (z1Var.V * f13) + (f12 * floatValue);
                }
            });
            long j10 = this.F;
            if (j10 != 0) {
                this.f31850b0.setDuration(j10);
            } else {
                this.f31850b0.setDuration(350L);
            }
            this.f31850b0.setInterpolator(gr.f26523f);
            this.f31850b0.addListener(new s9(this, 27));
            this.f31850b0.start();
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty()) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((Animator) arrayList.get(i15)).start();
                }
            }
            arrayList.clear();
            this.F = 0L;
        } else if (this.f31850b0 == null) {
            y1Var.setScaleX(this.T);
            y1Var.setScaleY(this.T);
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
            }
            this.W = this.V;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.f31847a;
        y1 y1Var = this.d;
        if (!z10) {
            this.f31854e0 = true;
            y1Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f31854e0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        y1Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f31854e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.F = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f31856f0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i10;
        this.f31851c = z10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f31858r.setVisibility(i10);
        boolean z11 = this.f31851c;
        TextureView textureView = this.e;
        y1 y1Var = this.d;
        if (z11) {
            y1Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f31855f.setVisibility(8);
            return;
        }
        y1Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f7) {
        if (this.f31849b != f7) {
            this.f31849b = f7;
            invalidateOutline();
        }
    }

    public void setStub(z1 z1Var) {
        if (this.f31851c) {
            return;
        }
        Bitmap bitmap = z1Var.d.getBitmap();
        ImageView imageView = this.f31855f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(z1Var.f31855f.getDrawable());
        }
        this.D = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f31861x = bitmap;
    }

    public z1(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.D = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.f31847a = z11;
        ImageView imageView = new ImageView(context);
        this.f31855f = imageView;
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
            addView(view, b6.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, b6.e(-1, -2, 17));
            }
            y1Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(y1Var, b6.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, b6.e(-1, -2, 17));
            }
            addView(y1Var, b6.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, b6.e(-1, -2, 17));
            }
            addView(y1Var);
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f31858r = frameLayout;
        frameLayout.setBackground(new jb0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, b6.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f31859s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232676);
        frameLayout.addView(imageView2, b6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.f31860w = textView;
        textView.setText(dd.L0(2131743248, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(textView, b6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new ol(this, 6));
            setClipToOutline(true);
        }
        if (z10 && this.f31862y == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "voip_icthumb.jpg").getAbsolutePath());
                this.f31862y = decodeFile;
                if (decodeFile == null) {
                    this.f31862y = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f31862y);
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
