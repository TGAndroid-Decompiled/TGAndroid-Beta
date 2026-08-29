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
import org.telegram.ui.ua1;
public class x10 extends FrameLayout implements vd.b, org.telegram.ui.ActionBar.x5 {
    public final AnimationNotificationsLocker A;
    public final ArrayList B;
    public final ua1 C;
    public w10 D;
    public int E;
    public final vd.a f34540a;
    public final vd.a f34541b;
    public final vd.c f34542c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ImageView f34543e;
    public final ImageView f34544f;
    public final LinearLayout h;
    public boolean f34545n;
    public final ig.f f34546r;
    public ng.d f34547s;
    public Drawable v;
    public boolean f34548w;
    public boolean f34549x;
    public Runnable f34550y;

    public x10(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        jr jrVar = jr.h;
        this.f34540a = new vd.a(0, this, jrVar, 380L, false);
        this.f34541b = new vd.a(1, this, jrVar, 380L, true);
        this.f34542c = new vd.c(2, this, ud.a.f49172a, 280L);
        this.A = new AnimationNotificationsLocker();
        this.B = new ArrayList();
        this.d = c6Var;
        ig.f fVar = new ig.f(this, context, 5);
        this.f34546r = fVar;
        fVar.setTextSize(1, 15.0f);
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackground(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        fVar.setClipToPadding(true);
        fVar.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar.setGravity(i10 | 16);
        fVar.addTextChangedListener(new bh.c(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            fVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(fVar, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34543e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, i7.f6.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, i7.f6.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f34544f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, 17));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, i7.f6.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ua1 ua1Var = new ua1(this, getContext(), 9);
        this.C = ua1Var;
        ua1Var.setOrientation(0);
        ua1Var.setVisibility(0);
        addView(ua1Var, i7.f6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            ImageView imageView = this.f34544f;
            u10.d(imageView, f9);
            imageView.setRotation((1.0f - f9) * 90.0f);
        } else if (i10 == 1) {
            u10.d(this.f34543e, f9);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f34542c.f49510e), AndroidUtilities.dp(48.0f));
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
        ig.f fVar = this.f34546r;
        rect.set(i10, 0, fVar.getMeasuredWidth() - max, fVar.getMeasuredHeight());
        fVar.setClipBounds(rect);
        fVar.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 < arrayList.size()) {
                if (((rf.f0) arrayList.get(i10)).h) {
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
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((rf.f0) arrayList.get(i10)).h) {
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
        ng.d dVar = this.f34547s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f34547s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        boolean q6;
        float f9;
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        if (this.f34548w) {
            b02 = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f34549x) {
                l1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.g6.G6;
                if (q6) {
                    f9 = 0.07f;
                } else {
                    f9 = 0.05f;
                }
                l1 = org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            }
            b02 = org.telegram.ui.ActionBar.g6.b0(dp, l1);
        }
        this.v = b02;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int l12 = org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f34543e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        ImageView imageView = this.f34544f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        ig.f fVar = this.f34546r;
        fVar.setHintTextColor(l14);
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yh, c6Var));
        ng.d dVar = this.f34547s;
        if (dVar != null) {
            dVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.g6.l1(0.6f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ua1 ua1Var = this.C;
        int childCount2 = ua1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (ua1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) ua1Var.getChildAt(i13)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList = this.B;
        boolean isEmpty = arrayList.isEmpty();
        this.f34541b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new cg.j0(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) jr.f29801g);
        transitionSet.addListener((Transition.TransitionListener) new v10(this));
        ua1 ua1Var = this.C;
        TransitionManager.beginDelayedTransition(ua1Var, transitionSet);
        int i12 = 0;
        while (i12 < ua1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) ua1Var.getChildAt(i12)).getFilter())) {
                ua1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            rf.f0 f0Var = (rf.f0) arrayList2.get(i13);
            f0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.f23865r = true;
            v0Var.a();
            v0Var.setData(f0Var);
            v0Var.setOnClickListener(new t2(22, this, v0Var));
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
            ua1Var.addView(v0Var, i7.f6.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < ua1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) ua1Var.getChildAt(i14);
            if (i14 == this.E) {
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
        ua1Var.setTag(num);
    }

    public final void g(rf.f0 f0Var) {
        org.telegram.ui.ox oxVar;
        if (f0Var.h) {
            ArrayList arrayList = this.B;
            arrayList.remove(f0Var);
            int i10 = this.E;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.E = arrayList.size() - 1;
            }
            f();
            w10 w10Var = this.D;
            if (w10Var != null && (oxVar = ((org.telegram.ui.kx) w10Var).f40034b.f38377y0) != null) {
                oxVar.Q(false);
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

    public void setBlurredBackgroundVisibility(float f9) {
        boolean z10;
        int i10;
        int i11 = (int) (f9 * 255.0f);
        ng.d dVar = this.f34547s;
        boolean z11 = true;
        if (dVar != null && dVar.f17346j != i11) {
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
        this.f34550y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f34545n = z10;
        if (!z10 && this.f34546r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f34540a.a(z11, true);
    }

    public void setSearchFiltersListener(w10 w10Var) {
        this.D = w10Var;
    }

    public void setupBlurredBackground(ng.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.f34547s = dVar;
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
