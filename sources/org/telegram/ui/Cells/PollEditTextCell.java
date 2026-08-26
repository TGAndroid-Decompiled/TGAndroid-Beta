package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.poll.PollAttachButton;
import org.telegram.ui.Gifts.AuctionBidSheet;

public class PollEditTextCell extends FrameLayout implements SuggestEmojiView.AnchorViewDelegate, FactorAnimator.Target {
    private static final int ANIMATOR_ID_CHECKBOX_MULTISELECT = 0;
    private static final int ANIMATOR_ID_EMOJI_BUTTON_VISIBLE = 1;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_EMOJI = 1;
    private boolean alwaysShowText2;
    private final BoolAnimator animatorCheckboxMultiselect;
    private final BoolAnimator animatorEmojiButtonVisible;
    public PollAttachButton attachView;
    private CheckBox2 checkBox;
    private AnimatorSet checkBoxAnimation;
    public ImageView deleteImageView;
    private ChatActivityEnterViewAnimatedIconView emojiButton;
    public ImageView moveImageView;
    private boolean needDivider;
    private final Theme.ResourcesProvider resourcesProvider;
    private Integer right;
    private boolean showNextButton;
    public EditTextBoldCursor textView;
    private SimpleTextView textView2;

    public PollEditTextCell(Context context, int i, View.OnClickListener onClickListener, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCheckboxMultiselect = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorEmojiButtonVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.resourcesProvider = resourcesProvider;
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = new AuctionBidSheet.AnonymousClass4(this, context, resourcesProvider, 1);
        this.textView = anonymousClass4;
        anonymousClass4.setAllowTextEntitiesIntersection(true);
        this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.textView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        this.textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setMaxLines(Integer.MAX_VALUE);
        this.textView.setBackground(null);
        EditTextBoldCursor editTextBoldCursor = this.textView;
        editTextBoldCursor.setImeOptions(editTextBoldCursor.getImeOptions() | 268435456);
        EditTextBoldCursor editTextBoldCursor2 = this.textView;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        this.textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i2 = i == 1 ? 92 : 58;
            EditTextBoldCursor editTextBoldCursor3 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(editTextBoldCursor3, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? i2 : 54.0f, 0.0f, !z ? i2 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.moveImageView = imageView;
            imageView.setFocusable(false);
            ImageView imageView2 = this.moveImageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            this.moveImageView.setImageResource(R.drawable.menu_poll_order_24);
            ImageView imageView3 = this.moveImageView;
            int i3 = Theme.key_windowBackgroundWhiteGrayIcon;
            int color = Theme.getColor(i3, resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView3.setColorFilter(new PorterDuffColorFilter(color, mode));
            addView(this.moveImageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView4 = new ImageView(context);
            this.deleteImageView = imageView4;
            imageView4.setFocusable(false);
            this.deleteImageView.setScaleType(scaleType);
            this.deleteImageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider), 1, -1));
            this.deleteImageView.setImageResource(R.drawable.poll_remove);
            this.deleteImageView.setOnClickListener(onClickListener);
            this.deleteImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), mode));
            this.deleteImageView.setContentDescription(LocaleController.getString(R.string.Delete));
            ImageView imageView5 = this.deleteImageView;
            boolean z2 = LocaleController.isRTL;
            addView(imageView5, LayoutHelper.createFrame(48, 50.0f, (z2 ? 3 : 5) | 48, z2 ? 3.0f : 0.0f, 0.0f, z2 ? 0.0f : 3.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView2 = simpleTextView;
            simpleTextView.setTextSize(13);
            this.textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            SimpleTextView simpleTextView2 = this.textView2;
            boolean z3 = LocaleController.isRTL;
            addView(simpleTextView2, LayoutHelper.createFrame(48, 24.0f, (z3 ? 3 : 5) | 48, z3 ? 20.0f : 0.0f, 43.0f, z3 ? 0.0f : 20.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, i3, Theme.key_checkboxCheck);
            this.checkBox.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            this.checkBox.setDrawUnchecked(true);
            this.checkBox.setChecked(true, false);
            this.checkBox.setAlpha(0.0f);
            this.checkBox.setDrawBackgroundAsArc(8);
            addView(this.checkBox, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i4 = 0;
            this.checkBox.setOnClickListener(new View.OnClickListener(this) {
                public final PollEditTextCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$0$14(view);
                            break;
                        default:
                            this.f$0.lambda$new$1$10(view);
                            break;
                    }
                }
            });
        } else {
            int i5 = i == 1 ? 70 : 19;
            EditTextBoldCursor editTextBoldCursor4 = this.textView;
            boolean z4 = LocaleController.isRTL;
            addView(editTextBoldCursor4, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i5 : 19.0f, 0.0f, z4 ? 19.0f : i5, 0.0f));
        }
        if (i == 1) {
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context);
            this.emojiButton = chatActivityEnterViewAnimatedIconView;
            chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
            int iDp = AndroidUtilities.dp(9.5f);
            this.emojiButton.setPadding(iDp, iDp, iDp, iDp);
            this.emojiButton.setVisibility(8);
            int i6 = this.deleteImageView == null ? 3 : 38;
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView2 = this.emojiButton;
            boolean z5 = LocaleController.isRTL;
            addView(chatActivityEnterViewAnimatedIconView2, LayoutHelper.createFrame(48, 48.0f, z5 ? 3 : 5, z5 ? i6 : 0.0f, 0.0f, z5 ? 0.0f : i6, 0.0f));
            this.emojiButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider), 1, -1));
            final int i7 = 1;
            this.emojiButton.setOnClickListener(new View.OnClickListener(this) {
                public final PollEditTextCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$new$0$14(view);
                            break;
                        default:
                            this.f$0.lambda$new$1$10(view);
                            break;
                    }
                }
            });
            this.emojiButton.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    public View addAttachView() {
        ImageView imageView = this.deleteImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        PollAttachButton pollAttachButton = new PollAttachButton(getContext(), this.resourcesProvider, 38);
        this.attachView = pollAttachButton;
        pollAttachButton.setFocusable(false);
        this.attachView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, this.resourcesProvider), 1, -1));
        ScaleStateListAnimator.apply(this.attachView);
        PollAttachButton pollAttachButton2 = this.attachView;
        boolean z = LocaleController.isRTL;
        addView(pollAttachButton2, LayoutHelper.createFrame(48, 50.0f, (z ? 3 : 5) | 48, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            boolean z2 = LocaleController.isRTL;
            chatActivityEnterViewAnimatedIconView.setLayoutParams(LayoutHelper.createFrame(48, 48.0f, (z2 ? 3 : 5) | 48, z2 ? 44 : 0.0f, 1.0f, z2 ? 0.0f : 44, 0.0f));
        }
        EditTextBoldCursor editTextBoldCursor = this.textView;
        if (editTextBoldCursor != null) {
            float f = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i = (this.emojiButton != null ? 70 : 19) + 24;
            EditTextBoldCursor editTextBoldCursor2 = this.textView;
            boolean z3 = LocaleController.isRTL;
            int i2 = (z3 ? 5 : 3) | 16;
            float f2 = z3 ? i : f;
            if (!z3) {
                f = i;
            }
            editTextBoldCursor2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i2, f2, 0.0f, f, 0.0f));
        }
        return this.attachView;
    }

    @Override
    public void addTextChangedListener(TextWatcher textWatcher) {
        this.textView.addTextChangedListener(textWatcher);
    }

    public void addTextWatcher(TextWatcher textWatcher) {
        this.textView.addTextChangedListener(textWatcher);
    }

    public void callOnDelete() {
        ImageView imageView = this.deleteImageView;
        if (imageView == null) {
            return;
        }
        imageView.callOnClick();
    }

    public void createErrorTextView() {
        this.alwaysShowText2 = true;
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.textView2 = simpleTextView;
        simpleTextView.setTextSize(13);
        this.textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        SimpleTextView simpleTextView2 = this.textView2;
        boolean z = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(48, 24.0f, (z ? 3 : 5) | 48, z ? 20.0f : 0.0f, 17.0f, z ? 0.0f : 20.0f, 0.0f));
    }

    public boolean drawDivider() {
        return true;
    }

    public CheckBox2 getCheckBox() {
        return this.checkBox;
    }

    @Override
    public EditTextBoldCursor getEditField() {
        return this.textView;
    }

    @Override
    public Editable getEditText() {
        return this.textView.getText();
    }

    public ChatActivityEnterViewAnimatedIconView getEmojiButton() {
        return this.emojiButton;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.textView.length() > 0) {
            return this.textView.getText();
        }
        return null;
    }

    @Override
    public BaseFragment getParentFragment() {
        return null;
    }

    public String getText() {
        return this.textView.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.textView;
    }

    public SimpleTextView getTextView2() {
        return this.textView2;
    }

    public boolean isChecked(PollEditTextCell pollEditTextCell) {
        return false;
    }

    public final void lambda$new$0$14(View view) {
        if (this.checkBox.getTag() == null) {
            return;
        }
        onCheckBoxClick(this, !this.checkBox.isChecked());
    }

    public int length() {
        return this.textView.length();
    }

    public void onActionModeStart(EditTextBoldCursor editTextBoldCursor, ActionMode actionMode) {
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.checkBox != null) {
            setShowCheckBox(shouldShowCheckBox(), false);
            this.checkBox.setChecked(isChecked(this), false);
        }
    }

    public void onCheckBoxClick(PollEditTextCell pollEditTextCell, boolean z) {
        this.checkBox.setChecked(z, true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (this.needDivider && drawDivider()) {
            if (LocaleController.isRTL) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(this.moveImageView != null ? 58.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(this.moveImageView != null ? 58.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void onEditTextDraw(EditTextBoldCursor editTextBoldCursor, Canvas canvas) {
    }

    public void onEditTextFocusChanged(boolean z) {
    }

    public void lambda$new$1$10(PollEditTextCell pollEditTextCell) {
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView;
        if (i == 0) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                checkBox2.getCheckBoxBase().setCustomRadiusFactor(this.animatorCheckboxMultiselect.floatValue);
                this.checkBox.invalidate();
                return;
            }
            return;
        }
        if (i != 1 || (chatActivityEnterViewAnimatedIconView = this.emojiButton) == null) {
            return;
        }
        float f3 = this.animatorEmojiButtonVisible.floatValue;
        float f4 = 0.85f * f3;
        chatActivityEnterViewAnimatedIconView.setScaleX(f4);
        this.emojiButton.setScaleY(f4);
        this.emojiButton.setAlpha(f3);
        this.emojiButton.setVisibility(f3 > 0.0f ? 0 : 8);
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView != null && this.deleteImageView == null && simpleTextView.getVisibility() == 0) {
            if (this.attachView != null) {
                this.textView2.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.textView2.setTranslationY(AndroidUtilities.dp(26.0f) * f3);
            }
        }
    }

    public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
    }

    @Override
    public void onMeasure(int i, int i2) {
        int iIntValue;
        int size = View.MeasureSpec.getSize(i);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != this.textView) {
                ImageView imageView = this.deleteImageView;
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else {
                    ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
                    if (childAt == chatActivityEnterViewAnimatedIconView) {
                        chatActivityEnterViewAnimatedIconView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                    } else {
                        ImageView imageView2 = this.moveImageView;
                        if (childAt == imageView2) {
                            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                        } else {
                            SimpleTextView simpleTextView = this.textView2;
                            if (childAt == simpleTextView) {
                                simpleTextView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                            } else {
                                CheckBox2 checkBox2 = this.checkBox;
                                if (childAt == checkBox2) {
                                    checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                                } else {
                                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                    if (layoutParams != null) {
                                        childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                                    } else {
                                        childAt.measure(i, i2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Integer num = this.right;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (this.textView2 == null) {
            iIntValue = 42;
        } else if (this.deleteImageView == null) {
            iIntValue = 70;
        } else {
            iIntValue = this.emojiButton != null ? 144 : 122;
        }
        this.textView.measure(OKLCH.m(iIntValue, (size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.textView.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), this.textView.getMeasuredHeight()) + (this.needDivider ? 1 : 0));
        SimpleTextView simpleTextView2 = this.textView2;
        if (simpleTextView2 == null || this.alwaysShowText2) {
            return;
        }
        simpleTextView2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public boolean onPastedMultipleLines(ArrayList<CharSequence> arrayList) {
        return false;
    }

    public void setCheckboxMultiselect(boolean z, boolean z2) {
        this.animatorCheckboxMultiselect.setValue(z, z2);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.animatorEmojiButtonVisible.setValue(z, true);
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        setEnabled(z);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setIconsColor(int i) {
        ImageView imageView = this.moveImageView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.deleteImageView;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    public void setShowCheckBox(boolean z, boolean z2) {
        if (z == (this.checkBox.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.checkBoxAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.checkBoxAnimation = null;
        }
        this.checkBox.setTag(z ? 1 : null);
        if (!z2) {
            this.checkBox.setAlpha(z ? 1.0f : 0.0f);
            this.moveImageView.setAlpha(z ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.checkBoxAnimation = animatorSet2;
        CheckBox2 checkBox2 = this.checkBox;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(checkBox2, (Property<CheckBox2, Float>) property, fArr), ObjectAnimator.ofFloat(this.moveImageView, (Property<ImageView, Float>) property, z ? 0.0f : 1.0f));
        this.checkBoxAnimation.setDuration(180L);
        this.checkBoxAnimation.start();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
    }

    public void setText(CharSequence charSequence, boolean z) {
        this.textView.setText(charSequence);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setText2(String str) {
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView == null) {
            return;
        }
        simpleTextView.setText(str);
    }

    public void setTextAndHint(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.deleteImageView;
        if (imageView != null) {
            imageView.setTag(null);
        }
        this.textView.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            EditTextBoldCursor editTextBoldCursor = this.textView;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.textView.setHint(str);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextRight(int i) {
        this.right = Integer.valueOf(i);
    }

    public boolean shouldShowCheckBox() {
        return false;
    }

    public void supportMultiselect() {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.getCheckBoxBase().setCustomRadius(AndroidUtilities.dp(6.0f));
            this.checkBox.getCheckBoxBase().setCustomRadiusFactor(this.animatorCheckboxMultiselect.floatValue);
        }
    }
}
