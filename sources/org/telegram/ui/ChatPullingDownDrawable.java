package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.StaticLayoutEx;

public class ChatPullingDownDrawable implements NotificationCenter.NotificationCenterDelegate {
    boolean animateCheck;
    public boolean animateSwipeToRelease;
    private AnimatedEmojiDrawable animatedEmojiDrawable;
    float bounceProgress;
    StaticLayout chatNameLayout;
    int chatNameWidth;
    float checkProgress;
    float circleRadius;
    private final int currentAccount;
    private final long currentDialog;
    public int dialogFilterId;
    public int dialogFolderId;
    boolean drawFolderBackground;
    boolean emptyStub;
    private final int filterId;
    private final int folderId;
    private final View fragmentView;
    private final ImageReceiver imageReceiver;
    private final boolean isTopic;
    long lastHapticTime;
    float lastProgress;
    public long lastShowingReleaseTime;
    int lastWidth;
    StaticLayout layout1;
    int layout1Width;
    StaticLayout layout2;
    int layout2Width;
    TLRPC$Chat nextChat;
    public long nextDialogId;
    TLRPC$TL_forumTopic nextTopic;
    Runnable onAnimationFinishRunnable;
    View parentView;
    float progressToBottomPanel;
    boolean recommendedChannel;
    private final Theme.ResourcesProvider resourcesProvider;
    boolean showBottomPanel;
    AnimatorSet showReleaseAnimator;
    float swipeToReleaseProgress;
    private final long topicId;
    Paint arrowPaint = new Paint(1);
    TextPaint textPaint = new TextPaint(1);
    TextPaint textPaint2 = new TextPaint(1);
    private Paint xRefPaint = new Paint(1);
    Path path = new Path();
    private long lastWidthTopicId = 0;
    private boolean visibleCounterDrawable = true;
    CounterView.CounterDrawable counterDrawable = new CounterView.CounterDrawable(null, true, null);
    int[] params = new int[3];

    public ChatPullingDownDrawable(int i, View view, long j, int i2, int i3, long j2, Theme.ResourcesProvider resourcesProvider) {
        this.fragmentView = view;
        this.currentAccount = i;
        this.currentDialog = j;
        this.folderId = i2;
        this.filterId = i3;
        this.topicId = j2;
        this.isTopic = MessagesController.getInstance(i).isForum(j);
        this.resourcesProvider = resourcesProvider;
        this.imageReceiver = new ImageReceiver(view);
        this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
        CounterView.CounterDrawable counterDrawable = this.counterDrawable;
        counterDrawable.gravity = 3;
        counterDrawable.setType(1);
        CounterView.CounterDrawable counterDrawable2 = this.counterDrawable;
        counterDrawable2.addServiceGradient = true;
        counterDrawable2.circlePaint = getThemedPaint("paintChatActionBackground");
        CounterView.CounterDrawable counterDrawable3 = this.counterDrawable;
        TextPaint textPaint = this.textPaint;
        counterDrawable3.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        this.xRefPaint.setColor(-16777216);
        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void updateDialog(TLRPC$Chat tLRPC$Chat) {
        if (tLRPC$Chat == null) {
            updateDialog();
            return;
        }
        this.nextDialogId = -tLRPC$Chat.id;
        int[] iArr = this.params;
        this.drawFolderBackground = iArr[0] == 1;
        this.dialogFolderId = iArr[1];
        this.dialogFilterId = iArr[2];
        this.emptyStub = false;
        this.nextChat = tLRPC$Chat;
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(this.currentAccount, this.nextChat);
        this.imageReceiver.setImage(ImageLocation.getForChat(this.nextChat, 1), "50_50", avatarDrawable, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(-tLRPC$Chat.id, 0, null);
        TLRPC$Dialog dialog = MessagesController.getInstance(this.currentAccount).getDialog(-tLRPC$Chat.id);
        int i = dialog == null ? 0 : dialog.unread_count;
        this.counterDrawable.setCount(i, false);
        this.visibleCounterDrawable = i > 0;
        this.recommendedChannel = true;
        this.nextTopic = null;
    }

    public void updateDialog() {
        this.recommendedChannel = false;
        this.nextTopic = null;
        TLRPC$Dialog nextUnreadDialog = getNextUnreadDialog(this.currentDialog, this.folderId, this.filterId, true, this.params);
        if (nextUnreadDialog != null) {
            this.nextDialogId = nextUnreadDialog.id;
            int[] iArr = this.params;
            this.drawFolderBackground = iArr[0] == 1;
            this.dialogFolderId = iArr[1];
            this.dialogFilterId = iArr[2];
            this.emptyStub = false;
            TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-nextUnreadDialog.id));
            this.nextChat = chat;
            if (chat == null) {
                this.nextChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(nextUnreadDialog.id));
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(this.currentAccount, this.nextChat);
            this.imageReceiver.setImage(ImageLocation.getForChat(this.nextChat, 1), "50_50", avatarDrawable, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(nextUnreadDialog.id, 0, null);
            int i = nextUnreadDialog.unread_count;
            this.counterDrawable.setCount(i, false);
            this.visibleCounterDrawable = i > 0;
            return;
        }
        this.nextChat = null;
        this.drawFolderBackground = false;
        this.emptyStub = true;
    }

    public void updateTopic() {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        View view;
        View view2;
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        this.recommendedChannel = false;
        this.drawFolderBackground = false;
        this.nextChat = null;
        this.nextDialogId = 0L;
        this.imageReceiver.clearImage();
        TLRPC$TL_forumTopic nextUnreadTopic = getNextUnreadTopic(-this.currentDialog);
        if (nextUnreadTopic != null) {
            this.emptyStub = false;
            this.nextTopic = nextUnreadTopic;
            if (nextUnreadTopic.id == 1) {
                View view3 = this.parentView;
                if (view3 != null && (animatedEmojiDrawable2 = this.animatedEmojiDrawable) != null) {
                    animatedEmojiDrawable2.removeView(view3);
                }
                this.animatedEmojiDrawable = null;
                this.imageReceiver.setImageBitmap(ForumUtilities.createGeneralTopicDrawable(this.fragmentView.getContext(), 1.0f, getThemedColor(Theme.key_chat_inMenu), false, true));
            } else if (nextUnreadTopic.icon_emoji_id != 0) {
                AnimatedEmojiDrawable animatedEmojiDrawable3 = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable3 == null || animatedEmojiDrawable3.getDocumentId() != nextUnreadTopic.icon_emoji_id) {
                    AnimatedEmojiDrawable animatedEmojiDrawable4 = this.animatedEmojiDrawable;
                    if (animatedEmojiDrawable4 != null && (view = this.parentView) != null) {
                        animatedEmojiDrawable4.removeView(view);
                    }
                    AnimatedEmojiDrawable animatedEmojiDrawable5 = new AnimatedEmojiDrawable(22, this.currentAccount, nextUnreadTopic.icon_emoji_id);
                    this.animatedEmojiDrawable = animatedEmojiDrawable5;
                    animatedEmojiDrawable5.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_serviceText), PorterDuff.Mode.SRC_IN));
                }
                AnimatedEmojiDrawable animatedEmojiDrawable6 = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable6 != null && (view2 = this.parentView) != null) {
                    animatedEmojiDrawable6.addView(view2);
                }
                this.imageReceiver.setImageBitmap((Bitmap) null);
            } else {
                View view4 = this.parentView;
                if (view4 != null && (animatedEmojiDrawable = this.animatedEmojiDrawable) != null) {
                    animatedEmojiDrawable.removeView(view4);
                }
                this.animatedEmojiDrawable = null;
                this.imageReceiver.setImageBitmap(ForumUtilities.createTopicDrawable(nextUnreadTopic, false));
            }
            int i = nextUnreadTopic.unread_count;
            this.counterDrawable.setCount(i, false);
            this.visibleCounterDrawable = i > 0;
            return;
        }
        this.nextTopic = null;
        this.emptyStub = true;
    }

    public void setWidth(int i) {
        String string;
        String string2;
        String string3;
        int i2;
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
        if (i == this.lastWidth && (!this.isTopic || (tLRPC$TL_forumTopic = this.nextTopic) == null || this.lastWidthTopicId == tLRPC$TL_forumTopic.id)) {
            return;
        }
        this.circleRadius = AndroidUtilities.dp(56.0f) / 2.0f;
        this.lastWidth = i;
        TLRPC$Chat tLRPC$Chat = this.nextChat;
        if (tLRPC$Chat != null) {
            string = tLRPC$Chat.title;
        } else {
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = this.nextTopic;
            if (tLRPC$TL_forumTopic2 != null) {
                string = tLRPC$TL_forumTopic2.title;
            } else if (this.isTopic) {
                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.currentDialog)).title);
            } else {
                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
            }
        }
        String str = string;
        int measureText = (int) this.textPaint.measureText((CharSequence) str, 0, str.length());
        this.chatNameWidth = measureText;
        int min = Math.min(measureText, this.lastWidth - AndroidUtilities.dp(60.0f));
        this.chatNameWidth = min;
        this.chatNameLayout = StaticLayoutEx.createStaticLayout(str, this.textPaint, min, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, min, 1);
        if (this.recommendedChannel) {
            string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
            string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
        } else if (this.isTopic) {
            string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
            string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
        } else {
            boolean z = this.drawFolderBackground;
            if (z && (i2 = this.dialogFolderId) != this.folderId && i2 != 0) {
                string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
            } else if (z) {
                string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
            } else {
                string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
            }
        }
        String str2 = string2;
        int measureText2 = (int) this.textPaint2.measureText(str2);
        this.layout1Width = measureText2;
        this.layout1Width = Math.min(measureText2, this.lastWidth - AndroidUtilities.dp(60.0f));
        TextPaint textPaint = this.textPaint2;
        int i3 = this.layout1Width;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.layout1 = new StaticLayout(str2, textPaint, i3, alignment, 1.0f, 0.0f, false);
        int measureText3 = (int) this.textPaint2.measureText(string3);
        this.layout2Width = measureText3;
        this.layout2Width = Math.min(measureText3, this.lastWidth - AndroidUtilities.dp(60.0f));
        this.layout2 = new StaticLayout(string3, this.textPaint2, this.layout2Width, alignment, 1.0f, 0.0f, false);
        this.imageReceiver.setImageCoords((this.lastWidth / 2.0f) - (AndroidUtilities.dp(40.0f) / 2.0f), (AndroidUtilities.dp(12.0f) + this.circleRadius) - (AndroidUtilities.dp(40.0f) / 2.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / 2.0f));
        this.counterDrawable.setSize(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
        if (this.isTopic) {
            this.lastWidthTopicId = this.nextTopic == null ? 0L : r14.id;
        }
    }

    public void draw(Canvas canvas, View view, float f, float f2) {
        int i;
        int i2;
        int i3;
        float f3;
        float f4;
        float f5;
        ImageReceiver imageReceiver;
        float f6;
        if (this.parentView != view) {
            this.parentView = view;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(view);
            }
        }
        this.counterDrawable.setParent(view);
        float dp = AndroidUtilities.dp(110.0f) * f;
        if (dp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f7 = f < 0.2f ? 5.0f * f * f2 : f2;
        Theme.applyServiceShaderMatrix(this.lastWidth, view.getMeasuredHeight(), 0.0f, view.getMeasuredHeight() - dp);
        TextPaint textPaint = this.textPaint;
        int i4 = Theme.key_chat_serviceText;
        textPaint.setColor(getThemedColor(i4));
        this.arrowPaint.setColor(getThemedColor(i4));
        this.textPaint2.setColor(getThemedColor(Theme.key_chat_messagePanelHint));
        int alpha = getThemedPaint("paintChatActionBackground").getAlpha();
        int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
        int alpha3 = this.textPaint.getAlpha();
        int alpha4 = this.arrowPaint.getAlpha();
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f7));
        int i5 = (int) (alpha * f7);
        getThemedPaint("paintChatActionBackground").setAlpha(i5);
        int i6 = (int) (alpha3 * f7);
        this.textPaint.setAlpha(i6);
        float f8 = 1.0f;
        if ((f < 1.0f || this.lastProgress >= 1.0f) && (f >= 1.0f || this.lastProgress != 1.0f)) {
            i = i5;
            i2 = alpha;
        } else {
            i2 = alpha;
            long currentTimeMillis = System.currentTimeMillis();
            i = i5;
            if (currentTimeMillis - this.lastHapticTime > 100) {
                view.performHapticFeedback(3, 2);
                this.lastHapticTime = currentTimeMillis;
            }
            this.lastProgress = f;
            f8 = 1.0f;
        }
        if (f == f8 && !this.animateSwipeToRelease) {
            this.animateSwipeToRelease = true;
            this.animateCheck = true;
            showReleaseState(true, view);
            this.lastShowingReleaseTime = System.currentTimeMillis();
        } else if (f != 1.0f && this.animateSwipeToRelease) {
            this.animateSwipeToRelease = false;
            showReleaseState(false, view);
        }
        float f9 = this.lastWidth / 2.0f;
        float f10 = this.bounceProgress * (-AndroidUtilities.dp(4.0f));
        if (this.emptyStub) {
            dp -= f10;
        }
        float f11 = dp / 2.0f;
        float max = Math.max(0.0f, Math.min(this.circleRadius, (f11 - (AndroidUtilities.dp(16.0f) * f)) - AndroidUtilities.dp(4.0f)));
        float max2 = ((Math.max(0.0f, Math.min(this.circleRadius * f, f11 - (AndroidUtilities.dp(8.0f) * f))) * 2.0f) - AndroidUtilities.dp2(16.0f)) * (1.0f - this.swipeToReleaseProgress);
        float dp2 = AndroidUtilities.dp(56.0f);
        float f12 = this.swipeToReleaseProgress;
        float f13 = max2 + (dp2 * f12);
        if (f12 < 1.0f || this.emptyStub) {
            float f14 = -dp;
            i3 = alpha2;
            f3 = f7;
            float dp3 = ((-AndroidUtilities.dp(8.0f)) * (1.0f - this.swipeToReleaseProgress)) + ((AndroidUtilities.dp(56.0f) + f14) * this.swipeToReleaseProgress);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f9 - max, f14, max + f9, dp3);
            if (this.swipeToReleaseProgress <= 0.0f || this.emptyStub) {
                f4 = 1.0f;
            } else {
                float dp4 = AndroidUtilities.dp(16.0f) * this.swipeToReleaseProgress;
                rectF.inset(dp4, dp4);
                f4 = 1.0f - this.swipeToReleaseProgress;
            }
            drawBackground(canvas, rectF, f4);
            float dp5 = ((AndroidUtilities.dp(24.0f) + f14) + (AndroidUtilities.dp(8.0f) * (1.0f - f))) - (AndroidUtilities.dp(36.0f) * this.swipeToReleaseProgress);
            canvas.save();
            f5 = dp;
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas.clipRect(rectF);
            float f15 = this.swipeToReleaseProgress;
            if (f15 > 0.0f) {
                this.arrowPaint.setAlpha((int) ((1.0f - f15) * 255.0f));
            }
            drawArrow(canvas, f9, dp5, AndroidUtilities.dp(24.0f) * f);
            if (this.emptyStub) {
                float dp22 = ((((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - f13) * (1.0f - this.swipeToReleaseProgress)) + ((f14 - AndroidUtilities.dp(2.0f)) * this.swipeToReleaseProgress) + f10;
                this.arrowPaint.setAlpha(alpha4);
                canvas.save();
                canvas.scale(f, f, f9, AndroidUtilities.dp(28.0f) + dp22);
                drawCheck(canvas, f9, dp22 + AndroidUtilities.dp(28.0f));
                canvas.restore();
            }
            canvas.restore();
        } else {
            f5 = dp;
            f3 = f7;
            i3 = alpha2;
        }
        if (this.chatNameLayout != null && this.swipeToReleaseProgress > 0.0f) {
            getThemedPaint("paintChatActionBackground").setAlpha(i);
            this.textPaint.setAlpha(i6);
            float dp6 = ((AndroidUtilities.dp(20.0f) * (1.0f - this.swipeToReleaseProgress)) - (AndroidUtilities.dp(36.0f) * this.swipeToReleaseProgress)) + f10;
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f16 = (r5 - this.chatNameWidth) / 2.0f;
            rectF2.set(f16, dp6, this.lastWidth - f16, this.chatNameLayout.getHeight() + dp6);
            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas.save();
            canvas.translate((this.lastWidth - this.chatNameWidth) / 2.0f, dp6);
            this.chatNameLayout.draw(canvas);
            canvas.restore();
        }
        if (!this.emptyStub && f13 > 0.0f) {
            float dp23 = ((((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - f13) * (1.0f - this.swipeToReleaseProgress)) + (((-f5) + AndroidUtilities.dp(4.0f)) * this.swipeToReleaseProgress) + f10;
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 != null && animatedEmojiDrawable2.getImageReceiver() != null) {
                imageReceiver = this.animatedEmojiDrawable.getImageReceiver();
            } else {
                imageReceiver = this.imageReceiver;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f3);
            float f17 = f13 / 2.0f;
            imageReceiver2.setRoundRadius((int) f17);
            imageReceiver2.setImageCoords(f9 - f17, dp23, f13, f13);
            if (this.isTopic && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof CombinedDrawable) && (((CombinedDrawable) imageReceiver2.getDrawable()).getIcon() instanceof LetterDrawable)) {
                ((LetterDrawable) ((CombinedDrawable) imageReceiver2.getDrawable()).getIcon()).scale = f;
            }
            if (this.swipeToReleaseProgress > 0.0f && this.visibleCounterDrawable) {
                f6 = 1.0f;
                canvas.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageWidth() + imageReceiver2.getImageX(), imageReceiver2.getImageHeight() + imageReceiver2.getImageY(), 255, 31);
                imageReceiver2.draw(canvas);
                float f18 = this.swipeToReleaseProgress;
                canvas.scale(f18, f18, AndroidUtilities.dp(12.0f) + f9 + this.counterDrawable.getCenterX(), (dp23 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas.translate(AndroidUtilities.dp(12.0f) + f9, dp23 - AndroidUtilities.dp(6.0f));
                this.counterDrawable.updateBackgroundRect();
                this.counterDrawable.rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                RectF rectF3 = this.counterDrawable.rectF;
                canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, this.counterDrawable.rectF.height() / 2.0f, this.xRefPaint);
                canvas.restore();
                canvas.save();
                float f19 = this.swipeToReleaseProgress;
                canvas.scale(f19, f19, AndroidUtilities.dp(12.0f) + f9 + this.counterDrawable.getCenterX(), (dp23 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas.translate(f9 + AndroidUtilities.dp(12.0f), dp23 - AndroidUtilities.dp(6.0f));
                this.counterDrawable.draw(canvas);
                canvas.restore();
            } else {
                f6 = 1.0f;
                imageReceiver2.draw(canvas);
            }
            imageReceiver2.setAlpha(f6);
        }
        getThemedPaint("paintChatActionBackground").setAlpha(i2);
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(i3);
        this.textPaint.setAlpha(alpha3);
        this.arrowPaint.setAlpha(alpha4);
    }

    private void drawCheck(Canvas canvas, float f, float f2) {
        if (this.animateCheck) {
            float f3 = this.checkProgress;
            if (f3 < 1.0f) {
                float f4 = f3 + 0.07272727f;
                this.checkProgress = f4;
                if (f4 > 1.0f) {
                    this.checkProgress = 1.0f;
                }
            }
            float f5 = this.checkProgress;
            float f6 = f5 > 0.5f ? 1.0f : f5 / 0.5f;
            float f7 = f5 < 0.5f ? 0.0f : (f5 - 0.5f) / 0.5f;
            canvas.save();
            canvas.clipRect(AndroidUtilities.rectTmp);
            canvas.translate(f - AndroidUtilities.dp(24.0f), f2 - AndroidUtilities.dp(24.0f));
            float dp = AndroidUtilities.dp(16.0f);
            float dp2 = AndroidUtilities.dp(26.0f);
            float dp3 = AndroidUtilities.dp(22.0f);
            float dp4 = AndroidUtilities.dp(32.0f);
            float dp5 = AndroidUtilities.dp(32.0f);
            float dp6 = AndroidUtilities.dp(20.0f);
            float f8 = 1.0f - f6;
            canvas.drawLine(dp, dp2, (dp * f8) + (dp3 * f6), (f8 * dp2) + (f6 * dp4), this.arrowPaint);
            if (f7 > 0.0f) {
                float f9 = 1.0f - f7;
                canvas.drawLine(dp3, dp4, (dp3 * f9) + (dp5 * f7), (f9 * dp4) + (dp6 * f7), this.arrowPaint);
            }
            canvas.restore();
        }
    }

    private void drawBackground(Canvas canvas, RectF rectF, float f) {
        if (this.drawFolderBackground) {
            this.path.reset();
            float width = rectF.width() * 0.2f;
            float width2 = rectF.width() * 0.1f;
            float width3 = rectF.width() * 0.03f;
            float f2 = width2 / 2.0f;
            float height = rectF.height() - width2;
            this.path.moveTo(rectF.right, rectF.top + width + width2);
            float f3 = -width;
            this.path.rQuadTo(0.0f, f3, f3, f3);
            float f4 = width * 2.0f;
            float f5 = f2 * 2.0f;
            this.path.rLineTo((((-(rectF.width() - f4)) / 2.0f) + f5) - width3, 0.0f);
            float f6 = -f2;
            float f7 = f6 / 2.0f;
            float f8 = f6 * 2.0f;
            float f9 = (-width2) / 2.0f;
            this.path.rQuadTo(f7, 0.0f, f8, f9);
            this.path.rQuadTo(f7, f9, f8, f9);
            this.path.rLineTo(((-(rectF.width() - f4)) / 2.0f) + f5 + width3, 0.0f);
            this.path.rQuadTo(f3, 0.0f, f3, width);
            this.path.rLineTo(0.0f, (width2 + height) - f4);
            this.path.rQuadTo(0.0f, width, width, width);
            this.path.rLineTo(rectF.width() - f4, 0.0f);
            this.path.rQuadTo(width, 0.0f, width, f3);
            this.path.rLineTo(0.0f, -(height - f4));
            this.path.close();
            canvas.drawPath(this.path, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawPath(this.path, Theme.chat_actionBackgroundGradientDarkenPaint);
                return;
            }
            return;
        }
        int alpha = getThemedPaint("paintChatActionBackground").getAlpha();
        getThemedPaint("paintChatActionBackground").setAlpha((int) (alpha * f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f10 = this.circleRadius;
        canvas.drawRoundRect(rectF2, f10, f10, getThemedPaint("paintChatActionBackground"));
        getThemedPaint("paintChatActionBackground").setAlpha(alpha);
        if (hasGradientService()) {
            int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f));
            float f11 = this.circleRadius;
            canvas.drawRoundRect(rectF2, f11, f11, Theme.chat_actionBackgroundGradientDarkenPaint);
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
        }
    }

    private void showReleaseState(boolean z, final View view) {
        AnimatorSet animatorSet = this.showReleaseAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.showReleaseAnimator.cancel();
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatPullingDownDrawable.this.lambda$showReleaseState$0(view, valueAnimator);
                }
            });
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            ofFloat.setDuration(250L);
            this.bounceProgress = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatPullingDownDrawable.this.lambda$showReleaseState$1(view, valueAnimator);
                }
            });
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
            ofFloat2.setInterpolator(cubicBezierInterpolator);
            ofFloat2.setDuration(180L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, -0.5f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatPullingDownDrawable.this.lambda$showReleaseState$2(view, valueAnimator);
                }
            });
            ofFloat3.setInterpolator(cubicBezierInterpolator);
            ofFloat3.setDuration(120L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-0.5f, 0.0f);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatPullingDownDrawable.this.lambda$showReleaseState$3(view, valueAnimator);
                }
            });
            ofFloat4.setInterpolator(cubicBezierInterpolator);
            ofFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.showReleaseAnimator = animatorSet2;
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ChatPullingDownDrawable chatPullingDownDrawable = ChatPullingDownDrawable.this;
                    chatPullingDownDrawable.bounceProgress = 0.0f;
                    chatPullingDownDrawable.swipeToReleaseProgress = 1.0f;
                    view.invalidate();
                    ChatPullingDownDrawable.this.fragmentView.invalidate();
                    Runnable runnable = ChatPullingDownDrawable.this.onAnimationFinishRunnable;
                    if (runnable != null) {
                        runnable.run();
                        ChatPullingDownDrawable.this.onAnimationFinishRunnable = null;
                    }
                }
            });
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(ofFloat2, ofFloat3, ofFloat4);
            this.showReleaseAnimator.playTogether(ofFloat, animatorSet3);
            this.showReleaseAnimator.start();
            return;
        }
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 0.0f);
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatPullingDownDrawable.this.lambda$showReleaseState$4(view, valueAnimator);
            }
        });
        ofFloat5.setInterpolator(CubicBezierInterpolator.DEFAULT);
        ofFloat5.setDuration(220L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showReleaseAnimator = animatorSet4;
        animatorSet4.playTogether(ofFloat5);
        this.showReleaseAnimator.start();
    }

    public void lambda$showReleaseState$0(View view, ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
        this.fragmentView.invalidate();
    }

    public void lambda$showReleaseState$1(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    public void lambda$showReleaseState$2(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    public void lambda$showReleaseState$3(View view, ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidate();
    }

    public void lambda$showReleaseState$4(View view, ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.fragmentView.invalidate();
        view.invalidate();
    }

    private void drawArrow(Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        float dpf2 = f3 / AndroidUtilities.dpf2(24.0f);
        canvas.scale(dpf2, dpf2, f, f2 - AndroidUtilities.dp(20.0f));
        canvas.translate(f - AndroidUtilities.dp2(12.0f), f2 - AndroidUtilities.dp(12.0f));
        canvas.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), this.arrowPaint);
        canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), this.arrowPaint);
        canvas.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), this.arrowPaint);
        canvas.restore();
    }

    public void onAttach() {
        View view;
        this.imageReceiver.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null && (view = this.parentView) != null) {
            animatedEmojiDrawable.addView(view);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
    }

    public void onDetach() {
        View view;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        this.imageReceiver.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
        if (animatedEmojiDrawable != null && (view = this.parentView) != null) {
            animatedEmojiDrawable.removeView(view);
        }
        this.lastProgress = 0.0f;
        this.lastHapticTime = 0L;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$Dialog tLRPC$Dialog;
        if (this.nextDialogId == 0 || (tLRPC$Dialog = MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.nextDialogId)) == null) {
            return;
        }
        int i3 = tLRPC$Dialog.unread_count;
        this.counterDrawable.setCount(i3, true);
        this.visibleCounterDrawable = i3 > 0;
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public static TLRPC$Dialog getNextUnreadDialog(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList<TLRPC$Dialog> dialogs;
        TLRPC$Dialog nextUnreadDialog;
        TLRPC$Dialog nextUnreadDialog2;
        MessagesController messagesController = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController();
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
            iArr[2] = i2;
        }
        if (i2 != 0) {
            MessagesController.DialogFilter dialogFilter = messagesController.dialogFiltersById.get(i2);
            if (dialogFilter == null) {
                return null;
            }
            dialogs = dialogFilter.dialogs;
        } else {
            dialogs = messagesController.getDialogs(i);
        }
        if (dialogs == null) {
            return null;
        }
        for (int i3 = 0; i3 < dialogs.size(); i3++) {
            TLRPC$Dialog tLRPC$Dialog = dialogs.get(i3);
            TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-tLRPC$Dialog.id));
            if (chat != null && tLRPC$Dialog.id != j && tLRPC$Dialog.unread_count > 0 && DialogObject.isChannel(tLRPC$Dialog) && !chat.megagroup && !messagesController.isPromoDialog(tLRPC$Dialog.id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                return tLRPC$Dialog;
            }
        }
        if (z) {
            if (i2 != 0) {
                for (int i4 = 0; i4 < messagesController.dialogFilters.size(); i4++) {
                    int i5 = messagesController.dialogFilters.get(i4).id;
                    if (i2 != i5 && (nextUnreadDialog2 = getNextUnreadDialog(j, i, i5, false, iArr)) != null) {
                        if (iArr != null) {
                            iArr[0] = 1;
                        }
                        return nextUnreadDialog2;
                    }
                }
            }
            for (int i6 = 0; i6 < messagesController.dialogsByFolder.size(); i6++) {
                int keyAt = messagesController.dialogsByFolder.keyAt(i6);
                if (i != keyAt && (nextUnreadDialog = getNextUnreadDialog(j, keyAt, 0, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return nextUnreadDialog;
                }
            }
        }
        return null;
    }

    private TLRPC$TL_forumTopic getNextUnreadTopic(long j) {
        TLRPC$Message tLRPC$Message;
        TLRPC$Message tLRPC$Message2;
        ArrayList<TLRPC$TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(j);
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic = null;
        if (topics != null && topics.size() > 1) {
            for (int i = 0; i < topics.size(); i++) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = topics.get(i);
                if (tLRPC$TL_forumTopic2.id != this.topicId && !tLRPC$TL_forumTopic2.hidden && tLRPC$TL_forumTopic2.unread_count > 0 && (tLRPC$TL_forumTopic == null || ((tLRPC$Message = tLRPC$TL_forumTopic2.topMessage) != null && (tLRPC$Message2 = tLRPC$TL_forumTopic.topMessage) != null && tLRPC$Message.date > tLRPC$Message2.date))) {
                    tLRPC$TL_forumTopic = tLRPC$TL_forumTopic2;
                }
            }
        }
        return tLRPC$TL_forumTopic;
    }

    public long getChatId() {
        return this.nextChat.id;
    }

    public TLRPC$TL_forumTopic getTopic() {
        return this.nextTopic;
    }

    public void drawBottomPanel(android.graphics.Canvas r17, int r18, int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatPullingDownDrawable.drawBottomPanel(android.graphics.Canvas, int, int, int):void");
    }

    public void showBottomPanel(boolean z) {
        this.showBottomPanel = z;
        this.fragmentView.invalidate();
    }

    public boolean needDrawBottomPanel() {
        return (this.showBottomPanel || this.progressToBottomPanel > 0.0f) && !this.emptyStub;
    }

    public boolean animationIsRunning() {
        return this.swipeToReleaseProgress != 1.0f;
    }

    public void runOnAnimationFinish(Runnable runnable) {
        AnimatorSet animatorSet = this.showReleaseAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.showReleaseAnimator.cancel();
        }
        this.onAnimationFinishRunnable = runnable;
        this.showReleaseAnimator = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatPullingDownDrawable.this.lambda$runOnAnimationFinish$5(valueAnimator);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.bounceProgress, 0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatPullingDownDrawable.this.lambda$runOnAnimationFinish$6(valueAnimator);
            }
        });
        this.showReleaseAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChatPullingDownDrawable chatPullingDownDrawable = ChatPullingDownDrawable.this;
                chatPullingDownDrawable.bounceProgress = 0.0f;
                chatPullingDownDrawable.swipeToReleaseProgress = 1.0f;
                View view = chatPullingDownDrawable.parentView;
                if (view != null) {
                    view.invalidate();
                }
                ChatPullingDownDrawable.this.fragmentView.invalidate();
                Runnable runnable2 = ChatPullingDownDrawable.this.onAnimationFinishRunnable;
                if (runnable2 != null) {
                    runnable2.run();
                    ChatPullingDownDrawable.this.onAnimationFinishRunnable = null;
                }
            }
        });
        this.showReleaseAnimator.playTogether(ofFloat, ofFloat2);
        this.showReleaseAnimator.setDuration(120L);
        this.showReleaseAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.showReleaseAnimator.start();
    }

    public void lambda$runOnAnimationFinish$5(ValueAnimator valueAnimator) {
        this.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.fragmentView.invalidate();
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$runOnAnimationFinish$6(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void reset() {
        this.checkProgress = 0.0f;
        this.animateCheck = false;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    private boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService();
    }
}
