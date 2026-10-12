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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.u61;
import org.webrtc.RendererCommon;
import w7.a6;
public class r2 extends FrameLayout {
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
    public final boolean f30420a;
    public int f30421a0;
    public float f30422b;
    public ValueAnimator f30423b0;
    public boolean f30424c;
    public boolean f30425c0;
    public final q2 d;
    public float f30426d0;
    public final TextureView e;
    public boolean f30427e0;
    public final ImageView f30428f;
    public boolean f30429f0;
    public final View h;
    public View f30430n;
    public final FrameLayout f30431r;
    public final ImageView f30432s;
    public final TextView v;
    public Bitmap f30433w;
    public final Bitmap f30434x;
    public float f30435y;

    public r2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.E && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.H = getMeasuredHeight();
            this.I = getMeasuredWidth();
            if (this.f30429f0 && getParent() != null) {
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
            q2 q2Var = this.d;
            this.S = q2Var.getMeasuredWidth();
            q2Var.getMeasuredHeight();
            this.E = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        q2 q2Var = this.d;
        if (q2Var.getAlpha() != 1.0f) {
            q2Var.animate().setDuration(300L).alpha(1.0f);
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
        if (!this.f30424c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.v.setAlpha(1.0f - f7);
        if (!z10) {
            f10 = yh.b(0.4f, scaleX, f7, 1.0f / scaleX);
        } else {
            f10 = 1.0f - (0.4f * f7);
        }
        ImageView imageView = this.f30432s;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        q2 q2Var = this.d;
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
        ImageView imageView = this.f30428f;
        if (imageView.getVisibility() == 0 && q2Var.isFirstFrameRendered()) {
            float f7 = this.f30435y - 0.10666667f;
            this.f30435y = f7;
            if (f7 <= 0.0f) {
                this.f30435y = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.f30435y);
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
            q2 q2Var = this.d;
            layoutParams.width = q2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = q2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f30430n == null) {
            View view = new View(getContext());
            this.f30430n = view;
            addView(view, a6.g());
        }
        return this.f30430n;
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
        boolean z11 = this.f30420a;
        q2 q2Var = this.d;
        if (!z11) {
            q2Var.updateRotation();
        }
        if (this.f30421a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (q2Var.getMeasuredHeight() != 0 && q2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i14 = this.f30421a0;
            if (i14 == 0) {
                this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && q2Var.getMeasuredHeight() > q2Var.getMeasuredWidth()) {
                    this.T = Math.max(getMeasuredHeight() / q2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / q2Var.getMeasuredWidth());
                } else {
                    this.T = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.T = Math.min(getMeasuredHeight() / q2Var.getMeasuredHeight(), getMeasuredWidth() / q2Var.getMeasuredWidth());
                if (this.f30425c0 && !this.f30429f0 && this.f30423b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - q2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - q2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.T = 1.0f;
            if (this.f30423b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        }
        if (this.f30433w != null) {
            this.V = Math.max(getMeasuredWidth() / this.f30433w.getWidth(), getMeasuredHeight() / this.f30433w.getHeight());
        }
        if (this.E) {
            this.P /= q2Var.getMeasuredWidth() / this.S;
            this.Q /= q2Var.getMeasuredWidth() / this.S;
            this.E = false;
            if (this.f30429f0 && getParent() != null) {
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
            ValueAnimator valueAnimator = this.f30423b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f30423b0.cancel();
            }
            q2Var.setScaleX(this.P);
            q2Var.setScaleY(this.P);
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
            this.f30423b0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f13 = 1.0f - floatValue;
                    r2 r2Var = r2.this;
                    r2Var.f30426d0 = f13;
                    r2Var.N = r2Var.L * floatValue;
                    r2Var.O = r2Var.M * floatValue;
                    r2Var.invalidateOutline();
                    r2Var.invalidate();
                    float f14 = (r2Var.T * f13) + (f10 * floatValue);
                    q2 q2Var2 = r2Var.d;
                    q2Var2.setScaleX(f14);
                    q2Var2.setScaleY(f14);
                    float f15 = (r2Var.U * f13) + (f11 * floatValue);
                    TextureView textureView2 = r2Var.e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f15);
                        textureView2.setScaleY(f15);
                    }
                    r2Var.setTranslationX(left * floatValue);
                    r2Var.setTranslationY(f7 * floatValue);
                    r2Var.W = (r2Var.V * f13) + (f12 * floatValue);
                }
            });
            long j10 = this.F;
            if (j10 != 0) {
                this.f30423b0.setDuration(j10);
            } else {
                this.f30423b0.setDuration(350L);
            }
            this.f30423b0.setInterpolator(es.f24771f);
            this.f30423b0.addListener(new u61(this, 12));
            this.f30423b0.start();
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty()) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((Animator) arrayList.get(i15)).start();
                }
            }
            arrayList.clear();
            this.F = 0L;
        } else if (this.f30423b0 == null) {
            q2Var.setScaleX(this.T);
            q2Var.setScaleY(this.T);
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
            }
            this.W = this.V;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.f30420a;
        q2 q2Var = this.d;
        if (!z10) {
            this.f30427e0 = true;
            q2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f30427e0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        q2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f30427e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.F = j10;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f30429f0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i10;
        this.f30424c = z10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f30431r.setVisibility(i10);
        boolean z11 = this.f30424c;
        TextureView textureView = this.e;
        q2 q2Var = this.d;
        if (z11) {
            q2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f30428f.setVisibility(8);
            return;
        }
        q2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f7) {
        if (this.f30422b != f7) {
            this.f30422b = f7;
            invalidateOutline();
        }
    }

    public void setStub(r2 r2Var) {
        if (this.f30424c) {
            return;
        }
        Bitmap bitmap = r2Var.d.getBitmap();
        ImageView imageView = this.f30428f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(r2Var.f30428f.getDrawable());
        }
        this.f30435y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f30433w = bitmap;
    }

    public r2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f30435y = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.f30420a = z11;
        ImageView imageView = new ImageView(context);
        this.f30428f = imageView;
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
            addView(view, a6.d(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, a6.e(-1, -2, 17));
            }
            q2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(q2Var, a6.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, a6.e(-1, -2, 17));
            }
            addView(q2Var, a6.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, a6.e(-1, -2, 17));
            }
            addView(q2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f30431r = frameLayout;
        frameLayout.setBackground(new cd0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, a6.d(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f30432s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, a6.a(82.0f, 0.0f, 0.0f, 0.0f, 60.0f, 82, 17));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.q.n(15.0f, -1, 1, textView);
        frameLayout.addView(textView, a6.a(-2.0f, 21.0f, 28.0f, 21.0f, 0.0f, -1, 17));
        if (z12) {
            setOutlineProvider(new dh.b(this, 5));
            setClipToOutline(true);
        }
        if (z10 && this.f30434x == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.f30434x = decodeFile;
                if (decodeFile == null) {
                    this.f30434x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f30434x);
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
