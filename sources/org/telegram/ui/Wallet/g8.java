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
import org.telegram.messenger.ok;
public final class g8 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f34263a;
    public final TextView f34264b;
    public final TextView f34265c;
    public final ImageView d;

    public g8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(0);
        this.f34263a = d6Var;
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(13.0f), 0);
        LinearLayout e = ok.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(e, w7.z5.p(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f34264b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f34265c = i10;
        i10.setTextSize(1, 14.0f);
        e.addView(i10, w7.z5.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, w7.z5.t(21, 21, 21, 9, 0, 0, 0));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f34263a;
        this.f34264b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.f21398z6;
        this.f34265c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), PorterDuff.Mode.SRC_IN));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
