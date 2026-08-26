package org.telegram.ui.Cells;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.ChangeUsernameActivity;
import org.telegram.ui.ChannelCreateActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda77;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LiteModeSettingsActivity;

public final class CheckBoxCell extends FrameLayout {
    public final AnonymousClass1 animatedTextView;
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public final View checkBox;
    public final CheckBox2 checkBoxRound;
    public final int checkBoxSize;
    public final CheckBoxSquare checkBoxSquare;
    public View click1Container;
    public View click2Container;
    public final CollapseButton collapseButton;
    public View collapsedArrow;
    public final int currentType;
    public boolean isMultiline;
    public int itemId;
    public final AnonymousClass2 linksTextView;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;
    public final boolean textAnimated;
    public final View textView;
    public final TextView valueTextView;

    public final class AnonymousClass1 extends AnimatedTextView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(FrameLayout frameLayout, Context context, int i) {
            super(context, false, false, false);
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public void invalidate() {
            switch (this.$r8$classId) {
                case 1:
                    super.invalidate();
                    PollVotesAlert.Adapter.AnonymousClass1 anonymousClass1 = (PollVotesAlert.Adapter.AnonymousClass1) this.this$0;
                    if (anonymousClass1 == PollVotesAlert.this.listView.getPinnedHeader()) {
                        PollVotesAlert.this.listView.invalidate();
                    }
                    break;
                default:
                    super.invalidate();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    ((CheckBoxCell) this.this$0).updateCollapseArrowTranslation();
                    break;
                case 1:
                default:
                    super.onDraw(canvas);
                    break;
                case 2:
                    ShapeDrawable shapeDrawable = (ShapeDrawable) this.this$0;
                    shapeDrawable.setBounds(0, 0, (int) (getDrawable().getCurrentWidth() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                    shapeDrawable.draw(canvas);
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 3:
                    int size = View.MeasureSpec.getSize(i);
                    if (size <= 0) {
                        size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                    }
                    LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider = (LiteModeSettingsActivity.PowerSaverSlider) this.this$0;
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - powerSaverSlider.leftTextView.getPaint().measureText(powerSaverSlider.leftTextView.getText().toString())) - powerSaverSlider.rightTextView.getPaint().measureText(powerSaverSlider.rightTextView.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean post(Runnable runnable) {
            switch (this.$r8$classId) {
                case 1:
                    return ((BottomSheet) PollVotesAlert.this).containerView.post(runnable);
                default:
                    return super.post(runnable);
            }
        }

        @Override
        public boolean postDelayed(Runnable runnable, long j) {
            switch (this.$r8$classId) {
                case 1:
                    return ((BottomSheet) PollVotesAlert.this).containerView.postDelayed(runnable, j);
                default:
                    return super.postDelayed(runnable, j);
            }
        }

        public AnonymousClass1(Context context) {
            super(context, true, false, false);
            this.$r8$classId = 2;
            this.this$0 = Theme.createRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.multAlpha(0.15f, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false)));
        }

        public AnonymousClass1(LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider, Context context) {
            super(context, false, true, true);
            this.$r8$classId = 3;
            this.this$0 = powerSaverSlider;
        }
    }

    public final class AnonymousClass2 extends LinkSpanDrawable.LinksTextView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, Context context, int i) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public int emojiCacheType() {
            switch (this.$r8$classId) {
                case 4:
                    return ((UndoView) this.this$0).infoTextViewEmojiCacheType;
                default:
                    return super.emojiCacheType();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    ((CheckBoxCell) this.this$0).updateCollapseArrowTranslation();
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) this.this$0;
                    textInfoPrivacyCell.onTextDraw();
                    super.onDraw(canvas);
                    textInfoPrivacyCell.afterTextDraw();
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public int overrideColor() {
            switch (this.$r8$classId) {
                case 1:
                    Integer num = ((TextInfoPrivacyCell) this.this$0).linkTextRippleColor;
                    return num != null ? num.intValue() : Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
                default:
                    return super.overrideColor();
            }
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            switch (this.$r8$classId) {
                case 0:
                    super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                    break;
                case 1:
                default:
                    super.setText(charSequence, bufferType);
                    break;
                case 2:
                    if (charSequence != 0) {
                        charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                        int iIndexOf = charSequence.toString().indexOf(10);
                        if (iIndexOf >= 0) {
                            charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                            charSequence.setSpan(new ForegroundColorSpan(ChangeUsernameActivity.this.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf, 33);
                        }
                        TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                        for (int i = 0; i < typefaceSpanArr.length; i++) {
                            charSequence.setSpan(new ChatActivity.AnonymousClass102(this, 1), charSequence.getSpanStart(typefaceSpanArr[i]), charSequence.getSpanEnd(typefaceSpanArr[i]), 33);
                            charSequence.removeSpan(typefaceSpanArr[i]);
                        }
                    }
                    super.setText(charSequence, bufferType);
                    break;
                case 3:
                    if (charSequence != 0) {
                        charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                        int iIndexOf2 = charSequence.toString().indexOf(10);
                        ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.this$0;
                        if (iIndexOf2 >= 0) {
                            charSequence.replace(iIndexOf2, iIndexOf2 + 1, " ");
                            charSequence.setSpan(new ForegroundColorSpan(channelCreateActivity.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf2, 33);
                        }
                        TypefaceSpan[] typefaceSpanArr2 = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                        EditTextBoldCursor editTextBoldCursor = channelCreateActivity.descriptionTextView;
                        String string = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : channelCreateActivity.descriptionTextView.getText().toString();
                        for (int i2 = 0; i2 < typefaceSpanArr2.length; i2++) {
                            charSequence.setSpan(new AboutLinkCell.AnonymousClass5(4, (Object) this, string), charSequence.getSpanStart(typefaceSpanArr2[i2]), charSequence.getSpanEnd(typefaceSpanArr2[i2]), 33);
                            charSequence.removeSpan(typefaceSpanArr2[i2]);
                        }
                    }
                    super.setText(charSequence, bufferType);
                    break;
            }
        }

        public AnonymousClass2(TextInfoPrivacyCell textInfoPrivacyCell, Context context, LinkSpanDrawable.LinkCollector linkCollector, Theme.ResourcesProvider resourcesProvider) {
            super(context, linkCollector, resourcesProvider);
            this.$r8$classId = 1;
            this.this$0 = textInfoPrivacyCell;
        }

        public AnonymousClass2(UndoView undoView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.$r8$classId = 4;
            this.this$0 = undoView;
        }
    }

    public final class CollapseButton extends LinearLayout {
        public final View collapsedArrow;
        public final ImageView iconView;
        public final AnimatedTextView textView;

        public CollapseButton(CheckBoxCell checkBoxCell, Context context, int i) {
            super(context);
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, checkBoxCell.resourcesProvider);
            if (i != 0) {
                ImageView imageView = new ImageView(context);
                this.iconView = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(i);
            }
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, false);
            this.textView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setTextColor(color);
            animatedTextView.setIncludeFontPadding(false);
            animatedTextView.setTypeface(AndroidUtilities.bold());
            View view = new View(context);
            this.collapsedArrow = view;
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            view.setBackground(drawableMutate);
            if (LocaleController.isRTL) {
                addView(view, LayoutHelper.createLinear(16, 16, 16, 11, 0, 3, 0));
                addView(animatedTextView, LayoutHelper.createLinear(-2, 16, 16, 0, 0, this.iconView == null ? 11 : 3, 0));
                View view2 = this.iconView;
                if (view2 != null) {
                    addView(view2, LayoutHelper.createLinear(16, 16, 16, 0, 0, 11, 0));
                }
            } else {
                View view3 = this.iconView;
                if (view3 != null) {
                    addView(view3, LayoutHelper.createLinear(16, 16, 16, 11, 0, 3, 0));
                }
                addView(animatedTextView, LayoutHelper.createLinear(-2, 16, 16, this.iconView == null ? 11 : 0, 0, 3, 0));
                addView(view, LayoutHelper.createLinear(16, 16, 16, 0, 0, 11, 0));
            }
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, checkBoxCell.resourcesProvider), 16, 16));
            setClickable(true);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        }
    }

    public CheckBoxCell(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        this(activity, 1, 17, false, resourcesProvider);
    }

    public AnimatedTextView getAnimatedTextView() {
        return this.animatedTextView;
    }

    public CheckBox2 getCheckBoxRound() {
        return this.checkBoxRound;
    }

    public View getCheckBoxView() {
        return this.checkBox;
    }

    public TextView getTextView() {
        return this.linksTextView;
    }

    public TextView getValueTextView() {
        return this.valueTextView;
    }

    public final boolean isCheckboxRound() {
        int i = this.currentType;
        return i == 4 || i == 8 || i == 6 || i == 7;
    }

    public final boolean isChecked() {
        CheckBox2 checkBox2 = this.checkBoxRound;
        return checkBox2 != null ? checkBox2.checkBoxBase.isChecked : this.checkBoxSquare.isChecked;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            int iDp = AndroidUtilities.dp(isCheckboxRound() ? 60.0f : 20.0f) + ((int) Math.abs(this.textView.getTranslationX()));
            if (this.currentType == 7) {
                iDp += AndroidUtilities.dp(39.0f);
            }
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            float f = LocaleController.isRTL ? 0.0f : iDp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                iDp = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        AnonymousClass1 anonymousClass1 = this.animatedTextView;
        if (anonymousClass1 != null) {
            accessibilityNodeInfo.setText(anonymousClass1.getText());
        } else {
            AnonymousClass2 anonymousClass2 = this.linksTextView;
            if (anonymousClass2 != null) {
                accessibilityNodeInfo.setText(anonymousClass2.getText());
            }
        }
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        TextView textView = this.valueTextView;
        View view = this.checkBox;
        int i3 = this.checkBoxSize;
        View view2 = this.textView;
        int i4 = this.currentType;
        if (i4 == 3) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            view2.measure(OKLCH.m(size, 34.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), Integer.MIN_VALUE));
            float f = i3;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f), 1073741824));
            setMeasuredDimension(AndroidUtilities.dp(29.0f) + view2.getMeasuredWidth(), AndroidUtilities.dp(50.0f));
        } else if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
            int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(isCheckboxRound() ? 60.0f : 34.0f);
            if (this.textAnimated) {
                measuredWidth += (int) this.animatedTextView.getRightPadding();
            }
            if (i4 == 7) {
                measuredWidth -= AndroidUtilities.dp(34.0f);
            }
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                measuredWidth -= ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin;
            }
            int i5 = measuredWidth / 2;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            int measuredWidth2 = textView.getMeasuredWidth();
            CollapseButton collapseButton = this.collapseButton;
            if (collapseButton != null) {
                collapseButton.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                measuredWidth2 = zzlb.m(collapseButton.getMeasuredWidth(), 11.0f, measuredWidth2);
            }
            if (view2.getLayoutParams().width == -1) {
                view2.measure(OKLCH.m((measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 8.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            } else {
                view2.measure(OKLCH.m((measuredWidth - ((int) Math.abs(view2.getTranslationX()))) - measuredWidth2, 8.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            }
            BackupImageView backupImageView = this.avatarImageView;
            if (backupImageView != null) {
                backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), 1073741824));
            }
            float f2 = i3;
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824));
        }
        View view3 = this.click1Container;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            this.click1Container.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view4 = this.click2Container;
        if (view4 != null) {
            view4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
        View view5 = this.collapsedArrow;
        if (view5 != null) {
            view5.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        }
    }

    public final void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            checkBox2.checkBoxBase.setChecked(-1, z, z2);
        } else {
            this.checkBoxSquare.setChecked(z, z2);
        }
    }

    public void setCollapsed(Boolean bool) {
        if (bool == null) {
            View view = this.collapsedArrow;
            if (view != null) {
                removeView(view);
                this.collapsedArrow = null;
                return;
            }
            return;
        }
        if (this.collapsedArrow == null) {
            this.collapsedArrow = new View(getContext());
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.collapsedArrow.setBackground(drawableMutate);
            addView(this.collapsedArrow, LayoutHelper.createFrame(16, 16, 16));
        }
        updateCollapseArrowTranslation();
        this.collapsedArrow.animate().cancel();
        this.collapsedArrow.animate().rotation(bool.booleanValue() ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.textView.setAlpha(z ? 1.0f : 0.5f);
        this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
        this.checkBox.setAlpha(z ? 1.0f : 0.5f);
    }

    public void setIcon(int i) {
        this.checkBoxRound.setIcon(i);
    }

    public void setMultiline(boolean z) {
        if (this.textAnimated) {
            return;
        }
        this.isMultiline = z;
        View view = this.textView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        View view2 = this.checkBox;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        boolean z2 = this.isMultiline;
        AnonymousClass2 anonymousClass2 = this.linksTextView;
        if (z2) {
            anonymousClass2.setLines(0);
            anonymousClass2.setMaxLines(0);
            anonymousClass2.setSingleLine(false);
            anonymousClass2.setEllipsize(null);
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 16;
            layoutParams2.topMargin = 0;
        } else {
            anonymousClass2.setLines(1);
            anonymousClass2.setMaxLines(1);
            anonymousClass2.setSingleLine(true);
            anonymousClass2.setEllipsize(TextUtils.TruncateAt.END);
            view.setPadding(0, 0, 0, 0);
            layoutParams.height = -1;
            layoutParams.topMargin = 0;
            layoutParams2.gravity = (layoutParams2.gravity & 7) | 48;
            layoutParams2.topMargin = AndroidUtilities.dp(15.0f);
        }
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public final void setOnSectionsClickListener(CallLogActivity$$ExternalSyntheticLambda38 callLogActivity$$ExternalSyntheticLambda38, ChatActivity$$ExternalSyntheticLambda77 chatActivity$$ExternalSyntheticLambda77) {
        if (callLogActivity$$ExternalSyntheticLambda38 == null) {
            View view = this.click1Container;
            if (view != null) {
                removeView(view);
                this.click1Container = null;
            }
        } else {
            if (this.click1Container == null) {
                View view2 = new View(getContext());
                this.click1Container = view2;
                view2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 2, -1));
                addView(this.click1Container, LayoutHelper.createFrame(-1, -1, 119));
            }
            this.click1Container.setOnClickListener(callLogActivity$$ExternalSyntheticLambda38);
        }
        if (chatActivity$$ExternalSyntheticLambda77 == null) {
            View view3 = this.click2Container;
            if (view3 != null) {
                removeView(view3);
                this.click2Container = null;
                return;
            }
            return;
        }
        if (this.click2Container == null) {
            View view4 = new View(getContext());
            this.click2Container = view4;
            addView(view4, LayoutHelper.createFrame(56, -1, LocaleController.isRTL ? 5 : 3));
        }
        this.click2Container.setOnClickListener(chatActivity$$ExternalSyntheticLambda77);
    }

    public void setPad(int i) {
        int iDp = AndroidUtilities.dp(i * 40 * (LocaleController.isRTL ? -1 : 1));
        View view = this.checkBox;
        if (view != null) {
            view.setTranslationX(iDp);
        }
        float f = iDp;
        this.textView.setTranslationX(f);
        BackupImageView backupImageView = this.avatarImageView;
        if (backupImageView != null) {
            backupImageView.setTranslationX(f);
        }
        View view2 = this.click1Container;
        if (view2 != null) {
            view2.setTranslationX(f);
        }
        View view3 = this.click2Container;
        if (view3 != null) {
            view3.setTranslationX(f);
        }
    }

    public final void setText(CharSequence charSequence, String str, boolean z, boolean z2, boolean z3) {
        if (this.textAnimated) {
            AnonymousClass1 anonymousClass1 = this.animatedTextView;
            anonymousClass1.setText(Emoji.replaceEmoji(charSequence, anonymousClass1.getPaint().getFontMetricsInt(), false), z3, true);
        } else {
            this.linksTextView.setText(charSequence);
        }
        CheckBox2 checkBox2 = this.checkBoxRound;
        if (checkBox2 != null) {
            checkBox2.checkBoxBase.setChecked(-1, z, z3);
        } else {
            this.checkBoxSquare.setChecked(z, z3);
        }
        this.valueTextView.setText(str);
        this.needDivider = z2;
        setWillNotDraw(!z2);
    }

    public void setTextColor(int i) {
        if (this.textAnimated) {
            this.animatedTextView.setTextColor(i);
        } else {
            this.linksTextView.setTextColor(i);
        }
    }

    public void setUserOrChat(TLObject tLObject) {
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        avatarDrawable.setInfo(tLObject);
        BackupImageView backupImageView = this.avatarImageView;
        backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        backupImageView.onNewImageSet();
        boolean z = tLObject instanceof TLRPC.User;
        String userName = z ? UserObject.getUserName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        if (z && ((TLRPC.User) tLObject).id == MessagesController.getInstance(UserConfig.selectedAccount).telegramAntispamUserId) {
            userName = LocaleController.getString(R.string.ChannelAntiSpamUser);
        }
        if (!this.textAnimated) {
            this.linksTextView.setText(userName);
        } else {
            AnonymousClass1 anonymousClass1 = this.animatedTextView;
            anonymousClass1.setText(Emoji.replaceEmoji(userName, anonymousClass1.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void updateCollapseArrowTranslation() {
        float measuredWidth;
        View view = this.textView;
        if (this.collapsedArrow == null) {
            return;
        }
        try {
            measuredWidth = view.getMeasuredWidth();
        } catch (Exception unused) {
            measuredWidth = 0.0f;
        }
        this.collapsedArrow.setTranslationX(LocaleController.isRTL ? (view.getRight() - measuredWidth) - AndroidUtilities.dp(20.0f) : view.getLeft() + measuredWidth + AndroidUtilities.dp(4.0f));
    }

    public final void updateTextColor() {
        boolean z = this.textAnimated;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i = this.currentType;
        if (z) {
            this.animatedTextView.setTextColor(Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        } else {
            int color = Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
            AnonymousClass2 anonymousClass2 = this.linksTextView;
            anonymousClass2.setTextColor(color);
            anonymousClass2.setLinkTextColor(Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextLink : Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
        }
        this.valueTextView.setTextColor(Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextBlue : Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
    }

    public CheckBoxCell(Context context, int i) {
        this(context, i, 17, false, null);
    }

    public CheckBoxCell(Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.currentType = i;
        this.textAnimated = z;
        boolean z2 = true;
        if (z) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, 0);
            this.animatedTextView = anonymousClass1;
            NotificationCenter.listenEmojiLoading(anonymousClass1);
            anonymousClass1.setEllipsizeByGradient(true);
            anonymousClass1.setRightPadding(AndroidUtilities.dp(8.0f));
            anonymousClass1.getDrawable().setHacks(true, false);
            anonymousClass1.setTag(Integer.valueOf(Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)));
            anonymousClass1.setTextSize(AndroidUtilities.dp(16.0f));
            if (i == 7) {
                anonymousClass1.setTypeface(AndroidUtilities.bold());
            }
            if (i == 3) {
                anonymousClass1.setGravity(19);
                addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                anonymousClass1.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                anonymousClass1.setRightPadding(AndroidUtilities.dp(i2));
                anonymousClass1.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z3 = LocaleController.isRTL;
                    addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, (z3 ? 5 : 3) | 16, z3 ? 8 : 29, 0.0f, z3 ? 29 : 8, 0.0f));
                } else {
                    int i3 = isCheckboxRound() ? 56 : 46;
                    i3 = i == 7 ? i3 + 39 : i3;
                    boolean z4 = LocaleController.isRTL;
                    addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? i2 : (i2 - 17) + i3, 0.0f, z4 ? (i2 - 17) + i3 : i2, 0.0f));
                }
            }
            this.textView = anonymousClass1;
        } else {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, 0);
            this.linksTextView = anonymousClass2;
            NotificationCenter.listenEmojiLoading(anonymousClass2);
            anonymousClass2.setTag(Integer.valueOf(Theme.getColor((i == 1 || i == 5) ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)));
            anonymousClass2.setTextSize(1, 16.0f);
            anonymousClass2.setLines(1);
            anonymousClass2.setMaxLines(1);
            anonymousClass2.setSingleLine(true);
            anonymousClass2.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 7) {
                anonymousClass2.setTypeface(AndroidUtilities.bold());
            }
            if (i == 3) {
                anonymousClass2.setGravity(19);
                addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 19, 29.0f, 0.0f, 0.0f, 0.0f));
                anonymousClass2.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
            } else {
                anonymousClass2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                if (i == 2) {
                    boolean z5 = LocaleController.isRTL;
                    addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, (z5 ? 5 : 3) | 16, z5 ? 8 : 29, 0.0f, z5 ? 29 : 8, 0.0f));
                } else {
                    int i4 = isCheckboxRound() ? 56 : 46;
                    i4 = i == 7 ? i4 + 39 : i4;
                    int i5 = isCheckboxRound() ? -2 : -1;
                    boolean z6 = LocaleController.isRTL;
                    addView(anonymousClass2, LayoutHelper.createFrame(i5, -2.0f, (z6 ? 5 : 3) | 16, z6 ? i2 : (i2 - 17) + i4, 0.0f, z6 ? (i2 - 17) + i4 : i2, 0.0f));
                }
            }
            this.textView = anonymousClass2;
        }
        TextView textView = new TextView(context);
        this.valueTextView = textView;
        textView.setTag(Integer.valueOf((i == 1 || i == 5) ? Theme.key_dialogTextBlue : Theme.key_windowBackgroundWhiteValueText));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        float f = i2;
        addView(textView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        if (isCheckboxRound()) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBoxRound = checkBox2;
            this.checkBox = checkBox2;
            checkBox2.setDrawUnchecked(true);
            checkBox2.checkBoxBase.setChecked(-1, true, false);
            checkBox2.setDrawBackgroundAsArc(10);
            this.checkBoxSize = 21;
            float f2 = 21;
            boolean z7 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(21, f2, (z7 ? 5 : 3) | 48, z7 ? 0 : i2, 16.0f, z7 ? i2 : 0, 0.0f));
        } else {
            if (i != 1 && i != 5) {
                z2 = false;
            }
            CheckBoxSquare checkBoxSquare = new CheckBoxSquare(context, resourcesProvider, z2);
            this.checkBoxSquare = checkBoxSquare;
            this.checkBox = checkBoxSquare;
            this.checkBoxSize = 18;
            if (i == 5) {
                float f3 = 18;
                boolean z8 = LocaleController.isRTL;
                addView(checkBoxSquare, LayoutHelper.createFrame(18, f3, (z8 ? 5 : 3) | 16, z8 ? 0 : i2, 0.0f, z8 ? i2 : 0, 0.0f));
            } else if (i == 3) {
                addView(checkBoxSquare, LayoutHelper.createFrame(18, 18, 51, 0.0f, 15.0f, 0.0f, 0.0f));
            } else if (i == 2) {
                addView(checkBoxSquare, LayoutHelper.createFrame(18, 18, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 15.0f, 0.0f, 0.0f));
            } else {
                float f4 = 18;
                boolean z9 = LocaleController.isRTL;
                addView(checkBoxSquare, LayoutHelper.createFrame(18, f4, (z9 ? 5 : 3) | 48, z9 ? 0 : i2, 16.0f, z9 ? i2 : 0, 0.0f));
            }
        }
        if (i == 6) {
            CollapseButton collapseButton = new CollapseButton(this, context, R.drawable.msg_folders_groups);
            this.collapseButton = collapseButton;
            addView(collapseButton, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 8) {
            CollapseButton collapseButton2 = new CollapseButton(this, context, 0);
            this.collapseButton = collapseButton2;
            addView(collapseButton2, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388629, f, 0.0f, i2 - 11, 0.0f));
        } else if (i == 7) {
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(17.0f));
            addView(backupImageView, LayoutHelper.createFrameRelatively(34.0f, 34.0f, 8388627, 56.0f, 0.0f, 0.0f, 0.0f));
        }
        updateTextColor();
    }
}
