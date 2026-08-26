package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;

public class VoiceMessageEnterTransition implements MessageEnterTransitionContainer.Transition {
    private final ValueAnimator animator;
    final Paint circlePaint = new Paint(1);
    MessageEnterTransitionContainer container;
    float fromRadius;
    private final Matrix gradientMatrix;
    private final Paint gradientPaint;
    private final LinearGradient gradientShader;
    float lastToCx;
    float lastToCy;
    private final RecyclerListView listView;
    private final int messageId;
    private final ChatMessageCell messageView;
    float progress;
    private final ChatActivityEnterView.RecordCircle recordCircle;
    private final Theme.ResourcesProvider resourcesProvider;

    public VoiceMessageEnterTransition(final ChatMessageCell chatMessageCell, ChatActivityEnterView chatActivityEnterView, RecyclerListView recyclerListView, final MessageEnterTransitionContainer messageEnterTransitionContainer, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.messageView = chatMessageCell;
        this.container = messageEnterTransitionContainer;
        this.listView = recyclerListView;
        chatMessageCell.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.getRecordCircle();
        this.recordCircle = recordCircle;
        if (recordCircle != null) {
            this.fromRadius = recordCircle.drawingCircleRadius;
            recordCircle.voiceEnterTransitionInProgress = true;
            recordCircle.skipDraw = true;
        }
        this.gradientMatrix = new Matrix();
        Paint paint = new Paint(1);
        this.gradientPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        paint.setShader(linearGradient);
        this.messageId = chatMessageCell.getMessageObject().stableId;
        messageEnterTransitionContainer.addTransition(this);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda2(6, this, messageEnterTransitionContainer));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                chatMessageCell.setEnterTransitionInProgress(false);
                messageEnterTransitionContainer.removeTransition(VoiceMessageEnterTransition.this);
                if (VoiceMessageEnterTransition.this.recordCircle != null) {
                    VoiceMessageEnterTransition.this.recordCircle.skipDraw = false;
                }
            }
        });
        if (chatMessageCell.getSeekBarWaveform() != null) {
            chatMessageCell.getSeekBarWaveform().setSent();
        }
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$new$0(MessageEnterTransitionContainer messageEnterTransitionContainer, ValueAnimator valueAnimator) {
        this.progress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        messageEnterTransitionContainer.invalidate();
    }

    public void lambda$onDraw$1(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.messageView.getRadialProgress().draw(canvas);
        canvas.translate(-f, -f2);
        float f9 = 1.0f / f3;
        canvas.scale(f9, f9, f4, f5);
        ChatActivityEnterView.RecordCircle recordCircle = this.recordCircle;
        if (recordCircle != null) {
            recordCircle.drawIcon(canvas, (int) f6, (int) f7, 1.0f - f8);
        }
        canvas.scale(f3, f3, f4, f5);
        canvas.translate(f, f2);
    }

    @Override
    public void onDraw(final Canvas canvas) {
        final float x;
        final float y;
        float y2;
        float x2;
        final float f = this.progress;
        float f2 = f > 0.6f ? 1.0f : f / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.recordCircle;
        if (recordCircle == null) {
            x = 0.0f;
        } else {
            x = (recordCircle.getX() + recordCircle.drawingCx) - this.container.getX();
        }
        ChatActivityEnterView.RecordCircle recordCircle2 = this.recordCircle;
        if (recordCircle2 == null) {
            y = 0.0f;
        } else {
            y = (recordCircle2.getY() + recordCircle2.drawingCy) - this.container.getY();
        }
        if (this.messageView.getMessageObject().stableId != this.messageId) {
            x2 = this.lastToCx;
            y2 = this.lastToCy;
        } else {
            y2 = (this.listView.getY() + (this.messageView.getY() + this.messageView.getRadialProgress().getProgressRect().centerY())) - this.container.getY();
            x2 = (this.listView.getX() + (this.messageView.getX() + this.messageView.getRadialProgress().getProgressRect().centerX())) - this.container.getX();
        }
        this.lastToCx = x2;
        this.lastToCy = y2;
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(f);
        float interpolation2 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(f);
        final float f3 = (x2 * interpolation2) + ((1.0f - interpolation2) * x);
        float f4 = 1.0f - interpolation;
        final float f5 = (y2 * interpolation) + (y * f4);
        float fHeight = this.messageView.getRadialProgress().getProgressRect().height() / 2.0f;
        float f6 = (fHeight * interpolation) + (this.fromRadius * f4);
        this.listView.getY();
        this.container.getY();
        this.listView.getMeasuredHeight();
        if (this.container.getMeasuredHeight() > 0) {
            this.container.getMeasuredHeight();
        }
        int circleColorKey = this.messageView.getRadialProgress().getCircleColorKey();
        Paint paint = this.circlePaint;
        int i = Theme.key_chat_messagePanelVoiceBackground;
        int themedColor = getThemedColor(i);
        if (circleColorKey < 0) {
            circleColorKey = i;
        }
        paint.setColor(ColorUtils.blendARGB(interpolation, themedColor, getThemedColor(circleColorKey)));
        ChatActivityEnterView.RecordCircle recordCircle3 = this.recordCircle;
        if (recordCircle3 != null) {
            recordCircle3.drawWaves(canvas, f3, f5, 1.0f - f2);
        }
        canvas.drawCircle(f3, f5, f6, this.circlePaint);
        canvas.save();
        final float f7 = f6 / fHeight;
        canvas.scale(f7, f7, f3, f5);
        final float fCenterX = f3 - this.messageView.getRadialProgress().getProgressRect().centerX();
        final float fCenterY = f5 - this.messageView.getRadialProgress().getProgressRect().centerY();
        canvas.translate(fCenterX, fCenterY);
        this.messageView.getRadialProgress().setOverrideAlpha(interpolation);
        this.messageView.getRadialProgress().setDrawBackground(false);
        this.messageView.drawVoiceOnce(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onDraw$1(canvas, fCenterX, fCenterY, f7, f3, f5, x, y, f);
            }
        });
        this.messageView.getRadialProgress().setDrawBackground(true);
        this.messageView.getRadialProgress().setOverrideAlpha(1.0f);
        canvas.restore();
    }

    public void start() {
        this.animator.start();
    }
}
