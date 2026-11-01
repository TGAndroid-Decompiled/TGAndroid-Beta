package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.messenger.Utilities;
public abstract class nc extends vh.k {
    public boolean R0;
    public final ImageView S0;
    public boolean T0;
    public final ImageView U0;
    public final vh.j V0;
    public z60 W0;
    public final org.telegram.ui.ActionBar.y2 X0;
    public final ImageView Y0;
    public vh.p2 Z0;
    public int f28772a1;
    public final int[] f28773b1;
    public final vh.p2 f28774c1;
    public final Runnable f28775d1;
    public final RectF f28776e1;
    public final Drawable f28777f1;
    public final e6 f28778g1;
    public final dc f28779h1;
    public vg.f f28780i1;
    public final t5 f28781j1;
    public final t5 f28782k1;
    public final t5 l1;
    public boolean f28783m1;
    public boolean f28784n1;
    public final tf f28785o1;
    public boolean f28786p1;
    public org.telegram.messenger.r20 f28787q1;
    public boolean f28788r1;

    public nc(Context context, FrameLayout frameLayout, vu0 vu0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var, Runnable runnable) {
        super(context, frameLayout, vu0Var, frameLayout2, p6Var, s9Var);
        int i10;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        float f14;
        int i13;
        this.f28772a1 = 0;
        this.f28773b1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f28776e1 = new RectF();
        e6 e6Var = new e6(false, false, false);
        this.f28778g1 = e6Var;
        this.f28779h1 = new dc(this);
        gr grVar = gr.h;
        this.f28781j1 = new t5(this, 0L, 350L, grVar);
        this.f28782k1 = new t5(this, 0L, 350L, grVar);
        this.l1 = new t5(this, 0L, 350L, grVar);
        this.f28785o1 = new tf(this, 18);
        this.f28775d1 = runnable;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.M = org.telegram.messenger.i0.f16172q.x;
        e6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.iq0;
        if (z10) {
            e6Var.t(org.telegram.messenger.dd.L0(2131748340, null), true, true);
            this.f28777f1 = context.getResources().getDrawable(2131231838);
        } else {
            e6Var.t(org.telegram.messenger.dd.L0(2131748339, null), true, true);
            this.f28777f1 = context.getResources().getDrawable(2131231837);
        }
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(2131231079);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        C(false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i14 = i10 | 3;
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
        addView(imageView, w7.b6.d(44, 44.0f, i14, 14.0f, f7, 0.0f, f10));
        ImageView imageView2 = new ImageView(context);
        this.U0 = imageView2;
        vh.j jVar = new vh.j(5);
        this.V0 = jVar;
        imageView2.setImageDrawable(jVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i11 = 48;
        } else {
            i11 = 80;
        }
        int i15 = i11 | 5;
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
        addView(imageView2, w7.b6.d(44, 44.0f, i15, 0.0f, f12, 10.0f, f13));
        if (z10) {
            i12 = 1;
        } else {
            i12 = 3;
        }
        vh.p2 p2Var = new vh.p2(context, i12);
        this.f28774c1 = p2Var;
        p2Var.q(12.0f);
        int L = org.telegram.messenger.i0.L(12.0f);
        if (z10) {
            f14 = 8.0f;
        } else {
            f14 = f15;
        }
        p2Var.setPadding(L, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(z10 ? f15 : 8.0f));
        p2Var.l(1.0f, -21.0f);
        p2Var.p(true);
        if (z10) {
            i13 = 48;
        } else {
            i13 = 80;
        }
        addView(p2Var, w7.b6.e(-1, 80, i13 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Y0 = imageView3;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(context);
        this.X0 = y2Var;
        imageView3.setImageDrawable(y2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(1090519039, 1, org.telegram.messenger.i0.L(16.0f)));
        addView(imageView3, w7.b6.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.dd.L0(2131755006, null));
        w7.e6.a(imageView3);
        this.f51355f.getEditText().addTextChangedListener(new ag.a1(this, 9));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f15);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new h0(this, 5));
        imageView2.setOnClickListener(new org.telegram.ui.ud(21, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i10;
        float f7;
        this.R0 = z10;
        ImageView imageView = this.S0;
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
            f10 = org.telegram.messenger.i0.L(-8.0f);
        }
        imageView.setTranslationX(f10);
        vh.f fVar = this.f51355f;
        fVar.getEditText().setTranslationX(org.telegram.messenger.i0.W1(this.f51364n0, getEditTextLeft() + org.telegram.messenger.i0.L(-26.0f), org.telegram.messenger.i0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(32 + i11);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f28783m1 == z10 && z11) {
            return;
        }
        this.f28783m1 = z10;
        if (!z11) {
            this.f28782k1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i10;
        this.T0 = z10;
        ImageView imageView = this.U0;
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
                f10 = org.telegram.messenger.i0.L(8.0f);
            }
            alpha.translationX(f10).withEndAction(new mc(this, z10, 1)).start();
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
                f10 = org.telegram.messenger.i0.L(8.0f);
            }
            imageView.setTranslationX(f10);
        }
        vh.f fVar = this.f51355f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i11 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(32 + i11);
        fVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f7;
        float f10;
        if (this.f28788r1 != z10) {
            if (z10) {
                org.telegram.messenger.wp.r1(this.U).Q1().b();
            }
            this.f28788r1 = z10;
            ImageView imageView = this.Y0;
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
            scaleX.scaleY(f11).setInterpolator(gr.h).setDuration(420L).withEndAction(new mc(this, z10, 0)).start();
            if (z10) {
                org.telegram.ui.ActionBar.y2 y2Var = this.X0;
                Objects.requireNonNull(y2Var);
                imageView.postDelayed(new j0(y2Var, 1), 220L);
                vh.p2 p2Var = this.Z0;
                if (p2Var != null) {
                    p2Var.e(true);
                    this.Z0 = null;
                }
                if (org.telegram.messenger.wp.d1().getInt("aihintshown", 0) < 3) {
                    vh.p2 p2Var2 = new vh.p2(getContext(), 3);
                    this.Z0 = p2Var2;
                    p2Var2.p(true);
                    this.Z0.s(org.telegram.messenger.dd.L0(2131754992, null));
                    this.Z0.m(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.i0.L(4.0f));
                    addView(this.Z0, w7.b6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    vh.p2 p2Var3 = this.Z0;
                    p2Var3.f51755l0 = new org.telegram.ui.ch(29, this, p2Var2);
                    p2Var3.d = 4000L;
                    p2Var3.u();
                    org.telegram.messenger.wp.d1().edit().putInt("aihintshown", org.telegram.messenger.wp.d1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            vh.p2 p2Var4 = this.Z0;
            if (p2Var4 != null) {
                p2Var4.e(true);
                this.Z0 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f51347a = p6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21126ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        eq eqVar = this.f51363n;
        eqVar.f25901a = L2;
        eqVar.invalidateSelf();
        this.V0.e(-1, org.telegram.ui.ActionBar.t6.w0(i10, p6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i10;
        int i11 = 0;
        if (!z10 && this.T0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ImageView imageView = this.U0;
        imageView.setVisibility(i10);
        if (z10 || !this.R0) {
            i11 = 8;
        }
        ImageView imageView2 = this.S0;
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
            if (this.T0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.U0.setVisibility(i10);
            if (this.R0) {
                i11 = 0;
            }
            this.S0.setVisibility(i11);
        }
        vh.p2 p2Var = this.f28774c1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        super.dispatchDraw(canvas);
        RectF rectF = this.f51381z0;
        ImageView imageView = this.Y0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.i0.L((1.0f - this.f51364n0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.iq0;
            if (z10) {
                f10 = rectF.bottom - org.telegram.messenger.i0.L(44.0f);
            } else {
                f10 = rectF.top;
            }
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.f28781j1.e(false, this.f51355f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.i0.L(3.0f) * i10) + f10);
        }
        float f11 = this.f28782k1.f(this.f28783m1, true ^ G());
        float d = this.l1.d(this.f28784n1);
        if (f11 > 0.0f) {
            float a2 = this.f28779h1.a(0.03f);
            int L = org.telegram.messenger.i0.L((1.0f - this.f51364n0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.iq0;
            e6 e6Var = this.f28778g1;
            RectF rectF2 = this.f28776e1;
            if (z11) {
                f7 = 1.0f;
                rectF2.set(org.telegram.messenger.i0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.a30.b(e6Var.c(), org.telegram.messenger.i0.L(11.0f), d, org.telegram.messenger.i0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.i0.L(42.0f));
            } else {
                f7 = 1.0f;
                rectF2.set(org.telegram.messenger.i0.L(7.0f) + L, rectF.top - org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.a30.b(e6Var.c(), org.telegram.messenger.i0.L(11.0f), d, org.telegram.messenger.i0.L(44.0f) + L), rectF.top - org.telegram.messenger.i0.L(10.0f));
            }
            if (f11 < f7) {
                canvas.saveLayerAlpha(rectF2, (int) (f11 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            tg.b bVar = this.f51357g0;
            if (bVar != null) {
                if (this.f28780i1 == null) {
                    vg.f c10 = bVar.c(this, null, false);
                    c10.o(w7.b9.i(this.f51347a));
                    c10.p(org.telegram.messenger.i0.L(5.0f));
                    c10.q(org.telegram.messenger.i0.L(16.0f));
                    this.f28780i1 = c10;
                }
                Rect rect = org.telegram.messenger.i0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(5.0f), -org.telegram.messenger.i0.L(5.0f));
                this.f28780i1.setBounds(rect);
                this.f28780i1.draw(canvas);
            }
            Drawable drawable = this.f28777f1;
            drawable.setBounds((int) (rectF2.left + org.telegram.messenger.i0.L(9.0f)), (int) (rectF2.centerY() - org.telegram.messenger.i0.L(10.0f)), (int) (rectF2.left + org.telegram.messenger.i0.L(29.0f)), (int) (rectF2.centerY() + org.telegram.messenger.i0.L(10.0f)));
            drawable.draw(canvas);
            e6Var.o(rectF2.left + org.telegram.messenger.i0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            e6Var.B = (int) (d * 255.0f);
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f28776e1;
        t5 t5Var = this.f28782k1;
        dc dcVar = this.f28779h1;
        if (action == 0) {
            if (t5Var.f30530c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (dcVar.f25465i && (t5Var.f30530c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                dcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && dcVar.f25465i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.iq0) {
                    i10 = 2131748340;
                } else {
                    i10 = 2131748339;
                }
                this.f28778g1.t(org.telegram.messenger.dd.L0(i10, null), true, true);
            }
            dcVar.c(false);
            return true;
        }
        if (!dcVar.f25465i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f28774c1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.wp.r1(this.U).U4;
    }

    @Override
    public int getCaptionLimit() {
        if (org.telegram.messenger.e20.i(this.U).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.wp.r1(this.U).V4;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.R0) {
            return org.telegram.messenger.i0.L(31.0f);
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
        float L = (-Math.min(org.telegram.messenger.i0.L(34.0f), i10)) - org.telegram.messenger.i0.L(10.0f);
        if (this instanceof org.telegram.ui.iq0) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        this.f28774c1.setTranslationY(L * f7);
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
        if (this.f28788r1) {
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
        this.f28786p1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.S0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.r20 r20Var) {
        this.f28787q1 = r20Var;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i10) {
        int max;
        boolean z10;
        this.f28772a1 = i10;
        if (i10 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i10);
        }
        if (this.f28772a1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V0.d(max, z10, true);
        vh.p2 p2Var = this.f28774c1;
        if (p2Var != null) {
            p2Var.e(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f28775d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f7) {
        float f10 = 1.0f - f7;
        this.U0.setAlpha(f10);
        this.S0.setAlpha(f10);
    }

    @Override
    public void x(int i10) {
        boolean z10 = this.f51362l0;
        super.x(i10);
        if (!z10 && this.L.c()) {
            B();
        }
    }

    public final void z() {
        boolean z10;
        tf tfVar = this.f28785o1;
        org.telegram.messenger.i0.r(tfVar);
        if (org.telegram.messenger.wp.r1(this.U).f7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.v2.f18578a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.f28784n1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(this.U).f7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.i0.h3(tfVar, 5000L);
        }
    }
}
