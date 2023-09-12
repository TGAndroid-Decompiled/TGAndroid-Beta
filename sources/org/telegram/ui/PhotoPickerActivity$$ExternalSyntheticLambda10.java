package org.telegram.ui;

import org.telegram.ui.Components.AlertsCreator;
public final class PhotoPickerActivity$$ExternalSyntheticLambda10 implements AlertsCreator.ScheduleDatePickerDelegate {
    public final PhotoPickerActivity f$0;

    public PhotoPickerActivity$$ExternalSyntheticLambda10(PhotoPickerActivity photoPickerActivity) {
        this.f$0 = photoPickerActivity;
    }

    @Override
    public final void didSelectDate(boolean z, int i) {
        this.f$0.sendSelectedPhotos(z, i);
    }
}
