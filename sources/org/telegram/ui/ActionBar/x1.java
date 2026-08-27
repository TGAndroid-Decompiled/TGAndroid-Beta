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
import org.telegram.messenger.rl;

public final class x1 extends FrameLayout {

    public final TextView f23942a;

    public final ImageView f23943b;

    public x1(Context context, c6 c6Var) {
        super(context);
        setBackground(g6.f0(g6.v0(g6.I5, c6Var), 2, -1));
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f23943b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.J5, c6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.f23942a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        rl.l(g6.f23161j5, c6Var, textView, 1, 16.0f);
        addView(textView, h7.z5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        TextView textView = this.f23942a;
        textView.setText(charSequence);
        ImageView imageView = this.f23943b;
        if (i10 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
            textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(56.0f) : 0, 0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f23942a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.f23942a.setTextColor(i10);
    }
}
