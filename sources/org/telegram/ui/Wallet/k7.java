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
import org.telegram.messenger.sk;
public final class k7 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f33133a;
    public final TextView f33134b;
    public final TextView f33135c;
    public final ImageView d;

    public k7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        this.f33133a = c6Var;
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(13.0f), 0);
        LinearLayout e = sk.e(context, 1);
        e.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(e, w7.z5.p(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f33134b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(e, textView, w7.z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f33135c = i10;
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f33133a;
        this.f33134b.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.f20005z6;
        this.f33135c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
