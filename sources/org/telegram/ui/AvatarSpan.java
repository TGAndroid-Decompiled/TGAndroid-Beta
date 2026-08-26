package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.CascadingMenuPopup;
import androidx.appcompat.view.menu.StandardMenuPopup;
import java.util.ArrayList;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CompatDrawable;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.SeekBarAccessibilityDelegate;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.PaidReactionButton;

public final class AvatarSpan extends ReplacementSpan {
    public static final int $r8$clinit = 0;
    public final AvatarDrawable avatarDrawable;
    public final int currentAccount;
    public final ImageReceiver imageReceiver;
    public boolean needDrawShadow;
    public View parent;
    public final AnonymousClass1 parentAttachListener;
    public final Paint shadowPaint;
    public int shadowPaintAlpha;
    public float sz;
    public float translateY;
    public boolean usePaintAlpha;

    public AvatarSpan(int i, ChatMessageCell chatMessageCell) {
        this(chatMessageCell, 18.0f, i);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.needDrawShadow) {
            int i6 = this.shadowPaintAlpha;
            int alpha = paint.getAlpha();
            Paint paint2 = this.shadowPaint;
            if (i6 != alpha) {
                int alpha2 = paint.getAlpha();
                this.shadowPaintAlpha = alpha2;
                paint2.setAlpha(alpha2);
                paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(this.shadowPaintAlpha / 255.0f, 855638016));
            }
            canvas.drawCircle((AndroidUtilities.dp(this.sz) / 2.0f) + f + 0.0f, ((i3 + i5) / 2.0f) + this.translateY, AndroidUtilities.dp(this.sz) / 2.0f, paint2);
        }
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(f + 0.0f, (((i3 + i5) / 2.0f) + this.translateY) - (AndroidUtilities.dp(this.sz) / 2.0f), AndroidUtilities.dp(this.sz), AndroidUtilities.dp(this.sz));
        imageReceiver.setAlpha(this.usePaintAlpha ? paint.getAlpha() / 255.0f : 1.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.sz);
    }

    public final void setChat(TLRPC.Chat chat) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(this.currentAccount, chat);
        this.imageReceiver.setForUserOrChat(chat, avatarDrawable);
    }

    public final void setImageDrawable(CombinedDrawable combinedDrawable) {
        this.imageReceiver.setImageBitmap(combinedDrawable);
    }

    public final void setParent(View view) {
        View view2 = this.parent;
        if (view2 == view) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.parentAttachListener;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(anonymousClass1);
            if (this.parent.isAttachedToWindow() && !view.isAttachedToWindow()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        View view3 = this.parent;
        if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        this.parent = view;
        imageReceiver.setParentView(view);
        if (view != null) {
            view.addOnAttachStateChangeListener(anonymousClass1);
        }
    }

    public final void setUser(TLRPC.User user) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(this.currentAccount, user);
        this.imageReceiver.setForUserOrChat(user, avatarDrawable);
    }

    public AvatarSpan(View view, float f, int i) {
        this.needDrawShadow = true;
        this.parentAttachListener = new AnonymousClass1(this, 0);
        this.shadowPaintAlpha = 255;
        this.usePaintAlpha = true;
        this.currentAccount = i;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.imageReceiver = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(f));
        this.sz = f;
        Paint paint = new Paint(1);
        this.shadowPaint = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        setParent(view);
    }

    public final class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onViewAttachedToWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    ((AvatarSpan) this.this$0).imageReceiver.onAttachedToWindow();
                    break;
                case 1:
                case 2:
                    break;
                case 3:
                    Parser parser = (Parser) this.this$0;
                    if (view == ((View) parser.delimiterProcessors)) {
                        parser.setViewTreeObserverInternal(view.getViewTreeObserver());
                    }
                    break;
                case 4:
                    ((ProfileGiftsContainer.Page.AnonymousClass6) this.this$0).addView(view);
                    break;
                case 5:
                    BlurringShader.BlurManager blurManager = (BlurringShader.BlurManager) this.this$0;
                    blurManager.parents.clear();
                    for (View view2 = blurManager.view; view2 != null; view2 = (View) view2.getParent()) {
                        blurManager.parents.add(0, view2);
                        if (!(view2.getParent() instanceof View)) {
                        }
                        break;
                    }
                    break;
                case 6:
                    break;
                case 7:
                    ((CompatDrawable) this.this$0).onAttachedToWindow();
                    break;
                case 8:
                    ReplyMessageLine replyMessageLine = (ReplyMessageLine) this.this$0;
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = replyMessageLine.emoji;
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.attach();
                    }
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = replyMessageLine.sticker;
                    if (swapAnimatedEmojiDrawable2 != null) {
                        swapAnimatedEmojiDrawable2.attach();
                    }
                    break;
                case 9:
                    break;
                case 10:
                    ((GiftSheet.CardBackground) this.this$0).pattern.attach();
                    break;
                case 11:
                    ResaleGiftsFragment.ModelItem modelItem = (ResaleGiftsFragment.ModelItem) this.this$0;
                    ResaleGiftsFragment.ModelItem.AnonymousClass2 anonymousClass2 = modelItem.emojiDrawable;
                    if (anonymousClass2 != null) {
                        anonymousClass2.addView(modelItem.imageView);
                    }
                    break;
                case 12:
                    ResaleGiftsFragment.PatternItem patternItem = (ResaleGiftsFragment.PatternItem) this.this$0;
                    ResaleGiftsFragment.PatternItem.AnonymousClass2 anonymousClass3 = patternItem.emojiDrawable;
                    if (anonymousClass3 != null) {
                        anonymousClass3.addView(patternItem.imageView);
                    }
                    break;
                case 13:
                    ((ImageReceiverSpan) this.this$0).imageReceiver.onAttachedToWindow();
                    break;
                case 14:
                    LaunchActivity launchActivity = (LaunchActivity) this.this$0;
                    launchActivity.getWindowManager().addCrossWindowBlurEnabledListener(launchActivity.blurListener);
                    break;
                case 15:
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = ((PeerColorActivity.PeerColorDrawable) this.this$0).emoji;
                    if (swapAnimatedEmojiDrawable3 != null) {
                        swapAnimatedEmojiDrawable3.attach();
                    }
                    break;
                case 16:
                    SettingsActivity.AccountCell accountCell = (SettingsActivity.AccountCell) this.this$0;
                    accountCell.botDrawable.attach();
                    accountCell.emojiStatusDrawable.attach();
                    break;
                case 17:
                    ArrayList arrayList = ((StarGiftSheet.Roller) this.this$0).models;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        StarGiftSheet.Roller.Sticker sticker = (StarGiftSheet.Roller.Sticker) obj;
                        if (sticker.mine) {
                            sticker.imageReceiver.onAttachedToWindow();
                        }
                    }
                    break;
                default:
                    ((PaidReactionButton.PaidReactionButtonEffectsView.Chip) this.this$0).imageReceiver.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public final void onViewDetachedFromWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    ((AvatarSpan) this.this$0).imageReceiver.onDetachedFromWindow();
                    break;
                case 1:
                    CascadingMenuPopup cascadingMenuPopup = (CascadingMenuPopup) this.this$0;
                    ViewTreeObserver viewTreeObserver = cascadingMenuPopup.mTreeObserver;
                    if (viewTreeObserver != null) {
                        if (!viewTreeObserver.isAlive()) {
                            cascadingMenuPopup.mTreeObserver = view.getViewTreeObserver();
                        }
                        cascadingMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(cascadingMenuPopup.mGlobalLayoutListener);
                    }
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 2:
                    StandardMenuPopup standardMenuPopup = (StandardMenuPopup) this.this$0;
                    ViewTreeObserver viewTreeObserver2 = standardMenuPopup.mTreeObserver;
                    if (viewTreeObserver2 != null) {
                        if (!viewTreeObserver2.isAlive()) {
                            standardMenuPopup.mTreeObserver = view.getViewTreeObserver();
                        }
                        standardMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(standardMenuPopup.mGlobalLayoutListener);
                    }
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 3:
                    Parser parser = (Parser) this.this$0;
                    if (view == ((View) parser.delimiterProcessors)) {
                        parser.setViewTreeObserverInternal(null);
                    }
                    break;
                case 4:
                    ((ProfileGiftsContainer.Page.AnonymousClass6) this.this$0).removeView(view);
                    break;
                case 5:
                    ((BlurringShader.BlurManager) this.this$0).parents.clear();
                    break;
                case 6:
                    Bulletin bulletin = (Bulletin) this.this$0;
                    bulletin.layout.removeOnAttachStateChangeListener(this);
                    bulletin.hide(0L, false);
                    break;
                case 7:
                    ((CompatDrawable) this.this$0).onDetachedToWindow();
                    break;
                case 8:
                    ReplyMessageLine replyMessageLine = (ReplyMessageLine) this.this$0;
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = replyMessageLine.emoji;
                    if (swapAnimatedEmojiDrawable != null) {
                        swapAnimatedEmojiDrawable.detach();
                    }
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = replyMessageLine.sticker;
                    if (swapAnimatedEmojiDrawable2 != null) {
                        swapAnimatedEmojiDrawable2.attach();
                    }
                    break;
                case 9:
                    view.removeCallbacks((Runnable) ((SeekBarAccessibilityDelegate) this.this$0).accessibilityEventRunnables.remove(view));
                    view.removeOnAttachStateChangeListener(this);
                    break;
                case 10:
                    ((GiftSheet.CardBackground) this.this$0).pattern.detach();
                    break;
                case 11:
                    ResaleGiftsFragment.ModelItem modelItem = (ResaleGiftsFragment.ModelItem) this.this$0;
                    ResaleGiftsFragment.ModelItem.AnonymousClass2 anonymousClass2 = modelItem.emojiDrawable;
                    if (anonymousClass2 != null) {
                        anonymousClass2.removeView(modelItem.imageView);
                    }
                    break;
                case 12:
                    ResaleGiftsFragment.PatternItem patternItem = (ResaleGiftsFragment.PatternItem) this.this$0;
                    ResaleGiftsFragment.PatternItem.AnonymousClass2 anonymousClass3 = patternItem.emojiDrawable;
                    if (anonymousClass3 != null) {
                        anonymousClass3.removeView(patternItem.imageView);
                    }
                    break;
                case 13:
                    ((ImageReceiverSpan) this.this$0).imageReceiver.onDetachedFromWindow();
                    break;
                case 14:
                    LaunchActivity launchActivity = (LaunchActivity) this.this$0;
                    launchActivity.getWindowManager().removeCrossWindowBlurEnabledListener(launchActivity.blurListener);
                    break;
                case 15:
                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = ((PeerColorActivity.PeerColorDrawable) this.this$0).emoji;
                    if (swapAnimatedEmojiDrawable3 != null) {
                        swapAnimatedEmojiDrawable3.detach();
                    }
                    break;
                case 16:
                    SettingsActivity.AccountCell accountCell = (SettingsActivity.AccountCell) this.this$0;
                    accountCell.botDrawable.detach();
                    accountCell.emojiStatusDrawable.detach();
                    break;
                case 17:
                    ArrayList arrayList = ((StarGiftSheet.Roller) this.this$0).models;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((StarGiftSheet.Roller.Sticker) obj).detach();
                    }
                    break;
                default:
                    ((PaidReactionButton.PaidReactionButtonEffectsView.Chip) this.this$0).imageReceiver.onDetachedFromWindow();
                    break;
            }
        }

        private final void onViewAttachedToWindow$androidx$appcompat$view$menu$CascadingMenuPopup$2(View view) {
        }

        private final void onViewAttachedToWindow$androidx$appcompat$view$menu$StandardMenuPopup$2(View view) {
        }

        private final void onViewAttachedToWindow$org$telegram$ui$Components$Bulletin$3(View view) {
        }

        private final void onViewAttachedToWindow$org$telegram$ui$Components$SeekBarAccessibilityDelegate$1(View view) {
        }
    }
}
