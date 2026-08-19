package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
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
    private boolean invalidateGradient;
    VoIPToggleButton leaveButton;
    LinearGradient linearGradient;
    VoIPToggleButton muteButton;
    float muteProgress;
    private boolean mutedByAdmin;
    float mutedByAdminProgress;
    Paint paint;
    private int position;
    RectF rectF;
    VoIPToggleButton soundButton;
    TextView subtitleView;
    TextView titleView;

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
        this.rectF = new RectF();
        this.paint = new Paint(1);
        this.invalidateGradient = true;
        setOrientation(1);
        this.currentAccount = i;
        this.paint.setAlpha(234);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipChannelOpenVoiceChat)));
                } else {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipGroupOpenVoiceChat)));
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
                GroupCallPipAlertView.$r8$lambda$oQInfJBupbDg1HH3CacNLyheGM0(this.f$0, view);
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
        this.titleView.setTypeface(AndroidUtilities.bold());
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
                GroupCallPipAlertView.$r8$lambda$kWQe1Uj8kh6vBmp5RRVUohtY070(this.f$0, context, view);
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
                GroupCallPipAlertView.$r8$lambda$R8FugTcyvKdXDOrH2w7v5tNdCJg(this.f$0, context, view);
            }
        });
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(context, 44.0f);
        this.leaveButton = voIPToggleButton3;
        voIPToggleButton3.setTextSize(12);
        this.leaveButton.setData(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        this.leaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                GroupCallPipAlertView groupCallPipAlertView = this.f$0;
                Context context2 = context;
                GroupCallActivity.onLeaveClick(groupCallPipAlertView.getContext(), new Runnable() {
                    @Override
                    public final void run() {
                        GroupCallPip.updateVisibility(context2);
                    }
                }, Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context2));
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

    public static void $r8$lambda$oQInfJBupbDg1HH3CacNLyheGM0(GroupCallPipAlertView groupCallPipAlertView, View view) {
        groupCallPipAlertView.getClass();
        if (VoIPService.getSharedInstance() != null) {
            Intent action = new Intent(groupCallPipAlertView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
            action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
            groupCallPipAlertView.getContext().startActivity(action);
        }
    }

    public static void $r8$lambda$kWQe1Uj8kh6vBmp5RRVUohtY070(GroupCallPipAlertView groupCallPipAlertView, Context context, View view) {
        groupCallPipAlertView.getClass();
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(groupCallPipAlertView.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    public static void $r8$lambda$R8FugTcyvKdXDOrH2w7v5tNdCJg(GroupCallPipAlertView groupCallPipAlertView, Context context, View view) {
        groupCallPipAlertView.getClass();
        if (VoIPService.getSharedInstance() != null) {
            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                groupCallPipAlertView.muteButton.shakeView();
                try {
                    Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float translationX;
        float measuredHeight;
        boolean z = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.mutedByAdmin;
        if (z) {
            float f5 = this.muteProgress;
            if (f5 != 1.0f) {
                float f6 = f5 + 0.10666667f;
                this.muteProgress = f6;
                if (f6 >= 1.0f) {
                    this.muteProgress = 1.0f;
                }
                this.invalidateGradient = true;
                invalidate();
            } else if (!z) {
                f = this.muteProgress;
                if (f != 0.0f) {
                    f2 = f - 0.10666667f;
                    this.muteProgress = f2;
                    if (f2 < 0.0f) {
                        this.muteProgress = 0.0f;
                    }
                    this.invalidateGradient = true;
                    invalidate();
                }
            }
        } else if (!z) {
            f = this.muteProgress;
            if (f != 0.0f) {
                f2 = f - 0.10666667f;
                this.muteProgress = f2;
                if (f2 < 0.0f) {
                    this.muteProgress = 0.0f;
                }
                this.invalidateGradient = true;
                invalidate();
            }
        }
        boolean z2 = this.mutedByAdmin;
        if (z2) {
            float f7 = this.mutedByAdminProgress;
            if (f7 != 1.0f) {
                float f8 = f7 + 0.10666667f;
                this.mutedByAdminProgress = f8;
                if (f8 >= 1.0f) {
                    this.mutedByAdminProgress = 1.0f;
                }
                this.invalidateGradient = true;
                invalidate();
            } else if (!z2) {
                f3 = this.mutedByAdminProgress;
                if (f3 != 0.0f) {
                    f4 = f3 - 0.10666667f;
                    this.mutedByAdminProgress = f4;
                    if (f4 < 0.0f) {
                        this.mutedByAdminProgress = 0.0f;
                    }
                    this.invalidateGradient = true;
                    invalidate();
                }
            }
        } else if (!z2) {
            f3 = this.mutedByAdminProgress;
            if (f3 != 0.0f) {
                f4 = f3 - 0.10666667f;
                this.mutedByAdminProgress = f4;
                if (f4 < 0.0f) {
                    this.mutedByAdminProgress = 0.0f;
                }
                this.invalidateGradient = true;
                invalidate();
            }
        }
        if (this.invalidateGradient) {
            int iBlendARGB = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_overlayAlertGradientMuted), Theme.getColor(Theme.key_voipgroup_overlayAlertGradientUnmuted), 1.0f - this.muteProgress);
            int iBlendARGB2 = ColorUtils.blendARGB(Theme.getColor(Theme.key_voipgroup_overlayAlertGradientMuted2), Theme.getColor(Theme.key_voipgroup_overlayAlertGradientUnmuted2), 1.0f - this.muteProgress);
            int iBlendARGB3 = ColorUtils.blendARGB(iBlendARGB, Theme.getColor(Theme.key_voipgroup_overlayAlertMutedByAdmin), this.mutedByAdminProgress);
            int iBlendARGB4 = ColorUtils.blendARGB(iBlendARGB2, Theme.getColor(Theme.key_voipgroup_overlayAlertMutedByAdmin2), this.mutedByAdminProgress);
            this.invalidateGradient = false;
            int i = this.position;
            if (i == 0) {
                this.linearGradient = new LinearGradient(-AndroidUtilities.dp(60.0f), this.cy - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{iBlendARGB3, iBlendARGB4}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                this.linearGradient = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() + AndroidUtilities.dp(60.0f), this.cy - getTranslationY(), new int[]{iBlendARGB4, iBlendARGB3}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 2) {
                this.linearGradient = new LinearGradient(this.cx - getTranslationX(), -AndroidUtilities.dp(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{iBlendARGB3, iBlendARGB4}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.linearGradient = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.cx - getTranslationX(), getMeasuredHeight() + AndroidUtilities.dp(60.0f), new int[]{iBlendARGB4, iBlendARGB3}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        this.rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.paint.setShader(this.linearGradient);
        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
        int i2 = this.position;
        if (i2 == 0) {
            measuredHeight = this.cy - getTranslationY();
            translationX = 0.0f;
        } else if (i2 == 1) {
            measuredHeight = this.cy - getTranslationY();
            translationX = getMeasuredWidth();
        } else if (i2 == 2) {
            translationX = this.cx - getTranslationX();
            measuredHeight = 0.0f;
        } else {
            translationX = this.cx - getTranslationX();
            measuredHeight = getMeasuredHeight();
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        int i3 = this.position;
        if (i3 == 0) {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.translate(AndroidUtilities.dp(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (i3 == 1) {
            canvas.clipRect(translationX, measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.translate(-AndroidUtilities.dp(3.0f), 0.0f);
            canvas.rotate(45.0f, translationX, measuredHeight);
        } else if (i3 == 2) {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, AndroidUtilities.dp(3.0f));
        } else {
            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight, AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
            canvas.rotate(45.0f, translationX, measuredHeight);
            canvas.translate(0.0f, -AndroidUtilities.dp(3.0f));
        }
        this.rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i2);
    }

    @Override
    protected void onAttachedToWindow() {
        String strTrim;
        ChatObject.Call call;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            TLRPC.Chat chat = sharedInstance.getChat();
            avatarDrawable.setColor(Theme.getColor(Theme.keys_avatar_background[AvatarDrawable.getColorIndex(chat != null ? chat.id : 0L)]), Theme.getColor(Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(chat != null ? chat.id : 0L)]));
            avatarDrawable.setInfo(this.currentAccount, chat);
            if (chat != null) {
                this.avatarImageView.setImage(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", avatarDrawable, (Object) null);
            }
            if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                if (call.sortedParticipants.size() == 1) {
                    strTrim = LocaleController.getString(R.string.ConferenceChat);
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i++) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    strTrim = sb.toString();
                }
            } else if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                strTrim = sharedInstance.groupCall.call.title;
            } else if (chat != null) {
                strTrim = chat.title;
            } else {
                strTrim = "";
            }
            if (strTrim != null) {
                strTrim = strTrim.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.titleView.setText(strTrim);
            updateMembersCount();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.mutedByAdminProgress = this.mutedByAdmin ? 1.0f : 0.0f;
            this.muteProgress = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.mutedByAdmin) ? 1.0f : 0.0f;
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
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            this.subtitleView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
            return;
        }
        TextView textView = this.subtitleView;
        TLRPC.GroupCall groupCall = sharedInstance.groupCall.call;
        textView.setText(LocaleController.formatPluralString(groupCall.rtmp_stream ? "ViewersWatching" : "Participants", groupCall.participants_count, new Object[0]));
    }

    private void updateButtons(boolean z) {
        VoIPService sharedInstance;
        if (this.soundButton == null || this.muteButton == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean zIsBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z2 = !zIsBluetoothOn && sharedInstance.isSpeakerphoneOn();
        this.soundButton.setChecked(z2, z);
        if (zIsBluetoothOn) {
            this.soundButton.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z);
        } else if (z2) {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        } else if (sharedInstance.isHeadsetPlugged()) {
            this.soundButton.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z);
        } else {
            this.soundButton.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z);
        }
        if (sharedInstance.mutedByAdmin()) {
            this.muteButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z);
        } else {
            this.muteButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, LocaleController.getString(sharedInstance.isMicMute() ? R.string.VoipUnmute : R.string.VoipMute), sharedInstance.isMicMute(), z);
        }
        invalidate();
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
        boolean zMutedByAdmin;
        if (i == NotificationCenter.groupCallUpdated) {
            updateMembersCount();
            if (VoIPService.getSharedInstance() == null || (zMutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.mutedByAdmin) {
                return;
            }
            this.mutedByAdmin = zMutedByAdmin;
            invalidate();
        }
    }
}
