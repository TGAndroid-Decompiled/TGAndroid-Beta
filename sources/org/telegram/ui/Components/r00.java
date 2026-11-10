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
public class r00 extends FrameLayout implements te.b, org.telegram.ui.ActionBar.c6 {
    public Runnable D;
    public final h2.f E;
    public final ArrayList F;
    public final org.telegram.ui.e61 G;
    public q00 H;
    public int I;
    public final te.a f37440a;
    public final te.a f37441b;
    public final te.c f37442c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final ImageView f37443e;
    public final ImageView f37444f;
    public final LinearLayout h;
    public boolean f37445n;
    public final ah.i f37446r;
    public fh.g f37447s;
    public Drawable f37448w;
    public boolean f37449x;
    public boolean f37450y;

    public r00(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        wq wqVar = wq.h;
        this.f37440a = new te.a(0, this, wqVar, 380L, false);
        this.f37441b = new te.a(1, this, wqVar, 380L, true);
        this.f37442c = new te.c(2, this, se.a.f55016a, 280L);
        this.E = new h2.f((int[]) null);
        this.F = new ArrayList();
        this.d = h6Var;
        ah.i iVar = new ah.i(6, context, this);
        this.f37446r = iVar;
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
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        iVar.addTextChangedListener(new ah.j(this, 20));
        if (Build.VERSION.SDK_INT >= 35) {
            iVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(iVar, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37443e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232505);
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, c8.ha.d(24, 24.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(linearLayout, c8.ha.d(-2, -1.0f, i11 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f37444f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231983);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new g0(this, 16));
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, c8.ha.d(24, 24.0f, i12 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(12, getContext(), this);
        this.G = e61Var;
        e61Var.setOrientation(0);
        e61Var.setVisibility(0);
        addView(e61Var, c8.ha.d(-2, 32.0f, (org.telegram.messenger.id.f23161a0 ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            ImageView imageView = this.f37444f;
            p00.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i7 == 1) {
            p00.d(this.f37443e, f10);
        } else if (i7 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.r0 r0Var) {
        this.h.addView(r0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mi));
    }

    public final void b() {
        int i7;
        int max = Math.max(org.telegram.messenger.g0.L(6.0f) + ((int) this.f37442c.f55504f), org.telegram.messenger.g0.L(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + org.telegram.messenger.g0.L(48.0f);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i7 = measuredWidth;
        } else {
            i7 = max;
        }
        if (!z9) {
            max = measuredWidth;
        }
        Rect rect = org.telegram.messenger.g0.Q;
        ah.i iVar = this.f37446r;
        rect.set(i7, 0, iVar.getMeasuredWidth() - max, iVar.getMeasuredHeight());
        iVar.setClipBounds(rect);
        iVar.setPadding(i7, 0, max, 0);
    }

    public final void c() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.F;
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
        ArrayList arrayList = this.F;
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
        Drawable drawable = this.f37448w;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f37448w.draw(canvas);
        }
        fh.g gVar = this.f37447s;
        if (gVar != null) {
            gVar.setBounds(getPaddingLeft() - org.telegram.messenger.g0.L(4.0f), getPaddingTop() - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f) + (getWidth() - getPaddingRight()), org.telegram.messenger.g0.L(4.0f) + (getHeight() - getPaddingBottom()));
            this.f37447s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e() {
        Integer num;
        boolean z9;
        int i7;
        int i10;
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.f37441b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) wq.f40047g);
        transitionSet.addListener((Transition.TransitionListener) new org.telegram.ui.ActionBar.j0(1, this));
        org.telegram.ui.e61 e61Var = this.G;
        TransitionManager.beginDelayedTransition(e61Var, transitionSet);
        int i11 = 0;
        while (i11 < e61Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.q0) e61Var.getChildAt(i11)).getFilter())) {
                e61Var.removeViewAt(i11);
                i11--;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i12);
            o0Var.getClass();
            org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(getContext(), this.d);
            q0Var.f28401r = true;
            q0Var.updateColors();
            q0Var.setData(o0Var);
            q0Var.setOnClickListener(new kk(12, this, q0Var));
            boolean z10 = org.telegram.messenger.id.f23161a0;
            if (z10) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            if (z10) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            e61Var.addView(q0Var, c8.ha.t(-2, -1, 0, i7, 0, i10, 0));
        }
        for (int i13 = 0; i13 < e61Var.getChildCount(); i13++) {
            org.telegram.ui.ActionBar.q0 q0Var2 = (org.telegram.ui.ActionBar.q0) e61Var.getChildAt(i13);
            if (i13 == this.I) {
                z9 = true;
            } else {
                z9 = false;
            }
            q0Var2.setExpanded(z9);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        e61Var.setTag(num);
    }

    public final void f(jg.o0 o0Var) {
        org.telegram.ui.iw iwVar;
        if (o0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(o0Var);
            int i7 = this.I;
            if (i7 < 0 || i7 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            e();
            q00 q00Var = this.H;
            if (q00Var != null && (iwVar = ((org.telegram.ui.gv) q00Var).f46162a.C0) != null) {
                iwVar.R(false);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z9;
        int i7;
        int i10 = (int) (f10 * 255.0f);
        fh.g gVar = this.f37447s;
        boolean z10 = true;
        if (gVar != null && gVar.f21081c != i10) {
            gVar.setAlpha(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.f37448w;
        if (drawable != null && drawable.getAlpha() != (i7 = 255 - i10)) {
            this.f37448w.setAlpha(i7);
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setCloseButtonVisible(boolean z9) {
        boolean z10;
        this.f37445n = z9;
        if (!z9 && this.f37446r.length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f37440a.a(z10, true);
    }

    public void setSearchFiltersListener(q00 q00Var) {
        this.H = q00Var;
    }

    public void setupBlurredBackground(fh.g gVar) {
        org.telegram.messenger.camera.q.p(gVar, org.telegram.messenger.g0.L(20.0f), 4.0f);
        this.f37447s = gVar;
    }

    @Override
    public final void updateColors() {
        boolean q10;
        float f10;
        int r12;
        Drawable d02;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        if (this.f37449x) {
            d02 = org.telegram.ui.ActionBar.m6.f0(org.telegram.messenger.g0.L(20.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var));
        } else {
            int L = org.telegram.messenger.g0.L(20.0f);
            if (this.f37450y) {
                r12 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var);
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
        this.f37448w = d02;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f37443e.setColorFilter(r13, mode);
        int r14 = org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        ImageView imageView = this.f37444f;
        imageView.setColorFilter(r14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var), 1, org.telegram.messenger.g0.L(17.0f)));
        int r15 = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        ah.i iVar = this.f37446r;
        iVar.setHintTextColor(r15);
        iVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mi, h6Var));
        fh.g gVar = this.f37447s;
        if (gVar != null) {
            gVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.r0) {
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) childAt;
                if (r0Var.getIconView() != null) {
                    r0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.m6.r1(0.6f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var), 1, org.telegram.messenger.g0.L(17.0f)));
            }
        }
        org.telegram.ui.e61 e61Var = this.G;
        int childCount2 = e61Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (e61Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.q0) {
                ((org.telegram.ui.ActionBar.q0) e61Var.getChildAt(i12)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
