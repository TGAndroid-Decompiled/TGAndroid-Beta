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
public class e10 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.b6 {
    public Runnable E;
    public final h2.f F;
    public final ArrayList G;
    public final org.telegram.ui.d61 H;
    public d10 I;
    public int J;
    public final te.a f34636a;
    public final te.a f34637b;
    public final te.c f34638c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ImageView f34639e;
    public final ImageView f34640f;
    public final LinearLayout h;
    public boolean f34641n;
    public final ah.i f34642r;
    public fh.g f34643s;
    public Drawable f34644w;
    public boolean f34645x;
    public boolean f34646y;

    public e10(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        nr nrVar = nr.h;
        this.f34636a = new te.a(0, this, nrVar, 380L, false);
        this.f34637b = new te.a(1, this, nrVar, 380L, true);
        this.f34638c = new te.c(2, this, se.a.f57191a, 280L);
        this.F = new h2.f((int[]) null);
        this.G = new ArrayList();
        this.d = h6Var;
        ah.i iVar = new ah.i(6, context, this);
        this.f34642r = iVar;
        iVar.setTextSize(1, 15.0f);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackground(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setPadding(org.telegram.messenger.g0.L(48.0f), 0, org.telegram.messenger.g0.L(48.0f), 0);
        iVar.setClipToPadding(true);
        iVar.setImeOptions(268435459);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        iVar.addTextChangedListener(new ah.j(this, 23));
        if (Build.VERSION.SDK_INT >= 35) {
            iVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(iVar, c8.ma.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34639e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232507);
        if (org.telegram.messenger.hd.f24444a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, c8.ma.d(24, 24.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.hd.f24444a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(linearLayout, c8.ma.d(-2, -1.0f, i11 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f34640f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231984);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new o0(this, 18));
        if (org.telegram.messenger.hd.f24444a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, c8.ma.d(24, 24.0f, i12 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(13, getContext(), this);
        this.H = d61Var;
        d61Var.setOrientation(0);
        d61Var.setVisibility(0);
        addView(d61Var, c8.ma.d(-2, 32.0f, (org.telegram.messenger.hd.f24444a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ImageView imageView = this.f34640f;
            c10.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i7 == 1) {
            c10.d(this.f34639e, f10);
        } else if (i7 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.q0 q0Var) {
        this.h.addView(q0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pi));
    }

    public final void b() {
        int i7;
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.f34638c.f57706f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z10 = org.telegram.messenger.hd.f24444a0;
        if (z10) {
            i7 = measuredWidth;
        } else {
            i7 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        ah.i iVar = this.f34642r;
        rect.set(i7, 0, iVar.getMeasuredWidth() - max, iVar.getMeasuredHeight());
        iVar.setClipBounds(rect);
        iVar.setPadding(i7, 0, max, 0);
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 < arrayList.size()) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                e();
                return;
            }
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.G;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Drawable drawable = this.f34644w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f34644w.draw(canvas);
        }
        fh.g gVar = this.f34643s;
        if (gVar != null) {
            gVar.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(4.0f), getPaddingTop() - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.g0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.f34643s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        Integer num;
        boolean z10;
        int i7;
        int i10;
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        this.f34637b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) nr.f37962g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.j0(1, this));
        org.telegram.ui.d61 d61Var = this.H;
        TransitionManager.beginDelayedTransition(d61Var, transitionSet);
        int i11 = 0;
        while (i11 < d61Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.p0) d61Var.getChildAt(i11)).getFilter())) {
                d61Var.removeViewAt(i11);
                i11--;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i12);
            o0Var.getClass();
            org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(getContext(), this.d);
            p0Var.f29871r = true;
            p0Var.updateColors();
            p0Var.setData(o0Var);
            p0Var.setOnClickListener(new m8(14, this, p0Var));
            boolean z11 = org.telegram.messenger.hd.f24444a0;
            if (z11) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            d61Var.addView(p0Var, c8.ma.t(-2, -1, 0, i7, 0, i10, 0));
        }
        for (int i13 = 0; i13 < d61Var.getChildCount(); i13++) {
            org.telegram.ui.ActionBar.p0 p0Var2 = (org.telegram.ui.ActionBar.p0) d61Var.getChildAt(i13);
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
        d61Var.setTag(num);
    }

    public final void f(jg.o0 o0Var) {
        org.telegram.ui.kw kwVar;
        if (o0Var.h) {
            ArrayList arrayList = this.G;
            arrayList.remove(o0Var);
            int i7 = this.J;
            if (i7 < 0 || i7 > arrayList.size() - 1) {
                this.J = arrayList.size() - 1;
            }
            e();
            d10 d10Var = this.I;
            if (d10Var != null && (kwVar = ((org.telegram.ui.hv) d10Var).f48533a.D0) != null) {
                kwVar.N(false);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i7;
        int i10 = (int) (f10 * 255.0f);
        fh.g gVar = this.f34643s;
        boolean z11 = true;
        if (gVar != null && gVar.f56716c != i10) {
            gVar.setAlpha(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f34644w;
        if (drawable != null && drawable.getAlpha() != (i7 = 255 - i10)) {
            this.f34644w.setAlpha(i7);
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
        this.f34641n = z10;
        if (!z10 && this.f34642r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f34636a.a(z11, true);
    }

    public void setSearchFiltersListener(d10 d10Var) {
        this.I = d10Var;
    }

    public void setupBlurredBackground(fh.g gVar) {
        org.telegram.messenger.o10.s(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.f34643s = gVar;
    }

    @Override
    public final void updateColors() {
        boolean q10;
        float f10;
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        if (this.f34645x) {
            d02 = org.telegram.ui.ActionBar.m6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.f34646y) {
                r12 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var);
            } else {
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                if (q10) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.05f;
                }
                r12 = org.telegram.ui.ActionBar.m6.r1(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
            d02 = org.telegram.ui.ActionBar.m6.d0(L, r12);
        }
        this.f34644w = d02;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f34639e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        ImageView imageView = this.f34640f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, h6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        ah.i iVar = this.f34642r;
        iVar.setHintTextColor(r15);
        iVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pi, h6Var));
        fh.g gVar = this.f34643s;
        if (gVar != null) {
            gVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.q0) {
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) childAt;
                if (q0Var.getIconView() != null) {
                    q0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29473i6, h6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.d61 d61Var = this.H;
        int childCount2 = d61Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (d61Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.p0) {
                ((org.telegram.ui.ActionBar.p0) d61Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
