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
    public final ImageView f34517a;
    public final org.telegram.ui.ActionBar.n2 f34518b;
    public final org.telegram.ui.e61 f34519c;
    public final TextView d;
    public final g21 f34520e;
    public final View f34521f;
    public final View h;
    public final k21 f34522n;

    public i21(k21 k21Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f34522n = k21Var;
        View view = new View(context);
        this.f34521f = view;
        int i11 = org.telegram.ui.ActionBar.m6.f27963h5;
        org.telegram.ui.ActionBar.h6 h6Var = k21Var.I0;
        String str = k21Var.f35152t1;
        org.telegram.ui.ActionBar.t6.h(i11, view, h6Var);
        addView(view, c8.ha.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34517a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.h6 h6Var2 = k21Var.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i13, k21Var.I0), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.h6 h6Var3 = k21Var.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, h6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i21 f33450b;

            {
                this.f33450b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i14 = r2;
                i21 i21Var = this.f33450b;
                switch (i14) {
                    case 0:
                        i21Var.f34522n.dismiss();
                        return;
                    default:
                        g21 g21Var = i21Var.f34520e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i21Var.getContext(), null);
                        Drawable mutate = i21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        k21 k21Var2 = i21Var.f34522n;
                        org.telegram.ui.ActionBar.t6.x(i21Var, mutate, i15, k21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i16);
                            if (fdVar == null || (((str2 = fdVar.f22402c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (!fdVar2.f22404f.equals(k21Var2.f35152t1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(k21Var2.f35153u1, fdVar2.f22404f);
                                Context context2 = i21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, k21Var2.I0, z10, z9);
                                z0Var.setText(k21.K0(k21.O0(fdVar2.f22404f, null, null)));
                                z0Var.setChecked(TextUtils.equals(k21Var2.f35153u1, fdVar2.f22404f));
                                z0Var.setOnClickListener(new td0(i21Var, runnableArr, fdVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jr0(g1Var, 21);
                        g1Var.f27493e = true;
                        g1Var.f27492c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22567q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (g21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(k21Var2.f28672b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.ha.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(3, context, this);
        this.f34518b = n2Var;
        org.telegram.ui.ActionBar.t6.U(n2Var, i12, k21Var.I0);
        n2Var.setTextSize(1, 20.0f);
        n2Var.setTypeface(org.telegram.messenger.g0.o());
        n2Var.setText(org.telegram.messenger.id.M0(2131753766, null));
        n2Var.setPivotX(0.0f);
        n2Var.setPivotY(0.0f);
        addView(n2Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(16, context, this);
        this.f34519c = e61Var;
        if (org.telegram.messenger.id.f23161a0) {
            e61Var.setGravity(5);
        }
        e61Var.setPivotX(0.0f);
        e61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Dj, k21Var.I0);
            textView.setTextSize(1, 14.0f);
            textView.setText(k21.K0(k21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232682);
        int i14 = org.telegram.ui.ActionBar.m6.Dj;
        org.telegram.ui.ActionBar.t6.s(e10, i14, k21Var.I0, mode);
        if (org.telegram.messenger.id.f23161a0) {
            e10.setScaleX(-1.0f);
        }
        g21 g21Var = new g21(this, context);
        this.f34520e = g21Var;
        if (org.telegram.messenger.id.f23161a0) {
            g21Var.setGravity(5);
        }
        g21Var.b(0.25f, 350L, wq.h);
        org.telegram.ui.ActionBar.t6.Y(g21Var, i14, k21Var.I0);
        g21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        g21Var.setText(k21.K0(k21.O0(k21Var.f35153u1, null, null)));
        g21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        g21Var.setOnClickListener(new View.OnClickListener(this) {
            public final i21 f33450b;

            {
                this.f33450b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i142 = r2;
                i21 i21Var = this.f33450b;
                switch (i142) {
                    case 0:
                        i21Var.f34522n.dismiss();
                        return;
                    default:
                        g21 g21Var2 = i21Var.f34520e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(i21Var.getContext(), null);
                        Drawable mutate = i21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.m6.G8;
                        k21 k21Var2 = i21Var.f34522n;
                        org.telegram.ui.ActionBar.t6.x(i21Var, mutate, i15, k21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i16);
                            if (fdVar == null || (((str2 = fdVar.f22402c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (!fdVar2.f22404f.equals(k21Var2.f35152t1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(k21Var2.f35153u1, fdVar2.f22404f);
                                Context context2 = i21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, k21Var2.I0, z10, z9);
                                z0Var.setText(k21.K0(k21.O0(fdVar2.f22404f, null, null)));
                                z0Var.setChecked(TextUtils.equals(k21Var2.f35153u1, fdVar2.f22404f));
                                z0Var.setOnClickListener(new td0(i21Var, runnableArr, fdVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new jr0(g1Var, 21);
                        g1Var.f27493e = true;
                        g1Var.f27492c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        g21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22567q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (g21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(k21Var2.f28672b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.id.f23161a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            e61Var.addView(g21Var, c8.ha.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                e61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
                e61Var.addView(this.d, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                e61Var.addView(textView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
                e61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            e61Var.addView(g21Var, c8.ha.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(e61Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view2, k21Var.I0);
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
        float a10 = c8.j9.a((f10 - org.telegram.messenger.g0.f22561m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!k21.I0(this.f34522n)) {
            a10 = 1.0f;
        }
        float interpolation = wq.f40047g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.n2 n2Var = this.f34518b;
        n2Var.setScaleX(T1);
        n2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        n2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z9 = org.telegram.messenger.id.f23161a0;
        org.telegram.ui.e61 e61Var = this.f34519c;
        if (!z9) {
            n2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            e61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        e61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f34517a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
