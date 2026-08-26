package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.ChatPullingDownDrawable;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class CheckBox extends View {
    public static Paint backgroundPaint;
    public static Paint eraser;
    public static Paint eraser2;
    public static Paint paint;
    public boolean attachedToWindow;
    public Canvas bitmapCanvas;
    public ObjectAnimator checkAnimator;
    public Bitmap checkBitmap;
    public Canvas checkCanvas;
    public final Drawable checkDrawable;
    public int checkOffset;
    public String checkedText;
    public int color;
    public boolean drawBackground;
    public Bitmap drawBitmap;
    public boolean hasBorder;
    public boolean isCheckAnimation;
    public boolean isChecked;
    public float progress;
    public int size;
    public final TextPaint textPaint;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 3:
                    ChatRightsEditActivity chatRightsEditActivity = (ChatRightsEditActivity) this.this$0;
                    CrossfadeDrawable crossfadeDrawable = chatRightsEditActivity.doneDrawable;
                    crossfadeDrawable.progress = chatRightsEditActivity.loading ? 1.0f : 0.0f;
                    crossfadeDrawable.invalidateSelf();
                    chatRightsEditActivity.doneDrawable.invalidateSelf();
                    break;
                case 18:
                    ChatAttachAlertPhotoLayout.this.cameraInitAnimation = null;
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    CheckBox checkBox = (CheckBox) this.this$0;
                    if (animator.equals(checkBox.checkAnimator)) {
                        checkBox.checkAnimator = null;
                    }
                    if (!checkBox.isChecked) {
                        checkBox.checkedText = null;
                    }
                    break;
                case 1:
                    ChatActivity.ChatActivityAdapter.AnonymousClass6 anonymousClass6 = (ChatActivity.ChatActivityAdapter.AnonymousClass6) this.this$0;
                    ChatActivity.this.animateSendingViews.remove(anonymousClass6.val$messageCell);
                    View view = ChatActivity.this.fragmentView;
                    if (view != null) {
                        view.invalidate();
                        ChatActivity.this.chatListView.invalidate();
                    }
                    anonymousClass6.val$messageCell.setAlpha(1.0f);
                    anonymousClass6.val$messageCell.getTransitionParams().ignoreAlpha = false;
                    break;
                case 2:
                    ChatPullingDownDrawable chatPullingDownDrawable = (ChatPullingDownDrawable) this.this$0;
                    chatPullingDownDrawable.bounceProgress = 0.0f;
                    chatPullingDownDrawable.swipeToReleaseProgress = 1.0f;
                    ChatActivity.AnonymousClass21 anonymousClass21 = chatPullingDownDrawable.parentView;
                    if (anonymousClass21 != null) {
                        anonymousClass21.invalidate();
                    }
                    chatPullingDownDrawable.fragmentView.invalidate();
                    ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174 = chatPullingDownDrawable.onAnimationFinishRunnable;
                    if (chatActivity$$ExternalSyntheticLambda174 != null) {
                        chatActivity$$ExternalSyntheticLambda174.run();
                        chatPullingDownDrawable.onAnimationFinishRunnable = null;
                    }
                    break;
                case 3:
                default:
                    super.onAnimationEnd(animator);
                    break;
                case 4:
                    ChatUsersActivity.AnonymousClass12 anonymousClass12 = (ChatUsersActivity.AnonymousClass12) this.this$0;
                    anonymousClass12.val$finalProgressView.setAlpha(1.0f);
                    RecyclerView.LayoutManager.stopIgnoringView(anonymousClass12.val$finalProgressView);
                    ((ChatUsersActivity) anonymousClass12.this$0).listView.removeView(anonymousClass12.val$finalProgressView);
                    break;
                case 5:
                    AnimatedNumberLayout animatedNumberLayout = (AnimatedNumberLayout) this.this$0;
                    animatedNumberLayout.animator = null;
                    animatedNumberLayout.oldLetters.clear();
                    break;
                case 6:
                    AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.this$0;
                    animatedPhoneNumberEditText.animator = null;
                    animatedPhoneNumberEditText.oldLetters.clear();
                    break;
                case 7:
                    super.onAnimationEnd(animator);
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.this$0;
                    animatedTextDrawable.clearOldParts();
                    animatedTextDrawable.oldText = null;
                    animatedTextDrawable.oldWidth = 0.0f;
                    animatedTextDrawable.t = 0.0f;
                    animatedTextDrawable.invalidateSelf();
                    Runnable runnable = animatedTextDrawable.widthUpdatedListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                    animatedTextDrawable.animator = null;
                    CharSequence charSequence = animatedTextDrawable.toSetText;
                    if (charSequence == null) {
                        Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = animatedTextDrawable.onAnimationFinishListener;
                        if (bulletin$2$$ExternalSyntheticLambda1 != null) {
                            bulletin$2$$ExternalSyntheticLambda1.run();
                        }
                    } else {
                        animatedTextDrawable.setText(charSequence, true, animatedTextDrawable.toSetTextMoveDown);
                        animatedTextDrawable.toSetText = null;
                        animatedTextDrawable.toSetTextMoveDown = false;
                    }
                    break;
                case 8:
                    BackupImageView backupImageView = (BackupImageView) this.this$0;
                    backupImageView.setVisibility(8);
                    backupImageView.setImageDrawable(null);
                    backupImageView.setAlpha(1.0f);
                    break;
                case 9:
                    AvatarConstructorFragment avatarConstructorFragment = AvatarConstructorFragment.this;
                    avatarConstructorFragment.colorPickerInAnimatoin = false;
                    avatarConstructorFragment.colorPickerPreviewView.setVisibility(8);
                    break;
                case 10:
                    AvatarsDrawable avatarsDrawable = (AvatarsDrawable) this.this$0;
                    if (avatarsDrawable.transitionProgressAnimator != null) {
                        avatarsDrawable.transitionProgress = 1.0f;
                        avatarsDrawable.swapStates();
                        if (avatarsDrawable.updateAfterTransition) {
                            avatarsDrawable.updateAfterTransition = false;
                            Runnable runnable2 = avatarsDrawable.updateDelegate;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                        View view2 = avatarsDrawable.parent;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                    }
                    avatarsDrawable.transitionProgressAnimator = null;
                    break;
                case 11:
                    ChatActivityEnterView.this.captionLimitView.setVisibility(8);
                    break;
                case 12:
                    ((ChatAttachAlert.AnonymousClass24) this.this$0).countBounceScale = 1.0f;
                    break;
                case 13:
                    ChatAttachAlert.this.captionLimitView.setVisibility(8);
                    break;
                case 14:
                    ChatAttachAlert.this.topCaptionLimitView.setVisibility(8);
                    break;
                case 15:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    chatAttachAlert.menuAnimator = null;
                    if (!chatAttachAlert.menuShowed) {
                        if (chatAttachAlert.actionBar.getTag() == null && chatAttachAlert.avatarPicker == 0 && !chatAttachAlert.storyMediaPicker) {
                            chatAttachAlert.selectedMenuItem.setVisibility(4);
                        }
                        chatAttachAlert.headerView.setVisibility(4);
                    } else {
                        ActionBarMenuItem actionBarMenuItem = chatAttachAlert.searchItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setVisibility(4);
                        }
                    }
                    break;
                case 16:
                    super.onAnimationEnd(animator);
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.this$0;
                    chatAttachAlertDocumentLayout.backgroundListView.setVisibility(8);
                    chatAttachAlertDocumentLayout.currentAnimationType = 0;
                    chatAttachAlertDocumentLayout.listView.setAlpha(1.0f);
                    chatAttachAlertDocumentLayout.listView.setScaleX(1.0f);
                    chatAttachAlertDocumentLayout.listView.setScaleY(1.0f);
                    chatAttachAlertDocumentLayout.listView.setTranslationX(0.0f);
                    chatAttachAlertDocumentLayout.listView.invalidate();
                    break;
                case 17:
                    ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) this.this$0;
                    if (ChatAttachAlertDocumentLayout.this.filtersView.getTag() == null) {
                        ChatAttachAlertDocumentLayout.this.filtersView.setVisibility(4);
                    }
                    ChatAttachAlertDocumentLayout.this.filtersViewAnimator = null;
                    break;
                case 18:
                    ChatAttachAlertPhotoLayout.AnonymousClass19 anonymousClass19 = (ChatAttachAlertPhotoLayout.AnonymousClass19) this.this$0;
                    if (animator.equals(ChatAttachAlertPhotoLayout.this.cameraInitAnimation)) {
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                        chatAttachAlertPhotoLayout.canSaveCameraPreview = true;
                        chatAttachAlertPhotoLayout.cameraInitAnimation = null;
                    }
                    break;
                case 19:
                    ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) this.this$0;
                    ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = previewGroupsView.this$0;
                    chatAttachAlertPhotoLayoutPreview.draggingCell = null;
                    chatAttachAlertPhotoLayoutPreview.draggingCellHiding = false;
                    previewGroupsView.invalidate();
                    break;
                case 20:
                    ChatThemeBottomSheet chatThemeBottomSheet = (ChatThemeBottomSheet) this.this$0;
                    StoryRecorder.AnonymousClass31 anonymousClass31 = chatThemeBottomSheet.changeDayNightView;
                    if (anonymousClass31 != null) {
                        if (anonymousClass31.getParent() != null) {
                            ((ViewGroup) chatThemeBottomSheet.changeDayNightView.getParent()).removeView(chatThemeBottomSheet.changeDayNightView);
                        }
                        chatThemeBottomSheet.changeDayNightView = null;
                    }
                    chatThemeBottomSheet.changeDayNightViewAnimator = null;
                    super.onAnimationEnd(animator);
                    break;
                case 21:
                    CheckBoxBase checkBoxBase = (CheckBoxBase) this.this$0;
                    if (animator.equals(checkBoxBase.checkAnimator)) {
                        checkBoxBase.checkAnimator = null;
                    }
                    if (!checkBoxBase.isChecked) {
                        checkBoxBase.checkedText = null;
                    }
                    break;
                case 22:
                    ColorPicker colorPicker = (ColorPicker) this.this$0;
                    if (colorPicker.colorsCount == colorPicker.maxColorsCount) {
                        colorPicker.addButton.setVisibility(4);
                    }
                    colorPicker.colorsAnimator = null;
                    break;
                case 23:
                    CounterView.CounterDrawable counterDrawable = (CounterView.CounterDrawable) this.this$0;
                    counterDrawable.countChangeProgress = 1.0f;
                    counterDrawable.countOldLayout = null;
                    counterDrawable.countAnimationStableLayout = null;
                    counterDrawable.countAnimationInLayout = null;
                    View view3 = counterDrawable.parent;
                    if (view3 != null) {
                        if (counterDrawable.currentCount == 0 && counterDrawable.updateVisibility) {
                            view3.setVisibility(8);
                        }
                        counterDrawable.parent.invalidate();
                    }
                    counterDrawable.animationType = -1;
                    break;
                case 24:
                    ((CropAreaView) this.this$0).gridAnimator = null;
                    break;
                case 25:
                    EditTextEmoji editTextEmoji = (EditTextEmoji) this.this$0;
                    editTextEmoji.isAnimatePopupClosing = false;
                    editTextEmoji.emojiView.setTranslationY(0.0f);
                    editTextEmoji.emojiView.setAlpha(0.0f);
                    editTextEmoji.bottomPanelTranslationY(0.0f);
                    editTextEmoji.emojiViewAlpha = 0.0f;
                    editTextEmoji.hideEmojiView();
                    break;
                case 26:
                    EmbedBottomSheet.this.animationInProgress = false;
                    break;
                case 27:
                    super.onAnimationEnd(animator);
                    ((EmojiPacksAlert.EmojiImageView) this.this$0).backAnimator = null;
                    break;
                case 28:
                    ((EmojiView) this.this$0).emojiTabShadowAnimator = null;
                    break;
                case 29:
                    super.onAnimationEnd(animator);
                    ((EmojiView.ImageViewEmoji) this.this$0).backAnimator = null;
                    break;
            }
        }
    }

    public CheckBox(Context context, int i) {
        super(context);
        this.isCheckAnimation = true;
        this.size = 22;
        if (paint == null) {
            paint = new Paint(1);
            Paint paint2 = new Paint(1);
            eraser = paint2;
            paint2.setColor(0);
            Paint paint3 = eraser;
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            Paint paint4 = new Paint(1);
            eraser2 = paint4;
            paint4.setColor(0);
            Paint paint5 = eraser2;
            Paint.Style style = Paint.Style.STROKE;
            paint5.setStyle(style);
            eraser2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint6 = new Paint(1);
            backgroundPaint = paint6;
            paint6.setColor(-1);
            backgroundPaint.setStyle(style);
        }
        eraser2.setStrokeWidth(AndroidUtilities.dp(28.0f));
        backgroundPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.checkDrawable = context.getResources().getDrawable(i).mutate();
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        String str;
        float f;
        if (getVisibility() != 0 || this.drawBitmap == null || this.checkBitmap == null) {
            return;
        }
        if (this.drawBackground || this.progress != 0.0f) {
            eraser2.setStrokeWidth(AndroidUtilities.dp(this.size + 6));
            this.drawBitmap.eraseColor(0);
            float measuredWidth = getMeasuredWidth() / 2;
            float f2 = this.progress;
            float f3 = f2 >= 0.5f ? 1.0f : f2 / 0.5f;
            float f4 = f2 < 0.5f ? 0.0f : (f2 - 0.5f) / 0.5f;
            if (!this.isCheckAnimation) {
                f2 = 1.0f - f2;
            }
            if (f2 >= 0.2f) {
                if (f2 < 0.4f) {
                    fDp = AndroidUtilities.dp(2.0f) - (((f2 - 0.2f) * AndroidUtilities.dp(2.0f)) / 0.2f);
                }
                if (this.drawBackground) {
                    paint.setColor(1140850688);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), paint);
                    canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), backgroundPaint);
                }
                paint.setColor(this.color);
                if (this.hasBorder) {
                    measuredWidth -= AndroidUtilities.dp(2.0f);
                }
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, paint);
                this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f3) * measuredWidth, eraser);
                canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
                this.checkBitmap.eraseColor(0);
                str = this.checkedText;
                if (str != null) {
                    TextPaint textPaint = this.textPaint;
                    int iCeil = (int) Math.ceil(textPaint.measureText(str));
                    Canvas canvas2 = this.checkCanvas;
                    String str2 = this.checkedText;
                    float measuredWidth2 = (getMeasuredWidth() - iCeil) / 2;
                    if (this.size == 40) {
                        f = 28.0f;
                    } else {
                        f = 21.0f;
                    }
                    canvas2.drawText(str2, measuredWidth2, AndroidUtilities.dp(f), textPaint);
                } else {
                    Drawable drawable = this.checkDrawable;
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    int measuredWidth3 = (getMeasuredWidth() - intrinsicWidth) / 2;
                    int measuredHeight = (getMeasuredHeight() - intrinsicHeight) / 2;
                    int i = this.checkOffset;
                    drawable.setBounds(measuredWidth3, measuredHeight + i, intrinsicWidth + measuredWidth3, measuredHeight + intrinsicHeight + i);
                    drawable.draw(this.checkCanvas);
                }
                this.checkCanvas.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f4) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), eraser2);
                canvas.drawBitmap(this.checkBitmap, 0.0f, 0.0f, (Paint) null);
            }
            fDp = (AndroidUtilities.dp(2.0f) * f2) / 0.2f;
            measuredWidth -= fDp;
            if (this.drawBackground) {
                paint.setColor(1140850688);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), paint);
                canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth - AndroidUtilities.dp(1.0f), backgroundPaint);
            }
            paint.setColor(this.color);
            if (this.hasBorder) {
                measuredWidth -= AndroidUtilities.dp(2.0f);
            }
            this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, paint);
            this.bitmapCanvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, (1.0f - f3) * measuredWidth, eraser);
            canvas.drawBitmap(this.drawBitmap, 0.0f, 0.0f, (Paint) null);
            this.checkBitmap.eraseColor(0);
            str = this.checkedText;
            if (str != null) {
                TextPaint textPaint2 = this.textPaint;
                int iCeil2 = (int) Math.ceil(textPaint2.measureText(str));
                Canvas canvas3 = this.checkCanvas;
                String str3 = this.checkedText;
                float measuredWidth4 = (getMeasuredWidth() - iCeil2) / 2;
                if (this.size == 40) {
                    f = 28.0f;
                } else {
                    f = 21.0f;
                }
                canvas3.drawText(str3, measuredWidth4, AndroidUtilities.dp(f), textPaint2);
            } else {
                Drawable drawable2 = this.checkDrawable;
                int intrinsicWidth2 = drawable2.getIntrinsicWidth();
                int intrinsicHeight2 = drawable2.getIntrinsicHeight();
                int measuredWidth5 = (getMeasuredWidth() - intrinsicWidth2) / 2;
                int measuredHeight2 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                int i2 = this.checkOffset;
                drawable2.setBounds(measuredWidth5, measuredHeight2 + i2, intrinsicWidth2 + measuredWidth5, measuredHeight2 + intrinsicHeight2 + i2);
                drawable2.draw(this.checkCanvas);
            }
            this.checkCanvas.drawCircle((getMeasuredWidth() / 2) - AndroidUtilities.dp(2.5f), AndroidUtilities.dp(4.0f) + (getMeasuredHeight() / 2), (1.0f - f4) * ((AndroidUtilities.dp(6.0f) + getMeasuredWidth()) / 2), eraser2);
            canvas.drawBitmap(this.checkBitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.isChecked);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.color = i;
        invalidate();
    }

    public void setCheckColor(int i) {
        this.checkDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        this.textPaint.setColor(i);
        invalidate();
    }

    public void setCheckOffset(int i) {
        this.checkOffset = i;
    }

    public final void setChecked(boolean z) {
        setChecked(z, false);
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setHasBorder(boolean z) {
        this.hasBorder = z;
    }

    public void setNum(int i) {
        if (i >= 0) {
            this.checkedText = "" + (i + 1);
        } else if (this.checkAnimator == null) {
            this.checkedText = null;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    public void setSize(int i) {
        this.size = i;
        if (i == 40) {
            this.textPaint.setTextSize(AndroidUtilities.dp(24.0f));
        }
    }

    public void setStrokeWidth(int i) {
        backgroundPaint.setStrokeWidth(i);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.drawBitmap == null) {
            try {
                int iDp = AndroidUtilities.dp(this.size);
                int iDp2 = AndroidUtilities.dp(this.size);
                Bitmap.Config config = Bitmap.Config.ARGB_4444;
                this.drawBitmap = Bitmap.createBitmap(iDp, iDp2, config);
                this.bitmapCanvas = new Canvas(this.drawBitmap);
                this.checkBitmap = Bitmap.createBitmap(AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size), config);
                this.checkCanvas = new Canvas(this.checkBitmap);
            } catch (Throwable unused) {
            }
        }
    }

    public final void setChecked(boolean z, boolean z2) {
        int i = 0;
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (!this.attachedToWindow || !z2) {
            ObjectAnimator objectAnimator = this.checkAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.checkAnimator = null;
            }
            setProgress(z ? 1.0f : 0.0f);
            return;
        }
        this.isCheckAnimation = z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnonymousClass1(this, i));
        this.checkAnimator.setDuration(300L);
        this.checkAnimator.start();
    }
}
