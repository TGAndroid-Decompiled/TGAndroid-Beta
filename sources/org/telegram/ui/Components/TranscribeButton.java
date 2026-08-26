package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.iv.RichDetailsCell;

public abstract class TranscribeButton {
    public static final int[] pressedState = {16842910, 16842919};
    public static HashMap transcribeOperationsByDialogPosition;
    public static HashMap transcribeOperationsById;
    public static ArrayList videoTranscriptionsOpen;
    public float a;
    public final AnimatedFloat animatedDrawLock;
    public float b;
    public float backgroundBack;
    public int backgroundColor;
    public Paint backgroundPaint;
    public final Rect bounds;
    public Path boundsPath;
    public Paint clipLockPaint;
    public int color;
    public int diameter;
    public boolean drawLock;
    public int iconColor;
    public final RLottieDrawable inIconDrawable;
    public int inIconDrawableAlpha;
    public boolean isOpen;
    public boolean loading;
    public final AnimatedFloat loadingFloat;
    public Path lockHandlePath;
    public float lockHandlePathDensity;
    public Paint lockPaint;
    public Paint lockStrokePaint;
    public final RLottieDrawable outIconDrawable;
    public int outIconDrawableAlpha;
    public final ChatMessageCell parent;
    public final boolean premium;
    public final Rect pressBounds;
    public Path progressClipPath;
    public int radius;
    public int rippleColor;
    public final SeekBarWaveform seekBar;
    public float[] segments;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public boolean shouldBeOpen;
    public Paint strokePaint;
    public boolean clickedToOpen = false;
    public boolean pressed = false;
    public final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    public long start = SystemClock.elapsedRealtime();

    public final class LoadingPointsDrawable extends Drawable {
        public int lastColor;
        public final RLottieDrawable lottie;
        public final TextPaint paint;

        public LoadingPointsDrawable(TextPaint textPaint) {
            RichDetailsCell.AnonymousClass1 anonymousClass1 = new RichDetailsCell.AnonymousClass1(this, 10);
            this.paint = textPaint;
            float textSize = textPaint.getTextSize() * 0.89f;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.dots_loading, "dots_loading", (int) textSize, (int) (textSize * 1.25f), true, null);
            this.lottie = rLottieDrawable;
            rLottieDrawable.setCallback(anonymousClass1);
            rLottieDrawable.setAutoRepeat(1);
            rLottieDrawable.setCurrentFrame((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f), true, false);
            rLottieDrawable.decodeSingleFrame = true;
            rLottieDrawable.scheduleNextGetFrame();
            rLottieDrawable.start();
        }

        @Override
        public final void draw(Canvas canvas) {
            int color = this.paint.getColor();
            int i = this.lastColor;
            RLottieDrawable rLottieDrawable = this.lottie;
            if (color != i) {
                rLottieDrawable.applyingLayerColors = true;
                OKLCH.m(color, rLottieDrawable.newColorUpdates, "Comp 1", rLottieDrawable);
                rLottieDrawable.commitApplyLayerColors();
                rLottieDrawable.decodeSingleFrame = true;
                rLottieDrawable.scheduleNextGetFrame();
                rLottieDrawable.updateCurrentFrame(0L);
                this.lastColor = color;
            }
            rLottieDrawable.draw(canvas);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public TranscribeButton(ChatMessageCell chatMessageCell, SeekBarWaveform seekBarWaveform) {
        boolean z = false;
        this.parent = chatMessageCell;
        this.seekBar = seekBarWaveform;
        Rect rect = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        this.bounds = rect;
        Rect rect2 = new Rect(rect);
        this.pressBounds = rect2;
        rect2.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.transcribe_out, "transcribe_out", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), true, null);
        this.outIconDrawable = rLottieDrawable;
        rLottieDrawable.setCurrentFrame(0, true, false);
        rLottieDrawable.setCallback(chatMessageCell);
        final int i = 0;
        rLottieDrawable.setOnFinishCallback(19, new Runnable(this) {
            public final TranscribeButton f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        TranscribeButton transcribeButton = this.f$0;
                        RLottieDrawable rLottieDrawable2 = transcribeButton.outIconDrawable;
                        rLottieDrawable2.isRunning = false;
                        rLottieDrawable2.checkChoreographer$1();
                        RLottieDrawable rLottieDrawable3 = transcribeButton.inIconDrawable;
                        rLottieDrawable3.isRunning = false;
                        rLottieDrawable3.checkChoreographer$1();
                        transcribeButton.shouldBeOpen = true;
                        transcribeButton.isOpen = true;
                        transcribeButton.inIconDrawable.setCurrentFrame(0, true, false);
                        break;
                    default:
                        TranscribeButton transcribeButton2 = this.f$0;
                        RLottieDrawable rLottieDrawable4 = transcribeButton2.inIconDrawable;
                        rLottieDrawable4.isRunning = false;
                        rLottieDrawable4.checkChoreographer$1();
                        RLottieDrawable rLottieDrawable5 = transcribeButton2.outIconDrawable;
                        rLottieDrawable5.isRunning = false;
                        rLottieDrawable5.checkChoreographer$1();
                        transcribeButton2.shouldBeOpen = false;
                        transcribeButton2.isOpen = false;
                        transcribeButton2.outIconDrawable.setCurrentFrame(0, true, false);
                        break;
                }
            }
        });
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.transcribe_in, "transcribe_in", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), true, null);
        this.inIconDrawable = rLottieDrawable2;
        rLottieDrawable2.setCurrentFrame(0, true, false);
        rLottieDrawable2.setCallback(chatMessageCell);
        rLottieDrawable2.masterParent = chatMessageCell;
        final int i2 = 1;
        rLottieDrawable2.setOnFinishCallback(19, new Runnable(this) {
            public final TranscribeButton f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        TranscribeButton transcribeButton = this.f$0;
                        RLottieDrawable rLottieDrawable3 = transcribeButton.outIconDrawable;
                        rLottieDrawable3.isRunning = false;
                        rLottieDrawable3.checkChoreographer$1();
                        RLottieDrawable rLottieDrawable4 = transcribeButton.inIconDrawable;
                        rLottieDrawable4.isRunning = false;
                        rLottieDrawable4.checkChoreographer$1();
                        transcribeButton.shouldBeOpen = true;
                        transcribeButton.isOpen = true;
                        transcribeButton.inIconDrawable.setCurrentFrame(0, true, false);
                        break;
                    default:
                        TranscribeButton transcribeButton2 = this.f$0;
                        RLottieDrawable rLottieDrawable5 = transcribeButton2.inIconDrawable;
                        rLottieDrawable5.isRunning = false;
                        rLottieDrawable5.checkChoreographer$1();
                        RLottieDrawable rLottieDrawable6 = transcribeButton2.outIconDrawable;
                        rLottieDrawable6.isRunning = false;
                        rLottieDrawable6.checkChoreographer$1();
                        transcribeButton2.shouldBeOpen = false;
                        transcribeButton2.isOpen = false;
                        transcribeButton2.outIconDrawable.setCurrentFrame(0, true, false);
                        break;
                }
            }
        });
        rLottieDrawable2.decodeSingleFrame = true;
        rLottieDrawable2.scheduleNextGetFrame();
        this.isOpen = false;
        this.shouldBeOpen = false;
        if (chatMessageCell.getMessageObject() != null && UserConfig.getInstance(chatMessageCell.getMessageObject().currentAccount).isPremium()) {
            z = true;
        }
        this.premium = z;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingFloat = new AnimatedFloat(250L, chatMessageCell, cubicBezierInterpolator);
        this.animatedDrawLock = new AnimatedFloat(250L, chatMessageCell, cubicBezierInterpolator);
    }

    public static void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (f <= f2) {
            float f5 = f4 - f3;
            addCorner(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f5, (Math.min(f2, f4) - f3) / f5);
        } else {
            float f6 = f4 - f3;
            addCorner(path, i, i2, i3, i4, (f - f3) / f6, 1.0f);
            addCorner(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f6);
        }
    }

    public static void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        if (f <= f2) {
            float f5 = f4 - f3;
            addLine(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f5, (Math.min(f2, f4) - f3) / f5);
        } else {
            float f6 = f4 - f3;
            addLine(path, i, i2, i3, i4, (f - f3) / f6, 1.0f);
            addLine(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f6);
        }
    }

    public static boolean canTranscribeTrial(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            if (isFreeTranscribeInChat(messageObject)) {
                return true;
            }
            if (messagesController.transcribeAudioTrialWeeklyNumber > 0 && messageObject.getDuration() <= messagesController.transcribeAudioTrialDurationMax) {
                return messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil || messagesController.transcribeAudioTrialCurrentNumber > 0;
            }
        }
        return false;
    }

    public static boolean finishTranscription(MessageObject messageObject, long j, String str) {
        try {
            HashMap map = transcribeOperationsById;
            MessageObject messageObject2 = messageObject == null ? (map == null || !map.containsKey(Long.valueOf(j))) ? null : (MessageObject) transcribeOperationsById.remove(Long.valueOf(j)) : messageObject;
            if (messageObject2 != null && messageObject2.messageOwner != null) {
                HashMap map2 = transcribeOperationsByDialogPosition;
                if (map2 != null) {
                    map2.remove(Integer.valueOf(reqInfoHash(messageObject2)));
                }
                messageObject2.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject2.currentAccount).updateMessageVoiceTranscription(messageObject2.getDialogId(), messageObject2.getId(), str, messageObject2.messageOwner);
                AndroidUtilities.runOnUIThread(new TranscribeButton$$ExternalSyntheticLambda1(str, messageObject2, j, 0));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isFreeTranscribeInChat(MessageObject messageObject) {
        if (messageObject != null && messageObject.messageOwner != null) {
            MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(messageObject.getChatId()));
            if (ChatObject.isMegagroup(chat) && chat.level >= messagesController.groupTranscribeLevelMin) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTranscribing(MessageObject messageObject) {
        TLRPC.Message message;
        HashMap map = transcribeOperationsByDialogPosition;
        if (map != null && (map.containsValue(messageObject) || transcribeOperationsByDialogPosition.containsKey(Integer.valueOf(reqInfoHash(messageObject))))) {
            return true;
        }
        HashMap map2 = transcribeOperationsById;
        return (map2 == null || messageObject == null || (message = messageObject.messageOwner) == null || !map2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean isVideoTranscriptionOpen(MessageObject messageObject) {
        if (videoTranscriptionsOpen != null) {
            return !messageObject.isRoundVideo() || videoTranscriptionsOpen.contains(Integer.valueOf(reqInfoHash(messageObject)));
        }
        return false;
    }

    public static int reqInfoHash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void showOffTranscribe(MessageObject messageObject, boolean z) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new TranscribeButton$$ExternalSyntheticLambda0(messageObject, 0));
        }
    }

    public static boolean showTranscribeLock(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || isFreeTranscribeInChat(messageObject) || !TextUtils.isEmpty(messageObject.messageOwner.voiceTranscription)) {
            return false;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
        MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
        return !UserConfig.getInstance(messageObject.currentAccount).isPremium() && messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil && messagesController.transcribeAudioTrialCurrentNumber <= 0;
    }

    public static void transcribePressed(final MessageObject messageObject, boolean z, final ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
        if (messageObject == null || messageObject.messageOwner == null || !messageObject.isSent()) {
            return;
        }
        final int i = messageObject.currentAccount;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(messageObject.messageOwner.peer_id);
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        TLRPC.Message message = messageObject.messageOwner;
        final int i2 = message.id;
        if (!z) {
            HashMap map = transcribeOperationsByDialogPosition;
            if (map != null) {
                map.remove(Integer.valueOf(reqInfoHash(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
            final int i3 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject2 = messageObject;
                    int i4 = i;
                    switch (i3) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i4);
                            int i5 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i5, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            if (!isVideoTranscriptionOpen(messageObject)) {
                if (videoTranscriptionsOpen == null) {
                    videoTranscriptionsOpen = new ArrayList(1);
                }
                videoTranscriptionsOpen.add(Integer.valueOf(reqInfoHash(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = true;
            MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
            final int i4 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageObject messageObject2 = messageObject;
                    int i5 = i;
                    switch (i4) {
                        case 0:
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i5);
                            int i6 = NotificationCenter.voiceTranscriptionUpdate;
                            Boolean bool = Boolean.TRUE;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i6, messageObject2, null, null, bool, bool);
                            break;
                        default:
                            NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject2, null, null, Boolean.FALSE, null);
                            break;
                    }
                }
            });
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("sending Transcription request, msg_id=" + i2 + " dialog_id=" + peerDialogId);
        }
        TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
        tL_messages_transcribeAudio.peer = inputPeer;
        tL_messages_transcribeAudio.msg_id = i2;
        if (transcribeOperationsByDialogPosition == null) {
            transcribeOperationsByDialogPosition = new HashMap();
        }
        transcribeOperationsByDialogPosition.put(Integer.valueOf(reqInfoHash(messageObject)), messageObject);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                long j;
                boolean z2;
                String str;
                boolean z3 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                int i5 = i;
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate2 = chatMessageCellDelegate;
                MessageObject messageObject2 = messageObject;
                String str2 = "";
                if (z3) {
                    TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                    String str3 = tL_messages_transcribedAudio.text;
                    j = tL_messages_transcribedAudio.transcription_id;
                    boolean z4 = tL_messages_transcribedAudio.pending;
                    boolean z5 = !z4;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    } else if (z4) {
                        str2 = null;
                    }
                    if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                        MessagesController.getInstance(i5).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                        MessagesController.getInstance(i5).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(27, chatMessageCellDelegate2, tL_messages_transcribedAudio));
                    }
                    if (TranscribeButton.transcribeOperationsById == null) {
                        TranscribeButton.transcribeOperationsById = new HashMap();
                    }
                    TranscribeButton.transcribeOperationsById.put(Long.valueOf(j), messageObject2);
                    messageObject2.messageOwner.voiceTranscriptionId = j;
                    z2 = z5;
                } else {
                    if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        MessagesController.getInstance(i5).updateTranscribeAudioTrialCurrentNumber(0);
                        MessagesController.getInstance(i5).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i5).getCurrentTime());
                        AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(messageObject2, chatMessageCellDelegate2, i5, 15));
                        return;
                    }
                    j = 0;
                    z2 = true;
                }
                String str4 = str2;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (messageObject2 != null && !TranscribeButton.isVideoTranscriptionOpen(messageObject2)) {
                    if (TranscribeButton.videoTranscriptionsOpen == null) {
                        TranscribeButton.videoTranscriptionsOpen = new ArrayList(1);
                    }
                    TranscribeButton.videoTranscriptionsOpen.add(Integer.valueOf(TranscribeButton.reqInfoHash(messageObject2)));
                }
                TLRPC.Message message2 = messageObject2.messageOwner;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionFinal = z2;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("Transcription request sent, received final=" + z2 + " id=" + j + " text=" + str4);
                }
                MessagesStorage.getInstance(i5).updateMessageVoiceTranscription(peerDialogId, i2, str4, messageObject2.messageOwner);
                if (z2) {
                    AndroidUtilities.runOnUIThread(new TranscribeButton$$ExternalSyntheticLambda1(str4, messageObject2, j, 1), Math.max(0L, 350 - jElapsedRealtime2));
                }
            }
        }, !UserConfig.getInstance(i).isPremium() ? 1024 : 0);
    }

    public final void draw(Canvas canvas, float f) {
        float f2;
        Rect rect = this.bounds;
        this.pressBounds.set(rect.left - AndroidUtilities.dp(8.0f), rect.top - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + rect.right, AndroidUtilities.dp(8.0f) + rect.bottom);
        Path path = this.boundsPath;
        if (path == null) {
            this.boundsPath = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        Path path2 = this.boundsPath;
        float f3 = this.radius;
        path2.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.boundsPath);
        float f4 = this.backgroundBack * f;
        if (f4 > 0.0f) {
            ChatMessageCell chatMessageCell = ChatMessageCell.this;
            Paint themedPaint = chatMessageCell.currentMessageObject.shouldDrawWithoutBackground() ? chatMessageCell.getThemedPaint("paintChatActionBackground") : chatMessageCell.getThemedPaint("paintChatTimeBackground");
            int alpha = themedPaint.getAlpha();
            themedPaint.setAlpha((int) (alpha * f4));
            chatMessageCell.applyServiceShaderMatrix();
            canvas.drawRect(rect, themedPaint);
            if (themedPaint == chatMessageCell.getThemedPaint("paintChatActionBackground") && chatMessageCell.hasGradientService()) {
                int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f4));
                canvas.drawRect(rect, Theme.chat_actionBackgroundGradientDarkenPaint);
                Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
            }
            themedPaint.setAlpha(alpha);
        }
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            int alpha3 = paint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha3 * f));
            canvas.drawRect(rect, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha3);
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setBounds(rect);
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
        float f5 = this.loadingFloat.set(this.loading ? 1.0f : 0.0f, false);
        if (f5 > 0.0f) {
            long jElapsedRealtime = (long) ((SystemClock.elapsedRealtime() - this.start) * 0.75f);
            if (this.segments == null) {
                this.segments = new float[2];
            }
            long j = jElapsedRealtime % 5400;
            float[] fArr = this.segments;
            float f6 = (1520 * j) / 5400.0f;
            fArr[0] = f6 - 20.0f;
            fArr[1] = f6;
            for (int i = 0; i < 4; i++) {
                float[] fArr2 = this.segments;
                float f7 = fArr2[1];
                int i2 = i * 1350;
                FastOutSlowInInterpolator fastOutSlowInInterpolator = this.interpolator;
                fArr2[1] = (fastOutSlowInInterpolator.getInterpolation((j - ((long) i2)) / 667.0f) * 250.0f) + f7;
                float[] fArr3 = this.segments;
                fArr3[0] = (fastOutSlowInInterpolator.getInterpolation((j - ((long) (i2 + 667))) / 667.0f) * 250.0f) + fArr3[0];
            }
            f2 = 1.0f;
            float[] fArr4 = this.segments;
            Path path3 = this.progressClipPath;
            if (path3 == null) {
                this.progressClipPath = new Path();
            } else {
                path3.rewind();
            }
            float fMax = Math.max(40.0f * f5, fArr4[1] - fArr4[0]);
            float f8 = ((1.0f - f5) * fMax * (this.loading ? 0.0f : 1.0f)) + fArr4[0];
            float f9 = (fMax * f5) + f8;
            float f10 = f8 % 360.0f;
            float f11 = f9 % 360.0f;
            if (f10 < 0.0f) {
                f10 += 360.0f;
            }
            float f12 = f10;
            if (f11 < 0.0f) {
                f11 += 360.0f;
            }
            float f13 = f11;
            Path path4 = this.progressClipPath;
            int iCenterX = rect.centerX();
            int i3 = rect.top;
            addLine(path4, iCenterX, i3, rect.right - this.radius, i3, f12, f13, 0.0f, this.a);
            addCorner(this.progressClipPath, rect.right, rect.top, this.diameter, 1, f12, f13, this.a, this.b);
            Path path5 = this.progressClipPath;
            int i4 = rect.right;
            int i5 = rect.top;
            int i6 = this.radius;
            int i7 = i5 + i6;
            int i8 = rect.bottom - i6;
            float f14 = this.b;
            addLine(path5, i4, i7, i4, i8, f12, f13, f14, 180.0f - f14);
            addCorner(this.progressClipPath, rect.right, rect.bottom, this.diameter, 2, f12, f13, 180.0f - this.b, 180.0f - this.a);
            Path path6 = this.progressClipPath;
            int i9 = rect.right;
            int i10 = this.radius;
            int i11 = i9 - i10;
            int i12 = rect.bottom;
            int i13 = rect.left + i10;
            float f15 = this.a;
            addLine(path6, i11, i12, i13, i12, f12, f13, 180.0f - f15, f15 + 180.0f);
            addCorner(this.progressClipPath, rect.left, rect.bottom, this.diameter, 3, f12, f13, this.a + 180.0f, this.b + 180.0f);
            Path path7 = this.progressClipPath;
            int i14 = rect.left;
            int i15 = rect.bottom;
            int i16 = this.radius;
            int i17 = i15 - i16;
            int i18 = rect.top + i16;
            float f16 = this.b;
            addLine(path7, i14, i17, i14, i18, f12, f13, f16 + 180.0f, 360.0f - f16);
            addCorner(this.progressClipPath, rect.left, rect.top, this.diameter, 4, f12, f13, 360.0f - this.b, 360.0f - this.a);
            addLine(this.progressClipPath, rect.left + this.radius, rect.top, rect.centerX(), rect.top, f12, f13, 360.0f - this.a, 360.0f);
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha4 = this.strokePaint.getAlpha();
            this.strokePaint.setAlpha((int) (alpha4 * f));
            canvas.drawPath(this.progressClipPath, this.strokePaint);
            this.strokePaint.setAlpha(alpha4);
            this.parent.invalidate();
        } else {
            f2 = 1.0f;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + rect.centerX(), AndroidUtilities.dp(-13.0f) + rect.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.isOpen) {
            RLottieDrawable rLottieDrawable = this.inIconDrawable;
            rLottieDrawable.setAlpha((int) (this.inIconDrawableAlpha * f));
            rLottieDrawable.draw(canvas);
        } else {
            RLottieDrawable rLottieDrawable2 = this.outIconDrawable;
            rLottieDrawable2.setAlpha((int) (this.outIconDrawableAlpha * f));
            rLottieDrawable2.draw(canvas);
        }
        float f17 = this.animatedDrawLock.set((!this.drawLock || this.isOpen || this.loading) ? false : true);
        if (f17 > 0.0f) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
            if (this.clipLockPaint == null) {
                Paint paint2 = new Paint(1);
                this.clipLockPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
            canvas.scale(f17, f17, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.clipLockPaint);
            if (this.lockPaint == null) {
                this.lockPaint = new Paint(1);
            }
            this.lockPaint.setColor(this.iconColor);
            int i19 = (int) (f17 * 255.0f);
            this.lockPaint.setAlpha(i19);
            rectF2.set(0.0f, AndroidUtilities.dp(3.33f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.33f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), this.lockPaint);
            if (this.lockHandlePath == null || Math.abs(this.lockHandlePathDensity - AndroidUtilities.density) > 0.1f) {
                this.lockHandlePathDensity = AndroidUtilities.density;
                Path path8 = new Path();
                this.lockHandlePath = path8;
                path8.moveTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(3.33f));
                this.lockHandlePath.lineTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(2.0f));
                rectF2.set(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(0.33f), AndroidUtilities.dp(4.99f), AndroidUtilities.dp(3.6599998f));
                this.lockHandlePath.arcTo(rectF2, -180.0f, 180.0f, false);
                this.lockHandlePath.lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.33f));
            }
            if (this.lockStrokePaint == null) {
                Paint paint3 = new Paint(1);
                this.lockStrokePaint = paint3;
                paint3.setStyle(Paint.Style.STROKE);
            }
            this.lockStrokePaint.setStrokeWidth(AndroidUtilities.dp(f2));
            this.lockStrokePaint.setColor(this.iconColor);
            this.lockStrokePaint.setAlpha(i19);
            canvas.drawPath(this.lockHandlePath, this.lockStrokePaint);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
    }

    public final int height() {
        return this.bounds.height();
    }

    public final void onTap() {
        boolean z;
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell == null) {
            return;
        }
        this.clickedToOpen = false;
        boolean z2 = this.shouldBeOpen;
        boolean z3 = !z2;
        boolean z4 = this.premium;
        if (z2) {
            setOpen(false, true);
            setLoading(false, true);
            z = true;
        } else {
            z = !this.loading;
            if ((z4 || canTranscribeTrial(chatMessageCell.getMessageObject())) && chatMessageCell.getMessageObject().isSent()) {
                setLoading(true, true);
            }
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setState(StateSet.NOTHING);
            chatMessageCell.invalidate();
        }
        this.pressed = false;
        if (z) {
            if (z4 || z2) {
                if (!z2) {
                    this.clickedToOpen = true;
                }
                transcribePressed(chatMessageCell.getMessageObject(), z3, chatMessageCell.getDelegate());
            } else if (canTranscribeTrial(chatMessageCell.getMessageObject()) || !(chatMessageCell.getMessageObject() == null || chatMessageCell.getMessageObject().messageOwner == null || TextUtils.isEmpty(chatMessageCell.getMessageObject().messageOwner.voiceTranscription))) {
                transcribePressed(chatMessageCell.getMessageObject(), z3, chatMessageCell.getDelegate());
            } else if (chatMessageCell.getDelegate() != null) {
                if (MessagesController.getInstance(chatMessageCell.currentAccount).transcribeAudioTrialWeeklyNumber > 0) {
                    chatMessageCell.getDelegate().needShowPremiumBulletin(3);
                } else {
                    chatMessageCell.getDelegate().needShowPremiumBulletin(0);
                }
            }
        }
    }

    public final boolean onTouch(float f, float f2, int i) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        if (i == 1 || i == 3) {
            if (this.pressed && i == 1) {
                onTap();
                return true;
            }
            this.pressed = false;
            return false;
        }
        if (!this.pressBounds.contains((int) f, (int) f2)) {
            return false;
        }
        if (i == 0) {
            this.pressed = true;
        }
        if (this.pressed && (rippleDrawableSafe = this.selectorDrawable) != null) {
            rippleDrawableSafe.setHotspot(f, f2);
            this.selectorDrawable.setState(pressedState);
            this.parent.invalidate();
        }
        return true;
    }

    public final void setBounds(int i, int i2, int i3, int i4, int i5) {
        Rect rect = this.bounds;
        if (i3 != rect.width() || i4 != rect.height()) {
            float f = i3 / 2.0f;
            float f2 = i5;
            float f3 = i4 / 2.0f;
            this.a = (float) ((Math.atan((f - f2) / f3) * 180.0d) / 3.141592653589793d);
            this.b = (float) ((Math.atan(f / (f3 - f2)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i, i2, i + i3, i2 + i4);
        int iMin = Math.min(Math.min(i3, i4) / 2, i5);
        this.radius = iMin;
        this.diameter = iMin * 2;
    }

    public final void setColor(float f, int i) {
        boolean z = this.color != i;
        this.color = i;
        this.iconColor = i;
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * 0.156f));
        this.backgroundColor = alphaComponent;
        this.backgroundBack = f;
        this.rippleColor = Theme.blendOver(alphaComponent, ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * (Theme.currentTheme.isDark() ? 0.3f : 0.2f))));
        if (this.backgroundPaint == null) {
            this.backgroundPaint = new Paint();
        }
        this.backgroundPaint.setColor(this.backgroundColor);
        Paint paint = this.backgroundPaint;
        paint.setAlpha((int) ((1.0f - f) * paint.getAlpha()));
        if (z || this.selectorDrawable == null) {
            int iDp = AndroidUtilities.dp(8.0f);
            int i2 = this.rippleColor;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, i2, i2);
            this.selectorDrawable = rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable;
            rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setCallback(this.parent);
        }
        if (z) {
            RLottieDrawable rLottieDrawable = this.inIconDrawable;
            rLottieDrawable.applyingLayerColors = true;
            OKLCH.m(this.iconColor, rLottieDrawable.newColorUpdates, "Artboard Outlines", rLottieDrawable);
            rLottieDrawable.commitApplyLayerColors();
            rLottieDrawable.decodeSingleFrame = true;
            rLottieDrawable.scheduleNextGetFrame();
            rLottieDrawable.updateCurrentFrame(0L);
            int iAlpha = Color.alpha(i);
            this.inIconDrawableAlpha = iAlpha;
            rLottieDrawable.setAlpha(iAlpha);
            RLottieDrawable rLottieDrawable2 = this.outIconDrawable;
            rLottieDrawable2.applyingLayerColors = true;
            OKLCH.m(this.iconColor, rLottieDrawable2.newColorUpdates, "Artboard Outlines", rLottieDrawable2);
            rLottieDrawable2.commitApplyLayerColors();
            rLottieDrawable2.decodeSingleFrame = true;
            rLottieDrawable2.scheduleNextGetFrame();
            rLottieDrawable2.updateCurrentFrame(0L);
            int iAlpha2 = Color.alpha(i);
            this.outIconDrawableAlpha = iAlpha2;
            rLottieDrawable2.setAlpha(iAlpha2);
        }
        if (this.strokePaint == null) {
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.strokePaint.setStrokeCap(Paint.Cap.ROUND);
        }
        this.strokePaint.setColor(i);
    }

    public final void setLoading(boolean z, boolean z2) {
        this.loading = z;
        SeekBarWaveform seekBarWaveform = this.seekBar;
        if (!seekBarWaveform.loading && z && seekBarWaveform.loadingFloat.value <= 0.0f) {
            seekBarWaveform.loadingStart = SystemClock.elapsedRealtime();
        }
        seekBarWaveform.loading = z;
        ChatMessageCell chatMessageCell = seekBarWaveform.parentView;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
        AnimatedFloat animatedFloat = this.loadingFloat;
        if (!z2) {
            animatedFloat.set(this.loading, true);
        } else if (animatedFloat.value <= 0.0f) {
            this.start = SystemClock.elapsedRealtime();
        }
        ChatMessageCell chatMessageCell2 = this.parent;
        if (chatMessageCell2 != null) {
            chatMessageCell2.invalidate();
        }
    }

    public final void setOpen(boolean z, boolean z2) {
        boolean z3 = this.shouldBeOpen;
        if (!z3 && z && this.clickedToOpen) {
            this.clickedToOpen = false;
            ChatMessageCell.this.wasTranscriptionOpen = true;
        }
        this.shouldBeOpen = z;
        if (!z2) {
            this.isOpen = z;
            RLottieDrawable rLottieDrawable = this.inIconDrawable;
            rLottieDrawable.isRunning = false;
            rLottieDrawable.checkChoreographer$1();
            RLottieDrawable rLottieDrawable2 = this.outIconDrawable;
            rLottieDrawable2.isRunning = false;
            rLottieDrawable2.checkChoreographer$1();
            this.inIconDrawable.setCurrentFrame(0, true, false);
            this.outIconDrawable.setCurrentFrame(0, true, false);
        } else if (z && !z3) {
            this.isOpen = false;
            this.inIconDrawable.setCurrentFrame(0, true, false);
            this.outIconDrawable.setCurrentFrame(0, true, false);
            this.outIconDrawable.start();
        } else if (!z && z3) {
            this.isOpen = true;
            this.outIconDrawable.setCurrentFrame(0, true, false);
            this.inIconDrawable.setCurrentFrame(0, true, false);
            this.inIconDrawable.start();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public final int width() {
        return this.bounds.width();
    }

    public static void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f2, 0.0f, 1.0f) - fClamp;
        if (fClamp2 <= 0.0f) {
            return;
        }
        if (i4 == 1) {
            AndroidUtilities.rectTmp.set(i - i3, i2, i, i2 + i3);
        } else if (i4 == 2) {
            AndroidUtilities.rectTmp.set(i - i3, i2 - i3, i, i2);
        } else if (i4 == 3) {
            AndroidUtilities.rectTmp.set(i, i2 - i3, i + i3, i2);
        } else if (i4 == 4) {
            AndroidUtilities.rectTmp.set(i, i2, i + i3, i2 + i3);
        }
        path.addArc(AndroidUtilities.rectTmp, (fClamp * 90.0f) + ((i4 * 90) - 180), fClamp2 * 90.0f);
    }

    public static void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        if (i == i3 && i2 == i4) {
            return;
        }
        float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f2, 0.0f, 1.0f);
        if (fClamp2 - fClamp <= 0.0f) {
            return;
        }
        path.moveTo(AndroidUtilities.lerp(i, i3, fClamp), AndroidUtilities.lerp(i2, i4, fClamp));
        path.lineTo(AndroidUtilities.lerp(i, i3, fClamp2), AndroidUtilities.lerp(i2, i4, fClamp2));
    }
}
