package org.telegram.ui;

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
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LetterDrawable;

public final class ChatPullingDownDrawable implements NotificationCenter.NotificationCenterDelegate {
    public boolean animateCheck;
    public boolean animateSwipeToRelease;
    public AnimatedEmojiDrawable animatedEmojiDrawable;
    public final Paint arrowPaint;
    public float bounceProgress;
    public StaticLayout chatNameLayout;
    public int chatNameWidth;
    public float checkProgress;
    public float circleRadius;
    public final CounterView.CounterDrawable counterDrawable;
    public final int currentAccount;
    public final long currentDialog;
    public int dialogFilterId;
    public int dialogFolderId;
    public boolean drawFolderBackground;
    public boolean emptyStub;
    public final int filterId;
    public final int folderId;
    public final View fragmentView;
    public final ImageReceiver imageReceiver;
    public final boolean isTopic;
    public long lastHapticTime;
    public float lastProgress;
    public long lastShowingReleaseTime;
    public int lastWidth;
    public long lastWidthTopicId;
    public StaticLayout layout1;
    public int layout1Width;
    public StaticLayout layout2;
    public int layout2Width;
    public TLRPC.Chat nextChat;
    public long nextDialogId;
    public TLRPC.TL_forumTopic nextTopic;
    public ChatActivity$$ExternalSyntheticLambda174 onAnimationFinishRunnable;
    public final int[] params;
    public ChatActivity.AnonymousClass21 parentView;
    public final Path path;
    public float progressToBottomPanel;
    public boolean recommendedChannel;
    public final Theme.ResourcesProvider resourcesProvider;
    public AnimatorSet showReleaseAnimator;
    public float swipeToReleaseProgress;
    public final TextPaint textPaint;
    public final TextPaint textPaint2;
    public final long topicId;
    public boolean visibleCounterDrawable;
    public final Paint xRefPaint;

    public ChatPullingDownDrawable(int i, View view, long j, int i2, int i3, long j2, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint(1);
        this.arrowPaint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.textPaint2 = textPaint2;
        Paint paint2 = new Paint(1);
        this.xRefPaint = paint2;
        this.path = new Path();
        this.lastWidthTopicId = 0L;
        this.visibleCounterDrawable = true;
        CounterView.CounterDrawable counterDrawable = new CounterView.CounterDrawable(null, true, null);
        this.counterDrawable = counterDrawable;
        this.params = new int[3];
        this.fragmentView = view;
        this.currentAccount = i;
        this.currentDialog = j;
        this.folderId = i2;
        this.filterId = i3;
        this.topicId = j2;
        this.isTopic = MessagesController.getInstance(i).isForum(j);
        this.resourcesProvider = resourcesProvider;
        this.imageReceiver = new ImageReceiver(view);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        counterDrawable.gravity = 3;
        counterDrawable.type = 1;
        counterDrawable.addServiceGradient = true;
        counterDrawable.circlePaint = getThemedPaint$1("paintChatActionBackground");
        counterDrawable.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog getNextUnreadDialog(long j, int i, int i2, boolean z, int[] iArr) {
        ArrayList<TLRPC.Dialog> dialogs;
        TLRPC.Dialog nextUnreadDialog;
        long j2;
        int i3;
        int[] iArr2;
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
        for (int i4 = 0; i4 < dialogs.size(); i4++) {
            TLRPC.Dialog dialog = dialogs.get(i4);
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-dialog.id));
            if (chat != null && dialog.id != j && dialog.unread_count > 0 && DialogObject.isChannel(dialog) && !chat.megagroup && !messagesController.isPromoDialog(dialog.id, false) && messagesController.getRestrictionReason(chat.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z) {
            return null;
        }
        if (i2 != 0) {
            int i5 = 0;
            while (i5 < messagesController.dialogFilters.size()) {
                int i6 = messagesController.dialogFilters.get(i5).id;
                if (i2 != i6) {
                    long j3 = j;
                    int i7 = i;
                    int[] iArr3 = iArr;
                    TLRPC.Dialog nextUnreadDialog2 = getNextUnreadDialog(j3, i7, i6, false, iArr3);
                    j2 = j3;
                    i3 = i7;
                    iArr2 = iArr3;
                    if (nextUnreadDialog2 != null) {
                        if (iArr2 != null) {
                            iArr2[0] = 1;
                        }
                        return nextUnreadDialog2;
                    }
                } else {
                    j2 = j;
                    i3 = i;
                    iArr2 = iArr;
                }
                i5++;
                i = i3;
                j = j2;
                iArr = iArr2;
            }
        }
        long j4 = j;
        int i8 = i;
        int[] iArr4 = iArr;
        for (int i9 = 0; i9 < messagesController.dialogsByFolder.size(); i9++) {
            int iKeyAt = messagesController.dialogsByFolder.keyAt(i9);
            if (i8 != iKeyAt && (nextUnreadDialog = getNextUnreadDialog(j4, iKeyAt, 0, false, iArr4)) != null) {
                if (iArr4 != null) {
                    iArr4[0] = 1;
                }
                return nextUnreadDialog;
            }
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.nextDialogId == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.nextDialogId)) == null) {
            return;
        }
        int i3 = dialog.unread_count;
        this.counterDrawable.setCount(i3, true);
        this.visibleCounterDrawable = i3 > 0;
        ChatActivity.AnonymousClass21 anonymousClass21 = this.parentView;
        if (anonymousClass21 != null) {
            anonymousClass21.invalidate();
        }
    }

    public final void draw(Canvas canvas, ChatActivity.AnonymousClass21 anonymousClass21, float f, float f2) {
        float f3;
        float f4;
        float f5;
        CounterView.CounterDrawable counterDrawable;
        float f6;
        TextPaint textPaint;
        float f7;
        float f8;
        float f9;
        float f10;
        int i;
        int i2;
        TextPaint textPaint2;
        ImageReceiver imageReceiver;
        float f11;
        float f12;
        float fM;
        Canvas canvas2 = canvas;
        if (this.parentView != anonymousClass21) {
            this.parentView = anonymousClass21;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(anonymousClass21);
            }
        }
        CounterView.CounterDrawable counterDrawable2 = this.counterDrawable;
        counterDrawable2.parent = anonymousClass21;
        float fDp = AndroidUtilities.dp(110.0f) * f;
        if (fDp < AndroidUtilities.dp(8.0f)) {
            return;
        }
        float f13 = f < 0.2f ? 5.0f * f * f2 : f2;
        Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, this.lastWidth, anonymousClass21.getMeasuredHeight(), 0.0f, anonymousClass21.getMeasuredHeight() - fDp);
        TextPaint textPaint3 = this.textPaint;
        int i3 = Theme.key_chat_serviceText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        textPaint3.setColor(Theme.getColor(i3, resourcesProvider));
        Paint paint = this.arrowPaint;
        paint.setColor(Theme.getColor(i3, resourcesProvider));
        this.textPaint2.setColor(Theme.getColor(Theme.key_chat_messagePanelHint, resourcesProvider));
        int alpha = getThemedPaint$1("paintChatActionBackground").getAlpha();
        int alpha2 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
        int alpha3 = textPaint3.getAlpha();
        int alpha4 = paint.getAlpha();
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha2 * f13));
        int i4 = (int) (alpha * f13);
        getThemedPaint$1("paintChatActionBackground").setAlpha(i4);
        int i5 = (int) (alpha3 * f13);
        textPaint3.setAlpha(i5);
        if ((f >= 1.0f && this.lastProgress < 1.0f) || (f < 1.0f && this.lastProgress == 1.0f)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastHapticTime > 100) {
                try {
                    anonymousClass21.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.lastHapticTime = jCurrentTimeMillis;
            }
            this.lastProgress = f;
        }
        if (f == 1.0f && !this.animateSwipeToRelease) {
            this.animateSwipeToRelease = true;
            this.animateCheck = true;
            showReleaseState(true, anonymousClass21);
            this.lastShowingReleaseTime = System.currentTimeMillis();
        } else if (f != 1.0f && this.animateSwipeToRelease) {
            this.animateSwipeToRelease = false;
            showReleaseState(false, anonymousClass21);
        }
        float f14 = this.lastWidth / 2.0f;
        float f15 = this.bounceProgress * (-AndroidUtilities.dp(4.0f));
        float f16 = this.emptyStub ? fDp - f15 : fDp;
        float f17 = f16 / 2.0f;
        float fMax = Math.max(0.0f, Math.min(this.circleRadius, (f17 - (AndroidUtilities.dp(16.0f) * f)) - AndroidUtilities.dp(4.0f)));
        float fMax2 = (1.0f - this.swipeToReleaseProgress) * ((Math.max(0.0f, Math.min(this.circleRadius * f, f17 - (AndroidUtilities.dp(8.0f) * f))) * 2.0f) - AndroidUtilities.dp2(16.0f));
        float fDp2 = AndroidUtilities.dp(56.0f);
        float f18 = this.swipeToReleaseProgress;
        float f19 = (fDp2 * f18) + fMax2;
        if (f18 < 1.0f || this.emptyStub) {
            f3 = 36.0f;
            float f20 = -f16;
            float f21 = f16;
            float fDp3 = (this.swipeToReleaseProgress * (AndroidUtilities.dp(56.0f) + f20)) + ((1.0f - this.swipeToReleaseProgress) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f14 - fMax, f20, f14 + fMax, fDp3);
            if (this.swipeToReleaseProgress <= 0.0f || this.emptyStub) {
                f4 = 1.0f;
            } else {
                float fDp4 = AndroidUtilities.dp(16.0f) * this.swipeToReleaseProgress;
                rectF.inset(fDp4, fDp4);
                f4 = 1.0f - this.swipeToReleaseProgress;
            }
            if (this.drawFolderBackground) {
                Path path = this.path;
                path.reset();
                float fWidth = rectF.width() * 0.2f;
                float fWidth2 = rectF.width() * 0.1f;
                float fWidth3 = rectF.width() * 0.03f;
                f5 = f20;
                float f22 = fWidth2 / 2.0f;
                float fHeight = rectF.height() - fWidth2;
                counterDrawable = counterDrawable2;
                f7 = f19;
                path.moveTo(rectF.right, rectF.top + fWidth + fWidth2);
                float f23 = -fWidth;
                path.rQuadTo(0.0f, f23, f23, f23);
                float f24 = fWidth * 2.0f;
                float f25 = f22 * 2.0f;
                f6 = f13;
                path.rLineTo((((-(rectF.width() - f24)) / 2.0f) + f25) - fWidth3, 0.0f);
                float f26 = -f22;
                float f27 = f26 / 2.0f;
                float f28 = f26 * 2.0f;
                textPaint = textPaint3;
                float f29 = (-fWidth2) / 2.0f;
                path.rQuadTo(f27, 0.0f, f28, f29);
                path.rQuadTo(f27, f29, f28, f29);
                path.rLineTo(((-(rectF.width() - f24)) / 2.0f) + f25 + fWidth3, 0.0f);
                path.rQuadTo(f23, 0.0f, f23, fWidth);
                path.rLineTo(0.0f, (fHeight + fWidth2) - f24);
                path.rQuadTo(0.0f, fWidth, fWidth, fWidth);
                path.rLineTo(rectF.width() - f24, 0.0f);
                path.rQuadTo(fWidth, 0.0f, fWidth, f23);
                path.rLineTo(0.0f, -(fHeight - f24));
                path.close();
                canvas2.drawPath(path, getThemedPaint$1("paintChatActionBackground"));
                if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
                    canvas2.drawPath(path, Theme.chat_actionBackgroundGradientDarkenPaint);
                }
            } else {
                f5 = f20;
                counterDrawable = counterDrawable2;
                f6 = f13;
                textPaint = textPaint3;
                f7 = f19;
                int alpha5 = getThemedPaint$1("paintChatActionBackground").getAlpha();
                getThemedPaint$1("paintChatActionBackground").setAlpha((int) (alpha5 * f4));
                float f30 = this.circleRadius;
                canvas2.drawRoundRect(rectF, f30, f30, getThemedPaint$1("paintChatActionBackground"));
                getThemedPaint$1("paintChatActionBackground").setAlpha(alpha5);
                if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
                    int alpha6 = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
                    Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (alpha6 * f4));
                    float f31 = this.circleRadius;
                    canvas2.drawRoundRect(rectF, f31, f31, Theme.chat_actionBackgroundGradientDarkenPaint);
                    Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha6);
                }
            }
            float fM2 = DiffUtil.m(1.0f, f, AndroidUtilities.dp(8.0f), f5 + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(36.0f) * this.swipeToReleaseProgress);
            canvas2.save();
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            canvas2.clipRect(rectF);
            float f32 = this.swipeToReleaseProgress;
            if (f32 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f32) * 255.0f));
            }
            float fDp5 = AndroidUtilities.dp(24.0f) * f;
            canvas2.save();
            float fDpf2 = fDp5 / AndroidUtilities.dpf2(24.0f);
            canvas2.scale(fDpf2, fDpf2, f14, fM2 - AndroidUtilities.dp(20.0f));
            canvas2.translate(f14 - AndroidUtilities.dp2(12.0f), fM2 - AndroidUtilities.dp(12.0f));
            f8 = f14;
            f9 = f15;
            f10 = f21;
            i = i4;
            i2 = alpha3;
            canvas2.drawLine(AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(22.0f), paint);
            canvas.drawLine(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dpf2(21.5f), AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.5f), AndroidUtilities.dpf2(3.5f), paint);
            canvas2.restore();
            if (this.emptyStub) {
                float fM3 = OKLCH.m(f5 - AndroidUtilities.dp(2.0f), this.swipeToReleaseProgress, (1.0f - this.swipeToReleaseProgress) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - f7), f9);
                paint.setAlpha(alpha4);
                canvas2.save();
                canvas2.scale(f, f, f8, AndroidUtilities.dp(28.0f) + fM3);
                float fDp6 = fM3 + AndroidUtilities.dp(28.0f);
                if (this.animateCheck) {
                    float f33 = this.checkProgress;
                    if (f33 < 1.0f) {
                        float f34 = f33 + 0.07272727f;
                        this.checkProgress = f34;
                        if (f34 > 1.0f) {
                            this.checkProgress = 1.0f;
                        }
                    }
                    float f35 = this.checkProgress;
                    float f36 = f35 > 0.5f ? 1.0f : f35 / 0.5f;
                    float f37 = f35 < 0.5f ? 0.0f : (f35 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF);
                    canvas2.translate(f8 - AndroidUtilities.dp(24.0f), fDp6 - AndroidUtilities.dp(24.0f));
                    float fDp7 = AndroidUtilities.dp(16.0f);
                    float fDp8 = AndroidUtilities.dp(26.0f);
                    float fDp9 = AndroidUtilities.dp(22.0f);
                    float fDp10 = AndroidUtilities.dp(32.0f);
                    float fDp11 = AndroidUtilities.dp(32.0f);
                    float fDp12 = AndroidUtilities.dp(20.0f);
                    float f38 = 1.0f - f36;
                    canvas.drawLine(fDp7, fDp8, (fDp9 * f36) + (fDp7 * f38), (f36 * fDp10) + (f38 * fDp8), paint);
                    if (f37 > 0.0f) {
                        float f39 = 1.0f - f37;
                        float f40 = (fDp11 * f37) + (fDp9 * f39);
                        float f41 = (fDp12 * f37) + (f39 * fDp10);
                        canvas2 = canvas;
                        canvas2.drawLine(fDp9, fDp10, f40, f41, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            } else {
                paint = paint;
            }
            canvas2.restore();
        } else {
            paint = paint;
            counterDrawable = counterDrawable2;
            f6 = f13;
            textPaint = textPaint3;
            f7 = f19;
            f9 = f15;
            f3 = 36.0f;
            f8 = f14;
            i2 = alpha3;
            i = i4;
            f10 = f16;
        }
        if (this.chatNameLayout == null || this.swipeToReleaseProgress <= 0.0f) {
            textPaint2 = textPaint;
        } else {
            getThemedPaint$1("paintChatActionBackground").setAlpha(i);
            textPaint2 = textPaint;
            textPaint2.setAlpha(i5);
            float fDp13 = (((1.0f - this.swipeToReleaseProgress) * AndroidUtilities.dp(20.0f)) - (AndroidUtilities.dp(f3) * this.swipeToReleaseProgress)) + f9;
            RectF rectF2 = AndroidUtilities.rectTmp;
            int i6 = this.lastWidth;
            float f42 = (i6 - this.chatNameWidth) / 2.0f;
            rectF2.set(f42, fDp13, i6 - f42, this.chatNameLayout.getHeight() + fDp13);
            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), getThemedPaint$1("paintChatActionBackground"));
            if (resourcesProvider != null ? resourcesProvider.hasGradientService() : Theme.hasGradientService()) {
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas2.save();
            canvas2.translate((this.lastWidth - this.chatNameWidth) / 2.0f, fDp13);
            this.chatNameLayout.draw(canvas2);
            canvas2.restore();
        }
        if (!this.emptyStub && f7 > 0.0f) {
            float fM4 = OKLCH.m((-f10) + AndroidUtilities.dp(4.0f), this.swipeToReleaseProgress, (1.0f - this.swipeToReleaseProgress) * (((-AndroidUtilities.dp(8.0f)) - (AndroidUtilities.dp2(8.0f) * f)) - f7), f9);
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 == null || (imageReceiver = animatedEmojiDrawable2.imageReceiver) == null) {
                imageReceiver = this.imageReceiver;
            }
            ImageReceiver imageReceiver2 = imageReceiver;
            imageReceiver2.setAlpha(f6);
            float f43 = f7 / 2.0f;
            imageReceiver2.setRoundRadius((int) f43);
            float f44 = f7;
            imageReceiver2.setImageCoords(f8 - f43, fM4, f44, f44);
            if (this.isTopic && imageReceiver2.getDrawable() != null && (imageReceiver2.getDrawable() instanceof CombinedDrawable) && (((CombinedDrawable) imageReceiver2.getDrawable()).icon instanceof LetterDrawable)) {
                ((LetterDrawable) ((CombinedDrawable) imageReceiver2.getDrawable()).icon).scale = f;
            }
            if (this.swipeToReleaseProgress <= 0.0f || !this.visibleCounterDrawable) {
                imageReceiver2.draw(canvas2);
            } else {
                canvas2.saveLayerAlpha(imageReceiver2.getImageX(), imageReceiver2.getImageY(), imageReceiver2.getImageX() + imageReceiver2.getImageWidth(), imageReceiver2.getImageY() + imageReceiver2.getImageHeight(), 255, 31);
                imageReceiver2.draw(canvas2);
                float f45 = this.swipeToReleaseProgress;
                float fDp14 = AndroidUtilities.dp(12.0f) + f8;
                CounterView.CounterDrawable counterDrawable3 = counterDrawable;
                counterDrawable3.updateX(counterDrawable3.countWidth);
                canvas2.scale(f45, f45, (counterDrawable3.countWidth / 2.0f) + counterDrawable3.countLeft + fDp14, (fM4 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(14.0f));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f8, fM4 - AndroidUtilities.dp(6.0f));
                float f46 = counterDrawable3.countChangeProgress;
                RectF rectF3 = counterDrawable3.rectF;
                float f47 = counterDrawable3.radius;
                if (f46 != 1.0f) {
                    int i7 = counterDrawable3.animationType;
                    if (i7 != 0) {
                        f12 = 11.0f;
                        if (i7 != 1) {
                            float f48 = f46 * 2.0f;
                            if (f48 > 1.0f) {
                                f48 = 1.0f;
                            }
                            float fDp15 = (counterDrawable3.lastH - AndroidUtilities.dp(f47 * 2.0f)) / 2.0f;
                            int i8 = counterDrawable3.countWidth;
                            int i9 = counterDrawable3.countWidthOld;
                            if (i8 == i9) {
                                fM = i8;
                                f11 = 14.0f;
                            } else {
                                f11 = 14.0f;
                                fM = DiffUtil.m(1.0f, f48, i9, i8 * f48);
                            }
                            counterDrawable3.updateX(fM);
                            float f49 = counterDrawable3.x;
                            rectF3.set(f49, fDp15, fM + f49 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + fDp15);
                        }
                    } else {
                        f12 = 11.0f;
                    }
                    f11 = 14.0f;
                    counterDrawable3.updateX(counterDrawable3.countWidth);
                    float fDp16 = (counterDrawable3.lastH - AndroidUtilities.dp(f47 * 2.0f)) / 2.0f;
                    float f50 = counterDrawable3.x;
                    rectF3.set(f50, fDp16, counterDrawable3.countWidth + f50 + AndroidUtilities.dp(f12), AndroidUtilities.dp(23.0f) + fDp16);
                } else {
                    f11 = 14.0f;
                    counterDrawable3.updateX(counterDrawable3.countWidth);
                    float fDp17 = (counterDrawable3.lastH - AndroidUtilities.dp(f47 * 2.0f)) / 2.0f;
                    float f51 = counterDrawable3.x;
                    rectF3.set(f51, fDp17, counterDrawable3.countWidth + f51 + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + fDp17);
                }
                rectF3.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                canvas2.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, this.xRefPaint);
                canvas2.restore();
                canvas2.save();
                float f52 = this.swipeToReleaseProgress;
                float fDp18 = AndroidUtilities.dp(12.0f) + f8;
                counterDrawable3.updateX(counterDrawable3.countWidth);
                canvas2.scale(f52, f52, (counterDrawable3.countWidth / 2.0f) + counterDrawable3.countLeft + fDp18, (fM4 - AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(f11));
                canvas2.translate(AndroidUtilities.dp(12.0f) + f8, fM4 - AndroidUtilities.dp(6.0f));
                counterDrawable3.draw(canvas2);
                canvas2.restore();
            }
            imageReceiver2.setAlpha(1.0f);
        }
        getThemedPaint$1("paintChatActionBackground").setAlpha(alpha);
        Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(alpha2);
        textPaint2.setAlpha(i2);
        paint.setAlpha(alpha4);
    }

    public final void drawBottomPanel(Canvas canvas, int i, int i2) {
        TextPaint textPaint = this.textPaint2;
        textPaint.setColor(Theme.getColor(Theme.key_glass_defaultText, this.resourcesProvider));
        Paint themedPaint$1 = getThemedPaint$1("paintChatComposeBackground");
        int alpha = themedPaint$1.getAlpha();
        int alpha2 = textPaint.getAlpha();
        themedPaint$1.setAlpha((int) (alpha * this.progressToBottomPanel));
        if (this.layout1 != null) {
            float f = this.swipeToReleaseProgress;
            if (f < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f) * alpha2 * this.progressToBottomPanel));
                float height = ((((i2 - i) - this.layout1.getHeight()) / 2.0f) + i) - (AndroidUtilities.dp(10.0f) * this.swipeToReleaseProgress);
                canvas.save();
                canvas.translate((this.lastWidth - this.layout1Width) / 2.0f, height);
                this.layout1.draw(canvas);
                canvas.restore();
            }
        }
        if (this.layout2 != null) {
            float f2 = this.swipeToReleaseProgress;
            if (f2 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f2 * this.progressToBottomPanel));
                float fDp = ((1.0f - this.swipeToReleaseProgress) * AndroidUtilities.dp(10.0f)) + (((i2 - i) - this.layout2.getHeight()) / 2.0f) + i;
                canvas.save();
                canvas.translate((this.lastWidth - this.layout2Width) / 2.0f, fDp);
                this.layout2.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        themedPaint$1.setAlpha(alpha);
    }

    public final Paint getThemedPaint$1(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public final boolean needDrawBottomPanel() {
        return this.progressToBottomPanel > 0.0f && !this.emptyStub;
    }

    public final void showReleaseState(boolean z, final ChatActivity.AnonymousClass21 anonymousClass21) {
        final int i = 3;
        final int i2 = 1;
        final int i3 = 0;
        Object[] objArr = 0;
        final int i4 = 2;
        AnimatorSet animatorSet = this.showReleaseAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.showReleaseAnimator.cancel();
        }
        if (!z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 0.0f);
            final int i5 = 4;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ChatPullingDownDrawable f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i5) {
                        case 0:
                            ChatPullingDownDrawable chatPullingDownDrawable = this.f$0;
                            chatPullingDownDrawable.getClass();
                            chatPullingDownDrawable.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            anonymousClass21.invalidate();
                            chatPullingDownDrawable.fragmentView.invalidate();
                            break;
                        case 1:
                            ChatPullingDownDrawable chatPullingDownDrawable2 = this.f$0;
                            chatPullingDownDrawable2.getClass();
                            chatPullingDownDrawable2.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            anonymousClass21.invalidate();
                            break;
                        case 2:
                            ChatPullingDownDrawable chatPullingDownDrawable3 = this.f$0;
                            chatPullingDownDrawable3.getClass();
                            chatPullingDownDrawable3.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            anonymousClass21.invalidate();
                            break;
                        case 3:
                            ChatPullingDownDrawable chatPullingDownDrawable4 = this.f$0;
                            chatPullingDownDrawable4.getClass();
                            chatPullingDownDrawable4.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            anonymousClass21.invalidate();
                            break;
                        default:
                            ChatPullingDownDrawable chatPullingDownDrawable5 = this.f$0;
                            chatPullingDownDrawable5.getClass();
                            chatPullingDownDrawable5.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            chatPullingDownDrawable5.fragmentView.invalidate();
                            anonymousClass21.invalidate();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.showReleaseAnimator = animatorSet2;
            animatorSet2.playTogether(valueAnimatorOfFloat);
            this.showReleaseAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.swipeToReleaseProgress, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ChatPullingDownDrawable f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        ChatPullingDownDrawable chatPullingDownDrawable = this.f$0;
                        chatPullingDownDrawable.getClass();
                        chatPullingDownDrawable.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        chatPullingDownDrawable.fragmentView.invalidate();
                        break;
                    case 1:
                        ChatPullingDownDrawable chatPullingDownDrawable2 = this.f$0;
                        chatPullingDownDrawable2.getClass();
                        chatPullingDownDrawable2.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 2:
                        ChatPullingDownDrawable chatPullingDownDrawable3 = this.f$0;
                        chatPullingDownDrawable3.getClass();
                        chatPullingDownDrawable3.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 3:
                        ChatPullingDownDrawable chatPullingDownDrawable4 = this.f$0;
                        chatPullingDownDrawable4.getClass();
                        chatPullingDownDrawable4.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    default:
                        ChatPullingDownDrawable chatPullingDownDrawable5 = this.f$0;
                        chatPullingDownDrawable5.getClass();
                        chatPullingDownDrawable5.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        chatPullingDownDrawable5.fragmentView.invalidate();
                        anonymousClass21.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        valueAnimatorOfFloat2.setDuration(250L);
        this.bounceProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ChatPullingDownDrawable f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        ChatPullingDownDrawable chatPullingDownDrawable = this.f$0;
                        chatPullingDownDrawable.getClass();
                        chatPullingDownDrawable.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        chatPullingDownDrawable.fragmentView.invalidate();
                        break;
                    case 1:
                        ChatPullingDownDrawable chatPullingDownDrawable2 = this.f$0;
                        chatPullingDownDrawable2.getClass();
                        chatPullingDownDrawable2.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 2:
                        ChatPullingDownDrawable chatPullingDownDrawable3 = this.f$0;
                        chatPullingDownDrawable3.getClass();
                        chatPullingDownDrawable3.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 3:
                        ChatPullingDownDrawable chatPullingDownDrawable4 = this.f$0;
                        chatPullingDownDrawable4.getClass();
                        chatPullingDownDrawable4.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    default:
                        ChatPullingDownDrawable chatPullingDownDrawable5 = this.f$0;
                        chatPullingDownDrawable5.getClass();
                        chatPullingDownDrawable5.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        chatPullingDownDrawable5.fragmentView.invalidate();
                        anonymousClass21.invalidate();
                        break;
                }
            }
        });
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
        valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat3.setDuration(180L);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ChatPullingDownDrawable f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        ChatPullingDownDrawable chatPullingDownDrawable = this.f$0;
                        chatPullingDownDrawable.getClass();
                        chatPullingDownDrawable.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        chatPullingDownDrawable.fragmentView.invalidate();
                        break;
                    case 1:
                        ChatPullingDownDrawable chatPullingDownDrawable2 = this.f$0;
                        chatPullingDownDrawable2.getClass();
                        chatPullingDownDrawable2.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 2:
                        ChatPullingDownDrawable chatPullingDownDrawable3 = this.f$0;
                        chatPullingDownDrawable3.getClass();
                        chatPullingDownDrawable3.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 3:
                        ChatPullingDownDrawable chatPullingDownDrawable4 = this.f$0;
                        chatPullingDownDrawable4.getClass();
                        chatPullingDownDrawable4.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    default:
                        ChatPullingDownDrawable chatPullingDownDrawable5 = this.f$0;
                        chatPullingDownDrawable5.getClass();
                        chatPullingDownDrawable5.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        chatPullingDownDrawable5.fragmentView.invalidate();
                        anonymousClass21.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat4.setDuration(120L);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
            public final ChatPullingDownDrawable f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        ChatPullingDownDrawable chatPullingDownDrawable = this.f$0;
                        chatPullingDownDrawable.getClass();
                        chatPullingDownDrawable.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        chatPullingDownDrawable.fragmentView.invalidate();
                        break;
                    case 1:
                        ChatPullingDownDrawable chatPullingDownDrawable2 = this.f$0;
                        chatPullingDownDrawable2.getClass();
                        chatPullingDownDrawable2.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 2:
                        ChatPullingDownDrawable chatPullingDownDrawable3 = this.f$0;
                        chatPullingDownDrawable3.getClass();
                        chatPullingDownDrawable3.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    case 3:
                        ChatPullingDownDrawable chatPullingDownDrawable4 = this.f$0;
                        chatPullingDownDrawable4.getClass();
                        chatPullingDownDrawable4.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        anonymousClass21.invalidate();
                        break;
                    default:
                        ChatPullingDownDrawable chatPullingDownDrawable5 = this.f$0;
                        chatPullingDownDrawable5.getClass();
                        chatPullingDownDrawable5.swipeToReleaseProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        chatPullingDownDrawable5.fragmentView.invalidate();
                        anonymousClass21.invalidate();
                        break;
                }
            }
        });
        valueAnimatorOfFloat5.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.showReleaseAnimator = animatorSet3;
        animatorSet3.addListener(new ChatActivity.AnonymousClass74(this, anonymousClass21, objArr == true ? 1 : 0, 8));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        this.showReleaseAnimator.playTogether(valueAnimatorOfFloat2, animatorSet4);
        this.showReleaseAnimator.start();
    }

    public final void updateDialog(TLRPC.Chat chat) {
        if (chat == null) {
            updateDialog();
            return;
        }
        this.nextDialogId = -chat.id;
        int[] iArr = this.params;
        this.drawFolderBackground = iArr[0] == 1;
        this.dialogFolderId = iArr[1];
        this.dialogFilterId = iArr[2];
        this.emptyStub = false;
        this.nextChat = chat;
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        TLRPC.Chat chat2 = this.nextChat;
        int i = this.currentAccount;
        avatarDrawable.setInfo(i, chat2);
        this.imageReceiver.setImage(ImageLocation.getForChat(this.nextChat, 1), "50_50", avatarDrawable, null, UserConfig.getInstance(0).getCurrentUser(), 0);
        MessagesController.getInstance(i).ensureMessagesLoaded(-chat.id, 0, null);
        TLRPC.Dialog dialog = MessagesController.getInstance(i).getDialog(-chat.id);
        int i2 = dialog == null ? 0 : dialog.unread_count;
        this.counterDrawable.setCount(i2, false);
        this.visibleCounterDrawable = i2 > 0;
        this.recommendedChannel = true;
        this.nextTopic = null;
    }

    public final void updateTopic() {
        TLRPC.TL_forumTopic tL_forumTopic;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        ChatActivity.AnonymousClass21 anonymousClass21;
        ChatActivity.AnonymousClass21 anonymousClass22;
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.recommendedChannel = false;
        this.drawFolderBackground = false;
        this.nextChat = null;
        this.nextDialogId = 0L;
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.clearImage();
        long j = -this.currentDialog;
        int i = this.currentAccount;
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i).getTopicsController().getTopics(j);
        if (topics == null || topics.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i2 = 0; i2 < topics.size(); i2++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i2);
                if (tL_forumTopic2.id != this.topicId && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.nextTopic = null;
            this.emptyStub = true;
            return;
        }
        this.emptyStub = false;
        this.nextTopic = tL_forumTopic;
        int i3 = tL_forumTopic.id;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (i3 == 1) {
            ChatActivity.AnonymousClass21 anonymousClass23 = this.parentView;
            if (anonymousClass23 != null && (animatedEmojiDrawable2 = this.animatedEmojiDrawable) != null) {
                animatedEmojiDrawable2.removeView(anonymousClass23);
            }
            this.animatedEmojiDrawable = null;
            imageReceiver.setImageBitmap(ForumUtilities.createGeneralTopicDrawable(this.fragmentView.getContext(), 1.0f, Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), true));
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable3 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable3 == null || animatedEmojiDrawable3.getDocumentId() != tL_forumTopic.icon_emoji_id) {
                AnimatedEmojiDrawable animatedEmojiDrawable4 = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable4 != null && (anonymousClass21 = this.parentView) != null) {
                    animatedEmojiDrawable4.removeView(anonymousClass21);
                }
                AnimatedEmojiDrawable animatedEmojiDrawable5 = new AnimatedEmojiDrawable(22, i, tL_forumTopic.icon_emoji_id);
                this.animatedEmojiDrawable = animatedEmojiDrawable5;
                animatedEmojiDrawable5.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_serviceText, resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            AnimatedEmojiDrawable animatedEmojiDrawable6 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable6 != null && (anonymousClass22 = this.parentView) != null) {
                animatedEmojiDrawable6.addView(anonymousClass22);
            }
            imageReceiver.setImageBitmap((Bitmap) null);
        } else {
            ChatActivity.AnonymousClass21 anonymousClass24 = this.parentView;
            if (anonymousClass24 != null && (animatedEmojiDrawable = this.animatedEmojiDrawable) != null) {
                animatedEmojiDrawable.removeView(anonymousClass24);
            }
            this.animatedEmojiDrawable = null;
            imageReceiver.setImageBitmap(ForumUtilities.createTopicDrawable(tL_forumTopic));
        }
        int i4 = tL_forumTopic.unread_count;
        this.counterDrawable.setCount(i4, false);
        this.visibleCounterDrawable = i4 > 0;
    }

    public final void updateDialog() {
        this.recommendedChannel = false;
        this.nextTopic = null;
        TLRPC.Dialog nextUnreadDialog = getNextUnreadDialog(this.currentDialog, this.folderId, this.filterId, true, this.params);
        if (nextUnreadDialog != null) {
            this.nextDialogId = nextUnreadDialog.id;
            int[] iArr = this.params;
            this.drawFolderBackground = iArr[0] == 1;
            this.dialogFolderId = iArr[1];
            this.dialogFilterId = iArr[2];
            this.emptyStub = false;
            int i = this.currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-nextUnreadDialog.id));
            this.nextChat = chat;
            if (chat == null) {
                this.nextChat = MessagesController.getInstance(i).getChat(Long.valueOf(nextUnreadDialog.id));
            }
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(i, this.nextChat);
            this.imageReceiver.setImage(ImageLocation.getForChat(this.nextChat, 1), "50_50", avatarDrawable, null, UserConfig.getInstance(0).getCurrentUser(), 0);
            MessagesController.getInstance(i).ensureMessagesLoaded(nextUnreadDialog.id, 0, null);
            int i2 = nextUnreadDialog.unread_count;
            this.counterDrawable.setCount(i2, false);
            this.visibleCounterDrawable = i2 > 0;
            return;
        }
        this.nextChat = null;
        this.drawFolderBackground = false;
        this.emptyStub = true;
    }
}
