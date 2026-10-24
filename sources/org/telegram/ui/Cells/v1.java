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
public final class v1 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f23830a;
    public final ImageView f23831b;
    public final FrameLayout f23832c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;

    public v1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Integer num;
        int x02;
        this.d = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23832c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.k6.Fe;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(frameLayout, background, i10, g6Var, mode);
        addView(frameLayout, w7.z5.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f23831b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        int i11 = org.telegram.ui.ActionBar.k6.De;
        if (g6Var != null) {
            num = Integer.valueOf(g6Var.g(i11));
        } else {
            num = null;
        }
        if (num != null) {
            x02 = num.intValue();
        } else {
            x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
        frameLayout.addView(imageView, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23830a = textView;
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Ee, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
    }

    public FrameLayout getBackgroundLayout() {
        return this.f23832c;
    }

    public ImageView getImageView() {
        return this.f23831b;
    }

    public TextView getTextView() {
        return this.f23830a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f23830a.setText(str);
    }

    @Override
    public final void updateColors() {
        Integer num;
        int x02;
        try {
            int i10 = org.telegram.ui.ActionBar.k6.De;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            if (g6Var != null) {
                num = Integer.valueOf(g6Var.g(i10));
            } else {
                num = null;
            }
            if (num != null) {
                x02 = num.intValue();
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            }
            ImageView imageView = this.f23831b;
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
