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
public abstract class od extends ci.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final ci.l W0;
    public q80 X0;
    public final i0 Y0;
    public final ImageView Z0;
    public ci.d4 f29441a1;
    public int f29442b1;
    public final int[] f29443c1;
    public final ci.d4 f29444d1;
    public final Runnable f29445e1;
    public final RectF f29446f1;
    public final Drawable f29447g1;
    public final q6 f29448h1;
    public final bd f29449i1;
    public ch.d f29450j1;
    public final g6 f29451k1;
    public final g6 l1;
    public final g6 f29452m1;
    public boolean f29453n1;
    public boolean f29454o1;
    public final rg f29455p1;
    public boolean f29456q1;
    public Utilities.Callback f29457r1;
    public boolean f29458s1;

    public od(Context context, FrameLayout frameLayout, tw0 tw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, ma maVar, Runnable runnable) {
        super(context, frameLayout, tw0Var, frameLayout2, e6Var, maVar);
        int i10;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        this.f29442b1 = 0;
        this.f29443c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f29446f1 = new RectF();
        q6 q6Var = new q6(false, false, false);
        this.f29448h1 = q6Var;
        this.f29449i1 = new bd(this);
        is isVar = is.h;
        this.f29451k1 = new g6(this, 0L, 350L, isVar);
        this.l1 = new g6(this, 0L, 350L, isVar);
        this.f29452m1 = new g6(this, 0L, 350L, isVar);
        this.f29455p1 = new rg(this, 17);
        this.f29445e1 = runnable;
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.ct0;
        if (z10) {
            q6Var.t(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f29447g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            q6Var.t(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f29447g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
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
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
            f11 = 0.0f;
        }
        float f15 = f11;
        addView(imageView, w7.x5.a(44.0f, 14.0f, f7, 0.0f, f10, 44, i13));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        ci.l lVar = new ci.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        int i14 = i11 | 5;
        if (z10) {
            f12 = 6.0f;
        } else {
            f12 = f15;
        }
        if (z10) {
            f13 = f15;
        } else {
            f13 = 6.0f;
        }
        addView(imageView2, w7.x5.a(44.0f, 0.0f, f12, 10.0f, f13, 44, i14));
        ci.d4 d4Var = new ci.d4(context, z10 ? 1 : 3);
        this.f29444d1 = d4Var;
        d4Var.q(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f14 = 8.0f;
        } else {
            f14 = f15;
        }
        d4Var.setPadding(dp, AndroidUtilities.dp(f14), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? f15 : 8.0f));
        d4Var.l(1.0f, -21.0f);
        d4Var.p(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(d4Var, w7.x5.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        i0 i0Var = new i0(context);
        this.Y0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, w7.x5.a(44.0f, 8.0f, 0.0f, 8.0f, 0.0f, 44, 53));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.z5.a(imageView3);
        this.f5555f.getEditText().addTextChangedListener(new ci.h2(this, 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f15);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 6));
        imageView2.setOnClickListener(new org.telegram.ui.sf(21, this, frameLayout));
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
        ci.g gVar = this.f5555f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f5565o0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f29453n1 == z10 && z11) {
            return;
        }
        this.f29453n1 = z10;
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
            alpha.translationX(f10).withEndAction(new md(this, z10, 1)).start();
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
        ci.g gVar = this.f5555f;
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
        if (this.f29458s1 != z10) {
            if (z10) {
                MessagesController.getInstance(this.U).getTonesController().load();
            }
            this.f29458s1 = z10;
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
            scaleX.scaleY(f11).setInterpolator(is.h).setDuration(420L).withEndAction(new md(this, z10, 0)).start();
            if (z10) {
                i0 i0Var = this.Y0;
                Objects.requireNonNull(i0Var);
                imageView.postDelayed(new h0(i0Var, 1), 220L);
                ci.d4 d4Var = this.f29441a1;
                if (d4Var != null) {
                    d4Var.e(true);
                    this.f29441a1 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    ci.d4 d4Var2 = new ci.d4(getContext(), 3);
                    this.f29441a1 = d4Var2;
                    d4Var2.p(true);
                    this.f29441a1.s(LocaleController.getString(R.string.AIEditorHint));
                    this.f29441a1.m(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.f29441a1, w7.x5.a(200.0f, 0.0f, -196.0f, 0.0f, 0.0f, -1, 48));
                    ci.d4 d4Var3 = this.f29441a1;
                    d4Var3.f4918l0 = new ea(3, this, d4Var2);
                    d4Var3.d = 4000L;
                    d4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            ci.d4 d4Var4 = this.f29441a1;
            if (d4Var4 != null) {
                d4Var4.e(true);
                this.f29441a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f5546a = e6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f21212zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.i6.K(dp, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        fr frVar = this.f5563n;
        frVar.f26495a = K;
        frVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.i6.w0(i10, e6Var), -1);
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
        if (z10 || !this.S0) {
            i11 = 8;
        }
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
        ci.d4 d4Var = this.f29444d1;
        if (d4Var != null) {
            d4Var.e(true);
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
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f5565o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.ct0;
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
            imageView.setTranslationY((Utilities.clamp01((-this.f29451k1.d(this.f5555f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i10) + f10);
        }
        float f11 = this.l1.f(this.f29453n1, true ^ G());
        float e7 = this.f29452m1.e(this.f29454o1);
        if (f11 > 0.0f) {
            float a2 = this.f29449i1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f5565o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.ct0;
            q6 q6Var = this.f29448h1;
            RectF rectF2 = this.f29446f1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((q6Var.c() + AndroidUtilities.dp(11.0f)) * e7) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((q6Var.c() + AndroidUtilities.dp(11.0f)) * e7) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            ah.c cVar = this.f5558h0;
            if (cVar != null) {
                if (this.f29450j1 == null) {
                    ch.d c10 = cVar.c(this, null, false);
                    c10.o(eh.b.i(this.f5546a));
                    c10.p(AndroidUtilities.dp(5.0f));
                    c10.q(AndroidUtilities.dp(16.0f));
                    this.f29450j1 = c10;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f29450j1.setBounds(rect);
                this.f29450j1.draw(canvas);
            }
            Drawable drawable = this.f29447g1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            q6Var.o(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            q6Var.B = (int) (e7 * 255.0f);
            q6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f29446f1;
        g6 g6Var = this.l1;
        bd bdVar = this.f29449i1;
        if (action == 0) {
            if (g6Var.f26616c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            bdVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (bdVar.f24928i && (g6Var.f26616c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                bdVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && bdVar.f24928i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.ct0) {
                    i10 = R.string.MoveCaptionDown;
                } else {
                    i10 = R.string.MoveCaptionUp;
                }
                this.f29448h1.t(LocaleController.getString(i10), true, true);
            }
            bdVar.c(false);
            return true;
        }
        if (!bdVar.f24928i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f29444d1) {
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
        if (this instanceof org.telegram.ui.ct0) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f29444d1.setTranslationY(dp * f7);
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
        if (this.f29458s1) {
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
        this.f29456q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f29457r1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z10;
        this.f29442b1 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.f29442b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        ci.d4 d4Var = this.f29444d1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f29445e1;
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
        rg rgVar = this.f29455p1;
        AndroidUtilities.cancelRunOnUIThread(rgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.U).shouldShowMoveCaptionHint();
        this.f29454o1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.U).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(rgVar, 5000L);
        }
    }
}
