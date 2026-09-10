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
import org.telegram.ui.gc1;
public class k20 extends FrameLayout implements le.d, org.telegram.ui.ActionBar.a6 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final gc1 G;
    public j20 H;
    public int I;
    public final le.b f24567a;
    public final le.b f24568b;
    public final le.e f24569c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final ImageView e;
    public final ImageView f24570f;
    public final LinearLayout h;
    public boolean f24571n;
    public final bi.t2 f24572r;
    public bh.d f24573s;
    public Drawable v;
    public boolean f24574w;
    public boolean f24575x;
    public Runnable f24576y;

    public k20(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        wr wrVar = wr.h;
        this.f24567a = new le.b(0, this, wrVar, 380L, false);
        this.f24568b = new le.b(1, this, wrVar, 380L, true);
        this.f24569c = new le.e(2, this, ke.a.f12431a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = f6Var;
        bi.t2 t2Var = new bi.t2(this, context, 4);
        this.f24572r = t2Var;
        t2Var.setTextSize(1, 15.0f);
        t2Var.setCursorWidth(1.5f);
        t2Var.setInputType(t2Var.getInputType() | 176);
        t2Var.setSingleLine(true);
        t2Var.setBackground(null);
        t2Var.setVerticalScrollBarEnabled(false);
        t2Var.setHorizontalScrollBarEnabled(false);
        t2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        t2Var.setClipToPadding(true);
        t2Var.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t2Var.setGravity(i10 | 16);
        t2Var.addTextChangedListener(new bi.u2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            t2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(t2Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        addView(imageView, w7.a6.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.a6.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24570f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h0(this, 17));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.a6.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        gc1 gc1Var = new gc1(this, getContext(), 7);
        this.G = gc1Var;
        gc1Var.setOrientation(0);
        gc1Var.setVisibility(0);
        addView(gc1Var, w7.a6.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f24570f;
            h20.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            h20.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.w0 w0Var) {
        this.h.addView(w0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f24569c.e), AndroidUtilities.dp(48.0f));
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
        bi.t2 t2Var = this.f24572r;
        rect.set(i10, 0, t2Var.getMeasuredWidth() - max, t2Var.getMeasuredHeight());
        t2Var.setClipBounds(rect);
        t2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((fg.q0) arrayList.get(i10)).h) {
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
        ArrayList arrayList = this.F;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((fg.q0) arrayList.get(i10)).h) {
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
        bh.d dVar = this.f24573s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f24573s.draw(canvas);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        boolean q6;
        float f7;
        int l1;
        Drawable b02;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        if (this.f24574w) {
            b02 = org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f24575x) {
                l1 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.j6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                l1 = org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            }
            b02 = org.telegram.ui.ActionBar.j6.b0(dp, l1);
        }
        this.v = b02;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        ImageView imageView = this.f24570f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        bi.t2 t2Var = this.f24572r;
        t2Var.setHintTextColor(l14);
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yh, f6Var));
        bh.d dVar = this.f24573s;
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
                    w0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.j6.l1(0.6f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        gc1 gc1Var = this.G;
        int childCount2 = gc1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (gc1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.v0) {
                ((org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i13)).a();
            }
        }
        invalidate();
    }

    public final void f() {
        Integer num;
        boolean z10;
        int i10;
        int i11;
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        this.f24568b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) wr.f28820g);
        transitionSet.addListener((Transition.TransitionListener) new i20(this));
        gc1 gc1Var = this.G;
        TransitionManager.beginDelayedTransition(gc1Var, transitionSet);
        int i12 = 0;
        while (i12 < gc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i12)).getFilter())) {
                gc1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            fg.q0 q0Var = (fg.q0) arrayList2.get(i13);
            q0Var.getClass();
            org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(getContext(), this.d);
            v0Var.f18665r = true;
            v0Var.a();
            v0Var.setData(q0Var);
            v0Var.setOnClickListener(new u10(1, this, v0Var));
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
            gc1Var.addView(v0Var, w7.a6.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < gc1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.v0 v0Var2 = (org.telegram.ui.ActionBar.v0) gc1Var.getChildAt(i14);
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
        gc1Var.setTag(num);
    }

    public final void g(fg.q0 q0Var) {
        org.telegram.ui.gy gyVar;
        if (q0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(q0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            j20 j20Var = this.H;
            if (j20Var != null && (gyVar = ((org.telegram.ui.cy) j20Var).f31787b.C0) != null) {
                gyVar.Q(false);
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

    public void setBlurredBackgroundVisibility(float f7) {
        boolean z10;
        int i10;
        int i11 = (int) (f7 * 255.0f);
        bh.d dVar = this.f24573s;
        boolean z11 = true;
        if (dVar != null && dVar.f2275j != i11) {
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
        this.f24576y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f24571n = z10;
        if (!z10 && this.f24572r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f24567a.a(z11, true);
    }

    public void setSearchFiltersListener(j20 j20Var) {
        this.H = j20Var;
    }

    public void setupBlurredBackground(bh.d dVar) {
        dVar.p(AndroidUtilities.dp(20.0f));
        dVar.o(AndroidUtilities.dp(4.0f));
        this.f24573s = dVar;
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
