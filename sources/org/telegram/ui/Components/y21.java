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
public final class y21 extends FrameLayout {
    public final ImageView f42308a;
    public final org.telegram.ui.ActionBar.n2 f42309b;
    public final org.telegram.ui.b61 f42310c;
    public final TextView d;
    public final w21 f42311e;
    public final View f42312f;
    public final View h;
    public final a31 f42313n;

    public y21(a31 a31Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f42313n = a31Var;
        View view = new View(context);
        this.f42312f = view;
        int i11 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.i6 i6Var = a31Var.J0;
        String str = a31Var.f33356u1;
        org.telegram.ui.ActionBar.u6.h(i11, view, i6Var);
        addView(view, c8.na.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42308a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231243);
        int i12 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.i6 i6Var2 = a31Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, a31Var.J0), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        org.telegram.ui.ActionBar.i6 i6Var3 = a31Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y21 f40546b;

            {
                this.f40546b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i14 = r2;
                y21 y21Var = this.f40546b;
                switch (i14) {
                    case 0:
                        y21Var.f42313n.dismiss();
                        return;
                    default:
                        w21 w21Var = y21Var.f42311e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(y21Var.getContext(), null);
                        Drawable mutate = y21Var.getContext().getDrawable(2131232569).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        a31 a31Var2 = y21Var.f42313n;
                        org.telegram.ui.ActionBar.u6.x(y21Var, mutate, i15, a31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.y00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.f23445c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.g00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f23447f.equals(a31Var2.f33356u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(a31Var2.f33357v1, cdVar2.f23447f);
                                Context context2 = y21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, a31Var2.J0, z11, z10);
                                y0Var.setText(a31.L0(a31.P0(cdVar2.f23447f, null, null)));
                                y0Var.setChecked(TextUtils.equals(a31Var2.f33357v1, cdVar2.f23447f));
                                y0Var.setOnClickListener(new qt(y21Var, runnableArr, cdVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new bp0(g1Var, 23);
                        g1Var.f29036e = true;
                        g1Var.f29035c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        w21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24226q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (w21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(a31Var2.f30226b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.na.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(3, context, this);
        this.f42309b = n2Var;
        org.telegram.ui.ActionBar.u6.U(n2Var, i12, a31Var.J0);
        n2Var.setTextSize(1, 20.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setText(org.telegram.messenger.gd.N0(2131753763, null));
        n2Var.setPivotX(0.0f);
        n2Var.setPivotY(0.0f);
        addView(n2Var, c8.na.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(17, context, this);
        this.f42310c = b61Var;
        if (org.telegram.messenger.gd.f24314a0) {
            b61Var.setGravity(5);
        }
        b61Var.setPivotX(0.0f);
        b61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Gj, a31Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(a31.L0(a31.P0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.m10.e(context, 2131232687);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.s(e10, i14, a31Var.J0, mode);
        if (org.telegram.messenger.gd.f24314a0) {
            e10.setScaleX(-1.0f);
        }
        w21 w21Var = new w21(this, context);
        this.f42311e = w21Var;
        if (org.telegram.messenger.gd.f24314a0) {
            w21Var.setGravity(5);
        }
        w21Var.b(0.25f, 350L, kr.h);
        org.telegram.ui.ActionBar.u6.Y(w21Var, i14, a31Var.J0);
        w21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w21Var.setText(a31.L0(a31.P0(a31Var.f33357v1, null, null)));
        w21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        w21Var.setOnClickListener(new View.OnClickListener(this) {
            public final y21 f40546b;

            {
                this.f40546b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i142 = r2;
                y21 y21Var = this.f40546b;
                switch (i142) {
                    case 0:
                        y21Var.f42313n.dismiss();
                        return;
                    default:
                        w21 w21Var2 = y21Var.f42311e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(y21Var.getContext(), null);
                        Drawable mutate = y21Var.getContext().getDrawable(2131232569).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        a31 a31Var2 = y21Var.f42313n;
                        org.telegram.ui.ActionBar.u6.x(y21Var, mutate, i15, a31Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.y00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.f23445c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.g00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f23447f.equals(a31Var2.f33356u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(a31Var2.f33357v1, cdVar2.f23447f);
                                Context context2 = y21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(2, context2, a31Var2.J0, z11, z10);
                                y0Var.setText(a31.L0(a31.P0(cdVar2.f23447f, null, null)));
                                y0Var.setChecked(TextUtils.equals(a31Var2.f33357v1, cdVar2.f23447f));
                                y0Var.setOnClickListener(new qt(y21Var, runnableArr, cdVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new bp0(g1Var, 23);
                        g1Var.f29036e = true;
                        g1Var.f29035c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        w21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24226q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (w21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(a31Var2.f30226b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.gd.f24314a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            b61Var.addView(w21Var, c8.na.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                b61Var.addView(e10, c8.na.t(-2, -2, 16, 0, 1, 0, 0));
                b61Var.addView(this.d, c8.na.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                b61Var.addView(textView2, c8.na.t(-2, -2, 16, 0, 0, 4, 0));
                b61Var.addView(e10, c8.na.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            b61Var.addView(w21Var, c8.na.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(b61Var, c8.na.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view2, a31Var.J0);
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
        float a10 = c8.m9.a((f10 - org.telegram.messenger.g0.f24220m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!a31.J0(this.f42313n)) {
            a10 = 1.0f;
        }
        float interpolation = kr.f36859g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.n2 n2Var = this.f42309b;
        n2Var.setScaleX(T1);
        n2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        n2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.gd.f24314a0;
        org.telegram.ui.b61 b61Var = this.f42310c;
        if (!z10) {
            n2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            b61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        b61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f42308a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
