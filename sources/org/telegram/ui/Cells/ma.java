package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i10;
public final class ma extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f30697n = 0;
    public final LinearLayout f30698a;
    public final TextView f30699b;
    public final TextView f30700c;
    public final la d;
    public final la f30701e;
    public int f30702f;
    public int h;

    public ma(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f30698a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f30699b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131743891, null));
        linearLayout.addView(textView, c8.ja.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f30700c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.ja.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), c8.ja.p(-2, 1, 17.0f, 1));
        la laVar = new la(activity);
        this.d = laVar;
        laVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        laVar.setTypeface(org.telegram.messenger.g0.o());
        laVar.setTextSize(1, 14.22f);
        laVar.setText(hd.M0(2131743910, null));
        linearLayout2.addView(laVar, c8.ja.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ja.p(-2, 1, 17.0f, 1));
        la laVar2 = new la(activity);
        this.f30701e = laVar2;
        laVar2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        laVar2.setTypeface(org.telegram.messenger.g0.o());
        laVar2.setTextSize(1, 14.22f);
        laVar2.setText(hd.M0(2131743900, null));
        linearLayout2.addView(laVar2, c8.ja.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ja.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, c8.ja.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, c8.ja.e(-1, -1, 119));
        updateColors();
    }

    public static String a(i10 i10Var) {
        if (i10Var == null) {
            return "";
        }
        String str = i10Var.f24268f;
        String str2 = "" + i10Var.f24267e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return r.b.v(str2, str);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = org.telegram.messenger.g0.f23611q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23611q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f30698a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        la laVar;
        la laVar2;
        float f10;
        TextView textView2 = this.f30699b;
        if (textView2 != null && (textView = this.f30700c) != null && (laVar = this.d) != null && (laVar2 = this.f30701e) != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false));
            int i7 = org.telegram.ui.ActionBar.j6.I6;
            laVar.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            float f11 = 0.15f;
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                f10 = 0.3f;
            } else {
                f10 = 0.15f;
            }
            int r12 = org.telegram.ui.ActionBar.j6.r1(f10, x02);
            if (laVar.getBackground() != null) {
                if (r12 != this.f30702f) {
                    org.telegram.ui.ActionBar.j6.H1(laVar.getBackground(), r12, true);
                }
            } else {
                laVar.setBackground(org.telegram.ui.ActionBar.j6.h0(r12, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            int i10 = org.telegram.ui.ActionBar.j6.f29090q7;
            laVar2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            if (org.telegram.ui.ActionBar.j6.I.q()) {
                f11 = 0.3f;
            }
            int r13 = org.telegram.ui.ActionBar.j6.r1(f11, x03);
            if (laVar2.getBackground() != null) {
                if (r13 != this.h) {
                    org.telegram.ui.ActionBar.j6.H1(laVar2.getBackground(), r13, true);
                }
            } else {
                laVar2.setBackground(org.telegram.ui.ActionBar.j6.h0(r13, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            this.f30702f = r12;
            this.h = r13;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
