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
public final class j21 extends FrameLayout {
    public final ImageView f34916a;
    public final org.telegram.ui.ActionBar.m2 f34917b;
    public final org.telegram.ui.d61 f34918c;
    public final TextView d;
    public final h21 f34919e;
    public final View f34920f;
    public final View h;
    public final l21 f34921n;

    public j21(l21 l21Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f34921n = l21Var;
        View view = new View(context);
        this.f34920f = view;
        int i11 = org.telegram.ui.ActionBar.l6.f27938h5;
        org.telegram.ui.ActionBar.g6 g6Var = l21Var.I0;
        String str = l21Var.f35561q1;
        org.telegram.ui.ActionBar.s6.h(i11, view, g6Var);
        addView(view, c8.ha.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f34916a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.g6 g6Var2 = l21Var.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.s(imageView, i12, g6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i13, l21Var.I0), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i13);
        org.telegram.ui.ActionBar.g6 g6Var3 = l21Var.I0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j21 f33852b;

            {
                this.f33852b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i14 = r2;
                j21 j21Var = this.f33852b;
                switch (i14) {
                    case 0:
                        j21Var.f34921n.dismiss();
                        return;
                    default:
                        h21 h21Var = j21Var.f34919e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(j21Var.getContext(), null);
                        Drawable mutate = j21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.l6.G8;
                        l21 l21Var2 = j21Var.f34921n;
                        org.telegram.ui.ActionBar.s6.x(j21Var, mutate, i15, l21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i16);
                            if (fdVar == null || (((str2 = fdVar.f22398c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (!fdVar2.f22400f.equals(l21Var2.f35561q1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(l21Var2.f35562r1, fdVar2.f22400f);
                                Context context2 = j21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, l21Var2.I0, z10, z9);
                                z0Var.setText(l21.K0(l21.O0(fdVar2.f22400f, null, null)));
                                z0Var.setChecked(TextUtils.equals(l21Var2.f35562r1, fdVar2.f22400f));
                                z0Var.setOnClickListener(new ud0(j21Var, runnableArr, fdVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(g1Var, 21);
                        g1Var.f27487e = true;
                        g1Var.f27486c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22563q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (h21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(l21Var2.f28624b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.ha.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(3, context, this);
        this.f34917b = m2Var;
        org.telegram.ui.ActionBar.s6.U(m2Var, i12, l21Var.I0);
        m2Var.setTextSize(1, 20.0f);
        m2Var.setTypeface(org.telegram.messenger.g0.o());
        m2Var.setText(org.telegram.messenger.id.M0(2131753766, null));
        m2Var.setPivotX(0.0f);
        m2Var.setPivotY(0.0f);
        addView(m2Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(16, context, this);
        this.f34918c = d61Var;
        if (org.telegram.messenger.id.f23157a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Dj, l21Var.I0);
            textView.setTextSize(1, 14.0f);
            textView.setText(l21.K0(l21.O0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232682);
        int i14 = org.telegram.ui.ActionBar.l6.Dj;
        org.telegram.ui.ActionBar.s6.s(e10, i14, l21Var.I0, mode);
        if (org.telegram.messenger.id.f23157a0) {
            e10.setScaleX(-1.0f);
        }
        h21 h21Var = new h21(this, context);
        this.f34919e = h21Var;
        if (org.telegram.messenger.id.f23157a0) {
            h21Var.setGravity(5);
        }
        h21Var.b(0.25f, 350L, xq.h);
        org.telegram.ui.ActionBar.s6.Y(h21Var, i14, l21Var.I0);
        h21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h21Var.setText(l21.K0(l21.O0(l21Var.f35562r1, null, null)));
        h21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        h21Var.setOnClickListener(new View.OnClickListener(this) {
            public final j21 f33852b;

            {
                this.f33852b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z9;
                String str2;
                int i142 = r2;
                j21 j21Var = this.f33852b;
                switch (i142) {
                    case 0:
                        j21Var.f34921n.dismiss();
                        return;
                    default:
                        h21 h21Var2 = j21Var.f34919e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(j21Var.getContext(), null);
                        Drawable mutate = j21Var.getContext().getDrawable(2131232564).mutate();
                        int i15 = org.telegram.ui.ActionBar.l6.G8;
                        l21 l21Var2 = j21Var.f34921n;
                        org.telegram.ui.ActionBar.s6.x(j21Var, mutate, i15, l21Var2.I0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.f10.M;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.id.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i16);
                            if (fdVar == null || (((str2 = fdVar.f22398c) != null && str2.endsWith("_raw")) || !"remote".equals(fdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.n00(org.telegram.messenger.id.E0().B, 1));
                        boolean z10 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) arrayList.get(i17);
                            if (!fdVar2.f22400f.equals(l21Var2.f35561q1) && "remote".equals(fdVar2.d)) {
                                TextUtils.equals(l21Var2.f35562r1, fdVar2.f22400f);
                                Context context2 = j21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, l21Var2.I0, z10, z9);
                                z0Var.setText(l21.K0(l21.O0(fdVar2.f22400f, null, null)));
                                z0Var.setChecked(TextUtils.equals(l21Var2.f35562r1, fdVar2.f22400f));
                                z0Var.setOnClickListener(new ud0(j21Var, runnableArr, fdVar2, 1));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z10 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new kr0(g1Var, 21);
                        g1Var.f27487e = true;
                        g1Var.f27486c = 220;
                        g1Var.setOutsideTouchable(true);
                        g1Var.setClippingEnabled(true);
                        g1Var.setAnimationStyle(2131755192);
                        g1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        h21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f22563q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (h21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        g1Var.showAtLocation(l21Var2.f28624b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.id.f23157a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            d61Var.addView(h21Var, c8.ha.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                d61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
                d61Var.addView(this.d, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                d61Var.addView(textView2, c8.ha.t(-2, -2, 16, 0, 0, 4, 0));
                d61Var.addView(e10, c8.ha.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            d61Var.addView(h21Var, c8.ha.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(d61Var, c8.ha.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view2, l21Var.I0);
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
        float a10 = c8.j9.a((f10 - org.telegram.messenger.g0.f22557m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!l21.I0(this.f34921n)) {
            a10 = 1.0f;
        }
        float interpolation = xq.f40459g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.m2 m2Var = this.f34917b;
        m2Var.setScaleX(T1);
        m2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        m2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z9 = org.telegram.messenger.id.f23157a0;
        org.telegram.ui.d61 d61Var = this.f34918c;
        if (!z9) {
            m2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            d61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        d61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f34916a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
