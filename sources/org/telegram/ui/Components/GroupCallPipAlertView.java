package org.telegram.ui.Components;

import android.content.Context;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.voip.VoIPButtonsLayout;
import org.telegram.ui.Components.voip.VoIPToggleButton;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda0;

public final class GroupCallPipAlertView extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public final BackupImageView avatarImageView;
    public final int currentAccount;
    public float cx;
    public float cy;
    public boolean invalidateGradient;
    public LinearGradient linearGradient;
    public final VoIPToggleButton muteButton;
    public float muteProgress;
    public boolean mutedByAdmin;
    public float mutedByAdminProgress;
    public final Paint paint;
    public int position;
    public final RectF rectF;
    public final VoIPToggleButton soundButton;
    public final TextView subtitleView;
    public final TextView titleView;

    public final class AnonymousClass1 extends FrameLayout {
        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipGroupOpenVoiceChat)));
            } else {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipChannelOpenVoiceChat)));
            }
        }
    }

    public GroupCallPipAlertView(final Context context, int i) {
        super(context);
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.paint = paint;
        this.invalidateGradient = true;
        setOrientation(1);
        this.currentAccount = i;
        paint.setAlpha(234);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        anonymousClass1.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(22.0f));
        anonymousClass1.addView(backupImageView, LayoutHelper.createFrame(44.0f, 44));
        int iDp = AndroidUtilities.dp(6.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 76);
        anonymousClass1.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        anonymousClass1.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2), context);
        this.subtitleView = textViewM;
        textViewM.setTextSize(12.0f);
        textViewM.setTextColor(ColorUtils.setAlphaComponent(-1, 153));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2));
        anonymousClass1.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        addView(anonymousClass1, LayoutHelper.createLinear(-1, -2, 0, 10, 10, 10, 10));
        VoIPToggleButton voIPToggleButton = new VoIPToggleButton(context, 44.0f);
        this.soundButton = voIPToggleButton;
        voIPToggleButton.setTextSize(12);
        final int i2 = 0;
        voIPToggleButton.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCallPipAlertView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        GroupCallPipAlertView groupCallPipAlertView = this.f$0;
                        groupCallPipAlertView.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(groupCallPipAlertView.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        GroupCallPipAlertView groupCallPipAlertView2 = this.f$0;
                        groupCallPipAlertView2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            } else {
                                VoIPToggleButton voIPToggleButton2 = groupCallPipAlertView2.muteButton;
                                AndroidUtilities.shakeView(voIPToggleButton2.textView[0]);
                                AndroidUtilities.shakeView(voIPToggleButton2.textView[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = this.f$0.getContext();
                        Context context4 = context;
                        GroupCallActivity.onLeaveClick(context3, new OAuthSheet$$ExternalSyntheticLambda0(context4, 3), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        voIPToggleButton.setCheckable(true);
        voIPToggleButton.setBackgroundColor(ColorUtils.setAlphaComponent(-1, 38), ColorUtils.setAlphaComponent(-1, 76));
        VoIPToggleButton voIPToggleButton2 = new VoIPToggleButton(context, 44.0f);
        this.muteButton = voIPToggleButton2;
        voIPToggleButton2.setTextSize(12);
        final int i3 = 1;
        voIPToggleButton2.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCallPipAlertView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        GroupCallPipAlertView groupCallPipAlertView = this.f$0;
                        groupCallPipAlertView.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(groupCallPipAlertView.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        GroupCallPipAlertView groupCallPipAlertView2 = this.f$0;
                        groupCallPipAlertView2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            } else {
                                VoIPToggleButton voIPToggleButton3 = groupCallPipAlertView2.muteButton;
                                AndroidUtilities.shakeView(voIPToggleButton3.textView[0]);
                                AndroidUtilities.shakeView(voIPToggleButton3.textView[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = this.f$0.getContext();
                        Context context4 = context;
                        GroupCallActivity.onLeaveClick(context3, new OAuthSheet$$ExternalSyntheticLambda0(context4, 3), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        VoIPToggleButton voIPToggleButton3 = new VoIPToggleButton(context, 44.0f);
        voIPToggleButton3.setTextSize(12);
        voIPToggleButton3.setData(R.drawable.calls_decline, -1, -3257782, 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i4 = 2;
        voIPToggleButton3.setOnClickListener(new View.OnClickListener(this) {
            public final GroupCallPipAlertView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        GroupCallPipAlertView groupCallPipAlertView = this.f$0;
                        groupCallPipAlertView.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(groupCallPipAlertView.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
                            break;
                        }
                        break;
                    case 1:
                        Context context2 = context;
                        GroupCallPipAlertView groupCallPipAlertView2 = this.f$0;
                        groupCallPipAlertView2.getClass();
                        if (VoIPService.getSharedInstance() != null) {
                            if (!VoIPService.getSharedInstance().mutedByAdmin()) {
                                VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            } else {
                                VoIPToggleButton voIPToggleButton4 = groupCallPipAlertView2.muteButton;
                                AndroidUtilities.shakeView(voIPToggleButton4.textView[0]);
                                AndroidUtilities.shakeView(voIPToggleButton4.textView[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Context context3 = this.f$0.getContext();
                        Context context4 = context;
                        GroupCallActivity.onLeaveClick(context3, new OAuthSheet$$ExternalSyntheticLambda0(context4, 3), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context4), false);
                        break;
                }
            }
        });
        VoIPButtonsLayout voIPButtonsLayout = new VoIPButtonsLayout(context);
        voIPButtonsLayout.setChildSize(68);
        voIPButtonsLayout.setUseStartPadding(false);
        voIPButtonsLayout.addView(voIPToggleButton, LayoutHelper.createFrame(63.0f, 68));
        voIPButtonsLayout.addView(voIPToggleButton2, LayoutHelper.createFrame(63.0f, 68));
        voIPButtonsLayout.addView(voIPToggleButton3, LayoutHelper.createFrame(63.0f, 68));
        setWillNotDraw(false);
        addView(voIPButtonsLayout, LayoutHelper.createLinear(-1, -2, 0, 6, 0, 6, 0));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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

    @Override
    public final void onAttachedToWindow() {
        String strTrim;
        ChatObject.Call call;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        int i = this.currentAccount;
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            avatarDrawable.setColor(Theme.getColor(null, Theme.keys_avatar_background[AvatarDrawable.getColorIndex(chat != null ? chat.id : 0L)], false), Theme.getColor(null, Theme.keys_avatar_background2[AvatarDrawable.getColorIndex(chat != null ? chat.id : 0L)], false));
            avatarDrawable.setInfo(i, chat);
            if (chat != null) {
                this.avatarImageView.setImage(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", avatarDrawable, null);
            }
            if (!sharedInstance.isConference() || (call = sharedInstance.groupCall) == null) {
                strTrim = TextUtils.isEmpty(sharedInstance.groupCall.call.title) ? chat != null ? chat.title : "" : sharedInstance.groupCall.call.title;
            } else if (call.sortedParticipants.size() == 1) {
                strTrim = LocaleController.getString(R.string.ConferenceChat);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i2).peer)));
                }
                if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                    sb.append(" ");
                    sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                }
                strTrim = sb.toString();
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
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.groupCallUpdated);
        updateButtons(false);
    }

    @Override
    public final void onAudioSettingsChanged() {
        updateButtons(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
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
            int iBlendARGB = ColorUtils.blendARGB(1.0f - this.muteProgress, Theme.getColor(null, Theme.key_voipgroup_overlayAlertGradientMuted, false), Theme.getColor(null, Theme.key_voipgroup_overlayAlertGradientUnmuted, false));
            int iBlendARGB2 = ColorUtils.blendARGB(1.0f - this.muteProgress, Theme.getColor(null, Theme.key_voipgroup_overlayAlertGradientMuted2, false), Theme.getColor(null, Theme.key_voipgroup_overlayAlertGradientUnmuted2, false));
            int iBlendARGB3 = ColorUtils.blendARGB(this.mutedByAdminProgress, iBlendARGB, Theme.getColor(null, Theme.key_voipgroup_overlayAlertMutedByAdmin, false));
            int iBlendARGB4 = ColorUtils.blendARGB(this.mutedByAdminProgress, iBlendARGB2, Theme.getColor(null, Theme.key_voipgroup_overlayAlertMutedByAdmin2, false));
            this.invalidateGradient = false;
            int i = this.position;
            if (i == 0) {
                this.linearGradient = new LinearGradient(-AndroidUtilities.dp(60.0f), this.cy - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{iBlendARGB3, iBlendARGB4}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 1) {
                this.linearGradient = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(60.0f) + getMeasuredWidth(), this.cy - getTranslationY(), new int[]{iBlendARGB4, iBlendARGB3}, (float[]) null, Shader.TileMode.CLAMP);
            } else if (i == 2) {
                this.linearGradient = new LinearGradient(this.cx - getTranslationX(), -AndroidUtilities.dp(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{iBlendARGB3, iBlendARGB4}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                this.linearGradient = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.cx - getTranslationX(), AndroidUtilities.dp(60.0f) + getMeasuredHeight(), new int[]{iBlendARGB4, iBlendARGB3}, (float[]) null, Shader.TileMode.CLAMP);
            }
        }
        RectF rectF = this.rectF;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        Paint paint = this.paint;
        paint.setShader(this.linearGradient);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
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
        rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824), i2);
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        updateMembersCount();
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public final void updateButtons(boolean z) {
        VoIPToggleButton voIPToggleButton;
        VoIPService sharedInstance;
        boolean z2;
        VoIPToggleButton voIPToggleButton2 = this.soundButton;
        if (voIPToggleButton2 == null || (voIPToggleButton = this.muteButton) == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean zIsBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z3 = !zIsBluetoothOn && sharedInstance.isSpeakerphoneOn();
        voIPToggleButton2.setChecked(z3, z);
        if (zIsBluetoothOn) {
            z2 = z;
            voIPToggleButton2.setData(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z2);
        } else {
            z2 = z;
            if (z3) {
                voIPToggleButton2.setData(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z2);
            } else if (sharedInstance.isHeadsetPlugged()) {
                voIPToggleButton2.setData(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z2);
            } else {
                voIPToggleButton2.setData(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z2);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            voIPToggleButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z2);
        } else {
            voIPToggleButton.setData(R.drawable.calls_unmute, -1, ColorUtils.setAlphaComponent(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, LocaleController.getString(sharedInstance.isMicMute() ? R.string.VoipUnmute : R.string.VoipMute), sharedInstance.isMicMute(), z2);
        }
        invalidate();
    }

    public final void updateMembersCount() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        boolean zIsSwitchingStream = sharedInstance.isSwitchingStream();
        TextView textView = this.subtitleView;
        if (!zIsSwitchingStream && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            textView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.call;
            textView.setText(LocaleController.formatPluralString(groupCall.rtmp_stream ? "ViewersWatching" : "Participants", groupCall.participants_count, new Object[0]));
        }
    }
}
