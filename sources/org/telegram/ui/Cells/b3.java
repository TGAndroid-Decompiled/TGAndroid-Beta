package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.vs;
public final class b3 extends LinearLayout {
    public static final int f21709x = 0;
    public float f21710a;
    public Runnable f21711b;
    public q0.a f21712c;
    public boolean d;
    public ValueAnimator e;
    public final ei0 f21713f;
    public final TextView h;
    public final a01 f21714n;
    public int f21715r;
    public int f21716s;
    public final int f21717w;

    public b3(final Context context) {
        super(context);
        this.f21715r = -1;
        this.f21717w = d20.f15147s0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(4));
        ?? imageView = new ImageView(context);
        this.f21713f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.b6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21098m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f21714n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f20988g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, w7.b6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String L0 = cd.L0(2131748246, null);
            if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.P1()) {
                L0 = L0.replace('\n', ' ');
            }
            this.f21714n.a(L0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f21710a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(vs.d);
        this.e.addUpdateListener(new z2(this, 0));
        this.e.addListener(new a3(this, 1));
        this.e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.f21715r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.f21715r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.f21710a) * (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
        }
        float f7 = i11;
        this.f21713f.setTranslationY(f7);
        this.h.setTranslationY(f7);
        this.f21714n.setTranslationY(f7);
    }

    @Override
    public final void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        b();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        int i12 = this.f21715r;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= org.telegram.messenger.i0.f16020m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i11);
            }
            if (size2 == 0) {
                size2 = (org.telegram.messenger.i0.f16026q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16020m;
            }
            if (getParent() instanceof org.telegram.ui.Components.r9) {
                size2 -= ((org.telegram.ui.Components.r9) getParent()).f29884e3;
            }
            ArrayList arrayList = vp.r1(this.f21717w).f18893s;
            if (!arrayList.isEmpty()) {
                int L = org.telegram.messenger.i0.L(72.0f);
                size2 = z20.w(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size = (view2.getMeasuredHeight() - view2.getPaddingTop()) - view2.getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        if (size == 0) {
            size = (org.telegram.messenger.i0.f16026q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16020m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.i0.L(320.0f) - size) * this.f21710a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f21711b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f21712c = aVar;
    }
}
