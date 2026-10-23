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
import org.telegram.ui.qa1;
public class k20 extends FrameLayout implements ne.d, org.telegram.ui.ActionBar.y5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final qa1 G;
    public j20 H;
    public int I;
    public final ne.b f27725a;
    public final ne.b f27726b;
    public final ne.e f27727c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final ImageView e;
    public final ImageView f27728f;
    public final LinearLayout h;
    public boolean f27729n;
    public final ei.e2 f27730r;
    public dh.d f27731s;
    public Drawable v;
    public boolean f27732w;
    public boolean f27733x;
    public Runnable f27734y;

    public k20(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        bs bsVar = bs.h;
        this.f27725a = new ne.b(0, this, bsVar, 380L, false);
        this.f27726b = new ne.b(1, this, bsVar, 380L, true);
        this.f27727c = new ne.e(2, this, me.a.f16853a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = d6Var;
        ei.e2 e2Var = new ei.e2(this, context, 4);
        this.f27730r = e2Var;
        e2Var.setTextSize(1, 15.0f);
        e2Var.setCursorWidth(1.5f);
        e2Var.setInputType(e2Var.getInputType() | 176);
        e2Var.setSingleLine(true);
        e2Var.setBackground(null);
        e2Var.setVerticalScrollBarEnabled(false);
        e2Var.setHorizontalScrollBarEnabled(false);
        e2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        e2Var.setClipToPadding(true);
        e2Var.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var.setGravity(i10 | 16);
        e2Var.addTextChangedListener(new ai.u(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            e2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(e2Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        addView(imageView, w7.z5.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.z5.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f27728f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.z5.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        qa1 qa1Var = new qa1(this, getContext(), 9);
        this.G = qa1Var;
        qa1Var.setOrientation(0);
        qa1Var.setVisibility(0);
        addView(qa1Var, w7.z5.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        d();
    }

    public final void a(org.telegram.ui.ActionBar.u0 u0Var) {
        this.h.addView(u0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f27727c.e), AndroidUtilities.dp(48.0f));
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
        ei.e2 e2Var = this.f27730r;
        rect.set(i10, 0, e2Var.getMeasuredWidth() - max, e2Var.getMeasuredHeight());
        e2Var.setClipBounds(rect);
        e2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((hg.o0) arrayList.get(i10)).h) {
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
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        if (d6Var != null) {
            q6 = d6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.h6.I.q();
        }
        if (this.f27732w) {
            c02 = org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f27733x) {
                m12 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, d6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.h6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                m12 = org.telegram.ui.ActionBar.h6.m1(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            }
            c02 = org.telegram.ui.ActionBar.h6.c0(dp, m12);
        }
        this.v = c02;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(m13, mode);
        int m14 = org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        ImageView imageView = this.f27728f;
        imageView.setColorFilter(m14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, d6Var), 1, AndroidUtilities.dp(17.0f)));
        int m15 = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        ei.e2 e2Var = this.f27730r;
        e2Var.setHintTextColor(m15);
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yh, d6Var));
        dh.d dVar = this.f27731s;
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
                    u0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, d6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        qa1 qa1Var = this.G;
        int childCount2 = qa1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (qa1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.t0) {
                ((org.telegram.ui.ActionBar.t0) qa1Var.getChildAt(i13)).a();
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
        dh.d dVar = this.f27731s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f27731s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((hg.o0) arrayList.get(i10)).h) {
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
        this.f27726b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.m0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) bs.f25026g);
        transitionSet.addListener((Transition.TransitionListener) new i20(this));
        qa1 qa1Var = this.G;
        TransitionManager.beginDelayedTransition(qa1Var, transitionSet);
        int i12 = 0;
        while (i12 < qa1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.t0) qa1Var.getChildAt(i12)).getFilter())) {
                qa1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            hg.o0 o0Var = (hg.o0) arrayList2.get(i13);
            o0Var.getClass();
            org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(getContext(), this.d);
            t0Var.f21724r = true;
            t0Var.a();
            t0Var.setData(o0Var);
            t0Var.setOnClickListener(new ca(14, this, t0Var));
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
            qa1Var.addView(t0Var, w7.z5.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < qa1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.t0 t0Var2 = (org.telegram.ui.ActionBar.t0) qa1Var.getChildAt(i14);
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
        qa1Var.setTag(num);
    }

    public final void g(hg.o0 o0Var) {
        org.telegram.ui.lx lxVar;
        if (o0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(o0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            j20 j20Var = this.H;
            if (j20Var != null && (lxVar = ((org.telegram.ui.hx) j20Var).f37818b.C0) != null) {
                lxVar.Q(false);
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
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f27728f;
            h20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            h20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        dh.d dVar = this.f27731s;
        boolean z11 = true;
        if (dVar != null && dVar.f8016l != i11) {
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
        this.f27734y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f27729n = z10;
        if (!z10 && this.f27730r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f27725a.a(z11, true);
    }

    public void setSearchFiltersListener(j20 j20Var) {
        this.H = j20Var;
    }

    public void setupBlurredBackground(dh.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f27731s = dVar;
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
