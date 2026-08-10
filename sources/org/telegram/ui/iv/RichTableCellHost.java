package org.telegram.ui.iv;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class RichTableCellHost extends FrameLayout {
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

    public void setCompact(boolean z) {
        if (z) {
            this.editText.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            this.editText.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            this.editText.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            this.editText.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.editText.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = x >= ((float) this.editText.getLeft()) && x < ((float) this.editText.getRight());
            boolean z2 = y < ((float) this.editText.getTop()) || y >= ((float) this.editText.getBottom());
            if (z && z2 && this.editText.getHeight() > 0) {
                float fMax = Math.max(0.0f, Math.min(y - this.editText.getTop(), this.editText.getHeight() - 1));
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setLocation(x - this.editText.getLeft(), fMax);
                boolean zOnTouchEvent = this.editText.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return zOnTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void bind(org.telegram.tgnet.tl.TL_iv.pageTableCell r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichTableCellHost.bind(org.telegram.tgnet.tl.TL_iv$pageTableCell):void");
    }

    public void applyHeaderWithDefaultBold(boolean z) {
        if (this.cell == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.editText.getText());
        boolean z2 = spannableStringBuilder.length() > 0 && (RichTextStyle.stylesFullyCovering(spannableStringBuilder, 0, spannableStringBuilder.length()) & 1) != 0;
        TableModel.setHeader(this.cell, z);
        if (z) {
            if (spannableStringBuilder.length() > 0) {
                RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true);
            }
        } else if (z2) {
            RichTextStyle.setStyle(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false);
        }
        TableModel.applyStyledText(this.cell, spannableStringBuilder);
        bind(this.cell);
    }

    public void refreshFromCell() {
        if (this.cell == null) {
            return;
        }
        applyAlignment();
        invalidate();
    }

    public void setLocked(boolean z) {
        this.editText.setLocked(z);
    }

    private void applyAlignment() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.editText.getLayoutParams();
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
        this.editText.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.cell;
        if (pagetablecell2.align_right) {
            i3 = 53;
        } else {
            i3 = pagetablecell2.align_center ? 49 : 51;
        }
        this.editText.setGravity(i3);
        this.editText.setTypeface(null);
    }
}
