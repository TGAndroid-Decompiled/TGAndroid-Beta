package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda12;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Forum.MessageTopicButton;

public class TopicButton {
    private boolean active;
    public AnimatedColor animatedBgColor;
    public AnimatedColor animatedColor;
    private final Path arrow;
    private float arrowWidth;
    public int bgColor;
    public final ButtonBounce bounce;
    private final ChatMessageCell cell;
    public final RectF clickBounds;
    public int color;
    public boolean hasImage;
    public Drawable image;
    public int imageColor = 0;
    private final Paint paint = new Paint(1);
    private final Paint strokePaint;
    private long topicId;
    public boolean waitingForColor;
    public int width;

    public TopicButton(ChatMessageCell chatMessageCell) {
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        this.arrow = new Path();
        this.arrowWidth = 0.0f;
        this.clickBounds = new RectF();
        this.cell = chatMessageCell;
        Objects.requireNonNull(chatMessageCell);
        ChatMessageCell$$ExternalSyntheticLambda5 chatMessageCell$$ExternalSyntheticLambda5 = new ChatMessageCell$$ExternalSyntheticLambda5(2, chatMessageCell);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedColor = new AnimatedColor(chatMessageCell$$ExternalSyntheticLambda5, 320L, cubicBezierInterpolator);
        this.animatedBgColor = new AnimatedColor(new ChatMessageCell$$ExternalSyntheticLambda5(2, chatMessageCell), 320L, cubicBezierInterpolator);
        this.bounce = new ButtonBounce(chatMessageCell);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public void attach() {
        Drawable drawable = this.image;
        if (drawable instanceof AnimatedEmojiDrawable) {
            ChatMessageCell chatMessageCell = this.cell;
            Objects.requireNonNull(chatMessageCell);
            ((AnimatedEmojiDrawable) drawable).addView(new ChatMessageCell$$ExternalSyntheticLambda12(chatMessageCell));
        }
    }

    public void detach() {
        Drawable drawable = this.image;
        if (drawable instanceof AnimatedEmojiDrawable) {
            ChatMessageCell chatMessageCell = this.cell;
            Objects.requireNonNull(chatMessageCell);
            ((AnimatedEmojiDrawable) drawable).removeView(new ChatMessageCell$$ExternalSyntheticLambda12(chatMessageCell));
        }
    }

    public void draw(Canvas canvas, float f, float f2, float f3) {
        if (this.active) {
            float scale = this.bounce.getScale(0.025f) * AndroidUtilities.lerp(0.35f, 1.0f, f3);
            float fDp = AndroidUtilities.dp(24.0f);
            if (this.waitingForColor) {
                Drawable drawable = this.image;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    int dominantColor = AnimatedEmojiDrawable.getDominantColor((AnimatedEmojiDrawable) drawable);
                    this.color = getColor(dominantColor);
                    this.bgColor = getBackgroundColor(dominantColor);
                }
                this.waitingForColor = false;
            }
            int i = this.animatedColor.set(this.color);
            int i2 = this.animatedBgColor.set(this.bgColor);
            canvas.save();
            this.clickBounds.set(f, f2, this.width + f, f2 + fDp);
            this.clickBounds.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            canvas.translate(f, f2);
            float f4 = fDp / 2.0f;
            canvas.scale(scale, scale, this.width, f4);
            this.paint.setColor(i2);
            this.paint.setAlpha((int) (38.25f * f3));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, this.width, fDp);
            canvas.drawRoundRect(rectF, f4, f4, this.paint);
            float fDp2 = AndroidUtilities.dp(3.5f);
            float fDp3 = AndroidUtilities.dp(8.0f);
            if (this.arrowWidth != fDp2) {
                this.arrowWidth = fDp2;
                this.arrow.rewind();
                float f5 = (-fDp2) / 2.0f;
                this.arrow.moveTo(f5, (-fDp3) / 2.0f);
                this.arrow.lineTo(fDp2 / 2.0f, 0.0f);
                this.arrow.lineTo(f5, fDp3 / 2.0f);
            }
            Drawable drawable2 = this.image;
            if (drawable2 != null) {
                if (this.imageColor != i) {
                    this.imageColor = i;
                    drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
                float fDp4 = AndroidUtilities.dp(16.0f) / 2;
                this.image.setBounds((int) ((AndroidUtilities.dp(2.0f) + f4) - fDp4), (int) (f4 - fDp4), (int) (AndroidUtilities.dp(2.0f) + f4 + fDp4), (int) (fDp4 + f4));
                this.image.setAlpha((int) (f3 * 255.0f));
                this.image.draw(canvas);
            }
            canvas.save();
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
            this.strokePaint.setColor(i);
            this.strokePaint.setAlpha((int) (f3 * 255.0f));
            canvas.translate(this.width - f4, f4);
            canvas.drawPath(this.arrow, this.strokePaint);
            canvas.restore();
            canvas.restore();
        }
    }

    public int getBackgroundColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[0];
        if (fArr[1] <= 0.02f) {
            return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_inReactionButtonBackground, this.cell.getResourcesProvider()), 38);
        }
        Color.colorToHSV(Theme.getColor(Theme.key_chat_inReactionButtonText, this.cell.getResourcesProvider()), fArr);
        fArr[0] = f;
        float[] fArr2 = Theme.currentTheme.isDark() ? MessageTopicButton.darkHueRanges : MessageTopicButton.lightHueRanges;
        float[] fArr3 = Theme.currentTheme.isDark() ? MessageTopicButton.darkSatValues : MessageTopicButton.lightSatValues;
        float[] fArr4 = Theme.currentTheme.isDark() ? MessageTopicButton.darkValValues : MessageTopicButton.lightValValues;
        for (int i2 = 1; i2 < fArr2.length; i2++) {
            float f2 = fArr2[i2];
            if (f <= f2) {
                int i3 = i2 - 1;
                float f3 = fArr2[i3];
                float f4 = (f - f3) / (f2 - f3);
                fArr[1] = AndroidUtilities.lerp(fArr3[i3], fArr3[i2], f4);
                fArr[2] = AndroidUtilities.lerp(fArr4[i3], fArr4[i2], f4);
                break;
            }
        }
        return Color.HSVToColor(38, fArr);
    }

    public int getColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[0];
        if (fArr[1] <= 0.02f) {
            return Theme.getColor(Theme.key_chat_inReactionButtonText, this.cell.getResourcesProvider());
        }
        Color.colorToHSV(Theme.getColor(Theme.key_chat_inReactionButtonText, this.cell.getResourcesProvider()), fArr);
        fArr[0] = f;
        float[] fArr2 = Theme.currentTheme.isDark() ? MessageTopicButton.darkHueRanges : MessageTopicButton.lightHueRanges;
        float[] fArr3 = Theme.currentTheme.isDark() ? MessageTopicButton.darkSatValues : MessageTopicButton.lightSatValues;
        float[] fArr4 = Theme.currentTheme.isDark() ? MessageTopicButton.darkValValues : MessageTopicButton.lightValValues;
        for (int i2 = 1; i2 < fArr2.length; i2++) {
            float f2 = fArr2[i2];
            if (f <= f2) {
                int i3 = i2 - 1;
                float f3 = fArr2[i3];
                float f4 = (f - f3) / (f2 - f3);
                fArr[1] = AndroidUtilities.lerp(fArr3[i3], fArr3[i2], f4);
                fArr[2] = AndroidUtilities.lerp(fArr4[i3], fArr4[i2], f4);
                break;
            }
        }
        return Color.HSVToColor(Color.alpha(Theme.getColor(Theme.key_chat_inReactionButtonText, this.cell.getResourcesProvider())), fArr);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains = this.clickBounds.contains(motionEvent.getX(), motionEvent.getY() - this.cell.getPaddingTop());
        if (motionEvent.getAction() == 0) {
            this.bounce.setPressed(zContains);
        } else if (motionEvent.getAction() == 2) {
            if (this.bounce.isPressed() && !zContains) {
                this.bounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.bounce.isPressed() && this.cell.getDelegate() != null) {
                this.cell.getDelegate().didPressSideButton(this.cell);
            }
            this.bounce.setPressed(false);
        } else if (motionEvent.getAction() == 3) {
            this.bounce.setPressed(false);
        }
        return this.bounce.isPressed();
    }

    public boolean update(MessageObject messageObject) {
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell.isMonoForum) {
            if (this.topicId == -1) {
                return this.active;
            }
            this.topicId = -1L;
            Drawable drawable = this.image;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(new ChatMessageCell$$ExternalSyntheticLambda12(chatMessageCell));
            }
            this.image = null;
            this.waitingForColor = false;
            if (messageObject.isOutOwner()) {
                int color = Theme.getColor(Theme.key_chat_outReplyLine, this.cell.getResourcesProvider());
                this.bgColor = color;
                this.color = color;
            } else {
                int color2 = Theme.getColor(Theme.key_chat_inReplyLine, this.cell.getResourcesProvider());
                this.bgColor = color2;
                this.color = color2;
            }
            this.animatedColor.force(this.color);
            this.width = AndroidUtilities.dp(24.0f);
            this.active = true;
            return true;
        }
        if (!chatMessageCell.isForum) {
            this.active = false;
            return false;
        }
        Drawable drawable2 = this.image;
        if (drawable2 instanceof AnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable) drawable2).removeView(new ChatMessageCell$$ExternalSyntheticLambda12(chatMessageCell));
        }
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.cell.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), messageObject.getTopicId());
        if (tL_forumTopicFindTopic != null && this.topicId == tL_forumTopicFindTopic.id) {
            return this.active;
        }
        this.imageColor = 0;
        this.image = null;
        this.waitingForColor = false;
        if (tL_forumTopicFindTopic == null) {
            this.image = null;
            this.topicId = -2L;
            this.active = false;
            return false;
        }
        int i = tL_forumTopicFindTopic.id;
        this.topicId = i;
        if (i == 1) {
            this.image = this.cell.getContext().getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } else {
            long j = tL_forumTopicFindTopic.icon_emoji_id;
            if (j != 0) {
                this.image = AnimatedEmojiDrawable.make(this.cell.currentAccount, 0, j);
            } else {
                CombinedDrawable combinedDrawableCreateTopicDrawable = ForumUtilities.createTopicDrawable(tL_forumTopicFindTopic);
                this.image = combinedDrawableCreateTopicDrawable;
                if (combinedDrawableCreateTopicDrawable != null && (combinedDrawableCreateTopicDrawable.getIcon() instanceof LetterDrawable)) {
                    ((LetterDrawable) ((CombinedDrawable) this.image).getIcon()).scale = 0.65f;
                }
            }
        }
        if (messageObject.isOutOwner()) {
            int color3 = Theme.getColor(Theme.key_chat_outReplyLine, this.cell.getResourcesProvider());
            this.bgColor = color3;
            this.color = color3;
        } else if (tL_forumTopicFindTopic.id == 1) {
            int color4 = Theme.getColor(Theme.key_chat_inReplyLine, this.cell.getResourcesProvider());
            this.bgColor = color4;
            this.color = color4;
        } else if (tL_forumTopicFindTopic.icon_emoji_id != 0) {
            int color5 = Theme.getColor(Theme.key_chat_inReplyLine, this.cell.getResourcesProvider());
            this.bgColor = color5;
            this.color = color5;
            this.waitingForColor = true;
        } else {
            this.color = getColor(tL_forumTopicFindTopic.icon_color);
            this.bgColor = getBackgroundColor(tL_forumTopicFindTopic.icon_color);
        }
        this.animatedColor.force(this.color);
        this.width = AndroidUtilities.dp(43.66f);
        this.active = true;
        return true;
    }
}
