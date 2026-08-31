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
public abstract class bd extends qh.k {
    public boolean P0;
    public final ImageView Q0;
    public boolean R0;
    public final ImageView S0;
    public final qh.j T0;
    public q70 U0;
    public final j0 V0;
    public final ImageView W0;
    public qh.f3 X0;
    public int Y0;
    public final int[] Z0;
    public final qh.f3 f25567a1;
    public final Runnable f25568b1;
    public final RectF f25569c1;
    public final Drawable f25570d1;
    public final j6 f25571e1;
    public final rc f25572f1;
    public qg.b f25573g1;
    public final z5 f25574h1;
    public final z5 f25575i1;
    public final z5 f25576j1;
    public boolean f25577k1;
    public boolean l1;
    public final fg f25578m1;
    public boolean f25579n1;
    public Utilities.Callback f25580o1;
    public boolean f25581p1;

    public bd(Context context, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.g6 g6Var, ba baVar, Runnable runnable) {
        super(context, frameLayout, qv0Var, frameLayout2, g6Var, baVar);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        this.Y0 = 0;
        this.Z0 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f25569c1 = new RectF();
        j6 j6Var = new j6(false, false, false, false);
        this.f25571e1 = j6Var;
        this.f25572f1 = new rc(this);
        pr prVar = pr.h;
        this.f25574h1 = new z5(this, 0L, 350L, prVar);
        this.f25575i1 = new z5(this, 0L, 350L, prVar);
        this.f25576j1 = new z5(this, 0L, 350L, prVar);
        this.f25578m1 = new fg(this, 17);
        this.f25568b1 = runnable;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        boolean z4 = this instanceof org.telegram.ui.is0;
        if (z4) {
            j6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f25570d1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            j6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f25570d1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.Q0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        if (z4) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i13 = i10 | 3;
        if (z4) {
            f10 = 6.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        addView(imageView, k7.c6.d(44, 44.0f, i13, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.S0 = imageView2;
        qh.j jVar = new qh.j(5);
        this.T0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z4) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        int i14 = i11 | 5;
        if (z4) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        if (z4) {
            f13 = 0.0f;
        } else {
            f13 = 6.0f;
        }
        addView(imageView2, k7.c6.d(44, 44.0f, i14, 0.0f, f12, 10.0f, f13));
        qh.f3 f3Var = new qh.f3(context, z4 ? 1 : 3);
        this.f25567a1 = f3Var;
        f3Var.r(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z4) {
            f14 = 8.0f;
        } else {
            f14 = 0.0f;
        }
        f3Var.setPadding(dp, AndroidUtilities.dp(f14), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z4 ? 0.0f : 8.0f));
        f3Var.m(1.0f, -21.0f);
        f3Var.q(true);
        if (z4) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(f3Var, k7.c6.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.W0 = imageView3;
        j0 j0Var = new j0(context);
        this.V0 = j0Var;
        imageView3.setImageDrawable(j0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, k7.c6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        k7.e6.a(imageView3);
        this.f45517f.getEditText().addTextChangedListener(new eh.c(this, 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new g0(this, 7));
        imageView2.setOnClickListener(new w2(6, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z4) {
        int i10;
        float f10;
        this.P0 = z4;
        ImageView imageView = this.Q0;
        imageView.animate().cancel();
        int i11 = 0;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        float f11 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView.setAlpha(f10);
        if (!z4) {
            f11 = AndroidUtilities.dp(-8.0f);
        }
        imageView.setTranslationX(f11);
        qh.f fVar = this.f45517f;
        fVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f45524l0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.P0 && this.R0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z4, boolean z10) {
        if (this.f25577k1 == z4 && z10) {
            return;
        }
        this.f25577k1 = z4;
        if (!z10) {
            this.f25575i1.f(z4, true);
        }
        invalidate();
    }

    public final void E(boolean z4, boolean z10) {
        int i10;
        this.R0 = z4;
        ImageView imageView = this.S0;
        imageView.animate().cancel();
        float f10 = 1.0f;
        int i11 = 0;
        float f11 = 0.0f;
        if (z10) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z4) {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z4) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            alpha.translationX(f11).withEndAction(new ad(this, z4, 1)).start();
        } else {
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
            if (!z4) {
                f10 = 0.0f;
            }
            imageView.setAlpha(f10);
            if (!z4) {
                f11 = AndroidUtilities.dp(8.0f);
            }
            imageView.setTranslationX(f11);
        }
        qh.f fVar = this.f45517f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.P0 && this.R0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z4) {
        float f10;
        float f11;
        if (this.f25581p1 != z4) {
            if (z4) {
                MessagesController.getInstance(this.R).getTonesController().load();
            }
            this.f25581p1 = z4;
            ImageView imageView = this.W0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f12 = 0.6f;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z4) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).setInterpolator(pr.h).setDuration(420L).withEndAction(new ad(this, z4, 0)).start();
            if (z4) {
                j0 j0Var = this.V0;
                Objects.requireNonNull(j0Var);
                imageView.postDelayed(new i0(j0Var, 1), 220L);
                qh.f3 f3Var = this.X0;
                if (f3Var != null) {
                    f3Var.e(true);
                    this.X0 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    qh.f3 f3Var2 = new qh.f3(getContext(), 3);
                    this.X0 = f3Var2;
                    f3Var2.q(true);
                    this.X0.t(LocaleController.getString(R.string.AIEditorHint));
                    this.X0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.X0, k7.c6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    qh.f3 f3Var3 = this.X0;
                    f3Var3.f45298i0 = new org.telegram.ui.mp(12, this, f3Var2);
                    f3Var3.d = 4000L;
                    f3Var3.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            qh.f3 f3Var4 = this.X0;
            if (f3Var4 != null) {
                f3Var4.e(true);
                this.X0 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f45508a = g6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f22059zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        pq pqVar = this.f45525n;
        pqVar.f30165a = K;
        pqVar.invalidateSelf();
        this.T0.e(-1, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z4) {
        int i10;
        int i11 = 0;
        if (!z4 && this.R0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.S0;
        imageView.setVisibility(i10);
        i11 = (z4 || !this.P0) ? 8 : 8;
        ImageView imageView2 = this.Q0;
        imageView2.setVisibility(i11);
        if (z4) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z4) {
        int i10;
        if (!z4) {
            int i11 = 8;
            if (this.R0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.S0.setVisibility(i10);
            if (this.P0) {
                i11 = 0;
            }
            this.Q0.setVisibility(i11);
        }
        qh.f3 f3Var = this.f25567a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10;
        super.dispatchDraw(canvas);
        RectF rectF = this.f45540x0;
        ImageView imageView = this.W0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f45524l0) * 4.0f));
            boolean z4 = this instanceof org.telegram.ui.is0;
            if (z4) {
                f11 = rectF.bottom - AndroidUtilities.dp(44.0f);
            } else {
                f11 = rectF.top;
            }
            if (z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            imageView.setTranslationY((Utilities.clamp01((-this.f25574h1.d(this.f45517f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i10) + f11);
        }
        float f12 = this.f25575i1.f(this.f25577k1, true ^ G());
        float e6 = this.f25576j1.e(this.l1);
        if (f12 > 0.0f) {
            float a2 = this.f25572f1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f45524l0) * 4.0f);
            boolean z10 = this instanceof org.telegram.ui.is0;
            j6 j6Var = this.f25571e1;
            RectF rectF2 = this.f25569c1;
            if (z10) {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((j6Var.d() + AndroidUtilities.dp(11.0f)) * e6) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((j6Var.d() + AndroidUtilities.dp(11.0f)) * e6) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            og.a aVar = this.f45516e0;
            if (aVar != null) {
                if (this.f25573g1 == null) {
                    qg.b c3 = aVar.c(this, null, false);
                    c3.n(sg.b.i(this.f45508a));
                    c3.o(AndroidUtilities.dp(5.0f));
                    c3.p(AndroidUtilities.dp(16.0f));
                    this.f25573g1 = c3;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f25573g1.setBounds(rect);
                this.f25573g1.draw(canvas);
            }
            Drawable drawable = this.f25570d1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            j6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            j6Var.f28047w = (int) (e6 * 255.0f);
            j6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z4;
        int action = motionEvent.getAction();
        RectF rectF = this.f25569c1;
        z5 z5Var = this.f25575i1;
        rc rcVar = this.f25572f1;
        if (action == 0) {
            if (z5Var.f33725c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z4 = true;
            } else {
                z4 = false;
            }
            rcVar.c(z4);
        } else if (motionEvent.getAction() == 2) {
            if (rcVar.h && (z5Var.f33725c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                rcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && rcVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.is0) {
                    i10 = R.string.MoveCaptionDown;
                } else {
                    i10 = R.string.MoveCaptionUp;
                }
                this.f25571e1.q(LocaleController.getString(i10), true, true);
            }
            rcVar.c(false);
            return true;
        }
        if (!rcVar.h && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f25567a1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.R).captionLengthLimitDefault;
    }

    @Override
    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.R).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.R).captionLengthLimitPremium;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.P0) {
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
        float f10;
        float dp = (-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f);
        if (this instanceof org.telegram.ui.is0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f25567a1.setTranslationY(dp * f10);
    }

    @Override
    public final void s(int i10, int i11) {
        boolean z4;
        boolean z10;
        CharSequence text = getText();
        boolean z11 = false;
        if (i11 > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z4 = true;
        } else {
            z4 = false;
        }
        F(z4);
        if (this.f25581p1) {
            if (i10 < 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 < 3) {
                z11 = true;
            }
            if (z10 != z11) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z4) {
        this.f25579n1 = z4;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.Q0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f25580o1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z4;
        this.Y0 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.Y0 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.T0.d(max, z4, true);
        qh.f3 f3Var = this.f25567a1;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f25568b1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.S0.setAlpha(f11);
        this.Q0.setAlpha(f11);
    }

    @Override
    public void x(int i10) {
        boolean z4 = this.f45522j0;
        super.x(i10);
        if (!z4 && this.I.c()) {
            B();
        }
    }

    public final void z() {
        fg fgVar = this.f25578m1;
        AndroidUtilities.cancelRunOnUIThread(fgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.R).shouldShowMoveCaptionHint();
        this.l1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.R).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(fgVar, 5000L);
        }
    }
}
