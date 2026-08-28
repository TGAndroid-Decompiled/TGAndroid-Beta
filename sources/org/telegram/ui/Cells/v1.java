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
    public final TextView f25781a;
    public final ImageView f25782b;
    public final FrameLayout f25783c;
    public final org.telegram.ui.ActionBar.b6 d;

    public v1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25783c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int a2 = a(org.telegram.ui.ActionBar.f6.Fe);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        background.setColorFilter(new PorterDuffColorFilter(a2, mode));
        addView(frameLayout, g7.e6.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25782b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.f6.De), mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f25781a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(a(org.telegram.ui.ActionBar.f6.Ee));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, g7.e6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public final int a(int i9) {
        Integer num;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        if (b6Var != null) {
            num = Integer.valueOf(b6Var.N0(i9));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f25783c;
    }

    public ImageView getImageView() {
        return this.f25782b;
    }

    public TextView getTextView() {
        return this.f25781a;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f25781a.setText(str);
    }
}
