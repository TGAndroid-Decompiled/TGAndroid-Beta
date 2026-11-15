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
public final class n21 extends FrameLayout {
    public final ImageView f37435a;
    public final org.telegram.ui.ActionBar.l2 f37436b;
    public final org.telegram.ui.z51 f37437c;
    public final TextView d;
    public final l21 f37438e;
    public final View f37439f;
    public final View h;
    public final p21 f37440n;

    public n21(p21 p21Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f37440n = p21Var;
        View view = new View(context);
        this.f37439f = view;
        int i11 = org.telegram.ui.ActionBar.j6.f28922h5;
        org.telegram.ui.ActionBar.e6 e6Var = p21Var.J0;
        String str = p21Var.f38177u1;
        org.telegram.ui.ActionBar.q6.h(i11, view, e6Var);
        addView(view, c8.ja.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37435a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.e6 e6Var2 = p21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i13, p21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.e6 e6Var3 = p21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, e6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final n21 f36265b;

            {
                this.f36265b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i14 = r2;
                n21 n21Var = this.f36265b;
                switch (i14) {
                    case 0:
                        n21Var.f37440n.dismiss();
                        return;
                    default:
                        l21 l21Var = n21Var.f37438e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(n21Var.getContext(), null);
                        Drawable mutate = n21Var.getContext().getDrawable(2131232565).mutate();
                        int i15 = org.telegram.ui.ActionBar.j6.G8;
                        p21 p21Var2 = n21Var.f37440n;
                        org.telegram.ui.ActionBar.q6.x(n21Var, mutate, i15, p21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.c10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.f23060c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.k00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f23062f.equals(p21Var2.f38177u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(p21Var2.f38178v1, ddVar2.f23062f);
                                Context context2 = n21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, p21Var2.J0, z11, z10);
                                z0Var.setText(p21.K0(p21.O0(ddVar2.f23062f, null, null)));
                                z0Var.setChecked(TextUtils.equals(p21Var2.f38178v1, ddVar2.f23062f));
                                z0Var.setOnClickListener(new lt(n21Var, runnableArr, ddVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ro0(g1Var, 24);
                        g1Var.f28555e = true;
                        g1Var.f28554c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        l21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f23609q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (l21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(p21Var2.f29682b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.ja.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(3, context, this);
        this.f37436b = l2Var;
        org.telegram.ui.ActionBar.q6.U(l2Var, i12, p21Var.J0);
        l2Var.setTextSize(1, 20.0f);
        l2Var.setTypeface(org.telegram.messenger.g0.o());
        l2Var.setText(org.telegram.messenger.hd.M0(2131753766, null));
        l2Var.setPivotX(0.0f);
        l2Var.setPivotY(0.0f);
        addView(l2Var, c8.ja.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(18, context, this);
        this.f37437c = z51Var;
        if (org.telegram.messenger.hd.f24101a0) {
            z51Var.setGravity(5);
        }
        z51Var.setPivotX(0.0f);
        z51Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Gj, p21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(p21.K0(p21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.i20.e(context, 2131232683);
        int i14 = org.telegram.ui.ActionBar.j6.Gj;
        org.telegram.ui.ActionBar.q6.s(e10, i14, p21Var.J0, mode);
        if (org.telegram.messenger.hd.f24101a0) {
            e10.setScaleX(-1.0f);
        }
        l21 l21Var = new l21(this, context);
        this.f37438e = l21Var;
        if (org.telegram.messenger.hd.f24101a0) {
            l21Var.setGravity(5);
        }
        l21Var.b(0.25f, 350L, er.h);
        org.telegram.ui.ActionBar.q6.Y(l21Var, i14, p21Var.J0);
        l21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        l21Var.setText(p21.K0(p21.O0(p21Var.f38178v1, null, null)));
        l21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        l21Var.setOnClickListener(new View.OnClickListener(this) {
            public final n21 f36265b;

            {
                this.f36265b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i142 = r2;
                n21 n21Var = this.f36265b;
                switch (i142) {
                    case 0:
                        n21Var.f37440n.dismiss();
                        return;
                    default:
                        l21 l21Var2 = n21Var.f37438e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(n21Var.getContext(), null);
                        Drawable mutate = n21Var.getContext().getDrawable(2131232565).mutate();
                        int i15 = org.telegram.ui.ActionBar.j6.G8;
                        p21 p21Var2 = n21Var.f37440n;
                        org.telegram.ui.ActionBar.q6.x(n21Var, mutate, i15, p21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.c10.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.hd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i16);
                            if (ddVar == null || (((str2 = ddVar.f23060c) != null && str2.endsWith("_raw")) || !"remote".equals(ddVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.k00(org.telegram.messenger.hd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.dd ddVar2 = (org.telegram.messenger.dd) arrayList.get(i17);
                            if (!ddVar2.f23062f.equals(p21Var2.f38177u1) && "remote".equals(ddVar2.d)) {
                                TextUtils.equals(p21Var2.f38178v1, ddVar2.f23062f);
                                Context context2 = n21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, p21Var2.J0, z11, z10);
                                z0Var.setText(p21.K0(p21.O0(ddVar2.f23062f, null, null)));
                                z0Var.setChecked(TextUtils.equals(p21Var2.f38178v1, ddVar2.f23062f));
                                z0Var.setOnClickListener(new lt(n21Var, runnableArr, ddVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ro0(g1Var, 24);
                        g1Var.f28555e = true;
                        g1Var.f28554c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        l21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f23609q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (l21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(p21Var2.f29682b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.hd.f24101a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            z51Var.addView(l21Var, c8.ja.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                z51Var.addView(e10, c8.ja.t(-2, -2, 16, 0, 1, 0, 0));
                z51Var.addView(this.d, c8.ja.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                z51Var.addView(textView2, c8.ja.t(-2, -2, 16, 0, 0, 4, 0));
                z51Var.addView(e10, c8.ja.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            z51Var.addView(l21Var, c8.ja.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(z51Var, c8.ja.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view2, p21Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ja.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.i9.a((f10 - org.telegram.messenger.g0.f23603m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!p21.I0(this.f37440n)) {
            a10 = 1.0f;
        }
        float interpolation = er.f34421g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.l2 l2Var = this.f37436b;
        l2Var.setScaleX(T1);
        l2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        l2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.hd.f24101a0;
        org.telegram.ui.z51 z51Var = this.f37437c;
        if (!z10) {
            l2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            z51Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        z51Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f37435a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
