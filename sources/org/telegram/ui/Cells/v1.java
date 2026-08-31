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
public final class v1 extends FrameLayout {
    public final TextView f24300a;
    public final ImageView f24301b;
    public final FrameLayout f24302c;
    public final org.telegram.ui.ActionBar.g6 d;

    public v1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24302c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int a2 = a(org.telegram.ui.ActionBar.k6.Fe);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(a2, mode));
        addView(frameLayout, k7.c6.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f24301b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.k6.De), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, k7.c6.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24300a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(a(org.telegram.ui.ActionBar.k6.Ee));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, k7.c6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public final int a(int i10) {
        Integer num;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (g6Var != null) {
            num = Integer.valueOf(g6Var.B0(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f24302c;
    }

    public ImageView getImageView() {
        return this.f24301b;
    }

    public TextView getTextView() {
        return this.f24300a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f24300a.setText(str);
    }
}
