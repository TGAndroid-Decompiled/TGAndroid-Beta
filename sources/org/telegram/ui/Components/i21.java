package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i21 extends FrameLayout {
    public final ImageView f34467a;
    public final org.telegram.ui.ActionBar.m2 f34468b;
    public final org.telegram.ui.c61 f34469c;
    public final TextView d;
    public final g21 f34470e;
    public final View f34471f;
    public final View h;
    public final k21 f34472n;

    public i21(k21 k21Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f34472n = k21Var;
        View view = new View(context);
        this.f34471f = view;
        int i11 = org.telegram.ui.ActionBar.k6.f27922h5;
        org.telegram.ui.ActionBar.f6 f6Var = k21Var.I0;
        String str = k21Var.f35144q1;
        org.telegram.ui.ActionBar.r6.i(i11, view, f6Var);
        addView(view, c8.ha.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34467a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.k6.f27957j5;
        org.telegram.ui.ActionBar.f6 f6Var2 = k21Var.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i12, f6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.k6.f27941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, k21Var.I0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.f6 f6Var3 = k21Var.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, f6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i21 f33442b;

            {
                this.f33442b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i14 = r2;
                i21 i21Var = this.f33442b;
                switch (i14) {
                    case 0:
                        i21Var.f34472n.dismiss();
                        return;
                    default:
                        g21 g21Var = i21Var.f34470e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i21Var.getContext(), null);
                        Drawable mutate = i21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        k21 k21Var2 = i21Var.f34472n;
                        org.telegram.ui.ActionBar.r6.y(i21Var, mutate, i15, k21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) arrayList.get(i16);
                            if (edVar == null || (((str2 = edVar.f22183c) != null && str2.endsWith("_raw")) || !"remote".equals(edVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) arrayList.get(i17);
                            if (!edVar2.f22185f.equals(k21Var2.f35144q1) && "remote".equals(edVar2.d)) {
                                TextUtils.equals(k21Var2.f35145r1, edVar2.f22185f);
                                Context context2 = i21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, k21Var2.I0, z10, z9);
                                z0Var.setText(k21.K0(k21.O0(edVar2.f22185f, null, null)));
                                z0Var.setChecked(TextUtils.equals(k21Var2.f35145r1, edVar2.f22185f));
                                z0Var.setOnClickListener(new td0(i21Var, runnableArr, edVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ir0(g1Var, 21);
                        g1Var.f27482e = true;
                        g1Var.f27481c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22544q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (g21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(k21Var2.f28616b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.ha.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(3, context, this);
        this.f34468b = m2Var;
        org.telegram.ui.ActionBar.r6.V(m2Var, i12, k21Var.I0);
        m2Var.setTextSize(1, 20.0f);
        m2Var.setTypeface(org.telegram.messenger.g0.o());
        m2Var.setText(org.telegram.messenger.hd.M0(2131753766, null));
        m2Var.setPivotX(0.0f);
        m2Var.setPivotY(0.0f);
        addView(m2Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(16, context, this);
        this.f34469c = c61Var;
        if (org.telegram.messenger.hd.f22878a0) {
            c61Var.setGravity(5);
        }
        c61Var.setPivotX(0.0f);
        c61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Dj, k21Var.I0);
            textView.setTextSize(1, 14.0f);
            textView.setText(k21.K0(k21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232682);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.t(e10, i14, k21Var.I0, mode);
        if (org.telegram.messenger.hd.f22878a0) {
            e10.setScaleX(-1.0f);
        }
        g21 g21Var = new g21(this, context);
        this.f34470e = g21Var;
        if (org.telegram.messenger.hd.f22878a0) {
            g21Var.setGravity(5);
        }
        g21Var.b(0.25f, 350L, xq.h);
        org.telegram.ui.ActionBar.r6.Z(g21Var, i14, k21Var.I0);
        g21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        g21Var.setText(k21.K0(k21.O0(k21Var.f35145r1, null, null)));
        g21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        g21Var.setOnClickListener(new View.OnClickListener(this) {
            public final i21 f33442b;

            {
                this.f33442b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i142 = r2;
                i21 i21Var = this.f33442b;
                switch (i142) {
                    case 0:
                        i21Var.f34472n.dismiss();
                        return;
                    default:
                        g21 g21Var2 = i21Var.f34470e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i21Var.getContext(), null);
                        Drawable mutate = i21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        k21 k21Var2 = i21Var.f34472n;
                        org.telegram.ui.ActionBar.r6.y(i21Var, mutate, i15, k21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) arrayList.get(i16);
                            if (edVar == null || (((str2 = edVar.f22183c) != null && str2.endsWith("_raw")) || !"remote".equals(edVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) arrayList.get(i17);
                            if (!edVar2.f22185f.equals(k21Var2.f35144q1) && "remote".equals(edVar2.d)) {
                                TextUtils.equals(k21Var2.f35145r1, edVar2.f22185f);
                                Context context2 = i21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, k21Var2.I0, z10, z9);
                                z0Var.setText(k21.K0(k21.O0(edVar2.f22185f, null, null)));
                                z0Var.setChecked(TextUtils.equals(k21Var2.f35145r1, edVar2.f22185f));
                                z0Var.setOnClickListener(new td0(i21Var, runnableArr, edVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ir0(g1Var, 21);
                        g1Var.f27482e = true;
                        g1Var.f27481c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22544q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (g21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(k21Var2.f28616b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.hd.f22878a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            c61Var.addView(g21Var, c8.ha.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                c61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
                c61Var.addView(this.d, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                c61Var.addView(textView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
                c61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            c61Var.addView(g21Var, c8.ha.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(c61Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, k21Var.I0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ha.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.j9.a((f10 - org.telegram.messenger.g0.f22538m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!k21.I0(this.f34472n)) {
            a10 = 1.0f;
        }
        float interpolation = xq.f40346g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.m2 m2Var = this.f34468b;
        m2Var.setScaleX(T1);
        m2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        m2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z9 = org.telegram.messenger.hd.f22878a0;
        org.telegram.ui.c61 c61Var = this.f34469c;
        if (!z9) {
            m2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            c61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        c61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f34467a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
