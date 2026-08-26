package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.TimelineView;

public class PhotoViewerCoverEditor extends FrameLayout {
    public ActionBar actionBar;
    private float aspectRatio;
    public ButtonWithCounterView button;
    public Runnable close;
    private GallerySheet gallerySheet;
    private Utilities.Callback<MediaController.PhotoEntry> onGalleryListener;
    public EditCoverButton openGalleryButton;
    private long time;
    public TimelineView timelineView;
    private VideoPlayer videoPlayer;

    public class AnonymousClass2 implements TimelineView.TimelineDelegate {
        private Runnable betterSeek = new Bulletin$2$$ExternalSyntheticLambda1(this, 25);

        public AnonymousClass2() {
        }

        public void lambda$$0() {
            PhotoViewerCoverEditor.this.videoPlayer.seekTo(PhotoViewerCoverEditor.this.time, false);
        }

        @Override
        public void onAudioLeftChange(float f) {
        }

        @Override
        public void onAudioOffsetChange(long j) {
        }

        @Override
        public void onAudioRemove() {
        }

        @Override
        public void onAudioRightChange(float f) {
        }

        @Override
        public void onAudioVolumeChange(float f) {
        }

        @Override
        public void onProgressChange(long j, boolean z) {
        }

        @Override
        public void onProgressDragChange(boolean z) {
        }

        @Override
        public void onRoundLeftChange(float f) {
        }

        @Override
        public void onRoundOffsetChange(long j) {
        }

        @Override
        public void onRoundRemove() {
        }

        @Override
        public void onRoundRightChange(float f) {
        }

        @Override
        public void onRoundSelectChange(boolean z) {
        }

        @Override
        public void onRoundVolumeChange(float f) {
        }

        @Override
        public void onVideoLeftChange(int i, float f) {
        }

        @Override
        public void onVideoOffsetChange(int i, long j) {
        }

        @Override
        public void onVideoRightChange(int i, float f) {
        }

        @Override
        public void onVideoSelected(int i) {
        }

        @Override
        public void onVideoVolumeChange(float f) {
        }

        @Override
        public void onVideoLeftChange(boolean z, float f) {
            if (PhotoViewerCoverEditor.this.videoPlayer == null) {
                return;
            }
            long duration = PhotoViewerCoverEditor.this.videoPlayer.getDuration();
            float fMax = 2.8f / Math.max(60L, duration);
            PhotoViewerCoverEditor.this.time = (long) ((((f / (1.0f - fMax)) * fMax) + f) * duration);
            PhotoViewerCoverEditor.this.videoPlayer.seekTo(PhotoViewerCoverEditor.this.time, !z);
            if (z) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.betterSeek);
            AndroidUtilities.runOnUIThread(this.betterSeek, 120L);
        }

        @Override
        public void onVideoRightChange(boolean z, float f) {
        }

        @Override
        public void onVideoVolumeChange(int i, float f) {
        }
    }

    public PhotoViewerCoverEditor(Context context, Theme.ResourcesProvider resourcesProvider, PhotoViewer photoViewer, BlurringShader.BlurManager blurManager) {
        super(context);
        this.time = -1L;
        this.aspectRatio = 1.39f;
        ActionBar actionBar = new ActionBar(context, resourcesProvider);
        this.actionBar = actionBar;
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setItemsBackgroundColor(587202559, false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                Runnable runnable;
                if (i != -1 || (runnable = PhotoViewerCoverEditor.this.close) == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        });
        addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 55));
        TimelineView timelineView = new TimelineView(context, null, null, resourcesProvider, blurManager);
        this.timelineView = timelineView;
        timelineView.isCover = true;
        addView(timelineView, LayoutHelper.createFrame(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.EditorSetCoverSave), false);
        this.button.setRound();
        addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        EditCoverButton editCoverButton = new EditCoverButton(context, LocaleController.getString(R.string.EditorSetCoverGallery), true);
        this.openGalleryButton = editCoverButton;
        editCoverButton.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, context, resourcesProvider, 17));
        addView(this.openGalleryButton, LayoutHelper.createFrame(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        this.timelineView.setDelegate(new AnonymousClass2());
    }

    public void lambda$new$0() {
        this.gallerySheet = null;
    }

    public void lambda$new$1(Context context, Theme.ResourcesProvider resourcesProvider, View view) {
        if (this.gallerySheet == null) {
            GallerySheet gallerySheet = new GallerySheet(context, resourcesProvider, LocaleController.getString(R.string.VideoChooseCover), this.aspectRatio);
            this.gallerySheet = gallerySheet;
            gallerySheet.setOnDismissListener(new GroupCallPip$$ExternalSyntheticLambda2(this, 29));
            this.gallerySheet.onGalleryListener = this.onGalleryListener;
        }
        this.gallerySheet.show();
    }

    public void closeGallery() {
        GallerySheet gallerySheet = this.gallerySheet;
        if (gallerySheet != null) {
            gallerySheet.lambda$showGiftOfferSheet$15();
            this.gallerySheet = null;
        }
    }

    public void destroy() {
        this.videoPlayer = null;
        this.timelineView.setVideo(false, null, 0L, 0.0f);
    }

    public long getTime() {
        return this.time;
    }

    public void set(MediaController.PhotoEntry photoEntry, VideoPlayer videoPlayer, Theme.ResourcesProvider resourcesProvider) {
        int i;
        this.button.updateColors(resourcesProvider);
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
        this.timelineView.setVideo(false, videoPlayer.getCurrentUri().getPath(), videoPlayer.getDuration(), videoPlayer.player.getVolume());
        long duration = videoPlayer.getDuration();
        float fMax = 2.8f / Math.max(60L, duration);
        float fMax2 = (1.0f - fMax) * (this.time / Math.max(1L, videoPlayer.getDuration()));
        this.timelineView.setVideoLeft(fMax2);
        this.timelineView.setVideoRight(fMax2 + fMax);
        TimelineView timelineView = this.timelineView;
        timelineView.coverStart = 0L;
        timelineView.coverEnd = duration;
        TimelineView.Track track = timelineView.videoTrack;
        if (track != null) {
            track.setupThumbs(true);
        }
        this.timelineView.normalizeScrollByVideo();
    }

    public void setOnClose(Runnable runnable) {
        this.close = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.onGalleryListener = callback;
    }
}
