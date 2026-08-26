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
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;

public class TranscribeButton {
    private static final int[] pressedState = {16842910, 16842919};
    private static HashMap<Integer, MessageObject> transcribeOperationsByDialogPosition;
    private static HashMap<Long, MessageObject> transcribeOperationsById;
    private static ArrayList<Integer> videoTranscriptionsOpen;
    private float a;
    private final AnimatedFloat animatedDrawLock;
    private float b;
    private float backgroundBack;
    private int backgroundColor;
    private Paint backgroundPaint;
    private Path boundsPath;
    private Paint clipLockPaint;
    private int color;
    private int diameter;
    private boolean drawLock;
    private int iconColor;
    private RLottieDrawable inIconDrawable;
    private int inIconDrawableAlpha;
    private boolean isOpen;
    private boolean loading;
    private final AnimatedFloat loadingFloat;
    private Path loadingPath;
    private Path lockHandlePath;
    private float lockHandlePathDensity;
    private Paint lockPaint;
    private Paint lockStrokePaint;
    private RLottieDrawable outIconDrawable;
    private int outIconDrawableAlpha;
    private ChatMessageCell parent;
    private boolean premium;
    private Rect pressBounds;
    private Path progressClipPath;
    private int radius;
    private int rippleColor;
    private SeekBarWaveform seekBar;
    private float[] segments;
    private Drawable selectorDrawable;
    private boolean shouldBeOpen;
    private Paint strokePaint;
    private boolean clickedToOpen = false;
    private boolean pressed = false;
    private long pressId = 0;
    private final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    private long start = SystemClock.elapsedRealtime();
    private Rect bounds = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));

    public static class LoadingPointsDrawable extends Drawable {
        private final Drawable.Callback callback;
        private int lastColor;
        private RLottieDrawable lottie;
        private Paint paint;

        public LoadingPointsDrawable(TextPaint textPaint) {
            Drawable.Callback callback = new Drawable.Callback() {
                @Override
                public void invalidateDrawable(Drawable drawable) {
                    LoadingPointsDrawable.this.invalidateSelf();
                }

                @Override
                public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                }

                @Override
                public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                }
            };
            this.callback = callback;
            this.paint = textPaint;
            float textSize = textPaint.getTextSize() * 0.89f;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.dots_loading, "dots_loading", (int) textSize, (int) (textSize * 1.25f));
            this.lottie = rLottieDrawable;
            rLottieDrawable.setCallback(callback);
            this.lottie.setAutoRepeat(1);
            this.lottie.setCurrentFrame((int) ((SystemClock.elapsedRealtime() / 16.0f) % 60.0f));
            this.lottie.setAllowDecodeSingleFrame(true);
            this.lottie.start();
        }

        @Override
        public void draw(Canvas canvas) {
            int color = this.paint.getColor();
            if (color != this.lastColor) {
                setColor(color);
                this.lastColor = color;
            }
            this.lottie.draw(canvas);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        public void setColor(int i) {
            this.lottie.beginApplyLayerColors();
            this.lottie.setLayerColor("Comp 1", i);
            this.lottie.commitApplyLayerColors();
            this.lottie.setAllowDecodeSingleFrame(true);
            this.lottie.updateCurrentFrame(0L, false);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public static class LoadingPointsSpan extends ImageSpan {
        private static LoadingPointsDrawable drawable;

        public LoadingPointsSpan() {
            LoadingPointsDrawable loadingPointsDrawable = drawable;
            if (loadingPointsDrawable == null) {
                loadingPointsDrawable = new LoadingPointsDrawable(Theme.chat_msgTextPaint);
                drawable = loadingPointsDrawable;
            }
            super(loadingPointsDrawable, 0);
            float textSize = Theme.chat_msgTextPaint.getTextSize() * 0.89f;
            int i = (int) (0.02f * textSize);
            getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            float textSize = textPaint.getTextSize() * 0.89f;
            int i = (int) (0.02f * textSize);
            getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
            super.updateDrawState(textPaint);
        }
    }

    public TranscribeButton(ChatMessageCell chatMessageCell, SeekBarWaveform seekBarWaveform) {
        boolean z = false;
        this.parent = chatMessageCell;
        this.seekBar = seekBarWaveform;
        Rect rect = new Rect(this.bounds);
        this.pressBounds = rect;
        rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.transcribe_out, "transcribe_out", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.outIconDrawable = rLottieDrawable;
        rLottieDrawable.setCurrentFrame(0);
        this.outIconDrawable.setCallback(chatMessageCell);
        final int i = 0;
        this.outIconDrawable.setOnFinishCallback(new Runnable(this) {
            public final TranscribeButton f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        }, 19);
        this.outIconDrawable.setAllowDecodeSingleFrame(true);
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.transcribe_in, "transcribe_in", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.inIconDrawable = rLottieDrawable2;
        rLottieDrawable2.setCurrentFrame(0);
        this.inIconDrawable.setCallback(chatMessageCell);
        this.inIconDrawable.setMasterParent(chatMessageCell);
        final int i2 = 1;
        this.inIconDrawable.setOnFinishCallback(new Runnable(this) {
            public final TranscribeButton f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        }, 19);
        this.inIconDrawable.setAllowDecodeSingleFrame(true);
        this.isOpen = false;
        this.shouldBeOpen = false;
        if (chatMessageCell.getMessageObject() != null && UserConfig.getInstance(chatMessageCell.getMessageObject().currentAccount).isPremium()) {
            z = true;
        }
        this.premium = z;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.loadingFloat = new AnimatedFloat(chatMessageCell, 250L, cubicBezierInterpolator);
        this.animatedDrawLock = new AnimatedFloat(chatMessageCell, 250L, cubicBezierInterpolator);
    }

    private void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (f <= f2) {
            float f5 = f4 - f3;
            addCorner(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f5, (Math.min(f2, f4) - f3) / f5);
        } else {
            float f6 = f4 - f3;
            addCorner(path, i, i2, i3, i4, (f - f3) / f6, 1.0f);
            addCorner(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f6);
        }
    }

    private void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
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

    private void drawLock(Canvas canvas) {
        float f = this.animatedDrawLock.set((!this.drawLock || this.isOpen || this.loading) ? false : true);
        if (f <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        if (this.clipLockPaint == null) {
            Paint paint = new Paint(1);
            this.clipLockPaint = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, -AndroidUtilities.dp(0.4f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.733f));
        canvas.scale(f, f, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.clipLockPaint);
        if (this.lockPaint == null) {
            this.lockPaint = new Paint(1);
        }
        this.lockPaint.setColor(this.iconColor);
        int i = (int) (f * 255.0f);
        this.lockPaint.setAlpha(i);
        rectF.set(0.0f, AndroidUtilities.dp(3.33f), AndroidUtilities.dp(6.666f), AndroidUtilities.dp(8.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), this.lockPaint);
        if (this.lockHandlePath == null || Math.abs(this.lockHandlePathDensity - AndroidUtilities.density) > 0.1f) {
            this.lockHandlePathDensity = AndroidUtilities.density;
            Path path = new Path();
            this.lockHandlePath = path;
            path.moveTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(3.33f));
            this.lockHandlePath.lineTo(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(2.0f));
            rectF.set(AndroidUtilities.dp(1.66f), AndroidUtilities.dp(0.33f), AndroidUtilities.dp(4.99f), AndroidUtilities.dp(3.6599998f));
            this.lockHandlePath.arcTo(rectF, -180.0f, 180.0f, false);
            this.lockHandlePath.lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.33f));
        }
        if (this.lockStrokePaint == null) {
            Paint paint2 = new Paint(1);
            this.lockStrokePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
        }
        this.lockStrokePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.lockStrokePaint.setColor(this.iconColor);
        this.lockStrokePaint.setAlpha(i);
        canvas.drawPath(this.lockHandlePath, this.lockStrokePaint);
        canvas.restore();
    }

    public static boolean finishTranscription(MessageObject messageObject, long j, String str) {
        try {
            HashMap<Long, MessageObject> map = transcribeOperationsById;
            MessageObject messageObjectRemove = messageObject == null ? (map == null || !map.containsKey(Long.valueOf(j))) ? null : transcribeOperationsById.remove(Long.valueOf(j)) : messageObject;
            if (messageObjectRemove != null && messageObjectRemove.messageOwner != null) {
                HashMap<Integer, MessageObject> map2 = transcribeOperationsByDialogPosition;
                if (map2 != null) {
                    map2.remove(Integer.valueOf(reqInfoHash(messageObjectRemove)));
                }
                messageObjectRemove.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObjectRemove.currentAccount).updateMessageVoiceTranscription(messageObjectRemove.getDialogId(), messageObjectRemove.getId(), str, messageObjectRemove.messageOwner);
                AndroidUtilities.runOnUIThread(new TranscribeButton$$ExternalSyntheticLambda0(str, messageObjectRemove, j, 0));
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private float[] getSegments(long j) {
        if (this.segments == null) {
            this.segments = new float[2];
        }
        long j2 = j % 5400;
        float[] fArr = this.segments;
        float f = (1520 * j2) / 5400.0f;
        fArr[0] = f - 20.0f;
        fArr[1] = f;
        for (int i = 0; i < 4; i++) {
            float[] fArr2 = this.segments;
            int i2 = i * 1350;
            fArr2[1] = (this.interpolator.getInterpolation((j2 - ((long) i2)) / 667.0f) * 250.0f) + fArr2[1];
            float[] fArr3 = this.segments;
            fArr3[0] = (this.interpolator.getInterpolation((j2 - ((long) (i2 + 667))) / 667.0f) * 250.0f) + fArr3[0];
        }
        return this.segments;
    }

    public static int getTranscribeTrialCount(int i) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        MessagesController messagesController = MessagesController.getInstance(i);
        if (messagesController.transcribeAudioTrialWeeklyNumber <= 0) {
            return 0;
        }
        return (messagesController.transcribeAudioTrialCooldownUntil == 0 || connectionsManager.getCurrentTime() > messagesController.transcribeAudioTrialCooldownUntil) ? messagesController.transcribeAudioTrialWeeklyNumber : messagesController.transcribeAudioTrialCurrentNumber;
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
        HashMap<Integer, MessageObject> map = transcribeOperationsByDialogPosition;
        if (map != null && (map.containsValue(messageObject) || transcribeOperationsByDialogPosition.containsKey(Integer.valueOf(reqInfoHash(messageObject))))) {
            return true;
        }
        HashMap<Long, MessageObject> map2 = transcribeOperationsById;
        return (map2 == null || messageObject == null || (message = messageObject.messageOwner) == null || !map2.containsKey(Long.valueOf(message.voiceTranscriptionId))) ? false : true;
    }

    public static boolean isVideoTranscriptionOpen(MessageObject messageObject) {
        if (videoTranscriptionsOpen != null) {
            return !messageObject.isRoundVideo() || videoTranscriptionsOpen.contains(Integer.valueOf(reqInfoHash(messageObject)));
        }
        return false;
    }

    public static void lambda$finishTranscription$8(MessageObject messageObject, long j, String str) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
        int i = NotificationCenter.voiceTranscriptionUpdate;
        Long lValueOf = Long.valueOf(j);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i, messageObject, lValueOf, str, bool, bool);
    }

    public void lambda$new$0() {
        this.outIconDrawable.stop();
        this.inIconDrawable.stop();
        this.shouldBeOpen = true;
        this.isOpen = true;
        this.inIconDrawable.setCurrentFrame(0);
    }

    public void lambda$new$1() {
        this.inIconDrawable.stop();
        this.outIconDrawable.stop();
        this.shouldBeOpen = false;
        this.isOpen = false;
        this.outIconDrawable.setCurrentFrame(0);
    }

    public static void lambda$showOffTranscribe$9(MessageObject messageObject) {
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
    }

    public static void lambda$transcribePressed$2(int i, MessageObject messageObject) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
        int i2 = NotificationCenter.voiceTranscriptionUpdate;
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, messageObject, null, null, bool, bool);
    }

    public static void lambda$transcribePressed$3(ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate, TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio) {
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.needShowPremiumBulletin(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
        }
    }

    public static void lambda$transcribePressed$4(MessageObject messageObject, ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate, int i) {
        HashMap<Integer, MessageObject> map = transcribeOperationsByDialogPosition;
        if (map != null) {
            map.remove(Integer.valueOf(reqInfoHash(messageObject)));
        }
        if (chatMessageCellDelegate != null) {
            chatMessageCellDelegate.needShowPremiumBulletin(3);
        }
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    public static void lambda$transcribePressed$6(int i, ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate, MessageObject messageObject, long j, long j2, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3;
        boolean z;
        String str;
        String str2 = "";
        if (tLObject instanceof TLRPC.TL_messages_transcribedAudio) {
            TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
            String str3 = tL_messages_transcribedAudio.text;
            long j4 = tL_messages_transcribedAudio.transcription_id;
            boolean z2 = tL_messages_transcribedAudio.pending;
            boolean z3 = !z2;
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
            } else if (z2) {
                str2 = null;
            }
            if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                MessagesController.getInstance(i).updateTranscribeAudioTrialCurrentNumber(tL_messages_transcribedAudio.trial_remains_num);
                MessagesController.getInstance(i).updateTranscribeAudioTrialCooldownUntil(tL_messages_transcribedAudio.trial_remains_until_date);
                AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(21, chatMessageCellDelegate, tL_messages_transcribedAudio));
            }
            if (transcribeOperationsById == null) {
                transcribeOperationsById = new HashMap<>();
            }
            transcribeOperationsById.put(Long.valueOf(j4), messageObject);
            messageObject.messageOwner.voiceTranscriptionId = j4;
            j3 = j4;
            z = z3;
        } else {
            if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                MessagesController.getInstance(i).updateTranscribeAudioTrialCurrentNumber(0);
                MessagesController.getInstance(i).updateTranscribeAudioTrialCooldownUntil(Utilities.parseInt((CharSequence) tL_error.text).intValue() + ConnectionsManager.getInstance(i).getCurrentTime());
                AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(messageObject, chatMessageCellDelegate, i, 25));
                return;
            }
            j3 = 0;
            z = true;
        }
        String str4 = str2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        openVideoTranscription(messageObject);
        TLRPC.Message message = messageObject.messageOwner;
        message.voiceTranscriptionOpen = true;
        message.voiceTranscriptionFinal = z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Transcription request sent, received final=" + z + " id=" + j3 + " text=" + str4);
        }
        MessagesStorage.getInstance(i).updateMessageVoiceTranscription(j2, i2, str4, messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new TranscribeButton$$ExternalSyntheticLambda0(str4, messageObject, j3, 1), Math.max(0L, 350 - jElapsedRealtime));
        }
    }

    public static void lambda$transcribePressed$7(int i, MessageObject messageObject) {
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject, null, null, Boolean.FALSE, null);
    }

    public static void openVideoTranscription(MessageObject messageObject) {
        if (messageObject == null || isVideoTranscriptionOpen(messageObject)) {
            return;
        }
        if (videoTranscriptionsOpen == null) {
            videoTranscriptionsOpen = new ArrayList<>(1);
        }
        videoTranscriptionsOpen.add(Integer.valueOf(reqInfoHash(messageObject)));
    }

    private static int reqInfoHash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void resetVideoTranscriptionsOpen() {
        ArrayList<Integer> arrayList = videoTranscriptionsOpen;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public static void showOffTranscribe(MessageObject messageObject) {
        showOffTranscribe(messageObject, true);
    }

    public static boolean showTranscribeLock(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null || isFreeTranscribeInChat(messageObject) || !TextUtils.isEmpty(messageObject.messageOwner.voiceTranscription)) {
            return false;
        }
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(messageObject.currentAccount);
        MessagesController messagesController = MessagesController.getInstance(messageObject.currentAccount);
        return !UserConfig.getInstance(messageObject.currentAccount).isPremium() && messagesController.transcribeAudioTrialCooldownUntil != 0 && connectionsManager.getCurrentTime() <= messagesController.transcribeAudioTrialCooldownUntil && messagesController.transcribeAudioTrialCurrentNumber <= 0;
    }

    private static void transcribePressed(final MessageObject messageObject, boolean z, final ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate) {
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
            HashMap<Integer, MessageObject> map = transcribeOperationsByDialogPosition;
            if (map != null) {
                map.remove(Integer.valueOf(reqInfoHash(messageObject)));
            }
            messageObject.messageOwner.voiceTranscriptionOpen = false;
            MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
            final int i3 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            TranscribeButton.lambda$transcribePressed$2(i, messageObject);
                            break;
                        default:
                            TranscribeButton.lambda$transcribePressed$7(i, messageObject);
                            break;
                    }
                }
            });
            return;
        }
        if (message.voiceTranscription != null && message.voiceTranscriptionFinal) {
            openVideoTranscription(messageObject);
            messageObject.messageOwner.voiceTranscriptionOpen = true;
            MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
            final int i4 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            TranscribeButton.lambda$transcribePressed$2(i, messageObject);
                            break;
                        default:
                            TranscribeButton.lambda$transcribePressed$7(i, messageObject);
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
            transcribeOperationsByDialogPosition = new HashMap<>();
        }
        transcribeOperationsByDialogPosition.put(Integer.valueOf(reqInfoHash(messageObject)), messageObject);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TranscribeButton.lambda$transcribePressed$6(i, chatMessageCellDelegate, messageObject, jElapsedRealtime, peerDialogId, i2, tLObject, tL_error);
            }
        }, !UserConfig.getInstance(i).isPremium() ? 1024 : 0);
    }

    public void draw(Canvas canvas, float f) {
        this.pressBounds.set(this.bounds.left - AndroidUtilities.dp(8.0f), this.bounds.top - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + this.bounds.right, AndroidUtilities.dp(8.0f) + this.bounds.bottom);
        Path path = this.boundsPath;
        if (path == null) {
            this.boundsPath = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.bounds);
        Path path2 = this.boundsPath;
        float f2 = this.radius;
        path2.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.boundsPath);
        float f3 = this.backgroundBack * f;
        if (f3 > 0.0f) {
            drawGradientBackground(canvas, this.bounds, f3);
        }
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            int alpha = paint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha * f));
            canvas.drawRect(this.bounds, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha);
        }
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.setBounds(this.bounds);
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
        float f4 = this.loadingFloat.set(this.loading ? 1.0f : 0.0f);
        if (f4 > 0.0f) {
            float[] segments = getSegments((long) ((SystemClock.elapsedRealtime() - this.start) * 0.75f));
            Path path3 = this.progressClipPath;
            if (path3 == null) {
                this.progressClipPath = new Path();
            } else {
                path3.rewind();
            }
            float fMax = Math.max(40.0f * f4, segments[1] - segments[0]);
            float f5 = ((1.0f - f4) * fMax * (this.loading ? 0.0f : 1.0f)) + segments[0];
            float f6 = (fMax * f4) + f5;
            float f7 = f5 % 360.0f;
            float f8 = f6 % 360.0f;
            if (f7 < 0.0f) {
                f7 += 360.0f;
            }
            if (f8 < 0.0f) {
                f8 += 360.0f;
            }
            float f9 = f8;
            Path path4 = this.progressClipPath;
            int iCenterX = this.bounds.centerX();
            Rect rect = this.bounds;
            int i = rect.top;
            addLine(path4, iCenterX, i, rect.right - this.radius, i, f7, f9, 0.0f, this.a);
            Path path5 = this.progressClipPath;
            Rect rect2 = this.bounds;
            addCorner(path5, rect2.right, rect2.top, this.diameter, 1, f7, f9, this.a, this.b);
            Path path6 = this.progressClipPath;
            Rect rect3 = this.bounds;
            int i2 = rect3.right;
            int i3 = rect3.top;
            int i4 = this.radius;
            int i5 = i3 + i4;
            int i6 = rect3.bottom - i4;
            float f10 = this.b;
            addLine(path6, i2, i5, i2, i6, f7, f9, f10, 180.0f - f10);
            Path path7 = this.progressClipPath;
            Rect rect4 = this.bounds;
            addCorner(path7, rect4.right, rect4.bottom, this.diameter, 2, f7, f9, 180.0f - this.b, 180.0f - this.a);
            Path path8 = this.progressClipPath;
            Rect rect5 = this.bounds;
            int i7 = rect5.right;
            int i8 = this.radius;
            int i9 = i7 - i8;
            int i10 = rect5.bottom;
            int i11 = i8 + rect5.left;
            float f11 = this.a;
            addLine(path8, i9, i10, i11, i10, f7, f9, 180.0f - f11, f11 + 180.0f);
            Path path9 = this.progressClipPath;
            Rect rect6 = this.bounds;
            addCorner(path9, rect6.left, rect6.bottom, this.diameter, 3, f7, f9, this.a + 180.0f, this.b + 180.0f);
            Path path10 = this.progressClipPath;
            Rect rect7 = this.bounds;
            int i12 = rect7.left;
            int i13 = rect7.bottom;
            int i14 = this.radius;
            int i15 = i13 - i14;
            int i16 = i14 + rect7.top;
            float f12 = this.b;
            addLine(path10, i12, i15, i12, i16, f7, f9, f12 + 180.0f, 360.0f - f12);
            Path path11 = this.progressClipPath;
            Rect rect8 = this.bounds;
            addCorner(path11, rect8.left, rect8.top, this.diameter, 4, f7, f9, 360.0f - this.b, 360.0f - this.a);
            Path path12 = this.progressClipPath;
            Rect rect9 = this.bounds;
            addLine(path12, rect9.left + this.radius, rect9.top, rect9.centerX(), this.bounds.top, f7, f9, 360.0f - this.a, 360.0f);
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha2 = this.strokePaint.getAlpha();
            this.strokePaint.setAlpha((int) (alpha2 * f));
            canvas.drawPath(this.progressClipPath, this.strokePaint);
            this.strokePaint.setAlpha(alpha2);
            this.parent.invalidate();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-13.0f) + this.bounds.centerX(), AndroidUtilities.dp(-13.0f) + this.bounds.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), 255, 31);
        if (this.isOpen) {
            this.inIconDrawable.setAlpha((int) (this.inIconDrawableAlpha * f));
            this.inIconDrawable.draw(canvas);
        } else {
            this.outIconDrawable.setAlpha((int) (this.outIconDrawableAlpha * f));
            this.outIconDrawable.draw(canvas);
        }
        drawLock(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void drawGradientBackground(Canvas canvas, Rect rect, float f) {
    }

    public int height() {
        return this.bounds.height();
    }

    public void onOpen() {
    }

    public void onTap() {
        boolean z;
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell == null) {
            return;
        }
        this.clickedToOpen = false;
        boolean z2 = this.shouldBeOpen;
        boolean z3 = !z2;
        if (z2) {
            setOpen(false, true);
            setLoading(false, true);
            z = true;
        } else {
            z = !this.loading;
            if ((this.premium || canTranscribeTrial(chatMessageCell.getMessageObject())) && this.parent.getMessageObject().isSent()) {
                setLoading(true, true);
            }
        }
        Drawable drawable = this.selectorDrawable;
        if (drawable instanceof RippleDrawable) {
            drawable.setState(StateSet.NOTHING);
            this.parent.invalidate();
        }
        this.pressed = false;
        if (z) {
            if (this.premium || z2) {
                if (!z2) {
                    this.clickedToOpen = true;
                }
                transcribePressed(this.parent.getMessageObject(), z3, this.parent.getDelegate());
            } else if (canTranscribeTrial(this.parent.getMessageObject()) || !(this.parent.getMessageObject() == null || this.parent.getMessageObject().messageOwner == null || TextUtils.isEmpty(this.parent.getMessageObject().messageOwner.voiceTranscription))) {
                transcribePressed(this.parent.getMessageObject(), z3, this.parent.getDelegate());
            } else if (this.parent.getDelegate() != null) {
                if (MessagesController.getInstance(this.parent.currentAccount).transcribeAudioTrialWeeklyNumber > 0) {
                    this.parent.getDelegate().needShowPremiumBulletin(3);
                } else {
                    this.parent.getDelegate().needShowPremiumBulletin(0);
                }
            }
        }
    }

    public boolean onTouch(int i, float f, float f2) {
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
        if (this.pressed) {
            Drawable drawable = this.selectorDrawable;
            if (drawable instanceof RippleDrawable) {
                drawable.setHotspot(f, f2);
                this.selectorDrawable.setState(pressedState);
                this.parent.invalidate();
            }
        }
        return true;
    }

    public void setBounds(int i, int i2, int i3, int i4, int i5) {
        if (i3 != this.bounds.width() || i4 != this.bounds.height()) {
            float f = i3 / 2.0f;
            float f2 = i5;
            float f3 = i4 / 2.0f;
            this.a = (float) ((Math.atan((f - f2) / f3) * 180.0d) / 3.141592653589793d);
            this.b = (float) ((Math.atan(f / (f3 - f2)) * 180.0d) / 3.141592653589793d);
        }
        this.bounds.set(i, i2, i + i3, i2 + i4);
        int iMin = Math.min(Math.min(i3, i4) / 2, i5);
        this.radius = iMin;
        this.diameter = iMin * 2;
    }

    public void setColor(int i, int i2, boolean z, float f) {
        boolean z2 = this.color != i;
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
        if (z2 || this.selectorDrawable == null) {
            int iDp = AndroidUtilities.dp(8.0f);
            int i3 = this.rippleColor;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, i3, i3);
            this.selectorDrawable = rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable;
            rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable.setCallback(this.parent);
        }
        if (z2) {
            this.inIconDrawable.beginApplyLayerColors();
            this.inIconDrawable.setLayerColor("Artboard Outlines", this.iconColor);
            this.inIconDrawable.commitApplyLayerColors();
            this.inIconDrawable.setAllowDecodeSingleFrame(true);
            this.inIconDrawable.updateCurrentFrame(0L, false);
            RLottieDrawable rLottieDrawable = this.inIconDrawable;
            int iAlpha = Color.alpha(i);
            this.inIconDrawableAlpha = iAlpha;
            rLottieDrawable.setAlpha(iAlpha);
            this.outIconDrawable.beginApplyLayerColors();
            this.outIconDrawable.setLayerColor("Artboard Outlines", this.iconColor);
            this.outIconDrawable.commitApplyLayerColors();
            this.outIconDrawable.setAllowDecodeSingleFrame(true);
            this.outIconDrawable.updateCurrentFrame(0L, false);
            RLottieDrawable rLottieDrawable2 = this.outIconDrawable;
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

    public void setLoading(boolean z, boolean z2) {
        this.loading = z;
        this.seekBar.setLoading(z);
        if (!z2) {
            this.loadingFloat.set(this.loading, true);
        } else if (this.loadingFloat.get() <= 0.0f) {
            this.start = SystemClock.elapsedRealtime();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public void setLock(boolean z, boolean z2) {
        ChatMessageCell chatMessageCell;
        if (this.drawLock != z && (chatMessageCell = this.parent) != null) {
            chatMessageCell.invalidate();
        }
        this.drawLock = z;
        if (z2) {
            return;
        }
        this.animatedDrawLock.set(z, true);
    }

    public void setOpen(boolean z, boolean z2) {
        if (!this.shouldBeOpen && z && this.clickedToOpen) {
            this.clickedToOpen = false;
            onOpen();
        }
        boolean z3 = this.shouldBeOpen;
        this.shouldBeOpen = z;
        if (!z2) {
            this.isOpen = z;
            this.inIconDrawable.stop();
            this.outIconDrawable.stop();
            this.inIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.setCurrentFrame(0);
        } else if (z && !z3) {
            this.isOpen = false;
            this.inIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.start();
        } else if (!z && z3) {
            this.isOpen = true;
            this.outIconDrawable.setCurrentFrame(0);
            this.inIconDrawable.setCurrentFrame(0);
            this.inIconDrawable.start();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public int width() {
        return this.bounds.width();
    }

    public static void showOffTranscribe(MessageObject messageObject, boolean z) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        message.voiceTranscriptionForce = true;
        MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(messageObject, 25));
        }
    }

    private void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2) {
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

    private void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2) {
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
