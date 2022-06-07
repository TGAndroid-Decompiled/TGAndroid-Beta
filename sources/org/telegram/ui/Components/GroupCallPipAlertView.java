package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC$GroupCall;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.voip.VoIPButtonsLayout;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;

public class GroupCallPipAlertView extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    BackupImageView avatarImageView;
    int currentAccount;
    float cx;
    float cy;
    FrameLayout groupInfoContainer;
    VoIPToggleButton leaveButton;
    LinearGradient linearGradient;
    VoIPToggleButton muteButton;
    float muteProgress;
    private boolean mutedByAdmin;
    float mutedByAdminProgress;
    private int position;
    VoIPToggleButton soundButton;
    TextView subtitleView;
    TextView titleView;
    RectF rectF = new RectF();
    Paint paint = new Paint(1);
    private boolean invalidateGradient = true;

    @Override
    public void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public GroupCallPipAlertView(final Context context, int i) {
        super(context);
        setOrientation(1);
        this.currentAccount = i;
        this.paint.setAlpha(234);
        FrameLayout frameLayout = new FrameLayout(this, context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (Build.VERSION.SDK_INT >= 21) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("VoipGroupOpenVoiceChat", R.string.VoipGroupOpenVoiceChat)));
                    } else {
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("VoipChannelOpenVoiceChat", R.string.VoipChannelOpenVoiceChat)));
                    }
                }
            }
        };
        this.groupInfoContainer = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(22.0f));
        this.groupInfoContainer.addView(this.avatarImageView, LayoutHelper.createFrame(44, 44.0f));
        this.groupInfoContainer.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), 0, ColorUtils.setAlphaComponent(-1, 76)));
        this.groupInfoContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallPipAlertView.this.lambda$new$0(view);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(-1);
        this.titleView.setTextSize(15.0f);
        this.titleView.setMaxLines(2);
        this.titleView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        linearLayout.addView(this.titleView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(context);
        this.subtitleView = textView2;
        textView2.setTextSize(12.0f);
        this.subtitleView.setTextColor(ColorUtils.setAlphaComponent(-1, 153));
        linearLayout.addView(this.subtitleView, LayoutHelper.createLinear(-1, -2));
        this.groupInfoContainer.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        addView(this.groupInfoContainer, LayoutHelper.createLinear(-1, -2, 0, 10, 10, 10, 10));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(context, 44.0f);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setTextSize(12);
        this.soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallPipAlertView.this.lambda$new$1(context, view);
            }
        });
        this.soundButton.setCheckable(true);
        this.soundButton.setBackgroundColor(ColorUtils.setAlphaComponent(-1, 38), ColorUtils.setAlphaComponent(-1, 76));
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(context, 44.0f);
        this.muteButton = voIPToggleButton2;
        voIPToggleButton2.setTextSize(12);
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallPipAlertView.this.lambda$new$2(context, view);
            }
        });
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(context, 44.0f);
        this.leaveButton = voIPToggleButton3;
        voIPToggleButton3.setTextSize(12);
        this.leaveButton.setData(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString("VoipGroupLeave", R.string.VoipGroupLeave), false, false);
        this.leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallPipAlertView.this.lambda$new$4(context, view);
            }
        });
        VoIPButtonsLayout voIPButtonsLayout = new VoIPButtonsLayout(context);
        voIPButtonsLayout.setChildSize(68);
        voIPButtonsLayout.setUseStartPadding(false);
        voIPButtonsLayout.addView(this.soundButton, LayoutHelper.createFrame(68, 63.0f));
        voIPButtonsLayout.addView(this.muteButton, LayoutHelper.createFrame(68, 63.0f));
        voIPButtonsLayout.addView(this.leaveButton, LayoutHelper.createFrame(68, 63.0f));
        setWillNotDraw(false);
        addView(voIPButtonsLayout, LayoutHelper.createLinear(-1, -2, 0, 6, 0, 6, 0));
    }

    public void lambda$new$0(View view) {
        if (VoIPService.getSharedInstance() != null) {
            Intent action = new Intent(getContext(), LaunchActivity.class).setAction("voip_chat");
            action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
            getContext().startActivity(action);
        }
    }

    public void lambda$new$1(Context context, View view) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
        }
    }

    public void lambda$new$2(Context context, View view) {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().mutedByAdmin()) {
            this.muteButton.shakeView();
            try {
                Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
        }
    }

    public void lambda$new$4(final Context context, View view) {
        GroupCallActivity.onLeaveClick(getContext(), new Runnable() {
            @Override
            public final void run() {
                GroupCallPip.updateVisibility(context);
            }
        }, Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    @Override
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onDraw(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.GroupCallPipAlertView.onDraw(android.graphics.Canvas):void");
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i2);
    }

    @Override
    protected void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (!(sharedInstance == null || sharedInstance.groupCall == null)) {
            int colorForId = AvatarDrawable.getColorForId(sharedInstance.getChat().id);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setColor(colorForId);
            avatarDrawable.setInfo(sharedInstance.getChat());
            this.avatarImageView.setImage(ImageLocation.getForLocal(sharedInstance.getChat().photo.photo_small), "50_50", avatarDrawable, (Object) null);
            if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                str = sharedInstance.groupCall.call.title;
            } else {
                str = sharedInstance.getChat().title;
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.titleView.setText(str);
            updateMembersCount();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin();
            }
            float f = 1.0f;
            this.mutedByAdminProgress = this.mutedByAdmin ? 1.0f : 0.0f;
            if (!(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.mutedByAdmin)) {
                f = 0.0f;
            }
            this.muteProgress = f;
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        updateButtons(false);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    private void updateMembersCount() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (sharedInstance.isSwitchingStream() || !(callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                TextView textView = this.subtitleView;
                TLRPC$GroupCall tLRPC$GroupCall = sharedInstance.groupCall.call;
                textView.setText(LocaleController.formatPluralString(tLRPC$GroupCall.rtmp_stream ? "ViewersWatching" : "Participants", tLRPC$GroupCall.participants_count, new Object[0]));
                return;
            }
            this.subtitleView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
        }
    }

    private void updateButtons(boolean z) {
        VoIPService sharedInstance;
        String str;
        int i;
        if (this.soundButton != null && this.muteButton != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            boolean isBluetoothOn = sharedInstance.isBluetoothOn();
            boolean z2 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
            this.soundButton.setChecked(z2, z);
            if (isBluetoothOn) {
                this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth), false, z);
            } else if (z2) {
                this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
            } else if (sharedInstance.isHeadsetPlugged()) {
                this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString("VoipAudioRoutingHeadset", R.string.VoipAudioRoutingHeadset), false, z);
            } else {
                this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker), false, z);
            }
            if (sharedInstance.mutedByAdmin()) {
                this.muteButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, 76), 0.1f, true, LocaleController.getString("VoipMutedByAdminShort", R.string.VoipMutedByAdminShort), true, z);
            } else {
                VoIPToggleButton voIPToggleButton = this.muteButton;
                int alphaComponent = ColorUtils.setAlphaComponent(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f));
                if (sharedInstance.isMicMute()) {
                    i = R.string.VoipUnmute;
                    str = "VoipUnmute";
                } else {
                    i = R.string.VoipMute;
                    str = "VoipMute";
                }
                voIPToggleButton.setData(R.drawable.calls_unmute, -1, alphaComponent, 0.1f, true, LocaleController.getString(str, i), sharedInstance.isMicMute(), z);
            }
            invalidate();
        }
    }

    @Override
    public void onAudioSettingsChanged() {
        updateButtons(true);
    }

    @Override
    public void onStateChanged(int i) {
        updateMembersCount();
    }

    public void setPosition(int i, float f, float f2) {
        this.position = i;
        this.cx = f;
        this.cy = f2;
        invalidate();
        this.invalidateGradient = true;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean mutedByAdmin;
        if (i == NotificationCenter.groupCallUpdated) {
            updateMembersCount();
            if (VoIPService.getSharedInstance() != null && (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) != this.mutedByAdmin) {
                this.mutedByAdmin = mutedByAdmin;
                invalidate();
            }
        }
    }
}
