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
public abstract class ed extends nh.m {
    public boolean O0;
    public final ImageView P0;
    public boolean Q0;
    public final ImageView R0;
    public final nh.l S0;
    public j70 T0;
    public final k0 U0;
    public final ImageView V0;
    public nh.t3 W0;
    public int X0;
    public final int[] Y0;
    public final nh.t3 Z0;
    public final Runnable f28001a1;
    public final RectF f28002b1;
    public final Drawable f28003c1;
    public final n6 f28004d1;
    public final uc f28005e1;
    public ng.d f28006f1;
    public final d6 f28007g1;
    public final d6 f28008h1;
    public final d6 f28009i1;
    public boolean f28010j1;
    public boolean f28011k1;
    public final ig l1;
    public boolean f28012m1;
    public Utilities.Callback f28013n1;
    public boolean f28014o1;

    public ed(Context context, FrameLayout frameLayout, hv0 hv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, ga gaVar, Runnable runnable) {
        super(context, frameLayout, hv0Var, frameLayout2, c6Var, gaVar);
        int i10;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        this.X0 = 0;
        this.Y0 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f28002b1 = new RectF();
        n6 n6Var = new n6(false, false, false, false);
        this.f28004d1 = n6Var;
        this.f28005e1 = new uc(this);
        jr jrVar = jr.h;
        this.f28007g1 = new d6(this, 0L, 350L, jrVar);
        this.f28008h1 = new d6(this, 0L, 350L, jrVar);
        this.f28009i1 = new d6(this, 0L, 350L, jrVar);
        this.l1 = new ig(this, 17);
        this.f28001a1 = runnable;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.yr0;
        if (z10) {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f28003c1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f28003c1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i13 = i10 | 3;
        if (z10) {
            f9 = 6.0f;
        } else {
            f9 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        addView(imageView, i7.f6.d(44, 44.0f, i13, 14.0f, f9, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.R0 = imageView2;
        nh.l lVar = new nh.l(5);
        this.S0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        int i14 = i11 | 5;
        if (z10) {
            f11 = 6.0f;
        } else {
            f11 = 0.0f;
        }
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 6.0f;
        }
        addView(imageView2, i7.f6.d(44, 44.0f, i14, 0.0f, f11, 10.0f, f12));
        nh.t3 t3Var = new nh.t3(context, z10 ? 1 : 3);
        this.Z0 = t3Var;
        t3Var.r(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f13 = 8.0f;
        } else {
            f13 = 0.0f;
        }
        t3Var.setPadding(dp, AndroidUtilities.dp(f13), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        t3Var.m(1.0f, -21.0f);
        t3Var.q(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(t3Var, i7.f6.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.V0 = imageView3;
        k0 k0Var = new k0(context);
        this.U0 = k0Var;
        imageView3.setImageDrawable(k0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, i7.f6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        i7.h6.a(imageView3);
        this.f18076f.getEditText().addTextChangedListener(new bh.c(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, 7));
        imageView2.setOnClickListener(new t2(9, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i10;
        float f9;
        this.O0 = z10;
        ImageView imageView = this.P0;
        imageView.animate().cancel();
        int i11 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        float f10 = 0.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        imageView.setAlpha(f9);
        if (!z10) {
            f10 = AndroidUtilities.dp(-8.0f);
        }
        imageView.setTranslationX(f10);
        nh.g gVar = this.f18076f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f18082k0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f28010j1 == z10 && z11) {
            return;
        }
        this.f28010j1 = z10;
        if (!z11) {
            this.f28008h1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i10;
        this.Q0 = z10;
        ImageView imageView = this.R0;
        imageView.animate().cancel();
        float f9 = 1.0f;
        int i11 = 0;
        float f10 = 0.0f;
        if (z11) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z10) {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (!z10) {
                f10 = AndroidUtilities.dp(8.0f);
            }
            alpha.translationX(f10).withEndAction(new dd(this, z10, 1)).start();
        } else {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
            if (!z10) {
                f9 = 0.0f;
            }
            imageView.setAlpha(f9);
            if (!z10) {
                f10 = AndroidUtilities.dp(8.0f);
            }
            imageView.setTranslationX(f10);
        }
        nh.g gVar = this.f18076f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f9;
        float f10;
        if (this.f28014o1 != z10) {
            if (z10) {
                MessagesController.getInstance(this.Q).getTonesController().load();
            }
            this.f28014o1 = z10;
            ImageView imageView = this.V0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            float f11 = 0.6f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (z10) {
                f11 = 1.0f;
            }
            scaleX.scaleY(f11).setInterpolator(jr.h).setDuration(420L).withEndAction(new dd(this, z10, 0)).start();
            if (z10) {
                k0 k0Var = this.U0;
                Objects.requireNonNull(k0Var);
                imageView.postDelayed(new j0(k0Var, 1), 220L);
                nh.t3 t3Var = this.W0;
                if (t3Var != null) {
                    t3Var.e(true);
                    this.W0 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    nh.t3 t3Var2 = new nh.t3(getContext(), 3);
                    this.W0 = t3Var2;
                    t3Var2.q(true);
                    this.W0.t(LocaleController.getString(R.string.AIEditorHint));
                    this.W0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.W0, i7.f6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    nh.t3 t3Var3 = this.W0;
                    t3Var3.f18597h0 = new z2(4, this, t3Var2);
                    t3Var3.d = 4000L;
                    t3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            nh.t3 t3Var4 = this.W0;
            if (t3Var4 != null) {
                t3Var4.e(true);
                this.W0 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f18067a = c6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23459zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.g6.K(dp, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        jq jqVar = this.f18084n;
        jqVar.f29784a = K;
        jqVar.invalidateSelf();
        this.S0.e(-1, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        int i11 = 0;
        if (!z10 && this.Q0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.R0;
        imageView.setVisibility(i10);
        i11 = (z10 || !this.O0) ? 8 : 8;
        ImageView imageView2 = this.P0;
        imageView2.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        if (!z10) {
            int i11 = 8;
            if (this.Q0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.R0.setVisibility(i10);
            if (this.O0) {
                i11 = 0;
            }
            this.P0.setVisibility(i11);
        }
        nh.t3 t3Var = this.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        int i10;
        super.dispatchDraw(canvas);
        RectF rectF = this.f18097w0;
        ImageView imageView = this.V0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f18082k0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.yr0;
            if (z10) {
                f10 = rectF.bottom - AndroidUtilities.dp(44.0f);
            } else {
                f10 = rectF.top;
            }
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            imageView.setTranslationY((Utilities.clamp01((-this.f28007g1.d(this.f18076f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i10) + f10);
        }
        float f11 = this.f28008h1.f(this.f28010j1, true ^ G());
        float e10 = this.f28009i1.e(this.f28011k1);
        if (f11 > 0.0f) {
            float a2 = this.f28005e1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f18082k0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.yr0;
            n6 n6Var = this.f28004d1;
            RectF rectF2 = this.f28002b1;
            if (z11) {
                f9 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f9 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e10) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f9) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            lg.a aVar = this.f18073d0;
            if (aVar != null) {
                if (this.f28006f1 == null) {
                    ng.d c3 = aVar.c(this, null, false);
                    c3.n(pg.a.i(this.f18067a));
                    c3.o(AndroidUtilities.dp(5.0f));
                    c3.p(AndroidUtilities.dp(16.0f));
                    this.f28006f1 = c3;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f28006f1.setBounds(rect);
                this.f28006f1.draw(canvas);
            }
            Drawable drawable = this.f28003c1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            n6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            n6Var.f30880w = (int) (e10 * 255.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f28002b1;
        d6 d6Var = this.f28008h1;
        uc ucVar = this.f28005e1;
        if (action == 0) {
            if (d6Var.f27666c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            ucVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (ucVar.h && (d6Var.f27666c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                ucVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && ucVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.yr0) {
                    i10 = R.string.MoveCaptionDown;
                } else {
                    i10 = R.string.MoveCaptionUp;
                }
                this.f28004d1.q(LocaleController.getString(i10), true, true);
            }
            ucVar.c(false);
            return true;
        }
        if (!ucVar.h && !super.dispatchTouchEvent(motionEvent)) {
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
    public final void r(int i10) {
        float f9;
        float dp = (-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f);
        if (this instanceof org.telegram.ui.yr0) {
            f9 = -1.0f;
        } else {
            f9 = 1.0f;
        }
        this.Z0.setTranslationY(dp * f9);
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z10;
        boolean z11;
        CharSequence text = getText();
        boolean z12 = false;
        if (i11 > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z10 = true;
        } else {
            z10 = false;
        }
        F(z10);
        if (this.f28014o1) {
            if (i10 < 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i11 < 3) {
                z12 = true;
            }
            if (z11 != z12) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.f28012m1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.P0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f28013n1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z10;
        this.X0 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.X0 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S0.d(max, z10, true);
        nh.t3 t3Var = this.Z0;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f28001a1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f9) {
        float f10 = 1.0f - f9;
        this.R0.setAlpha(f10);
        this.P0.setAlpha(f10);
    }

    @Override
    public void x(int i10) {
        boolean z10 = this.f18080i0;
        super.x(i10);
        if (!z10 && this.H.c()) {
            B();
        }
    }

    public final void z() {
        ig igVar = this.l1;
        AndroidUtilities.cancelRunOnUIThread(igVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.Q).shouldShowMoveCaptionHint();
        this.f28011k1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.Q).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(igVar, 5000L);
        }
    }
}
