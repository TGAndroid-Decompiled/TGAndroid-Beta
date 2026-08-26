package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Looper;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
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
import androidx.credentials.Credential;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.lifecycle.LiveData;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.zxing.Result;
import com.stripe.android.Stripe;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.commonmark.internal.BlockStartImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda5;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.ChatLoadingCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda13;
import org.telegram.ui.Cells.GroupCallUserCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ShareDialogCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.TextCheckCell2$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.TextSelectionHelper$$ExternalSyntheticLambda10;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.IPhotoPaintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.PhotoFace;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda83;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda24;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda28;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.TON.TONIntroActivity$4$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda12;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public abstract class LPhotoPaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    private float baseScale;
    private Bitmap bitmapToEdit;
    private BlurredBackgroundDrawable blurredBackgroundDrawableForTools;
    public FrameLayout bottomLayout;
    private boolean bottomPanelIgnoreOnce;
    public PaintCancelView cancelButton;
    private TextView cancelTextButton;
    private final Paint clearPaint;
    private Paint colorPickerRainbowPaint;
    private Swatch colorSwatch;
    private Paint colorSwatchOutlinePaint;
    private Paint colorSwatchPaint;
    private PaintColorsListView colorsListView;
    private int currentAccount;
    private MediaController.CropState currentCropState;
    private EntityView currentEntityView;
    private boolean destroyed;
    public PaintDoneView doneButton;
    private TextView doneTextButton;
    private boolean drawShadow;
    private TextView drawTab;
    private boolean editingText;
    private int emojiPadding;
    private EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private int emojiWasPadding;
    public EntitiesContainerView entitiesView;
    private ArrayList<PhotoFace> faces;
    private Bitmap facesBitmap;
    private boolean fillShapes;
    private boolean ignoreLayout;
    private boolean ignoreToolChangeAnimationOnce;
    private float imageHeight;
    private float imageWidth;
    private boolean inBubbleMode;
    private float inputTransformX;
    private float inputTransformY;
    public boolean isAnimatePopupClosing;
    private boolean isColorListShown;
    private boolean isTypefaceMenuShown;
    private int keyboardHeight;
    private int keyboardHeightLand;
    public boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private BigInteger lcm;
    private Matrix matrix;
    private float offsetTranslationY;
    private Runnable onDoneButtonClickedListener;
    private Runnable openKeyboardRunnable;
    private int originalBitmapRotation;
    public FrameLayout overlayLayout;
    private PaintToolsView paintToolsView;
    private Size paintingSize;
    private final PersistColorPalette palette;
    private float panTranslationProgress;
    private float panTranslationY;
    private float pany;
    private FrameLayout pipetteContainerLayout;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int[] pos2;
    private float[] position;
    private DispatchQueue queue;
    private View renderInputView;
    private RenderView renderView;
    private Theme.ResourcesProvider resourcesProvider;
    private float scale;
    private int selectedTextType;
    private FrameLayout selectionContainerView;
    private final AnimatedFloat shadowAlpha;
    private final Paint shadowPaint;
    private TextView stickerTab;
    public LinearLayout tabsLayout;
    private int tabsNewSelectedIndex;
    private int tabsSelectedIndex;
    private ValueAnimator tabsSelectionAnimator;
    private float tabsSelectionProgress;
    public PaintTextOptionsView textOptionsView;
    private TextView textTab;
    private ThanosEffect thanosEffect;
    private Paint toolsPaint;
    private SpringAnimation toolsTransformAnimation;
    private float toolsTransformProgress;
    private FrameLayout topLayout;
    private float transformX;
    private float transformY;
    private boolean translateBottomPanelAfterResize;
    private PaintTypefaceListView typefaceListView;
    private Paint typefaceMenuBackgroundPaint;
    private Paint typefaceMenuOutlinePaint;
    private SpringAnimation typefaceMenuTransformAnimation;
    private float typefaceMenuTransformProgress;
    private TextView undoAllButton;
    private ImageView undoButton;
    private UndoStore undoStore;
    private boolean waitingForKeyboardOpen;
    public PaintWeightChooserView weightChooserView;
    private PaintWeightChooserView.ValueOverride weightDefaultValueOverride;
    private LinearLayout zoomOutButton;
    private ImageView zoomOutImage;
    private TextView zoomOutText;
    private boolean zoomOutVisible;

    public final class AnonymousClass14 extends EmojiBottomSheet {
        @Override
        public final boolean canShowWidget(Integer num) {
            return num.intValue() == 2;
        }
    }

    public final class AnonymousClass19 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final LPhotoPaintView this$0;

        public AnonymousClass19(LPhotoPaintView lPhotoPaintView, int i) {
            this.$r8$classId = i;
            this.this$0 = lPhotoPaintView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.emojiView.setTranslationY(0.0f);
                    break;
                default:
                    LPhotoPaintView lPhotoPaintView = this.this$0;
                    lPhotoPaintView.isAnimatePopupClosing = false;
                    lPhotoPaintView.emojiView.setTranslationY(0.0f);
                    lPhotoPaintView.hideEmojiView$1();
                    break;
            }
        }
    }

    public final class AnonymousClass21 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass21() {
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
            EditTextOutline editText = ((TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText();
            if (editText == null || editText.length() == 0) {
                return false;
            }
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(lPhotoPaintView.getContext(), 0, lPhotoPaintView.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 25));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            EditTextOutline editText = ((TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(document != null ? new AnimatedEmojiSpan(document, editText.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, editText.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
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
            LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
            if ((lPhotoPaintView.currentEntityView instanceof TextPaintView) && (editText = (textPaintView = (TextPaintView) lPhotoPaintView.currentEntityView).getEditText()) != null) {
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

    public final class AnonymousClass7 extends FrameLayout {
        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public final class BottomLayout extends FrameLayout {
        public float lastRainbowX;
        public float lastRainbowY;

        public BottomLayout(Context context) {
            super(context);
            new Path();
            setWillNotDraw(false);
            LPhotoPaintView.this.colorPickerRainbowPaint.setStyle(Paint.Style.STROKE);
            LPhotoPaintView.this.colorPickerRainbowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            super.onDraw(canvas);
            LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
            ViewGroup barView = lPhotoPaintView.getBarView();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(AndroidUtilities.lerp(barView.getLeft(), lPhotoPaintView.colorsListView.getLeft(), lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), lPhotoPaintView.colorsListView.getTop(), lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), lPhotoPaintView.colorsListView.getRight(), lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), lPhotoPaintView.colorsListView.getBottom(), lPhotoPaintView.toolsTransformProgress));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), lPhotoPaintView.toolsTransformProgress);
            if (lPhotoPaintView.blurredBackgroundDrawableForTools != null) {
                rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                lPhotoPaintView.blurredBackgroundDrawableForTools.setRadius(fLerp);
                lPhotoPaintView.blurredBackgroundDrawableForTools.setBounds(rect);
                lPhotoPaintView.blurredBackgroundDrawableForTools.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF, fLerp, fLerp, lPhotoPaintView.toolsPaint);
            }
            if (barView.getChildCount() < 1 || lPhotoPaintView.toolsTransformProgress == 1.0f) {
                return;
            }
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof PaintTextOptionsView) {
                childAt = ((PaintTextOptionsView) barView).getColorClickableView();
            }
            View view = childAt;
            if (view.getAlpha() != 0.0f) {
                canvas.scale(view.getScaleX(), view.getScaleY(), view.getPivotX(), view.getPivotY());
                lPhotoPaintView.colorPickerRainbowPaint.setAlpha((int) (view.getAlpha() * (1.0f - lPhotoPaintView.toolsTransformProgress) * 255.0f));
                int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
                int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                float x = (width / 2.0f) + view.getX() + view.getPaddingLeft();
                float y = (height / 2.0f) + view.getY() + view.getPaddingTop();
                int iBlendARGB = lPhotoPaintView.colorSwatch.color;
                if (lPhotoPaintView.tabsNewSelectedIndex != -1) {
                    ViewGroup viewGroup = (ViewGroup) LPhotoPaintView.access$3700(lPhotoPaintView, lPhotoPaintView.tabsNewSelectedIndex);
                    View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                    f = 255.0f;
                    if (viewGroup instanceof PaintTextOptionsView) {
                        childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                    }
                    x = AndroidUtilities.lerp(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), lPhotoPaintView.tabsSelectionProgress);
                    y = AndroidUtilities.lerp(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), lPhotoPaintView.tabsSelectionProgress);
                } else {
                    f = 255.0f;
                }
                if (lPhotoPaintView.colorsListView != null && lPhotoPaintView.colorsListView.getChildCount() > 0) {
                    View childAt3 = lPhotoPaintView.colorsListView.getChildAt(0);
                    x = AndroidUtilities.lerp(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (lPhotoPaintView.colorsListView.getX() - barView.getLeft()), lPhotoPaintView.toolsTransformProgress);
                    y = AndroidUtilities.lerp(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (lPhotoPaintView.colorsListView.getY() - barView.getTop()), lPhotoPaintView.toolsTransformProgress);
                    iBlendARGB = ColorUtils.blendARGB(lPhotoPaintView.toolsTransformProgress, lPhotoPaintView.colorSwatch.color, lPhotoPaintView.palette.getColor(0));
                }
                if (x != this.lastRainbowX || y != this.lastRainbowY) {
                    this.lastRainbowX = x;
                    this.lastRainbowY = y;
                    lPhotoPaintView.colorPickerRainbowPaint.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (lPhotoPaintView.colorsListView != null && lPhotoPaintView.colorsListView.getChildCount() > 0) {
                    View childAt4 = lPhotoPaintView.colorsListView.getChildAt(0);
                    fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), lPhotoPaintView.toolsTransformProgress);
                }
                float f2 = fMin;
                rectF.set(x - f2, y - f2, x + f2, y + f2);
                canvas.drawArc(rectF, 0.0f, 360.0f, false, lPhotoPaintView.colorPickerRainbowPaint);
                lPhotoPaintView.colorSwatchPaint.setColor(iBlendARGB);
                lPhotoPaintView.colorSwatchPaint.setAlpha((int) (view.getAlpha() * lPhotoPaintView.colorSwatchPaint.getAlpha()));
                lPhotoPaintView.colorSwatchOutlinePaint.setColor(iBlendARGB);
                lPhotoPaintView.colorSwatchOutlinePaint.setAlpha((int) (view.getAlpha() * f));
                float fDp = f2 - AndroidUtilities.dp(3.0f);
                if (lPhotoPaintView.colorsListView != null && lPhotoPaintView.colorsListView.getSelectedColorIndex() != 0) {
                    fDp = AndroidUtilities.lerp(f2 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f2, lPhotoPaintView.toolsTransformProgress);
                }
                PaintColorsListView.drawColorCircle(canvas, x, y, fDp, lPhotoPaintView.colorSwatchPaint.getColor());
                if (lPhotoPaintView.colorsListView != null && lPhotoPaintView.colorsListView.getSelectedColorIndex() == 0) {
                    lPhotoPaintView.colorSwatchOutlinePaint.setAlpha((int) (view.getAlpha() * lPhotoPaintView.toolsTransformProgress * lPhotoPaintView.colorSwatchOutlinePaint.getAlpha()));
                    canvas.drawCircle(x, y, f2 - ((1.0f - lPhotoPaintView.toolsTransformProgress) * (lPhotoPaintView.colorSwatchOutlinePaint.getStrokeWidth() + AndroidUtilities.dp(3.0f))), lPhotoPaintView.colorSwatchOutlinePaint);
                }
            }
            canvas.restore();
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = LPhotoPaintView.this.overlayLayout;
            if (frameLayout != null) {
                frameLayout.invalidate();
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
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, LPhotoPaintView.this.resourcesProvider), 2, -1));
            ChatLoadingCell.AnonymousClass1 anonymousClass1 = new ChatLoadingCell.AnonymousClass1(this, context);
            this.imagesView = anonymousClass1;
            addView(anonymousClass1, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            imageView2.setColorFilter(LPhotoPaintView.access$2300(LPhotoPaintView.this, i));
            anonymousClass1.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
            this.image2View.setColorFilter(LPhotoPaintView.access$2300(LPhotoPaintView.this, i));
            this.image2View.setVisibility(8);
            anonymousClass1.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(LPhotoPaintView.access$2300(LPhotoPaintView.this, i));
            textView.setTextSize(1, 16.0f);
            addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            imageView4.setScaleType(scaleType);
            imageView4.setColorFilter(new PorterDuffColorFilter(LPhotoPaintView.access$2300(LPhotoPaintView.this, Theme.key_radioBackgroundChecked), PorterDuff.Mode.MULTIPLY));
            imageView4.setVisibility(8);
            addView(imageView4, LayoutHelper.createLinear(50, -1));
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public final boolean performClick() {
            LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
            if (lPhotoPaintView.popupWindow != null && lPhotoPaintView.popupWindow.isShowing()) {
                lPhotoPaintView.popupWindow.dismiss(true);
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
            int i2 = 2;
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
            this.imageSwitchAnimator.addListener(new BaseChartView.AnonymousClass4(this, 6));
            this.imageSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.imageSwitchAnimator.setDuration(420L);
            this.imageSwitchAnimator.start();
        }
    }

    public final class StickerPosition {
        public final float angle;
        public final PointF position;
        public final float scale;

        public StickerPosition(PointF pointF, float f, float f2) {
            this.position = pointF;
            this.scale = f;
            this.angle = f2;
        }
    }

    public LPhotoPaintView(Context context, Activity activity, int i, Bitmap bitmap, final Bitmap bitmap2, int i2, ArrayList arrayList, MediaController.CropState cropState, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        float f;
        float f2;
        int i3;
        AnonymousClass17 anonymousClass17;
        Emoji.EmojiSpan[] emojiSpanArr;
        super(context, activity, true);
        byte b = 1;
        boolean z = false;
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        this.weightDefaultValueOverride = new Stripe.AnonymousClass1(this, 13);
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        this.colorSwatch = new Swatch(-1, 0.016773745f);
        this.fillShapes = false;
        this.toolsPaint = new Paint(1);
        this.zoomOutVisible = false;
        this.shadowAlpha = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.shadowPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.clearPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.matrix = new Matrix();
        byte b2 = 2;
        this.position = new float[2];
        this.pos2 = new int[2];
        this.openKeyboardRunnable = new LiveData.AnonymousClass1(this, 29);
        setDelegate(this);
        this.currentAccount = i;
        this.resourcesProvider = new LPhotoPaintView$$ExternalSyntheticLambda21(resourcesProvider, false ? 1 : 0);
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        this.palette = persistColorPalette;
        persistColorPalette.setCurrentBrush(0, true);
        this.colorSwatch.color = persistColorPalette.getCurrentColor();
        this.colorSwatch.brushWeight = persistColorPalette.currentWeight;
        this.queue = new DispatchQueue("Paint");
        this.bitmapToEdit = bitmap;
        this.facesBitmap = bitmap2;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.delegate = new LPhotoPaintView$$ExternalSyntheticLambda11(this);
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize(), bitmap2, i2, null), this.bitmapToEdit) {
            @Override
            public final void selectBrush(Brush brush) {
                int iIndexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i4 = iIndexOf + 1;
                if (i4 <= 1 || bitmap2 != null) {
                    iIndexOf = i4;
                }
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                PaintToolsView paintToolsView = lPhotoPaintView.paintToolsView;
                paintToolsView.animateNextIndex(iIndexOf);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(iIndexOf - 1, true);
                lPhotoPaintView.onBrushSelected(brush);
            }
        };
        this.renderView = renderView;
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public final void invalidateInputView() {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                if (lPhotoPaintView.renderInputView != null) {
                    lPhotoPaintView.renderInputView.invalidate();
                }
            }

            @Override
            public final void onBeganDrawing() {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                if (lPhotoPaintView.currentEntityView != null) {
                    LPhotoPaintView.access$600(lPhotoPaintView, null);
                }
                lPhotoPaintView.weightChooserView.setViewHidden(true);
            }

            @Override
            public final void onFinishedDrawing() {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                lPhotoPaintView.undoStore.delegate.historyChanged();
                lPhotoPaintView.weightChooserView.setViewHidden(false);
            }

            @Override
            public final void onFirstDraw() {
                runnable.run();
            }

            @Override
            public final void resetBrush() {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                if (lPhotoPaintView.ignoreToolChangeAnimationOnce) {
                    lPhotoPaintView.ignoreToolChangeAnimationOnce = false;
                    return;
                }
                PaintToolsView paintToolsView = lPhotoPaintView.paintToolsView;
                paintToolsView.animateNextIndex(1);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(0, true);
                lPhotoPaintView.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }

            @Override
            public final boolean shouldDraw() {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                boolean z2 = lPhotoPaintView.currentEntityView == null;
                if (!z2) {
                    LPhotoPaintView.access$600(lPhotoPaintView, null);
                }
                return z2;
            }
        });
        this.renderView.setUndoStore(this.undoStore);
        this.renderView.setQueue(this.queue);
        this.renderView.setVisibility(4);
        addView(this.renderView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                if (lPhotoPaintView.renderView != null) {
                    lPhotoPaintView.renderView.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = view;
        view.setVisibility(4);
        addView(this.renderInputView, LayoutHelper.createFrame(-1, -1, 51));
        EntitiesContainerView entitiesContainerView = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public final void onEntityDeselect() {
                LPhotoPaintView.access$600(LPhotoPaintView.this, null);
            }

            @Override
            public final EntityView onSelectedEntityRequest() {
                return LPhotoPaintView.this.currentEntityView;
            }
        }) {
            public long lastUpdate;
            public final Paint linePaint;
            public float stickyXAlpha;
            public float stickyYAlpha;

            {
                Paint paint2 = new Paint();
                this.linePaint = paint2;
                setWillNotDraw(false);
                paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(-1);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                int stickyX;
                int stickyY;
                float f3;
                float f4;
                Canvas canvas2;
                super.onDraw(canvas);
                long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                if (lPhotoPaintView.currentEntityView == null || lPhotoPaintView.currentEntityView.hasReleased || !lPhotoPaintView.currentEntityView.hasPanned) {
                    stickyX = 0;
                    stickyY = 0;
                } else {
                    stickyX = lPhotoPaintView.currentEntityView.getStickyX();
                    stickyY = lPhotoPaintView.currentEntityView.getStickyY();
                }
                if (stickyX != 0) {
                    float f5 = this.stickyXAlpha;
                    if (f5 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, (jMin / 150.0f) + f5);
                        invalidate();
                    } else if (stickyX == 0) {
                        f3 = this.stickyXAlpha;
                        if (f3 != 0.0f) {
                            this.stickyXAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyX == 0) {
                    f3 = this.stickyXAlpha;
                    if (f3 != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                if (stickyY != 0) {
                    float f6 = this.stickyYAlpha;
                    if (f6 != 1.0f) {
                        this.stickyYAlpha = Math.min(1.0f, (jMin / 150.0f) + f6);
                        invalidate();
                    } else if (stickyY == 0) {
                        f4 = this.stickyYAlpha;
                        if (f4 != 0.0f) {
                            this.stickyYAlpha = Math.max(0.0f, f4 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyY == 0) {
                    f4 = this.stickyYAlpha;
                    if (f4 != 0.0f) {
                        this.stickyYAlpha = Math.max(0.0f, f4 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                float f7 = this.stickyYAlpha;
                Paint paint2 = this.linePaint;
                if (f7 != 0.0f) {
                    paint2.setAlpha((int) (f7 * 255.0f));
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint2);
                } else {
                    canvas2 = canvas;
                }
                float f8 = this.stickyXAlpha;
                if (f8 != 0.0f) {
                    paint2.setAlpha((int) (f8 * 255.0f));
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint2);
                }
            }
        };
        this.entitiesView = entitiesContainerView;
        addView(entitiesContainerView);
        if (arrayList == null || arrayList.isEmpty()) {
            f = 1.0f;
            f2 = 2.0f;
        } else {
            f = 1.0f;
            int size = arrayList.size();
            f2 = 2.0f;
            int i4 = 0;
            while (i4 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i4);
                byte b3 = mediaEntity.type;
                if (b3 == 0) {
                    AnonymousClass17 anonymousClass17CreateSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, z);
                    if ((mediaEntity.subType & b2) != 0) {
                        anonymousClass17CreateSticker.mirror(z);
                    }
                    ViewGroup.LayoutParams layoutParams = anonymousClass17CreateSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i3 = size;
                    anonymousClass17 = anonymousClass17CreateSticker;
                } else if (b3 == b) {
                    TextPaintView textPaintViewCreateText = createText(z);
                    textPaintViewCreateText.setType(mediaEntity.subType);
                    textPaintViewCreateText.setTypeface(mediaEntity.textTypeface);
                    textPaintViewCreateText.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i5);
                        i5 += b;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        int i6 = size;
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity2.document_id, textPaintViewCreateText.getFontMetricsInt());
                        int i7 = emojiEntity2.offset;
                        spannableString.setSpan(animatedEmojiSpan, i7, emojiEntity2.length + i7, 33);
                        size2 = size2;
                        size = i6;
                        b = 1;
                    }
                    i3 = size;
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, textPaintViewCreateText.getFontMetricsInt(), false);
                    if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    textPaintViewCreateText.setText(charSequenceReplaceEmoji);
                    setTextAlignment(textPaintViewCreateText, mediaEntity.textAlign);
                    Swatch swatch = textPaintViewCreateText.getSwatch();
                    swatch.color = mediaEntity.color;
                    textPaintViewCreateText.setSwatch(swatch);
                    anonymousClass17 = textPaintViewCreateText;
                } else {
                    i3 = size;
                    if (b3 == 2) {
                        PhotoView photoViewCreatePhoto = createPhoto(mediaEntity.text, false);
                        photoViewCreatePhoto.segmentingLoading = false;
                        if ((mediaEntity.subType & 2) != 0) {
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
                        anonymousClass17 = photoViewCreatePhoto;
                    }
                    i4++;
                    size = i3;
                    b = 1;
                    z = false;
                    b2 = 2;
                }
                anonymousClass17.setX((mediaEntity.x * this.paintingSize.width) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                anonymousClass17.setY((mediaEntity.y * this.paintingSize.height) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                anonymousClass17.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + anonymousClass17.getX(), (mediaEntity.viewHeight / 2.0f) + anonymousClass17.getY()));
                anonymousClass17.setScale(mediaEntity.scale);
                anonymousClass17.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                i4++;
                size = i3;
                b = 1;
                z = false;
                b2 = 2;
            }
        }
        this.entitiesView.setVisibility(4);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.selectionContainerView = anonymousClass7;
        addView(anonymousClass7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout2 = this.topLayout;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(this.topLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        this.undoButton.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.undoButton.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        this.undoButton.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 1));
        this.undoButton.setAlpha(0.6f);
        this.undoButton.setClickable(false);
        this.topLayout.addView(this.undoButton, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.zoomOutButton = linearLayout;
        linearLayout.setOrientation(0);
        this.zoomOutButton.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        this.zoomOutButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        this.zoomOutText = textView;
        textView.setTextColor(-1);
        this.zoomOutText.setTypeface(AndroidUtilities.bold());
        this.zoomOutText.setTextSize(1, 16.0f);
        this.zoomOutText.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        this.zoomOutImage = imageView2;
        imageView2.setImageResource(R.drawable.photo_zoomout);
        this.zoomOutButton.addView(this.zoomOutImage, LayoutHelper.createLinear(24, 24, 16, 0, 0, 8, 0));
        this.zoomOutButton.addView(this.zoomOutText, LayoutHelper.createLinear(-2, -2, 16));
        this.zoomOutButton.setAlpha(0.0f);
        this.zoomOutButton.setOnClickListener(new BotAdView$$ExternalSyntheticLambda0(2));
        this.topLayout.addView(this.zoomOutButton, LayoutHelper.createFrame(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.undoAllButton = textView2;
        textView2.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        this.undoAllButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.undoAllButton.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        this.undoAllButton.setGravity(16);
        this.undoAllButton.setTextColor(-1);
        this.undoAllButton.setTypeface(AndroidUtilities.bold());
        this.undoAllButton.setTextSize(1, 16.0f);
        this.undoAllButton.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 2));
        this.undoAllButton.setAlpha(0.6f);
        TextView textViewM = zzkj.m(this.topLayout, this.undoAllButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.cancelTextButton = textViewM;
        textViewM.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        this.cancelTextButton.setText(LocaleController.getString(R.string.Clear));
        this.cancelTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.cancelTextButton.setGravity(16);
        this.cancelTextButton.setTextColor(-1);
        this.cancelTextButton.setTypeface(AndroidUtilities.bold());
        this.cancelTextButton.setTextSize(1, 16.0f);
        this.cancelTextButton.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 3));
        this.cancelTextButton.setAlpha(0.0f);
        this.cancelTextButton.setVisibility(8);
        TextView textViewM2 = zzkj.m(this.topLayout, this.cancelTextButton, LayoutHelper.createFrame(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.doneTextButton = textViewM2;
        textViewM2.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        this.doneTextButton.setText(LocaleController.getString(R.string.Done));
        this.doneTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.doneTextButton.setGravity(16);
        this.doneTextButton.setTextColor(-1);
        this.doneTextButton.setTypeface(AndroidUtilities.bold());
        this.doneTextButton.setTextSize(1, 16.0f);
        this.doneTextButton.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 4));
        this.doneTextButton.setAlpha(0.0f);
        this.doneTextButton.setVisibility(8);
        this.topLayout.addView(this.doneTextButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        BottomLayout bottomLayout = new BottomLayout(context);
        this.bottomLayout = bottomLayout;
        bottomLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        this.bottomLayout.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(this.bottomLayout, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, bitmap2 != null);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.paintToolsView.setDelegate(this);
        this.paintToolsView.setSelectedIndex(1);
        this.bottomLayout.addView(this.paintToolsView, LayoutHelper.createFrame(-1, 48.0f));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.textOptionsView.setVisibility(8);
        this.textOptionsView.setDelegate(this);
        this.textOptionsView.setAlignment(PersistColorPalette.getInstance(i).currentAlignment);
        this.bottomLayout.addView(this.textOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        FrameLayout frameLayout3 = new FrameLayout(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                lPhotoPaintView.typefaceMenuOutlinePaint.setAlpha((int) ((1.0f - lPhotoPaintView.typefaceMenuTransformProgress) * lPhotoPaintView.textOptionsView.getAlpha() * 102.0f));
                PaintTextOptionsView paintTextOptionsView2 = lPhotoPaintView.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                float fDp = AndroidUtilities.dp(8.0f) + paintTextOptionsView2.typefaceCell.getLeft();
                PaintTextOptionsView.TypefaceCell typefaceCell = paintTextOptionsView2.typefaceCell;
                rectF.set(fDp, typefaceCell.getTop(), AndroidUtilities.dp(8.0f) + typefaceCell.getRight(), typefaceCell.getBottom());
                float translationY = lPhotoPaintView.textOptionsView.getTranslationY() + lPhotoPaintView.bottomLayout.getTranslationY() + lPhotoPaintView.textOptionsView.getTop() + lPhotoPaintView.bottomLayout.getTop();
                rectF.set(AndroidUtilities.lerp(rectF.left, lPhotoPaintView.typefaceListView.getLeft(), lPhotoPaintView.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + translationY, lPhotoPaintView.typefaceListView.getTop() - lPhotoPaintView.typefaceListView.getTranslationY(), lPhotoPaintView.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, lPhotoPaintView.typefaceListView.getRight(), lPhotoPaintView.typefaceMenuTransformProgress), AndroidUtilities.lerp(translationY + rectF.bottom, lPhotoPaintView.typefaceListView.getBottom() - lPhotoPaintView.typefaceListView.getTranslationY(), lPhotoPaintView.typefaceMenuTransformProgress));
                float fDp2 = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, lPhotoPaintView.typefaceMenuTransformProgress));
                int alpha = lPhotoPaintView.typefaceMenuBackgroundPaint.getAlpha();
                lPhotoPaintView.typefaceMenuBackgroundPaint.setAlpha((int) (lPhotoPaintView.typefaceMenuTransformProgress * alpha));
                canvas.drawRoundRect(rectF, fDp2, fDp2, lPhotoPaintView.typefaceMenuBackgroundPaint);
                lPhotoPaintView.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, fDp2, fDp2, lPhotoPaintView.typefaceMenuOutlinePaint);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                    if (lPhotoPaintView.isTypefaceMenuShown) {
                        lPhotoPaintView.showTypefaceMenu(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.overlayLayout = frameLayout3;
        addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        this.typefaceListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 6));
        this.textOptionsView.setTypefaceListView(this.typefaceListView);
        this.overlayLayout.addView(this.typefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.typefaceMenuOutlinePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.typefaceMenuOutlinePaint.setColor(1728053247);
        this.typefaceMenuOutlinePaint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(f)));
        this.typefaceMenuBackgroundPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
        PaintColorsListView paintColorsListView = new PaintColorsListView(context) {
            public final Path path = new Path();

            @Override
            public final void draw(Canvas canvas) {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                ViewGroup barView = lPhotoPaintView.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), lPhotoPaintView.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), lPhotoPaintView.toolsTransformProgress));
                Path path = this.path;
                path.rewind();
                path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.colorsListView = paintColorsListView;
        paintColorsListView.setVisibility(8);
        this.colorsListView.setColorPalette(PersistColorPalette.getInstance(i));
        this.colorsListView.setColorListener(new LPhotoPaintView$$ExternalSyntheticLambda30(this, 0));
        this.bottomLayout.addView(this.colorsListView, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.cancelButton.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        this.bottomLayout.addView(this.cancelButton, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.doneButton.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        this.doneButton.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, context, bitmap2, 3));
        this.bottomLayout.addView(this.doneButton, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(this.colorSwatch);
        this.weightChooserView.setRenderView(this.renderView);
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        this.weightChooserView.setOnUpdate(new Theme$$ExternalSyntheticLambda19(this, i, 10));
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout4;
        addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
        this.colorSwatchOutlinePaint.setStyle(style);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(f2));
        setCurrentSwatch(null, this.colorSwatch, true);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        }
    }

    public static int access$2300(LPhotoPaintView lPhotoPaintView, int i) {
        return Theme.getColor(i, lPhotoPaintView.resourcesProvider);
    }

    public static View access$3700(LPhotoPaintView lPhotoPaintView, int i) {
        if (i == 0) {
            return lPhotoPaintView.paintToolsView;
        }
        if (i == 2) {
            return lPhotoPaintView.textOptionsView;
        }
        lPhotoPaintView.getClass();
        return null;
    }

    public static boolean access$600(LPhotoPaintView lPhotoPaintView, EntityView entityView) {
        return lPhotoPaintView.selectEntity(entityView, true);
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
        int i;
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        float width = this.bitmapToEdit.getWidth();
        float height = this.bitmapToEdit.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            i = devicePerformanceClass != 2 ? 2560 : 3840;
        } else {
            i = 1280;
        }
        Size size2 = new Size(width, height);
        float f = i;
        size2.width = f;
        float fFloor = (float) Math.floor((f * height) / width);
        size2.height = fFloor;
        if (fFloor > f) {
            size2.height = f;
            size2.width = (float) Math.floor((f * width) / height);
        }
        this.paintingSize = size2;
        return size2;
    }

    public static int lambda$new$0(Theme.ResourcesProvider resourcesProvider, int i) {
        if (i == Theme.key_actionBarDefaultSubmenuBackground) {
            return -14145495;
        }
        if (i == Theme.key_actionBarDefaultSubmenuItem) {
            return -1;
        }
        if (i == Theme.key_dialogBackground) {
            return -14737633;
        }
        if (i == Theme.key_dialogTextBlack) {
            return -592138;
        }
        if (i == Theme.key_dialogTextGray3) {
            return -8553091;
        }
        if (i == Theme.key_chat_emojiPanelBackground) {
            return -16777216;
        }
        if (i == Theme.key_chat_emojiPanelShadowLine) {
            return -1610612736;
        }
        if (i == Theme.key_chat_emojiBottomPanelIcon || i == Theme.key_chat_emojiPanelBackspace || i == Theme.key_chat_emojiPanelIcon) {
            return -9539985;
        }
        if (i == Theme.key_windowBackgroundWhiteBlackText) {
            return -1;
        }
        int i2 = Theme.key_featuredStickers_addedIcon;
        if (i == i2) {
            return -11754001;
        }
        if (i == Theme.key_listSelector) {
            return 536870911;
        }
        if (i == Theme.key_profile_tabSelectedText || i == Theme.key_profile_tabText || i == Theme.key_profile_tabSelectedLine) {
            return -1;
        }
        if (i == Theme.key_profile_tabSelector) {
            return 352321535;
        }
        if (i == Theme.key_chat_emojiSearchIcon || i == i2) {
            return -7895161;
        }
        if (i == Theme.key_chat_emojiSearchBackground) {
            return 780633991;
        }
        if (i == Theme.key_windowBackgroundGray) {
            return -15921907;
        }
        if (i == Theme.key_fastScrollInactive) {
            return -12500671;
        }
        if (i == Theme.key_fastScrollActive) {
            return -13133079;
        }
        if (i == Theme.key_fastScrollText) {
            return -1;
        }
        if (i == Theme.key_windowBackgroundWhite) {
            return -15198183;
        }
        if (i == Theme.key_divider) {
            return -16777216;
        }
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public static void lambda$onSwitchSegmentedAnimation$49(PhotoView photoView) {
        TONIntroActivity.AnonymousClass2 anonymousClass2 = photoView.containerView;
        if (anonymousClass2 != null) {
            anonymousClass2.invalidate();
        }
    }

    public static void lambda$onSwitchSegmentedAnimation$50() {
    }

    public static void lambda$shutdown$25() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    public void setNewColor(int i) {
        Swatch swatch = this.colorSwatch;
        int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(null, swatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, i2, i, 2));
        duration.start();
    }

    public static void setTextAlignment(TextPaintView textPaintView, int i) {
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
        this.textOptionsView.setOutlineType(i);
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
        textView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, this.resourcesProvider), 7, -1));
        this.drawTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.drawTab.setTextColor(-1);
        this.drawTab.setTextSize(1, 14.0f);
        this.drawTab.setGravity(1);
        this.drawTab.setTypeface(AndroidUtilities.bold());
        this.drawTab.setSingleLine();
        this.drawTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 0));
        this.tabsLayout.addView(this.drawTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        this.stickerTab = textView3;
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.PhotoEditorSticker, textView3);
        this.stickerTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, this.resourcesProvider), 7, -1));
        this.stickerTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.stickerTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 5));
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
        this.textTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, this.resourcesProvider), 7, -1));
        this.textTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.textTab.setTextColor(-1);
        this.textTab.setTextSize(1, 14.0f);
        this.textTab.setGravity(1);
        this.textTab.setTypeface(AndroidUtilities.bold());
        this.textTab.setAlpha(0.6f);
        this.textTab.setSingleLine();
        this.textTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 6));
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(0, -2, 1.0f));
    }

    @Override
    public float adjustPanLayoutHelperProgress() {
        return this.panTranslationProgress;
    }

    @Override
    public boolean allowInteraction(EntityView entityView) {
        return !this.editingText;
    }

    public void appearAnimation(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ChatActionCell$$ExternalSyntheticLambda8(23, this, view)).start();
    }

    public final PopupButton buttonForPopup(String str, int i, Runnable runnable) {
        PopupButton popupButton = new PopupButton(getContext());
        popupButton.setIcon(i);
        popupButton.setText(str);
        popupButton.setSelected(false);
        if (runnable != null) {
            popupButton.setOnClickListener(new TextCheckCell2$$ExternalSyntheticLambda0(3, runnable));
        }
        return popupButton;
    }

    public final PointF centerPositionForEntity() {
        Size paintingSize = getPaintingSize();
        float f = paintingSize.width / 2.0f;
        float f2 = paintingSize.height / 2.0f;
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float fCos = (float) ((Math.cos(radians) * ((double) this.currentCropState.cropPx)) - (Math.sin(radians) * ((double) this.currentCropState.cropPy)));
            float fM = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, this.currentCropState.cropPy, Math.sin(radians) * ((double) this.currentCropState.cropPx));
            f -= fCos * paintingSize.width;
            f2 -= fM * paintingSize.height;
        }
        return new PointF(f, f2);
    }

    public void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.allowEmojisForNonPremium(true);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass21());
        addView(this.emojiView);
    }

    public PhotoView createPhoto(String str, boolean z) {
        float f;
        Size size;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f = 1.0f;
        }
        if (f > 1.0f) {
            float fFloor = (float) Math.floor(((double) this.entitiesView.getMeasuredWidth()) * 0.5d);
            size = new Size(fFloor, fFloor / f);
        } else {
            float fFloor2 = (float) Math.floor(((double) this.entitiesView.getMeasuredHeight()) * 0.5d);
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
        PointF pointFCenterPositionForEntity = centerPositionForEntity();
        int iIntValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        PhotoView photoView = new PhotoView(context, pointFCenterPositionForEntity, size2, str, iIntValue);
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        if (z) {
            registerRemovalUndo(photoView);
            selectEntity(photoView, true);
        }
        return photoView;
    }

    public final AnonymousClass17 createSticker(Object obj, TLRPC.Document document, boolean z) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f;
        double d;
        StickerPosition stickerPosition;
        ?? r0;
        boolean zIsTextColorEmoji;
        ImageReceiver imageReceiver;
        PointF pointF;
        int i;
        ArrayList<PhotoFace> arrayList;
        PhotoFace photoFace;
        PointF pointF2;
        PointF pointF3;
        PhotoFace photoFace2;
        float f2;
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i3++;
        }
        MediaController.CropState cropState = this.currentCropState;
        float f3 = 0.75f;
        if (cropState != null) {
            f = -(cropState.transformRotation + cropState.cropRotate);
            f3 = 0.75f / cropState.cropScale;
        } else {
            f = 0.0f;
        }
        StickerPosition stickerPosition2 = new StickerPosition(centerPositionForEntity(), f3, f);
        int i4 = 1;
        int i5 = 2;
        if (tL_maskCoords != null && (arrayList = this.faces) != null && arrayList.size() != 0) {
            int i6 = tL_maskCoords.n;
            long j = document.id;
            int i7 = 3;
            if (i6 >= 0 && i6 <= 3 && !this.faces.isEmpty()) {
                int size = this.faces.size();
                int iNextInt = Utilities.random.nextInt(size);
                int i8 = size;
                loop1: while (true) {
                    if (i8 <= 0) {
                        d = 0.5d;
                        photoFace = null;
                        break;
                    }
                    photoFace = this.faces.get(iNextInt);
                    if (i6 == 0) {
                        pointF3 = photoFace.foreheadPoint;
                    } else if (i6 == i4) {
                        pointF3 = photoFace.eyesCenterPoint;
                    } else if (i6 == i5) {
                        pointF3 = photoFace.mouthPoint;
                    } else if (i6 != i7) {
                        photoFace.getClass();
                        pointF3 = null;
                    } else {
                        pointF3 = photoFace.chinPoint;
                    }
                    if (pointF3 != null) {
                        d = 0.5d;
                        float f4 = photoFace.width * 1.1f;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= this.entitiesView.getChildCount()) {
                                break loop1;
                            }
                            View childAt = this.entitiesView.getChildAt(i9);
                            if (childAt instanceof StickerView) {
                                StickerView stickerView = (StickerView) childAt;
                                if (stickerView.getAnchor() != i6) {
                                    photoFace2 = photoFace;
                                    f2 = f4;
                                    i2 = i9;
                                } else {
                                    PointF position = stickerView.getPosition();
                                    photoFace2 = photoFace;
                                    f2 = f4;
                                    i2 = i9;
                                    float fHypot = (float) Math.hypot(position.x - pointF3.x, position.y - pointF3.y);
                                    if ((j == stickerView.getSticker().id || this.faces.size() > 1) && fHypot < f2) {
                                        break;
                                    }
                                }
                            } else {
                                photoFace2 = photoFace;
                                f2 = f4;
                                i2 = i9;
                            }
                            i9 = i2 + 1;
                            f4 = f2;
                            photoFace = photoFace2;
                        }
                    }
                    iNextInt = (iNextInt + 1) % size;
                    i8--;
                    i4 = 1;
                    i5 = 2;
                    i7 = 3;
                }
            } else {
                d = 0.5d;
                photoFace = null;
                break;
            }
            if (photoFace != null) {
                if (i6 == 0) {
                    pointF2 = photoFace.foreheadPoint;
                } else if (i6 == 1) {
                    pointF2 = photoFace.eyesCenterPoint;
                } else if (i6 != 2) {
                    pointF2 = i6 != 3 ? null : photoFace.chinPoint;
                } else {
                    pointF2 = photoFace.mouthPoint;
                }
                float f5 = i6 == 1 ? photoFace.eyesDistance : photoFace.width;
                float fFloor = (float) Math.floor(((double) getPaintingSize().width) * d);
                float f6 = (float) (((double) (f5 / new Size(fFloor, fFloor).width)) * tL_maskCoords.zoom);
                float f7 = photoFace.angle;
                double radians = (float) Math.toRadians(f7);
                double d2 = 1.5707963267948966d - radians;
                double d3 = f5;
                double d4 = radians + 1.5707963267948966d;
                stickerPosition = new StickerPosition(new PointF(pointF2.x + ((float) (Math.sin(d2) * d3 * tL_maskCoords.x)) + ((float) (Math.cos(d4) * d3 * tL_maskCoords.y)), pointF2.y + ((float) (Math.cos(d2) * d3 * tL_maskCoords.x)) + ((float) (Math.sin(d4) * d3 * tL_maskCoords.y))), f6, f7);
            }
            Context context = getContext();
            float fFloor2 = (float) Math.floor(((double) getPaintingSize().width) * d);
            r0 = new StickerView(context, stickerPosition.position, stickerPosition.angle, stickerPosition.scale, new Size(fFloor2, fFloor2), document, obj) {
                @Override
                public final void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                    LPhotoPaintView.this.didSetAnimatedSticker(rLottieDrawable);
                }
            };
            zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
            imageReceiver = r0.centerImage;
            if (zIsTextColorEmoji) {
                imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            imageReceiver.setLayerNum(12);
            pointF = stickerPosition.position;
            if (pointF.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
                i = 2;
                r0.setStickyX(2);
            } else {
                i = 2;
            }
            if (pointF.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
                r0.setStickyY(i);
            }
            r0.setDelegate(this);
            this.entitiesView.addView(r0);
            if (z) {
                registerRemovalUndo(r0);
                selectEntity(r0, true);
            }
            return r0;
        }
        d = 0.5d;
        stickerPosition = stickerPosition2;
        Context context2 = getContext();
        float fFloor3 = (float) Math.floor(((double) getPaintingSize().width) * d);
        r0 = new StickerView(context2, stickerPosition.position, stickerPosition.angle, stickerPosition.scale, new Size(fFloor3, fFloor3), document, obj) {
            @Override
            public final void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                LPhotoPaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        imageReceiver = r0.centerImage;
        if (zIsTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        pointF = stickerPosition.position;
        if (pointF.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            i = 2;
            r0.setStickyX(2);
        } else {
            i = 2;
        }
        if (pointF.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            r0.setStickyY(i);
        }
        r0.setDelegate(this);
        this.entitiesView.addView(r0);
        if (z) {
            registerRemovalUndo(r0);
            selectEntity(r0, true);
        }
        return r0;
    }

    public final TextPaintView createText(boolean z) {
        onTextAdd();
        Size paintingSize = getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        TextPaintView textPaintView = new TextPaintView(getContext(), pointFStartPositionRelativeToEntity, (int) (paintingSize.width / 9.0f), "", this.colorSwatch, this.selectedTextType);
        float f = paintingSize.width / 9.0f;
        LPhotoPaintView$$ExternalSyntheticLambda13 lPhotoPaintView$$ExternalSyntheticLambda13 = new LPhotoPaintView$$ExternalSyntheticLambda13(this, 4);
        textPaintView.minFontSize = (int) (0.5f * f);
        textPaintView.maxFontSize = (int) (f * 2.0f);
        textPaintView.onFontChange = lPhotoPaintView$$ExternalSyntheticLambda13;
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth((int) (paintingSize.width - 20.0f));
        textPaintView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).currentTypeface);
        textPaintView.setType(PersistColorPalette.getInstance(this.currentAccount).currentTextType);
        this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            textPaintView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(textPaintView);
            textPaintView.beginEditing();
            selectEntity(textPaintView, false);
            textPaintView.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(textPaintView.getFocusedView());
            this.editingText = true;
            this.textOptionsView.setAlignment(PersistColorPalette.getInstance(this.currentAccount).currentAlignment, true);
            this.textOptionsView.setOutlineType(PersistColorPalette.getInstance(this.currentAccount).currentTextType);
        }
        return textPaintView;
    }

    public final void detectFaces() {
        this.queue.postRunnable(new LPhotoPaintView$$ExternalSyntheticLambda13(this, 0), 200L);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TextPaintView textPaintView;
        String str;
        if (i != NotificationCenter.customTypefacesLoaded || this.entitiesView == null) {
            return;
        }
        for (int i3 = 0; i3 < this.entitiesView.getChildCount(); i3++) {
            View childAt = this.entitiesView.getChildAt(i3);
            if ((childAt instanceof TextPaintView) && (str = (textPaintView = (TextPaintView) childAt).lastTypefaceKey) != null) {
                textPaintView.setTypeface(str);
            }
        }
    }

    public abstract void didSetAnimatedSticker(RLottieDrawable rLottieDrawable);

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        EntitiesContainerView entitiesContainerView;
        FrameLayout frameLayout;
        int i = 0;
        if (view == this.entitiesView) {
            float f = this.shadowAlpha.set(this.drawShadow);
            if (f > 0.0f) {
                this.shadowPaint.setShadowLayer(AndroidUtilities.dp(24.0f * f), 0.0f, 0.0f, Theme.multAlpha(f, 1090519039));
                this.shadowPaint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(this.entitiesView.getX(), this.entitiesView.getY());
                canvas.scale(this.entitiesView.getScaleX(), this.entitiesView.getScaleY(), this.entitiesView.getWidth() / 2.0f, this.entitiesView.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, this.entitiesView.getWidth(), this.entitiesView.getHeight(), this.shadowPaint);
                canvas.drawRect(0.0f, 0.0f, this.entitiesView.getWidth(), this.entitiesView.getHeight(), this.clearPaint);
                canvas.restore();
            }
        }
        if ((view == this.renderView || view == this.renderInputView || ((view == (entitiesContainerView = this.entitiesView) && entitiesContainerView.getClipChildren()) || (view == (frameLayout = this.selectionContainerView) && frameLayout.getClipChildren()))) && this.currentCropState != null) {
            canvas.save();
            i = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i2 = cropState.transformRotation;
            if (i2 != 90 && i2 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = view.getScaleX() * measuredHeight * cropState.cropPw;
            MediaController.CropState cropState2 = this.currentCropState;
            int i3 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState2.cropPh)) / this.currentCropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - i3) / 2.0f)) + this.transformX;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.emojiPadding) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + i3, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return zDrawChild;
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
    public Bitmap getBitmap(ArrayList<VideoEditedInfo.MediaEntity> arrayList, Bitmap[] bitmapArr) {
        Canvas canvas;
        float f;
        boolean z;
        String absolutePath;
        boolean z2;
        TextPaintView textPaintView;
        CharSequence charSequence;
        LPhotoPaintView lPhotoPaintView = this;
        int i = 0;
        Bitmap resultBitmap = lPhotoPaintView.renderView.getResultBitmap(false, false);
        lPhotoPaintView.lcm = BigInteger.ONE;
        if (resultBitmap != null) {
            EntitiesContainerView entitiesContainerView = lPhotoPaintView.entitiesView;
            int i2 = 0;
            for (int i3 = 0; i3 < entitiesContainerView.getChildCount(); i3++) {
                if (entitiesContainerView.getChildAt(i3) instanceof EntityView) {
                    i2++;
                }
            }
            if (i2 > 0) {
                int childCount = lPhotoPaintView.entitiesView.getChildCount();
                Canvas canvas2 = null;
                int i4 = 0;
                while (i4 < childCount) {
                    View childAt = lPhotoPaintView.entitiesView.getChildAt(i4);
                    if (childAt instanceof EntityView) {
                        EntityView entityView = (EntityView) childAt;
                        PointF position = entityView.getPosition();
                        if (arrayList != 0) {
                            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                            f = 2.0f;
                            if (entityView instanceof TextPaintView) {
                                mediaEntity.type = (byte) 1;
                                TextPaintView textPaintView2 = (TextPaintView) entityView;
                                CharSequence text = textPaintView2.getText();
                                if (text instanceof Spanned) {
                                    Spanned spanned = (Spanned) text;
                                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, text.length(), AnimatedEmojiSpan.class);
                                    if (animatedEmojiSpanArr != null) {
                                        int i5 = 0;
                                        while (i5 < animatedEmojiSpanArr.length) {
                                            AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i5];
                                            Canvas canvas3 = canvas2;
                                            TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                                            if (documentFindDocument == null) {
                                                documentFindDocument = AnimatedEmojiDrawable.findDocument(lPhotoPaintView.currentAccount, animatedEmojiSpan.getDocumentId());
                                            }
                                            if (documentFindDocument != null) {
                                                AnimatedEmojiDrawable.getDocumentFetcher(lPhotoPaintView.currentAccount).putDocument(documentFindDocument);
                                            }
                                            VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                            TextPaintView textPaintView3 = textPaintView2;
                                            CharSequence charSequence2 = text;
                                            emojiEntity.document_id = animatedEmojiSpan.getDocumentId();
                                            emojiEntity.document = documentFindDocument;
                                            emojiEntity.offset = spanned.getSpanStart(animatedEmojiSpan);
                                            emojiEntity.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity.offset;
                                            emojiEntity.documentAbsolutePath = FileLoader.getInstance(lPhotoPaintView.currentAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                            boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                            if (zIsAnimatedStickerDocument || MessageObject.isVideoStickerDocument(emojiEntity.document)) {
                                                emojiEntity.subType = (byte) ((zIsAnimatedStickerDocument ? (byte) 1 : (byte) 4) | emojiEntity.subType);
                                            }
                                            mediaEntity.entities.add(emojiEntity);
                                            if (documentFindDocument != null) {
                                                BigInteger bigIntegerValueOf = BigInteger.valueOf(5000L);
                                                lPhotoPaintView.lcm = lPhotoPaintView.lcm.multiply(bigIntegerValueOf).divide(lPhotoPaintView.lcm.gcd(bigIntegerValueOf));
                                            }
                                            textPaintView2 = textPaintView3;
                                            animatedEmojiSpanArr = animatedEmojiSpanArr;
                                            text = charSequence2;
                                            i5++;
                                            canvas2 = canvas3;
                                        }
                                    }
                                    canvas = canvas2;
                                    textPaintView = textPaintView2;
                                    charSequence = text;
                                    mediaEntity.entities.isEmpty();
                                } else {
                                    canvas = canvas2;
                                    textPaintView = textPaintView2;
                                    charSequence = text;
                                }
                                mediaEntity.text = charSequence.toString();
                                mediaEntity.subType = (byte) textPaintView.getType();
                                mediaEntity.color = textPaintView.getSwatch().color;
                                mediaEntity.fontSize = textPaintView.getTextSize();
                                mediaEntity.textTypeface = textPaintView.getTypeface();
                                mediaEntity.textAlign = textPaintView.getAlign();
                            } else {
                                canvas = canvas2;
                                if (entityView instanceof StickerView) {
                                    mediaEntity.type = (byte) 0;
                                    StickerView stickerView = (StickerView) entityView;
                                    Size baseSize = stickerView.getBaseSize();
                                    mediaEntity.width = baseSize.width;
                                    mediaEntity.height = baseSize.height;
                                    mediaEntity.document = stickerView.getSticker();
                                    mediaEntity.parentObject = stickerView.getParentObject();
                                    TLRPC.Document sticker = stickerView.getSticker();
                                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                    if (MessageObject.isAnimatedStickerDocument(sticker, true) || MessageObject.isVideoStickerDocument(sticker)) {
                                        boolean zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                        mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                        long duration = zIsAnimatedStickerDocument2 ? stickerView.getDuration() : 5000L;
                                        if (duration != 0) {
                                            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(duration);
                                            lPhotoPaintView.lcm = lPhotoPaintView.lcm.multiply(bigIntegerValueOf2).divide(lPhotoPaintView.lcm.gcd(bigIntegerValueOf2));
                                        }
                                    }
                                    if (stickerView.mirrored) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                } else {
                                    if (entityView instanceof PhotoView) {
                                        PhotoView photoView = (PhotoView) entityView;
                                        mediaEntity.type = (byte) 2;
                                        Size baseSize2 = photoView.getBaseSize();
                                        mediaEntity.width = baseSize2.width;
                                        mediaEntity.height = baseSize2.height;
                                        int i6 = lPhotoPaintView.currentAccount;
                                        TLObject tLObject = photoView.object;
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
                                        if (photoView.mirrored) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                        z2 = false;
                                    }
                                    i4++;
                                    lPhotoPaintView = this;
                                    i = 0;
                                }
                                arrayList.add(mediaEntity);
                                float scaleX = childAt.getScaleX();
                                float scaleY = childAt.getScaleY();
                                float x = childAt.getX();
                                float y = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                                mediaEntity.x = ((((1.0f - scaleX) * childAt.getWidth()) / 2.0f) + x) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                                mediaEntity.y = ((((1.0f - scaleY) * childAt.getHeight()) / 2.0f) + y) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / lPhotoPaintView.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / lPhotoPaintView.entitiesView.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (bitmapArr[0] == null) {
                                    bitmapArr[0] = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), resultBitmap.getConfig());
                                    Canvas canvas4 = new Canvas(bitmapArr[0]);
                                    canvas4.drawBitmap(resultBitmap, 0.0f, 0.0f, (Paint) null);
                                    canvas = canvas4;
                                }
                                z = z2;
                            }
                            z2 = true;
                            arrayList.add(mediaEntity);
                            float scaleX2 = childAt.getScaleX();
                            float scaleY2 = childAt.getScaleY();
                            float x2 = childAt.getX();
                            float y2 = childAt.getY();
                            mediaEntity.viewWidth = childAt.getWidth();
                            mediaEntity.viewHeight = childAt.getHeight();
                            mediaEntity.width = (childAt.getWidth() * scaleX2) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.height = (childAt.getHeight() * scaleY2) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.x = ((((1.0f - scaleX2) * childAt.getWidth()) / 2.0f) + x2) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.y = ((((1.0f - scaleY2) * childAt.getHeight()) / 2.0f) + y2) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                            mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x2) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y2) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.textViewWidth = mediaEntity.viewWidth / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewHeight = mediaEntity.viewHeight / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.scale = scaleX2;
                            if (bitmapArr[0] == null) {
                                bitmapArr[0] = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), resultBitmap.getConfig());
                                Canvas canvas5 = new Canvas(bitmapArr[0]);
                                canvas5.drawBitmap(resultBitmap, 0.0f, 0.0f, (Paint) null);
                                canvas = canvas5;
                            }
                            z = z2;
                        } else {
                            canvas = canvas2;
                            f = 2.0f;
                            z = false;
                        }
                        Canvas canvas6 = new Canvas(resultBitmap);
                        int i7 = 0;
                        while (i7 < 2) {
                            Canvas canvas7 = i7 == 0 ? canvas6 : canvas;
                            if (canvas7 != null && (i7 != 0 || !z)) {
                                canvas7.save();
                                canvas7.translate(position.x, position.y);
                                canvas7.scale(childAt.getScaleX(), childAt.getScaleY());
                                canvas7.rotate(childAt.getRotation());
                                canvas7.translate((-entityView.getWidth()) / f, (-entityView.getHeight()) / f);
                                if (!(childAt instanceof TextPaintView) || childAt.getHeight() <= 0 || childAt.getWidth() <= 0) {
                                    childAt.draw(canvas7);
                                } else {
                                    Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas8 = new Canvas(bitmapCreateBitmap);
                                    childAt.draw(canvas8);
                                    canvas7.drawBitmap(bitmapCreateBitmap, (Rect) null, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
                                    try {
                                        canvas8.setBitmap(null);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    bitmapCreateBitmap.recycle();
                                }
                                canvas7.restore();
                            }
                            i7++;
                        }
                        canvas2 = canvas;
                        i4++;
                        lPhotoPaintView = this;
                        i = 0;
                    } else {
                        canvas = canvas2;
                    }
                    canvas2 = canvas;
                    i4++;
                    lPhotoPaintView = this;
                    i = 0;
                }
            }
        }
        return resultBitmap;
    }

    @Override
    public View getCancelView() {
        return this.cancelButton;
    }

    @Override
    public int[] getCenterLocation(EntityView entityView) {
        return getCenterLocationInWindow(entityView);
    }

    public final int[] getCenterLocationInWindow(EntityView entityView) {
        this.position[0] = entityView.getWidth() / 2.0f;
        this.position[1] = entityView.getHeight() / 2.0f;
        entityView.getMatrix().mapPoints(this.position);
        float[] fArr = this.position;
        fArr[0] = fArr[0] + entityView.getLeft();
        float[] fArr2 = this.position;
        fArr2[1] = fArr2[1] + entityView.getTop();
        Object parent = entityView.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            float[] fArr3 = this.position;
            fArr3[0] = fArr3[0] - view.getScrollX();
            float[] fArr4 = this.position;
            fArr4[1] = fArr4[1] - view.getScrollY();
            view.getMatrix().mapPoints(this.position);
            float[] fArr5 = this.position;
            fArr5[0] = fArr5[0] + view.getLeft();
            float[] fArr6 = this.position;
            fArr6[1] = fArr6[1] + view.getTop();
            parent = view.getParent();
        }
        this.pos2[0] = Math.round(this.position[0]);
        this.pos2[1] = Math.round(this.position[1]);
        int[] iArr = this.pos2;
        float f = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f2 = f - (point.x / 2.0f);
        float f3 = iArr[1] - (point.y / 2.0f);
        double d = f2;
        double radians = (float) Math.toRadians(-this.entitiesView.getRotation());
        double d2 = f3;
        this.pos2[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        this.pos2[1] = (AndroidUtilities.displaySize.y / 2) + ((int) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
        return this.pos2;
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
    public int getEmojiPadding(boolean z) {
        boolean z2 = this.translateBottomPanelAfterResize;
        if (this.keyboardVisible && z2 && !z) {
            return 0;
        }
        return this.emojiPadding;
    }

    @Override
    public long getLcm() {
        return this.lcm.longValue();
    }

    @Override
    public List<TLRPC.InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int childCount = this.entitiesView.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.entitiesView.getChildAt(i);
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
        return this.offsetTranslationY;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    @Override
    public RenderView getRenderView() {
        return this.renderView;
    }

    public float getSelectedEntityBottom() {
        EntityView entityView = this.currentEntityView;
        if (entityView == null) {
            return getY() + this.entitiesView.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        entityView.getLocationInWindow(iArr);
        return (this.entitiesView.getScaleY() * this.currentEntityView.getHeight()) + iArr[1];
    }

    public ThanosEffect getThanosEffect() {
        if (!ThanosEffect.supports()) {
            return null;
        }
        if (this.thanosEffect == null) {
            ThanosEffect thanosEffect = new ThanosEffect(getContext(), new LPhotoPaintView$$ExternalSyntheticLambda13(this, 1));
            this.thanosEffect = thanosEffect;
            addView(thanosEffect);
        }
        return this.thanosEffect;
    }

    @Override
    public void getTransformedTouch(float f, float f2, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        float f3 = f - (point.x / 2.0f);
        float f4 = f2 - (point.y / 2.0f);
        double d = f3;
        double radians = (float) Math.toRadians(-this.entitiesView.getRotation());
        double d2 = f4;
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
    }

    @Override
    public final View getView() {
        return IPhotoPaintView.CC.$default$getView(this);
    }

    @Override
    public boolean hasChanges() {
        return this.undoStore.canUndo();
    }

    public final void hideEmojiPopup(boolean z) {
        int i = 1;
        if (this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView == null || emojiView.getVisibility() != 0 || this.waitingForKeyboardOpen) {
                hideEmojiView$1();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
            this.bottomPanelIgnoreOnce = false;
            valueAnimatorOfFloat.addUpdateListener(new LPhotoPaintView$$ExternalSyntheticLambda20(this, i));
            this.isAnimatePopupClosing = true;
            valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public final void hideEmojiView$1() {
        EmojiView emojiView;
        if (this.emojiPadding > 0) {
            updateKeyboard();
        }
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        this.emojiPadding = 0;
    }

    @Override
    public void init() {
        this.textOptionsView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).currentTypeface);
        this.entitiesView.setVisibility(0);
        this.renderView.setVisibility(0);
        this.renderInputView.setVisibility(0);
    }

    public boolean isCurrentText() {
        return this.currentEntityView instanceof TextPaintView;
    }

    public final void lambda$appearAnimation$23(View view) {
        if (view instanceof EntityView) {
            EntityView entityView = (EntityView) view;
            EntityView.SelectionView selectionView = entityView.selectionView;
            if (selectionView != null) {
                selectionView.updatePosition();
            }
            selectEntity(entityView, true);
        }
    }

    public final void lambda$createText$13() {
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        if (paintWeightChooserView != null) {
            paintWeightChooserView.invalidate();
        }
    }

    public final void lambda$detectFaces$24() {
        Credential credential = null;
        try {
            try {
                BlockStartImpl blockStartImpl = new BlockStartImpl(getContext());
                blockStartImpl.setMode(1);
                blockStartImpl.setLandmarkType(1);
                blockStartImpl.replaceActiveBlockParser = false;
                FaceDetector faceDetectorBuild = blockStartImpl.build();
                if (!faceDetectorBuild.zzb.zzb()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    faceDetectorBuild.release();
                    return;
                }
                Result result = new Result();
                Frame$Metadata frame$Metadata = (Frame$Metadata) result.text;
                Bitmap bitmap = this.facesBitmap;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                result.resultMetadata = bitmap;
                frame$Metadata.zza = width;
                frame$Metadata.zzb = height;
                frame$Metadata.zze = getFrameRotation();
                if (((ByteBuffer) result.resultPoints) == null && ((Bitmap) result.resultMetadata) == null) {
                    throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                }
                try {
                    SparseArray sparseArrayDetect = faceDetectorBuild.detect(result);
                    ArrayList<PhotoFace> arrayList = new ArrayList<>();
                    Size paintingSize = getPaintingSize();
                    for (int i = 0; i < sparseArrayDetect.size(); i++) {
                        Face face = (Face) sparseArrayDetect.get(sparseArrayDetect.keyAt(i));
                        Bitmap bitmap2 = this.facesBitmap;
                        int i2 = this.originalBitmapRotation;
                        PhotoFace photoFace = new PhotoFace(face, bitmap2, paintingSize, i2 % 360 == 90 || i2 % 360 == 270);
                        if (photoFace.eyesCenterPoint != null) {
                            arrayList.add(photoFace);
                        }
                    }
                    this.faces = arrayList;
                    faceDetectorBuild.release();
                } catch (Throwable th) {
                    FileLog.e(th);
                    faceDetectorBuild.release();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 != 0) {
                    credential.release();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                credential.release();
            }
            throw th2;
        }
    }

    public final void lambda$getThanosEffect$48() {
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            this.thanosEffect = null;
            removeView(thanosEffect);
        }
    }

    public final void lambda$hideEmojiPopup$47(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void lambda$new$1() {
        boolean zCanUndo = this.undoStore.canUndo();
        this.undoButton.animate().cancel();
        this.undoButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        this.undoButton.setClickable(zCanUndo);
        this.undoAllButton.animate().cancel();
        this.undoAllButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        this.undoAllButton.setClickable(zCanUndo);
    }

    public final void lambda$new$10(Context context, final Bitmap bitmap, View view) {
        if (!this.isColorListShown) {
            Runnable runnable = this.onDoneButtonClickedListener;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet(context, this.resourcesProvider);
        colorPickerBottomSheet.onSetColor(this.colorSwatch.color, 2);
        colorPickerBottomSheet.pipetteDelegate = new ColorPickerBottomSheet.PipetteDelegate() {
            public boolean hasPipette;

            @Override
            public final FrameLayout getContainerView() {
                return LPhotoPaintView.this.pipetteContainerLayout;
            }

            @Override
            public final View getSnapshotDrawingView() {
                return LPhotoPaintView.this;
            }

            @Override
            public final boolean isPipetteAvailable() {
                return bitmap != null;
            }

            @Override
            public final boolean isPipetteVisible() {
                return this.hasPipette;
            }

            @Override
            public final void onColorSelected(int i) {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                lPhotoPaintView.showColorList(false);
                lPhotoPaintView.palette.selectColor(i, true);
                lPhotoPaintView.palette.saveColors();
                lPhotoPaintView.setNewColor(i);
                lPhotoPaintView.colorsListView.setSelectedColorIndex(lPhotoPaintView.palette.getCurrentColorPosition());
                lPhotoPaintView.colorsListView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public final void onDrawImageOverCanvas(Canvas canvas) {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                Matrix matrix = lPhotoPaintView.renderView.getMatrix();
                canvas.save();
                canvas.translate(lPhotoPaintView.renderView.getX(), lPhotoPaintView.renderView.getY());
                canvas.concat(matrix);
                float width = lPhotoPaintView.renderView.getWidth();
                Bitmap bitmap2 = bitmap;
                canvas.scale(width / bitmap2.getWidth(), lPhotoPaintView.renderView.getHeight() / bitmap2.getHeight(), 0.0f, 0.0f);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            }

            @Override
            public final void onStartColorPipette() {
                this.hasPipette = true;
            }

            @Override
            public final void onStopColorPipette() {
                this.hasPipette = false;
            }
        };
        colorPickerBottomSheet.colorListener = new LPhotoPaintView$$ExternalSyntheticLambda30(this, 1);
        colorPickerBottomSheet.show();
    }

    public final void lambda$new$11(int i) {
        setCurrentSwatch(null, this.colorSwatch, true);
        PersistColorPalette.getInstance(i).setCurrentWeight(this.colorSwatch.brushWeight);
    }

    public final void lambda$new$2(View view) {
        RenderView renderView = this.renderView;
        if (renderView == null || !(renderView.getCurrentBrush() instanceof Brush.Shape)) {
            this.undoStore.undo();
            return;
        }
        this.renderView.clearShape();
        this.paintToolsView.setSelectedIndex(1);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
    }

    public final void lambda$new$4(View view) {
        if (this.undoStore.canUndo()) {
            RenderView renderView = this.renderView;
            if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
                this.renderView.clearShape();
                this.paintToolsView.setSelectedIndex(1);
                onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }
            this.renderView.clearAll();
            UndoStore undoStore = this.undoStore;
            undoStore.operations.clear();
            undoStore.uuidToOperationMap.clear();
            undoStore.notifyOfHistoryChanges();
            this.entitiesView.removeAllViews();
        }
    }

    public final void lambda$new$5(View view) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(false);
        }
        lambda$registerRemovalUndo$45(this.currentEntityView);
        selectEntity(null, true);
    }

    public final void lambda$new$6(View view) {
        selectEntity(null, true);
    }

    public final void lambda$new$7(View view, int i) {
        PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
        this.textOptionsView.setTypeface(paintTypeface.key);
        onTypefaceSelected(paintTypeface);
        showTypefaceMenu(false);
    }

    public final void lambda$new$8(Integer num) {
        setNewColor(num.intValue());
        showColorList(false);
    }

    public final void lambda$new$9(Integer num) {
        this.palette.selectColor(num.intValue(), true);
        this.palette.saveColors();
        setNewColor(num.intValue());
        this.colorsListView.setSelectedColorIndex(this.palette.getCurrentColorPosition());
        this.colorsListView.getAdapter().notifyDataSetChanged();
    }

    public final void lambda$onAddButtonPressed$33(Brush.Shape shape, int i) {
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        onBrushSelected(shape);
        PaintToolsView paintToolsView = this.paintToolsView;
        paintToolsView.animateNextIndex(paintToolsView.brushesCount + 1);
        AndroidUtilities.updateImageViewImageAnimated(paintToolsView.buttons[paintToolsView.brushesCount + 1], i);
        paintToolsView.isShapeSelected = true;
    }

    public final boolean lambda$onAddButtonPressed$34(View view) {
        if (this.popupLayout != null) {
            PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            persistColorPalette.fillShapes = !persistColorPalette.fillShapes;
            persistColorPalette.mConfig.edit().putBoolean("fill_shapes", persistColorPalette.fillShapes).apply();
            boolean z = PersistColorPalette.getInstance(this.currentAccount).fillShapes;
            for (int i = 0; i < this.popupLayout.getItemsCount(); i++) {
                View itemAt = this.popupLayout.getItemAt(i);
                if (itemAt instanceof PopupButton) {
                    Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
                    ((PopupButton) itemAt).setIcon(z ? shape.getFilledIconRes() : shape.getIconRes(), z, true);
                }
            }
        }
        return true;
    }

    public final void lambda$onAddButtonPressed$35() {
        boolean z = PersistColorPalette.getInstance(this.currentAccount).fillShapes;
        int i = 0;
        while (true) {
            List list = Brush.Shape.SHAPES_LIST;
            if (i >= list.size()) {
                return;
            }
            Brush.Shape shape = (Brush.Shape) list.get(i);
            int filledIconRes = z ? shape.getFilledIconRes() : shape.getIconRes();
            PopupButton popupButtonButtonForPopup = buttonForPopup(shape.getShapeName(), filledIconRes, new RichTextCell$2$$ExternalSyntheticLambda1(this, shape, filledIconRes, 9));
            popupButtonButtonForPopup.setOnLongClickListener(new RichEditor$$ExternalSyntheticLambda12(this, 3));
            this.popupLayout.addView((View) popupButtonButtonForPopup, LayoutHelper.createLinear(-1, 48));
            i++;
        }
    }

    public final void lambda$openStickersView$18() {
        if (this.facesBitmap != null) {
            detectFaces();
        }
    }

    public final Boolean lambda$openStickersView$19(Object obj, TLRPC.Document document, Boolean bool) {
        AnonymousClass17 anonymousClass17CreateSticker = createSticker(obj, document, true);
        if (bool.booleanValue()) {
            anonymousClass17CreateSticker.setScale(1.5f);
        }
        return Boolean.TRUE;
    }

    public final Boolean lambda$openStickersView$20(Integer num) {
        if (num.intValue() == 2) {
            showPhotoAlert();
        }
        return Boolean.TRUE;
    }

    public final void lambda$openStickersView$21(int i, DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
        switchTab(i);
    }

    public final void lambda$setCurrentSwatch$31(Integer num, int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.colorSwatch.color = ColorUtils.blendARGB(fFloatValue, num.intValue(), i);
        FrameLayout frameLayout = this.bottomLayout;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public final void lambda$setNewColor$12(int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.colorSwatch.color = ColorUtils.blendARGB(fFloatValue, i, i2);
        this.bottomLayout.invalidate();
    }

    public final void lambda$setupTabsLayout$14(View view) {
        if (this.editingText) {
            selectEntity(null, true);
        } else {
            switchTab(0);
        }
    }

    public final void lambda$setupTabsLayout$15(View view) {
        openStickersView();
    }

    public final void lambda$setupTabsLayout$16(View view) {
        switchTab(2);
        if (this.currentEntityView instanceof TextPaintView) {
            return;
        }
        createText(true);
    }

    public final void lambda$showColorList$29(View view, boolean z, boolean[] zArr, float f, DynamicAnimation dynamicAnimation, float f2, float f3) {
        float f4 = f2 / 1000.0f;
        this.toolsTransformProgress = f4;
        float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
        view.setScaleX(f5);
        view.setScaleY(f5);
        view.setTranslationY((Math.min(this.toolsTransformProgress, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(this.toolsTransformProgress, 0.25f) / 0.25f));
        this.colorsListView.setProgress(this.toolsTransformProgress, z);
        this.doneButton.setProgress(this.toolsTransformProgress);
        this.cancelButton.setProgress(this.toolsTransformProgress);
        this.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * this.toolsTransformProgress);
        if (zArr[0]) {
            this.bottomLayout.setTranslationY(f - ((AndroidUtilities.dp(40.0f) * (z ? this.toolsTransformProgress : 1.0f - this.toolsTransformProgress)) * (z ? 1 : -1)));
        }
        this.bottomLayout.invalidate();
        if (view == this.textOptionsView) {
            this.overlayLayout.invalidate();
        }
    }

    public final void lambda$showColorList$30(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == this.toolsTransformAnimation) {
            this.toolsTransformAnimation = null;
            if (z) {
                return;
            }
            this.colorsListView.setVisibility(8);
            PersistColorPalette.getInstance(this.currentAccount).saveColors();
            this.colorsListView.getAdapter().notifyDataSetChanged();
        }
    }

    public final void lambda$showEmojiPopup$46(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void lambda$showMenuForEntity$36(EntityView entityView, View view) {
        lambda$registerRemovalUndo$45(entityView);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    public final void lambda$showMenuForEntity$37(View view) {
        EntityView entityView = this.currentEntityView;
        if ((entityView instanceof TextPaintView) && !this.editingText) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            this.editingText = true;
            textPaintView.beginEditing();
            View focusedView = textPaintView.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    public final void lambda$showMenuForEntity$38(EntityView entityView, View view) {
        ((StickerView) entityView).mirror(true);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    public final void lambda$showMenuForEntity$39(View view) {
        EntityView entityView;
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 != null) {
            PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(entityView2);
            EntityView entityView3 = this.currentEntityView;
            if (entityView3 instanceof StickerView) {
                EntityView stickerView = new StickerView(getContext(), (StickerView) this.currentEntityView, pointFStartPositionRelativeToEntity);
                stickerView.setDelegate(this);
                this.entitiesView.addView(stickerView);
                entityView = stickerView;
            } else if (entityView3 instanceof TextPaintView) {
                TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) this.currentEntityView, pointFStartPositionRelativeToEntity);
                textPaintView.setDelegate(this);
                textPaintView.setMaxWidth((int) (getPaintingSize().width - 20.0f));
                this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
                entityView = textPaintView;
            } else {
                entityView = null;
            }
            registerRemovalUndo(entityView);
            selectEntity(entityView, true);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    public final void lambda$showMenuForEntity$41(EntityView entityView) {
        float f;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        TextView textView = new TextView(getContext());
        int i = Theme.key_actionBarDefaultSubmenuItem;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView.setBackground(Theme.getSelectorDrawable(false));
        textView.setGravity(16);
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(0);
        textView.setText(LocaleController.getString(R.string.PaintDelete));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(13, this, entityView));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 48));
        if (entityView instanceof TextPaintView) {
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
            textView2.setBackground(Theme.getSelectorDrawable(false));
            textView2.setGravity(16);
            textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView2.setTextSize(1, 14.0f);
            textView2.setEllipsize(truncateAt);
            textView2.setTag(1);
            textView2.setText(LocaleController.getString(R.string.PaintEdit));
            textView2.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 7));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48));
        }
        if (entityView instanceof StickerView) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(Theme.getColor(i, this.resourcesProvider));
            textView3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            textView3.setGravity(16);
            textView3.setEllipsize(truncateAt);
            textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView3.setTextSize(1, 14.0f);
            textView3.setTag(2);
            textView3.setText(LocaleController.getString(R.string.Flip));
            f = 16.0f;
            textView3.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(14, this, (StickerView) entityView));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 48));
        } else {
            f = 16.0f;
        }
        boolean z = entityView instanceof PhotoView;
        if (!z) {
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(Theme.getColor(i, this.resourcesProvider));
            textView4.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            textView4.setGravity(16);
            textView4.setEllipsize(truncateAt);
            textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(f), 0);
            textView4.setTextSize(1, 14.0f);
            textView4.setTag(2);
            textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
            textView4.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda2(this, 8));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 48));
        }
        if (z) {
            ((PhotoView) entityView).getClass();
        }
        this.popupLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
    }

    public final boolean lambda$showPopup$42(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    public final void lambda$showPopup$43(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    public final void lambda$showPopup$44() {
        this.popupLayout.removeInnerViews();
    }

    public final void lambda$showTypefaceMenu$27(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.typefaceMenuTransformProgress = f3;
        this.typefaceListView.setAlpha(f3);
        this.typefaceListView.invalidate();
        this.overlayLayout.invalidate();
        this.textOptionsView.getTypefaceCell().setAlpha(1.0f - this.typefaceMenuTransformProgress);
    }

    public final void lambda$showTypefaceMenu$28(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == this.typefaceMenuTransformAnimation) {
            this.typefaceMenuTransformAnimation = null;
            if (!z) {
                this.typefaceListView.setVisibility(8);
            }
            this.typefaceListView.setMaskProvider(null);
        }
    }

    public final void lambda$switchTab$17(View view, View view2, ValueAnimator valueAnimator) {
        float f;
        this.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.tabsLayout.invalidate();
        this.bottomLayout.invalidate();
        this.overlayLayout.invalidate();
        int i = 0;
        while (i < this.tabsLayout.getChildCount()) {
            View childAt = this.tabsLayout.getChildAt(i);
            if (i == this.tabsNewSelectedIndex) {
                f = this.tabsSelectionProgress;
            } else {
                f = i == this.tabsSelectedIndex ? 1.0f - this.tabsSelectionProgress : 0.0f;
            }
            childAt.setAlpha((f * 0.4f) + 0.6f);
            i++;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.tabsSelectionProgress);
        if (view == null || view2 == null) {
            return;
        }
        float f2 = 1.0f - interpolation;
        float f3 = (f2 * 0.4f) + 0.6f;
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
        float f4 = (interpolation * 0.4f) + 0.6f;
        view2.setScaleX(f4);
        view2.setScaleY(f4);
        view2.setTranslationY((Math.min(f2, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
        view2.setAlpha(1.0f - (Math.min(f2, 0.25f) / 0.25f));
    }

    @Override
    public void maybeShowDismissalAlert(PhotoViewer photoViewer, Activity activity, Runnable runnable) {
        if (this.isColorListShown) {
            showColorList(false);
            return;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return;
        }
        if (this.editingText && this.currentEntityView != null) {
            selectEntity(null, true);
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
        builder.setMessage(LocaleController.getString(R.string.PhotoEditorDiscardAlert));
        builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
        builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new PeerStoriesView$$ExternalSyntheticLambda24(1, runnable));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        photoViewer.showAlertDialog(builder);
    }

    @Override
    public void onAddButtonPressed(View view) {
        showPopup(new LPhotoPaintView$$ExternalSyntheticLambda13(this, 3), this, 53, 0, getHeight());
    }

    @Override
    public void onAnimationStateChanged(boolean z) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setLayerType(z ? 2 : 0, null);
            this.bottomLayout.setLayerType(z ? 2 : 0, null);
            this.topLayout.setLayerType(z ? 2 : 0, null);
        }
    }

    @Override
    public void onAttachedToWindow() {
        this.destroyed = false;
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public boolean onBackPressed() {
        if (this.isColorListShown) {
            showColorList(false);
            return true;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        }
        if (!this.editingText) {
            return false;
        }
        selectEntity(null, true);
        return true;
    }

    @Override
    public void onBrushSelected(Brush brush) {
        if ((brush instanceof Brush.Blurer) || (brush instanceof Brush.Eraser)) {
            PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
            paintWeightChooserView.min = 0.4f;
            paintWeightChooserView.max = 1.75f;
            paintWeightChooserView.invalidate();
        } else {
            PaintWeightChooserView paintWeightChooserView2 = this.weightChooserView;
            paintWeightChooserView2.min = 0.05f;
            paintWeightChooserView2.max = 1.0f;
            paintWeightChooserView2.invalidate();
        }
        this.weightChooserView.setDrawCenter(!(brush instanceof Brush.Shape));
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        this.renderView.setBrush(brush);
        Swatch swatch = this.colorSwatch;
        int i = swatch.color;
        swatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(Integer.valueOf(i), this.colorSwatch, true);
        this.renderInputView.invalidate();
    }

    @Override
    public void onCleanupEntities() {
        this.entitiesView.removeAllViews();
    }

    @Override
    public void onColorPickerSelected() {
        showColorList(true);
    }

    @Override
    public void onDetachedFromWindow() {
        this.destroyed = true;
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    public void onEmojiButtonClick() {
        boolean z = this.emojiViewVisible;
        if (z && (this.currentEntityView instanceof TextPaintView)) {
            this.bottomPanelIgnoreOnce = true;
        }
        if (z) {
            onEmojiViewCloseByClick();
        }
        showEmojiPopup(1 ^ (this.emojiViewVisible ? 1 : 0));
        if (z) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                AndroidUtilities.showKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
    }

    public abstract void onEmojiViewCloseByClick();

    @Override
    public boolean onEntityLongClicked(EntityView entityView) {
        showMenuForEntity(entityView);
        return true;
    }

    @Override
    public boolean onEntitySelected(EntityView entityView) {
        return selectEntity(entityView, true);
    }

    @Override
    public PersistColorPalette onGetPalette() {
        return PersistColorPalette.getInstance(this.currentAccount);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.emojiView != null) {
            int measuredHeight = AndroidUtilities.isTablet() ? i6 - this.emojiView.getMeasuredHeight() : (measureKeyboardHeight() + i6) - this.emojiView.getMeasuredHeight();
            EmojiView emojiView = this.emojiView;
            emojiView.layout(0, measuredHeight, emojiView.getMeasuredWidth(), this.emojiView.getMeasuredHeight() + measuredHeight);
        }
        int i7 = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i7;
        int iCeil = (int) Math.ceil((i5 - this.renderView.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, (((i6 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - this.renderView.getMeasuredHeight()) / 2, i7);
        RenderView renderView = this.renderView;
        renderView.layout(iCeil, additionalTop, renderView.getMeasuredWidth() + iCeil, this.renderView.getMeasuredHeight() + additionalTop);
        View view = this.renderInputView;
        view.layout(iCeil, additionalTop, view.getMeasuredWidth() + iCeil, this.renderInputView.getMeasuredHeight() + additionalTop);
        int measuredWidth = ((this.renderView.getMeasuredWidth() - this.entitiesView.getMeasuredWidth()) / 2) + iCeil;
        int measuredHeight2 = ((this.renderView.getMeasuredHeight() - this.entitiesView.getMeasuredHeight()) / 2) + additionalTop;
        EntitiesContainerView entitiesContainerView = this.entitiesView;
        entitiesContainerView.layout(measuredWidth, measuredHeight2, entitiesContainerView.getMeasuredWidth() + measuredWidth, this.entitiesView.getMeasuredHeight() + measuredHeight2);
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            thanosEffect.layout(measuredWidth, measuredHeight2, this.entitiesView.getMeasuredWidth() + measuredWidth, this.entitiesView.getMeasuredHeight() + measuredHeight2);
        }
        FrameLayout frameLayout = this.selectionContainerView;
        frameLayout.layout(iCeil, additionalTop, frameLayout.getMeasuredWidth() + iCeil, this.selectionContainerView.getMeasuredHeight() + additionalTop);
    }

    @Override
    public void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float width;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            width = bitmap.getWidth();
            currentActionBarHeight = this.bitmapToEdit.getHeight();
        } else {
            currentActionBarHeight = (size2 - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            width = size;
        }
        float fFloor = size;
        float fFloor2 = (float) Math.floor((fFloor * currentActionBarHeight) / width);
        float f = currentActionBarHeight2;
        if (fFloor2 > f) {
            fFloor = (float) Math.floor((width * f) / currentActionBarHeight);
            fFloor2 = f;
        }
        int i3 = (int) fFloor;
        int i4 = (int) fFloor2;
        this.renderView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.renderInputView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f2 = fFloor / this.paintingSize.width;
        this.baseScale = f2;
        this.entitiesView.setScaleX(f2);
        this.entitiesView.setScaleY(this.baseScale);
        this.entitiesView.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            thanosEffect.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
            this.thanosEffect.setScaleX(this.baseScale);
            this.thanosEffect.setScaleY(this.baseScale);
        }
        updateEntitiesSelections();
        this.selectionContainerView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.emojiPadding), 1073741824));
        FrameLayout frameLayout = this.topLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, this.topLayout.getPaddingRight(), this.topLayout.getPaddingBottom());
        measureChild(this.topLayout, i, i2);
        this.ignoreLayout = false;
        if (!this.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
            this.ignoreLayout = true;
            hideEmojiView$1();
            this.ignoreLayout = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            hideEmojiView$1();
        }
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            measureChild(emojiView, i, i2);
        }
    }

    @Override
    public void onNewTextSelected() {
        if (this.keyboardVisible || this.emojiViewVisible) {
            onEmojiButtonClick();
        } else {
            createText(true);
        }
    }

    public abstract void onOpenCloseStickersAlert(boolean z);

    @Override
    public void onResume() {
        RenderView.CanvasInternal canvasInternal = this.renderView.internal;
        if (canvasInternal == null) {
            return;
        }
        canvasInternal.postRunnable(canvasInternal.drawRunnable);
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
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
        if (this.emojiViewVisible) {
            int i2 = z ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.emojiView.setLayoutParams(layoutParams);
                int i5 = layoutParams.height;
                this.emojiWasPadding = i5;
                this.emojiPadding = i5;
                requestLayout();
                updateKeyboard();
                getHeight();
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            getHeight();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            this.keyboardVisible = ((TextPaintView) entityView).getEditText().isFocused() && i > 0;
        } else {
            this.keyboardVisible = false;
        }
        if (this.keyboardVisible && this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            requestLayout();
            updateKeyboard();
        }
        if (z3 && !this.keyboardVisible && this.emojiPadding > 0 && this.translateBottomPanelAfterResize) {
            this.translateBottomPanelAfterResize = false;
            PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
            paintWeightChooserView.getClass();
            paintWeightChooserView.invalidate();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        getHeight();
    }

    public void onSwitchSegmentedAnimation(PhotoView photoView) {
        float f;
        if (photoView == null) {
            return;
        }
        ThanosEffect thanosEffect = getThanosEffect();
        TONIntroActivity.AnonymousClass2 anonymousClass2 = photoView.containerView;
        if (thanosEffect == null) {
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
                return;
            }
            return;
        }
        Bitmap segmentedOutBitmap = photoView.getSegmentedOutBitmap();
        if (segmentedOutBitmap == null) {
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
                return;
            }
            return;
        }
        Matrix matrix = new Matrix();
        float width = photoView.getWidth();
        float height = photoView.getHeight();
        float f2 = 0.0f;
        if (photoView.getRotation() != 0.0f) {
            float width2 = segmentedOutBitmap.getWidth();
            float height2 = segmentedOutBitmap.getHeight();
            float f3 = width2 / 2.0f;
            float f4 = height2 / 2.0f;
            float fSqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
            float f5 = fSqrt * 2.0f;
            int i = (int) f5;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            canvas.rotate(photoView.getRotation(), fSqrt, fSqrt);
            canvas.drawBitmap(segmentedOutBitmap, (f5 - width2) / 2.0f, (f5 - height2) / 2.0f, (Paint) null);
            segmentedOutBitmap.recycle();
            float f6 = width / 2.0f;
            float f7 = height / 2.0f;
            float fSqrt2 = ((float) Math.sqrt((f7 * f7) + (f6 * f6))) * 2.0f;
            f2 = (-(fSqrt2 - width)) / 2.0f;
            float f8 = (-(fSqrt2 - height)) / 2.0f;
            height = fSqrt2;
            f = f8;
            width = height;
            segmentedOutBitmap = bitmapCreateBitmap;
        } else {
            f = 0.0f;
        }
        matrix.postScale(width, height);
        matrix.postScale(photoView.getScaleX(), photoView.getScaleY(), width / 2.0f, height / 2.0f);
        matrix.postTranslate(photoView.getX() + f2, photoView.getY() + f);
        thanosEffect.animate(matrix, segmentedOutBitmap, new ChatbotSheet$$ExternalSyntheticLambda0(photoView, 21), new GiftSheet$$ExternalSyntheticLambda2(8));
    }

    public abstract void onTextAdd();

    @Override
    public void onTextAlignmentSelected(int i) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            setTextAlignment((TextPaintView) entityView, i);
            PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            persistColorPalette.currentAlignment = i;
            persistColorPalette.mConfig.edit().putInt("text_alignment", i).apply();
        }
    }

    @Override
    public void onTextOutlineSelected(View view) {
        setTextType((this.selectedTextType + 1) % 4);
    }

    @Override
    public boolean onTouch(MotionEvent motionEvent) {
        if (this.currentEntityView != null) {
            selectEntity(null, true);
        }
        float x = ((motionEvent.getX() - this.renderView.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / this.renderView.getScaleX();
        float y = ((((motionEvent.getY() - this.renderView.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / this.renderView.getScaleY();
        double d = x;
        double radians = (float) Math.toRadians(-this.renderView.getRotation());
        double d2 = y;
        float measuredWidth = (this.renderView.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (this.renderView.getMeasuredHeight() / 2.0f) + ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(measuredWidth, measuredHeight);
        this.renderView.onTouch(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override
    public void onTypefaceButtonClicked() {
        showTypefaceMenu(true);
    }

    public void onTypefaceSelected(PaintTypeface paintTypeface) {
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
        String str = paintTypeface.key;
        persistColorPalette.currentTypeface = str;
        persistColorPalette.mConfig.edit().putString("typeface", str).apply();
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setTypeface(paintTypeface);
        }
    }

    public final void openStickersView() {
        int i = this.tabsSelectedIndex;
        switchTab(1);
        postDelayed(new LPhotoPaintView$$ExternalSyntheticLambda13(this, 2), 350L);
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(getContext(), false, false, this.resourcesProvider);
        anonymousClass14.onDocumentSelected = new LPhotoPaintView$$ExternalSyntheticLambda11(this);
        anonymousClass14.onWidgetSelected = new TONIntroActivity$4$$ExternalSyntheticLambda0(this, 1);
        for (View view : anonymousClass14.viewPager.getViewPages()) {
            if (view instanceof EmojiBottomSheet.Page) {
                EmojiBottomSheet.Page.Adapter adapter = ((EmojiBottomSheet.Page) view).adapter;
                if (adapter.query == null) {
                    adapter.updateItems$1(null);
                }
            }
        }
        anonymousClass14.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda83(this, i));
        anonymousClass14.show();
        onOpenCloseStickersAlert(true);
    }

    public final void registerRemovalUndo(EntityView entityView) {
        if (entityView == null) {
            return;
        }
        UndoStore undoStore = this.undoStore;
        UUID uuid = entityView.getUUID();
        undoStore.uuidToOperationMap.put(uuid, new LPhotoPaintView$$ExternalSyntheticLambda17(this, entityView, 1));
        undoStore.operations.add(uuid);
        undoStore.notifyOfHistoryChanges();
    }

    public final void lambda$registerRemovalUndo$45(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.updateSelect(entityView2.lastSelectionContainer, false);
            this.currentEntityView = null;
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab(0);
            }
        }
        this.entitiesView.removeView(entityView);
        if (entityView != null) {
            UndoStore undoStore = this.undoStore;
            UUID uuid = entityView.getUUID();
            undoStore.uuidToOperationMap.remove(uuid);
            undoStore.operations.remove(uuid);
            undoStore.notifyOfHistoryChanges();
        }
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setShowPreview(true);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(null, this.colorSwatch, true);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final boolean selectEntity(EntityView entityView, boolean z) {
        boolean z2;
        int i;
        boolean z3 = entityView instanceof TextPaintView;
        int i2 = 2;
        if (z3 && (((i = this.tabsNewSelectedIndex) == -1 && this.tabsSelectedIndex != 2) || (i != -1 && i != 2))) {
            ValueAnimator valueAnimator = this.tabsSelectionAnimator;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.isColorListShown) {
                showColorList(false);
            }
            switchTab(2);
        }
        if (z3 && z) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            int gravity = textPaintView.getEditText().getGravity();
            if (gravity == 17) {
                i2 = 1;
            } else if (gravity != 21) {
                i2 = 0;
            }
            this.textOptionsView.setAlignment(i2);
            this.textOptionsView.setTypeface(textPaintView.getTypeface().key);
            this.textOptionsView.setOutlineType(textPaintView.getType(), true);
            this.overlayLayout.invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            z2 = false;
        } else {
            if (entityView2 == entityView) {
                if (!this.editingText) {
                    showMenuForEntity(entityView2);
                    return true;
                }
                if (entityView2 instanceof TextPaintView) {
                    AndroidUtilities.showKeyboard(((TextPaintView) entityView2).getFocusedView());
                    hideEmojiPopup(false);
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
                    hideEmojiPopup(false);
                }
            }
            z2 = true;
        }
        EntityView entityView4 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView4 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView4).getText())) {
            lambda$registerRemovalUndo$45(entityView4);
        }
        EntityView entityView5 = this.currentEntityView;
        if (entityView5 == null) {
            ValueAnimator valueAnimator2 = this.tabsSelectionAnimator;
            if (valueAnimator2 != null && this.tabsNewSelectedIndex != 0) {
                valueAnimator2.cancel();
            }
            if (this.isColorListShown) {
                showColorList(false);
            }
            switchTab(0);
            this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
            this.weightChooserView.setShowPreview(true);
            this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
            setCurrentSwatch(null, this.colorSwatch, true);
            return z2;
        }
        FrameLayout frameLayout = this.selectionContainerView;
        entityView5.lastSelectionContainer = frameLayout;
        entityView5.updateSelect(frameLayout, true);
        this.entitiesView.bringChildToFront(this.currentEntityView);
        EntityView entityView6 = this.currentEntityView;
        if (!(entityView6 instanceof TextPaintView)) {
            this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
            this.weightChooserView.setShowPreview(true);
            this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
            setCurrentSwatch(null, this.colorSwatch, true);
            return true;
        }
        TextPaintView textPaintView3 = (TextPaintView) entityView6;
        textPaintView3.disableAutoresize = false;
        textPaintView3.getSwatch().brushWeight = this.colorSwatch.brushWeight;
        setCurrentSwatch(null, textPaintView3.getSwatch(), true);
        this.weightChooserView.setValueOverride(new PaintView.AnonymousClass14(textPaintView3, (int) (this.paintingSize.width / 9.0f), 1));
        this.weightChooserView.setShowPreview(false);
        return true;
    }

    public void setBlurredBackgroundDrawableForTools(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        this.blurredBackgroundDrawableForTools = blurredBackgroundDrawable;
    }

    public final void setCurrentSwatch(Integer num, Swatch swatch, boolean z) {
        int i = 1;
        Swatch swatch2 = this.colorSwatch;
        if (swatch2 != swatch) {
            swatch2.color = swatch.color;
            swatch2.brushWeight = swatch.brushWeight;
            PersistColorPalette.getInstance(this.currentAccount).selectColor(swatch.color, true);
            PersistColorPalette.getInstance(this.currentAccount).setCurrentWeight(swatch.brushWeight);
        }
        this.renderView.setColor(swatch.color);
        this.renderView.setBrushSize(swatch.brushWeight);
        if (z) {
            int i2 = this.colorSwatch.color;
            if (num == null || num.intValue() == i2) {
                FrameLayout frameLayout = this.bottomLayout;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                }
            } else {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new PaintView$$ExternalSyntheticLambda28(this, num, i2, i));
                duration.start();
            }
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(new Swatch(swatch.color, swatch.brushWeight));
        }
    }

    public void setDrawShadow(boolean z) {
        this.drawShadow = z;
        invalidate();
        setClipChildren(!z);
    }

    @Override
    public void setOffsetTranslationX(float f) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setTranslationX(f);
        }
    }

    @Override
    public void setOffsetTranslationY(float f, float f2, int i, boolean z) {
        this.offsetTranslationY = f;
        if (z) {
            setTranslationY(0.0f);
        } else {
            this.topLayout.setTranslationY(-f);
            this.bottomLayout.setTranslationY(f);
        }
    }

    @Override
    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    @Override
    public void setTransform(float f, float f2, float f3, float f4, float f5) {
        View view;
        float f6;
        float f7;
        float f8;
        float f9;
        this.scale = f;
        this.imageWidth = f4;
        this.imageHeight = f5;
        this.inputTransformX = f2;
        this.inputTransformY = f3;
        this.transformX = f2;
        float f10 = f3 + this.panTranslationY;
        this.transformY = f10;
        int i = 0;
        while (i < 4) {
            if (i == 0) {
                view = this.entitiesView;
            } else if (i == 1) {
                view = this.selectionContainerView;
            } else {
                view = i == 2 ? this.renderView : this.renderInputView;
            }
            MediaController.CropState cropState = this.currentCropState;
            if (cropState != null) {
                float f11 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                MediaController.CropState cropState2 = this.currentCropState;
                int i2 = cropState2.transformRotation;
                if (i2 != 90 && i2 != 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float f12 = measuredHeight;
                float f13 = measuredWidth;
                float fMax = Math.max(f4 / ((int) (cropState2.cropPw * f12)), f5 / ((int) (cropState2.cropPh * f13)));
                f6 = f11 * fMax;
                MediaController.CropState cropState3 = this.currentCropState;
                float fM = MediaController$$ExternalSyntheticOutline0.m(cropState3.cropPx, f12, f, fMax);
                float f14 = cropState3.cropScale;
                f8 = (fM * f14) + f2;
                f9 = (cropState3.cropPy * f13 * f * fMax * f14) + f10;
                f7 = cropState3.cropRotate + i2;
            } else {
                f6 = i == 0 ? this.baseScale * 1.0f : 1.0f;
                f7 = 0.0f;
                f8 = f2;
                f9 = f10;
            }
            float f15 = ((-this.emojiPadding) / 2.0f) + f9;
            float f16 = f6 * f;
            float f17 = Float.isNaN(f16) ? 1.0f : f16;
            view.setScaleX(f17);
            view.setScaleY(f17);
            view.setTranslationX(f8);
            view.setTranslationY(f15);
            view.setRotation(f7);
            view.invalidate();
            i++;
        }
        updateEntitiesSelections();
        invalidate();
    }

    public final void showColorList(final boolean z) {
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
            final boolean[] zArr = {this.keyboardVisible || this.emojiViewVisible};
            final float translationY = this.bottomLayout.getTranslationY();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    this.f$0.lambda$showColorList$29(barView, z, zArr, translationY, dynamicAnimation, f, f2);
                }
            });
            this.toolsTransformAnimation.addEndListener(new LPhotoPaintView$$ExternalSyntheticLambda15(this, z, i));
            this.toolsTransformAnimation.start();
            if (z) {
                this.colorsListView.setVisibility(0);
                this.colorsListView.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    public final void showEmojiPopup(int i) {
        int i2 = 0;
        this.bottomPanelIgnoreOnce = false;
        if (i != 1) {
            ChatActivityEnterViewAnimatedIconView emojiButton = this.textOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                this.emojiViewWasVisible = this.emojiViewVisible;
                this.emojiViewVisible = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    emojiView.setVisibility(8);
                }
            }
            if (i == 0) {
                this.emojiPadding = 0;
            }
            updateKeyboard();
            requestLayout();
            getHeight();
            return;
        }
        EmojiView emojiView2 = this.emojiView;
        boolean z = emojiView2 != null && emojiView2.getVisibility() == 0;
        createEmojiView();
        this.emojiView.setVisibility(0);
        this.emojiViewWasVisible = this.emojiViewVisible;
        this.emojiViewVisible = true;
        EmojiView emojiView3 = this.emojiView;
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
        int i3 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView3.getLayoutParams();
        layoutParams.height = i3;
        emojiView3.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
        this.emojiWasPadding = i3;
        this.emojiPadding = i3;
        requestLayout();
        updateKeyboard();
        ChatActivityEnterViewAnimatedIconView emojiButton2 = this.textOptionsView.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
        }
        getHeight();
        if (z || this.keyboardVisible) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new LPhotoPaintView$$ExternalSyntheticLambda20(this, i2));
        valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i2));
        valueAnimatorOfFloat.start();
    }

    public final void showMenuForEntity(EntityView entityView) {
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new LPhotoPaintView$$ExternalSyntheticLambda17(this, entityView, 0), this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f));
    }

    public final void showPhotoAlert() {
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new ChatActivity() {
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
                return AndroidUtilities.findActivity(LPhotoPaintView.this.getContext());
            }

            @Override
            public final Theme.ResourcesProvider getResourceProvider() {
                return LPhotoPaintView.this.resourcesProvider;
            }

            @Override
            public final boolean isKeyboardVisible() {
                return false;
            }

            @Override
            public final boolean isLightStatusBar() {
                return false;
            }
        }, false, false, false, this.resourcesProvider);
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.AddImage));
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                try {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert2.getPhotoLayout().getSelectedPhotos();
                    if (selectedPhotos.isEmpty()) {
                        return;
                    }
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                    String str = photoEntry.imagePath;
                    if (str == null) {
                        str = photoEntry.path;
                    }
                    LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                    lPhotoPaintView.appearAnimation(lPhotoPaintView.createPhoto(str, true));
                    chatAttachAlert2.lambda$showGiftOfferSheet$15();
                } catch (Throwable th) {
                    FileLog.e(th);
                }
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
                System.currentTimeMillis();
                return true;
            }

            @Override
            public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
            }
        });
        chatAttachAlert.setOnDismissListener(new EmojiBottomSheet$$ExternalSyntheticLambda4(1));
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.init();
        MediaController.forceBroadcastNewPhotos = true;
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.show();
    }

    public final void showPopup(Runnable runnable, LPhotoPaintView lPhotoPaintView, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), R.drawable.popup_fixed_alert2, this.resourcesProvider, 0);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setBackgroundColor(-14145495);
            this.popupLayout.setOnTouchListener(new TextSelectionHelper$$ExternalSyntheticLambda10(this, 1));
            this.popupLayout.setDispatchKeyEventListener(new LPhotoPaintView$$ExternalSyntheticLambda11(this));
            this.popupLayout.setShownFromBottom(true);
        }
        this.popupLayout.removeInnerViews();
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
                    this.f$0.lambda$showPopup$44();
                }
            });
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        this.popupWindow.showAtLocation(lPhotoPaintView, i, i2 - (this.popupLayout.getMeasuredWidth() / 2), i3 - this.popupLayout.getMeasuredHeight());
        ActionBarPopupWindow.startAnimation(this.popupLayout);
    }

    public final void showTypefaceMenu(boolean z) {
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
                this.typefaceListView.setAlpha(0.0f);
                this.typefaceListView.setVisibility(0);
            }
            this.typefaceMenuTransformAnimation.addUpdateListener(new ShareDialogCell$$ExternalSyntheticLambda1(this, 2));
            this.typefaceMenuTransformAnimation.addEndListener(new LPhotoPaintView$$ExternalSyntheticLambda15(this, z, 1));
            this.typefaceMenuTransformAnimation.start();
        }
    }

    @Override
    public void shutdown() {
        this.renderView.shutdown();
        this.entitiesView.setVisibility(8);
        this.selectionContainerView.setVisibility(8);
        this.queue.postRunnable(new GiftSheet$$ExternalSyntheticLambda2(9));
    }

    public final PointF startPositionRelativeToEntity(EntityView entityView) {
        MediaController.CropState cropState = this.currentCropState;
        float f = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (entityView != null) {
            PointF position = entityView.getPosition();
            return new PointF(position.x + f, position.y + f);
        }
        float f2 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFCenterPositionForEntity = centerPositionForEntity();
        while (true) {
            boolean z = false;
            for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
                View childAt = this.entitiesView.getChildAt(i);
                if (childAt instanceof EntityView) {
                    PointF position2 = ((EntityView) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - pointFCenterPositionForEntity.y, 2.0d) + Math.pow(position2.x - pointFCenterPositionForEntity.x, 2.0d))) < f2) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return pointFCenterPositionForEntity;
            }
            pointFCenterPositionForEntity = new PointF(pointFCenterPositionForEntity.x + f, pointFCenterPositionForEntity.y + f);
        }
    }

    public final void switchTab(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        PersistColorPalette persistColorPalette;
        boolean z;
        int i2 = 1;
        if (this.tabsSelectedIndex == i || this.tabsNewSelectedIndex == i) {
            return;
        }
        ValueAnimator valueAnimator = this.tabsSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = this.tabsSelectedIndex;
        if (i3 != 0) {
            if (i3 == 2) {
                viewGroup2 = this.textOptionsView;
            } else {
                viewGroup = null;
            }
            this.tabsNewSelectedIndex = i;
            if (i == 0) {
                if (i == 2) {
                    viewGroup4 = this.textOptionsView;
                } else {
                    viewGroup3 = null;
                }
                persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (persistColorPalette.inTextMode != z) {
                    persistColorPalette.inTextMode = z;
                    if (z) {
                        persistColorPalette.setCurrentBrush(-1, false);
                    } else {
                        persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
                    }
                }
                this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
                setCurrentSwatch(null, this.colorSwatch, true);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.tabsSelectionAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.tabsSelectionAnimator.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, viewGroup, viewGroup3, i2));
                this.tabsSelectionAnimator.addListener(new PaintView.AnonymousClass21(this, viewGroup, viewGroup3, i, 1));
                this.tabsSelectionAnimator.start();
            }
            viewGroup4 = this.paintToolsView;
            viewGroup3 = viewGroup4;
            persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (persistColorPalette.inTextMode != z) {
                persistColorPalette.inTextMode = z;
                if (z) {
                    persistColorPalette.setCurrentBrush(-1, false);
                } else {
                    persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
                }
            }
            this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
            setCurrentSwatch(null, this.colorSwatch, true);
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.tabsSelectionAnimator = duration2;
            duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.tabsSelectionAnimator.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, viewGroup, viewGroup3, i2));
            this.tabsSelectionAnimator.addListener(new PaintView.AnonymousClass21(this, viewGroup, viewGroup3, i, 1));
            this.tabsSelectionAnimator.start();
        }
        viewGroup2 = this.paintToolsView;
        viewGroup = viewGroup2;
        this.tabsNewSelectedIndex = i;
        if (i == 0) {
            if (i == 2) {
                viewGroup4 = this.textOptionsView;
            } else {
                viewGroup3 = null;
            }
            persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (persistColorPalette.inTextMode != z) {
                persistColorPalette.inTextMode = z;
                if (z) {
                    persistColorPalette.setCurrentBrush(-1, false);
                } else {
                    persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
                }
            }
            this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
            setCurrentSwatch(null, this.colorSwatch, true);
            ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.tabsSelectionAnimator = duration3;
            duration3.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.tabsSelectionAnimator.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, viewGroup, viewGroup3, i2));
            this.tabsSelectionAnimator.addListener(new PaintView.AnonymousClass21(this, viewGroup, viewGroup3, i, 1));
            this.tabsSelectionAnimator.start();
        }
        viewGroup4 = this.paintToolsView;
        viewGroup3 = viewGroup4;
        persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (persistColorPalette.inTextMode != z) {
            persistColorPalette.inTextMode = z;
            if (z) {
                persistColorPalette.setCurrentBrush(-1, false);
            } else {
                persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
            }
        }
        this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        setCurrentSwatch(null, this.colorSwatch, true);
        ValueAnimator duration4 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.tabsSelectionAnimator = duration4;
        duration4.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.tabsSelectionAnimator.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, viewGroup, viewGroup3, i2));
        this.tabsSelectionAnimator.addListener(new PaintView.AnonymousClass21(this, viewGroup, viewGroup3, i, 1));
        this.tabsSelectionAnimator.start();
    }

    public void translateY(float f) {
        if (Math.abs(f - this.pany) > 0.1f) {
            this.pany = f;
            setTransform(this.scale, this.inputTransformX, this.inputTransformY, this.imageWidth, this.imageHeight);
        }
    }

    @Override
    public void updateColors() {
        this.toolsPaint.setColor(-15132391);
    }

    public void updateEntitiesSelections() {
        EntityView.SelectionView selectionView;
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt == this.currentEntityView) {
                selectionView = ((EntityView) childAt).selectionView;
                if (selectionView != null) {
                    selectionView.updatePosition();
                }
            } else if (childAt instanceof EntityView) {
                EntityView entityView = (EntityView) childAt;
                if (entityView.selecting || entityView.selectT > 0.0f) {
                    selectionView = ((EntityView) childAt).selectionView;
                    if (selectionView != null) {
                        selectionView.updatePosition();
                    }
                }
            }
        }
    }

    public abstract void updateKeyboard();

    public void updatePlusEmojiKeyboardButton() {
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        if (paintTextOptionsView != null) {
            if (this.keyboardVisible) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_smile);
            } else if (this.emojiViewVisible) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
            } else {
                paintTextOptionsView.animatePlusToIcon(R.drawable.msg_add);
            }
        }
        AndroidUtilities.updateViewShow(this.undoAllButton, (this.keyboardVisible || this.emojiViewVisible) ? false : true, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, (this.keyboardVisible || this.emojiViewVisible) ? false : true, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.doneTextButton, this.keyboardVisible || this.emojiViewVisible, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, this.keyboardVisible || this.emojiViewVisible, false, 1.0f, true, null);
    }

    @Override
    public void updateZoom(boolean z) {
        boolean z2 = !z;
        if (this.zoomOutVisible != z2) {
            this.zoomOutVisible = z2;
            this.zoomOutButton.animate().cancel();
            OKLCH.m(this.zoomOutButton.animate().alpha(z ? 0.0f : 1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 240L);
        }
    }
}
