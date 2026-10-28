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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class m20 extends FrameLayout implements oe.d, org.telegram.ui.ActionBar.p6 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final org.telegram.ui.za1 G;
    public l20 H;
    public int I;
    public final oe.b f30342a;
    public final oe.b f30343b;
    public final oe.e f30344c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final ImageView e;
    public final ImageView f30345f;
    public final LinearLayout h;
    public boolean f30346n;
    public final fi.c2 f30347r;
    public eh.d f30348s;
    public Drawable v;
    public boolean f30349w;
    public boolean f30350x;
    public Runnable f30351y;

    public m20(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        ds dsVar = ds.h;
        this.f30342a = new oe.b(0, this, dsVar, 380L, false);
        this.f30343b = new oe.b(1, this, dsVar, 380L, true);
        this.f30344c = new oe.e(2, this, ne.a.f18778a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = u6Var;
        fi.c2 c2Var = new fi.c2(this, context, 5);
        this.f30347r = c2Var;
        c2Var.setTextSize(1, 15.0f);
        c2Var.setCursorWidth(1.5f);
        c2Var.setInputType(c2Var.getInputType() | 176);
        c2Var.setSingleLine(true);
        c2Var.setBackground(null);
        c2Var.setVerticalScrollBarEnabled(false);
        c2Var.setHorizontalScrollBarEnabled(false);
        c2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        c2Var.setClipToPadding(true);
        c2Var.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        c2Var.setGravity(i10 | 16);
        c2Var.addTextChangedListener(new bi.u(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            c2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(c2Var, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        addView(imageView, kb1.h(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, kb1.h(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30345f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 16));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, kb1.h(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(this, getContext(), 10);
        this.G = za1Var;
        za1Var.setOrientation(0);
        za1Var.setVisibility(0);
        addView(za1Var, kb1.h(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        updateColors();
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f30345f;
            j20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            j20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yh));
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f30344c.f19333f), AndroidUtilities.dp(48.0f));
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
        fi.c2 c2Var = this.f30347r;
        rect.set(i10, 0, c2Var.getMeasuredWidth() - max, c2Var.getMeasuredHeight());
        c2Var.setClipBounds(rect);
        c2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((ig.p0) arrayList.get(i10)).h) {
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
                if (((ig.p0) arrayList.get(i10)).h) {
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
        eh.d dVar = this.f30348s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f30348s.draw(canvas);
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
        this.f30343b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) ds.f27531g);
        transitionSet.addListener((Transition.TransitionListener) new k20(this));
        org.telegram.ui.za1 za1Var = this.G;
        TransitionManager.beginDelayedTransition(za1Var, transitionSet);
        int i12 = 0;
        while (i12 < za1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) za1Var.getChildAt(i12)).getFilter())) {
                za1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ig.p0 p0Var = (ig.p0) arrayList2.get(i13);
            p0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.f23150r = true;
            v0Var.updateColors();
            v0Var.setData(p0Var);
            v0Var.setOnClickListener(new ga(16, this, v0Var));
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
            za1Var.addView(v0Var, kb1.x(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < za1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) za1Var.getChildAt(i14);
            if (i14 == this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            v0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        za1Var.setTag(num);
    }

    public final void f(ig.p0 p0Var) {
        org.telegram.ui.mx mxVar;
        if (p0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(p0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            e();
            l20 l20Var = this.H;
            if (l20Var != null && (mxVar = ((org.telegram.ui.lx) l20Var).f41273a.C0) != null) {
                mxVar.R(false);
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
        eh.d dVar = this.f30348s;
        boolean z11 = true;
        if (dVar != null && dVar.f19460b != i11) {
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
        this.f30351y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f30346n = z10;
        if (!z10 && this.f30347r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f30342a.a(z11, true);
    }

    public void setSearchFiltersListener(l20 l20Var) {
        this.H = l20Var;
    }

    public void setupBlurredBackground(eh.d dVar) {
        org.telegram.messenger.wh.s(dVar, AndroidUtilities.dp(20.0f), 4.0f);
        this.f30348s = dVar;
    }

    @Override
    public final void updateColors() {
        boolean q5;
        float f7;
        int o12;
        Drawable c02;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        if (this.f30349w) {
            c02 = org.telegram.ui.ActionBar.y6.e0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f30350x) {
                o12 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, u6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.y6.G6;
                if (q5) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                o12 = org.telegram.ui.ActionBar.y6.o1(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
            c02 = org.telegram.ui.ActionBar.y6.c0(dp, o12);
        }
        this.v = c02;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(o13, mode);
        int o14 = org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        ImageView imageView = this.f30345f;
        imageView.setColorFilter(o14, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var), 1, AndroidUtilities.dp(17.0f)));
        int o15 = org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        fi.c2 c2Var = this.f30347r;
        c2Var.setHintTextColor(o15);
        c2Var.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        c2Var.setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Yh, u6Var));
        eh.d dVar = this.f30348s;
        if (dVar != null) {
            dVar.updateColors();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.y6.o1(0.6f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        org.telegram.ui.za1 za1Var = this.G;
        int childCount2 = za1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (za1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) za1Var.getChildAt(i13)).updateColors();
            }
        }
        invalidate();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
