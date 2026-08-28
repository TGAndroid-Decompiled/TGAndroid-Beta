package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public abstract class ad extends kh.m {
    public boolean O0;
    public final ImageView P0;
    public boolean Q0;
    public final ImageView R0;
    public final kh.l S0;
    public x60 T0;
    public final i0 U0;
    public final ImageView V0;
    public kh.x3 W0;
    public int X0;
    public final int[] Y0;
    public final kh.x3 Z0;
    public final Runnable f26760a1;
    public final RectF f26761b1;
    public final Drawable f26762c1;
    public final i6 f26763d1;
    public final pc f26764e1;
    public kg.d f26765f1;
    public final y5 f26766g1;
    public final y5 f26767h1;
    public final y5 f26768i1;
    public boolean f26769j1;
    public boolean f26770k1;
    public final fg l1;
    public boolean f26771m1;
    public Utilities.Callback f26772n1;
    public boolean f26773o1;

    public ad(Context context, FrameLayout frameLayout, xu0 xu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.b6 b6Var, ba baVar, Runnable runnable) {
        super(context, frameLayout, xu0Var, frameLayout2, b6Var, baVar);
        int i9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        this.X0 = 0;
        this.Y0 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f26761b1 = new RectF();
        i6 i6Var = new i6(false, false, false, false);
        this.f26763d1 = i6Var;
        this.f26764e1 = new pc(this);
        gr grVar = gr.h;
        this.f26766g1 = new y5(this, 0L, 350L, grVar);
        this.f26767h1 = new y5(this, 0L, 350L, grVar);
        this.f26768i1 = new y5(this, 0L, 350L, grVar);
        this.l1 = new fg(this, 17);
        this.f26760a1 = runnable;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.zr0;
        if (z10) {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f26762c1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f26762c1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        if (z10) {
            i9 = 48;
        } else {
            i9 = 80;
        }
        int i12 = i9 | 3;
        if (z10) {
            f10 = 6.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        addView(imageView, g7.e6.d(44, 44.0f, i12, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.R0 = imageView2;
        kh.l lVar = new kh.l(5);
        this.S0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i13 = i10 | 5;
        if (z10) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 6.0f;
        }
        addView(imageView2, g7.e6.d(44, 44.0f, i13, 0.0f, f12, 10.0f, f13));
        kh.x3 x3Var = new kh.x3(context, z10 ? 1 : 3);
        this.Z0 = x3Var;
        x3Var.r(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f14 = 8.0f;
        } else {
            f14 = 0.0f;
        }
        x3Var.setPadding(dp, AndroidUtilities.dp(f14), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        x3Var.m(1.0f, -21.0f);
        x3Var.q(true);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        addView(x3Var, g7.e6.e(-1, 80, i11 | 5));
        ImageView imageView3 = new ImageView(context);
        this.V0 = imageView3;
        i0 i0Var = new i0(context);
        this.U0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, g7.e6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        g7.g6.a(imageView3);
        this.f15632f.getEditText().addTextChangedListener(new bh.f(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 7));
        imageView2.setOnClickListener(new s2(8, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i9;
        float f10;
        this.O0 = z10;
        ImageView imageView = this.P0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView.setAlpha(f10);
        if (!z10) {
            f11 = AndroidUtilities.dp(-8.0f);
        }
        imageView.setTranslationX(f11);
        kh.g gVar = this.f15632f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f15638k0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f26769j1 == z10 && z11) {
            return;
        }
        this.f26769j1 = z10;
        if (!z11) {
            this.f26767h1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i9;
        this.Q0 = z10;
        ImageView imageView = this.R0;
        imageView.animate().cancel();
        float f10 = 1.0f;
        int i10 = 0;
        float f11 = 0.0f;
        if (z11) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z10) {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z10) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            alpha.translationX(f11).withEndAction(new zc(this, z10, 1)).start();
        } else {
            if (z10) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
            if (!z10) {
                f10 = 0.0f;
            }
            imageView.setAlpha(f10);
            if (!z10) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            imageView.setTranslationX(f11);
        }
        kh.g gVar = this.f15632f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f10;
        float f11;
        if (this.f26773o1 != z10) {
            if (z10) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.f26773o1 = z10;
            ImageView imageView = this.V0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f12 = 0.6f;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z10) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).setInterpolator(gr.h).setDuration(420L).withEndAction(new zc(this, z10, 0)).start();
            if (z10) {
                i0 i0Var = this.U0;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                kh.x3 x3Var = this.W0;
                if (x3Var != null) {
                    x3Var.e(true);
                    this.W0 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    kh.x3 x3Var2 = new kh.x3(getContext(), 3);
                    this.W0 = x3Var2;
                    x3Var2.q(true);
                    this.W0.t(LocaleController.getString(R.string.AIEditorHint));
                    this.W0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.W0, g7.e6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    kh.x3 x3Var3 = this.W0;
                    x3Var3.f16352h0 = new org.telegram.ui.wq(7, this, x3Var2);
                    x3Var3.d = 4000L;
                    x3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            kh.x3 x3Var4 = this.W0;
            if (x3Var4 != null) {
                x3Var4.e(true);
                this.W0 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f15623a = b6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23395zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.f6.K(dp, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        fq fqVar = this.f15640n;
        fqVar.f28542a = K;
        fqVar.invalidateSelf();
        this.S0.e(-1, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i9;
        int i10 = 0;
        if (!z10 && this.Q0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ImageView imageView = this.R0;
        imageView.setVisibility(i9);
        i10 = (z10 || !this.O0) ? 8 : 8;
        ImageView imageView2 = this.P0;
        imageView2.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i9;
        if (!z10) {
            int i10 = 8;
            if (this.Q0) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            this.R0.setVisibility(i9);
            if (this.O0) {
                i10 = 0;
            }
            this.P0.setVisibility(i10);
        }
        kh.x3 x3Var = this.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9;
        super.dispatchDraw(canvas);
        RectF rectF = this.f15653w0;
        ImageView imageView = this.V0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f15638k0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.zr0;
            if (z10) {
                f11 = rectF.bottom - AndroidUtilities.dp(44.0f);
            } else {
                f11 = rectF.top;
            }
            if (z10) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            imageView.setTranslationY((Utilities.clamp01((-this.f26766g1.d(this.f15632f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i9) + f11);
        }
        float f12 = this.f26767h1.f(this.f26769j1, true ^ G());
        float e10 = this.f26768i1.e(this.f26770k1);
        if (f12 > 0.0f) {
            float a2 = this.f26764e1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f15638k0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.zr0;
            i6 i6Var = this.f26763d1;
            RectF rectF2 = this.f26761b1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            ig.a aVar = this.f15629d0;
            if (aVar != null) {
                if (this.f26765f1 == null) {
                    kg.d c10 = aVar.c(this, null, false);
                    c10.n(mg.c.i(this.f15623a));
                    c10.o(AndroidUtilities.dp(5.0f));
                    c10.p(AndroidUtilities.dp(16.0f));
                    this.f26765f1 = c10;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f26765f1.setBounds(rect);
                this.f26765f1.draw(canvas);
            }
            Drawable drawable = this.f26762c1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            i6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            i6Var.f29351w = (int) (e10 * 255.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f26761b1;
        y5 y5Var = this.f26767h1;
        pc pcVar = this.f26764e1;
        if (action == 0) {
            if (y5Var.f34854c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            pcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (pcVar.h && (y5Var.f34854c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                pcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && pcVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.zr0) {
                    i9 = R.string.MoveCaptionDown;
                } else {
                    i9 = R.string.MoveCaptionUp;
                }
                this.f26763d1.q(LocaleController.getString(i9), true, true);
            }
            pcVar.c(false);
            return true;
        }
        if (!pcVar.h && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.Z0) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitDefault;
    }

    @Override
    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.Q).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitPremium;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.O0) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override
    public int getEditTextStyle() {
        return 3;
    }

    @Override
    public final void r(int i9) {
        float f10;
        float dp = (-Math.min(AndroidUtilities.dp(34.0f), i9)) - AndroidUtilities.dp(10.0f);
        if (this instanceof org.telegram.ui.zr0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.Z0.setTranslationY(dp * f10);
    }

    @Override
    public final void s(int i9, int i10) {
        boolean z10;
        boolean z11;
        CharSequence text = getText();
        boolean z12 = false;
        if (i10 > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        F(z10);
        if (this.f26773o1) {
            if (i9 < 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 < 3) {
                z12 = true;
            }
            if (z11 != z12) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.f26771m1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.P0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f26772n1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i9) {
        int max;
        boolean z10;
        this.X0 = i9;
        if (i9 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i9);
        }
        if (this.X0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S0.d(max, z10, true);
        kh.x3 x3Var = this.Z0;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f26760a1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.R0.setAlpha(f11);
        this.P0.setAlpha(f11);
    }

    @Override
    public void x(int i9) {
        boolean z10 = this.f15636i0;
        super.x(i9);
        if (!z10 && this.H.c()) {
            B();
        }
    }

    public final void z() {
        fg fgVar = this.l1;
        AndroidUtilities.cancelRunOnUIThread(fgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.Q).shouldShowMoveCaptionHint();
        this.f26770k1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.Q).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(fgVar, 5000L);
        }
    }
}
