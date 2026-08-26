package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class MessageSendPreview extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    private WindowVisibilityManager.Controller activityVisibilityController;
    private final RecyclerView.Adapter adapter;
    public boolean allowRelayout;
    private ChatActivityEnterView.SendButton anchorSendButton;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private Paint buttonBgPaint;
    private Text buttonText;
    private RectF cameraRect;
    private Rect cellDelta;
    private final GridLayoutManagerFixed chatLayoutManager;
    private final RecyclerListView chatListView;
    private boolean closing;
    private final FrameLayout containerView;
    public final Context context;
    public final int currentAccount;
    private boolean customSendButtonWidth;
    private ChatMessageCell destCell;
    private float destClipBottom;
    private float destClipTop;
    private boolean dismissing;
    private Utilities.Callback2<Canvas, Utilities.Callback0Return<Boolean>> drawEditText;
    private Utilities.Callback<Canvas> drawEditTextBackground;
    private ChatMessageCell dummyMessageCell;
    private EditTextCaption editText;
    private Paint editTextBackgroundPaint;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable effectDrawable;
    private long effectId;
    private EmojiAnimationsOverlay effectOverlay;
    private ReactionsContainerLayout effectSelector;
    private FrameLayout effectSelectorContainer;
    private float effectSelectorContainerY;
    private boolean effectSelectorShown;
    private final FrameLayout effectsView;
    private boolean firstOpenFrame;
    private boolean firstOpenFrame2;
    private boolean focusable;
    private VisiblePart fromPart;
    private final LongSparseArray groupedMessagesMap;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private Insets insets;
    private boolean keyboardVisible;
    private boolean layoutDone;
    private ChatMessageCell mainMessageCell;
    private int mainMessageCellId;
    private final ArrayList<MessageObject> messageObjects;
    private int messageObjectsWidth;
    private int messagesContainerTopPadding;
    private ValueAnimator openAnimator;
    private boolean openInProgress;
    private float openProgress;
    private float openProgress2;
    private boolean opening;
    private View optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private boolean scrolledToLast;
    private ChatActivityEnterView.SendButton sendButton;
    private final int[] sendButtonInitialPosition;
    private int sendButtonRight;
    private int sendButtonWidth;
    private boolean sent;
    private boolean sentEffect;
    private SpoilerEffect2 spoilerEffect2;
    private final FrameLayout windowView;

    public class AnonymousClass15 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        final BaseFragment val$fragment;

        public AnonymousClass15(BaseFragment baseFragment) {
            this.val$fragment = baseFragment;
        }

        public static void lambda$onReactionClicked$0(BaseFragment baseFragment) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            baseFragment.showAsSheet(new PremiumPreviewFragment("effect"), bottomSheetParams);
        }

        @Override
        public final boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public final boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        @Override
        public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
        }

        @Override
        public final void hideMenu() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$hideMenu(this);
        }

        @Override
        public final boolean needEnterText() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
        }

        @Override
        public final void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
        }

        @Override
        public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            boolean z3;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2;
            boolean z4;
            long j;
            long j2;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = visibleReaction;
            if (visibleReaction3 == null || MessageSendPreview.this.effectSelector == null) {
                return;
            }
            boolean z5 = !UserConfig.getInstance(MessageSendPreview.this.currentAccount).isPremium() && visibleReaction3.premium;
            if (MessageSendPreview.this.mainMessageCell != null) {
                MessageObject messageObject = MessageSendPreview.this.mainMessageCell.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC.Message message = messageObject.messageOwner;
                long j3 = message.effect;
                long j4 = visibleReaction3.effectId;
                if (j4 == j3) {
                    message.flags2 &= -5;
                    message.effect = 0L;
                    z4 = true;
                } else {
                    message.flags2 |= 4;
                    message.effect = j4;
                    z4 = false;
                }
                if (z5) {
                    j = 0;
                    j2 = j3;
                } else {
                    j = 0;
                    j2 = j3;
                    MessageSendPreview.this.mainMessageCell.setMessageObject(messageObject, MessageSendPreview.this.getValidGroupedMessage(messageObject), MessageSendPreview.this.messageObjects.size() > 1, false, false);
                    MessageSendPreview.this.effectSelector.setSelectedReactionAnimated(z4 ? null : visibleReaction3);
                    if (MessageSendPreview.this.effectSelector.getReactionsWindow() != null && MessageSendPreview.this.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog != null) {
                        CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass2 = MessageSendPreview.this.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog;
                        if (z4) {
                            visibleReaction3 = null;
                        }
                        anonymousClass2.setSelectedReaction(visibleReaction3);
                        MessageSendPreview.this.effectSelector.getReactionsWindow().containerView.invalidate();
                    }
                }
                MessageSendPreview.this.effectOverlay.clear();
                if (!z4) {
                    MessageSendPreview.this.effectOverlay.showAnimationForCell(MessageSendPreview.this.mainMessageCell, 0, false, false);
                }
                if (z5) {
                    TLRPC.Message message2 = messageObject.messageOwner;
                    message2.effect = j2;
                    if (j2 == j) {
                        message2.flags2 &= -5;
                    }
                }
                if (MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setEffect(messageObject.messageOwner.effect);
                }
                MessageSendPreview.this.onEffectChange(messageObject.messageOwner.effect);
            } else if (MessageSendPreview.this.cameraRect != null) {
                if (visibleReaction3.effectId == MessageSendPreview.this.effectId) {
                    MessageSendPreview.this.effectId = 0L;
                    z3 = true;
                } else {
                    MessageSendPreview.this.effectId = visibleReaction3.effectId;
                    z3 = false;
                }
                if (MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setEffect(MessageSendPreview.this.effectId);
                }
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                messageSendPreview.onEffectChange(messageSendPreview.effectId);
                if (!z5) {
                    TLRPC.TL_availableEffect effect = MessageSendPreview.this.effectId == 0 ? null : MessagesController.getInstance(MessageSendPreview.this.currentAccount).getEffect(MessageSendPreview.this.effectId);
                    if (MessageSendPreview.this.effectDrawable == null) {
                        visibleReaction2 = null;
                    } else if (MessageSendPreview.this.effectId == 0 || effect == null) {
                        visibleReaction2 = null;
                        MessageSendPreview.this.effectDrawable.set((Drawable) null, true);
                    } else {
                        MessageSendPreview.this.effectDrawable.set((Drawable) Emoji.getEmojiDrawable(effect.emoticon), true);
                        visibleReaction2 = null;
                    }
                    MessageSendPreview.this.effectSelector.setSelectedReactionAnimated(z3 ? visibleReaction2 : visibleReaction3);
                    if (MessageSendPreview.this.effectSelector.getReactionsWindow() != null && MessageSendPreview.this.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog != null) {
                        CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass3 = MessageSendPreview.this.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog;
                        if (z3) {
                            visibleReaction3 = visibleReaction2;
                        }
                        anonymousClass3.setSelectedReaction(visibleReaction3);
                        MessageSendPreview.this.effectSelector.getReactionsWindow().containerView.invalidate();
                    }
                }
                MessageSendPreview.this.effectOverlay.clear();
                if (!z3) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.effect = MessageSendPreview.this.effectId;
                    if (MessageSendPreview.this.effectId != 0) {
                        tL_message.flags2 |= 4;
                    }
                    MessageSendPreview.this.effectOverlay.createDrawingObject(null, 0, null, new MessageObject(MessageSendPreview.this.currentAccount, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z5 && this.val$fragment != null) {
                BulletinFactory.of(MessageSendPreview.this.containerView, MessageSendPreview.this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new MessageSendPreview$15$$ExternalSyntheticLambda0(this.val$fragment, 0))).show();
            }
            MessageSendPreview.this.effectsView.invalidate();
        }
    }

    public class AnonymousClass2 extends SizeNotifierFrameLayout {
        private Paint backgroundPaint;
        int chatListViewTy;
        private GradientClip clip;
        final int[] destCellPos;
        private AnimatedFloat destCellY;
        boolean gotDestCellPos;
        final int[] pos;
        final int[] pos2;
        final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$resourcesProvider = resourcesProvider;
            this.pos = new int[2];
            this.pos2 = new int[2];
            this.chatListViewTy = 0;
            this.destCellPos = new int[2];
            this.clip = new GradientClip();
            this.destCellY = new AnimatedFloat(0L, 100L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.backgroundPaint = new Paint(1);
        }

        public Boolean lambda$dispatchDraw$0(Canvas canvas, float f) {
            canvas.save();
            canvas.translate(MessageSendPreview.this.editText.getX(), MessageSendPreview.this.editText.getY() - MessageSendPreview.this.editText.getScrollY());
            float textSize = f / MessageSendPreview.this.editText.getTextSize();
            canvas.scale(textSize, textSize, MessageSendPreview.this.editText.getPaddingLeft(), MessageSendPreview.this.editText.getPaddingTop());
            MessageSendPreview.this.editText.draw(canvas);
            canvas.restore();
            return Boolean.TRUE;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            final Canvas canvas2;
            float f;
            char c;
            float height;
            final float fLerp;
            float f2;
            char c2;
            float f3;
            if (MessageSendPreview.this.openInProgress && MessageSendPreview.this.mainMessageCell != null && MessageSendPreview.this.mainMessageCell.getCurrentPosition() == null) {
                if (MessageSendPreview.this.firstOpenFrame) {
                    if (MessageSendPreview.this.editText != null) {
                        MessageSendPreview.this.editText.setAlpha(0.0f);
                    }
                    MessageSendPreview.this.firstOpenFrame = false;
                }
                boolean z = MessageSendPreview.this.mainMessageCell.getMessageObject() != null && MessageSendPreview.this.mainMessageCell.getMessageObject().type == 15;
                float imageX = z ? MessageSendPreview.this.mainMessageCell.getPhotoImage().getImageX() : MessageSendPreview.this.mainMessageCell.getTextX();
                float imageY = z ? MessageSendPreview.this.mainMessageCell.getPhotoImage().getImageY() : MessageSendPreview.this.mainMessageCell.getTextY();
                float x = MessageSendPreview.this.mainMessageCell.getX() + MessageSendPreview.this.chatListView.getX() + imageX;
                float y = MessageSendPreview.this.mainMessageCell.getY() + MessageSendPreview.this.chatListView.getY() + imageY;
                float textSize = (MessageSendPreview.this.mainMessageCell.getMessageObject() != null ? MessageSendPreview.this.mainMessageCell.getMessageObject().getTextPaint() : Theme.chat_msgTextPaint).getTextSize();
                if (MessageSendPreview.this.editText != null) {
                    MessageSendPreview.this.editText.getLocationOnScreen(this.pos);
                    float paddingLeft = MessageSendPreview.this.editText.getPaddingLeft() + this.pos[0];
                    float paddingTop = (MessageSendPreview.this.editText.getPaddingTop() + this.pos[1]) - MessageSendPreview.this.editText.getScrollY();
                    float textSize2 = MessageSendPreview.this.editText.getTextSize();
                    int i = this.pos[1];
                    f2 = i;
                    height = MessageSendPreview.this.editText.getMeasuredHeight() + i;
                    x = AndroidUtilities.lerp(paddingLeft, x, MessageSendPreview.this.openProgress);
                    y = AndroidUtilities.lerp(paddingTop, y, MessageSendPreview.this.openProgress);
                    fLerp = AndroidUtilities.lerp(textSize2, textSize, MessageSendPreview.this.openProgress);
                } else {
                    height = getHeight();
                    fLerp = textSize;
                    f2 = 0.0f;
                }
                float f4 = MessageSendPreview.this.openProgress;
                if (MessageSendPreview.this.destCell != null) {
                    f2 = MessageSendPreview.this.destClipTop;
                }
                f = 255.0f;
                float fLerp2 = AndroidUtilities.lerp(f2, ((1.0f - MessageSendPreview.this.chatListView.getScaleY()) * MessageSendPreview.this.chatListView.getHeight()) + MessageSendPreview.this.chatListView.getY(), MessageSendPreview.this.openProgress);
                float fLerp3 = AndroidUtilities.lerp(0.0f, MessageSendPreview.this.chatListView.canScrollVertically(-1) ? 1.0f : 0.0f, MessageSendPreview.this.openProgress);
                if (MessageSendPreview.this.destCell != null) {
                    height = MessageSendPreview.this.destClipBottom;
                }
                float fLerp4 = AndroidUtilities.lerp(height, MessageSendPreview.this.chatListView.getY() + MessageSendPreview.this.chatListView.getHeight(), MessageSendPreview.this.openProgress);
                float fLerp5 = AndroidUtilities.lerp(0.0f, MessageSendPreview.this.chatListView.canScrollVertically(1) ? 1.0f : 0.0f, MessageSendPreview.this.openProgress);
                float f5 = y;
                float f6 = x;
                canvas.saveLayerAlpha(0.0f, fLerp2 + 1.0f, getWidth(), fLerp4 - 1.0f, 255, 31);
                if (MessageSendPreview.this.editText != null) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f4) * 255.0f), 31);
                    canvas2.translate(f6, f5);
                    canvas2.translate((-MessageSendPreview.this.editText.getX()) - MessageSendPreview.this.editText.getPaddingLeft(), ((-MessageSendPreview.this.editText.getY()) - MessageSendPreview.this.editText.getPaddingTop()) + MessageSendPreview.this.editText.getScrollY());
                    float alpha = MessageSendPreview.this.editText.getAlpha();
                    MessageSendPreview.this.editText.setAlpha(1.0f);
                    if (MessageSendPreview.this.openProgress >= 0.001f) {
                        f3 = alpha;
                    } else if (MessageSendPreview.this.drawEditTextBackground != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, MessageSendPreview.this.editText.getY());
                        f3 = alpha;
                        canvas2.saveLayerAlpha(MessageSendPreview.this.editText.getX() + MessageSendPreview.this.editText.getPaddingLeft(), 0.0f, ((MessageSendPreview.this.editText.getX() + MessageSendPreview.this.editText.getPaddingLeft()) + MessageSendPreview.this.editText.getWidth()) - MessageSendPreview.this.editText.getPaddingRight(), MessageSendPreview.this.editText.getHeight(), (int) ((1.0f - (MessageSendPreview.this.openProgress / 0.1f)) * 255.0f), 31);
                        MessageSendPreview.this.drawEditTextBackground.run(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f3 = alpha;
                        MessageSendPreview.this.editTextBackgroundPaint.setColor(Theme.getColor(Theme.key_chat_messagePanelBackground, this.val$resourcesProvider));
                        MessageSendPreview.this.editTextBackgroundPaint.setAlpha((int) ((1.0f - (MessageSendPreview.this.openProgress / 0.1f)) * MessageSendPreview.this.editTextBackgroundPaint.getAlpha()));
                        canvas2.drawRect(MessageSendPreview.this.editText.getPaddingLeft(), MessageSendPreview.this.editText.getY(), ((MessageSendPreview.this.editText.getX() + MessageSendPreview.this.editText.getPaddingLeft()) + MessageSendPreview.this.editText.getWidth()) - MessageSendPreview.this.editText.getPaddingRight(), MessageSendPreview.this.editText.getY() + MessageSendPreview.this.editText.getHeight(), MessageSendPreview.this.editTextBackgroundPaint);
                    }
                    if (MessageSendPreview.this.drawEditText != null) {
                        MessageSendPreview.this.drawEditText.run(canvas2, new Utilities.Callback0Return() {
                            @Override
                            public final Object run() {
                                return this.f$0.lambda$dispatchDraw$0(canvas2, fLerp);
                            }
                        });
                    }
                    MessageSendPreview.this.editText.setAlpha(f3);
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                }
                MessageSendPreview.this.mainMessageCell.getTransitionParams().ignoreAlpha = true;
                if (MessageSendPreview.this.destCell == null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f4 * 255.0f), 31);
                    canvas2.translate(f6, f5);
                    canvas2.translate(-imageX, -imageY);
                    float fLerp6 = AndroidUtilities.lerp(1.0f, MessageSendPreview.this.chatListView.getScaleX(), MessageSendPreview.this.openProgress);
                    canvas2.scale(fLerp6, fLerp6, (-MessageSendPreview.this.mainMessageCell.getX()) + MessageSendPreview.this.chatListView.getWidth(), (-MessageSendPreview.this.mainMessageCell.getY()) + MessageSendPreview.this.chatListView.getHeight());
                    float f7 = fLerp / textSize;
                    canvas2.scale(f7, f7, imageX, imageY);
                    if (MessageSendPreview.this.mainMessageCell.drawBackgroundInParent()) {
                        canvas2.save();
                        canvas2.translate(0.0f, MessageSendPreview.this.mainMessageCell.getPaddingTop());
                        MessageSendPreview.this.mainMessageCell.drawBackgroundInternal(canvas2, true);
                        canvas2.restore();
                    }
                    MessageSendPreview.this.mainMessageCell.draw(canvas2);
                    canvas2.restore();
                } else {
                    MessageSendPreview.this.destCell.getLocationInWindow(this.pos2);
                    int translationY = MessageSendPreview.this.destCell.getParent() instanceof View ? (int) ((View) MessageSendPreview.this.destCell.getParent()).getTranslationY() : 0;
                    int i2 = this.chatListViewTy;
                    if (i2 > translationY) {
                        c2 = 1;
                        if (this.destCellPos[1] - this.pos2[1] <= i2) {
                        }
                        this.chatListViewTy = translationY;
                        float fLerp7 = AndroidUtilities.lerp(MessageSendPreview.this.mainMessageCell.getX() + MessageSendPreview.this.chatListView.getX(), this.destCellPos[0], 1.0f - MessageSendPreview.this.openProgress);
                        float fLerp8 = AndroidUtilities.lerp(MessageSendPreview.this.mainMessageCell.getY() + MessageSendPreview.this.chatListView.getY(), this.destCellPos[1], 1.0f - MessageSendPreview.this.openProgress);
                        canvas2.save();
                        canvas2.translate(fLerp7, fLerp8);
                        float fLerp9 = AndroidUtilities.lerp(1.0f, MessageSendPreview.this.chatListView.getScaleX(), MessageSendPreview.this.openProgress);
                        canvas2.scale(fLerp9, fLerp9, (-MessageSendPreview.this.mainMessageCell.getX()) + MessageSendPreview.this.chatListView.getWidth(), (-MessageSendPreview.this.mainMessageCell.getY()) + MessageSendPreview.this.chatListView.getHeight());
                        MessageSendPreview.this.mainMessageCell.getTransitionParams().animateChangeProgress = 1.0f - MessageSendPreview.this.openProgress;
                        MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaLeft = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.left;
                        MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaTop = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.top;
                        MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaRight = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.right;
                        MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaBottom = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.bottom;
                        MessageSendPreview.this.mainMessageCell.setTimeAlpha(1.0f - MessageSendPreview.this.openProgress);
                        if (MessageSendPreview.this.mainMessageCell.drawBackgroundInParent()) {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, MessageSendPreview.this.destCell.getWidth(), MessageSendPreview.this.destCell.getHeight(), (int) (MessageSendPreview.this.openProgress * 255.0f), 31);
                            canvas2.translate(0.0f, MessageSendPreview.this.mainMessageCell.getPaddingTop());
                            MessageSendPreview.this.mainMessageCell.drawBackgroundInternal(canvas2, true);
                            canvas2.restore();
                            canvas2.saveLayerAlpha(0.0f, 0.0f, MessageSendPreview.this.destCell.getWidth(), MessageSendPreview.this.destCell.getHeight(), (int) ((1.0f - MessageSendPreview.this.openProgress) * 255.0f), 31);
                            canvas2.translate(0.0f, MessageSendPreview.this.destCell.getPaddingTop());
                            MessageSendPreview.this.destCell.drawBackgroundInternal(canvas2, true);
                            canvas2.restore();
                        }
                        MessageSendPreview.this.mainMessageCell.draw(canvas2);
                        if (MessageSendPreview.this.mainMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                            MessageSendPreview.this.mainMessageCell.drawNamesLayout(canvas2, 1.0f);
                            MessageSendPreview.this.mainMessageCell.drawTime(canvas2, 1.0f - MessageSendPreview.this.openProgress, true);
                        }
                        canvas2.restore();
                    } else {
                        c2 = 1;
                    }
                    int[] iArr = this.destCellPos;
                    int[] iArr2 = this.pos2;
                    iArr[0] = iArr2[0];
                    iArr[c2] = iArr2[c2];
                    this.chatListViewTy = translationY;
                    float fLerp10 = AndroidUtilities.lerp(MessageSendPreview.this.mainMessageCell.getX() + MessageSendPreview.this.chatListView.getX(), this.destCellPos[0], 1.0f - MessageSendPreview.this.openProgress);
                    float fLerp11 = AndroidUtilities.lerp(MessageSendPreview.this.mainMessageCell.getY() + MessageSendPreview.this.chatListView.getY(), this.destCellPos[1], 1.0f - MessageSendPreview.this.openProgress);
                    canvas2.save();
                    canvas2.translate(fLerp10, fLerp11);
                    float fLerp12 = AndroidUtilities.lerp(1.0f, MessageSendPreview.this.chatListView.getScaleX(), MessageSendPreview.this.openProgress);
                    canvas2.scale(fLerp12, fLerp12, (-MessageSendPreview.this.mainMessageCell.getX()) + MessageSendPreview.this.chatListView.getWidth(), (-MessageSendPreview.this.mainMessageCell.getY()) + MessageSendPreview.this.chatListView.getHeight());
                    MessageSendPreview.this.mainMessageCell.getTransitionParams().animateChangeProgress = 1.0f - MessageSendPreview.this.openProgress;
                    MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaLeft = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.left;
                    MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaTop = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.top;
                    MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaRight = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.right;
                    MessageSendPreview.this.mainMessageCell.getTransitionParams().deltaBottom = MessageSendPreview.this.openProgress * MessageSendPreview.this.cellDelta.bottom;
                    MessageSendPreview.this.mainMessageCell.setTimeAlpha(1.0f - MessageSendPreview.this.openProgress);
                    if (MessageSendPreview.this.mainMessageCell.drawBackgroundInParent()) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, MessageSendPreview.this.destCell.getWidth(), MessageSendPreview.this.destCell.getHeight(), (int) (MessageSendPreview.this.openProgress * 255.0f), 31);
                        canvas2.translate(0.0f, MessageSendPreview.this.mainMessageCell.getPaddingTop());
                        MessageSendPreview.this.mainMessageCell.drawBackgroundInternal(canvas2, true);
                        canvas2.restore();
                        canvas2.saveLayerAlpha(0.0f, 0.0f, MessageSendPreview.this.destCell.getWidth(), MessageSendPreview.this.destCell.getHeight(), (int) ((1.0f - MessageSendPreview.this.openProgress) * 255.0f), 31);
                        canvas2.translate(0.0f, MessageSendPreview.this.destCell.getPaddingTop());
                        MessageSendPreview.this.destCell.drawBackgroundInternal(canvas2, true);
                        canvas2.restore();
                    }
                    MessageSendPreview.this.mainMessageCell.draw(canvas2);
                    if (MessageSendPreview.this.mainMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                        MessageSendPreview.this.mainMessageCell.drawNamesLayout(canvas2, 1.0f);
                        MessageSendPreview.this.mainMessageCell.drawTime(canvas2, 1.0f - MessageSendPreview.this.openProgress, true);
                    }
                    canvas2.restore();
                }
                canvas2.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, fLerp2, getWidth(), AndroidUtilities.dp(14.0f) + fLerp2);
                this.clip.draw(canvas2, rectF, true, fLerp3);
                rectF.set(0.0f, fLerp4 - AndroidUtilities.dp(14.0f), getWidth(), fLerp4);
                this.clip.draw(canvas2, rectF, false, fLerp5);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                f = 255.0f;
            }
            if (MessageSendPreview.this.openInProgress) {
                if (MessageSendPreview.this.firstOpenFrame2) {
                    if (MessageSendPreview.this.anchorSendButton != null) {
                        MessageSendPreview.this.anchorSendButton.setAlpha(0.0f);
                    }
                    c = 0;
                    MessageSendPreview.this.firstOpenFrame2 = false;
                } else {
                    c = 0;
                }
                canvas2.save();
                canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (MessageSendPreview.this.sendButtonInitialPosition[c] - (MessageSendPreview.this.sendButton.getWidth() - MessageSendPreview.this.sendButton.width(MessageSendPreview.this.sendButton.getHeight()))), MessageSendPreview.this.sendButton.getX(), MessageSendPreview.this.openProgress), AndroidUtilities.lerp(MessageSendPreview.this.sendButtonInitialPosition[1], MessageSendPreview.this.sendButton.getY(), MessageSendPreview.this.openProgress));
                if (MessageSendPreview.this.closing && MessageSendPreview.this.sent) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, MessageSendPreview.this.sendButton.getWidth(), MessageSendPreview.this.sendButton.getHeight(), (int) (MessageSendPreview.this.openProgress * f), 31);
                }
                MessageSendPreview.this.sendButton.draw(canvas2);
                if (MessageSendPreview.this.closing && MessageSendPreview.this.sent) {
                    canvas2.restore();
                }
                canvas2.restore();
            }
            super.dispatchDraw(canvas);
            if (MessageSendPreview.this.cameraRect != null) {
                if (MessageSendPreview.this.effectDrawable == null) {
                    MessageSendPreview.this.effectDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(24.0f), 23);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) ((MessageSendPreview.this.cameraRect.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((MessageSendPreview.this.cameraRect.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (MessageSendPreview.this.cameraRect.right - AndroidUtilities.dp(12.0f)), (int) (MessageSendPreview.this.cameraRect.bottom - AndroidUtilities.dp(12.0f)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rect);
                rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
                float fHeight = rectF2.height() / 2.0f;
                this.backgroundPaint.setColor(503316480);
                this.backgroundPaint.setAlpha((int) (MessageSendPreview.this.openProgress * MessageSendPreview.this.effectDrawable.isNotEmpty() * 30.0f));
                canvas2.drawRoundRect(rectF2, fHeight, fHeight, this.backgroundPaint);
                MessageSendPreview.this.effectDrawable.setBounds(rect);
                MessageSendPreview.this.effectDrawable.setAlpha((int) (MessageSendPreview.this.openProgress * f));
                MessageSendPreview.this.effectDrawable.draw(canvas2);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (MessageSendPreview.this.openInProgress) {
                if (view == MessageSendPreview.this.sendButton) {
                    return false;
                }
                if (view == MessageSendPreview.this.mainMessageCell && MessageSendPreview.this.mainMessageCell != null && MessageSendPreview.this.mainMessageCell.getCurrentPosition() == null) {
                    return false;
                }
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public class AnonymousClass6 extends ChatListItemAnimator {
        Runnable finishRunnable;

        public AnonymousClass6(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
            super(chatActivity, recyclerListView, resourcesProvider);
        }

        public void lambda$endAnimations$1() {
            this.finishRunnable = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator enable notifications");
            }
        }

        public void lambda$onAllAnimationsDone$0() {
            this.finishRunnable = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator enable notifications");
            }
        }

        @Override
        public void checkIsRunning() {
        }

        @Override
        public void endAnimations() {
            super.endAnimations();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            MessageSendPreview$6$$ExternalSyntheticLambda0 messageSendPreview$6$$ExternalSyntheticLambda0 = new MessageSendPreview$6$$ExternalSyntheticLambda0(this, 1);
            this.finishRunnable = messageSendPreview$6$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(messageSendPreview$6$$ExternalSyntheticLambda0);
        }

        @Override
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            MessageSendPreview$6$$ExternalSyntheticLambda0 messageSendPreview$6$$ExternalSyntheticLambda0 = new MessageSendPreview$6$$ExternalSyntheticLambda0(this, 0);
            this.finishRunnable = messageSendPreview$6$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(messageSendPreview$6$$ExternalSyntheticLambda0);
        }

        @Override
        public void onAnimationStart() {
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator disable notifications");
            }
        }
    }

    public class MessageCell extends ChatMessageCell {
        public int bottom;
        private int pastId;
        public int top;

        public MessageCell(Context context, int i, boolean z, ChatMessageSharedResources chatMessageSharedResources, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, z, chatMessageSharedResources, resourcesProvider);
            this.top = Integer.MAX_VALUE;
            this.bottom = Integer.MAX_VALUE;
            this.pastId = -1;
        }

        @Override
        public boolean isPressed() {
            return false;
        }

        @Override
        public SpoilerEffect2 makeSpoilerEffect() {
            return SpoilerEffect2.getInstance(1, this, MessageSendPreview.this.windowView);
        }

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (!this.transitionParams.animateBackgroundBoundsInner || i2 == 0 || this.top == Integer.MAX_VALUE || i4 == 0 || this.bottom == Integer.MAX_VALUE) {
                return;
            }
            if (this.pastId == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
                if (!MessageSendPreview.this.scrolledToLast) {
                    setTranslationY(-(i2 - this.top));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                this.top = getTop();
                this.bottom = getBottom();
                this.pastId = getMessageObject() != null ? getMessageObject().getId() : 0;
            }
        }
    }

    public static class VisiblePart {
        private int blurredViewBottomOffset;
        private int blurredViewTopOffset;
        private int childPosition;
        public int parentHeight;
        public int parentWidth;
        private int visibleHeight;
        private int visibleParent;
        private float visibleParentOffset;
        private float visibleTop;

        private VisiblePart() {
        }

        public static VisiblePart of(ChatMessageCell chatMessageCell) {
            VisiblePart visiblePart = new VisiblePart();
            visiblePart.childPosition = chatMessageCell.childPosition;
            visiblePart.visibleHeight = chatMessageCell.visibleHeight;
            visiblePart.visibleParent = chatMessageCell.visibleParent;
            visiblePart.parentWidth = chatMessageCell.parentWidth;
            visiblePart.parentHeight = chatMessageCell.parentHeight;
            visiblePart.visibleTop = chatMessageCell.visibleTop;
            visiblePart.visibleParentOffset = chatMessageCell.visibleParentOffset;
            visiblePart.blurredViewTopOffset = chatMessageCell.blurredViewTopOffset;
            visiblePart.blurredViewBottomOffset = chatMessageCell.blurredViewBottomOffset;
            return visiblePart;
        }

        public void lerpTo(ChatMessageCell chatMessageCell, float f, ChatMessageCell chatMessageCell2) {
            chatMessageCell2.setVisiblePart(AndroidUtilities.lerp(this.childPosition, chatMessageCell.childPosition, f), AndroidUtilities.lerp(this.visibleHeight, chatMessageCell.visibleHeight, f), AndroidUtilities.lerp(this.visibleParent, chatMessageCell.visibleParent, f), AndroidUtilities.lerp(this.visibleParentOffset, chatMessageCell.visibleParentOffset, f), AndroidUtilities.lerp(this.visibleTop, chatMessageCell.visibleTop, f), AndroidUtilities.lerp(this.parentWidth, chatMessageCell.parentWidth, f), AndroidUtilities.lerp(this.parentHeight, chatMessageCell.parentHeight, f), AndroidUtilities.lerp(this.blurredViewTopOffset, chatMessageCell.blurredViewTopOffset, f), AndroidUtilities.lerp(this.blurredViewBottomOffset, chatMessageCell.blurredViewBottomOffset, f), 0);
        }
    }

    public MessageSendPreview(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.insets = Insets.NONE;
        this.messageObjects = new ArrayList<>();
        this.groupedMessagesMap = new LongSparseArray();
        final int i2 = 1;
        this.editTextBackgroundPaint = new Paint(1);
        this.sendButtonInitialPosition = new int[2];
        final int i3 = 0;
        this.dismissing = false;
        this.cellDelta = new Rect();
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                if (MessageSendPreview.this.activityVisibilityController != null) {
                    MessageSendPreview.this.activityVisibilityController.setHidden(MessageSendPreview.this.openProgress == 1.0f && MessageSendPreview.this.blurBitmapPaint != null);
                }
                if (MessageSendPreview.this.openProgress <= 0.0f || MessageSendPreview.this.blurBitmapPaint == null) {
                    canvas2 = canvas;
                } else {
                    MessageSendPreview.this.blurMatrix.reset();
                    float width = getWidth() / MessageSendPreview.this.blurBitmap.getWidth();
                    MessageSendPreview.this.blurMatrix.postScale(width, width);
                    MessageSendPreview.this.blurBitmapShader.setLocalMatrix(MessageSendPreview.this.blurMatrix);
                    MessageSendPreview.this.blurBitmapPaint.setAlpha((int) (MessageSendPreview.this.openProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), MessageSendPreview.this.blurBitmapPaint);
                }
                super.dispatchDraw(canvas2);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                MessageSendPreview.this.onBackPressed();
                return true;
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
                if (!MessageSendPreview.this.layoutDone || MessageSendPreview.this.allowRelayout) {
                    MessageSendPreview.this.layout();
                    MessageSendPreview.this.layoutDone = true;
                }
            }

            @Override
            public void onSizeChanged(int i4, int i5, int i6, int i7) {
                super.onSizeChanged(i4, i5, i6, i7);
                MessageSendPreview.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        this.spoilerEffect2 = SpoilerEffect2.getInstance(1, frameLayout, frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final MessageSendPreview f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$4(view);
                        break;
                }
            }
        });
        frameLayout.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.lambda$new$3(view, view2);
            }
        });
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = new ViewPositionWatcher(frameLayout);
        blurredBackgroundDrawableViewFactory.parent = frameLayout;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, resourcesProvider);
        this.containerView = anonymousClass2;
        anonymousClass2.setClipToPadding(false);
        frameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 119));
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                MessageSendPreview.this.insets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                MessageSendPreview.this.containerView.setPadding(MessageSendPreview.this.insets.left, MessageSendPreview.this.insets.top, MessageSendPreview.this.insets.right, MessageSendPreview.this.insets.bottom);
                MessageSendPreview.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        };
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout, onApplyWindowInsetsListener);
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            private final AnimatedFloat bottom;
            private final GradientClip clip;
            private final ArrayList<MessageObject.GroupedMessages> drawingGroups = new ArrayList<>(10);
            private final AnimatedFloat top;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.top = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.bottom = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.clip = new GradientClip();
            }

            private void drawChatBackgroundElements(Canvas canvas) {
                boolean z;
                Canvas canvas2;
                float f;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessages currentMessagesGroup2;
                int childCount = getChildCount();
                ?? r3 = 0;
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if ((childAt instanceof ChatMessageCell) && ((currentMessagesGroup2 = ((ChatMessageCell) childAt).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                int i5 = 0;
                while (i5 < 3) {
                    this.drawingGroups.clear();
                    if (i5 != 2 || MessageSendPreview.this.chatListView.isFastScrollAnimationRunning()) {
                        int i6 = 0;
                        while (true) {
                            z = true;
                            if (i6 >= childCount) {
                                break;
                            }
                            View childAt2 = MessageSendPreview.this.chatListView.getChildAt(i6);
                            if (childAt2 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt2;
                                if (childAt2.getY() <= MessageSendPreview.this.chatListView.getHeight() && childAt2.getY() + childAt2.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup()) != null && ((i5 != 0 || currentMessagesGroup.messages.size() != 1) && ((i5 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i5 != 0 || !chatMessageCell.getMessageObject().deleted) && ((i5 != 1 || chatMessageCell.getMessageObject().deleted) && ((i5 != 2 || chatMessageCell.willRemovedAfterAnimation()) && (i5 == 2 || !chatMessageCell.willRemovedAfterAnimation()))))))) {
                                    if (!this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = r3;
                                        transitionParams.top = r3;
                                        transitionParams.right = r3;
                                        transitionParams.bottom = r3;
                                        transitionParams.pinnedBotton = r3;
                                        transitionParams.pinnedTop = r3;
                                        transitionParams.cell = chatMessageCell;
                                        this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                                    int x = (int) (chatMessageCell.getX() + chatMessageCell.getBackgroundDrawableLeft());
                                    int x2 = (int) (chatMessageCell.getX() + chatMessageCell.getBackgroundDrawableRight());
                                    int y = (int) (chatMessageCell.getY() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell.getY() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableBottom());
                                    if ((chatMessageCell.getCurrentPosition().flags & 4) == 0) {
                                        y -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell.getCurrentPosition().flags & 8) == 0) {
                                        y2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i7 = transitionParams2.top;
                                    if (i7 == 0 || y < i7) {
                                        transitionParams2.top = y;
                                    }
                                    int i8 = transitionParams2.bottom;
                                    if (i8 == 0 || y2 > i8) {
                                        transitionParams2.bottom = y2;
                                    }
                                    int i9 = transitionParams2.left;
                                    if (i9 == 0 || x < i9) {
                                        transitionParams2.left = x;
                                    }
                                    int i10 = transitionParams2.right;
                                    if (i10 == 0 || x2 > i10) {
                                        transitionParams2.right = x2;
                                    }
                                }
                            }
                            i6++;
                        }
                        int i11 = 0;
                        while (i11 < this.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages2 = this.drawingGroups.get(i11);
                            if (groupedMessages2 != null) {
                                float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(z);
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                                float f2 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                                float f3 = transitionParams3.top + transitionParams3.offsetTop;
                                float f4 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                                float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                                if (f3 < (-AndroidUtilities.dp(20.0f))) {
                                    f3 = -AndroidUtilities.dp(20.0f);
                                }
                                if (fDp > AndroidUtilities.dp(20.0f) + MessageSendPreview.this.chatListView.getMeasuredHeight()) {
                                    fDp = AndroidUtilities.dp(20.0f) + MessageSendPreview.this.chatListView.getMeasuredHeight();
                                }
                                boolean z2 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                                if (z2) {
                                    canvas.save();
                                    canvas2 = canvas;
                                    f = 2.0f;
                                    canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), ImageReceiver$$ExternalSyntheticOutline0.m(f4, f2, 2.0f, f2), ImageReceiver$$ExternalSyntheticOutline0.m(fDp, f3, 2.0f, f3));
                                } else {
                                    canvas2 = canvas;
                                    f = 2.0f;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                                transitionParams4.cell.drawBackground(canvas2, (int) f2, (int) f3, (int) f4, (int) fDp, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                                transitionParams5.cell = null;
                                transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                                if (z2) {
                                    canvas.restore();
                                    for (int i12 = 0; i12 < childCount; i12++) {
                                        View childAt3 = MessageSendPreview.this.chatListView.getChildAt(i12);
                                        if (childAt3 instanceof ChatMessageCell) {
                                            ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt3;
                                            if (chatMessageCell2.getCurrentMessagesGroup() == groupedMessages2) {
                                                int left = chatMessageCell2.getLeft();
                                                int top = chatMessageCell2.getTop();
                                                childAt3.setPivotX(((f4 - f2) / f) + (f2 - left));
                                                childAt3.setPivotY(((fDp - f3) / f) + (f3 - top));
                                            }
                                        }
                                    }
                                }
                            }
                            i11++;
                            z = true;
                        }
                    }
                    i5++;
                    r3 = 0;
                }
            }

            private void drawChatForegroundElements(Canvas canvas) {
                MessageObject.GroupedMessages currentMessagesGroup;
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup2;
                int childCount = getChildCount();
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if ((childAt instanceof ChatMessageCell) && ((currentMessagesGroup2 = (chatMessageCell = (ChatMessageCell) childAt).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        if (currentMessagesGroup2 == null) {
                            MessageSendPreview.this.drawStarsPrice(canvas, chatMessageCell.getBoundsLeft(), chatMessageCell.getY(), chatMessageCell.getBoundsRight(), chatMessageCell.getY() + chatMessageCell.getHeight());
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                for (int i5 = 0; i5 < 3; i5++) {
                    this.drawingGroups.clear();
                    if (i5 != 2 || MessageSendPreview.this.chatListView.isFastScrollAnimationRunning()) {
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt2 = MessageSendPreview.this.chatListView.getChildAt(i6);
                            if (childAt2 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                                if (childAt2.getY() <= MessageSendPreview.this.chatListView.getHeight() && childAt2.getY() + childAt2.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell2.getCurrentMessagesGroup()) != null && ((i5 != 0 || currentMessagesGroup.messages.size() != 1) && ((i5 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i5 != 0 || !chatMessageCell2.getMessageObject().deleted) && ((i5 != 1 || chatMessageCell2.getMessageObject().deleted) && ((i5 != 2 || chatMessageCell2.willRemovedAfterAnimation()) && (i5 == 2 || !chatMessageCell2.willRemovedAfterAnimation()))))))) {
                                    if (!this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = 0;
                                        transitionParams.top = 0;
                                        transitionParams.right = 0;
                                        transitionParams.bottom = 0;
                                        transitionParams.pinnedBotton = false;
                                        transitionParams.pinnedTop = false;
                                        transitionParams.cell = chatMessageCell2;
                                        this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell2.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell2.isPinnedBottom();
                                    int x = (int) (chatMessageCell2.getX() + chatMessageCell2.getBackgroundDrawableLeft());
                                    int x2 = (int) (chatMessageCell2.getX() + chatMessageCell2.getBackgroundDrawableRight());
                                    int y = (int) (chatMessageCell2.getY() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell2.getY() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableBottom());
                                    if ((chatMessageCell2.getCurrentPosition().flags & 4) == 0) {
                                        y -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell2.getCurrentPosition().flags & 8) == 0) {
                                        y2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell2.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell2;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i7 = transitionParams2.top;
                                    if (i7 == 0 || y < i7) {
                                        transitionParams2.top = y;
                                    }
                                    int i8 = transitionParams2.bottom;
                                    if (i8 == 0 || y2 > i8) {
                                        transitionParams2.bottom = y2;
                                    }
                                    int i9 = transitionParams2.left;
                                    if (i9 == 0 || x < i9) {
                                        transitionParams2.left = x;
                                    }
                                    int i10 = transitionParams2.right;
                                    if (i10 == 0 || x2 > i10) {
                                        transitionParams2.right = x2;
                                    }
                                }
                            }
                        }
                        for (int i11 = 0; i11 < this.drawingGroups.size(); i11++) {
                            MessageObject.GroupedMessages groupedMessages2 = this.drawingGroups.get(i11);
                            float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                            float f = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float f2 = transitionParams3.top + transitionParams3.offsetTop;
                            float f3 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                            float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (f2 < (-AndroidUtilities.dp(20.0f))) {
                                f2 = -AndroidUtilities.dp(20.0f);
                            }
                            float f4 = f2;
                            if (fDp > AndroidUtilities.dp(20.0f) + MessageSendPreview.this.chatListView.getMeasuredHeight()) {
                                fDp = AndroidUtilities.dp(20.0f) + MessageSendPreview.this.chatListView.getMeasuredHeight();
                            }
                            MessageSendPreview.this.drawStarsPrice(canvas, f, f4, f3, fDp);
                            groupedMessages2.transitionParams.cell = null;
                        }
                    }
                }
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                MessageSendPreview.this.updateMessagesVisiblePart();
                canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
                canvas.save();
                drawChatBackgroundElements(canvas);
                super.dispatchDraw(canvas);
                drawChatForegroundElements(canvas);
                canvas.save();
                float f = this.top.set(canScrollVertically(-1));
                float f2 = this.bottom.set(canScrollVertically(1));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
                this.clip.draw(canvas, rectF, true, f);
                rectF.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
                this.clip.draw(canvas, rectF, false, f2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (MessageSendPreview.this.openInProgress && ((view == MessageSendPreview.this.mainMessageCell && MessageSendPreview.this.mainMessageCell != null && MessageSendPreview.this.mainMessageCell.getCurrentPosition() == null) || view == MessageSendPreview.this.sendButton)) {
                    return false;
                }
                if (!(view instanceof ChatMessageCell)) {
                    return true;
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                chatMessageCell.setInvalidatesParent(true);
                chatMessageCell.drawCheckBox(canvas);
                canvas.save();
                canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                if (chatMessageCell.drawBackgroundInParent() && chatMessageCell.getCurrentPosition() == null) {
                    canvas.save();
                    canvas.translate(0.0f, chatMessageCell.getPaddingTop());
                    chatMessageCell.drawBackgroundInternal(canvas, true);
                    canvas.restore();
                }
                canvas.restore();
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.save();
                canvas.translate(chatMessageCell.getX(), chatMessageCell.getY() + chatMessageCell.getPaddingTop());
                canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & chatMessageCell.captionFlag()) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell.drawCaptionLayout(canvas, false, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & 8) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell.drawReactionsLayout(canvas, chatMessageCell.getAlpha(), null);
                    chatMessageCell.drawCommentLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() != null) {
                    chatMessageCell.drawNamesLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() == null || chatMessageCell.getCurrentPosition().last) {
                    chatMessageCell.drawTime(canvas, chatMessageCell.getAlpha(), true);
                }
                chatMessageCell.drawOutboundsContent(canvas);
                ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
                StaticLayout[] staticLayoutArr = transitionParams.lastDrawnForwardedNameLayout;
                ChatMessageCell chatMessageCell2 = ChatMessageCell.this;
                staticLayoutArr[0] = chatMessageCell2.forwardedNameLayout[0];
                transitionParams.lastDrawnForwardedNameLayout[1] = chatMessageCell2.forwardedNameLayout[1];
                transitionParams.lastDrawnForwardedName = chatMessageCell2.currentMessageObject.needDrawForwarded();
                transitionParams.lastForwardNameX = chatMessageCell2.forwardNameX;
                int i4 = chatMessageCell2.namesOffset;
                transitionParams.lastForwardedNamesOffset = i4;
                transitionParams.lastNamesOffset = i4;
                transitionParams.lastForwardNameWidth = chatMessageCell2.forwardedNameWidth;
                canvas.restore();
                chatMessageCell.setInvalidatesParent(false);
                return zDrawChild;
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getTop() != 0 && (childAt instanceof MessageCell)) {
                        MessageCell messageCell = (MessageCell) childAt;
                        messageCell.top = childAt.getTop();
                        messageCell.bottom = childAt.getBottom();
                        messageCell.pastId = messageCell.getMessageObject().getId();
                    }
                }
                super.onLayout(z, i4, i5, i6, i7);
            }

            @Override
            public void onMeasure(int i4, int i5) {
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(MessageSendPreview.this.messageObjects.isEmpty() ? -6.0f : 48.0f) + (MessageSendPreview.this.optionsView == null ? 0 : MessageSendPreview.this.optionsView.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - MessageSendPreview.this.insets.top), Integer.MIN_VALUE));
                int iMax = Math.max(AndroidUtilities.dp(12.0f) + MessageSendPreview.this.getSendButtonWidth(), -((AndroidUtilities.dp(7.0f) + MessageSendPreview.this.sendButtonInitialPosition[0]) - getMeasuredWidth()));
                float fMax = Math.max(1, getMeasuredWidth() - iMax) / Math.max(1, ((getMeasuredWidth() - iMax) - AndroidUtilities.dp(8.0f)) + Math.max(0, MessageSendPreview.this.messageObjectsWidth - ((getMeasuredWidth() - iMax) - AndroidUtilities.dp((MessageSendPreview.this.groupedMessagesMap.isEmpty() ? 0 : 40) + 8))));
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
                setScaleX(fMax);
                setScaleY(fMax);
            }
        };
        this.chatListView = recyclerListView;
        recyclerListView.setOnClickListener(new View.OnClickListener(this) {
            public final MessageSendPreview f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0(view);
                        break;
                    default:
                        this.f$0.lambda$new$4(view);
                        break;
                }
            }
        });
        recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 23));
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                MessageSendPreview.this.chatListView.invalidate();
            }
        });
        recyclerListView.lambda$onCellEnter$52(new AnonymousClass6(null, recyclerListView, resourcesProvider));
        GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true) {
            boolean computingScroll;

            {
                super(i, i, z);
            }

            @Override
            public int computeVerticalScrollExtent(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollExtent = super.computeVerticalScrollExtent(state);
                this.computingScroll = false;
                return iComputeVerticalScrollExtent;
            }

            @Override
            public int computeVerticalScrollOffset(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollOffset = super.computeVerticalScrollOffset(state);
                this.computingScroll = false;
                return iComputeVerticalScrollOffset;
            }

            @Override
            public int computeVerticalScrollRange(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollRange = super.computeVerticalScrollRange(state);
                this.computingScroll = false;
                return iComputeVerticalScrollRange;
            }

            @Override
            public boolean hasSiblingChild(int i4) {
                byte b;
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((getItemCount() - 1) - i4);
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                if (validGroupedMessage != null) {
                    MessageObject.GroupedMessagePosition position = validGroupedMessage.getPosition(messageObject);
                    if (position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size = validGroupedMessage.posArray.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = validGroupedMessage.posArray.get(i5);
                            if (groupedMessagePosition != position) {
                                byte b2 = groupedMessagePosition.minY;
                                byte b3 = position.minY;
                                if (b2 <= b3 && groupedMessagePosition.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }

            @Override
            public boolean shouldLayoutChildFromOpositeSide(View view) {
                if (view instanceof ChatMessageCell) {
                    return !((ChatMessageCell) view).getMessageObject().isOutOwner();
                }
                return false;
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }
        };
        this.chatLayoutManager = gridLayoutManagerFixed;
        gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i4) {
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((MessageSendPreview.this.messageObjects.size() - 1) - i4);
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                if (validGroupedMessage != null) {
                    return validGroupedMessage.getPosition(messageObject).spanSize;
                }
                return 1000;
            }
        });
        recyclerListView.setLayoutManager(gridLayoutManagerFixed);
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessagePosition currentPosition;
                rect.bottom = 0;
                if (!(view instanceof ChatMessageCell) || (currentMessagesGroup = (chatMessageCell = (ChatMessageCell) view).getCurrentMessagesGroup()) == null || (currentPosition = chatMessageCell.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
                    return;
                }
                Point point = AndroidUtilities.displaySize;
                float fMax = Math.max(point.x, point.y) * 0.5f;
                int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
                int i4 = 0;
                while (true) {
                    float[] fArr = currentPosition.siblingHeights;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(fArr[i4] * fMax);
                    i4++;
                }
                int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
                int size = currentMessagesGroup.posArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i5);
                    byte b = groupedMessagePosition.minY;
                    byte b2 = currentPosition.minY;
                    if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                        iRound -= ((int) Math.ceil(fMax * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                        break;
                    }
                }
                rect.bottom = -iRound;
            }
        });
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public int getItemCount() {
                return MessageSendPreview.this.messageObjects.size();
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((getItemCount() - 1) - i4);
                ChatMessageCell chatMessageCell = (ChatMessageCell) viewHolder.itemView;
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                chatMessageCell.setInvalidatesParent(validGroupedMessage != null);
                chatMessageCell.setMessageObject(messageObject, validGroupedMessage, false, false, false);
                if (i4 != MessageSendPreview.this.getMainMessageCellPosition() || messageObject.needDrawForwarded()) {
                    return;
                }
                MessageSendPreview.this.mainMessageCell = chatMessageCell;
                ChatMessageCell chatMessageCell2 = MessageSendPreview.this.mainMessageCell;
                Point point = AndroidUtilities.displaySize;
                chatMessageCell2.setParentViewSize(point.x, point.y);
                MessageSendPreview.this.mainMessageCellId = messageObject.getId();
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageCell messageCell = messageSendPreview.new MessageCell(context, messageSendPreview.currentAccount, true, null, resourcesProvider);
                messageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return false;
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return true;
                    }

                    @Override
                    public boolean canPerformActions() {
                        return false;
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                        return false;
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                        return false;
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i5, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                        return false;
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                        return false;
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                        return false;
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i5, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    }

                    public void didPressDialogButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell) {
                    }

                    public void didPressEmojiStatus() {
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i5, int i6) {
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i5) {
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell, int i5) {
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell, int i5) {
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i5) {
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i5, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                        return false;
                    }

                    public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i5, int i6, int i7) {
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z, Runnable runnable) {
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                    }

                    public boolean drawingVideoPlayerContainer() {
                        return false;
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                        return 0;
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return null;
                    }

                    @Override
                    public int getChatMode() {
                        return 0;
                    }

                    @Override
                    public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                        return null;
                    }

                    @Override
                    public PinchToZoomHelper getPinchToZoomHelper() {
                        return null;
                    }

                    @Override
                    public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                        return null;
                    }

                    @Override
                    public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                        return null;
                    }

                    @Override
                    public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return null;
                    }

                    @Override
                    public boolean hasSelectedMessages() {
                        return false;
                    }

                    @Override
                    public void invalidateBlur() {
                    }

                    @Override
                    public boolean isAdmin(long j) {
                        return false;
                    }

                    @Override
                    public boolean isLandscape() {
                        return false;
                    }

                    @Override
                    public boolean isOwner(long j) {
                        return false;
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i5) {
                        return false;
                    }

                    @Override
                    public boolean isReplyOrSelf() {
                        return false;
                    }

                    @Override
                    public boolean keyboardIsOpened() {
                        return false;
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i5, int i6) {
                    }

                    @Override
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                        return false;
                    }

                    @Override
                    public void needReloadPolls() {
                    }

                    @Override
                    public void needShowPremiumBulletin(int i5) {
                    }

                    public void needShowPremiumFeatures(String str) {
                    }

                    @Override
                    public boolean onAccessibilityAction(int i5, Bundle bundle) {
                        return false;
                    }

                    @Override
                    public void onDiceFinished() {
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                        return false;
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject) {
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                        return false;
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject) {
                        return true;
                    }

                    public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell) {
                        return false;
                    }

                    public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell) {
                        return false;
                    }

                    @Override
                    public void videoTimerReached() {
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z, boolean z2) {
                        forceUpdate(chatMessageCell, z);
                    }
                });
                return new RecyclerListView.Holder(messageCell);
            }
        };
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setOverScrollMode(2);
        anonymousClass2.addView(recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MessageSendPreview.this.effectOverlay.draw(canvas);
                float progress = MessageSendPreview.this.effectOverlay.getProgress();
                if (progress != -2.0f) {
                    MessageSendPreview.this.sendButton.setLoading(progress >= 0.0f && progress < 1.0f, -3.0f);
                }
                if (MessageSendPreview.this.effectOverlay.isIdle()) {
                    return;
                }
                invalidate();
            }
        };
        this.effectsView = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        this.effectOverlay = new EmojiAnimationsOverlay(frameLayout2, i) {
            int[] messagePos = new int[2];

            @Override
            public void layoutObject(EmojiAnimationsOverlay.DrawingObject drawingObject) {
                if (drawingObject == null) {
                    return;
                }
                if (MessageSendPreview.this.cameraRect != null) {
                    drawingObject.viewFound = true;
                    float filterWidth = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                    float f = filterWidth / 3.0f;
                    drawingObject.lastW = f;
                    drawingObject.lastH = f;
                    drawingObject.lastX = Utilities.clamp(MessageSendPreview.this.cameraRect.right - (0.75f * filterWidth), AndroidUtilities.displaySize.x - filterWidth, 0.0f);
                    drawingObject.lastY = MessageSendPreview.this.cameraRect.bottom - (filterWidth / 2.0f);
                    return;
                }
                if (MessageSendPreview.this.mainMessageCell == null || !MessageSendPreview.this.mainMessageCell.isAttachedToWindow() || MessageSendPreview.this.mainMessageCell.getMessageObject() == null || MessageSendPreview.this.mainMessageCell.getMessageObject().getId() != MessageSendPreview.this.mainMessageCellId) {
                    return;
                }
                MessageSendPreview.this.mainMessageCell.getLocationOnScreen(this.messagePos);
                drawingObject.viewFound = true;
                float filterWidth2 = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                float f2 = filterWidth2 / 3.0f;
                drawingObject.lastW = f2;
                drawingObject.lastH = f2;
                float f3 = filterWidth2 / 2.0f;
                drawingObject.lastX = Utilities.clamp(((MessageSendPreview.this.chatListView.getScaleX() * MessageSendPreview.this.mainMessageCell.getTimeX()) + this.messagePos[0]) - f3, AndroidUtilities.displaySize.x - filterWidth2, 0.0f);
                drawingObject.lastY = ((MessageSendPreview.this.chatListView.getScaleY() * MessageSendPreview.this.mainMessageCell.getTimeY()) + this.messagePos[1]) - f3;
            }
        };
    }

    private void afterDismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        View view;
        int i = 1;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean z2 = z && (view = this.optionsView) != null && (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout);
        if (z2) {
            ActionBarPopupWindow.startAnimation((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.optionsView);
        }
        if (!z) {
            hideEffectSelector();
        }
        this.openInProgress = true;
        this.opening = z;
        this.closing = !z;
        this.chatListView.invalidate();
        this.firstOpenFrame = true;
        this.firstOpenFrame2 = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda3(this, i, z2));
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                MessageSendPreview.this.openProgress = z ? 1.0f : 0.0f;
                MessageSendPreview.this.firstOpenFrame = false;
                MessageSendPreview.this.firstOpenFrame2 = false;
                MessageSendPreview.this.effectsView.setAlpha(MessageSendPreview.this.openProgress);
                if (z) {
                    MessageSendPreview.this.openInProgress = false;
                    MessageSendPreview.this.opening = false;
                    MessageSendPreview.this.closing = false;
                }
                if (MessageSendPreview.this.editText != null) {
                    MessageSendPreview.this.editText.setAlpha(1.0f);
                }
                if (MessageSendPreview.this.destCell != null) {
                    MessageSendPreview.this.destCell.setVisibility(0);
                }
                if (MessageSendPreview.this.anchorSendButton != null && !MessageSendPreview.this.sent) {
                    MessageSendPreview.this.anchorSendButton.setAlpha(1.0f);
                }
                if (!z && MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setAlpha(0.0f);
                }
                if (!z2 && MessageSendPreview.this.optionsView != null) {
                    MessageSendPreview.this.optionsView.setAlpha(MessageSendPreview.this.openProgress);
                }
                MessageSendPreview.this.chatListView.invalidate();
                MessageSendPreview.this.chatListView.setAlpha(MessageSendPreview.this.openProgress);
                MessageSendPreview.this.windowView.invalidate();
                MessageSendPreview.this.containerView.invalidate();
                if (runnable != null) {
                    if (!z && MessageSendPreview.this.destCell != null && MessageSendPreview.this.destCell.isAttachedToWindow()) {
                        MessageSendPreview.this.destCell.post(runnable);
                    } else if (z || MessageSendPreview.this.editText == null || !MessageSendPreview.this.editText.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(runnable);
                    } else {
                        MessageSendPreview.this.editText.post(runnable);
                    }
                }
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        View view = this.optionsView;
        if (view != null) {
            view.invalidate();
        }
    }

    public int getMainMessageCellPosition() {
        if (this.groupedMessagesMap.isEmpty() || this.messageObjects.size() < 10) {
            return 0;
        }
        return this.messageObjects.size() % 10;
    }

    public int getSendButtonWidth() {
        return this.customSendButtonWidth ? this.sendButtonWidth : this.anchorSendButton.width();
    }

    public MessageObject.GroupedMessages getValidGroupedMessage(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    private int getWidthForMessage(MessageObject messageObject) {
        if (getContext() == null) {
            return 0;
        }
        if (this.dummyMessageCell == null) {
            this.dummyMessageCell = new ChatMessageCell(getContext(), this.currentAccount, true, null, this.resourcesProvider);
        }
        ChatMessageCell chatMessageCell = this.dummyMessageCell;
        chatMessageCell.isChat = false;
        chatMessageCell.isSavedChat = false;
        chatMessageCell.isSavedPreviewChat = false;
        chatMessageCell.isBot = false;
        chatMessageCell.isMegagroup = false;
        return chatMessageCell.computeWidth(messageObject, (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupId()));
    }

    public void lambda$allowEffectSelector$6(Integer num) {
        boolean z = num.intValue() - this.insets.bottom > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z;
        this.effectSelectorContainer.animate().translationY((z ? Math.min(this.effectSelectorContainerY, (this.windowView.getHeight() - num.intValue()) - this.effectSelectorContainer.getMeasuredHeight()) : this.effectSelectorContainerY) - this.effectSelectorContainer.getTop()).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    public void lambda$animateOpenTo$11(boolean z, ValueAnimator valueAnimator) {
        View view;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.openProgress = fFloatValue;
        this.effectsView.setAlpha(fFloatValue);
        this.chatListView.setAlpha(this.openProgress);
        if (!z && (view = this.optionsView) != null) {
            view.setAlpha(this.openProgress);
        }
        this.windowView.invalidate();
        this.containerView.invalidate();
    }

    public void lambda$dismiss$10() {
        SpoilerEffect2.pause$1(false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new MessageSendPreview$$ExternalSyntheticLambda3(this, 2));
    }

    public void lambda$dismiss$9() {
        super.dismiss();
    }

    public void lambda$dismissInto$7() {
        super.dismiss();
    }

    public void lambda$dismissInto$8() {
        SpoilerEffect2.pause$1(false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new MessageSendPreview$$ExternalSyntheticLambda3(this, 3));
    }

    public void lambda$new$0(View view) {
        onBackPressed();
    }

    public void lambda$new$1(View view) {
        AndroidUtilities.showKeyboard(view);
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.getLocationOnScreen(this.sendButtonInitialPosition);
            int[] iArr = this.sendButtonInitialPosition;
            int i = iArr[0];
            int width = this.anchorSendButton.getWidth();
            ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
            iArr[0] = zzkl.m(6.0f, width - sendButton2.width(sendButton2.getHeight()), i);
            this.sendButton.setScaleX(this.anchorSendButton.getScaleX());
            this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        }
    }

    public void lambda$new$2(View view) {
        makeFocusable();
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(13, this, view), 100L);
    }

    public void lambda$new$3(View view, View view2) {
        if (this.focusable || !(view2 instanceof EditText)) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.editText);
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(14, this, (EditText) view2), 200L);
    }

    public void lambda$new$4(View view) {
        onBackPressed();
    }

    public void lambda$new$5(View view, int i) {
        onBackPressed();
    }

    public void lambda$prepareBlur$12(float f, View view, Bitmap bitmap, Bitmap bitmap2) {
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.setAlpha(f);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap3 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    public void layout() {
        if (this.windowView.getWidth() <= 0) {
            return;
        }
        int[] iArr = {zzkl.m(6.0f, this.anchorSendButton.getWidth() - this.anchorSendButton.width(), i), 0};
        this.anchorSendButton.getLocationOnScreen(iArr);
        int i = iArr[0];
        this.sendButton.setScaleX(this.anchorSendButton.getScaleX());
        this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        int[] iArr2 = this.sendButtonInitialPosition;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        int measuredHeight = (this.chatListView.getMeasuredHeight() - this.sendButton.getHeight()) + (this.effectSelector != null ? AndroidUtilities.dp(320.0f) : 0);
        int iDp = AndroidUtilities.dp(8.0f) + this.insets.top;
        int iDp2 = AndroidUtilities.dp(this.messageObjects.isEmpty() ? -6.0f : 48.0f);
        View view = this.optionsView;
        int measuredHeight2 = iDp2 + (view == null ? 0 : view.getMeasuredHeight());
        int measuredHeight3 = (this.containerView.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - this.insets.bottom;
        if (iArr[1] + measuredHeight2 > measuredHeight3) {
            iArr[1] = measuredHeight3 - measuredHeight2;
        }
        if (iArr[1] - measuredHeight < iDp) {
            iArr[1] = iDp + measuredHeight;
        }
        if (this.anchorSendButton.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
            iArr[1] = (measuredHeight3 - measuredHeight2) - this.anchorSendButton.getHeight();
        }
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        sendButton.setX(AndroidUtilities.dp(6.0f) + (iArr[0] - (sendButton.getWidth() - this.sendButton.width())));
        this.sendButton.setY(iArr[1]);
        if (this.customSendButtonWidth) {
            iArr[0] = iArr[0] - (this.sendButtonWidth - this.anchorSendButton.width());
        }
        this.chatListView.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - this.chatListView.getMeasuredWidth());
        if (this.layoutDone) {
            this.chatListView.animate().translationY(((this.sendButton.getHeight() + iArr[1]) - this.chatListView.getMeasuredHeight()) - this.chatListView.getTop()).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).setDuration(250L).start();
        } else {
            this.chatListView.setY((this.sendButton.getHeight() + iArr[1]) - this.chatListView.getMeasuredHeight());
        }
        View view2 = this.optionsView;
        if (view2 != null) {
            view2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - this.optionsView.getMeasuredWidth());
            this.optionsView.setY(iArr[1] + (this.messageObjects.isEmpty() ? -AndroidUtilities.dp(6.0f) : this.sendButton.getHeight()));
        }
        FrameLayout frameLayout = this.effectSelectorContainer;
        if (frameLayout != null) {
            frameLayout.setX(BotFullscreenButtons$$ExternalSyntheticOutline1.m(6.0f, (this.sendButton.width() + iArr[0]) - this.effectSelectorContainer.getMeasuredWidth(), 0));
            RectF rectF = this.cameraRect;
            if (rectF != null) {
                FrameLayout frameLayout2 = this.effectSelectorContainer;
                float fMax = Math.max(this.insets.top, rectF.top - frameLayout2.getMeasuredWidth());
                this.effectSelectorContainerY = fMax;
                frameLayout2.setY(fMax);
                ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
                if (reactionsContainerLayout != null) {
                    reactionsContainerLayout.setY(Math.max(this.insets.top, (this.cameraRect.top - AndroidUtilities.dp(24.0f)) - this.effectSelector.getMeasuredHeight()));
                    return;
                }
                return;
            }
            float height = (this.sendButton.getHeight() + iArr[1]) - this.chatListView.getMeasuredHeight();
            FrameLayout frameLayout3 = this.effectSelectorContainer;
            float fMax2 = Math.max(this.insets.top, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
            this.effectSelectorContainerY = fMax2;
            frameLayout3.setY(fMax2);
            ReactionsContainerLayout reactionsContainerLayout2 = this.effectSelector;
            if (reactionsContainerLayout2 != null) {
                reactionsContainerLayout2.setY(Math.max(0.0f, (height - reactionsContainerLayout2.getMeasuredHeight()) - this.effectSelectorContainerY));
            }
        }
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        final float alpha = this.anchorSendButton.getAlpha();
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.setAlpha(0.0f);
        }
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$prepareBlur$12(alpha, view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public void updateMessagesVisiblePart() {
        int measuredHeight = this.containerView.getMeasuredHeight();
        int childCount = this.chatListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                FrameLayout frameLayout = this.containerView;
                RectF rectF = ViewPositionWatcher.tmpRectF2;
                ViewPositionWatcher.computeRectInParent(childAt, frameLayout, rectF);
                float f = rectF.top;
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                int i2 = (int) f;
                childAt.getMeasuredHeight();
                int i3 = i2 >= 0 ? 0 : -i2;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i3 + measuredHeight;
                }
                chatMessageCell.setVisiblePart(i3, measuredHeight2 - i3, measuredHeight, f, f, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight(), 0, 0, 0);
            }
        }
    }

    public void allowEffectSelector(BaseFragment baseFragment) {
        if (this.effectSelector != null || baseFragment == null) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.effectSelectorContainer = frameLayout;
        frameLayout.setClipChildren(false);
        this.effectSelectorContainer.setClipToPadding(false);
        this.effectSelectorContainer.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(5, null, getContext(), this.currentAccount, this.resourcesProvider) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
            }
        };
        this.effectSelector = reactionsContainerLayout;
        reactionsContainerLayout.setClipChildren(false);
        this.effectSelector.setClipToPadding(false);
        this.effectSelector.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.effectSelector.setDelegate(new AnonymousClass15(baseFragment));
        this.effectSelector.setTop(false);
        this.effectSelector.setClipChildren(false);
        this.effectSelector.setClipToPadding(false);
        this.effectSelector.setVisibility(0);
        this.effectSelector.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.effectSelector.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.effectSelector.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.containerView.addView(this.effectSelectorContainer, LayoutHelper.createFrame(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.effectSelectorContainer.addView(this.effectSelector, LayoutHelper.createFrame(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.effectSelector.setScaleY(0.4f);
        this.effectSelector.setScaleX(0.4f);
        this.effectSelector.setAlpha(0.0f);
        if (MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        } else {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.effectSelector;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.setPaused(true, true);
        }
        new KeyboardNotifier(this.windowView, false, new PollItemMenu$$ExternalSyntheticLambda15(this, 12));
    }

    public void changeMessage(MessageObject messageObject) {
        MessageObject.GroupedMessages validGroupedMessage = getValidGroupedMessage(messageObject);
        if (validGroupedMessage == null) {
            changeMessageInternal(messageObject);
            return;
        }
        validGroupedMessage.calculate();
        ArrayList<MessageObject> arrayList = validGroupedMessage.messages;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MessageObject messageObject2 = arrayList.get(i);
            i++;
            changeMessageInternal(messageObject2);
        }
    }

    public void changeMessageInternal(MessageObject messageObject) {
        ChatMessageCell chatMessageCell;
        if (this.chatListView == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.chatListView.getChildCount()) {
                chatMessageCell = null;
                break;
            }
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() == messageObject) {
                    break;
                }
            }
            i++;
        }
        ChatMessageCell chatMessageCell2 = chatMessageCell;
        int size = -1;
        for (int i2 = 0; i2 < this.messageObjects.size(); i2++) {
            if (this.messageObjects.get(i2) == messageObject) {
                size = (this.messageObjects.size() - 1) - i2;
            }
        }
        if (chatMessageCell2 == null) {
            this.chatListView.getAdapter().lambda$onBindViewHolder$31(size);
            return;
        }
        messageObject.forceUpdate = true;
        chatMessageCell2.setMessageObject(messageObject, chatMessageCell2.getCurrentMessagesGroup(), chatMessageCell2.isPinnedBottom(), chatMessageCell2.isPinnedTop(), chatMessageCell2.isFirstInChat());
        this.chatListView.getAdapter().lambda$onBindViewHolder$31(size);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        }
    }

    public void dismiss(boolean z) {
        this.sent = z;
        dismiss();
    }

    public void dismissInstant() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        SpoilerEffect2.pause$1(false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        super.dismiss();
        afterDismiss();
    }

    public void dismissInto(ChatMessageCell chatMessageCell, float f, float f2) {
        if (this.dismissing) {
            return;
        }
        this.sent = true;
        this.dismissing = true;
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.invalidate();
        }
        ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
        if (sendButton2 != null) {
            sendButton2.invalidate();
        }
        if (this.mainMessageCell != null && chatMessageCell != null) {
            this.destCell = chatMessageCell;
            chatMessageCell.setVisibility(4);
            this.destClipTop = f;
            this.destClipBottom = f2;
            ChatMessageCell chatMessageCell2 = this.mainMessageCell;
            ChatMessageCell chatMessageCell3 = this.destCell;
            chatMessageCell2.isChat = chatMessageCell3.isChat;
            chatMessageCell2.isThreadChat = chatMessageCell3.isThreadChat;
            chatMessageCell2.isSavedChat = chatMessageCell3.isSavedChat;
            chatMessageCell2.isBot = chatMessageCell3.isBot;
            chatMessageCell2.isForum = chatMessageCell3.isForum;
            chatMessageCell2.isForumGeneral = chatMessageCell3.isForumGeneral;
            chatMessageCell2.setMessageObject(chatMessageCell.getMessageObject(), null, chatMessageCell.isPinnedBottom(), chatMessageCell.isPinnedTop(), chatMessageCell.isFirstInChat());
            ChatMessageCell.TransitionParams transitionParams = this.mainMessageCell.getTransitionParams();
            transitionParams.animateChange = this.mainMessageCell.getTransitionParams().animateChange();
            transitionParams.animateChangeProgress = 0.0f;
            int i = this.mainMessageCell.getTransitionParams().lastDrawingBackgroundRect.left;
            int backgroundDrawableLeft = this.mainMessageCell.getBackgroundDrawableLeft();
            Rect rect = transitionParams.lastDrawingBackgroundRect;
            if (i != backgroundDrawableLeft || rect.top != this.mainMessageCell.getBackgroundDrawableTop() || rect.bottom != this.mainMessageCell.getBackgroundDrawableBottom()) {
                this.cellDelta.bottom = -(this.mainMessageCell.getBackgroundDrawableBottom() - rect.bottom);
                this.cellDelta.top = -(this.mainMessageCell.getBackgroundDrawableTop() - rect.top);
                if (chatMessageCell.getMessageObject().isOutOwner()) {
                    this.cellDelta.left = -(this.mainMessageCell.getBackgroundDrawableLeft() - rect.left);
                    this.cellDelta.right = 0;
                } else {
                    Rect rect2 = this.cellDelta;
                    rect2.left = 0;
                    rect2.right = this.mainMessageCell.getBackgroundDrawableRight() - rect.right;
                }
                transitionParams.animateBackgroundBoundsInner = true;
            }
            this.fromPart = VisiblePart.of(this.mainMessageCell);
        }
        animateOpenTo(false, new MessageSendPreview$$ExternalSyntheticLambda3(this, 0));
        this.windowView.invalidate();
        afterDismiss();
    }

    public void drawStarsPrice(Canvas canvas, float f, float f2, float f3, float f4) {
        if (this.buttonText == null || this.buttonBgPaint == null) {
            return;
        }
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float currentWidth = this.buttonText.getCurrentWidth() + AndroidUtilities.dp(28.0f);
        float fDp = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = currentWidth / 2.0f;
        float f8 = f5 - f7;
        float f9 = fDp / 2.0f;
        rectF.set(f8, f6 - f9, f5 + f7, f6 + f9);
        canvas.save();
        canvas.drawRoundRect(rectF, f9, f9, this.buttonBgPaint);
        this.buttonText.draw(canvas, f8 + AndroidUtilities.dp(14.0f), f6, -1, 1.0f);
        canvas.restore();
    }

    public long getSelectedEffect() {
        MessageObject messageObject;
        if (!this.sentEffect && this.effectSelector != null) {
            if (this.cameraRect != null) {
                this.sentEffect = true;
                return this.effectId;
            }
            ChatMessageCell chatMessageCell = this.mainMessageCell;
            if (chatMessageCell == null || (messageObject = chatMessageCell.getMessageObject()) == null) {
                return 0L;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if ((message.flags2 & 4) == 0) {
                return 0L;
            }
            this.sentEffect = true;
            return message.effect;
        }
        return 0L;
    }

    public void hideEffectSelector() {
        ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
        if (reactionsContainerLayout != null && this.effectSelectorShown) {
            reactionsContainerLayout.dismissWindow();
            if (this.effectSelector.getReactionsWindow() != null && this.effectSelector.getReactionsWindow().containerView != null) {
                this.effectSelector.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.effectSelector.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
    }

    @Override
    public boolean isShowing() {
        return !this.dismissing;
    }

    public void makeFocusable() {
        if (this.focusable) {
            return;
        }
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags &= -131073;
            window.setAttributes(attributes);
            this.focusable = true;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onBackPressed() {
        if (this.keyboardVisible) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.keyboardVisible = false;
            return;
        }
        ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
        if (reactionsContainerLayout == null || reactionsContainerLayout.getReactionsWindow() == null) {
            this.sentEffect = true;
            super.onBackPressed();
        } else {
            if (this.effectSelector.getReactionsWindow().transition) {
                return;
            }
            this.effectSelector.getReactionsWindow().dismiss();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.currentTheme.isDark());
    }

    public void onEffectChange(long j) {
    }

    public void scrollTo(boolean z) {
        int i;
        RecyclerListView recyclerListView = this.chatListView;
        if (recyclerListView == null || recyclerListView.getAdapter() == null || this.chatLayoutManager == null) {
            return;
        }
        int itemCount = this.chatListView.getAdapter().getItemCount();
        if (z) {
            i = itemCount > 10 ? itemCount % 10 : 0;
        } else {
            i = itemCount - 1;
        }
        this.chatLayoutManager.scrollToPositionWithOffset(i, AndroidUtilities.dp(12.0f), z);
        this.scrolledToLast = z;
    }

    public void setCameraTexture(TextureView textureView) {
        if (textureView == null) {
            return;
        }
        this.cameraRect = new RectF();
        int[] iArr = new int[2];
        textureView.getLocationOnScreen(iArr);
        RectF rectF = this.cameraRect;
        int i = iArr[0];
        rectF.set(i, iArr[1], textureView.getWidth() + i, textureView.getHeight() + iArr[1]);
    }

    public void setEditText(EditTextCaption editTextCaption, Utilities.Callback2<Canvas, Utilities.Callback0Return<Boolean>> callback2, Utilities.Callback<Canvas> callback) {
        this.editText = editTextCaption;
        this.drawEditText = callback2;
        this.drawEditTextBackground = callback;
    }

    public void setEffectId(long j) {
        TLRPC.TL_availableEffect effect;
        this.effectId = j;
        int mainMessageCellPosition = getMainMessageCellPosition();
        MessageObject messageObject = (mainMessageCellPosition < 0 || mainMessageCellPosition >= this.messageObjects.size()) ? null : this.messageObjects.get(mainMessageCellPosition);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j;
        }
        if (this.effectSelector == null || (effect = MessagesController.getInstance(this.currentAccount).getEffect(j)) == null) {
            return;
        }
        this.effectSelector.setSelectedReactionAnimated(ReactionsLayoutInBubble.VisibleReaction.fromTL(effect));
    }

    public void setItemOptions(ItemOptions itemOptions) {
        itemOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
        itemOptions.setBlurBackground(this.iBlur3Factory, (BlurredBackgroundProvider) BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        ViewGroup layout = itemOptions.getLayout();
        this.optionsView = layout;
        this.containerView.addView(layout, LayoutHelper.createFrame(-2, -2.0f));
    }

    public void setMessageObjects(ArrayList<MessageObject> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    this.groupedMessagesMap.put(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= groupedMessages.messages.size()) {
                            groupedMessages.messages.add(messageObject);
                            break;
                        } else if (groupedMessages.messages.get(i2).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
        }
        for (int i3 = 0; i3 < this.groupedMessagesMap.size(); i3++) {
            ((MessageObject.GroupedMessages) this.groupedMessagesMap.valueAt(i3)).calculate();
        }
        this.messageObjects.addAll(arrayList);
        for (int i4 = 0; i4 < this.messageObjects.size(); i4++) {
            this.messageObjectsWidth = Math.max(this.messageObjectsWidth, getWidthForMessage(this.messageObjects.get(i4)));
        }
        this.chatListView.getAdapter().notifyDataSetChanged();
        int itemCount = this.chatListView.getAdapter().getItemCount();
        this.chatLayoutManager.scrollToPositionWithOffset(itemCount > 10 ? itemCount % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public ChatActivityEnterView.SendButton setSendButton(final ChatActivityEnterView.SendButton sendButton, final boolean z, View.OnClickListener onClickListener) {
        this.anchorSendButton = sendButton;
        sendButton.getLocationOnScreen(this.sendButtonInitialPosition);
        ChatActivityEnterView.SendButton sendButton2 = new ChatActivityEnterView.SendButton(getContext(), sendButton.resId, this.resourcesProvider) {
            @Override
            public int getFillColor() {
                return sendButton.getFillColor();
            }

            @Override
            public boolean isInScheduleMode() {
                return sendButton.isInScheduleMode();
            }

            @Override
            public boolean isInactive() {
                return sendButton.isInactive();
            }

            @Override
            public boolean isOpen() {
                return (z && MessageSendPreview.this.dismissing && !super.isOpen()) ? false : true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return sendButton.shouldDrawBackground();
            }
        };
        this.sendButton = sendButton2;
        sendButton2.setScaleX(this.anchorSendButton.getScaleX());
        this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        this.anchorSendButton.copyTo(this.sendButton);
        this.sendButton.open.set(sendButton.open.get(), true);
        this.sendButton.setOnClickListener(onClickListener);
        this.containerView.addView(this.sendButton, new ViewGroup.LayoutParams(sendButton.getWidth(), sendButton.getHeight()));
        this.sendButtonWidth = this.anchorSendButton.width(sendButton.getHeight());
        int[] iArr = this.sendButtonInitialPosition;
        iArr[0] = zzkl.m(6.0f, this.anchorSendButton.getWidth() - this.anchorSendButton.width(sendButton.getHeight()), iArr[0]);
        return this.sendButton;
    }

    public void setSendButtonWidth(int i) {
        this.customSendButtonWidth = true;
        this.sendButtonWidth = i;
    }

    public void setStars(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.buttonText = j > 0 ? new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.buttonBgPaint == null) {
            Paint paint = new Paint(1);
            this.buttonBgPaint = paint;
            paint.setColor(1073741824);
        }
        this.chatListView.invalidate();
        for (int i = 0; i < this.messageObjects.size(); i++) {
            MessageObject messageObject = this.messageObjects.get(i);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j > 0;
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            SpoilerEffect2.pause$1(true);
            super.show();
            prepareBlur(null);
            FrameLayout frameLayout = this.effectsView;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            animateOpenTo(true, null);
        }
    }

    public void showEffectSelector() {
        if (this.effectSelectorShown) {
            return;
        }
        this.layoutDone = false;
        this.effectSelectorShown = true;
        this.effectSelector.setMessage(null, null, true);
        this.effectSelector.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        this.effectSelector.startEnterAnimation(false);
    }

    public void updateColors() {
    }

    @Override
    public void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.invalidate();
        }
        ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
        if (sendButton2 != null) {
            sendButton2.invalidate();
        }
        animateOpenTo(false, new MessageSendPreview$$ExternalSyntheticLambda3(this, 1));
        this.windowView.invalidate();
        afterDismiss();
    }
}
