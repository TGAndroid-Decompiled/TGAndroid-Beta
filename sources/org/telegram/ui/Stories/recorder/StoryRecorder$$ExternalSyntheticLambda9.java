package org.telegram.ui.Stories.recorder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.ZoomControlView;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda10;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class StoryRecorder$$ExternalSyntheticLambda9 implements AlertDialog.OnButtonClickListener, OnApplyWindowInsetsListener, ZoomControlView.ZoomControlViewDelegate, Utilities.CallbackVoidReturn, VideoEditTextureView.VideoEditTextureViewDelegate, StoryPrivacyBottomSheet.DoneCallback, StoryEntry.DecodeBitmap, CameraView.CameraViewDelegate {
    public final int $r8$classId;
    public final StoryRecorder f$0;

    public StoryRecorder$$ExternalSyntheticLambda9(StoryRecorder storyRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = storyRecorder;
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f$0.outputEntry.file.getAbsolutePath(), options);
    }

    @Override
    public void didSetZoom(float f) {
        StoryRecorder storyRecorder = this.f$0;
        StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
        if (anonymousClass25 != null) {
            storyRecorder.cameraZoom = f;
            anonymousClass25.setZoom(f);
        }
        storyRecorder.showZoomControls(true);
    }

    @Override
    public void done(final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, final boolean z, final boolean z2, boolean z3, final boolean z4, final TLRPC.InputPeer inputPeer, final int i, ButtonWithCounterView$$ExternalSyntheticLambda1 buttonWithCounterView$$ExternalSyntheticLambda1, final PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda12) {
        int i2 = 0;
        switch (this.$r8$classId) {
            case 9:
                StoryRecorder storyRecorder = this.f$0;
                if (storyRecorder.outputEntry != null) {
                    storyRecorder.previewView.updatePauseReason(5, true);
                    storyRecorder.outputEntry.privacy = storyPrivacy;
                    int i3 = StoryPrivacySelector.$r8$clinit;
                    SerializedData serializedData = new SerializedData(true);
                    StoryPrivacySelector.write(serializedData, storyPrivacy);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    StoryPrivacySelector.write(serializedData2, storyPrivacy);
                    MessagesController.getInstance(storyRecorder.currentAccount).getMainSettings().edit().putString("story_privacy2", Utilities.bytesToHex(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    StoryEntry storyEntry = storyRecorder.outputEntry;
                    storyEntry.pinned = z3;
                    storyEntry.allowScreenshots = z2;
                    storyEntry.privacyRules.clear();
                    ArrayList arrayList = storyRecorder.outputEntry.privacyRules;
                    ArrayList arrayList2 = storyPrivacy.rules;
                    arrayList.addAll(arrayList2);
                    StoryEntry storyEntry2 = storyRecorder.outputEntry;
                    storyEntry2.editedPrivacy = true;
                    storyEntry2.peer = inputPeer;
                    ArrayList arrayList3 = storyRecorder.entries;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            StoryEntry storyEntry3 = (StoryEntry) obj;
                            storyEntry3.privacy = storyPrivacy;
                            storyEntry3.pinned = z3;
                            storyEntry3.allowScreenshots = z2;
                            ArrayList arrayList4 = storyEntry3.privacyRules;
                            arrayList4.clear();
                            arrayList4.addAll(arrayList2);
                            storyEntry3.editedPrivacy = true;
                            storyEntry3.peer = inputPeer;
                        }
                    }
                    storyRecorder.applyFilter(new RichTableCell$$ExternalSyntheticLambda3(7, storyRecorder, buttonWithCounterView$$ExternalSyntheticLambda1));
                    break;
                }
                break;
            default:
                final StoryRecorder storyRecorder2 = this.f$0;
                storyRecorder2.getClass();
                PermissionRequest.ensureAllPermissions(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, z4 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        final StoryRecorder storyRecorder3 = storyRecorder2;
                        storyRecorder3.getClass();
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda13 = previewView$$ExternalSyntheticLambda12;
                        if (!zBooleanValue) {
                            previewView$$ExternalSyntheticLambda13.run();
                            return;
                        }
                        StoryRecorder.AnonymousClass25 anonymousClass25 = storyRecorder3.cameraView;
                        final boolean z5 = anonymousClass25 == null || anonymousClass25.isFrontface();
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = !z2;
                        TLRPC.InputPeer inputPeer2 = inputPeer;
                        tL_startLive.peer = inputPeer2 == null ? new TLRPC.TL_inputPeerSelf() : inputPeer2;
                        int i4 = storyRecorder3.currentAccount;
                        final long clientUserId = (inputPeer2 == null || (inputPeer2 instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(i4).getClientUserId() : DialogObject.getPeerDialogId(inputPeer2);
                        tL_startLive.privacy_rules.addAll(storyPrivacy.rules);
                        tL_startLive.random_id = Utilities.random.nextLong();
                        final boolean z6 = z4;
                        tL_startLive.rtmp_stream = z6;
                        tL_startLive.messages_enabled = Boolean.valueOf(z);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i);
                        ConnectionsManager.getInstance(i4).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                StoryRecorder storyRecorder4 = storyRecorder3;
                                storyRecorder4.getClass();
                                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda10(storyRecorder4, tLObject, tL_startLive, z6, clientUserId, z5, tL_error, previewView$$ExternalSyntheticLambda13));
                            }
                        });
                    }
                });
                break;
        }
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        StoryRecorder storyRecorder = this.f$0;
        storyRecorder.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        storyRecorder.insetLeft = defaultWindowInsets.left;
        storyRecorder.insetTop = defaultWindowInsets.top;
        storyRecorder.insetRight = defaultWindowInsets.right;
        storyRecorder.insetBottom = defaultWindowInsets.bottom;
        storyRecorder.windowView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onCameraInit() {
        StoryRecorder storyRecorder = this.f$0;
        String currentFlashMode = storyRecorder.getCurrentFlashMode();
        if (TextUtils.equals(currentFlashMode, storyRecorder.getNextFlashMode())) {
            currentFlashMode = null;
        }
        storyRecorder.setCameraFlashModeIcon(storyRecorder.currentPage == 0 ? currentFlashMode : null);
        ZoomControlView zoomControlView = storyRecorder.zoomControlView;
        if (zoomControlView != null) {
            storyRecorder.cameraZoom = 0.0f;
            zoomControlView.setZoom(0.0f, false);
        }
        storyRecorder.updateActionBarButtons(true);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                StoryRecorder storyRecorder = this.f$0;
                storyRecorder.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    storyRecorder.activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                StoryRecorder storyRecorder2 = this.f$0;
                storyRecorder2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    storyRecorder2.activity.startActivity(intent2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            case 2:
                StoryRecorder storyRecorder3 = this.f$0;
                storyRecorder3.getClass();
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    storyRecorder3.activity.startActivity(intent3);
                } catch (Exception e3) {
                    FileLog.e(e3);
                    return;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                StoryRecorder storyRecorder4 = this.f$0;
                storyRecorder4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    storyRecorder4.activity.startActivity(intent4);
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                break;
            case 7:
                StoryRecorder storyRecorder5 = this.f$0;
                StoryEntry storyEntry = storyRecorder5.outputEntry;
                if (storyEntry != null) {
                    int i2 = storyRecorder5.currentAccount;
                    storyEntry.captionEntitiesAllowed = MessagesController.getInstance(i2).storyEntitiesAllowed();
                    storyRecorder5.showSavedDraftHint = !storyRecorder5.outputEntry.isDraft;
                    storyRecorder5.applyFilter(null);
                    storyRecorder5.applyPaint();
                    storyRecorder5.applyPaintMessage();
                    storyRecorder5.destroyPhotoFilterView();
                    StoryEntry storyEntry2 = storyRecorder5.outputEntry;
                    storyEntry2.destroy(true);
                    storyEntry2.caption = storyRecorder5.captionEdit.getText();
                    storyRecorder5.outputEntry = null;
                    storyRecorder5.prepareThumb(true, storyEntry2);
                    DraftsController draftsController = MessagesController.getInstance(i2).getStoriesController().draftsController;
                    if (storyEntry2.isDraft) {
                        draftsController.edit(storyEntry2);
                    } else {
                        draftsController.getClass();
                        if (!storyEntry2.isRepostMessage) {
                            draftsController.prepare(storyEntry2);
                            storyEntry2.draftId = Utilities.random.nextLong();
                            DraftsController.StoryDraft storyDraft = new DraftsController.StoryDraft(storyEntry2);
                            ArrayList arrayList = draftsController.drafts;
                            arrayList.remove(storyEntry2);
                            arrayList.add(0, storyEntry2);
                            draftsController.append(storyDraft);
                        }
                    }
                    storyRecorder5.navigateTo(0, true);
                    break;
                }
                break;
            case 8:
                StoryRecorder storyRecorder6 = this.f$0;
                StoryEntry storyEntry3 = storyRecorder6.outputEntry;
                if (storyEntry3 != null && !storyEntry3.isEdit && ((!storyEntry3.isRepost || storyEntry3.isRepostMessage) && storyEntry3.isDraft)) {
                    DraftsController draftsController2 = MessagesController.getInstance(storyRecorder6.currentAccount).getStoriesController().draftsController;
                    StoryEntry storyEntry4 = storyRecorder6.outputEntry;
                    draftsController2.getClass();
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(storyEntry4);
                    draftsController2.delete(arrayList2);
                    storyRecorder6.outputEntry = null;
                }
                StoryEntry storyEntry5 = storyRecorder6.outputEntry;
                if (storyEntry5 != null && (storyEntry5.isShare || storyEntry5.isEdit || (storyEntry5.isRepost && !storyEntry5.isRepostMessage))) {
                    storyRecorder6.close(true);
                } else {
                    storyRecorder6.navigateTo(0, true);
                }
                break;
        }
    }

    @Override
    public void onEGLThreadAvailable(FilterGLThread filterGLThread) {
        MediaController.SavedFilterState savedFilterState;
        StoryRecorder storyRecorder = this.f$0;
        if (filterGLThread == null) {
            storyRecorder.getClass();
            return;
        }
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null || (savedFilterState = storyEntry.filterState) == null) {
            return;
        }
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    @Override
    public Object run() {
        StoryRecorder.AnonymousClass7 anonymousClass7;
        StoryRecorder storyRecorder = this.f$0;
        PhotoFilterView photoFilterView = storyRecorder.photoFilterView;
        Bitmap uiBlurBitmap = photoFilterView != null ? photoFilterView.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (anonymousClass7 = storyRecorder.previewView) == null || anonymousClass7.getTextureView() == null) ? uiBlurBitmap : storyRecorder.previewView.getTextureView().getUiBlurBitmap();
    }
}
