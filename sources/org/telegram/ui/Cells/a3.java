package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.ws;
public final class a3 extends LinearLayout {
    public static final int f30456x = 0;
    public float f30457a;
    public Runnable f30458b;
    public q0.a f30459c;
    public boolean d;
    public ValueAnimator f30460e;
    public final qh0 f30461f;
    public final TextView h;
    public final gz0 f30462n;
    public int f30463r;
    public int f30464s;
    public final int f30465w;

    public a3(final Context context) {
        super(context);
        this.f30463r = -1;
        this.f30465w = i10.f24637t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new gi.a(5));
        ?? imageView = new ImageView(context);
        this.f30461f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29619m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, c8.na.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f30462n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29509g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, c8.na.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f30460e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String N0 = gd.N0(2131748036, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                N0 = N0.replace('\n', ' ');
            }
            this.f30462n.a(N0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f30457a, 1.0f).setDuration(250L);
        this.f30460e = duration;
        duration.setInterpolator(ws.d);
        this.f30460e.addUpdateListener(new y2(this, 0));
        this.f30460e.addListener(new z2(this, 1));
        this.f30460e.start();
    }

    public final void b() {
        int i7;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i7 = this.f30463r) == 2 || i7 == 3 || i7 == 4) && ((View) getParent()).getPaddingTop() != 0)) {
            i10 = 0 - (getTop() / 2);
        }
        int i11 = this.f30463r;
        if (i11 == 0 || i11 == 1) {
            i10 -= (int) ((1.0f - this.f30457a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i10;
        this.f30461f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.f30462n.setTranslationY(f10);
    }

    @Override
    public final void offsetTopAndBottom(int i7) {
        super.offsetTopAndBottom(i7);
        b();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        int size2;
        int i11 = this.f30463r;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4) {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= org.telegram.messenger.g0.f24220m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i10);
            }
            if (size2 == 0) {
                size2 = (org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24220m;
            }
            if (getParent() instanceof org.telegram.ui.Components.aa) {
                size2 -= ((org.telegram.ui.Components.aa) getParent()).f33446f3;
            }
            ArrayList arrayList = mp.u1(this.f30465w).f25849s;
            if (!arrayList.isEmpty()) {
                int L = org.telegram.messenger.g0.L(72.0f);
                size2 = m10.x(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size = (view2.getMeasuredHeight() - view2.getPaddingTop()) - view2.getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (size == 0) {
            size = (org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24220m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.g0.L(320.0f) - size) * this.f30457a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f30458b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f30459c = aVar;
    }
}
