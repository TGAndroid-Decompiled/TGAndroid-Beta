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
import org.telegram.messenger.ul;
public final class x1 extends FrameLayout {
    public final TextView f19668a;
    public final ImageView f19669b;

    public x1(Context context, d6 d6Var) {
        super(context);
        int i10;
        setBackground(h6.f0(h6.v0(h6.I5, d6Var), 2, -1));
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f19669b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.J5, d6Var), PorterDuff.Mode.MULTIPLY));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.x5.e(-2, 40, i10 | 16));
        TextView textView = new TextView(context);
        this.f19668a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ul.o(h6.f18895j5, d6Var, textView, 1, 16.0f);
        addView(textView, w7.x5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        int dp;
        int i11;
        TextView textView = this.f19668a;
        textView.setText(charSequence);
        ImageView imageView = this.f19669b;
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
        this.f19668a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.f19668a.setTextColor(i10);
    }
}
