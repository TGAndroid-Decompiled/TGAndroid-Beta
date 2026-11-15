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
public abstract class pc extends hi.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final hi.l W0;
    public m60 X0;
    public final org.telegram.ui.ActionBar.t2 Y0;
    public final ImageView Z0;
    public hi.l3 f38264a1;
    public int f38265b1;
    public final int[] f38266c1;
    public final hi.l3 f38267d1;
    public final Runnable f38268e1;
    public final RectF f38269f1;
    public final Drawable f38270g1;
    public final g6 f38271h1;
    public final dc f38272i1;
    public fh.g f38273j1;
    public final u5 f38274k1;
    public final u5 l1;
    public final u5 f38275m1;
    public boolean n1;
    public boolean f38276o1;
    public final dg f38277p1;
    public boolean f38278q1;
    public org.telegram.messenger.z10 f38279r1;
    public boolean f38280s1;

    public pc(Context context, FrameLayout frameLayout, st0 st0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, u9 u9Var, Runnable runnable) {
        super(context, frameLayout, st0Var, frameLayout2, e6Var, u9Var);
        int i7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        float f15;
        int i12;
        this.f38265b1 = 0;
        this.f38266c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f38269f1 = new RectF();
        g6 g6Var = new g6(false, false, false);
        this.f38271h1 = g6Var;
        this.f38272i1 = new dc(this);
        er erVar = er.h;
        this.f38274k1 = new u5(this, 0L, 350L, erVar);
        this.l1 = new u5(this, 0L, 350L, erVar);
        this.f38275m1 = new u5(this, 0L, 350L, erVar);
        this.f38277p1 = new dg(this, 17);
        this.f38268e1 = runnable;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.N = org.telegram.messenger.g0.f23611q.x;
        g6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.yo0;
        if (z10) {
            g6Var.t(org.telegram.messenger.hd.M0(2131748325, null), true, true);
            this.f38270g1 = context.getResources().getDrawable(2131231839);
        } else {
            g6Var.t(org.telegram.messenger.hd.M0(2131748324, null), true, true);
            this.f38270g1 = context.getResources().getDrawable(2131231838);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231079);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        C(false);
        if (z10) {
            i7 = 48;
        } else {
            i7 = 80;
        }
        int i13 = i7 | 3;
        if (z10) {
            f10 = 6.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
            f12 = 0.0f;
        }
        float f16 = f12;
        addView(imageView, c8.ja.d(44, 44.0f, i13, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        hi.l lVar = new hi.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i14 = i10 | 5;
        if (z10) {
            f13 = 6.0f;
        } else {
            f13 = f16;
        }
        if (z10) {
            f14 = f16;
        } else {
            f14 = 6.0f;
        }
        addView(imageView2, c8.ja.d(44, 44.0f, i14, 0.0f, f13, 10.0f, f14));
        if (z10) {
            i11 = 1;
        } else {
            i11 = 3;
        }
        hi.l3 l3Var = new hi.l3(context, i11);
        this.f38267d1 = l3Var;
        l3Var.s(12.0f);
        int L = org.telegram.messenger.g0.L(12.0f);
        if (z10) {
            f15 = 8.0f;
        } else {
            f15 = f16;
        }
        l3Var.setPadding(L, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z10 ? f16 : 8.0f));
        l3Var.o(1.0f, -21.0f);
        l3Var.r(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(l3Var, c8.ja.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(context);
        this.Y0 = t2Var;
        imageView3.setImageDrawable(t2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, c8.ja.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView3);
        this.f14623f.getEditText().addTextChangedListener(new ah.j(this, 16));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f16);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new e0(this, 5));
        imageView2.setOnClickListener(new n2(6, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i7;
        float f10;
        this.S0 = z10;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        float f11 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView.setAlpha(f10);
        if (!z10) {
            f11 = org.telegram.messenger.g0.L(-8.0f);
        }
        imageView.setTranslationX(f11);
        hi.g gVar = this.f14623f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.f14633o0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.n1 == z10 && z11) {
            return;
        }
        this.n1 = z10;
        if (!z11) {
            this.l1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i7;
        this.U0 = z10;
        ImageView imageView = this.V0;
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
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha.translationX(f11).withEndAction(new oc(this, z10, 1)).start();
        } else {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
            if (!z10) {
                f10 = 0.0f;
            }
            imageView.setAlpha(f10);
            if (!z10) {
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            imageView.setTranslationX(f11);
        }
        hi.g gVar = this.f14623f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z10) {
        float f10;
        float f11;
        if (this.f38280s1 != z10) {
            if (z10) {
                org.telegram.messenger.np.s1(this.V).R1().b();
            }
            this.f38280s1 = z10;
            ImageView imageView = this.Z0;
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
            scaleX.scaleY(f12).setInterpolator(er.h).setDuration(420L).withEndAction(new oc(this, z10, 0)).start();
            if (z10) {
                org.telegram.ui.ActionBar.t2 t2Var = this.Y0;
                Objects.requireNonNull(t2Var);
                imageView.postDelayed(new g0(t2Var, 1), 220L);
                hi.l3 l3Var = this.f38264a1;
                if (l3Var != null) {
                    l3Var.f(true);
                    this.f38264a1 = null;
                }
                if (org.telegram.messenger.np.e1().getInt("aihintshown", 0) < 3) {
                    hi.l3 l3Var2 = new hi.l3(getContext(), 3);
                    this.f38264a1 = l3Var2;
                    l3Var2.r(true);
                    this.f38264a1.u(org.telegram.messenger.hd.M0(2131754992, null));
                    this.f38264a1.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.f38264a1, c8.ja.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.l3 l3Var3 = this.f38264a1;
                    l3Var3.f14570r0 = new org.telegram.ui.zg(24, this, l3Var2);
                    l3Var3.d = 4000L;
                    l3Var3.w();
                    org.telegram.messenger.np.e1().edit().putInt("aihintshown", org.telegram.messenger.np.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hi.l3 l3Var4 = this.f38264a1;
            if (l3Var4 != null) {
                l3Var4.f(true);
                this.f38264a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f14614a = e6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f29098qg;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        fq fqVar = this.f14631n;
        fqVar.f34673a = L2;
        fqVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i7;
        int i10 = 0;
        if (!z10 && this.U0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.V0;
        imageView.setVisibility(i7);
        if (z10 || !this.S0) {
            i10 = 8;
        }
        ImageView imageView2 = this.T0;
        imageView2.setVisibility(i10);
        if (z10) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z10) {
        int i7;
        if (!z10) {
            int i10 = 8;
            if (this.U0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.V0.setVisibility(i7);
            if (this.S0) {
                i10 = 0;
            }
            this.T0.setVisibility(i10);
        }
        hi.l3 l3Var = this.f38267d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.f14633o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.yo0;
            if (z10) {
                f11 = rectF.bottom - org.telegram.messenger.g0.L(44.0f);
            } else {
                f11 = rectF.top;
            }
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.f38274k1.e(false, this.f14623f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * i7) + f11);
        }
        float f12 = this.l1.f(this.n1, true ^ G());
        float d = this.f38275m1.d(this.f38276o1);
        if (f12 > 0.0f) {
            float a10 = this.f38272i1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.f14633o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.yo0;
            g6 g6Var = this.f38271h1;
            RectF rectF2 = this.f38269f1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.i20.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.i20.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            dh.c cVar = this.f14626h0;
            if (cVar != null) {
                if (this.f38273j1 == null) {
                    fh.g c10 = cVar.c(this, null, false);
                    c10.p(c8.g0.i(this.f14614a));
                    c10.q(org.telegram.messenger.g0.L(5.0f));
                    c10.r(org.telegram.messenger.g0.L(16.0f));
                    this.f38273j1 = c10;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.f38273j1.setBounds(rect);
                this.f38273j1.draw(canvas);
            }
            Drawable drawable = this.f38270g1;
            drawable.setBounds((int) (rectF2.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f)), (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f)));
            drawable.draw(canvas);
            g6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            g6Var.C = (int) (d * 255.0f);
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f38269f1;
        u5 u5Var = this.l1;
        dc dcVar = this.f38272i1;
        if (action == 0) {
            if (u5Var.f39900c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            dcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (dcVar.f33904i && (u5Var.f39900c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                dcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && dcVar.f33904i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.yo0) {
                    i7 = 2131748325;
                } else {
                    i7 = 2131748324;
                }
                this.f38271h1.t(org.telegram.messenger.hd.M0(i7, null), true, true);
            }
            dcVar.c(false);
            return true;
        }
        if (!dcVar.f33904i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f38267d1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.np.s1(this.V).U4;
    }

    @Override
    public int getCaptionLimit() {
        if (org.telegram.messenger.m10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.np.s1(this.V).V4;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.S0) {
            return org.telegram.messenger.g0.L(31.0f);
        }
        return 0;
    }

    @Override
    public int getEditTextStyle() {
        return 3;
    }

    @Override
    public final void r(int i7) {
        float f10;
        float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), i7)) - org.telegram.messenger.g0.L(10.0f);
        if (this instanceof org.telegram.ui.yo0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f38267d1.setTranslationY(L * f10);
    }

    @Override
    public final void s(int i7, int i10) {
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
        if (this.f38280s1) {
            if (i7 < 3) {
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
        this.f38278q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.z10 z10Var) {
        this.f38279r1 = z10Var;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i7) {
        int max;
        boolean z10;
        this.f38265b1 = i7;
        if (i7 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i7);
        }
        if (this.f38265b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        hi.l3 l3Var = this.f38267d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f38268e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.V0.setAlpha(f11);
        this.T0.setAlpha(f11);
    }

    @Override
    public void x(int i7) {
        boolean z10 = this.m0;
        super.x(i7);
        if (!z10 && this.M.c()) {
            B();
        }
    }

    public final void z() {
        boolean z10;
        dg dgVar = this.f38277p1;
        org.telegram.messenger.g0.r(dgVar);
        if (org.telegram.messenger.np.s1(this.V).f25283f7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.r2.f26206a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.f38276o1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.V).f25283f7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.i3(dgVar, 5000L);
        }
    }
}
