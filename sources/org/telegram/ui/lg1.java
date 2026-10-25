package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lg1 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f41269a;
    public final ImageView f41270b;
    public final LinearLayout f41271c;
    public final TextView d;
    public final TextView e;
    public final ImageView f41272f;
    public boolean h;
    public boolean f41273n;
    public int f41274r;

    public lg1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(0);
        this.f41269a = u6Var;
        ImageView imageView = new ImageView(context);
        this.f41270b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, org.telegram.ui.Components.gb1.x(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41271c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView, org.telegram.ui.Components.gb1.x(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = e;
        e.setTextSize(1, 13.0f);
        linearLayout.addView(e, org.telegram.ui.Components.gb1.v(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f41272f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, org.telegram.ui.Components.gb1.x(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        int i12;
        if (this.f41273n) {
            i10 = org.telegram.ui.ActionBar.y6.f23596q7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.y6.f23538n6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f41269a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i13 = this.f41274r;
        ImageView imageView = this.f41272f;
        ImageView imageView2 = this.f41270b;
        if (w02 != i13 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f41274r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f41273n) {
            i11 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.y6.f23538n6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        if (this.f41273n) {
            i12 = org.telegram.ui.ActionBar.y6.f23579p7;
        } else if (this.h) {
            i12 = org.telegram.ui.ActionBar.y6.f23538n6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.f23746y6;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
