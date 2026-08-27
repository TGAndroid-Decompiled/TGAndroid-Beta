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
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

public abstract class xc extends lh.m {
    public boolean O0;
    public final ImageView P0;
    public boolean Q0;
    public final ImageView R0;
    public final lh.l S0;
    public b70 T0;
    public final i0 U0;
    public final ImageView V0;
    public lh.w3 W0;
    public int X0;
    public final int[] Y0;
    public final lh.w3 Z0;

    public final Runnable f34586a1;

    public final RectF f34587b1;

    public final Drawable f34588c1;

    public final i6 f34589d1;

    public final nc f34590e1;

    public lg.d f34591f1;

    public final y5 f34592g1;

    public final y5 f34593h1;

    public final y5 f34594i1;

    public boolean f34595j1;

    public boolean f34596k1;
    public final bg l1;

    public boolean f34597m1;

    public Utilities.Callback f34598n1;

    public boolean f34599o1;

    public xc(Context context, FrameLayout frameLayout, zu0 zu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.c6 c6Var, z9 z9Var, Runnable runnable) {
        super(context, frameLayout, zu0Var, frameLayout2, c6Var, z9Var);
        this.X0 = 0;
        this.Y0 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f34587b1 = new RectF();
        i6 i6Var = new i6(false, false, false, false);
        this.f34589d1 = i6Var;
        this.f34590e1 = new nc(this);
        er erVar = er.h;
        this.f34592g1 = new y5(this, 0L, 350L, erVar);
        this.f34593h1 = new y5(this, 0L, 350L, erVar);
        this.f34594i1 = new y5(this, 0L, 350L, erVar);
        this.l1 = new bg(this, 17);
        this.f34586a1 = runnable;
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        boolean z10 = this instanceof org.telegram.ui.as0;
        if (z10) {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.f34588c1 = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            i6Var.q(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.f34588c1 = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.P0 = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        C(false);
        addView(imageView, h7.z5.d(44, 44.0f, (z10 ? 48 : 80) | 3, 14.0f, z10 ? 6.0f : 0.0f, 0.0f, z10 ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.R0 = imageView2;
        lh.l lVar = new lh.l(5);
        this.S0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        addView(imageView2, h7.z5.d(44, 44.0f, (z10 ? 48 : 80) | 5, 0.0f, z10 ? 6.0f : 0.0f, 10.0f, z10 ? 0.0f : 6.0f));
        lh.w3 w3Var = new lh.w3(context, z10 ? 1 : 3);
        this.Z0 = w3Var;
        w3Var.r(12.0f);
        w3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 0.0f : 8.0f));
        w3Var.m(1.0f, -21.0f);
        w3Var.q(true);
        addView(w3Var, h7.z5.e(-1, 80, (z10 ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.V0 = imageView3;
        i0 i0Var = new i0(context);
        this.U0 = i0Var;
        imageView3.setImageDrawable(i0Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, h7.z5.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        h7.b6.a(imageView3);
        this.f16338f.getEditText().addTextChangedListener(new ch.e(this, 6));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 7));
        imageView2.setOnClickListener(new q2(9, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        this.O0 = z10;
        ImageView imageView = this.P0;
        imageView.animate().cancel();
        int i10 = 0;
        imageView.setVisibility(z10 ? 0 : 8);
        imageView.setAlpha(z10 ? 1.0f : 0.0f);
        imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(-8.0f));
        lh.g gVar = this.f16338f;
        gVar.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.f16344k0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f34595j1 == z10 && z11) {
            return;
        }
        this.f34595j1 = z10;
        if (!z11) {
            this.f34593h1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        this.Q0 = z10;
        ImageView imageView = this.R0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z11) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z10 ? 1.0f : 0.0f).translationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new wc(this, z10, 1)).start();
        } else {
            imageView.setVisibility(z10 ? 0 : 8);
            imageView.setAlpha(z10 ? 1.0f : 0.0f);
            imageView.setTranslationX(z10 ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        lh.g gVar = this.f16338f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.O0 && this.Q0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        if (this.f34599o1 == z10) {
            return;
        }
        if (z10) {
            MessagesController.getInstance(this.Q).getTonesController().load();
        }
        this.f34599o1 = z10;
        ImageView imageView = this.V0;
        imageView.setVisibility(0);
        imageView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setInterpolator(er.h).setDuration(420L).withEndAction(new wc(this, z10, 0)).start();
        if (!z10) {
            lh.w3 w3Var = this.W0;
            if (w3Var != null) {
                w3Var.e(true);
                this.W0 = null;
                return;
            }
            return;
        }
        i0 i0Var = this.U0;
        Objects.requireNonNull(i0Var);
        imageView.postDelayed(new h0(i0Var, 1), 220L);
        lh.w3 w3Var2 = this.W0;
        if (w3Var2 != null) {
            w3Var2.e(true);
            this.W0 = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            lh.w3 w3Var3 = new lh.w3(getContext(), 3);
            this.W0 = w3Var3;
            w3Var3.q(true);
            this.W0.t(LocaleController.getString(R.string.AIEditorHint));
            this.W0.n(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.W0, h7.z5.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            lh.w3 w3Var4 = this.W0;
            w3Var4.f16984h0 = new org.telegram.ui.yq(7, this, w3Var3);
            w3Var4.d = 4000L;
            w3Var4.v();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f16329a = c6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.SRC_IN));
        int iDp = AndroidUtilities.dp(16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23449zf;
        ShapeDrawable shapeDrawableK = org.telegram.ui.ActionBar.g6.K(iDp, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        dq dqVar = this.f16346n;
        dqVar.f27820a = shapeDrawableK;
        dqVar.invalidateSelf();
        this.S0.e(-1, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i10 = (z10 || !this.Q0) ? 8 : 0;
        ImageView imageView = this.R0;
        imageView.setVisibility(i10);
        int i11 = (z10 || !this.O0) ? 8 : 0;
        ImageView imageView2 = this.P0;
        imageView2.setVisibility(i11);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        if (!z10) {
            this.R0.setVisibility(this.Q0 ? 0 : 8);
            this.P0.setVisibility(this.O0 ? 0 : 8);
        }
        lh.w3 w3Var = this.Z0;
        if (w3Var != null) {
            w3Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        RectF rectF = this.f16359w0;
        ImageView imageView = this.V0;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.f16344k0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.as0;
            imageView.setTranslationY((Utilities.clamp01((-this.f34592g1.d(this.f16338f.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z10 ? 1 : -1)) + (z10 ? rectF.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f11 = this.f34593h1.f(this.f34595j1, true ^ G());
        float fE = this.f34594i1.e(this.f34596k1);
        if (f11 > 0.0f) {
            float fA = this.f34590e1.a(0.03f);
            int iDp = AndroidUtilities.dp((1.0f - this.f16344k0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.as0;
            i6 i6Var = this.f34589d1;
            RectF rectF2 = this.f34587b1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + iDp, rectF.bottom + AndroidUtilities.dp(10.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * fE) + AndroidUtilities.dp(44.0f) + iDp, rectF.bottom + AndroidUtilities.dp(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(AndroidUtilities.dp(7.0f) + iDp, rectF.top - AndroidUtilities.dp(42.0f), ((i6Var.d() + AndroidUtilities.dp(11.0f)) * fE) + AndroidUtilities.dp(44.0f) + iDp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f11 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(fA, fA, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            jg.a aVar = this.f16335d0;
            if (aVar != null) {
                if (this.f34591f1 == null) {
                    lg.d dVarC = aVar.c(this, null, false);
                    dVarC.n(ng.c.i(this.f16329a));
                    dVarC.o(AndroidUtilities.dp(5.0f));
                    dVarC.p(AndroidUtilities.dp(16.0f));
                    this.f34591f1 = dVarC;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.f34591f1.setBounds(rect);
                this.f34591f1.draw(canvas);
            }
            int iDp2 = (int) (rectF2.left + AndroidUtilities.dp(9.0f));
            int iCenterY = (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f));
            int iDp3 = (int) (rectF2.left + AndroidUtilities.dp(29.0f));
            int iCenterY2 = (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f));
            Drawable drawable = this.f34588c1;
            drawable.setBounds(iDp2, iCenterY, iDp3, iCenterY2);
            drawable.draw(canvas);
            i6Var.l(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            i6Var.f29257w = (int) (fE * 255.0f);
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.f34587b1;
        y5 y5Var = this.f34593h1;
        nc ncVar = this.f34590e1;
        if (action == 0) {
            ncVar.c(y5Var.f34812c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (ncVar.h && (y5Var.f34812c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                ncVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && ncVar.h) {
            if (motionEvent.getAction() == 1) {
                A();
                this.f34589d1.q(LocaleController.getString(this instanceof org.telegram.ui.as0 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            ncVar.c(false);
            return true;
        }
        return ncVar.h || super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean f(View view) {
        return view != this.Z0;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.Q).captionLengthLimitDefault;
    }

    @Override
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.Q).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
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
        this.Z0.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i10)) - AndroidUtilities.dp(10.0f)) * (this instanceof org.telegram.ui.as0 ? -1.0f : 1.0f));
    }

    @Override
    public final void s(int i10, int i11) {
        CharSequence text = getText();
        F((i11 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.f34599o1) {
            if ((i10 < 3) != (i11 < 3)) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z10) {
        this.f34597m1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.P0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.f34598n1 = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        this.X0 = i10;
        this.S0.d(i10 == Integer.MAX_VALUE ? 1 : Math.max(1, i10), this.X0 > 0, true);
        lh.w3 w3Var = this.Z0;
        if (w3Var != null) {
            w3Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f34586a1;
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
    public void x(int i10) {
        boolean z10 = this.f16342i0;
        super.x(i10);
        if (z10 || !this.H.c()) {
            return;
        }
        B();
    }

    public final void z() {
        bg bgVar = this.l1;
        AndroidUtilities.cancelRunOnUIThread(bgVar);
        boolean zShouldShowMoveCaptionHint = MessagesController.getInstance(this.Q).shouldShowMoveCaptionHint();
        this.f34596k1 = zShouldShowMoveCaptionHint;
        if (zShouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.Q).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(bgVar, 5000L);
        }
    }
}
