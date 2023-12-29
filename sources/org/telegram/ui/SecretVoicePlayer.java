package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.HintView2;
public class SecretVoicePlayer extends Dialog {
    private AudioVisualizerDrawable audioVisualizerDrawable;
    private AlertDialog backDialog;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private ChatMessageCell cell;
    private Runnable checkTimeRunnable;
    private float clipBottom;
    private float clipTop;
    private Runnable closeAction;
    private TextView closeButton;
    private FrameLayout containerView;
    public final Context context;
    private boolean dismissing;
    private float dtx;
    private float dty;
    private boolean hasDestTranslation;
    private boolean hasTranslation;
    private HintView2 hintView;
    private final Rect insets;
    private MessageObject messageObject;
    private ChatMessageCell myCell;
    private Runnable openAction;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openProgressLinear;
    private VideoPlayer player;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean setCellInvisible;
    private ThanosEffect thanosEffect;
    private float tx;
    private float ty;
    private FrameLayout windowView;

    public SecretVoicePlayer(Context context) {
        super(context, R.style.TransparentDialog);
        this.insets = new Rect();
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.checkTimeRunnable = new Runnable() {
            @Override
            public final void run() {
                SecretVoicePlayer.this.checkTime();
            }
        };
        this.dismissing = false;
        this.context = context;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (SecretVoicePlayer.this.openProgress > 0.0f && SecretVoicePlayer.this.blurBitmapPaint != null) {
                    SecretVoicePlayer.this.blurMatrix.reset();
                    float width = getWidth() / SecretVoicePlayer.this.blurBitmap.getWidth();
                    SecretVoicePlayer.this.blurMatrix.postScale(width, width);
                    SecretVoicePlayer.this.blurBitmapShader.setLocalMatrix(SecretVoicePlayer.this.blurMatrix);
                    SecretVoicePlayer.this.blurBitmapPaint.setAlpha((int) (SecretVoicePlayer.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), SecretVoicePlayer.this.blurBitmapPaint);
                }
                if (SecretVoicePlayer.this.setCellInvisible && SecretVoicePlayer.this.cell != null) {
                    SecretVoicePlayer.this.cell.setVisibility(4);
                    SecretVoicePlayer.this.setCellInvisible = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    SecretVoicePlayer.this.dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                SecretVoicePlayer.this.setupTranslation();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SecretVoicePlayer.this.lambda$new$0(view);
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == SecretVoicePlayer.this.myCell || view == SecretVoicePlayer.this.hintView) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(SecretVoicePlayer.this.clipTop, 0.0f, SecretVoicePlayer.this.openProgress), getWidth(), AndroidUtilities.lerp(SecretVoicePlayer.this.clipBottom, getHeight(), SecretVoicePlayer.this.openProgress));
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.containerView = frameLayout2;
        this.windowView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 21) {
            this.windowView.setFitsSystemWindows(true);
            this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 30) {
                        SecretVoicePlayer.this.insets.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                    } else {
                        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                        SecretVoicePlayer.this.insets.set(insets.left, insets.top, insets.right, insets.bottom);
                    }
                    SecretVoicePlayer.this.containerView.setPadding(SecretVoicePlayer.this.insets.left, SecretVoicePlayer.this.insets.top, SecretVoicePlayer.this.insets.right, SecretVoicePlayer.this.insets.bottom);
                    SecretVoicePlayer.this.windowView.requestLayout();
                    if (i >= 30) {
                        return WindowInsets.CONSUMED;
                    }
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
        }
    }

    public void lambda$new$0(View view) {
        if (this.closeAction == null) {
            dismiss();
        }
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SecretVoicePlayer.this.lambda$prepareBlur$1(view, (Bitmap) obj);
            }
        }, 14.0f);
    }

    public void lambda$prepareBlur$1(View view, Bitmap bitmap) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap2 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
    }

    @Override
    protected void onCreate(Bundle bundle) {
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
        attributes.flags = i;
        attributes.softInputMode = 48;
        int i2 = i | 131072;
        attributes.flags = i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            attributes.flags = i2 | (-2013200128);
        }
        int i4 = attributes.flags | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM;
        attributes.flags = i4;
        int i5 = i4 | 1024;
        attributes.flags = i5;
        attributes.flags = i5 | 128;
        if (i3 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    public void setupTranslation() {
        if (this.hasTranslation || this.windowView.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int width = this.windowView.getWidth();
            Rect rect = this.insets;
            this.tx = (iArr[0] - this.insets.left) - ((((width - rect.left) - rect.right) - this.cell.getWidth()) / 2.0f);
            int height = this.windowView.getHeight();
            Rect rect2 = this.insets;
            this.ty = (iArr[1] - this.insets.top) - ((((height - rect2.top) - rect2.bottom) - this.cell.getHeight()) / 2.0f);
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dtx = 0.0f;
                float clamp = (Utilities.clamp(iArr[1] + (this.cell.getHeight() / 2.0f), this.windowView.getHeight() * 0.7f, this.windowView.getHeight() * 0.3f) - (this.cell.getHeight() / 2.0f)) - ((this.windowView.getHeight() - this.cell.getHeight()) / 2.0f);
                this.dty = clamp;
                this.dty = AndroidUtilities.lerp(0.0f, clamp, 0.78f);
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    public void updateTranslation() {
        if (this.thanosEffect != null) {
            return;
        }
        this.myCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx, this.openProgress));
        this.myCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx, this.openProgress));
            this.hintView.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        }
    }

    public void setCell(ChatMessageCell chatMessageCell, Runnable runnable, Runnable runnable2) {
        ChatMessageCell chatMessageCell2;
        this.openAction = runnable;
        this.closeAction = runnable2;
        ChatMessageCell chatMessageCell3 = this.myCell;
        if (chatMessageCell3 != null) {
            this.containerView.removeView(chatMessageCell3);
            this.myCell = null;
        }
        this.cell = chatMessageCell;
        this.messageObject = chatMessageCell != null ? chatMessageCell.getMessageObject() : null;
        ChatMessageCell chatMessageCell4 = this.cell;
        this.resourcesProvider = chatMessageCell4 != null ? chatMessageCell4.getResourcesProvider() : null;
        if (this.cell != null) {
            this.clipTop = chatMessageCell.parentBoundsTop;
            this.clipBottom = chatMessageCell.parentBoundsBottom;
            if (chatMessageCell.getParent() instanceof View) {
                View view = (View) chatMessageCell.getParent();
                this.clipTop += view.getY();
                this.clipBottom += view.getY();
            }
            ChatMessageCell chatMessageCell5 = new ChatMessageCell(this, getContext(), false, null, this.cell.getResourcesProvider()) {
                @Override
                public void setPressed(boolean z) {
                }
            };
            this.myCell = chatMessageCell5;
            chatMessageCell5.setDelegate(new ChatMessageCell.ChatMessageCellDelegate(this) {
                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell6, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell6, tLRPC$KeyboardButton);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell6, tLRPC$Chat, i, f, f2);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC$User tLRPC$User, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell6, tLRPC$User, f, f2);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell6, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell6, animatedEmojiSpan);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell6, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell6, tLRPC$KeyboardButton);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell6);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC$Chat tLRPC$Chat, int i, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell6, tLRPC$Chat, i, f, f2);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell6, TLRPC$Chat tLRPC$Chat, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell6, tLRPC$Chat, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell6);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell6, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell6, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell6);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell6, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell6, tLRPC$KeyboardButton);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell6, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell6, i);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell6);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell6, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell6, i);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell6, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell6, i);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell6);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell6, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell6, tLRPC$ReactionCount, z);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell6, int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell6, i);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell6);
                }

                @Override
                public void didPressSponsoredClose() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell6);
                }

                @Override
                public void didPressTopicButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTopicButton(this, chatMessageCell6);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell6, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell6, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC$User tLRPC$User, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell6, tLRPC$User, f, f2);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell6, TLRPC$User tLRPC$User, TLRPC$Document tLRPC$Document) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell6, tLRPC$User, tLRPC$Document);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell6, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell6, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell6, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell6, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell6, ArrayList arrayList, int i, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell6, arrayList, i, i2, i3);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell6, TLRPC$WebPage tLRPC$WebPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell6.getContext(), str);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell6);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell6);
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                }

                @Override
                public boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                }

                @Override
                public void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell6, int i) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell6, i);
                }

                @Override
                public boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                }

                @Override
                public boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                }

                @Override
                public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i, i2);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell6, MessageObject messageObject, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell6, messageObject, z);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i);
                }

                @Override
                public boolean onAccessibilityAction(int i, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i, bundle);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell6);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
                }

                @Override
                public boolean shouldShowTopicButton() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldShowTopicButton(this);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell6 = this.myCell;
            MessageObject messageObject = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell7 = this.cell;
            chatMessageCell6.setMessageObject(messageObject, currentMessagesGroup, chatMessageCell7.pinnedBottom, chatMessageCell7.pinnedTop);
            AudioVisualizerDrawable audioVisualizerDrawable = new AudioVisualizerDrawable();
            this.audioVisualizerDrawable = audioVisualizerDrawable;
            audioVisualizerDrawable.setParentView(this.myCell);
            this.myCell.overrideAudioVisualizer(this.audioVisualizerDrawable);
            if (this.myCell.getSeekBarWaveform() != null) {
                this.myCell.getSeekBarWaveform().setExplosionRate(this.openProgressLinear);
            }
            this.hasTranslation = false;
            this.containerView.addView(this.myCell, new FrameLayout.LayoutParams(this.cell.getWidth(), this.cell.getHeight(), 17));
        }
        MediaController.getInstance().pauseByRewind();
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.player.releasePlayer(true);
            this.player = null;
        }
        ChatMessageCell chatMessageCell8 = this.cell;
        if (chatMessageCell8 != null && chatMessageCell8.getMessageObject() != null) {
            File pathToAttach = FileLoader.getInstance(this.cell.getMessageObject().currentAccount).getPathToAttach(this.cell.getMessageObject().getDocument());
            if (pathToAttach == null || !pathToAttach.exists()) {
                pathToAttach = FileLoader.getInstance(this.cell.getMessageObject().currentAccount).getPathToMessage(this.cell.getMessageObject().messageOwner);
            }
            if ((pathToAttach == null || !pathToAttach.exists()) && this.cell.getMessageObject().messageOwner.attachPath != null) {
                pathToAttach = new File(this.cell.getMessageObject().messageOwner.attachPath);
            }
            if (pathToAttach == null) {
                return;
            }
            VideoPlayer videoPlayer2 = new VideoPlayer();
            this.player = videoPlayer2;
            videoPlayer2.setDelegate(new VideoPlayer.VideoPlayerDelegate() {
                @Override
                public void onError(VideoPlayer videoPlayer3, Exception exc) {
                }

                @Override
                public void onRenderedFirstFrame() {
                }

                @Override
                public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
                }

                @Override
                public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
                }

                @Override
                public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
                }

                @Override
                public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                    return false;
                }

                @Override
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override
                public void onVideoSizeChanged(int i, int i2, int i3, float f) {
                }

                @Override
                public void onStateChanged(boolean z, int i) {
                    if (i != 4) {
                        AndroidUtilities.cancelRunOnUIThread(SecretVoicePlayer.this.checkTimeRunnable);
                        AndroidUtilities.runOnUIThread(SecretVoicePlayer.this.checkTimeRunnable, 16L);
                        return;
                    }
                    SecretVoicePlayer.this.dismiss();
                }
            });
            this.player.setAudioVisualizerDelegate(new VideoPlayer.AudioVisualizerDelegate() {
                @Override
                public void onVisualizerUpdate(boolean z, boolean z2, float[] fArr) {
                    SecretVoicePlayer.this.audioVisualizerDrawable.setWaveform(z, z2, fArr);
                }

                @Override
                public boolean needUpdate() {
                    return SecretVoicePlayer.this.audioVisualizerDrawable.getParentView() != null;
                }
            });
            this.player.preparePlayer(Uri.fromFile(pathToAttach), "other");
            this.player.play();
        }
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            this.containerView.removeView(hintView2);
            this.hintView = null;
        }
        MessageObject messageObject2 = this.messageObject;
        boolean z = messageObject2 != null && messageObject2.isOutOwner();
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 != null && messageObject3.getDialogId() != UserConfig.getInstance(this.messageObject.currentAccount).getClientUserId()) {
            HintView2 hintView22 = new HintView2(this.context, 3);
            this.hintView = hintView22;
            hintView22.setMultilineText(true);
            if (z) {
                String str = "";
                long dialogId = this.messageObject.getDialogId();
                if (dialogId > 0) {
                    TLRPC$User user = MessagesController.getInstance(this.messageObject.currentAccount).getUser(Long.valueOf(dialogId));
                    if (user != null) {
                        str = UserObject.getFirstName(user);
                    }
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(this.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                    if (chat != null) {
                        str = chat.title;
                    }
                }
                this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoiceOnceOutHint, str)));
            } else {
                this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoiceOnceHint)));
            }
            this.hintView.setRounding(12.0f);
            this.hintView.setPadding(AndroidUtilities.dp((z || this.cell.pinnedBottom) ? 0.0f : 6.0f), 0, 0, 0);
            this.hintView.setJointPx(0.0f, AndroidUtilities.dp(34.0f));
            this.hintView.setTextSize(14);
            HintView2 hintView23 = this.hintView;
            hintView23.setMaxWidthPx(HintView2.cutInFancyHalf(hintView23.getText(), this.hintView.getTextPaint()));
            this.containerView.addView(this.hintView, LayoutHelper.createFrame((int) ((this.cell.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((this.cell.getWidth() * (-0.39999998f)) / 2.0f) + this.cell.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((this.cell.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
            this.hintView.show();
        }
        TextView textView = this.closeButton;
        if (textView != null) {
            this.containerView.removeView(textView);
            this.closeButton = null;
        }
        TextView textView2 = new TextView(this.context);
        this.closeButton = textView2;
        textView2.setTextColor(-1);
        this.closeButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        if (Theme.isCurrentThemeDark()) {
            this.closeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(64, 553648127, 872415231));
        } else {
            this.closeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(64, 771751936, 1140850688));
        }
        this.closeButton.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        ScaleStateListAnimator.apply(this.closeButton);
        this.closeButton.setText(LocaleController.getString(z ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
        this.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                SecretVoicePlayer.this.lambda$setCell$2(view2);
            }
        });
        this.containerView.addView(this.closeButton, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
        if (z || (chatMessageCell2 = this.myCell) == null || chatMessageCell2.getMessageObject() == null || this.myCell.getMessageObject().messageOwner == null) {
            return;
        }
        this.myCell.getMessageObject().messageOwner.media_unread = false;
        this.myCell.invalidate();
    }

    public void lambda$setCell$2(View view) {
        dismiss();
    }

    @Override
    public void show() {
        super.show();
        prepareBlur(this.cell);
        this.setCellInvisible = true;
        animateOpenTo(true, null);
        Runnable runnable = this.openAction;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.openAction = null;
        }
    }

    public void checkTime() {
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer == null) {
            return;
        }
        float currentPosition = ((float) videoPlayer.getCurrentPosition()) / ((float) this.player.getDuration());
        ChatMessageCell chatMessageCell = this.myCell;
        if (chatMessageCell != null) {
            chatMessageCell.overrideDuration((this.player.getDuration() - this.player.getCurrentPosition()) / 1000);
            this.myCell.updatePlayingMessageProgress();
            SeekBarWaveform seekBarWaveform = this.myCell.getSeekBarWaveform();
            if (seekBarWaveform != null) {
                seekBarWaveform.explodeAt(currentPosition);
            }
        }
        if (this.player.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.checkTimeRunnable);
            AndroidUtilities.runOnUIThread(this.checkTimeRunnable, 16L);
        }
    }

    public boolean isShown() {
        return !this.dismissing;
    }

    @Override
    public void onBackPressed() {
        MessageObject messageObject;
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
        } else if (!this.dismissing && (messageObject = this.messageObject) != null && !messageObject.isOutOwner()) {
            AlertDialog create = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.VoiceOnceCloseTitle)).setMessage(LocaleController.getString(R.string.VoiceOnceCloseMessage)).setPositiveButton(LocaleController.getString(R.string.Continue), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SecretVoicePlayer.this.lambda$onBackPressed$3(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Delete), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SecretVoicePlayer.this.lambda$onBackPressed$4(dialogInterface, i);
                }
            }).create();
            this.backDialog = create;
            create.show();
            TextView textView = (TextView) this.backDialog.getButton(-2);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        } else {
            super.onBackPressed();
        }
    }

    public void lambda$onBackPressed$3(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void lambda$onBackPressed$4(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
        }
        dismiss();
    }

    @Override
    public void dismiss() {
        if (this.dismissing) {
            return;
        }
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
        }
        this.dismissing = true;
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
        }
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.player.releasePlayer(true);
            this.player = null;
        }
        ChatMessageCell chatMessageCell = this.myCell;
        if (chatMessageCell != null && chatMessageCell.getSeekBarWaveform() != null) {
            this.myCell.getSeekBarWaveform().setExplosionRate(this.openProgressLinear);
        }
        this.hasTranslation = false;
        setupTranslation();
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                SecretVoicePlayer.this.lambda$dismiss$6();
            }
        });
        this.windowView.invalidate();
        Runnable runnable = this.closeAction;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.closeAction = null;
            ThanosEffect thanosEffect = new ThanosEffect(this.context, null);
            this.thanosEffect = thanosEffect;
            this.windowView.addView(thanosEffect, LayoutHelper.createFrame(-1, -1, 119));
            this.thanosEffect.animate(this.myCell, new Runnable() {
                @Override
                public final void run() {
                    SecretVoicePlayer.this.lambda$dismiss$7();
                }
            });
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
    }

    public void lambda$dismiss$6() {
        if (this.thanosEffect == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretVoicePlayer.this.lambda$dismiss$5();
                }
            });
            ChatMessageCell chatMessageCell = this.cell;
            if (chatMessageCell != null) {
                chatMessageCell.invalidate();
                this.cell.setVisibility(0);
            }
        }
        MediaController.getInstance().tryResumePausedAudio();
    }

    public void lambda$dismiss$5() {
        super.dismiss();
    }

    public void lambda$dismiss$7() {
        super.dismiss();
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            chatMessageCell.setVisibility(0);
            this.cell.invalidate();
        }
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        setupTranslation();
        float[] fArr = new float[2];
        fArr[0] = this.openProgressLinear;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.openAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SecretVoicePlayer.this.lambda$animateOpenTo$8(z, valueAnimator2);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SecretVoicePlayer secretVoicePlayer = SecretVoicePlayer.this;
                secretVoicePlayer.openProgress = secretVoicePlayer.openProgressLinear = z ? 1.0f : 0.0f;
                SecretVoicePlayer.this.windowView.invalidate();
                SecretVoicePlayer.this.containerView.invalidate();
                SecretVoicePlayer.this.updateTranslation();
                if (SecretVoicePlayer.this.closeButton != null) {
                    SecretVoicePlayer.this.closeButton.setAlpha(SecretVoicePlayer.this.openProgress);
                }
                if (SecretVoicePlayer.this.myCell != null && SecretVoicePlayer.this.myCell.getSeekBarWaveform() != null) {
                    SecretVoicePlayer.this.myCell.getSeekBarWaveform().setExplosionRate(SecretVoicePlayer.this.openProgressLinear);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.openAnimator.setDuration((z || this.closeAction != null) ? 520L : 330L);
        this.openAnimator.start();
    }

    public void lambda$animateOpenTo$8(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.openProgressLinear = floatValue;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.openProgress = z ? cubicBezierInterpolator.getInterpolation(floatValue) : 1.0f - cubicBezierInterpolator.getInterpolation(1.0f - floatValue);
        this.windowView.invalidate();
        this.containerView.invalidate();
        updateTranslation();
        TextView textView = this.closeButton;
        if (textView != null) {
            textView.setAlpha(this.openProgress);
        }
        ChatMessageCell chatMessageCell = this.myCell;
        if (chatMessageCell == null || chatMessageCell.getSeekBarWaveform() == null) {
            return;
        }
        this.myCell.getSeekBarWaveform().setExplosionRate((z ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(Utilities.clamp(this.openProgressLinear * 1.25f, 1.0f, 0.0f)));
    }
}
