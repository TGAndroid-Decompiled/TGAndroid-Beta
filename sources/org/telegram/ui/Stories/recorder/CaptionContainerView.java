package org.telegram.ui.Stories.recorder;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LivePlayer$1$$ExternalSyntheticLambda0;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.iv.RichEditor;

public abstract class CaptionContainerView extends FrameLayout {
    public final BounceableImageView applyButton;
    public final Drawable applyButtonCheck;
    public final CombinedDrawable applyButtonDrawable;
    public final BlurringShader.StoryBlurDrawer backgroundBlur;
    public BlurredBackgroundDrawable backgroundForCaptionField;
    public final Paint backgroundPaint;
    public int beforeScrollY;
    public Bitmap blurBitmap;
    public Matrix blurBitmapMatrix;
    public BitmapShader blurBitmapShader;
    public final BlurringShader.BlurManager blurManager;
    public Paint blurPaint;
    public final ButtonBounce bounce;
    public final RectF bounds;
    public final BlurringShader.StoryBlurDrawer captionBlur;
    public final RectF clickBounds;
    public final Path clipPath;
    public int codePointCount;
    public RadialGradient collapseGradient;
    public Matrix collapseGradientMatrix;
    public RadialGradient collapseOutGradient;
    public Paint collapseOutPaint;
    public Paint collapsePaint;
    public boolean collapsed;
    public int collapsedFromX;
    public final AnimatedFloat collapsedT;
    public final FrameLayout containerView;
    public int currentAccount;
    public long dialogId;
    public final AnonymousClass3 editText;
    public BlurredBackgroundDrawableViewFactory factoryForMentions;
    public final LinearGradient fadeGradient;
    public final Paint fadePaint;
    public Utilities.CallbackVoidReturn getUiBlurBitmap;
    public int goingToScrollY;
    public boolean hasReply;
    public final AnimatedFloat heightAnimated;
    public Bitmap hintTextBitmap;
    public final Paint hintTextBitmapPaint;
    public final TextPaint hintTextPaint;
    public boolean ignoreDraw;
    public boolean ignoreTextChange;
    public boolean ignoreTouches;
    public ValueAnimator keyboardAnimator;
    public final KeyboardNotifier keyboardNotifier;
    public boolean keyboardShown;
    public float keyboardT;
    public int lastHeight;
    public float lastHeightTranslation;
    public final FrameLayout limitTextContainer;
    public final AnimatedTextView limitTextView;
    public final Matrix matrix;
    public BlurringShader.StoryBlurDrawer mentionBackgroundBlur;
    public ChatAttachAlert.AnonymousClass36 mentionContainer;
    public Utilities.Callback onHeightUpdate;
    public Utilities.Callback onKeyboardOpen;
    public ObjectAnimator parentKeyboardAnimator;
    public final RectF rectF;
    public final BlurringShader.StoryBlurDrawer replyBackgroundBlur;
    public Path replyClipPath;
    public Paint replyLinePaint;
    public Path replyLinePath;
    public float[] replyLinePathRadii;
    public Text replyText;
    public final BlurringShader.StoryBlurDrawer replyTextBlur;
    public Text replyTitle;
    public Theme.ResourcesProvider resourcesProvider;
    public final FrameLayout rootView;
    public ObjectAnimator scrollAnimator;
    public int shiftDp;
    public final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    public final StrokeDrawable strokeDrawable;
    public final StrokeDrawable strokeDrawableEmoji;
    public final CaptionContainerView$$ExternalSyntheticLambda0 textChangeRunnable;
    public boolean toKeyboardShow;
    public final CaptionContainerView$$ExternalSyntheticLambda0 updateShowKeyboard;
    public boolean waitingForScrollYChange;

    public final class AnonymousClass3 extends EditTextEmoji {
        public BlurringShader.StoryBlurDrawer blurDrawer;
        public BlurredBackgroundDrawable blurredBackgroundDrawable;
        public final BlurringShader.BlurManager val$blurManager;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass3(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, int i, DarkThemeResourceProvider darkThemeResourceProvider, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
            super(context, sizeNotifierFrameLayout, null, i, true, darkThemeResourceProvider);
            this.val$resourcesProvider = resourcesProvider;
            this.val$blurManager = blurManager;
        }

        @Override
        public final boolean allowSearch() {
            return true;
        }

        @Override
        public final void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                CaptionContainerView captionContainerView = CaptionContainerView.this;
                if (captionContainerView.getEditTextStyle() == 2 || captionContainerView.getEditTextStyle() == 3) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    if (captionContainerView instanceof CaptionPhotoViewer) {
                        emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                        emojiView.emojiCacheType = 3;
                    }
                    emojiView.updateColors$1();
                }
            }
            if (emojiView != null) {
                emojiView.customOutline = true;
                emojiView.setClipToOutline(true);
                emojiView.setOutlineProvider(new RichEditor.AnonymousClass5(18));
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            if ((captionContainerView instanceof CaptionStory) && ((CaptionStory) captionContainerView).recording) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void drawEmojiBackground(Canvas canvas, EditTextEmoji.AnonymousClass6 anonymousClass6) {
            Bitmap bitmap;
            int radius;
            int radius2;
            WindowInsets rootWindowInsets;
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            RectF rectF = captionContainerView.rectF;
            rectF.set(0.0f, 0.0f, anonymousClass6.getWidth(), AndroidUtilities.dp(29.0f) + anonymousClass6.getHeight());
            int i = 0;
            if (captionContainerView.factoryForMentions != null) {
                if (this.blurredBackgroundDrawable == null) {
                    if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                        radius = 0;
                        radius2 = 0;
                    } else {
                        RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                        RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                        radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                        radius = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                    }
                    BlurredBackgroundDrawable blurredBackgroundDrawableCreate = captionContainerView.factoryForMentions.create(anonymousClass6, null, false);
                    blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.val$resourcesProvider));
                    this.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
                    blurredBackgroundDrawableCreate.setRadius$1(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, radius2);
                    BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
                    blurredBackgroundDrawable.inAppKeyboardOptimization = true;
                    blurredBackgroundDrawable.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
                    blurredBackgroundDrawable.onBoundPropsChanged();
                    BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.blurredBackgroundDrawable;
                    blurredBackgroundDrawable2.boundProps.liquidIntensity = 0.4f;
                    blurredBackgroundDrawable2.onBoundPropsChanged();
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                this.blurredBackgroundDrawable.setBounds(rect);
                this.blurredBackgroundDrawable.draw(canvas);
                return;
            }
            if (captionContainerView.customBlur()) {
                if (this.blurDrawer == null) {
                    this.blurDrawer = new BlurringShader.StoryBlurDrawer(this.val$blurManager, anonymousClass6, 7, false);
                }
                captionContainerView.drawBlur(this.blurDrawer, canvas, rectF, AndroidUtilities.dp(29.0f), false, 0.0f, -anonymousClass6.getY(), false);
                float fDp = AndroidUtilities.dp(29.0f);
                StrokeDrawable strokeDrawable = captionContainerView.strokeDrawableEmoji;
                strokeDrawable.radius = fDp;
                strokeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
                strokeDrawable.draw(canvas);
                return;
            }
            if (captionContainerView.keyboardT > 0.0f && captionContainerView.blurPaint != null && captionContainerView.blurBitmapShader != null && (bitmap = captionContainerView.blurBitmap) != null && !bitmap.isRecycled()) {
                captionContainerView.blurBitmapMatrix.reset();
                Matrix matrix = captionContainerView.blurBitmapMatrix;
                FrameLayout frameLayout = captionContainerView.rootView;
                matrix.postScale(frameLayout.getWidth() / captionContainerView.blurBitmap.getWidth(), frameLayout.getHeight() / captionContainerView.blurBitmap.getHeight());
                float x = 0.0f;
                float y = 0.0f;
                View view = anonymousClass6;
                while (i < 8 && view != null) {
                    x += view.getX();
                    y += view.getY();
                    Object parent = view.getParent();
                    i++;
                    view = parent instanceof View ? (View) parent : null;
                }
                captionContainerView.blurBitmapMatrix.postTranslate(-x, -y);
                captionContainerView.blurBitmapShader.setLocalMatrix(captionContainerView.blurBitmapMatrix);
                captionContainerView.blurPaint.setAlpha((int) (captionContainerView.keyboardT * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, captionContainerView.blurPaint);
            }
            Paint paint = captionContainerView.backgroundPaint;
            paint.setAlpha((int) (captionContainerView.blurPaint == null ? 128.0f : AndroidUtilities.lerp(128, 153, captionContainerView.keyboardT) * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }

        @Override
        public final void onEmojiKeyboardUpdate() {
            CaptionContainerView.this.keyboardNotifier.fire();
        }

        @Override
        public final void onLineCountChanged(int i, int i2) {
            CaptionContainerView.this.onLineCountChanged(i, i2);
        }

        @Override
        public final boolean onScrollYChange(int i) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            ObjectAnimator objectAnimator = captionContainerView.scrollAnimator;
            if (objectAnimator != null && objectAnimator.isRunning() && i == captionContainerView.goingToScrollY) {
                return false;
            }
            captionContainerView.invalidate();
            if (!captionContainerView.waitingForScrollYChange) {
                return true;
            }
            captionContainerView.waitingForScrollYChange = false;
            if (captionContainerView.beforeScrollY == i) {
                return true;
            }
            ObjectAnimator objectAnimator2 = captionContainerView.scrollAnimator;
            if (objectAnimator2 != null && objectAnimator2.isRunning() && i == captionContainerView.goingToScrollY) {
                return true;
            }
            ObjectAnimator objectAnimator3 = captionContainerView.scrollAnimator;
            if (objectAnimator3 != null) {
                objectAnimator3.cancel();
            }
            AnonymousClass3 anonymousClass3 = captionContainerView.editText;
            anonymousClass3.getEditText().setScrollY(captionContainerView.beforeScrollY);
            EditTextCaption editText = anonymousClass3.getEditText();
            int i2 = captionContainerView.beforeScrollY;
            captionContainerView.goingToScrollY = i;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
            captionContainerView.scrollAnimator = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(240L);
            captionContainerView.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            captionContainerView.scrollAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 27));
            captionContainerView.scrollAnimator.start();
            return false;
        }

        @Override
        public final void onWaitingForKeyboard() {
            CaptionContainerView.this.keyboardNotifier.awaitingKeyboard = true;
        }

        @Override
        public final void updatedEmojiExpanded() {
            CaptionContainerView.this.keyboardNotifier.fire();
        }
    }

    public final class AnonymousClass4 implements TextWatcher {
        public int lastLength;
        public boolean lastOverLimit;

        public AnonymousClass4() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            String str;
            int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            captionContainerView.codePointCount = iCodePointCount;
            int captionLimit = captionContainerView.getCaptionLimit();
            if (captionContainerView.codePointCount + 25 > captionLimit) {
                str = "" + (captionLimit - captionContainerView.codePointCount);
            } else {
                str = null;
            }
            AnimatedTextView animatedTextView = captionContainerView.limitTextView;
            animatedTextView.drawable.cancelAnimation();
            animatedTextView.setText(str);
            animatedTextView.setTextColor(captionContainerView.codePointCount >= captionLimit ? -1280137 : -1);
            if (captionContainerView.codePointCount > captionLimit && !UserConfig.getInstance(captionContainerView.currentAccount).isPremium() && captionContainerView.codePointCount < captionContainerView.getCaptionPremiumLimit() && captionContainerView.codePointCount > this.lastLength && (captionContainerView.captionLimitToast() || MessagesController.getInstance(captionContainerView.currentAccount).premiumFeaturesBlocked())) {
                int i = -captionContainerView.shiftDp;
                captionContainerView.shiftDp = i;
                AndroidUtilities.shakeViewSpring(animatedTextView, i);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            int i2 = captionContainerView.codePointCount;
            this.lastLength = i2;
            boolean z = i2 > captionLimit;
            if (z != this.lastOverLimit) {
                captionContainerView.onCaptionLimitUpdate(z);
            }
            this.lastOverLimit = z;
            if (!captionContainerView.ignoreTextChange) {
                CaptionContainerView$$ExternalSyntheticLambda0 captionContainerView$$ExternalSyntheticLambda0 = captionContainerView.textChangeRunnable;
                AndroidUtilities.cancelRunOnUIThread(captionContainerView$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(captionContainerView$$ExternalSyntheticLambda0, 1500L);
            }
            captionContainerView.ignoreTextChange = false;
            AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 28));
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            ObjectAnimator objectAnimator = captionContainerView.scrollAnimator;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                captionContainerView.beforeScrollY = captionContainerView.editText.getEditText().getScrollY();
                captionContainerView.waitingForScrollYChange = true;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CaptionContainerView captionContainerView = CaptionContainerView.this;
            AnonymousClass3 anonymousClass3 = captionContainerView.editText;
            if (anonymousClass3.getEditText().suppressOnTextChanged) {
                return;
            }
            if (captionContainerView.mentionContainer == null) {
                ChatAttachAlert.AnonymousClass36 anonymousClass36 = new ChatAttachAlert.AnonymousClass36(captionContainerView, captionContainerView.getContext(), captionContainerView.dialogId, LaunchActivity.getLastFragment(), new DarkThemeResourceProvider(), 1);
                captionContainerView.mentionContainer = anonymousClass36;
                captionContainerView.mentionBackgroundBlur = new BlurringShader.StoryBlurDrawer(captionContainerView.blurManager, anonymousClass36, 0, false);
                captionContainerView.mentionContainer.withDelegate(new PollItemMenu.AnonymousClass6(captionContainerView, 7));
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = captionContainerView.factoryForMentions;
                if (blurredBackgroundDrawableViewFactory != null) {
                    ChatAttachAlert.AnonymousClass36 anonymousClass37 = captionContainerView.mentionContainer;
                    BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(anonymousClass37, null, false);
                    blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(captionContainerView.resourcesProvider));
                    anonymousClass37.setBackgroundDrawable(blurredBackgroundDrawableCreate);
                }
                captionContainerView.containerView.addView(captionContainerView.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
                captionContainerView.setupMentionContainer();
            }
            if (captionContainerView.mentionContainer.getAdapter() != null) {
                MentionsAdapter adapter = captionContainerView.mentionContainer.getAdapter();
                MessagesController.getInstance(captionContainerView.currentAccount).getUser(Long.valueOf(captionContainerView.dialogId));
                TLRPC.Chat chat = MessagesController.getInstance(captionContainerView.currentAccount).getChat(Long.valueOf(-captionContainerView.dialogId));
                adapter.getClass();
                adapter.chat = chat;
                captionContainerView.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, anonymousClass3.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }

    public final class BounceableImageView extends ImageView {
        public final ButtonBounce bounce;
        public final float scale;

        public BounceableImageView(Context context) {
            super(context);
            this.bounce = new ButtonBounce(this, 1.0f, 5.0f);
            this.scale = 0.2f;
        }

        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            float scale = this.bounce.getScale(this.scale);
            canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
            super.draw(canvas);
            canvas.restore();
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            this.bounce.setPressed(z);
        }
    }

    public final class PeriodDrawable extends Drawable {
        public final Path activePath;
        public final AnonymousClass1 activeTextDrawable;
        public boolean clear;
        public float cx;
        public float cy;
        public final int dashes;
        public float diameterDp;
        public final Paint fillPaint;
        public final AnimatedFloat fillT;
        public boolean filled;
        public int strokeColor;
        public final Paint strokePaint;
        public final AnonymousClass1 textDrawable;
        public float textOffsetX;
        public float textOffsetY;

        public PeriodDrawable(int i) {
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            this.fillPaint = new Paint(1);
            final int i2 = 0;
            ?? r1 = new AnimatedTextView.AnimatedTextDrawable(this) {
                public final PeriodDrawable this$0;

                {
                    super(true, false, false, false);
                    this.this$0 = this;
                }

                @Override
                public final void invalidateSelf() {
                    switch (i2) {
                        case 0:
                            this.this$0.invalidateSelf();
                            break;
                        default:
                            this.this$0.invalidateSelf();
                            break;
                    }
                }
            };
            this.textDrawable = r1;
            final int i3 = 1;
            ?? r2 = new AnimatedTextView.AnimatedTextDrawable(this) {
                public final PeriodDrawable this$0;

                {
                    super(true, false, false, false);
                    this.this$0 = this;
                }

                @Override
                public final void invalidateSelf() {
                    switch (i3) {
                        case 0:
                            this.this$0.invalidateSelf();
                            break;
                        default:
                            this.this$0.invalidateSelf();
                            break;
                    }
                }
            };
            this.activeTextDrawable = r2;
            this.filled = false;
            LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = new LivePlayer$1$$ExternalSyntheticLambda0(this, 29);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.fillT = new AnimatedFloat(livePlayer$1$$ExternalSyntheticLambda0, 350L, cubicBezierInterpolator, 0);
            this.activePath = new Path();
            this.diameterDp = 21.0f;
            this.dashes = i;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            r1.moveAmplitude = 0.3f;
            r1.animateDuration = 250L;
            r1.animateWave = 1.0f;
            r1.animateInterpolator = cubicBezierInterpolator;
            r1.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            r1.setTextSize(AndroidUtilities.dpf2(12.0f));
            r1.gravity = 17;
            r2.moveAmplitude = 0.3f;
            r2.animateDuration = 250L;
            r2.animateWave = 1.0f;
            r2.animateInterpolator = cubicBezierInterpolator;
            r2.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            r2.setTextSize(AndroidUtilities.dpf2(12.0f));
            r2.gravity = 17;
            updateColors(-1, -15033089, -1);
        }

        @Override
        public final void draw(Canvas canvas) {
            draw(canvas, 1.0f);
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setBounds(Rect rect) {
            super.setBounds(rect);
            this.cx = getBounds().centerX();
            this.cy = getBounds().centerY();
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void setValue(int i, boolean z, boolean z2) {
            setText(SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), z2, true);
            setText("" + i, z2, true);
            this.filled = z;
            if (!z2) {
                this.fillT.set(z, true);
            }
            invalidateSelf();
        }

        public final void updateColors(int i, int i2, int i3) {
            this.strokeColor = i;
            this.strokePaint.setColor(i);
            AnonymousClass1 anonymousClass1 = this.textDrawable;
            anonymousClass1.textPaint.setColor(i);
            anonymousClass1.alpha = Color.alpha(i);
            AnonymousClass1 anonymousClass2 = this.activeTextDrawable;
            anonymousClass2.textPaint.setColor(i3);
            anonymousClass2.alpha = Color.alpha(i3);
            this.fillPaint.setColor(i2);
        }

        public final void draw(Canvas canvas, float f) {
            float fDpf2 = AndroidUtilities.dpf2(this.diameterDp) / 2.0f;
            float f2 = this.fillT.set(this.filled);
            if (f2 > 0.0f) {
                Paint paint = this.fillPaint;
                paint.setAlpha((int) (f * 255.0f * f2));
                canvas.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(11.33f) * f2, paint);
            }
            Paint paint2 = this.strokePaint;
            paint2.setAlpha((int) ((1.0f - f2) * Color.alpha(this.strokeColor) * f));
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = this.cx;
            float f4 = this.cy;
            rectF.set(f3 - fDpf2, f4 - fDpf2, f3 + fDpf2, f4 + fDpf2);
            canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
            int i = this.dashes;
            float f5 = ((i + 1) * 1.5f) + (i * 1.0f);
            float f6 = (1.0f / f5) * 180.0f;
            float f7 = (1.5f / f5) * 180.0f;
            float f8 = f7;
            int i2 = 0;
            while (i2 < i) {
                float f9 = f6;
                canvas.drawArc(AndroidUtilities.rectTmp, f8 + 270.0f, f9, false, paint2);
                f8 = f9 + f7 + f8;
                i2++;
                f6 = f9;
            }
            canvas.save();
            canvas.translate(this.textOffsetX + 0.0f, this.textOffsetY);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (this.cx - AndroidUtilities.dp(20.0f)), (int) (this.cy - AndroidUtilities.dp(20.0f)), (int) (this.cx + AndroidUtilities.dp(20.0f)), (int) (this.cy + AndroidUtilities.dp(20.0f)));
            AnonymousClass1 anonymousClass1 = this.textDrawable;
            anonymousClass1.setBounds(rect);
            anonymousClass1.alpha = (int) (Color.alpha(this.strokeColor) * f);
            anonymousClass1.draw(canvas);
            if (f2 > 0.0f) {
                Path path = this.activePath;
                path.rewind();
                path.addCircle(this.cx, this.cy + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * f2, Path.Direction.CW);
                canvas.clipPath(path);
                AnonymousClass1 anonymousClass2 = this.activeTextDrawable;
                anonymousClass2.setBounds(rect);
                anonymousClass2.alpha = (int) (f * 255.0f);
                anonymousClass2.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public final void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.cx = getBounds().centerX();
            this.cy = getBounds().centerY();
        }
    }

    public CaptionContainerView(Context context, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context);
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        this.strokeDrawable = strokeDrawable;
        StrokeDrawable strokeDrawable2 = new StrokeDrawable();
        this.strokeDrawableEmoji = strokeDrawable2;
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.fadePaint = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.fadeGradient = linearGradient;
        this.matrix = new Matrix();
        this.hintTextPaint = new TextPaint(3);
        Paint paint3 = new Paint(3);
        this.hintTextBitmapPaint = paint3;
        this.shiftDp = -4;
        this.currentAccount = UserConfig.selectedAccount;
        this.textChangeRunnable = new CaptionContainerView$$ExternalSyntheticLambda0(this, 0);
        this.bounce = new ButtonBounce(this, 1.0f, 3.0f);
        this.updateShowKeyboard = new CaptionContainerView$$ExternalSyntheticLambda0(this, 1);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.heightAnimated = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        this.ignoreDraw = false;
        this.rectF = new RectF();
        this.bounds = new RectF();
        this.clickBounds = new RectF();
        this.clipPath = new Path();
        this.collapsedT = new AnimatedFloat(500L, this, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        this.rootView = frameLayout;
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = frameLayout2;
        this.blurManager = blurManager;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, !customBlur());
        this.replyBackgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 8, false);
        this.replyTextBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 9, false);
        strokeDrawable.nonRound = true;
        int i = Theme.key_windowBackgroundWhite;
        strokeDrawable.colorProvider = new FragmentFloatingButton.AnonymousClass1(resourcesProvider, i, 0.0f, 1);
        Paint paint4 = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint paint5 = strokeDrawable.paintStrokeBottom;
        paint5.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint4.setColor(strokeDrawable.strokeColorTop);
            paint4.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint5.setColor(strokeDrawable.strokeColorBottom);
            paint5.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable.paintFill.setColor(0);
        strokeDrawable.invalidateSelf();
        strokeDrawable2.nonRound = true;
        strokeDrawable2.colorProvider = new FragmentFloatingButton.AnonymousClass1(resourcesProvider, i, 0.0f, 2);
        Paint paint6 = strokeDrawable2.paintStrokeTop;
        paint6.setStyle(style);
        Paint paint7 = strokeDrawable2.paintStrokeBottom;
        paint7.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable2.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable2.strokeColorTop = Theme.multAlpha(strokeDrawable2.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable2.strokeColorBottom = Theme.multAlpha(strokeDrawable2.alpha, strokeDrawable2.colorProvider.getStrokeColorBottom());
            paint6.setColor(strokeDrawable2.strokeColorTop);
            paint6.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint7.setColor(strokeDrawable2.strokeColorBottom);
            paint7.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable2.paintFill.setColor(0);
        strokeDrawable2.invalidateSelf();
        paint.setColor(Integer.MIN_VALUE);
        this.keyboardNotifier = new KeyboardNotifier(frameLayout, false, new VoIPFragment$$ExternalSyntheticLambda7(this, 11));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, sizeNotifierFrameLayout, getEditTextStyle(), new DarkThemeResourceProvider(), resourcesProvider, blurManager);
        this.editText = anonymousClass3;
        anonymousClass3.glassDesignForEmojiView = true;
        anonymousClass3.getEditText().addTextChangedListener(new EditTextCell.AnonymousClass3());
        anonymousClass3.setFocusable(true);
        anonymousClass3.setFocusableInTouchMode(true);
        anonymousClass3.getEditText().hintLayoutYFix = true;
        anonymousClass3.getEditText().drawHint = new LinkManager$$ExternalSyntheticLambda1(this, 26);
        anonymousClass3.getEditText().setSupportRtlHint(true);
        this.captionBlur = new BlurringShader.StoryBlurDrawer(blurManager, anonymousClass3.getEditText(), customBlur() ? 1 : 2, false);
        anonymousClass3.getEditText().setHintColor(-1);
        anonymousClass3.getEditText().setHintText(LocaleController.getString(R.string.AddCaption), false);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        anonymousClass3.getEditText().setTranslationX(AndroidUtilities.dp(-26.0f));
        boolean z = this instanceof PhotoViewer.AnonymousClass31;
        if (z) {
            anonymousClass3.getEditText().setGravity(48);
        }
        anonymousClass3.getEmojiButton().setAlpha(0.0f);
        anonymousClass3.getEmojiButton().setTranslationY(AndroidUtilities.dp(z ? 1.0f : -1.0f));
        anonymousClass3.setTranslationY(AndroidUtilities.dp(z ? 1.0f : -1.0f));
        anonymousClass3.getEditText().addTextChangedListener(new AnonymousClass4());
        anonymousClass3.getEditText().setLinkTextColor(-1);
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -2.0f, (z ? 48 : 80) | 7, 12.0f, 8.0f, additionalRightMargin() + 12, 8.0f));
        BounceableImageView bounceableImageView = new BounceableImageView(context);
        this.applyButton = bounceableImageView;
        ScaleStateListAnimator.apply(bounceableImageView, 0.05f, 1.25f);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.input_done).mutate();
        this.applyButtonCheck = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.SRC_IN));
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_chat_editMediaButton, resourcesProvider)), drawableMutate, 0, AndroidUtilities.dp(1.0f));
        this.applyButtonDrawable = combinedDrawable;
        int iDp = AndroidUtilities.dp(36.0f);
        int iDp2 = AndroidUtilities.dp(36.0f);
        combinedDrawable.backWidth = iDp;
        combinedDrawable.backHeight = iDp2;
        bounceableImageView.setImageDrawable(combinedDrawable);
        bounceableImageView.setScaleType(ImageView.ScaleType.CENTER);
        bounceableImageView.setContentDescription(LocaleController.getString(R.string.Done));
        bounceableImageView.setAlpha(0.0f);
        bounceableImageView.setVisibility(8);
        bounceableImageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 23));
        addView(bounceableImageView, LayoutHelper.createFrame(44, 44.0f, (z ? 48 : 80) | 5, 8.0f, 8.0f, 8.0f, 8.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.limitTextView = animatedTextView;
        animatedTextView.setGravity(17);
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView.setTextColor(-1);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
        animatedTextDrawable.moveAmplitude = 0.4f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.limitTextContainer = frameLayout3;
        frameLayout3.setTranslationX(AndroidUtilities.dp(2.0f));
        frameLayout3.addView(animatedTextView, LayoutHelper.createFrame(52, 16, (z ? 48 : 80) | 5));
        addView(frameLayout3, LayoutHelper.createFrame(52, 16.0f, (z ? 48 : 80) | 5, 0.0f, z ? 50 : 0, 0.0f, z ? 0 : 50));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public int additionalKeyboardHeight() {
        return AndroidUtilities.navigationBarHeight;
    }

    public int additionalRightMargin() {
        return 0;
    }

    public abstract void afterUpdateShownKeyboard(boolean z);

    public abstract void beforeUpdateShownKeyboard(boolean z);

    public abstract boolean captionLimitToast();

    @Override
    public final void clearFocus() {
        this.editText.clearFocus();
    }

    public boolean clipChild(View view) {
        return true;
    }

    public abstract boolean customBlur();

    @Override
    public void dispatchDraw(Canvas canvas) {
        int iMax;
        CaptionContainerView captionContainerView;
        RectF rectF;
        float f;
        float f2;
        float f3;
        int i;
        float fDp;
        BlurringShader.StoryBlurDrawer storyBlurDrawer;
        BlurringShader.StoryBlurDrawer storyBlurDrawer2;
        float fDp2;
        float f4;
        Paint paint;
        RectF rectF2;
        char c;
        char c2;
        float f5;
        int iMin;
        Canvas canvas2 = canvas;
        RectF rectF3 = this.clickBounds;
        AnonymousClass3 anonymousClass3 = this.editText;
        if (this.ignoreDraw) {
            return;
        }
        int height = anonymousClass3.getHeight();
        if (this.collapsed) {
            iMax = AndroidUtilities.dp(44.0f);
        } else {
            iMax = this.keyboardShown ? Math.max(AndroidUtilities.dp(44.0f), height) : Math.min(AndroidUtilities.dp(82.0f), height);
        }
        if (!this.collapsed && this.hasReply) {
            iMax += AndroidUtilities.dp(50.0f);
        }
        float f6 = iMax;
        int i2 = (int) this.heightAnimated.set(f6, false);
        if (i2 != this.lastHeight) {
            onEditHeightChange(i2);
            Utilities.Callback callback = this.onHeightUpdate;
            if (callback != null) {
                callback.run(Integer.valueOf(i2));
            }
            this.lastHeight = iMax;
        }
        updateMentionsLayoutPosition();
        int iDp = AndroidUtilities.dp(7.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        boolean z = this instanceof PhotoViewer.AnonymousClass31;
        RectF rectF4 = this.bounds;
        if (z) {
            if (!this.collapsed) {
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(-1.0f), AndroidUtilities.dpf2(1.0f), this.keyboardT);
                EditTextCaption editText = anonymousClass3.getEditText();
                this.lastHeightTranslation = fLerp;
                editText.setTranslationY(fLerp);
            }
            float f7 = iDp;
            float f8 = iDp2;
            int i3 = iDp2 + i2;
            this.bounds.set(f7, f8, getWidth() - iDp, i3);
            rectF3.set(f7, f8, getWidth() - iDp, AndroidUtilities.dp(24.0f) + i3);
        } else {
            float fLerp2 = (AndroidUtilities.lerp(AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(-1.0f), this.keyboardT) + f6) - i2;
            if (Math.abs(this.lastHeightTranslation - fLerp2) >= 1.0f && !this.collapsed) {
                EditTextCaption editText2 = anonymousClass3.getEditText();
                this.lastHeightTranslation = fLerp2;
                editText2.setTranslationY(fLerp2);
            }
            rectF4.set(iDp, (getHeight() - iDp2) - i2, getWidth() - iDp, getHeight() - iDp2);
            rectF3.set(0.0f, (getHeight() - i2) - AndroidUtilities.dp(24.0f), getWidth(), getHeight());
        }
        canvas2.save();
        float scale = this.bounce.getScale(0.018f);
        canvas2.scale(scale, scale, rectF4.centerX(), rectF4.centerY());
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.keyboardT * 0.0f);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.factoryForMentions;
        if (blurredBackgroundDrawableViewFactory != null) {
            if (this.backgroundForCaptionField == null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
                blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider));
                blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(5.0f));
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(22.0f));
                this.backgroundForCaptionField = blurredBackgroundDrawableCreate;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF4.round(rect);
            rect.inset(-AndroidUtilities.lerp(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), this.keyboardT), -AndroidUtilities.dp(5.0f));
            this.backgroundForCaptionField.setBounds(rect);
            this.backgroundForCaptionField.draw(canvas2);
            captionContainerView = this;
            rectF = rectF4;
            f = fLerp3;
            f2 = 21.0f;
            f3 = 0.0f;
        } else {
            boolean zCustomBlur = customBlur();
            Paint paint2 = this.backgroundPaint;
            if (zCustomBlur) {
                f2 = 21.0f;
                f3 = 0.0f;
                drawBlur(this.backgroundBlur, canvas, rectF4, fLerp3, false, 0.0f, 0.0f, true);
                captionContainerView = this;
                canvas2 = canvas;
                rectF = rectF4;
                f = fLerp3;
                paint2.setAlpha(AndroidUtilities.lerp(38, 64, captionContainerView.keyboardT));
                canvas2.drawRoundRect(rectF, f, f, paint2);
            } else {
                captionContainerView = this;
                rectF = rectF4;
                f = fLerp3;
                f2 = 21.0f;
                f3 = 0.0f;
                Paint[] paints = captionContainerView.backgroundBlur.getPaints();
                if (paints[1] == null) {
                    paint2.setAlpha(128);
                    canvas2.drawRoundRect(rectF, f, f, paint2);
                } else {
                    Paint paint3 = paints[0];
                    if (paint3 != null) {
                        canvas2.drawRoundRect(rectF, f, f, paint3);
                    }
                    Paint paint4 = paints[1];
                    if (paint4 != null) {
                        canvas2.drawRoundRect(rectF, f, f, paint4);
                    }
                    paint2.setAlpha(51);
                    canvas2.drawRoundRect(rectF, f, f, paint2);
                }
            }
        }
        AnimatedFloat animatedFloat = captionContainerView.collapsedT;
        float f9 = animatedFloat.value;
        float f10 = animatedFloat.set(captionContainerView.collapsed);
        if (Math.abs(f9 - f10) > 0.001f) {
            captionContainerView.invalidateDrawOver2();
        } else {
            if ((f9 <= f3) != (f10 <= f3)) {
                captionContainerView.invalidateDrawOver2();
            }
        }
        if (f10 > f3) {
            canvas2.saveLayerAlpha(rectF, 255, 31);
        }
        if (!captionContainerView.hasReply || (storyBlurDrawer = captionContainerView.replyBackgroundBlur) == null || (storyBlurDrawer2 = captionContainerView.replyTextBlur) == null) {
            f = f;
            i = -1;
        } else {
            if (captionContainerView.collapsed) {
                if (captionContainerView.keyboardShown) {
                    f5 = rectF.bottom;
                    iMin = Math.max(AndroidUtilities.dp(46.0f), anonymousClass3.getHeight());
                } else {
                    f5 = rectF.bottom;
                    iMin = Math.min(AndroidUtilities.dp(82.0f), anonymousClass3.getHeight());
                }
                float f11 = f5 - iMin;
                float f12 = 1.0f - animatedFloat.value;
                fDp2 = f11 - AndroidUtilities.dp(50.0f);
                f4 = f12;
            } else {
                fDp2 = rectF.top;
                f4 = 1.0f;
            }
            float f13 = fDp2;
            Paint paint$1 = storyBlurDrawer.getPaint$1(f4);
            Paint paint$2 = storyBlurDrawer2.getPaint$1(f4);
            RectF rectF5 = AndroidUtilities.rectTmp;
            rectF5.set(rectF.left + AndroidUtilities.dp(10.0f), f13 + AndroidUtilities.dp(10.0f), rectF.right - AndroidUtilities.dp(10.0f), f13 + AndroidUtilities.dp(52.0f));
            if (paint$1 != null) {
                canvas2.drawRoundRect(rectF5, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint$1);
            }
            if (paint$2 != null) {
                paint = paint$2;
                rectF2 = rectF5;
                i = -1;
                c = 3;
                c2 = 1;
                canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, 255, 31);
                canvas2 = canvas;
            } else {
                paint = paint$2;
                rectF2 = rectF5;
                i = -1;
                c = 3;
                c2 = 1;
            }
            Path path = captionContainerView.replyClipPath;
            if (path == null) {
                captionContainerView.replyClipPath = new Path();
            } else {
                path.rewind();
            }
            float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(f2), 0, captionContainerView.keyboardT);
            Path path2 = captionContainerView.replyClipPath;
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF, fLerp4, fLerp4, direction);
            canvas2.clipPath(captionContainerView.replyClipPath);
            Text text = captionContainerView.replyTitle;
            if (text != null) {
                text.ellipsizeWidth = (int) (rectF.width() - AndroidUtilities.dp(40.0f));
                text.draw(rectF.left + AndroidUtilities.dp(20.0f), f13 + AndroidUtilities.dp(22.0f), 1.0f, -1, canvas2);
            }
            Path path3 = captionContainerView.replyLinePath;
            if (path3 == null) {
                captionContainerView.replyLinePath = new Path();
                float[] fArr = new float[8];
                captionContainerView.replyLinePathRadii = fArr;
                float fDp3 = AndroidUtilities.dp(5.0f);
                fArr[c2] = fDp3;
                fArr[0] = fDp3;
                float[] fArr2 = captionContainerView.replyLinePathRadii;
                fArr2[c] = f3;
                fArr2[2] = f3;
                fArr2[5] = f3;
                fArr2[4] = f3;
                float fDp4 = AndroidUtilities.dp(5.0f);
                fArr2[7] = fDp4;
                fArr2[6] = fDp4;
            } else {
                path3.rewind();
            }
            float f14 = rectF2.left;
            rectF2.set(f14, rectF2.top, AndroidUtilities.dp(3.0f) + f14, rectF2.bottom);
            captionContainerView.replyLinePath.addRoundRect(rectF2, captionContainerView.replyLinePathRadii, direction);
            if (captionContainerView.replyLinePaint == null) {
                Paint paint5 = new Paint();
                captionContainerView.replyLinePaint = paint5;
                paint5.setColor(i);
            }
            captionContainerView.replyLinePaint.setAlpha((int) (f4 * 255.0f));
            canvas2.drawPath(captionContainerView.replyLinePath, captionContainerView.replyLinePaint);
            if (paint != null) {
                canvas2.save();
                canvas2.drawRect(rectF, paint);
                canvas2.restore();
                canvas2.restore();
            }
            Text text2 = captionContainerView.replyText;
            if (text2 != null) {
                text2.ellipsizeWidth = (int) (rectF.width() - AndroidUtilities.dp(40.0f));
                text2.draw(rectF.left + AndroidUtilities.dp(20.0f), f13 + AndroidUtilities.dp(40.0f), 1.0f, -1, canvas2);
            }
        }
        super.dispatchDraw(canvas);
        if (f10 > f3) {
            int i4 = captionContainerView.collapsedFromX;
            if (i4 == Integer.MAX_VALUE) {
                fDp = rectF.right - AndroidUtilities.dp(20.0f);
            } else {
                fDp = i4 == Integer.MIN_VALUE ? rectF.left + AndroidUtilities.dp(20.0f) : i4;
            }
            float fDp5 = rectF.bottom - AndroidUtilities.dp(20.0f);
            float fMax = Math.max(Math.max(MathUtils.distance(rectF.left, rectF.top, fDp, fDp5), MathUtils.distance(rectF.left, rectF.bottom, fDp, fDp5)), Math.max(MathUtils.distance(rectF.right, rectF.top, fDp, fDp5), MathUtils.distance(rectF.right, rectF.bottom, fDp, fDp5))) * f10;
            if (captionContainerView.collapsePaint == null) {
                Paint paint6 = new Paint(1);
                captionContainerView.collapsePaint = paint6;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint6.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{i, i, 0}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                captionContainerView.collapseGradient = radialGradient;
                captionContainerView.collapsePaint.setShader(radialGradient);
                captionContainerView.collapseGradientMatrix = new Matrix();
                Paint paint7 = new Paint(1);
                captionContainerView.collapseOutPaint = paint7;
                paint7.setXfermode(new PorterDuffXfermode(mode));
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 32.0f, new int[]{0, 0, i}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
                captionContainerView.collapseOutGradient = radialGradient2;
                captionContainerView.collapseOutPaint.setShader(radialGradient2);
            }
            captionContainerView.collapseGradientMatrix.reset();
            captionContainerView.collapseGradientMatrix.postTranslate(fDp, fDp5);
            captionContainerView.collapseGradientMatrix.preScale(Math.max(1.0f, fMax) / 16.0f, Math.max(1.0f, fMax) / 16.0f);
            captionContainerView.collapseGradient.setLocalMatrix(captionContainerView.collapseGradientMatrix);
            canvas2.save();
            canvas2.drawRoundRect(rectF, f, f, captionContainerView.collapsePaint);
            canvas2.restore();
            canvas2.restore();
            canvas2.saveLayerAlpha(rectF, 255, 31);
            captionContainerView.drawOver(canvas2, rectF);
            captionContainerView.collapseGradientMatrix.reset();
            captionContainerView.collapseGradientMatrix.postTranslate(fDp, fDp5);
            captionContainerView.collapseGradientMatrix.preScale(Math.max(1.0f, fMax) / 16.0f, Math.max(1.0f, fMax) / 16.0f);
            captionContainerView.collapseOutGradient.setLocalMatrix(captionContainerView.collapseGradientMatrix);
            canvas2.save();
            canvas2.drawRoundRect(rectF, f, f, captionContainerView.collapseOutPaint);
            canvas2.restore();
            canvas2.restore();
            if (!(captionContainerView instanceof StoryRecorder.AnonymousClass8)) {
                captionContainerView.drawOver2(canvas2, rectF, f10);
            }
        }
        canvas2.restore();
        if (captionContainerView.factoryForMentions == null) {
            Path path4 = captionContainerView.clipPath;
            path4.rewind();
            path4.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas2.save();
            canvas2.clipPath(path4);
            StrokeDrawable strokeDrawable = captionContainerView.strokeDrawable;
            strokeDrawable.radius = f;
            strokeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            strokeDrawable.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ignoreTouches || ((motionEvent.getAction() == 0 && ignoreTouches(motionEvent.getX(), motionEvent.getY())) || !(this.clickBounds.contains(motionEvent.getX(), motionEvent.getY()) || this.keyboardShown))) {
            return false;
        }
        int action = motionEvent.getAction();
        ButtonBounce buttonBounce = this.bounce;
        if (action != 0 || this.keyboardShown) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                buttonBounce.setPressed(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        if ((this instanceof CaptionStory) && ((CaptionStory) this).recording) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i = 0;
        while (true) {
            int childCount = getChildCount();
            AnonymousClass3 anonymousClass3 = this.editText;
            if (i >= childCount) {
                KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
                keyboardNotifier.ignoring = false;
                keyboardNotifier.update();
                anonymousClass3.getEditText().setForceCursorEnd(true);
                anonymousClass3.getEditText().requestFocus();
                EditTextEmoji.AnonymousClass2 anonymousClass2 = anonymousClass3.editText;
                anonymousClass2.requestFocus();
                AndroidUtilities.showKeyboard(anonymousClass2);
                anonymousClass3.getEditText().setScrollY(0);
                buttonBounce.setPressed(true);
                return true;
            }
            View childAt = getChildAt(i);
            if (childAt != null && childAt.isClickable() && childAt.getVisibility() == 0 && childAt.getAlpha() >= 0.5f && anonymousClass3 != childAt) {
                RectF rectF = this.rectF;
                rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getWidth(), childAt.getY() + childAt.getHeight());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            i++;
        }
    }

    public abstract void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2);

    public void drawBlurBitmap(Bitmap bitmap) {
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float fMax;
        RectF rectF = this.bounds;
        AnonymousClass3 anonymousClass3 = this.editText;
        if (view != anonymousClass3) {
            if (!clipChild(view)) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(rectF);
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        if (this instanceof PhotoViewer.AnonymousClass31) {
            fMax = 0.0f;
        } else {
            fMax = (1.0f - this.keyboardT) * Math.max(0, (anonymousClass3.getHeight() - AndroidUtilities.dp(82.0f)) - anonymousClass3.getScrollY());
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        canvas.save();
        canvas.clipRect(rectF);
        canvas.translate(0.0f, fMax);
        boolean zDrawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        canvas.save();
        Matrix matrix = this.matrix;
        matrix.reset();
        matrix.postTranslate(0.0f, rectF.top - 1.0f);
        LinearGradient linearGradient = this.fadeGradient;
        linearGradient.setLocalMatrix(matrix);
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float fDp = AndroidUtilities.dp(10.0f) + f2;
        Paint paint = this.fadePaint;
        canvas.drawRect(f, f2, f3, fDp, paint);
        matrix.reset();
        matrix.postRotate(180.0f);
        matrix.postTranslate(0.0f, rectF.bottom);
        linearGradient.setLocalMatrix(matrix);
        canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, paint);
        canvas.restore();
        canvas.restore();
        return zDrawChild2;
    }

    public void drawOver(Canvas canvas, RectF rectF) {
    }

    public void drawOver2(Canvas canvas, RectF rectF, float f) {
    }

    public RectF getBounds() {
        return this.bounds;
    }

    public int getCaptionDefaultLimit() {
        return 0;
    }

    public int getCaptionLimit() {
        return UserConfig.getInstance(this.currentAccount).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    public int getCaptionPremiumLimit() {
        return 0;
    }

    public int getCodePointCount() {
        return this.codePointCount;
    }

    public int getEditTextHeight() {
        return (int) this.heightAnimated.value;
    }

    public int getEditTextHeightClosedKeyboard() {
        return Math.min(AndroidUtilities.dp(82.0f), this.editText.getHeight());
    }

    public int getEditTextLeft() {
        return 0;
    }

    public int getEditTextStyle() {
        return 2;
    }

    public float getOver2Alpha() {
        return this.collapsedT.value;
    }

    public int getSelectionLength() {
        AnonymousClass3 anonymousClass3 = this.editText;
        if (anonymousClass3 != null && anonymousClass3.getEditText() != null) {
            try {
                return anonymousClass3.getEditText().getSelectionEnd() - anonymousClass3.getEditText().getSelectionStart();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public abstract boolean ignoreTouches(float f, float f2);

    public final void invalidateBlur() {
        invalidate();
        AnonymousClass3 anonymousClass3 = this.editText;
        anonymousClass3.getEditText().invalidate();
        anonymousClass3.getEmojiButton().invalidate();
        ChatAttachAlert.AnonymousClass36 anonymousClass36 = this.mentionContainer;
        if (anonymousClass36 != null) {
            anonymousClass36.invalidate();
        }
        if (anonymousClass3.getEmojiView() == null || !customBlur()) {
            return;
        }
        anonymousClass3.getEmojiView().invalidate();
    }

    public void invalidateDrawOver2() {
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (customBlur()) {
            Bitmap bitmap = this.hintTextBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.hintTextBitmap = null;
            }
            TextPaint textPaint = this.hintTextPaint;
            textPaint.setColor(-16777216);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            String string = LocaleController.getString(R.string.AddCaption);
            this.hintTextBitmap = Bitmap.createBitmap((int) Math.ceil(textPaint.measureText(string)), (int) Math.ceil(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent), Bitmap.Config.ARGB_8888);
            new Canvas(this.hintTextBitmap).drawText(string, 0.0f, -((int) textPaint.getFontMetrics().ascent), textPaint);
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass3 anonymousClass3 = this.editText;
        boolean z = anonymousClass3.emojiExpanded;
        KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
        if (z && anonymousClass3.getEmojiView() != null) {
            if (keyboardNotifier.keyboardVisible()) {
                anonymousClass3.getEmojiView().hideSearchKeyboard();
                return true;
            }
            EditTextEmoji.AnonymousClass6 anonymousClass6 = anonymousClass3.emojiView;
            if (anonymousClass6 != null) {
                anonymousClass6.hideSearchKeyboard();
                anonymousClass3.emojiView.closeSearch(-1L, false);
            }
            return true;
        }
        if (anonymousClass3.emojiViewVisible) {
            anonymousClass3.hidePopup(true);
            return true;
        }
        if ((!anonymousClass3.keyboardVisible && !keyboardNotifier.keyboardVisible()) || keyboardNotifier.ignoring) {
            return false;
        }
        AndroidUtilities.hideKeyboard(anonymousClass3.editText);
        anonymousClass3.hidePopup(true);
        return true;
    }

    public void onCaptionLimitUpdate(boolean z) {
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmapShader = null;
        this.blurPaint = null;
        Bitmap bitmap2 = this.hintTextBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.hintTextBitmap = null;
        }
    }

    public void onEditHeightChange(int i) {
    }

    public void onLineCountChanged(int i, int i2) {
    }

    public void onTextChange() {
    }

    public abstract void onUpdateShowKeyboard(float f);

    public void setAccount(int i) {
        this.currentAccount = i;
    }

    public void setBlurredBackgroundDrawableForMentions(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.factoryForMentions = blurredBackgroundDrawableViewFactory;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        ChatAttachAlert.AnonymousClass36 anonymousClass36 = this.mentionContainer;
        if (anonymousClass36 != null) {
            anonymousClass36.setDialogId(j);
        }
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.onHeightUpdate = callback;
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.onKeyboardOpen = callback;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.bounce.setPressed(z && !this.keyboardShown);
    }

    public final void setReply(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null && charSequence == null) {
            this.hasReply = false;
            invalidate();
            return;
        }
        this.hasReply = true;
        CharSequence charSequence2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            charSequence2 = "";
        }
        this.replyTitle = new Text(charSequence2, 14.0f, AndroidUtilities.bold());
        if (charSequence == null) {
            charSequence = "";
        }
        this.replyText = new Text(charSequence, 14.0f, null);
    }

    public void setText(CharSequence charSequence) {
        this.ignoreTextChange = true;
        this.editText.setText(charSequence);
    }

    public void setUiBlurBitmap(Utilities.CallbackVoidReturn<Bitmap> callbackVoidReturn) {
        this.getUiBlurBitmap = callbackVoidReturn;
    }

    public void setupMentionContainer() {
        this.mentionContainer.getAdapter().allowStickers = false;
        this.mentionContainer.getAdapter().allowBots = false;
        this.mentionContainer.getAdapter().allowChats = false;
        this.mentionContainer.getAdapter().searchInDialogs = this instanceof CaptionStory;
    }

    public void updateKeyboard(int i) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.notifyHeightChanged();
        }
        AnonymousClass3 anonymousClass3 = this.editText;
        if (anonymousClass3.emojiViewVisible) {
            i = Math.max(0, anonymousClass3.getEmojiPadding() + additionalKeyboardHeight());
        } else if (anonymousClass3.waitingForKeyboardOpen) {
            i = Math.max(0, anonymousClass3.getKeyboardHeight() + additionalKeyboardHeight());
        }
        int iMax = Math.max(0, i - (sizeNotifierFrameLayout == null ? 0 : sizeNotifierFrameLayout.getBottomPadding()));
        View view = (View) getParent();
        view.clearAnimation();
        if (!(this instanceof PhotoViewer.AnonymousClass31)) {
            ObjectAnimator objectAnimator = this.parentKeyboardAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.parentKeyboardAnimator.cancel();
                this.parentKeyboardAnimator = null;
            }
            this.parentKeyboardAnimator = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.TRANSLATION_Y, view.getTranslationY(), -iMax);
            if (iMax > AndroidUtilities.dp(20.0f)) {
                this.parentKeyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.parentKeyboardAnimator.setDuration(250L);
            } else {
                this.parentKeyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.parentKeyboardAnimator.setDuration(640L);
            }
            this.parentKeyboardAnimator.start();
        }
        this.toKeyboardShow = iMax > AndroidUtilities.dp(20.0f);
        CaptionContainerView$$ExternalSyntheticLambda0 captionContainerView$$ExternalSyntheticLambda0 = this.updateShowKeyboard;
        AndroidUtilities.cancelRunOnUIThread(captionContainerView$$ExternalSyntheticLambda0);
        AndroidUtilities.runOnUIThread(captionContainerView$$ExternalSyntheticLambda0);
        if (iMax < AndroidUtilities.dp(20.0f)) {
            anonymousClass3.getEditText().clearFocus();
            anonymousClass3.hidePopup(true);
        }
    }

    public void updateMentionsLayoutPosition() {
        if (this.mentionContainer != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.heightAnimated.value;
            if (this.mentionContainer.getY() != translationY) {
                this.mentionContainer.setTranslationY(translationY);
                this.mentionContainer.invalidate();
            }
        }
    }
}
