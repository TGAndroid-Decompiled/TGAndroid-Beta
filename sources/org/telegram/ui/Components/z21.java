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
public final class z21 extends FrameLayout {
    public final ImageView f42612a;
    public final org.telegram.ui.ActionBar.n2 f42613b;
    public final org.telegram.ui.d61 f42614c;
    public final TextView d;
    public final x21 f42615e;
    public final View f42616f;
    public final View h;
    public final b31 f42617n;

    public z21(b31 b31Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f42617n = b31Var;
        View view = new View(context);
        this.f42616f = view;
        int i11 = org.telegram.ui.ActionBar.m6.f29420h5;
        org.telegram.ui.ActionBar.h6 h6Var = b31Var.J0;
        String str = b31Var.f33706u1;
        org.telegram.ui.ActionBar.t6.h(i11, view, h6Var);
        addView(view, c8.na.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42612a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.h6 h6Var2 = b31Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.m6.f29439i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, b31Var.J0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.h6 h6Var3 = b31Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final z21 f41609b;

            {
                this.f41609b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i14 = r2;
                z21 z21Var = this.f41609b;
                switch (i14) {
                    case 0:
                        z21Var.f42617n.dismiss();
                        return;
                    default:
                        x21 x21Var = z21Var.f42615e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z21Var.getContext(), null);
                        Drawable mutate = z21Var.getContext().getDrawable(2131232566).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        b31 b31Var2 = z21Var.f42617n;
                        org.telegram.ui.ActionBar.t6.x(z21Var, mutate, i15, b31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.a10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.f23495c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.i00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f23497f.equals(b31Var2.f33706u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(b31Var2.f33707v1, ddVar2.f23497f);
                                Context context2 = z21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, b31Var2.J0, z11, z10);
                                y0Var.setText(b31.L0(b31.P0(ddVar2.f23497f, null, null)));
                                y0Var.setChecked(TextUtils.equals(b31Var2.f33707v1, ddVar2.f23497f));
                                y0Var.setOnClickListener(new st(z21Var, runnableArr, ddVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new cp0(g1Var, 23);
                        g1Var.f28943e = true;
                        g1Var.f28942c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24010q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (x21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(b31Var2.f30142b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.na.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(3, context, this);
        this.f42613b = n2Var;
        org.telegram.ui.ActionBar.t6.U(n2Var, i12, b31Var.J0);
        n2Var.setTextSize(1, 20.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setText(org.telegram.messenger.hd.N0(2131753763, null));
        n2Var.setPivotX(0.0f);
        n2Var.setPivotY(0.0f);
        addView(n2Var, c8.na.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(17, context, this);
        this.f42614c = d61Var;
        if (org.telegram.messenger.hd.f24408a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gj, b31Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(b31.L0(b31.P0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.o10.e(context, 2131232684);
        int i14 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.s(e10, i14, b31Var.J0, mode);
        if (org.telegram.messenger.hd.f24408a0) {
            e10.setScaleX(-1.0f);
        }
        x21 x21Var = new x21(this, context);
        this.f42615e = x21Var;
        if (org.telegram.messenger.hd.f24408a0) {
            x21Var.setGravity(5);
        }
        x21Var.b(0.25f, 350L, nr.h);
        org.telegram.ui.ActionBar.t6.Y(x21Var, i14, b31Var.J0);
        x21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x21Var.setText(b31.L0(b31.P0(b31Var.f33707v1, null, null)));
        x21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        x21Var.setOnClickListener(new View.OnClickListener(this) {
            public final z21 f41609b;

            {
                this.f41609b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i142 = r2;
                z21 z21Var = this.f41609b;
                switch (i142) {
                    case 0:
                        z21Var.f42617n.dismiss();
                        return;
                    default:
                        x21 x21Var2 = z21Var.f42615e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z21Var.getContext(), null);
                        Drawable mutate = z21Var.getContext().getDrawable(2131232566).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        b31 b31Var2 = z21Var.f42617n;
                        org.telegram.ui.ActionBar.t6.x(z21Var, mutate, i15, b31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.a10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.f23495c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.i00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f23497f.equals(b31Var2.f33706u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(b31Var2.f33707v1, ddVar2.f23497f);
                                Context context2 = z21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, b31Var2.J0, z11, z10);
                                y0Var.setText(b31.L0(b31.P0(ddVar2.f23497f, null, null)));
                                y0Var.setChecked(TextUtils.equals(b31Var2.f33707v1, ddVar2.f23497f));
                                y0Var.setOnClickListener(new st(z21Var, runnableArr, ddVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new cp0(g1Var, 23);
                        g1Var.f28943e = true;
                        g1Var.f28942c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        x21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24010q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (x21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(b31Var2.f30142b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.hd.f24408a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            d61Var.addView(x21Var, c8.na.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                d61Var.addView(e10, c8.na.t(-2, -2, 16, 0, 1, 0, 0));
                d61Var.addView(this.d, c8.na.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                d61Var.addView(textView2, c8.na.t(-2, -2, 16, 0, 0, 4, 0));
                d61Var.addView(e10, c8.na.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            d61Var.addView(x21Var, c8.na.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(d61Var, c8.na.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view2, b31Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, c8.na.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.m9.a((f10 - org.telegram.messenger.g0.f24004m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!b31.J0(this.f42617n)) {
            a10 = 1.0f;
        }
        float interpolation = nr.f37918g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.n2 n2Var = this.f42613b;
        n2Var.setScaleX(T1);
        n2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        n2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.hd.f24408a0;
        org.telegram.ui.d61 d61Var = this.f42614c;
        if (!z10) {
            n2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            d61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        d61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f42612a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
