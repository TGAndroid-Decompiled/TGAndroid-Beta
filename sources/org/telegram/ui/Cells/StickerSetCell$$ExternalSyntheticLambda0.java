package org.telegram.ui.Cells;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.PremiumButtonView;

public final class StickerSetCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final StickerSetCell f$0;

    public StickerSetCell$$ExternalSyntheticLambda0(StickerSetCell stickerSetCell, int i) {
        this.$r8$classId = i;
        this.f$0 = stickerSetCell;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getClass();
                break;
            default:
                StickerSetCell stickerSetCell = this.f$0;
                PremiumButtonView premiumButtonView = stickerSetCell.premiumButtonView;
                if (premiumButtonView.getVisibility() != 0 || !premiumButtonView.buttonLayout.isEnabled()) {
                    TextView textView = stickerSetCell.addButtonView;
                    if (textView.getVisibility() != 0 || !textView.isEnabled()) {
                        TextView textView2 = stickerSetCell.removeButtonView;
                        if (textView2.getVisibility() == 0 && textView2.isEnabled()) {
                            textView2.performClick();
                            break;
                        }
                    } else {
                        textView.performClick();
                        break;
                    }
                } else {
                    premiumButtonView.performClick();
                    break;
                }
                break;
        }
    }
}
