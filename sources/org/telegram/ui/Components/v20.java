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
import org.telegram.ui.fc1;
public class v20 extends FrameLayout implements me.d, org.telegram.ui.ActionBar.x5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final fc1 G;
    public u20 H;
    public int I;
    public final me.b f31356a;
    public final me.b f31357b;
    public final me.e f31358c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ImageView f31359e;
    public final ImageView f31360f;
    public final LinearLayout h;
    public boolean f31361n;
    public final ci.g2 f31362r;
    public ch.d f31363s;
    public Drawable v;
    public boolean f31364w;
    public boolean f31365x;
    public Runnable f31366y;

    public v20(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        js jsVar = js.h;
        this.f31356a = new me.b(0, this, jsVar, 380L, false);
        this.f31357b = new me.b(1, this, jsVar, 380L, true);
        this.f31358c = new me.e(2, this, le.a.f15248a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = c6Var;
        ci.g2 g2Var = new ci.g2(this, context, 4);
        this.f31362r = g2Var;
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
        addView(g2Var, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.f31359e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.w5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i11 | 16));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.w5.a(-1.0f, 32.0f, 0.0f, 32.0f, 0.0f, -2, i12 | 16));
        ImageView imageView2 = new ImageView(context);
        this.f31360f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.w5.a(24.0f, 12.0f, 0.0f, 12.0f, 0.0f, 24, i13 | 16));
        fc1 fc1Var = new fc1(this, getContext(), 7);
        this.G = fc1Var;
        fc1Var.setOrientation(0);
        fc1Var.setVisibility(0);
        addView(fc1Var, w7.w5.a(32.0f, 4.0f, 0.0f, 4.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        setWillNotDraw(false);
        b();
        e();
    }

    public final void a(org.telegram.ui.ActionBar.u0 u0Var) {
        this.h.addView(u0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f31358c.f16096e), AndroidUtilities.dp(48.0f));
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
        ci.g2 g2Var = this.f31362r;
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
        ch.d dVar = this.f31363s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f31363s.draw(canvas);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        if (this.f31364w) {
            c02 = org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f31365x) {
                m12 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.h6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                m12 = org.telegram.ui.ActionBar.h6.m1(f7, org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
            }
            c02 = org.telegram.ui.ActionBar.h6.c0(dp, m12);
        }
        this.v = c02;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f31359e.setColorFilter(m13, mode);
        int m14 = org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        ImageView imageView = this.f31360f;
        imageView.setColorFilter(m14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
        int m15 = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        ci.g2 g2Var = this.f31362r;
        g2Var.setHintTextColor(m15);
        g2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        g2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yh, c6Var));
        ch.d dVar = this.f31363s;
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
                    u0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        fc1 fc1Var = this.G;
        int childCount2 = fc1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (fc1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.t0) {
                ((org.telegram.ui.ActionBar.t0) fc1Var.getChildAt(i13)).a();
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
        this.f31357b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) js.f27635g);
        transitionSet.addListener((Transition.TransitionListener) new t20(this));
        fc1 fc1Var = this.G;
        TransitionManager.beginDelayedTransition(fc1Var, transitionSet);
        int i12 = 0;
        while (i12 < fc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.t0) fc1Var.getChildAt(i12)).getFilter())) {
                fc1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            gg.p0 p0Var = (gg.p0) arrayList2.get(i13);
            p0Var.getClass();
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(getContext(), this.d);
            t0Var.f21270r = true;
            t0Var.a();
            t0Var.setData(p0Var);
            t0Var.setOnClickListener(new xt(4, this, t0Var));
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
            fc1Var.addView(t0Var, w7.w5.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < fc1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.t0 t0Var2 = (org.telegram.ui.ActionBar.t0) fc1Var.getChildAt(i14);
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
        fc1Var.setTag(num);
    }

    public final void g(gg.p0 p0Var) {
        org.telegram.ui.fy fyVar;
        if (p0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            u20 u20Var = this.H;
            if (u20Var != null && (fyVar = ((org.telegram.ui.ay) u20Var).f35996b.C0) != null) {
                fyVar.Q(false);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f31360f;
            s20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            s20.d(this.f31359e, f7);
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
        ch.d dVar = this.f31363s;
        boolean z11 = true;
        if (dVar != null && dVar.f4685l != i11) {
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
        this.f31366y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f31361n = z10;
        if (!z10 && this.f31362r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f31356a.a(z11, true);
    }

    public void setSearchFiltersListener(u20 u20Var) {
        this.H = u20Var;
    }

    public void setupBlurredBackground(ch.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f31363s = dVar;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
