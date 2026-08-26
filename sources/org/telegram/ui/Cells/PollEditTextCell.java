package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.TextUtils;
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
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.poll.PollAttachButton;
import org.telegram.ui.Gifts.AuctionBidSheet;

public class PollEditTextCell extends FrameLayout implements SuggestEmojiView.AnchorViewDelegate, FactorAnimator.Target {
    public boolean alwaysShowText2;
    public final BoolAnimator animatorCheckboxMultiselect;
    public final BoolAnimator animatorEmojiButtonVisible;
    public PollAttachButton attachView;
    public final CheckBox2 checkBox;
    public AnimatorSet checkBoxAnimation;
    public final ImageView deleteImageView;
    public final ChatActivityEnterViewAnimatedIconView emojiButton;
    public final ImageView moveImageView;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public Integer right;
    public boolean showNextButton;
    public final AuctionBidSheet.AnonymousClass4 textView;
    public SimpleTextView textView2;

    public PollEditTextCell(Context context, int i, View.OnClickListener onClickListener, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCheckboxMultiselect = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorEmojiButtonVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.resourcesProvider = resourcesProvider;
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = new AuctionBidSheet.AnonymousClass4(this, context, resourcesProvider, 1);
        this.textView = anonymousClass4;
        anonymousClass4.setAllowTextEntitiesIntersection(true);
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass4.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        anonymousClass4.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        anonymousClass4.setTextSize(1, 16.0f);
        anonymousClass4.setMaxLines(Integer.MAX_VALUE);
        anonymousClass4.setBackground(null);
        anonymousClass4.setImeOptions(anonymousClass4.getImeOptions() | 268435456);
        anonymousClass4.setInputType(anonymousClass4.getInputType() | 16384);
        anonymousClass4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        if (onClickListener != null) {
            int i2 = i == 1 ? 92 : 58;
            boolean z = LocaleController.isRTL;
            addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? i2 : 54.0f, 0.0f, !z ? i2 : 54.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.moveImageView = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_poll_order_24);
            int i3 = Theme.key_windowBackgroundWhiteGrayIcon;
            int color = Theme.getColor(i3, resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.deleteImageView = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider), 1, -1));
            imageView2.setImageResource(R.drawable.poll_remove);
            imageView2.setOnClickListener(onClickListener);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), mode));
            imageView2.setContentDescription(LocaleController.getString(R.string.Delete));
            boolean z2 = LocaleController.isRTL;
            addView(imageView2, LayoutHelper.createFrame(48, 50.0f, (z2 ? 3 : 5) | 48, z2 ? 3.0f : 0.0f, 0.0f, z2 ? 0.0f : 3.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView2 = simpleTextView;
            simpleTextView.setTextSize(13);
            this.textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
            View view = this.textView2;
            boolean z3 = LocaleController.isRTL;
            addView(view, LayoutHelper.createFrame(48, 24.0f, (z3 ? 3 : 5) | 48, z3 ? 20.0f : 0.0f, 43.0f, z3 ? 0.0f : 20.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            int i4 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(-1, i3, i4);
            checkBox2.setContentDescription(LocaleController.getString(R.string.AccDescrQuizCorrectAnswer));
            checkBox2.setDrawUnchecked(true);
            checkBoxBase.setChecked(-1, true, false);
            checkBox2.setAlpha(0.0f);
            checkBox2.setDrawBackgroundAsArc(8);
            addView(checkBox2, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 6.0f, 2.0f, 6.0f, 0.0f));
            final int i5 = 0;
            checkBox2.setOnClickListener(new View.OnClickListener(this) {
                public final PollEditTextCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i5) {
                        case 0:
                            PollEditTextCell pollEditTextCell = this.f$0;
                            CheckBox2 checkBox3 = pollEditTextCell.checkBox;
                            if (checkBox3.getTag() != null) {
                                pollEditTextCell.onCheckBoxClick(pollEditTextCell, !checkBox3.checkBoxBase.isChecked);
                                break;
                            }
                            break;
                        default:
                            PollEditTextCell pollEditTextCell2 = this.f$0;
                            pollEditTextCell2.onEmojiButtonClicked(pollEditTextCell2);
                            break;
                    }
                }
            });
        } else {
            int i6 = i == 1 ? 70 : 19;
            boolean z4 = LocaleController.isRTL;
            addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i6 : 19.0f, 0.0f, z4 ? 19.0f : i6, 0.0f));
        }
        if (i == 1) {
            ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = new ChatActivityEnterViewAnimatedIconView(context, 32);
            this.emojiButton = chatActivityEnterViewAnimatedIconView;
            chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
            chatActivityEnterViewAnimatedIconView.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, false);
            int iDp = AndroidUtilities.dp(9.5f);
            chatActivityEnterViewAnimatedIconView.setPadding(iDp, iDp, iDp, iDp);
            chatActivityEnterViewAnimatedIconView.setVisibility(8);
            int i7 = this.deleteImageView == null ? 3 : 38;
            boolean z5 = LocaleController.isRTL;
            addView(chatActivityEnterViewAnimatedIconView, LayoutHelper.createFrame(48, 48.0f, z5 ? 3 : 5, z5 ? i7 : 0.0f, 0.0f, z5 ? 0.0f : i7, 0.0f));
            chatActivityEnterViewAnimatedIconView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, resourcesProvider), 1, -1));
            final int i8 = 1;
            chatActivityEnterViewAnimatedIconView.setOnClickListener(new View.OnClickListener(this) {
                public final PollEditTextCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i8) {
                        case 0:
                            PollEditTextCell pollEditTextCell = this.f$0;
                            CheckBox2 checkBox3 = pollEditTextCell.checkBox;
                            if (checkBox3.getTag() != null) {
                                pollEditTextCell.onCheckBoxClick(pollEditTextCell, !checkBox3.checkBoxBase.isChecked);
                                break;
                            }
                            break;
                        default:
                            PollEditTextCell pollEditTextCell2 = this.f$0;
                            pollEditTextCell2.onEmojiButtonClicked(pollEditTextCell2);
                            break;
                    }
                }
            });
            chatActivityEnterViewAnimatedIconView.setContentDescription(LocaleController.getString(R.string.Emoji));
        }
    }

    public final PollAttachButton addAttachView() {
        ImageView imageView = this.deleteImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        PollAttachButton pollAttachButton = new PollAttachButton(getContext(), 38);
        this.attachView = pollAttachButton;
        pollAttachButton.setFocusable(false);
        this.attachView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector, this.resourcesProvider), 1, -1));
        ScaleStateListAnimator.apply(this.attachView, 0.1f, 1.5f);
        PollAttachButton pollAttachButton2 = this.attachView;
        boolean z = LocaleController.isRTL;
        addView(pollAttachButton2, LayoutHelper.createFrame(48, 50.0f, (z ? 3 : 5) | 48, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            boolean z2 = LocaleController.isRTL;
            chatActivityEnterViewAnimatedIconView.setLayoutParams(LayoutHelper.createFrame(48, 48.0f, (z2 ? 3 : 5) | 48, z2 ? 44 : 0.0f, 1.0f, z2 ? 0.0f : 44, 0.0f));
        }
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
        if (anonymousClass4 != null) {
            float f = (LocaleController.isRTL ? ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).rightMargin : ((ViewGroup.MarginLayoutParams) anonymousClass4.getLayoutParams()).leftMargin) / AndroidUtilities.density;
            int i = (chatActivityEnterViewAnimatedIconView != null ? 70 : 19) + 24;
            boolean z3 = LocaleController.isRTL;
            int i2 = (z3 ? 5 : 3) | 16;
            float f2 = z3 ? i : f;
            if (!z3) {
                f = i;
            }
            anonymousClass4.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i2, f2, 0.0f, f, 0.0f));
        }
        return this.attachView;
    }

    @Override
    public final void addTextChangedListener(ArticleViewer.AnonymousClass16 anonymousClass16) {
        this.textView.addTextChangedListener(anonymousClass16);
    }

    public final void createErrorTextView() {
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
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
        if (anonymousClass4.length() > 0) {
            return anonymousClass4.getText();
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            setShowCheckBox(shouldShowCheckBox(), false);
            checkBox2.checkBoxBase.setChecked(-1, isChecked(this), false);
        }
    }

    public void onCheckBoxClick(PollEditTextCell pollEditTextCell, boolean z) {
        this.checkBox.checkBoxBase.setChecked(-1, z, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (this.needDivider && drawDivider()) {
            boolean z = LocaleController.isRTL;
            ImageView imageView = this.moveImageView;
            if (z) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(imageView != null ? 58.0f : 20.0f);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void onEditTextFocusChanged(boolean z) {
    }

    public void onEmojiButtonClicked(PollEditTextCell pollEditTextCell) {
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView;
        if (i == 0) {
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                CheckBoxBase checkBoxBase = checkBox2.getCheckBoxBase();
                float f3 = this.animatorCheckboxMultiselect.floatValue;
                if (checkBoxBase.customRadiusFactor != f3) {
                    checkBoxBase.customRadiusFactor = f3;
                    checkBoxBase.invalidate();
                }
                checkBox2.invalidate();
                return;
            }
            return;
        }
        if (i != 1 || (chatActivityEnterViewAnimatedIconView = this.emojiButton) == null) {
            return;
        }
        float f4 = this.animatorEmojiButtonVisible.floatValue;
        float f5 = 0.85f * f4;
        chatActivityEnterViewAnimatedIconView.setScaleX(f5);
        chatActivityEnterViewAnimatedIconView.setScaleY(f5);
        chatActivityEnterViewAnimatedIconView.setAlpha(f4);
        chatActivityEnterViewAnimatedIconView.setVisibility(f4 > 0.0f ? 0 : 8);
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView != null && this.deleteImageView == null && simpleTextView.getVisibility() == 0) {
            if (this.attachView != null) {
                this.textView2.setTranslationY(AndroidUtilities.dp(36.0f));
            } else {
                this.textView2.setTranslationY(AndroidUtilities.dp(26.0f) * f4);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView;
        ImageView imageView;
        AuctionBidSheet.AnonymousClass4 anonymousClass4;
        int iIntValue;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            chatActivityEnterViewAnimatedIconView = this.emojiButton;
            imageView = this.deleteImageView;
            anonymousClass4 = this.textView;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt != anonymousClass4) {
                if (childAt == imageView) {
                    imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                } else if (childAt == chatActivityEnterViewAnimatedIconView) {
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
            i3++;
        }
        Integer num = this.right;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (this.textView2 == null) {
            iIntValue = 42;
        } else if (imageView == null) {
            iIntValue = 70;
        } else {
            iIntValue = chatActivityEnterViewAnimatedIconView != null ? 144 : 122;
        }
        anonymousClass4.measure(OKLCH.m((size - getPaddingLeft()) - getPaddingRight(), iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = anonymousClass4.getMeasuredHeight();
        setMeasuredDimension(size, Math.max(AndroidUtilities.dp(50.0f), anonymousClass4.getMeasuredHeight()) + (this.needDivider ? 1 : 0));
        SimpleTextView simpleTextView2 = this.textView2;
        if (simpleTextView2 == null || this.alwaysShowText2) {
            return;
        }
        simpleTextView2.setAlpha(measuredHeight >= AndroidUtilities.dp(52.0f) ? 1.0f : 0.0f);
    }

    public boolean onPastedMultipleLines(ArrayList arrayList) {
        return false;
    }

    public void setEmojiButtonVisibility(boolean z) {
        this.animatorEmojiButtonVisible.setValue(z, true);
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setIconsColor(int i) {
        ImageView imageView = this.moveImageView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.deleteImageView;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }
        ChatActivityEnterViewAnimatedIconView chatActivityEnterViewAnimatedIconView = this.emojiButton;
        if (chatActivityEnterViewAnimatedIconView != null) {
            chatActivityEnterViewAnimatedIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setShowCheckBox(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (z == (checkBox2.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.checkBoxAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.checkBoxAnimation = null;
        }
        checkBox2.setTag(z ? 1 : null);
        ImageView imageView = this.moveImageView;
        if (!z2) {
            checkBox2.setAlpha(z ? 1.0f : 0.0f);
            imageView.setAlpha(z ? 0.0f : 1.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.checkBoxAnimation = animatorSet2;
        float[] fArr = {z ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(checkBox2, (Property<CheckBox2, Float>) property, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, z ? 0.0f : 1.0f));
        this.checkBoxAnimation.setDuration(180L);
        this.checkBoxAnimation.start();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
    }

    public void setText2(String str) {
        SimpleTextView simpleTextView = this.textView2;
        if (simpleTextView == null) {
            return;
        }
        simpleTextView.setText(str, false);
    }

    public final void setTextAndHint(CharSequence charSequence, String str, boolean z) {
        ImageView imageView = this.deleteImageView;
        if (imageView != null) {
            imageView.setTag(null);
        }
        AuctionBidSheet.AnonymousClass4 anonymousClass4 = this.textView;
        anonymousClass4.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            anonymousClass4.setSelection(anonymousClass4.length());
        }
        anonymousClass4.setHint(str);
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

    public void onFieldTouchUp(AuctionBidSheet.AnonymousClass4 anonymousClass4) {
    }

    public void onActionModeStart(AuctionBidSheet.AnonymousClass4 anonymousClass4, ActionMode actionMode) {
    }
}
