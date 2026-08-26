package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;

public final class GroupCallActivity$$ExternalSyntheticLambda9 implements View.OnClickListener {
    public final int $r8$classId;
    public final GroupCallActivity f$0;

    public GroupCallActivity$$ExternalSyntheticLambda9(GroupCallActivity groupCallActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = groupCallActivity;
    }

    @Override
    public final void onClick(View view) {
        int i = 2;
        GroupCallActivity groupCallActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                GroupCallActivity.AnonymousClass28 anonymousClass28 = groupCallActivity.renderersContainer;
                boolean z = anonymousClass28.hideUiRunnableIsScheduled;
                LaunchActivity.AnonymousClass18 anonymousClass18 = anonymousClass28.hideUiRunnable;
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                }
                AndroidUtilities.runOnUIThread(anonymousClass18, 3000L);
                anonymousClass28.hideUiRunnableIsScheduled = true;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && sharedInstance.getVideoState(false) == 2) {
                    sharedInstance.switchCamera();
                    int i2 = groupCallActivity.flipIconCurrentEndFrame;
                    RLottieDrawable rLottieDrawable = groupCallActivity.flipIcon;
                    if (i2 == 18) {
                        groupCallActivity.flipIconCurrentEndFrame = 39;
                        rLottieDrawable.setCustomEndFrame(39);
                        rLottieDrawable.start();
                    } else {
                        rLottieDrawable.setCurrentFrame(0, false, false);
                        groupCallActivity.flipIconCurrentEndFrame = 18;
                        rLottieDrawable.setCustomEndFrame(18);
                        rLottieDrawable.start();
                    }
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList = groupCallActivity.attachedRenderers;
                        if (i3 < arrayList.size()) {
                            GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) arrayList.get(i3);
                            ChatObject.VideoParticipant videoParticipant = groupCallMiniTextureView.participant;
                            if (videoParticipant.participant.self && !videoParticipant.presentation && groupCallMiniTextureView.flipAnimator == null) {
                                groupCallMiniTextureView.flipHalfReached = false;
                                ImageView imageView = groupCallMiniTextureView.blurredFlippingStub;
                                if (imageView == null) {
                                    groupCallMiniTextureView.blurredFlippingStub = new ImageView(groupCallMiniTextureView.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                GroupCallMiniTextureView.AnonymousClass1 anonymousClass1 = groupCallMiniTextureView.textureView;
                                if (anonymousClass1.renderer.isFirstFrameRendered()) {
                                    Bitmap bitmap = anonymousClass1.blurRenderer.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        groupCallMiniTextureView.blurredFlippingStub.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    groupCallMiniTextureView.blurredFlippingStub.setAlpha(0.0f);
                                } else {
                                    groupCallMiniTextureView.blurredFlippingStub.setAlpha(1.0f);
                                }
                                if (groupCallMiniTextureView.blurredFlippingStub.getParent() == null) {
                                    anonymousClass1.addView(groupCallMiniTextureView.blurredFlippingStub);
                                }
                                ((FrameLayout.LayoutParams) groupCallMiniTextureView.blurredFlippingStub.getLayoutParams()).gravity = 17;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                groupCallMiniTextureView.flipAnimator = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addUpdateListener(new GroupCallMiniTextureView$$ExternalSyntheticLambda3(groupCallMiniTextureView, 1));
                                groupCallMiniTextureView.flipAnimator.addListener(new GroupCallMiniTextureView.AnonymousClass5(groupCallMiniTextureView, i));
                                groupCallMiniTextureView.flipAnimator.setDuration(400L);
                                groupCallMiniTextureView.flipAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                groupCallMiniTextureView.flipAnimator.start();
                            }
                            i3++;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (groupCallActivity.getAudioOutputValue() != 1) {
                    i = 1;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) {
                        i = 0;
                    }
                }
                groupCallActivity.cacheAudioOutputValue = Integer.valueOf(i);
                groupCallActivity.updateState(true, true);
                groupCallActivity.cacheAudioOutputValue = null;
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(groupCallActivity, i, 13));
                break;
            case 2:
                ChatObject.Call call = groupCallActivity.call;
                if (call != null && !groupCallActivity.renderersContainer.inFullscreenMode) {
                    boolean z2 = call.call.join_muted;
                    ActionBarMenuSubItem actionBarMenuSubItem = groupCallActivity.adminItem;
                    ActionBarMenuSubItem actionBarMenuSubItem2 = groupCallActivity.everyoneItem;
                    if (z2) {
                        int i4 = Theme.key_voipgroup_actionBarItems;
                        int color = Theme.getColor(null, i4, false);
                        int color2 = Theme.getColor(null, i4, false);
                        actionBarMenuSubItem2.setTextColor(color);
                        actionBarMenuSubItem2.setIconColor(color2);
                        actionBarMenuSubItem2.setChecked(false);
                        int i5 = Theme.key_voipgroup_checkMenu;
                        int color3 = Theme.getColor(null, i5, false);
                        int color4 = Theme.getColor(null, i5, false);
                        actionBarMenuSubItem.setTextColor(color3);
                        actionBarMenuSubItem.setIconColor(color4);
                        actionBarMenuSubItem.setChecked(true);
                    } else {
                        int i6 = Theme.key_voipgroup_checkMenu;
                        int color5 = Theme.getColor(null, i6, false);
                        int color6 = Theme.getColor(null, i6, false);
                        actionBarMenuSubItem2.setTextColor(color5);
                        actionBarMenuSubItem2.setIconColor(color6);
                        actionBarMenuSubItem2.setChecked(true);
                        int i7 = Theme.key_voipgroup_actionBarItems;
                        int color7 = Theme.getColor(null, i7, false);
                        int color8 = Theme.getColor(null, i7, false);
                        actionBarMenuSubItem.setTextColor(color7);
                        actionBarMenuSubItem.setIconColor(color8);
                        actionBarMenuSubItem.setChecked(false);
                    }
                    groupCallActivity.changingPermissions = false;
                    ActionBarMenuItem actionBarMenuItem = groupCallActivity.otherItem;
                    actionBarMenuItem.hideSubItem(1);
                    actionBarMenuItem.hideSubItem(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        ActionBarMenuSubItem actionBarMenuSubItem3 = groupCallActivity.soundItem;
                        if (currentAudioRoute == 2) {
                            actionBarMenuSubItem3.setIcon(R.drawable.msg_voice_bluetooth);
                            actionBarMenuSubItem3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            actionBarMenuSubItem3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            actionBarMenuSubItem3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                actionBarMenuSubItem3.setIcon(R.drawable.msg_voice_speaker);
                                actionBarMenuSubItem3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                actionBarMenuSubItem3.setIcon(R.drawable.msg_voice_phone);
                                actionBarMenuSubItem3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    groupCallActivity.updateItems$1$1();
                    actionBarMenuItem.toggleSubMenu(null, null);
                    break;
                }
                break;
            case 3:
                if (groupCallActivity.isRtmpStream()) {
                    if (PipUtils.checkPermissions(groupCallActivity.parentActivity) > 0) {
                        RTMPStreamPipOverlay.instance.showInternal(groupCallActivity.parentActivity);
                        groupCallActivity.lambda$showGiftOfferSheet$15();
                    } else {
                        AlertsCreator.createDrawOverlayPermissionDialog(groupCallActivity.parentActivity, null, true).show();
                    }
                } else if (AndroidUtilities.checkInlinePermissions(groupCallActivity.parentActivity)) {
                    GroupCallPip.forceRemoved = false;
                    groupCallActivity.lambda$showGiftOfferSheet$15();
                } else {
                    AlertsCreator.createDrawOverlayGroupCallPermissionDialog(groupCallActivity.getContext()).show();
                }
                break;
            case 4:
                groupCallActivity.getClass();
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    if (sharedInstance3.getVideoState(true) == 2) {
                        sharedInstance3.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = groupCallActivity.parentActivity;
                        if (launchActivity != null) {
                            groupCallActivity.parentActivity.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 5:
                ChatObject.Call call2 = groupCallActivity.call;
                if (call2 != null && call2.recording) {
                    groupCallActivity.showRecordHint(groupCallActivity.actionBar.getTitleTextView());
                    break;
                }
                break;
            case 6:
                GroupCallActivity.AnonymousClass36 anonymousClass36 = groupCallActivity.callMessageEnterView;
                if (anonymousClass36.isPopupVisible()) {
                    anonymousClass36.hideEmojiView();
                } else {
                    AndroidUtilities.hideKeyboard(anonymousClass36.editText);
                }
                break;
            case 7:
                groupCallActivity.lambda$new$40();
                break;
            case 8:
                GroupCallActivity.AnonymousClass9 anonymousClass9 = groupCallActivity.listView;
                int childCount = anonymousClass9.getChildCount();
                int iMin = Integer.MAX_VALUE;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = anonymousClass9.getChildAt(i8);
                    if (RecyclerView.getChildAdapterPosition(childAt) >= 0) {
                        iMin = Math.min(iMin, childAt.getTop());
                    }
                }
                if (iMin > 0 && iMin != Integer.MAX_VALUE) {
                    anonymousClass9.smoothScrollBy(0, iMin, null);
                }
                GroupCallActivity.AnonymousClass36 anonymousClass37 = groupCallActivity.callMessageEnterView;
                anonymousClass37.editText.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass37.editText);
                break;
            case 9:
                ChatObject.Call call3 = groupCallActivity.call;
                if (call3 == null || call3.isScheduled() || groupCallActivity.isRtmpStream()) {
                    groupCallActivity.getLink(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(groupCallActivity.getContext(), false);
                    break;
                }
                break;
            case 10:
                ChatObject.Call call4 = groupCallActivity.call;
                if (call4 != null && call4.recording) {
                    groupCallActivity.showRecordHint(groupCallActivity.actionBar.getTitleTextView());
                    break;
                }
                break;
            default:
                ChatObject.Call call5 = groupCallActivity.call;
                if (call5 != null && call5.recording) {
                    groupCallActivity.showRecordHint(groupCallActivity.actionBar.getTitleTextView());
                    break;
                }
                break;
        }
    }
}
