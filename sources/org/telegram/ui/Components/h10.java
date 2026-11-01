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
public class h10 extends FrameLayout implements fe.e, org.telegram.ui.ActionBar.k6 {
    public Runnable D;
    public final e2.f E;
    public final ArrayList F;
    public final org.telegram.ui.s71 G;
    public g10 H;
    public int I;
    public final fe.b f26630a;
    public final fe.b f26631b;
    public final fe.f f26632c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final ImageView e;
    public final ImageView f26633f;
    public final LinearLayout h;
    public boolean f26634n;
    public final org.telegram.ui.ActionBar.n0 f26635r;
    public vg.f f26636s;
    public Drawable f26637w;
    public boolean f26638x;
    public boolean f26639y;

    public h10(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        gr grVar = gr.h;
        this.f26630a = new fe.b(0, this, grVar, 380L, false);
        this.f26631b = new fe.b(1, this, grVar, 380L, true);
        this.f26632c = new fe.f(2, this, ee.a.f6489a, 280L);
        this.E = new e2.f((int[]) null);
        this.F = new ArrayList();
        this.d = p6Var;
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, 3);
        this.f26635r = n0Var;
        n0Var.setTextSize(1, 15.0f);
        n0Var.setCursorWidth(1.5f);
        n0Var.setInputType(n0Var.getInputType() | 176);
        n0Var.setSingleLine(true);
        n0Var.setBackground(null);
        n0Var.setVerticalScrollBarEnabled(false);
        n0Var.setHorizontalScrollBarEnabled(false);
        n0Var.setPadding(org.telegram.messenger.i0.L(48.0f), 0, org.telegram.messenger.i0.L(48.0f), 0);
        n0Var.setClipToPadding(true);
        n0Var.setImeOptions(268435459);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        n0Var.setGravity(i10 | 16);
        n0Var.addTextChangedListener(new ag.a1(this, 15));
        if (Build.VERSION.SDK_INT >= 35) {
            n0Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(n0Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232504);
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, w7.b6.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.dd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.b6.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26633f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231982);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, 15));
        if (org.telegram.messenger.dd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.b6.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.s71 s71Var = new org.telegram.ui.s71(this, getContext(), 8);
        this.G = s71Var;
        s71Var.setOrientation(0);
        s71Var.setVisibility(0);
        addView(s71Var, w7.b6.d(-2, 32.0f, (org.telegram.messenger.dd.X ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    public final void a(org.telegram.ui.ActionBar.t0 t0Var) {
        this.h.addView(t0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mi));
    }

    public final void b() {
        int i10;
        int max = Math.max(org.telegram.messenger.i0.L(6.0f) + ((int) this.f26632c.f7032f), org.telegram.messenger.i0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.i0.L(48.0f);
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            i10 = measuredWidth;
        } else {
            i10 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.i0.Q;
        org.telegram.ui.ActionBar.n0 n0Var = this.f26635r;
        rect.set(i10, 0, n0Var.getMeasuredWidth() - max, n0Var.getMeasuredHeight());
        n0Var.setClipBounds(rect);
        n0Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((zf.e0) arrayList.get(i10)).h) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                e();
                return;
            }
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((zf.e0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.f26637w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f26637w.draw(canvas);
        }
        vg.f fVar = this.f26636s;
        if (fVar != null) {
            fVar.setBounds(getPaddingLeft() - org.telegram.messenger.i0.L(4.0f), getPaddingTop() - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.i0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.f26636s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.f26631b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new kg.g0(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) gr.f26524g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.k0(1, this));
        org.telegram.ui.s71 s71Var = this.G;
        TransitionManager.beginDelayedTransition(s71Var, transitionSet);
        int i12 = 0;
        while (i12 < s71Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.s0) s71Var.getChildAt(i12)).getFilter())) {
                s71Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            zf.e0 e0Var = (zf.e0) arrayList2.get(i13);
            e0Var.getClass();
            org.telegram.ui.ActionBar.s0 s0Var = new org.telegram.ui.ActionBar.s0(getContext(), this.d);
            s0Var.f20759r = true;
            s0Var.updateColors();
            s0Var.setData(e0Var);
            s0Var.setOnClickListener(new sr(5, this, s0Var));
            boolean z11 = org.telegram.messenger.dd.X;
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
            s71Var.addView(s0Var, w7.b6.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < s71Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.s0 s0Var2 = (org.telegram.ui.ActionBar.s0) s71Var.getChildAt(i14);
            if (i14 == this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            s0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        s71Var.setTag(num);
    }

    public final void f(zf.e0 e0Var) {
        org.telegram.ui.jx jxVar;
        if (e0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(e0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            e();
            g10 g10Var = this.H;
            if (g10Var != null && (jxVar = ((org.telegram.ui.hw) g10Var).f37876a.C0) != null) {
                jxVar.R(false);
            }
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
        vg.f fVar = this.f26636s;
        boolean z11 = true;
        if (fVar != null && fVar.f6650c != i11) {
            fVar.setAlpha(i11);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f26637w;
        if (drawable != null && drawable.getAlpha() != (i10 = 255 - i11)) {
            this.f26637w.setAlpha(i10);
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f26634n = z10;
        if (!z10 && this.f26635r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f26630a.a(z11, true);
    }

    public void setSearchFiltersListener(g10 g10Var) {
        this.H = g10Var;
    }

    public void setupBlurredBackground(vg.f fVar) {
        org.telegram.messenger.a30.u(fVar, org.telegram.messenger.i0.L(20.0f), 4.0f);
        this.f26636s = fVar;
    }

    @Override
    public final void updateColors() {
        boolean q6;
        float f7;
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        if (this.f26638x) {
            d02 = org.telegram.ui.ActionBar.t6.f0(org.telegram.messenger.i0.L(20.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var));
        } else {
            int L = org.telegram.messenger.i0.L(20.0f);
            if (this.f26639y) {
                r12 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.t6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                r12 = org.telegram.ui.ActionBar.t6.r1(f7, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
            d02 = org.telegram.ui.ActionBar.t6.d0(L, r12);
        }
        this.f26637w = d02;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        int r13 = org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        ImageView imageView = this.f26633f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), 1, org.telegram.messenger.i0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.n0 n0Var = this.f26635r;
        n0Var.setHintTextColor(r15);
        n0Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        n0Var.setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Mi, p6Var));
        vg.f fVar = this.f26636s;
        if (fVar != null) {
            fVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.t0) {
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) childAt;
                if (t0Var.getIconView() != null) {
                    t0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, p6Var), 1, org.telegram.messenger.i0.L(17.0f)));
            }
        }
        org.telegram.ui.s71 s71Var = this.G;
        int childCount2 = s71Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (s71Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.s0) {
                ((org.telegram.ui.ActionBar.s0) s71Var.getChildAt(i13)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ImageView imageView = this.f26633f;
            f10.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            f10.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
