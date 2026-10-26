package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;
public final class u1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView f25472a;
    public final ImageView f25473b;
    public final FrameLayout f25474c;
    public final org.telegram.ui.ActionBar.u6 d;
    public int e;

    public u1(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        Integer num;
        int x02;
        this.d = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25474c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.y6.Fe;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(frameLayout, background, i10, u6Var, mode);
        addView(frameLayout, gb1.h(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25473b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        int i11 = org.telegram.ui.ActionBar.y6.De;
        if (u6Var != null) {
            num = Integer.valueOf(u6Var.g(i11));
        } else {
            num = null;
        }
        if (num != null) {
            x02 = num.intValue();
        } else {
            x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, gb1.h(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f25472a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Ee, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, gb1.h(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public FrameLayout getBackgroundLayout() {
        return this.f25474c;
    }

    public ImageView getImageView() {
        return this.f25473b;
    }

    public TextView getTextView() {
        return this.f25472a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f25472a.setText(str);
    }

    @Override
    public final void updateColors() {
        Integer num;
        int x02;
        try {
            int i10 = org.telegram.ui.ActionBar.y6.De;
            org.telegram.ui.ActionBar.u6 u6Var = this.d;
            if (u6Var != null) {
                num = Integer.valueOf(u6Var.g(i10));
            } else {
                num = null;
            }
            if (num != null) {
                x02 = num.intValue();
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            }
            ImageView imageView = this.f25473b;
            if (imageView != null && x02 != this.e) {
                this.e = x02;
                imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
