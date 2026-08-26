package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public abstract class BaseCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final Paint dividerPaint;
    public final BackupImageView imageView;
    public boolean needDivider;
    public final RadioButton radioButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public final SimpleTextView subtitleTextView;
    public final UserCell2.AnonymousClass1 titleTextView;

    public BaseCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.avatarDrawable = avatarDrawable;
        this.dividerPaint = new Paint(1);
        this.resourcesProvider = resourcesProvider;
        View view = new View(context);
        addView(view, LayoutHelper.createLinear(-1, -1));
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        avatarDrawable.roundRadius = AndroidUtilities.dp(40.0f);
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(backupImageView);
        UserCell2.AnonymousClass1 anonymousClass1 = new UserCell2.AnonymousClass1(context, 4);
        this.titleTextView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        NotificationCenter.listenEmojiLoading(backupImageView);
        anonymousClass1.setTextSize(16);
        int i = Theme.key_dialogTextBlack;
        anonymousClass1.setTextColor(Theme.getColor(i, resourcesProvider));
        anonymousClass1.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(anonymousClass1);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.subtitleTextView = simpleTextView;
        simpleTextView.setTextSize(14);
        simpleTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(simpleTextView);
        RadioButton radioButton = new RadioButton(context);
        this.radioButton = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        int color = Theme.getColor(Theme.key_checkboxDisabled, resourcesProvider);
        int color2 = Theme.getColor(Theme.key_dialogRadioBackgroundChecked, resourcesProvider);
        radioButton.color = color;
        radioButton.checkedColor = color2;
        radioButton.invalidate();
        addView(radioButton);
        updateLayouts();
        if (needCheck()) {
            return;
        }
        radioButton.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.needDivider) {
            Paint paint = this.dividerPaint;
            paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
            int i = needCheck() ? 105 : 70;
            if (this.imageView.getVisibility() == 8) {
                i -= 40;
            }
            int iDividerPadding = dividerPadding() + i;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(iDividerPadding), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(iDividerPadding), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public int dividerPadding() {
        return 0;
    }

    public int getFullHeight() {
        return 56;
    }

    public abstract boolean needCheck();

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), 1073741824));
    }

    public void setChecked(boolean z, boolean z2) {
        RadioButton radioButton = this.radioButton;
        if (radioButton.getVisibility() == 0) {
            radioButton.setChecked(z, true);
        }
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleTextView;
        SimpleTextView simpleTextView = this.subtitleTextView;
        if (zIsEmpty) {
            anonymousClass1.setTranslationY(0.0f);
            simpleTextView.setVisibility(8);
        } else {
            anonymousClass1.setTranslationY(AndroidUtilities.dp(-9.0f));
            simpleTextView.setTranslationY(AndroidUtilities.dp(12.0f));
            simpleTextView.setText(charSequence, false);
            simpleTextView.setVisibility(0);
        }
        if (this.imageView.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                anonymousClass1.setTranslationX(AndroidUtilities.dp(40.0f));
                simpleTextView.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                anonymousClass1.setTranslationX(AndroidUtilities.dp(-40.0f));
                simpleTextView.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }

    public void updateLayouts() {
        float f;
        float f2;
        float f3;
        float f4;
        this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, needCheck() ? 53.0f : 16.0f, 0.0f, needCheck() ? 53.0f : 16.0f, 0.0f));
        boolean z = LocaleController.isRTL;
        int i = (z ? 5 : 3) | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = needCheck() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f2 = needCheck() ? 105 : 70;
        } else {
            f2 = 20.0f;
        }
        this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i, f, 0.0f, f2, 0.0f));
        boolean z2 = LocaleController.isRTL;
        int i2 = (z2 ? 5 : 3) | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = needCheck() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f4 = needCheck() ? 105 : 70;
        } else {
            f4 = 20.0f;
        }
        this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, i2, f3, 0.0f, f4, 0.0f));
        boolean z3 = LocaleController.isRTL;
        this.radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    public final SpannableStringBuilder withArrow(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }
}
