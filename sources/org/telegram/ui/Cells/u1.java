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

public final class u1 extends FrameLayout {

    public final TextView f25692a;

    public final ImageView f25693b;

    public final FrameLayout f25694c;
    public final org.telegram.ui.ActionBar.c6 d;

    public u1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25694c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int iA = a(org.telegram.ui.ActionBar.g6.Fe);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(iA, mode));
        addView(frameLayout, h7.z5.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25693b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.g6.De), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f25692a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(a(org.telegram.ui.ActionBar.g6.Ee));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, h7.z5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public final int a(int i10) {
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        Integer numValueOf = c6Var != null ? Integer.valueOf(c6Var.N0(i10)) : null;
        return numValueOf != null ? numValueOf.intValue() : org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f25694c;
    }

    public ImageView getImageView() {
        return this.f25693b;
    }

    public TextView getTextView() {
        return this.f25692a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f25692a.setText(str);
    }
}
