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
import org.telegram.ui.ic1;
public class o20 extends FrameLayout implements ne.d, org.telegram.ui.ActionBar.x5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final ic1 G;
    public n20 H;
    public int I;
    public final ne.b f27810a;
    public final ne.b f27811b;
    public final ne.e f27812c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ImageView e;
    public final ImageView f27813f;
    public final LinearLayout h;
    public boolean f27814n;
    public final di.g2 f27815r;
    public dh.d f27816s;
    public Drawable v;
    public boolean f27817w;
    public boolean f27818x;
    public Runnable f27819y;

    public o20(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        es esVar = es.h;
        this.f27810a = new ne.b(0, this, esVar, 380L, false);
        this.f27811b = new ne.b(1, this, esVar, 380L, true);
        this.f27812c = new ne.e(2, this, me.a.f15760a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = c6Var;
        di.g2 g2Var = new di.g2(this, context, 4);
        this.f27815r = g2Var;
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
        g2Var.addTextChangedListener(new di.h2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            g2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(g2Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.a6.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i11 | 16));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.a6.a(-1.0f, 32.0f, 0.0f, 32.0f, 0.0f, -2, i12 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f27813f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.a6.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i13 | 16));
        ic1 ic1Var = new ic1(this, getContext(), 7);
        this.G = ic1Var;
        ic1Var.setOrientation(0);
        ic1Var.setVisibility(0);
        addView(ic1Var, w7.a6.a(32.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        setWillNotDraw(false);
        b();
        d();
    }

    public final void a(org.telegram.ui.ActionBar.u0 u0Var) {
        this.h.addView(u0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f27812c.e), AndroidUtilities.dp(48.0f));
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
        di.g2 g2Var = this.f27815r;
        rect.set(i10, 0, g2Var.getMeasuredWidth() - max, g2Var.getMeasuredHeight());
        g2Var.setClipBounds(rect);
        g2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((hg.p0) arrayList.get(i10)).h) {
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

    @Override
    public final void d() {
        boolean q6;
        float f7;
        int m12;
        Drawable c02;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        if (this.f27817w) {
            c02 = org.telegram.ui.ActionBar.g6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f27818x) {
                m12 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, c6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.g6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                m12 = org.telegram.ui.ActionBar.g6.m1(f7, org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
            }
            c02 = org.telegram.ui.ActionBar.g6.c0(dp, m12);
        }
        this.v = c02;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int m13 = org.telegram.ui.ActionBar.g6.m1(0.6f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(m13, mode);
        int m14 = org.telegram.ui.ActionBar.g6.m1(0.6f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        ImageView imageView = this.f27813f;
        imageView.setColorFilter(m14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
        int m15 = org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        di.g2 g2Var = this.f27815r;
        g2Var.setHintTextColor(m15);
        g2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        g2Var.setCursorColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Yh, c6Var));
        dh.d dVar = this.f27816s;
        if (dVar != null) {
            dVar.v();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.u0) {
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) childAt;
                if (u0Var.getIconView() != null) {
                    u0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.g6.m1(0.6f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ic1 ic1Var = this.G;
        int childCount2 = ic1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (ic1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.t0) {
                ((org.telegram.ui.ActionBar.t0) ic1Var.getChildAt(i13)).a();
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.v.draw(canvas);
        }
        dh.d dVar = this.f27816s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f27816s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((hg.p0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.f27811b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) es.f24772g);
        transitionSet.addListener((Transition.TransitionListener) new m20(this));
        ic1 ic1Var = this.G;
        TransitionManager.beginDelayedTransition(ic1Var, transitionSet);
        int i12 = 0;
        while (i12 < ic1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.t0) ic1Var.getChildAt(i12)).getFilter())) {
                ic1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            hg.p0 p0Var = (hg.p0) arrayList2.get(i13);
            p0Var.getClass();
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(getContext(), this.d);
            t0Var.f20638r = true;
            t0Var.a();
            t0Var.setData(p0Var);
            t0Var.setOnClickListener(new rt(4, this, t0Var));
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
            ic1Var.addView(t0Var, w7.a6.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < ic1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.t0 t0Var2 = (org.telegram.ui.ActionBar.t0) ic1Var.getChildAt(i14);
            if (i14 == this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            t0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        ic1Var.setTag(num);
    }

    public final void g(hg.p0 p0Var) {
        org.telegram.ui.iy iyVar;
        if (p0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            n20 n20Var = this.H;
            if (n20Var != null && (iyVar = ((org.telegram.ui.ey) n20Var).f35690b.C0) != null) {
                iyVar.Q(false);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b();
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f27813f;
            l20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            l20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        dh.d dVar = this.f27816s;
        boolean z11 = true;
        if (dVar != null && dVar.f6560l != i11) {
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
        this.f27819y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f27814n = z10;
        if (!z10 && this.f27815r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f27810a.a(z11, true);
    }

    public void setSearchFiltersListener(n20 n20Var) {
        this.H = n20Var;
    }

    public void setupBlurredBackground(dh.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f27816s = dVar;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
