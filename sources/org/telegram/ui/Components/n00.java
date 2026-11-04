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
import java.util.HashSet;
public class n00 extends FrameLayout implements qe.b, org.telegram.ui.ActionBar.z5 {
    public Runnable E;
    public final g2.g F;
    public final ArrayList G;
    public final org.telegram.ui.s51 H;
    public m00 I;
    public int J;
    public final qe.a f36296a;
    public final qe.a f36297b;
    public final qe.c f36298c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView f36299e;
    public final ImageView f36300f;
    public final LinearLayout h;
    public boolean f36301n;
    public final bh.g f36302r;
    public gh.g f36303s;
    public Drawable f36304w;
    public boolean f36305x;
    public boolean f36306y;

    public n00(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        xq xqVar = xq.h;
        this.f36296a = new qe.a(0, this, xqVar, 380L, false);
        this.f36297b = new qe.a(1, this, xqVar, 380L, true);
        this.f36298c = new qe.c(2, this, pe.a.f53446a, 280L);
        this.F = new g2.g((int[]) null);
        this.G = new ArrayList();
        this.d = e6Var;
        bh.g gVar = new bh.g(6, context, this);
        this.f36302r = gVar;
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        gVar.setClipToPadding(true);
        gVar.setImeOptions(268435459);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        gVar.setGravity(i3 | 16);
        gVar.addTextChangedListener(new bh.h(this, 20));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(gVar, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f36299e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232505);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, b8.mf.d(24, 24.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(linearLayout, b8.mf.d(-2, -1.0f, i11 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f36300f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231983);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, b8.mf.d(24, 24.0f, i12 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(13, getContext(), this);
        this.H = s51Var;
        s51Var.setOrientation(0);
        s51Var.setVisibility(0);
        addView(s51Var, b8.mf.d(-2, 32.0f, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            ImageView imageView = this.f36300f;
            l00.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i3 == 1) {
            l00.d(this.f36299e, f10);
        } else if (i3 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.q0 q0Var) {
        this.h.addView(q0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mi));
    }

    public final void b() {
        int i3;
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.f36298c.f53846f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i3 = measuredWidth;
        } else {
            i3 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        bh.g gVar = this.f36302r;
        rect.set(i3, 0, gVar.getMeasuredWidth() - max, gVar.getMeasuredHeight());
        gVar.setClipBounds(rect);
        gVar.setPadding(i3, 0, max, 0);
    }

    public final void c() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i3 < arrayList.size()) {
                if (((kg.l0) arrayList.get(i3)).h) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            } else {
                e();
                return;
            }
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((kg.l0) arrayList.get(i3)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.f36304w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f36304w.draw(canvas);
        }
        gh.g gVar = this.f36303s;
        if (gVar != null) {
            gVar.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(4.0f), getPaddingTop() - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.g0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.f36303s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        Integer num;
        boolean z10;
        int i3;
        int i10;
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        this.f36297b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.h0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) xq.f40453g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.i0(1, this));
        org.telegram.ui.s51 s51Var = this.H;
        TransitionManager.beginDelayedTransition(s51Var, transitionSet);
        int i11 = 0;
        while (i11 < s51Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i11)).getFilter())) {
                s51Var.removeViewAt(i11);
                i11--;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            kg.l0 l0Var = (kg.l0) arrayList2.get(i12);
            l0Var.getClass();
            org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(getContext(), this.d);
            p0Var.f28412r = true;
            p0Var.updateColors();
            p0Var.setData(l0Var);
            p0Var.setOnClickListener(new q2(18, this, p0Var));
            boolean z11 = org.telegram.messenger.bd.f21784a0;
            if (z11) {
                i3 = 6;
            } else {
                i3 = 0;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            s51Var.addView(p0Var, b8.mf.t(-2, -1, 0, i3, 0, i10, 0));
        }
        for (int i13 = 0; i13 < s51Var.getChildCount(); i13++) {
            org.telegram.ui.ActionBar.p0 p0Var2 = (org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i13);
            if (i13 == this.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            p0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        s51Var.setTag(num);
    }

    public final void f(kg.l0 l0Var) {
        org.telegram.ui.cw cwVar;
        if (l0Var.h) {
            ArrayList arrayList = this.G;
            arrayList.remove(l0Var);
            int i3 = this.J;
            if (i3 < 0 || i3 > arrayList.size() - 1) {
                this.J = arrayList.size() - 1;
            }
            e();
            m00 m00Var = this.I;
            if (m00Var != null && (cwVar = ((org.telegram.ui.av) m00Var).f43848a.D0) != null) {
                cwVar.R(false);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i3;
        int i10 = (int) (f10 * 255.0f);
        gh.g gVar = this.f36303s;
        boolean z11 = true;
        if (gVar != null && gVar.f53579c != i10) {
            gVar.setAlpha(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f36304w;
        if (drawable != null && drawable.getAlpha() != (i3 = 255 - i10)) {
            this.f36304w.setAlpha(i3);
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f36301n = z10;
        if (!z10 && this.f36302r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f36296a.a(z11, true);
    }

    public void setSearchFiltersListener(m00 m00Var) {
        this.I = m00Var;
    }

    public void setupBlurredBackground(gh.g gVar) {
        org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.f36303s = gVar;
    }

    @Override
    public final void updateColors() {
        boolean q10;
        float f10;
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (this.f36305x) {
            d02 = org.telegram.ui.ActionBar.k6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.f36306y) {
                r12 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
            } else {
                int i3 = org.telegram.ui.ActionBar.k6.G6;
                if (q10) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.05f;
                }
                r12 = org.telegram.ui.ActionBar.k6.r1(f10, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            }
            d02 = org.telegram.ui.ActionBar.k6.d0(L, r12);
        }
        this.f36304w = d02;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        int r13 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f36299e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        ImageView imageView = this.f36300f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        bh.g gVar = this.f36302r;
        gVar.setHintTextColor(r15);
        gVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Mi, e6Var));
        gh.g gVar2 = this.f36303s;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.q0) {
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) childAt;
                if (q0Var.getIconView() != null) {
                    q0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.s51 s51Var = this.H;
        int childCount2 = s51Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (s51Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.p0) {
                ((org.telegram.ui.ActionBar.p0) s51Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
