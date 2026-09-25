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
public abstract class md extends ci.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final ci.l W0;
    public y70 X0;
    public final i0 Y0;
    public final ImageView Z0;
    public ci.e4 f26458a1;
    public int f26459b1;
    public final int[] f26460c1;
    public final ci.e4 f26461d1;
    public final Runnable f26462e1;
    public final RectF f26463f1;
    public final Drawable f26464g1;
    public final o6 f26465h1;
    public final yc f26466i1;
    public ch.d f26467j1;
    public final e6 f26468k1;
    public final e6 l1;
    public final e6 f26469m1;
    public boolean f26470n1;
    public boolean f26471o1;
    public final pg f26472p1;
    public boolean f26473q1;
    public Utilities.Callback f26474r1;
    public boolean f26475s1;

    public md(Context context, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.d6 d6Var, ja jaVar, Runnable runnable) {
        super(context, frameLayout, aw0Var, frameLayout2, d6Var, jaVar);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        this.f26459b1 = 0;
        this.f26460c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f26463f1 = new RectF();
        o6 o6Var = new o6(false, false, false, false);
        this.f26465h1 = o6Var;
        this.f26466i1 = new yc(this);
        rr rrVar = rr.h;
        this.f26468k1 = new e6(this, 0L, 350L, rrVar);
        this.l1 = new e6(this, 0L, 350L, rrVar);
        this.f26469m1 = new e6(this, 0L, 350L, rrVar);
        this.f26472p1 = new pg(this, 17);
        this.f26462e1 = runnable;
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.us0;
        if (z10) {
            o6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f26464g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            o6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f26464g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i13 = i10 | 3;
        if (z10) {
            f7 = 6.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        addView(imageView, w7.y5.d(44, 44.0f, i13, 14.0f, f7, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        ci.l lVar = new ci.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
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
        addView(imageView2, w7.y5.d(44, 44.0f, i14, 0.0f, f11, 10.0f, f12));
        ci.e4 e4Var = new ci.e4(context, z10 ? 1 : 3);
        this.f26461d1 = e4Var;
        e4Var.q(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f13 = 8.0f;
        } else {
            f13 = 0.0f;
        }
        e4Var.setPadding(dp, AndroidUtilities.dp(f13), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        e4Var.l(1.0f, -21.0f);
        e4Var.p(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(e4Var, w7.y5.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        i0 i0Var = new i0(context);
        this.Y0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, w7.y5.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.a6.a(imageView3);
        this.f5121f.getEditText().addTextChangedListener(new ci.i2(this, 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 7));
        imageView2.setOnClickListener(new org.telegram.ui.pf(21, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i10;
        float f7;
        this.S0 = z10;
        ImageView imageView = this.T0;
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
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        imageView.setAlpha(f7);
        if (!z10) {
            f10 = AndroidUtilities.dp(-8.0f);
        }
        imageView.setTranslationX(f10);
        ci.g gVar = this.f5121f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f5131o0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f26470n1 == z10 && z11) {
            return;
        }
        this.f26470n1 = z10;
        if (!z11) {
            this.l1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i10;
        this.U0 = z10;
        ImageView imageView = this.V0;
        imageView.animate().cancel();
        float f7 = 1.0f;
        int i11 = 0;
        float f10 = 0.0f;
        if (z11) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z10) {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (!z10) {
                f10 = AndroidUtilities.dp(8.0f);
            }
            alpha.translationX(f10).withEndAction(new jd(this, z10, 1)).start();
        } else {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
            if (!z10) {
                f7 = 0.0f;
            }
            imageView.setAlpha(f7);
            if (!z10) {
                f10 = AndroidUtilities.dp(8.0f);
            }
            imageView.setTranslationX(f10);
        }
        ci.g gVar = this.f5121f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f7;
        float f10;
        if (this.f26475s1 != z10) {
            if (z10) {
                MessagesController.getInstance(this.U).getTonesController().load();
            }
            this.f26475s1 = z10;
            ImageView imageView = this.Z0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
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
            scaleX.scaleY(f11).setInterpolator(rr.h).setDuration(420L).withEndAction(new jd(this, z10, 0)).start();
            if (z10) {
                i0 i0Var = this.Y0;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ci.e4 e4Var = this.f26458a1;
                if (e4Var != null) {
                    e4Var.e(true);
                    this.f26458a1 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ci.e4 e4Var2 = new ci.e4(getContext(), 3);
                    this.f26458a1 = e4Var2;
                    e4Var2.p(true);
                    this.f26458a1.s(LocaleController.getString(R.string.AIEditorHint));
                    this.f26458a1.m(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.f26458a1, w7.y5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    ci.e4 e4Var3 = this.f26458a1;
                    e4Var3.f4615l0 = new kd(0, this, e4Var2);
                    e4Var3.d = 4000L;
                    e4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ci.e4 e4Var4 = this.f26458a1;
            if (e4Var4 != null) {
                e4Var4.e(true);
                this.f26458a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f5113a = d6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f19471zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.h6.K(dp, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        qq qqVar = this.f5129n;
        qqVar.f27733a = K;
        qqVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        int i11 = 0;
        if (!z10 && this.U0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.V0;
        imageView.setVisibility(i10);
        i11 = (z10 || !this.S0) ? 8 : 8;
        ImageView imageView2 = this.T0;
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
            if (this.U0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.V0.setVisibility(i10);
            if (this.S0) {
                i11 = 0;
            }
            this.T0.setVisibility(i11);
        }
        ci.e4 e4Var = this.f26461d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f5131o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.us0;
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
            imageView.setTranslationY((Utilities.clamp01((-this.f26468k1.d(this.f5121f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i10) + f10);
        }
        float f11 = this.l1.f(this.f26470n1, true ^ G());
        float e = this.f26469m1.e(this.f26471o1);
        if (f11 > 0.0f) {
            float a2 = this.f26466i1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f5131o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.us0;
            o6 o6Var = this.f26465h1;
            RectF rectF2 = this.f26463f1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((o6Var.d() + AndroidUtilities.dp(11.0f)) * e) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((o6Var.d() + AndroidUtilities.dp(11.0f)) * e) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            ah.c cVar = this.f5124h0;
            if (cVar != null) {
                if (this.f26467j1 == null) {
                    ch.d c10 = cVar.c(this, null, false);
                    c10.o(eh.b.i(this.f5113a));
                    c10.p(AndroidUtilities.dp(5.0f));
                    c10.q(AndroidUtilities.dp(16.0f));
                    this.f26467j1 = c10;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f26467j1.setBounds(rect);
                this.f26467j1.draw(canvas);
            }
            Drawable drawable = this.f26464g1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            o6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            o6Var.f26947w = (int) (e * 255.0f);
            o6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f26463f1;
        e6 e6Var = this.l1;
        yc ycVar = this.f26466i1;
        if (action == 0) {
            if (e6Var.f23845c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            ycVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (ycVar.h && (e6Var.f23845c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                ycVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && ycVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.us0) {
                    i10 = R.string.MoveCaptionDown;
                } else {
                    i10 = R.string.MoveCaptionUp;
                }
                this.f26465h1.q(LocaleController.getString(i10), true, true);
            }
            ycVar.c(false);
            return true;
        }
        if (!ycVar.h && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f26461d1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.U).captionLengthLimitDefault;
    }

    @Override
    public int getCaptionLimit() {
        if (UserConfig.getInstance(this.U).isPremium()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.U).captionLengthLimitPremium;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.S0) {
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
        float f7;
        float dp = (-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f);
        if (this instanceof org.telegram.ui.us0) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f26461d1.setTranslationY(dp * f7);
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
        if (this.f26475s1) {
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
        this.f26473q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f26474r1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z10;
        this.f26459b1 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.f26459b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        ci.e4 e4Var = this.f26461d1;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f26462e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f7) {
        float f10 = 1.0f - f7;
        this.V0.setAlpha(f10);
        this.T0.setAlpha(f10);
    }

    @Override
    public void x(int i10) {
        boolean z10 = this.m0;
        super.x(i10);
        if (!z10 && this.L.c()) {
            B();
        }
    }

    public final void z() {
        pg pgVar = this.f26472p1;
        AndroidUtilities.cancelRunOnUIThread(pgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.U).shouldShowMoveCaptionHint();
        this.f26471o1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.U).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(pgVar, 5000L);
        }
    }
}
