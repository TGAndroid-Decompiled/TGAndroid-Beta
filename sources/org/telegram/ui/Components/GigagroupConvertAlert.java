package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public class GigagroupConvertAlert extends BottomSheet {

    public static class BottomSheetCell extends FrameLayout {
        private View background;
        private LinearLayout linearLayout;
        private TextView textView;

        public BottomSheetCell(Context context) {
            super(context);
            View view = new View(context);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            addView(this.background, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity(17);
            this.textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public GigagroupConvertAlert(Context context, BaseFragment baseFragment) {
        super(context, true, false, null);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.utyan_gigagroup, 120, 120);
        rLottieImageView.playAnimation();
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        AccountFrozenAlert$$ExternalSyntheticOutline1.m(24.0f, 1, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
        int i = 0;
        while (true) {
            if (i >= 3) {
                BottomSheetCell bottomSheetCell = new BottomSheetCell(context);
                bottomSheetCell.setBackground(null);
                bottomSheetCell.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
                bottomSheetCell.background.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, context, baseFragment, 13));
                linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 29, 0, 0));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlue2, false));
                textView2.setText(LocaleController.getString(R.string.GigagroupConvertCancelButton));
                textView2.setGravity(17);
                linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48, 49, 17, 0, 17, 16));
                textView2.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 23));
                return;
            }
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
            linearLayout2.addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(context);
            int i2 = Theme.key_dialogTextGray3;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 15.0f);
            textView3.setTextColor(Theme.getColor(null, i2, false));
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
            if (i == 0) {
                textView3.setText(LocaleController.getString(R.string.GigagroupConvertInfo1));
            } else if (i == 1) {
                textView3.setText(LocaleController.getString(R.string.GigagroupConvertInfo2));
            } else if (i == 2) {
                textView3.setText(LocaleController.getString(R.string.GigagroupConvertInfo3));
            }
            if (LocaleController.isRTL) {
                linearLayoutM.addView(textView3, LayoutHelper.createLinear(-2, -2));
                linearLayoutM.addView(imageView, LayoutHelper.createLinear(-2, -2, 8.0f, 7.0f, 0.0f, 0.0f));
            } else {
                linearLayoutM.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 8.0f, 8.0f, 0.0f));
                linearLayoutM.addView(textView3, LayoutHelper.createLinear(-2, -2));
            }
            i++;
        }
    }

    public void lambda$new$0(AlertDialog alertDialog, int i) {
        onCovert();
    }

    public void lambda$new$1(Context context, BaseFragment baseFragment, View view) {
        lambda$showGiftOfferSheet$15();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(R.string.GigagroupConvertAlertTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupConvertAlertText)));
        builder.setPositiveButton(LocaleController.getString(R.string.GigagroupConvertAlertConver), new ColorPicker$$ExternalSyntheticLambda5(this, 4));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(builder.create());
    }

    public void lambda$new$2(View view) {
        onCancel();
        lambda$showGiftOfferSheet$15();
    }

    public void onCancel() {
    }

    public void onCovert() {
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
