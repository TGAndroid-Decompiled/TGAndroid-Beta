package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_transcribeAudio;
import org.telegram.tgnet.TLRPC$TL_messages_transcribedAudio;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;

public class TranscribeButton {
    private static final int[] pressedState = {16842910, 16842919};
    private static HashMap<Integer, MessageObject> transcribeOperationsByDialogPosition;
    private static HashMap<Long, MessageObject> transcribeOperationsById;
    private int backgroundColor;
    private Paint backgroundPaint;
    private Path boundsPath;
    private int color;
    private int iconColor;
    private RLottieDrawable inIconDrawable;
    private boolean loading;
    private AnimatedFloat loadingFloat;
    private RLottieDrawable outIconDrawable;
    private ChatMessageCell parent;
    private boolean premium;
    private Rect pressBounds;
    private Path progressClipPath;
    private int rippleColor;
    private SeekBarWaveform seekBar;
    private float[] segments;
    private Drawable selectorDrawable;
    private Paint strokePaint;
    private boolean pressed = false;
    private final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    private long start = SystemClock.elapsedRealtime();
    private Rect bounds = new Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
    private boolean isOpen = false;
    private boolean shouldBeOpen = false;

    public TranscribeButton(ChatMessageCell chatMessageCell, SeekBarWaveform seekBarWaveform) {
        this.parent = chatMessageCell;
        this.seekBar = seekBarWaveform;
        Rect rect = new Rect(this.bounds);
        this.pressBounds = rect;
        rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.transcribe_out, "transcribe_out", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.outIconDrawable = rLottieDrawable;
        rLottieDrawable.setCurrentFrame(0);
        this.outIconDrawable.setCallback(chatMessageCell);
        this.outIconDrawable.addParentView(chatMessageCell);
        this.outIconDrawable.setOnFinishCallback(new Runnable() {
            @Override
            public final void run() {
                TranscribeButton.this.lambda$new$0();
            }
        }, 19);
        this.outIconDrawable.setAllowDecodeSingleFrame(true);
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.transcribe_in, "transcribe_in", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.inIconDrawable = rLottieDrawable2;
        rLottieDrawable2.setCurrentFrame(0);
        this.inIconDrawable.setCallback(chatMessageCell);
        this.inIconDrawable.addParentView(chatMessageCell);
        this.inIconDrawable.setOnFinishCallback(new Runnable() {
            @Override
            public final void run() {
                TranscribeButton.this.lambda$new$1();
            }
        }, 19);
        this.inIconDrawable.setAllowDecodeSingleFrame(true);
        this.premium = AccountInstance.getInstance(chatMessageCell.getMessageObject().currentAccount).getUserConfig().isPremium();
        this.loadingFloat = new AnimatedFloat(chatMessageCell, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
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

    public void setLoading(boolean z, boolean z2) {
        this.loading = z;
        this.seekBar.setLoading(z);
        float f = 0.0f;
        if (!z2) {
            AnimatedFloat animatedFloat = this.loadingFloat;
            if (this.loading) {
                f = 1.0f;
            }
            animatedFloat.set(f, true);
        } else if (this.loadingFloat.get() <= 0.0f) {
            this.start = SystemClock.elapsedRealtime();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public void setOpen(boolean z, boolean z2) {
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

    public boolean onTouch(int i, float f, float f2) {
        boolean z;
        if (i == 1 || i == 3) {
            if (!this.pressed || i != 1) {
                this.pressed = false;
                return false;
            }
            boolean z2 = this.shouldBeOpen;
            boolean z3 = !z2;
            if (!z2) {
                z = !this.loading;
                if (this.premium && this.parent.getMessageObject().isSent()) {
                    setLoading(true, true);
                }
            } else {
                setOpen(false, true);
                setLoading(false, true);
                z = true;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Drawable drawable = this.selectorDrawable;
                if (drawable instanceof RippleDrawable) {
                    drawable.setState(StateSet.NOTHING);
                    this.parent.invalidate();
                }
            }
            this.pressed = false;
            if (z) {
                if (this.premium || !z3) {
                    transcribePressed(this.parent.getMessageObject(), z3);
                } else if (this.parent.getDelegate() != null) {
                    this.parent.getDelegate().needShowPremiumFeatures();
                }
            }
            return true;
        } else if (!this.pressBounds.contains((int) f, (int) f2)) {
            return false;
        } else {
            if (i == 0) {
                this.pressed = true;
            }
            if (this.pressed && Build.VERSION.SDK_INT >= 21) {
                Drawable drawable2 = this.selectorDrawable;
                if (drawable2 instanceof RippleDrawable) {
                    drawable2.setHotspot(f, f2);
                    this.selectorDrawable.setState(pressedState);
                    this.parent.invalidate();
                }
            }
            return true;
        }
    }

    public void setColor(boolean z, int i, int i2) {
        boolean z2 = this.color != i;
        this.color = i;
        this.iconColor = i;
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * 0.156f));
        this.backgroundColor = alphaComponent;
        this.rippleColor = Theme.blendOver(alphaComponent, ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * (Theme.isCurrentThemeDark() ? 0.3f : 0.2f))));
        if (this.backgroundPaint == null) {
            this.backgroundPaint = new Paint();
        }
        this.backgroundPaint.setColor(this.backgroundColor);
        if (z2 || this.selectorDrawable == null) {
            Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, this.rippleColor);
            this.selectorDrawable = createSimpleSelectorRoundRectDrawable;
            createSimpleSelectorRoundRectDrawable.setCallback(this.parent);
        }
        if (z2) {
            this.inIconDrawable.beginApplyLayerColors();
            this.inIconDrawable.setLayerColor("Artboard Outlines.**", this.iconColor);
            this.inIconDrawable.commitApplyLayerColors();
            this.inIconDrawable.setAllowDecodeSingleFrame(true);
            this.inIconDrawable.updateCurrentFrame();
            this.outIconDrawable.beginApplyLayerColors();
            this.outIconDrawable.setLayerColor("Artboard Outlines.**", this.iconColor);
            this.outIconDrawable.commitApplyLayerColors();
            this.outIconDrawable.setAllowDecodeSingleFrame(true);
            this.outIconDrawable.updateCurrentFrame();
        }
        if (this.strokePaint == null) {
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        this.strokePaint.setColor(i);
    }

    public void draw(Canvas canvas) {
        this.bounds.set(0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(27.0f));
        this.pressBounds.set(this.bounds.left - AndroidUtilities.dp(8.0f), this.bounds.top - AndroidUtilities.dp(8.0f), this.bounds.right + AndroidUtilities.dp(8.0f), this.bounds.bottom + AndroidUtilities.dp(8.0f));
        if (this.boundsPath == null) {
            this.boundsPath = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.bounds);
            this.boundsPath.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(this.boundsPath);
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            canvas.drawRect(this.bounds, paint);
        }
        Drawable drawable = this.selectorDrawable;
        if (drawable != null && this.premium) {
            drawable.setBounds(this.bounds);
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
        float f = 1.0f;
        float f2 = this.loadingFloat.set(this.loading ? 1.0f : 0.0f);
        if (f2 > 0.0f) {
            float[] segments = getSegments(((float) (SystemClock.elapsedRealtime() - this.start)) * 0.75f);
            canvas.save();
            if (this.progressClipPath == null) {
                this.progressClipPath = new Path();
            }
            this.progressClipPath.reset();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(this.pressBounds);
            float max = Math.max(40.0f * f2, segments[1] - segments[0]);
            Path path = this.progressClipPath;
            float f3 = segments[0];
            float f4 = (1.0f - f2) * max;
            if (this.loading) {
                f = 0.0f;
            }
            path.addArc(rectF2, f3 + (f4 * f), max * f2);
            this.progressClipPath.lineTo(rectF2.centerX(), rectF2.centerY());
            this.progressClipPath.close();
            canvas.clipPath(this.progressClipPath);
            rectF2.set(this.bounds);
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.strokePaint);
            canvas.restore();
            this.parent.invalidate();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        if (this.isOpen) {
            this.outIconDrawable.updateCurrentFrame();
            this.inIconDrawable.draw(canvas);
        } else {
            this.inIconDrawable.updateCurrentFrame();
            this.outIconDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private float[] getSegments(long j) {
        if (this.segments == null) {
            this.segments = new float[2];
        }
        long j2 = j % 5400;
        float[] fArr = this.segments;
        float f = ((float) (1520 * j2)) / 5400.0f;
        fArr[0] = f - 20.0f;
        fArr[1] = f;
        for (int i = 0; i < 4; i++) {
            int i2 = i * 1350;
            float[] fArr2 = this.segments;
            fArr2[1] = fArr2[1] + (this.interpolator.getInterpolation(((float) (j2 - i2)) / 667.0f) * 250.0f);
            float[] fArr3 = this.segments;
            fArr3[0] = fArr3[0] + (this.interpolator.getInterpolation(((float) (j2 - (i2 + 667))) / 667.0f) * 250.0f);
        }
        return this.segments;
    }

    private static int reqInfoHash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId())});
    }

    public static boolean isTranscribing(MessageObject messageObject) {
        HashMap<Long, MessageObject> hashMap;
        TLRPC$Message tLRPC$Message;
        HashMap<Integer, MessageObject> hashMap2 = transcribeOperationsByDialogPosition;
        return (hashMap2 != null && (hashMap2.containsValue(messageObject) || transcribeOperationsByDialogPosition.containsKey(Integer.valueOf(reqInfoHash(messageObject))))) || !((hashMap = transcribeOperationsById) == null || messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || !hashMap.containsKey(Long.valueOf(tLRPC$Message.voiceTranscriptionId)));
    }

    private static void transcribePressed(final MessageObject messageObject, boolean z) {
        if (messageObject != null && messageObject.messageOwner != null && messageObject.isSent()) {
            final int i = messageObject.currentAccount;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC$InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(messageObject.messageOwner.peer_id);
            final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            final int i2 = tLRPC$Message.id;
            if (!z) {
                HashMap<Integer, MessageObject> hashMap = transcribeOperationsByDialogPosition;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(reqInfoHash(messageObject)));
                }
                messageObject.messageOwner.voiceTranscriptionOpen = false;
                MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TranscribeButton.lambda$transcribePressed$5(i, messageObject);
                    }
                });
            } else if (tLRPC$Message.voiceTranscription == null || !tLRPC$Message.voiceTranscriptionFinal) {
                TLRPC$TL_messages_transcribeAudio tLRPC$TL_messages_transcribeAudio = new TLRPC$TL_messages_transcribeAudio();
                tLRPC$TL_messages_transcribeAudio.peer = inputPeer;
                tLRPC$TL_messages_transcribeAudio.msg_id = i2;
                if (transcribeOperationsByDialogPosition == null) {
                    transcribeOperationsByDialogPosition = new HashMap<>();
                }
                transcribeOperationsByDialogPosition.put(Integer.valueOf(reqInfoHash(messageObject)), messageObject);
                ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_transcribeAudio, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        TranscribeButton.lambda$transcribePressed$4(MessageObject.this, elapsedRealtime, i, peerDialogId, i2, tLObject, tLRPC$TL_error);
                    }
                });
            } else {
                tLRPC$Message.voiceTranscriptionOpen = true;
                MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TranscribeButton.lambda$transcribePressed$2(i, messageObject);
                    }
                });
            }
        }
    }

    public static void lambda$transcribePressed$2(int i, MessageObject messageObject) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
        int i2 = NotificationCenter.voiceTranscriptionUpdate;
        Boolean bool = Boolean.TRUE;
        notificationCenter.postNotificationName(i2, messageObject, null, null, bool, bool);
    }

    public static void lambda$transcribePressed$4(final MessageObject messageObject, long j, int i, long j2, int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final long j3;
        boolean z;
        final String str = "";
        if (tLObject instanceof TLRPC$TL_messages_transcribedAudio) {
            TLRPC$TL_messages_transcribedAudio tLRPC$TL_messages_transcribedAudio = (TLRPC$TL_messages_transcribedAudio) tLObject;
            String str2 = tLRPC$TL_messages_transcribedAudio.text;
            long j4 = tLRPC$TL_messages_transcribedAudio.transcription_id;
            z = !tLRPC$TL_messages_transcribedAudio.pending;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            } else if (!z) {
                str = null;
            }
            if (transcribeOperationsById == null) {
                transcribeOperationsById = new HashMap<>();
            }
            transcribeOperationsById.put(Long.valueOf(j4), messageObject);
            messageObject.messageOwner.voiceTranscriptionId = j4;
            j3 = j4;
        } else {
            j3 = 0;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$Message.voiceTranscriptionOpen = true;
        tLRPC$Message.voiceTranscriptionFinal = z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("Transcription request sent, received final=" + z + " id=" + j3 + " text=" + str);
        }
        MessagesStorage.getInstance(i).updateMessageVoiceTranscription(j2, i2, str, messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TranscribeButton.finishTranscription(MessageObject.this, j3, str);
                }
            }, Math.max(0L, 350 - elapsedRealtime));
        }
    }

    public static void lambda$transcribePressed$5(int i, MessageObject messageObject) {
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.voiceTranscriptionUpdate, messageObject, null, null, Boolean.FALSE, null);
    }

    public static boolean finishTranscription(final MessageObject messageObject, final long j, final String str) {
        MessageObject messageObject2 = null;
        try {
            HashMap<Long, MessageObject> hashMap = transcribeOperationsById;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j))) {
                messageObject2 = transcribeOperationsById.remove(Long.valueOf(j));
            }
            if (messageObject == null) {
                messageObject = messageObject2;
            }
            if (!(messageObject == null || messageObject.messageOwner == null)) {
                HashMap<Integer, MessageObject> hashMap2 = transcribeOperationsByDialogPosition;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(reqInfoHash(messageObject)));
                }
                messageObject.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscription(messageObject.getDialogId(), messageObject.getId(), str, messageObject.messageOwner);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TranscribeButton.lambda$finishTranscription$6(MessageObject.this, j, str);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void lambda$finishTranscription$6(MessageObject messageObject, long j, String str) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
        int i = NotificationCenter.voiceTranscriptionUpdate;
        Boolean bool = Boolean.TRUE;
        notificationCenter.postNotificationName(i, messageObject, Long.valueOf(j), str, bool, bool);
    }
}
