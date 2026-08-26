package org.telegram.ui;

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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda53;
import org.telegram.ui.Components.CubicBezierInterpolator;
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
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda14;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class MessageSendPreview extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public LaunchActivity.ActivityVisibilityController activityVisibilityController;
    public final AnonymousClass10 adapter;
    public boolean allowRelayout;
    public ChatActivityEnterView.SendButton anchorSendButton;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public Paint buttonBgPaint;
    public Text buttonText;
    public RectF cameraRect;
    public final Rect cellDelta;
    public final AnonymousClass7 chatLayoutManager;
    public final AnonymousClass4 chatListView;
    public boolean closing;
    public final AnonymousClass2 containerView;
    public final Context context;
    public final int currentAccount;
    public boolean customSendButtonWidth;
    public ChatMessageCell destCell;
    public float destClipBottom;
    public float destClipTop;
    public boolean dismissing;
    public CallLogActivity$$ExternalSyntheticLambda3 drawEditText;
    public ChatActivityEnterView$$ExternalSyntheticLambda53 drawEditTextBackground;
    public ChatMessageCell dummyMessageCell;
    public ChatActivityEnterView.AnonymousClass50 editText;
    public final Paint editTextBackgroundPaint;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable effectDrawable;
    public long effectId;
    public final AnonymousClass12 effectOverlay;
    public AnonymousClass14 effectSelector;
    public FrameLayout effectSelectorContainer;
    public float effectSelectorContainerY;
    public boolean effectSelectorShown;
    public final AnonymousClass1 effectsView;
    public boolean firstOpenFrame;
    public boolean firstOpenFrame2;
    public boolean focusable;
    public final LongSparseArray groupedMessagesMap;
    public final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    public Insets insets;
    public boolean keyboardVisible;
    public boolean layoutDone;
    public ChatMessageCell mainMessageCell;
    public int mainMessageCellId;
    public final ArrayList messageObjects;
    public int messageObjectsWidth;
    public ValueAnimator openAnimator;
    public boolean openInProgress;
    public float openProgress;
    public ViewGroup optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scrolledToLast;
    public AnonymousClass13 sendButton;
    public final int[] sendButtonInitialPosition;
    public int sendButtonWidth;
    public boolean sent;
    public boolean sentEffect;
    public final SpoilerEffect2 spoilerEffect2;
    public final AnonymousClass1 windowView;

    public final class AnonymousClass14 extends ReactionsContainerLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setPivotX(getMeasuredWidth());
            setPivotY(getMeasuredHeight());
        }
    }

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        public final Paint backgroundPaint;
        public int chatListViewTy;
        public final GradientClip clip;
        public final int[] destCellPos;
        public final int[] pos;
        public final int[] pos2;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, null);
            this.val$resourcesProvider = resourcesProvider;
            this.pos = new int[2];
            this.pos2 = new int[2];
            this.chatListViewTy = 0;
            this.destCellPos = new int[2];
            this.clip = new GradientClip();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.backgroundPaint = new Paint(1);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            final Canvas canvas2;
            char c;
            ChatMessageCell chatMessageCell;
            float f;
            float height;
            float fLerp;
            float f2;
            float f3;
            char c2;
            float f4;
            MessageSendPreview messageSendPreview = MessageSendPreview.this;
            if (messageSendPreview.openInProgress && (chatMessageCell = messageSendPreview.mainMessageCell) != null && chatMessageCell.getCurrentPosition() == null) {
                if (messageSendPreview.firstOpenFrame) {
                    ChatActivityEnterView.AnonymousClass50 anonymousClass50 = messageSendPreview.editText;
                    if (anonymousClass50 != null) {
                        anonymousClass50.setAlpha(0.0f);
                    }
                    messageSendPreview.firstOpenFrame = false;
                }
                boolean z = messageSendPreview.mainMessageCell.getMessageObject() != null && messageSendPreview.mainMessageCell.getMessageObject().type == 15;
                float imageX = z ? messageSendPreview.mainMessageCell.getPhotoImage().getImageX() : messageSendPreview.mainMessageCell.getTextX();
                float imageY = z ? messageSendPreview.mainMessageCell.getPhotoImage().getImageY() : messageSendPreview.mainMessageCell.getTextY();
                AnonymousClass4 anonymousClass4 = messageSendPreview.chatListView;
                float x = messageSendPreview.mainMessageCell.getX() + anonymousClass4.getX() + imageX;
                float y = messageSendPreview.mainMessageCell.getY() + anonymousClass4.getY() + imageY;
                float textSize = (messageSendPreview.mainMessageCell.getMessageObject() != null ? messageSendPreview.mainMessageCell.getMessageObject().getTextPaint() : Theme.chat_msgTextPaint).getTextSize();
                ChatActivityEnterView.AnonymousClass50 anonymousClass51 = messageSendPreview.editText;
                if (anonymousClass51 != null) {
                    int[] iArr = this.pos;
                    anonymousClass51.getLocationOnScreen(iArr);
                    float paddingLeft = messageSendPreview.editText.getPaddingLeft() + iArr[0];
                    float paddingTop = (messageSendPreview.editText.getPaddingTop() + iArr[1]) - messageSendPreview.editText.getScrollY();
                    float textSize2 = messageSendPreview.editText.getTextSize();
                    int i = iArr[1];
                    float f5 = i;
                    f = 255.0f;
                    height = messageSendPreview.editText.getMeasuredHeight() + i;
                    float fLerp2 = AndroidUtilities.lerp(paddingLeft, x, messageSendPreview.openProgress);
                    y = AndroidUtilities.lerp(paddingTop, y, messageSendPreview.openProgress);
                    fLerp = AndroidUtilities.lerp(textSize2, textSize, messageSendPreview.openProgress);
                    f2 = fLerp2;
                    f3 = f5;
                } else {
                    f = 255.0f;
                    height = getHeight();
                    fLerp = textSize;
                    f2 = x;
                    f3 = 0.0f;
                }
                float f6 = y;
                float f7 = messageSendPreview.openProgress;
                if (messageSendPreview.destCell != null) {
                    f3 = messageSendPreview.destClipTop;
                }
                float fLerp3 = AndroidUtilities.lerp(f3, ((1.0f - anonymousClass4.getScaleY()) * anonymousClass4.getHeight()) + anonymousClass4.getY(), messageSendPreview.openProgress);
                float fLerp4 = AndroidUtilities.lerp(0.0f, anonymousClass4.canScrollVertically(-1) ? 1.0f : 0.0f, messageSendPreview.openProgress);
                if (messageSendPreview.destCell != null) {
                    height = messageSendPreview.destClipBottom;
                }
                float fLerp5 = AndroidUtilities.lerp(height, anonymousClass4.getY() + anonymousClass4.getHeight(), messageSendPreview.openProgress);
                float fLerp6 = AndroidUtilities.lerp(0.0f, anonymousClass4.canScrollVertically(1) ? 1.0f : 0.0f, messageSendPreview.openProgress);
                final float f8 = fLerp;
                canvas.saveLayerAlpha(0.0f, fLerp3 + 1.0f, getWidth(), fLerp5 - 1.0f, 255, 31);
                if (messageSendPreview.editText != null) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f7) * f), 31);
                    canvas2.translate(f2, f6);
                    canvas2.translate((-messageSendPreview.editText.getX()) - messageSendPreview.editText.getPaddingLeft(), ((-messageSendPreview.editText.getY()) - messageSendPreview.editText.getPaddingTop()) + messageSendPreview.editText.getScrollY());
                    float alpha = messageSendPreview.editText.getAlpha();
                    messageSendPreview.editText.setAlpha(1.0f);
                    if (messageSendPreview.openProgress >= 0.001f) {
                        f4 = alpha;
                    } else if (messageSendPreview.drawEditTextBackground != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, messageSendPreview.editText.getY());
                        f4 = alpha;
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(messageSendPreview.editText.getX() + messageSendPreview.editText.getPaddingLeft(), 0.0f, ((messageSendPreview.editText.getX() + messageSendPreview.editText.getPaddingLeft()) + messageSendPreview.editText.getWidth()) - messageSendPreview.editText.getPaddingRight(), messageSendPreview.editText.getHeight(), (int) OKLCH.m$1(messageSendPreview.openProgress, 0.1f, 1.0f, 255.0f), 31);
                        messageSendPreview.drawEditTextBackground.run(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f4 = alpha;
                        Paint paint = messageSendPreview.editTextBackgroundPaint;
                        paint.setColor(Theme.getColor(Theme.key_chat_messagePanelBackground, this.val$resourcesProvider));
                        paint.setAlpha((int) OKLCH.m$1(messageSendPreview.openProgress, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(messageSendPreview.editText.getPaddingLeft(), messageSendPreview.editText.getY(), ((messageSendPreview.editText.getX() + messageSendPreview.editText.getPaddingLeft()) + messageSendPreview.editText.getWidth()) - messageSendPreview.editText.getPaddingRight(), messageSendPreview.editText.getY() + messageSendPreview.editText.getHeight(), paint);
                    }
                    CallLogActivity$$ExternalSyntheticLambda3 callLogActivity$$ExternalSyntheticLambda3 = messageSendPreview.drawEditText;
                    if (callLogActivity$$ExternalSyntheticLambda3 != null) {
                        callLogActivity$$ExternalSyntheticLambda3.run(canvas2, new Utilities.Callback0Return() {
                            @Override
                            public final Object run() {
                                MessageSendPreview.AnonymousClass2 anonymousClass2 = this.f$0;
                                anonymousClass2.getClass();
                                Canvas canvas3 = canvas2;
                                canvas3.save();
                                MessageSendPreview messageSendPreview2 = MessageSendPreview.this;
                                canvas3.translate(messageSendPreview2.editText.getX(), messageSendPreview2.editText.getY() - messageSendPreview2.editText.getScrollY());
                                float textSize3 = f8 / messageSendPreview2.editText.getTextSize();
                                canvas3.scale(textSize3, textSize3, messageSendPreview2.editText.getPaddingLeft(), messageSendPreview2.editText.getPaddingTop());
                                messageSendPreview2.editText.draw(canvas3);
                                canvas3.restore();
                                return Boolean.TRUE;
                            }
                        });
                    }
                    messageSendPreview.editText.setAlpha(f4);
                    canvas2.restore();
                } else {
                    canvas2 = canvas;
                }
                messageSendPreview.mainMessageCell.getTransitionParams().ignoreAlpha = true;
                ChatMessageCell chatMessageCell2 = messageSendPreview.destCell;
                if (chatMessageCell2 == null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                    canvas2.translate(f2, f6);
                    canvas2.translate(-imageX, -imageY);
                    float fLerp7 = AndroidUtilities.lerp(1.0f, anonymousClass4.getScaleX(), messageSendPreview.openProgress);
                    canvas2.scale(fLerp7, fLerp7, (-messageSendPreview.mainMessageCell.getX()) + anonymousClass4.getWidth(), (-messageSendPreview.mainMessageCell.getY()) + anonymousClass4.getHeight());
                    float f9 = f8 / textSize;
                    canvas2.scale(f9, f9, imageX, imageY);
                    if (messageSendPreview.mainMessageCell.drawBackgroundInParent()) {
                        canvas2.save();
                        canvas2.translate(0.0f, messageSendPreview.mainMessageCell.getPaddingTop());
                        messageSendPreview.mainMessageCell.drawBackgroundInternal(canvas2, true, false);
                        canvas2.restore();
                    }
                    messageSendPreview.mainMessageCell.draw(canvas2);
                    canvas2.restore();
                } else {
                    int[] iArr2 = this.pos2;
                    chatMessageCell2.getLocationInWindow(iArr2);
                    int translationY = messageSendPreview.destCell.getParent() instanceof View ? (int) ((View) messageSendPreview.destCell.getParent()).getTranslationY() : 0;
                    int i2 = this.chatListViewTy;
                    int[] iArr3 = this.destCellPos;
                    if (i2 > translationY) {
                        c2 = 0;
                        if (iArr3[1] - iArr2[1] <= i2) {
                        }
                        this.chatListViewTy = translationY;
                        float fLerp8 = AndroidUtilities.lerp(messageSendPreview.mainMessageCell.getX() + anonymousClass4.getX(), iArr3[c2], 1.0f - messageSendPreview.openProgress);
                        float fLerp9 = AndroidUtilities.lerp(messageSendPreview.mainMessageCell.getY() + anonymousClass4.getY(), iArr3[1], 1.0f - messageSendPreview.openProgress);
                        canvas2.save();
                        canvas2.translate(fLerp8, fLerp9);
                        float fLerp10 = AndroidUtilities.lerp(1.0f, anonymousClass4.getScaleX(), messageSendPreview.openProgress);
                        canvas2.scale(fLerp10, fLerp10, (-messageSendPreview.mainMessageCell.getX()) + anonymousClass4.getWidth(), (-messageSendPreview.mainMessageCell.getY()) + anonymousClass4.getHeight());
                        messageSendPreview.mainMessageCell.getTransitionParams().animateChangeProgress = 1.0f - messageSendPreview.openProgress;
                        ChatMessageCell.TransitionParams transitionParams = messageSendPreview.mainMessageCell.getTransitionParams();
                        Rect rect = messageSendPreview.cellDelta;
                        transitionParams.deltaLeft = rect.left * messageSendPreview.openProgress;
                        messageSendPreview.mainMessageCell.getTransitionParams().deltaTop = rect.top * messageSendPreview.openProgress;
                        messageSendPreview.mainMessageCell.getTransitionParams().deltaRight = rect.right * messageSendPreview.openProgress;
                        ChatMessageCell.TransitionParams transitionParams2 = messageSendPreview.mainMessageCell.getTransitionParams();
                        float f10 = rect.bottom;
                        float f11 = messageSendPreview.openProgress;
                        transitionParams2.deltaBottom = f10 * f11;
                        messageSendPreview.mainMessageCell.setTimeAlpha(1.0f - f11);
                        if (messageSendPreview.mainMessageCell.drawBackgroundInParent()) {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, messageSendPreview.destCell.getWidth(), messageSendPreview.destCell.getHeight(), (int) (messageSendPreview.openProgress * 255.0f), 31);
                            canvas2.translate(0.0f, messageSendPreview.mainMessageCell.getPaddingTop());
                            messageSendPreview.mainMessageCell.drawBackgroundInternal(canvas2, true, false);
                            canvas2.restore();
                            canvas2.saveLayerAlpha(0.0f, 0.0f, messageSendPreview.destCell.getWidth(), messageSendPreview.destCell.getHeight(), (int) ((1.0f - messageSendPreview.openProgress) * 255.0f), 31);
                            canvas2.translate(0.0f, messageSendPreview.destCell.getPaddingTop());
                            messageSendPreview.destCell.drawBackgroundInternal(canvas2, true, false);
                            canvas2.restore();
                        }
                        messageSendPreview.mainMessageCell.draw(canvas2);
                        if (messageSendPreview.mainMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                            messageSendPreview.mainMessageCell.drawNamesLayout(canvas2, 1.0f);
                            messageSendPreview.mainMessageCell.drawTime(1.0f - messageSendPreview.openProgress, canvas2, true);
                        }
                        canvas2.restore();
                    } else {
                        c2 = 0;
                    }
                    iArr3[c2] = iArr2[c2];
                    iArr3[1] = iArr2[1];
                    this.chatListViewTy = translationY;
                    float fLerp11 = AndroidUtilities.lerp(messageSendPreview.mainMessageCell.getX() + anonymousClass4.getX(), iArr3[c2], 1.0f - messageSendPreview.openProgress);
                    float fLerp12 = AndroidUtilities.lerp(messageSendPreview.mainMessageCell.getY() + anonymousClass4.getY(), iArr3[1], 1.0f - messageSendPreview.openProgress);
                    canvas2.save();
                    canvas2.translate(fLerp11, fLerp12);
                    float fLerp13 = AndroidUtilities.lerp(1.0f, anonymousClass4.getScaleX(), messageSendPreview.openProgress);
                    canvas2.scale(fLerp13, fLerp13, (-messageSendPreview.mainMessageCell.getX()) + anonymousClass4.getWidth(), (-messageSendPreview.mainMessageCell.getY()) + anonymousClass4.getHeight());
                    messageSendPreview.mainMessageCell.getTransitionParams().animateChangeProgress = 1.0f - messageSendPreview.openProgress;
                    ChatMessageCell.TransitionParams transitionParams3 = messageSendPreview.mainMessageCell.getTransitionParams();
                    Rect rect2 = messageSendPreview.cellDelta;
                    transitionParams3.deltaLeft = rect2.left * messageSendPreview.openProgress;
                    messageSendPreview.mainMessageCell.getTransitionParams().deltaTop = rect2.top * messageSendPreview.openProgress;
                    messageSendPreview.mainMessageCell.getTransitionParams().deltaRight = rect2.right * messageSendPreview.openProgress;
                    ChatMessageCell.TransitionParams transitionParams4 = messageSendPreview.mainMessageCell.getTransitionParams();
                    float f12 = rect2.bottom;
                    float f13 = messageSendPreview.openProgress;
                    transitionParams4.deltaBottom = f12 * f13;
                    messageSendPreview.mainMessageCell.setTimeAlpha(1.0f - f13);
                    if (messageSendPreview.mainMessageCell.drawBackgroundInParent()) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, messageSendPreview.destCell.getWidth(), messageSendPreview.destCell.getHeight(), (int) (messageSendPreview.openProgress * 255.0f), 31);
                        canvas2.translate(0.0f, messageSendPreview.mainMessageCell.getPaddingTop());
                        messageSendPreview.mainMessageCell.drawBackgroundInternal(canvas2, true, false);
                        canvas2.restore();
                        canvas2.saveLayerAlpha(0.0f, 0.0f, messageSendPreview.destCell.getWidth(), messageSendPreview.destCell.getHeight(), (int) ((1.0f - messageSendPreview.openProgress) * 255.0f), 31);
                        canvas2.translate(0.0f, messageSendPreview.destCell.getPaddingTop());
                        messageSendPreview.destCell.drawBackgroundInternal(canvas2, true, false);
                        canvas2.restore();
                    }
                    messageSendPreview.mainMessageCell.draw(canvas2);
                    if (messageSendPreview.mainMessageCell.getTransitionParams().animateBackgroundBoundsInner) {
                        messageSendPreview.mainMessageCell.drawNamesLayout(canvas2, 1.0f);
                        messageSendPreview.mainMessageCell.drawTime(1.0f - messageSendPreview.openProgress, canvas2, true);
                    }
                    canvas2.restore();
                }
                canvas2.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, fLerp3, getWidth(), AndroidUtilities.dp(14.0f) + fLerp3);
                GradientClip gradientClip = this.clip;
                gradientClip.draw(canvas2, rectF, 1, fLerp4);
                rectF.set(0.0f, fLerp5 - AndroidUtilities.dp(14.0f), getWidth(), fLerp5);
                gradientClip.draw(canvas2, rectF, 3, fLerp6);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (messageSendPreview.openInProgress) {
                if (messageSendPreview.firstOpenFrame2) {
                    ChatActivityEnterView.SendButton sendButton = messageSendPreview.anchorSendButton;
                    if (sendButton != null) {
                        sendButton.setAlpha(0.0f);
                    }
                    c = 0;
                    messageSendPreview.firstOpenFrame2 = false;
                } else {
                    c = 0;
                }
                canvas2.save();
                int[] iArr4 = messageSendPreview.sendButtonInitialPosition;
                int i3 = iArr4[c];
                int width = messageSendPreview.sendButton.getWidth();
                AnonymousClass13 anonymousClass13 = messageSendPreview.sendButton;
                anonymousClass13.getHeight();
                canvas2.translate(AndroidUtilities.lerp(AndroidUtilities.dp(6.0f) + (i3 - (width - anonymousClass13.width$1())), messageSendPreview.sendButton.getX(), messageSendPreview.openProgress), AndroidUtilities.lerp(iArr4[1], messageSendPreview.sendButton.getY(), messageSendPreview.openProgress));
                if (messageSendPreview.closing && messageSendPreview.sent) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, messageSendPreview.sendButton.getWidth(), messageSendPreview.sendButton.getHeight(), (int) (messageSendPreview.openProgress * 255.0f), 31);
                }
                messageSendPreview.sendButton.draw(canvas2);
                if (messageSendPreview.closing && messageSendPreview.sent) {
                    canvas2.restore();
                }
                canvas2.restore();
            }
            super.dispatchDraw(canvas);
            if (messageSendPreview.cameraRect != null) {
                if (messageSendPreview.effectDrawable == null) {
                    messageSendPreview.effectDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(24.0f), 23);
                }
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set((int) ((messageSendPreview.cameraRect.right - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) ((messageSendPreview.cameraRect.bottom - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(24.0f)), (int) (messageSendPreview.cameraRect.right - AndroidUtilities.dp(12.0f)), (int) (messageSendPreview.cameraRect.bottom - AndroidUtilities.dp(12.0f)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rect3);
                rectF2.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(6.0f));
                float fHeight = rectF2.height() / 2.0f;
                Paint paint2 = this.backgroundPaint;
                paint2.setColor(503316480);
                paint2.setAlpha((int) (messageSendPreview.effectDrawable.isNotEmpty() * 30.0f * messageSendPreview.openProgress));
                canvas2.drawRoundRect(rectF2, fHeight, fHeight, paint2);
                messageSendPreview.effectDrawable.setBounds(rect3);
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = messageSendPreview.effectDrawable;
                swapAnimatedEmojiDrawable.alpha = (int) (messageSendPreview.openProgress * 255.0f);
                swapAnimatedEmojiDrawable.draw(canvas2);
            }
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            MessageSendPreview messageSendPreview = MessageSendPreview.this;
            if (messageSendPreview.openInProgress) {
                if (view == messageSendPreview.sendButton) {
                    return false;
                }
                ChatMessageCell chatMessageCell = messageSendPreview.mainMessageCell;
                if (view == chatMessageCell && chatMessageCell != null && chatMessageCell.getCurrentPosition() == null) {
                    return false;
                }
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public final class AnonymousClass6 extends ChatListItemAnimator {
        public Runnable finishRunnable;

        @Override
        public final void checkIsRunning() {
        }

        @Override
        public final void endAnimations() {
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
        public final void onAllAnimationsDone() {
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
        public final void onAnimationStart() {
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

    public final class AnonymousClass9 extends RecyclerView.ItemDecoration {
        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
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
            int i = 0;
            while (true) {
                float[] fArr = currentPosition.siblingHeights;
                if (i >= fArr.length) {
                    break;
                }
                extraInsetHeight += (int) Math.ceil(fArr[i] * fMax);
                i++;
            }
            int iRound = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
            int size = currentMessagesGroup.posArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i2);
                byte b = groupedMessagePosition.minY;
                byte b2 = currentPosition.minY;
                if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                    iRound = RichMessageLayout$$ExternalSyntheticOutline1.m((int) Math.ceil(fMax * groupedMessagePosition.ph), 4.0f, iRound);
                    break;
                }
            }
            rect.bottom = -iRound;
        }
    }

    public final class MessageCell extends ChatMessageCell {
        public int bottom;
        public int pastId;
        public int top;

        public MessageCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, true, null, resourcesProvider);
            this.top = Integer.MAX_VALUE;
            this.bottom = Integer.MAX_VALUE;
            this.pastId = -1;
        }

        @Override
        public final boolean isPressed() {
            return false;
        }

        @Override
        public final SpoilerEffect2 makeSpoilerEffect() {
            return SpoilerEffect2.getInstance(1, this, MessageSendPreview.this.windowView);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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

    public MessageSendPreview(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.insets = Insets.NONE;
        this.messageObjects = new ArrayList();
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
        ?? r4 = new FrameLayout(this, context) {
            public final MessageSendPreview this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float fFloatValue;
                switch (i3) {
                    case 0:
                        MessageSendPreview messageSendPreview = this.this$0;
                        LaunchActivity.ActivityVisibilityController activityVisibilityController = messageSendPreview.activityVisibilityController;
                        if (activityVisibilityController != null) {
                            activityVisibilityController.setHidden(messageSendPreview.openProgress == 1.0f && messageSendPreview.blurBitmapPaint != null);
                        }
                        if (messageSendPreview.openProgress <= 0.0f || messageSendPreview.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            messageSendPreview.blurMatrix.reset();
                            float width = getWidth() / messageSendPreview.blurBitmap.getWidth();
                            messageSendPreview.blurMatrix.postScale(width, width);
                            messageSendPreview.blurBitmapShader.setLocalMatrix(messageSendPreview.blurMatrix);
                            messageSendPreview.blurBitmapPaint.setAlpha((int) (messageSendPreview.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), messageSendPreview.blurBitmapPaint);
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        MessageSendPreview messageSendPreview2 = this.this$0;
                        messageSendPreview2.effectOverlay.draw(canvas);
                        AnonymousClass12 anonymousClass12 = messageSendPreview2.effectOverlay;
                        if (anonymousClass12.drawingObjects.isEmpty()) {
                            fFloatValue = -1.0f;
                        } else {
                            EmojiAnimationsOverlay.DrawingObject drawingObject = (EmojiAnimationsOverlay.DrawingObject) zziq.m(1, anonymousClass12.drawingObjects);
                            ImageLocation mediaLocation = drawingObject.imageReceiver.getMediaLocation();
                            ImageReceiver imageReceiver = drawingObject.imageReceiver;
                            if (mediaLocation == null) {
                                mediaLocation = imageReceiver.getImageLocation();
                            }
                            if (mediaLocation == null) {
                                mediaLocation = imageReceiver.getThumbLocation();
                            }
                            if (mediaLocation != null) {
                                if (drawingObject.fileName == null) {
                                    TLRPC.Document document = mediaLocation.document;
                                    if (document != null) {
                                        drawingObject.fileName = FileLoader.getAttachFileName(document, "tgs");
                                    } else {
                                        drawingObject.fileName = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                                    }
                                }
                                if (drawingObject.fileName == null) {
                                    fFloatValue = -1.0f;
                                } else {
                                    Float fileProgress = ImageLoader.getInstance().getFileProgress(drawingObject.fileName);
                                    if (fileProgress == null) {
                                        fileProgress = Float.valueOf(1.0f);
                                    }
                                    fFloatValue = (fileProgress.floatValue() * 0.3f) + (fileProgress.floatValue() * 0.55f) + 0.15f;
                                }
                            } else {
                                fFloatValue = -1.0f;
                            }
                        }
                        if (fFloatValue != -2.0f) {
                            messageSendPreview2.sendButton.setLoading(fFloatValue >= 0.0f && fFloatValue < 1.0f);
                        }
                        if (!messageSendPreview2.effectOverlay.drawingObjects.isEmpty()) {
                            invalidate();
                        }
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i3) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.onBackPressed();
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onLayout(z, i4, i5, i6, i7);
                        MessageSendPreview messageSendPreview = this.this$0;
                        if (!messageSendPreview.layoutDone || messageSendPreview.allowRelayout) {
                            if (messageSendPreview.windowView.getWidth() > 0) {
                                int[] iArr = {zzlb.m(width - sendButton.width$1(), 6.0f, i), 0};
                                messageSendPreview.anchorSendButton.getLocationOnScreen(iArr);
                                int i8 = iArr[0];
                                int width = messageSendPreview.anchorSendButton.getWidth();
                                ChatActivityEnterView.SendButton sendButton = messageSendPreview.anchorSendButton;
                                sendButton.getMeasuredHeight();
                                messageSendPreview.sendButton.setScaleX(messageSendPreview.anchorSendButton.getScaleX());
                                messageSendPreview.sendButton.setScaleY(messageSendPreview.anchorSendButton.getScaleY());
                                int i9 = iArr[0];
                                int[] iArr2 = messageSendPreview.sendButtonInitialPosition;
                                iArr2[0] = i9;
                                iArr2[1] = iArr[1];
                                AnonymousClass4 anonymousClass4 = messageSendPreview.chatListView;
                                int measuredHeight = (anonymousClass4.getMeasuredHeight() - messageSendPreview.sendButton.getHeight()) + (messageSendPreview.effectSelector != null ? AndroidUtilities.dp(320.0f) : 0);
                                int iDp = AndroidUtilities.dp(8.0f) + messageSendPreview.insets.top;
                                ArrayList arrayList = messageSendPreview.messageObjects;
                                int iDp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                                ViewGroup viewGroup = messageSendPreview.optionsView;
                                int measuredHeight2 = iDp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                                int measuredHeight3 = (messageSendPreview.containerView.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - messageSendPreview.insets.bottom;
                                if (iArr[1] + measuredHeight2 > measuredHeight3) {
                                    iArr[1] = measuredHeight3 - measuredHeight2;
                                }
                                if (iArr[1] - measuredHeight < iDp) {
                                    iArr[1] = iDp + measuredHeight;
                                }
                                if (messageSendPreview.anchorSendButton.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                                    iArr[1] = (measuredHeight3 - measuredHeight2) - messageSendPreview.anchorSendButton.getHeight();
                                }
                                AnonymousClass13 anonymousClass13 = messageSendPreview.sendButton;
                                int i10 = iArr[0];
                                int width2 = anonymousClass13.getWidth();
                                AnonymousClass13 anonymousClass14 = messageSendPreview.sendButton;
                                anonymousClass14.getMeasuredHeight();
                                anonymousClass13.setX(AndroidUtilities.dp(6.0f) + (i10 - (width2 - anonymousClass14.width$1())));
                                messageSendPreview.sendButton.setY(iArr[1]);
                                if (messageSendPreview.customSendButtonWidth) {
                                    int i11 = iArr[0];
                                    int i12 = messageSendPreview.sendButtonWidth;
                                    ChatActivityEnterView.SendButton sendButton2 = messageSendPreview.anchorSendButton;
                                    sendButton2.getMeasuredHeight();
                                    iArr[0] = i11 - (i12 - sendButton2.width$1());
                                }
                                anonymousClass4.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - anonymousClass4.getMeasuredWidth());
                                if (messageSendPreview.layoutDone) {
                                    OKLCH.m(anonymousClass4.animate().translationY(((messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight()) - anonymousClass4.getTop()), ChatListItemAnimator.DEFAULT_INTERPOLATOR, 250L);
                                } else {
                                    anonymousClass4.setY((messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight());
                                }
                                ViewGroup viewGroup2 = messageSendPreview.optionsView;
                                if (viewGroup2 != null) {
                                    viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - messageSendPreview.optionsView.getMeasuredWidth());
                                    messageSendPreview.optionsView.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : messageSendPreview.sendButton.getHeight()));
                                }
                                FrameLayout frameLayout = messageSendPreview.effectSelectorContainer;
                                if (frameLayout != null) {
                                    int i13 = iArr[0];
                                    AnonymousClass13 anonymousClass15 = messageSendPreview.sendButton;
                                    anonymousClass15.getMeasuredHeight();
                                    frameLayout.setX(BotFullscreenButtons$$ExternalSyntheticOutline1.m((anonymousClass15.width$1() + i13) - messageSendPreview.effectSelectorContainer.getMeasuredWidth(), 6.0f, 0));
                                    RectF rectF = messageSendPreview.cameraRect;
                                    if (rectF != null) {
                                        FrameLayout frameLayout2 = messageSendPreview.effectSelectorContainer;
                                        float fMax = Math.max(messageSendPreview.insets.top, rectF.top - frameLayout2.getMeasuredWidth());
                                        messageSendPreview.effectSelectorContainerY = fMax;
                                        frameLayout2.setY(fMax);
                                        AnonymousClass14 anonymousClass16 = messageSendPreview.effectSelector;
                                        if (anonymousClass16 != null) {
                                            anonymousClass16.setY(Math.max(messageSendPreview.insets.top, (messageSendPreview.cameraRect.top - AndroidUtilities.dp(24.0f)) - messageSendPreview.effectSelector.getMeasuredHeight()));
                                        }
                                    } else {
                                        float height = (messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight();
                                        FrameLayout frameLayout3 = messageSendPreview.effectSelectorContainer;
                                        float fMax2 = Math.max(messageSendPreview.insets.top, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                        messageSendPreview.effectSelectorContainerY = fMax2;
                                        frameLayout3.setY(fMax2);
                                        AnonymousClass14 anonymousClass17 = messageSendPreview.effectSelector;
                                        if (anonymousClass17 != null) {
                                            anonymousClass17.setY(Math.max(0.0f, (height - anonymousClass17.getMeasuredHeight()) - messageSendPreview.effectSelectorContainerY));
                                        }
                                    }
                                }
                            }
                            messageSendPreview.layoutDone = true;
                        }
                        break;
                    default:
                        super.onLayout(z, i4, i5, i6, i7);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onSizeChanged(i4, i5, i6, i7);
                        MessageSendPreview messageSendPreview = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(messageSendPreview.iBlur3SourceBitmap, messageSendPreview.windowView);
                        ViewGroup viewGroup = messageSendPreview.optionsView;
                        if (viewGroup != null) {
                            viewGroup.invalidate();
                        }
                        break;
                    default:
                        super.onSizeChanged(i4, i5, i6, i7);
                        break;
                }
            }
        };
        this.windowView = r4;
        this.spoilerEffect2 = SpoilerEffect2.getInstance(1, r4, r4);
        r4.setOnClickListener(new View.OnClickListener(this) {
            public final MessageSendPreview f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.onBackPressed();
                        break;
                    default:
                        this.f$0.onBackPressed();
                        break;
                }
            }
        });
        r4.getViewTreeObserver().addOnGlobalFocusChangeListener(new RichEditor$$ExternalSyntheticLambda14(this, i2));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = new ViewPositionWatcher(r4);
        blurredBackgroundDrawableViewFactory.parent = r4;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, resourcesProvider);
        this.containerView = anonymousClass2;
        anonymousClass2.setClipToPadding(false);
        r4.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 119));
        PhotoViewer.AnonymousClass49 anonymousClass49 = new PhotoViewer.AnonymousClass49(this, 8);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r4, anonymousClass49);
        ?? r7 = new RecyclerListView(context, resourcesProvider) {
            public final AnimatedFloat bottom;
            public final GradientClip clip;
            public final ArrayList drawingGroups = new ArrayList(10);
            public final AnimatedFloat top;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.top = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.bottom = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.clip = new GradientClip();
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                ArrayList arrayList;
                MessageObject.GroupedMessages currentMessagesGroup;
                int i4;
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup2;
                ArrayList arrayList2;
                MessageObject.GroupedMessages currentMessagesGroup3;
                MessageObject.GroupedMessages currentMessagesGroup4;
                int i5;
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                int measuredHeight = messageSendPreview.containerView.getMeasuredHeight();
                AnonymousClass4 anonymousClass4 = messageSendPreview.chatListView;
                int childCount = anonymousClass4.getChildCount();
                boolean z = false;
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = anonymousClass4.getChildAt(i6);
                    if (childAt instanceof ChatMessageCell) {
                        RectF rectF = ViewPositionWatcher.tmpRectF2;
                        AnonymousClass2 anonymousClass3 = messageSendPreview.containerView;
                        ViewPositionWatcher.computeRectInParent(childAt, anonymousClass3, rectF);
                        float f = rectF.top;
                        int i7 = i6;
                        ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                        int i8 = (int) f;
                        childAt.getMeasuredHeight();
                        int i9 = i8 >= 0 ? 0 : -i8;
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        if (measuredHeight2 > measuredHeight) {
                            measuredHeight2 = i9 + measuredHeight;
                        }
                        i5 = i7;
                        chatMessageCell2.setVisiblePart(i9, measuredHeight2 - i9, measuredHeight, f, f, anonymousClass3.getMeasuredWidth(), anonymousClass3.getMeasuredHeight(), 0, 0, 0);
                    } else {
                        i5 = i6;
                    }
                    i6 = i5 + 1;
                }
                boolean z2 = true;
                canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
                Canvas canvas2 = canvas;
                canvas2.save();
                int childCount2 = getChildCount();
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i10 = 0; i10 < childCount2; i10++) {
                    View childAt2 = getChildAt(i10);
                    if ((childAt2 instanceof ChatMessageCell) && ((currentMessagesGroup4 = ((ChatMessageCell) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                        groupedMessages = currentMessagesGroup4;
                    }
                }
                int i11 = 0;
                while (true) {
                    arrayList = this.drawingGroups;
                    float f2 = 0.0f;
                    int i12 = 2;
                    if (i11 >= 3) {
                        break;
                    }
                    arrayList.clear();
                    if (i11 != 2 || anonymousClass4.fastScrollAnimationRunning) {
                        int i13 = 0;
                        ?? r15 = z;
                        while (i13 < childCount2) {
                            View childAt3 = anonymousClass4.getChildAt(i13);
                            if (childAt3 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt3;
                                if (childAt3.getY() <= anonymousClass4.getHeight() && childAt3.getY() + childAt3.getHeight() >= f2 && (currentMessagesGroup3 = chatMessageCell3.getCurrentMessagesGroup()) != null && ((i11 != 0 || currentMessagesGroup3.messages.size() != z2) && ((i11 != z2 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i11 != 0 || !chatMessageCell3.getMessageObject().deleted) && ((i11 != z2 || chatMessageCell3.getMessageObject().deleted) && ((i11 != i12 || chatMessageCell3.willRemoved) && (i11 == i12 || !chatMessageCell3.willRemoved))))))) {
                                    if (!arrayList.contains(currentMessagesGroup3)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                        transitionParams.left = r15;
                                        transitionParams.top = r15;
                                        transitionParams.right = r15;
                                        transitionParams.bottom = r15;
                                        transitionParams.pinnedBotton = r15;
                                        transitionParams.pinnedTop = r15;
                                        transitionParams.cell = chatMessageCell3;
                                        arrayList.add(currentMessagesGroup3);
                                    }
                                    currentMessagesGroup3.transitionParams.pinnedTop = chatMessageCell3.isPinnedTop();
                                    currentMessagesGroup3.transitionParams.pinnedBotton = chatMessageCell3.isPinnedBottom();
                                    int x = (int) (chatMessageCell3.getX() + chatMessageCell3.getBackgroundDrawableLeft());
                                    int x2 = (int) (chatMessageCell3.getX() + chatMessageCell3.getBackgroundDrawableRight());
                                    int y = (int) (chatMessageCell3.getY() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell3.getY() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableBottom());
                                    if ((chatMessageCell3.getCurrentPosition().flags & 4) == 0) {
                                        y -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell3.getCurrentPosition().flags & 8) == 0) {
                                        y2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell3.willRemoved) {
                                        currentMessagesGroup3.transitionParams.cell = chatMessageCell3;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                                    int i14 = transitionParams2.top;
                                    if (i14 == 0 || y < i14) {
                                        transitionParams2.top = y;
                                    }
                                    int i15 = transitionParams2.bottom;
                                    if (i15 == 0 || y2 > i15) {
                                        transitionParams2.bottom = y2;
                                    }
                                    int i16 = transitionParams2.left;
                                    if (i16 == 0 || x < i16) {
                                        transitionParams2.left = x;
                                    }
                                    int i17 = transitionParams2.right;
                                    if (i17 == 0 || x2 > i17) {
                                        transitionParams2.right = x2;
                                    }
                                }
                                i13++;
                                f2 = 0.0f;
                                i12 = 2;
                                r15 = 0;
                            }
                            i13++;
                            f2 = 0.0f;
                            i12 = 2;
                            r15 = 0;
                        }
                        int i18 = 0;
                        while (i18 < arrayList.size()) {
                            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i18);
                            if (groupedMessages2 == null) {
                                i11 = i11;
                                arrayList2 = arrayList;
                            } else {
                                float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(z2);
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                                float f3 = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                                float f4 = transitionParams3.top + transitionParams3.offsetTop;
                                float f5 = transitionParams3.offsetRight + transitionParams3.right + nonAnimationTranslationX;
                                float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                                if (f4 < (-AndroidUtilities.dp(20.0f))) {
                                    f4 = -AndroidUtilities.dp(20.0f);
                                }
                                float f6 = f4;
                                if (fDp > AndroidUtilities.dp(20.0f) + anonymousClass4.getMeasuredHeight()) {
                                    fDp = AndroidUtilities.dp(20.0f) + anonymousClass4.getMeasuredHeight();
                                }
                                float f7 = fDp;
                                boolean z3 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                                if (z3) {
                                    canvas2.save();
                                    canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), ImageReceiver$$ExternalSyntheticOutline0.m(f5, f3, 2.0f, f3), ImageReceiver$$ExternalSyntheticOutline0.m(f7, f6, 2.0f, f6));
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                                arrayList2 = arrayList;
                                transitionParams4.cell.drawBackground(canvas2, (int) f3, (int) f6, (int) f5, (int) f7, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                                transitionParams5.cell = null;
                                transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                                if (z3) {
                                    canvas.restore();
                                    for (int i19 = 0; i19 < childCount2; i19++) {
                                        View childAt4 = anonymousClass4.getChildAt(i19);
                                        if (childAt4 instanceof ChatMessageCell) {
                                            ChatMessageCell chatMessageCell4 = (ChatMessageCell) childAt4;
                                            if (chatMessageCell4.getCurrentMessagesGroup() == groupedMessages2) {
                                                int left = chatMessageCell4.getLeft();
                                                int top = chatMessageCell4.getTop();
                                                childAt4.setPivotX(((f5 - f3) / 2.0f) + (f3 - left));
                                                childAt4.setPivotY(((f7 - f6) / 2.0f) + (f6 - top));
                                            }
                                        }
                                    }
                                }
                            }
                            i18++;
                            canvas2 = canvas;
                            arrayList = arrayList2;
                            i11 = i11;
                            z2 = true;
                        }
                    }
                    i11++;
                    canvas2 = canvas;
                    z2 = true;
                    z = false;
                }
                super.dispatchDraw(canvas);
                int childCount3 = getChildCount();
                MessageObject.GroupedMessages groupedMessages3 = null;
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt5 = getChildAt(i20);
                    if ((childAt5 instanceof ChatMessageCell) && ((currentMessagesGroup2 = (chatMessageCell = (ChatMessageCell) childAt5).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages3)) {
                        if (currentMessagesGroup2 == null) {
                            MessageSendPreview.this.drawStarsPrice(canvas, chatMessageCell.getBoundsLeft(), chatMessageCell.getY(), chatMessageCell.getBoundsRight(), chatMessageCell.getY() + chatMessageCell.getHeight());
                        }
                        groupedMessages3 = currentMessagesGroup2;
                    }
                }
                for (int i21 = 0; i21 < 3; i21++) {
                    arrayList.clear();
                    if (i21 != 2 || anonymousClass4.fastScrollAnimationRunning) {
                        for (int i22 = 0; i22 < childCount3; i22++) {
                            View childAt6 = anonymousClass4.getChildAt(i22);
                            if (childAt6 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell5 = (ChatMessageCell) childAt6;
                                if (childAt6.getY() <= anonymousClass4.getHeight() && childAt6.getY() + childAt6.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell5.getCurrentMessagesGroup()) != null) {
                                    if (i21 == 0) {
                                        i4 = 1;
                                        if (currentMessagesGroup.messages.size() != 1) {
                                        }
                                    } else {
                                        i4 = 1;
                                    }
                                    if ((i21 != i4 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i21 != 0 || !chatMessageCell5.getMessageObject().deleted) && (i21 != 1 || chatMessageCell5.getMessageObject().deleted))) {
                                        if ((i21 != 2 || chatMessageCell5.willRemoved) && (i21 == 2 || !chatMessageCell5.willRemoved)) {
                                            if (!arrayList.contains(currentMessagesGroup)) {
                                                MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                                transitionParams6.left = 0;
                                                transitionParams6.top = 0;
                                                transitionParams6.right = 0;
                                                transitionParams6.bottom = 0;
                                                transitionParams6.pinnedBotton = false;
                                                transitionParams6.pinnedTop = false;
                                                transitionParams6.cell = chatMessageCell5;
                                                arrayList.add(currentMessagesGroup);
                                            }
                                            currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell5.isPinnedTop();
                                            currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell5.isPinnedBottom();
                                            int x3 = (int) (chatMessageCell5.getX() + chatMessageCell5.getBackgroundDrawableLeft());
                                            int x4 = (int) (chatMessageCell5.getX() + chatMessageCell5.getBackgroundDrawableRight());
                                            int y3 = (int) (chatMessageCell5.getY() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getBackgroundDrawableTop());
                                            int y4 = (int) (chatMessageCell5.getY() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getBackgroundDrawableBottom());
                                            if ((chatMessageCell5.getCurrentPosition().flags & 4) == 0) {
                                                y3 -= AndroidUtilities.dp(10.0f);
                                            }
                                            if ((chatMessageCell5.getCurrentPosition().flags & 8) == 0) {
                                                y4 += AndroidUtilities.dp(10.0f);
                                            }
                                            if (chatMessageCell5.willRemoved) {
                                                currentMessagesGroup.transitionParams.cell = chatMessageCell5;
                                            }
                                            MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                            int i23 = transitionParams7.top;
                                            if (i23 == 0 || y3 < i23) {
                                                transitionParams7.top = y3;
                                            }
                                            int i24 = transitionParams7.bottom;
                                            if (i24 == 0 || y4 > i24) {
                                                transitionParams7.bottom = y4;
                                            }
                                            int i25 = transitionParams7.left;
                                            if (i25 == 0 || x3 < i25) {
                                                transitionParams7.left = x3;
                                            }
                                            int i26 = transitionParams7.right;
                                            if (i26 == 0 || x4 > i26) {
                                                transitionParams7.right = x4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int i27 = 0; i27 < arrayList.size(); i27++) {
                            MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList.get(i27);
                            float nonAnimationTranslationX2 = groupedMessages4.transitionParams.cell.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                            float f8 = transitionParams8.left + nonAnimationTranslationX2 + transitionParams8.offsetLeft;
                            float f9 = transitionParams8.top + transitionParams8.offsetTop;
                            float f10 = transitionParams8.right + nonAnimationTranslationX2 + transitionParams8.offsetRight;
                            float fDp2 = transitionParams8.bottom + transitionParams8.offsetBottom;
                            if (f9 < (-AndroidUtilities.dp(20.0f))) {
                                f9 = -AndroidUtilities.dp(20.0f);
                            }
                            if (fDp2 > AndroidUtilities.dp(20.0f) + anonymousClass4.getMeasuredHeight()) {
                                fDp2 = AndroidUtilities.dp(20.0f) + anonymousClass4.getMeasuredHeight();
                            }
                            MessageSendPreview.this.drawStarsPrice(canvas, f8, f9, f10, fDp2);
                            groupedMessages4.transitionParams.cell = null;
                        }
                    }
                }
                canvas.save();
                float f11 = this.top.set(canScrollVertically(-1));
                float f12 = this.bottom.set(canScrollVertically(1));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
                GradientClip gradientClip = this.clip;
                gradientClip.draw(canvas, rectF2, 1, f11);
                rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
                gradientClip.draw(canvas, rectF2, 3, f12);
                canvas.restore();
                canvas.restore();
                canvas.restore();
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                ChatMessageCell chatMessageCell;
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                if (messageSendPreview.openInProgress && ((view == (chatMessageCell = messageSendPreview.mainMessageCell) && chatMessageCell != null && chatMessageCell.getCurrentPosition() == null) || view == messageSendPreview.sendButton)) {
                    return false;
                }
                if (!(view instanceof ChatMessageCell)) {
                    return true;
                }
                ChatMessageCell chatMessageCell2 = (ChatMessageCell) view;
                chatMessageCell2.setInvalidatesParent(true);
                chatMessageCell2.drawCheckBox(canvas);
                canvas.save();
                canvas.translate(chatMessageCell2.getX(), chatMessageCell2.getY());
                canvas.scale(chatMessageCell2.getScaleX(), chatMessageCell2.getScaleY(), chatMessageCell2.getPivotX(), chatMessageCell2.getPivotY());
                if (chatMessageCell2.drawBackgroundInParent() && chatMessageCell2.getCurrentPosition() == null) {
                    canvas.save();
                    canvas.translate(0.0f, chatMessageCell2.getPaddingTop());
                    chatMessageCell2.drawBackgroundInternal(canvas, true, false);
                    canvas.restore();
                }
                canvas.restore();
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.save();
                canvas.translate(chatMessageCell2.getX(), chatMessageCell2.getY() + chatMessageCell2.getPaddingTop());
                canvas.scale(chatMessageCell2.getScaleX(), chatMessageCell2.getScaleY(), chatMessageCell2.getPivotX(), chatMessageCell2.getPivotY());
                if (chatMessageCell2.getCurrentPosition() != null && (((chatMessageCell2.getCurrentPosition().flags & chatMessageCell2.captionFlag()) != 0 && (chatMessageCell2.getCurrentPosition().flags & 1) != 0) || (chatMessageCell2.getCurrentMessagesGroup() != null && chatMessageCell2.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell2.drawCaptionLayout(chatMessageCell2.getAlpha(), canvas, false);
                }
                if (chatMessageCell2.getCurrentPosition() != null && (((chatMessageCell2.getCurrentPosition().flags & 8) != 0 && (chatMessageCell2.getCurrentPosition().flags & 1) != 0) || (chatMessageCell2.getCurrentMessagesGroup() != null && chatMessageCell2.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell2.drawReactionsLayout(canvas, chatMessageCell2.getAlpha(), null);
                    chatMessageCell2.drawCommentLayout(canvas, chatMessageCell2.getAlpha());
                }
                if (chatMessageCell2.getCurrentPosition() != null) {
                    chatMessageCell2.drawNamesLayout(canvas, chatMessageCell2.getAlpha());
                }
                if (chatMessageCell2.getCurrentPosition() == null || chatMessageCell2.getCurrentPosition().last) {
                    chatMessageCell2.drawTime(chatMessageCell2.getAlpha(), canvas, true);
                }
                chatMessageCell2.drawOutboundsContent(canvas);
                chatMessageCell2.getTransitionParams().recordDrawingStatePreview();
                canvas.restore();
                chatMessageCell2.setInvalidatesParent(false);
                return zDrawChild;
            }

            @Override
            public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
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
            public final void onMeasure(int i4, int i5) {
                int iWidth$1;
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                int iDp = AndroidUtilities.dp(messageSendPreview.messageObjects.isEmpty() ? -6.0f : 48.0f);
                ViewGroup viewGroup = messageSendPreview.optionsView;
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (iDp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - messageSendPreview.insets.top), Integer.MIN_VALUE));
                if (messageSendPreview.customSendButtonWidth) {
                    iWidth$1 = messageSendPreview.sendButtonWidth;
                } else {
                    ChatActivityEnterView.SendButton sendButton = messageSendPreview.anchorSendButton;
                    sendButton.getMeasuredHeight();
                    iWidth$1 = sendButton.width$1();
                }
                int iMax = Math.max(AndroidUtilities.dp(12.0f) + iWidth$1, -((AndroidUtilities.dp(7.0f) + messageSendPreview.sendButtonInitialPosition[0]) - getMeasuredWidth()));
                float fMax = Math.max(1, getMeasuredWidth() - iMax) / Math.max(1, ((getMeasuredWidth() - iMax) - AndroidUtilities.dp(8.0f)) + Math.max(0, messageSendPreview.messageObjectsWidth - ((getMeasuredWidth() - iMax) - AndroidUtilities.dp((messageSendPreview.groupedMessagesMap.isEmpty() ? 0 : 40) + 8))));
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
                setScaleX(fMax);
                setScaleY(fMax);
            }
        };
        this.chatListView = r7;
        r7.setOnClickListener(new View.OnClickListener(this) {
            public final MessageSendPreview f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.onBackPressed();
                        break;
                    default:
                        this.f$0.onBackPressed();
                        break;
                }
            }
        });
        r7.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 20));
        r7.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 27));
        r7.setItemAnimator(new AnonymousClass6(null, r7, resourcesProvider));
        ?? r8 = new GridLayoutManagerFixed() {
            @Override
            public final int computeVerticalScrollExtent(RecyclerView.State state) {
                return computeScrollExtent(state);
            }

            @Override
            public final int computeVerticalScrollOffset(RecyclerView.State state) {
                return computeScrollOffset(state);
            }

            @Override
            public final int computeVerticalScrollRange(RecyclerView.State state) {
                return computeScrollRange(state);
            }

            @Override
            public final boolean hasSiblingChild(int i4) {
                byte b;
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageObject messageObject = (MessageObject) messageSendPreview.messageObjects.get((getItemCount() - 1) - i4);
                MessageObject.GroupedMessages validGroupedMessage$1 = messageSendPreview.getValidGroupedMessage$1(messageObject);
                if (validGroupedMessage$1 != null) {
                    MessageObject.GroupedMessagePosition position = validGroupedMessage$1.getPosition(messageObject);
                    if (position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size = validGroupedMessage$1.posArray.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = validGroupedMessage$1.posArray.get(i5);
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
            public final boolean shouldLayoutChildFromOpositeSide(View view) {
                if (view instanceof ChatMessageCell) {
                    return !((ChatMessageCell) view).getMessageObject().isOutOwner();
                }
                return false;
            }

            @Override
            public final boolean supportsPredictiveItemAnimations() {
                return true;
            }
        };
        this.chatLayoutManager = r8;
        r8.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i4) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                ArrayList arrayList = messageSendPreview.messageObjects;
                MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i4);
                MessageObject.GroupedMessages validGroupedMessage$1 = messageSendPreview.getValidGroupedMessage$1(messageObject);
                if (validGroupedMessage$1 != null) {
                    return validGroupedMessage$1.getPosition(messageObject).spanSize;
                }
                return 1000;
            }
        };
        r7.setLayoutManager(r8);
        r7.addItemDecoration(new AnonymousClass9());
        ?? r9 = new RecyclerView.Adapter() {
            @Override
            public final int getItemCount() {
                return MessageSendPreview.this.messageObjects.size();
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageObject messageObject = (MessageObject) messageSendPreview.messageObjects.get((getItemCount() - 1) - i4);
                ChatMessageCell chatMessageCell = (ChatMessageCell) viewHolder.itemView;
                MessageObject.GroupedMessages validGroupedMessage$1 = messageSendPreview.getValidGroupedMessage$1(messageObject);
                int size = 0;
                chatMessageCell.setInvalidatesParent(validGroupedMessage$1 != null);
                chatMessageCell.setMessageObject(messageObject, validGroupedMessage$1, false, false, false, false);
                if (!messageSendPreview.groupedMessagesMap.isEmpty()) {
                    ArrayList arrayList = messageSendPreview.messageObjects;
                    if (arrayList.size() >= 10) {
                        size = arrayList.size() % 10;
                    }
                }
                if (i4 != size || messageObject.needDrawForwarded()) {
                    return;
                }
                messageSendPreview.mainMessageCell = chatMessageCell;
                Point point = AndroidUtilities.displaySize;
                chatMessageCell.setParentViewSize(point.x, point.y);
                messageSendPreview.mainMessageCellId = messageObject.getId();
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageCell messageCell = messageSendPreview.new MessageCell(context, messageSendPreview.currentAccount, resourcesProvider);
                messageCell.setDelegate(new ChatActivity.AnonymousClass40(25));
                return new RecyclerListView.Holder(messageCell);
            }
        };
        this.adapter = r9;
        r7.setAdapter(r9);
        r7.setVerticalScrollBarEnabled(false);
        r7.setOverScrollMode(2);
        anonymousClass2.addView((View) r7, LayoutHelper.createFrame(-2.0f, -1));
        ?? r12 = new FrameLayout(this, context) {
            public final MessageSendPreview this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float fFloatValue;
                switch (i2) {
                    case 0:
                        MessageSendPreview messageSendPreview = this.this$0;
                        LaunchActivity.ActivityVisibilityController activityVisibilityController = messageSendPreview.activityVisibilityController;
                        if (activityVisibilityController != null) {
                            activityVisibilityController.setHidden(messageSendPreview.openProgress == 1.0f && messageSendPreview.blurBitmapPaint != null);
                        }
                        if (messageSendPreview.openProgress <= 0.0f || messageSendPreview.blurBitmapPaint == null) {
                            canvas2 = canvas;
                        } else {
                            messageSendPreview.blurMatrix.reset();
                            float width = getWidth() / messageSendPreview.blurBitmap.getWidth();
                            messageSendPreview.blurMatrix.postScale(width, width);
                            messageSendPreview.blurBitmapShader.setLocalMatrix(messageSendPreview.blurMatrix);
                            messageSendPreview.blurBitmapPaint.setAlpha((int) (messageSendPreview.openProgress * 255.0f));
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), messageSendPreview.blurBitmapPaint);
                        }
                        super.dispatchDraw(canvas2);
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        MessageSendPreview messageSendPreview2 = this.this$0;
                        messageSendPreview2.effectOverlay.draw(canvas);
                        AnonymousClass12 anonymousClass12 = messageSendPreview2.effectOverlay;
                        if (anonymousClass12.drawingObjects.isEmpty()) {
                            fFloatValue = -1.0f;
                        } else {
                            EmojiAnimationsOverlay.DrawingObject drawingObject = (EmojiAnimationsOverlay.DrawingObject) zziq.m(1, anonymousClass12.drawingObjects);
                            ImageLocation mediaLocation = drawingObject.imageReceiver.getMediaLocation();
                            ImageReceiver imageReceiver = drawingObject.imageReceiver;
                            if (mediaLocation == null) {
                                mediaLocation = imageReceiver.getImageLocation();
                            }
                            if (mediaLocation == null) {
                                mediaLocation = imageReceiver.getThumbLocation();
                            }
                            if (mediaLocation != null) {
                                if (drawingObject.fileName == null) {
                                    TLRPC.Document document = mediaLocation.document;
                                    if (document != null) {
                                        drawingObject.fileName = FileLoader.getAttachFileName(document, "tgs");
                                    } else {
                                        drawingObject.fileName = FileLoader.getAttachFileName(mediaLocation.location, "tgs");
                                    }
                                }
                                if (drawingObject.fileName == null) {
                                    fFloatValue = -1.0f;
                                } else {
                                    Float fileProgress = ImageLoader.getInstance().getFileProgress(drawingObject.fileName);
                                    if (fileProgress == null) {
                                        fileProgress = Float.valueOf(1.0f);
                                    }
                                    fFloatValue = (fileProgress.floatValue() * 0.3f) + (fileProgress.floatValue() * 0.55f) + 0.15f;
                                }
                            } else {
                                fFloatValue = -1.0f;
                            }
                        }
                        if (fFloatValue != -2.0f) {
                            messageSendPreview2.sendButton.setLoading(fFloatValue >= 0.0f && fFloatValue < 1.0f);
                        }
                        if (!messageSendPreview2.effectOverlay.drawingObjects.isEmpty()) {
                            invalidate();
                        }
                        break;
                }
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                            return super.dispatchKeyEventPreIme(keyEvent);
                        }
                        this.this$0.onBackPressed();
                        return true;
                    default:
                        return super.dispatchKeyEventPreIme(keyEvent);
                }
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                switch (i2) {
                    case 0:
                        super.onLayout(z, i4, i5, i6, i7);
                        MessageSendPreview messageSendPreview = this.this$0;
                        if (!messageSendPreview.layoutDone || messageSendPreview.allowRelayout) {
                            if (messageSendPreview.windowView.getWidth() > 0) {
                                int[] iArr = {zzlb.m(width - sendButton.width$1(), 6.0f, i8), 0};
                                messageSendPreview.anchorSendButton.getLocationOnScreen(iArr);
                                int i8 = iArr[0];
                                int width = messageSendPreview.anchorSendButton.getWidth();
                                ChatActivityEnterView.SendButton sendButton = messageSendPreview.anchorSendButton;
                                sendButton.getMeasuredHeight();
                                messageSendPreview.sendButton.setScaleX(messageSendPreview.anchorSendButton.getScaleX());
                                messageSendPreview.sendButton.setScaleY(messageSendPreview.anchorSendButton.getScaleY());
                                int i9 = iArr[0];
                                int[] iArr2 = messageSendPreview.sendButtonInitialPosition;
                                iArr2[0] = i9;
                                iArr2[1] = iArr[1];
                                AnonymousClass4 anonymousClass4 = messageSendPreview.chatListView;
                                int measuredHeight = (anonymousClass4.getMeasuredHeight() - messageSendPreview.sendButton.getHeight()) + (messageSendPreview.effectSelector != null ? AndroidUtilities.dp(320.0f) : 0);
                                int iDp = AndroidUtilities.dp(8.0f) + messageSendPreview.insets.top;
                                ArrayList arrayList = messageSendPreview.messageObjects;
                                int iDp2 = AndroidUtilities.dp(arrayList.isEmpty() ? -6.0f : 48.0f);
                                ViewGroup viewGroup = messageSendPreview.optionsView;
                                int measuredHeight2 = iDp2 + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight());
                                int measuredHeight3 = (messageSendPreview.containerView.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - messageSendPreview.insets.bottom;
                                if (iArr[1] + measuredHeight2 > measuredHeight3) {
                                    iArr[1] = measuredHeight3 - measuredHeight2;
                                }
                                if (iArr[1] - measuredHeight < iDp) {
                                    iArr[1] = iDp + measuredHeight;
                                }
                                if (messageSendPreview.anchorSendButton.getHeight() + iArr[1] + measuredHeight2 > measuredHeight3) {
                                    iArr[1] = (measuredHeight3 - measuredHeight2) - messageSendPreview.anchorSendButton.getHeight();
                                }
                                AnonymousClass13 anonymousClass13 = messageSendPreview.sendButton;
                                int i10 = iArr[0];
                                int width2 = anonymousClass13.getWidth();
                                AnonymousClass13 anonymousClass14 = messageSendPreview.sendButton;
                                anonymousClass14.getMeasuredHeight();
                                anonymousClass13.setX(AndroidUtilities.dp(6.0f) + (i10 - (width2 - anonymousClass14.width$1())));
                                messageSendPreview.sendButton.setY(iArr[1]);
                                if (messageSendPreview.customSendButtonWidth) {
                                    int i11 = iArr[0];
                                    int i12 = messageSendPreview.sendButtonWidth;
                                    ChatActivityEnterView.SendButton sendButton2 = messageSendPreview.anchorSendButton;
                                    sendButton2.getMeasuredHeight();
                                    iArr[0] = i11 - (i12 - sendButton2.width$1());
                                }
                                anonymousClass4.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - anonymousClass4.getMeasuredWidth());
                                if (messageSendPreview.layoutDone) {
                                    OKLCH.m(anonymousClass4.animate().translationY(((messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight()) - anonymousClass4.getTop()), ChatListItemAnimator.DEFAULT_INTERPOLATOR, 250L);
                                } else {
                                    anonymousClass4.setY((messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight());
                                }
                                ViewGroup viewGroup2 = messageSendPreview.optionsView;
                                if (viewGroup2 != null) {
                                    viewGroup2.setX((AndroidUtilities.dp(7.0f) + iArr[0]) - messageSendPreview.optionsView.getMeasuredWidth());
                                    messageSendPreview.optionsView.setY(iArr[1] + (arrayList.isEmpty() ? -AndroidUtilities.dp(6.0f) : messageSendPreview.sendButton.getHeight()));
                                }
                                FrameLayout frameLayout = messageSendPreview.effectSelectorContainer;
                                if (frameLayout != null) {
                                    int i13 = iArr[0];
                                    AnonymousClass13 anonymousClass15 = messageSendPreview.sendButton;
                                    anonymousClass15.getMeasuredHeight();
                                    frameLayout.setX(BotFullscreenButtons$$ExternalSyntheticOutline1.m((anonymousClass15.width$1() + i13) - messageSendPreview.effectSelectorContainer.getMeasuredWidth(), 6.0f, 0));
                                    RectF rectF = messageSendPreview.cameraRect;
                                    if (rectF != null) {
                                        FrameLayout frameLayout2 = messageSendPreview.effectSelectorContainer;
                                        float fMax = Math.max(messageSendPreview.insets.top, rectF.top - frameLayout2.getMeasuredWidth());
                                        messageSendPreview.effectSelectorContainerY = fMax;
                                        frameLayout2.setY(fMax);
                                        AnonymousClass14 anonymousClass16 = messageSendPreview.effectSelector;
                                        if (anonymousClass16 != null) {
                                            anonymousClass16.setY(Math.max(messageSendPreview.insets.top, (messageSendPreview.cameraRect.top - AndroidUtilities.dp(24.0f)) - messageSendPreview.effectSelector.getMeasuredHeight()));
                                        }
                                    } else {
                                        float height = (messageSendPreview.sendButton.getHeight() + iArr[1]) - anonymousClass4.getMeasuredHeight();
                                        FrameLayout frameLayout3 = messageSendPreview.effectSelectorContainer;
                                        float fMax2 = Math.max(messageSendPreview.insets.top, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
                                        messageSendPreview.effectSelectorContainerY = fMax2;
                                        frameLayout3.setY(fMax2);
                                        AnonymousClass14 anonymousClass17 = messageSendPreview.effectSelector;
                                        if (anonymousClass17 != null) {
                                            anonymousClass17.setY(Math.max(0.0f, (height - anonymousClass17.getMeasuredHeight()) - messageSendPreview.effectSelectorContainerY));
                                        }
                                    }
                                }
                            }
                            messageSendPreview.layoutDone = true;
                        }
                        break;
                    default:
                        super.onLayout(z, i4, i5, i6, i7);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i4, int i5, int i6, int i7) {
                switch (i2) {
                    case 0:
                        super.onSizeChanged(i4, i5, i6, i7);
                        MessageSendPreview messageSendPreview = this.this$0;
                        Blur3Utils.checkBitmapSourceMatrixScale(messageSendPreview.iBlur3SourceBitmap, messageSendPreview.windowView);
                        ViewGroup viewGroup = messageSendPreview.optionsView;
                        if (viewGroup != null) {
                            viewGroup.invalidate();
                        }
                        break;
                    default:
                        super.onSizeChanged(i4, i5, i6, i7);
                        break;
                }
            }
        };
        this.effectsView = r12;
        r4.addView(r12, LayoutHelper.createFrame(-1.0f, -1));
        this.effectOverlay = new EmojiAnimationsOverlay(r12, i) {
            public final int[] messagePos = new int[2];

            @Override
            public final void layoutObject(EmojiAnimationsOverlay.DrawingObject drawingObject) {
                if (drawingObject == null) {
                    return;
                }
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                if (messageSendPreview.cameraRect != null) {
                    drawingObject.viewFound = true;
                    float filterWidth = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                    float f = filterWidth / 3.0f;
                    drawingObject.lastW = f;
                    drawingObject.lastH = f;
                    drawingObject.lastX = Utilities.clamp(messageSendPreview.cameraRect.right - (0.75f * filterWidth), AndroidUtilities.displaySize.x - filterWidth, 0.0f);
                    drawingObject.lastY = messageSendPreview.cameraRect.bottom - (filterWidth / 2.0f);
                    return;
                }
                ChatMessageCell chatMessageCell = messageSendPreview.mainMessageCell;
                if (chatMessageCell == null || !chatMessageCell.isAttachedToWindow() || messageSendPreview.mainMessageCell.getMessageObject() == null || messageSendPreview.mainMessageCell.getMessageObject().getId() != messageSendPreview.mainMessageCellId) {
                    return;
                }
                ChatMessageCell chatMessageCell2 = messageSendPreview.mainMessageCell;
                int[] iArr = this.messagePos;
                chatMessageCell2.getLocationOnScreen(iArr);
                drawingObject.viewFound = true;
                float filterWidth2 = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                float f2 = filterWidth2 / 3.0f;
                drawingObject.lastW = f2;
                drawingObject.lastH = f2;
                float f3 = filterWidth2 / 2.0f;
                drawingObject.lastX = Utilities.clamp(((messageSendPreview.chatListView.getScaleX() * messageSendPreview.mainMessageCell.getTimeX()) + iArr[0]) - f3, AndroidUtilities.displaySize.x - filterWidth2, 0.0f);
                drawingObject.lastY = ((messageSendPreview.chatListView.getScaleY() * messageSendPreview.mainMessageCell.getTimeY()) + iArr[1]) - f3;
            }
        };
    }

    public final void allowEffectSelector(final BaseFragment baseFragment) {
        CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass2;
        if (this.effectSelector != null || baseFragment == null) {
            return;
        }
        int i = this.currentAccount;
        MessagesController.getInstance(i).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.effectSelectorContainer = frameLayout;
        frameLayout.setClipChildren(false);
        this.effectSelectorContainer.setClipToPadding(false);
        this.effectSelectorContainer.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(5, this.currentAccount, getContext(), null, this.resourcesProvider);
        this.effectSelector = anonymousClass14;
        anonymousClass14.setClipChildren(false);
        this.effectSelector.setClipToPadding(false);
        this.effectSelector.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.effectSelector.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
            @Override
            public final boolean allowLongPress() {
                return true;
            }

            @Override
            public final boolean drawBackground() {
                return false;
            }

            @Override
            public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i2, boolean z) {
            }

            @Override
            public final boolean needEnterText() {
                return false;
            }

            @Override
            public final void onEmojiWindowDismissed() {
            }

            @Override
            public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                boolean z3;
                BaseFragment baseFragment2;
                boolean z4;
                long j;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = visibleReaction;
                if (visibleReaction2 != null) {
                    MessageSendPreview messageSendPreview = MessageSendPreview.this;
                    if (messageSendPreview.effectSelector == null) {
                        return;
                    }
                    int i2 = messageSendPreview.currentAccount;
                    boolean z5 = !UserConfig.getInstance(i2).isPremium() && visibleReaction2.premium;
                    ChatMessageCell chatMessageCell = messageSendPreview.mainMessageCell;
                    AnonymousClass12 anonymousClass12 = messageSendPreview.effectOverlay;
                    if (chatMessageCell != null) {
                        MessageObject messageObject = chatMessageCell.getMessageObject();
                        if (messageObject == null) {
                            return;
                        }
                        TLRPC.Message message = messageObject.messageOwner;
                        long j2 = message.effect;
                        long j3 = visibleReaction2.effectId;
                        if (j3 == j2) {
                            message.flags2 &= -5;
                            message.effect = 0L;
                            z4 = true;
                        } else {
                            message.flags2 |= 4;
                            message.effect = j3;
                            z4 = false;
                        }
                        if (z5) {
                            j = j2;
                        } else {
                            j = j2;
                            messageSendPreview.mainMessageCell.setMessageObject(messageObject, messageSendPreview.getValidGroupedMessage$1(messageObject), messageSendPreview.messageObjects.size() > 1, false, false, false);
                            messageSendPreview.effectSelector.setSelectedReactionAnimated(z4 ? null : visibleReaction2);
                            if (messageSendPreview.effectSelector.getReactionsWindow() != null && messageSendPreview.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog != null) {
                                CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass3 = messageSendPreview.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog;
                                if (z4) {
                                    visibleReaction2 = null;
                                }
                                anonymousClass3.setSelectedReaction(visibleReaction2);
                                messageSendPreview.effectSelector.getReactionsWindow().containerView.invalidate();
                            }
                        }
                        anonymousClass12.clear$1();
                        if (!z4) {
                            anonymousClass12.showAnimationForCell(messageSendPreview.mainMessageCell, 0, false, false);
                        }
                        if (z5) {
                            TLRPC.Message message2 = messageObject.messageOwner;
                            message2.effect = j;
                            if (j == 0) {
                                message2.flags2 &= -5;
                            }
                        }
                        AnonymousClass13 anonymousClass13 = messageSendPreview.sendButton;
                        if (anonymousClass13 != null) {
                            anonymousClass13.setEffect(messageObject.messageOwner.effect);
                        }
                        messageSendPreview.onEffectChange(messageObject.messageOwner.effect);
                    } else if (messageSendPreview.cameraRect != null) {
                        long j4 = visibleReaction2.effectId;
                        if (j4 == messageSendPreview.effectId) {
                            messageSendPreview.effectId = 0L;
                            z3 = true;
                        } else {
                            messageSendPreview.effectId = j4;
                            z3 = false;
                        }
                        AnonymousClass13 anonymousClass15 = messageSendPreview.sendButton;
                        if (anonymousClass15 != null) {
                            anonymousClass15.setEffect(messageSendPreview.effectId);
                        }
                        messageSendPreview.onEffectChange(messageSendPreview.effectId);
                        if (!z5) {
                            TLRPC.TL_availableEffect effect = messageSendPreview.effectId == 0 ? null : MessagesController.getInstance(i2).getEffect(messageSendPreview.effectId);
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = messageSendPreview.effectDrawable;
                            if (swapAnimatedEmojiDrawable != null) {
                                if (messageSendPreview.effectId == 0 || effect == null) {
                                    swapAnimatedEmojiDrawable.set((Drawable) null, true);
                                } else {
                                    swapAnimatedEmojiDrawable.set((Drawable) Emoji.getEmojiDrawable(effect.emoticon), true);
                                }
                            }
                            messageSendPreview.effectSelector.setSelectedReactionAnimated(z3 ? null : visibleReaction2);
                            if (messageSendPreview.effectSelector.getReactionsWindow() != null && messageSendPreview.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog != null) {
                                CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass4 = messageSendPreview.effectSelector.getReactionsWindow().selectAnimatedEmojiDialog;
                                if (z3) {
                                    visibleReaction2 = null;
                                }
                                anonymousClass4.setSelectedReaction(visibleReaction2);
                                messageSendPreview.effectSelector.getReactionsWindow().containerView.invalidate();
                            }
                        }
                        anonymousClass12.clear$1();
                        if (!z3) {
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            long j5 = messageSendPreview.effectId;
                            tL_message.effect = j5;
                            if (j5 != 0) {
                                tL_message.flags2 |= 4;
                            }
                            messageSendPreview.effectOverlay.createDrawingObject(null, 0, null, new MessageObject(i2, tL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                        }
                    }
                    if (z5 && (baseFragment2 = baseFragment) != null) {
                        new BulletinFactory(messageSendPreview.containerView, messageSendPreview.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.AnimatedEffectPremium), new MessageSendPreview$15$$ExternalSyntheticLambda0(0, baseFragment2))).show();
                    }
                    messageSendPreview.effectsView.invalidate();
                }
            }
        });
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
        if (MessagesController.getInstance(i).hasAvailableEffects()) {
            showEffectSelector();
        } else {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        AnonymousClass14 anonymousClass15 = this.effectSelector;
        if (anonymousClass15 != null && !anonymousClass15.paused) {
            anonymousClass15.paused = true;
            anonymousClass15.pausedExceptSelected = true;
            CustomEmojiReactionsWindow customEmojiReactionsWindow = anonymousClass15.reactionsWindow;
            if (customEmojiReactionsWindow != null && (anonymousClass2 = customEmojiReactionsWindow.selectAnimatedEmojiDialog) != null && !anonymousClass2.paused) {
                anonymousClass2.paused = true;
                anonymousClass2.pausedExceptSelected = true;
                SelectAnimatedEmojiDialog.AnonymousClass7 anonymousClass7 = anonymousClass2.emojiGridView;
                if (anonymousClass7 != null) {
                    anonymousClass7.invalidate();
                }
                SelectAnimatedEmojiDialog.AnonymousClass13 anonymousClass13 = anonymousClass2.emojiSearchGridView;
                if (anonymousClass13 != null) {
                    anonymousClass13.invalidate();
                }
            }
        }
        new KeyboardNotifier(this.windowView, false, new PollItemMenu$$ExternalSyntheticLambda14(this, 19));
    }

    public final void animateOpenTo(Runnable runnable, boolean z) {
        AnonymousClass14 anonymousClass14;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z2 = z && (viewGroup = this.optionsView) != null && (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout);
        if (z2) {
            ActionBarPopupWindow.startAnimation((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.optionsView);
        }
        if (!z && (anonymousClass14 = this.effectSelector) != null && this.effectSelectorShown) {
            CustomEmojiReactionsWindow customEmojiReactionsWindow = anonymousClass14.reactionsWindow;
            if (customEmojiReactionsWindow != null) {
                customEmojiReactionsWindow.dismiss();
            }
            if (this.effectSelector.getReactionsWindow() != null && this.effectSelector.getReactionsWindow().containerView != null) {
                this.effectSelector.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.effectSelector.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.openInProgress = true;
        this.closing = !z;
        invalidate();
        this.firstOpenFrame = true;
        this.firstOpenFrame2 = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(10, this, z2));
        this.openAnimator.addListener(new ActionBar.AnonymousClass4(this, z, z2, runnable));
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    public final void changeMessageInternal(MessageObject messageObject) {
        ChatMessageCell chatMessageCell;
        AnonymousClass4 anonymousClass4 = this.chatListView;
        if (anonymousClass4 == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= anonymousClass4.getChildCount()) {
                chatMessageCell = null;
                break;
            }
            View childAt = anonymousClass4.getChildAt(i2);
            if (childAt instanceof ChatMessageCell) {
                chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() == messageObject) {
                    break;
                }
            }
            i2++;
        }
        ChatMessageCell chatMessageCell2 = chatMessageCell;
        int size = -1;
        while (true) {
            ArrayList arrayList = this.messageObjects;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == messageObject) {
                size = (arrayList.size() - 1) - i;
            }
            i++;
        }
        if (chatMessageCell2 == null) {
            anonymousClass4.getAdapter().notifyItemChanged(size);
            return;
        }
        messageObject.forceUpdate = true;
        chatMessageCell2.setMessageObject(messageObject, chatMessageCell2.getCurrentMessagesGroup(), chatMessageCell2.isPinnedBottom(), chatMessageCell2.isPinnedTop(), chatMessageCell2.isFirstInChat(), false);
        anonymousClass4.getAdapter().notifyItemChanged(size);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        }
    }

    @Override
    public final void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        AnonymousClass13 anonymousClass13 = this.sendButton;
        if (anonymousClass13 != null) {
            anonymousClass13.invalidate();
        }
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.invalidate();
        }
        animateOpenTo(new MessageSendPreview$$ExternalSyntheticLambda3(this, 0), false);
        invalidate();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        LaunchActivity.ActivityVisibilityController activityVisibilityController = this.activityVisibilityController;
        if (activityVisibilityController != null) {
            activityVisibilityController.setHidden(false);
            activityVisibilityController.destroyed = true;
            this.activityVisibilityController = null;
        }
    }

    public final void dismissInstant() {
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        LaunchActivity.ActivityVisibilityController activityVisibilityController = this.activityVisibilityController;
        if (activityVisibilityController != null) {
            activityVisibilityController.setHidden(false);
            activityVisibilityController.destroyed = true;
            this.activityVisibilityController = null;
        }
    }

    public final void drawStarsPrice(Canvas canvas, float f, float f2, float f3, float f4) {
        if (this.buttonText == null || this.buttonBgPaint == null) {
            return;
        }
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float fDp = AndroidUtilities.dp(28.0f) + this.buttonText.width;
        float fDp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = fDp / 2.0f;
        float f8 = f5 - f7;
        float f9 = fDp2 / 2.0f;
        rectF.set(f8, f6 - f9, f5 + f7, f6 + f9);
        canvas.save();
        canvas.drawRoundRect(rectF, f9, f9, this.buttonBgPaint);
        this.buttonText.draw(f8 + AndroidUtilities.dp(14.0f), f6, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long getSelectedEffect() {
        MessageObject messageObject;
        if (this.sentEffect || this.effectSelector == null) {
            return 0L;
        }
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

    public final MessageObject.GroupedMessages getValidGroupedMessage$1(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    @Override
    public final boolean isShowing() {
        return !this.dismissing;
    }

    public final void lambda$dismiss$9() {
        super.dismiss();
    }

    public final void lambda$dismissInto$7() {
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        if (this.keyboardVisible) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.keyboardVisible = false;
            return;
        }
        AnonymousClass14 anonymousClass14 = this.effectSelector;
        if (anonymousClass14 == null || anonymousClass14.getReactionsWindow() == null) {
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        AnonymousClass1 anonymousClass1 = this.windowView;
        setContentView(anonymousClass1, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        window.setAttributes(attributes);
        anonymousClass1.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(anonymousClass1, !Theme.currentTheme.isDark());
    }

    public void onEffectChange(long j) {
    }

    public final void scrollTo(boolean z) {
        AnonymousClass7 anonymousClass7;
        int i;
        AnonymousClass4 anonymousClass4 = this.chatListView;
        if (anonymousClass4 == null || anonymousClass4.getAdapter() == null || (anonymousClass7 = this.chatLayoutManager) == null) {
            return;
        }
        int itemCount = anonymousClass4.getAdapter().getItemCount();
        if (z) {
            i = itemCount > 10 ? itemCount % 10 : 0;
        } else {
            i = itemCount - 1;
        }
        anonymousClass7.scrollToPositionWithOffset(i, AndroidUtilities.dp(12.0f), z);
        this.scrolledToLast = z;
    }

    public final void setEffectId(long j) {
        TLRPC.TL_availableEffect effect;
        this.effectId = j;
        boolean zIsEmpty = this.groupedMessagesMap.isEmpty();
        ArrayList arrayList = this.messageObjects;
        int size = (zIsEmpty || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
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

    public final void setItemOptions(ItemOptions itemOptions) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        itemOptions.setGapBackgroundColor(Theme.multAlpha(0.06f, Theme.getColor(i, resourcesProvider)));
        itemOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider), false);
        ViewGroup viewGroup = itemOptions.layout;
        this.optionsView = viewGroup;
        this.containerView.addView(viewGroup, LayoutHelper.createFrame(-2.0f, -2));
    }

    public final void setMessageObjects(ArrayList arrayList) {
        LongSparseArray longSparseArray;
        int i;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            longSparseArray = this.groupedMessagesMap;
            if (i2 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) longSparseArray.get(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    longSparseArray.put(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= groupedMessages.messages.size()) {
                            groupedMessages.messages.add(messageObject);
                            break;
                        } else if (groupedMessages.messages.get(i3).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i2++;
        }
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            ((MessageObject.GroupedMessages) longSparseArray.valueAt(i4)).calculate();
        }
        ArrayList arrayList2 = this.messageObjects;
        arrayList2.addAll(arrayList);
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            int i6 = this.messageObjectsWidth;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i5);
            if (getContext() == null) {
                i = 0;
            } else {
                if (this.dummyMessageCell == null) {
                    this.dummyMessageCell = new ChatMessageCell(getContext(), this.currentAccount, true, null, this.resourcesProvider);
                }
                ChatMessageCell chatMessageCell = this.dummyMessageCell;
                chatMessageCell.isChat = false;
                chatMessageCell.isSavedChat = false;
                chatMessageCell.isSavedPreviewChat = false;
                chatMessageCell.isBot = false;
                chatMessageCell.isMegagroup = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) longSparseArray.get(messageObject2.getGroupId());
                PhotoViewer.AnonymousClass11 anonymousClass11 = chatMessageCell.photoImage;
                anonymousClass11.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = chatMessageCell.avatarImage;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = chatMessageCell.replyImageReceiver;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = chatMessageCell.locationImageReceiver;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    chatMessageCell.setMessageContent(messageObject2, groupedMessages2, false, false, false, false);
                    anonymousClass11.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    chatMessageCell.updateCaptionLayout();
                    i = chatMessageCell.backgroundWidth;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    chatMessageCell.computedGroupCaptionY = 0;
                    i = 0;
                    for (int i7 = 0; i7 < groupedMessages2.messages.size(); i7++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i7);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            chatMessageCell.setMessageContent(messageObject3, groupedMessages2, false, false, false, false);
                            i += chatMessageCell.backgroundWidth;
                        }
                    }
                }
            }
            this.messageObjectsWidth = Math.max(i6, i);
        }
        AnonymousClass4 anonymousClass4 = this.chatListView;
        anonymousClass4.getAdapter().notifyDataSetChanged();
        int itemCount = anonymousClass4.getAdapter().getItemCount();
        scrollToPositionWithOffset(itemCount > 10 ? itemCount % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final AnonymousClass13 setSendButton(final ChatActivityEnterView.SendButton sendButton, final boolean z, View.OnClickListener onClickListener) {
        this.anchorSendButton = sendButton;
        int[] iArr = this.sendButtonInitialPosition;
        sendButton.getLocationOnScreen(iArr);
        ?? r1 = new ChatActivityEnterView.SendButton(getContext(), sendButton.resId, this.resourcesProvider) {
            @Override
            public final int getFillColor() {
                return sendButton.getFillColor();
            }

            @Override
            public final boolean isInScheduleMode() {
                return sendButton.isInScheduleMode();
            }

            @Override
            public final boolean isInactive() {
                return sendButton.isInactive();
            }

            @Override
            public final boolean isOpen() {
                return (z && MessageSendPreview.this.dismissing && this.starsPrice <= 0) ? false : true;
            }

            @Override
            public final boolean shouldDrawBackground() {
                return sendButton.shouldDrawBackground();
            }
        };
        this.sendButton = r1;
        r1.setScaleX(this.anchorSendButton.getScaleX());
        setScaleY(this.anchorSendButton.getScaleY());
        ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
        AnonymousClass13 anonymousClass13 = this.sendButton;
        anonymousClass13.isNewDesignSendButton = sendButton2.isNewDesignSendButton;
        anonymousClass13.newCounterPos = sendButton2.newCounterPos;
        anonymousClass13.count.setText(sendButton2.count.currentText, false, true);
        anonymousClass13.countBounceScale = sendButton2.countBounceScale;
        anonymousClass13.setEmoji(sendButton2.emojiDrawable.drawables[0]);
        anonymousClass13.setStarsPrice(sendButton2.messagesCount, sendButton2.starsPrice, true);
        anonymousClass13.open.set(sendButton2.open.value, true);
        anonymousClass13.animatedPriceVisible.set(sendButton2.animatedPriceVisible.value, true);
        int i = sendButton2.circleWidth;
        int i2 = sendButton2.circleHeight;
        anonymousClass13.circleWidth = i;
        anonymousClass13.circleHeight = i2;
        float f = sendButton2.circlePadX;
        float f2 = sendButton2.circlePadY;
        anonymousClass13.circlePadX = f;
        anonymousClass13.circlePadY = f2;
        this.sendButton.open.set(sendButton.open.value, true);
        setOnClickListener(onClickListener);
        this.containerView.addView(this.sendButton, new ViewGroup.LayoutParams(sendButton.getWidth(), sendButton.getHeight()));
        ChatActivityEnterView.SendButton sendButton3 = this.anchorSendButton;
        sendButton.getHeight();
        this.sendButtonWidth = sendButton3.width$1();
        int i3 = iArr[0];
        int width = this.anchorSendButton.getWidth();
        ChatActivityEnterView.SendButton sendButton4 = this.anchorSendButton;
        sendButton.getHeight();
        iArr[0] = zzlb.m(width - sendButton4.width$1(), 6.0f, i3);
        return this.sendButton;
    }

    public final void setStars(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.buttonText = j > 0 ? new Text(StarsIntroActivity.replaceStarsWithPlain(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.buttonBgPaint == null) {
            Paint paint = new Paint(1);
            this.buttonBgPaint = paint;
            paint.setColor(1073741824);
        }
        invalidate();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.messageObjects;
            if (i >= arrayList.size()) {
                this.adapter.mObservable.notifyChanged();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j > 0;
            }
            i++;
        }
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            SpoilerEffect2.pause$1(true);
            super.show();
            final float alpha = this.anchorSendButton.getAlpha();
            ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
            if (sendButton != null) {
                sendButton.setAlpha(0.0f);
            }
            ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    MessageSendPreview messageSendPreview = this.f$0;
                    ChatActivityEnterView.SendButton sendButton2 = messageSendPreview.anchorSendButton;
                    if (sendButton2 != null) {
                        sendButton2.setAlpha(alpha);
                    }
                    messageSendPreview.blurBitmap = bitmap;
                    Paint paint = new Paint(1);
                    messageSendPreview.blurBitmapPaint = paint;
                    Bitmap bitmap3 = messageSendPreview.blurBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    messageSendPreview.blurBitmapShader = bitmapShader;
                    paint.setShader(bitmapShader);
                    messageSendPreview.blurMatrix = new Matrix();
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = messageSendPreview.iBlur3SourceBitmap;
                    blurredBackgroundSourceBitmap.setBitmap(bitmap2);
                    Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap, messageSendPreview.windowView);
                    ViewGroup viewGroup = messageSendPreview.optionsView;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            AnonymousClass1 anonymousClass1 = this.effectsView;
            if (anonymousClass1 != null) {
                anonymousClass1.bringToFront();
            }
            animateOpenTo(null, true);
        }
    }

    public final void showEffectSelector() {
        if (this.effectSelectorShown) {
            return;
        }
        this.layoutDone = false;
        this.effectSelectorShown = true;
        this.effectSelector.setMessage(null, null, true);
        this.effectSelector.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        this.effectSelector.startEnterAnimation(false);
    }
}
