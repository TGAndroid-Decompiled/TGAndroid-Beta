package org.telegram.ui.Components.Paint.Views;

import java.util.List;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView.PopupButton;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;

public final class LPhotoPaintView$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda21(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LPhotoPaintView lPhotoPaintView = this.f$0;
                ThanosEffect thanosEffect = lPhotoPaintView.thanosEffect;
                if (thanosEffect != null) {
                    lPhotoPaintView.thanosEffect = null;
                    lPhotoPaintView.removeView(thanosEffect);
                }
                break;
            case 1:
                LPhotoPaintView lPhotoPaintView2 = this.f$0;
                if (lPhotoPaintView2.facesBitmap != null) {
                    lPhotoPaintView2.queue.postRunnable(new LPhotoPaintView$$ExternalSyntheticLambda21(lPhotoPaintView2, 3), 200L);
                }
                break;
            case 2:
                PaintWeightChooserView paintWeightChooserView = this.f$0.weightChooserView;
                if (paintWeightChooserView != null) {
                    paintWeightChooserView.invalidate();
                }
                break;
            case 3:
                this.f$0.lambda$detectFaces$24();
                break;
            default:
                LPhotoPaintView lPhotoPaintView3 = this.f$0;
                boolean z = PersistColorPalette.getInstance(lPhotoPaintView3.currentAccount).fillShapes;
                int i = 0;
                while (true) {
                    List list = Brush.Shape.SHAPES_LIST;
                    if (i < list.size()) {
                        Brush.Shape shape = (Brush.Shape) list.get(i);
                        int filledIconRes = z ? shape.getFilledIconRes() : shape.getIconRes();
                        String shapeName = shape.getShapeName();
                        ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = new ChatActivity$$ExternalSyntheticLambda17(lPhotoPaintView3, shape, filledIconRes, 26);
                        LPhotoPaintView.PopupButton popupButton = lPhotoPaintView3.new PopupButton(lPhotoPaintView3.getContext());
                        popupButton.setIcon(filledIconRes);
                        popupButton.setText(shapeName);
                        popupButton.setSelected(false);
                        popupButton.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(chatActivity$$ExternalSyntheticLambda17, 9));
                        popupButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(lPhotoPaintView3, 7));
                        lPhotoPaintView3.popupLayout.linearLayout.addView(popupButton, LayoutHelper.createLinear(-1, 48));
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
