package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.zxing.BinaryBitmap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.TimelineView;

public final class PhotoViewerCoverEditor extends FrameLayout {
    public float aspectRatio;
    public final ButtonWithCounterView button;
    public Runnable close;
    public GallerySheet gallerySheet;
    public Utilities.Callback onGalleryListener;
    public final EditCoverButton openGalleryButton;
    public long time;
    public final TimelineView timelineView;
    public VideoPlayer videoPlayer;

    public PhotoViewerCoverEditor(Context context, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context);
        this.time = -1L;
        this.aspectRatio = 1.39f;
        ActionBar actionBar = new ActionBar(context, resourcesProvider);
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        actionBar.setItemsColor(-1, false);
        actionBar.setItemsBackgroundColor(587202559, false);
        actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 2));
        addView(actionBar, LayoutHelper.createFrame(-1, -2, 55));
        TimelineView timelineView = new TimelineView(context, null, null, resourcesProvider, blurManager);
        this.timelineView = timelineView;
        timelineView.isCover = true;
        addView(timelineView, LayoutHelper.createFrame(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        buttonWithCounterView.setRoundRadius(24);
        addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        EditCoverButton editCoverButton = new EditCoverButton(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.openGalleryButton = editCoverButton;
        editCoverButton.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62((Object) this, (Object) context, (Object) resourcesProvider, 27, (byte) 0));
        addView(editCoverButton, LayoutHelper.createFrame(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        timelineView.setDelegate(new BinaryBitmap(this));
    }

    public long getTime() {
        return this.time;
    }

    public final void set(MediaController.PhotoEntry photoEntry, VideoPlayer videoPlayer, Theme.ResourcesProvider resourcesProvider) {
        int i;
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.resourcesProvider = resourcesProvider;
        buttonWithCounterView.updateColors$1();
        int i2 = photoEntry.width;
        if (i2 <= 0 || (i = photoEntry.height) <= 0) {
            this.aspectRatio = 1.39f;
        } else {
            this.aspectRatio = Utilities.clamp(i / i2, 1.39f, 0.85f);
        }
        this.videoPlayer = videoPlayer;
        long j = photoEntry.coverSavedPosition;
        if (j >= 0) {
            this.time = j;
            videoPlayer.seekTo(j, false);
        } else {
            this.time = videoPlayer.getCurrentPosition();
        }
        String path = videoPlayer.currentUri.getPath();
        long duration = videoPlayer.getDuration();
        ExoPlayerImpl exoPlayerImpl = videoPlayer.player;
        exoPlayerImpl.verifyApplicationThread();
        this.timelineView.setVideo(false, path, duration, exoPlayerImpl.volume);
        long duration2 = videoPlayer.getDuration();
        float fMax = 2.8f / Math.max(60L, duration2);
        float fMax2 = (1.0f - fMax) * (this.time / Math.max(1L, videoPlayer.getDuration()));
        TimelineView timelineView = this.timelineView;
        timelineView.setVideoLeft(fMax2);
        timelineView.setVideoRight(fMax2 + fMax);
        timelineView.coverStart = 0L;
        timelineView.coverEnd = duration2;
        TimelineView.Track track = timelineView.videoTrack;
        if (track != null) {
            track.setupThumbs(true);
        }
        timelineView.normalizeScrollByVideo();
    }

    public void setOnClose(Runnable runnable) {
        this.close = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.onGalleryListener = callback;
    }
}
