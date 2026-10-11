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
import org.telegram.messenger.ai;
public final class m7 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f35284a;
    public final TextView f35285b;
    public final TextView f35286c;
    public final ImageView d;

    public m7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(0);
        this.f35284a = d6Var;
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(13.0f), 0);
        LinearLayout e7 = ai.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(e7, w7.x5.p(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f35285b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f35286c = h;
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
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35284a;
        this.f35285b.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.f21189z6;
        this.f35286c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
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
