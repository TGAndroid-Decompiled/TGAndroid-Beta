package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;

public class SuggestEmojiView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public Adapter adapter;
    public Integer arrowToEnd;
    public Emoji.EmojiSpan arrowToSpan;
    public Integer arrowToStart;
    public float arrowX;
    public AnimatedFloat arrowXAnimated;
    public Paint backgroundPaint;
    public Path circlePath;
    public boolean clear;
    public AnonymousClass2 containerView;
    public final int currentAccount;
    public int direction;
    public AnchorViewDelegate enterView;
    public boolean forceClose;
    public int horizontalPadding;
    public boolean isCopyForbidden;
    public boolean isSetAsStatusForbidden;
    public ArrayList keywordResults;
    public String[] lastLang;
    public long lastLangChangedTime;
    public String lastQuery;
    public int lastQueryId;
    public int lastQueryType;
    public float lastSpanY;
    public AnimatedFloat leftGradientAlpha;
    public AnonymousClass3 listView;
    public AnimatedFloat listViewCenterAnimated;
    public AnimatedFloat listViewWidthAnimated;
    public Path path;
    public AnonymousClass1 previewDelegate;
    public final Theme.ResourcesProvider resourcesProvider;
    public AnimatedFloat rightGradientAlpha;
    public Runnable searchRunnable;
    public boolean show;
    public AnimatedFloat showFloat1;
    public AnimatedFloat showFloat2;
    public SeekBarView$$ExternalSyntheticLambda1 updateRunnable;

    public final class AnonymousClass1 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        public AnonymousClass1() {
        }

        @Override
        public final void addCaptionToGif(TLObject tLObject, Object obj) {
        }

        @Override
        public final void addToFavoriteSelected(String str) {
        }

        @Override
        public final boolean can() {
            return true;
        }

        @Override
        public final boolean canAddCaption() {
            return false;
        }

        @Override
        public final boolean canDeleteSticker() {
            return false;
        }

        @Override
        public final boolean canEditSticker() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final boolean canSendSticker() {
            return true;
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            TLRPC.User currentUser;
            if (SuggestEmojiView.this.isSetAsStatusForbidden || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
                return null;
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
            AnchorViewDelegate anchorViewDelegate;
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, null);
            animatedEmojiSpan.document = document;
            spannableStringBuilderValueOf.setSpan(animatedEmojiSpan, 0, spannableStringBuilderValueOf.length(), 33);
            if (!AndroidUtilities.addToClipboard(spannableStringBuilderValueOf) || (anchorViewDelegate = SuggestEmojiView.this.enterView) == null) {
                return;
            }
            zzkn.m(R.string.EmojiCopied, BulletinFactory.of(anchorViewDelegate.getParentFragment()));
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
        }

        @Override
        public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
            return null;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return null;
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return null;
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return null;
        }

        @Override
        public final String getQuery(boolean z) {
            return null;
        }

        @Override
        public final void gifAddedOrDeleted() {
        }

        @Override
        public final boolean isInScheduleMode() {
            AnchorViewDelegate anchorViewDelegate = SuggestEmojiView.this.enterView;
            if (anchorViewDelegate == null) {
                return false;
            }
            BaseFragment parentFragment = anchorViewDelegate.getParentFragment();
            if (parentFragment instanceof ChatActivity) {
                return ((ChatActivity) parentFragment).isInScheduleMode();
            }
            return false;
        }

        @Override
        public final boolean isPhotoEditor() {
            return false;
        }

        @Override
        public final boolean isReplacedSticker() {
            return false;
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return false;
        }

        @Override
        public final boolean isStickerEditor() {
            return false;
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            if (SuggestEmojiView.this.isCopyForbidden) {
                return false;
            }
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        }

        @Override
        public final boolean needOpen() {
            return true;
        }

        @Override
        public final boolean needRemove() {
            return false;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needSend(int i) {
            AnchorViewDelegate anchorViewDelegate = SuggestEmojiView.this.enterView;
            if (anchorViewDelegate == null) {
                return false;
            }
            BaseFragment parentFragment = anchorViewDelegate.getParentFragment();
            if (parentFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) parentFragment;
                if (chatActivity.canSendMessage()) {
                    if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                        return true;
                    }
                    if (chatActivity.getCurrentUser() != null && UserObject.isUserSelf(chatActivity.getCurrentUser())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
        }

        @Override
        public final void resetTouch() {
        }

        @Override
        public final void retractVote() {
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
            SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
            AnchorViewDelegate anchorViewDelegate = suggestEmojiView.enterView;
            if (anchorViewDelegate == null) {
                return;
            }
            BaseFragment parentFragment = anchorViewDelegate.getParentFragment();
            if (parentFragment instanceof ChatActivity) {
                ((ChatActivity) parentFragment).sendAnimatedEmoji(document);
                suggestEmojiView.enterView.setFieldText("");
            }
        }

        @Override
        public final void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z) {
        }

        @Override
        public final void sendSticker(String str) {
        }

        @Override
        public final void sendVote() {
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document) {
            TLRPC.EmojiStatus tL_emojiStatusEmpty;
            if (document == null) {
                tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = document.id;
                tL_emojiStatusEmpty = tL_emojiStatus;
            }
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
            SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
            MessagesController.getInstance(suggestEmojiView.currentAccount).updateEmojiStatus(tL_emojiStatusEmpty);
            ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = new ShareAlert$$ExternalSyntheticLambda29(23, this, tL_emojiStatusEmpty2);
            AnchorViewDelegate anchorViewDelegate = suggestEmojiView.enterView;
            BaseFragment parentFragment = anchorViewDelegate == null ? null : anchorViewDelegate.getParentFragment();
            if (parentFragment != null) {
                if (document != null) {
                    BulletinFactory.of(parentFragment).createEmojiBulletin(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), shareAlert$$ExternalSyntheticLambda29).show();
                    return;
                }
                Context context = suggestEmojiView.getContext();
                Theme.ResourcesProvider resourcesProvider = suggestEmojiView.resourcesProvider;
                Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(context, resourcesProvider);
                simpleLayout.textView.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                simpleLayout.imageView.setImageResource(R.drawable.msg_settings_premium);
                Bulletin.UndoButton undoButton = new Bulletin.UndoButton(suggestEmojiView.getContext(), resourcesProvider, true, false);
                undoButton.undoAction = shareAlert$$ExternalSyntheticLambda29;
                simpleLayout.setButton(undoButton);
                Bulletin.make(parentFragment, simpleLayout, 1500).show();
            }
        }

        @Override
        public final void setIntroSticker(String str) {
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        }
    }

    public final class AnonymousClass2 extends FrameLayout {
        public AnonymousClass2(Context context) {
            super(context);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            ArrayList arrayList;
            SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
            AnchorViewDelegate anchorViewDelegate = suggestEmojiView.enterView;
            if (anchorViewDelegate != null && anchorViewDelegate.getEditField() != null) {
                Emoji.EmojiSpan emojiSpan = suggestEmojiView.arrowToSpan;
                if (emojiSpan != null && emojiSpan.drawn) {
                    float x = suggestEmojiView.enterView.getEditField().getX() + suggestEmojiView.enterView.getEditField().getPaddingLeft();
                    Emoji.EmojiSpan emojiSpan2 = suggestEmojiView.arrowToSpan;
                    suggestEmojiView.arrowX = x + emojiSpan2.lastDrawX;
                    suggestEmojiView.lastSpanY = emojiSpan2.lastDrawY;
                } else if (suggestEmojiView.arrowToStart != null && suggestEmojiView.arrowToEnd != null) {
                    suggestEmojiView.arrowX = suggestEmojiView.enterView.getEditField().getX() + suggestEmojiView.enterView.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                }
            }
            boolean z = (!suggestEmojiView.show || suggestEmojiView.forceClose || (arrayList = suggestEmojiView.keywordResults) == null || arrayList.isEmpty() || suggestEmojiView.clear) ? false : true;
            float f2 = suggestEmojiView.showFloat1.set(z ? 1.0f : 0.0f, false);
            float f3 = suggestEmojiView.showFloat2.set(z ? 1.0f : 0.0f, false);
            float f4 = suggestEmojiView.arrowXAnimated.set(suggestEmojiView.arrowX, false);
            if (f2 <= 0.0f && f3 <= 0.0f && !z) {
                suggestEmojiView.containerView.setVisibility(8);
            }
            suggestEmojiView.path.rewind();
            float left = suggestEmojiView.listView.getLeft();
            int left2 = suggestEmojiView.listView.getLeft();
            ArrayList arrayList2 = suggestEmojiView.keywordResults;
            float fM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(arrayList2 == null ? 0 : arrayList2.size(), 44.0f, left2);
            AnimatedFloat animatedFloat = suggestEmojiView.listViewWidthAnimated;
            float f5 = animatedFloat.value;
            boolean z2 = f5 <= 0.0f;
            float f6 = fM - left;
            if (f6 > 0.0f) {
                f5 = animatedFloat.set(f6, z2);
            }
            float f7 = suggestEmojiView.listViewCenterAnimated.set((left + fM) / 2.0f, z2);
            AnchorViewDelegate anchorViewDelegate2 = suggestEmojiView.enterView;
            if (anchorViewDelegate2 != null && anchorViewDelegate2.getEditField() != null) {
                int i = suggestEmojiView.direction;
                if (i == 0) {
                    suggestEmojiView.containerView.setTranslationY(((-suggestEmojiView.enterView.getEditField().getHeight()) - suggestEmojiView.enterView.getEditField().getScrollY()) + suggestEmojiView.lastSpanY + AndroidUtilities.dp(5.0f));
                } else if (i == 1) {
                    suggestEmojiView.containerView.setTranslationY(((-suggestEmojiView.getMeasuredHeight()) - suggestEmojiView.enterView.getEditField().getScrollY()) + suggestEmojiView.lastSpanY + AndroidUtilities.dp(20.0f) + suggestEmojiView.containerView.getHeight());
                }
            }
            float f8 = f5 / 4.0f;
            float f9 = f5 / 2.0f;
            int iMax = (int) Math.max((suggestEmojiView.arrowX - Math.max(f8, Math.min(f9, AndroidUtilities.dp(66.0f)))) - suggestEmojiView.listView.getLeft(), 0.0f);
            if (suggestEmojiView.listView.getPaddingLeft() != iMax) {
                int paddingLeft = suggestEmojiView.listView.getPaddingLeft() - iMax;
                f = 1.0f;
                suggestEmojiView.listView.setPadding(iMax, 0, 0, 0);
                suggestEmojiView.listView.scrollBy(paddingLeft, 0);
            } else {
                f = 1.0f;
            }
            suggestEmojiView.listView.setTranslationX(((int) Math.max((f4 - Math.max(f8, Math.min(f9, AndroidUtilities.dp(66.0f)))) - suggestEmojiView.listView.getLeft(), 0.0f)) - iMax);
            float translationX = suggestEmojiView.listView.getTranslationX() + (f7 - f9) + suggestEmojiView.listView.getPaddingLeft();
            float translationY = suggestEmojiView.listView.getTranslationY() + suggestEmojiView.listView.getTop() + suggestEmojiView.listView.getPaddingTop() + (suggestEmojiView.direction == 0 ? 0 : AndroidUtilities.dp(6.66f));
            float fMin = Math.min(suggestEmojiView.listView.getTranslationX() + f7 + f9 + suggestEmojiView.listView.getPaddingLeft(), suggestEmojiView.getWidth() - suggestEmojiView.containerView.getPaddingRight());
            float translationY2 = (suggestEmojiView.listView.getTranslationY() + suggestEmojiView.listView.getBottom()) - (suggestEmojiView.direction == 0 ? AndroidUtilities.dp(6.66f) : 0);
            float fMin2 = Math.min(AndroidUtilities.dp(9.0f), f9) * 2.0f;
            int i2 = suggestEmojiView.direction;
            if (i2 == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = translationY2 - fMin2;
                float f11 = translationX + fMin2;
                rectF.set(translationX, f10, f11, translationY2);
                suggestEmojiView.path.arcTo(rectF, 90.0f, 90.0f);
                float f12 = translationY + fMin2;
                rectF.set(translationX, translationY, f11, f12);
                suggestEmojiView.path.arcTo(rectF, -180.0f, 90.0f);
                float f13 = fMin - fMin2;
                rectF.set(f13, translationY, fMin, f12);
                suggestEmojiView.path.arcTo(rectF, -90.0f, 90.0f);
                rectF.set(f13, f10, fMin, translationY2);
                suggestEmojiView.path.arcTo(rectF, 0.0f, 90.0f);
                suggestEmojiView.path.lineTo(AndroidUtilities.dp(8.66f) + f4, translationY2);
                suggestEmojiView.path.lineTo(f4, AndroidUtilities.dp(6.66f) + translationY2);
                suggestEmojiView.path.lineTo(f4 - AndroidUtilities.dp(8.66f), translationY2);
            } else if (i2 == 1) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f14 = fMin - fMin2;
                float f15 = translationY + fMin2;
                rectF2.set(f14, translationY, fMin, f15);
                suggestEmojiView.path.arcTo(rectF2, -90.0f, 90.0f);
                float f16 = translationY2 - fMin2;
                rectF2.set(f14, f16, fMin, translationY2);
                suggestEmojiView.path.arcTo(rectF2, 0.0f, 90.0f);
                float f17 = fMin2 + translationX;
                rectF2.set(translationX, f16, f17, translationY2);
                suggestEmojiView.path.arcTo(rectF2, 90.0f, 90.0f);
                rectF2.set(translationX, translationY, f17, f15);
                suggestEmojiView.path.arcTo(rectF2, -180.0f, 90.0f);
                suggestEmojiView.path.lineTo(f4 - AndroidUtilities.dp(8.66f), translationY);
                suggestEmojiView.path.lineTo(f4, translationY - AndroidUtilities.dp(6.66f));
                suggestEmojiView.path.lineTo(AndroidUtilities.dp(8.66f) + f4, translationY);
            }
            suggestEmojiView.path.close();
            if (suggestEmojiView.backgroundPaint == null) {
                Paint paint = new Paint(1);
                suggestEmojiView.backgroundPaint = paint;
                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                suggestEmojiView.backgroundPaint.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                suggestEmojiView.backgroundPaint.setColor(Theme.getColor(Theme.key_chat_stickersHintPanel, suggestEmojiView.resourcesProvider));
            }
            if (f2 < f) {
                suggestEmojiView.circlePath.rewind();
                float fDp = suggestEmojiView.direction == 0 ? AndroidUtilities.dp(6.66f) + translationY2 : translationY - AndroidUtilities.dp(6.66f);
                double d = f4 - translationX;
                double d2 = fDp - translationY;
                double d3 = f4 - fMin;
                double d4 = fDp - translationY2;
                suggestEmojiView.circlePath.addCircle(f4, fDp, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * f2, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(suggestEmojiView.circlePath);
                canvas.saveLayerAlpha(0.0f, 0.0f, suggestEmojiView.getWidth(), suggestEmojiView.getHeight(), (int) (f2 * 255.0f), 31);
            }
            canvas.drawPath(suggestEmojiView.path, suggestEmojiView.backgroundPaint);
            canvas.save();
            canvas.clipPath(suggestEmojiView.path);
            super.dispatchDraw(canvas);
            float f18 = suggestEmojiView.listViewWidthAnimated.value;
            float f19 = suggestEmojiView.listViewCenterAnimated.value;
            float f20 = f18 / 2.0f;
            float translationX2 = suggestEmojiView.listView.getTranslationX() + (f19 - f20) + suggestEmojiView.listView.getPaddingLeft();
            float paddingTop = suggestEmojiView.listView.getPaddingTop() + suggestEmojiView.listView.getTop();
            float fMin3 = Math.min(suggestEmojiView.listView.getTranslationX() + f19 + f20 + suggestEmojiView.listView.getPaddingLeft(), suggestEmojiView.getWidth() - suggestEmojiView.containerView.getPaddingRight());
            float bottom = suggestEmojiView.listView.getBottom();
            float f21 = suggestEmojiView.leftGradientAlpha.set(suggestEmojiView.listView.canScrollHorizontally(-1) ? 1.0f : 0.0f, false);
            if (f21 > 0.0f) {
                int i3 = (int) translationX2;
                Theme.chat_gradientRightDrawable.setBounds(i3, (int) paddingTop, AndroidUtilities.dp(32.0f) + i3, (int) bottom);
                Theme.chat_gradientRightDrawable.setAlpha((int) (f21 * 255.0f));
                Theme.chat_gradientRightDrawable.draw(canvas);
            }
            float f22 = suggestEmojiView.rightGradientAlpha.set(suggestEmojiView.listView.canScrollHorizontally(1) ? 1.0f : 0.0f, false);
            if (f22 > 0.0f) {
                int i4 = (int) fMin3;
                Theme.chat_gradientLeftDrawable.setBounds(i4 - AndroidUtilities.dp(32.0f), (int) paddingTop, i4, (int) bottom);
                Theme.chat_gradientLeftDrawable.setAlpha((int) (f22 * 255.0f));
                Theme.chat_gradientLeftDrawable.draw(canvas);
            }
            canvas.restore();
            if (suggestEmojiView.showFloat1.value < f) {
                canvas.restore();
                canvas.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
            setPadding(suggestEmojiView.horizontalPadding, suggestEmojiView.direction == 0 ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(6.66f), suggestEmojiView.horizontalPadding, suggestEmojiView.direction == 0 ? AndroidUtilities.dp(6.66f) : AndroidUtilities.dp(8.0f));
            super.onMeasure(i, i2);
        }

        @Override
        public final void setVisibility(int i) {
            boolean z = getVisibility() == i;
            super.setVisibility(i);
            if (z) {
                return;
            }
            boolean z2 = i == 0;
            SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
            if (suggestEmojiView.listView != null) {
                for (int i2 = 0; i2 < suggestEmojiView.listView.getChildCount(); i2++) {
                    if (z2) {
                        EmojiImageView emojiImageView = (EmojiImageView) suggestEmojiView.listView.getChildAt(i2);
                        Drawable drawable = emojiImageView.drawable;
                        if (drawable instanceof AnimatedEmojiDrawable) {
                            ((AnimatedEmojiDrawable) drawable).addView(emojiImageView);
                        }
                        emojiImageView.attached = true;
                    } else {
                        EmojiImageView emojiImageView2 = (EmojiImageView) suggestEmojiView.listView.getChildAt(i2);
                        Drawable drawable2 = emojiImageView2.drawable;
                        if (drawable2 instanceof AnimatedEmojiDrawable) {
                            ((AnimatedEmojiDrawable) drawable2).removeView(emojiImageView2);
                        }
                        emojiImageView2.attached = false;
                    }
                }
            }
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public final SuggestEmojiView suggestEmojiView;

        public Adapter(SuggestEmojiView suggestEmojiView) {
            this.suggestEmojiView = suggestEmojiView;
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.suggestEmojiView.keywordResults;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override
        public final long getItemId(int i) {
            ArrayList arrayList = this.suggestEmojiView.keywordResults;
            if (arrayList == null) {
                return 0L;
            }
            return ((MediaDataController.KeywordResult) arrayList.get(i)).emoji.hashCode();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            EmojiImageView emojiImageView = (EmojiImageView) viewHolder.itemView;
            SuggestEmojiView suggestEmojiView = this.suggestEmojiView;
            ArrayList arrayList = suggestEmojiView.keywordResults;
            String str = arrayList == null ? null : ((MediaDataController.KeywordResult) arrayList.get(i)).emoji;
            int direction = suggestEmojiView.getDirection();
            emojiImageView.emoji = str;
            if (str == null || !str.startsWith("animated_")) {
                emojiImageView.setImageDrawable(Emoji.getEmojiBigDrawable(str));
            } else {
                try {
                    long j = Long.parseLong(str.substring(9));
                    Drawable drawable = emojiImageView.drawable;
                    if (!(drawable instanceof AnimatedEmojiDrawable) || ((AnimatedEmojiDrawable) drawable).getDocumentId() != j) {
                        emojiImageView.setImageDrawable(AnimatedEmojiDrawable.make(UserConfig.selectedAccount, j, null, SuggestEmojiView.this.emojiCacheType()));
                    }
                } catch (Exception unused) {
                    emojiImageView.setImageDrawable(null);
                }
            }
            if (emojiImageView.direction != direction) {
                emojiImageView.direction = direction;
                emojiImageView.requestLayout();
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(SuggestEmojiView.this.new EmojiImageView(this.suggestEmojiView.getContext()));
        }
    }

    public interface AnchorViewDelegate {
        void addTextChangedListener(ArticleViewer.AnonymousClass16 anonymousClass16);

        EditTextBoldCursor getEditField();

        Editable getEditText();

        CharSequence getFieldText();

        BaseFragment getParentFragment();

        int getVisibility();

        void setFieldText(CharSequence charSequence);
    }

    public final class EmojiImageView extends View {
        public boolean attached;
        public int direction;
        public Drawable drawable;
        public String emoji;
        public final AnimatedFloat pressed;

        public EmojiImageView(Context context) {
            super(context);
            this.direction = 0;
            this.pressed = new AnimatedFloat(350L, this, new OvershootInterpolator(5.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f = ((1.0f - this.pressed.set(isPressed() ? 1.0f : 0.0f, false)) * 0.2f) + 0.8f;
            if (this.drawable != null) {
                int width = getWidth() / 2;
                int paddingTop = (getPaddingTop() + (getHeight() - getPaddingBottom())) / 2;
                this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                canvas.scale(f, f, width, paddingTop);
                Drawable drawable = this.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                    if (anonymousClass11 != null) {
                        if (animatedEmojiDrawable.cacheType == 8) {
                            jCurrentTimeMillis = 0;
                        }
                        anonymousClass11.setCurrentTime(jCurrentTimeMillis);
                    }
                }
                this.drawable.draw(canvas);
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            Drawable drawable = this.drawable;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).addView(this);
            }
            this.attached = true;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Drawable drawable = this.drawable;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(this);
            }
            this.attached = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.direction == 0 ? 0.0f : 6.66f) + 3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp((this.direction != 0 ? 0.0f : 6.66f) + 3.0f));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }

        public void setDirection(int i) {
            this.direction = i;
            invalidate();
        }

        public void setImageDrawable(Drawable drawable) {
            Drawable drawable2 = this.drawable;
            if (drawable2 instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable2).removeView(this);
            }
            this.drawable = drawable;
            if ((drawable instanceof AnimatedEmojiDrawable) && this.attached) {
                ((AnimatedEmojiDrawable) drawable).addView(this);
            }
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            invalidate();
        }
    }

    public SuggestEmojiView(Context context, int i, ChatActivity.AnonymousClass39 anonymousClass39, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.direction = 0;
        this.horizontalPadding = AndroidUtilities.dp(10.0f);
        this.lastLangChangedTime = 0L;
        this.currentAccount = i;
        this.enterView = anonymousClass39;
        this.resourcesProvider = resourcesProvider;
        postDelayed(new LaunchActivity$$ExternalSyntheticLambda42(i, 10), 260L);
    }

    public ContentPreviewViewer.ContentPreviewViewerDelegate getPreviewDelegate() {
        if (this.previewDelegate == null) {
            this.previewDelegate = new AnonymousClass1();
        }
        return this.previewDelegate;
    }

    public final void createListView$1() {
        if (this.listView != null) {
            return;
        }
        this.path = new Path();
        this.circlePath = new Path();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(getContext());
        this.containerView = anonymousClass2;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.showFloat1 = new AnimatedFloat(anonymousClass2, 120L, 350L, cubicBezierInterpolator);
        this.showFloat2 = new AnimatedFloat(this.containerView, 150L, 600L, cubicBezierInterpolator);
        new OvershootInterpolator(0.4f);
        this.leftGradientAlpha = new AnimatedFloat(300L, this.containerView, cubicBezierInterpolator);
        this.rightGradientAlpha = new AnimatedFloat(300L, this.containerView, cubicBezierInterpolator);
        this.arrowXAnimated = new AnimatedFloat(200L, this.containerView, cubicBezierInterpolator);
        this.listViewCenterAnimated = new AnimatedFloat(350L, this.containerView, cubicBezierInterpolator);
        this.listViewWidthAnimated = new AnimatedFloat(350L, this.containerView, cubicBezierInterpolator);
        ?? r0 = new RecyclerListView(getContext()) {
            public boolean left;
            public boolean right;

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                SuggestEmojiView suggestEmojiView = SuggestEmojiView.this;
                return super.onInterceptTouchEvent(motionEvent) || contentPreviewViewer.onInterceptTouchEvent(motionEvent, suggestEmojiView.listView, suggestEmojiView.getPreviewDelegate(), this.resourcesProvider);
            }

            @Override
            public final void onScrolled(int i, int i2) {
                boolean zCanScrollHorizontally = canScrollHorizontally(-1);
                boolean zCanScrollHorizontally2 = canScrollHorizontally(1);
                if (this.left == zCanScrollHorizontally && this.right == zCanScrollHorizontally2) {
                    return;
                }
                AnonymousClass2 anonymousClass3 = SuggestEmojiView.this.containerView;
                if (anonymousClass3 != null) {
                    anonymousClass3.invalidate();
                }
                this.left = zCanScrollHorizontally;
                this.right = zCanScrollHorizontally2;
            }
        };
        this.listView = r0;
        Adapter adapter = new Adapter(this);
        this.adapter = adapter;
        r0.setAdapter(adapter);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(45L);
        defaultItemAnimator.translationInterpolator = cubicBezierInterpolator;
        setItemAnimator(defaultItemAnimator);
        setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, this.resourcesProvider));
        AnonymousClass3 anonymousClass3 = this.listView;
        PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61 = new PhotoViewer$$ExternalSyntheticLambda61(this, 2);
        anonymousClass3.setOnItemClickListener(photoViewer$$ExternalSyntheticLambda61);
        setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda22(5, this, photoViewer$$ExternalSyntheticLambda61));
        this.containerView.addView(this.listView, LayoutHelper.createFrame(52.0f, -1));
        addView(this.containerView, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(66.66f), 80));
        AnchorViewDelegate anchorViewDelegate = this.enterView;
        if (anchorViewDelegate != null) {
            anchorViewDelegate.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 18));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newEmojiSuggestionsAvailable) {
            ArrayList arrayList = this.keywordResults;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            fireUpdate();
            return;
        }
        if (i != NotificationCenter.emojiLoaded || this.listView == null) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f = this.listViewWidthAnimated.value;
        float f2 = this.listViewCenterAnimated.value;
        RectF rectF = AndroidUtilities.rectTmp;
        float f3 = f / 2.0f;
        rectF.set(getTranslationX() + (f2 - f3) + anonymousClass3.getPaddingLeft(), getPaddingTop() + getTop(), Math.min(getTranslationX() + f2 + f3 + getPaddingLeft(), getWidth() - this.containerView.getPaddingRight()), getBottom());
        rectF.offset(this.containerView.getX(), this.containerView.getY());
        if (this.show && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int emojiCacheType() {
        return 2;
    }

    public final void fireUpdate() {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.updateRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
        }
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda2 = new SeekBarView$$ExternalSyntheticLambda1(this, 26);
        this.updateRunnable = seekBarView$$ExternalSyntheticLambda2;
        AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda2, 16L);
    }

    public final void forceClose() {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.updateRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            this.updateRunnable = null;
        }
        this.show = false;
        this.forceClose = true;
        AnonymousClass2 anonymousClass2 = this.containerView;
        if (anonymousClass2 != null) {
            anonymousClass2.invalidate();
        }
    }

    public AnchorViewDelegate getDelegate() {
        return this.enterView;
    }

    public int getDirection() {
        return this.direction;
    }

    @Override
    public final boolean isShown() {
        return this.show;
    }

    public final boolean lambda$createListView$2(PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.listView, photoViewer$$ExternalSyntheticLambda61, getPreviewDelegate(), this.resourcesProvider);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
    }

    public void setDelegate(AnchorViewDelegate anchorViewDelegate) {
        this.enterView = anchorViewDelegate;
    }

    public void setDirection(int i) {
        if (this.direction != i) {
            this.direction = i;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i) {
        this.horizontalPadding = i;
    }
}
