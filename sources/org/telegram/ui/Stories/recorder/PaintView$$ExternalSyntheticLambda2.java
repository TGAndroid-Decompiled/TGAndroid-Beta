package org.telegram.ui.Stories.recorder;

import java.util.List;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.Stories.recorder.PaintView.PopupButton;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;

public final class PaintView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final PaintView f$0;

    public PaintView$$ExternalSyntheticLambda2(PaintView paintView, int i) {
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
                PaintWeightChooserView paintWeightChooserView = this.f$0.weightChooserView;
                if (paintWeightChooserView != null) {
                    paintWeightChooserView.invalidate();
                }
                break;
            case 2:
                PaintView paintView = this.f$0;
                paintView.getClass();
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(paintView, 11);
                new PremiumFeatureBottomSheet(anonymousClass8, paintView.getContext(), anonymousClass8.getCurrentAccount(), false, 14, true, null).show();
                break;
            case 3:
                this.f$0.onOpenCloseStickersAlert(false);
                break;
            default:
                PaintView paintView2 = this.f$0;
                boolean z = PersistColorPalette.getInstance(paintView2.currentAccount).fillShapes;
                int i = 0;
                while (true) {
                    List list = Brush.Shape.SHAPES_LIST;
                    if (i < list.size()) {
                        Brush.Shape shape = (Brush.Shape) list.get(i);
                        int filledIconRes = z ? shape.getFilledIconRes() : shape.getIconRes();
                        String shapeName = shape.getShapeName();
                        TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = new TodoItemMenu$$ExternalSyntheticLambda2(paintView2, shape, filledIconRes, 12);
                        PaintView.PopupButton popupButton = paintView2.new PopupButton(paintView2.getContext());
                        popupButton.setIcon(filledIconRes);
                        popupButton.setText(shapeName);
                        popupButton.setSelected(false);
                        popupButton.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(todoItemMenu$$ExternalSyntheticLambda2, 26));
                        popupButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(paintView2, 14));
                        paintView2.popupLayout.linearLayout.addView(popupButton, LayoutHelper.createLinear(-1, 48));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
