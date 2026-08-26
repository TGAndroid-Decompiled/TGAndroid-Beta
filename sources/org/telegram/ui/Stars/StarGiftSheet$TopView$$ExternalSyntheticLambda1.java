package org.telegram.ui.Stars;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;

public final class StarGiftSheet$TopView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final StarGiftSheet.TopView f$0;

    public StarGiftSheet$TopView$$ExternalSyntheticLambda1(StarGiftSheet.TopView topView, int i) {
        this.$r8$classId = i;
        this.f$0 = topView;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.$r8$classId) {
            case 0:
                CharSequence text = this.f$0.collectionReleasedView.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                    }
                    break;
                }
                break;
            default:
                StarGiftSheet.TopView topView = this.f$0;
                if (topView.resellPriceView.getVisibility() == 0 && (onClickListener = topView.onUpdatePriceClick) != null) {
                    onClickListener.onClick(view);
                }
                break;
        }
    }
}
