package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.Forum.ForumUtilities;

public final class TopicSeparator {
    public final Paint arrowPaint;
    public final Path arrowPath;
    public final ButtonBounce bounce;
    public final View cell;
    public final RectF clickBounds;
    public final int currentAccount;
    public AnimatedEmojiDrawable emojiImage;
    public final ImageReceiver image;
    public Runnable onClickListener;
    public int pathParentWidth;
    public int pathWidth;
    public boolean pathWithCenter;
    public boolean pathWithDots;
    public final Theme.ResourcesProvider resourcesProvider;
    public Text text;
    public long topicId;
    public final boolean withDots;
    public final AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
    public final Path path = new Path();

    public abstract class Cell extends View {
        public int backgroundHeight;
        public Utilities.Callback onClickListener;
        public final Theme.ResourcesProvider resourceProvider;
        public final TopicSeparator separator;

        public Cell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourceProvider = resourcesProvider;
            TopicSeparator topicSeparator = new TopicSeparator(i, this, resourcesProvider, false);
            this.separator = topicSeparator;
            topicSeparator.onClickListener = new Tooltip$$ExternalSyntheticLambda0(this, 2);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(0.0f, 0.0f, getMeasuredWidth(), this.backgroundHeight);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, 0.0f, 0.0f);
            }
            this.separator.draw(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.separator.attach();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.separator.detach();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.separator.onTouchEvent(motionEvent, false) || super.onTouchEvent(motionEvent);
        }

        public void set(MessageObject messageObject) {
            TopicSeparator topicSeparator = this.separator;
            topicSeparator.update(messageObject);
            if (isAttachedToWindow()) {
                topicSeparator.attach();
            }
        }

        public void setBackgroundHeight(int i) {
            this.backgroundHeight = i;
        }

        public void setOnTopicClickListener(Utilities.Callback<Long> callback) {
            this.onClickListener = callback;
        }
    }

    public TopicSeparator(int i, View view, Theme.ResourcesProvider resourcesProvider, boolean z) {
        Paint paint = new Paint(1);
        this.arrowPaint = paint;
        Path path = new Path();
        this.arrowPath = path;
        this.clickBounds = new RectF();
        this.currentAccount = i;
        this.cell = view;
        this.resourcesProvider = resourcesProvider;
        this.withDots = z;
        this.bounce = new ButtonBounce(view, 1.0f, 5.0f);
        this.image = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void attach() {
        this.image.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this.cell);
        }
    }

    public final void detach() {
        this.image.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this.cell);
        }
    }

    public final void draw(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Text text = this.text;
        if (text == null) {
            return;
        }
        text.ellipsizeWidth = i - AndroidUtilities.dp(144.66f);
        float width = this.text.getWidth() + AndroidUtilities.dp(48.66f);
        float f7 = i;
        float f8 = (f7 - width) / 2.0f;
        int i2 = this.pathWidth;
        int i3 = (int) width;
        Path path = this.path;
        boolean z2 = this.withDots;
        if (i2 == i3 && this.pathParentWidth == i && this.pathWithCenter == z && this.pathWithDots == z2) {
            f6 = width;
            f5 = 2.0f;
        } else {
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            f5 = 2.0f;
            rectF.set(f8, AndroidUtilities.dp(4.5f), f8 + width, AndroidUtilities.dp(28.5f));
            if (z) {
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (z2) {
                float f9 = f7 / 2.0f;
                float fDp = f9 - AndroidUtilities.dp(1.833f);
                while (fDp > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), fDp, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    fDp -= AndroidUtilities.dp(8.33f);
                    f7 = f7;
                    width = width;
                }
                float f10 = f7;
                f6 = width;
                int iDp = AndroidUtilities.dp(1.833f);
                while (true) {
                    f9 += iDp;
                    if (f9 >= f10) {
                        break;
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f9, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f9, AndroidUtilities.dp(17.5f));
                    path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    iDp = AndroidUtilities.dp(8.33f);
                }
            } else {
                f6 = width;
            }
            this.pathWidth = i3;
            this.pathParentWidth = i;
            this.pathWithDots = z2;
            this.pathWithCenter = z;
        }
        canvas.save();
        float f11 = f / f5;
        canvas.translate(f11, f2);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint themePaint = Theme.getThemePaint("paintChatActionBackground", resourcesProvider);
        int alpha = themePaint.getAlpha();
        themePaint.setAlpha((int) (alpha * f4 * f3));
        canvas.drawPath(path, themePaint);
        themePaint.setAlpha(alpha);
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            Paint themePaint2 = Theme.getThemePaint("paintChatActionBackgroundDarken", resourcesProvider);
            int alpha2 = themePaint2.getAlpha();
            themePaint2.setAlpha((int) (alpha2 * f4 * f3));
            canvas.drawPath(path, themePaint2);
            themePaint2.setAlpha(alpha2);
        }
        canvas.restore();
        float f12 = f11 + f8;
        float f13 = f12 + f6;
        this.clickBounds.set(f12 - AndroidUtilities.dp(4.0f), f2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f13, AndroidUtilities.dp(32.0f) + f2);
        if (z) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setBounds((int) (AndroidUtilities.dp(2.66f) + f12), (int) (AndroidUtilities.dp(6.5f) + f2), (int) (AndroidUtilities.dp(22.66f) + f12), (int) (AndroidUtilities.dp(26.5f) + f2));
                this.emojiImage.setAlpha((int) (255.0f * f4));
                this.emojiImage.draw(canvas);
            } else {
                ImageReceiver imageReceiver = this.image;
                imageReceiver.setImageCoords(AndroidUtilities.dp(2.66f) + f12, AndroidUtilities.dp(6.5f) + f2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                imageReceiver.setAlpha(f4);
                imageReceiver.draw(canvas);
            }
            int color = Theme.getColor(Theme.key_chat_serviceText, resourcesProvider);
            this.text.draw(f12 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f2, f4, color, canvas);
            canvas.save();
            canvas.translate(f13 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f2);
            Paint paint = this.arrowPaint;
            paint.setColor(Theme.multAlpha(0.75f * f4, color));
            paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
            canvas.drawPath(this.arrowPath, paint);
            canvas.restore();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent, boolean z) {
        boolean z2;
        Runnable runnable;
        if (this.text != null) {
            if (this.clickBounds.contains(motionEvent.getX(), motionEvent.getY() - (z ? this.cell.getPaddingTop() : 0))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        int action = motionEvent.getAction();
        ButtonBounce buttonBounce = this.bounce;
        if (action == 0) {
            buttonBounce.setPressed(z2);
        } else if (motionEvent.getAction() == 2) {
            if (buttonBounce.isPressed && !z2) {
                buttonBounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (buttonBounce.isPressed && (runnable = this.onClickListener) != null) {
                runnable.run();
            }
            buttonBounce.setPressed(false);
        } else if (motionEvent.getAction() == 3) {
            buttonBounce.setPressed(false);
        }
        return buttonBounce.isPressed;
    }

    public final void setOnClickListener(ChatMessageCell$$ExternalSyntheticLambda7 chatMessageCell$$ExternalSyntheticLambda7) {
        this.onClickListener = chatMessageCell$$ExternalSyntheticLambda7;
    }

    public final boolean update(MessageObject messageObject) {
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        View view = this.cell;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(view);
            this.emojiImage = null;
        }
        this.pathWidth = 0;
        this.topicId = 0L;
        if (messageObject == null) {
            this.text = null;
            this.topicId = 0L;
        } else {
            int i = this.currentAccount;
            boolean zIsMonoForum = ChatObject.isMonoForum(MessagesController.getInstance(i).getChat(Long.valueOf(-messageObject.getDialogId())));
            ImageReceiver imageReceiver = this.image;
            if (zIsMonoForum) {
                imageReceiver.setRoundRadius(AndroidUtilities.dp(10.0f));
                long monoForumTopicId = messageObject.getMonoForumTopicId();
                TLObject userOrChat = MessagesController.getInstance(i).getUserOrChat(monoForumTopicId);
                this.topicId = monoForumTopicId;
                if (userOrChat == null) {
                    this.text = null;
                    return false;
                }
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                avatarDrawable.setInfo(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
                this.text = new Text(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                imageReceiver.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                this.topicId = topicId;
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(i).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (tL_forumTopicFindTopic == null) {
                    this.text = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver.setImageBitmap(ForumUtilities.createGeneralTopicDrawable(view.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false));
                } else if (tL_forumTopicFindTopic.icon_emoji_id != 0) {
                    this.emojiImage = new AnimatedEmojiDrawable(0, i, tL_forumTopicFindTopic.icon_emoji_id);
                    imageReceiver.onDetachedFromWindow();
                    this.emojiImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                } else {
                    imageReceiver.setImageBitmap(ForumUtilities.createTopicDrawable(tL_forumTopicFindTopic));
                }
                this.text = new Text(tL_forumTopicFindTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        return this.text != null;
    }
}
