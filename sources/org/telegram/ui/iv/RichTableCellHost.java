package org.telegram.ui.iv;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class RichTableCellHost extends FrameLayout {
    public TL_iv.pageTableCell cell;
    public final RichEditText editText;

    public RichTableCellHost(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        RichEditText richEditText = new RichEditText(context, resourcesProvider);
        this.editText = richEditText;
        richEditText.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        richEditText.setAllowNewlines(true);
        setCompact(false);
        addView(richEditText, LayoutHelper.createFrame(-1, -2, 51));
    }

    public final void applyAlignment() {
        int i;
        int i2;
        int i3;
        RichEditText richEditText = this.editText;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) richEditText.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.cell;
        if (pagetablecell.align_right) {
            i = 5;
        } else {
            i = pagetablecell.align_center ? 1 : 3;
        }
        if (pagetablecell.valign_middle) {
            i2 = i | 16;
        } else {
            i2 = pagetablecell.valign_bottom ? i | 80 : i | 48;
        }
        layoutParams.gravity = i2;
        richEditText.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.cell;
        if (pagetablecell2.align_right) {
            i3 = 53;
        } else {
            i3 = pagetablecell2.align_center ? 49 : 51;
        }
        richEditText.setGravity(i3);
        richEditText.setTypeface(null);
    }

    public final void bind(TL_iv.pageTableCell pagetablecell) {
        boolean z;
        TL_iv.RichText richText;
        this.cell = pagetablecell;
        applyAlignment();
        CharSequence spannable = (pagetablecell == null || (richText = pagetablecell.text) == null) ? "" : RichTextStyle.toSpannable(richText, null);
        if (pagetablecell.header) {
            z = true;
            if (spannable.length() != 0 && (RichTextStyle.stylesFullyCovering(spannable, 0, spannable.length()) & 1) == 0) {
                z = false;
            }
        } else {
            z = false;
        }
        RichEditText richEditText = this.editText;
        richEditText.setAutoBold(z);
        richEditText.setTextSilently(Emoji.replaceEmoji(spannable, richEditText.getPaint().getFontMetricsInt(), false));
        richEditText.invalidateEffects();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RichEditText richEditText = this.editText;
        if (richEditText.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = x >= ((float) richEditText.getLeft()) && x < ((float) richEditText.getRight());
            boolean z2 = y < ((float) richEditText.getTop()) || y >= ((float) richEditText.getBottom());
            if (z && z2 && richEditText.getHeight() > 0) {
                float left = x - richEditText.getLeft();
                float fMax = Math.max(0.0f, Math.min(y - richEditText.getTop(), richEditText.getHeight() - 1));
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setLocation(left, fMax);
                boolean zOnTouchEvent = richEditText.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return zOnTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        RichEditText richEditText = this.editText;
        if (z) {
            richEditText.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            richEditText.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            richEditText.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            richEditText.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }
}
