package org.telegram.ui.Components.Reactions;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.IMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public final class ReactionsLayoutInBubble {
    public static int animationUniq;
    public int animateFromTotalHeight;
    public boolean animateHeight;
    public boolean animateMove;
    public boolean animateWidth;
    public boolean attached;
    public float drawServiceShaderBackground;
    public int fromWidth;
    public float fromX;
    public float fromY;
    public boolean hasPaidReaction;
    public boolean hasUnreadReactions;
    public int height;
    public boolean isEmpty;
    public boolean isSmall;
    public int lastDrawTotalHeight;
    public int lastDrawnWidth;
    public float lastDrawnX;
    public float lastDrawnY;
    public int lastLineX;
    public ReactionButton lastSelectedButton;
    public float lastX;
    public float lastY;
    public ShareAlert$$ExternalSyntheticLambda29 longPressRunnable;
    public MessageObject messageObject;
    public final BaseCell parentView;
    public int positionOffsetY;
    public boolean pressed;
    public Theme.ResourcesProvider resourcesProvider;
    public boolean scrimDirection;
    public float scrimProgress;
    public Integer scrimViewReaction;
    public boolean tags;
    public int totalHeight;
    public final float touchSlop;
    public boolean wasDrawn;
    public int width;
    public int x;
    public int y;
    public static final Paint paint = new Paint(1);
    public static final Paint tagPaint = new Paint(1);
    public static final Paint cutTagPaint = new Paint(1);
    public static final TextPaint textPaint = new TextPaint(1);
    public static final ButtonsComparator comparator = new ButtonsComparator();
    public static int pointer = 1;
    public static final ChatActivity$$ExternalSyntheticLambda18 usersComparator = new ChatActivity$$ExternalSyntheticLambda18(19);
    public final ArrayList reactionButtons = new ArrayList();
    public final ArrayList outButtons = new ArrayList();
    public final HashMap lastDrawingReactionButtons = new HashMap();
    public final HashMap lastDrawingReactionButtonsTmp = new HashMap();
    public final HashMap animatedReactions = new HashMap();
    public final ArrayList reactionLineWidths = new ArrayList();
    public final RectF scrimRect = new RectF();
    public final Rect scrimRect2 = new Rect();
    public final int currentAccount = UserConfig.selectedAccount;

    public final class ButtonsComparator implements Comparator {
        public long dialogId;

        @Override
        public final int compare(Object obj, Object obj2) {
            int i;
            int i2;
            int i3;
            int i4;
            ReactionButton reactionButton = (ReactionButton) obj;
            ReactionButton reactionButton2 = (ReactionButton) obj2;
            if (this.dialogId >= 0) {
                boolean z = reactionButton.paid;
                if (z != reactionButton2.paid) {
                    return z ? -1 : 1;
                }
                boolean z2 = reactionButton.isSelected;
                if (z2 != reactionButton2.isSelected) {
                    return z2 ? -1 : 1;
                }
                if (z2 && (i3 = reactionButton.choosenOrder) != (i4 = reactionButton2.choosenOrder)) {
                    return i3 - i4;
                }
                i = reactionButton.reactionCount.lastDrawnPosition;
                i2 = reactionButton2.reactionCount.lastDrawnPosition;
            } else {
                boolean z3 = reactionButton.paid;
                if (z3 != reactionButton2.paid) {
                    return z3 ? -1 : 1;
                }
                int i5 = reactionButton.realCount;
                int i6 = reactionButton2.realCount;
                if (i5 != i6) {
                    return i6 - i5;
                }
                i = reactionButton.reactionCount.lastDrawnPosition;
                i2 = reactionButton2.reactionCount.lastDrawnPosition;
            }
            return i - i2;
        }
    }

    public abstract class ReactionButton {
        public int animateFromWidth;
        public int animateFromX;
        public int animateFromY;
        public final AnimatedEmojiDrawable animatedEmojiDrawable;
        public int animatedEmojiDrawableColor;
        public int animationType;
        public boolean attached;
        public AvatarsDrawable avatarsDrawable;
        public int backgroundColor;
        public final ButtonBounce bounce;
        public boolean choosen;
        public final int choosenOrder;
        public int count;
        public final CounterView.CounterDrawable counterDrawable;
        public final int currentAccount;
        public boolean drawBgOnlyIfChosen;
        public int fromBackgroundColor;
        public int fromTagDotColor;
        public int fromTextColor;
        public boolean hasName;
        public int height;
        public final ImageReceiver imageReceiver;
        public boolean inGroup;
        public boolean isSelected;
        public final boolean isSmall;
        public boolean isTag;
        public String key;
        public int lastDrawnBackgroundColor;
        public int lastDrawnTagDotColor;
        public int lastDrawnTextColor;
        public boolean lastImageDrawn;
        public boolean lastScrimProgressDirection;
        public final String name;
        public final boolean paid;
        public final View parentView;
        public final StarsReactionsSheet.Particles particles;
        public AnimatedEmojiDrawable previewAnimatedEmojiDrawable;
        public ImageReceiver previewImageReceiver;
        public final TLRPC.Reaction reaction;
        public final TLRPC.ReactionCount reactionCount;
        public int realCount;
        public final Theme.ResourcesProvider resourcesProvider;
        public final AnimatedTextView.AnimatedTextDrawable scrimPreviewCounterDrawable;
        public int serviceBackgroundColor;
        public int serviceTextColor;
        public final RLottieDrawable starDrawable;
        public int textColor;
        public final AnimatedTextView.AnimatedTextDrawable textDrawable;
        public int top;
        public ArrayList users;
        public final VisibleReaction visibleReaction;
        public int width;
        public int x;
        public int y;
        public boolean drawImage = true;
        public final Rect drawingImageRect = new Rect();
        public final RectF bounds = new RectF();
        public final RectF rect2 = new RectF();
        public final Path tagPath = new Path();

        public ReactionButton(ReactionButton reactionButton, int i, View view, TLRPC.ReactionCount reactionCount, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            StarsReactionsSheet.Particles particles;
            RLottieDrawable rLottieDrawable;
            RichDetailsCell.AnonymousClass1 anonymousClass1 = new RichDetailsCell.AnonymousClass1(this, 7);
            this.currentAccount = i;
            this.parentView = view;
            this.bounce = new ButtonBounce(view, 1.0f, 5.0f);
            this.resourcesProvider = resourcesProvider;
            this.isTag = z2;
            if (reactionButton != null) {
                this.counterDrawable = reactionButton.counterDrawable;
            }
            if (this.imageReceiver == null) {
                this.imageReceiver = new ImageReceiver();
            }
            if (this.counterDrawable == null) {
                this.counterDrawable = new CounterView.CounterDrawable(view, false, null);
            }
            if (this.textDrawable == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
                this.textDrawable = animatedTextDrawable;
                animatedTextDrawable.ignoreRTL = true;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.4f;
                animatedTextDrawable.animateDuration = 320L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
                animatedTextDrawable.setCallback(anonymousClass1);
                animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
                animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
            }
            if (this.scrimPreviewCounterDrawable == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, false, true);
                this.scrimPreviewCounterDrawable = animatedTextDrawable2;
                animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
                animatedTextDrawable2.setCallback(anonymousClass1);
                animatedTextDrawable2.textPaint.setTypeface(AndroidUtilities.bold());
                animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
                animatedTextDrawable2.scaleAmplitude = 0.35f;
            }
            this.reactionCount = reactionCount;
            TLRPC.Reaction reaction = reactionCount.reaction;
            this.reaction = reaction;
            VisibleReaction visibleReactionFromTL = VisibleReaction.fromTL(reaction);
            this.visibleReaction = visibleReactionFromTL;
            int i2 = reactionCount.count;
            this.count = i2;
            this.choosen = reactionCount.chosen;
            this.realCount = i2;
            this.choosenOrder = reactionCount.chosen_order;
            this.isSmall = z;
            if (reaction instanceof TLRPC.TL_reactionPaid) {
                this.key = "stars";
            } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                this.key = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            } else {
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                    throw new RuntimeException("unsupported");
                }
                this.key = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
            }
            this.imageReceiver.setParentView(view);
            this.isSelected = reactionCount.chosen;
            CounterView.CounterDrawable counterDrawable = this.counterDrawable;
            counterDrawable.updateVisibility = false;
            counterDrawable.shortFormat = true;
            if (reaction != null) {
                if (visibleReactionFromTL.isStar) {
                    this.paid = true;
                    if (LiteMode.isEnabled(8200)) {
                        if (reactionButton == null || (rLottieDrawable = reactionButton.starDrawable) == null) {
                            this.starDrawable = new RLottieDrawable(R.raw.star_reaction_click, "star_reaction_click", AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
                        } else {
                            this.starDrawable = rLottieDrawable;
                        }
                        this.imageReceiver.setImageBitmap(this.starDrawable);
                    } else {
                        this.imageReceiver.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                    }
                    if (reactionButton == null || (particles = reactionButton.particles) == null) {
                        particles = new StarsReactionsSheet.Particles(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                    }
                    this.particles = particles;
                } else if (visibleReactionFromTL.emojicon != null) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i).getReactionsMap().get(visibleReactionFromTL.emojicon);
                    if (tL_availableReaction != null) {
                        this.imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f), "webp", tL_availableReaction, 1);
                    }
                } else if (visibleReactionFromTL.documentId != 0) {
                    this.animatedEmojiDrawable = new AnimatedEmojiDrawable(getCacheType(), i, visibleReactionFromTL.documentId);
                }
            }
            this.counterDrawable.setSize(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
            this.counterDrawable.textPaint = ReactionsLayoutInBubble.textPaint;
            if (z2) {
                String savedTagName = MessagesController.getInstance(i).getSavedTagName(reaction);
                this.name = savedTagName;
                this.hasName = !TextUtils.isEmpty(savedTagName);
            }
            if (this.hasName) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = this.textDrawable;
                animatedTextDrawable3.setText(Emoji.replaceEmoji(this.name, animatedTextDrawable3.textPaint.getFontMetricsInt(), false), !LocaleController.isRTL, true);
                if (this instanceof SearchTagsList.TagButton.AnonymousClass1) {
                    Integer.toString(reactionCount.count);
                    this.counterDrawable.setCount(this.count, false);
                } else {
                    this.counterDrawable.setCount(0, false);
                }
            } else {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable4 = this.textDrawable;
                if (animatedTextDrawable4 != null) {
                    animatedTextDrawable4.setText("", false, true);
                }
                Integer.toString(reactionCount.count);
                this.counterDrawable.setCount(this.count, false);
            }
            CounterView.CounterDrawable counterDrawable2 = this.counterDrawable;
            counterDrawable2.type = 2;
            counterDrawable2.gravity = 3;
        }

        public final void attach() {
            this.attached = true;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
            AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
            if (avatarsDrawable != null) {
                avatarsDrawable.onAttachedToWindow();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this.parentView);
            }
        }

        public final void detach() {
            this.attached = false;
            ImageReceiver imageReceiver = this.imageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
            AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
            if (avatarsDrawable != null) {
                avatarsDrawable.onDetachedFromWindow();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this.parentView);
            }
            detachPreview();
        }

        public final void detachPreview() {
            ImageReceiver imageReceiver = this.previewImageReceiver;
            if (imageReceiver == null && this.previewAnimatedEmojiDrawable == null) {
                return;
            }
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.previewImageReceiver = null;
            } else if (this.previewAnimatedEmojiDrawable != null) {
                View view = this.parentView;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.previewAnimatedEmojiDrawable.removeView(view);
                this.previewAnimatedEmojiDrawable = null;
            }
        }

        public final void draw(Canvas canvas, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5) {
            int i;
            float f6;
            float f7;
            float f8;
            boolean z3;
            float f9;
            float f10;
            float fIsNotEmpty;
            float f11;
            float f12;
            float f13;
            int iDp;
            int iDp2;
            Paint paint;
            MessageDrawable currentBackgroundDrawable;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : this.imageReceiver;
            boolean z4 = this.isSmall;
            Rect rect = this.drawingImageRect;
            if (z4 && imageReceiver != null) {
                imageReceiver.setAlpha(f4);
                rect.set((int) f, (int) f2, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                imageReceiver.setImageCoords(rect);
                imageReceiver.setRoundRadius(0);
                drawImage(canvas, rect, f4);
                return;
            }
            boolean z5 = this.choosen;
            View view = this.parentView;
            boolean z6 = this.paid;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z5) {
                if (z6) {
                    this.backgroundColor = -1529086;
                    this.textColor = -1;
                    this.serviceTextColor = -1;
                    this.serviceBackgroundColor = -1529086;
                } else {
                    this.backgroundColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, resourcesProvider);
                    this.textColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonTextSelected : Theme.key_chat_inReactionButtonTextSelected, resourcesProvider);
                    if (view instanceof ChatActionCell) {
                        this.serviceTextColor = Theme.getColor(Theme.key_chat_reactionServiceButtonTextSelected, resourcesProvider);
                        this.serviceBackgroundColor = Theme.getColor(Theme.key_chat_reactionServiceButtonBackgroundSelected, resourcesProvider);
                    } else {
                        this.serviceTextColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, resourcesProvider);
                        this.serviceBackgroundColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble, resourcesProvider);
                    }
                }
                i = 0;
            } else if (z6) {
                this.textColor = -1529086;
                this.backgroundColor = 1088989954;
                this.serviceTextColor = -1;
                i = 0;
                this.serviceBackgroundColor = 0;
            } else {
                this.textColor = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonText : Theme.key_chat_inReactionButtonText, resourcesProvider);
                int color = Theme.getColor(isOutOwner() ? Theme.key_chat_outReactionButtonBackground : Theme.key_chat_inReactionButtonBackground, resourcesProvider);
                this.backgroundColor = color;
                this.backgroundColor = ColorUtils.setAlphaComponent(color, (int) (Color.alpha(color) * 0.156f));
                this.serviceTextColor = Theme.getColor(Theme.key_chat_serviceText, resourcesProvider);
                i = 0;
                this.serviceBackgroundColor = 0;
            }
            if (this.drawBgOnlyIfChosen) {
                this.backgroundColor = i;
                this.serviceBackgroundColor = i;
            }
            updateColors(f3);
            TextPaint textPaint = ReactionsLayoutInBubble.textPaint;
            textPaint.setColor(this.lastDrawnTextColor);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
            if (animatedTextDrawable != null) {
                int i2 = this.lastDrawnTextColor;
                animatedTextDrawable.textPaint.setColor(i2);
                animatedTextDrawable.alpha = Color.alpha(i2);
            }
            Paint paint2 = ReactionsLayoutInBubble.paint;
            paint2.setColor(this.lastDrawnBackgroundColor);
            boolean z7 = this.isTag && drawTagDot() && Color.alpha(this.lastDrawnTagDotColor) == 0;
            if (f4 != 1.0f) {
                f6 = 1.0f;
                textPaint.setAlpha((int) (textPaint.getAlpha() * f4));
                paint2.setAlpha((int) (paint2.getAlpha() * f4));
            } else {
                f6 = 1.0f;
            }
            if (imageReceiver != null) {
                imageReceiver.setAlpha(f4);
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.scrimPreviewCounterDrawable;
            if (f5 > 0.0f) {
                f7 = 0.0f;
                if (this.lastScrimProgressDirection != z2) {
                    if (z2) {
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_BACK;
                        animatedTextDrawable2.moveAmplitude = 0.6f;
                        animatedTextDrawable2.animateDuration = 650L;
                        animatedTextDrawable2.animateWave = 1.6f;
                        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
                        animatedTextDrawable2.setText(AndroidUtilities.formatWholeNumber(this.count, 0), false, true);
                        animatedTextDrawable2.setText(LocaleController.formatNumber(this.count, ','), true, true);
                    } else {
                        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                        animatedTextDrawable2.moveAmplitude = 0.6f;
                        animatedTextDrawable2.animateDuration = 320L;
                        animatedTextDrawable2.animateWave = 1.6f;
                        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator2;
                        animatedTextDrawable2.setText(AndroidUtilities.formatWholeNumber(this.count, 0), true, true);
                    }
                    this.lastScrimProgressDirection = z2;
                } else {
                    animatedTextDrawable = animatedTextDrawable;
                    z6 = z6;
                }
            } else {
                animatedTextDrawable = animatedTextDrawable;
                z6 = z6;
                f7 = 0.0f;
            }
            float scale = this.bounce.getScale(0.1f);
            int iM = this.width;
            if (f5 <= 0.0f || this.isTag || animatedTextDrawable2 == null || this.avatarsDrawable != null) {
                f8 = 8.0f;
                if (f3 != f6 && this.animationType == 3) {
                    iM = (int) DiffUtil.m(1.0f, f3, this.animateFromWidth, iM * f3);
                }
            } else {
                iM = (int) (animatedTextDrawable2.getCurrentWidth() + AndroidUtilities.dp(animatedEmojiDrawable != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
                int i3 = this.lastDrawnTextColor;
                f8 = 8.0f;
                animatedTextDrawable2.textPaint.setColor(i3);
                animatedTextDrawable2.alpha = Color.alpha(i3);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float f14 = iM;
            rectF.set(f, f2, f + f14, this.height + f2);
            if (scale != 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, (f14 / 2.0f) + f, (this.height / 2.0f) + f2);
                z3 = true;
            } else {
                z3 = false;
            }
            float f15 = this.height / 2.0f;
            if (getDrawServiceShaderBackground() <= f7 || this.drawBgOnlyIfChosen) {
                f9 = 2.0f;
            } else {
                Paint themePaint = Theme.getThemePaint("paintChatActionBackground", resourcesProvider);
                Paint themePaint2 = Theme.getThemePaint("paintChatActionBackgroundDarken", resourcesProvider);
                f9 = 2.0f;
                int alpha = themePaint.getAlpha();
                int alpha2 = themePaint2.getAlpha();
                themePaint.setAlpha((int) (alpha * f4 * getDrawServiceShaderBackground()));
                themePaint2.setAlpha((int) (alpha2 * f4 * getDrawServiceShaderBackground()));
                drawRoundRect(canvas, rectF, f15, themePaint);
                if (resourcesProvider == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService()) {
                    drawRoundRect(canvas, rectF, f15, themePaint2);
                }
                themePaint.setAlpha(alpha);
                themePaint2.setAlpha(alpha2);
            }
            if (z && getDrawServiceShaderBackground() < 1.0f && (view instanceof ChatMessageCell) && (currentBackgroundDrawable = ((ChatMessageCell) view).getCurrentBackgroundDrawable(false)) != null && !this.isTag) {
                canvas.drawRoundRect(rectF, f15, f15, currentBackgroundDrawable.paint);
            }
            if (z7) {
                rectF.right += AndroidUtilities.dp(4.0f);
                canvas.saveLayerAlpha(rectF, 255, 31);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            if (this.particles != null) {
                LiteMode.isEnabled(8200);
            }
            drawRoundRect(canvas, rectF, f15, paint2);
            if (this.isTag && drawTagDot()) {
                if (z7) {
                    paint = ReactionsLayoutInBubble.cutTagPaint;
                } else {
                    paint = ReactionsLayoutInBubble.tagPaint;
                    paint.setColor(this.lastDrawnTagDotColor);
                    paint.setAlpha((int) (paint.getAlpha() * f4));
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint);
            }
            if (z7) {
                canvas.restore();
            }
            if (imageReceiver != null) {
                if (z6) {
                    iDp = AndroidUtilities.dp(22.0f);
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else if (animatedEmojiDrawable != 0) {
                    iDp = AndroidUtilities.dp(24.0f);
                    iDp2 = AndroidUtilities.dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                } else {
                    iDp = AndroidUtilities.dp(20.0f);
                    iDp2 = AndroidUtilities.dp(f8);
                    imageReceiver.setRoundRadius(0);
                }
                int i4 = (int) ((this.height - iDp) / f9);
                if (this.isTag) {
                    iDp2 -= AndroidUtilities.dp(f9);
                }
                int i5 = ((int) f) + iDp2;
                int i6 = ((int) f2) + i4;
                rect.set(i5, i6, i5 + iDp, iDp + i6);
                f10 = f4;
                drawImage(canvas, rect, f10);
            } else {
                f10 = f4;
            }
            if (animatedTextDrawable == null || animatedTextDrawable.isNotEmpty() <= f7) {
                fIsNotEmpty = 0.0f;
            } else {
                canvas.save();
                if (!this.hasName || drawTagDot()) {
                    f13 = this.hasName ? 9 : 8;
                } else {
                    f13 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f13) + f + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f9), f2);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = animatedTextDrawable;
                animatedTextDrawable3.setBounds(0, 0, this.width, this.height);
                animatedTextDrawable3.draw(canvas);
                animatedTextDrawable3.alpha = (int) (f10 * 255.0f);
                canvas.restore();
                fIsNotEmpty = (animatedTextDrawable3.isNotEmpty() * AndroidUtilities.dp(4.0f)) + animatedTextDrawable3.getCurrentWidth();
            }
            if (f5 <= 0.0f || this.isTag || animatedTextDrawable2 == null || this.avatarsDrawable != null) {
                CounterView.CounterDrawable counterDrawable = this.counterDrawable;
                if (counterDrawable != null && drawCounter()) {
                    canvas.save();
                    if (!this.hasName || drawTagDot()) {
                        f11 = this.hasName ? 9 : 8;
                    } else {
                        f11 = 10.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(f11) + f + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(animatedEmojiDrawable == 0 ? 2.0f : 5.0f) + fIsNotEmpty + (z6 ? -AndroidUtilities.dp(1.0f) : 0), f2);
                    counterDrawable.draw(canvas);
                    canvas.restore();
                }
            } else {
                canvas.save();
                if (!this.hasName || drawTagDot()) {
                    f12 = this.hasName ? 9 : 8;
                } else {
                    f12 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f12) + f + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(animatedEmojiDrawable == 0 ? 2.0f : 5.0f), f2 - AndroidUtilities.dp(1.0f));
                animatedTextDrawable2.setBounds(0, 0, this.width, this.height);
                animatedTextDrawable2.draw(canvas);
                animatedTextDrawable2.alpha = (int) (255.0f * f10);
                canvas.restore();
            }
            if (!this.isTag && this.avatarsDrawable != null) {
                canvas.save();
                canvas.translate(f + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f9), f2);
                AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
                avatarsDrawable.overrideAlpha = f10;
                if (avatarsDrawable.transitionInProgress && avatarsDrawable.transitionProgress != f3) {
                    avatarsDrawable.transitionProgress = f3;
                    if (f3 == 1.0f) {
                        avatarsDrawable.swapStates();
                        avatarsDrawable.transitionInProgress = false;
                    }
                }
                this.avatarsDrawable.onDraw(canvas);
                canvas.restore();
            }
            if (z3) {
                canvas.restore();
            }
        }

        public boolean drawCounter() {
            int i = this.count;
            return ((i == 0 || (this.isTag && !this.hasName && i == 1)) && this.counterDrawable.countChangeProgress == 1.0f) ? false : true;
        }

        public final void drawImage(Canvas canvas, Rect rect, float f) {
            ImageReceiver imageReceiver;
            boolean z;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || (imageReceiver = animatedEmojiDrawable.imageReceiver) == null) {
                imageReceiver = this.imageReceiver;
            }
            if (imageReceiver != null && rect != null) {
                imageReceiver.setImageCoords(rect);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 != null && this.animatedEmojiDrawableColor != this.lastDrawnTextColor) {
                int i = this.lastDrawnTextColor;
                this.animatedEmojiDrawableColor = i;
                animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            if (!this.drawImage || (!this.paid && this.realCount <= 1 && isPlaying() && this.isSelected)) {
                imageReceiver.setAlpha(0.0f);
                imageReceiver.draw(canvas);
                this.lastImageDrawn = false;
                return;
            }
            ImageReceiver imageReceiver2 = getImageReceiver();
            if (imageReceiver2 != null) {
                z = imageReceiver2.getLottieAnimation() == null || !imageReceiver2.getLottieAnimation().hasBitmap();
                if (f != 1.0f) {
                    imageReceiver2.setAlpha(f);
                    if (f <= 0.0f) {
                        imageReceiver2.onDetachedFromWindow();
                        removeImageReceiver();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null && !imageReceiver2.getLottieAnimation().isRunning) {
                    float alpha = imageReceiver2.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        imageReceiver2.onDetachedFromWindow();
                        removeImageReceiver();
                    } else {
                        imageReceiver2.setAlpha(alpha);
                    }
                    this.parentView.invalidate();
                    z = true;
                }
                imageReceiver2.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                imageReceiver2.draw(canvas);
            } else {
                z = true;
            }
            if (z) {
                imageReceiver.draw(canvas);
            }
            this.lastImageDrawn = true;
        }

        public final boolean drawOverlay(Canvas canvas, float f, float f2) {
            StarsReactionsSheet.Particles particles = this.particles;
            if (particles == null || !LiteMode.isEnabled(8200) || !LiteMode.isEnabled(131072)) {
                return false;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f, f2, this.width + f, this.height + f2);
            float f3 = this.height / 2.0f;
            particles.bounds.set(rectF);
            particles.bounds.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            RectF rectF2 = particles.bounds;
            rectF2.set(rectF2);
            particles.removeParticlesOutside();
            boolean zProcess = particles.process();
            particles.draw(canvas, ColorUtils.blendARGB(getDrawServiceShaderBackground(), ColorUtils.setAlphaComponent(this.backgroundColor, 255), ColorUtils.blendARGB(0.4f, this.serviceTextColor, ColorUtils.setAlphaComponent(this.backgroundColor, 255))), 1.0f);
            if (this.isSelected) {
                Path path = this.tagPath;
                path.rewind();
                path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                particles.draw(canvas, this.textColor, 1.0f);
                canvas.restore();
            }
            return zProcess;
        }

        public final void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            if (!this.isTag) {
                canvas.drawRoundRect(rectF, f, f, paint);
                return;
            }
            RectF rectF2 = this.bounds;
            float f2 = rectF2.left;
            float f3 = rectF.left;
            Path path = this.tagPath;
            if (f2 != f3 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                ReactionsLayoutInBubble.fillTagPath(rectF2, this.rect2, path);
            }
            canvas.drawPath(path, paint);
        }

        public boolean drawTagDot() {
            return true;
        }

        public int getCacheType() {
            return this.isTag ? 18 : 3;
        }

        public float getDrawServiceShaderBackground() {
            return 0.0f;
        }

        public ImageReceiver getImageReceiver() {
            return null;
        }

        public boolean isOutOwner() {
            return false;
        }

        public boolean isPlaying() {
            return false;
        }

        public void removeImageReceiver() {
        }

        public final void setUsers(ArrayList arrayList) {
            this.users = arrayList;
            if (arrayList != null) {
                Collections.sort(arrayList, ReactionsLayoutInBubble.usersComparator);
                if (this.avatarsDrawable == null) {
                    AvatarsDrawable avatarsDrawable = new AvatarsDrawable(this.parentView, false);
                    this.avatarsDrawable = avatarsDrawable;
                    avatarsDrawable.transitionDuration = 250L;
                    CubicBezierInterpolator cubicBezierInterpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
                    avatarsDrawable.overrideSize = AndroidUtilities.dp(20.0f);
                    this.avatarsDrawable.width = AndroidUtilities.dp(100.0f);
                    AvatarsDrawable avatarsDrawable2 = this.avatarsDrawable;
                    avatarsDrawable2.height = this.height;
                    avatarsDrawable2.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
                }
                if (this.attached) {
                    this.avatarsDrawable.onAttachedToWindow();
                }
                for (int i = 0; i < arrayList.size() && i != 3; i++) {
                    this.avatarsDrawable.setObject(i, (TLObject) arrayList.get(i), this.currentAccount);
                }
                this.avatarsDrawable.commitTransition(false, true);
            }
        }

        public final void startAnimation() {
            ImageReceiver imageReceiver;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || (imageReceiver = animatedEmojiDrawable.imageReceiver) == null) {
                imageReceiver = this.imageReceiver;
            }
            if (imageReceiver != null) {
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.restart(true);
                    return;
                }
                AnimatedFileDrawable animation = imageReceiver.getAnimation();
                if (animation != null) {
                    animation.start();
                }
            }
        }

        public void updateColors(float f) {
            this.lastDrawnTextColor = ColorUtils.blendARGB(f, this.fromTextColor, ColorUtils.blendARGB(getDrawServiceShaderBackground(), this.textColor, this.serviceTextColor));
            int iBlendARGB = ColorUtils.blendARGB(f, this.fromBackgroundColor, ColorUtils.blendARGB(getDrawServiceShaderBackground(), this.backgroundColor, this.serviceBackgroundColor));
            this.lastDrawnBackgroundColor = iBlendARGB;
            this.lastDrawnTagDotColor = ColorUtils.blendARGB(f, this.fromTagDotColor, AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.8f ? 0 : 1526726655);
        }
    }

    public final class ReactionLayoutButton extends ReactionButton {
        public ReactionLayoutButton(ReactionButton reactionButton, TLRPC.ReactionCount reactionCount, boolean z, boolean z2) {
            super(reactionButton, ReactionsLayoutInBubble.this.currentAccount, ReactionsLayoutInBubble.this.parentView, reactionCount, z, z2, ReactionsLayoutInBubble.this.resourcesProvider);
        }

        @Override
        public final float getDrawServiceShaderBackground() {
            return ReactionsLayoutInBubble.this.drawServiceShaderBackground;
        }

        @Override
        public final ImageReceiver getImageReceiver() {
            return (ImageReceiver) ReactionsLayoutInBubble.this.animatedReactions.get(this.visibleReaction);
        }

        @Override
        public final boolean isOutOwner() {
            return ReactionsLayoutInBubble.this.messageObject.isOutOwner();
        }

        @Override
        public final boolean isPlaying() {
            int i;
            ReactionsLayoutInBubble reactionsLayoutInBubble = ReactionsLayoutInBubble.this;
            int id = reactionsLayoutInBubble.messageObject.getId();
            long groupId = reactionsLayoutInBubble.messageObject.getGroupId();
            ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.currentOverlay;
            if (reactionsEffectOverlay != null && ((i = reactionsEffectOverlay.animationType) == 2 || i == 0)) {
                long j = reactionsEffectOverlay.groupId;
                if (((j != 0 && groupId == j) || id == reactionsEffectOverlay.messageId) && reactionsEffectOverlay.reaction.equals(this.visibleReaction)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void removeImageReceiver() {
            ReactionsLayoutInBubble.this.animatedReactions.remove(this.visibleReaction);
        }
    }

    public ReactionsLayoutInBubble(BaseCell baseCell) {
        this.parentView = baseCell;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(Theme.key_chat_inLoader, resourcesProvider));
        TextPaint textPaint2 = textPaint;
        textPaint2.setColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        cutTagPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean equalsTLReaction(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id;
    }

    public static void fillTagPath(RectF rectF, RectF rectF2, Path path) {
        path.rewind();
        float f = rectF.left;
        rectF2.set(f, rectF.top, AndroidUtilities.dp(12.0f) + f, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        float f2 = rectF.height() > ((float) AndroidUtilities.dp(26.0f)) ? 1.4f : 0.0f;
        float fDpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float fDpf3 = fDpf2 - AndroidUtilities.dpf2(0.056f);
        float fDpf4 = AndroidUtilities.dpf2(1.22f) + fDpf2;
        float fDpf5 = AndroidUtilities.dpf2(3.07f) + fDpf2;
        float fDpf6 = AndroidUtilities.dpf2(2.406f) + fDpf2;
        float fDpf7 = AndroidUtilities.dpf2(8.27f + f2) + fDpf2;
        float fDpf8 = AndroidUtilities.dpf2(8.923f + f2) + fDpf2;
        float fDpf9 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float fDpf10 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float fDpf11 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float fDpf12 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f3 = 10.263f + f2;
        float fDpf13 = AndroidUtilities.dpf2(f3) + rectF.top;
        float fDpf14 = rectF.bottom - AndroidUtilities.dpf2(f3);
        float f4 = f2 + 11.333f;
        float fDpf15 = AndroidUtilities.dpf2(f4) + rectF.top;
        float fDpf16 = rectF.bottom - AndroidUtilities.dpf2(f4);
        path.lineTo(fDpf3, rectF.bottom);
        path.cubicTo(fDpf4, rectF.bottom, fDpf6, fDpf12, fDpf5, fDpf10);
        path.lineTo(fDpf7, fDpf14);
        path.cubicTo(fDpf8, fDpf16, fDpf8, fDpf15, fDpf7, fDpf13);
        path.lineTo(fDpf5, fDpf9);
        float f5 = rectF.top;
        path.cubicTo(fDpf6, fDpf11, fDpf4, f5, fDpf3, f5);
        path.close();
    }

    public final boolean animateChange() {
        ArrayList arrayList;
        boolean z;
        AvatarsDrawable avatarsDrawable;
        AvatarsDrawable avatarsDrawable2;
        int i;
        ArrayList arrayList2;
        long j;
        long j2;
        CounterView.CounterDrawable counterDrawable;
        if (this.messageObject == null) {
            return false;
        }
        HashMap map = this.lastDrawingReactionButtonsTmp;
        map.clear();
        int i2 = 0;
        while (true) {
            arrayList = this.outButtons;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((ReactionButton) arrayList.get(i2)).detach();
            i2++;
        }
        arrayList.clear();
        map.putAll(this.lastDrawingReactionButtons);
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.reactionButtons;
            if (i3 >= arrayList3.size()) {
                break;
            }
            ReactionButton reactionButton = (ReactionButton) arrayList3.get(i3);
            ReactionButton reactionButton2 = (ReactionButton) map.get(reactionButton.key);
            if (reactionButton2 != null && reactionButton.isSmall != reactionButton2.isSmall) {
                reactionButton2 = null;
            }
            if (reactionButton2 != null) {
                map.remove(reactionButton.key);
                int i4 = reactionButton.x;
                int i5 = reactionButton2.x;
                if (i4 == i5 && reactionButton.y == reactionButton2.y && reactionButton.width == reactionButton2.width && reactionButton.count == reactionButton2.count && reactionButton.choosen == reactionButton2.choosen && reactionButton.avatarsDrawable == null && reactionButton2.avatarsDrawable == null) {
                    reactionButton.animationType = 0;
                } else {
                    reactionButton.animateFromX = i5;
                    reactionButton.animateFromY = reactionButton2.y;
                    reactionButton.animateFromWidth = reactionButton2.width;
                    reactionButton.fromTextColor = reactionButton2.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = reactionButton2.lastDrawnBackgroundColor;
                    reactionButton.fromTagDotColor = reactionButton2.lastDrawnTagDotColor;
                    reactionButton.animationType = 3;
                    int i6 = reactionButton.count;
                    int i7 = reactionButton2.count;
                    if (i6 != i7 && (counterDrawable = reactionButton.counterDrawable) != null) {
                        counterDrawable.setCount(i7, false);
                        counterDrawable.setCount(reactionButton.count, true);
                    }
                    AvatarsDrawable avatarsDrawable3 = reactionButton.avatarsDrawable;
                    if (avatarsDrawable3 != null || reactionButton2.avatarsDrawable != null) {
                        if (avatarsDrawable3 == null) {
                            reactionButton.setUsers(new ArrayList());
                        }
                        if (reactionButton2.avatarsDrawable == null) {
                            reactionButton2.setUsers(new ArrayList());
                        }
                        ArrayList arrayList4 = reactionButton2.users;
                        ArrayList arrayList5 = reactionButton.users;
                        if (arrayList4 == null || arrayList5 == null || arrayList4.size() != arrayList5.size()) {
                            avatarsDrawable = reactionButton.avatarsDrawable;
                            if (avatarsDrawable == null && (avatarsDrawable2 = reactionButton2.avatarsDrawable) != null) {
                                ValueAnimator valueAnimator = avatarsDrawable2.transitionProgressAnimator;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    if (avatarsDrawable.transitionInProgress) {
                                        avatarsDrawable.transitionInProgress = false;
                                        avatarsDrawable.swapStates();
                                    }
                                }
                                TLObject[] tLObjectArr = new TLObject[3];
                                int i8 = 0;
                                while (true) {
                                    i = this.currentAccount;
                                    if (i8 >= 3) {
                                        break;
                                    }
                                    tLObjectArr[i8] = avatarsDrawable.currentStates[i8].object;
                                    avatarsDrawable.setObject(i8, avatarsDrawable2.currentStates[i8].object, i);
                                    i8++;
                                }
                                avatarsDrawable.commitTransition(false, true);
                                for (int i9 = 0; i9 < 3; i9++) {
                                    avatarsDrawable.setObject(i9, tLObjectArr[i9], i);
                                }
                                avatarsDrawable.wasDraw = true;
                                avatarsDrawable.commitTransition(true, false);
                            }
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < arrayList4.size()) {
                                    TLObject tLObject = (TLObject) arrayList4.get(i10);
                                    TLObject tLObject2 = (TLObject) arrayList5.get(i10);
                                    if (tLObject != null && tLObject2 != null) {
                                        long j3 = 0;
                                        if (tLObject instanceof TLRPC.User) {
                                            arrayList2 = arrayList4;
                                            j = ((TLRPC.User) tLObject).id;
                                        } else {
                                            arrayList2 = arrayList4;
                                            j = tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).id : 0L;
                                        }
                                        if (tLObject2 instanceof TLRPC.User) {
                                            j2 = ((TLRPC.User) tLObject2).id;
                                        } else {
                                            if (tLObject2 instanceof TLRPC.Chat) {
                                                j2 = ((TLRPC.Chat) tLObject2).id;
                                            }
                                            if (j != j3) {
                                                i10++;
                                                arrayList4 = arrayList2;
                                            }
                                        }
                                        j3 = j2;
                                        if (j != j3) {
                                            i10++;
                                            arrayList4 = arrayList2;
                                        }
                                    }
                                    avatarsDrawable = reactionButton.avatarsDrawable;
                                    if (avatarsDrawable == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i3++;
            } else {
                reactionButton.animationType = 1;
            }
            z2 = true;
            i3++;
        }
        if (!map.isEmpty()) {
            arrayList.addAll(map.values());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((ReactionButton) arrayList.get(i11)).drawImage = ((ReactionButton) arrayList.get(i11)).lastImageDrawn;
                ((ReactionButton) arrayList.get(i11)).attach();
            }
            z2 = true;
        }
        if (this.wasDrawn) {
            float f = this.lastDrawnX;
            if (f == this.x && this.lastDrawnY == this.y) {
                z = true;
            } else {
                z = true;
                this.animateMove = true;
                this.fromX = f;
                this.fromY = this.lastDrawnY;
                z2 = true;
            }
        } else {
            z = true;
        }
        int i12 = this.lastDrawnWidth;
        if (i12 != this.width) {
            this.animateWidth = z;
            this.fromWidth = i12;
            z2 = true;
        }
        int i13 = this.lastDrawTotalHeight;
        if (i13 == this.totalHeight) {
            return z2;
        }
        this.animateHeight = z;
        this.animateFromTotalHeight = i13;
        return z;
    }

    public final void animateReaction(VisibleReaction visibleReaction) {
        int i = 0;
        if (visibleReaction.documentId == 0) {
            HashMap map = this.animatedReactions;
            if (map.get(visibleReaction) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.parentView);
                int i2 = animationUniq;
                animationUniq = i2 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i2));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                map.put(visibleReaction, imageReceiver);
                return;
            }
        }
        if (!this.tags || visibleReaction.documentId == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.reactionButtons;
            if (i >= arrayList.size()) {
                return;
            }
            if (visibleReaction.isSame(((ReactionButton) arrayList.get(i)).reaction)) {
                ((ReactionButton) arrayList.get(i)).startAnimation();
                return;
            }
            i++;
        }
    }

    public final boolean checkTouchEvent(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        if (this.isEmpty || this.isSmall || (messageObject = this.messageObject) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        BaseCell baseCell = this.parentView;
        if (SurfaceContainer$$ExternalSyntheticOutline0.m6m((Object) baseCell)) {
            y -= baseCell.getPaddingTop();
            if (baseCell instanceof ChatActionCell) {
                x -= ((ChatActionCell) baseCell).sideMenuWidth / 2.0f;
            }
        }
        float f = x - this.x;
        float f2 = y - this.y;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.reactionButtons;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (f > ((ReactionButton) arrayList.get(i)).x && f < ((ReactionButton) arrayList.get(i)).x + ((ReactionButton) arrayList.get(i)).width && f2 > ((ReactionButton) arrayList.get(i)).y && f2 < ((ReactionButton) arrayList.get(i)).y + ((ReactionButton) arrayList.get(i)).height) {
                    this.lastX = motionEvent.getX();
                    this.lastY = y;
                    this.lastSelectedButton = (ReactionButton) arrayList.get(i);
                    ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = this.longPressRunnable;
                    if (shareAlert$$ExternalSyntheticLambda29 != null) {
                        AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda29);
                        this.longPressRunnable = null;
                    }
                    this.lastSelectedButton.bounce.setPressed(true);
                    ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = new ShareAlert$$ExternalSyntheticLambda29(11, this, this.lastSelectedButton);
                    this.longPressRunnable = shareAlert$$ExternalSyntheticLambda210;
                    AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda210, ViewConfiguration.getLongPressTimeout());
                    this.pressed = true;
                    break;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z = this.pressed;
            float f3 = this.touchSlop;
            if ((z && Math.abs(motionEvent.getX() - this.lastX) > f3) || Math.abs(y - this.lastY) > f3) {
                this.pressed = false;
                ReactionButton reactionButton = this.lastSelectedButton;
                if (reactionButton != null) {
                    reactionButton.bounce.setPressed(false);
                }
                this.lastSelectedButton = null;
                ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda211 = this.longPressRunnable;
                if (shareAlert$$ExternalSyntheticLambda211 != null) {
                    AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda211);
                    this.longPressRunnable = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda212 = this.longPressRunnable;
            if (shareAlert$$ExternalSyntheticLambda212 != null) {
                AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda212);
                this.longPressRunnable = null;
            }
            if (this.pressed && this.lastSelectedButton != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.lastSelectedButton.reactionCount;
                float x2 = motionEvent.getX();
                if (SurfaceContainer$$ExternalSyntheticOutline0.m6m((Object) baseCell)) {
                    ((IMessageCell) baseCell).didPressReactionFromLayout(reactionCount, false, x2, y);
                }
            }
            this.pressed = false;
            ReactionButton reactionButton2 = this.lastSelectedButton;
            if (reactionButton2 != null) {
                reactionButton2.bounce.setPressed(false);
            }
            this.lastSelectedButton = null;
        }
        return this.pressed;
    }

    public final void draw(Canvas canvas, float f, Integer num) {
        float f2;
        Canvas canvas2 = canvas;
        boolean z = this.isEmpty;
        ArrayList arrayList = this.outButtons;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f3 = this.x;
        float f4 = this.y;
        if (this.isEmpty) {
            f3 = this.lastDrawnX;
            f4 = this.lastDrawnY;
        } else if (this.animateMove) {
            float f5 = 1.0f - f;
            f3 = (f3 * f) + (this.fromX * f5);
            f4 = (f4 * f) + (this.fromY * f5);
        }
        float f6 = f3;
        float f7 = f4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.reactionButtons;
            if (i2 >= arrayList2.size()) {
                break;
            }
            ReactionButton reactionButton = (ReactionButton) arrayList2.get(i2);
            if (this.scrimViewReaction == null && num == null && this.scrimProgress < 0.5f) {
                reactionButton.detachPreview();
            }
            if (!Integer.valueOf(reactionButton.reaction.hashCode()).equals(this.scrimViewReaction) && (num == null || reactionButton.reaction.hashCode() == num.intValue())) {
                canvas2.save();
                float f8 = reactionButton.x;
                float f9 = reactionButton.y;
                if (f != 1.0f && reactionButton.animationType == 3) {
                    float f10 = 1.0f - f;
                    f8 = (f8 * f) + (reactionButton.animateFromX * f10);
                    f9 = (f9 * f) + (reactionButton.animateFromY * f10);
                }
                if (f == 1.0f || reactionButton.animationType != 1) {
                    f2 = 1.0f;
                } else {
                    float f11 = (f * 0.5f) + 0.5f;
                    canvas2.scale(f11, f11, (reactionButton.width / 2.0f) + f6 + f8, (reactionButton.height / 2.0f) + f7 + f9);
                    f2 = f;
                }
                reactionButton.draw(canvas2, f8 + f6, f9 + f7, reactionButton.animationType == 3 ? f : 1.0f, f2, num != null, this.scrimDirection, this.scrimProgress);
                canvas2.restore();
            }
            i2++;
        }
        while (i < arrayList.size()) {
            ReactionButton reactionButton2 = (ReactionButton) arrayList.get(i);
            float f12 = 1.0f - f;
            float f13 = (f12 * 0.5f) + 0.5f;
            canvas2.save();
            canvas2.scale(f13, f13, (reactionButton2.width / 2.0f) + reactionButton2.x + f6, (reactionButton2.height / 2.0f) + reactionButton2.y + f7);
            ((ReactionButton) arrayList.get(i)).draw(canvas2, reactionButton2.x + f6, reactionButton2.y + f7, 1.0f, f12, false, this.scrimDirection, this.scrimProgress);
            canvas.restore();
            i++;
            canvas2 = canvas;
        }
    }

    public final void drawOverlay(Canvas canvas, float f) {
        boolean z = this.isEmpty;
        ArrayList arrayList = this.outButtons;
        if (z && arrayList.isEmpty()) {
            return;
        }
        float f2 = this.x;
        float f3 = this.y;
        float f4 = 1.0f;
        if (this.isEmpty) {
            f2 = this.lastDrawnX;
            f3 = this.lastDrawnY;
        } else if (this.animateMove) {
            float f5 = 1.0f - f;
            f2 = (f2 * f) + (this.fromX * f5);
            f3 = (f3 * f) + (this.fromY * f5);
        }
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.reactionButtons;
            if (i >= arrayList2.size()) {
                break;
            }
            ReactionButton reactionButton = (ReactionButton) arrayList2.get(i);
            if (reactionButton.paid) {
                canvas.save();
                float f6 = reactionButton.x;
                float f7 = reactionButton.y;
                if (f != f4 && reactionButton.animationType == 3) {
                    float f8 = 1.0f - f;
                    f6 = (f6 * f) + (reactionButton.animateFromX * f8);
                    f7 = (f7 * f) + (reactionButton.animateFromY * f8);
                }
                if (f != f4 && reactionButton.animationType == 1) {
                    float f9 = (f * 0.5f) + 0.5f;
                    canvas.scale(f9, f9, (reactionButton.width / 2.0f) + f2 + f6, (reactionButton.height / 2.0f) + f3 + f7);
                }
                z2 = z2 || reactionButton.drawOverlay(canvas, f6 + f2, f7 + f3);
                canvas.restore();
            }
            i++;
            f4 = 1.0f;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ReactionButton reactionButton2 = (ReactionButton) arrayList.get(i2);
            if (reactionButton2.paid) {
                float f10 = ((1.0f - f) * 0.5f) + 0.5f;
                canvas.save();
                canvas.scale(f10, f10, (reactionButton2.width / 2.0f) + reactionButton2.x + f2, (reactionButton2.height / 2.0f) + reactionButton2.y + f3);
                boolean z3 = z2 || ((ReactionButton) arrayList.get(i2)).drawOverlay(canvas, ((float) reactionButton2.x) + f2, ((float) reactionButton2.y) + f3);
                canvas.restore();
                z2 = z3;
            }
        }
    }

    public final void drawPreview(ChatActivity.ChatActivityFragmentView chatActivityFragmentView, Canvas canvas, int i, Integer num) {
        if (this.isEmpty && this.outButtons.isEmpty()) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.reactionButtons;
            if (i2 >= arrayList.size()) {
                return;
            }
            ReactionButton reactionButton = (ReactionButton) arrayList.get(i2);
            if ((num == null || reactionButton.reaction.hashCode() == num.intValue()) && num != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(reactionButton.drawingImageRect);
                float fDp = AndroidUtilities.dp(140.0f);
                float fDp2 = AndroidUtilities.dp(14.0f);
                BaseCell baseCell = this.parentView;
                float fClamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), ((baseCell instanceof ChatMessageCell ? ((ChatMessageCell) baseCell).getParentWidth() : AndroidUtilities.displaySize.x) - fDp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                RectF rectF2 = this.scrimRect;
                float f = rectF.top - fDp2;
                float f2 = i;
                rectF2.set(fClamp, (f - fDp) + f2, fDp + fClamp, f + f2);
                float interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.scrimProgress);
                AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                if (reactionButton.previewImageReceiver == null && reactionButton.previewAnimatedEmojiDrawable == null) {
                    View view = reactionButton.parentView;
                    if (view != null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    if (reactionButton.reaction != null) {
                        VisibleReaction visibleReaction = reactionButton.visibleReaction;
                        if (!visibleReaction.isStar) {
                            String str = visibleReaction.emojicon;
                            int i3 = reactionButton.currentAccount;
                            if (str != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i3).getReactionsMap().get(visibleReaction.emojicon);
                                if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, Theme.key_windowBackgroundGray, 1.0f);
                                    ImageReceiver imageReceiver = new ImageReceiver(view);
                                    reactionButton.previewImageReceiver = imageReceiver;
                                    imageReceiver.setLayerNum(7);
                                    reactionButton.previewImageReceiver.onAttachedToWindow();
                                    reactionButton.previewImageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    reactionButton.previewImageReceiver.setAllowStartLottieAnimation(true);
                                    reactionButton.previewImageReceiver.setAllowStartAnimation(true);
                                    reactionButton.previewImageReceiver.setAutoRepeat(1);
                                    reactionButton.previewImageReceiver.setAllowDecodeSingleFrame(true);
                                    reactionButton.previewImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                }
                            } else if (visibleReaction.documentId != 0) {
                                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(24, i3, visibleReaction.documentId);
                                reactionButton.previewAnimatedEmojiDrawable = animatedEmojiDrawable;
                                animatedEmojiDrawable.addView(view);
                            }
                        }
                    }
                }
                this.scrimRect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                if (interpolation > 0.0f) {
                    ImageReceiver imageReceiver2 = reactionButton.previewImageReceiver;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rectF2);
                        reactionButton.previewImageReceiver.setAlpha(interpolation);
                        reactionButton.previewImageReceiver.draw(canvas);
                    } else {
                        AnimatedEmojiDrawable animatedEmojiDrawable2 = reactionButton.previewAnimatedEmojiDrawable;
                        if (animatedEmojiDrawable2 != null) {
                            animatedEmojiDrawable2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            reactionButton.previewAnimatedEmojiDrawable.setAlpha((int) (interpolation * 255.0f));
                            reactionButton.previewAnimatedEmojiDrawable.draw(canvas);
                        }
                    }
                    chatActivityFragmentView.invalidate();
                }
            }
            i2++;
        }
    }

    public final float getCurrentTotalHeight(float f) {
        if (!this.animateHeight) {
            return this.totalHeight;
        }
        return (this.totalHeight * f) + ((1.0f - f) * this.animateFromTotalHeight);
    }

    public final ReactionButton getReactionButton(VisibleReaction visibleReaction) {
        String string;
        if (visibleReaction.isStar) {
            string = "stars";
        } else {
            String str = visibleReaction.emojicon;
            string = str != null ? str : Long.toString(visibleReaction.documentId);
        }
        return getReactionButton(string);
    }

    public final void measure(int i, int i2) {
        ArrayList arrayList;
        this.height = 0;
        this.width = 0;
        this.positionOffsetY = 0;
        this.totalHeight = 0;
        if (this.isEmpty) {
            return;
        }
        ArrayList arrayList2 = this.reactionLineWidths;
        arrayList2.clear();
        int i3 = 0;
        int iM = 0;
        int i4 = 0;
        int iM2 = 0;
        int i5 = 0;
        while (true) {
            arrayList = this.reactionButtons;
            if (i3 >= arrayList.size()) {
                break;
            }
            ReactionButton reactionButton = (ReactionButton) arrayList.get(i3);
            if (reactionButton.isSmall) {
                reactionButton.width = AndroidUtilities.dp(14.0f);
                reactionButton.height = AndroidUtilities.dp(14.0f);
            } else {
                boolean z = reactionButton.isTag;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = reactionButton.textDrawable;
                CounterView.CounterDrawable counterDrawable = reactionButton.counterDrawable;
                if (z) {
                    reactionButton.width = AndroidUtilities.dp(42.0f);
                    reactionButton.height = AndroidUtilities.dp(26.0f);
                    if (reactionButton.hasName) {
                        reactionButton.width = (int) (animatedTextDrawable.currentWidth + AndroidUtilities.dp(8.0f) + reactionButton.width);
                    } else if (counterDrawable != null && reactionButton.count > 1) {
                        reactionButton.width = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((int) Math.ceil(counterDrawable.countLayoutWidth), 8.0f, reactionButton.width);
                    }
                } else {
                    reactionButton.width = AndroidUtilities.dp(reactionButton.animatedEmojiDrawable != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                    if (reactionButton.avatarsDrawable != null && reactionButton.users.size() > 0) {
                        reactionButton.users.size();
                        reactionButton.width = (int) ((AndroidUtilities.dp(20.0f) * (reactionButton.users.size() > 1 ? reactionButton.users.size() - 1 : 0) * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + reactionButton.width);
                        reactionButton.avatarsDrawable.height = AndroidUtilities.dp(26.0f);
                    } else if (reactionButton.hasName) {
                        reactionButton.width = (int) (animatedTextDrawable.currentWidth + AndroidUtilities.dp(8.0f) + reactionButton.width);
                    } else if (((int) Math.ceil(counterDrawable.countLayoutWidth)) > 0) {
                        reactionButton.width = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((int) Math.ceil(counterDrawable.countLayoutWidth), 8.0f, reactionButton.width);
                    } else {
                        reactionButton.width -= AndroidUtilities.dp(1.0f);
                    }
                    reactionButton.height = AndroidUtilities.dp(26.0f);
                }
            }
            if (reactionButton.width + iM > i) {
                arrayList2.add(Integer.valueOf(iM));
                iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(reactionButton.height, 4.0f, iM2);
                i5++;
                iM = 0;
            }
            reactionButton.x = iM;
            reactionButton.y = iM2;
            reactionButton.top = i5;
            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(reactionButton.width, 4.0f, iM);
            if (iM > i4) {
                i4 = iM;
            }
            i3++;
        }
        arrayList2.add(Integer.valueOf(iM));
        if (i2 == 5 && !arrayList.isEmpty()) {
            int i6 = ((ReactionButton) arrayList.get(0)).y;
            int i7 = 0;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (((ReactionButton) arrayList.get(i8)).y != i6) {
                    int i9 = i8 - 1;
                    int i10 = i - (((ReactionButton) arrayList.get(i9)).x + ((ReactionButton) arrayList.get(i9)).width);
                    while (i7 < i8) {
                        ((ReactionButton) arrayList.get(i7)).x += i10;
                        i7++;
                    }
                    i7 = i8;
                }
            }
            int size = arrayList.size() - 1;
            int i11 = i - (((ReactionButton) arrayList.get(size)).x + ((ReactionButton) arrayList.get(size)).width);
            while (i7 <= size) {
                ((ReactionButton) arrayList.get(i7)).x += i11;
                i7++;
            }
        } else if (i2 == 1 && !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ReactionButton reactionButton2 = (ReactionButton) arrayList.get(i12);
                int i13 = reactionButton2.top;
                reactionButton2.x = (int) ImageReceiver$$ExternalSyntheticOutline0.m(i, (i13 < 0 || i13 >= arrayList2.size()) ? 0.0f : ((Integer) arrayList2.get(reactionButton2.top)).intValue(), 2.0f, reactionButton2.x);
            }
        }
        this.lastLineX = iM;
        if (i2 == 5 || i2 == 1) {
            this.width = i;
        } else {
            this.width = i4;
        }
        this.height = iM2 + (arrayList.size() == 0 ? 0 : AndroidUtilities.dp(26.0f));
        this.drawServiceShaderBackground = 0.0f;
    }

    public final void onDetachFromWindow() {
        int i = 0;
        this.attached = false;
        while (true) {
            ArrayList arrayList = this.reactionButtons;
            if (i >= arrayList.size()) {
                break;
            }
            ((ReactionButton) arrayList.get(i)).detach();
            i++;
        }
        HashMap map = this.animatedReactions;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ImageReceiver) it.next()).onDetachedFromWindow();
            }
        }
        map.clear();
    }

    public final void recordDrawingState() {
        HashMap map = this.lastDrawingReactionButtons;
        map.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.reactionButtons;
            if (i >= arrayList.size()) {
                this.wasDrawn = !this.isEmpty;
                this.lastDrawnX = this.x;
                this.lastDrawnY = this.y;
                this.lastDrawnWidth = this.width;
                this.lastDrawTotalHeight = this.totalHeight;
                return;
            }
            map.put(((ReactionButton) arrayList.get(i)).key, (ReactionButton) arrayList.get(i));
            i++;
        }
    }

    public final void setMessage(MessageObject messageObject, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        boolean z3;
        TLRPC.ReactionCount tL_reactionCount;
        ReactionButton reactionButton;
        int i;
        int i2;
        ReactionsLayoutInBubble reactionsLayoutInBubble = this;
        boolean z4 = z;
        boolean z5 = z2;
        reactionsLayoutInBubble.resourcesProvider = resourcesProvider;
        reactionsLayoutInBubble.isSmall = z4;
        reactionsLayoutInBubble.tags = z5;
        reactionsLayoutInBubble.messageObject = messageObject;
        ArrayList arrayList = reactionsLayoutInBubble.reactionButtons;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ?? r9 = 0;
        reactionsLayoutInBubble.hasUnreadReactions = false;
        reactionsLayoutInBubble.hasPaidReaction = false;
        arrayList.clear();
        if (messageObject != null) {
            long dialogId = messageObject.getDialogId();
            ButtonsComparator buttonsComparator = comparator;
            buttonsComparator.dialogId = dialogId;
            TLRPC.TL_messageReactions tL_messageReactions = messageObject.messageOwner.reactions;
            if (tL_messageReactions != null && tL_messageReactions.results != null) {
                int i3 = 0;
                for (int i4 = 0; i4 < messageObject.messageOwner.reactions.results.size(); i4++) {
                    i3 += messageObject.messageOwner.reactions.results.get(i4).count;
                }
                int i5 = reactionsLayoutInBubble.currentAccount;
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i5).getChatFull(-messageObject.getDialogId());
                if (z4 || messageObject.messageOwner.reactions.results.isEmpty() || chatFull == null || !chatFull.paid_reactions_available) {
                    z3 = false;
                } else {
                    boolean z6 = false;
                    for (int i6 = 0; i6 < messageObject.messageOwner.reactions.results.size(); i6++) {
                        TLRPC.Reaction reaction = messageObject.messageOwner.reactions.results.get(i6).reaction;
                        if (reaction instanceof TLRPC.TL_reactionPaid) {
                            z6 = true;
                        }
                        if (reaction instanceof TLRPC.TL_reactionEmoji) {
                            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                            TextUtils.equals("👍", str);
                            TextUtils.equals("👎", str);
                        }
                    }
                    if (z6) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if (z3) {
                    arrayList3.add(new TLRPC.TL_reactionPaid());
                }
                int i7 = -arrayList3.size();
                while (true) {
                    if (i7 >= messageObject.messageOwner.reactions.results.size()) {
                        break;
                        break;
                    }
                    if (i7 < 0) {
                        tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = (TLRPC.Reaction) arrayList3.get(arrayList3.size() + i7);
                        tL_reactionCount.chosen = r9;
                        tL_reactionCount.count = r9;
                    } else {
                        tL_reactionCount = messageObject.messageOwner.reactions.results.get(i7);
                    }
                    TLRPC.ReactionCount reactionCount = tL_reactionCount;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList2.size()) {
                            reactionButton = null;
                            break;
                        }
                        reactionButton = (ReactionButton) arrayList2.get(i8);
                        if (reactionButton.reaction.equals(reactionCount.reaction)) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    ReactionLayoutButton reactionLayoutButton = reactionsLayoutInBubble.new ReactionLayoutButton(reactionButton, reactionCount, z4, z5);
                    reactionLayoutButton.inGroup = messageObject.hasValidGroupId();
                    arrayList.add(reactionLayoutButton);
                    reactionsLayoutInBubble.hasPaidReaction = reactionsLayoutInBubble.hasPaidReaction || reactionLayoutButton.paid;
                    if (z || z2 || messageObject.messageOwner.reactions.recent_reactions == null) {
                        i = i3;
                        i2 = i5;
                    } else {
                        long dialogId2 = messageObject.getDialogId();
                        CounterView.CounterDrawable counterDrawable = reactionLayoutButton.counterDrawable;
                        if (dialogId2 > 0 && !UserObject.isReplyUser(messageObject.getDialogId())) {
                            ArrayList arrayList4 = new ArrayList();
                            TLRPC.User currentUser = UserConfig.getInstance(i5).getCurrentUser();
                            TLRPC.User user = MessagesController.getInstance(i5).getUser(Long.valueOf(messageObject.getDialogId()));
                            if (reactionCount.count == 2) {
                                if (currentUser != null) {
                                    arrayList4.add(currentUser);
                                }
                                if (user != null) {
                                    arrayList4.add(user);
                                }
                            } else if (reactionCount.chosen) {
                                if (currentUser != null) {
                                    arrayList4.add(currentUser);
                                }
                            } else if (user != null) {
                                arrayList4.add(user);
                            }
                            reactionLayoutButton.setUsers(arrayList4);
                            if (!arrayList4.isEmpty()) {
                                reactionLayoutButton.count = 0;
                                counterDrawable.setCount(0, false);
                            }
                        } else if (reactionCount.count <= 3 && i3 <= 3) {
                            ArrayList arrayList5 = null;
                            int i9 = 0;
                            while (i9 < messageObject.messageOwner.reactions.recent_reactions.size()) {
                                TLRPC.MessagePeerReaction messagePeerReaction = messageObject.messageOwner.reactions.recent_reactions.get(i9);
                                VisibleReaction visibleReactionFromTL = VisibleReaction.fromTL(messagePeerReaction.reaction);
                                VisibleReaction visibleReactionFromTL2 = VisibleReaction.fromTL(reactionCount.reaction);
                                int i10 = i9;
                                int i11 = i3;
                                int i12 = i5;
                                TLObject userOrChat = MessagesController.getInstance(i5).getUserOrChat(MessageObject.getPeerId(messagePeerReaction.peer_id));
                                if (visibleReactionFromTL.equals(visibleReactionFromTL2) && userOrChat != null) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(userOrChat);
                                }
                                i9 = i10 + 1;
                                i3 = i11;
                                i5 = i12;
                            }
                            i = i3;
                            i2 = i5;
                            reactionLayoutButton.setUsers(arrayList5);
                            if (arrayList5 != null && !arrayList5.isEmpty()) {
                                reactionLayoutButton.count = 0;
                                counterDrawable.setCount(0, false);
                            }
                        }
                        i = i3;
                        i2 = i5;
                    }
                    if (z && reactionCount.count > 1 && reactionCount.chosen) {
                        reactionsLayoutInBubble = this;
                        ReactionLayoutButton reactionLayoutButton2 = reactionsLayoutInBubble.new ReactionLayoutButton(null, reactionCount, z, z2);
                        reactionLayoutButton2.inGroup = messageObject.hasValidGroupId();
                        arrayList.add(reactionLayoutButton2);
                        ((ReactionButton) arrayList.get(0)).isSelected = false;
                        ((ReactionButton) arrayList.get(1)).isSelected = true;
                        ((ReactionButton) arrayList.get(0)).realCount = 1;
                        ((ReactionButton) arrayList.get(1)).realCount = 1;
                        ((ReactionButton) arrayList.get(1)).key = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), ((ReactionButton) arrayList.get(1)).key, "_");
                        break;
                    }
                    reactionsLayoutInBubble = this;
                    if (z && i7 == 2) {
                        break;
                    }
                    if (reactionsLayoutInBubble.attached) {
                        reactionLayoutButton.attach();
                    }
                    i7++;
                    z4 = z;
                    z5 = z2;
                    i3 = i;
                    i5 = i2;
                    r9 = 0;
                }
            } else {
                break;
            }
            if (!z && !arrayList.isEmpty()) {
                Collections.sort(arrayList, buttonsComparator);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    TLRPC.ReactionCount reactionCount2 = ((ReactionButton) arrayList.get(i13)).reactionCount;
                    int i14 = pointer;
                    pointer = i14 + 1;
                    reactionCount2.lastDrawnPosition = i14;
                }
            }
            reactionsLayoutInBubble.hasUnreadReactions = MessageObject.hasUnreadReactions(messageObject.messageOwner);
        }
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            ((ReactionButton) arrayList2.get(i15)).detach();
        }
        reactionsLayoutInBubble.isEmpty = arrayList.isEmpty();
    }

    public final ReactionButton getReactionButton(String str) {
        boolean z = this.isSmall;
        HashMap map = this.lastDrawingReactionButtons;
        if (z) {
            ReactionButton reactionButton = (ReactionButton) map.get(str + "_");
            if (reactionButton != null) {
                return reactionButton;
            }
        }
        return (ReactionButton) map.get(str);
    }

    public final class VisibleReaction {
        public long documentId;
        public long effectId;
        public String emojicon;
        public long hash;
        public boolean isEffect;
        public boolean isStar;
        public boolean premium;
        public boolean sticker;

        public static VisibleReaction fromEmojicon(String str) {
            if (str == null) {
                str = "";
            }
            VisibleReaction visibleReaction = new VisibleReaction();
            if (!str.startsWith("animated_")) {
                visibleReaction.emojicon = str;
                visibleReaction.hash = str.hashCode();
                return visibleReaction;
            }
            try {
                long j = Long.parseLong(str.substring(9));
                visibleReaction.documentId = j;
                visibleReaction.hash = j;
                return visibleReaction;
            } catch (Exception unused) {
                visibleReaction.emojicon = str;
                visibleReaction.hash = str.hashCode();
                return visibleReaction;
            }
        }

        public static VisibleReaction fromTL(TLRPC.Reaction reaction) {
            VisibleReaction visibleReaction = new VisibleReaction();
            if (reaction instanceof TLRPC.TL_reactionPaid) {
                visibleReaction.isStar = true;
                return visibleReaction;
            }
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
                visibleReaction.emojicon = str;
                visibleReaction.hash = str.hashCode();
                return visibleReaction;
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                visibleReaction.documentId = j;
                visibleReaction.hash = j;
            }
            return visibleReaction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && VisibleReaction.class == obj.getClass()) {
                VisibleReaction visibleReaction = (VisibleReaction) obj;
                if (this.documentId == visibleReaction.documentId && Objects.equals(this.emojicon, visibleReaction.emojicon)) {
                    return true;
                }
            }
            return false;
        }

        public final VisibleReaction flatten() {
            String strFindAnimatedEmojiEmoticon;
            long j = this.documentId;
            return (j == 0 || (strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j), null)) == null) ? this : fromEmojicon(strFindAnimatedEmojiEmoticon);
        }

        public final int hashCode() {
            return Objects.hash(this.emojicon, Long.valueOf(this.documentId));
        }

        public final boolean isSame(TLRPC.Reaction reaction) {
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.emojicon);
            }
            return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == this.documentId;
        }

        public final String toString() {
            TLRPC.Document documentFindDocument;
            if (!TextUtils.isEmpty(this.emojicon)) {
                return this.emojicon;
            }
            long j = this.documentId;
            if (j != 0 && (documentFindDocument = AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, j)) != null) {
                return MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
            }
            StringBuilder sb = new StringBuilder("VisibleReaction{");
            sb.append(this.documentId);
            sb.append(", ");
            return MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb, this.emojicon, "}");
        }

        public final TLRPC.Reaction toTLReaction() {
            if (this.isStar) {
                return new TLRPC.TL_reactionPaid();
            }
            if (this.emojicon != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = this.emojicon;
                return tL_reactionEmoji;
            }
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = this.documentId;
            return tL_reactionCustomEmoji;
        }

        public static VisibleReaction fromTL(TLRPC.TL_availableEffect tL_availableEffect) {
            VisibleReaction visibleReaction = new VisibleReaction();
            visibleReaction.isEffect = true;
            long j = tL_availableEffect.id;
            visibleReaction.effectId = j;
            visibleReaction.sticker = tL_availableEffect.effect_animation_id == 0;
            visibleReaction.documentId = tL_availableEffect.effect_sticker_id;
            visibleReaction.hash = j;
            visibleReaction.premium = tL_availableEffect.premium_required;
            visibleReaction.emojicon = tL_availableEffect.emoticon;
            return visibleReaction;
        }
    }
}
