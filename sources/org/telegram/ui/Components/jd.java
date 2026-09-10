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
public abstract class jd extends bi.o {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final bi.n W0;
    public w70 X0;
    public final k0 Y0;
    public final ImageView Z0;
    public bi.x4 f24350a1;
    public int f24351b1;
    public final int[] f24352c1;
    public final bi.x4 f24353d1;
    public final Runnable f24354e1;
    public final RectF f24355f1;
    public final Drawable f24356g1;
    public final n6 f24357h1;
    public final xc f24358i1;
    public bh.d f24359j1;
    public final d6 f24360k1;
    public final d6 l1;
    public final d6 f24361m1;
    public boolean f24362n1;
    public boolean f24363o1;
    public final rg f24364p1;
    public boolean f24365q1;
    public Utilities.Callback f24366r1;
    public boolean f24367s1;

    public jd(Context context, FrameLayout frameLayout, aw0 aw0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.f6 f6Var, ia iaVar, Runnable runnable) {
        super(context, frameLayout, aw0Var, frameLayout2, f6Var, iaVar);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        this.f24351b1 = 0;
        this.f24352c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f24355f1 = new RectF();
        n6 n6Var = new n6(false, false, false, false);
        this.f24357h1 = n6Var;
        this.f24358i1 = new xc(this);
        wr wrVar = wr.h;
        this.f24360k1 = new d6(this, 0L, 350L, wrVar);
        this.l1 = new d6(this, 0L, 350L, wrVar);
        this.f24361m1 = new d6(this, 0L, 350L, wrVar);
        this.f24364p1 = new rg(this, 17);
        this.f24354e1 = runnable;
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.bt0;
        if (z10) {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f24356g1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            n6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f24356g1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
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
        addView(imageView, w7.a6.d(44, 44.0f, i13, 14.0f, f7, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        bi.n nVar = new bi.n(5);
        this.W0 = nVar;
        imageView2.setImageDrawable(nVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
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
        addView(imageView2, w7.a6.d(44, 44.0f, i14, 0.0f, f11, 10.0f, f12));
        bi.x4 x4Var = new bi.x4(context, z10 ? 1 : 3);
        this.f24353d1 = x4Var;
        x4Var.q(12.0f);
        int dp = AndroidUtilities.dp(12.0f);
        if (z10) {
            f13 = 8.0f;
        } else {
            f13 = 0.0f;
        }
        x4Var.setPadding(dp, AndroidUtilities.dp(f13), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        x4Var.l(1.0f, -21.0f);
        x4Var.p(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(x4Var, w7.a6.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        k0 k0Var = new k0(context);
        this.Y0 = k0Var;
        imageView3.setImageDrawable(k0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, w7.a6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        w7.c6.a(imageView3);
        this.f3268f.getEditText().addTextChangedListener(new bi.u2(this, 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, 7));
        imageView2.setOnClickListener(new org.telegram.ui.sh(18, this, frameLayout));
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
        bi.i iVar = this.f3268f;
        iVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f3278o0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        iVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f24362n1 == z10 && z11) {
            return;
        }
        this.f24362n1 = z10;
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
            alpha.translationX(f10).withEndAction(new id(this, z10, 1)).start();
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
        bi.i iVar = this.f3268f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i11);
        iVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f7;
        float f10;
        if (this.f24367s1 != z10) {
            if (z10) {
                MessagesController.getInstance(this.U).getTonesController().load();
            }
            this.f24367s1 = z10;
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
            scaleX.scaleY(f11).setInterpolator(wr.h).setDuration(420L).withEndAction(new id(this, z10, 0)).start();
            if (z10) {
                k0 k0Var = this.Y0;
                Objects.requireNonNull(k0Var);
                imageView.postDelayed(new j0(k0Var, 1), 220L);
                bi.x4 x4Var = this.f24350a1;
                if (x4Var != null) {
                    x4Var.e(true);
                    this.f24350a1 = null;
                }
                if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                    bi.x4 x4Var2 = new bi.x4(getContext(), 3);
                    this.f24350a1 = x4Var2;
                    x4Var2.p(true);
                    this.f24350a1.s(LocaleController.getString(R.string.AIEditorHint));
                    this.f24350a1.m(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                    addView(this.f24350a1, w7.a6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    bi.x4 x4Var3 = this.f24350a1;
                    x4Var3.f3890l0 = new org.telegram.ui.qh(28, this, x4Var2);
                    x4Var3.d = 4000L;
                    x4Var3.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            bi.x4 x4Var4 = this.f24350a1;
            if (x4Var4 != null) {
                x4Var4.e(true);
                this.f24350a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f3260a = f6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18334zf;
        ShapeDrawable K = org.telegram.ui.ActionBar.j6.K(dp, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        vq vqVar = this.f3276n;
        vqVar.f28573a = K;
        vqVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), -1);
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
        bi.x4 x4Var = this.f24353d1;
        if (x4Var != null) {
            x4Var.e(true);
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
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f3278o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.bt0;
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
            imageView.setTranslationY((Utilities.clamp01((-this.f24360k1.d(this.f3268f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * i10) + f10);
        }
        float f11 = this.l1.f(this.f24362n1, true ^ G());
        float e = this.f24361m1.e(this.f24363o1);
        if (f11 > 0.0f) {
            float a2 = this.f24358i1.a(0.03f);
            int dp = AndroidUtilities.dp((1.0f - this.f3278o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.bt0;
            n6 n6Var = this.f24357h1;
            RectF rectF2 = this.f24355f1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.bottom + AndroidUtilities.dp(10.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e) + AndroidUtilities.dp(44.0f) + dp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + dp, rectF.top - AndroidUtilities.dp(42.0f), ((n6Var.d() + AndroidUtilities.dp(11.0f)) * e) + AndroidUtilities.dp(44.0f) + dp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            zg.a aVar = this.f3271h0;
            if (aVar != null) {
                if (this.f24359j1 == null) {
                    bh.d c10 = aVar.c(this, null, false);
                    c10.n(dh.c.i(this.f3260a));
                    c10.o(AndroidUtilities.dp(5.0f));
                    c10.p(AndroidUtilities.dp(16.0f));
                    this.f24359j1 = c10;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f24359j1.setBounds(rect);
                this.f24359j1.draw(canvas);
            }
            Drawable drawable = this.f24356g1;
            drawable.setBounds((int) (rectF2.left + AndroidUtilities.dp(9.0f)), (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f)), (int) (rectF2.left + AndroidUtilities.dp(29.0f)), (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f)));
            drawable.draw(canvas);
            n6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            n6Var.f25442w = (int) (e * 255.0f);
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f24355f1;
        d6 d6Var = this.l1;
        xc xcVar = this.f24358i1;
        if (action == 0) {
            if (d6Var.f22295c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            xcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (xcVar.h && (d6Var.f22295c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                xcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && xcVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.bt0) {
                    i10 = R.string.MoveCaptionDown;
                } else {
                    i10 = R.string.MoveCaptionUp;
                }
                this.f24357h1.q(LocaleController.getString(i10), true, true);
            }
            xcVar.c(false);
            return true;
        }
        if (!xcVar.h && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f24353d1) {
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
        if (this instanceof org.telegram.ui.bt0) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f24353d1.setTranslationY(dp * f7);
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
        if (this.f24367s1) {
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
        this.f24365q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f24366r1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z10;
        this.f24351b1 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.f24351b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        bi.x4 x4Var = this.f24353d1;
        if (x4Var != null) {
            x4Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f24354e1;
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
        rg rgVar = this.f24364p1;
        AndroidUtilities.cancelRunOnUIThread(rgVar);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.U).shouldShowMoveCaptionHint();
        this.f24363o1 = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.U).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(rgVar, 5000L);
        }
    }
}
