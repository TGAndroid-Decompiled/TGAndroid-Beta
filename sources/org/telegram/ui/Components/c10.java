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
public class c10 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.c6 {
    public Runnable E;
    public final h2.f F;
    public final ArrayList G;
    public final org.telegram.ui.b61 H;
    public b10 I;
    public int J;
    public final te.a f33877a;
    public final te.a f33878b;
    public final te.c f33879c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final ImageView f33880e;
    public final ImageView f33881f;
    public final LinearLayout h;
    public boolean f33882n;
    public final ah.i f33883r;
    public fh.g f33884s;
    public Drawable f33885w;
    public boolean f33886x;
    public boolean f33887y;

    public c10(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        kr krVar = kr.h;
        this.f33877a = new te.a(0, this, krVar, 380L, false);
        this.f33878b = new te.a(1, this, krVar, 380L, true);
        this.f33879c = new te.c(2, this, se.a.f57270a, 280L);
        this.F = new h2.f((int[]) null);
        this.G = new ArrayList();
        this.d = i6Var;
        ah.i iVar = new ah.i(6, context, this);
        this.f33883r = iVar;
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
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        iVar.addTextChangedListener(new ah.j(this, 23));
        if (Build.VERSION.SDK_INT >= 35) {
            iVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(iVar, c8.na.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f33880e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232510);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, c8.na.d(24, 24.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(linearLayout, c8.na.d(-2, -1.0f, i11 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f33881f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231987);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new n0(this, 18));
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, c8.na.d(24, 24.0f, i12 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(13, getContext(), this);
        this.H = b61Var;
        b61Var.setOrientation(0);
        b61Var.setVisibility(0);
        addView(b61Var, c8.na.d(-2, 32.0f, (org.telegram.messenger.gd.f24314a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ImageView imageView = this.f33881f;
            a10.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i7 == 1) {
            a10.d(this.f33880e, f10);
        } else if (i7 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.q0 q0Var) {
        this.h.addView(q0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pi));
    }

    public final void b() {
        int i7;
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.f33879c.f57785f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z10 = org.telegram.messenger.gd.f24314a0;
        if (z10) {
            i7 = measuredWidth;
        } else {
            i7 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        ah.i iVar = this.f33883r;
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
        Drawable drawable = this.f33885w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f33885w.draw(canvas);
        }
        fh.g gVar = this.f33884s;
        if (gVar != null) {
            gVar.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(4.0f), getPaddingTop() - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.g0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.f33884s.draw(canvas);
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
        this.f33878b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) kr.f36859g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.j0(1, this));
        org.telegram.ui.b61 b61Var = this.H;
        TransitionManager.beginDelayedTransition(b61Var, transitionSet);
        int i11 = 0;
        while (i11 < b61Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.p0) b61Var.getChildAt(i11)).getFilter())) {
                b61Var.removeViewAt(i11);
                i11--;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i12);
            o0Var.getClass();
            org.telegram.ui.ActionBar.p0 p0Var = new org.telegram.ui.ActionBar.p0(getContext(), this.d);
            p0Var.f29925r = true;
            p0Var.updateColors();
            p0Var.setData(o0Var);
            p0Var.setOnClickListener(new l8(14, this, p0Var));
            boolean z11 = org.telegram.messenger.gd.f24314a0;
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
            b61Var.addView(p0Var, c8.na.t(-2, -1, 0, i7, 0, i10, 0));
        }
        for (int i13 = 0; i13 < b61Var.getChildCount(); i13++) {
            org.telegram.ui.ActionBar.p0 p0Var2 = (org.telegram.ui.ActionBar.p0) b61Var.getChildAt(i13);
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
        b61Var.setTag(num);
    }

    public final void f(jg.o0 o0Var) {
        org.telegram.ui.jw jwVar;
        if (o0Var.h) {
            ArrayList arrayList = this.G;
            arrayList.remove(o0Var);
            int i7 = this.J;
            if (i7 < 0 || i7 > arrayList.size() - 1) {
                this.J = arrayList.size() - 1;
            }
            e();
            b10 b10Var = this.I;
            if (b10Var != null && (jwVar = ((org.telegram.ui.gv) b10Var).f48363a.D0) != null) {
                jwVar.P(false);
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
        fh.g gVar = this.f33884s;
        boolean z11 = true;
        if (gVar != null && gVar.f56794c != i10) {
            gVar.setAlpha(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f33885w;
        if (drawable != null && drawable.getAlpha() != (i7 = 255 - i10)) {
            this.f33885w.setAlpha(i7);
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
        this.f33882n = z10;
        if (!z10 && this.f33883r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f33877a.a(z11, true);
    }

    public void setSearchFiltersListener(b10 b10Var) {
        this.I = b10Var;
    }

    public void setupBlurredBackground(fh.g gVar) {
        org.telegram.messenger.m10.s(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.f33884s = gVar;
    }

    @Override
    public final void updateColors() {
        boolean q10;
        float f10;
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        if (this.f33886x) {
            d02 = org.telegram.ui.ActionBar.n6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.f33887y) {
                r12 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var);
            } else {
                int i7 = org.telegram.ui.ActionBar.n6.G6;
                if (q10) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.05f;
                }
                r12 = org.telegram.ui.ActionBar.n6.r1(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            d02 = org.telegram.ui.ActionBar.n6.d0(L, r12);
        }
        this.f33885w = d02;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.6f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f33880e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.n6.r1(0.6f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        ImageView imageView = this.f33881f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        ah.i iVar = this.f33883r;
        iVar.setHintTextColor(r15);
        iVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        iVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Pi, i6Var));
        fh.g gVar = this.f33884s;
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
                    q0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.n6.r1(0.6f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29543i6, i6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.b61 b61Var = this.H;
        int childCount2 = b61Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (b61Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.p0) {
                ((org.telegram.ui.ActionBar.p0) b61Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
