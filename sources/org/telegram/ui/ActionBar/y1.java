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
import org.telegram.messenger.ll;
public final class y1 extends FrameLayout {
    public final TextView f23970a;
    public final ImageView f23971b;

    public y1(Context context, b6 b6Var) {
        super(context);
        int i9;
        setBackground(f6.f0(f6.v0(f6.I5, b6Var), 2, -1));
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f23971b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.J5, b6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(imageView, g7.e6.e(-2, 40, i9 | 16));
        TextView textView = new TextView(context);
        this.f23970a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ll.n(f6.f23108j5, b6Var, textView, 1, 16.0f);
        addView(textView, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i9, CharSequence charSequence) {
        int dp;
        int i10;
        TextView textView = this.f23970a;
        textView.setText(charSequence);
        ImageView imageView = this.f23971b;
        if (i9 != 0) {
            imageView.setImageResource(i9);
            imageView.setVisibility(0);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(56.0f);
            }
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(56.0f);
            } else {
                i10 = 0;
            }
            textView.setPadding(dp, 0, i10, 0);
            return;
        }
        imageView.setVisibility(4);
        textView.setPadding(0, 0, 0, 0);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setGravity(int i9) {
        this.f23970a.setGravity(i9);
    }

    public void setTextColor(int i9) {
        this.f23970a.setTextColor(i9);
    }
}
