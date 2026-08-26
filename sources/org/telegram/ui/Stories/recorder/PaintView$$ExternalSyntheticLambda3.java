package org.telegram.ui.Stories.recorder;

import android.view.View;
import java.util.List;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stories.recorder.PaintView.PopupButton;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public final class PaintView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final PaintView f$0;

    public PaintView$$ExternalSyntheticLambda3(PaintView paintView, int i) {
        this.$r8$classId = i;
        this.f$0 = paintView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getClass();
                break;
            case 1:
                PaintView paintView = this.f$0;
                boolean z = PersistColorPalette.getInstance(paintView.currentAccount).fillShapes;
                int i = 0;
                while (true) {
                    List list = Brush.Shape.SHAPES_LIST;
                    if (i < list.size()) {
                        Brush.Shape shape = (Brush.Shape) list.get(i);
                        int filledIconRes = z ? shape.getFilledIconRes() : shape.getIconRes();
                        String shapeName = shape.getShapeName();
                        RichTextCell$2$$ExternalSyntheticLambda1 richTextCell$2$$ExternalSyntheticLambda1 = new RichTextCell$2$$ExternalSyntheticLambda1(paintView, shape, filledIconRes, 22);
                        PaintView.PopupButton popupButton = paintView.new PopupButton(paintView.getContext());
                        popupButton.setIcon(filledIconRes);
                        popupButton.setText(shapeName);
                        popupButton.setSelected(false);
                        popupButton.setOnClickListener(new PaintView$$ExternalSyntheticLambda63(richTextCell$2$$ExternalSyntheticLambda1, 0));
                        popupButton.setOnLongClickListener(new PaintView$$ExternalSyntheticLambda42(paintView, 0));
                        paintView.popupLayout.addView((View) popupButton, LayoutHelper.createLinear(-1, 48));
                        i++;
                    }
                    break;
                }
                break;
            case 2:
                PaintWeightChooserView paintWeightChooserView = this.f$0.weightChooserView;
                if (paintWeightChooserView != null) {
                    paintWeightChooserView.invalidate();
                }
                break;
            case 3:
                PaintView paintView2 = this.f$0;
                paintView2.getClass();
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(paintView2, 7);
                new PremiumFeatureBottomSheet(anonymousClass8, paintView2.getContext(), anonymousClass8.getCurrentAccount(), false, 14, true, null).show();
                break;
            default:
                this.f$0.onOpenCloseStickersAlert(false);
                break;
        }
    }
}
