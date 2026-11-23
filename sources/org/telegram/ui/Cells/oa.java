package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.g10;
import org.telegram.messenger.hd;
public final class oa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int f31183n = 0;
    public final LinearLayout f31184a;
    public final TextView f31185b;
    public final TextView f31186c;
    public final na d;
    public final na f31187e;
    public int f31188f;
    public int h;

    public oa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f31184a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f31185b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131743648, null));
        linearLayout.addView(textView, c8.na.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f31186c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.na.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        na naVar = new na(activity);
        this.d = naVar;
        naVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        naVar.setTypeface(org.telegram.messenger.g0.o());
        naVar.setTextSize(1, 14.22f);
        naVar.setText(hd.N0(2131743667, null));
        linearLayout2.addView(naVar, c8.na.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        na naVar2 = new na(activity);
        this.f31187e = naVar2;
        naVar2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        naVar2.setTypeface(org.telegram.messenger.g0.o());
        naVar2.setTextSize(1, 14.22f);
        naVar2.setText(hd.N0(2131743657, null));
        linearLayout2.addView(naVar2, c8.na.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.na.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, c8.na.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, c8.na.e(-1, -1, 119));
        updateColors();
    }

    public static String a(g10 g10Var) {
        if (g10Var == null) {
            return "";
        }
        String str = g10Var.f24029f;
        String str2 = "" + g10Var.f24028e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return p5.c.v(str2, str);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = org.telegram.messenger.g0.f24010q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24010q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f31184a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        na naVar;
        na naVar2;
        float f10;
        TextView textView2 = this.f31185b;
        if (textView2 != null && (textView = this.f31186c) != null && (naVar = this.d) != null && (naVar2 = this.f31187e) != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
            textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29739y6, false));
            int i7 = org.telegram.ui.ActionBar.m6.I6;
            naVar.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            float f11 = 0.15f;
            if (org.telegram.ui.ActionBar.m6.I.q()) {
                f10 = 0.3f;
            } else {
                f10 = 0.15f;
            }
            int r12 = org.telegram.ui.ActionBar.m6.r1(f10, x02);
            if (naVar.getBackground() != null) {
                if (r12 != this.f31188f) {
                    org.telegram.ui.ActionBar.m6.H1(naVar.getBackground(), r12, true);
                }
            } else {
                naVar.setBackground(org.telegram.ui.ActionBar.m6.h0(r12, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            int i10 = org.telegram.ui.ActionBar.m6.f29588q7;
            naVar2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            if (org.telegram.ui.ActionBar.m6.I.q()) {
                f11 = 0.3f;
            }
            int r13 = org.telegram.ui.ActionBar.m6.r1(f11, x03);
            if (naVar2.getBackground() != null) {
                if (r13 != this.h) {
                    org.telegram.ui.ActionBar.m6.H1(naVar2.getBackground(), r13, true);
                }
            } else {
                naVar2.setBackground(org.telegram.ui.ActionBar.m6.h0(r13, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            this.f31188f = r12;
            this.h = r13;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
