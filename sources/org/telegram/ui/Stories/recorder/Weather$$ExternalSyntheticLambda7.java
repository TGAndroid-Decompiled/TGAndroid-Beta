package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;

public final class Weather$$ExternalSyntheticLambda7 implements AlertDialog.OnButtonClickListener, RecyclerAnimationScrollHelper.ScrollListener, RecyclerListView.OnItemLongClickListener, Utilities.Callback5, UndoStore.UndoStoreDelegate, CameraController.VideoTakeCallback {
    public final int $r8$classId;
    public final Object f$0;

    public Weather$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public void historyChanged() {
        StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.f$0;
        boolean zCanUndo = anonymousClass24.undoStore.canUndo();
        ImageView imageView = anonymousClass24.undoButton;
        imageView.animate().cancel();
        imageView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(zCanUndo);
        TextView textView = anonymousClass24.undoAllButton;
        textView.animate().cancel();
        textView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(zCanUndo);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                try {
                    ((Context) this.f$0).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                CaptionStory captionStory = (CaptionStory) this.f$0;
                captionStory.getClass();
                StoryRecorder storyRecorder = StoryRecorder.this;
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.setupRound(null, null, true);
                }
                StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                if (anonymousClass24 != null) {
                    anonymousClass24.deleteRound();
                }
                StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                if (anonymousClass8 != null) {
                    anonymousClass8.setHasRoundVideo(false);
                }
                StoryEntry storyEntry = storyRecorder.outputEntry;
                if (storyEntry != null) {
                    File file = storyEntry.round;
                    if (file != null) {
                        try {
                            file.delete();
                            break;
                        } catch (Exception unused2) {
                        }
                        storyRecorder.outputEntry.round = null;
                    }
                    if (storyRecorder.outputEntry.roundThumb != null) {
                        try {
                            new File(storyRecorder.outputEntry.roundThumb).delete();
                            break;
                        } catch (Exception unused3) {
                        }
                        storyRecorder.outputEntry.roundThumb = null;
                    }
                }
                break;
            case 5:
                ((Runnable) this.f$0).run();
                break;
            default:
                PaintView.this.emojiView.clearRecentEmoji();
                break;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j) {
        StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) this.f$0;
        StoryRecorder storyRecorder = StoryRecorder.this;
        RecordControl recordControl = storyRecorder.recordControl;
        if (recordControl != null) {
            recordControl.recordingLoading = false;
            recordControl.invalidate();
        }
        if (storyRecorder.useDisplayFlashlight()) {
            storyRecorder.flashViews.flashOut();
        }
        if (storyRecorder.outputFile == null || storyRecorder.cameraView == null) {
            return;
        }
        storyRecorder.takingVideo = false;
        storyRecorder.stoppingTakingVideo = false;
        QRScanner qRScanner = storyRecorder.qrScanner;
        if (qRScanner != null) {
            qRScanner.setPaused(false);
        }
        if (j <= 800) {
            storyRecorder.animateRecording(false, true);
            storyRecorder.setAwakeLock(false);
            storyRecorder.videoTimerView.setRecording(false, true);
            RecordControl recordControl2 = storyRecorder.recordControl;
            if (recordControl2 != null) {
                recordControl2.recordingLoading = false;
                recordControl2.invalidate();
            }
            try {
                storyRecorder.outputFile.delete();
                storyRecorder.outputFile = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            }
            return;
        }
        storyRecorder.showVideoTimer(false, true);
        File file = storyRecorder.outputFile;
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.fromCamera = true;
        storyEntry.file = file;
        storyEntry.fileDeletable = true;
        storyEntry.orientation = 0;
        storyEntry.invert = 0;
        storyEntry.isVideo = true;
        storyEntry.duration = j;
        storyEntry.thumbPath = str;
        storyEntry.left = 0.0f;
        storyEntry.right = Math.min(1.0f, 59500.0f / j);
        storyEntry.botId = storyRecorder.botId;
        storyEntry.botLang = storyRecorder.botLang;
        storyEntry.setupMultipleStoriesSelector();
        storyRecorder.animateRecording(false, true);
        storyRecorder.setAwakeLock(false);
        storyRecorder.videoTimerView.setRecording(false, true);
        RecordControl recordControl3 = storyRecorder.recordControl;
        if (recordControl3 != null) {
            recordControl3.recordingLoading = false;
            recordControl3.invalidate();
        }
        boolean zHasLayout = storyRecorder.collageLayoutView.hasLayout();
        int i = storyRecorder.currentAccount;
        if (!zHasLayout) {
            storyRecorder.outputEntry = storyEntry;
            StoryPrivacySelector.applySaved(i, storyEntry);
            storyRecorder.fromGallery = false;
            int videoWidth = storyRecorder.cameraView.getVideoWidth();
            int videoHeight = storyRecorder.cameraView.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                storyEntry2.width = videoWidth;
                storyEntry2.height = videoHeight;
                storyEntry2.setupMatrix();
            }
            storyRecorder.navigateToPreviewWithPlayerAwait(0L, new StoryRecorder$13$$ExternalSyntheticLambda0(anonymousClass13, 3));
            return;
        }
        storyRecorder.outputFile = null;
        storyEntry.videoVolume = 1.0f;
        if (storyRecorder.collageLayoutView.push(storyEntry)) {
            StoryEntry storyEntryAsCollage = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
            storyRecorder.outputEntry = storyEntryAsCollage;
            StoryPrivacySelector.applySaved(i, storyEntryAsCollage);
            storyRecorder.fromGallery = false;
            int videoWidth2 = storyRecorder.cameraView.getVideoWidth();
            int videoHeight2 = storyRecorder.cameraView.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                StoryEntry storyEntry3 = storyRecorder.outputEntry;
                storyEntry3.width = videoWidth2;
                storyEntry3.height = videoHeight2;
                storyEntry3.setupMatrix();
            }
        }
        storyRecorder.updateActionBarButtons(true);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        GalleryListView galleryListView = (GalleryListView) this.f$0;
        if (i < 2) {
            galleryListView.getClass();
            return false;
        }
        if (galleryListView.onSelectListener != null && (view instanceof GalleryListView.Cell)) {
            int size = i - 2;
            if (galleryListView.containsDraftFolder) {
                if (size != 0) {
                    size = i - 3;
                    if (size >= 0 && size < galleryListView.photos.size()) {
                        photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                        arrayList = galleryListView.selectedPhotos;
                        if (arrayList.isEmpty() && !galleryListView.multipleOnClick) {
                            if (arrayList.contains(photoEntry)) {
                                arrayList.remove(photoEntry);
                            } else {
                                if (arrayList.size() + 1 > galleryListView.maxCount) {
                                    int i2 = -galleryListView.shiftDp;
                                    galleryListView.shiftDp = i2;
                                    AndroidUtilities.shakeViewSpring(view, i2);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return true;
                                }
                                arrayList.add(photoEntry);
                            }
                            AndroidUtilities.updateVisibleRows(galleryListView.listView);
                            galleryListView.updateSelectButtonVisible();
                            return true;
                        }
                    }
                }
            } else if (galleryListView.containsDrafts) {
                ArrayList arrayList2 = galleryListView.drafts;
                if (size < 0 || size >= arrayList2.size()) {
                    size -= arrayList2.size();
                    if (size >= 0) {
                        photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                        arrayList = galleryListView.selectedPhotos;
                        if (arrayList.isEmpty()) {
                            if (arrayList.contains(photoEntry)) {
                                arrayList.remove(photoEntry);
                            } else {
                                if (arrayList.size() + 1 > galleryListView.maxCount) {
                                    int i3 = -galleryListView.shiftDp;
                                    galleryListView.shiftDp = i3;
                                    AndroidUtilities.shakeViewSpring(view, i3);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return true;
                                }
                                arrayList.add(photoEntry);
                            }
                            AndroidUtilities.updateVisibleRows(galleryListView.listView);
                            galleryListView.updateSelectButtonVisible();
                            return true;
                        }
                    }
                }
            } else if (size >= 0) {
                photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                arrayList = galleryListView.selectedPhotos;
                if (arrayList.isEmpty()) {
                    if (arrayList.contains(photoEntry)) {
                        arrayList.remove(photoEntry);
                    } else {
                        if (arrayList.size() + 1 > galleryListView.maxCount) {
                            int i4 = -galleryListView.shiftDp;
                            galleryListView.shiftDp = i4;
                            AndroidUtilities.shakeViewSpring(view, i4);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return true;
                        }
                        arrayList.add(photoEntry);
                    }
                    AndroidUtilities.updateVisibleRows(galleryListView.listView);
                    galleryListView.updateSelectButtonVisible();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onScroll() {
        ((EmojiBottomSheet.EmojiListView) this.f$0).invalidate();
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this.f$0;
        UItem uItem = (UItem) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i = uItem.id;
        StoryEntry storyEntry = (StoryEntry) uItem.object;
        anonymousClass11.showList(false, true);
        StoryRecorder storyRecorder = StoryRecorder.this;
        if (storyEntry == storyRecorder.outputEntry || storyRecorder.switchingStory) {
            return;
        }
        storyRecorder.storiesSelector.setSelected(i);
        storyRecorder.switchingStory = true;
        Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda19 = new Theme$$ExternalSyntheticLambda19(storyRecorder, i, 23);
        StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        if (anonymousClass24 == null || storyEntry2 == null) {
            theme$$ExternalSyntheticLambda19.run();
            return;
        }
        if (!anonymousClass24.hasChanges()) {
            theme$$ExternalSyntheticLambda19.run();
            return;
        }
        storyEntry2.clearPaint();
        boolean zHasChanges = anonymousClass24.hasChanges();
        boolean z = anonymousClass24.renderView.getPainting().hasBlur;
        Utilities.searchQueue.postRunnable(new StoryRecorder$$ExternalSyntheticLambda112(storyRecorder, anonymousClass24, storyEntry2.resultWidth, storyEntry2.resultHeight, storyEntry2, z, zHasChanges, theme$$ExternalSyntheticLambda19, 0));
    }
}
