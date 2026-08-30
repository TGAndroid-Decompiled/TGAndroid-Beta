package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class z1 extends FrameLayout {
    public final TextView f20776a;
    public final ImageView f20777b;

    public z1(Context context, f6 f6Var) {
        super(context);
        int i10;
        setBackground(j6.f0(j6.v0(j6.I5, f6Var), 2, -1));
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f20777b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.J5, f6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, k7.b6.e(-2, 40, i10 | 16));
        TextView textView = new TextView(context);
        this.f20776a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.b.l(j6.f20012j5, f6Var, textView, 1, 16.0f);
        addView(textView, k7.b6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        int dp;
        int i11;
        TextView textView = this.f20776a;
        textView.setText(charSequence);
        ImageView imageView = this.f20777b;
        if (i10 != 0) {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(56.0f);
            }
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(56.0f);
            } else {
                i11 = 0;
            }
            textView.setPadding(dp, 0, i11, 0);
            return;
        }
        imageView.setVisibility(4);
        textView.setPadding(0, 0, 0, 0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f20776a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.f20776a.setTextColor(i10);
    }
}
