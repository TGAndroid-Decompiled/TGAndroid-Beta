package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;

public final class MessageSeenCheckDrawable {
    public final int colorKey;
    public Drawable drawable;
    public int lastColor;
    public float lastDensity;
    public SpannableStringBuilder lastSpanned;
    public final int resId;
    public int w = -1;
    public int h = -1;

    public MessageSeenCheckDrawable(int i, int i2) {
        this.resId = i;
        this.colorKey = i2;
    }

    public final SpannableStringBuilder getSpanned(Context context, Theme.ResourcesProvider resourcesProvider) {
        SpannableStringBuilder spannableStringBuilder = this.lastSpanned;
        int i = this.colorKey;
        if (spannableStringBuilder != null && this.drawable != null && AndroidUtilities.density == this.lastDensity) {
            if (this.lastColor != Theme.getColor(i, resourcesProvider)) {
                Drawable drawable = this.drawable;
                int color = Theme.getColor(i, resourcesProvider);
                this.lastColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            return this.lastSpanned;
        }
        if (context == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
        this.lastDensity = AndroidUtilities.density;
        Drawable drawableMutate = context.getResources().getDrawable(this.resId).mutate();
        this.drawable = drawableMutate;
        int color2 = Theme.getColor(i, resourcesProvider);
        this.lastColor = color2;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        int i2 = this.w;
        int intrinsicWidth = i2 <= 0 ? this.drawable.getIntrinsicWidth() : AndroidUtilities.dp(i2);
        int i3 = this.h;
        int intrinsicHeight = i3 <= 0 ? this.drawable.getIntrinsicHeight() : AndroidUtilities.dp(i3);
        int iDp = AndroidUtilities.dp(4.66f);
        this.drawable.setBounds(0, iDp, intrinsicWidth, intrinsicHeight + iDp);
        spannableStringBuilder2.setSpan(new ImageSpan(this.drawable, 2), 0, 1, 33);
        spannableStringBuilder2.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(2.0f)), 1, 2, 33);
        this.lastSpanned = spannableStringBuilder2;
        return spannableStringBuilder2;
    }
}
