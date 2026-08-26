package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.io.FileNotFoundException;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoSeekPreviewImage;

public final class PhotoViewer$$ExternalSyntheticLambda5 implements ChooseDownloadQualityLayout.Callback, AlertsCreator.ScheduleDatePickerDelegate, VideoSeekPreviewImage.VideoSeekPreviewImageDelegate, OnApplyWindowInsetsListener, AlertDialog.OnButtonClickListener, SpeedButtonsLayout.Callback {
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda5(PhotoViewer photoViewer) {
        this.f$0 = photoViewer;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) throws FileNotFoundException {
        this.f$0.lambda$showScheduleDatePickerDialog$86(z, i, i2);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.lambda$setParentActivity$6(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$switchToEditMode$114(alertDialog, i);
    }

    @Override
    public void onQualitySelected(MessageObject messageObject, VideoPlayer.Quality quality) {
        this.f$0.lambda$setParentActivity$13(messageObject, quality);
    }

    @Override
    public void onReady() {
        this.f$0.lambda$createVideoControlsInterface$101();
    }

    @Override
    public void onSpeedSelected(float f, boolean z, boolean z2) {
        this.f$0.chooseSpeed(f, z, z2);
    }
}
