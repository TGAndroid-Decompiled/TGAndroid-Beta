package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.dc1;
public class t20 extends FrameLayout implements me.d, org.telegram.ui.ActionBar.z5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final dc1 G;
    public s20 H;
    public int I;
    public final me.b f30952a;
    public final me.b f30953b;
    public final me.e f30954c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView f30955e;
    public final ImageView f30956f;
    public final LinearLayout h;
    public boolean f30957n;
    public final ci.g2 f30958r;
    public ch.d f30959s;
    public Drawable v;
    public boolean f30960w;
    public boolean f30961x;
    public Runnable f30962y;

    public t20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        is isVar = is.h;
        this.f30952a = new me.b(0, this, isVar, 380L, false);
        this.f30953b = new me.b(1, this, isVar, 380L, true);
        this.f30954c = new me.e(2, this, le.a.f15505a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = e6Var;
        ci.g2 g2Var = new ci.g2(this, context, 4);
        this.f30958r = g2Var;
        g2Var.setTextSize(1, 15.0f);
        g2Var.setCursorWidth(1.5f);
        g2Var.setInputType(g2Var.getInputType() | 176);
        g2Var.setSingleLine(true);
        g2Var.setBackground(null);
        g2Var.setVerticalScrollBarEnabled(false);
        g2Var.setHorizontalScrollBarEnabled(false);
        g2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        g2Var.setClipToPadding(true);
        g2Var.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        g2Var.setGravity(i10 | 16);
        g2Var.addTextChangedListener(new ci.h2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            g2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(g2Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.f30955e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.x5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i11 | 16));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.x5.a(-1.0f, 32.0f, 0.0f, 32.0f, 0.0f, -2, i12 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f30956f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.x5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i13 | 16));
        dc1 dc1Var = new dc1(this, getContext(), 7);
        this.G = dc1Var;
        dc1Var.setOrientation(0);
        dc1Var.setVisibility(0);
        addView(dc1Var, w7.x5.a(32.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        setWillNotDraw(false);
        b();
        e();
    }

    public final void a(org.telegram.ui.ActionBar.v0 v0Var) {
        this.h.addView(v0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f30954c.f16349e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = measuredWidth;
        } else {
            i10 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        ci.g2 g2Var = this.f30958r;
        rect.set(i10, 0, g2Var.getMeasuredWidth() - max, g2Var.getMeasuredHeight());
        g2Var.setClipBounds(rect);
        g2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((gg.p0) arrayList.get(i10)).h) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                f();
                return;
            }
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((gg.p0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.v.draw(canvas);
        }
        ch.d dVar = this.f30959s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f30959s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        boolean q6;
        float f7;
        int m12;
        Drawable c02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        if (this.f30960w) {
            c02 = org.telegram.ui.ActionBar.i6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f30961x) {
                m12 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.i6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                m12 = org.telegram.ui.ActionBar.i6.m1(f7, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            }
            c02 = org.telegram.ui.ActionBar.i6.c0(dp, m12);
        }
        this.v = c02;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        int m13 = org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30955e.setColorFilter(m13, mode);
        int m14 = org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ImageView imageView = this.f30956f;
        imageView.setColorFilter(m14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
        int m15 = org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ci.g2 g2Var = this.f30958r;
        g2Var.setHintTextColor(m15);
        g2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        g2Var.setCursorColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Yh, e6Var));
        ch.d dVar = this.f30959s;
        if (dVar != null) {
            dVar.v();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.v0) {
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) childAt;
                if (v0Var.getIconView() != null) {
                    v0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.i6.m1(0.6f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        dc1 dc1Var = this.G;
        int childCount2 = dc1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (dc1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.u0) {
                ((org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i13)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.f30953b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) is.f27444g);
        transitionSet.addListener((Transition.TransitionListener) new r20(this));
        dc1 dc1Var = this.G;
        TransitionManager.beginDelayedTransition(dc1Var, transitionSet);
        int i12 = 0;
        while (i12 < dc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i12)).getFilter())) {
                dc1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            gg.p0 p0Var = (gg.p0) arrayList2.get(i13);
            p0Var.getClass();
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), this.d);
            u0Var.f21547r = true;
            u0Var.a();
            u0Var.setData(p0Var);
            u0Var.setOnClickListener(new vt(4, this, u0Var));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (z11) {
                i11 = 0;
            } else {
                i11 = 6;
            }
            dc1Var.addView(u0Var, w7.x5.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < dc1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) dc1Var.getChildAt(i14);
            if (i14 == this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        dc1Var.setTag(num);
    }

    public final void g(gg.p0 p0Var) {
        org.telegram.ui.dy dyVar;
        if (p0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            s20 s20Var = this.H;
            if (s20Var != null && (dyVar = ((org.telegram.ui.yx) s20Var).f44469b.C0) != null) {
                dyVar.Q(false);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f30956f;
            q20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            q20.d(this.f30955e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        ch.d dVar = this.f30959s;
        boolean z11 = true;
        if (dVar != null && dVar.f4687l != i11) {
            dVar.setAlpha(i11);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.v;
        if (drawable != null && drawable.getAlpha() != (i10 = 255 - i11)) {
            this.v.setAlpha(i10);
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.f30962y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f30957n = z10;
        if (!z10 && this.f30958r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f30952a.a(z11, true);
    }

    public void setSearchFiltersListener(s20 s20Var) {
        this.H = s20Var;
    }

    public void setupBlurredBackground(ch.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f30959s = dVar;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
