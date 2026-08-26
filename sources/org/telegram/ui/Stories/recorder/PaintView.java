package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.zxing.common.detector.MathUtils;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda13;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.GroupCallUserCell$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.IPhotoPaintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.Paint.Views.EntitiesContainerView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintTextOptionsView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Paint.Views.WeatherView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichMapCell;

public abstract class PaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StoryRecorder.Touchable {
    public final Bitmap bitmapToEdit;
    public BlurringShader.BlurManager blurManager;
    public final AnonymousClass9 bottomLayout;
    public final PaintCancelView cancelButton;
    public final TextView cancelTextButton;
    public ColorPickerBottomSheet colorPickerBottomSheet;
    public final Paint colorPickerRainbowPaint;
    public final Swatch colorSwatch;
    public final Paint colorSwatchOutlinePaint;
    public final Paint colorSwatchPaint;
    public final AnonymousClass11 colorsListView;
    public boolean creatingNewRound;
    public final int currentAccount;
    public final MediaController.CropState currentCropState;
    public EntityView currentEntityView;
    public final PaintDoneView doneButton;
    public final TextView doneTextButton;
    public boolean drawForThemeToggle;
    public TextView drawTab;
    public boolean editingText;
    public int emojiPadding;
    public AnonymousClass22 emojiPopup;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean enteredThroughText;
    public final AnonymousClass7 entitiesView;
    public final File file;
    public final boolean fileFromGallery;
    public boolean forceChanges;
    public int h;
    public boolean hasAudio;
    public boolean ignoreLayout;
    public boolean ignoreToolChangeAnimationOnce;
    public final boolean inBubbleMode;
    public ArrayList initialEntities;
    public StoryEntry initialEntry;
    public boolean invalidateReactionPosition;
    public boolean isAnimatePopupClosing;
    public final boolean isBot;
    public boolean isColorListShown;
    public boolean isCoverPreview;
    public boolean isTypefaceMenuShown;
    public final boolean isVideo;
    public AnimatorSet keyboardAnimator;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public final AnonymousClass13 keyboardNotifier;
    public boolean keyboardVisible;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public BigInteger lcm;
    public Runnable onCancelButtonClickedListener;
    public Runnable onDoneButtonClickedListener;
    public final int originalBitmapRotation;
    public final AnonymousClass10 overlayLayout;
    public final PaintToolsView paintToolsView;
    public Size paintingSize;
    public final StoryRecorder.WindowView parent;
    public final FrameLayout pipetteContainerLayout;
    public final float[] points;
    public PopupWindowLayout popupLayout;
    public Rect popupRect;
    public ActionBarPopupWindow popupWindow;
    public final int[] pos;
    public final StoryRecorder.AnonymousClass7 previewView;
    public ObjectAnimator previewViewTranslationAnimator;
    public final DispatchQueue queue;
    public ReactionWidgetEntityView reactionForEntity;
    public ReactionsContainerLayout reactionLayout;
    public boolean reactionLayoutShowing;
    public float reactionShowProgress;
    public final AnonymousClass5 renderInputView;
    public final AnonymousClass3 renderView;
    public final AnonymousClass2 resourcesProvider;
    public int selectedTextType;
    public final AnonymousClass8 selectionContainerView;
    public TextView stickerTab;
    public FloatingToolbar.AnonymousClass2 tabsLayout;
    public int tabsNewSelectedIndex;
    public int tabsSelectedIndex;
    public ValueAnimator tabsSelectionAnimator;
    public float tabsSelectionProgress;
    public final View textDim;
    public final PaintTextOptionsView textOptionsView;
    public TextView textTab;
    public final Paint toolsPaint;
    public SpringAnimation toolsTransformAnimation;
    public float toolsTransformProgress;
    public final FrameLayout topLayout;
    public boolean translateBottomPanelAfterResize;
    public final PaintTypefaceListView typefaceListView;
    public final Paint typefaceMenuBackgroundPaint;
    public final Paint typefaceMenuOutlinePaint;
    public SpringAnimation typefaceMenuTransformAnimation;
    public float typefaceMenuTransformProgress;
    public final TextView undoAllButton;
    public final ImageView undoButton;
    public final UndoStore undoStore;
    public final PreviewView.TextureViewHolder videoTextureHolder;
    public int w;
    public boolean wasKeyboardVisible;
    public final PaintWeightChooserView weightChooserView;
    public final RichMapCell.AnonymousClass1 weightDefaultValueOverride;
    public final LinearLayout zoomOutButton;
    public boolean zoomOutVisible;

    public final class AnonymousClass13 extends KeyboardNotifier {
        public final StoryRecorder.AnonymousClass24 this$0;

        public AnonymousClass13(StoryRecorder.AnonymousClass24 anonymousClass24, StoryRecorder.WindowView windowView, GiftSheet$$ExternalSyntheticLambda4 giftSheet$$ExternalSyntheticLambda4) {
            super(windowView, false, giftSheet$$ExternalSyntheticLambda4);
            this.this$0 = anonymousClass24;
        }

        @Override
        public final void ignore(boolean z) {
            this.ignoring = z;
            update();
            if (z) {
                this.this$0.showTypefaceMenu$1(false);
            }
        }
    }

    public final class AnonymousClass14 implements PaintWeightChooserView.ValueOverride {
        public final int $r8$classId;
        public final float val$base;
        public final TextPaintView val$textPaintView;

        public AnonymousClass14(TextPaintView textPaintView, float f, int i) {
            this.$r8$classId = i;
            this.val$textPaintView = textPaintView;
            this.val$base = f;
        }

        @Override
        public final float get() {
            switch (this.$r8$classId) {
                case 0:
                    break;
            }
            return this.val$textPaintView.getBaseFontSize() / this.val$base;
        }

        @Override
        public final void set(float f) {
            switch (this.$r8$classId) {
                case 0:
                    TextPaintView textPaintView = this.val$textPaintView;
                    textPaintView.disableAutoresize = true;
                    textPaintView.setBaseFontSize((int) (this.val$base * f));
                    break;
                default:
                    TextPaintView textPaintView2 = this.val$textPaintView;
                    textPaintView2.disableAutoresize = true;
                    textPaintView2.setBaseFontSize((int) (this.val$base * f));
                    break;
            }
        }
    }

    public final class AnonymousClass19 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PaintView this$0;

        public AnonymousClass19(PaintView paintView, int i) {
            this.$r8$classId = i;
            this.this$0 = paintView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    PaintView paintView = this.this$0;
                    paintView.reactionShowProgress = 0.0f;
                    paintView.reactionLayout.setAlpha(1.0f);
                    paintView.reactionLayout.setVisibility(8);
                    paintView.reactionLayout.reset();
                    break;
                case 1:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                default:
                    PaintView paintView2 = this.this$0;
                    paintView2.isAnimatePopupClosing = false;
                    paintView2.emojiView.setTranslationY(0.0f);
                    paintView2.hideEmojiView$2();
                    break;
            }
        }
    }

    public final class AnonymousClass21 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final SizeNotifierFrameLayoutPhoto this$0;
        public final int val$index;
        public final ViewGroup val$newView;
        public final ViewGroup val$view;

        public AnonymousClass21(SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, ViewGroup viewGroup, ViewGroup viewGroup2, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = sizeNotifierFrameLayoutPhoto;
            this.val$view = viewGroup;
            this.val$newView = viewGroup2;
            this.val$index = i;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    PaintView paintView = (PaintView) this.this$0;
                    paintView.tabsSelectedIndex = paintView.tabsNewSelectedIndex;
                    paintView.tabsNewSelectedIndex = -1;
                    paintView.tabsLayout.invalidate();
                    ViewGroup viewGroup = this.val$view;
                    if (viewGroup != null && this.val$newView != null) {
                        viewGroup.setVisibility(8);
                    }
                    if (animator == paintView.tabsSelectionAnimator) {
                        paintView.tabsSelectionAnimator = null;
                    }
                    break;
                default:
                    LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.this$0;
                    lPhotoPaintView.tabsSelectedIndex = lPhotoPaintView.tabsNewSelectedIndex;
                    lPhotoPaintView.tabsNewSelectedIndex = -1;
                    lPhotoPaintView.tabsLayout.invalidate();
                    ViewGroup viewGroup2 = this.val$view;
                    if (viewGroup2 != null && this.val$newView != null) {
                        viewGroup2.setVisibility(8);
                    }
                    if (animator == lPhotoPaintView.tabsSelectionAnimator) {
                        lPhotoPaintView.tabsSelectionAnimator = null;
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            switch (this.$r8$classId) {
                case 0:
                    if (this.val$view != null && (viewGroup = this.val$newView) != null) {
                        viewGroup.setVisibility(0);
                    }
                    int i = this.val$index;
                    PaintView paintView = (PaintView) this.this$0;
                    if (i != 2) {
                        Brush currentBrush = paintView.renderView.getCurrentBrush();
                        if ((currentBrush instanceof Brush.Blurer) || (currentBrush instanceof Brush.Eraser)) {
                            PaintWeightChooserView paintWeightChooserView = paintView.weightChooserView;
                            paintWeightChooserView.min = 0.4f;
                            paintWeightChooserView.max = 1.75f;
                            paintWeightChooserView.invalidate();
                        } else {
                            PaintWeightChooserView paintWeightChooserView2 = paintView.weightChooserView;
                            paintWeightChooserView2.min = 0.05f;
                            paintWeightChooserView2.max = 1.0f;
                            paintWeightChooserView2.invalidate();
                        }
                    } else {
                        PaintWeightChooserView paintWeightChooserView3 = paintView.weightChooserView;
                        paintWeightChooserView3.min = 0.5f;
                        paintWeightChooserView3.max = 2.0f;
                        paintWeightChooserView3.invalidate();
                    }
                    break;
                default:
                    if (this.val$view != null && (viewGroup2 = this.val$newView) != null) {
                        viewGroup2.setVisibility(0);
                    }
                    int i2 = this.val$index;
                    LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.this$0;
                    if (i2 != 2) {
                        Brush currentBrush2 = lPhotoPaintView.renderView.getCurrentBrush();
                        if ((currentBrush2 instanceof Brush.Blurer) || (currentBrush2 instanceof Brush.Eraser)) {
                            PaintWeightChooserView paintWeightChooserView4 = lPhotoPaintView.weightChooserView;
                            paintWeightChooserView4.min = 0.4f;
                            paintWeightChooserView4.max = 1.75f;
                            paintWeightChooserView4.invalidate();
                        } else {
                            PaintWeightChooserView paintWeightChooserView5 = lPhotoPaintView.weightChooserView;
                            paintWeightChooserView5.min = 0.05f;
                            paintWeightChooserView5.max = 1.0f;
                            paintWeightChooserView5.invalidate();
                        }
                    } else {
                        PaintWeightChooserView paintWeightChooserView6 = lPhotoPaintView.weightChooserView;
                        paintWeightChooserView6.min = 0.5f;
                        paintWeightChooserView6.max = 2.0f;
                        paintWeightChooserView6.invalidate();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass25 implements ChatAttachAlert.ChatAttachViewDelegate {
        @Override
        public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        }

        @Override
        public final void didSelectBot(TLRPC.User user) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
        }

        @Override
        public final void doOnIdle(Runnable runnable) {
            runnable.run();
        }

        @Override
        public final View getRevealView() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$getRevealView(this);
        }

        @Override
        public final boolean needEnterComment() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
        }

        @Override
        public final void onCameraOpened() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
        }

        @Override
        public final void onWallpaperSelected(Object obj) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
        }

        @Override
        public final void openAvatarsSearch() {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
        }

        @Override
        public final boolean selectItemOnClicking() {
            return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
        }

        @Override
        public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
            ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
        }
    }

    public final class AnonymousClass26 extends MessageEntityView {
        public AnonymousClass26(Context context, PointF pointF, ArrayList arrayList, BlurringShader.BlurManager blurManager, boolean z, PreviewView.TextureViewHolder textureViewHolder) {
            super(context, pointF, arrayList, blurManager, z, textureViewHolder);
        }
    }

    public final class AnonymousClass31 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass31() {
        }

        @Override
        public final boolean canAddCaptionToGif(TLRPC.Document document) {
            return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
        }

        @Override
        public final boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public final long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public final float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public final int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public final void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public final boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public final boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public final boolean isSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
        }

        @Override
        public final boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
        }

        @Override
        public final boolean onBackspace() {
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
            if (editText == null || editText.length() == 0) {
                return false;
            }
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            PaintView paintView = PaintView.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(paintView.getContext(), 0, paintView.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new Weather$$ExternalSyntheticLambda7(this, 7));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(document != null ? new AnimatedEmojiSpan(document, 1.0f, editText.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, 1.0f, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                editText.setText(editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override
        public final void onEmojiSelected(String str) {
            TextPaintView textPaintView;
            EditTextOutline editText;
            Emoji.EmojiSpan[] emojiSpanArr;
            EntityView entityView = PaintView.this.currentEntityView;
            if ((entityView instanceof TextPaintView) && (editText = (textPaintView = (TextPaintView) entityView).getEditText()) != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, textPaintView.getFontMetricsInt(), false);
                    if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    editText.setText(editText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                    int length = selectionEnd + charSequenceReplaceEmoji.length();
                    editText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public final void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i);
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override
        public final void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
        }

        @Override
        public final void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public final void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public final void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }
    }

    public final class AnonymousClass9 extends FrameLayout {
        public float lastRainbowX;
        public float lastRainbowY;
        public final StoryRecorder.AnonymousClass24 this$0;
        public final PersistColorPalette val$palette;

        public AnonymousClass9(StoryRecorder.AnonymousClass24 anonymousClass24, Context context, PersistColorPalette persistColorPalette) {
            super(context);
            this.this$0 = anonymousClass24;
            this.val$palette = persistColorPalette;
            new Path();
            setWillNotDraw(false);
            Paint paint = anonymousClass24.colorPickerRainbowPaint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ViewGroup viewGroup;
            Canvas canvas2 = canvas;
            super.onDraw(canvas);
            StoryRecorder.AnonymousClass24 anonymousClass24 = this.this$0;
            ViewGroup barView = anonymousClass24.getBarView();
            RectF rectF = AndroidUtilities.rectTmp;
            int left = barView.getLeft();
            AnonymousClass11 anonymousClass11 = anonymousClass24.colorsListView;
            rectF.set(AndroidUtilities.lerp(left, anonymousClass11.getLeft(), anonymousClass24.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), anonymousClass11.getTop(), anonymousClass24.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), anonymousClass11.getRight(), anonymousClass24.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), anonymousClass11.getBottom(), anonymousClass24.toolsTransformProgress));
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), anonymousClass24.toolsTransformProgress);
            canvas2.drawRoundRect(rectF, fLerp, fLerp, anonymousClass24.toolsPaint);
            if (barView.getChildCount() < 1 || anonymousClass24.toolsTransformProgress == 1.0f) {
                return;
            }
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof PaintTextOptionsView) {
                childAt = ((PaintTextOptionsView) barView).getColorClickableView();
            }
            View view = childAt;
            if (view.getAlpha() != 0.0f) {
                canvas2.scale(view.getScaleX(), view.getScaleY(), view.getPivotX(), view.getPivotY());
                Paint paint = anonymousClass24.colorPickerRainbowPaint;
                paint.setAlpha((int) (view.getAlpha() * (1.0f - anonymousClass24.toolsTransformProgress) * 255.0f));
                int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
                int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                float x = (width / 2.0f) + view.getX() + view.getPaddingLeft();
                float y = (height / 2.0f) + view.getY() + view.getPaddingTop();
                Swatch swatch = anonymousClass24.colorSwatch;
                int iBlendARGB = swatch.color;
                int i = anonymousClass24.tabsNewSelectedIndex;
                if (i != -1) {
                    if (i == 0) {
                        viewGroup = anonymousClass24.paintToolsView;
                    } else {
                        viewGroup = i == 2 ? anonymousClass24.textOptionsView : null;
                    }
                    View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                    if (viewGroup instanceof PaintTextOptionsView) {
                        childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                    }
                    x = AndroidUtilities.lerp(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), anonymousClass24.tabsSelectionProgress);
                    y = AndroidUtilities.lerp(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), anonymousClass24.tabsSelectionProgress);
                }
                if (anonymousClass11 != null && anonymousClass11.getChildCount() > 0) {
                    View childAt3 = anonymousClass11.getChildAt(0);
                    x = AndroidUtilities.lerp(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (anonymousClass11.getX() - barView.getLeft()), anonymousClass24.toolsTransformProgress);
                    y = AndroidUtilities.lerp(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (anonymousClass11.getY() - barView.getTop()), anonymousClass24.toolsTransformProgress);
                    iBlendARGB = ColorUtils.blendARGB(anonymousClass24.toolsTransformProgress, swatch.color, this.val$palette.getColor(0));
                }
                if (x != this.lastRainbowX || y != this.lastRainbowY) {
                    this.lastRainbowX = x;
                    this.lastRainbowY = y;
                    paint.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (anonymousClass11 != null && anonymousClass11.getChildCount() > 0) {
                    View childAt4 = anonymousClass11.getChildAt(0);
                    fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), anonymousClass24.toolsTransformProgress);
                }
                float f = fMin;
                rectF.set(x - f, y - f, x + f, y + f);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint);
                Paint paint2 = anonymousClass24.colorSwatchPaint;
                paint2.setColor(iBlendARGB);
                paint2.setAlpha((int) (view.getAlpha() * paint2.getAlpha()));
                Paint paint3 = anonymousClass24.colorSwatchOutlinePaint;
                paint3.setColor(iBlendARGB);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float fDp = f - AndroidUtilities.dp(3.0f);
                if (anonymousClass11 != null && anonymousClass11.getSelectedColorIndex() != 0) {
                    fDp = AndroidUtilities.lerp(f - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f, anonymousClass24.toolsTransformProgress);
                }
                PaintColorsListView.drawColorCircle(canvas2, x, y, fDp, paint2.getColor());
                if (anonymousClass11 != null && anonymousClass11.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * anonymousClass24.toolsTransformProgress));
                    canvas2.drawCircle(x, y, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, anonymousClass24.toolsTransformProgress, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f), paint3);
                }
            }
            canvas2.restore();
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            AnonymousClass10 anonymousClass10 = this.this$0.overlayLayout;
            if (anonymousClass10 != null) {
                anonymousClass10.invalidate();
            }
        }
    }

    public final class PopupButton extends LinearLayout {
        public final ImageView checkView;
        public ImageView image2View;
        public ValueAnimator imageSwitchAnimator;
        public boolean imageSwitchFill;
        public float imageSwitchT;
        public ImageView imageView;
        public final ChatLoadingCell.AnonymousClass1 imagesView;
        public final TextView textView;

        public PopupButton(Context context) {
            super(context);
            setOrientation(0);
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, PaintView.this.resourcesProvider), 2, -1));
            ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(this, context);
            this.imagesView = anonymousClass1;
            addView(anonymousClass1, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            AnonymousClass2 anonymousClass2 = PaintView.this.resourcesProvider;
            imageView2.setColorFilter(Theme.getColor(i, anonymousClass2));
            anonymousClass1.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
            this.image2View.setColorFilter(Theme.getColor(i, anonymousClass2));
            this.image2View.setVisibility(8);
            anonymousClass1.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(i, anonymousClass2));
            textView.setTextSize(1, 16.0f);
            addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            imageView4.setScaleType(scaleType);
            imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_radioBackgroundChecked, anonymousClass2), PorterDuff.Mode.MULTIPLY));
            imageView4.setVisibility(8);
            addView(imageView4, LayoutHelper.createLinear(50, -1));
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public final boolean performClick() {
            PaintView paintView = PaintView.this;
            ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
            if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                paintView.popupWindow.dismiss(true);
            }
            return super.performClick();
        }

        public void setIcon(int i) {
            setIcon(i, true, false);
        }

        @Override
        public void setSelected(boolean z) {
            this.checkView.setVisibility(z ? 0 : 8);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public final void setIcon(int i, boolean z, boolean z2) {
            int i2 = 6;
            if (!z2) {
                this.imageView.setImageResource(i);
                return;
            }
            ValueAnimator valueAnimator = this.imageSwitchAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.imageSwitchAnimator = null;
                setIcon(i, false, false);
                return;
            }
            this.imageSwitchFill = z;
            this.image2View.setImageResource(i);
            this.image2View.setVisibility(0);
            this.image2View.setAlpha(1.0f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.imageSwitchAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatMessageCell$$ExternalSyntheticLambda13(this, z, i2));
            this.imageSwitchAnimator.addListener(new HintView2.AnonymousClass2(this, i2));
            this.imageSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.imageSwitchAnimator.setDuration(420L);
            this.imageSwitchAnimator.start();
        }
    }

    public final class PopupWindowLayout extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        public final ButtonBounce bounce;
        public float cx;
        public float cy;
        public boolean enableBounce;

        public PopupWindowLayout(PaintView paintView, Context context) {
            super(context, R.drawable.popup_fixed_alert2, paintView.resourcesProvider, 0);
            this.bounce = new ButtonBounce(this, 1.5f, 1.0f, 2.0f);
            this.enableBounce = true;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float scale = this.bounce.getScale(0.05f);
            if (scale < 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, this.cx, this.cy);
            }
            super.dispatchDraw(canvas);
            if (scale < 1.0f) {
                canvas.restore();
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = this.bounce;
            if (action == 0) {
                this.cx = motionEvent.getX();
                this.cy = motionEvent.getY();
                buttonBounce.setPressed(this.enableBounce);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                buttonBounce.setPressed(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public PaintView(Context context, boolean z, File file, boolean z2, boolean z3, StoryRecorder.WindowView windowView, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, BlurringShader.BlurManager blurManager, final DarkThemeResourceProvider darkThemeResourceProvider, PreviewView.TextureViewHolder textureViewHolder, StoryRecorder.AnonymousClass7 anonymousClass7) {
        int i5;
        super(context, activity, true);
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        final StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this;
        RichMapCell.AnonymousClass1 anonymousClass1 = new RichMapCell.AnonymousClass1(anonymousClass24, 14);
        this.weightDefaultValueOverride = anonymousClass1;
        Paint paint = new Paint(1);
        this.typefaceMenuOutlinePaint = paint;
        Paint paint2 = new Paint(1);
        this.typefaceMenuBackgroundPaint = paint2;
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        Paint paint3 = new Paint(1);
        this.colorSwatchOutlinePaint = paint3;
        Swatch swatch = new Swatch(-1, 0.016773745f);
        this.colorSwatch = swatch;
        Paint paint4 = new Paint(1);
        this.toolsPaint = paint4;
        this.zoomOutVisible = false;
        this.points = new float[2];
        this.isCoverPreview = false;
        this.pos = new int[2];
        setDelegate(this);
        this.blurManager = blurManager;
        this.videoTextureHolder = textureViewHolder;
        this.fileFromGallery = z;
        this.file = file;
        this.isVideo = z2;
        this.isBot = z3;
        this.parent = windowView;
        this.w = i3;
        this.h = i4;
        this.previewView = anonymousClass7;
        this.currentAccount = i;
        ?? r2 = new Theme.ResourcesProvider() {
            public PorterDuffColorFilter animatedEmojiColorFilter;

            @Override
            public final void applyServiceShaderMatrix(int i6, int i7, float f, float f2) {
                Theme.applyServiceShaderMatrix(Theme.serviceBitmap, Theme.serviceBitmapShader, Theme.serviceBitmapMatrix, i6, i7, f, f2);
            }

            @Override
            public final ColorFilter getAnimatedEmojiColorFilter() {
                if (this.animatedEmojiColorFilter == null) {
                    this.animatedEmojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return this.animatedEmojiColorFilter;
            }

            @Override
            public final int getColor(int i6) {
                if (i6 == Theme.key_actionBarDefaultSubmenuBackground) {
                    return -14145495;
                }
                if (i6 == Theme.key_actionBarDefaultSubmenuItem) {
                    return -1;
                }
                if (i6 == Theme.key_dialogBackground) {
                    return -14737633;
                }
                if (i6 == Theme.key_dialogTextBlack) {
                    return -592138;
                }
                if (i6 == Theme.key_dialogTextGray3) {
                    return -8553091;
                }
                if (i6 == Theme.key_chat_emojiPanelBackground) {
                    return -16777216;
                }
                if (i6 == Theme.key_chat_emojiPanelShadowLine) {
                    return -1610612736;
                }
                if (i6 == Theme.key_chat_emojiBottomPanelIcon || i6 == Theme.key_chat_emojiPanelBackspace || i6 == Theme.key_chat_emojiPanelIcon) {
                    return -9539985;
                }
                if (i6 == Theme.key_windowBackgroundWhiteBlackText) {
                    return -1;
                }
                int i7 = Theme.key_featuredStickers_addedIcon;
                if (i6 == i7) {
                    return -11754001;
                }
                if (i6 == Theme.key_listSelector) {
                    return 536870911;
                }
                if (i6 == Theme.key_profile_tabSelectedText || i6 == Theme.key_profile_tabText || i6 == Theme.key_profile_tabSelectedLine) {
                    return -1;
                }
                if (i6 == Theme.key_profile_tabSelector) {
                    return 352321535;
                }
                if (i6 == Theme.key_chat_emojiSearchIcon || i6 == i7) {
                    return -7895161;
                }
                if (i6 == Theme.key_chat_emojiSearchBackground) {
                    return 780633991;
                }
                if (i6 == Theme.key_windowBackgroundGray) {
                    return -15921907;
                }
                DarkThemeResourceProvider darkThemeResourceProvider2 = darkThemeResourceProvider;
                return darkThemeResourceProvider2 != null ? darkThemeResourceProvider2.getColor(i6) : Theme.getColor(null, i6, false);
            }

            @Override
            public final int getColorOrDefault(int i6) {
                return getColor(i6);
            }

            @Override
            public final int getCurrentColor(int i6) {
                return getColor(i6);
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final Paint getPaint(String str) {
                return darkThemeResourceProvider.getPaint(str);
            }

            @Override
            public final boolean hasGradientService() {
                return false;
            }

            @Override
            public final boolean isDark() {
                return Theme.currentTheme.isDark();
            }

            @Override
            public final void setAnimatedColor(int i6, int i7) {
            }
        };
        this.resourcesProvider = r2;
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        persistColorPalette.setCurrentBrush(0, true);
        swatch.color = persistColorPalette.getCurrentColor();
        swatch.brushWeight = persistColorPalette.currentWeight;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.queue = dispatchQueue;
        this.bitmapToEdit = bitmap;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        final StoryRecorder.AnonymousClass24 anonymousClass25 = (StoryRecorder.AnonymousClass24) this;
        undoStore.delegate = new Weather$$ExternalSyntheticLambda7(anonymousClass25, 6);
        View view = new View(context);
        this.textDim = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        ?? r3 = new RenderView(context, new Painting(getPaintingSize(), null, i2, blurManager), bitmap, bitmap2, (storyEntry == null || !storyEntry.isRepostMessage) ? blurManager : null) {
            @Override
            public final void selectBrush(Brush brush) {
                int iIndexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i6 = iIndexOf + 1;
                if (i6 <= 1) {
                    iIndexOf = i6;
                }
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                PaintToolsView paintToolsView = anonymousClass26.paintToolsView;
                paintToolsView.animateNextIndex(iIndexOf);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(iIndexOf - 1, true);
                anonymousClass26.onBrushSelected(brush);
            }
        };
        this.renderView = r3;
        r3.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public final void invalidateInputView() {
                AnonymousClass5 anonymousClass5 = anonymousClass24.renderInputView;
                if (anonymousClass5 != null) {
                    anonymousClass5.invalidate();
                }
            }

            @Override
            public final void onBeganDrawing() {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                if (anonymousClass26.currentEntityView != null) {
                    anonymousClass26.selectEntity$1(null, true);
                }
                anonymousClass26.weightChooserView.setViewHidden(true);
            }

            @Override
            public final void onFinishedDrawing() {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                anonymousClass26.undoStore.delegate.historyChanged();
                anonymousClass26.weightChooserView.setViewHidden(false);
            }

            @Override
            public final void onFirstDraw() {
            }

            @Override
            public final void resetBrush() {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                if (anonymousClass26.ignoreToolChangeAnimationOnce) {
                    anonymousClass26.ignoreToolChangeAnimationOnce = false;
                    return;
                }
                PaintToolsView paintToolsView = anonymousClass26.paintToolsView;
                paintToolsView.animateNextIndex(1);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(0, true);
                anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }

            @Override
            public final boolean shouldDraw() {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                boolean z4 = anonymousClass26.currentEntityView == null;
                if (!z4) {
                    anonymousClass26.selectEntity$1(null, true);
                }
                return z4;
            }
        });
        r3.setUndoStore(undoStore);
        r3.setQueue(dispatchQueue);
        r3.setVisibility(4);
        ?? r5 = new View(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnonymousClass3 anonymousClass3 = anonymousClass24.renderView;
                if (anonymousClass3 != null) {
                    anonymousClass3.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = r5;
        r5.setVisibility(4);
        ?? r4 = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public final void onEntityDeselect() {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                anonymousClass26.selectEntity$1(null, true);
                if (anonymousClass26.enteredThroughText) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.captionEdit.editText.closeKeyboard();
                    storyRecorder.switchToEditMode(-1, false, true);
                    anonymousClass26.enteredThroughText = false;
                }
                anonymousClass26.showReactionsLayout(false);
            }

            @Override
            public final EntityView onSelectedEntityRequest() {
                return anonymousClass24.currentEntityView;
            }
        }) {
            public int lastStickyX;
            public int lastStickyY;
            public long lastUpdate;
            public final Paint linePaint;
            public float stickyXAlpha;
            public float stickyYAlpha;

            {
                Paint paint5 = new Paint();
                this.linePaint = paint5;
                setWillNotDraw(false);
                paint5.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint5.setStyle(Paint.Style.STROKE);
                paint5.setColor(-1);
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (anonymousClass24.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                int stickyX;
                int stickyY;
                float f;
                float f2;
                Canvas canvas2;
                int measuredWidth;
                float measuredWidth2;
                int measuredHeight;
                float measuredHeight2;
                super.onDraw(canvas);
                long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                EntityView entityView = anonymousClass26.currentEntityView;
                if (entityView == null || entityView.hasReleased || !entityView.hasPanned) {
                    stickyX = 0;
                    stickyY = 0;
                } else {
                    stickyX = entityView.getStickyX();
                    stickyY = anonymousClass26.currentEntityView.getStickyY();
                }
                if (stickyX != 0) {
                    this.lastStickyX = stickyX;
                }
                if (stickyY != 0) {
                    this.lastStickyY = stickyY;
                }
                if (stickyX != 0) {
                    float f3 = this.stickyXAlpha;
                    if (f3 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, (jMin / 150.0f) + f3);
                        invalidate();
                    } else if (stickyX == 0) {
                        f = this.stickyXAlpha;
                        if (f != 0.0f) {
                            this.stickyXAlpha = Math.max(0.0f, f - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyX == 0) {
                    f = this.stickyXAlpha;
                    if (f != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f - (jMin / 150.0f));
                        invalidate();
                    }
                }
                if (stickyY != 0) {
                    float f4 = this.stickyYAlpha;
                    if (f4 != 1.0f) {
                        this.stickyYAlpha = Math.min(1.0f, (jMin / 150.0f) + f4);
                        invalidate();
                    } else if (stickyY == 0) {
                        f2 = this.stickyYAlpha;
                        if (f2 != 0.0f) {
                            this.stickyYAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyY == 0) {
                    f2 = this.stickyYAlpha;
                    if (f2 != 0.0f) {
                        this.stickyYAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                float f5 = this.stickyYAlpha;
                Paint paint5 = this.linePaint;
                if (f5 != 0.0f) {
                    paint5.setAlpha((int) (f5 * 255.0f));
                    int i6 = this.lastStickyY;
                    if (i6 == 1) {
                        measuredHeight = AndroidUtilities.dp(64.0f);
                    } else {
                        if (i6 == 2) {
                            measuredHeight2 = getMeasuredHeight() / 2.0f;
                        } else {
                            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                        }
                        float f6 = measuredHeight2;
                        canvas2 = canvas;
                        canvas2.drawLine(0.0f, f6, getMeasuredWidth(), f6, paint5);
                    }
                    measuredHeight2 = measuredHeight;
                    float f7 = measuredHeight2;
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, f7, getMeasuredWidth(), f7, paint5);
                } else {
                    canvas2 = canvas;
                }
                float f8 = this.stickyXAlpha;
                if (f8 != 0.0f) {
                    paint5.setAlpha((int) (f8 * 255.0f));
                    int i7 = this.lastStickyX;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            measuredWidth2 = getMeasuredWidth() / 2.0f;
                        } else {
                            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                        }
                        float f9 = measuredWidth2;
                        canvas2.drawLine(f9, 0.0f, f9, getMeasuredHeight(), paint5);
                    }
                    measuredWidth = AndroidUtilities.dp(8.0f);
                    measuredWidth2 = measuredWidth;
                    float f10 = measuredWidth2;
                    canvas2.drawLine(f10, 0.0f, f10, getMeasuredHeight(), paint5);
                }
            }

            @Override
            public final void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                if (anonymousClass26.w <= 0) {
                    anonymousClass26.w = anonymousClass26.entitiesView.getMeasuredWidth();
                }
                if (anonymousClass26.h <= 0) {
                    anonymousClass26.h = anonymousClass26.entitiesView.getMeasuredHeight();
                }
                anonymousClass26.setupEntities();
            }
        };
        this.entitiesView = r4;
        this.initialEntry = storyEntry;
        this.initialEntities = arrayList;
        if (this.w > 0 && this.h > 0) {
            setupEntities();
        }
        r4.setVisibility(4);
        this.selectionContainerView = new FrameLayout(context) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (anonymousClass24.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        final int i6 = 0;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        PaintView.AnonymousClass3 anonymousClass3 = anonymousClass26.renderView;
                        if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass3.clearShape();
                            anonymousClass26.paintToolsView.setSelectedIndex(1);
                            anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass26.undoStore.undo();
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        UndoStore undoStore2 = anonymousClass27.undoStore;
                        if (undoStore2.canUndo()) {
                            PaintView.AnonymousClass3 anonymousClass4 = anonymousClass27.renderView;
                            if (anonymousClass4 != null && (anonymousClass4.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass4.clearShape();
                                anonymousClass27.paintToolsView.setSelectedIndex(1);
                                anonymousClass27.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            if (anonymousClass4 != null) {
                                anonymousClass4.clearAll();
                            }
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass27.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        StoryRecorder.AnonymousClass24 anonymousClass28 = anonymousClass25;
                        EntityView entityView = anonymousClass28.currentEntityView;
                        if (entityView instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
                        }
                        if (anonymousClass28.emojiViewVisible) {
                            anonymousClass28.hideEmojiPopup$3(false);
                        }
                        anonymousClass28.removeEntity$1(anonymousClass28.currentEntityView);
                        anonymousClass28.selectEntity$1(null, true);
                        break;
                    case 3:
                        anonymousClass25.selectEntity$1(null, true);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass29 = anonymousClass25;
                        if (anonymousClass29.isColorListShown) {
                            anonymousClass29.showColorList$1(false);
                        } else if (anonymousClass29.emojiViewVisible) {
                            anonymousClass29.hideEmojiPopup$3(true);
                        } else if (!anonymousClass29.editingText) {
                            Runnable runnable = anonymousClass29.onCancelButtonClickedListener;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            anonymousClass29.selectEntity$1(null, true);
                        }
                        break;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.zoomOutButton = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        AccountFrozenAlert$$ExternalSyntheticOutline1.m(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, LayoutHelper.createLinear(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(15));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.undoAllButton = textView2;
        textView2.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i7 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        PaintView.AnonymousClass3 anonymousClass3 = anonymousClass26.renderView;
                        if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass3.clearShape();
                            anonymousClass26.paintToolsView.setSelectedIndex(1);
                            anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass26.undoStore.undo();
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        UndoStore undoStore2 = anonymousClass27.undoStore;
                        if (undoStore2.canUndo()) {
                            PaintView.AnonymousClass3 anonymousClass4 = anonymousClass27.renderView;
                            if (anonymousClass4 != null && (anonymousClass4.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass4.clearShape();
                                anonymousClass27.paintToolsView.setSelectedIndex(1);
                                anonymousClass27.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            if (anonymousClass4 != null) {
                                anonymousClass4.clearAll();
                            }
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass27.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        StoryRecorder.AnonymousClass24 anonymousClass28 = anonymousClass25;
                        EntityView entityView = anonymousClass28.currentEntityView;
                        if (entityView instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
                        }
                        if (anonymousClass28.emojiViewVisible) {
                            anonymousClass28.hideEmojiPopup$3(false);
                        }
                        anonymousClass28.removeEntity$1(anonymousClass28.currentEntityView);
                        anonymousClass28.selectEntity$1(null, true);
                        break;
                    case 3:
                        anonymousClass25.selectEntity$1(null, true);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass29 = anonymousClass25;
                        if (anonymousClass29.isColorListShown) {
                            anonymousClass29.showColorList$1(false);
                        } else if (anonymousClass29.emojiViewVisible) {
                            anonymousClass29.hideEmojiPopup$3(true);
                        } else if (!anonymousClass29.editingText) {
                            Runnable runnable = anonymousClass29.onCancelButtonClickedListener;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            anonymousClass29.selectEntity$1(null, true);
                        }
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.cancelTextButton = textView3;
        textView3.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        textView3.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(8.0f, R.string.Clear, textView3), 0, AndroidUtilities.dp(8.0f), 0);
        textView3.setGravity(16);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 16.0f);
        final int i8 = 2;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        PaintView.AnonymousClass3 anonymousClass3 = anonymousClass26.renderView;
                        if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass3.clearShape();
                            anonymousClass26.paintToolsView.setSelectedIndex(1);
                            anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass26.undoStore.undo();
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        UndoStore undoStore2 = anonymousClass27.undoStore;
                        if (undoStore2.canUndo()) {
                            PaintView.AnonymousClass3 anonymousClass4 = anonymousClass27.renderView;
                            if (anonymousClass4 != null && (anonymousClass4.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass4.clearShape();
                                anonymousClass27.paintToolsView.setSelectedIndex(1);
                                anonymousClass27.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            if (anonymousClass4 != null) {
                                anonymousClass4.clearAll();
                            }
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass27.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        StoryRecorder.AnonymousClass24 anonymousClass28 = anonymousClass25;
                        EntityView entityView = anonymousClass28.currentEntityView;
                        if (entityView instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
                        }
                        if (anonymousClass28.emojiViewVisible) {
                            anonymousClass28.hideEmojiPopup$3(false);
                        }
                        anonymousClass28.removeEntity$1(anonymousClass28.currentEntityView);
                        anonymousClass28.selectEntity$1(null, true);
                        break;
                    case 3:
                        anonymousClass25.selectEntity$1(null, true);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass29 = anonymousClass25;
                        if (anonymousClass29.isColorListShown) {
                            anonymousClass29.showColorList$1(false);
                        } else if (anonymousClass29.emojiViewVisible) {
                            anonymousClass29.hideEmojiPopup$3(true);
                        } else if (!anonymousClass29.editingText) {
                            Runnable runnable = anonymousClass29.onCancelButtonClickedListener;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            anonymousClass29.selectEntity$1(null, true);
                        }
                        break;
                }
            }
        });
        textView3.setAlpha(0.0f);
        textView3.setVisibility(8);
        frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.doneTextButton = textView4;
        textView4.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        textView4.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(8.0f, R.string.Done, textView4), 0, AndroidUtilities.dp(8.0f), 0);
        textView4.setGravity(16);
        textView4.setTextColor(-1);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 16.0f);
        final int i9 = 3;
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        PaintView.AnonymousClass3 anonymousClass3 = anonymousClass26.renderView;
                        if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass3.clearShape();
                            anonymousClass26.paintToolsView.setSelectedIndex(1);
                            anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass26.undoStore.undo();
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        UndoStore undoStore2 = anonymousClass27.undoStore;
                        if (undoStore2.canUndo()) {
                            PaintView.AnonymousClass3 anonymousClass4 = anonymousClass27.renderView;
                            if (anonymousClass4 != null && (anonymousClass4.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass4.clearShape();
                                anonymousClass27.paintToolsView.setSelectedIndex(1);
                                anonymousClass27.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            if (anonymousClass4 != null) {
                                anonymousClass4.clearAll();
                            }
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass27.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        StoryRecorder.AnonymousClass24 anonymousClass28 = anonymousClass25;
                        EntityView entityView = anonymousClass28.currentEntityView;
                        if (entityView instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
                        }
                        if (anonymousClass28.emojiViewVisible) {
                            anonymousClass28.hideEmojiPopup$3(false);
                        }
                        anonymousClass28.removeEntity$1(anonymousClass28.currentEntityView);
                        anonymousClass28.selectEntity$1(null, true);
                        break;
                    case 3:
                        anonymousClass25.selectEntity$1(null, true);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass29 = anonymousClass25;
                        if (anonymousClass29.isColorListShown) {
                            anonymousClass29.showColorList$1(false);
                        } else if (anonymousClass29.emojiViewVisible) {
                            anonymousClass29.hideEmojiPopup$3(true);
                        } else if (!anonymousClass29.editingText) {
                            Runnable runnable = anonymousClass29.onCancelButtonClickedListener;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            anonymousClass29.selectEntity$1(null, true);
                        }
                        break;
                }
            }
        });
        textView4.setAlpha(0.0f);
        textView4.setVisibility(8);
        frameLayout.addView(textView4, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(anonymousClass24, context, persistColorPalette);
        this.bottomLayout = anonymousClass9;
        anonymousClass9.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        anonymousClass9.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(anonymousClass9, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, (storyEntry == null || storyEntry.isCollage() || storyEntry.isRepostMessage || blurManager == null) ? false : true);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        paintToolsView.setDelegate(this);
        paintToolsView.setSelectedIndex(1);
        anonymousClass9.addView(paintToolsView, LayoutHelper.createFrame(-1, 48.0f));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        paintTextOptionsView.setVisibility(8);
        paintTextOptionsView.setDelegate(this);
        final int i10 = 1;
        post(new Runnable() {
            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        Swatch swatch2 = anonymousClass26.colorSwatch;
                        anonymousClass26.setCurrentSwatch(null, swatch2, false);
                        PersistColorPalette.getInstance(i).setCurrentWeight(swatch2.brushWeight);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        anonymousClass27.textOptionsView.setTypeface(PersistColorPalette.getInstance(i).currentTypeface);
                        break;
                }
            }
        });
        paintTextOptionsView.setAlignment(PersistColorPalette.getInstance(i).currentAlignment);
        anonymousClass9.addView(paintTextOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        ?? r7 = new FrameLayout(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                anonymousClass26.typefaceMenuOutlinePaint.setAlpha((int) ((1.0f - anonymousClass26.typefaceMenuTransformProgress) * anonymousClass26.textOptionsView.getAlpha() * 20.0f));
                PaintTextOptionsView paintTextOptionsView2 = anonymousClass26.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                float fDp = AndroidUtilities.dp(8.0f) + paintTextOptionsView2.typefaceCell.getLeft();
                PaintTextOptionsView.TypefaceCell typefaceCell = paintTextOptionsView2.typefaceCell;
                rectF.set(fDp, typefaceCell.getTop(), AndroidUtilities.dp(8.0f) + typefaceCell.getRight(), typefaceCell.getBottom());
                float translationY = anonymousClass26.textOptionsView.getTranslationY() + anonymousClass26.bottomLayout.getTranslationY() + anonymousClass26.textOptionsView.getTop() + anonymousClass26.bottomLayout.getTop();
                rectF.set(AndroidUtilities.lerp(rectF.left, anonymousClass26.typefaceListView.getLeft(), anonymousClass26.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + translationY, anonymousClass26.typefaceListView.getTop() - anonymousClass26.typefaceListView.getTranslationY(), anonymousClass26.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, anonymousClass26.typefaceListView.getRight(), anonymousClass26.typefaceMenuTransformProgress), AndroidUtilities.lerp(translationY + rectF.bottom, anonymousClass26.typefaceListView.getBottom() - anonymousClass26.typefaceListView.getTranslationY(), anonymousClass26.typefaceMenuTransformProgress));
                float fDp2 = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, anonymousClass26.typefaceMenuTransformProgress));
                int alpha = anonymousClass26.typefaceMenuBackgroundPaint.getAlpha();
                anonymousClass26.typefaceMenuBackgroundPaint.setAlpha((int) (alpha * anonymousClass26.typefaceMenuTransformProgress));
                canvas.drawRoundRect(rectF, fDp2, fDp2, anonymousClass26.typefaceMenuBackgroundPaint);
                anonymousClass26.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, fDp2, fDp2, anonymousClass26.typefaceMenuOutlinePaint);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                    if (anonymousClass26.isTypefaceMenuShown) {
                        anonymousClass26.showTypefaceMenu$1(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.overlayLayout = r7;
        addView((View) r7, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        paintTypefaceListView.setOnItemClickListener(new PaintView$$ExternalSyntheticLambda18(anonymousClass25, 0));
        paintTextOptionsView.setTypefaceListView(paintTypefaceListView);
        r7.addView(paintTypefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(r2.getColor(Theme.key_actionBarDefaultSubmenuBackground));
        ?? r6 = new PaintColorsListView(context) {
            public final Path path = new Path();

            @Override
            public final void draw(Canvas canvas) {
                StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass24;
                ViewGroup barView = anonymousClass26.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, anonymousClass26.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, anonymousClass26.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), anonymousClass26.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), anonymousClass26.toolsTransformProgress));
                Path path = this.path;
                path.rewind();
                path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.colorsListView = r6;
        r6.setVisibility(8);
        r6.setColorPalette(PersistColorPalette.getInstance(i));
        r6.setColorListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                anonymousClass25.lambda$new$8$1((Integer) obj);
            }
        });
        anonymousClass9.addView((View) r6, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        paintCancelView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        anonymousClass9.addView(paintCancelView, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        final int i11 = 4;
        paintCancelView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        PaintView.AnonymousClass3 anonymousClass3 = anonymousClass26.renderView;
                        if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass3.clearShape();
                            anonymousClass26.paintToolsView.setSelectedIndex(1);
                            anonymousClass26.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass26.undoStore.undo();
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        UndoStore undoStore2 = anonymousClass27.undoStore;
                        if (undoStore2.canUndo()) {
                            PaintView.AnonymousClass3 anonymousClass4 = anonymousClass27.renderView;
                            if (anonymousClass4 != null && (anonymousClass4.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass4.clearShape();
                                anonymousClass27.paintToolsView.setSelectedIndex(1);
                                anonymousClass27.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            if (anonymousClass4 != null) {
                                anonymousClass4.clearAll();
                            }
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass27.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        StoryRecorder.AnonymousClass24 anonymousClass28 = anonymousClass25;
                        EntityView entityView = anonymousClass28.currentEntityView;
                        if (entityView instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
                        }
                        if (anonymousClass28.emojiViewVisible) {
                            anonymousClass28.hideEmojiPopup$3(false);
                        }
                        anonymousClass28.removeEntity$1(anonymousClass28.currentEntityView);
                        anonymousClass28.selectEntity$1(null, true);
                        break;
                    case 3:
                        anonymousClass25.selectEntity$1(null, true);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass29 = anonymousClass25;
                        if (anonymousClass29.isColorListShown) {
                            anonymousClass29.showColorList$1(false);
                        } else if (anonymousClass29.emojiViewVisible) {
                            anonymousClass29.hideEmojiPopup$3(true);
                        } else if (!anonymousClass29.editingText) {
                            Runnable runnable = anonymousClass29.onCancelButtonClickedListener;
                            if (runnable != null) {
                                runnable.run();
                            }
                        } else {
                            anonymousClass29.selectEntity$1(null, true);
                        }
                        break;
                }
            }
        });
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        paintDoneView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        paintDoneView.setOnClickListener(new PaintView$$ExternalSyntheticLambda9(anonymousClass25, context, persistColorPalette, 0));
        anonymousClass9.addView(paintDoneView, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(swatch);
        paintWeightChooserView.setRenderView(r3);
        paintWeightChooserView.setValueOverride(anonymousClass1);
        swatch.brushWeight = anonymousClass1.get();
        final int i12 = 0;
        paintWeightChooserView.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        StoryRecorder.AnonymousClass24 anonymousClass26 = anonymousClass25;
                        Swatch swatch2 = anonymousClass26.colorSwatch;
                        anonymousClass26.setCurrentSwatch(null, swatch2, false);
                        PersistColorPalette.getInstance(i).setCurrentWeight(swatch2.brushWeight);
                        break;
                    default:
                        StoryRecorder.AnonymousClass24 anonymousClass27 = anonymousClass25;
                        anonymousClass27.textOptionsView.setTypeface(PersistColorPalette.getInstance(i).currentTypeface);
                        break;
                }
            }
        });
        addView(paintWeightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(null, swatch, false);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        paint4.setColor(-15132391);
        if (Build.VERSION.SDK_INT >= 29) {
            i5 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        } else {
            i5 = 1;
        }
        this.keyboardNotifier = new AnonymousClass13(anonymousClass24, windowView, new GiftSheet$$ExternalSyntheticLambda4(17, anonymousClass25, windowView));
        EmojiBottomSheet.savedPosition = i5;
    }

    public ViewGroup getBarView() {
        return this.tabsSelectedIndex == 2 ? this.textOptionsView : this.paintToolsView;
    }

    private int getFrameRotation() {
        int i = this.originalBitmapRotation;
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }

    private Size getPaintingSize() {
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Size size2 = new Size(1080.0f, 1920.0f);
        this.paintingSize = size2;
        return size2;
    }

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    private void setCoverPause(boolean z) {
        int i = 0;
        while (true) {
            AnonymousClass7 anonymousClass7 = this.entitiesView;
            if (i >= anonymousClass7.getChildCount()) {
                return;
            }
            View childAt = anonymousClass7.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                AnimatedFileDrawable animation = imageReceiver.getAnimation();
                boolean z2 = !z;
                imageReceiver.setAllowStartLottieAnimation(z2);
                imageReceiver.setAllowStartAnimation(z2);
                if (lottieAnimation != null) {
                    if (z) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.setAllowDecodeSingleFrame(z);
                    if (z) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
            i++;
        }
    }

    public void setNewColor(int i) {
        Swatch swatch = this.colorSwatch;
        int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(null, swatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, i2, i, 3));
        duration.start();
    }

    public static void setTextAlignment$1(TextPaintView textPaintView, int i) {
        int i2;
        textPaintView.setAlign(i);
        int i3 = 2;
        if (i != 1) {
            i2 = i != 2 ? 19 : 21;
        } else {
            i2 = 17;
        }
        textPaintView.getEditText().setGravity(i2);
        if (i == 1) {
            i3 = 4;
        } else if (i == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i3 = 3;
        }
        textPaintView.getEditText().setTextAlignment(i3);
    }

    private void setTextType(int i) {
        this.selectedTextType = i;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setType(i);
        }
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
        persistColorPalette.currentTextType = i;
        persistColorPalette.mConfig.edit().putInt("text_type", i).apply();
        this.textOptionsView.setOutlineType(i, true);
    }

    private void setupTabsLayout(Context context) {
        FloatingToolbar.AnonymousClass2 anonymousClass2 = new FloatingToolbar.AnonymousClass2(this, context);
        this.tabsLayout = anonymousClass2;
        anonymousClass2.setClipToPadding(false);
        this.tabsLayout.setOrientation(0);
        this.bottomLayout.addView(this.tabsLayout, LayoutHelper.createFrame(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.drawTab = textView;
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.PhotoEditorDraw, textView);
        TextView textView2 = this.drawTab;
        int i = Theme.key_listSelector;
        AnonymousClass2 anonymousClass3 = this.resourcesProvider;
        textView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, anonymousClass3), 7, -1));
        this.drawTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.drawTab.setTextColor(-1);
        this.drawTab.setTextSize(1, 14.0f);
        this.drawTab.setGravity(1);
        this.drawTab.setTypeface(AndroidUtilities.bold());
        this.drawTab.setSingleLine();
        final int i2 = 0;
        this.drawTab.setOnClickListener(new View.OnClickListener(this) {
            public final PaintView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        PaintView paintView = this.f$0;
                        if (!paintView.editingText) {
                            paintView.switchTab$1(0);
                        } else {
                            paintView.selectEntity$1(null, true);
                        }
                        break;
                    case 1:
                        this.f$0.openStickersView$1();
                        break;
                    default:
                        PaintView paintView2 = this.f$0;
                        paintView2.switchTab$1(2);
                        if (!(paintView2.currentEntityView instanceof TextPaintView)) {
                            paintView2.forceChanges = true;
                            paintView2.createText$1(true);
                        }
                        break;
                }
            }
        });
        this.tabsLayout.addView(this.drawTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        this.stickerTab = textView3;
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.PhotoEditorSticker, textView3);
        this.stickerTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, anonymousClass3), 7, -1));
        this.stickerTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        final int i3 = 1;
        this.stickerTab.setOnClickListener(new View.OnClickListener(this) {
            public final PaintView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        PaintView paintView = this.f$0;
                        if (!paintView.editingText) {
                            paintView.switchTab$1(0);
                        } else {
                            paintView.selectEntity$1(null, true);
                        }
                        break;
                    case 1:
                        this.f$0.openStickersView$1();
                        break;
                    default:
                        PaintView paintView2 = this.f$0;
                        paintView2.switchTab$1(2);
                        if (!(paintView2.currentEntityView instanceof TextPaintView)) {
                            paintView2.forceChanges = true;
                            paintView2.createText$1(true);
                        }
                        break;
                }
            }
        });
        this.stickerTab.setTextColor(-1);
        this.stickerTab.setTextSize(1, 14.0f);
        this.stickerTab.setGravity(1);
        this.stickerTab.setTypeface(AndroidUtilities.bold());
        this.stickerTab.setAlpha(0.6f);
        this.stickerTab.setSingleLine();
        this.tabsLayout.addView(this.stickerTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView4 = new TextView(context);
        this.textTab = textView4;
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.PhotoEditorText, textView4);
        this.textTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, anonymousClass3), 7, -1));
        this.textTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.textTab.setTextColor(-1);
        this.textTab.setTextSize(1, 14.0f);
        this.textTab.setGravity(1);
        this.textTab.setTypeface(AndroidUtilities.bold());
        this.textTab.setAlpha(0.6f);
        this.textTab.setSingleLine();
        final int i4 = 2;
        this.textTab.setOnClickListener(new View.OnClickListener(this) {
            public final PaintView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        PaintView paintView = this.f$0;
                        if (!paintView.editingText) {
                            paintView.switchTab$1(0);
                        } else {
                            paintView.selectEntity$1(null, true);
                        }
                        break;
                    case 1:
                        this.f$0.openStickersView$1();
                        break;
                    default:
                        PaintView paintView2 = this.f$0;
                        paintView2.switchTab$1(2);
                        if (!(paintView2.currentEntityView instanceof TextPaintView)) {
                            paintView2.forceChanges = true;
                            paintView2.createText$1(true);
                        }
                        break;
                }
            }
        });
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(0, -2, 1.0f));
    }

    @Override
    public final float adjustPanLayoutHelperProgress() {
        return 0.0f;
    }

    @Override
    public final boolean allowInteraction(EntityView entityView) {
        return !this.editingText;
    }

    public final void appearAnimation(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new StoryViewer$5$$ExternalSyntheticLambda0(21, this, view)).start();
    }

    public final PointF centerPositionForEntity$1() {
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        int measuredWidth = anonymousClass7.getMeasuredWidth();
        int measuredHeight = anonymousClass7.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.h;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void checkEntitiesIsVideo() {
        boolean z = this.isVideo;
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        boolean z2 = true;
        if (!z && !this.hasAudio) {
            int i = 0;
            loop0: while (true) {
                if (i >= anonymousClass7.getChildCount()) {
                    z2 = false;
                    break;
                }
                View childAt = anonymousClass7.getChildAt(i);
                boolean z3 = childAt instanceof TextPaintView;
                int i2 = this.currentAccount;
                if (z3) {
                    CharSequence text = ((TextPaintView) childAt).getText();
                    if (text instanceof Spanned) {
                        for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                            TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                            if (documentFindDocument == null) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(i2, animatedEmojiSpan.getDocumentId());
                            }
                            if (documentFindDocument != null) {
                                AnimatedEmojiDrawable.getDocumentFetcher(i2).putDocument(documentFindDocument);
                            }
                            if (StoryEntry.isAnimated(documentFindDocument, FileLoader.getInstance(i2).getPathToAttach(documentFindDocument, true).getAbsolutePath())) {
                                break loop0;
                            }
                        }
                    } else {
                        continue;
                    }
                    i++;
                } else if (childAt instanceof StickerView) {
                    TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                    if (StoryEntry.isAnimated(sticker, FileLoader.getInstance(i2).getPathToAttach(sticker, true).getAbsolutePath())) {
                        break;
                    } else {
                        i++;
                    }
                } else if (childAt instanceof RoundView) {
                    break;
                } else {
                    i++;
                }
            }
        }
        for (int i3 = 0; i3 < anonymousClass7.getChildCount(); i3++) {
            View childAt2 = anonymousClass7.getChildAt(i3);
            if (childAt2 instanceof EntityView) {
                ((EntityView) childAt2).setIsVideo(z2);
            }
        }
    }

    public final TextView createActionLayoutButton(int i, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    public final LinkView createLinkSticker(LinkPreview.WebPagePreview webPagePreview) {
        int i;
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity$1 = startPositionRelativeToEntity$1(null);
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        float measuredWidth = anonymousClass7.getMeasuredWidth() <= 0 ? this.w : anonymousClass7.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LinkView linkView = new LinkView(getContext(), pointFStartPositionRelativeToEntity$1, this.currentAccount, webPagePreview, measuredWidth / 360.0f, iDp);
        if (pointFStartPositionRelativeToEntity$1.x == anonymousClass7.getMeasuredWidth() / 2.0f) {
            linkView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity$1.y == anonymousClass7.getMeasuredHeight() / 2.0f) {
            linkView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            linkView.setColor(i);
        }
        linkView.setDelegate(this);
        linkView.setMaxWidth(iDp);
        anonymousClass7.addView(linkView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            linkView.scale(1.0f / cropState.cropScale);
            linkView.rotate(-(cropState.transformRotation + cropState.cropRotate));
        }
        return linkView;
    }

    public final LocationView createLocationSticker(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int i;
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity$1 = startPositionRelativeToEntity$1(null);
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        float measuredWidth = anonymousClass7.getMeasuredWidth() <= 0 ? this.w : anonymousClass7.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LocationView locationView = new LocationView(getContext(), pointFStartPositionRelativeToEntity$1, this.currentAccount, messageMedia, mediaArea, measuredWidth / 240.0f, iDp);
        if (pointFStartPositionRelativeToEntity$1.x == anonymousClass7.getMeasuredWidth() / 2.0f) {
            locationView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity$1.y == anonymousClass7.getMeasuredHeight() / 2.0f) {
            locationView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            locationView.setColor(i);
        }
        locationView.setDelegate(this);
        locationView.setMaxWidth(iDp);
        anonymousClass7.addView(locationView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            locationView.scale(1.0f / cropState.cropScale);
            locationView.rotate(-(cropState.transformRotation + cropState.cropRotate));
        }
        return locationView;
    }

    public final PhotoView createPhoto(String str, boolean z) {
        float f;
        Size size;
        this.forceChanges = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f = 1.0f;
        }
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        if (f > 1.0f) {
            float fFloor = (float) Math.floor(((double) Math.max(this.w, anonymousClass7.getMeasuredWidth())) * 0.5d);
            size = new Size(fFloor, fFloor / f);
        } else {
            float fFloor2 = (float) Math.floor(((double) Math.max(this.h, anonymousClass7.getMeasuredHeight())) * 0.5d);
            size = new Size(f * fFloor2, fFloor2);
        }
        Size size2 = size;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f2 = size2.width;
            size2.width = size2.height;
            size2.height = f2;
        }
        Context context = getContext();
        PointF pointFCenterPositionForEntity$1 = centerPositionForEntity$1();
        int iIntValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        PhotoView photoView = new PhotoView(context, pointFCenterPositionForEntity$1, size2, str, iIntValue);
        photoView.setDelegate(this);
        anonymousClass7.addView(photoView);
        checkEntitiesIsVideo();
        return photoView;
    }

    public final ReactionWidgetEntityView createReactionWidget(boolean z) {
        Size size = new Size(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF pointFCenterPositionForEntity$1 = centerPositionForEntity$1();
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        if (anonymousClass7.getMeasuredHeight() > 0) {
            loop0: while (true) {
                int i = 0;
                while (true) {
                    if (i >= anonymousClass7.getChildCount()) {
                        break loop0;
                    }
                    View childAt = anonymousClass7.getChildAt(i);
                    if (MathUtils.distance(pointFCenterPositionForEntity$1.x, pointFCenterPositionForEntity$1.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                    i++;
                }
                pointFCenterPositionForEntity$1.x = (anonymousClass7.getMeasuredWidth() * 0.05f) + pointFCenterPositionForEntity$1.x;
                pointFCenterPositionForEntity$1.y = (anonymousClass7.getMeasuredHeight() * 0.05f) + pointFCenterPositionForEntity$1.y;
                pointFCenterPositionForEntity$1.x = Utilities.clamp(pointFCenterPositionForEntity$1.x, anonymousClass7.getMeasuredWidth(), 0.0f);
                pointFCenterPositionForEntity$1.y = Utilities.clamp(pointFCenterPositionForEntity$1.y, anonymousClass7.getMeasuredHeight(), 0.0f);
            }
        }
        ReactionWidgetEntityView reactionWidgetEntityView = new ReactionWidgetEntityView(getContext(), pointFCenterPositionForEntity$1, size);
        reactionWidgetEntityView.setDelegate(this);
        anonymousClass7.addView(reactionWidgetEntityView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo$1(reactionWidgetEntityView);
            selectEntity$1(reactionWidgetEntityView, true);
        }
        return reactionWidgetEntityView;
    }

    public final RoundView createRound(String str, boolean z) {
        this.forceChanges = true;
        this.creatingNewRound = true;
        deleteRound();
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        int measuredWidth = anonymousClass7.getMeasuredWidth();
        anonymousClass7.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        float f = measuredWidth;
        float fFloor = (float) Math.floor(0.43f * f);
        Size size = new Size(fFloor, fFloor);
        RoundView roundView = new RoundView(getContext(), new PointF((f - (size.width / 2.0f)) - AndroidUtilities.dp(16.0f), (size.height / 2.0f) + AndroidUtilities.dp(72.0f)), size, str);
        roundView.setDelegate(this);
        anonymousClass7.addView(roundView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo$1(roundView);
            post(new PaintView$$ExternalSyntheticLambda1(this, roundView, 0));
        }
        this.creatingNewRound = false;
        return roundView;
    }

    public final AnonymousClass27 createSticker$1(Object obj, TLRPC.Document document) {
        float f;
        float f2;
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
        }
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            float f3 = -(cropState.transformRotation + cropState.cropRotate);
            f2 = 0.75f / cropState.cropScale;
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.75f;
        }
        PointF pointFCenterPositionForEntity$1 = centerPositionForEntity$1();
        Context context = getContext();
        float fFloor = (float) Math.floor(((double) getPaintingSize().width) * 0.5d);
        ?? r3 = new StickerView(context, pointFCenterPositionForEntity$1, f, f2, new Size(fFloor, fFloor), document, obj) {
            @Override
            public final void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                PaintView.this.getClass();
            }
        };
        boolean zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ImageReceiver imageReceiver = r3.centerImage;
        if (zIsTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        r3.setDelegate(this);
        addView(r3);
        checkEntitiesIsVideo();
        return r3;
    }

    public final TextPaintView createText$1(boolean z) {
        Size paintingSize = getPaintingSize();
        PointF pointFStartPositionRelativeToEntity$1 = startPositionRelativeToEntity$1(null);
        TextPaintView textPaintView = new TextPaintView(getContext(), pointFStartPositionRelativeToEntity$1, (int) (paintingSize.width / 9.0f), "", this.colorSwatch, this.selectedTextType);
        float f = paintingSize.width / 9.0f;
        PaintView$$ExternalSyntheticLambda3 paintView$$ExternalSyntheticLambda3 = new PaintView$$ExternalSyntheticLambda3(this, 2);
        textPaintView.minFontSize = (int) (0.5f * f);
        textPaintView.maxFontSize = (int) (f * 2.0f);
        textPaintView.onFontChange = paintView$$ExternalSyntheticLambda3;
        float f2 = pointFStartPositionRelativeToEntity$1.x;
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        if (f2 == anonymousClass7.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity$1.y == anonymousClass7.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
        int i = this.currentAccount;
        textPaintView.setTypeface(PersistColorPalette.getInstance(i).currentTypeface);
        textPaintView.setType(PersistColorPalette.getInstance(i).currentTextType);
        anonymousClass7.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            textPaintView.rotate(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo$1(textPaintView);
            textPaintView.beginEditing();
            selectEntity$1(textPaintView, false);
            textPaintView.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(textPaintView.getFocusedView());
            this.editingText = true;
            int i2 = PersistColorPalette.getInstance(i).currentAlignment;
            PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
            paintTextOptionsView.setAlignment(i2, true);
            paintTextOptionsView.setOutlineType(PersistColorPalette.getInstance(i).currentTextType);
        }
        return textPaintView;
    }

    public final WeatherView createWeatherView(Weather.State state) {
        int i;
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity$1 = startPositionRelativeToEntity$1(null);
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        float measuredWidth = anonymousClass7.getMeasuredWidth() <= 0 ? this.w : anonymousClass7.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        WeatherView weatherView = new WeatherView(getContext(), pointFStartPositionRelativeToEntity$1, this.currentAccount, state, measuredWidth / 240.0f, iDp);
        if (pointFStartPositionRelativeToEntity$1.x == anonymousClass7.getMeasuredWidth() / 2.0f) {
            weatherView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity$1.y == anonymousClass7.getMeasuredHeight() / 2.0f) {
            weatherView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            weatherView.setColor(i);
        }
        weatherView.setDelegate(this);
        weatherView.setMaxWidth(iDp);
        anonymousClass7.addView(weatherView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            weatherView.scale(1.0f / cropState.cropScale);
            weatherView.rotate(-(cropState.transformRotation + cropState.cropRotate));
        }
        return weatherView;
    }

    public final void deleteRound() {
        int i = 0;
        while (true) {
            AnonymousClass7 anonymousClass7 = this.entitiesView;
            if (i >= anonymousClass7.getChildCount()) {
                return;
            }
            View childAt = anonymousClass7.getChildAt(i);
            if (childAt instanceof RoundView) {
                if (this.currentEntityView == childAt) {
                    selectEntity$1(null, true);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new PaintView$$ExternalSyntheticLambda1(this, (RoundView) childAt, 1)).start();
            }
            i++;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        MediaController.CropState cropState;
        int i = 0;
        if ((view == this.renderView || view == this.renderInputView || view == this.entitiesView || view == this.selectionContainerView) && (cropState = this.currentCropState) != null) {
            canvas.save();
            i = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = cropState.transformRotation;
            if (i2 != 90 && i2 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + 0.0f;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public abstract void editSelectedTextEntity$1();

    public final MessageEntityView findMessageView() {
        int i = 0;
        while (true) {
            AnonymousClass7 anonymousClass7 = this.entitiesView;
            if (i >= anonymousClass7.getChildCount()) {
                return null;
            }
            View childAt = anonymousClass7.getChildAt(i);
            if (childAt instanceof MessageEntityView) {
                return (MessageEntityView) childAt;
            }
            i++;
        }
    }

    @Override
    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final Bitmap getBitmap(ArrayList arrayList, Bitmap[] bitmapArr) {
        float f = this.paintingSize.width;
        return getBitmap(arrayList, true, true, false, false, null);
    }

    public Bitmap getBlurBitmap() {
        return getResultBitmap(true, false);
    }

    public View getBottomLayout() {
        return this.bottomLayout;
    }

    @Override
    public View getCancelView() {
        return this.cancelButton;
    }

    @Override
    public final int[] getCenterLocation(EntityView entityView) {
        int i = (int) entityView.getPosition().x;
        int[] iArr = this.pos;
        iArr[0] = i;
        iArr[1] = (int) entityView.getPosition().y;
        return iArr;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    @Override
    public View getDoneView() {
        return this.doneButton;
    }

    @Override
    public final int getEmojiPadding(boolean z) {
        return this.emojiPadding;
    }

    public View getEntitiesView() {
        return this.entitiesView;
    }

    @Override
    public long getLcm() {
        return this.lcm.longValue();
    }

    @Override
    public List<TLRPC.InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        int childCount = anonymousClass7.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = anonymousClass7.getChildAt(i);
            if (childAt instanceof StickerView) {
                TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if ((text instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) != null) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                        if (animatedEmojiSpan != null) {
                            TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                            if (documentFindDocument == null) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                            }
                            if (documentFindDocument != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = documentFindDocument.id;
                                tL_inputDocument2.access_hash = documentFindDocument.access_hash;
                                byte[] bArr2 = documentFindDocument.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override
    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.renderView, this.renderInputView, this.entitiesView, this.selectionContainerView);
    }

    public View getRenderInputView() {
        return this.renderInputView;
    }

    @Override
    public RenderView getRenderView() {
        return this.renderView;
    }

    public EntityView getSelectedEntity() {
        return this.currentEntityView;
    }

    public View getSelectionEntitiesView() {
        return this.selectionContainerView;
    }

    public View getTextDimView() {
        return this.textDim;
    }

    public View getTopLayout() {
        return this.topLayout;
    }

    @Override
    public final void getTransformedTouch(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = ((x - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = ((y - view2.getPivotY()) / view2.getScaleY()) + view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    @Override
    public final View getView() {
        return IPhotoPaintView.CC.$default$getView(this);
    }

    public View getWeightChooserView() {
        return this.weightChooserView;
    }

    @Override
    public final boolean hasChanges() {
        return this.undoStore.canUndo() || this.forceChanges;
    }

    public final void hideEmojiPopup$3(boolean z) {
        int i = 2;
        int i2 = 1;
        if (this.emojiViewVisible) {
            showEmojiPopup$1(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView == null || emojiView.getVisibility() != 0) {
                hideEmojiView$2();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
            valueAnimatorOfFloat.addUpdateListener(new PaintView$$ExternalSyntheticLambda24(this, i2));
            this.isAnimatePopupClosing = true;
            valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public final void hideEmojiView$2() {
        EmojiView emojiView;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        int i = this.emojiPadding;
        this.emojiPadding = 0;
        if (i != 0) {
            this.keyboardNotifier.fire();
        }
    }

    @Override
    public final void init() {
        setVisibility(0);
        setVisibility(0);
        setVisibility(0);
    }

    @Override
    public final boolean isEntityDeletable() {
        return !(this.currentEntityView instanceof MessageEntityView);
    }

    public final void lambda$new$10(PersistColorPalette persistColorPalette, Integer num) {
        persistColorPalette.selectColor(num.intValue(), true);
        persistColorPalette.saveColors();
        setNewColor(num.intValue());
        setSelectedColorIndex(persistColorPalette.getCurrentColorPosition());
        this.colorPickerBottomSheet = null;
    }

    public final void lambda$new$8$1(Integer num) {
        setNewColor(num.intValue());
        showColorList$1(false);
    }

    @Override
    public final void maybeShowDismissalAlert(PhotoViewer photoViewer, Activity activity, Runnable runnable) {
        if (this.isColorListShown) {
            showColorList$1(false);
            return;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup$3(true);
            return;
        }
        if (this.editingText) {
            selectEntity$1(null, true);
            return;
        }
        if (!hasChanges()) {
            runnable.run();
            return;
        }
        if (activity == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, this.resourcesProvider);
        builder.setMessage(LocaleController.getString("PhotoEditorDiscardAlert", R.string.PhotoEditorDiscardAlert));
        builder.setTitle(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
        builder.setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new Weather$$ExternalSyntheticLambda7(runnable, 5));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.showAlertDialog(builder);
    }

    @Override
    public final int measureKeyboardHeight() {
        return this.keyboardNotifier.keyboardHeight - this.parent.getBottomPadding2();
    }

    @Override
    public final void onAddButtonPressed(View view) {
        showPopup(new PaintView$$ExternalSyntheticLambda3(this, 1), this, 53, 0, getHeight(), false);
    }

    @Override
    public final void onAnimationStateChanged(boolean z) {
        this.weightChooserView.setLayerType(z ? 2 : 0, null);
    }

    @Override
    public final boolean onBackPressed() {
        if (this.reactionLayoutShowing) {
            if (this.reactionLayout.getReactionsWindow() == null || this.reactionLayout.getReactionsWindow().dismissed) {
                showReactionsLayout(false);
                return true;
            }
            this.reactionLayout.dismissWindow();
            return true;
        }
        if (this.isColorListShown) {
            showColorList$1(false);
            return true;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup$3(true);
            return true;
        }
        if (!this.editingText) {
            return false;
        }
        if (!this.enteredThroughText) {
            selectEntity$1(null, true);
            return true;
        }
        this.enteredThroughText = false;
        this.keyboardNotifier.ignore(true);
        return false;
    }

    @Override
    public final void onBrushSelected(Brush brush) {
        boolean z = brush instanceof Brush.Blurer;
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        if (z || (brush instanceof Brush.Eraser)) {
            paintWeightChooserView.min = 0.4f;
            paintWeightChooserView.max = 1.75f;
            paintWeightChooserView.invalidate();
        } else {
            paintWeightChooserView.min = 0.05f;
            paintWeightChooserView.max = 1.0f;
            paintWeightChooserView.invalidate();
        }
        paintWeightChooserView.setDrawCenter(!(brush instanceof Brush.Shape));
        AnonymousClass3 anonymousClass3 = this.renderView;
        if (anonymousClass3.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        anonymousClass3.setBrush(brush);
        Swatch swatch = this.colorSwatch;
        int i = swatch.color;
        swatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        swatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(Integer.valueOf(i), swatch, false);
        invalidate();
    }

    @Override
    public final void onCleanupEntities() {
        removeAllViews();
    }

    @Override
    public final void onColorPickerSelected() {
        showColorList$1(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        ReactionsContainerLayout reactionsContainerLayout = this.reactionLayout;
        if (reactionsContainerLayout != null) {
            AndroidUtilities.removeFromParent(reactionsContainerLayout);
            this.reactionLayout = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onEntityLongClicked(EntityView entityView) {
        showReactionsLayout(false);
        showMenuForEntity$1(entityView);
        return true;
    }

    @Override
    public final boolean onEntitySelected(EntityView entityView) {
        return selectEntity$1(entityView, true);
    }

    @Override
    public final PersistColorPalette onGetPalette() {
        return PersistColorPalette.getInstance(this.currentAccount);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float width;
        EntityView.SelectionView selectionView;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            width = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            width = size;
        }
        float f = currentActionBarHeight2;
        if (((float) Math.floor((size * currentActionBarHeight) / width)) > f) {
            Math.floor((f * width) / currentActionBarHeight);
        }
        float f2 = this.paintingSize.width;
        EntityView entityView = this.currentEntityView;
        if (entityView != null && (selectionView = entityView.selectionView) != null) {
            selectionView.updatePosition();
        }
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.emojiPadding - this.parent.getPaddingUnderContainer(), measureKeyboardHeight()), 1073741824));
        FrameLayout frameLayout = this.topLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.ignoreLayout = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
            this.ignoreLayout = true;
            hideEmojiView$2();
            this.ignoreLayout = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        hideEmojiView$2();
    }

    @Override
    public final void onNewTextSelected() {
        if (!this.keyboardVisible && !this.emojiViewVisible) {
            this.forceChanges = true;
            createText$1(true);
            return;
        }
        if (this.emojiViewVisible) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                this.keyboardNotifier.awaitingKeyboard = true;
                AndroidUtilities.showKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
        showEmojiPopup$1(!this.emojiViewVisible ? 1 : 0);
    }

    public abstract void onOpenCloseStickersAlert(boolean z);

    @Override
    public final void onResume() {
        RenderView.CanvasInternal canvasInternal = this.renderView.internal;
        if (canvasInternal == null) {
            return;
        }
        canvasInternal.postRunnable(canvasInternal.drawRunnable);
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        boolean z3 = this.emojiViewVisible;
        AnonymousClass13 anonymousClass13 = this.keyboardNotifier;
        if (z3) {
            int paddingUnderContainer = this.parent.getPaddingUnderContainer() + (z ? this.keyboardHeightLand : this.keyboardHeight);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = AndroidUtilities.displaySize.x;
            if (i2 != i3 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i3;
                layoutParams.height = paddingUnderContainer;
                this.emojiView.setLayoutParams(layoutParams);
                this.emojiPadding = layoutParams.height;
                anonymousClass13.fire();
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z4 = this.keyboardVisible;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            this.keyboardVisible = ((TextPaintView) entityView).getEditText().isFocused() && anonymousClass13.keyboardVisible();
        } else {
            this.keyboardVisible = false;
        }
        if (this.keyboardVisible && this.emojiViewVisible) {
            showEmojiPopup$1(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z4 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            anonymousClass13.fire();
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
        }
        updateTextDim();
        if (z4 && !this.keyboardVisible && this.emojiPadding > 0 && this.translateBottomPanelAfterResize) {
            this.translateBottomPanelAfterResize = false;
        }
        updatePlusEmojiKeyboardButton$1();
    }

    @Override
    public final void onTextAlignmentSelected(int i) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            setTextAlignment$1((TextPaintView) entityView, i);
            PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            persistColorPalette.currentAlignment = i;
            persistColorPalette.mConfig.edit().putInt("text_alignment", i).apply();
        }
    }

    @Override
    public final void onTextOutlineSelected(View view) {
        setTextType((this.selectedTextType + 1) % 4);
    }

    @Override
    public final boolean onTouch(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        if (this.currentEntityView != null) {
            selectEntity$1(null, true);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(x, y);
        onTouch(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override
    public final void onTypefaceButtonClicked() {
        showTypefaceMenu$1(true);
    }

    public final void openStickersView$1() {
        final int i = this.tabsSelectedIndex;
        switchTab$1(1);
        int i2 = 0;
        postDelayed(new PaintView$$ExternalSyntheticLambda3(this, i2), 350L);
        final ?? r2 = new EmojiBottomSheet(getContext(), this.resourcesProvider) {
            @Override
            public final boolean canClickWidget(Integer num) {
                if (num.intValue() == 3) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        PaintView paintView = PaintView.this;
                        if (i3 >= paintView.entitiesView.getChildCount()) {
                            break;
                        }
                        if (paintView.entitiesView.getChildAt(i3) instanceof ReactionWidgetEntityView) {
                            i4++;
                        }
                        i3++;
                    }
                    if (i4 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                        String pluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(pluralString, Theme.key_chat_messageLinkIn, 0, new PreviewView$$ExternalSyntheticLambda12(this, 6), this.resourcesProvider)).show(true);
                        return false;
                    }
                    if (i4 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0])).show(true);
                        return false;
                    }
                }
                return true;
            }

            @Override
            public final boolean canShowWidget(Integer num) {
                PaintView paintView = PaintView.this;
                boolean z = false;
                if (paintView.isBot) {
                    if (num.intValue() != 2) {
                        return false;
                    }
                } else if (num.intValue() == 5) {
                    int i3 = 0;
                    while (true) {
                        AnonymousClass7 anonymousClass7 = paintView.entitiesView;
                        if (i3 >= anonymousClass7.getChildCount()) {
                            break;
                        }
                        if (anonymousClass7.getChildAt(i3) instanceof WeatherView) {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    return !z;
                }
                return true;
            }

            @Override
            public final boolean checkAudioPermission(Runnable runnable) {
                StoryRecorder storyRecorder = StoryRecorder.this;
                Activity activity = storyRecorder.activity;
                if (activity == null) {
                    return true;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                        return true;
                    }
                    activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    storyRecorder.audioGrantedCallback = (Theme$$ExternalSyntheticLambda19) runnable;
                    return false;
                }
                if (i3 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    return true;
                }
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                storyRecorder.audioGrantedCallback = (Theme$$ExternalSyntheticLambda19) runnable;
                return false;
            }

            @Override
            public final void onDismissAnimationStart() {
                super.onDismissAnimationStart();
                PaintView.this.switchTab$1(i);
            }
        };
        this.emojiPopup = r2;
        StoryRecorder.WindowView windowView = this.parent;
        Objects.requireNonNull(windowView);
        r2.drawBlurBitmap = new PaintView$$ExternalSyntheticLambda4(windowView, i2);
        final boolean[] zArr = {true};
        r2.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView paintView = this.f$0;
                paintView.emojiPopup = null;
                if (zArr[0]) {
                    paintView.onOpenCloseStickersAlert(false);
                }
                paintView.switchTab$1(i);
            }
        });
        r2.onDocumentSelected = new PaintView$$ExternalSyntheticLambda6(this);
        r2.onWidgetSelected = new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                Integer num = (Integer) obj;
                PaintView paintView = this.f$0;
                paintView.getClass();
                int iIntValue = num.intValue();
                boolean[] zArr2 = zArr;
                if (iIntValue == 0) {
                    zArr2[0] = false;
                    paintView.showLocationAlert(null, new PaintView$$ExternalSyntheticLambda4(paintView, 5));
                    return Boolean.TRUE;
                }
                int iIntValue2 = num.intValue();
                PaintView.AnonymousClass22 anonymousClass22 = r2;
                if (iIntValue2 == 5) {
                    zArr2[0] = false;
                    Weather.fetch(true, new GiftSheet$$ExternalSyntheticLambda4(18, paintView, anonymousClass22));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    anonymousClass22.lambda$showGiftOfferSheet$15();
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.captionEdit.keyboardNotifier.ignore(true);
                    storyRecorder.destroyGalleryListView();
                    storyRecorder.createGalleryListView(true);
                    storyRecorder.animateGalleryListView(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr2[0] = false;
                    SelectAudioAlert selectAudioAlert = new SelectAudioAlert(paintView.getContext(), false, null, new HintView2$$ExternalSyntheticLambda0(paintView, 6), new DarkThemeResourceProvider());
                    selectAudioAlert.setOnDismissListener(new PaintView$$ExternalSyntheticLambda3(paintView, 4));
                    selectAudioAlert.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    paintView.forceChanges = true;
                    paintView.appearAnimation(paintView.createReactionWidget(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                boolean zIsPremium = UserConfig.getInstance(paintView.currentAccount).isPremium();
                PaintView.AnonymousClass2 anonymousClass2 = paintView.resourcesProvider;
                if (!zIsPremium) {
                    try {
                        anonymousClass22.container.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    BulletinFactory.of(anonymousClass22.container, anonymousClass2).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new PaintView$$ExternalSyntheticLambda3(paintView, 3))).show(true);
                    return Boolean.FALSE;
                }
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    PaintView.AnonymousClass7 anonymousClass7 = paintView.entitiesView;
                    if (i3 >= anonymousClass7.getChildCount()) {
                        break;
                    }
                    if (anonymousClass7.getChildAt(i3) instanceof LinkView) {
                        i4++;
                    }
                    i3++;
                }
                if (i4 >= 3) {
                    BulletinFactory.of(anonymousClass22.container, anonymousClass2).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0])).show(true);
                    return Boolean.FALSE;
                }
                zArr2[0] = false;
                paintView.showLinkAlert(null);
                anonymousClass22.lambda$showGiftOfferSheet$15();
                return Boolean.TRUE;
            }
        };
        View[] viewPages = r2.viewPager.getViewPages();
        while (i2 < viewPages.length) {
            View view = viewPages[i2];
            if (view instanceof EmojiBottomSheet.Page) {
                EmojiBottomSheet.Page.Adapter adapter = ((EmojiBottomSheet.Page) view).adapter;
                if (adapter.query == null) {
                    adapter.updateItems$1(null);
                }
            }
            i2++;
        }
        r2.show();
        onOpenCloseStickersAlert(true);
    }

    public final void registerRemovalUndo$1(EntityView entityView) {
        UUID uuid = entityView.getUUID();
        PaintView$$ExternalSyntheticLambda30 paintView$$ExternalSyntheticLambda30 = new PaintView$$ExternalSyntheticLambda30(this, entityView, 1);
        UndoStore undoStore = this.undoStore;
        undoStore.uuidToOperationMap.put(uuid, paintView$$ExternalSyntheticLambda30);
        undoStore.operations.add(uuid);
        undoStore.notifyOfHistoryChanges();
    }

    public final void removeEntity$1(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.updateSelect(entityView2.lastSelectionContainer, false);
            selectEntity$1(null, true);
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab$1(0);
            }
        }
        removeView(entityView);
        checkEntitiesIsVideo();
        if (entityView != null) {
            UUID uuid = entityView.getUUID();
            UndoStore undoStore = this.undoStore;
            undoStore.uuidToOperationMap.remove(uuid);
            undoStore.operations.remove(uuid);
            undoStore.notifyOfHistoryChanges();
        }
        if (entityView instanceof PhotoView) {
            ((PhotoView) entityView).getClass();
        }
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        RichMapCell.AnonymousClass1 anonymousClass1 = this.weightDefaultValueOverride;
        paintWeightChooserView.setValueOverride(anonymousClass1);
        paintWeightChooserView.setShowPreview(true);
        float f = anonymousClass1.get();
        Swatch swatch = this.colorSwatch;
        swatch.brushWeight = f;
        setCurrentSwatch(null, swatch, false);
        if (this.creatingNewRound || !(entityView instanceof RoundView)) {
            return;
        }
        StoryRecorder storyRecorder = StoryRecorder.this;
        StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
        if (anonymousClass7 != null) {
            anonymousClass7.setupRound(null, null, true);
        }
        StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
        if (anonymousClass24 != null) {
            anonymousClass24.deleteRound();
        }
        StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
        if (anonymousClass8 != null) {
            anonymousClass8.setHasRoundVideo(false);
        }
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry != null) {
            File file = storyEntry.round;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                storyRecorder.outputEntry.round = null;
            }
            if (storyRecorder.outputEntry.roundThumb != null) {
                try {
                    new File(storyRecorder.outputEntry.roundThumb).delete();
                } catch (Exception unused2) {
                }
                storyRecorder.outputEntry.roundThumb = null;
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final boolean selectEntity$1(EntityView entityView, boolean z) {
        boolean z2;
        TimelineView timelineView;
        TimelineView timelineView2;
        ReactionsContainerLayout reactionsContainerLayout;
        int i;
        boolean z3 = entityView instanceof TextPaintView;
        int i2 = 2;
        if (z3 && (((i = this.tabsNewSelectedIndex) == -1 && this.tabsSelectedIndex != 2) || (i != -1 && i != 2))) {
            ValueAnimator valueAnimator = this.tabsSelectionAnimator;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.isColorListShown) {
                showColorList$1(false);
            }
            switchTab$1(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            int gravity = textPaintView.getEditText().getGravity();
            if (gravity == 17) {
                i2 = 1;
            } else if (gravity != 21) {
                i2 = 0;
            }
            PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
            paintTextOptionsView.setAlignment(i2);
            PaintTypeface typeface = textPaintView.getTypeface();
            if (typeface != null) {
                paintTextOptionsView.setTypeface(typeface.key);
            }
            paintTextOptionsView.setOutlineType(textPaintView.getType(), true);
            invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            z2 = false;
        } else {
            if (entityView2 == entityView) {
                if (!entityView.hadMultitouch) {
                    if (entityView instanceof LocationView) {
                        LocationView locationView = (LocationView) entityView;
                        locationView.setType((locationView.getType() + 1) % locationView.getTypesCount());
                        return true;
                    }
                    if (entityView instanceof WeatherView) {
                        WeatherView weatherView = (WeatherView) entityView;
                        weatherView.setType((weatherView.getType() + 1) % weatherView.getTypesCount());
                        return true;
                    }
                    if (entityView instanceof LinkView) {
                        LinkView linkView = (LinkView) entityView;
                        LinkPreview linkPreview = linkView.marker;
                        if (linkPreview.withPreview()) {
                            linkPreview.setPreviewType(linkPreview.getPreviewType() == 0 ? 1 : 0);
                            return true;
                        }
                        linkView.setType(linkView.getNextType());
                        return true;
                    }
                    if (!this.editingText) {
                        if (entityView instanceof TextPaintView) {
                            this.enteredThroughText = true;
                            editSelectedTextEntity$1();
                            return true;
                        }
                        if (!(entityView instanceof ReactionWidgetEntityView)) {
                            showMenuForEntity$1(entityView2);
                            return true;
                        }
                        ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                        if (this.reactionLayoutShowing && this.reactionForEntity == entityView) {
                            reactionWidgetEntityView.changeStyle(true);
                            return true;
                        }
                        ReactionWidgetEntityView reactionWidgetEntityView2 = this.reactionForEntity;
                        if (reactionWidgetEntityView2 != null && reactionWidgetEntityView2 != reactionWidgetEntityView && (reactionsContainerLayout = this.reactionLayout) != null) {
                            reactionsContainerLayout.animate().alpha(0.0f).setListener(new HintView2.AnonymousClass2(reactionsContainerLayout, 5));
                            this.reactionLayout = null;
                            this.reactionLayoutShowing = false;
                            this.reactionShowProgress = 0.0f;
                        }
                        if (this.reactionLayout == null) {
                            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new PeerStoriesView.AnonymousClass18(new DarkThemeResourceProvider(), 6));
                            this.reactionLayout = reactionsContainerLayout2;
                            final BlurringShader.StoryBlurDrawer storyBlurDrawer = new BlurringShader.StoryBlurDrawer(this.blurManager, reactionsContainerLayout2, 0);
                            this.reactionLayout.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
                            this.parent.addView(this.reactionLayout, LayoutHelper.createFrame(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                            final Paint paint = new Paint(1);
                            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 120));
                            this.reactionLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
                                public final Path clipPath = new Path();
                                public BlurringShader.StoryBlurDrawer windowBackgroundBlur;

                                @Override
                                public final boolean allowLongPress() {
                                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
                                }

                                @Override
                                public final boolean drawBackground() {
                                    return true;
                                }

                                @Override
                                public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i3, boolean z5) {
                                    Paint paint2;
                                    BlurringShader.BlurManager blurManager;
                                    BlurringShader.StoryBlurDrawer storyBlurDrawer2 = storyBlurDrawer;
                                    Paint paint3 = paint;
                                    PaintView paintView = PaintView.this;
                                    if (!z5 && (blurManager = paintView.blurManager) != null && blurManager.hasRenderNode()) {
                                        if (z5) {
                                            storyBlurDrawer2 = this.windowBackgroundBlur;
                                        }
                                        Path path = this.clipPath;
                                        path.rewind();
                                        path.addRoundRect(rectF, f, f, Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(path);
                                        storyBlurDrawer2.drawRect(canvas);
                                        paint3.setAlpha((int) (i3 * 0.4f));
                                        canvas.drawPaint(paint3);
                                        canvas.restore();
                                        return;
                                    }
                                    if (z5) {
                                        if (this.windowBackgroundBlur == null) {
                                            this.windowBackgroundBlur = new BlurringShader.StoryBlurDrawer(paintView.blurManager, paintView.reactionLayout.getReactionsWindow().windowView, 0);
                                        }
                                        float f4 = -f2;
                                        float f5 = -f3;
                                        this.windowBackgroundBlur.setBounds(f4, f5, paintView.getMeasuredWidth() + f4, paintView.getMeasuredHeight() + f5);
                                        paint2 = this.windowBackgroundBlur.paint;
                                    } else {
                                        float f6 = -f2;
                                        float f7 = -f3;
                                        storyBlurDrawer2.setBounds(f6, f7, paintView.getMeasuredWidth() + f6, paintView.getMeasuredHeight() + f7);
                                        paint2 = storyBlurDrawer2.paint;
                                    }
                                    paint2.setAlpha(i3);
                                    paint3.setAlpha((int) (i3 * 0.4f));
                                    canvas.drawRoundRect(rectF, f, f, paint2);
                                    canvas.drawRoundRect(rectF, f, f, paint3);
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
                                public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z5, boolean z6) {
                                    PaintView paintView = PaintView.this;
                                    ReactionWidgetEntityView reactionWidgetEntityView3 = paintView.reactionForEntity;
                                    if (reactionWidgetEntityView3 == null) {
                                        return;
                                    }
                                    reactionWidgetEntityView3.setCurrentReaction(visibleReaction, true);
                                    paintView.showReactionsLayout(false);
                                }
                            });
                            this.reactionLayout.setMessage(null, null, true);
                        }
                        this.reactionLayout.setFragment(LaunchActivity.getLastFragment());
                        this.reactionForEntity = reactionWidgetEntityView;
                        showReactionsLayout(true);
                        return true;
                    }
                    if (entityView2 instanceof TextPaintView) {
                        AndroidUtilities.showKeyboard(((TextPaintView) entityView2).getFocusedView());
                        hideEmojiPopup$3(false);
                    }
                }
                return true;
            }
            entityView2.updateSelect(entityView2.lastSelectionContainer, false);
            EntityView entityView3 = this.currentEntityView;
            if (entityView3 instanceof TextPaintView) {
                TextPaintView textPaintView2 = (TextPaintView) entityView3;
                textPaintView2.editText.clearFocus();
                TextPaintView.AnonymousClass1 anonymousClass1 = textPaintView2.editText;
                anonymousClass1.setEnabled(false);
                anonymousClass1.setClickable(false);
                EntityView.SelectionView selectionView = textPaintView2.selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
                if (!z3) {
                    this.editingText = false;
                    AndroidUtilities.hideKeyboard(((TextPaintView) this.currentEntityView).getFocusedView());
                    hideEmojiPopup$3(false);
                }
            } else if ((entityView3 instanceof RoundView) && (timelineView2 = StoryRecorder.this.timelineView) != null) {
                timelineView2.roundSelected = false;
                timelineView2.audioSelected = timelineView2.hasAudio && timelineView2.videoTrack == null;
                timelineView2.invalidate();
            }
            z2 = true;
        }
        EntityView entityView4 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView4 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView4).getText())) {
            removeEntity$1(entityView4);
        }
        EntityView entityView5 = this.currentEntityView;
        if (entityView4 != entityView5 && (entityView5 instanceof RoundView) && (timelineView = StoryRecorder.this.timelineView) != null) {
            if (timelineView.hasRound) {
                timelineView.roundSelected = true;
                timelineView.audioSelected = false;
            } else {
                timelineView.roundSelected = false;
                timelineView.audioSelected = timelineView.hasAudio && timelineView.videoTrack == null;
            }
            timelineView.invalidate();
        }
        EntityView entityView6 = this.currentEntityView;
        RichMapCell.AnonymousClass1 anonymousClass2 = this.weightDefaultValueOverride;
        Swatch swatch = this.colorSwatch;
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        if (entityView6 != null) {
            AnonymousClass8 anonymousClass8 = this.selectionContainerView;
            entityView6.lastSelectionContainer = anonymousClass8;
            entityView6.updateSelect(anonymousClass8, true);
            EntityView entityView7 = this.currentEntityView;
            if (entityView7 instanceof TextPaintView) {
                TextPaintView textPaintView3 = (TextPaintView) entityView7;
                textPaintView3.getSwatch().brushWeight = swatch.brushWeight;
                textPaintView3.disableAutoresize = false;
                setCurrentSwatch(null, textPaintView3.getSwatch(), false);
                paintWeightChooserView.setValueOverride(new AnonymousClass14(textPaintView3, (int) (this.paintingSize.width / 9.0f), 0));
                paintWeightChooserView.setShowPreview(false);
            } else {
                paintWeightChooserView.setValueOverride(anonymousClass2);
                paintWeightChooserView.setShowPreview(true);
                swatch.brushWeight = anonymousClass2.get();
                setCurrentSwatch(null, swatch, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.tabsSelectionAnimator;
            if (valueAnimator2 != null && this.tabsNewSelectedIndex != 0) {
                valueAnimator2.cancel();
            }
            if (this.isColorListShown) {
                showColorList$1(false);
            }
            switchTab$1(0);
            paintWeightChooserView.setValueOverride(anonymousClass2);
            paintWeightChooserView.setShowPreview(true);
            swatch.brushWeight = anonymousClass2.get();
            setCurrentSwatch(null, swatch, false);
            z4 = z2;
        }
        updateTextDim();
        return z4;
    }

    public void setBlurManager(BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
    }

    public void setCoverPreview(boolean z) {
        if (this.isCoverPreview != z) {
            this.isCoverPreview = z;
            if (z) {
                selectEntity$1(null, true);
            }
            setCoverPause(z);
        }
    }

    public void setCoverTime(long j) {
        int i = 0;
        while (true) {
            AnonymousClass7 anonymousClass7 = this.entitiesView;
            if (i >= anonymousClass7.getChildCount()) {
                return;
            }
            View childAt = anonymousClass7.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.setCurrentFrame(Math.round(((j % lottieAnimation.getDuration()) / lottieAnimation.getDuration()) * lottieAnimation.getFramesCount()), true, false);
                }
            }
            i++;
        }
    }

    public final void setCurrentSwatch(Integer num, Swatch swatch, boolean z) {
        Swatch swatch2 = this.colorSwatch;
        if (swatch2 != swatch) {
            swatch2.color = swatch.color;
            swatch2.brushWeight = swatch.brushWeight;
            int i = this.currentAccount;
            PersistColorPalette.getInstance(i).selectColor(swatch.color, true);
            PersistColorPalette.getInstance(i).setCurrentWeight(swatch.brushWeight);
        }
        int i2 = swatch.color;
        AnonymousClass3 anonymousClass3 = this.renderView;
        anonymousClass3.setColor(i2);
        anonymousClass3.setBrushSize(swatch.brushWeight);
        int i3 = swatch2.color;
        if (num == null || num.intValue() == i3) {
            AnonymousClass9 anonymousClass9 = this.bottomLayout;
            if (anonymousClass9 != null) {
                anonymousClass9.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new PaintView$$ExternalSyntheticLambda28(this, num, i3, 0));
            duration.start();
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(new Swatch(swatch.color, swatch.brushWeight));
            return;
        }
        if (z && (entityView instanceof LocationView)) {
            ((LocationView) entityView).setColor(swatch.color);
            ((LocationView) this.currentEntityView).setType(3);
        } else if (z && (entityView instanceof WeatherView)) {
            ((WeatherView) entityView).setColor(swatch.color);
            ((WeatherView) this.currentEntityView).setType(3);
        } else if (z && (entityView instanceof LinkView)) {
            ((LinkView) entityView).setColor(swatch.color);
            ((LinkView) this.currentEntityView).setType(0);
        }
    }

    public void setHasAudio(boolean z) {
        if (z != this.hasAudio) {
            this.hasAudio = z;
            checkEntitiesIsVideo();
        }
    }

    @Override
    public final void setOffsetTranslationX(float f) {
        IPhotoPaintView.CC.$default$setOffsetTranslationX(this, f);
    }

    @Override
    public final void setOffsetTranslationY(float f, float f2, int i, boolean z) {
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.onCancelButtonClickedListener = runnable;
    }

    @Override
    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    @Override
    public final void setTransform(float f, float f2, float f3, float f4, float f5) {
    }

    public final void setupEntities() {
        int i;
        AnonymousClass26 anonymousClass26;
        Emoji.EmojiSpan[] emojiSpanArr;
        EntityView entityView;
        ArrayList arrayList = this.initialEntities;
        if (arrayList == null) {
            return;
        }
        StoryEntry storyEntry = this.initialEntry;
        this.initialEntry = null;
        this.initialEntities = null;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            AnonymousClass7 anonymousClass7 = this.entitiesView;
            if (i2 >= size) {
                anonymousClass7.setVisibility(0);
                return;
            }
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i2);
            byte b = mediaEntity.type;
            if (b == 0) {
                AnonymousClass27 anonymousClass27CreateSticker$1 = createSticker$1(mediaEntity.parentObject, mediaEntity.document);
                if ((2 & mediaEntity.subType) != 0) {
                    anonymousClass27CreateSticker$1.mirror(z);
                }
                ViewGroup.LayoutParams layoutParams = anonymousClass27CreateSticker$1.getLayoutParams();
                layoutParams.width = mediaEntity.viewWidth;
                layoutParams.height = mediaEntity.viewHeight;
                i = i2;
                entityView = anonymousClass27CreateSticker$1;
            } else if (b == 1) {
                TextPaintView textPaintViewCreateText$1 = createText$1(z);
                textPaintViewCreateText$1.setType(mediaEntity.subType);
                textPaintViewCreateText$1.setTypeface(mediaEntity.textTypeface);
                textPaintViewCreateText$1.setBaseFontSize(mediaEntity.fontSize);
                SpannableString spannableString = new SpannableString(mediaEntity.text);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i3);
                    i3++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity2.document_id, 1.0f, textPaintViewCreateText$1.getFontMetricsInt());
                    int i4 = emojiEntity2.offset;
                    spannableString.setSpan(animatedEmojiSpan, i4, emojiEntity2.length + i4, 33);
                    i2 = i2;
                }
                i = i2;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, textPaintViewCreateText$1.getFontMetricsInt(), false);
                if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                textPaintViewCreateText$1.setText(charSequenceReplaceEmoji);
                setTextAlignment$1(textPaintViewCreateText$1, mediaEntity.textAlign);
                Swatch swatch = textPaintViewCreateText$1.getSwatch();
                swatch.color = mediaEntity.color;
                textPaintViewCreateText$1.setSwatch(swatch);
                entityView = textPaintViewCreateText$1;
            } else {
                i = i2;
                if (b == 2) {
                    PhotoView photoViewCreatePhoto = createPhoto(mediaEntity.text, false);
                    photoViewCreatePhoto.crop = mediaEntity.crop;
                    photoViewCreatePhoto.segmentingLoading = false;
                    if ((2 & mediaEntity.subType) != 0) {
                        photoViewCreatePhoto.mirror(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        boolean z2 = !photoViewCreatePhoto.segmented;
                        photoViewCreatePhoto.segmented = z2;
                        photoViewCreatePhoto.segmentedT.set(z2, true);
                        TONIntroActivity.AnonymousClass2 anonymousClass2 = photoViewCreatePhoto.containerView;
                        if (anonymousClass2 != null) {
                            anonymousClass2.invalidate();
                        }
                    }
                    ViewGroup.LayoutParams layoutParams2 = photoViewCreatePhoto.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    entityView = photoViewCreatePhoto;
                } else if (b == 6) {
                    ArrayList arrayList3 = storyEntry.messageObjects;
                    boolean z3 = storyEntry.isVideo;
                    this.forceChanges = true;
                    anonymousClass26 = new AnonymousClass26(getContext(), centerPositionForEntity$1(), arrayList3, this.blurManager, z3, this.videoTextureHolder);
                    anonymousClass26.setDelegate(this);
                    anonymousClass7.addView(anonymousClass26);
                    checkEntitiesIsVideo();
                    if (mediaEntity.viewWidth > 0 && mediaEntity.viewHeight > 0) {
                        entityView = anonymousClass26;
                        entityView = anonymousClass26;
                        ViewGroup.LayoutParams layoutParams3 = anonymousClass26.getLayoutParams();
                        layoutParams3.width = mediaEntity.viewWidth;
                        layoutParams3.height = mediaEntity.viewHeight;
                        entityView = anonymousClass26;
                    }
                } else if (b == 3) {
                    LocationView locationViewCreateLocationSticker = createLocationSticker(mediaEntity.media, mediaEntity.mediaArea);
                    int i5 = mediaEntity.color;
                    if (i5 != 0) {
                        locationViewCreateLocationSticker.setColor(i5);
                    }
                    locationViewCreateLocationSticker.setType(mediaEntity.subType);
                    entityView = locationViewCreateLocationSticker;
                } else {
                    if (b == 8) {
                        Weather.State state = mediaEntity.weather;
                        if (state != null) {
                            WeatherView weatherViewCreateWeatherView = createWeatherView(state);
                            int i6 = mediaEntity.color;
                            if (i6 != 0) {
                                weatherViewCreateWeatherView.setColor(i6);
                            }
                            weatherViewCreateWeatherView.setType(mediaEntity.subType);
                            entityView = weatherViewCreateWeatherView;
                        }
                    } else if (b == 7) {
                        LinkView linkViewCreateLinkSticker = createLinkSticker(mediaEntity.linkSettings);
                        int i7 = mediaEntity.color;
                        if (i7 != 0) {
                            linkViewCreateLinkSticker.setColor(i7);
                        }
                        LinkPreview linkPreview = linkViewCreateLinkSticker.marker;
                        if (linkPreview.withPreview()) {
                            linkPreview.setPreviewType(mediaEntity.subType);
                        }
                        byte b2 = mediaEntity.subType;
                        if (b2 == -1) {
                            linkViewCreateLinkSticker.setType(3);
                            linkPreview.setupLayout();
                            int iCeil = (int) Math.ceil(linkPreview.w);
                            int i8 = linkPreview.padx;
                            mediaEntity.viewWidth = iCeil + i8 + i8;
                            int iCeil2 = (int) Math.ceil(linkPreview.h);
                            int i9 = linkPreview.pady;
                            mediaEntity.viewHeight = iCeil2 + i9 + i9;
                            PointF position = linkViewCreateLinkSticker.getPosition();
                            position.y = (this.h * 0.3f) + position.y;
                            linkViewCreateLinkSticker.setPosition(position);
                        } else {
                            linkViewCreateLinkSticker.setType(b2);
                            entityView = linkViewCreateLinkSticker;
                        }
                    } else if (b == 4) {
                        ReactionWidgetEntityView reactionWidgetEntityViewCreateReactionWidget = createReactionWidget(false);
                        reactionWidgetEntityViewCreateReactionWidget.setCurrentReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(mediaEntity.mediaArea.reaction), false);
                        if (mediaEntity.mediaArea.flipped) {
                            reactionWidgetEntityViewCreateReactionWidget.mirror(false);
                        }
                        entityView = reactionWidgetEntityViewCreateReactionWidget;
                        if (mediaEntity.mediaArea.dark) {
                            reactionWidgetEntityViewCreateReactionWidget.changeStyle(false);
                            entityView = reactionWidgetEntityViewCreateReactionWidget;
                        }
                    } else if (b == 5 && storyEntry.round != null) {
                        RoundView roundViewCreateRound = createRound(storyEntry.roundThumb, false);
                        StoryRecorder storyRecorder = StoryRecorder.this;
                        StoryRecorder.AnonymousClass7 anonymousClass8 = storyRecorder.previewView;
                        if (anonymousClass8 != null) {
                            anonymousClass8.roundView = roundViewCreateRound;
                            VideoPlayer videoPlayer = anonymousClass8.roundPlayer;
                            if (videoPlayer != null) {
                                videoPlayer.setTextureView(roundViewCreateRound.textureView);
                            }
                        }
                        StoryRecorder.AnonymousClass8 anonymousClass9 = storyRecorder.captionEdit;
                        if (anonymousClass9 != null) {
                            anonymousClass9.setHasRoundVideo(true);
                        }
                        entityView = roundViewCreateRound;
                        if ((2 & mediaEntity.subType) != 0) {
                            boolean z4 = !roundViewCreateRound.mirrored;
                            roundViewCreateRound.mirrored = z4;
                            roundViewCreateRound.mirrorT.set(z4, true);
                            roundViewCreateRound.invalidate();
                            entityView = roundViewCreateRound;
                        }
                    }
                    i2 = i + 1;
                    z = false;
                }
            }
            entityView = anonymousClass26;
            entityView = anonymousClass26;
            entityView = anonymousClass26;
            entityView.setX((mediaEntity.x * this.w) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
            entityView.setY((mediaEntity.y * this.h) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
            entityView.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + entityView.getX(), (mediaEntity.viewHeight / 2.0f) + entityView.getY()));
            entityView.setScale(mediaEntity.scale);
            entityView.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
            i2 = i + 1;
            z = false;
        }
    }

    public final void showColorList$1(final boolean z) {
        int i = 0;
        if (this.isColorListShown != z) {
            this.isColorListShown = z;
            SpringAnimation springAnimation = this.toolsTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.toolsTransformAnimation = springAnimation2;
            SpringForce springForce = new SpringForce();
            springForce.mFinalPosition = z ? 1000.0f : 0.0f;
            springForce.setStiffness(1250.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation2.mSpring = springForce;
            final boolean[] zArr = {this.keyboardNotifier.keyboardVisible() || this.emojiPadding > 0};
            final float translationY = this.bottomLayout.getTranslationY();
            final float alpha = this.doneButton.getAlpha();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    float f3 = f / 1000.0f;
                    PaintView paintView = this.f$0;
                    paintView.toolsTransformProgress = f3;
                    float f4 = ((1.0f - f3) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f4);
                    viewGroup.setScaleY(f4);
                    viewGroup.setTranslationY((Math.min(paintView.toolsTransformProgress, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(paintView.toolsTransformProgress, 0.25f) / 0.25f));
                    float f5 = paintView.toolsTransformProgress;
                    PaintView.AnonymousClass11 anonymousClass11 = paintView.colorsListView;
                    boolean z2 = z;
                    anonymousClass11.setProgress(f5, z2);
                    float f6 = paintView.toolsTransformProgress;
                    PaintDoneView paintDoneView = paintView.doneButton;
                    paintDoneView.setProgress(f6);
                    float f7 = paintView.toolsTransformProgress;
                    PaintCancelView paintCancelView = paintView.cancelButton;
                    paintCancelView.setProgress(f7);
                    paintView.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * paintView.toolsTransformProgress);
                    AnimatorSet animatorSet = paintView.keyboardAnimator;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    boolean z3 = zArr2[0];
                    PaintView.AnonymousClass9 anonymousClass9 = paintView.bottomLayout;
                    if (z3) {
                        float f8 = z2 ? paintView.toolsTransformProgress : 1.0f - paintView.toolsTransformProgress;
                        float f9 = z2 ? 1.0f : 0.0f;
                        float f10 = alpha;
                        paintDoneView.setAlpha(AndroidUtilities.lerp(f10, f9, f8));
                        paintCancelView.setAlpha(AndroidUtilities.lerp(f10, z2 ? 1.0f : 0.0f, f8));
                        anonymousClass9.setTranslationY(translationY - ((AndroidUtilities.dp(39.0f) * f8) * (z2 ? 1 : -1)));
                    }
                    anonymousClass9.invalidate();
                    if (viewGroup == paintView.textOptionsView) {
                        paintView.overlayLayout.invalidate();
                    }
                }
            });
            this.toolsTransformAnimation.addEndListener(new PaintView$$ExternalSyntheticLambda22(this, z, i));
            this.toolsTransformAnimation.start();
            if (z) {
                AnonymousClass11 anonymousClass11 = this.colorsListView;
                anonymousClass11.setVisibility(0);
                anonymousClass11.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    public final void showEmojiPopup$1(int i) {
        int i2 = 2;
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        AnonymousClass13 anonymousClass13 = this.keyboardNotifier;
        int i3 = 1;
        if (i == 1) {
            EmojiView emojiView = this.emojiView;
            boolean z = emojiView != null && emojiView.getVisibility() == 0;
            EmojiView emojiView2 = this.emojiView;
            StoryRecorder.WindowView windowView = this.parent;
            if (emojiView2 != null && emojiView2.currentAccount != UserConfig.selectedAccount) {
                windowView.removeView(emojiView2);
                this.emojiView = null;
            }
            if (this.emojiView == null) {
                EmojiView emojiView3 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
                this.emojiView = emojiView3;
                emojiView3.fixBottomTabContainerTranslation = false;
                emojiView3.allowEmojisForNonPremium(true);
                this.emojiView.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.emojiView.setForseMultiwindowLayout(true);
                }
                this.emojiView.setDelegate(new AnonymousClass31());
                windowView.addView(this.emojiView);
            }
            this.emojiView.setVisibility(0);
            this.emojiViewVisible = true;
            EmojiView emojiView4 = this.emojiView;
            if (this.keyboardHeight <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeight = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.keyboardHeightLand <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = windowView.getPaddingUnderContainer() + (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            emojiView4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                EntityView entityView = this.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
                }
            }
            this.emojiPadding = paddingUnderContainer;
            anonymousClass13.fire();
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
            ChatActivityEnterViewAnimatedIconView emojiButton = paintTextOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (!z) {
                if (this.keyboardVisible) {
                    this.translateBottomPanelAfterResize = true;
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new PaintView$$ExternalSyntheticLambda24(this, i2));
                    valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i3));
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    valueAnimatorOfFloat.start();
                }
            }
        } else {
            ChatActivityEnterViewAnimatedIconView emojiButton2 = paintTextOptionsView.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView5 = this.emojiView;
            if (emojiView5 != null) {
                this.emojiViewVisible = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    emojiView5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.emojiPadding = 0;
                anonymousClass13.fire();
            }
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
        }
        updatePlusEmojiKeyboardButton$1();
    }

    public final void showLinkAlert(LinkView linkView) {
        boolean zFind;
        StoryLinkSheet storyLinkSheet = new StoryLinkSheet(getContext(), this.resourcesProvider, this.previewView, new GiftSheet$$ExternalSyntheticLambda4(19, this, linkView));
        if (linkView != null) {
            LinkPreview.WebPagePreview webPagePreview = linkView.link;
            storyLinkSheet.ignoreUrlEdit = true;
            EditTextCell editTextCell = storyLinkSheet.nameEditText;
            EditTextCell editTextCell2 = storyLinkSheet.urlEditText;
            if (webPagePreview != null) {
                storyLinkSheet.webpage = webPagePreview.webpage;
                storyLinkSheet.loading = false;
                editTextCell2.setText(webPagePreview.url);
                editTextCell.setText(webPagePreview.name);
                storyLinkSheet.nameOpen = !TextUtils.isEmpty(webPagePreview.name);
                storyLinkSheet.captionAbove = webPagePreview.captionAbove;
                storyLinkSheet.photoLarge = webPagePreview.largePhoto;
            } else {
                editTextCell2.setText("");
                editTextCell.setText("");
                storyLinkSheet.captionAbove = true;
                storyLinkSheet.photoLarge = false;
            }
            ButtonWithCounterView buttonWithCounterView = storyLinkSheet.button;
            buttonWithCounterView.setText(LocaleController.getString(R.string.StoryLinkEdit), false);
            StoryLinkSheet.AnonymousClass3 anonymousClass3 = storyLinkSheet.adapter;
            if (anonymousClass3 != null) {
                anonymousClass3.update(false);
            }
            String string = editTextCell2.getText().toString();
            if (TextUtils.isEmpty(string)) {
                zFind = false;
            } else {
                if (storyLinkSheet.urlPattern == null) {
                    storyLinkSheet.urlPattern = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
                }
                zFind = storyLinkSheet.urlPattern.matcher(string).find();
            }
            buttonWithCounterView.setEnabled(zFind);
            storyLinkSheet.ignoreUrlEdit = false;
        }
        storyLinkSheet.setOnDismissListener(new PaintView$$ExternalSyntheticLambda61(this, 1));
        storyLinkSheet.show();
        onOpenCloseStickersAlert(true);
    }

    public final void showLocationAlert(LocationView locationView, final Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new ChatActivity() {
            {
                super(null);
            }

            @Override
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia2, int i, boolean z, int i2, long j) {
                Object obj;
                Object obj2;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaGeo) {
                    TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = new TL_stories.TL_mediaAreaGeoPoint();
                    tL_mediaAreaGeoPoint.geo = messageMedia2.geo;
                    obj2 = tL_mediaAreaGeoPoint;
                } else {
                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                        return;
                    }
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia2;
                    long j2 = tL_messageMediaVenue.query_id;
                    if (j2 == -1 || j2 == -2) {
                        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
                        tL_mediaAreaGeoPoint2.geo = messageMedia2.geo;
                        TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                        tL_mediaAreaGeoPoint2.address = tL_geoPointAddress;
                        if (tL_geoPointAddress != null) {
                            tL_mediaAreaGeoPoint2.flags |= 1;
                        }
                        Utilities.globalQueue.postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(22, (TLRPC.TL_messageMediaVenue) messageMedia2, tL_mediaAreaGeoPoint2));
                        obj = tL_mediaAreaGeoPoint2;
                    } else {
                        TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                        tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                        tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                        obj = tL_inputMediaAreaVenue;
                    }
                    obj2 = obj;
                }
                callback2.run(messageMedia2, obj2);
            }

            @Override
            public final TLRPC.User getCurrentUser() {
                return UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }

            @Override
            public final long getDialogId() {
                return 0L;
            }

            @Override
            public final Activity getParentActivity() {
                return AndroidUtilities.findActivity(PaintView.this.getContext());
            }

            @Override
            public final Theme.ResourcesProvider getResourceProvider() {
                return PaintView.this.resourcesProvider;
            }

            @Override
            public final boolean isKeyboardVisible() {
                return false;
            }

            @Override
            public final boolean isLightStatusBar() {
                return false;
            }
        }, false, true, false, this.resourcesProvider);
        chatAttachAlert.setDelegate(new AnonymousClass25());
        if (locationView != null && (messageMedia = locationView.location) != null && (geoPoint = messageMedia.geo) != null) {
            chatAttachAlert.setStoryLocationPicker(geoPoint.lat, geoPoint._long);
        } else if (this.fileFromGallery) {
            chatAttachAlert.setStoryLocationPicker(this.isVideo, this.file);
        } else {
            chatAttachAlert.setStoryLocationPicker();
        }
        chatAttachAlert.setOnDismissListener(new PaintView$$ExternalSyntheticLambda61(this, 0));
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    public final void showMenuForEntity$1(EntityView entityView) {
        if (entityView instanceof MessageEntityView) {
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
                return;
            }
            this.popupWindow.dismiss(true);
            return;
        }
        int[] iArr = this.pos;
        entityView.getLocationInWindow(iArr);
        float scaleX = entityView.getScaleX() * entityView.getWidth();
        AnonymousClass7 anonymousClass7 = this.entitiesView;
        float scaleX2 = anonymousClass7.getScaleX() * scaleX;
        float scaleY = anonymousClass7.getScaleY() * entityView.getScaleY() * entityView.getHeight();
        int i = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i;
        int i2 = (int) ((scaleY / 2.0f) + iArr[1]);
        iArr[1] = i2;
        showPopup(new PaintView$$ExternalSyntheticLambda30(this, entityView, 0), this, 51, i, i2 - AndroidUtilities.dp(32.0f), true);
    }

    public final void showPopup(Runnable runnable, PaintView paintView, int i, int i2, int i3, boolean z) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            PopupWindowLayout popupWindowLayout = new PopupWindowLayout(this, getContext());
            this.popupLayout = popupWindowLayout;
            popupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ActionBarPopupWindow actionBarPopupWindow2;
                    PaintView paintView2 = this.f$0;
                    paintView2.getClass();
                    if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow2 = paintView2.popupWindow) == null || !actionBarPopupWindow2.isShowing()) {
                        return false;
                    }
                    view.getHitRect(paintView2.popupRect);
                    if (paintView2.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    paintView2.popupWindow.dismiss(true);
                    return false;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new PaintView$$ExternalSyntheticLambda6(this));
            this.popupLayout.setShownFromBottom(true);
        }
        PopupWindowLayout popupWindowLayout2 = this.popupLayout;
        popupWindowLayout2.enableBounce = z;
        popupWindowLayout2.removeInnerViews();
        runnable.run();
        if (this.popupWindow == null) {
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationEnabled(true);
            this.popupWindow.setAnimationStyle(R.style.PopupAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    this.f$0.popupLayout.removeInnerViews();
                }
            });
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        int measuredWidth = i2 - (this.popupLayout.getMeasuredWidth() / 2);
        int measuredHeight = i3 - this.popupLayout.getMeasuredHeight();
        this.popupWindow.showAtLocation(paintView, i, measuredWidth, measuredHeight);
        ActionBarPopupWindow.startAnimation(this.popupLayout);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z) {
            PopupWindowLayout popupWindowLayout3 = this.popupLayout;
            popupWindowLayout3.setBackgroundDrawable(new BlurringShader.StoryBlurDrawer(this.blurManager, popupWindowLayout3, 5).makeDrawable(measuredWidth, measuredHeight, drawableMutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.popupLayout.setBackgroundDrawable(drawableMutate);
            this.popupLayout.setBackgroundColor(-14145495);
        }
    }

    public final void showReactionsLayout(boolean z) {
        int i = 0;
        if (this.reactionLayoutShowing != z) {
            if (z || this.reactionLayout != null) {
                this.reactionLayoutShowing = z;
                if (z) {
                    this.reactionLayout.reset();
                    this.reactionLayout.setVisibility(0);
                    this.reactionLayout.setSelectedReaction(this.reactionForEntity.getCurrentReaction());
                    this.reactionLayout.getParent().bringChildToFront(this.reactionLayout);
                } else {
                    this.reactionForEntity = null;
                }
                if (!z) {
                    if (this.reactionLayout.getReactionsWindow() != null) {
                        this.reactionLayout.getReactionsWindow().dismissWithAlpha();
                    }
                    this.reactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass19(this, i)).start();
                    return;
                }
                this.invalidateReactionPosition = true;
                this.parent.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.reactionShowProgress, z ? 1.0f : 0.0f);
                this.reactionLayout.setTransitionProgress(this.reactionShowProgress);
                valueAnimatorOfFloat.addUpdateListener(new PaintView$$ExternalSyntheticLambda24(this, i));
                valueAnimatorOfFloat.addListener(new StoryViewer.AnonymousClass7(this, z, 16));
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void showTypefaceMenu$1(boolean z) {
        if (this.isTypefaceMenuShown != z) {
            this.isTypefaceMenuShown = z;
            SpringAnimation springAnimation = this.typefaceMenuTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.typefaceMenuTransformAnimation = springAnimation2;
            SpringForce springForce = new SpringForce();
            springForce.mFinalPosition = z ? 1000.0f : 0.0f;
            springForce.setStiffness(1250.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation2.mSpring = springForce;
            if (z) {
                PaintTypefaceListView paintTypefaceListView = this.typefaceListView;
                paintTypefaceListView.setAlpha(0.0f);
                paintTypefaceListView.setVisibility(0);
            }
            this.typefaceMenuTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    float f3 = f / 1000.0f;
                    PaintView paintView = this.f$0;
                    paintView.typefaceMenuTransformProgress = f3;
                    PaintTypefaceListView paintTypefaceListView2 = paintView.typefaceListView;
                    paintTypefaceListView2.setAlpha(f3);
                    paintTypefaceListView2.invalidate();
                    paintView.overlayLayout.invalidate();
                    paintView.textOptionsView.getTypefaceCell().setAlpha(1.0f - paintView.typefaceMenuTransformProgress);
                }
            });
            this.typefaceMenuTransformAnimation.addEndListener(new PaintView$$ExternalSyntheticLambda22(this, z, 1));
            this.typefaceMenuTransformAnimation.start();
        }
    }

    @Override
    public final void shutdown() {
        shutdown();
        setVisibility(8);
        setVisibility(8);
        this.queue.postRunnable(new GiftSheet$$ExternalSyntheticLambda2(26));
        AnonymousClass22 anonymousClass22 = this.emojiPopup;
        if (anonymousClass22 != null) {
            anonymousClass22.lambda$showGiftOfferSheet$15();
        }
        ColorPickerBottomSheet colorPickerBottomSheet = this.colorPickerBottomSheet;
        if (colorPickerBottomSheet != null) {
            colorPickerBottomSheet.lambda$showGiftOfferSheet$15();
        }
    }

    public final PointF startPositionRelativeToEntity$1(EntityView entityView) {
        float f;
        MediaController.CropState cropState = this.currentCropState;
        float fMin = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (entityView != null) {
            PointF position = entityView.getPosition();
            float fMin2 = Math.min(entityView.getHeight(), entityView.getWidth()) * 0.2f;
            return new PointF(position.x + fMin2, position.y + fMin2);
        }
        float f2 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFCenterPositionForEntity$1 = centerPositionForEntity$1();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                AnonymousClass7 anonymousClass7 = this.entitiesView;
                if (i2 >= anonymousClass7.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass7.getChildAt(i2);
                if (!(childAt instanceof EntityView) || (childAt instanceof MessageEntityView)) {
                    f = f2;
                } else {
                    PointF position2 = ((EntityView) childAt).getPosition();
                    f = f2;
                    if (((float) Math.sqrt(Math.pow(position2.y - pointFCenterPositionForEntity$1.y, 2.0d) + Math.pow(position2.x - pointFCenterPositionForEntity$1.x, 2.0d))) < f) {
                        fMin = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z = true;
                    }
                }
                i2++;
                f2 = f;
            }
            float f3 = f2;
            if (!z) {
                break;
            }
            i++;
            pointFCenterPositionForEntity$1 = new PointF(pointFCenterPositionForEntity$1.x + fMin, pointFCenterPositionForEntity$1.y + fMin);
            f2 = f3;
        }
        return pointFCenterPositionForEntity$1;
    }

    public final void switchTab$1(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i2 = 0;
        if (this.tabsSelectedIndex == i || this.tabsNewSelectedIndex == i) {
            return;
        }
        ValueAnimator valueAnimator = this.tabsSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = this.tabsSelectedIndex;
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        PaintToolsView paintToolsView = this.paintToolsView;
        if (i3 == 0) {
            viewGroup = paintToolsView;
        } else {
            viewGroup = i3 == 2 ? paintTextOptionsView : null;
        }
        this.tabsNewSelectedIndex = i;
        if (i == 0) {
            viewGroup2 = paintToolsView;
        } else {
            viewGroup2 = i == 2 ? paintTextOptionsView : null;
        }
        int i4 = this.currentAccount;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i4);
        boolean z = i == 2;
        if (persistColorPalette.inTextMode != z) {
            persistColorPalette.inTextMode = z;
            if (z) {
                persistColorPalette.setCurrentBrush(-1, false);
            } else {
                persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
            }
        }
        int currentColor = PersistColorPalette.getInstance(i4).getCurrentColor();
        Swatch swatch = this.colorSwatch;
        swatch.color = currentColor;
        setCurrentSwatch(null, swatch, false);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.tabsSelectionAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.tabsSelectionAnimator.addUpdateListener(new PaintView$$ExternalSyntheticLambda37(i2, this, viewGroup, viewGroup2));
        this.tabsSelectionAnimator.addListener(new AnonymousClass21(this, viewGroup, viewGroup2, i, 0));
        this.tabsSelectionAnimator.start();
    }

    @Override
    public final void updateColors() {
        this.toolsPaint.setColor(-15132391);
    }

    public final void updatePlusEmojiKeyboardButton$1() {
        AnonymousClass13 anonymousClass13 = this.keyboardNotifier;
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        if (paintTextOptionsView != null) {
            if (anonymousClass13.keyboardVisible()) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_smile);
            } else if (this.emojiViewVisible) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
            } else {
                paintTextOptionsView.animatePlusToIcon(R.drawable.msg_add);
            }
        }
        boolean z = anonymousClass13.keyboardVisible() || this.emojiViewVisible;
        boolean z2 = !z;
        AndroidUtilities.updateViewShow(this.undoAllButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.doneTextButton, z, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, z, false, 1.0f, true, null);
    }

    public final void updatePreviewViewTranslationY() {
        EntityView entityView;
        ObjectAnimator objectAnimator = this.previewViewTranslationAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) getParent();
        if (view == null) {
            return;
        }
        AnonymousClass13 anonymousClass13 = this.keyboardNotifier;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!anonymousClass13.keyboardVisible() || anonymousClass13.ignoring) && this.emojiPadding <= 0) || (entityView = this.currentEntityView) == null) ? 0.0f : view.getScaleY() * (-(entityView.getPosition().y - (view.getMeasuredHeight() * 0.3f))));
        this.previewViewTranslationAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(350L);
        this.previewViewTranslationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.previewViewTranslationAnimator.start();
    }

    public final void updateTextDim() {
        boolean z;
        if (this.currentEntityView instanceof TextPaintView) {
            AnonymousClass13 anonymousClass13 = this.keyboardNotifier;
            if ((anonymousClass13.keyboardVisible() || this.emojiPadding > 0) && !anonymousClass13.ignoring) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        View view = this.textDim;
        view.animate().cancel();
        view.setVisibility(0);
        view.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(this, z, 19)).start();
    }

    @Override
    public final void updateZoom(boolean z) {
        boolean z2 = !z;
        if (this.zoomOutVisible != z2) {
            this.zoomOutVisible = z2;
            LinearLayout linearLayout = this.zoomOutButton;
            linearLayout.animate().cancel();
            OKLCH.m(linearLayout.animate().alpha(z ? 0.0f : 1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 240L);
        }
    }

    public final Bitmap getBitmap(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, StoryEntry storyEntry) {
        Bitmap bitmap;
        Bitmap resultBitmap;
        Bitmap bitmapCreateBitmap;
        int i;
        int i2;
        int childCount;
        int i3;
        View childAt;
        EntityView entityView;
        VideoEditedInfo.MediaEntity mediaEntity;
        AnonymousClass7 anonymousClass7;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        ImageReceiver imageReceiver;
        Bitmap bitmap2;
        View view;
        MessageEntityView.AnonymousClass2 anonymousClass2;
        boolean z7;
        long duration;
        int i6;
        MessageEntityView messageEntityView;
        ArrayList arrayList2;
        MessageObject messageObject;
        MessageEntityView.AnonymousClass2 anonymousClass3;
        long j;
        Boolean boolUseForwardForRepost;
        long dialogId;
        Boolean boolUseForwardForRepost2;
        int id;
        boolean z8;
        Matrix matrix;
        View childAt2;
        ImageReceiver photoImage;
        boolean z9;
        TLRPC.Message message;
        ChatActionCell chatActionCell;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        RoundView roundView;
        ReactionsLayoutInBubble.VisibleReaction currentReaction;
        TLRPC.Reaction reaction;
        LinkView linkView;
        LinkPreview linkPreview;
        int color;
        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl;
        LinkPreview.WebPagePreview webPagePreview;
        TLRPC.WebPage webPage;
        String str;
        WeatherView weatherView;
        int color2;
        TLRPC.Document codeEmojiDocument;
        VideoEditedInfo.EmojiEntity emojiEntity;
        boolean zIsAnimatedStickerDocument;
        byte b;
        LocationView locationView;
        int color3;
        TLRPC.Document codeEmojiDocument2;
        VideoEditedInfo.EmojiEntity emojiEntity2;
        boolean zIsAnimatedStickerDocument2;
        byte b2;
        PhotoView photoView;
        TLObject tLObject;
        String absolutePath;
        StickerView stickerView;
        TLRPC.Document sticker;
        float scaleX;
        float scaleY;
        float x;
        float y;
        boolean z10;
        TL_stories.MediaArea mediaArea;
        boolean z11;
        float radius;
        double bubbleBounds;
        float imageAspectRatio;
        float f;
        float f2;
        float measuredWidth;
        TL_stories.MediaArea mediaArea2;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        TextPaintView textPaintView;
        CharSequence text;
        TextPaintView textPaintView2;
        Spanned spanned;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i7;
        AnimatedEmojiSpan animatedEmojiSpan;
        TLRPC.Document documentFindDocument;
        VideoEditedInfo.EmojiEntity emojiEntity3;
        int i8;
        boolean z12;
        boolean zIsAnimatedStickerDocument3;
        byte b3;
        ArrayList<TLRPC.PhotoSize> arrayList3;
        int i9;
        PaintView paintView = this;
        AnonymousClass3 anonymousClass4 = paintView.renderView;
        int i10 = 0;
        AnonymousClass7 anonymousClass8 = paintView.entitiesView;
        byte b4 = 1;
        if (z) {
            bitmapCreateBitmap = anonymousClass4.getResultBitmap(false, z4);
        } else {
            if (!z3) {
                if (!z2 || (resultBitmap = anonymousClass4.getResultBitmap(false, false)) == null) {
                    bitmap = null;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                }
                paintView.lcm = BigInteger.ONE;
                i2 = 0;
                for (i = 0; i < anonymousClass8.getChildCount(); i++) {
                    if (!(anonymousClass8.getChildAt(i) instanceof EntityView)) {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    childCount = anonymousClass8.getChildCount();
                    i3 = 0;
                    while (i3 < childCount) {
                        childAt = anonymousClass8.getChildAt(i3);
                        if (childAt instanceof EntityView) {
                            entityView = (EntityView) childAt;
                            entityView.getPosition();
                            mediaEntity = new VideoEditedInfo.MediaEntity();
                            if (arrayList != 0) {
                                z7 = entityView instanceof TextPaintView;
                                duration = 5000;
                                i6 = paintView.currentAccount;
                                if (z7) {
                                    mediaEntity.type = b4;
                                    textPaintView = (TextPaintView) entityView;
                                    text = textPaintView.getText();
                                    if (text instanceof Spanned) {
                                        spanned = (Spanned) text;
                                        textPaintView2 = textPaintView;
                                        animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i10, text.length(), AnimatedEmojiSpan.class);
                                        if (animatedEmojiSpanArr != null) {
                                            i7 = 0;
                                            while (i7 < animatedEmojiSpanArr.length) {
                                                animatedEmojiSpan = animatedEmojiSpanArr[i7];
                                                AnimatedEmojiSpan[] animatedEmojiSpanArr2 = animatedEmojiSpanArr;
                                                documentFindDocument = animatedEmojiSpan.document;
                                                AnonymousClass7 anonymousClass9 = anonymousClass8;
                                                int i11 = i7;
                                                if (documentFindDocument == null) {
                                                    documentFindDocument = AnimatedEmojiDrawable.findDocument(i6, animatedEmojiSpan.getDocumentId());
                                                }
                                                if (documentFindDocument != null) {
                                                    AnimatedEmojiDrawable.getDocumentFetcher(i6).putDocument(documentFindDocument);
                                                }
                                                emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                                int i12 = childCount;
                                                int i13 = i3;
                                                emojiEntity3.document_id = animatedEmojiSpan.getDocumentId();
                                                emojiEntity3.document = documentFindDocument;
                                                emojiEntity3.offset = spanned.getSpanStart(animatedEmojiSpan);
                                                emojiEntity3.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity3.offset;
                                                emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                                i8 = 0;
                                                while (true) {
                                                    if (documentFindDocument == null) {
                                                        arrayList3 = documentFindDocument.thumbs;
                                                        if (arrayList3 == null && !arrayList3.isEmpty() && !new File(emojiEntity3.documentAbsolutePath).exists()) {
                                                            FileLoader fileLoader = FileLoader.getInstance(i6);
                                                            TLRPC.PhotoSize photoSize = documentFindDocument.thumbs.get(i8);
                                                            int i14 = i8;
                                                            z12 = true;
                                                            emojiEntity3.documentAbsolutePath = fileLoader.getPathToAttach(photoSize, true).getAbsolutePath();
                                                            i9 = i14 + 1;
                                                            if (i9 >= documentFindDocument.thumbs.size()) {
                                                                break;
                                                            }
                                                            i8 = i9;
                                                        }
                                                    }
                                                    z12 = true;
                                                    break;
                                                }
                                                zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z12);
                                                if (zIsAnimatedStickerDocument3 || isVideoStickerDocument(emojiEntity3.document)) {
                                                    byte b5 = emojiEntity3.subType;
                                                    if (zIsAnimatedStickerDocument3) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = 4;
                                                    }
                                                    emojiEntity3.subType = (byte) (b5 | b3);
                                                }
                                                if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                                    emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                                }
                                                mediaEntity.entities.add(emojiEntity3);
                                                if (documentFindDocument != null) {
                                                    BigInteger bigIntegerValueOf = BigInteger.valueOf(5000L);
                                                    paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf).divide(paintView.lcm.gcd(bigIntegerValueOf));
                                                }
                                                childCount = i12;
                                                anonymousClass8 = anonymousClass9;
                                                i3 = i13;
                                                i7 = i11 + 1;
                                                animatedEmojiSpanArr = animatedEmojiSpanArr2;
                                            }
                                        }
                                    } else {
                                        textPaintView2 = textPaintView;
                                    }
                                    anonymousClass7 = anonymousClass8;
                                    i4 = childCount;
                                    i5 = i3;
                                    mediaEntity.text = text.toString();
                                    mediaEntity.subType = (byte) textPaintView2.getType();
                                    mediaEntity.color = textPaintView2.getSwatch().color;
                                    mediaEntity.fontSize = textPaintView2.getTextSize();
                                    mediaEntity.textTypeface = textPaintView2.getTypeface();
                                    mediaEntity.textAlign = textPaintView2.getAlign();
                                } else {
                                    anonymousClass7 = anonymousClass8;
                                    i4 = childCount;
                                    i5 = i3;
                                    if (entityView instanceof StickerView) {
                                        mediaEntity.type = (byte) 0;
                                        stickerView = (StickerView) entityView;
                                        Size baseSize = stickerView.getBaseSize();
                                        mediaEntity.width = baseSize.width;
                                        mediaEntity.height = baseSize.height;
                                        mediaEntity.document = stickerView.getSticker();
                                        mediaEntity.parentObject = stickerView.getParentObject();
                                        sticker = stickerView.getSticker();
                                        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                        if (MessageObject.isAnimatedStickerDocument(sticker, true) || isVideoStickerDocument(sticker)) {
                                            boolean zIsAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                            mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                            duration = (!zIsAnimatedStickerDocument4 || isVideoStickerDocument(sticker)) ? stickerView.getDuration() : 5000L;
                                            if (duration != 0) {
                                                BigInteger bigIntegerValueOf2 = BigInteger.valueOf(duration);
                                                paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf2).divide(paintView.lcm.gcd(bigIntegerValueOf2));
                                            }
                                        }
                                        if (MessageObject.isTextColorEmoji(sticker)) {
                                            mediaEntity.color = -1;
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                        }
                                        if (stickerView.isMirrored()) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (entityView instanceof PhotoView) {
                                        photoView = (PhotoView) entityView;
                                        mediaEntity.type = (byte) 2;
                                        Size baseSize2 = photoView.getBaseSize();
                                        mediaEntity.width = baseSize2.width;
                                        mediaEntity.height = baseSize2.height;
                                        tLObject = photoView.object;
                                        if (tLObject instanceof TLRPC.Photo) {
                                            try {
                                                absolutePath = FileLoader.getInstance(i6).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
                                            } catch (Exception unused) {
                                                absolutePath = photoView.path;
                                            }
                                        } else {
                                            absolutePath = photoView.path;
                                        }
                                        mediaEntity.text = absolutePath;
                                        mediaEntity.crop = photoView.crop;
                                        if (photoView.isMirrored()) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else if (entityView instanceof LocationView) {
                                        locationView = (LocationView) entityView;
                                        mediaEntity.type = (byte) 3;
                                        mediaEntity.subType = (byte) locationView.getType();
                                        LocationMarker locationMarker = locationView.marker;
                                        mediaEntity.width = locationMarker.getWidth();
                                        mediaEntity.height = locationMarker.getHeight();
                                        mediaEntity.text = locationMarker.getText();
                                        if (locationView.hasColor()) {
                                            color3 = locationView.getColor();
                                        } else {
                                            color3 = 0;
                                        }
                                        mediaEntity.color = color3;
                                        mediaEntity.density = locationMarker.density;
                                        mediaEntity.media = locationView.location;
                                        TL_stories.MediaArea mediaArea3 = locationView.mediaArea;
                                        mediaEntity.mediaArea = mediaArea3;
                                        mediaArea3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        codeEmojiDocument2 = locationMarker.getCodeEmojiDocument();
                                        if (codeEmojiDocument2 != null) {
                                            emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity2.document_id = codeEmojiDocument2.id;
                                            emojiEntity2.document = codeEmojiDocument2;
                                            emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                            zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                            if (zIsAnimatedStickerDocument2 || isVideoStickerDocument(emojiEntity2.document)) {
                                                byte b6 = emojiEntity2.subType;
                                                if (zIsAnimatedStickerDocument2) {
                                                    b2 = 1;
                                                } else {
                                                    b2 = 4;
                                                }
                                                emojiEntity2.subType = (byte) (b6 | b2);
                                            }
                                            mediaEntity.entities.add(emojiEntity2);
                                        }
                                    } else if (entityView instanceof WeatherView) {
                                        weatherView = (WeatherView) entityView;
                                        mediaEntity.type = (byte) 8;
                                        mediaEntity.subType = (byte) weatherView.getType();
                                        LocationMarker locationMarker2 = weatherView.marker;
                                        mediaEntity.width = locationMarker2.getWidth();
                                        mediaEntity.height = locationMarker2.getHeight();
                                        mediaEntity.text = locationMarker2.getText();
                                        if (weatherView.hasColor()) {
                                            color2 = weatherView.getColor();
                                        } else {
                                            color2 = 0;
                                        }
                                        mediaEntity.color = color2;
                                        mediaEntity.density = locationMarker2.density;
                                        Weather.State state = weatherView.weather;
                                        mediaEntity.weather = state;
                                        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                        tL_mediaAreaWeather.emoji = state.emoji;
                                        tL_mediaAreaWeather.temperature_c = Math.round(state.temperature);
                                        tL_mediaAreaWeather.color = locationMarker2.outlinePaint.getColor();
                                        mediaEntity.mediaArea = tL_mediaAreaWeather;
                                        tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        codeEmojiDocument = locationMarker2.getCodeEmojiDocument();
                                        if (codeEmojiDocument != null) {
                                            emojiEntity = new VideoEditedInfo.EmojiEntity();
                                            emojiEntity.document_id = codeEmojiDocument.id;
                                            emojiEntity.document = codeEmojiDocument;
                                            emojiEntity.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                            zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                            if (zIsAnimatedStickerDocument || isVideoStickerDocument(emojiEntity.document)) {
                                                byte b7 = emojiEntity.subType;
                                                if (zIsAnimatedStickerDocument) {
                                                    b = 1;
                                                } else {
                                                    b = 4;
                                                }
                                                emojiEntity.subType = (byte) (b7 | b);
                                            }
                                            mediaEntity.entities.add(emojiEntity);
                                        }
                                        i4 = i4;
                                        bitmap = bitmap;
                                        childAt = childAt;
                                        z8 = false;
                                        z9 = false;
                                        imageReceiver = null;
                                        arrayList.add(mediaEntity);
                                        scaleX = childAt.getScaleX();
                                        scaleY = childAt.getScaleY();
                                        x = childAt.getX();
                                        y = childAt.getY();
                                        mediaEntity.viewWidth = childAt.getWidth();
                                        mediaEntity.viewHeight = childAt.getHeight();
                                        mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (entityView instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView2 = (MessageEntityView) entityView;
                                            RectF rectF = AndroidUtilities.rectTmp;
                                            bubbleBounds = messageEntityView2.getBubbleBounds(rectF);
                                            MessageEntityView.AnonymousClass1 anonymousClass1 = messageEntityView2.container;
                                            rectF.offset(anonymousClass1.getX(), anonymousClass1.getY());
                                            MessageEntityView.AnonymousClass2 anonymousClass5 = messageEntityView2.listView;
                                            rectF.offset(anonymousClass5.getX(), anonymousClass5.getY());
                                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaEntity.mediaArea.coordinates;
                                            float fCenterX = (((rectF.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                            z10 = z8;
                                            mediaAreaCoordinates2.x = fCenterX;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                        } else {
                                            z10 = z8;
                                            if (entityView instanceof StickerView) {
                                                imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f3 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f3;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f2 - (f3 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f4 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f4;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f - (f4 / 2.0f);
                                                }
                                            } else {
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea == null && (((z11 = entityView instanceof LocationView)) || (entityView instanceof WeatherView) || (entityView instanceof LinkView) || (entityView instanceof ReactionWidgetEntityView))) {
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaArea.coordinates;
                                                    float f5 = mediaEntity.x;
                                                    float f6 = mediaEntity.width;
                                                    mediaAreaCoordinates3.x = ((f6 / 2.0f) + f5) * 100.0f;
                                                    mediaAreaCoordinates3.y = ((mediaEntity.height / 2.0f) + mediaEntity.y) * 100.0f;
                                                    if (z11) {
                                                        LocationMarker locationMarker3 = ((LocationView) entityView).marker;
                                                        mediaAreaCoordinates3.w = OKLCH.m$1(locationMarker3.padx * 2 * scaleX, anonymousClass7.getMeasuredWidth(), f6, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = OKLCH.m$1(locationMarker3.pady * 2 * scaleY, anonymousClass7.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (entityView instanceof WeatherView) {
                                                        LocationMarker locationMarker4 = ((WeatherView) entityView).marker;
                                                        mediaAreaCoordinates3.w = OKLCH.m$1(locationMarker4.padx * 2 * scaleX, anonymousClass7.getMeasuredWidth(), f6, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = OKLCH.m$1(locationMarker4.pady * 2 * scaleY, anonymousClass7.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (entityView instanceof LinkView) {
                                                        LinkPreview linkPreview2 = ((LinkView) entityView).marker;
                                                        mediaAreaCoordinates3.w = OKLCH.m$1(linkPreview2.padx * 2 * scaleX, anonymousClass7.getMeasuredWidth(), f6, 100.0f);
                                                        mediaEntity.mediaArea.coordinates.h = OKLCH.m$1(linkPreview2.pady * 2 * scaleY, anonymousClass7.getMeasuredHeight(), mediaEntity.height, 100.0f);
                                                    } else if (entityView instanceof ReactionWidgetEntityView) {
                                                        ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                                                        float padding = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / anonymousClass7.getMeasuredWidth();
                                                        float padding2 = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / anonymousClass7.getMeasuredHeight();
                                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates4 = mediaEntity.mediaArea.coordinates;
                                                        mediaAreaCoordinates4.w = (mediaEntity.width - padding) * 100.0f;
                                                        mediaAreaCoordinates4.h = (mediaEntity.height - padding2) * 100.0f;
                                                    }
                                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                    if (z11) {
                                                        radius = ((LocationView) entityView).marker.getRadius();
                                                    } else if (entityView instanceof WeatherView) {
                                                        radius = ((WeatherView) entityView).marker.getRadius();
                                                    } else if (entityView instanceof LinkView) {
                                                        radius = ((LinkView) entityView).marker.getRadius();
                                                    }
                                                    bubbleBounds = radius;
                                                }
                                            }
                                            bubbleBounds = -1.0d;
                                        }
                                        mediaArea2 = mediaEntity.mediaArea;
                                        if (mediaArea2 != null && (mediaAreaCoordinates = mediaArea2.coordinates) != null && bubbleBounds > 0.0d) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                        }
                                        z5 = z9;
                                        z6 = z10;
                                    } else {
                                        if (entityView instanceof LinkView) {
                                            linkView = (LinkView) entityView;
                                            mediaEntity.type = (byte) 7;
                                            linkPreview = linkView.marker;
                                            if (linkPreview.withPreview()) {
                                                mediaEntity.subType = (byte) linkPreview.getPreviewType();
                                            } else {
                                                mediaEntity.subType = (byte) linkView.getType();
                                            }
                                            mediaEntity.width = linkPreview.getWidth();
                                            mediaEntity.height = linkPreview.getHeight();
                                            if (linkView.hasColor()) {
                                                color = linkView.getColor();
                                            } else {
                                                color = 0;
                                            }
                                            mediaEntity.color = color;
                                            mediaEntity.density = linkPreview.density;
                                            mediaEntity.linkSettings = linkView.link;
                                            if (linkPreview.hasPhoto) {
                                                linkPreview.pushPhotoToCache();
                                                LinkPreview.WebPagePreview webPagePreview2 = mediaEntity.linkSettings;
                                                webPagePreview2.flags |= 4;
                                                webPagePreview2.photoSize = linkPreview.getPhotoSide();
                                            }
                                            tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                            mediaEntity.mediaArea = tL_mediaAreaUrl;
                                            webPagePreview = linkView.link;
                                            if (webPagePreview == null) {
                                                webPage = webPagePreview.webpage;
                                                if (webPage != null || TextUtils.isEmpty(webPage.url)) {
                                                    str = linkView.link.url;
                                                } else {
                                                    str = linkView.link.webpage.url;
                                                }
                                                tL_mediaAreaUrl.url = str;
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                        } else {
                                            if (entityView instanceof ReactionWidgetEntityView) {
                                                ReactionWidgetEntityView reactionWidgetEntityView2 = (ReactionWidgetEntityView) entityView;
                                                mediaEntity.type = (byte) 4;
                                                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                                mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                                currentReaction = reactionWidgetEntityView2.getCurrentReaction();
                                                if (currentReaction.emojicon != null) {
                                                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                                                    tL_reactionEmoji.emoticon = currentReaction.emojicon;
                                                    reaction = tL_reactionEmoji;
                                                } else {
                                                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                                                    tL_reactionCustomEmoji.document_id = currentReaction.documentId;
                                                    reaction = tL_reactionCustomEmoji;
                                                }
                                                tL_mediaAreaSuggestedReaction.reaction = reaction;
                                                mediaEntity.mediaArea.dark = reactionWidgetEntityView2.isDark();
                                                mediaEntity.mediaArea.flipped = reactionWidgetEntityView2.isMirrored();
                                                mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            } else {
                                                if (entityView instanceof RoundView) {
                                                    roundView = (RoundView) entityView;
                                                    Size baseSize3 = roundView.getBaseSize();
                                                    mediaEntity.width = baseSize3.width;
                                                    mediaEntity.height = baseSize3.height;
                                                    mediaEntity.type = (byte) 5;
                                                    if (storyEntry != null) {
                                                        mediaEntity.text = storyEntry.round.getAbsolutePath();
                                                        mediaEntity.roundOffset = storyEntry.roundOffset;
                                                        long j2 = storyEntry.roundDuration;
                                                        mediaEntity.roundDuration = j2;
                                                        float f7 = j2;
                                                        mediaEntity.roundLeft = (long) (storyEntry.roundLeft * f7);
                                                        mediaEntity.roundRight = (long) (storyEntry.roundRight * f7);
                                                    }
                                                    mediaEntity.subType = (byte) 4;
                                                    if (roundView.isMirrored()) {
                                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                                    }
                                                } else if (entityView instanceof MessageEntityView) {
                                                    messageEntityView = (MessageEntityView) entityView;
                                                    mediaEntity.type = (byte) 6;
                                                    int width = messageEntityView.getWidth();
                                                    mediaEntity.viewWidth = width;
                                                    mediaEntity.width = width;
                                                    int height = messageEntityView.getHeight();
                                                    mediaEntity.viewHeight = height;
                                                    mediaEntity.height = height;
                                                    arrayList2 = messageEntityView.messageObjects;
                                                    if (arrayList2.size() > 0) {
                                                        messageObject = (MessageObject) arrayList2.get(0);
                                                    } else {
                                                        messageObject = null;
                                                    }
                                                    anonymousClass3 = messageEntityView.listView;
                                                    if (messageObject != null || (message = messageObject.messageOwner) == null) {
                                                        j = 0;
                                                    } else {
                                                        TLRPC.MessageAction messageAction = message.action;
                                                        j = 0;
                                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                            TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                            mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                            tL_mediaAreaStarGift.slug = starGift.slug;
                                                            tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 >= anonymousClass3.getChildCount()) {
                                                                    chatActionCell = null;
                                                                    break;
                                                                }
                                                                View childAt3 = anonymousClass3.getChildAt(i15);
                                                                if (childAt3 instanceof ChatActionCell) {
                                                                    chatActionCell = (ChatActionCell) childAt3;
                                                                    break;
                                                                }
                                                                i15++;
                                                            }
                                                            if (chatActionCell == null || (starGiftUniqueActionLayout = chatActionCell.starGiftLayout) == null || (imageReceiver2 = starGiftUniqueActionLayout.imageReceiver) == null) {
                                                                i4 = i4;
                                                                bitmap = bitmap;
                                                                childAt = childAt;
                                                            } else {
                                                                imageReceiver2.setVisible(false, false);
                                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                                if (stargiftattributemodel != null) {
                                                                    float fDp = AndroidUtilities.dp(110.0f);
                                                                    float centerX = imageReceiver2.getCenterX() + chatActionCell.getX() + anonymousClass3.getX() + chatActionCell.starGiftLayoutX;
                                                                    float centerY = imageReceiver2.getCenterY() + chatActionCell.getY() + anonymousClass3.getY() + chatActionCell.starGiftLayoutY;
                                                                    imageReceiver3 = imageReceiver2;
                                                                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                                    mediaEntity2.type = (byte) 0;
                                                                    mediaEntity2.width = fDp;
                                                                    mediaEntity2.height = fDp;
                                                                    TLRPC.Document document = stargiftattributemodel.document;
                                                                    mediaEntity2.document = document;
                                                                    mediaEntity2.parentObject = starGift;
                                                                    mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                                                                    if (MessageObject.isAnimatedStickerDocument(document, true) || isVideoStickerDocument(document)) {
                                                                        boolean zIsAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document, true);
                                                                        mediaEntity2.subType = (byte) (mediaEntity2.subType | (zIsAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                        RLottieDrawable lottieAnimation = imageReceiver3.getLottieAnimation();
                                                                        if (lottieAnimation != null && (zIsAnimatedStickerDocument5 || isVideoStickerDocument(document))) {
                                                                            duration = lottieAnimation.getDuration();
                                                                        }
                                                                        if (duration != 0) {
                                                                            BigInteger bigIntegerValueOf3 = BigInteger.valueOf(duration);
                                                                            paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf3).divide(paintView.lcm.gcd(bigIntegerValueOf3));
                                                                        }
                                                                    }
                                                                    float scaleX2 = childAt.getScaleX();
                                                                    float scaleY2 = childAt.getScaleY();
                                                                    float x2 = childAt.getX();
                                                                    float y2 = childAt.getY();
                                                                    int i16 = (int) fDp;
                                                                    mediaEntity2.viewWidth = i16;
                                                                    mediaEntity2.viewHeight = i16;
                                                                    mediaEntity2.width = (fDp * scaleX2) / anonymousClass7.getMeasuredWidth();
                                                                    mediaEntity2.height = (fDp * scaleY2) / anonymousClass7.getMeasuredHeight();
                                                                    mediaEntity2.x = (childAt.getWidth() / 2.0f) + x2;
                                                                    mediaEntity2.y = (childAt.getHeight() / 2.0f) + y2;
                                                                    float fM = TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX2, centerX * scaleX2);
                                                                    float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY2, centerY * scaleY2);
                                                                    childAt = childAt;
                                                                    float rotation = (float) (((double) (childAt.getRotation() / 180.0f)) * 3.141592653589793d);
                                                                    double d = mediaEntity2.x;
                                                                    double d2 = fM;
                                                                    double d3 = rotation;
                                                                    double dCos = Math.cos(d3) * d2;
                                                                    double d4 = fM2;
                                                                    mediaEntity2.x = (float) ((dCos - (Math.sin(d3) * d4)) + d);
                                                                    float fCos = (float) ((Math.cos(d3) * d4) + (Math.sin(d3) * d2) + ((double) mediaEntity2.y));
                                                                    float f8 = (-fDp) / 2.0f;
                                                                    float f9 = (f8 * scaleX2) + mediaEntity2.x;
                                                                    mediaEntity2.x = f9;
                                                                    mediaEntity2.y = (f8 * scaleY2) + fCos;
                                                                    mediaEntity2.x = f9 / anonymousClass7.getMeasuredWidth();
                                                                    mediaEntity2.y /= anonymousClass7.getMeasuredHeight();
                                                                    mediaEntity2.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                                                    mediaEntity2.scale = scaleX2;
                                                                    arrayList.add(mediaEntity2);
                                                                } else {
                                                                    imageReceiver3 = imageReceiver2;
                                                                    childAt = childAt;
                                                                }
                                                                imageReceiver = imageReceiver3;
                                                            }
                                                            if (z3) {
                                                                if (storyEntry != null && storyEntry.isVideo) {
                                                                    matrix = storyEntry.matrix;
                                                                    matrix.reset();
                                                                    if (anonymousClass3.getChildCount() == 1) {
                                                                        childAt2 = anonymousClass3.getChildAt(0);
                                                                        photoImage = childAt2 instanceof ChatMessageCell ? ((ChatMessageCell) childAt2).getPhotoImage() : null;
                                                                        if (photoImage != null) {
                                                                            float fMax = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                            matrix.postScale(fMax, fMax);
                                                                            matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax) / 2.0f));
                                                                            MessageEntityView.AnonymousClass1 anonymousClass6 = messageEntityView.container;
                                                                            matrix.postTranslate(anonymousClass6.getX(), anonymousClass6.getY());
                                                                            matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                            matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                            matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                            matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                            matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                            matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                            matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                        }
                                                                    } else {
                                                                        childAt2 = null;
                                                                    }
                                                                    if (photoImage != null) {
                                                                        float fMax2 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                        matrix.postScale(fMax2, fMax2);
                                                                        matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax2) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax2) / 2.0f));
                                                                        MessageEntityView.AnonymousClass1 anonymousClass10 = messageEntityView.container;
                                                                        matrix.postTranslate(anonymousClass10.getX(), anonymousClass10.getY());
                                                                        matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                        matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                        matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                        matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                        matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                        matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                        matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                    }
                                                                }
                                                                z8 = false;
                                                            } else {
                                                                z8 = true;
                                                            }
                                                            z9 = true;
                                                        }
                                                        imageReceiver = null;
                                                        if (z3) {
                                                            z8 = true;
                                                        } else {
                                                            if (storyEntry != null) {
                                                                matrix = storyEntry.matrix;
                                                                matrix.reset();
                                                                if (anonymousClass3.getChildCount() == 1) {
                                                                    childAt2 = anonymousClass3.getChildAt(0);
                                                                    if (childAt2 instanceof ChatMessageCell) {
                                                                    }
                                                                    if (photoImage != null) {
                                                                        float fMax3 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                        matrix.postScale(fMax3, fMax3);
                                                                        matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax3) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax3) / 2.0f));
                                                                        MessageEntityView.AnonymousClass1 anonymousClass11 = messageEntityView.container;
                                                                        matrix.postTranslate(anonymousClass11.getX(), anonymousClass11.getY());
                                                                        matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                        matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                        matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                        matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                        matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                        matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                        matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                    }
                                                                } else {
                                                                    childAt2 = null;
                                                                }
                                                                if (photoImage != null) {
                                                                    float fMax4 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                    matrix.postScale(fMax4, fMax4);
                                                                    matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax4) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax4) / 2.0f));
                                                                    MessageEntityView.AnonymousClass1 anonymousClass12 = messageEntityView.container;
                                                                    matrix.postTranslate(anonymousClass12.getX(), anonymousClass12.getY());
                                                                    matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                    matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                    matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                    matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                    matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                    matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                    matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                }
                                                            }
                                                            z8 = false;
                                                        }
                                                        z9 = true;
                                                    }
                                                    i4 = i4;
                                                    bitmap = bitmap;
                                                    childAt = childAt;
                                                    if (messageObject != null) {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                        tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                        MessagesController messagesController = MessagesController.getInstance(i6);
                                                        boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
                                                        if (boolUseForwardForRepost == null) {
                                                            dialogId = j;
                                                        } else if (boolUseForwardForRepost.booleanValue()) {
                                                            dialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
                                                        } else {
                                                            dialogId = messageObject.getDialogId();
                                                        }
                                                        tL_inputMediaAreaChannelPost2.channel = messagesController.getInputChannel(-dialogId);
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                        boolUseForwardForRepost2 = StoryEntry.useForwardForRepost(messageObject);
                                                        if (boolUseForwardForRepost2 == null) {
                                                            id = 0;
                                                        } else if (boolUseForwardForRepost2.booleanValue()) {
                                                            id = messageObject.messageOwner.fwd_from.channel_post;
                                                        } else {
                                                            id = messageObject.getId();
                                                        }
                                                        tL_inputMediaAreaChannelPost3.msg_id = id;
                                                    } else {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost4 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mediaEntity.mediaArea = tL_inputMediaAreaChannelPost4;
                                                        tL_inputMediaAreaChannelPost4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    }
                                                    imageReceiver = null;
                                                    if (z3) {
                                                        z8 = true;
                                                    } else {
                                                        if (storyEntry != null) {
                                                            matrix = storyEntry.matrix;
                                                            matrix.reset();
                                                            if (anonymousClass3.getChildCount() == 1) {
                                                                childAt2 = anonymousClass3.getChildAt(0);
                                                                if (childAt2 instanceof ChatMessageCell) {
                                                                }
                                                                if (photoImage != null) {
                                                                    float fMax5 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                    matrix.postScale(fMax5, fMax5);
                                                                    matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax5) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax5) / 2.0f));
                                                                    MessageEntityView.AnonymousClass1 anonymousClass13 = messageEntityView.container;
                                                                    matrix.postTranslate(anonymousClass13.getX(), anonymousClass13.getY());
                                                                    matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                    matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                    matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                    matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                    matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                    matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                    matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                }
                                                            } else {
                                                                childAt2 = null;
                                                            }
                                                            if (photoImage != null) {
                                                                float fMax6 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                                matrix.postScale(fMax6, fMax6);
                                                                matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax6) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax6) / 2.0f));
                                                                MessageEntityView.AnonymousClass1 anonymousClass14 = messageEntityView.container;
                                                                matrix.postTranslate(anonymousClass14.getX(), anonymousClass14.getY());
                                                                matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                                matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                                matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                                matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                            }
                                                        }
                                                        z8 = false;
                                                    }
                                                    z9 = true;
                                                }
                                                arrayList.add(mediaEntity);
                                                scaleX = childAt.getScaleX();
                                                scaleY = childAt.getScaleY();
                                                x = childAt.getX();
                                                y = childAt.getY();
                                                mediaEntity.viewWidth = childAt.getWidth();
                                                mediaEntity.viewHeight = childAt.getHeight();
                                                mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                                mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                                mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                                mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                                mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                                mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                                mediaEntity.scale = scaleX;
                                                if (entityView instanceof MessageEntityView) {
                                                    MessageEntityView messageEntityView3 = (MessageEntityView) entityView;
                                                    RectF rectF2 = AndroidUtilities.rectTmp;
                                                    bubbleBounds = messageEntityView3.getBubbleBounds(rectF2);
                                                    MessageEntityView.AnonymousClass1 anonymousClass15 = messageEntityView3.container;
                                                    rectF2.offset(anonymousClass15.getX(), anonymousClass15.getY());
                                                    MessageEntityView.AnonymousClass2 anonymousClass16 = messageEntityView3.listView;
                                                    rectF2.offset(anonymousClass16.getX(), anonymousClass16.getY());
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates5 = mediaEntity.mediaArea.coordinates;
                                                    float fCenterX2 = (((rectF2.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                                    z10 = z8;
                                                    mediaAreaCoordinates5.x = fCenterX2;
                                                    mediaEntity.mediaArea.coordinates.y = (((rectF2.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.w = ((rectF2.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = ((rectF2.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                } else {
                                                    z10 = z8;
                                                    if (entityView instanceof StickerView) {
                                                        imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                        f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                        f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                        measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                                        if (imageAspectRatio > 1.0f) {
                                                            float f10 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                            mediaEntity.height = f10;
                                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                            mediaEntity.y = f2 - (f10 / 2.0f);
                                                        } else if (imageAspectRatio < 1.0f) {
                                                            float f11 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                            mediaEntity.width = f11;
                                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                            mediaEntity.x = f - (f11 / 2.0f);
                                                        }
                                                    } else {
                                                        mediaArea = mediaEntity.mediaArea;
                                                        if (mediaArea == null) {
                                                        }
                                                    }
                                                    bubbleBounds = -1.0d;
                                                }
                                                mediaArea2 = mediaEntity.mediaArea;
                                                if (mediaArea2 != null) {
                                                    mediaAreaCoordinates.flags |= 1;
                                                    mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                                }
                                                z5 = z9;
                                                z6 = z10;
                                            }
                                            i4 = i4;
                                            z8 = true;
                                            z9 = true;
                                            imageReceiver = null;
                                            arrayList.add(mediaEntity);
                                            scaleX = childAt.getScaleX();
                                            scaleY = childAt.getScaleY();
                                            x = childAt.getX();
                                            y = childAt.getY();
                                            mediaEntity.viewWidth = childAt.getWidth();
                                            mediaEntity.viewHeight = childAt.getHeight();
                                            mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                            mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                            mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                            mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                            mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (entityView instanceof MessageEntityView) {
                                                MessageEntityView messageEntityView4 = (MessageEntityView) entityView;
                                                RectF rectF3 = AndroidUtilities.rectTmp;
                                                bubbleBounds = messageEntityView4.getBubbleBounds(rectF3);
                                                MessageEntityView.AnonymousClass1 anonymousClass17 = messageEntityView4.container;
                                                rectF3.offset(anonymousClass17.getX(), anonymousClass17.getY());
                                                MessageEntityView.AnonymousClass2 anonymousClass18 = messageEntityView4.listView;
                                                rectF3.offset(anonymousClass18.getX(), anonymousClass18.getY());
                                                TL_stories.MediaAreaCoordinates mediaAreaCoordinates6 = mediaEntity.mediaArea.coordinates;
                                                float fCenterX3 = (((rectF3.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                                z10 = z8;
                                                mediaAreaCoordinates6.x = fCenterX3;
                                                mediaEntity.mediaArea.coordinates.y = (((rectF3.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.w = ((rectF3.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.h = ((rectF3.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                            } else {
                                                z10 = z8;
                                                if (entityView instanceof StickerView) {
                                                    imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                    f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                    f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                    measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                                    if (imageAspectRatio > 1.0f) {
                                                        float f12 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                        mediaEntity.height = f12;
                                                        mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                        mediaEntity.y = f2 - (f12 / 2.0f);
                                                    } else if (imageAspectRatio < 1.0f) {
                                                        float f13 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                        mediaEntity.width = f13;
                                                        mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                        mediaEntity.x = f - (f13 / 2.0f);
                                                    }
                                                } else {
                                                    mediaArea = mediaEntity.mediaArea;
                                                    if (mediaArea == null) {
                                                    }
                                                }
                                                bubbleBounds = -1.0d;
                                            }
                                            mediaArea2 = mediaEntity.mediaArea;
                                            if (mediaArea2 != null) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                            }
                                            z5 = z9;
                                            z6 = z10;
                                        }
                                        i4 = i4;
                                        bitmap2 = bitmap;
                                    }
                                }
                                i4 = i4;
                                z8 = false;
                                z9 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x = childAt.getX();
                                y = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (entityView instanceof MessageEntityView) {
                                    MessageEntityView messageEntityView5 = (MessageEntityView) entityView;
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    bubbleBounds = messageEntityView5.getBubbleBounds(rectF4);
                                    MessageEntityView.AnonymousClass1 anonymousClass19 = messageEntityView5.container;
                                    rectF4.offset(anonymousClass19.getX(), anonymousClass19.getY());
                                    MessageEntityView.AnonymousClass2 anonymousClass110 = messageEntityView5.listView;
                                    rectF4.offset(anonymousClass110.getX(), anonymousClass110.getY());
                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates7 = mediaEntity.mediaArea.coordinates;
                                    float fCenterX4 = (((rectF4.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                    z10 = z8;
                                    mediaAreaCoordinates7.x = fCenterX4;
                                    mediaEntity.mediaArea.coordinates.y = (((rectF4.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.w = ((rectF4.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF4.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                } else {
                                    z10 = z8;
                                    if (entityView instanceof StickerView) {
                                        imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                        f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                        f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                        measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f14 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f14;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.y = f2 - (f14 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f15 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f15;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.x = f - (f15 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    bubbleBounds = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                }
                                z5 = z9;
                                z6 = z10;
                            } else {
                                anonymousClass7 = anonymousClass8;
                                bitmap = bitmap;
                                i4 = childCount;
                                i5 = i3;
                                childAt = childAt;
                                z5 = true;
                                z6 = false;
                                imageReceiver = null;
                            }
                            if (z5 || (!(z2 || (z3 && mediaEntity.type == 6)) || bitmap == null)) {
                                bitmap2 = bitmap;
                            } else {
                                bitmap2 = bitmap;
                                Canvas canvas = new Canvas(bitmap2);
                                float width2 = bitmap2.getWidth() / anonymousClass7.getMeasuredWidth();
                                int i17 = 0;
                                while (i17 < 2) {
                                    Canvas canvas2 = i17 == 0 ? canvas : null;
                                    if (canvas2 == null || (i17 == 0 && z6)) {
                                        view = childAt;
                                    } else {
                                        canvas2.save();
                                        canvas2.scale(width2, width2);
                                        canvas2.translate(mediaEntity.x * anonymousClass7.getMeasuredWidth(), mediaEntity.y * anonymousClass7.getMeasuredHeight());
                                        canvas2.scale(childAt.getScaleX(), childAt.getScaleY());
                                        canvas2.rotate(childAt.getRotation(), ((mediaEntity.width / 2.0f) / childAt.getScaleX()) * anonymousClass7.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / childAt.getScaleY()) * anonymousClass7.getMeasuredHeight());
                                        view = childAt;
                                        if ((view instanceof TextPaintView) && view.getHeight() > 0 && view.getWidth() > 0) {
                                            int scaleX3 = (int) (view.getScaleX() * view.getWidth());
                                            int scaleY3 = (int) (view.getScaleY() * view.getHeight());
                                            Bitmap bitmapCreateBitmap2 = Bitmaps.createBitmap(scaleX3, scaleY3, Bitmap.Config.ARGB_8888);
                                            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
                                            canvas3.scale(view.getScaleX(), view.getScaleY());
                                            view.draw(canvas3);
                                            canvas2.scale(1.0f / view.getScaleX(), 1.0f / view.getScaleY());
                                            canvas2.drawBitmap(bitmapCreateBitmap2, (Rect) null, new Rect(0, 0, scaleX3, scaleY3), new Paint(3));
                                            try {
                                                canvas3.setBitmap(null);
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            bitmapCreateBitmap2.recycle();
                                        } else if (view instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView6 = (MessageEntityView) view;
                                            boolean z13 = true;
                                            messageEntityView6.clipVideoMessageForBitmap = true;
                                            int i18 = 0;
                                            while (true) {
                                                anonymousClass2 = messageEntityView6.listView;
                                                if (i18 >= anonymousClass2.getChildCount()) {
                                                    break;
                                                }
                                                View childAt4 = anonymousClass2.getChildAt(i18);
                                                if (childAt4 instanceof ChatMessageCell) {
                                                    ((ChatMessageCell) childAt4).drawingToBitmap = z13;
                                                }
                                                i18++;
                                                z13 = true;
                                            }
                                            view.draw(canvas2);
                                            boolean z14 = false;
                                            messageEntityView6.clipVideoMessageForBitmap = false;
                                            int i19 = 0;
                                            while (i19 < anonymousClass2.getChildCount()) {
                                                View childAt5 = anonymousClass2.getChildAt(i19);
                                                if (childAt5 instanceof ChatMessageCell) {
                                                    ((ChatMessageCell) childAt5).drawingToBitmap = z14;
                                                }
                                                i19++;
                                                z14 = false;
                                            }
                                        } else {
                                            view.draw(canvas2);
                                        }
                                        canvas2.restore();
                                    }
                                    i17++;
                                    childAt = view;
                                }
                                if (imageReceiver != null) {
                                    imageReceiver.setVisible(true, false);
                                }
                            }
                            i3 = i5 + 1;
                            paintView = this;
                            bitmap = bitmap2;
                            anonymousClass8 = anonymousClass7;
                            childCount = i4;
                            i10 = 0;
                            b4 = 1;
                        } else {
                            anonymousClass7 = anonymousClass8;
                            bitmap2 = bitmap;
                            i4 = childCount;
                            i5 = i3;
                        }
                        i3 = i5 + 1;
                        paintView = this;
                        bitmap = bitmap2;
                        anonymousClass8 = anonymousClass7;
                        childCount = i4;
                        i10 = 0;
                        b4 = 1;
                    }
                }
                return bitmap;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, anonymousClass8.getMeasuredWidth()), Math.max(1, anonymousClass8.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        }
        bitmap = bitmapCreateBitmap;
        paintView.lcm = BigInteger.ONE;
        i2 = 0;
        while (i < anonymousClass8.getChildCount()) {
            if (!(anonymousClass8.getChildAt(i) instanceof EntityView)) {
                i2++;
            }
        }
        if (i2 > 0) {
            childCount = anonymousClass8.getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                childAt = anonymousClass8.getChildAt(i3);
                if (childAt instanceof EntityView) {
                    anonymousClass7 = anonymousClass8;
                    bitmap2 = bitmap;
                    i4 = childCount;
                    i5 = i3;
                } else {
                    entityView = (EntityView) childAt;
                    entityView.getPosition();
                    mediaEntity = new VideoEditedInfo.MediaEntity();
                    if (arrayList != 0) {
                        z7 = entityView instanceof TextPaintView;
                        duration = 5000;
                        i6 = paintView.currentAccount;
                        if (z7) {
                            mediaEntity.type = b4;
                            textPaintView = (TextPaintView) entityView;
                            text = textPaintView.getText();
                            if (text instanceof Spanned) {
                                spanned = (Spanned) text;
                                textPaintView2 = textPaintView;
                                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i10, text.length(), AnimatedEmojiSpan.class);
                                if (animatedEmojiSpanArr != null) {
                                    i7 = 0;
                                    while (i7 < animatedEmojiSpanArr.length) {
                                        animatedEmojiSpan = animatedEmojiSpanArr[i7];
                                        AnimatedEmojiSpan[] animatedEmojiSpanArr3 = animatedEmojiSpanArr;
                                        documentFindDocument = animatedEmojiSpan.document;
                                        AnonymousClass7 anonymousClass20 = anonymousClass8;
                                        int i110 = i7;
                                        if (documentFindDocument == null) {
                                            documentFindDocument = AnimatedEmojiDrawable.findDocument(i6, animatedEmojiSpan.getDocumentId());
                                        }
                                        if (documentFindDocument != null) {
                                            AnimatedEmojiDrawable.getDocumentFetcher(i6).putDocument(documentFindDocument);
                                        }
                                        emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                        int i111 = childCount;
                                        int i112 = i3;
                                        emojiEntity3.document_id = animatedEmojiSpan.getDocumentId();
                                        emojiEntity3.document = documentFindDocument;
                                        emojiEntity3.offset = spanned.getSpanStart(animatedEmojiSpan);
                                        emojiEntity3.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity3.offset;
                                        emojiEntity3.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                        i8 = 0;
                                        while (true) {
                                            if (documentFindDocument == null) {
                                                arrayList3 = documentFindDocument.thumbs;
                                                if (arrayList3 == null) {
                                                }
                                            }
                                            z12 = true;
                                            i8 = i9;
                                        }
                                        zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z12);
                                        if (zIsAnimatedStickerDocument3) {
                                            byte b8 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument3) {
                                                b3 = 1;
                                            } else {
                                                b3 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b8 | b3);
                                        } else {
                                            byte b9 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument3) {
                                                b3 = 1;
                                            } else {
                                                b3 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b9 | b3);
                                        }
                                        if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                            emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                        }
                                        mediaEntity.entities.add(emojiEntity3);
                                        if (documentFindDocument != null) {
                                            BigInteger bigIntegerValueOf4 = BigInteger.valueOf(5000L);
                                            paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf4).divide(paintView.lcm.gcd(bigIntegerValueOf4));
                                        }
                                        childCount = i111;
                                        anonymousClass8 = anonymousClass20;
                                        i3 = i112;
                                        i7 = i110 + 1;
                                        animatedEmojiSpanArr = animatedEmojiSpanArr3;
                                    }
                                }
                            } else {
                                textPaintView2 = textPaintView;
                            }
                            anonymousClass7 = anonymousClass8;
                            i4 = childCount;
                            i5 = i3;
                            mediaEntity.text = text.toString();
                            mediaEntity.subType = (byte) textPaintView2.getType();
                            mediaEntity.color = textPaintView2.getSwatch().color;
                            mediaEntity.fontSize = textPaintView2.getTextSize();
                            mediaEntity.textTypeface = textPaintView2.getTypeface();
                            mediaEntity.textAlign = textPaintView2.getAlign();
                        } else {
                            anonymousClass7 = anonymousClass8;
                            i4 = childCount;
                            i5 = i3;
                            if (entityView instanceof StickerView) {
                                mediaEntity.type = (byte) 0;
                                stickerView = (StickerView) entityView;
                                Size baseSize4 = stickerView.getBaseSize();
                                mediaEntity.width = baseSize4.width;
                                mediaEntity.height = baseSize4.height;
                                mediaEntity.document = stickerView.getSticker();
                                mediaEntity.parentObject = stickerView.getParentObject();
                                sticker = stickerView.getSticker();
                                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                if (MessageObject.isAnimatedStickerDocument(sticker, true)) {
                                    boolean zIsAnimatedStickerDocument6 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument6 ? (byte) 1 : (byte) 4));
                                    if (zIsAnimatedStickerDocument6) {
                                    }
                                    if (duration != 0) {
                                        BigInteger bigIntegerValueOf5 = BigInteger.valueOf(duration);
                                        paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf5).divide(paintView.lcm.gcd(bigIntegerValueOf5));
                                    }
                                } else {
                                    boolean zIsAnimatedStickerDocument7 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument7 ? (byte) 1 : (byte) 4));
                                    if (zIsAnimatedStickerDocument7) {
                                    }
                                    if (duration != 0) {
                                        BigInteger bigIntegerValueOf6 = BigInteger.valueOf(duration);
                                        paintView.lcm = paintView.lcm.multiply(bigIntegerValueOf6).divide(paintView.lcm.gcd(bigIntegerValueOf6));
                                    }
                                }
                                if (MessageObject.isTextColorEmoji(sticker)) {
                                    mediaEntity.color = -1;
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                }
                                if (stickerView.isMirrored()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else if (entityView instanceof PhotoView) {
                                photoView = (PhotoView) entityView;
                                mediaEntity.type = (byte) 2;
                                Size baseSize5 = photoView.getBaseSize();
                                mediaEntity.width = baseSize5.width;
                                mediaEntity.height = baseSize5.height;
                                tLObject = photoView.object;
                                if (tLObject instanceof TLRPC.Photo) {
                                    absolutePath = FileLoader.getInstance(i6).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
                                } else {
                                    absolutePath = photoView.path;
                                }
                                mediaEntity.text = absolutePath;
                                mediaEntity.crop = photoView.crop;
                                if (photoView.isMirrored()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else if (entityView instanceof LocationView) {
                                locationView = (LocationView) entityView;
                                mediaEntity.type = (byte) 3;
                                mediaEntity.subType = (byte) locationView.getType();
                                LocationMarker locationMarker5 = locationView.marker;
                                mediaEntity.width = locationMarker5.getWidth();
                                mediaEntity.height = locationMarker5.getHeight();
                                mediaEntity.text = locationMarker5.getText();
                                if (locationView.hasColor()) {
                                    color3 = locationView.getColor();
                                } else {
                                    color3 = 0;
                                }
                                mediaEntity.color = color3;
                                mediaEntity.density = locationMarker5.density;
                                mediaEntity.media = locationView.location;
                                TL_stories.MediaArea mediaArea4 = locationView.mediaArea;
                                mediaEntity.mediaArea = mediaArea4;
                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument2 = locationMarker5.getCodeEmojiDocument();
                                if (codeEmojiDocument2 != null) {
                                    emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity2.document_id = codeEmojiDocument2.id;
                                    emojiEntity2.document = codeEmojiDocument2;
                                    emojiEntity2.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                    if (zIsAnimatedStickerDocument2) {
                                        byte b10 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b2 = 1;
                                        } else {
                                            b2 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b10 | b2);
                                    } else {
                                        byte b11 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b2 = 1;
                                        } else {
                                            b2 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b11 | b2);
                                    }
                                    mediaEntity.entities.add(emojiEntity2);
                                }
                            } else if (entityView instanceof WeatherView) {
                                weatherView = (WeatherView) entityView;
                                mediaEntity.type = (byte) 8;
                                mediaEntity.subType = (byte) weatherView.getType();
                                LocationMarker locationMarker6 = weatherView.marker;
                                mediaEntity.width = locationMarker6.getWidth();
                                mediaEntity.height = locationMarker6.getHeight();
                                mediaEntity.text = locationMarker6.getText();
                                if (weatherView.hasColor()) {
                                    color2 = weatherView.getColor();
                                } else {
                                    color2 = 0;
                                }
                                mediaEntity.color = color2;
                                mediaEntity.density = locationMarker6.density;
                                Weather.State state2 = weatherView.weather;
                                mediaEntity.weather = state2;
                                TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather2 = new TL_stories.TL_mediaAreaWeather();
                                tL_mediaAreaWeather2.emoji = state2.emoji;
                                tL_mediaAreaWeather2.temperature_c = Math.round(state2.temperature);
                                tL_mediaAreaWeather2.color = locationMarker6.outlinePaint.getColor();
                                mediaEntity.mediaArea = tL_mediaAreaWeather2;
                                tL_mediaAreaWeather2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument = locationMarker6.getCodeEmojiDocument();
                                if (codeEmojiDocument != null) {
                                    emojiEntity = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity.document_id = codeEmojiDocument.id;
                                    emojiEntity.document = codeEmojiDocument;
                                    emojiEntity.documentAbsolutePath = FileLoader.getInstance(i6).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                    if (zIsAnimatedStickerDocument) {
                                        byte b12 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b = 1;
                                        } else {
                                            b = 4;
                                        }
                                        emojiEntity.subType = (byte) (b12 | b);
                                    } else {
                                        byte b13 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b = 1;
                                        } else {
                                            b = 4;
                                        }
                                        emojiEntity.subType = (byte) (b13 | b);
                                    }
                                    mediaEntity.entities.add(emojiEntity);
                                }
                                i4 = i4;
                                bitmap = bitmap;
                                childAt = childAt;
                                z8 = false;
                                z9 = false;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x = childAt.getX();
                                y = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (entityView instanceof MessageEntityView) {
                                    MessageEntityView messageEntityView7 = (MessageEntityView) entityView;
                                    RectF rectF5 = AndroidUtilities.rectTmp;
                                    bubbleBounds = messageEntityView7.getBubbleBounds(rectF5);
                                    MessageEntityView.AnonymousClass1 anonymousClass111 = messageEntityView7.container;
                                    rectF5.offset(anonymousClass111.getX(), anonymousClass111.getY());
                                    MessageEntityView.AnonymousClass2 anonymousClass112 = messageEntityView7.listView;
                                    rectF5.offset(anonymousClass112.getX(), anonymousClass112.getY());
                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates8 = mediaEntity.mediaArea.coordinates;
                                    float fCenterX5 = (((rectF5.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                    z10 = z8;
                                    mediaAreaCoordinates8.x = fCenterX5;
                                    mediaEntity.mediaArea.coordinates.y = (((rectF5.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.w = ((rectF5.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF5.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                } else {
                                    z10 = z8;
                                    if (entityView instanceof StickerView) {
                                        imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                        f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                        f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                        measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f16 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f16;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.y = f2 - (f16 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f17 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f17;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.x = f - (f17 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    bubbleBounds = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                }
                                z5 = z9;
                                z6 = z10;
                            } else {
                                if (entityView instanceof LinkView) {
                                    linkView = (LinkView) entityView;
                                    mediaEntity.type = (byte) 7;
                                    linkPreview = linkView.marker;
                                    if (linkPreview.withPreview()) {
                                        mediaEntity.subType = (byte) linkPreview.getPreviewType();
                                    } else {
                                        mediaEntity.subType = (byte) linkView.getType();
                                    }
                                    mediaEntity.width = linkPreview.getWidth();
                                    mediaEntity.height = linkPreview.getHeight();
                                    if (linkView.hasColor()) {
                                        color = linkView.getColor();
                                    } else {
                                        color = 0;
                                    }
                                    mediaEntity.color = color;
                                    mediaEntity.density = linkPreview.density;
                                    mediaEntity.linkSettings = linkView.link;
                                    if (linkPreview.hasPhoto) {
                                        linkPreview.pushPhotoToCache();
                                        LinkPreview.WebPagePreview webPagePreview3 = mediaEntity.linkSettings;
                                        webPagePreview3.flags |= 4;
                                        webPagePreview3.photoSize = linkPreview.getPhotoSide();
                                    }
                                    tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                    mediaEntity.mediaArea = tL_mediaAreaUrl;
                                    webPagePreview = linkView.link;
                                    if (webPagePreview == null) {
                                        webPage = webPagePreview.webpage;
                                        if (webPage != null) {
                                            str = linkView.link.url;
                                        } else {
                                            str = linkView.link.url;
                                        }
                                        tL_mediaAreaUrl.url = str;
                                        mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    }
                                } else {
                                    if (entityView instanceof ReactionWidgetEntityView) {
                                        ReactionWidgetEntityView reactionWidgetEntityView3 = (ReactionWidgetEntityView) entityView;
                                        mediaEntity.type = (byte) 4;
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction2 = new TL_stories.TL_mediaAreaSuggestedReaction();
                                        mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction2;
                                        currentReaction = reactionWidgetEntityView3.getCurrentReaction();
                                        if (currentReaction.emojicon != null) {
                                            TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                                            tL_reactionEmoji2.emoticon = currentReaction.emojicon;
                                            reaction = tL_reactionEmoji2;
                                        } else {
                                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                                            tL_reactionCustomEmoji2.document_id = currentReaction.documentId;
                                            reaction = tL_reactionCustomEmoji2;
                                        }
                                        tL_mediaAreaSuggestedReaction2.reaction = reaction;
                                        mediaEntity.mediaArea.dark = reactionWidgetEntityView3.isDark();
                                        mediaEntity.mediaArea.flipped = reactionWidgetEntityView3.isMirrored();
                                        mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    } else {
                                        if (entityView instanceof RoundView) {
                                            roundView = (RoundView) entityView;
                                            Size baseSize6 = roundView.getBaseSize();
                                            mediaEntity.width = baseSize6.width;
                                            mediaEntity.height = baseSize6.height;
                                            mediaEntity.type = (byte) 5;
                                            if (storyEntry != null) {
                                                mediaEntity.text = storyEntry.round.getAbsolutePath();
                                                mediaEntity.roundOffset = storyEntry.roundOffset;
                                                long j3 = storyEntry.roundDuration;
                                                mediaEntity.roundDuration = j3;
                                                float f18 = j3;
                                                mediaEntity.roundLeft = (long) (storyEntry.roundLeft * f18);
                                                mediaEntity.roundRight = (long) (storyEntry.roundRight * f18);
                                            }
                                            mediaEntity.subType = (byte) 4;
                                            if (roundView.isMirrored()) {
                                                mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                            }
                                        } else if (entityView instanceof MessageEntityView) {
                                            messageEntityView = (MessageEntityView) entityView;
                                            mediaEntity.type = (byte) 6;
                                            int width3 = messageEntityView.getWidth();
                                            mediaEntity.viewWidth = width3;
                                            mediaEntity.width = width3;
                                            int height2 = messageEntityView.getHeight();
                                            mediaEntity.viewHeight = height2;
                                            mediaEntity.height = height2;
                                            arrayList2 = messageEntityView.messageObjects;
                                            if (arrayList2.size() > 0) {
                                                messageObject = (MessageObject) arrayList2.get(0);
                                            } else {
                                                messageObject = null;
                                            }
                                            anonymousClass3 = messageEntityView.listView;
                                            if (messageObject != null) {
                                                j = 0;
                                                i4 = i4;
                                                bitmap = bitmap;
                                                childAt = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost5 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost5;
                                                    tL_inputMediaAreaChannelPost5.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost6 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    MessagesController messagesController2 = MessagesController.getInstance(i6);
                                                    boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
                                                    if (boolUseForwardForRepost == null) {
                                                        dialogId = j;
                                                    } else if (boolUseForwardForRepost.booleanValue()) {
                                                        dialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
                                                    } else {
                                                        dialogId = messageObject.getDialogId();
                                                    }
                                                    tL_inputMediaAreaChannelPost6.channel = messagesController2.getInputChannel(-dialogId);
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost7 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    boolUseForwardForRepost2 = StoryEntry.useForwardForRepost(messageObject);
                                                    if (boolUseForwardForRepost2 == null) {
                                                        id = 0;
                                                    } else if (boolUseForwardForRepost2.booleanValue()) {
                                                        id = messageObject.messageOwner.fwd_from.channel_post;
                                                    } else {
                                                        id = messageObject.getId();
                                                    }
                                                    tL_inputMediaAreaChannelPost7.msg_id = id;
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost8 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost8;
                                                    tL_inputMediaAreaChannelPost8.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                            } else {
                                                j = 0;
                                                i4 = i4;
                                                bitmap = bitmap;
                                                childAt = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost9 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost9;
                                                    tL_inputMediaAreaChannelPost9.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost10 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    MessagesController messagesController3 = MessagesController.getInstance(i6);
                                                    boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
                                                    if (boolUseForwardForRepost == null) {
                                                        dialogId = j;
                                                    } else if (boolUseForwardForRepost.booleanValue()) {
                                                        dialogId = DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id);
                                                    } else {
                                                        dialogId = messageObject.getDialogId();
                                                    }
                                                    tL_inputMediaAreaChannelPost10.channel = messagesController3.getInputChannel(-dialogId);
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost11 = (TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea;
                                                    boolUseForwardForRepost2 = StoryEntry.useForwardForRepost(messageObject);
                                                    if (boolUseForwardForRepost2 == null) {
                                                        id = 0;
                                                    } else if (boolUseForwardForRepost2.booleanValue()) {
                                                        id = messageObject.messageOwner.fwd_from.channel_post;
                                                    } else {
                                                        id = messageObject.getId();
                                                    }
                                                    tL_inputMediaAreaChannelPost11.msg_id = id;
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost12 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost12;
                                                    tL_inputMediaAreaChannelPost12.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                            }
                                            if (z3) {
                                                z8 = true;
                                            } else {
                                                if (storyEntry != null) {
                                                    matrix = storyEntry.matrix;
                                                    matrix.reset();
                                                    if (anonymousClass3.getChildCount() == 1) {
                                                        childAt2 = anonymousClass3.getChildAt(0);
                                                        if (childAt2 instanceof ChatMessageCell) {
                                                        }
                                                        if (photoImage != null) {
                                                            float fMax7 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                            matrix.postScale(fMax7, fMax7);
                                                            matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax7) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax7) / 2.0f));
                                                            MessageEntityView.AnonymousClass1 anonymousClass113 = messageEntityView.container;
                                                            matrix.postTranslate(anonymousClass113.getX(), anonymousClass113.getY());
                                                            matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                            matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                            matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                            matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                            matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                            matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                            matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                        }
                                                    } else {
                                                        childAt2 = null;
                                                    }
                                                    if (photoImage != null) {
                                                        float fMax8 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                        matrix.postScale(fMax8, fMax8);
                                                        matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax8) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax8) / 2.0f));
                                                        MessageEntityView.AnonymousClass1 anonymousClass114 = messageEntityView.container;
                                                        matrix.postTranslate(anonymousClass114.getX(), anonymousClass114.getY());
                                                        matrix.postTranslate(anonymousClass3.getX(), anonymousClass3.getY());
                                                        matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                        matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                        matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                        matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                        matrix.postScale(1.0f / anonymousClass7.getWidth(), 1.0f / anonymousClass7.getHeight());
                                                        matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                    }
                                                }
                                                z8 = false;
                                            }
                                            z9 = true;
                                        }
                                        arrayList.add(mediaEntity);
                                        scaleX = childAt.getScaleX();
                                        scaleY = childAt.getScaleY();
                                        x = childAt.getX();
                                        y = childAt.getY();
                                        mediaEntity.viewWidth = childAt.getWidth();
                                        mediaEntity.viewHeight = childAt.getHeight();
                                        mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (entityView instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView8 = (MessageEntityView) entityView;
                                            RectF rectF6 = AndroidUtilities.rectTmp;
                                            bubbleBounds = messageEntityView8.getBubbleBounds(rectF6);
                                            MessageEntityView.AnonymousClass1 anonymousClass115 = messageEntityView8.container;
                                            rectF6.offset(anonymousClass115.getX(), anonymousClass115.getY());
                                            MessageEntityView.AnonymousClass2 anonymousClass116 = messageEntityView8.listView;
                                            rectF6.offset(anonymousClass116.getX(), anonymousClass116.getY());
                                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates9 = mediaEntity.mediaArea.coordinates;
                                            float fCenterX6 = (((rectF6.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                            z10 = z8;
                                            mediaAreaCoordinates9.x = fCenterX6;
                                            mediaEntity.mediaArea.coordinates.y = (((rectF6.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF6.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF6.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                        } else {
                                            z10 = z8;
                                            if (entityView instanceof StickerView) {
                                                imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                                f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                                measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f19 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f19;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f2 - (f19 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f110 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f110;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f - (f110 / 2.0f);
                                                }
                                            } else {
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea == null) {
                                                }
                                            }
                                            bubbleBounds = -1.0d;
                                        }
                                        mediaArea2 = mediaEntity.mediaArea;
                                        if (mediaArea2 != null) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                        }
                                        z5 = z9;
                                        z6 = z10;
                                    }
                                    i4 = i4;
                                    z8 = true;
                                    z9 = true;
                                    imageReceiver = null;
                                    arrayList.add(mediaEntity);
                                    scaleX = childAt.getScaleX();
                                    scaleY = childAt.getScaleY();
                                    x = childAt.getX();
                                    y = childAt.getY();
                                    mediaEntity.viewWidth = childAt.getWidth();
                                    mediaEntity.viewHeight = childAt.getHeight();
                                    mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                                    mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                                    mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                    mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                    mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                                    mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    if (entityView instanceof MessageEntityView) {
                                        MessageEntityView messageEntityView9 = (MessageEntityView) entityView;
                                        RectF rectF7 = AndroidUtilities.rectTmp;
                                        bubbleBounds = messageEntityView9.getBubbleBounds(rectF7);
                                        MessageEntityView.AnonymousClass1 anonymousClass117 = messageEntityView9.container;
                                        rectF7.offset(anonymousClass117.getX(), anonymousClass117.getY());
                                        MessageEntityView.AnonymousClass2 anonymousClass118 = messageEntityView9.listView;
                                        rectF7.offset(anonymousClass118.getX(), anonymousClass118.getY());
                                        TL_stories.MediaAreaCoordinates mediaAreaCoordinates10 = mediaEntity.mediaArea.coordinates;
                                        float fCenterX7 = (((rectF7.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                        z10 = z8;
                                        mediaAreaCoordinates10.x = fCenterX7;
                                        mediaEntity.mediaArea.coordinates.y = (((rectF7.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.w = ((rectF7.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF7.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                    } else {
                                        z10 = z8;
                                        if (entityView instanceof StickerView) {
                                            imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                            f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                            f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                            measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                            if (imageAspectRatio > 1.0f) {
                                                float f111 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                mediaEntity.height = f111;
                                                mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                mediaEntity.y = f2 - (f111 / 2.0f);
                                            } else if (imageAspectRatio < 1.0f) {
                                                float f112 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                mediaEntity.width = f112;
                                                mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                mediaEntity.x = f - (f112 / 2.0f);
                                            }
                                        } else {
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea == null) {
                                            }
                                        }
                                        bubbleBounds = -1.0d;
                                    }
                                    mediaArea2 = mediaEntity.mediaArea;
                                    if (mediaArea2 != null) {
                                        mediaAreaCoordinates.flags |= 1;
                                        mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                    }
                                    z5 = z9;
                                    z6 = z10;
                                }
                                i4 = i4;
                                bitmap2 = bitmap;
                            }
                        }
                        i4 = i4;
                        z8 = false;
                        z9 = true;
                        imageReceiver = null;
                        arrayList.add(mediaEntity);
                        scaleX = childAt.getScaleX();
                        scaleY = childAt.getScaleY();
                        x = childAt.getX();
                        y = childAt.getY();
                        mediaEntity.viewWidth = childAt.getWidth();
                        mediaEntity.viewHeight = childAt.getHeight();
                        mediaEntity.width = (childAt.getWidth() * scaleX) / anonymousClass7.getMeasuredWidth();
                        mediaEntity.height = (childAt.getHeight() * scaleY) / anonymousClass7.getMeasuredHeight();
                        mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                        mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / anonymousClass7.getMeasuredWidth();
                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / anonymousClass7.getMeasuredHeight();
                        mediaEntity.textViewWidth = mediaEntity.viewWidth / anonymousClass7.getMeasuredWidth();
                        mediaEntity.textViewHeight = mediaEntity.viewHeight / anonymousClass7.getMeasuredHeight();
                        mediaEntity.scale = scaleX;
                        if (entityView instanceof MessageEntityView) {
                            MessageEntityView messageEntityView10 = (MessageEntityView) entityView;
                            RectF rectF8 = AndroidUtilities.rectTmp;
                            bubbleBounds = messageEntityView10.getBubbleBounds(rectF8);
                            MessageEntityView.AnonymousClass1 anonymousClass119 = messageEntityView10.container;
                            rectF8.offset(anonymousClass119.getX(), anonymousClass119.getY());
                            MessageEntityView.AnonymousClass2 anonymousClass1110 = messageEntityView10.listView;
                            rectF8.offset(anonymousClass1110.getX(), anonymousClass1110.getY());
                            TL_stories.MediaAreaCoordinates mediaAreaCoordinates11 = mediaEntity.mediaArea.coordinates;
                            float fCenterX8 = (((rectF8.centerX() * scaleX) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getWidth(), 2.0f, scaleX, (childAt.getWidth() / 2.0f) + x)) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                            z10 = z8;
                            mediaAreaCoordinates11.x = fCenterX8;
                            mediaEntity.mediaArea.coordinates.y = (((rectF8.centerY() * scaleY) + TextureRenderer$$ExternalSyntheticOutline0.m(childAt.getHeight(), 2.0f, scaleY, (childAt.getHeight() / 2.0f) + y)) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.w = ((rectF8.width() * scaleX) / anonymousClass7.getMeasuredWidth()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.h = ((rectF8.height() * scaleY) / anonymousClass7.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                        } else {
                            z10 = z8;
                            if (entityView instanceof StickerView) {
                                imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                f = (mediaEntity.width / 2.0f) + mediaEntity.x;
                                f2 = (mediaEntity.height / 2.0f) + mediaEntity.y;
                                measuredWidth = anonymousClass7.getMeasuredWidth() / anonymousClass7.getMeasuredHeight();
                                if (imageAspectRatio > 1.0f) {
                                    float f113 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                    mediaEntity.height = f113;
                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                    mediaEntity.y = f2 - (f113 / 2.0f);
                                } else if (imageAspectRatio < 1.0f) {
                                    float f114 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                    mediaEntity.width = f114;
                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                    mediaEntity.x = f - (f114 / 2.0f);
                                }
                            } else {
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea == null) {
                                }
                            }
                            bubbleBounds = -1.0d;
                        }
                        mediaArea2 = mediaEntity.mediaArea;
                        if (mediaArea2 != null) {
                            mediaAreaCoordinates.flags |= 1;
                            mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                        }
                        z5 = z9;
                        z6 = z10;
                    } else {
                        anonymousClass7 = anonymousClass8;
                        bitmap = bitmap;
                        i4 = childCount;
                        i5 = i3;
                        childAt = childAt;
                        z5 = true;
                        z6 = false;
                        imageReceiver = null;
                    }
                    if (z5) {
                    }
                    bitmap2 = bitmap;
                }
                i3 = i5 + 1;
                paintView = this;
                bitmap = bitmap2;
                anonymousClass8 = anonymousClass7;
                childCount = i4;
                i10 = 0;
                b4 = 1;
            }
        }
        return bitmap;
    }
}
