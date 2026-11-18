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
public final class w21 extends FrameLayout {
    public final ImageView f41543a;
    public final org.telegram.ui.ActionBar.o2 f41544b;
    public final org.telegram.ui.d61 f41545c;
    public final TextView d;
    public final u21 f41546e;
    public final View f41547f;
    public final View h;
    public final y21 f41548n;

    public w21(y21 y21Var, Context context) {
        super(context);
        int i7;
        int i10;
        this.f41548n = y21Var;
        View view = new View(context);
        this.f41547f = view;
        int i11 = org.telegram.ui.ActionBar.n6.f29469h5;
        org.telegram.ui.ActionBar.i6 i6Var = y21Var.J0;
        String str = y21Var.f42281u1;
        org.telegram.ui.ActionBar.u6.h(i11, view, i6Var);
        addView(view, c8.ma.d(-1, 44.0f, 55, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f41543a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231240);
        int i12 = org.telegram.ui.ActionBar.n6.f29504j5;
        org.telegram.ui.ActionBar.i6 i6Var2 = y21Var.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var2, mode);
        int i13 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, y21Var.J0), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        org.telegram.ui.ActionBar.i6 i6Var3 = y21Var.J0;
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, i6Var3);
        imageView.setAlpha(0.0f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w21 f39897b;

            {
                this.f39897b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i14 = r2;
                w21 w21Var = this.f39897b;
                switch (i14) {
                    case 0:
                        w21Var.f41548n.dismiss();
                        return;
                    default:
                        u21 u21Var = w21Var.f41546e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w21Var.getContext(), null);
                        Drawable mutate = w21Var.getContext().getDrawable(2131232566).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        y21 y21Var2 = w21Var.f41548n;
                        org.telegram.ui.ActionBar.u6.x(w21Var, mutate, i15, y21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.z00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.f23333c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.h00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f23335f.equals(y21Var2.f42281u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(y21Var2.f42282v1, cdVar2.f23335f);
                                Context context2 = w21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, y21Var2.J0, z11, z10);
                                z0Var.setText(y21.L0(y21.P0(cdVar2.f23335f, null, null)));
                                z0Var.setChecked(TextUtils.equals(y21Var2.f42282v1, cdVar2.f23335f));
                                z0Var.setOnClickListener(new qt(w21Var, runnableArr, cdVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ap0(h1Var, 23);
                        h1Var.f28993e = true;
                        h1Var.f28992c = 220;
                        h1Var.setOutsideTouchable(true);
                        h1Var.setClippingEnabled(true);
                        h1Var.setAnimationStyle(2131755192);
                        h1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u21Var.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24121q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (u21Var.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        h1Var.showAtLocation(y21Var2.f30192b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        addView(imageView, c8.ma.d(54, 54.0f, 48, 1.0f, 1.0f, 1.0f, 1.0f));
        org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(3, context, this);
        this.f41544b = o2Var;
        org.telegram.ui.ActionBar.u6.U(o2Var, i12, y21Var.J0);
        o2Var.setTextSize(1, 20.0f);
        o2Var.setTypeface(org.telegram.messenger.g0.o());
        o2Var.setText(org.telegram.messenger.gd.M0(2131753764, null));
        o2Var.setPivotX(0.0f);
        o2Var.setPivotY(0.0f);
        addView(o2Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 20.0f, 22.0f, 0.0f));
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(17, context, this);
        this.f41545c = d61Var;
        if (org.telegram.messenger.gd.f24216a0) {
            d61Var.setGravity(5);
        }
        d61Var.setPivotX(0.0f);
        d61Var.setPivotY(0.0f);
        if (!TextUtils.isEmpty(str) && !"und".equals(str)) {
            TextView textView = new TextView(context);
            this.d = textView;
            textView.setLines(1);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Gj, y21Var.J0);
            textView.setTextSize(1, 14.0f);
            textView.setText(y21.L0(y21.P0(str, null, null)));
            textView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f));
        }
        ImageView e10 = org.telegram.messenger.n10.e(context, 2131232684);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.s(e10, i14, y21Var.J0, mode);
        if (org.telegram.messenger.gd.f24216a0) {
            e10.setScaleX(-1.0f);
        }
        u21 u21Var = new u21(this, context);
        this.f41546e = u21Var;
        if (org.telegram.messenger.gd.f24216a0) {
            u21Var.setGravity(5);
        }
        u21Var.b(0.25f, 350L, lr.h);
        org.telegram.ui.ActionBar.u6.Y(u21Var, i14, y21Var.J0);
        u21Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        u21Var.setText(y21.L0(y21.P0(y21Var.f42282v1, null, null)));
        u21Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        u21Var.setOnClickListener(new View.OnClickListener(this) {
            public final w21 f39897b;

            {
                this.f39897b = this;
            }

            @Override
            public final void onClick(View view2) {
                int measuredHeight;
                boolean z10;
                String str2;
                int i142 = r2;
                w21 w21Var = this.f39897b;
                switch (i142) {
                    case 0:
                        w21Var.f41548n.dismiss();
                        return;
                    default:
                        u21 u21Var2 = w21Var.f41546e;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w21Var.getContext(), null);
                        Drawable mutate = w21Var.getContext().getDrawable(2131232566).mutate();
                        int i15 = org.telegram.ui.ActionBar.n6.G8;
                        y21 y21Var2 = w21Var.f41548n;
                        org.telegram.ui.ActionBar.u6.x(w21Var, mutate, i15, y21Var2.J0, PorterDuff.Mode.MULTIPLY);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(mutate);
                        Runnable[] runnableArr = new Runnable[1];
                        List list = org.telegram.messenger.z00.N;
                        ArrayList arrayList = new ArrayList(org.telegram.messenger.gd.E0().N.values());
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i16);
                            if (cdVar == null || (((str2 = cdVar.f23333c) != null && str2.endsWith("_raw")) || !"remote".equals(cdVar.d))) {
                                arrayList.remove(i16);
                                i16--;
                            }
                            i16++;
                        }
                        Collections.sort(arrayList, new org.telegram.messenger.h00(org.telegram.messenger.gd.E0().B, 1));
                        boolean z11 = true;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            org.telegram.messenger.cd cdVar2 = (org.telegram.messenger.cd) arrayList.get(i17);
                            if (!cdVar2.f23335f.equals(y21Var2.f42281u1) && "remote".equals(cdVar2.d)) {
                                TextUtils.equals(y21Var2.f42282v1, cdVar2.f23335f);
                                Context context2 = w21Var.getContext();
                                if (i17 == arrayList.size() - 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(2, context2, y21Var2.J0, z11, z10);
                                z0Var.setText(y21.L0(y21.P0(cdVar2.f23335f, null, null)));
                                z0Var.setChecked(TextUtils.equals(y21Var2.f42282v1, cdVar2.f23335f));
                                z0Var.setOnClickListener(new qt(w21Var, runnableArr, cdVar2, 6));
                                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                                z11 = false;
                            }
                        }
                        org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        runnableArr[0] = new ap0(h1Var, 23);
                        h1Var.f28993e = true;
                        h1Var.f28992c = 220;
                        h1Var.setOutsideTouchable(true);
                        h1Var.setClippingEnabled(true);
                        h1Var.setAnimationStyle(2131755192);
                        h1Var.setFocusable(true);
                        int[] iArr = new int[2];
                        u21Var2.getLocationInWindow(iArr);
                        Point point = org.telegram.messenger.g0.f24121q;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                        int measuredHeight2 = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                        int i18 = iArr[1];
                        if (i18 > (point.y * 0.9f) - measuredHeight2) {
                            measuredHeight = org.telegram.messenger.g0.L(8.0f) + (i18 - measuredHeight2);
                        } else {
                            measuredHeight = (u21Var2.getMeasuredHeight() + i18) - org.telegram.messenger.g0.L(8.0f);
                        }
                        h1Var.showAtLocation(y21Var2.f30192b, 51, iArr[0] - org.telegram.messenger.g0.L(8.0f), measuredHeight);
                        return;
                }
            }
        });
        if (org.telegram.messenger.gd.f24216a0) {
            if (this.d != null) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            d61Var.addView(u21Var, c8.ma.t(-2, -2, 16, 0, 0, i10, 0));
            if (this.d != null) {
                d61Var.addView(e10, c8.ma.t(-2, -2, 16, 0, 1, 0, 0));
                d61Var.addView(this.d, c8.ma.t(-2, -2, 16, 4, 0, 0, 0));
            }
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                d61Var.addView(textView2, c8.ma.t(-2, -2, 16, 0, 0, 4, 0));
                d61Var.addView(e10, c8.ma.t(-2, -2, 16, 0, 1, 0, 0));
            }
            if (this.d != null) {
                i7 = 3;
            } else {
                i7 = 0;
            }
            d61Var.addView(u21Var, c8.ma.t(-2, -2, 16, i7, 0, 0, 0));
        }
        addView(d61Var, c8.ma.d(-1, -2.0f, 55, 22.0f, 43.0f, 22.0f, 0.0f));
        View view2 = new View(context);
        this.h = view2;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view2, y21Var.J0);
        view2.setAlpha(0.0f);
        addView(view2, c8.ma.d(-1, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55, 0.0f, 56.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(78.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        float a10 = c8.l9.a((f10 - org.telegram.messenger.g0.f24115m) / org.telegram.messenger.g0.L(64.0f), 0.0f, 1.0f);
        if (!y21.J0(this.f41548n)) {
            a10 = 1.0f;
        }
        float interpolation = lr.f37209g.getInterpolation(a10);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation);
        org.telegram.ui.ActionBar.o2 o2Var = this.f41544b;
        o2Var.setScaleX(T1);
        o2Var.setScaleY(org.telegram.messenger.g0.T1(0.85f, 1.0f, interpolation));
        o2Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-12.0f), 0.0f, interpolation));
        boolean z10 = org.telegram.messenger.gd.f24216a0;
        org.telegram.ui.d61 d61Var = this.f41545c;
        if (!z10) {
            o2Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
            d61Var.setTranslationX(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(50.0f), 0.0f, interpolation));
        }
        d61Var.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(-22.0f), 0.0f, interpolation));
        float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(-25.0f), interpolation);
        ImageView imageView = this.f41543a;
        imageView.setTranslationX(T12);
        float f11 = 1.0f - interpolation;
        imageView.setAlpha(f11);
        float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(22.0f), interpolation);
        View view = this.h;
        view.setTranslationY(T13);
        view.setAlpha(f11);
    }
}
