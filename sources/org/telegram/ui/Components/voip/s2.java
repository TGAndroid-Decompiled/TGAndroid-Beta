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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u81;
import org.webrtc.RendererCommon;
import w7.x5;
public class s2 extends FrameLayout {
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
    public final boolean f29174a;
    public int f29175a0;
    public float f29176b;
    public ValueAnimator f29177b0;
    public boolean f29178c;
    public boolean f29179c0;
    public final r2 d;
    public float f29180d0;
    public final TextureView e;
    public boolean f29181e0;
    public final ImageView f29182f;
    public boolean f29183f0;
    public final View h;
    public View f29184n;
    public final FrameLayout f29185r;
    public final ImageView f29186s;
    public final TextView v;
    public Bitmap f29187w;
    public final Bitmap f29188x;
    public float f29189y;

    public s2(Context context, boolean z10, boolean z11) {
        this(context, z10, z11, true, false);
    }

    public void a() {
        if (!this.E && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.H = getMeasuredHeight();
            this.I = getMeasuredWidth();
            if (this.f29183f0 && getParent() != null) {
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
            r2 r2Var = this.d;
            this.S = r2Var.getMeasuredWidth();
            r2Var.getMeasuredHeight();
            this.E = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        r2 r2Var = this.d;
        if (r2Var.getAlpha() != 1.0f) {
            r2Var.animate().setDuration(300L).alpha(1.0f);
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
        if (!this.f29178c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.v.setAlpha(1.0f - f7);
        if (!z10) {
            f10 = ul.c(0.4f, scaleX, f7, 1.0f / scaleX);
        } else {
            f10 = 1.0f - (0.4f * f7);
        }
        ImageView imageView = this.f29186s;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f7);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z10 = AndroidUtilities.makingGlobalBlurBitmap;
        r2 r2Var = this.d;
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
            if (r2Var != null) {
                canvas.save();
                canvas.translate(r2Var.getX(), r2Var.getY());
                Bitmap bitmap2 = r2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(r2Var.getWidth() / bitmap2.getWidth(), r2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f29182f;
        if (imageView.getVisibility() == 0 && r2Var.isFirstFrameRendered()) {
            float f7 = this.f29189y - 0.10666667f;
            this.f29189y = f7;
            if (f7 <= 0.0f) {
                this.f29189y = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.f29189y);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.e)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public void e() {
        TextureView textureView = this.e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            r2 r2Var = this.d;
            layoutParams.width = r2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = r2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f29184n == null) {
            View view = new View(getContext());
            this.f29184n = view;
            addView(view, x5.g());
        }
        return this.f29184n;
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
        boolean z11 = this.f29174a;
        r2 r2Var = this.d;
        if (!z11) {
            r2Var.updateRotation();
        }
        if (this.f29175a0 == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
                return;
            }
            return;
        }
        if (r2Var.getMeasuredHeight() != 0 && r2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i14 = this.f29175a0;
            if (i14 == 0) {
                this.T = Math.max(getMeasuredHeight() / r2Var.getMeasuredHeight(), getMeasuredWidth() / r2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.T = Math.max(getMeasuredHeight() / r2Var.getMeasuredHeight(), getMeasuredWidth() / r2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && r2Var.getMeasuredHeight() > r2Var.getMeasuredWidth()) {
                    this.T = Math.max(getMeasuredHeight() / r2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / r2Var.getMeasuredWidth());
                } else {
                    this.T = Math.min(getMeasuredHeight() / r2Var.getMeasuredHeight(), getMeasuredWidth() / r2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.T = Math.min(getMeasuredHeight() / r2Var.getMeasuredHeight(), getMeasuredWidth() / r2Var.getMeasuredWidth());
                if (this.f29179c0 && !this.f29183f0 && this.f29177b0 == null && !this.E) {
                    this.O = (getMeasuredWidth() - r2Var.getMeasuredWidth()) / 2.0f;
                    this.N = (getMeasuredHeight() - r2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.T = 1.0f;
            if (this.f29177b0 == null && !this.E) {
                this.O = 0.0f;
                this.N = 0.0f;
            }
        }
        if (this.f29187w != null) {
            this.V = Math.max(getMeasuredWidth() / this.f29187w.getWidth(), getMeasuredHeight() / this.f29187w.getHeight());
        }
        if (this.E) {
            this.P /= r2Var.getMeasuredWidth() / this.S;
            this.Q /= r2Var.getMeasuredWidth() / this.S;
            this.E = false;
            if (this.f29183f0 && getParent() != null) {
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
            ValueAnimator valueAnimator = this.f29177b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f29177b0.cancel();
            }
            r2Var.setScaleX(this.P);
            r2Var.setScaleY(this.P);
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
            this.f29177b0 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f13 = 1.0f - floatValue;
                    s2 s2Var = s2.this;
                    s2Var.f29180d0 = f13;
                    s2Var.N = s2Var.L * floatValue;
                    s2Var.O = s2Var.M * floatValue;
                    s2Var.invalidateOutline();
                    s2Var.invalidate();
                    float f14 = (s2Var.T * f13) + (f10 * floatValue);
                    r2 r2Var2 = s2Var.d;
                    r2Var2.setScaleX(f14);
                    r2Var2.setScaleY(f14);
                    float f15 = (s2Var.U * f13) + (f11 * floatValue);
                    TextureView textureView2 = s2Var.e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f15);
                        textureView2.setScaleY(f15);
                    }
                    s2Var.setTranslationX(left * floatValue);
                    s2Var.setTranslationY(f7 * floatValue);
                    s2Var.W = (s2Var.V * f13) + (f12 * floatValue);
                }
            });
            long j3 = this.F;
            if (j3 != 0) {
                this.f29177b0.setDuration(j3);
            } else {
                this.f29177b0.setDuration(350L);
            }
            this.f29177b0.setInterpolator(rr.f27701f);
            this.f29177b0.addListener(new u81(this, 8));
            this.f29177b0.start();
            ArrayList arrayList = this.G;
            if (!arrayList.isEmpty()) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((Animator) arrayList.get(i15)).start();
                }
            }
            arrayList.clear();
            this.F = 0L;
        } else if (this.f29177b0 == null) {
            r2Var.setScaleX(this.T);
            r2Var.setScaleY(this.T);
            if (textureView != null) {
                textureView.setScaleX(this.U);
                textureView.setScaleY(this.U);
            }
            this.W = this.V;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.f29174a;
        r2 r2Var = this.d;
        if (!z10) {
            this.f29181e0 = true;
            r2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f29181e0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        r2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f29181e0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j3) {
        this.F = j3;
    }

    public void setAnimateWithParent(boolean z10) {
        this.f29183f0 = z10;
    }

    public void setIsScreencast(boolean z10) {
        int i10;
        this.f29178c = z10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29185r.setVisibility(i10);
        boolean z11 = this.f29178c;
        TextureView textureView = this.e;
        r2 r2Var = this.d;
        if (z11) {
            r2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f29182f.setVisibility(8);
            return;
        }
        r2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f7) {
        if (this.f29176b != f7) {
            this.f29176b = f7;
            invalidateOutline();
        }
    }

    public void setStub(s2 s2Var) {
        if (this.f29178c) {
            return;
        }
        Bitmap bitmap = s2Var.d.getBitmap();
        ImageView imageView = this.f29182f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(s2Var.f29182f.getDrawable());
        }
        this.f29189y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f29187w = bitmap;
    }

    public s2(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.f29189y = 1.0f;
        this.G = new ArrayList();
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.f29174a = z11;
        ImageView imageView = new ImageView(context);
        this.f29182f = imageView;
        r2 r2Var = new r2(this, context);
        this.d = r2Var;
        r2Var.setFpsReduction(30.0f);
        r2Var.setOpaque(false);
        r2Var.setEnableHardwareScaler(true);
        r2Var.setIsCamera(!z11);
        if (!z10 && z11) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, x5.c(-1.0f, -1));
            if (z13) {
                TextureView textureView = new TextureView(context);
                this.e = textureView;
                addView(textureView, x5.e(-1, -2, 17));
            }
            r2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(r2Var, x5.e(-1, -2, 17));
        } else if (!z10) {
            if (z13) {
                TextureView textureView2 = new TextureView(context);
                this.e = textureView2;
                addView(textureView2, x5.e(-1, -2, 17));
            }
            addView(r2Var, x5.e(-1, -2, 17));
        } else {
            if (z13) {
                TextureView textureView3 = new TextureView(context);
                this.e = textureView3;
                addView(textureView3, x5.e(-1, -2, 17));
            }
            addView(r2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f29185r = frameLayout;
        frameLayout.setBackground(new bc0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, x5.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f29186s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, x5.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.messenger.z0.q(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, x5.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z12) {
            setOutlineProvider(new ch.b(this, 5));
            setClipToOutline(true);
        }
        if (z10 && this.f29188x == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.f29188x = decodeFile;
                if (decodeFile == null) {
                    this.f29188x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f29188x);
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
