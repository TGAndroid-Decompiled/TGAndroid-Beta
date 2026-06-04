package org.telegram.ui.iv;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
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
        richEditText.setTextSize(1, 16.0f);
        richEditText.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
        addView(richEditText, LayoutHelper.createFrame(-1, -2, 51));
    }

    public void bind(TL_iv.pageTableCell pagetablecell) {
        this.cell = pagetablecell;
        applyAlignment();
        this.editText.setTextSilently(TableModel.readPlainText(pagetablecell));
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
        if (this.cell.header) {
            this.editText.setTypeface(AndroidUtilities.bold());
        } else {
            this.editText.setTypeface(null);
        }
    }
}
