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
import org.telegram.messenger.l10;
public final class ma extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int f29576n = 0;
    public final LinearLayout f29577a;
    public final TextView f29578b;
    public final TextView f29579c;
    public final la d;
    public final la f29580e;
    public int f29581f;
    public int h;

    public ma(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f29577a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.f29578b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131743892, null));
        linearLayout.addView(textView, c8.ha.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.f29579c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.N(2.0f), 1.0f);
        linearLayout.addView(textView2, c8.ha.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), c8.ha.p(-2, 1, 17.0f, 1));
        la laVar = new la(activity);
        this.d = laVar;
        laVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        laVar.setTypeface(org.telegram.messenger.g0.o());
        laVar.setTextSize(1, 14.22f);
        laVar.setText(hd.M0(2131743911, null));
        linearLayout2.addView(laVar, c8.ha.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ha.p(-2, 1, 17.0f, 1));
        la laVar2 = new la(activity);
        this.f29580e = laVar2;
        laVar2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
        laVar2.setTypeface(org.telegram.messenger.g0.o());
        laVar2.setTextSize(1, 14.22f);
        laVar2.setText(hd.M0(2131743901, null));
        linearLayout2.addView(laVar2, c8.ha.o(-2, 30));
        linearLayout2.addView(new Space(activity), c8.ha.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, c8.ha.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, c8.ha.e(-1, -1, 119));
        updateColors();
    }

    public static String a(l10 l10Var) {
        if (l10Var == null) {
            return "";
        }
        String str = l10Var.f23825f;
        String str2 = "" + l10Var.f23824e;
        if (!TextUtils.isEmpty(str) && !str2.isEmpty()) {
            str2 = str2.concat(", ");
        }
        return rf.b.q(str2, str);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = org.telegram.messenger.g0.f22544q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22544q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f29577a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        la laVar;
        la laVar2;
        float f10;
        TextView textView2 = this.f29578b;
        if (textView2 != null && (textView = this.f29579c) != null && (laVar = this.d) != null && (laVar2 = this.f29580e) != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28241y6, false));
            int i7 = org.telegram.ui.ActionBar.k6.I6;
            laVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            float f11 = 0.15f;
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                f10 = 0.3f;
            } else {
                f10 = 0.15f;
            }
            int r12 = org.telegram.ui.ActionBar.k6.r1(f10, x02);
            if (laVar.getBackground() != null) {
                if (r12 != this.f29581f) {
                    org.telegram.ui.ActionBar.k6.H1(laVar.getBackground(), r12, true);
                }
            } else {
                laVar.setBackground(org.telegram.ui.ActionBar.k6.h0(r12, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            int i10 = org.telegram.ui.ActionBar.k6.f28090q7;
            laVar2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            if (org.telegram.ui.ActionBar.k6.I.q()) {
                f11 = 0.3f;
            }
            int r13 = org.telegram.ui.ActionBar.k6.r1(f11, x03);
            if (laVar2.getBackground() != null) {
                if (r13 != this.h) {
                    org.telegram.ui.ActionBar.k6.H1(laVar2.getBackground(), r13, true);
                }
            } else {
                laVar2.setBackground(org.telegram.ui.ActionBar.k6.h0(r13, 7, org.telegram.messenger.g0.L(8.0f)));
            }
            this.f29581f = r12;
            this.h = r13;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
