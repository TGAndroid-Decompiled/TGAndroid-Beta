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
import org.telegram.ui.ta1;
public class m10 extends FrameLayout implements td.b, org.telegram.ui.ActionBar.w5 {
    public final AnimationNotificationsLocker A;
    public final ArrayList B;
    public final ta1 C;
    public l10 D;
    public int E;
    public final td.a f30658a;
    public final td.a f30659b;
    public final td.c f30660c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final ImageView f30661e;
    public final ImageView f30662f;
    public final LinearLayout h;
    public boolean f30663n;
    public final fg.g f30664r;
    public kg.d f30665s;
    public Drawable v;
    public boolean f30666w;
    public boolean f30667x;
    public Runnable f30668y;

    public m10(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        gr grVar = gr.h;
        this.f30658a = new td.a(0, this, grVar, 380L, false);
        this.f30659b = new td.a(1, this, grVar, 380L, true);
        this.f30660c = new td.c(2, this, sd.a.f47511a, 280L);
        this.A = new AnimationNotificationsLocker();
        this.B = new ArrayList();
        this.d = b6Var;
        fg.g gVar = new fg.g(this, context, 5);
        this.f30664r = gVar;
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        gVar.setClipToPadding(true);
        gVar.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        gVar.setGravity(i9 | 16);
        gVar.addTextChangedListener(new bh.f(this, 10));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(gVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30661e = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, g7.e6.d(24, 24.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        addView(linearLayout, g7.e6.d(-2, -1.0f, i11 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30662f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 17));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(imageView2, g7.e6.d(24, 24.0f, i12 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ta1 ta1Var = new ta1(this, getContext(), 8);
        this.C = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setVisibility(0);
        addView(ta1Var, g7.e6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        d();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            ImageView imageView = this.f30662f;
            j10.d(imageView, f10);
            imageView.setRotation((1.0f - f10) * 90.0f);
        } else if (i9 == 1) {
            j10.d(this.f30661e, f10);
        } else if (i9 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    public final void b() {
        int i9;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f30660c.f47780e), AndroidUtilities.dp(48.0f));
        int measuredWidth = this.h.getMeasuredWidth() + AndroidUtilities.dp(48.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = measuredWidth;
        } else {
            i9 = max;
        }
        if (!z10) {
            max = measuredWidth;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        fg.g gVar = this.f30664r;
        rect.set(i9, 0, gVar.getMeasuredWidth() - max, gVar.getMeasuredHeight());
        gVar.setClipBounds(rect);
        gVar.setPadding(i9, 0, max, 0);
    }

    public final void c() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 < arrayList.size()) {
                if (((of.m0) arrayList.get(i9)).h) {
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
            } else {
                f();
                return;
            }
        }
    }

    @Override
    public final void d() {
        boolean q10;
        float f10;
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (b6Var != null) {
            q10 = b6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.f6.I.q();
        }
        if (this.f30666w) {
            b02 = org.telegram.ui.ActionBar.f6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f30667x) {
                l1 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
            } else {
                int i9 = org.telegram.ui.ActionBar.f6.G6;
                if (q10) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.05f;
                }
                l1 = org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            }
            b02 = org.telegram.ui.ActionBar.f6.b0(dp, l1);
        }
        this.v = b02;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        int l12 = org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.f30661e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        ImageView imageView = this.f30662f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        fg.g gVar = this.f30664r;
        gVar.setHintTextColor(l14);
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Yh, b6Var));
        kg.d dVar = this.f30665s;
        if (dVar != null) {
            dVar.u();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayout.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.ActionBar.w0) {
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) childAt;
                if (w0Var.getIconView() != null) {
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.f6.l1(0.6f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        ta1 ta1Var = this.C;
        int childCount2 = ta1Var.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            if (ta1Var.getChildAt(i12) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i12)).a();
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
        kg.d dVar = this.f30665s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f30665s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean e() {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (((of.m0) arrayList.get(i9)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        Integer num;
        boolean z10;
        int i9;
        int i10;
        ArrayList arrayList = this.B;
        boolean isEmpty = arrayList.isEmpty();
        this.f30659b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) gr.f28845g);
        transitionSet.addListener((Transition.TransitionListener) new k10(this));
        ta1 ta1Var = this.C;
        TransitionManager.beginDelayedTransition(ta1Var, transitionSet);
        int i11 = 0;
        while (i11 < ta1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i11)).getFilter())) {
                ta1Var.removeViewAt(i11);
                i11--;
            }
            i11++;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            of.m0 m0Var = (of.m0) arrayList2.get(i12);
            m0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.f23845r = true;
            v0Var.a();
            v0Var.setData(m0Var);
            v0Var.setOnClickListener(new s2(21, this, v0Var));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i9 = 6;
            } else {
                i9 = 0;
            }
            if (z11) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            ta1Var.addView(v0Var, g7.e6.t(-2, -1, 0, i9, 0, i10, 0));
        }
        for (int i13 = 0; i13 < ta1Var.getChildCount(); i13++) {
            org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) ta1Var.getChildAt(i13);
            if (i13 == this.E) {
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
        ta1Var.setTag(num);
    }

    public final void g(of.m0 m0Var) {
        org.telegram.ui.mx mxVar;
        if (m0Var.h) {
            ArrayList arrayList = this.B;
            arrayList.remove(m0Var);
            int i9 = this.E;
            if (i9 < 0 || i9 > arrayList.size() - 1) {
                this.E = arrayList.size() - 1;
            }
            f();
            l10 l10Var = this.D;
            if (l10Var != null && (mxVar = ((org.telegram.ui.ix) l10Var).f39313b.f37750y0) != null) {
                mxVar.Q(false);
            }
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        b();
    }

    public void setBlurredBackgroundVisibility(float f10) {
        boolean z10;
        int i9;
        int i10 = (int) (f10 * 255.0f);
        kg.d dVar = this.f30665s;
        boolean z11 = true;
        if (dVar != null && dVar.f14822j != i10) {
            dVar.setAlpha(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.v;
        if (drawable != null && drawable.getAlpha() != (i9 = 255 - i10)) {
            this.v.setAlpha(i9);
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidate();
        }
    }

    public void setCloseButtonOnClickListener(Runnable runnable) {
        this.f30668y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f30663n = z10;
        if (!z10 && this.f30664r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f30658a.a(z11, true);
    }

    public void setSearchFiltersListener(l10 l10Var) {
        this.D = l10Var;
    }

    public void setupBlurredBackground(kg.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.f30665s = dVar;
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
