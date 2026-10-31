package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z10;
public final class ma extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int f22318n = 0;
    public final LinearLayout f22319a;
    public final TextView f22320b;
    public final TextView f22321c;
    public final la d;
    public final la e;
    public int f22322f;
    public int h;

    public ma(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f22319a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f22320b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131743916, null));
        linearLayout.addView(textView, w7.b6.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f22321c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.i0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.b6.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        la laVar = new la(activity);
        this.d = laVar;
        laVar.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
        laVar.setTypeface(org.telegram.messenger.i0.o());
        laVar.setTextSize(1, 14.22f);
        laVar.setText(cd.L0(2131743935, null));
        linearLayout2.addView(laVar, w7.b6.o(-2, 30));
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        la laVar2 = new la(activity);
        this.e = laVar2;
        laVar2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
        laVar2.setTypeface(org.telegram.messenger.i0.o());
        laVar2.setTextSize(1, 14.22f);
        laVar2.setText(cd.L0(2131743925, null));
        linearLayout2.addView(laVar2, w7.b6.o(-2, 30));
        linearLayout2.addView(new Space(activity), w7.b6.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, w7.b6.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, w7.b6.e(-1, -1, 119));
        updateColors();
    }

    public static String a(z10 z10Var) {
        if (z10Var == null) {
            return "";
        }
        String str = z10Var.f19473f;
        String str2 = "" + z10Var.e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return sc.e.A(str2, str);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = org.telegram.messenger.i0.f16026q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16026q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f22319a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        la laVar;
        la laVar2;
        float f7;
        TextView textView2 = this.f22320b;
        if (textView2 != null && (textView = this.f22321c) != null && (laVar = this.d) != null && (laVar2 = this.e) != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false));
            int i10 = org.telegram.ui.ActionBar.t6.I6;
            laVar.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            float f10 = 0.15f;
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                f7 = 0.3f;
            } else {
                f7 = 0.15f;
            }
            int r12 = org.telegram.ui.ActionBar.t6.r1(f7, x02);
            if (laVar.getBackground() != null) {
                if (r12 != this.f22322f) {
                    org.telegram.ui.ActionBar.t6.H1(laVar.getBackground(), r12, true);
                }
            } else {
                laVar.setBackground(org.telegram.ui.ActionBar.t6.h0(r12, 7, org.telegram.messenger.i0.L(8.0f)));
            }
            int i11 = org.telegram.ui.ActionBar.t6.f21170q7;
            laVar2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            if (org.telegram.ui.ActionBar.t6.I.q()) {
                f10 = 0.3f;
            }
            int r13 = org.telegram.ui.ActionBar.t6.r1(f10, x03);
            if (laVar2.getBackground() != null) {
                if (r13 != this.h) {
                    org.telegram.ui.ActionBar.t6.H1(laVar2.getBackground(), r13, true);
                }
            } else {
                laVar2.setBackground(org.telegram.ui.ActionBar.t6.h0(r13, 7, org.telegram.messenger.i0.L(8.0f)));
            }
            this.f22322f = r12;
            this.h = r13;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
