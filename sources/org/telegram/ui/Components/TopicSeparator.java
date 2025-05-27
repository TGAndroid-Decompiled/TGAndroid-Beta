package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Forum.ForumUtilities;

public class TopicSeparator {
    private final ButtonBounce bounce;
    private final View cell;
    private final int currentAccount;
    public AnimatedEmojiDrawable emojiImage;
    public final ImageReceiver image;
    private Runnable onClickListener;
    private int pathParentWidth;
    private int pathWidth;
    private boolean pathWithCenter;
    private boolean pathWithDots;
    private final Theme.ResourcesProvider resourcesProvider;
    public Text text;
    private final boolean withDots;
    public final AvatarDrawable avatarDrawable = new AvatarDrawable();
    private final Path path = new Path();
    private final RectF clickBounds = new RectF();

    public static class Cell extends View {
        private final TopicSeparator separator;

        public Cell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.separator = new TopicSeparator(i, this, resourcesProvider, false);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.separator.draw(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.separator.attach();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.separator.detach();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
        }

        public void set(MessageObject messageObject) {
            this.separator.update(messageObject);
            if (isAttachedToWindow()) {
                this.separator.attach();
            }
        }
    }

    public TopicSeparator(int i, View view, Theme.ResourcesProvider resourcesProvider, boolean z) {
        this.currentAccount = i;
        this.cell = view;
        this.resourcesProvider = resourcesProvider;
        this.withDots = z;
        this.bounce = new ButtonBounce(view);
        this.image = new ImageReceiver(view);
    }

    public void attach() {
        this.image.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this.cell);
        }
    }

    public void detach() {
        this.image.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this.cell);
        }
    }

    public void draw(Canvas canvas, int i, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        if (this.text == null) {
            return;
        }
        float dp = AndroidUtilities.dp(37.0f) + this.text.getWidth();
        float f6 = i;
        float f7 = (f6 - dp) / 2.0f;
        int i2 = (int) dp;
        if (this.pathWidth == i2 && this.pathParentWidth == i && this.pathWithCenter == z && this.pathWithDots == this.withDots) {
            f5 = dp;
        } else {
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f7, AndroidUtilities.dp(4.5f), f7 + dp, AndroidUtilities.dp(28.5f));
            if (z) {
                this.path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (this.withDots) {
                float f8 = f6 / 2.0f;
                float dp2 = f8 - AndroidUtilities.dp(1.833f);
                while (dp2 > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp2 - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), dp2, AndroidUtilities.dp(17.5f));
                    this.path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    dp2 -= AndroidUtilities.dp(8.33f);
                    dp = dp;
                }
                f5 = dp;
                for (float dp3 = f8 + AndroidUtilities.dp(1.833f); dp3 < f6; dp3 += AndroidUtilities.dp(8.33f)) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(dp3, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + dp3, AndroidUtilities.dp(17.5f));
                    this.path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                }
            } else {
                f5 = dp;
            }
            this.pathWidth = i2;
            this.pathParentWidth = i;
            this.pathWithDots = this.withDots;
            this.pathWithCenter = z;
        }
        canvas.save();
        float f9 = f / 2.0f;
        canvas.translate(f9, f2);
        Paint themePaint = Theme.getThemePaint("paintChatActionBackground", this.resourcesProvider);
        int alpha = themePaint.getAlpha();
        themePaint.setAlpha((int) (alpha * f4 * f3));
        canvas.drawPath(this.path, themePaint);
        themePaint.setAlpha(alpha);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
            Paint themePaint2 = Theme.getThemePaint("paintChatActionBackgroundDarken", this.resourcesProvider);
            int alpha2 = themePaint2.getAlpha();
            themePaint2.setAlpha((int) (alpha2 * f4 * f3));
            canvas.drawPath(this.path, themePaint2);
            themePaint2.setAlpha(alpha2);
        }
        canvas.restore();
        this.clickBounds.set(f7 - AndroidUtilities.dp(4.0f), f2 - AndroidUtilities.dp(4.0f), f7 + f5 + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(32.0f) + f2);
        if (z) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
            if (animatedEmojiDrawable != null) {
                float f10 = f9 + f7;
                animatedEmojiDrawable.setBounds((int) (AndroidUtilities.dp(2.66f) + f10), (int) (AndroidUtilities.dp(6.5f) + f2), (int) (f10 + AndroidUtilities.dp(22.66f)), (int) (AndroidUtilities.dp(26.5f) + f2));
                this.emojiImage.setAlpha((int) (255.0f * f4));
                this.emojiImage.draw(canvas);
            } else {
                this.image.setImageCoords(f9 + f7 + AndroidUtilities.dp(2.66f), AndroidUtilities.dp(6.5f) + f2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.image.setAlpha(f4);
                this.image.draw(canvas);
            }
            this.text.draw(canvas, AndroidUtilities.dp(27.66f) + f9 + f7, f2 + AndroidUtilities.dp(16.5f), Theme.getColor(Theme.key_chat_serviceText, this.resourcesProvider), f4);
        }
    }

    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.TopicSeparator.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnClickListener(Runnable runnable) {
        this.onClickListener = runnable;
    }

    public boolean update(MessageObject messageObject) {
        ImageReceiver imageReceiver;
        Drawable createTopicDrawable;
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        Text text = null;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this.cell);
            this.emojiImage = null;
        }
        this.pathWidth = 0;
        if (messageObject != null) {
            if (ChatObject.isMonoForum(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject.getDialogId())))) {
                this.image.setRoundRadius(AndroidUtilities.dp(10.0f));
                TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getMonoForumTopicId());
                if (userOrChat == null) {
                    this.text = null;
                    return false;
                }
                this.avatarDrawable.setInfo(userOrChat);
                this.image.setForUserOrChat(userOrChat, this.avatarDrawable);
                text = new Text(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
            } else {
                this.image.setRoundRadius(0);
                long topicId = messageObject.getTopicId();
                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
                if (findTopic == null) {
                    this.text = null;
                    return false;
                }
                if (topicId == 1) {
                    imageReceiver = this.image;
                    createTopicDrawable = ForumUtilities.createGeneralTopicDrawable(this.cell.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false, false);
                } else if (findTopic.icon_emoji_id != 0) {
                    this.emojiImage = new AnimatedEmojiDrawable(0, this.currentAccount, findTopic.icon_emoji_id);
                    this.image.onDetachedFromWindow();
                    this.emojiImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    text = new Text(findTopic.title, 14.0f, AndroidUtilities.bold());
                } else {
                    imageReceiver = this.image;
                    createTopicDrawable = ForumUtilities.createTopicDrawable(findTopic, false);
                }
                imageReceiver.setImageBitmap(createTopicDrawable);
                text = new Text(findTopic.title, 14.0f, AndroidUtilities.bold());
            }
        }
        this.text = text;
        return this.text != null;
    }
}
