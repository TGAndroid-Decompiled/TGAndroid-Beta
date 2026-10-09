package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
public final class j7 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f35077a;
    public final TextView f35078b;
    public final TextView f35079c;
    public final ImageView d;

    public j7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        this.f35077a = e6Var;
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(13.0f), 0);
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(e7, w7.x5.p(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f35078b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f35079c = h;
        h.setTextSize(1, 14.0f);
        e7.addView(h, w7.x5.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, w7.x5.t(21, 21, 21, 9, 0, 0, 0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35077a;
        this.f35078b.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.f21199z6;
        this.f35079c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
