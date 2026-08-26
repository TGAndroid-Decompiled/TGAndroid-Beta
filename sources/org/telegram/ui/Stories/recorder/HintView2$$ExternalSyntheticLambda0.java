package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.VideoScreenPreview;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;

public final class HintView2$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public HintView2$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        int i;
        switch (this.$r8$classId) {
            case 0:
                ((HintView2) this.f$0).lambda$prepareBlur$2((Bitmap) obj);
                break;
            case 1:
                ((CaptionContainerView) this.f$0).updateKeyboard(((Integer) obj).intValue());
                break;
            case 2:
                CollageLayoutView2 collageLayoutView2 = (CollageLayoutView2) this.f$0;
                collageLayoutView2.longPressedPart.content.videoVolume = ((Float) obj).floatValue();
                CollageLayoutView2.Part part = collageLayoutView2.longPressedPart;
                VideoScreenPreview.AnonymousClass3 anonymousClass3 = part.videoPlayer;
                if (anonymousClass3 != null) {
                    anonymousClass3.setVolume(part.content.videoVolume);
                }
                break;
            case 3:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                DownloadButton.BuildingVideo buildingVideo = (DownloadButton.BuildingVideo) this.f$0;
                MessageObject messageObject = buildingVideo.messageObject;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(buildingVideo.messageObject);
                    break;
                }
                break;
            case 4:
                FlashViews flashViews = (FlashViews) this.f$0;
                flashViews.setScreenBrightness(-1.0f);
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(20, flashViews, (Runnable) obj), 80L);
                break;
            case 5:
                ((GalleryListView) this.f$0).searchEmptyView.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                break;
            case 6:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) ((PaintView) this.f$0);
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.previewView.setupAudio((MessageObject) obj);
                StoryEntry storyEntry = storyRecorder.outputEntry;
                int i2 = 0;
                if (storyEntry != null && storyRecorder.mode != 1) {
                    boolean zIsEmpty = TextUtils.isEmpty(storyEntry.audioPath);
                    boolean z = !zIsEmpty;
                    ((PlayPauseDrawable) storyRecorder.playButton.drawable).setPause(storyRecorder.previewView.pauseLinks.contains(-9982), false);
                    storyRecorder.playButton.setVisibility(0);
                    storyRecorder.playButton.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(anonymousClass24, z, 21)).start();
                }
                if (storyRecorder.collageLayoutView.hasLayout()) {
                    ArrayList arrayList = storyRecorder.collageLayoutView.parts;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        StoryEntry storyEntry2 = ((CollageLayoutView2.Part) obj2).content;
                        if (storyEntry2 != null && storyEntry2.isVideo) {
                            if (TextUtils.isEmpty(storyRecorder.outputEntry.audioPath)) {
                                i = -1;
                            } else {
                                i = 2;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                storyRecorder.switchToEditMode(i, true, true);
                break;
            case 7:
                StoryEntry.HDRInfo hDRInfo = (StoryEntry.HDRInfo) obj;
                VideoEditTextureView videoEditTextureView = ((PreviewView) this.f$0).textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.setHDRInfo(hDRInfo);
                }
                break;
            case 8:
                LinkPreview.WebPagePreview webPagePreview = (LinkPreview.WebPagePreview) obj;
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                if (webPagePreview != null) {
                    storyLinkSheet.getClass();
                    storyLinkSheet.photoLarge = webPagePreview.largePhoto;
                    storyLinkSheet.captionAbove = webPagePreview.captionAbove;
                } else {
                    storyLinkSheet.closePreview();
                }
                break;
            case 9:
                StoryPrivacyBottomSheet.this.commentsPrice = ((Integer) obj).intValue();
                break;
            default:
                ((StoryRecorder.AnonymousClass13) this.f$0).takePicture((Utilities.Callback) obj);
                break;
        }
    }
}
