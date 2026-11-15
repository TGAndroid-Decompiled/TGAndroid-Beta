package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.yy0;
public final class z2 extends LinearLayout {
    public static final int f32098x = 0;
    public float f32099a;
    public Runnable f32100b;
    public q0.a f32101c;
    public boolean d;
    public ValueAnimator f32102e;
    public final fh0 f32103f;
    public final TextView h;
    public final yy0 f32104n;
    public int f32105r;
    public int f32106s;
    public final int f32107w;

    public z2(final Context context) {
        super(context);
        this.f32105r = -1;
        this.f32107w = m10.f24940t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new gi.a(5));
        ?? imageView = new ImageView(context);
        this.f32103f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ja.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f29017m9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, c8.ja.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.f32104n = viewSwitcher;
        viewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                TextView textView2 = new TextView(context);
                org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28907g9, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                return textView2;
            }
        });
        viewSwitcher.setInAnimation(context, 2130771980);
        viewSwitcher.setOutAnimation(context, 2130771981);
        addView((View) viewSwitcher, c8.ja.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.f32102e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String M0 = hd.M0(2131748229, null);
            if (org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.P1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.f32104n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.f32099a, 1.0f).setDuration(250L);
        this.f32102e = duration;
        duration.setInterpolator(qs.d);
        this.f32102e.addUpdateListener(new x2(this, 0));
        this.f32102e.addListener(new y2(this, 1));
        this.f32102e.start();
    }

    public final void b() {
        int i7;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i7 = this.f32105r) == 2 || i7 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i10 = 0 - (getTop() / 2);
        }
        int i11 = this.f32105r;
        if (i11 == 0 || i11 == 1) {
            i10 -= (int) ((1.0f - this.f32099a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i10;
        this.f32103f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.f32104n.setTranslationY(f10);
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
        int i11 = this.f32105r;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), 1073741824));
                return;
            }
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size2 = view.getMeasuredHeight();
                if (view.getPaddingTop() != 0) {
                    size2 -= org.telegram.messenger.g0.f23605m;
                }
            } else {
                size2 = View.MeasureSpec.getSize(i10);
            }
            if (size2 == 0) {
                size2 = (org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m;
            }
            if (getParent() instanceof org.telegram.ui.Components.t9) {
                size2 -= ((org.telegram.ui.Components.t9) getParent()).f39610f3;
            }
            ArrayList arrayList = np.s1(this.f32107w).f25388s;
            if (!arrayList.isEmpty()) {
                int L = org.telegram.messenger.g0.L(72.0f);
                size2 = i20.w(50.0f, (arrayList.size() + (arrayList.size() * L)) - 1, size2);
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
            size = (org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((org.telegram.messenger.g0.L(320.0f) - size) * this.f32099a) + size), 1073741824));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.f32100b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.f32101c = aVar;
    }
}
