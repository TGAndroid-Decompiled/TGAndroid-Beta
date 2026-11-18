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
public abstract class yc extends hi.n {
    public boolean S0;
    public final ImageView T0;
    public boolean U0;
    public final ImageView V0;
    public final hi.m W0;
    public y60 X0;
    public final org.telegram.ui.ActionBar.w2 Y0;
    public final ImageView Z0;
    public hi.m3 f42451a1;
    public int f42452b1;
    public final int[] f42453c1;
    public final hi.m3 f42454d1;
    public final Runnable f42455e1;
    public final RectF f42456f1;
    public final Drawable f42457g1;
    public final m6 f42458h1;
    public final mc f42459i1;
    public fh.g f42460j1;
    public final c6 f42461k1;
    public final c6 l1;
    public final c6 f42462m1;
    public boolean n1;
    public boolean f42463o1;
    public final lg f42464p1;
    public boolean f42465q1;
    public org.telegram.messenger.x10 f42466r1;
    public boolean f42467s1;

    public yc(Context context, FrameLayout frameLayout, au0 au0Var, FrameLayout frameLayout2, org.telegram.ui.ActionBar.i6 i6Var, ca caVar, Runnable runnable) {
        super(context, frameLayout, au0Var, frameLayout2, i6Var, caVar);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        float f14;
        int i12;
        this.f42452b1 = 0;
        this.f42453c1 = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.f42456f1 = new RectF();
        m6 m6Var = new m6(false, false, false);
        this.f42458h1 = m6Var;
        this.f42459i1 = new mc(this);
        lr lrVar = lr.h;
        this.f42461k1 = new c6(this, 0L, 350L, lrVar);
        this.l1 = new c6(this, 0L, 350L, lrVar);
        this.f42462m1 = new c6(this, 0L, 350L, lrVar);
        this.f42464p1 = new lg(this, 17);
        this.f42455e1 = runnable;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.N = org.telegram.messenger.g0.f24121q.x;
        m6Var.u(-1);
        boolean z10 = this instanceof org.telegram.ui.bp0;
        if (z10) {
            m6Var.t(org.telegram.messenger.gd.M0(2131748133, null), true, true);
            this.f42457g1 = context.getResources().getDrawable(2131231840);
        } else {
            m6Var.t(org.telegram.messenger.gd.M0(2131748132, null), true, true);
            this.f42457g1 = context.getResources().getDrawable(2131231839);
        }
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(2131231079);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
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
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        addView(imageView, c8.ma.d(44, 44.0f, i13, 14.0f, f10, 0.0f, f11));
        ImageView imageView2 = new ImageView(context);
        this.V0 = imageView2;
        hi.m mVar = new hi.m(5);
        this.W0 = mVar;
        imageView2.setImageDrawable(mVar);
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, org.telegram.messenger.g0.L(18.0f)));
        imageView2.setScaleType(scaleType);
        E(false, false);
        if (z10) {
            i10 = 48;
        } else {
            i10 = 80;
        }
        int i14 = i10 | 5;
        if (z10) {
            f12 = 6.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 6.0f;
        }
        addView(imageView2, c8.ma.d(44, 44.0f, i14, 0.0f, f12, 10.0f, f13));
        if (z10) {
            i11 = 1;
        } else {
            i11 = 3;
        }
        hi.m3 m3Var = new hi.m3(context, i11);
        this.f42454d1 = m3Var;
        m3Var.s(12.0f);
        int L = org.telegram.messenger.g0.L(12.0f);
        if (z10) {
            f14 = 8.0f;
        } else {
            f14 = 0.0f;
        }
        m3Var.setPadding(L, org.telegram.messenger.g0.L(f14), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(z10 ? 0.0f : 8.0f));
        m3Var.o(1.0f, -21.0f);
        m3Var.r(true);
        if (z10) {
            i12 = 48;
        } else {
            i12 = 80;
        }
        addView(m3Var, c8.ma.e(-1, 80, i12 | 5));
        ImageView imageView3 = new ImageView(context);
        this.Z0 = imageView3;
        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(context);
        this.Y0 = w2Var;
        imageView3.setImageDrawable(w2Var);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, org.telegram.messenger.g0.L(16.0f)));
        addView(imageView3, c8.ma.d(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.M0(2131755006, null));
        c8.ra.a(imageView3);
        this.f15051f.getEditText().addTextChangedListener(new ah.j(this, 17));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new n0(this, 5));
        imageView2.setOnClickListener(new y7(2, this, frameLayout));
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
        hi.g gVar = this.f15051f;
        gVar.getEditText().setTranslationX(org.telegram.messenger.g0.W1(this.f15061o0, getEditTextLeft() + org.telegram.messenger.g0.L(-26.0f), org.telegram.messenger.g0.L(2.0f)));
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
            alpha.translationX(f11).withEndAction(new xc(this, z10, 1)).start();
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
        hi.g gVar = this.f15051f;
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
        if (this.f42467s1 != z10) {
            if (z10) {
                org.telegram.messenger.mp.u1(this.V).T1().b();
            }
            this.f42467s1 = z10;
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
            scaleX.scaleY(f12).setInterpolator(lr.h).setDuration(420L).withEndAction(new xc(this, z10, 0)).start();
            if (z10) {
                org.telegram.ui.ActionBar.w2 w2Var = this.Y0;
                Objects.requireNonNull(w2Var);
                imageView.postDelayed(new s0(w2Var, 1), 220L);
                hi.m3 m3Var = this.f42451a1;
                if (m3Var != null) {
                    m3Var.f(true);
                    this.f42451a1 = null;
                }
                if (org.telegram.messenger.mp.g1().getInt("aihintshown", 0) < 3) {
                    hi.m3 m3Var2 = new hi.m3(getContext(), 3);
                    this.f42451a1 = m3Var2;
                    m3Var2.r(true);
                    this.f42451a1.v(org.telegram.messenger.gd.M0(2131754992, null));
                    this.f42451a1.p(1.0f, ((-imageView.getWidth()) / 2.0f) + org.telegram.messenger.g0.L(4.0f));
                    addView(this.f42451a1, c8.ma.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hi.m3 m3Var3 = this.f42451a1;
                    m3Var3.f15014r0 = new org.telegram.ui.ci(20, this, m3Var2);
                    m3Var3.d = 4000L;
                    m3Var3.x();
                    org.telegram.messenger.mp.g1().edit().putInt("aihintshown", org.telegram.messenger.mp.g1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hi.m3 m3Var4 = this.f42451a1;
            if (m3Var4 != null) {
                m3Var4.f(true);
                this.f42451a1 = null;
            }
        }
    }

    public abstract boolean G();

    public final void H(org.telegram.ui.ActionBar.i6 i6Var) {
        this.f15042a = i6Var;
        this.h.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U5, false), PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29645qg;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        mq mqVar = this.f15059n;
        mqVar.f37607a = L2;
        mqVar.invalidateSelf();
        this.W0.e(-1, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), -1);
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
        hi.m3 m3Var = this.f42454d1;
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
        RectF rectF = this.A0;
        ImageView imageView = this.Z0;
        if (imageView != null) {
            imageView.setTranslationX(-org.telegram.messenger.g0.L((1.0f - this.f15061o0) * 4.0f));
            boolean z10 = this instanceof org.telegram.ui.bp0;
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
            imageView.setTranslationY((Utilities.l((-this.f42461k1.e(false, this.f15051f.getEditText().getLineCount())) + 4.0f) * org.telegram.messenger.g0.L(3.0f) * i7) + f11);
        }
        float f12 = this.l1.f(this.n1, true ^ G());
        float d = this.f42462m1.d(this.f42463o1);
        if (f12 > 0.0f) {
            float a10 = this.f42459i1.a(0.03f);
            int L = org.telegram.messenger.g0.L((1.0f - this.f15061o0) * 4.0f);
            boolean z11 = this instanceof org.telegram.ui.bp0;
            m6 m6Var = this.f42458h1;
            RectF rectF2 = this.f42456f1;
            if (z11) {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.bottom + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.n10.b(m6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.bottom + org.telegram.messenger.g0.L(42.0f));
            } else {
                f10 = 1.0f;
                rectF2.set(org.telegram.messenger.g0.L(7.0f) + L, rectF.top - org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.n10.b(m6Var.c(), org.telegram.messenger.g0.L(11.0f), d, org.telegram.messenger.g0.L(44.0f) + L), rectF.top - org.telegram.messenger.g0.L(10.0f));
            }
            if (f12 < f10) {
                canvas.saveLayerAlpha(rectF2, (int) (f12 * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            dh.c cVar = this.f15054h0;
            if (cVar != null) {
                if (this.f42460j1 == null) {
                    fh.g c10 = cVar.c(this, null, false);
                    c10.p(c8.i0.j(this.f15042a));
                    c10.q(org.telegram.messenger.g0.L(5.0f));
                    c10.r(org.telegram.messenger.g0.L(16.0f));
                    this.f42460j1 = c10;
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rectF2.round(rect);
                rect.inset(-org.telegram.messenger.g0.L(5.0f), -org.telegram.messenger.g0.L(5.0f));
                this.f42460j1.setBounds(rect);
                this.f42460j1.draw(canvas);
            }
            Drawable drawable = this.f42457g1;
            drawable.setBounds((int) (rectF2.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF2.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) (rectF2.left + org.telegram.messenger.g0.L(29.0f)), (int) (rectF2.centerY() + org.telegram.messenger.g0.L(10.0f)));
            drawable.draw(canvas);
            m6Var.o(rectF2.left + org.telegram.messenger.g0.L(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            m6Var.C = (int) (d * 255.0f);
            m6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z10;
        int action = motionEvent.getAction();
        RectF rectF = this.f42456f1;
        c6 c6Var = this.l1;
        mc mcVar = this.f42459i1;
        if (action == 0) {
            if (c6Var.f33892c > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                z10 = true;
            } else {
                z10 = false;
            }
            mcVar.c(z10);
        } else if (motionEvent.getAction() == 2) {
            if (mcVar.f37434i && (c6Var.f33892c <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                mcVar.c(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && mcVar.f37434i) {
            if (motionEvent.getAction() == 1) {
                A();
                if (this instanceof org.telegram.ui.bp0) {
                    i7 = 2131748133;
                } else {
                    i7 = 2131748132;
                }
                this.f42458h1.t(org.telegram.messenger.gd.M0(i7, null), true, true);
            }
            mcVar.c(false);
            return true;
        }
        if (!mcVar.f37434i && !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean f(View view) {
        if (view != this.f42454d1) {
            return true;
        }
        return false;
    }

    @Override
    public int getCaptionDefaultLimit() {
        return org.telegram.messenger.mp.u1(this.V).W4;
    }

    @Override
    public int getCaptionLimit() {
        if (org.telegram.messenger.j10.i(this.V).q()) {
            return getCaptionPremiumLimit();
        }
        return getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return org.telegram.messenger.mp.u1(this.V).X4;
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
        if (this instanceof org.telegram.ui.bp0) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f42454d1.setTranslationY(L * f10);
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
        if (this.f42467s1) {
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
        this.f42465q1 = z10;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.T0.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(org.telegram.messenger.x10 x10Var) {
        this.f42466r1 = x10Var;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i7) {
        int max;
        boolean z10;
        this.f42452b1 = i7;
        if (i7 == Integer.MAX_VALUE) {
            max = 1;
        } else {
            max = Math.max(1, i7);
        }
        if (this.f42452b1 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W0.d(max, z10, true);
        hi.m3 m3Var = this.f42454d1;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override
    public final void t() {
        Runnable runnable = this.f42455e1;
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
        lg lgVar = this.f42464p1;
        org.telegram.messenger.g0.r(lgVar);
        if (org.telegram.messenger.mp.u1(this.V).h7.getInt("movecaptionhint", 0) >= 24) {
            boolean z11 = org.telegram.messenger.s2.f26723a;
            z10 = false;
        } else {
            z10 = true;
        }
        this.f42463o1 = z10;
        if (z10) {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.V).h7;
            sharedPreferences.edit().putInt("movecaptionhint", sharedPreferences.getInt("movecaptionhint", 0) + 1).apply();
            invalidate();
            org.telegram.messenger.g0.h3(lgVar, 5000L);
        }
    }
}
