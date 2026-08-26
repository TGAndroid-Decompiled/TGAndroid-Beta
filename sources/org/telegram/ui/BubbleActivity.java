package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.internal.zzr;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.utils.FrameMetricsOverlayView;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.PhotoEditToolCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.HintView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Shader;
import org.telegram.ui.Components.Paint.Utils;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.WallpaperUpdater;

public class BubbleActivity extends BasePermissionsActivity implements INavigationLayout.INavigationLayoutDelegate {
    public static BubbleActivity instance;
    public ActionBarLayout actionBarLayout;
    public long dialogId;
    public DrawerLayoutContainer drawerLayoutContainer;
    public boolean finished;
    public AnonymousClass1 lockRunnable;
    public final ArrayList mainFragmentsStack = new ArrayList();
    public Intent passcodeSaveIntent;
    public int passcodeSaveIntentAccount;
    public boolean passcodeSaveIntentIsNew;
    public boolean passcodeSaveIntentIsRestore;
    public PasscodeView passcodeView;

    public final class AnonymousClass1 implements Runnable {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void run() {
            EditTextEmoji.AnonymousClass2 anonymousClass2;
            float f;
            int i;
            int childAdapterPosition;
            View viewFindViewByPosition;
            int iDp;
            int i2 = 4;
            switch (this.$r8$classId) {
                case 0:
                    BubbleActivity bubbleActivity = (BubbleActivity) this.this$0;
                    if (bubbleActivity.lockRunnable == this) {
                        if (AndroidUtilities.needShowPasscode(true)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("lock app");
                            }
                            bubbleActivity.showPasscodeActivity();
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("didn't pass lock check");
                        }
                        bubbleActivity.lockRunnable = null;
                        return;
                    }
                    return;
                case 1:
                    FrameMetricsOverlayView frameMetricsOverlayView = (FrameMetricsOverlayView) this.this$0;
                    if (frameMetricsOverlayView.running.get()) {
                        frameMetricsOverlayView.invalidate();
                        frameMetricsOverlayView.uiHandler.postDelayed(this, 300L);
                        return;
                    }
                    return;
                case 2:
                    ((ArticleViewer.BlockTableCell) this.this$0).getClass();
                    return;
                case 3:
                    CameraScanActivity cameraScanActivity = (CameraScanActivity) this.this$0;
                    CameraView cameraView = cameraScanActivity.cameraView;
                    if (cameraView == null || cameraScanActivity.recognized || cameraView.getCameraSession() == null) {
                        return;
                    }
                    cameraScanActivity.handler.post(new ArticleViewer$$ExternalSyntheticLambda3(this, 23));
                    return;
                case 4:
                    BaseCell baseCell = (BaseCell) this.this$0;
                    if (baseCell.pendingCheckForLongPress == null) {
                        baseCell.pendingCheckForLongPress = new zzr(baseCell, 3);
                    }
                    zzr zzrVar = baseCell.pendingCheckForLongPress;
                    int i3 = baseCell.pressCount + 1;
                    baseCell.pressCount = i3;
                    zzrVar.zzb = i3;
                    baseCell.postDelayed(zzrVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                case 5:
                    PhotoEditToolCell photoEditToolCell = (PhotoEditToolCell) this.this$0;
                    photoEditToolCell.valueTextView.setTag(null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    photoEditToolCell.valueAnimation = animatorSet;
                    TextView textView = photoEditToolCell.valueTextView;
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(photoEditToolCell.nameTextView, (Property<TextView, Float>) property, 1.0f));
                    photoEditToolCell.valueAnimation.setDuration(250L);
                    photoEditToolCell.valueAnimation.setInterpolator(new DecelerateInterpolator());
                    photoEditToolCell.valueAnimation.addListener(new ArticleViewer.AnonymousClass25(this, 15));
                    photoEditToolCell.valueAnimation.start();
                    return;
                case 6:
                    SendLocationCell sendLocationCell = (SendLocationCell) this.this$0;
                    sendLocationCell.checkText();
                    RectF rectF = sendLocationCell.rect;
                    sendLocationCell.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    AndroidUtilities.runOnUIThread(sendLocationCell.invalidateRunnable, 1000L);
                    return;
                case 7:
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) this.this$0;
                    if (sharedLinkCell.pendingCheckForLongPress == null) {
                        sharedLinkCell.pendingCheckForLongPress = new zzr(sharedLinkCell, i2);
                    }
                    zzr zzrVar2 = sharedLinkCell.pendingCheckForLongPress;
                    int i4 = sharedLinkCell.pressCount + 1;
                    sharedLinkCell.pressCount = i4;
                    zzrVar2.zzb = i4;
                    sharedLinkCell.postDelayed(zzrVar2, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    return;
                case 8:
                    SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) this.this$0;
                    RectF rectF2 = sharingLiveLocationCell.rect;
                    sharingLiveLocationCell.invalidate(((int) rectF2.left) - 5, ((int) rectF2.top) - 5, ((int) rectF2.right) + 5, ((int) rectF2.bottom) + 5);
                    AndroidUtilities.runOnUIThread(sharingLiveLocationCell.invalidateRunnable, 1000L);
                    return;
                case 9:
                    LegendSignatureView legendSignatureView = (LegendSignatureView) this.this$0;
                    legendSignatureView.chevron.animate().setDuration(120L).alpha(0.0f);
                    legendSignatureView.progressView.animate().setListener(null).start();
                    if (legendSignatureView.progressView.getVisibility() != 0) {
                        legendSignatureView.progressView.setVisibility(0);
                        legendSignatureView.progressView.setAlpha(0.0f);
                    }
                    legendSignatureView.progressView.animate().setDuration(120L).alpha(1.0f).start();
                    return;
                case 10:
                    if (MediaController.getInstance().getPlayingMessageObject() == null) {
                        return;
                    }
                    AudioPlayerAlert.AnonymousClass13 anonymousClass13 = (AudioPlayerAlert.AnonymousClass13) this.this$0;
                    AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.this;
                    int i5 = audioPlayerAlert.rewindingForwardPressedCount + 1;
                    audioPlayerAlert.rewindingForwardPressedCount = i5;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            MediaController.getInstance().setPlaybackSpeed(true, 13.0f);
                            return;
                        } else {
                            MediaController.getInstance().setPlaybackSpeed(true, 7.0f);
                            AndroidUtilities.runOnUIThread(this, 2000L);
                            return;
                        }
                    }
                    anonymousClass13.pressed = true;
                    audioPlayerAlert.rewindingState = 1;
                    if (MediaController.getInstance().isMessagePaused()) {
                        AudioPlayerAlert audioPlayerAlert2 = AudioPlayerAlert.this;
                        if (audioPlayerAlert2.rewindingState == 1) {
                            audioPlayerAlert2.lastRewindingTime = System.currentTimeMillis();
                            audioPlayerAlert2.rewindingProgress = MediaController.getInstance().getPlayingMessageObject().audioProgress;
                            AnonymousClass1 anonymousClass1 = audioPlayerAlert2.forwardSeek;
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                            AndroidUtilities.runOnUIThread(anonymousClass1);
                        }
                    } else {
                        AudioPlayerAlert audioPlayerAlert3 = AudioPlayerAlert.this;
                        if (audioPlayerAlert3.rewindingState == 1) {
                            AndroidUtilities.cancelRunOnUIThread(audioPlayerAlert3.forwardSeek);
                            AudioPlayerAlert.this.lastUpdateRewindingPlayerTime = 0L;
                        }
                    }
                    MediaController.getInstance().setPlaybackSpeed(true, 4.0f);
                    AndroidUtilities.runOnUIThread(this, 2000L);
                    return;
                case 11:
                    long duration = MediaController.getInstance().getDuration();
                    AudioPlayerAlert audioPlayerAlert4 = (AudioPlayerAlert) this.this$0;
                    if (duration == 0 || duration == -9223372036854775807L) {
                        audioPlayerAlert4.lastRewindingTime = System.currentTimeMillis();
                        return;
                    }
                    float f2 = audioPlayerAlert4.rewindingProgress;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - audioPlayerAlert4.lastRewindingTime;
                    audioPlayerAlert4.lastRewindingTime = jCurrentTimeMillis;
                    long j2 = jCurrentTimeMillis - audioPlayerAlert4.lastUpdateRewindingPlayerTime;
                    int i6 = audioPlayerAlert4.rewindingForwardPressedCount;
                    long j3 = i6 == 1 ? 3L : i6 == 2 ? 6L : 12L;
                    float f3 = duration;
                    float f4 = ((long) ((f2 * f3) + ((j3 * j) - j))) / f3;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    audioPlayerAlert4.rewindingProgress = f4;
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (playingMessageObject != null && playingMessageObject.isMusic()) {
                        if (!MediaController.getInstance().isMessagePaused()) {
                            MediaController.getInstance().getPlayingMessageObject().audioProgress = audioPlayerAlert4.rewindingProgress;
                        }
                        audioPlayerAlert4.updateProgress(playingMessageObject, false);
                    }
                    if (audioPlayerAlert4.rewindingState == 1 && audioPlayerAlert4.rewindingForwardPressedCount > 0 && MediaController.getInstance().isMessagePaused()) {
                        if (j2 > 200 || audioPlayerAlert4.rewindingProgress == 0.0f) {
                            audioPlayerAlert4.lastUpdateRewindingPlayerTime = jCurrentTimeMillis;
                            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f4);
                        }
                        if (audioPlayerAlert4.rewindingForwardPressedCount <= 0 || audioPlayerAlert4.rewindingProgress <= 0.0f) {
                            return;
                        }
                        AndroidUtilities.runOnUIThread(audioPlayerAlert4.forwardSeek, 16L);
                        return;
                    }
                    return;
                case 12:
                    MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    CanvasButton canvasButton = (CanvasButton) this.this$0;
                    canvasButton.checkTouchEvent(motionEventObtain);
                    canvasButton.parent.performHapticFeedback(0);
                    Runnable runnable = canvasButton.longPressRunnable;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                case 13:
                    ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) this.this$0;
                    if (searchAdapter.isLoading) {
                        searchAdapter.messages.clear();
                        searchAdapter.sections.clear();
                        searchAdapter.sectionArrays.clear();
                        searchAdapter.notifyDataSetChanged();
                        return;
                    }
                    return;
                case 14:
                    ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) this.this$0;
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = previewGroupsView.this$0;
                    if (chatAttachAlertPhotoLayoutPreview.draggingCell == null || chatAttachAlertPhotoLayoutPreview.draggingCellHiding) {
                        return;
                    }
                    int iComputeVerticalScrollOffset = chatAttachAlertPhotoLayoutPreview.listView.computeVerticalScrollOffset();
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview2 = previewGroupsView.this$0;
                    boolean z = chatAttachAlertPhotoLayoutPreview2.listView.computeVerticalScrollExtent() + iComputeVerticalScrollOffset >= (previewGroupsView.measurePureHeight() - previewGroupsView.paddingBottom) + previewGroupsView.paddingTop;
                    float fMax = Math.max(0.0f, (chatAttachAlertPhotoLayoutPreview2.draggingCellTouchY - Math.max(0, iComputeVerticalScrollOffset - chatAttachAlertPhotoLayoutPreview2.getListTopPadding())) - AndroidUtilities.dp(52.0f));
                    float fMax2 = Math.max(0.0f, ((chatAttachAlertPhotoLayoutPreview2.listView.getMeasuredHeight() - (chatAttachAlertPhotoLayoutPreview2.draggingCellTouchY - iComputeVerticalScrollOffset)) - chatAttachAlertPhotoLayoutPreview2.getListTopPadding()) - AndroidUtilities.dp(84.0f));
                    float fDp = AndroidUtilities.dp(32.0f);
                    float fDp2 = (fMax >= fDp || iComputeVerticalScrollOffset <= chatAttachAlertPhotoLayoutPreview2.getListTopPadding()) ? fMax2 < fDp ? AndroidUtilities.dp(6.0f) * (1.0f - (fMax2 / fDp)) : 0.0f : (-(1.0f - (fMax / fDp))) * AndroidUtilities.dp(6.0f);
                    int i7 = (int) fDp2;
                    if (Math.abs(i7) > 0 && chatAttachAlertPhotoLayoutPreview2.listView.canScrollVertically(i7) && (fDp2 <= 0.0f || !z)) {
                        chatAttachAlertPhotoLayoutPreview2.draggingCellTouchY += fDp2;
                        chatAttachAlertPhotoLayoutPreview2.listView.scrollBy(0, i7);
                        previewGroupsView.invalidate();
                    }
                    previewGroupsView.scrollerStarted = true;
                    previewGroupsView.postDelayed(this, 15L);
                    return;
                case 15:
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.this$0;
                    PollEditTextCell pollEditTextCell = chatAttachAlertPollLayout.currentCell;
                    if (pollEditTextCell != null) {
                        EditTextBoldCursor editField = pollEditTextCell.getEditField();
                        if (chatAttachAlertPollLayout.destroyed || editField == null || !chatAttachAlertPollLayout.waitingForKeyboardOpen || chatAttachAlertPollLayout.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                            return;
                        }
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AnonymousClass1 anonymousClass3 = chatAttachAlertPollLayout.openKeyboardRunnable;
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass3);
                        AndroidUtilities.runOnUIThread(anonymousClass3, 100L);
                        return;
                    }
                    return;
                case 16:
                    EditTextEmoji editTextEmoji = (EditTextEmoji) this.this$0;
                    if (editTextEmoji.destroyed || (anonymousClass2 = editTextEmoji.editText) == null || !editTextEmoji.waitingForKeyboardOpen || editTextEmoji.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    anonymousClass2.requestFocus();
                    AndroidUtilities.showKeyboard(anonymousClass2);
                    AnonymousClass1 anonymousClass4 = editTextEmoji.openKeyboardRunnable;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass4);
                    AndroidUtilities.runOnUIThread(anonymousClass4, 100L);
                    return;
                case 17:
                    EmojiView.AnonymousClass35 anonymousClass35 = (EmojiView.AnonymousClass35) this.this$0;
                    AvatarPreviewer avatarPreviewer = (AvatarPreviewer) anonymousClass35.this$0;
                    if (!avatarPreviewer.visible || ((ArrayList) avatarPreviewer.layout).isEmpty()) {
                        return;
                    }
                    AvatarPreviewer avatarPreviewer2 = (AvatarPreviewer) anonymousClass35.this$0;
                    if (((AnimatorSet) avatarPreviewer2.windowManager).isRunning()) {
                        return;
                    }
                    try {
                        ((AnimatorSet) avatarPreviewer2.windowManager).start();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                case 18:
                    EmojiView emojiView = (EmojiView) this.this$0;
                    if (emojiView.stickersTab.draggingView != null) {
                        return;
                    }
                    emojiView.expandStickersByDragg = false;
                    emojiView.updateStickerTabsPosition();
                    return;
                case 19:
                    DialogsActivity.AnonymousClass10 anonymousClass10 = (DialogsActivity.AnonymousClass10) this.this$0;
                    if (anonymousClass10.animatingIndicator) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime > 17) {
                            jElapsedRealtime = 17;
                        }
                        float f5 = anonymousClass10.animationTime + (jElapsedRealtime / 320.0f);
                        anonymousClass10.animationTime = f5;
                        anonymousClass10.setAnimationIdicatorProgress(anonymousClass10.interpolator.getInterpolation(f5));
                        if (anonymousClass10.animationTime > 1.0f) {
                            anonymousClass10.animationTime = 1.0f;
                        }
                        if (anonymousClass10.animationTime < 1.0f) {
                            AndroidUtilities.runOnUIThread(anonymousClass10.animationRunnable);
                            return;
                        }
                        anonymousClass10.animatingIndicator = false;
                        anonymousClass10.setEnabled(true);
                        FilterTabsView.FilterTabsViewDelegate filterTabsViewDelegate = anonymousClass10.delegate;
                        if (filterTabsViewDelegate != null) {
                            ((DialogsActivity.AnonymousClass11) filterTabsViewDelegate).onPageScrolled(1.0f);
                            return;
                        }
                        return;
                    }
                    return;
                case 20:
                    float[] fArr = FragmentContextView.speeds;
                    FragmentContextView fragmentContextView = (FragmentContextView) this.this$0;
                    fragmentContextView.checkLocationString();
                    AndroidUtilities.runOnUIThread(fragmentContextView.checkLocationRunnable, 1000L);
                    return;
                case 21:
                    InviteLinkBottomSheet.TimerPrivacyCell timerPrivacyCell = (InviteLinkBottomSheet.TimerPrivacyCell) this.this$0;
                    InviteLinkBottomSheet.AnonymousClass2 anonymousClass5 = InviteLinkBottomSheet.this.listView;
                    if (anonymousClass5 != null && anonymousClass5.getAdapter() != null) {
                        InviteLinkBottomSheet.this.listView.getClass();
                        int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(timerPrivacyCell);
                        if (childAdapterPosition2 >= 0) {
                            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                            inviteLinkBottomSheet.adapter.onBindViewHolder(inviteLinkBottomSheet.listView.getChildViewHolder(timerPrivacyCell), childAdapterPosition2);
                        }
                    }
                    AndroidUtilities.runOnUIThread(this);
                    return;
                case 22:
                    ChatActivity.AnonymousClass64 anonymousClass64 = (ChatActivity.AnonymousClass64) this.this$0;
                    ValueAnimator valueAnimator = anonymousClass64.offsetsAnimator;
                    if (valueAnimator == null || valueAnimator.isRunning()) {
                        return;
                    }
                    anonymousClass64.offsetsAnimator.start();
                    return;
                case 23:
                    RenderView.CanvasInternal canvasInternal = (RenderView.CanvasInternal) this.this$0;
                    if (!canvasInternal.initialized || RenderView.this.shuttingDown) {
                        return;
                    }
                    RenderView.CanvasInternal.access$1300(canvasInternal);
                    GLES20.glBindFramebuffer(36160, 0);
                    RenderView.CanvasInternal canvasInternal2 = (RenderView.CanvasInternal) this.this$0;
                    GLES20.glViewport(0, 0, canvasInternal2.bufferWidth, canvasInternal2.bufferHeight);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    Painting painting = RenderView.this.painting;
                    if (painting.shaders != null) {
                        if (painting.bitmapBlurTexture != null && painting.blurManager != null && painting.hasBlur) {
                            GLES20.glBindFramebuffer(36160, 0);
                            Shader shader = (Shader) painting.shaders.get("videoBlur");
                            if (shader != null) {
                                GLES20.glUseProgram(shader.program);
                                GLES20.glUniformMatrix4fv(((Integer) shader.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(painting.renderProjection));
                                GLES20.glUniform1f(((Integer) shader.uniformsMap.get("flipy")).intValue(), 0.0f);
                                GLES20.glUniform1i(((Integer) shader.uniformsMap.get("texture")).intValue(), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, painting.bitmapBlurTexture.texture());
                                GLES20.glTexParameteri(3553, 10241, 9729);
                                GLES20.glUniform1i(((Integer) shader.uniformsMap.get("blured")).intValue(), 1);
                                GLES20.glActiveTexture(33985);
                                BlurringShader blurringShader = painting.blurManager.currentShader;
                                GLES20.glBindTexture(3553, blurringShader != null ? blurringShader.texture[2] : -1);
                                if (painting.activePath == null || !(painting.brush instanceof Brush.Eraser)) {
                                    GLES20.glUniform1f(((Integer) shader.uniformsMap.get("eraser")).intValue(), 0.0f);
                                } else {
                                    GLES20.glUniform1f(((Integer) shader.uniformsMap.get("eraser")).intValue(), 1.0f);
                                    GLES20.glUniform1i(((Integer) shader.uniformsMap.get("mask")).intValue(), 2);
                                    GLES20.glActiveTexture(33986);
                                    GLES20.glBindTexture(3553, painting.getPaintTexture());
                                }
                                GLES20.glBlendFunc(1, 0);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) painting.vertexBuffer);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) painting.textureBuffer);
                                GLES20.glEnableVertexAttribArray(1);
                                synchronized (painting.blurManager.textureLock) {
                                    GLES20.glDrawArrays(5, 0, 4);
                                }
                            }
                        }
                        if (painting.activePath != null) {
                            painting.renderBlitPath(painting.getPaintTexture(), painting.activePath, (1.0f - (painting.helperAlpha * 0.5f)) - (painting.helperApplyAlpha * 0.5f));
                        } else if (painting.activeShape != null) {
                            painting.renderBlitShape(painting.getTexture(), painting.getPaintTexture(), painting.activeShape, 1.0f);
                        } else {
                            int texture = painting.getTexture();
                            Shader shader2 = (Shader) painting.shaders.get(painting.masking ? "maskingBlit" : "blit");
                            if (texture != 0 && shader2 != null) {
                                GLES20.glUseProgram(shader2.program);
                                f = 0.5f;
                                GLES20.glUniformMatrix4fv(((Integer) shader2.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(painting.renderProjection));
                                GLES20.glUniform1f(((Integer) shader2.uniformsMap.get("alpha")).intValue(), 1.0f);
                                if (painting.masking) {
                                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("texture")).intValue(), 1);
                                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("mask")).intValue(), 0);
                                    GLES20.glUniform1f(((Integer) shader2.uniformsMap.get("preview")).intValue(), 0.4f);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, texture);
                                    GLES20.glActiveTexture(33985);
                                    GLES20.glBindTexture(3553, painting.originalBitmapTexture.texture());
                                } else {
                                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("texture")).intValue(), 0);
                                    GLES20.glActiveTexture(33984);
                                    GLES20.glBindTexture(3553, texture);
                                }
                                GLES20.glBlendFunc(1, 771);
                                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) painting.vertexBuffer);
                                GLES20.glEnableVertexAttribArray(0);
                                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) painting.textureBuffer);
                                GLES20.glEnableVertexAttribArray(1);
                                GLES20.glDrawArrays(5, 0, 4);
                                Utils.HasGLError();
                            }
                            i = painting.helperTexture;
                            if (i != 0 && painting.helperShape != null && painting.helperAlpha > 0.0f) {
                                painting.renderBlitShape(i, painting.getPaintTexture(), painting.helperShape, (painting.helperApplyAlpha * f) + (painting.helperAlpha * f));
                            }
                        }
                        f = 0.5f;
                        i = painting.helperTexture;
                        if (i != 0) {
                            painting.renderBlitShape(i, painting.getPaintTexture(), painting.helperShape, (painting.helperApplyAlpha * f) + (painting.helperAlpha * f));
                        }
                        break;
                    }
                    GLES20.glBlendFunc(1, 771);
                    RenderView.CanvasInternal canvasInternal3 = (RenderView.CanvasInternal) this.this$0;
                    canvasInternal3.egl10.eglSwapBuffers(canvasInternal3.eglDisplay, canvasInternal3.eglSurface);
                    RenderView renderView = RenderView.this;
                    if (!renderView.firstDrawSent) {
                        renderView.firstDrawSent = true;
                        AndroidUtilities.runOnUIThread(new HintView$1$$ExternalSyntheticLambda0(this, 28));
                    }
                    if (((RenderView.CanvasInternal) this.this$0).ready) {
                        return;
                    }
                    ((RenderView.CanvasInternal) this.this$0).ready = true;
                    return;
                case 24:
                    PasscodeView passcodeView = (PasscodeView) this.this$0;
                    passcodeView.checkRetryTextView();
                    AndroidUtilities.runOnUIThread(passcodeView.checkRunnable, 100L);
                    return;
                case 25:
                    PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) this.this$0;
                    if (anonymousClass11.autoPlayEnabled) {
                        if (!anonymousClass11.sortedView.isEmpty() && (childAdapterPosition = RecyclerView.getChildAdapterPosition((PremiumStickersPreviewRecycler.StickerView) zziq.m(1, anonymousClass11.sortedView))) >= 0 && (viewFindViewByPosition = anonymousClass11.layoutManager.findViewByPosition(childAdapterPosition + 1)) != null) {
                            anonymousClass11.haptic = false;
                            anonymousClass11.drawEffectForView(viewFindViewByPosition, true);
                            anonymousClass11.smoothScrollBy(0, viewFindViewByPosition.getTop() - ((anonymousClass11.getMeasuredHeight() - viewFindViewByPosition.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                        if (anonymousClass11.autoPlayEnabled) {
                            AnonymousClass1 anonymousClass6 = anonymousClass11.autoScrollRunnable;
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass6);
                            AndroidUtilities.runOnUIThread(anonymousClass6, 2700L);
                            return;
                        }
                        return;
                    }
                    return;
                case 26:
                    SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) this.this$0;
                    String str = selectorBottomSheet.query;
                    if (str != null) {
                        selectorBottomSheet.loadData(selectorBottomSheet.type, str, false);
                        return;
                    }
                    return;
                case 27:
                    UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.this$0;
                    String str2 = userSelectorBottomSheet.query;
                    if (str2 != null) {
                        userSelectorBottomSheet.search$1(str2);
                        return;
                    }
                    return;
                case 28:
                    PullForegroundDrawable pullForegroundDrawable = (PullForegroundDrawable) this.this$0;
                    pullForegroundDrawable.animateToTextIn = true;
                    ValueAnimator valueAnimator2 = pullForegroundDrawable.textIntAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    pullForegroundDrawable.textInProgress = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pullForegroundDrawable.textIntAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(pullForegroundDrawable.textInUpdateListener);
                    pullForegroundDrawable.textIntAnimator.setInterpolator(new LinearInterpolator());
                    pullForegroundDrawable.textIntAnimator.setDuration(150L);
                    pullForegroundDrawable.textIntAnimator.start();
                    return;
                default:
                    RecyclerListView recyclerListView = (RecyclerListView) this.this$0;
                    ChatActivity.AnonymousClass11 anonymousClass12 = recyclerListView.multiSelectionListener;
                    int[] iArr = recyclerListView.listPaddings;
                    ChatActivity chatActivity = ChatActivity.this;
                    iArr[0] = (int) chatActivity.chatListViewPaddingTop;
                    iArr[1] = chatActivity.blurredViewBottomOffset;
                    if (recyclerListView.multiselectScrollToTop) {
                        iDp = -AndroidUtilities.dp(12.0f);
                        recyclerListView.chekMultiselect(0.0f, recyclerListView.listPaddings[0]);
                    } else {
                        iDp = AndroidUtilities.dp(12.0f);
                        recyclerListView.chekMultiselect(0.0f, recyclerListView.getMeasuredHeight() - recyclerListView.listPaddings[1]);
                    }
                    ChatActivity.this.chatListView.scrollBy(0, iDp);
                    if (recyclerListView.multiselectScrollRunning) {
                        AndroidUtilities.runOnUIThread(recyclerListView.scroller);
                        return;
                    }
                    return;
            }
        }
    }

    public final void handleIntent(Intent intent, boolean z, boolean z2, boolean z3, int i) throws Throwable {
        ChatActivity chatActivity;
        if (!z3 && (AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            showPasscodeActivity();
            this.passcodeSaveIntent = intent;
            this.passcodeSaveIntentIsNew = z;
            this.passcodeSaveIntentIsRestore = z2;
            this.passcodeSaveIntentAccount = i;
            UserConfig.getInstance(i).saveConfig(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.currentAccount = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            chatActivity = null;
        } else {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.dialogId = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.dialogId = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            chatActivity = new ChatActivity(bundle);
            chatActivity.setInBubbleMode(true);
            chatActivity.setCurrentAccount(this.currentAccount);
        }
        if (chatActivity == null) {
            finish();
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(this.dialogId));
        this.actionBarLayout.removeAllFragments();
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        actionBarLayout.getClass();
        actionBarLayout.addFragmentToStack(-1, chatActivity);
        AccountInstance.getInstance(this.currentAccount).getNotificationsController().setOpenedInBubble(this.dialogId, true);
        AccountInstance.getInstance(this.currentAccount).getConnectionsManager().setAppPaused(false, false);
        this.actionBarLayout.showLastFragment();
    }

    @Override
    public final boolean needAddFragmentToStack(ActionBarLayout actionBarLayout, BaseFragment baseFragment) {
        return true;
    }

    @Override
    public final boolean needCloseLastFragment(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.finished) {
            AnonymousClass1 anonymousClass1 = this.lockRunnable;
            if (anonymousClass1 != null) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                this.lockRunnable = null;
            }
            this.finished = true;
            instance = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean needPresentFragment(ActionBarLayout actionBarLayout, INavigationLayout.NavigationParams navigationParams) {
        BaseFragment baseFragment = navigationParams.fragment;
        return true;
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        WallpaperUpdater wallpaperUpdater;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.Instance;
        if (themeEditorView != null && (wallpaperUpdater = themeEditorView.wallpaperUpdater) != null) {
            wallpaperUpdater.onActivityResult(i, i2, intent);
        }
        if (this.actionBarLayout.getFragmentStack().isEmpty()) {
            return;
        }
        ((BaseFragment) ArticleViewer.IBlock.CC.m(this.actionBarLayout, 1, this.actionBarLayout.getFragmentStack())).onActivityResultFragment(i, i2, intent);
    }

    @Override
    public final void onBackPressed() throws Throwable {
        if (this.mainFragmentsStack.size() == 1) {
            super.onBackPressed();
            return;
        }
        if (this.passcodeView.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
        } else {
            this.actionBarLayout.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) throws Throwable {
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new SessionCell.CircleGradientDrawable());
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        Theme.createDialogsResources(this);
        Theme.createChatResources(this);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.actionBarLayout = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.actionBarLayout.setRemoveActionBarExtraHeight(true);
        DrawerLayoutContainer drawerLayoutContainer = new DrawerLayoutContainer(this);
        this.drawerLayoutContainer = drawerLayoutContainer;
        setContentView(drawerLayoutContainer, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.drawerLayoutContainer.addView(relativeLayout, LayoutHelper.createFrame(-1.0f, -1));
        relativeLayout.addView(this.actionBarLayout.getView(), LayoutHelper.createRelative(-1, -1));
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        this.actionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        this.actionBarLayout.setFragmentStack(this.mainFragmentsStack);
        this.actionBarLayout.setDelegate(this);
        PasscodeView passcodeView = new PasscodeView(this);
        this.passcodeView = passcodeView;
        this.drawerLayoutContainer.addView(passcodeView, LayoutHelper.createFrame(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.actionBarLayout.removeAllFragments();
        handleIntent(getIntent(), false, bundle != null, false, UserConfig.selectedAccount);
        instance = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i = this.currentAccount;
        if (i != -1) {
            AccountInstance.getInstance(i).getNotificationsController().setOpenedInBubble(this.dialogId, false);
            AccountInstance.getInstance(this.currentAccount).getConnectionsManager().setAppPaused(false, false);
        }
        if (!this.finished) {
            AnonymousClass1 anonymousClass1 = this.lockRunnable;
            if (anonymousClass1 != null) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                this.lockRunnable = null;
            }
            this.finished = true;
            instance = null;
        }
        instance = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.actionBarLayout.onLowMemory();
    }

    @Override
    public final void onMeasureOverride(int[] iArr) {
    }

    @Override
    public final void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, UserConfig.selectedAccount);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.actionBarLayout.onPause();
        ApplicationLoader.externalInterfacePaused = true;
        AnonymousClass1 anonymousClass1 = this.lockRunnable;
        if (anonymousClass1 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            this.lockRunnable = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this, 0);
            this.lockRunnable = anonymousClass2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(anonymousClass2, 1000L);
            } else {
                int i = SharedConfig.autoLockIn;
                if (i != 0) {
                    AndroidUtilities.runOnUIThread(anonymousClass2, (((long) i) * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        PasscodeView passcodeView = this.passcodeView;
        if (passcodeView != null) {
            AndroidUtilities.cancelRunOnUIThread(passcodeView.checkRunnable);
        }
        instance = null;
    }

    @Override
    public final boolean onPreIme() {
        return false;
    }

    @Override
    public final void onRebuildAllFragments(ActionBarLayout actionBarLayout, boolean z) {
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (checkPermissionsResult(i, strArr, iArr)) {
            if (!this.actionBarLayout.getFragmentStack().isEmpty()) {
                ((BaseFragment) ArticleViewer.IBlock.CC.m(this.actionBarLayout, 1, this.actionBarLayout.getFragmentStack())).onRequestPermissionsResultFragment(i, strArr, iArr);
            }
            VoIPFragment voIPFragment = VoIPFragment.instance;
            if (voIPFragment != null) {
                voIPFragment.onRequestPermissionsResultInternal$1(i, iArr);
            }
        }
    }

    @Override
    public final void onResume() throws Throwable {
        super.onResume();
        this.actionBarLayout.onResume();
        ApplicationLoader.externalInterfacePaused = false;
        AnonymousClass1 anonymousClass1 = this.lockRunnable;
        if (anonymousClass1 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            this.lockRunnable = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            showPasscodeActivity();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.passcodeView.getVisibility() != 0) {
            this.actionBarLayout.onResume();
        } else {
            this.actionBarLayout.dismissDialogs();
            this.passcodeView.onResume();
        }
        instance = this;
    }

    @Override
    public final void onThemeProgress(float f) {
    }

    public final void showPasscodeActivity() throws Throwable {
        if (this.passcodeView == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible) {
            ArticleViewer.getInstance().close(false, true);
        }
        this.passcodeView.onShow(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.passcodeView.setDelegate(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 20));
    }
}
