package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BlobDrawable;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarWaveform;

public final class VoiceMessageEnterTransition implements MessageEnterTransitionContainer.Transition {
    public final ValueAnimator animator;
    public final Paint circlePaint = new Paint(1);
    public final MessageEnterTransitionContainer container;
    public final float fromRadius;
    public float lastToCx;
    public float lastToCy;
    public final RecyclerListView listView;
    public final int messageId;
    public final ChatMessageCell messageView;
    public float progress;
    public final ChatActivityEnterView.RecordCircle recordCircle;
    public final Theme.ResourcesProvider resourcesProvider;

    public VoiceMessageEnterTransition(ChatMessageCell chatMessageCell, ChatActivity.AnonymousClass39 anonymousClass39, RecyclerListView recyclerListView, MessageEnterTransitionContainer messageEnterTransitionContainer, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.messageView = chatMessageCell;
        this.container = messageEnterTransitionContainer;
        this.listView = recyclerListView;
        chatMessageCell.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = anonymousClass39.getRecordCircle();
        this.recordCircle = recordCircle;
        if (recordCircle != null) {
            this.fromRadius = recordCircle.drawingCircleRadius;
            recordCircle.voiceEnterTransitionInProgress = true;
            recordCircle.skipDraw = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.messageId = chatMessageCell.getMessageObject().stableId;
        ((ArrayList) messageEnterTransitionContainer.transitions).add(this);
        messageEnterTransitionContainer.checkVisibility();
        ((ViewGroup) messageEnterTransitionContainer.parent).invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(28, this, messageEnterTransitionContainer));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.addListener(new EmojiView.AnonymousClass35(this, chatMessageCell, messageEnterTransitionContainer, 9));
        if (chatMessageCell.getSeekBarWaveform() != null) {
            SeekBarWaveform seekBarWaveform = chatMessageCell.getSeekBarWaveform();
            seekBarWaveform.appearFloat.set(0.0f, true);
            ChatMessageCell chatMessageCell2 = seekBarWaveform.parentView;
            if (chatMessageCell2 != null) {
                chatMessageCell2.invalidate();
            }
        }
    }

    @Override
    public final void onDraw(final Canvas canvas) {
        final float x;
        final float y;
        float y2;
        float x2;
        final float f = this.progress;
        float f2 = f > 0.6f ? 1.0f : f / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.recordCircle;
        MessageEnterTransitionContainer messageEnterTransitionContainer = this.container;
        if (recordCircle == null) {
            x = 0.0f;
        } else {
            x = (recordCircle.getX() + recordCircle.drawingCx) - messageEnterTransitionContainer.getX();
        }
        if (recordCircle == null) {
            y = 0.0f;
        } else {
            y = (recordCircle.getY() + recordCircle.drawingCy) - messageEnterTransitionContainer.getY();
        }
        ChatMessageCell chatMessageCell = this.messageView;
        int i = chatMessageCell.getMessageObject().stableId;
        int i2 = this.messageId;
        RecyclerListView recyclerListView = this.listView;
        if (i != i2) {
            x2 = this.lastToCx;
            y2 = this.lastToCy;
        } else {
            y2 = (recyclerListView.getY() + (chatMessageCell.getY() + chatMessageCell.getRadialProgress().progressRect.centerY())) - messageEnterTransitionContainer.getY();
            x2 = (recyclerListView.getX() + (chatMessageCell.getX() + chatMessageCell.getRadialProgress().progressRect.centerX())) - messageEnterTransitionContainer.getX();
        }
        this.lastToCx = x2;
        this.lastToCy = y2;
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(f);
        float interpolation2 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f);
        final float f3 = (x2 * interpolation2) + ((1.0f - interpolation2) * x);
        float f4 = 1.0f - interpolation;
        final float f5 = (y2 * interpolation) + (y * f4);
        float fHeight = chatMessageCell.getRadialProgress().progressRect.height() / 2.0f;
        float f6 = (fHeight * interpolation) + (this.fromRadius * f4);
        recyclerListView.getY();
        messageEnterTransitionContainer.getY();
        recyclerListView.getMeasuredHeight();
        if (messageEnterTransitionContainer.getMeasuredHeight() > 0) {
            messageEnterTransitionContainer.getMeasuredHeight();
        }
        int i3 = chatMessageCell.getRadialProgress().circleColorKey;
        Paint paint = this.circlePaint;
        int i4 = Theme.key_chat_messagePanelVoiceBackground;
        float f7 = f2;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i4, resourcesProvider);
        if (i3 < 0) {
            i3 = i4;
        }
        paint.setColor(ColorUtils.blendARGB(interpolation, color, Theme.getColor(i3, resourcesProvider)));
        if (recordCircle != null) {
            float f8 = 1.0f - f7;
            float interpolation3 = CubicBezierInterpolator.EASE_OUT.getInterpolation(recordCircle.wavesEnterAnimation);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f9 = chatActivityEnterView.slideToCancelProgress;
            float f10 = f9 > 0.7f ? 1.0f : f9 / 0.7f;
            canvas.save();
            float f11 = chatActivityEnterView.scale * f10 * interpolation3;
            BlobDrawable blobDrawable = recordCircle.bigWaveDrawable;
            float f12 = f10;
            float f13 = ((blobDrawable.amplitude * 1.4f) + 0.878f) * f11 * f8;
            canvas.scale(f13, f13, f3, f5);
            blobDrawable.draw(f3, f5, canvas, blobDrawable.paint);
            canvas.restore();
            float f14 = chatActivityEnterView.scale * f12 * interpolation3;
            BlobDrawable blobDrawable2 = recordCircle.tinyWaveDrawable;
            float f15 = ((blobDrawable2.amplitude * 1.4f) + 0.926f) * f14 * f8;
            canvas.save();
            canvas.scale(f15, f15, f3, f5);
            blobDrawable2.draw(f3, f5, canvas, blobDrawable2.paint);
            canvas.restore();
        }
        canvas.drawCircle(f3, f5, f6, paint);
        canvas.save();
        final float f16 = f6 / fHeight;
        canvas.scale(f16, f16, f3, f5);
        final float fCenterX = f3 - chatMessageCell.getRadialProgress().progressRect.centerX();
        final float fCenterY = f5 - chatMessageCell.getRadialProgress().progressRect.centerY();
        canvas.translate(fCenterX, fCenterY);
        chatMessageCell.getRadialProgress().overrideAlpha = interpolation;
        chatMessageCell.getRadialProgress().drawBackground = false;
        chatMessageCell.drawVoiceOnce(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Drawable drawable;
                VoiceMessageEnterTransition voiceMessageEnterTransition = this.f$0;
                RadialProgress2 radialProgress = voiceMessageEnterTransition.messageView.getRadialProgress();
                Canvas canvas2 = canvas;
                radialProgress.draw(canvas2);
                float f17 = fCenterX;
                float f18 = fCenterY;
                canvas2.translate(-f17, -f18);
                float f19 = f16;
                float f20 = 1.0f / f19;
                float f21 = f3;
                float f22 = f5;
                canvas2.scale(f20, f20, f21, f22);
                ChatActivityEnterView.RecordCircle recordCircle2 = voiceMessageEnterTransition.recordCircle;
                if (recordCircle2 != null) {
                    int i5 = (int) x;
                    int i6 = (int) y;
                    float f23 = 1.0f - f;
                    recordCircle2.checkDrawables();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z = chatActivityEnterView2.sendButtonVisible;
                    Rect rect = chatActivityEnterView2.sendRect;
                    Drawable drawable2 = null;
                    if (z) {
                        if (recordCircle2.progressToSendButton != 1.0f) {
                            drawable2 = chatActivityEnterView2.isInVideoMode ? chatActivityEnterView2.cameraDrawable : chatActivityEnterView2.micDrawable;
                        }
                        Drawable drawable3 = chatActivityEnterView2.sendDrawable;
                        rect.set(zzle.m(i5, drawable3), i6 - (drawable3.getIntrinsicHeight() / 2), (drawable3.getIntrinsicWidth() / 2) + i5, (drawable3.getIntrinsicHeight() / 2) + i6);
                        if (drawable2 != null) {
                            drawable2.setBounds(i5 - (drawable2.getIntrinsicWidth() / 2), i6 - (drawable2.getIntrinsicHeight() / 2), (drawable2.getIntrinsicWidth() / 2) + i5, (drawable2.getIntrinsicHeight() / 2) + i6);
                        }
                        drawable = drawable3;
                    } else {
                        Drawable drawable4 = chatActivityEnterView2.isInVideoMode ? chatActivityEnterView2.cameraDrawable : chatActivityEnterView2.micDrawable;
                        rect.set(i5 - AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i5, AndroidUtilities.dp(12.0f) + i6);
                        drawable = drawable4;
                    }
                    Drawable drawable5 = drawable2;
                    drawable.setBounds(rect);
                    recordCircle2.drawIconInternal(canvas2, drawable, drawable5, recordCircle2.progressToSendButton, (int) (255.0f * f23));
                }
                canvas2.scale(f19, f19, f21, f22);
                canvas2.translate(f17, f18);
            }
        });
        chatMessageCell.getRadialProgress().drawBackground = true;
        chatMessageCell.getRadialProgress().overrideAlpha = 1.0f;
        canvas.restore();
    }
}
