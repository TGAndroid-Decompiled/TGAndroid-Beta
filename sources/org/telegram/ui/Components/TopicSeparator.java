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
import org.telegram.ui.Components.Forum.ForumUtilities;

public class TopicSeparator {
    private final Paint arrowPaint;
    private final Path arrowPath;
    private final ButtonBounce bounce;
    private final View cell;
    private final RectF clickBounds;
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
    public long topicId;
    private final boolean withDots;
    public final AvatarDrawable avatarDrawable = new AvatarDrawable();
    private final Path path = new Path();

    public static class Cell extends View {
        private int backgroundHeight;
        private Utilities.Callback<Long> onClickListener;
        private Theme.ResourcesProvider resourceProvider;
        public final TopicSeparator separator;

        public Cell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourceProvider = resourcesProvider;
            TopicSeparator topicSeparator = new TopicSeparator(i, this, resourcesProvider, false);
            this.separator = topicSeparator;
            topicSeparator.setOnClickListener(new Tooltip$$ExternalSyntheticLambda0(this, 24));
        }

        public void lambda$new$0() {
            Utilities.Callback<Long> callback = this.onClickListener;
            if (callback != null) {
                callback.run(Long.valueOf(this.separator.topicId));
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, 0.0f);
            } else {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, getMeasuredWidth(), this.backgroundHeight, 0.0f, 0.0f);
            }
            this.separator.draw(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.separator.attach();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.separator.detach();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(33.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.separator.onTouchEvent(motionEvent, false) || super.onTouchEvent(motionEvent);
        }

        public void set(MessageObject messageObject) {
            this.separator.update(messageObject);
            if (isAttachedToWindow()) {
                this.separator.attach();
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
        this.bounce = new ButtonBounce(view);
        this.image = new ImageReceiver(view);
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(1.75f), -AndroidUtilities.dp(4.0f));
        path.lineTo(AndroidUtilities.dp(1.75f), 0.0f);
        path.lineTo(-AndroidUtilities.dp(1.75f), AndroidUtilities.dp(4.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
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
        Text text = this.text;
        if (text == null) {
            return;
        }
        text.ellipsize(i - AndroidUtilities.dp(144.66f));
        float width = this.text.getWidth() + AndroidUtilities.dp(48.66f);
        float f6 = i;
        float f7 = (f6 - width) / 2.0f;
        int i2 = (int) width;
        if (this.pathWidth == i2 && this.pathParentWidth == i && this.pathWithCenter == z && this.pathWithDots == this.withDots) {
            f5 = 2.0f;
        } else {
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f7, AndroidUtilities.dp(4.5f), f7 + width, AndroidUtilities.dp(28.5f));
            if (z) {
                this.path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            }
            if (this.withDots) {
                float f8 = f6 / 2.0f;
                float fDp = f8 - AndroidUtilities.dp(1.833f);
                while (fDp > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp - AndroidUtilities.dp(3.66f), AndroidUtilities.dp(15.5f), fDp, AndroidUtilities.dp(17.5f));
                    this.path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    fDp -= AndroidUtilities.dp(8.33f);
                    f6 = f6;
                }
                float f9 = f6;
                f5 = 2.0f;
                int iDp = AndroidUtilities.dp(1.833f);
                while (true) {
                    f8 += iDp;
                    if (f8 >= f9) {
                        break;
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(f8, AndroidUtilities.dp(15.5f), AndroidUtilities.dp(3.66f) + f8, AndroidUtilities.dp(17.5f));
                    this.path.addRoundRect(rectF3, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                    iDp = AndroidUtilities.dp(8.33f);
                }
            } else {
                f5 = 2.0f;
            }
            this.pathWidth = i2;
            this.pathParentWidth = i;
            this.pathWithDots = this.withDots;
            this.pathWithCenter = z;
        }
        canvas.save();
        float f10 = f / f5;
        canvas.translate(f10, f2);
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
        float f11 = f10 + f7;
        float f12 = f11 + width;
        this.clickBounds.set(f11 - AndroidUtilities.dp(4.0f), f2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f12, AndroidUtilities.dp(32.0f) + f2);
        if (z) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setBounds((int) (AndroidUtilities.dp(2.66f) + f11), (int) (AndroidUtilities.dp(6.5f) + f2), (int) (AndroidUtilities.dp(22.66f) + f11), (int) (AndroidUtilities.dp(26.5f) + f2));
                this.emojiImage.setAlpha((int) (255.0f * f4));
                this.emojiImage.draw(canvas);
            } else {
                this.image.setImageCoords(AndroidUtilities.dp(2.66f) + f11, AndroidUtilities.dp(6.5f) + f2, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.image.setAlpha(f4);
                this.image.draw(canvas);
            }
            int color = Theme.getColor(Theme.key_chat_serviceText, this.resourcesProvider);
            this.text.draw(canvas, f11 + AndroidUtilities.dp(27.66f), AndroidUtilities.dp(16.5f) + f2, color, f4);
            canvas.save();
            canvas.translate(f12 - AndroidUtilities.dp(11.25f), AndroidUtilities.dp(16.5f) + f2);
            this.arrowPaint.setColor(Theme.multAlpha(0.75f * f4, color));
            this.arrowPaint.setStrokeWidth(AndroidUtilities.dp(1.66f));
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            canvas.restore();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent, boolean z) {
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
        if (motionEvent.getAction() == 0) {
            this.bounce.setPressed(z2);
        } else if (motionEvent.getAction() == 2) {
            if (this.bounce.isPressed() && !z2) {
                this.bounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.bounce.isPressed() && (runnable = this.onClickListener) != null) {
                runnable.run();
            }
            this.bounce.setPressed(false);
        } else if (motionEvent.getAction() == 3) {
            this.bounce.setPressed(false);
        }
        return this.bounce.isPressed();
    }

    public void setOnClickListener(Runnable runnable) {
        this.onClickListener = runnable;
    }

    public void setText(String str) {
        this.text = new Text(str, 14.0f, AndroidUtilities.bold());
    }

    public boolean update(MessageObject messageObject) {
        AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiImage;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this.cell);
            this.emojiImage = null;
        }
        this.pathWidth = 0;
        this.topicId = 0L;
        if (messageObject == null) {
            this.text = null;
            this.topicId = 0L;
        } else if (ChatObject.isMonoForum(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject.getDialogId())))) {
            this.image.setRoundRadius(AndroidUtilities.dp(10.0f));
            long monoForumTopicId = messageObject.getMonoForumTopicId();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(monoForumTopicId);
            this.topicId = monoForumTopicId;
            if (userOrChat == null) {
                this.text = null;
                return false;
            }
            this.avatarDrawable.setInfo(userOrChat);
            this.image.setForUserOrChat(userOrChat, this.avatarDrawable);
            this.text = new Text(DialogObject.getName(userOrChat), 14.0f, AndroidUtilities.bold());
        } else {
            this.image.setRoundRadius(0);
            long topicId = messageObject.getTopicId();
            this.topicId = topicId;
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), topicId);
            if (tL_forumTopicFindTopic == null) {
                this.text = null;
                return false;
            }
            if (topicId == 1) {
                this.image.setImageBitmap(ForumUtilities.createGeneralTopicDrawable(this.cell.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, this.resourcesProvider), false));
            } else if (tL_forumTopicFindTopic.icon_emoji_id != 0) {
                this.emojiImage = new AnimatedEmojiDrawable(0, this.currentAccount, tL_forumTopicFindTopic.icon_emoji_id);
                this.image.onDetachedFromWindow();
                this.emojiImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            } else {
                this.image.setImageBitmap(ForumUtilities.createTopicDrawable(tL_forumTopicFindTopic));
            }
            this.text = new Text(tL_forumTopicFindTopic.title, 14.0f, AndroidUtilities.bold());
        }
        return this.text != null;
    }
}
