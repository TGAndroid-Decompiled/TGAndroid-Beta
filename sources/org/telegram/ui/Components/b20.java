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
import org.telegram.ui.bc1;
public class b20 extends FrameLayout implements le.d, org.telegram.ui.ActionBar.z5 {
    public final AnimationNotificationsLocker E;
    public final ArrayList F;
    public final bc1 G;
    public a20 H;
    public int I;
    public final le.b f22568a;
    public final le.b f22569b;
    public final le.e f22570c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ImageView e;
    public final ImageView f22571f;
    public final LinearLayout h;
    public boolean f22572n;
    public final ci.h2 f22573r;
    public ch.d f22574s;
    public Drawable v;
    public boolean f22575w;
    public boolean f22576x;
    public Runnable f22577y;

    public b20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        qr qrVar = qr.h;
        this.f22568a = new le.b(0, this, qrVar, 380L, false);
        this.f22569b = new le.b(1, this, qrVar, 380L, true);
        this.f22570c = new le.e(2, this, ke.a.f13587a, 280L);
        this.E = new AnimationNotificationsLocker();
        this.F = new ArrayList();
        this.d = e6Var;
        ci.h2 h2Var = new ci.h2(this, context, 4);
        this.f22573r = h2Var;
        h2Var.setTextSize(1, 15.0f);
        h2Var.setCursorWidth(1.5f);
        h2Var.setInputType(h2Var.getInputType() | 176);
        h2Var.setSingleLine(true);
        h2Var.setBackground(null);
        h2Var.setVerticalScrollBarEnabled(false);
        h2Var.setHorizontalScrollBarEnabled(false);
        h2Var.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        h2Var.setClipToPadding(true);
        h2Var.setImeOptions(268435459);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h2Var.setGravity(i10 | 16);
        h2Var.addTextChangedListener(new ci.i2(this, 9));
        if (Build.VERSION.SDK_INT >= 35) {
            h2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(h2Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        addView(imageView, w7.x5.d(24, 24.0f, i11 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(linearLayout, w7.x5.d(-2, -1.0f, i12 | 16, 32.0f, 0.0f, 32.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f22571f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new f0(this, 17));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(imageView2, w7.x5.d(24, 24.0f, i13 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        bc1 bc1Var = new bc1(this, getContext(), 7);
        this.G = bc1Var;
        bc1Var.setOrientation(0);
        bc1Var.setVisibility(0);
        addView(bc1Var, w7.x5.d(-2, 32.0f, (LocaleController.isRTL ? 5 : 3) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        setWillNotDraw(false);
        b();
        e();
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            ImageView imageView = this.f22571f;
            y10.d(imageView, f7);
            imageView.setRotation((1.0f - f7) * 90.0f);
        } else if (i10 == 1) {
            y10.d(this.e, f7);
        } else if (i10 == 2) {
            b();
        }
    }

    public final void a(org.telegram.ui.ActionBar.v0 v0Var) {
        this.h.addView(v0Var);
    }

    public final void b() {
        int i10;
        int max = Math.max(AndroidUtilities.dp(6.0f) + ((int) this.f22570c.e), AndroidUtilities.dp(48.0f));
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
        ci.h2 h2Var = this.f22573r;
        rect.set(i10, 0, h2Var.getMeasuredWidth() - max, h2Var.getMeasuredHeight());
        h2Var.setClipBounds(rect);
        h2Var.setPadding(i10, 0, max, 0);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 < arrayList.size()) {
                if (((gg.q0) arrayList.get(i10)).h) {
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
                if (((gg.q0) arrayList.get(i10)).h) {
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
        ch.d dVar = this.f22574s;
        if (dVar != null) {
            dVar.setBounds(getPaddingLeft() - AndroidUtilities.dp(4.0f), getPaddingTop() - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (getWidth() - getPaddingRight()), AndroidUtilities.dp(4.0f) + (getHeight() - getPaddingBottom()));
            this.f22574s.draw(canvas);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        if (this.f22575w) {
            b02 = org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var));
        } else {
            int dp = AndroidUtilities.dp(20.0f);
            if (this.f22576x) {
                l1 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, e6Var);
            } else {
                int i10 = org.telegram.ui.ActionBar.i6.G6;
                if (q6) {
                    f7 = 0.07f;
                } else {
                    f7 = 0.05f;
                }
                l1 = org.telegram.ui.ActionBar.i6.l1(f7, org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
            }
            b02 = org.telegram.ui.ActionBar.i6.b0(dp, l1);
        }
        this.v = b02;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.6f, org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.e.setColorFilter(l12, mode);
        int l13 = org.telegram.ui.ActionBar.i6.l1(0.6f, org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        ImageView imageView = this.f22571f;
        imageView.setColorFilter(l13, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
        int l14 = org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        ci.h2 h2Var = this.f22573r;
        h2Var.setHintTextColor(l14);
        h2Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        h2Var.setCursorColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Yh, e6Var));
        ch.d dVar = this.f22574s;
        if (dVar != null) {
            dVar.v();
        }
        LinearLayout linearLayout = this.h;
        int childCount = linearLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = linearLayout.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.ActionBar.v0) {
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) childAt;
                if (v0Var.getIconView() != null) {
                    v0Var.getIconView().setColorFilter(org.telegram.ui.ActionBar.i6.l1(0.6f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var)), PorterDuff.Mode.MULTIPLY);
                }
                childAt.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, e6Var), 1, AndroidUtilities.dp(17.0f)));
            }
        }
        bc1 bc1Var = this.G;
        int childCount2 = bc1Var.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            if (bc1Var.getChildAt(i13) instanceof org.telegram.ui.ActionBar.u0) {
                ((org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i13)).a();
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
        this.f22569b.a(isEmpty, true);
        ArrayList arrayList2 = new ArrayList(arrayList);
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(1).setDuration(150L)).addTransition(changeBounds);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) qr.f27424g);
        transitionSet.addListener((Transition.TransitionListener) new z10(this));
        bc1 bc1Var = this.G;
        TransitionManager.beginDelayedTransition(bc1Var, transitionSet);
        int i12 = 0;
        while (i12 < bc1Var.getChildCount()) {
            if (!arrayList2.remove(((org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i12)).getFilter())) {
                bc1Var.removeViewAt(i12);
                i12--;
            }
            i12++;
        }
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            gg.q0 q0Var = (gg.q0) arrayList2.get(i13);
            q0Var.getClass();
            org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(getContext(), this.d);
            u0Var.f19563r = true;
            u0Var.a();
            u0Var.setData(q0Var);
            u0Var.setOnClickListener(new dt(4, this, u0Var));
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
            bc1Var.addView(u0Var, w7.x5.t(-2, -1, 0, i10, 0, i11, 0));
        }
        for (int i14 = 0; i14 < bc1Var.getChildCount(); i14++) {
            org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) bc1Var.getChildAt(i14);
            if (i14 == this.I) {
                z10 = true;
            } else {
                z10 = false;
            }
            u0Var2.setExpanded(z10);
        }
        if (!isEmpty) {
            num = 1;
        } else {
            num = null;
        }
        bc1Var.setTag(num);
    }

    public final void g(gg.q0 q0Var) {
        org.telegram.ui.ey eyVar;
        if (q0Var.h) {
            ArrayList arrayList = this.F;
            arrayList.remove(q0Var);
            int i10 = this.I;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.I = arrayList.size() - 1;
            }
            f();
            a20 a20Var = this.H;
            if (a20Var != null && (eyVar = ((org.telegram.ui.zx) a20Var).f40327b.C0) != null) {
                eyVar.Q(false);
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
        ch.d dVar = this.f22574s;
        boolean z11 = true;
        if (dVar != null && dVar.f4285l != i11) {
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
        this.f22577y = runnable;
    }

    public void setCloseButtonVisible(boolean z10) {
        boolean z11;
        this.f22572n = z10;
        if (!z10 && this.f22573r.length() <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f22568a.a(z11, true);
    }

    public void setSearchFiltersListener(a20 a20Var) {
        this.H = a20Var;
    }

    public void setupBlurredBackground(ch.d dVar) {
        dVar.q(AndroidUtilities.dp(20.0f));
        dVar.p(AndroidUtilities.dp(4.0f));
        this.f22574s = dVar;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
