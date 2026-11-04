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
public abstract class sc extends gi.m {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final gi.l W0;
    public f60 X0;
    public final org.telegram.ui.ActionBar.s2 Y0;
    public final ImageView Z0;
    public gi.l3 f37966a1;
    public int f37967b1;
    public final int[] f37968c1;
    public final gi.l3 f37969d1;
    public final Runnable f37970e1;
    public final RectF f37971f1;
    public final Drawable f37972g1;
    public final g6 f37973h1;
    public final gc f37974i1;
    public gh.g f37975j1;
    public final u5 k1;
    public final u5 f37976l1;
    public final u5 m1;
    public boolean f37977n1;
    public boolean f37978o1;
    public final vf f37979p1;
    public boolean f37980q1;
    public org.telegram.messenger.u10 f37981r1;
    public boolean f37982s1;

    public sc(Context context, FrameLayout frameLayout, qt0 qt0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.e6 e6Var, x9 x9Var, Runnable runnable) {
        super(context, frameLayout, qt0Var, frameLayout2, e6Var, x9Var);
        int i3;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        int i11;
        float f15;
        int i12;
        this.f37967b1 = 0;
        this.f37968c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f37971f1 = new RectF();
        g6 g6Var = new g6(false, false, false);
        this.f37973h1 = g6Var;
        this.f37974i1 = new gc(this);
        xq xqVar = xq.h;
        this.k1 = new u5(this, 0L, 350L, xqVar);
        this.f37976l1 = new u5(this, 0L, 350L, xqVar);
        this.m1 = new u5(this, 0L, 350L, xqVar);
        this.f37979p1 = new vf(this, 17);
        this.f37970e1 = runnable;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.M = org.telegram.messenger.g0.f22608q.x;
        g6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.ro0;
        if (z10) {
            g6Var.t(org.telegram.messenger.bd.M0(2131748333, null), true, true);
            this.f37972g1 = context.getResources().getDrawable(2131231839);
        } else {
            g6Var.t(org.telegram.messenger.bd.M0(2131748332, null), true, true);
            this.f37972g1 = context.getResources().getDrawable(2131231838);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231079);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        C(false);
        if (z10) {
            i3 = 48;
        } else {
            i3 = 80;
        }
        int i13 = i3 | 3;
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
        addView(imageView, b8.mf.d(44, 44.0f, i13, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        gi.l lVar = new gi.l(5);
        this.W0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
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
        addView(imageView2, b8.mf.d(44, 44.0f, i14, 0.0f, f13, 10.0f, f14));
        if (z10) {
            i11 = 1;
        } else {
            i11 = 3;
        }
        gi.l3 l3Var = new gi.l3(context, i11);
        this.f37969d1 = l3Var;
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
        addView(l3Var, b8.mf.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(context);
        this.Y0 = s2Var;
        imageView3.setImageDrawable(s2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, b8.mf.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView3);
        this.f13144f.getEditText().addTextChangedListener(new bh.h(this, 14));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f16);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new f0(this, 5));
        imageView2.setOnClickListener(new q2(5, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z10) {
        int i3;
        float f10;
        this.S0 = z10;
        ImageView imageView = this.T0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
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
        gi.g gVar = this.f13144f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.f13154o0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.S0 && this.U0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z10, boolean z11) {
        if (this.f37977n1 == z10 && z11) {
            return;
        }
        this.f37977n1 = z10;
        if (!z11) {
            this.f37976l1.f(z10, true);
        }
        invalidate();
    }

    public final void E(boolean z10, boolean z11) {
        int i3;
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
            alpha.translationX(f11).withEndAction(new rc(this, z10, 1)).start();
        } else {
            if (z10) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            if (!z10) {
                f10 = 0.0f;
            }
            imageView.setAlpha(f10);
            if (!z10) {
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            imageView.setTranslationX(f11);
        }
        gi.g gVar = this.f13144f;
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
        if (this.f37982s1 != z10) {
            if (z10) {
                org.telegram.messenger.hp.s1(this.V).R1().b();
            }
            this.f37982s1 = z10;
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
            scaleX.scaleY(f12).setInterpolator(xq.h).setDuration(420L).withEndAction(new rc(this, z10, 0)).start();
            if (z10) {
                org.telegram.ui.ActionBar.s2 s2Var = this.Y0;
                Objects.requireNonNull(s2Var);
                imageView.postDelayed(new h0(s2Var, 1), 220L);
                gi.l3 l3Var = this.f37966a1;
                if (l3Var != null) {
                    l3Var.f(true);
                    this.f37966a1 = null;
                }
                if (org.telegram.messenger.hp.e1().getInt("aihintshown", 0) < 3) {
                    gi.l3 l3Var2 = new gi.l3(getContext(), 3);
                    this.f37966a1 = l3Var2;
                    l3Var2.r(true);
                    this.f37966a1.u(org.telegram.messenger.bd.M0(2131754992, null));
                    this.f37966a1.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.f37966a1, b8.mf.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    gi.l3 l3Var3 = this.f37966a1;
                    l3Var3.f13100r0 = new org.telegram.ui.lo(10, this, l3Var2);
                    l3Var3.d = 4000L;
                    l3Var3.w();
                    org.telegram.messenger.hp.e1().edit().putInt("aihintshown", org.telegram.messenger.hp.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            gi.l3 l3Var4 = this.f37966a1;
            if (l3Var4 != null) {
                l3Var4.f(true);
                this.f37966a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f13135a = e6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f28071ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        xp xpVar = this.f13152n;
        xpVar.f40438a = L2;
        xpVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z10) {
        int i3;
        int i10 = 0;
        if (!z10 && this.U0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        ImageView imageView = this.V0;
        imageView.setVisibility(i3);
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
        int i3;
        if (!z10) {
            int i10 = 8;
            if (this.U0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            this.V0.setVisibility(i3);
            if (this.S0) {
                i10 = 0;
            }
            this.T0.setVisibility(i10);
        }
        gi.l3 l3Var = this.f37969d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        super.dispatchDraw(canvas);
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.f13154o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.ro0;
            if (z10) {
                f11 = rectF.bottom - org.telegram.messenger.g0.L(44.0f);
            } else {
                f11 = rectF.top;
            }
            if (z10) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.k1.e(false, this.f13144f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * i3) + f11);
        }
        float f12 = this.f37976l1.f(this.f37977n1, true ^ G());
        float d = this.m1.d(this.f37978o1);
        if (f12 > 0.0f) {
            float a10 = this.f37974i1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.f13154o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.ro0;
            g6 g6Var = this.f37973h1;
            RectF rectF2 = this.f37971f1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.camera.q.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.camera.q.b(g6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            eh.c cVar = this.f13147h0;
            if (cVar != null) {
                if (this.f37975j1 == null) {
                    gh.g c2 = cVar.c(this, null, false);
                    c2.p(b8.cd.i(this.f13135a));
                    c2.q(org.telegram.messenger.g0.L(5.0f));
                    c2.r(org.telegram.messenger.g0.L(16.0f));
                    this.f37975j1 = c2;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.f37975j1.setBounds(rect);
                this.f37975j1.draw(canvas);
            }
            Drawable drawable = this.f37972g1;
            drawable.setBounds((int) (rectF2.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f)), (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f)));
            drawable.draw(canvas);
            g6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            g6Var.B = (int) (d * 255.0f);
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i3;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f37971f1;
        u5 u5Var = this.f37976l1;
        gc gcVar = this.f37974i1;
        if (action == 0) {
            if (u5Var.f38645c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            gcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (gcVar.f34049i && (u5Var.f38645c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                gcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && gcVar.f34049i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.ro0) {
                    i3 = 2131748333;
                } else {
                    i3 = 2131748332;
                }
                this.f37973h1.t(org.telegram.messenger.bd.M0(i3, null), true, true);
            }
            gcVar.c(false);
            return true;
        }
        if (!gcVar.f34049i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f37969d1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.hp.s1(this.V).T4;
    }

    @Override
    public int getCaptionLimit() {
        if (org.telegram.messenger.h10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.hp.s1(this.V).U4;
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
    public final void r(int i3) {
        float f10;
        float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), i3)) - org.telegram.messenger.g0.L(10.0f);
        if (this instanceof org.telegram.ui.ro0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f37969d1.setTranslationY(L * f10);
    }

    @Override
    public final void s(int i3, int i10) {
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
        if (this.f37982s1) {
            if (i3 < 3) {
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
        this.f37980q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.u10 u10Var) {
        this.f37981r1 = u10Var;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i3) {
        int max;
        boolean z10;
        this.f37967b1 = i3;
        if (i3 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i3);
        }
        if (this.f37967b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        gi.l3 l3Var = this.f37969d1;
        if (l3Var != null) {
            l3Var.f(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f37970e1;
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
    public void x(int i3) {
        boolean z10 = this.m0;
        super.x(i3);
        if (!z10 && this.M.c()) {
            B();
        }
    }

    public final void z() {
        boolean z10;
        vf vfVar = this.f37979p1;
        org.telegram.messenger.g0.r(vfVar);
        if (org.telegram.messenger.hp.s1(this.V).f22999e7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.r2.f25040a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.f37978o1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.V).f22999e7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.i3(vfVar, 5000L);
        }
    }
}
