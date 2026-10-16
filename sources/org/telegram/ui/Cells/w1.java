package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class w1 extends FrameLayout {
    public final TextView f22371a;
    public final ImageView f22372b;
    public final FrameLayout f22373c;
    public final org.telegram.ui.ActionBar.c6 d;

    public w1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f22373c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int a2 = a(org.telegram.ui.ActionBar.g6.Fe);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(a2, mode));
        addView(frameLayout, w7.z5.a(27.0f, 0.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        this.f22372b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.g6.De), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, w7.z5.a(-2.0f, 0.0f, 0.0f, 10.0f, 0.0f, -2, 21));
        TextView textView = new TextView(context);
        this.f22371a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(a(org.telegram.ui.ActionBar.g6.Ee));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.a(-2.0f, 32.0f, 0.0f, 32.0f, 0.0f, -2, 17));
    }

    public final int a(int i10) {
        Integer num;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (c6Var != null) {
            num = Integer.valueOf(c6Var.E0(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f22373c;
    }

    public ImageView getImageView() {
        return this.f22372b;
    }

    public TextView getTextView() {
        return this.f22371a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f22371a.setText(str);
    }
}
