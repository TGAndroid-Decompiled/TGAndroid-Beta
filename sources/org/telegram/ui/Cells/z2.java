package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.vy0;
public final class z2 extends LinearLayout {
    public static final int f31028x = 0;
    public float f31029a;
    public Runnable f31030b;
    public q0.a f31031c;
    public boolean d;
    public ValueAnimator f31032e;
    public final fh0 f31033f;
    public final TextView h;
    public final vy0 f31034n;
    public int f31035r;
    public int f31036s;
    public final int f31037w;

    public z2(final Context context) {
        super(context);
        this.f31035r = -1;
        this.f31037w = h10.f22829t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new fi.a(5));
        ?? imageView = new ImageView(context);
        this.f31033f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, mf.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f28046m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, mf.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f31034n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27939g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, mf.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f31032e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String M0 = bd.M0(2131748237, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.f31034n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f31029a, 1.0f).setDuration(250L);
        this.f31032e = duration;
        duration.setInterpolator(ks.d);
        this.f31032e.addUpdateListener(new x2(this, 0));
        this.f31032e.addListener(new y2(this, 1));
        this.f31032e.start();
    }

    public final void b() {
        int i3;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i3 = this.f31035r) == 2 || i3 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i10 = 0 - (getTop() / 2);
        }
        int i11 = this.f31035r;
        if (i11 == 0 || i11 == 1) {
            i10 -= (int) ((1.0f - this.f31029a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i10;
        this.f31033f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.f31034n.setTranslationY(f10);
    }

    @Override
    public final void offsetTopAndBottom(int i3) {
        super.offsetTopAndBottom(i3);
        b();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size;
        int size2;
        int i11 = this.f31035r;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= org.telegram.messenger.g0.f22602m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i10);
            }
            if (size2 == 0) {
                size2 = (org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m;
            }
            if (getParent() instanceof org.telegram.ui.Components.w9) {
                size2 -= ((org.telegram.ui.Components.w9) getParent()).f39971f3;
            }
            ArrayList arrayList = hp.s1(this.f31037w).f23113s;
            if (!arrayList.isEmpty()) {
                int L = org.telegram.messenger.g0.L(72.0f);
                size2 = org.telegram.messenger.camera.q.w(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size = (view2.getMeasuredHeight() - view2.getPaddingTop()) - view2.getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (size == 0) {
            size = (org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22602m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.g0.L(320.0f) - size) * this.f31029a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f31030b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f31031c = aVar;
    }
}
