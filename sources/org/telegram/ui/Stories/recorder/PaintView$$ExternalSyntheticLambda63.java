package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public final class PaintView$$ExternalSyntheticLambda63 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PaintView$$ExternalSyntheticLambda63(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        Activity activityFindActivity;
        Utilities.Callback callback;
        switch (this.$r8$classId) {
            case 0:
                ((RichTextCell$2$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 1:
                ((CaptionContainerView) this.f$0).lambda$new$0$1(view);
                break;
            case 2:
                ((StoryRecorder.AnonymousClass8) this.f$0).showRemoveRoundAlert();
                break;
            case 3:
                int i = Build.VERSION.SDK_INT;
                DownloadButton downloadButton = (DownloadButton) this.f$0;
                if (i >= 23) {
                    if (i > 28) {
                        downloadButton.getClass();
                        if (BuildVars.NO_SCOPED_STORAGE) {
                            if (downloadButton.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                activityFindActivity = AndroidUtilities.findActivity(downloadButton.getContext());
                                if (activityFindActivity != null) {
                                    activityFindActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                                }
                            }
                        }
                    } else if (downloadButton.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        activityFindActivity = AndroidUtilities.findActivity(downloadButton.getContext());
                        if (activityFindActivity != null) {
                            activityFindActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 113);
                        }
                    }
                }
                if (!downloadButton.downloading && downloadButton.currentEntry != null) {
                    if (downloadButton.savedToGalleryUri != null) {
                        if (i >= 30) {
                            downloadButton.getContext().getContentResolver().delete(downloadButton.savedToGalleryUri, null);
                            downloadButton.savedToGalleryUri = null;
                        } else if (i < 29) {
                            try {
                                new File(downloadButton.savedToGalleryUri.toString()).delete();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            downloadButton.savedToGalleryUri = null;
                        }
                    }
                    downloadButton.downloading = true;
                    DownloadButton.PreparingVideoToast preparingVideoToast = downloadButton.toast;
                    if (preparingVideoToast != null) {
                        preparingVideoToast.hide();
                        downloadButton.toast = null;
                    }
                    DownloadButton.BuildingVideo buildingVideo = downloadButton.buildingVideo;
                    if (buildingVideo != null) {
                        buildingVideo.stop(true);
                        downloadButton.buildingVideo = null;
                    }
                    StoryRecorder$$ExternalSyntheticLambda14 storyRecorder$$ExternalSyntheticLambda14 = downloadButton.prepare;
                    if (storyRecorder$$ExternalSyntheticLambda14 != null) {
                        downloadButton.preparing = true;
                        storyRecorder$$ExternalSyntheticLambda14.run(new DownloadButton$$ExternalSyntheticLambda4(downloadButton, 0));
                    }
                    downloadButton.updateImage();
                    if (storyRecorder$$ExternalSyntheticLambda14 == null) {
                        downloadButton.onClickInternal();
                    }
                    break;
                }
                break;
            case 4:
                ((Runnable) this.f$0).run();
                break;
            case 5:
                PreviewButtons previewButtons = PreviewButtons.this;
                if (previewButtons.appearing && (callback = previewButtons.onClickListener) != null) {
                    callback.run(5);
                    break;
                }
                break;
            default:
                StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = ((StoryPrivacyBottomSheet.HeaderCell) this.f$0).onCloseClickListener;
                if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 != null) {
                    storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1.run();
                }
                break;
        }
    }
}
