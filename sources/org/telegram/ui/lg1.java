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
    public final org.telegram.ui.ActionBar.u6 f41272a;
    public final ImageView f41273b;
    public final LinearLayout f41274c;
    public final TextView d;
    public final TextView e;
    public final ImageView f41275f;
    public boolean h;
    public boolean f41276n;
    public int f41277r;

    public lg1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(0);
        this.f41272a = u6Var;
        ImageView imageView = new ImageView(context);
        this.f41273b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, org.telegram.ui.Components.gb1.x(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41274c = linearLayout;
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
        this.f41275f = imageView2;
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
        if (this.f41276n) {
            i10 = org.telegram.ui.ActionBar.y6.f23598q7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.y6.f23540n6;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.G6;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f41272a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i13 = this.f41277r;
        ImageView imageView = this.f41275f;
        ImageView imageView2 = this.f41273b;
        if (w02 != i13 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f41277r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f41276n) {
            i11 = org.telegram.ui.ActionBar.y6.f23581p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.y6.f23540n6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        if (this.f41276n) {
            i12 = org.telegram.ui.ActionBar.y6.f23581p7;
        } else if (this.h) {
            i12 = org.telegram.ui.ActionBar.y6.f23540n6;
        } else {
            i12 = org.telegram.ui.ActionBar.y6.f23748y6;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
