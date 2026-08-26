package org.telegram.ui.Stories;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedTextView;

public final class StoryPositionView {
    public int lastHash;
    public final SpannableStringBuilder leftSpace;
    public final SpannableStringBuilder rightSpace;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public StoryPositionView() {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
        this.textDrawable = animatedTextDrawable;
        Paint paint = new Paint(1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        paint.setColor(ColorUtils.setAlphaComponent(-16777216, 58));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        this.leftSpace = spannableStringBuilder;
        spannableStringBuilder.append((CharSequence) " ").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(1.0f)), 0, 1, 0);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.rightSpace = spannableStringBuilder2;
        spannableStringBuilder2.append((CharSequence) " ").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(1.0f)), 0, 1, 0);
    }
}
