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
import org.telegram.ui.ib1;
public class d20 extends FrameLayout implements xd.b, org.telegram.ui.ActionBar.b6 {
    public final AnimationNotificationsLocker B;
    public final ArrayList C;
    public final ib1 D;
    public c20 E;
    public int F;
    public final xd.a f26166a;
    public final xd.a f26167b;
    public final xd.c f26168c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ImageView f26169e;
    public final ImageView f26170f;
    public final LinearLayout h;
    public boolean f26171n;
    public final lg.f f26172r;
    public qg.b f26173s;
    public Drawable v;
    public boolean f26174w;
    public boolean f26175x;
    public Runnable f26176y;

    public d20(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        pr prVar = pr.h;
        this.f26166a = new xd.a(0, this, prVar, 380L, false);
        this.f26167b = new xd.a(1, this, prVar, 380L, true);
        this.f26168c = new xd.c(2, this, wd.a.f49492a, 280L);
        this.B = new AnimationNotificationsLocker();
        this.C = new ArrayList();
        this.d = g6Var;
        lg.f fVar = new lg.f(this, context, 3);
        this.f26172r = fVar;
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
        fVar.addTextChangedListener(new eh.c(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            fVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(fVar, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f26169e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, k7.c6.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, k7.c6.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26170f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new g0(this, 17));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, k7.c6.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ib1 ib1Var = new ib1(this, getContext(), 8);
        this.D = ib1Var;
        ib1Var.setOrientation(0);
        ib1Var.setVisibility(0);
        addView(ib1Var, k7.c6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            ImageView imageView = this.f26170f;
            a20.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i10 == 1) {
            a20.d(this.f26169e, f10);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f26168c.f50509e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = measuredWidth;
        } else {
            i10 = max;
        }
        if (!z4) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        lg.f fVar = this.f26172r;
        rect.set(i10, 0, fVar.getMeasuredWidth() - max, fVar.getMeasuredHeight());
        fVar.setClipBounds(rect);
        fVar.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 < arrayList.size()) {
                if (((uf.e0) arrayList.get(i10)).h) {
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
        ArrayList arrayList = this.C;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((uf.e0) arrayList.get(i10)).h) {
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
        qg.b bVar = this.f26173s;
        if (bVar != null) {
            bVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f26173s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        boolean q10;
        float f10;
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        if (this.f26174w) {
            b02 = org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f26175x) {
                l1 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                if (q10) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.05f;
                }
                l1 = org.telegram.ui.ActionBar.k6.l1(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
            }
            b02 = org.telegram.ui.ActionBar.k6.b0(dp, l1);
        }
        this.v = b02;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        int l12 = org.telegram.ui.ActionBar.k6.l1(0.6f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f26169e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.k6.l1(0.6f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        ImageView imageView = this.f26170f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        lg.f fVar = this.f26172r;
        fVar.setHintTextColor(l14);
        fVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        fVar.setCursorColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Yh, g6Var));
        qg.b bVar = this.f26173s;
        if (bVar != null) {
            bVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.k6.l1(0.6f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ib1 ib1Var = this.D;
        int childCount2 = ib1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (ib1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) ib1Var.getChildAt(i13)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        Integer num;
        boolean z4;
        int i10;
        int i11;
        ArrayList arrayList = this.C;
        boolean isEmpty = arrayList.isEmpty();
        this.f26167b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new fg.j0(2).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) pr.f30184g);
        transitionSet.addListener((Transition.TransitionListener) new b20(this));
        ib1 ib1Var = this.D;
        TransitionManager.beginDelayedTransition(ib1Var, transitionSet);
        int i12 = 0;
        while (i12 < ib1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) ib1Var.getChildAt(i12)).getFilter())) {
                ib1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            uf.e0 e0Var = (uf.e0) arrayList2.get(i13);
            e0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.f22324r = true;
            v0Var.a();
            v0Var.setData(e0Var);
            v0Var.setOnClickListener(new w2(19, this, v0Var));
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = 6;
            }
            ib1Var.addView(v0Var, k7.c6.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < ib1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) ib1Var.getChildAt(i14);
            if (i14 == this.F) {
                z4 = true;
            } else {
                z4 = false;
            }
            v0Var2.setExpanded(z4);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        ib1Var.setTag(num);
    }

    public final void g(uf.e0 e0Var) {
        org.telegram.ui.yx yxVar;
        if (e0Var.h) {
            ArrayList arrayList = this.C;
            arrayList.remove(e0Var);
            int i10 = this.F;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.F = arrayList.size() - 1;
            }
            f();
            c20 c20Var = this.E;
            if (c20Var != null && (yxVar = ((org.telegram.ui.ux) c20Var).f42059b.f40306z0) != null) {
                yxVar.Q(false);
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

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z4;
        int i10;
        int i11 = (int) (f10 * 255.0f);
        qg.b bVar = this.f26173s;
        boolean z10 = true;
        if (bVar != null && bVar.f44856j != i11) {
            bVar.setAlpha(i11);
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable = this.v;
        if (drawable != null && drawable.getAlpha() != (i10 = 255 - i11)) {
            this.v.setAlpha(i10);
        } else {
            z10 = z4;
        }
        if (z10) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.f26176y = runnable;
    }

    public void setCloseButtonVisible(boolean z4) {
        boolean z10;
        this.f26171n = z4;
        if (!z4 && this.f26172r.length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f26166a.a(z10, true);
    }

    public void setSearchFiltersListener(c20 c20Var) {
        this.E = c20Var;
    }

    public void setupBlurredBackground(qg.b bVar) {
        bVar.p(AndroidUtilities.dp(20.0f));
        bVar.o(AndroidUtilities.dp(4.0f));
        this.f26173s = bVar;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
