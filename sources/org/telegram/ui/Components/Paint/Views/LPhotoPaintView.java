package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.credentials.Credential;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.zxing.Result;
import com.stripe.android.Stripe;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.commonmark.internal.BlockStartImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda67;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.GroupCallUserCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.PhotoFace;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.ProfileGooeyView$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.SecretVoicePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda35;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;

public abstract class LPhotoPaintView extends SizeNotifierFrameLayoutPhoto implements PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    public float baseScale;
    public final Bitmap bitmapToEdit;
    public BlurredBackgroundDrawable blurredBackgroundDrawableForTools;
    public final BottomLayout bottomLayout;
    public final PaintCancelView cancelButton;
    public final TextView cancelTextButton;
    public final Paint clearPaint;
    public final Paint colorPickerRainbowPaint;
    public final Swatch colorSwatch;
    public final Paint colorSwatchOutlinePaint;
    public final Paint colorSwatchPaint;
    public final AnonymousClass9 colorsListView;
    public final int currentAccount;
    public final MediaController.CropState currentCropState;
    public EntityView currentEntityView;
    public final PaintDoneView doneButton;
    public final TextView doneTextButton;
    public boolean drawShadow;
    public TextView drawTab;
    public boolean editingText;
    public int emojiPadding;
    public EmojiView emojiView;
    public boolean emojiViewVisible;
    public final AnonymousClass6 entitiesView;
    public ArrayList faces;
    public final Bitmap facesBitmap;
    public boolean ignoreLayout;
    public boolean ignoreToolChangeAnimationOnce;
    public float imageHeight;
    public float imageWidth;
    public final boolean inBubbleMode;
    public float inputTransformX;
    public float inputTransformY;
    public boolean isAnimatePopupClosing;
    public boolean isColorListShown;
    public boolean isTypefaceMenuShown;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public boolean keyboardVisible;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public BigInteger lcm;
    public float offsetTranslationY;
    public Runnable onDoneButtonClickedListener;
    public final int originalBitmapRotation;
    public final AnonymousClass8 overlayLayout;
    public final PaintToolsView paintToolsView;
    public Size paintingSize;
    public final PersistColorPalette palette;
    public float pany;
    public final FrameLayout pipetteContainerLayout;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    public Rect popupRect;
    public ActionBarPopupWindow popupWindow;
    public final int[] pos2;
    public final float[] position;
    public final DispatchQueue queue;
    public final AnonymousClass4 renderInputView;
    public final AnonymousClass2 renderView;
    public final LPhotoPaintView$$ExternalSyntheticLambda9 resourcesProvider;
    public float scale;
    public int selectedTextType;
    public final AnonymousClass7 selectionContainerView;
    public final AnimatedFloat shadowAlpha;
    public final Paint shadowPaint;
    public TextView stickerTab;
    public GroupCallActivity.AnonymousClass61 tabsLayout;
    public int tabsNewSelectedIndex;
    public int tabsSelectedIndex;
    public ValueAnimator tabsSelectionAnimator;
    public float tabsSelectionProgress;
    public final PaintTextOptionsView textOptionsView;
    public TextView textTab;
    public ThanosEffect thanosEffect;
    public final Paint toolsPaint;
    public SpringAnimation toolsTransformAnimation;
    public float toolsTransformProgress;
    public final FrameLayout topLayout;
    public float transformX;
    public float transformY;
    public final PaintTypefaceListView typefaceListView;
    public final Paint typefaceMenuBackgroundPaint;
    public final Paint typefaceMenuOutlinePaint;
    public SpringAnimation typefaceMenuTransformAnimation;
    public float typefaceMenuTransformProgress;
    public final TextView undoAllButton;
    public final ImageView undoButton;
    public final UndoStore undoStore;
    public final PaintWeightChooserView weightChooserView;
    public final Stripe weightDefaultValueOverride;
    public final LinearLayout zoomOutButton;
    public boolean zoomOutVisible;

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
        public final boolean canAddCaptionToGif() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final float getProgressToSearchOpened() {
            return 0.0f;
        }

        @Override
        public final int getThreadId() {
            return 0;
        }

        @Override
        public final void invalidateEnterView() {
        }

        @Override
        public final boolean isExpanded() {
            return false;
        }

        @Override
        public final boolean isInScheduleMode() {
            return false;
        }

        @Override
        public final boolean isSearchOpened() {
            return false;
        }

        @Override
        public final boolean isUserSelf() {
            return false;
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
            String string = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiText);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ProfileGooeyView$$ExternalSyntheticLambda0(this, 5));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
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
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, editText.getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, editText.getPaint().getFontMetricsInt());
                }
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
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
            EntityView entityView = LPhotoPaintView.this.currentEntityView;
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
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
        }

        @Override
        public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
        }

        @Override
        public final void onSearchOpenClose(int i) {
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickersGroupClick(long j) {
        }

        @Override
        public final void onStickersSettingsClick() {
        }

        @Override
        public final void onTabOpened(int i) {
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
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
        public final PhotoViewer.AnonymousClass67 this$0;

        public BottomLayout(PhotoViewer.AnonymousClass67 anonymousClass67, Context context) {
            super(context);
            this.this$0 = anonymousClass67;
            new Path();
            setWillNotDraw(false);
            Paint paint = anonymousClass67.colorPickerRainbowPaint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ViewGroup viewGroup;
            Canvas canvas2 = canvas;
            super.onDraw(canvas);
            PhotoViewer.AnonymousClass67 anonymousClass67 = this.this$0;
            ViewGroup barView = anonymousClass67.getBarView();
            Rect rect = AndroidUtilities.rectTmp2;
            int left = barView.getLeft();
            AnonymousClass9 anonymousClass9 = anonymousClass67.colorsListView;
            rect.set(AndroidUtilities.lerp(left, anonymousClass9.getLeft(), anonymousClass67.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), anonymousClass9.getTop(), anonymousClass67.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), anonymousClass9.getRight(), anonymousClass67.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), anonymousClass9.getBottom(), anonymousClass67.toolsTransformProgress));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), anonymousClass67.toolsTransformProgress);
            if (anonymousClass67.blurredBackgroundDrawableForTools != null) {
                rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                anonymousClass67.blurredBackgroundDrawableForTools.setRadius(fLerp);
                anonymousClass67.blurredBackgroundDrawableForTools.setBounds(rect);
                anonymousClass67.blurredBackgroundDrawableForTools.draw(canvas2);
            } else {
                canvas2.drawRoundRect(rectF, fLerp, fLerp, anonymousClass67.toolsPaint);
            }
            if (barView.getChildCount() < 1 || anonymousClass67.toolsTransformProgress == 1.0f) {
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
                Paint paint = anonymousClass67.colorPickerRainbowPaint;
                paint.setAlpha((int) (view.getAlpha() * (1.0f - anonymousClass67.toolsTransformProgress) * 255.0f));
                int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
                int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                float x = (width / 2.0f) + view.getX() + view.getPaddingLeft();
                float y = (height / 2.0f) + view.getY() + view.getPaddingTop();
                Swatch swatch = anonymousClass67.colorSwatch;
                int iBlendARGB = swatch.color;
                int i = anonymousClass67.tabsNewSelectedIndex;
                if (i != -1) {
                    if (i == 0) {
                        viewGroup = anonymousClass67.paintToolsView;
                    } else {
                        viewGroup = i == 2 ? anonymousClass67.textOptionsView : null;
                    }
                    View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                    if (viewGroup instanceof PaintTextOptionsView) {
                        childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                    }
                    x = AndroidUtilities.lerp(x, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), anonymousClass67.tabsSelectionProgress);
                    y = AndroidUtilities.lerp(y, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), anonymousClass67.tabsSelectionProgress);
                }
                if (anonymousClass9 != null && anonymousClass9.getChildCount() > 0) {
                    View childAt3 = anonymousClass9.getChildAt(0);
                    x = AndroidUtilities.lerp(x, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (anonymousClass9.getX() - barView.getLeft()), anonymousClass67.toolsTransformProgress);
                    y = AndroidUtilities.lerp(y, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (anonymousClass9.getY() - barView.getTop()), anonymousClass67.toolsTransformProgress);
                    iBlendARGB = ColorUtils.blendARGB(anonymousClass67.toolsTransformProgress, swatch.color, anonymousClass67.palette.getColor(0));
                }
                if (x != this.lastRainbowX || y != this.lastRainbowY) {
                    this.lastRainbowX = x;
                    this.lastRainbowY = y;
                    paint.setShader(new SweepGradient(x, y, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (anonymousClass9 != null && anonymousClass9.getChildCount() > 0) {
                    View childAt4 = anonymousClass9.getChildAt(0);
                    fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), anonymousClass67.toolsTransformProgress);
                }
                float f = fMin;
                rectF.set(x - f, y - f, x + f, y + f);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint);
                Paint paint2 = anonymousClass67.colorSwatchPaint;
                paint2.setColor(iBlendARGB);
                paint2.setAlpha((int) (view.getAlpha() * paint2.getAlpha()));
                Paint paint3 = anonymousClass67.colorSwatchOutlinePaint;
                paint3.setColor(iBlendARGB);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float fDp = f - AndroidUtilities.dp(3.0f);
                if (anonymousClass9 != null && anonymousClass9.getSelectedColorIndex() != 0) {
                    fDp = AndroidUtilities.lerp(f - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f, anonymousClass67.toolsTransformProgress);
                }
                PaintColorsListView.drawColorCircle(x, y, fDp, paint2.getColor(), canvas2);
                if (anonymousClass9 != null && anonymousClass9.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * anonymousClass67.toolsTransformProgress));
                    canvas2.drawCircle(x, y, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, anonymousClass67.toolsTransformProgress, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f), paint3);
                }
            }
            canvas2.restore();
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            AnonymousClass8 anonymousClass8 = this.this$0.overlayLayout;
            if (anonymousClass8 != null) {
                anonymousClass8.invalidate();
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
        public final IntroActivity.AnonymousClass1 imagesView;
        public final TextView textView;

        public PopupButton(Context context) {
            super(context);
            setOrientation(0);
            setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, LPhotoPaintView.this.resourcesProvider), 2, -1));
            IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, context);
            this.imagesView = anonymousClass1;
            addView(anonymousClass1, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            LPhotoPaintView$$ExternalSyntheticLambda9 lPhotoPaintView$$ExternalSyntheticLambda9 = LPhotoPaintView.this.resourcesProvider;
            imageView2.setColorFilter(Theme.getColor(i, lPhotoPaintView$$ExternalSyntheticLambda9));
            anonymousClass1.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
            this.image2View.setColorFilter(Theme.getColor(i, lPhotoPaintView$$ExternalSyntheticLambda9));
            this.image2View.setVisibility(8);
            anonymousClass1.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            OKLCH.m(i, lPhotoPaintView$$ExternalSyntheticLambda9, textView, 16.0f);
            addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            imageView4.setScaleType(scaleType);
            imageView4.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_radioBackgroundChecked, lPhotoPaintView$$ExternalSyntheticLambda9), PorterDuff.Mode.MULTIPLY));
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
            ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
            if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
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
            valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(7, this, z));
            this.imageSwitchAnimator.addListener(new ItemOptions.AnonymousClass3(this, 10));
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

    public LPhotoPaintView(Context context, Activity activity, int i, Bitmap bitmap, final Bitmap bitmap2, int i2, ArrayList arrayList, MediaController.CropState cropState, final PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16, Theme.ResourcesProvider resourcesProvider) {
        float f;
        int i3;
        Emoji.EmojiSpan[] emojiSpanArr;
        EntityView entityView;
        super(context, activity);
        ArrayList arrayList2 = arrayList;
        boolean z = false;
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        final PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) this;
        this.weightDefaultValueOverride = new Stripe(anonymousClass67, 23);
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        Swatch swatch = new Swatch(0.016773745f, -1);
        this.colorSwatch = swatch;
        this.toolsPaint = new Paint(1);
        this.zoomOutVisible = false;
        this.shadowAlpha = new AnimatedFloat(350L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.shadowPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.clearPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.position = new float[2];
        this.pos2 = new int[2];
        setDelegate(this);
        this.currentAccount = i;
        this.resourcesProvider = new LPhotoPaintView$$ExternalSyntheticLambda9(false ? 1 : 0, resourcesProvider);
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        this.palette = persistColorPalette;
        persistColorPalette.setCurrentBrush(0, true);
        swatch.color = persistColorPalette.getCurrentColor();
        swatch.brushWeight = persistColorPalette.currentWeight;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.queue = dispatchQueue;
        this.bitmapToEdit = bitmap;
        this.facesBitmap = bitmap2;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        final PhotoViewer.AnonymousClass67 anonymousClass68 = (PhotoViewer.AnonymousClass67) this;
        undoStore.delegate = new ProfileGooeyView$$ExternalSyntheticLambda0(anonymousClass68, 3);
        ?? r2 = new RenderView(context, new Painting(getPaintingSize(), bitmap2, i2, null), bitmap) {
            @Override
            public final void selectBrush(Brush brush) {
                int iIndexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i4 = iIndexOf + 1;
                if (i4 <= 1 || bitmap2 != null) {
                    iIndexOf = i4;
                }
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                PaintToolsView paintToolsView = anonymousClass69.paintToolsView;
                paintToolsView.animateNextIndex(iIndexOf);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(iIndexOf - 1, true);
                anonymousClass69.onBrushSelected(brush);
            }
        };
        this.renderView = r2;
        r2.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public final void invalidateInputView() {
                AnonymousClass4 anonymousClass4 = anonymousClass67.renderInputView;
                if (anonymousClass4 != null) {
                    anonymousClass4.invalidate();
                }
            }

            @Override
            public final void onBeganDrawing() {
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                if (anonymousClass69.currentEntityView != null) {
                    anonymousClass69.selectEntity(null, true);
                }
                anonymousClass69.weightChooserView.setViewHidden(true);
            }

            @Override
            public final void onFinishedDrawing() {
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                anonymousClass69.undoStore.delegate.historyChanged();
                anonymousClass69.weightChooserView.setViewHidden(false);
            }

            @Override
            public final void onFirstDraw() {
                photoViewer$$ExternalSyntheticLambda16.run();
            }

            @Override
            public final void resetBrush() {
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                if (anonymousClass69.ignoreToolChangeAnimationOnce) {
                    anonymousClass69.ignoreToolChangeAnimationOnce = false;
                    return;
                }
                PaintToolsView paintToolsView = anonymousClass69.paintToolsView;
                paintToolsView.animateNextIndex(1);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(0, true);
                anonymousClass69.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }

            @Override
            public final boolean shouldDraw() {
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                boolean z2 = anonymousClass69.currentEntityView == null;
                if (!z2) {
                    anonymousClass69.selectEntity(null, true);
                }
                return z2;
            }
        });
        r2.setUndoStore(undoStore);
        r2.setQueue(dispatchQueue);
        r2.setVisibility(4);
        addView((View) r2, LayoutHelper.createFrame(-1, -1, 51));
        ?? r1 = new View(context) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnonymousClass2 anonymousClass2 = anonymousClass67.renderView;
                if (anonymousClass2 != null) {
                    anonymousClass2.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = r1;
        r1.setVisibility(4);
        addView((View) r1, LayoutHelper.createFrame(-1, -1, 51));
        ?? r3 = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public final void onEntityDeselect() {
                anonymousClass67.selectEntity(null, true);
            }

            @Override
            public final EntityView onSelectedEntityRequest() {
                return anonymousClass67.currentEntityView;
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
                float f2;
                float f3;
                Canvas canvas2;
                super.onDraw(canvas);
                long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                EntityView entityView2 = anonymousClass69.currentEntityView;
                if (entityView2 == null || entityView2.hasReleased || !entityView2.hasPanned) {
                    stickyX = 0;
                    stickyY = 0;
                } else {
                    stickyX = entityView2.getStickyX();
                    stickyY = anonymousClass69.currentEntityView.getStickyY();
                }
                if (stickyX != 0) {
                    float f4 = this.stickyXAlpha;
                    if (f4 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, (jMin / 150.0f) + f4);
                        invalidate();
                    } else if (stickyX == 0) {
                        f2 = this.stickyXAlpha;
                        if (f2 != 0.0f) {
                            this.stickyXAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyX == 0) {
                    f2 = this.stickyXAlpha;
                    if (f2 != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                if (stickyY != 0) {
                    float f5 = this.stickyYAlpha;
                    if (f5 != 1.0f) {
                        this.stickyYAlpha = Math.min(1.0f, (jMin / 150.0f) + f5);
                        invalidate();
                    } else if (stickyY == 0) {
                        f3 = this.stickyYAlpha;
                        if (f3 != 0.0f) {
                            this.stickyYAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyY == 0) {
                    f3 = this.stickyYAlpha;
                    if (f3 != 0.0f) {
                        this.stickyYAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                float f6 = this.stickyYAlpha;
                Paint paint2 = this.linePaint;
                if (f6 != 0.0f) {
                    paint2.setAlpha((int) (f6 * 255.0f));
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint2);
                } else {
                    canvas2 = canvas;
                }
                float f7 = this.stickyXAlpha;
                if (f7 != 0.0f) {
                    paint2.setAlpha((int) (f7 * 255.0f));
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint2);
                }
            }
        };
        this.entitiesView = r3;
        addView(r3);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i4);
                byte b = mediaEntity.type;
                if (b == 0) {
                    f = 2.0f;
                    AnonymousClass17 anonymousClass17CreateSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, z);
                    if ((mediaEntity.subType & 2) != 0) {
                        anonymousClass17CreateSticker.mirror(z);
                    }
                    ViewGroup.LayoutParams layoutParams = anonymousClass17CreateSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i3 = size;
                    entityView = anonymousClass17CreateSticker;
                } else {
                    f = 2.0f;
                    if (b == 1) {
                        TextPaintView textPaintViewCreateText = createText(z);
                        textPaintViewCreateText.setType(mediaEntity.subType);
                        textPaintViewCreateText.setTypeface(mediaEntity.textTypeface);
                        textPaintViewCreateText.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        int size2 = arrayList3.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i5);
                            int i6 = size2;
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity.document_id, 1.2f, textPaintViewCreateText.getFontMetricsInt());
                            int i7 = emojiEntity.offset;
                            spannableString.setSpan(animatedEmojiSpan, i7, emojiEntity.length + i7, 33);
                            size = size;
                            size2 = i6;
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
                        Swatch swatch2 = textPaintViewCreateText.getSwatch();
                        swatch2.color = mediaEntity.color;
                        textPaintViewCreateText.setSwatch(swatch2);
                        entityView = textPaintViewCreateText;
                    } else {
                        i3 = size;
                        if (b == 2) {
                            PhotoView photoViewCreatePhoto = createPhoto(mediaEntity.text, false);
                            photoViewCreatePhoto.segmentingLoading = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                photoViewCreatePhoto.mirror(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                boolean z2 = !photoViewCreatePhoto.segmented;
                                photoViewCreatePhoto.segmented = z2;
                                photoViewCreatePhoto.segmentedT.set(z2, true);
                                ChatActivity.AnonymousClass60 anonymousClass60 = photoViewCreatePhoto.containerView;
                                if (anonymousClass60 != null) {
                                    anonymousClass60.invalidate();
                                }
                            }
                            ViewGroup.LayoutParams layoutParams2 = photoViewCreatePhoto.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            entityView = photoViewCreatePhoto;
                        }
                        i4++;
                        arrayList2 = arrayList;
                        size = i3;
                        z = false;
                    }
                }
                entityView.setX((mediaEntity.x * this.paintingSize.width) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f));
                entityView.setY((mediaEntity.y * this.paintingSize.height) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f));
                entityView.setPosition(new PointF((mediaEntity.viewWidth / f) + entityView.getX(), (mediaEntity.viewHeight / f) + entityView.getY()));
                entityView.setScale(mediaEntity.scale);
                entityView.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                i4++;
                arrayList2 = arrayList;
                size = i3;
                z = false;
            }
        }
        setVisibility(4);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.selectionContainerView = anonymousClass7;
        addView(anonymousClass7);
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        final int i8 = 0;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass68;
                        LPhotoPaintView.AnonymousClass2 anonymousClass2 = anonymousClass69.renderView;
                        if (anonymousClass2 != null && (anonymousClass2.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass2.clearShape();
                            anonymousClass69.paintToolsView.setSelectedIndex(1);
                            anonymousClass69.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass69.undoStore.undo();
                        }
                        break;
                    case 1:
                        PhotoViewer.AnonymousClass67 anonymousClass610 = anonymousClass68;
                        UndoStore undoStore2 = anonymousClass610.undoStore;
                        if (undoStore2.canUndo()) {
                            LPhotoPaintView.AnonymousClass2 anonymousClass3 = anonymousClass610.renderView;
                            if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass3.clearShape();
                                anonymousClass610.paintToolsView.setSelectedIndex(1);
                                anonymousClass610.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            anonymousClass3.clearAll();
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass610.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        PhotoViewer.AnonymousClass67 anonymousClass611 = anonymousClass68;
                        EntityView entityView2 = anonymousClass611.currentEntityView;
                        if (entityView2 instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView2).getFocusedView());
                        }
                        if (anonymousClass611.emojiViewVisible) {
                            anonymousClass611.hideEmojiPopup$1(false);
                        }
                        anonymousClass611.removeEntity(anonymousClass611.currentEntityView);
                        anonymousClass611.selectEntity(null, true);
                        break;
                    default:
                        anonymousClass68.selectEntity(null, true);
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
        zzkh.m(16.0f, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, LayoutHelper.createLinear(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(6));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.undoAllButton = textView2;
        textView2.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        final int i9 = 1;
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass68;
                        LPhotoPaintView.AnonymousClass2 anonymousClass2 = anonymousClass69.renderView;
                        if (anonymousClass2 != null && (anonymousClass2.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass2.clearShape();
                            anonymousClass69.paintToolsView.setSelectedIndex(1);
                            anonymousClass69.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass69.undoStore.undo();
                        }
                        break;
                    case 1:
                        PhotoViewer.AnonymousClass67 anonymousClass610 = anonymousClass68;
                        UndoStore undoStore2 = anonymousClass610.undoStore;
                        if (undoStore2.canUndo()) {
                            LPhotoPaintView.AnonymousClass2 anonymousClass3 = anonymousClass610.renderView;
                            if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass3.clearShape();
                                anonymousClass610.paintToolsView.setSelectedIndex(1);
                                anonymousClass610.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            anonymousClass3.clearAll();
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass610.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        PhotoViewer.AnonymousClass67 anonymousClass611 = anonymousClass68;
                        EntityView entityView2 = anonymousClass611.currentEntityView;
                        if (entityView2 instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView2).getFocusedView());
                        }
                        if (anonymousClass611.emojiViewVisible) {
                            anonymousClass611.hideEmojiPopup$1(false);
                        }
                        anonymousClass611.removeEntity(anonymousClass611.currentEntityView);
                        anonymousClass611.selectEntity(null, true);
                        break;
                    default:
                        anonymousClass68.selectEntity(null, true);
                        break;
                }
            }
        });
        textView2.setAlpha(0.6f);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.cancelTextButton = textView3;
        textView3.setBackground(Theme.createSelectorDrawable(822083583, 7, -1));
        textView3.setPadding(zzlm.m(8.0f, R.string.Clear, textView3), 0, AndroidUtilities.dp(8.0f), 0);
        textView3.setGravity(16);
        textView3.setTextColor(-1);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 16.0f);
        final int i10 = 2;
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass68;
                        LPhotoPaintView.AnonymousClass2 anonymousClass2 = anonymousClass69.renderView;
                        if (anonymousClass2 != null && (anonymousClass2.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass2.clearShape();
                            anonymousClass69.paintToolsView.setSelectedIndex(1);
                            anonymousClass69.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass69.undoStore.undo();
                        }
                        break;
                    case 1:
                        PhotoViewer.AnonymousClass67 anonymousClass610 = anonymousClass68;
                        UndoStore undoStore2 = anonymousClass610.undoStore;
                        if (undoStore2.canUndo()) {
                            LPhotoPaintView.AnonymousClass2 anonymousClass3 = anonymousClass610.renderView;
                            if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass3.clearShape();
                                anonymousClass610.paintToolsView.setSelectedIndex(1);
                                anonymousClass610.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            anonymousClass3.clearAll();
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass610.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        PhotoViewer.AnonymousClass67 anonymousClass611 = anonymousClass68;
                        EntityView entityView2 = anonymousClass611.currentEntityView;
                        if (entityView2 instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView2).getFocusedView());
                        }
                        if (anonymousClass611.emojiViewVisible) {
                            anonymousClass611.hideEmojiPopup$1(false);
                        }
                        anonymousClass611.removeEntity(anonymousClass611.currentEntityView);
                        anonymousClass611.selectEntity(null, true);
                        break;
                    default:
                        anonymousClass68.selectEntity(null, true);
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
        textView4.setPadding(zzlm.m(8.0f, R.string.Done, textView4), 0, AndroidUtilities.dp(8.0f), 0);
        textView4.setGravity(16);
        textView4.setTextColor(-1);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextSize(1, 16.0f);
        final int i11 = 3;
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass68;
                        LPhotoPaintView.AnonymousClass2 anonymousClass2 = anonymousClass69.renderView;
                        if (anonymousClass2 != null && (anonymousClass2.getCurrentBrush() instanceof Brush.Shape)) {
                            anonymousClass2.clearShape();
                            anonymousClass69.paintToolsView.setSelectedIndex(1);
                            anonymousClass69.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                        } else {
                            anonymousClass69.undoStore.undo();
                        }
                        break;
                    case 1:
                        PhotoViewer.AnonymousClass67 anonymousClass610 = anonymousClass68;
                        UndoStore undoStore2 = anonymousClass610.undoStore;
                        if (undoStore2.canUndo()) {
                            LPhotoPaintView.AnonymousClass2 anonymousClass3 = anonymousClass610.renderView;
                            if (anonymousClass3 != null && (anonymousClass3.getCurrentBrush() instanceof Brush.Shape)) {
                                anonymousClass3.clearShape();
                                anonymousClass610.paintToolsView.setSelectedIndex(1);
                                anonymousClass610.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                            }
                            anonymousClass3.clearAll();
                            undoStore2.operations.clear();
                            undoStore2.uuidToOperationMap.clear();
                            undoStore2.notifyOfHistoryChanges();
                            anonymousClass610.entitiesView.removeAllViews();
                            break;
                        }
                        break;
                    case 2:
                        PhotoViewer.AnonymousClass67 anonymousClass611 = anonymousClass68;
                        EntityView entityView2 = anonymousClass611.currentEntityView;
                        if (entityView2 instanceof TextPaintView) {
                            AndroidUtilities.hideKeyboard(((TextPaintView) entityView2).getFocusedView());
                        }
                        if (anonymousClass611.emojiViewVisible) {
                            anonymousClass611.hideEmojiPopup$1(false);
                        }
                        anonymousClass611.removeEntity(anonymousClass611.currentEntityView);
                        anonymousClass611.selectEntity(null, true);
                        break;
                    default:
                        anonymousClass68.selectEntity(null, true);
                        break;
                }
            }
        });
        textView4.setAlpha(0.0f);
        textView4.setVisibility(8);
        frameLayout.addView(textView4, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        BottomLayout bottomLayout = new BottomLayout(anonymousClass67, context);
        this.bottomLayout = bottomLayout;
        bottomLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        bottomLayout.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(bottomLayout, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, bitmap2 != null);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        paintToolsView.setDelegate(this);
        paintToolsView.setSelectedIndex(1);
        bottomLayout.addView(paintToolsView, LayoutHelper.createFrame(48.0f, -1));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        paintTextOptionsView.setVisibility(8);
        paintTextOptionsView.setDelegate(this);
        paintTextOptionsView.setAlignment(PersistColorPalette.getInstance(i).currentAlignment);
        bottomLayout.addView(paintTextOptionsView, LayoutHelper.createFrame(48.0f, -1));
        ?? r4 = new FrameLayout(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                anonymousClass69.typefaceMenuOutlinePaint.setAlpha((int) ((1.0f - anonymousClass69.typefaceMenuTransformProgress) * anonymousClass69.textOptionsView.getAlpha() * 102.0f));
                PaintTextOptionsView paintTextOptionsView2 = anonymousClass69.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                float fDp = AndroidUtilities.dp(8.0f) + paintTextOptionsView2.typefaceCell.getLeft();
                PaintTextOptionsView.TypefaceCell typefaceCell = paintTextOptionsView2.typefaceCell;
                rectF.set(fDp, typefaceCell.getTop(), AndroidUtilities.dp(8.0f) + typefaceCell.getRight(), typefaceCell.getBottom());
                float translationY = anonymousClass69.textOptionsView.getTranslationY() + anonymousClass69.bottomLayout.getTranslationY() + anonymousClass69.textOptionsView.getTop() + anonymousClass69.bottomLayout.getTop();
                rectF.set(AndroidUtilities.lerp(rectF.left, anonymousClass69.typefaceListView.getLeft(), anonymousClass69.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + translationY, anonymousClass69.typefaceListView.getTop() - anonymousClass69.typefaceListView.getTranslationY(), anonymousClass69.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, anonymousClass69.typefaceListView.getRight(), anonymousClass69.typefaceMenuTransformProgress), AndroidUtilities.lerp(translationY + rectF.bottom, anonymousClass69.typefaceListView.getBottom() - anonymousClass69.typefaceListView.getTranslationY(), anonymousClass69.typefaceMenuTransformProgress));
                float fDp2 = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, anonymousClass69.typefaceMenuTransformProgress));
                int alpha = anonymousClass69.typefaceMenuBackgroundPaint.getAlpha();
                anonymousClass69.typefaceMenuBackgroundPaint.setAlpha((int) (alpha * anonymousClass69.typefaceMenuTransformProgress));
                canvas.drawRoundRect(rectF, fDp2, fDp2, anonymousClass69.typefaceMenuBackgroundPaint);
                anonymousClass69.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, fDp2, fDp2, anonymousClass69.typefaceMenuOutlinePaint);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                    if (anonymousClass69.isTypefaceMenuShown) {
                        anonymousClass69.showTypefaceMenu(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.overlayLayout = r4;
        addView((View) r4, LayoutHelper.createFrame(-1.0f, -1));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        paintTypefaceListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(anonymousClass68, 20));
        paintTextOptionsView.setTypefaceListView(paintTypefaceListView);
        r4.addView(paintTypefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.typefaceMenuOutlinePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.typefaceMenuOutlinePaint.setColor(1728053247);
        this.typefaceMenuOutlinePaint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.typefaceMenuBackgroundPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
        ?? r5 = new PaintColorsListView(context) {
            public final Path path = new Path();

            @Override
            public final void draw(Canvas canvas) {
                PhotoViewer.AnonymousClass67 anonymousClass69 = anonymousClass67;
                ViewGroup barView = anonymousClass69.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, anonymousClass69.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, anonymousClass69.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), anonymousClass69.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), anonymousClass69.toolsTransformProgress));
                Path path = this.path;
                path.rewind();
                path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.colorsListView = r5;
        r5.setVisibility(8);
        r5.setColorPalette(PersistColorPalette.getInstance(i));
        r5.setColorListener(new LPhotoPaintView$$ExternalSyntheticLambda18(anonymousClass68, 0));
        bottomLayout.addView((View) r5, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        paintCancelView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        bottomLayout.addView(paintCancelView, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        paintDoneView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        paintDoneView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62((Object) anonymousClass68, (Object) context, (Object) bitmap2, 25, (byte) 0));
        bottomLayout.addView(paintDoneView, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(this.colorSwatch);
        paintWeightChooserView.setRenderView(this.renderView);
        paintWeightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        paintWeightChooserView.setOnUpdate(new ArticleViewer$$ExternalSyntheticLambda74(anonymousClass68, i, 27));
        addView(paintWeightChooserView, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1.0f, -1));
        this.colorSwatchOutlinePaint.setStyle(style);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(this.colorSwatch, null);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        this.toolsPaint.setColor(-15132391);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        }
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
        Bitmap bitmap = this.bitmapToEdit;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
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

    public void setNewColor(int i) {
        Swatch swatch = this.colorSwatch;
        int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(swatch, null);
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
        GroupCallActivity.AnonymousClass61 anonymousClass61 = new GroupCallActivity.AnonymousClass61(this, context);
        this.tabsLayout = anonymousClass61;
        anonymousClass61.setClipToPadding(false);
        this.tabsLayout.setOrientation(0);
        this.bottomLayout.addView(this.tabsLayout, LayoutHelper.createFrame(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.drawTab = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.drawTab;
        int i = Theme.key_listSelector;
        LPhotoPaintView$$ExternalSyntheticLambda9 lPhotoPaintView$$ExternalSyntheticLambda9 = this.resourcesProvider;
        textView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, lPhotoPaintView$$ExternalSyntheticLambda9), 7, -1));
        this.drawTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.drawTab.setTextColor(-1);
        this.drawTab.setTextSize(1, 14.0f);
        this.drawTab.setGravity(1);
        this.drawTab.setTypeface(AndroidUtilities.bold());
        this.drawTab.setSingleLine();
        this.drawTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda1(this, 0));
        this.tabsLayout.addView(this.drawTab, LayoutHelper.createLinear(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.stickerTab = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.stickerTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, lPhotoPaintView$$ExternalSyntheticLambda9), 7, -1));
        this.stickerTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.stickerTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda1(this, 3));
        this.stickerTab.setTextColor(-1);
        this.stickerTab.setTextSize(1, 14.0f);
        this.stickerTab.setGravity(1);
        this.stickerTab.setTypeface(AndroidUtilities.bold());
        this.stickerTab.setAlpha(0.6f);
        this.stickerTab.setSingleLine();
        this.tabsLayout.addView(this.stickerTab, LayoutHelper.createLinear(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.textTab = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.textTab.setBackground(Theme.createSelectorDrawable(Theme.getColor(i, lPhotoPaintView$$ExternalSyntheticLambda9), 7, -1));
        this.textTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.textTab.setTextColor(-1);
        this.textTab.setTextSize(1, 14.0f);
        this.textTab.setGravity(1);
        this.textTab.setTypeface(AndroidUtilities.bold());
        this.textTab.setAlpha(0.6f);
        this.textTab.setSingleLine();
        this.textTab.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda1(this, 4));
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(1.0f, 0, -2));
    }

    @Override
    public final boolean allowInteraction() {
        return !this.editingText;
    }

    public final void appearAnimation(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new ImageUpdater$$ExternalSyntheticLambda2(13, this, (PhotoView) view)).start();
    }

    public final PointF centerPositionForEntity() {
        Size paintingSize = getPaintingSize();
        float f = paintingSize.width / 2.0f;
        float f2 = paintingSize.height / 2.0f;
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float fCos = (float) ((Math.cos(radians) * ((double) cropState.cropPx)) - (Math.sin(radians) * ((double) cropState.cropPy)));
            float fM = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, cropState.cropPy, Math.sin(radians) * ((double) cropState.cropPx));
            f -= fCos * paintingSize.width;
            f2 -= fM * paintingSize.height;
        }
        return new PointF(f, f2);
    }

    public final PhotoView createPhoto(String str, boolean z) {
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
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        if (f > 1.0f) {
            float fFloor = (float) Math.floor(((double) anonymousClass6.getMeasuredWidth()) * 0.5d);
            size = new Size(fFloor, fFloor / f);
        } else {
            float fFloor2 = (float) Math.floor(((double) anonymousClass6.getMeasuredHeight()) * 0.5d);
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
        anonymousClass6.addView(photoView);
        if (z) {
            registerRemovalUndo(photoView);
            selectEntity(photoView, true);
        }
        return photoView;
    }

    public final AnonymousClass17 createSticker(Object obj, TLRPC.Document document, boolean z) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f;
        StickerPosition stickerPosition;
        double d;
        StickerPosition stickerPosition2;
        ?? r0;
        PointF pointF;
        boolean zIsTextColorEmoji;
        ImageReceiver imageReceiver;
        int i;
        ArrayList arrayList;
        PhotoFace photoFace;
        PointF pointF2;
        PointF pointF3;
        int i2;
        PhotoFace photoFace2;
        StickerPosition stickerPosition3;
        int i3;
        int i4 = 0;
        while (true) {
            if (i4 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
                break;
            }
            i4++;
        }
        float f2 = 0.75f;
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            f = -(cropState.transformRotation + cropState.cropRotate);
            f2 = 0.75f / cropState.cropScale;
        } else {
            f = 0.0f;
        }
        StickerPosition stickerPosition4 = new StickerPosition(centerPositionForEntity(), f2, f);
        int i5 = 1;
        int i6 = 2;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        if (tL_maskCoords != null && (arrayList = this.faces) != null && arrayList.size() != 0) {
            int i7 = tL_maskCoords.n;
            long j = document.id;
            int i8 = 3;
            if (i7 >= 0 && i7 <= 3 && !this.faces.isEmpty()) {
                int size = this.faces.size();
                int iNextInt = Utilities.random.nextInt(size);
                int i9 = size;
                loop1: while (true) {
                    if (i9 <= 0) {
                        stickerPosition = stickerPosition4;
                        d = 0.5d;
                        photoFace = null;
                        break;
                    }
                    photoFace = (PhotoFace) this.faces.get(iNextInt);
                    if (i7 == 0) {
                        d = 0.5d;
                        pointF3 = photoFace.foreheadPoint;
                    } else if (i7 == i5) {
                        d = 0.5d;
                        pointF3 = photoFace.eyesCenterPoint;
                    } else if (i7 == i6) {
                        d = 0.5d;
                        pointF3 = photoFace.mouthPoint;
                    } else if (i7 != i8) {
                        photoFace.getClass();
                        pointF3 = null;
                        d = 0.5d;
                    } else {
                        d = 0.5d;
                        pointF3 = photoFace.chinPoint;
                    }
                    if (pointF3 != null) {
                        float f3 = photoFace.width * 1.1f;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= anonymousClass6.getChildCount()) {
                                stickerPosition = stickerPosition4;
                                break loop1;
                            }
                            View childAt = anonymousClass6.getChildAt(i10);
                            if (childAt instanceof StickerView) {
                                StickerView stickerView = (StickerView) childAt;
                                if (stickerView.getAnchor() != i7) {
                                    i2 = iNextInt;
                                    photoFace2 = photoFace;
                                    stickerPosition3 = stickerPosition4;
                                    i3 = i10;
                                } else {
                                    PointF position = stickerView.getPosition();
                                    i2 = iNextInt;
                                    photoFace2 = photoFace;
                                    stickerPosition3 = stickerPosition4;
                                    double d2 = position.x - pointF3.x;
                                    float f4 = position.y - pointF3.y;
                                    i3 = i10;
                                    float fHypot = (float) Math.hypot(d2, f4);
                                    if ((j == stickerView.getSticker().id || this.faces.size() > 1) && fHypot < f3) {
                                        break;
                                    }
                                }
                            } else {
                                i2 = iNextInt;
                                photoFace2 = photoFace;
                                stickerPosition3 = stickerPosition4;
                                i3 = i10;
                            }
                            i10 = i3 + 1;
                            iNextInt = i2;
                            stickerPosition4 = stickerPosition3;
                            photoFace = photoFace2;
                        }
                    } else {
                        i2 = iNextInt;
                        stickerPosition3 = stickerPosition4;
                    }
                    iNextInt = (i2 + 1) % size;
                    i9--;
                    stickerPosition4 = stickerPosition3;
                    i8 = 3;
                    i5 = 1;
                    i6 = 2;
                }
            } else {
                stickerPosition = stickerPosition4;
                d = 0.5d;
                photoFace = null;
                break;
            }
            if (photoFace != null) {
                if (i7 == 0) {
                    pointF2 = photoFace.foreheadPoint;
                } else if (i7 == 1) {
                    pointF2 = photoFace.eyesCenterPoint;
                } else if (i7 != 2) {
                    pointF2 = i7 != 3 ? null : photoFace.chinPoint;
                } else {
                    pointF2 = photoFace.mouthPoint;
                }
                float f5 = i7 == 1 ? photoFace.eyesDistance : photoFace.width;
                float fFloor = (float) (((double) (f5 / ((float) Math.floor(((double) getPaintingSize().width) * d)))) * tL_maskCoords.zoom);
                float f6 = photoFace.angle;
                double radians = (float) Math.toRadians(f6);
                double d3 = 1.5707963267948966d - radians;
                double d4 = f5;
                float fSin = (float) (Math.sin(d3) * d4 * tL_maskCoords.x);
                float fCos = (float) (Math.cos(d3) * d4 * tL_maskCoords.x);
                double d5 = radians + 1.5707963267948966d;
                stickerPosition2 = new StickerPosition(new PointF(pointF2.x + fSin + ((float) (Math.cos(d5) * d4 * tL_maskCoords.y)), pointF2.y + fCos + ((float) (Math.sin(d5) * d4 * tL_maskCoords.y))), fFloor, f6);
            }
            Context context = getContext();
            float fFloor2 = (float) Math.floor(((double) getPaintingSize().width) * d);
            Size size2 = new Size(fFloor2, fFloor2);
            pointF = stickerPosition2.position;
            r0 = new StickerView(context, pointF, stickerPosition2.angle, stickerPosition2.scale, size2, document, obj) {
                @Override
                public final void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                    int i11;
                    PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) LPhotoPaintView.this;
                    VideoPlayer videoPlayer = PhotoViewer.this.videoPlayer;
                    if (videoPlayer == null) {
                        return;
                    }
                    long currentPosition = videoPlayer.getCurrentPosition();
                    long j2 = PhotoViewer.this.startTime;
                    long j3 = currentPosition - (j2 > 0 ? j2 / 1000 : 0L);
                    int[] iArr = rLottieDrawable.metaData;
                    if (iArr[0] == 0 || (i11 = iArr[1]) == 0) {
                        return;
                    }
                    rLottieDrawable.setCurrentFrame(Math.round(Math.max(0L, j3) / (1000.0f / i11)) % iArr[0], true, true);
                }
            };
            zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
            imageReceiver = r0.centerImage;
            if (zIsTextColorEmoji) {
                imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            imageReceiver.setLayerNum(12);
            if (pointF.x == anonymousClass6.getMeasuredWidth() / 2.0f) {
                i = 2;
                r0.setStickyX(2);
            } else {
                i = 2;
            }
            if (pointF.y == anonymousClass6.getMeasuredHeight() / 2.0f) {
                r0.setStickyY(i);
            }
            r0.setDelegate(this);
            anonymousClass6.addView(r0);
            if (z) {
                registerRemovalUndo(r0);
                selectEntity(r0, true);
            }
            return r0;
        }
        stickerPosition = stickerPosition4;
        d = 0.5d;
        stickerPosition2 = stickerPosition;
        Context context2 = getContext();
        float fFloor3 = (float) Math.floor(((double) getPaintingSize().width) * d);
        Size size3 = new Size(fFloor3, fFloor3);
        pointF = stickerPosition2.position;
        r0 = new StickerView(context2, pointF, stickerPosition2.angle, stickerPosition2.scale, size3, document, obj) {
            @Override
            public final void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                int i11;
                PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) LPhotoPaintView.this;
                VideoPlayer videoPlayer = PhotoViewer.this.videoPlayer;
                if (videoPlayer == null) {
                    return;
                }
                long currentPosition = videoPlayer.getCurrentPosition();
                long j2 = PhotoViewer.this.startTime;
                long j3 = currentPosition - (j2 > 0 ? j2 / 1000 : 0L);
                int[] iArr = rLottieDrawable.metaData;
                if (iArr[0] == 0 || (i11 = iArr[1]) == 0) {
                    return;
                }
                rLottieDrawable.setCurrentFrame(Math.round(Math.max(0L, j3) / (1000.0f / i11)) % iArr[0], true, true);
            }
        };
        zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        imageReceiver = r0.centerImage;
        if (zIsTextColorEmoji) {
            imageReceiver.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        imageReceiver.setLayerNum(12);
        if (pointF.x == anonymousClass6.getMeasuredWidth() / 2.0f) {
            i = 2;
            r0.setStickyX(2);
        } else {
            i = 2;
        }
        if (pointF.y == anonymousClass6.getMeasuredHeight() / 2.0f) {
            r0.setStickyY(i);
        }
        r0.setDelegate(this);
        anonymousClass6.addView(r0);
        if (z) {
            registerRemovalUndo(r0);
            selectEntity(r0, true);
        }
        return r0;
    }

    public final TextPaintView createText(boolean z) {
        PhotoViewer.this.windowView.isFocusable();
        Size paintingSize = getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        TextPaintView textPaintView = new TextPaintView(getContext(), pointFStartPositionRelativeToEntity, (int) (paintingSize.width / 9.0f), "", this.colorSwatch, this.selectedTextType);
        float f = paintingSize.width / 9.0f;
        LPhotoPaintView$$ExternalSyntheticLambda21 lPhotoPaintView$$ExternalSyntheticLambda21 = new LPhotoPaintView$$ExternalSyntheticLambda21(this, 2);
        textPaintView.minFontSize = (int) (0.5f * f);
        textPaintView.maxFontSize = (int) (f * 2.0f);
        textPaintView.onFontChange = lPhotoPaintView$$ExternalSyntheticLambda21;
        float f2 = pointFStartPositionRelativeToEntity.x;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        if (f2 == anonymousClass6.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == anonymousClass6.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth((int) (paintingSize.width - 20.0f));
        int i = this.currentAccount;
        textPaintView.setTypeface(PersistColorPalette.getInstance(i).currentTypeface);
        textPaintView.setType(PersistColorPalette.getInstance(i).currentTextType);
        anonymousClass6.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            textPaintView.rotate(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo(textPaintView);
            textPaintView.beginEditing();
            selectEntity(textPaintView, false);
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AnonymousClass6 anonymousClass6;
        TextPaintView textPaintView;
        String str;
        if (i != NotificationCenter.customTypefacesLoaded || (anonymousClass6 = this.entitiesView) == null) {
            return;
        }
        for (int i3 = 0; i3 < anonymousClass6.getChildCount(); i3++) {
            View childAt = anonymousClass6.getChildAt(i3);
            if ((childAt instanceof TextPaintView) && (str = (textPaintView = (TextPaintView) childAt).lastTypefaceKey) != null) {
                textPaintView.setTypeface(str);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        MediaController.CropState cropState;
        AnonymousClass7 anonymousClass7;
        int i = 0;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        if (view == anonymousClass6) {
            float f = this.shadowAlpha.set(this.drawShadow);
            if (f > 0.0f) {
                Paint paint = this.shadowPaint;
                paint.setShadowLayer(AndroidUtilities.dp(24.0f * f), 0.0f, 0.0f, Theme.multAlpha(f, 1090519039));
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(anonymousClass6.getX(), anonymousClass6.getY());
                canvas.scale(anonymousClass6.getScaleX(), anonymousClass6.getScaleY(), anonymousClass6.getWidth() / 2.0f, anonymousClass6.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, anonymousClass6.getWidth(), anonymousClass6.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, anonymousClass6.getWidth(), anonymousClass6.getHeight(), this.clearPaint);
                canvas.restore();
            }
        }
        if ((view == this.renderView || view == this.renderInputView || ((view == anonymousClass6 && anonymousClass6.getClipChildren()) || (view == (anonymousClass7 = this.selectionContainerView) && anonymousClass7.getClipChildren()))) && (cropState = this.currentCropState) != null) {
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
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.transformX;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.emojiPadding) - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.cancelButton;
    }

    @Override
    public final int[] getCenterLocation(EntityView entityView) {
        return getCenterLocationInWindow(entityView);
    }

    public final int[] getCenterLocationInWindow(EntityView entityView) {
        float width = entityView.getWidth() / 2.0f;
        float[] fArr = this.position;
        fArr[0] = width;
        fArr[1] = entityView.getHeight() / 2.0f;
        entityView.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + entityView.getLeft();
        fArr[1] = fArr[1] + entityView.getTop();
        Object parent = entityView.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int iRound = Math.round(fArr[0]);
        int[] iArr = this.pos2;
        iArr[0] = iRound;
        iArr[1] = Math.round(fArr[1]);
        float f = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f2 = f - (point.x / 2.0f);
        float f3 = iArr[1] - (point.y / 2.0f);
        double d = f2;
        double radians = (float) Math.toRadians(-getRotation());
        double d2 = f3;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.doneButton;
    }

    public long getLcm() {
        return this.lcm.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        int childCount = anonymousClass6.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = anonymousClass6.getChildAt(i);
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

    public float getOffsetTranslationY() {
        return this.offsetTranslationY;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public RenderView getRenderView() {
        return this.renderView;
    }

    public float getSelectedEntityBottom() {
        EntityView entityView = this.currentEntityView;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        if (entityView == null) {
            return getY() + anonymousClass6.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        entityView.getLocationInWindow(iArr);
        return (anonymousClass6.getScaleY() * this.currentEntityView.getHeight()) + iArr[1];
    }

    public ThanosEffect getThanosEffect() {
        if (!ThanosEffect.supports()) {
            return null;
        }
        if (this.thanosEffect == null) {
            ThanosEffect thanosEffect = new ThanosEffect(getContext(), new LPhotoPaintView$$ExternalSyntheticLambda21(this, 0));
            this.thanosEffect = thanosEffect;
            addView(thanosEffect);
        }
        return this.thanosEffect;
    }

    @Override
    public final void getTransformedTouch(float f, float f2, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        float f3 = f - (point.x / 2.0f);
        float f4 = f2 - (point.y / 2.0f);
        double d = f3;
        double radians = (float) Math.toRadians(-getRotation());
        double d2 = f4;
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
    }

    public View getView() {
        return this;
    }

    public final void hideEmojiPopup$1(boolean z) {
        int i = 1;
        if (this.emojiViewVisible) {
            showEmojiPopup$1(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView == null || emojiView.getVisibility() != 0) {
                hideEmojiView$1();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
            valueAnimatorOfFloat.addUpdateListener(new LPhotoPaintView$$ExternalSyntheticLambda23(this, 0));
            this.isAnimatePopupClosing = true;
            valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public final void hideEmojiView$1() {
        EmojiView emojiView;
        KeyboardNotifier keyboardNotifier;
        if (this.emojiPadding > 0 && (keyboardNotifier = PhotoViewer.this.paintKeyboardNotifier) != null) {
            keyboardNotifier.fire();
        }
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        this.emojiPadding = 0;
    }

    @Override
    public final boolean isEntityDeletable() {
        return true;
    }

    public final void lambda$detectFaces$24() {
        Bitmap bitmap = this.facesBitmap;
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
                    ArrayList arrayList = new ArrayList();
                    Size paintingSize = getPaintingSize();
                    for (int i = 0; i < sparseArrayDetect.size(); i++) {
                        Face face = (Face) sparseArrayDetect.get(sparseArrayDetect.keyAt(i));
                        int i2 = this.originalBitmapRotation;
                        PhotoFace photoFace = new PhotoFace(face, bitmap, paintingSize, i2 % 360 == 90 || i2 % 360 == 270);
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

    public final void lambda$new$8(Integer num) {
        setNewColor(num.intValue());
        showColorList(false);
    }

    public final void lambda$new$9(Integer num) {
        int iIntValue = num.intValue();
        PersistColorPalette persistColorPalette = this.palette;
        persistColorPalette.selectColor(iIntValue, true);
        persistColorPalette.saveColors();
        setNewColor(num.intValue());
        int currentColorPosition = persistColorPalette.getCurrentColorPosition();
        AnonymousClass9 anonymousClass9 = this.colorsListView;
        anonymousClass9.setSelectedColorIndex(currentColorPosition);
        anonymousClass9.getAdapter().notifyDataSetChanged();
    }

    public final void lambda$showMenuForEntity$39() {
        EntityView entityView;
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 != null) {
            PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(entityView2);
            EntityView entityView3 = this.currentEntityView;
            boolean z = entityView3 instanceof StickerView;
            AnonymousClass6 anonymousClass6 = this.entitiesView;
            if (z) {
                EntityView stickerView = new StickerView(getContext(), (StickerView) this.currentEntityView, pointFStartPositionRelativeToEntity);
                stickerView.setDelegate(this);
                anonymousClass6.addView(stickerView);
                entityView = stickerView;
            } else if (entityView3 instanceof TextPaintView) {
                TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) this.currentEntityView, pointFStartPositionRelativeToEntity);
                textPaintView.setDelegate(this);
                textPaintView.setMaxWidth((int) (getPaintingSize().width - 20.0f));
                anonymousClass6.addView(textPaintView, LayoutHelper.createFrame(-2.0f, -2));
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

    @Override
    public final void onAddButtonPressed() {
        showPopup(new LPhotoPaintView$$ExternalSyntheticLambda21(this, 4), this, 53, 0, getHeight());
    }

    public final void onAnimationStateChanged(boolean z) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setLayerType(z ? 2 : 0, null);
            this.bottomLayout.setLayerType(z ? 2 : 0, null);
            this.topLayout.setLayerType(z ? 2 : 0, null);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    public final boolean onBackPressed() {
        if (this.isColorListShown) {
            showColorList(false);
            return true;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup$1(true);
            return true;
        }
        if (!this.editingText) {
            return false;
        }
        selectEntity(null, true);
        return true;
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
        AnonymousClass2 anonymousClass2 = this.renderView;
        if (anonymousClass2.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        anonymousClass2.setBrush(brush);
        Swatch swatch = this.colorSwatch;
        int i = swatch.color;
        swatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        swatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(swatch, Integer.valueOf(i));
        invalidate();
    }

    @Override
    public final void onColorPickerSelected() {
        showColorList(true);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onEntityDragEnd(boolean z) {
    }

    @Override
    public final void onEntityDragMultitouchEnd() {
    }

    @Override
    public final void onEntityDragMultitouchStart() {
    }

    @Override
    public final void onEntityDragStart() {
    }

    @Override
    public final void onEntityDragTrash(boolean z) {
    }

    @Override
    public final void onEntityDraggedBottom(boolean z) {
    }

    @Override
    public final void onEntityDraggedTop(boolean z) {
    }

    @Override
    public final void onEntityHandleTouched() {
    }

    @Override
    public final void onEntityLongClicked(EntityView entityView) {
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new LPhotoPaintView$$ExternalSyntheticLambda8(this, entityView, 0), this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f));
    }

    @Override
    public final boolean onEntitySelected(EntityView entityView) {
        return selectEntity(entityView, true);
    }

    @Override
    public final PersistColorPalette onGetPalette() {
        return PersistColorPalette.getInstance(this.currentAccount);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        AnonymousClass2 anonymousClass2 = this.renderView;
        int iCeil = (int) Math.ceil((i5 - anonymousClass2.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m((((i6 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - anonymousClass2.getMeasuredHeight()) / 2, 8.0f, i7);
        anonymousClass2.layout(iCeil, additionalTop, anonymousClass2.getMeasuredWidth() + iCeil, anonymousClass2.getMeasuredHeight() + additionalTop);
        AnonymousClass4 anonymousClass4 = this.renderInputView;
        anonymousClass4.layout(iCeil, additionalTop, anonymousClass4.getMeasuredWidth() + iCeil, anonymousClass4.getMeasuredHeight() + additionalTop);
        int measuredWidth = anonymousClass2.getMeasuredWidth();
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        int measuredWidth2 = ((measuredWidth - anonymousClass6.getMeasuredWidth()) / 2) + iCeil;
        int measuredHeight2 = ((anonymousClass2.getMeasuredHeight() - anonymousClass6.getMeasuredHeight()) / 2) + additionalTop;
        anonymousClass6.layout(measuredWidth2, measuredHeight2, anonymousClass6.getMeasuredWidth() + measuredWidth2, anonymousClass6.getMeasuredHeight() + measuredHeight2);
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            thanosEffect.layout(measuredWidth2, measuredHeight2, anonymousClass6.getMeasuredWidth() + measuredWidth2, anonymousClass6.getMeasuredHeight() + measuredHeight2);
        }
        AnonymousClass7 anonymousClass7 = this.selectionContainerView;
        anonymousClass7.layout(iCeil, additionalTop, anonymousClass7.getMeasuredWidth() + iCeil, anonymousClass7.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
            currentActionBarHeight = bitmap.getHeight();
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
        measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f2 = fFloor / this.paintingSize.width;
        this.baseScale = f2;
        AnonymousClass6 anonymousClass6 = this.entitiesView;
        anonymousClass6.setScaleX(f2);
        anonymousClass6.setScaleY(this.baseScale);
        anonymousClass6.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
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
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.ignoreLayout = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
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
    public final void onNewTextSelected() {
        KeyboardNotifier keyboardNotifier;
        if (!this.keyboardVisible && !this.emojiViewVisible) {
            createText(true);
            return;
        }
        boolean z = this.emojiViewVisible;
        if (z) {
            boolean z2 = this.currentEntityView instanceof TextPaintView;
        }
        if (z && (keyboardNotifier = PhotoViewer.this.paintKeyboardNotifier) != null) {
            keyboardNotifier.awaitingKeyboard = true;
        }
        showEmojiPopup$1(!z ? 1 : 0);
        if (z) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                AndroidUtilities.showKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
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
        if (this.emojiViewVisible) {
            int i2 = z ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.emojiView.setLayoutParams(layoutParams);
                this.emojiPadding = layoutParams.height;
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
                KeyboardNotifier keyboardNotifier = PhotoViewer.this.paintKeyboardNotifier;
                if (keyboardNotifier != null) {
                    keyboardNotifier.fire();
                }
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
            showEmojiPopup$1(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
            KeyboardNotifier keyboardNotifier2 = PhotoViewer.this.paintKeyboardNotifier;
            if (keyboardNotifier2 != null) {
                keyboardNotifier2.fire();
            }
        }
        getHeight();
    }

    @Override
    public final void onTextAlignmentSelected(int i) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            setTextAlignment((TextPaintView) entityView, i);
            PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(this.currentAccount);
            persistColorPalette.currentAlignment = i;
            persistColorPalette.mConfig.edit().putInt("text_alignment", i).apply();
        }
    }

    @Override
    public final void onTextOutlineSelected() {
        setTextType((this.selectedTextType + 1) % 4);
    }

    public final boolean onTouch(MotionEvent motionEvent) {
        if (this.currentEntityView != null) {
            selectEntity(null, true);
        }
        float x = motionEvent.getX();
        AnonymousClass2 anonymousClass2 = this.renderView;
        float translationX = ((x - anonymousClass2.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / anonymousClass2.getScaleX();
        float y = ((((motionEvent.getY() - anonymousClass2.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / anonymousClass2.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-anonymousClass2.getRotation());
        double d2 = y;
        float measuredWidth = (anonymousClass2.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (anonymousClass2.getMeasuredHeight() / 2.0f) + ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(measuredWidth, measuredHeight);
        anonymousClass2.onTouch(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override
    public final void onTypefaceButtonClicked() {
        showTypefaceMenu(true);
    }

    public final void registerRemovalUndo(EntityView entityView) {
        if (entityView == null) {
            return;
        }
        UUID uuid = entityView.getUUID();
        LPhotoPaintView$$ExternalSyntheticLambda8 lPhotoPaintView$$ExternalSyntheticLambda8 = new LPhotoPaintView$$ExternalSyntheticLambda8(this, entityView, 1);
        UndoStore undoStore = this.undoStore;
        undoStore.uuidToOperationMap.put(uuid, lPhotoPaintView$$ExternalSyntheticLambda8);
        undoStore.operations.add(uuid);
        undoStore.notifyOfHistoryChanges();
    }

    public final void removeEntity(EntityView entityView) {
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
        removeView(entityView);
        if (entityView != null) {
            UUID uuid = entityView.getUUID();
            UndoStore undoStore = this.undoStore;
            undoStore.uuidToOperationMap.remove(uuid);
            undoStore.operations.remove(uuid);
            undoStore.notifyOfHistoryChanges();
        }
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        Stripe stripe = this.weightDefaultValueOverride;
        paintWeightChooserView.setValueOverride(stripe);
        paintWeightChooserView.setShowPreview(true);
        float f = stripe.get();
        Swatch swatch = this.colorSwatch;
        swatch.brushWeight = f;
        setCurrentSwatch(swatch, null);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final boolean selectEntity(EntityView entityView, boolean z) {
        LPhotoPaintView lPhotoPaintView;
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
            PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
            paintTextOptionsView.setAlignment(i2);
            paintTextOptionsView.setTypeface(textPaintView.getTypeface().key);
            paintTextOptionsView.setOutlineType(textPaintView.getType(), true);
            invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            lPhotoPaintView = this;
            z2 = false;
        } else {
            if (entityView2 == entityView) {
                if (!this.editingText) {
                    int[] centerLocationInWindow = getCenterLocationInWindow(entityView2);
                    showPopup(new LPhotoPaintView$$ExternalSyntheticLambda8(this, entityView2, 0), this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (entityView2 instanceof TextPaintView) {
                    AndroidUtilities.showKeyboard(((TextPaintView) entityView2).getFocusedView());
                    hideEmojiPopup$1(false);
                }
                return true;
            }
            lPhotoPaintView = this;
            entityView2.updateSelect(entityView2.lastSelectionContainer, false);
            EntityView entityView3 = lPhotoPaintView.currentEntityView;
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
                    lPhotoPaintView.editingText = false;
                    AndroidUtilities.hideKeyboard(((TextPaintView) lPhotoPaintView.currentEntityView).getFocusedView());
                    hideEmojiPopup$1(false);
                }
            }
            z2 = true;
        }
        EntityView entityView4 = lPhotoPaintView.currentEntityView;
        lPhotoPaintView.currentEntityView = entityView;
        if ((entityView4 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView4).getText())) {
            removeEntity(entityView4);
        }
        EntityView entityView5 = lPhotoPaintView.currentEntityView;
        Stripe stripe = lPhotoPaintView.weightDefaultValueOverride;
        Swatch swatch = lPhotoPaintView.colorSwatch;
        PaintWeightChooserView paintWeightChooserView = lPhotoPaintView.weightChooserView;
        if (entityView5 == null) {
            ValueAnimator valueAnimator2 = lPhotoPaintView.tabsSelectionAnimator;
            if (valueAnimator2 != null && lPhotoPaintView.tabsNewSelectedIndex != 0) {
                valueAnimator2.cancel();
            }
            if (lPhotoPaintView.isColorListShown) {
                showColorList(false);
            }
            switchTab(0);
            paintWeightChooserView.setValueOverride(stripe);
            paintWeightChooserView.setShowPreview(true);
            swatch.brushWeight = stripe.get();
            setCurrentSwatch(swatch, null);
            return z2;
        }
        AnonymousClass7 anonymousClass7 = lPhotoPaintView.selectionContainerView;
        entityView5.lastSelectionContainer = anonymousClass7;
        entityView5.updateSelect(anonymousClass7, true);
        lPhotoPaintView.entitiesView.bringChildToFront(lPhotoPaintView.currentEntityView);
        EntityView entityView6 = lPhotoPaintView.currentEntityView;
        if (!(entityView6 instanceof TextPaintView)) {
            paintWeightChooserView.setValueOverride(stripe);
            paintWeightChooserView.setShowPreview(true);
            swatch.brushWeight = stripe.get();
            setCurrentSwatch(swatch, null);
            return true;
        }
        TextPaintView textPaintView3 = (TextPaintView) entityView6;
        textPaintView3.disableAutoresize = false;
        textPaintView3.getSwatch().brushWeight = swatch.brushWeight;
        setCurrentSwatch(textPaintView3.getSwatch(), null);
        paintWeightChooserView.setValueOverride(new PaintView.AnonymousClass14(textPaintView3, (int) (lPhotoPaintView.paintingSize.width / 9.0f), 1));
        paintWeightChooserView.setShowPreview(false);
        return true;
    }

    public void setBlurredBackgroundDrawableForTools(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
        this.blurredBackgroundDrawableForTools = blurredBackgroundDrawable;
    }

    public final void setCurrentSwatch(Swatch swatch, Integer num) {
        Swatch swatch2 = this.colorSwatch;
        if (swatch2 != swatch) {
            swatch2.color = swatch.color;
            swatch2.brushWeight = swatch.brushWeight;
            int i = this.currentAccount;
            PersistColorPalette.getInstance(i).selectColor(swatch.color, true);
            PersistColorPalette.getInstance(i).setCurrentWeight(swatch.brushWeight);
        }
        int i2 = swatch.color;
        AnonymousClass2 anonymousClass2 = this.renderView;
        anonymousClass2.setColor(i2);
        anonymousClass2.setBrushSize(swatch.brushWeight);
        int i3 = swatch2.color;
        if (num == null || num.intValue() == i3) {
            BottomLayout bottomLayout = this.bottomLayout;
            if (bottomLayout != null) {
                bottomLayout.invalidate();
            }
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new PaintView$$ExternalSyntheticLambda35(this, num, i3, 1));
            duration.start();
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(new Swatch(swatch.brushWeight, swatch.color));
        }
    }

    public void setDrawShadow(boolean z) {
        this.drawShadow = z;
        invalidate();
        setClipChildren(!z);
    }

    public void setOffsetTranslationX(float f) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setTranslationX(f);
        }
    }

    public final void setOffsetTranslationY(float f) {
        this.offsetTranslationY = f;
        this.topLayout.setTranslationY(-f);
        this.bottomLayout.setTranslationY(f);
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    public final void setTransform(float f, float f2, float f3, float f4, float f5) {
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
        float f10 = f3 + 0.0f;
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
                int i2 = cropState.transformRotation;
                if (i2 != 90 && i2 != 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float f12 = measuredHeight;
                float f13 = measuredWidth;
                float fMax = Math.max(f4 / ((int) (cropState.cropPw * f12)), f5 / ((int) (cropState.cropPh * f13)));
                f6 = f11 * fMax;
                float fM = MediaController$$ExternalSyntheticOutline0.m(cropState.cropPx, f12, f, fMax);
                float f14 = cropState.cropScale;
                f7 = (fM * f14) + f2;
                f8 = (cropState.cropPy * f13 * f * fMax * f14) + f10;
                f9 = cropState.cropRotate + i2;
            } else {
                f6 = i == 0 ? this.baseScale * 1.0f : 1.0f;
                f7 = f2;
                f8 = f10;
                f9 = 0.0f;
            }
            float f15 = ((-this.emojiPadding) / 2.0f) + f8;
            float f16 = f * f6;
            if (Float.isNaN(f16)) {
                f16 = 1.0f;
            }
            view.setScaleX(f16);
            view.setScaleY(f16);
            view.setTranslationX(f7);
            view.setTranslationY(f15);
            view.setRotation(f9);
            view.invalidate();
            i++;
        }
        updateEntitiesSelections();
        invalidate();
    }

    public final void showColorList(final boolean z) {
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
                    float f3 = f / 1000.0f;
                    LPhotoPaintView lPhotoPaintView = this.f$0;
                    lPhotoPaintView.toolsTransformProgress = f3;
                    float f4 = ((1.0f - f3) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f4);
                    viewGroup.setScaleY(f4);
                    viewGroup.setTranslationY((Math.min(lPhotoPaintView.toolsTransformProgress, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(lPhotoPaintView.toolsTransformProgress, 0.25f) / 0.25f));
                    float f5 = lPhotoPaintView.toolsTransformProgress;
                    LPhotoPaintView.AnonymousClass9 anonymousClass9 = lPhotoPaintView.colorsListView;
                    boolean z2 = z;
                    anonymousClass9.setProgress(f5, z2);
                    lPhotoPaintView.doneButton.setProgress(lPhotoPaintView.toolsTransformProgress);
                    lPhotoPaintView.cancelButton.setProgress(lPhotoPaintView.toolsTransformProgress);
                    lPhotoPaintView.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * lPhotoPaintView.toolsTransformProgress);
                    boolean z3 = zArr[0];
                    LPhotoPaintView.BottomLayout bottomLayout = lPhotoPaintView.bottomLayout;
                    if (z3) {
                        bottomLayout.setTranslationY(translationY - ((AndroidUtilities.dp(40.0f) * (z2 ? lPhotoPaintView.toolsTransformProgress : 1.0f - lPhotoPaintView.toolsTransformProgress)) * (z2 ? 1 : -1)));
                    }
                    bottomLayout.invalidate();
                    if (viewGroup == lPhotoPaintView.textOptionsView) {
                        lPhotoPaintView.overlayLayout.invalidate();
                    }
                }
            });
            this.toolsTransformAnimation.addEndListener(new MentionsContainerView$$ExternalSyntheticLambda3(this, z, 2));
            this.toolsTransformAnimation.start();
            if (z) {
                AnonymousClass9 anonymousClass9 = this.colorsListView;
                anonymousClass9.setVisibility(0);
                anonymousClass9.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    public final void showEmojiPopup$1(int i) {
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        int i2 = 0;
        if (i != 1) {
            ChatActivityEnterViewAnimatedIconView emojiButton = paintTextOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                this.emojiViewVisible = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    emojiView.setVisibility(8);
                }
            }
            if (i == 0) {
                this.emojiPadding = 0;
            }
            KeyboardNotifier keyboardNotifier = PhotoViewer.this.paintKeyboardNotifier;
            if (keyboardNotifier != null) {
                keyboardNotifier.fire();
            }
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
            getHeight();
            return;
        }
        EmojiView emojiView2 = this.emojiView;
        boolean z = emojiView2 != null && emojiView2.getVisibility() == 0;
        EmojiView emojiView3 = this.emojiView;
        if (emojiView3 != null && emojiView3.currentAccount != UserConfig.selectedAccount) {
            removeView(emojiView3);
            this.emojiView = null;
        }
        if (this.emojiView == null) {
            EmojiView emojiView4 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false, false);
            this.emojiView = emojiView4;
            emojiView4.allowEmojisForNonPremium = true;
            emojiView4.setVisibility(8);
            if (AndroidUtilities.isTablet()) {
                this.emojiView.setForseMultiwindowLayout(true);
            }
            this.emojiView.setDelegate(new AnonymousClass21());
            addView(this.emojiView);
        }
        this.emojiView.setVisibility(0);
        this.emojiViewVisible = true;
        EmojiView emojiView5 = this.emojiView;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView5.getLayoutParams();
        layoutParams.height = i3;
        emojiView5.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
        this.emojiPadding = i3;
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
        KeyboardNotifier keyboardNotifier2 = PhotoViewer.this.paintKeyboardNotifier;
        if (keyboardNotifier2 != null) {
            keyboardNotifier2.fire();
        }
        ChatActivityEnterViewAnimatedIconView emojiButton2 = paintTextOptionsView.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
        }
        getHeight();
        if (z || this.keyboardVisible) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new LPhotoPaintView$$ExternalSyntheticLambda23(this, 1));
        valueAnimatorOfFloat.addListener(new AnonymousClass19(this, i2));
        valueAnimatorOfFloat.start();
    }

    public final void showPopup(Runnable runnable, LPhotoPaintView lPhotoPaintView, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, getContext(), this.resourcesProvider);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setBackgroundColor(-14145495);
            this.popupLayout.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 7));
            this.popupLayout.setDispatchKeyEventListener(new LPhotoPaintView$$ExternalSyntheticLambda31(this));
            this.popupLayout.setShownFromBottom(true);
        }
        this.popupLayout.linearLayout.removeAllViews();
        runnable.run();
        if (this.popupWindow == null) {
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.animationEnabled = true;
            actionBarPopupWindow2.setAnimationStyle(R.style.PopupAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new ArticleViewer$$ExternalSyntheticLambda67(this, 4));
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
                PaintTypefaceListView paintTypefaceListView = this.typefaceListView;
                paintTypefaceListView.setAlpha(0.0f);
                paintTypefaceListView.setVisibility(0);
            }
            this.typefaceMenuTransformAnimation.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 7));
            this.typefaceMenuTransformAnimation.addEndListener(new MentionsContainerView$$ExternalSyntheticLambda3(this, z, 1));
            this.typefaceMenuTransformAnimation.start();
        }
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
            int i = 0;
            boolean z = false;
            while (true) {
                AnonymousClass6 anonymousClass6 = this.entitiesView;
                if (i >= anonymousClass6.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass6.getChildAt(i);
                if (childAt instanceof EntityView) {
                    PointF position2 = ((EntityView) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - pointFCenterPositionForEntity.y, 2.0d) + Math.pow(position2.x - pointFCenterPositionForEntity.x, 2.0d))) < f2) {
                        z = true;
                    }
                }
                i++;
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
        if (this.tabsSelectedIndex == i || this.tabsNewSelectedIndex == i) {
            return;
        }
        ValueAnimator valueAnimator = this.tabsSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i2 = this.tabsSelectedIndex;
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        PaintToolsView paintToolsView = this.paintToolsView;
        if (i2 == 0) {
            viewGroup = paintToolsView;
        } else {
            viewGroup = i2 == 2 ? paintTextOptionsView : null;
        }
        this.tabsNewSelectedIndex = i;
        if (i == 0) {
            viewGroup2 = paintToolsView;
        } else {
            viewGroup2 = i == 2 ? paintTextOptionsView : null;
        }
        int i3 = this.currentAccount;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i3);
        boolean z = i == 2;
        if (persistColorPalette.inTextMode != z) {
            persistColorPalette.inTextMode = z;
            if (z) {
                persistColorPalette.setCurrentBrush(-1, false);
            } else {
                persistColorPalette.setCurrentBrush(persistColorPalette.mConfig.getInt("brush", 0), false);
            }
        }
        int currentColor = PersistColorPalette.getInstance(i3).getCurrentColor();
        Swatch swatch = this.colorSwatch;
        swatch.color = currentColor;
        setCurrentSwatch(swatch, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.tabsSelectionAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.tabsSelectionAnimator.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(this, viewGroup, viewGroup2, 1));
        this.tabsSelectionAnimator.addListener(new ChatActivity.AnonymousClass132(this, viewGroup, viewGroup2, i, 1));
        this.tabsSelectionAnimator.start();
    }

    @Override
    public final void updateColors$1() {
        this.toolsPaint.setColor(-15132391);
    }

    public final void updateEntitiesSelections() {
        EntityView.SelectionView selectionView;
        int i = 0;
        while (true) {
            AnonymousClass6 anonymousClass6 = this.entitiesView;
            if (i >= anonymousClass6.getChildCount()) {
                return;
            }
            View childAt = anonymousClass6.getChildAt(i);
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
            i++;
        }
    }
}
