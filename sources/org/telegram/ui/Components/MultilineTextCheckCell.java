package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;

public class MultilineTextCheckCell extends FrameLayout {
    private Switch checkBox;
    private boolean needDivivider;
    private TextView subtitleTextView;
    private LinearLayout textLayout;
    private TextView titleTextView;

    public MultilineTextCheckCell(Context context) {
        this(context, null);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivivider) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0.0f, getMeasuredHeight(), Theme.dividerPaint);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.getSize(i2) < AndroidUtilities.dp(50.0f) ? View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824) : View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    public void setTextAndCheck(CharSequence charSequence, boolean z, boolean z2) {
        this.titleTextView.setText(charSequence);
        this.subtitleTextView.setVisibility(8);
        this.checkBox.setChecked(z, false);
        this.needDivivider = z2;
        setWillNotDraw(!z2);
    }

    public void setTextAndSubtextAndCheck(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.titleTextView.setText(charSequence);
        this.subtitleTextView.setVisibility(0);
        this.subtitleTextView.setText(charSequence2);
        this.checkBox.setChecked(z, false);
        this.needDivivider = z2;
        setWillNotDraw(!z2);
    }

    public MultilineTextCheckCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        this.textLayout = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.textLayout;
        boolean z = LocaleController.isRTL;
        addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, z ? 70.0f : 22.0f, 0.0f, z ? 22.0f : 70.0f, 0.0f));
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.titleTextView.setTextSize(1, 16.0f);
        this.titleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView2 = this.titleTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.textLayout.addView(this.titleTextView, LayoutHelper.createLinear(-1, -2));
        TextView textView3 = new TextView(context);
        this.subtitleTextView = textView3;
        textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        this.subtitleTextView.setTextSize(1, 13.0f);
        this.subtitleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.subtitleTextView.setEllipsize(truncateAt);
        this.textLayout.addView(this.subtitleTextView, LayoutHelper.createLinear(-1, -2, 55, 0, 4, 0, 1));
        Switch r0 = new Switch(context, resourcesProvider);
        this.checkBox = r0;
        int i = Theme.key_switchTrack;
        int i2 = Theme.key_switchTrackChecked;
        int i3 = Theme.key_windowBackgroundWhite;
        r0.setColors(i, i2, i3, i3);
        addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }
}
