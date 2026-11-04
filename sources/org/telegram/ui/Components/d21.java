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
public final class d21 extends FrameLayout {
    public final ImageView f32917a;
    public final org.telegram.ui.ActionBar.k2 f32918b;
    public final org.telegram.ui.s51 f32919c;
    public final TextView d;
    public final b21 f32920e;
    public final View f32921f;
    public final View h;
    public final f21 f32922n;

    public d21(f21 f21Var, Context context) {
        super(context);
        int i3;
        int i10;
        this.f32922n = f21Var;
        View view = new View(context);
        this.f32921f = view;
        int i11 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.e6 e6Var = f21Var.J0;
        String str = f21Var.f33672r1;
        org.telegram.ui.ActionBar.r6.i(i11, view, e6Var);
        addView(view, b8.mf.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f32917a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = f21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i12, e6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, f21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.e6 e6Var3 = f21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d21 f31713b;

            {
                this.f31713b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i14 = r2;
                d21 d21Var = this.f31713b;
                switch (i14) {
                    case 0:
                        d21Var.f32922n.dismiss();
                        return;
                    default:
                        b21 b21Var = d21Var.f32920e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(d21Var.getContext(), null);
                        Drawable mutate = d21Var.getContext().getDrawable(2131232562).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        f21 f21Var2 = d21Var.f32922n;
                        org.telegram.ui.ActionBar.r6.y(d21Var, mutate, i15, f21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.x00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.bd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i16);
                            if (ycVar == null || (((str2 = ycVar.f26563c) != null && str2.endsWith("_raw")) || !"remote".equals(ycVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.f00(org.telegram.messenger.bd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) arrayList.get(i17);
                            if (!ycVar2.f26565f.equals(f21Var2.f33672r1) && "remote".equals(ycVar2.d)) {
                                TextUtils.equals(f21Var2.f33673s1, ycVar2.f26565f);
                                Context context2 = d21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, f21Var2.J0, z11, z10);
                                y0Var.setText(f21.K0(f21.O0(ycVar2.f26565f, null, null)));
                                y0Var.setChecked(TextUtils.equals(f21Var2.f33673s1, ycVar2.f26565f));
                                y0Var.setOnClickListener(new ct(d21Var, runnableArr, ycVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new sp0(f1Var, 22);
                        f1Var.f27495e = true;
                        f1Var.f27494c = 220;
                        f1Var.setOutsideTouchable(true);
                        f1Var.setClippingEnabled(true);
                        f1Var.setAnimationStyle(2131755192);
                        f1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22608q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (b21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        f1Var.showAtLocation(f21Var2.f28586b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, b8.mf.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(3, context, this);
        this.f32918b = k2Var;
        org.telegram.ui.ActionBar.r6.V(k2Var, i12, f21Var.J0);
        k2Var.setTextSize(1, 20.0f);
        k2Var.setTypeface(org.telegram.messenger.g0.o());
        k2Var.setText(org.telegram.messenger.bd.M0(2131753766, null));
        k2Var.setPivotX(0.0f);
        k2Var.setPivotY(0.0f);
        addView(k2Var, b8.mf.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(17, context, this);
        this.f32919c = s51Var;
        if (org.telegram.messenger.bd.f21784a0) {
            s51Var.setGravity(5);
        }
        s51Var.setPivotX(0.0f);
        s51Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Dj, f21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(f21.K0(f21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232680);
        int i14 = org.telegram.ui.ActionBar.k6.Dj;
        org.telegram.ui.ActionBar.r6.t(e10, i14, f21Var.J0, mode);
        if (org.telegram.messenger.bd.f21784a0) {
            e10.setScaleX(-1.0f);
        }
        b21 b21Var = new b21(this, context);
        this.f32920e = b21Var;
        if (org.telegram.messenger.bd.f21784a0) {
            b21Var.setGravity(5);
        }
        b21Var.b(0.25f, 350L, xq.h);
        org.telegram.ui.ActionBar.r6.Z(b21Var, i14, f21Var.J0);
        b21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b21Var.setText(f21.K0(f21.O0(f21Var.f33673s1, null, null)));
        b21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        b21Var.setOnClickListener(new View.OnClickListener(this) {
            public final d21 f31713b;

            {
                this.f31713b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i142 = r2;
                d21 d21Var = this.f31713b;
                switch (i142) {
                    case 0:
                        d21Var.f32922n.dismiss();
                        return;
                    default:
                        b21 b21Var2 = d21Var.f32920e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(d21Var.getContext(), null);
                        Drawable mutate = d21Var.getContext().getDrawable(2131232562).mutate();
                        int i15 = org.telegram.ui.ActionBar.k6.G8;
                        f21 f21Var2 = d21Var.f32922n;
                        org.telegram.ui.ActionBar.r6.y(d21Var, mutate, i15, f21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.x00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.bd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i16);
                            if (ycVar == null || (((str2 = ycVar.f26563c) != null && str2.endsWith("_raw")) || !"remote".equals(ycVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.f00(org.telegram.messenger.bd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) arrayList.get(i17);
                            if (!ycVar2.f26565f.equals(f21Var2.f33672r1) && "remote".equals(ycVar2.d)) {
                                TextUtils.equals(f21Var2.f33673s1, ycVar2.f26565f);
                                Context context2 = d21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, f21Var2.J0, z11, z10);
                                y0Var.setText(f21.K0(f21.O0(ycVar2.f26565f, null, null)));
                                y0Var.setChecked(TextUtils.equals(f21Var2.f33673s1, ycVar2.f26565f));
                                y0Var.setOnClickListener(new ct(d21Var, runnableArr, ycVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new sp0(f1Var, 22);
                        f1Var.f27495e = true;
                        f1Var.f27494c = 220;
                        f1Var.setOutsideTouchable(true);
                        f1Var.setClippingEnabled(true);
                        f1Var.setAnimationStyle(2131755192);
                        f1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        b21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22608q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (b21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        f1Var.showAtLocation(f21Var2.f28586b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.bd.f21784a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            s51Var.addView(b21Var, b8.mf.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                s51Var.addView(e10, b8.mf.t(-2, -2, 16, 0, 1, 0, 0));
                s51Var.addView(this.d, b8.mf.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                s51Var.addView(textView2, b8.mf.t(-2, -2, 16, 0, 0, 4, 0));
                s51Var.addView(e10, b8.mf.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i3 = 3;
            } else {
                i3 = 0;
            }
            s51Var.addView(b21Var, b8.mf.t(-2, -2, 16, i3, 0, 0, 0));
        }
        addView(s51Var, b8.mf.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, f21Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, b8.mf.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = b8.be.a((f10 - org.telegram.messenger.g0.f22602m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!f21.I0(this.f32922n)) {
            a10 = 1.0f;
        }
        float interpolation = xq.f40453g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.k2 k2Var = this.f32918b;
        k2Var.setScaleX(T1);
        k2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        k2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        org.telegram.ui.s51 s51Var = this.f32919c;
        if (!z10) {
            k2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            s51Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        s51Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f32917a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
