package org.telegram.ui.iv;

import android.view.View;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;

public final class RichEditor$$ExternalSyntheticLambda12 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditor$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                return ((RichEditor) this.f$0).onSendLongClick(view);
            case 1:
                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) this.f$0;
                if (sharedPhotoVideoCell.delegate == null) {
                    return false;
                }
                int iIntValue = ((Integer) view.getTag()).intValue();
                return sharedPhotoVideoCell.delegate.didLongClickItem(sharedPhotoVideoCell, sharedPhotoVideoCell.indeces[iIntValue], sharedPhotoVideoCell.messageObjects[iIntValue], iIntValue);
            case 2:
                ((CropRotationWheel) this.f$0).aspectRatioButton.callOnClick();
                return true;
            case 3:
                return ((LPhotoPaintView) this.f$0).lambda$onAddButtonPressed$34(view);
            case 4:
                return ((RichEditText) this.f$0).length() != 0;
            default:
                return ChatAttachAlertRichLayout.this.showSendPreview(view);
        }
    }
}
