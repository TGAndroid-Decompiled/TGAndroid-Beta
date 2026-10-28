package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c81 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f38215a;
    public final org.telegram.ui.Components.jc0 f38216b;
    public final FrameLayout f38217c;
    public final ImageView d;
    public final TextView e;
    public final TextView f38218f;
    public final TextView h;
    public boolean f38219n;
    public boolean f38220r;

    public c81(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f38219n = true;
        this.f38215a = u6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38217c = frameLayout;
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(1);
        this.f38216b = jc0Var;
        frameLayout.setBackground(jc0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, org.telegram.ui.Components.kb1.i(24, 24, 17));
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = org.telegram.messenger.wh.e(d, textView, org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f38218f = e;
        e.setTextSize(1, 13.0f);
        TextView e10 = org.telegram.messenger.wh.e(d, e, org.telegram.ui.Components.kb1.o(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = e10;
        e10.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(e10, org.telegram.ui.Components.kb1.x(-2, -2, 16, 20, 0, 0, 0));
            addView(d, org.telegram.ui.Components.kb1.t(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, org.telegram.ui.Components.kb1.x(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, org.telegram.ui.Components.kb1.x(28, 28, 19, 18, 0, 0, 0));
            addView(d, org.telegram.ui.Components.kb1.t(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(e10, org.telegram.ui.Components.kb1.x(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23541n6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f38220r) {
            f7 = 60.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f38215a;
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f38218f.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23749y6, u6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23541n6, u6Var));
        if (this.f38219n && (u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38216b.f29642b = z10;
    }
}
