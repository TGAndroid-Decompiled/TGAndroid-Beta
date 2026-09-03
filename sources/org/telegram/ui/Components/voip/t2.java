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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl;
import org.webrtc.RendererCommon;
public class t2 extends FrameLayout {
    public boolean B;
    public long C;
    public final ArrayList D;
    public int E;
    public int F;
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
    public float T;
    public int U;
    public ValueAnimator V;
    public boolean W;
    public final boolean f32351a;
    public float f32352a0;
    public float f32353b;
    public boolean f32354b0;
    public boolean f32355c;
    public boolean f32356c0;
    public final s2 d;
    public final TextureView f32357e;
    public final ImageView f32358f;
    public final View h;
    public View f32359n;
    public final FrameLayout f32360r;
    public final ImageView f32361s;
    public final TextView v;
    public Bitmap f32362w;
    public final Bitmap f32363x;
    public float f32364y;

    public t2(Context context, boolean z4, boolean z10) {
        this(context, z4, z10, true, false);
    }

    public void a() {
        if (!this.B && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.E = getMeasuredHeight();
            this.F = getMeasuredWidth();
            if (this.f32356c0 && getParent() != null) {
                View view = (View) getParent();
                this.G = view.getY();
                this.H = view.getX();
            } else {
                this.G = getY();
                this.H = getX();
            }
            this.M = this.Q;
            this.N = this.R;
            this.O = this.S;
            s2 s2Var = this.d;
            this.P = s2Var.getMeasuredWidth();
            s2Var.getMeasuredHeight();
            this.B = true;
            requestLayout();
        }
    }

    public void b() {
        invalidate();
        s2 s2Var = this.d;
        if (s2Var.getAlpha() != 1.0f) {
            s2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f32357e;
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

    public final void d(float f10, boolean z4) {
        float f11;
        if (!this.f32355c) {
            return;
        }
        float scaleX = ((View) getParent()).getScaleX();
        this.v.setAlpha(1.0f - f10);
        if (!z4) {
            f11 = y3.A(0.4f, scaleX, f10, 1.0f / scaleX);
        } else {
            f11 = 1.0f - (0.4f * f10);
        }
        ImageView imageView = this.f32361s;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f10);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z4 = AndroidUtilities.makingGlobalBlurBitmap;
        s2 s2Var = this.d;
        if (z4) {
            TextureView textureView = this.f32357e;
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
            if (s2Var != null) {
                canvas.save();
                canvas.translate(s2Var.getX(), s2Var.getY());
                Bitmap bitmap2 = s2Var.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(s2Var.getWidth() / bitmap2.getWidth(), s2Var.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.f32358f;
        if (imageView.getVisibility() == 0 && s2Var.isFirstFrameRendered()) {
            float f10 = this.f32364y - 0.10666667f;
            this.f32364y = f10;
            if (f10 <= 0.0f) {
                this.f32364y = 0.0f;
                imageView.setVisibility(8);
                return;
            }
            invalidate();
            imageView.setAlpha(this.f32364y);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.d || view == this.f32357e)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void e() {
        TextureView textureView = this.f32357e;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            s2 s2Var = this.d;
            layoutParams.width = s2Var.getMeasuredWidth();
            textureView.getLayoutParams().height = s2Var.getMeasuredHeight();
        }
    }

    public View getPlaceholderView() {
        if (this.f32359n == null) {
            View view = new View(getContext());
            this.f32359n = view;
            addView(view, c6.g());
        }
        return this.f32359n;
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float top;
        final float left;
        super.onLayout(z4, i10, i11, i12, i13);
        TextureView textureView = this.f32357e;
        if (textureView != null) {
            this.R = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z10 = this.f32351a;
        s2 s2Var = this.d;
        if (!z10) {
            s2Var.updateRotation();
        }
        if (this.U == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.R);
                textureView.setScaleY(this.R);
                return;
            }
            return;
        }
        if (s2Var.getMeasuredHeight() != 0 && s2Var.getMeasuredWidth() != 0 && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i14 = this.U;
            if (i14 == 0) {
                this.Q = Math.max(getMeasuredHeight() / s2Var.getMeasuredHeight(), getMeasuredWidth() / s2Var.getMeasuredWidth());
            } else if (i14 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.Q = Math.max(getMeasuredHeight() / s2Var.getMeasuredHeight(), getMeasuredWidth() / s2Var.getMeasuredWidth());
                } else if (getMeasuredWidth() > getMeasuredHeight() && s2Var.getMeasuredHeight() > s2Var.getMeasuredWidth()) {
                    this.Q = Math.max(getMeasuredHeight() / s2Var.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / s2Var.getMeasuredWidth());
                } else {
                    this.Q = Math.min(getMeasuredHeight() / s2Var.getMeasuredHeight(), getMeasuredWidth() / s2Var.getMeasuredWidth());
                }
            } else if (i14 == 1) {
                this.Q = Math.min(getMeasuredHeight() / s2Var.getMeasuredHeight(), getMeasuredWidth() / s2Var.getMeasuredWidth());
                if (this.W && !this.f32356c0 && this.V == null && !this.B) {
                    this.L = (getMeasuredWidth() - s2Var.getMeasuredWidth()) / 2.0f;
                    this.K = (getMeasuredHeight() - s2Var.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        } else {
            this.Q = 1.0f;
            if (this.V == null && !this.B) {
                this.L = 0.0f;
                this.K = 0.0f;
            }
        }
        if (this.f32362w != null) {
            this.S = Math.max(getMeasuredWidth() / this.f32362w.getWidth(), getMeasuredHeight() / this.f32362w.getHeight());
        }
        if (this.B) {
            this.M /= s2Var.getMeasuredWidth() / this.P;
            this.N /= s2Var.getMeasuredWidth() / this.P;
            this.B = false;
            if (this.f32356c0 && getParent() != null) {
                View view = (View) getParent();
                top = this.G - view.getTop();
                left = this.H - view.getLeft();
            } else {
                top = this.G - getTop();
                left = this.H - getLeft();
            }
            this.I = 0.0f;
            this.J = 0.0f;
            if (this.E != getMeasuredHeight()) {
                float measuredHeight = (getMeasuredHeight() - this.E) / 2.0f;
                this.I = measuredHeight;
                top -= measuredHeight;
            }
            final float f10 = top;
            if (this.F != getMeasuredWidth()) {
                float measuredWidth = (getMeasuredWidth() - this.F) / 2.0f;
                this.J = measuredWidth;
                left -= measuredWidth;
            }
            setTranslationY(f10);
            setTranslationX(left);
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.V.cancel();
            }
            s2Var.setScaleX(this.M);
            s2Var.setScaleY(this.M);
            if (textureView != null) {
                textureView.setScaleX(this.N);
                textureView.setScaleY(this.N);
            }
            this.K = this.I;
            this.L = this.J;
            invalidateOutline();
            invalidate();
            final float f11 = this.M;
            final float f12 = this.N;
            final float f13 = this.O;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.V = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f14 = 1.0f - floatValue;
                    t2 t2Var = t2.this;
                    t2Var.f32352a0 = f14;
                    t2Var.K = t2Var.I * floatValue;
                    t2Var.L = t2Var.J * floatValue;
                    t2Var.invalidateOutline();
                    t2Var.invalidate();
                    float f15 = (t2Var.Q * f14) + (f11 * floatValue);
                    s2 s2Var2 = t2Var.d;
                    s2Var2.setScaleX(f15);
                    s2Var2.setScaleY(f15);
                    float f16 = (t2Var.R * f14) + (f12 * floatValue);
                    TextureView textureView2 = t2Var.f32357e;
                    if (textureView2 != null) {
                        textureView2.setScaleX(f16);
                        textureView2.setScaleY(f16);
                    }
                    t2Var.setTranslationX(left * floatValue);
                    t2Var.setTranslationY(f10 * floatValue);
                    t2Var.T = (t2Var.S * f14) + (f13 * floatValue);
                }
            });
            long j10 = this.C;
            if (j10 != 0) {
                this.V.setDuration(j10);
            } else {
                this.V.setDuration(350L);
            }
            this.V.setInterpolator(pr.f30168f);
            this.V.addListener(new f91(this, 7));
            this.V.start();
            ArrayList arrayList = this.D;
            if (!arrayList.isEmpty()) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((Animator) arrayList.get(i15)).start();
                }
            }
            arrayList.clear();
            this.C = 0L;
        } else if (this.V == null) {
            s2Var.setScaleX(this.Q);
            s2Var.setScaleY(this.Q);
            if (textureView != null) {
                textureView.setScaleX(this.R);
                textureView.setScaleY(this.R);
            }
            this.T = this.S;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4 = this.f32351a;
        s2 s2Var = this.d;
        if (!z4) {
            this.f32354b0 = true;
            s2Var.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.f32354b0 = false;
        }
        super.onMeasure(i10, i11);
        e();
        super.onMeasure(i10, i11);
        s2Var.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.f32354b0) {
            return;
        }
        super.requestLayout();
    }

    public void setAnimateNextDuration(long j10) {
        this.C = j10;
    }

    public void setAnimateWithParent(boolean z4) {
        this.f32356c0 = z4;
    }

    public void setIsScreencast(boolean z4) {
        int i10;
        this.f32355c = z4;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f32360r.setVisibility(i10);
        boolean z10 = this.f32355c;
        TextureView textureView = this.f32357e;
        s2 s2Var = this.d;
        if (z10) {
            s2Var.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.f32358f.setVisibility(8);
            return;
        }
        s2Var.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f10) {
        if (this.f32353b != f10) {
            this.f32353b = f10;
            invalidateOutline();
        }
    }

    public void setStub(t2 t2Var) {
        if (this.f32355c) {
            return;
        }
        Bitmap bitmap = t2Var.d.getBitmap();
        ImageView imageView = this.f32358f;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setImageDrawable(t2Var.f32358f.getDrawable());
        }
        this.f32364y = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.f32362w = bitmap;
    }

    public t2(Context context, boolean z4, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.f32364y = 1.0f;
        this.D = new ArrayList();
        this.M = 1.0f;
        this.N = 1.0f;
        this.O = 1.0f;
        this.f32351a = z10;
        ImageView imageView = new ImageView(context);
        this.f32358f = imageView;
        s2 s2Var = new s2(this, context);
        this.d = s2Var;
        s2Var.setFpsReduction(30.0f);
        s2Var.setOpaque(false);
        s2Var.setEnableHardwareScaler(true);
        s2Var.setIsCamera(!z10);
        if (!z4 && z10) {
            View view = new View(context);
            this.h = view;
            view.setBackgroundColor(-14999773);
            addView(view, c6.c(-1.0f, -1));
            if (z12) {
                TextureView textureView = new TextureView(context);
                this.f32357e = textureView;
                addView(textureView, c6.e(-1, -2, 17));
            }
            s2Var.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(s2Var, c6.e(-1, -2, 17));
        } else if (!z4) {
            if (z12) {
                TextureView textureView2 = new TextureView(context);
                this.f32357e = textureView2;
                addView(textureView2, c6.e(-1, -2, 17));
            }
            addView(s2Var, c6.e(-1, -2, 17));
        } else {
            if (z12) {
                TextureView textureView3 = new TextureView(context);
                this.f32357e = textureView3;
                addView(textureView3, c6.e(-1, -2, 17));
            }
            addView(s2Var);
        }
        addView(imageView);
        TextureView textureView4 = this.f32357e;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32360r = frameLayout;
        frameLayout.setBackground(new fc0(true, -14602694, -13935795, -14395293, -14203560));
        addView(frameLayout, c6.c(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.f32361s = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, c6.d(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y3.t(textView, -1, 1, 15.0f);
        frameLayout.addView(textView, c6.d(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z11) {
            setOutlineProvider(new tl(this, 4));
            setClipToOutline(true);
        }
        if (z4 && this.f32363x == null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.f32363x = decodeFile;
                if (decodeFile == null) {
                    this.f32363x = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.f32363x);
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
