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
public abstract class tc extends fi.m {
    public boolean R0;
    public final ImageView S0;
    public boolean T0;
    public final ImageView U0;
    public final fi.l V0;
    public k60 W0;
    public final org.telegram.ui.ActionBar.v2 X0;
    public final ImageView Y0;
    public fi.m3 Z0;
    public int f38272a1;
    public final int[] f38273b1;
    public final fi.m3 f38274c1;
    public final Runnable f38275d1;
    public final RectF f38276e1;
    public final Drawable f38277f1;
    public final h6 f38278g1;
    public final hc f38279h1;
    public fh.g f38280i1;
    public final v5 f38281j1;
    public final v5 f38282k1;
    public final v5 l1;
    public boolean f38283m1;
    public boolean n1;
    public final wf f38284o1;
    public boolean f38285p1;
    public org.telegram.messenger.c20 f38286q1;
    public boolean f38287r1;

    public tc(Context context, FrameLayout frameLayout, st0 st0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.h6 h6Var, x9 x9Var, Runnable runnable) {
        super(context, frameLayout, st0Var, frameLayout2, h6Var, x9Var);
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
        this.f38272a1 = 0;
        this.f38273b1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f38276e1 = new RectF();
        h6 h6Var2 = new h6(false, false, false);
        this.f38278g1 = h6Var2;
        this.f38279h1 = new hc(this);
        wq wqVar = wq.h;
        this.f38281j1 = new v5(this, 0L, 350L, wqVar);
        this.f38282k1 = new v5(this, 0L, 350L, wqVar);
        this.l1 = new v5(this, 0L, 350L, wqVar);
        this.f38284o1 = new wf(this, 17);
        this.f38275d1 = runnable;
        h6Var2.w(org.telegram.messenger.g0.L(14.0f));
        h6Var2.M = org.telegram.messenger.g0.f22567q.x;
        h6Var2.u(-1);
        boolean z9 = this instanceof org.telegram.ui.dp0;
        if (z9) {
            h6Var2.t(org.telegram.messenger.id.M0(2131748325, null), true, true);
            this.f38277f1 = context.getResources().getDrawable(2131231839);
        } else {
            h6Var2.t(org.telegram.messenger.id.M0(2131748324, null), true, true);
            this.f38277f1 = context.getResources().getDrawable(2131231838);
        }
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(2131231079);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        C(false);
        if (z9) {
            i7 = 48;
        } else {
            i7 = 80;
        }
        int i13 = i7 | 3;
        if (z9) {
            f10 = 6.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
            f12 = 0.0f;
        }
        float f16 = f12;
        addView(imageView, c8.ha.d(44, 44.0f, i13, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.U0 = imageView2;
        fi.l lVar = new fi.l(5);
        this.V0 = lVar;
        imageView2.setImageDrawable(lVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z9) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i14 = i10 | 5;
        if (z9) {
            f13 = 6.0f;
        } else {
            f13 = f16;
        }
        if (z9) {
            f14 = f16;
        } else {
            f14 = 6.0f;
        }
        addView(imageView2, c8.ha.d(44, 44.0f, i14, 0.0f, f13, 10.0f, f14));
        if (z9) {
            i11 = 1;
        } else {
            i11 = 3;
        }
        fi.m3 m3Var = new fi.m3(context, i11);
        this.f38274c1 = m3Var;
        m3Var.s(12.0f);
        int L = org.telegram.messenger.g0.L(12.0f);
        if (z9) {
            f15 = 8.0f;
        } else {
            f15 = f16;
        }
        m3Var.setPadding(L, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z9 ? f16 : 8.0f));
        m3Var.o(1.0f, -21.0f);
        m3Var.r(true);
        if (z9) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(m3Var, c8.ha.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Y0 = imageView3;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
        this.X0 = v2Var;
        imageView3.setImageDrawable(v2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, c8.ha.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131755006, null));
        c8.ka.a(imageView3);
        this.f12367f.getEditText().addTextChangedListener(new ah.j(this, 14));
        imageView3.setVisibility(8);
        imageView3.setAlpha(f16);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new g0(this, 5));
        imageView2.setOnClickListener(new org.telegram.ui.ActionBar.l1(29, this, frameLayout));
    }

    public abstract void A();

    public abstract void B();

    public final void C(boolean z9) {
        int i7;
        float f10;
        this.R0 = z9;
        ImageView imageView = this.S0;
        imageView.animate().cancel();
        int i10 = 0;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        float f11 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView.setAlpha(f10);
        if (!z9) {
            f11 = org.telegram.messenger.g0.L(-8.0f);
        }
        imageView.setTranslationX(f11);
        fi.g gVar = this.f12367f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.f12376n0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void D(boolean z9, boolean z10) {
        if (this.f38283m1 == z9 && z10) {
            return;
        }
        this.f38283m1 = z9;
        if (!z10) {
            this.f38282k1.f(z9, true);
        }
        invalidate();
    }

    public final void E(boolean z9, boolean z10) {
        int i7;
        this.T0 = z9;
        ImageView imageView = this.U0;
        imageView.animate().cancel();
        float f10 = 1.0f;
        int i10 = 0;
        float f11 = 0.0f;
        if (z10) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (!z9) {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z9) {
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha.translationX(f11).withEndAction(new sc(this, z9, 1)).start();
        } else {
            if (z9) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
            if (!z9) {
                f10 = 0.0f;
            }
            imageView.setAlpha(f10);
            if (!z9) {
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            imageView.setTranslationX(f11);
        }
        fi.g gVar = this.f12367f;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.getLayoutParams();
        if (this.R0 && this.T0) {
            i10 = 33;
        }
        marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(32 + i10);
        gVar.setLayoutParams(marginLayoutParams);
    }

    public final void F(boolean z9) {
        float f10;
        float f11;
        if (this.f38287r1 != z9) {
            if (z9) {
                org.telegram.messenger.qp.s1(this.U).R1().b();
            }
            this.f38287r1 = z9;
            ImageView imageView = this.Y0;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f12 = 0.6f;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (z9) {
                f12 = 1.0f;
            }
            scaleX.scaleY(f12).setInterpolator(wq.h).setDuration(420L).withEndAction(new sc(this, z9, 0)).start();
            if (z9) {
                org.telegram.ui.ActionBar.v2 v2Var = this.X0;
                Objects.requireNonNull(v2Var);
                imageView.postDelayed(new i0(v2Var, 1), 220L);
                fi.m3 m3Var = this.Z0;
                if (m3Var != null) {
                    m3Var.f(true);
                    this.Z0 = null;
                }
                if (org.telegram.messenger.qp.e1().getInt("aihintshown", 0) < 3) {
                    fi.m3 m3Var2 = new fi.m3(getContext(), 3);
                    this.Z0 = m3Var2;
                    m3Var2.r(true);
                    this.Z0.u(org.telegram.messenger.id.M0(2131754992, null));
                    this.Z0.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.Z0, c8.ha.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    fi.m3 m3Var3 = this.Z0;
                    m3Var3.f12438q0 = new org.telegram.ui.fq(6, this, m3Var2);
                    m3Var3.d = 4000L;
                    m3Var3.w();
                    org.telegram.messenger.qp.e1().edit().putInt("aihintshown", org.telegram.messenger.qp.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            fi.m3 m3Var4 = this.Z0;
            if (m3Var4 != null) {
                m3Var4.f(true);
                this.Z0 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f12358a = h6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f28081ng;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        xp xpVar = this.f12375n;
        xpVar.f40374a = L2;
        xpVar.invalidateSelf();
        this.V0.e(-1, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), -1);
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void c(boolean z9) {
        int i7;
        int i10 = 0;
        if (!z9 && this.T0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        ImageView imageView = this.U0;
        imageView.setVisibility(i7);
        if (z9 || !this.R0) {
            i10 = 8;
        }
        ImageView imageView2 = this.S0;
        imageView2.setVisibility(i10);
        if (z9) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void d(boolean z9) {
        int i7;
        if (!z9) {
            int i10 = 8;
            if (this.T0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            this.U0.setVisibility(i7);
            if (this.R0) {
                i10 = 0;
            }
            this.S0.setVisibility(i10);
        }
        fi.m3 m3Var = this.f38274c1;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        super.dispatchDraw(canvas);
        RectF rectF = this.f12393z0;
        ImageView imageView = this.Y0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.f12376n0) * 4.0f));
            boolean z9 = this instanceof org.telegram.ui.dp0;
            if (z9) {
                f11 = rectF.bottom - org.telegram.messenger.g0.L(44.0f);
            } else {
                f11 = rectF.top;
            }
            if (z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            imageView.setTranslationY((Utilities.l((-this.f38281j1.e(false, this.f12367f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * i7) + f11);
        }
        float f12 = this.f38282k1.f(this.f38283m1, true ^ G());
        float d = this.l1.d(this.n1);
        if (f12 > 0.0f) {
            float a10 = this.f38279h1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.f12376n0) * 4.0f);
            boolean z10 = this instanceof org.telegram.ui.dp0;
            h6 h6Var = this.f38278g1;
            RectF rectF2 = this.f38276e1;
            if (z10) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.camera.q.b(h6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.camera.q.b(h6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            dh.c cVar = this.f12369g0;
            if (cVar != null) {
                if (this.f38280i1 == null) {
                    fh.g c10 = cVar.c(this, null, false);
                    c10.p(c8.g0.i(this.f12358a));
                    c10.q(org.telegram.messenger.g0.L(5.0f));
                    c10.r(org.telegram.messenger.g0.L(16.0f));
                    this.f38280i1 = c10;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.f38280i1.setBounds(rect);
                this.f38280i1.draw(canvas);
            }
            Drawable drawable = this.f38277f1;
            drawable.setBounds((int) (rectF2.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f)), (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f)));
            drawable.draw(canvas);
            h6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            h6Var.B = (int) (d * 255.0f);
            h6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z9;
        int action = motionEvent.getAction();
        RectF rectF = this.f38276e1;
        v5 v5Var = this.f38282k1;
        hc hcVar = this.f38279h1;
        if (action == 0) {
            if (v5Var.f38854c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z9 = true;
            } else {
                z9 = false;
            }
            hcVar.c(z9);
        } else if (motionEvent.getAction() == 2) {
            if (hcVar.f34302i && (v5Var.f38854c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                hcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && hcVar.f34302i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.dp0) {
                    i7 = 2131748325;
                } else {
                    i7 = 2131748324;
                }
                this.f38278g1.t(org.telegram.messenger.id.M0(i7, null), true, true);
            }
            hcVar.c(false);
            return true;
        }
        if (!hcVar.f34302i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f38274c1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.qp.s1(this.U).T4;
    }

    @Override
    public int getCaptionLimit() {
        if (org.telegram.messenger.p10.i(this.U).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.qp.s1(this.U).U4;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.R0) {
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
        if (this instanceof org.telegram.ui.dp0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f38274c1.setTranslationY(L * f10);
    }

    @Override
    public final void s(int i7, int i10) {
        boolean z9;
        boolean z10;
        CharSequence text = getText();
        boolean z11 = false;
        if (i10 > 2 && text != null && !TextUtils.isEmpty(text.toString().trim())) {
            z9 = true;
        } else {
            z9 = false;
        }
        F(z9);
        if (this.f38287r1) {
            if (i7 < 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 < 3) {
                z11 = true;
            }
            if (z10 != z11) {
                invalidate();
            }
        }
    }

    public void setIsVideo(boolean z9) {
        this.f38285p1 = z9;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.S0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.c20 c20Var) {
        this.f38286q1 = c20Var;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i7) {
        int max;
        boolean z9;
        this.f38272a1 = i7;
        if (i7 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i7);
        }
        if (this.f38272a1 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.V0.d(max, z9, true);
        fi.m3 m3Var = this.f38274c1;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f38275d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void u(float f10) {
        float f11 = 1.0f - f10;
        this.U0.setAlpha(f11);
        this.S0.setAlpha(f11);
    }

    @Override
    public void x(int i7) {
        boolean z9 = this.f12374l0;
        super.x(i7);
        if (!z9 && this.L.c()) {
            B();
        }
    }

    public final void z() {
        boolean z9;
        wf wfVar = this.f38284o1;
        org.telegram.messenger.g0.r(wfVar);
        if (org.telegram.messenger.qp.s1(this.U).f24778e7.getInt("movecaptionhint", 0) >= 24) {
            boolean z10 = org.telegram.messenger.r2.f25216a;
            z9 = false;
        } else {
            z9 = true;
        }
        this.n1 = z9;
        if (z9) {
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.U).f24778e7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.i3(wfVar, 5000L);
        }
    }
}
