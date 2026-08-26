package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;

public abstract class GigagroupConvertAlert extends BottomSheet {

    public final class BottomSheetCell extends FrameLayout {
        public final View background;
        public final TextView textView;

        public BottomSheetCell(Activity activity) {
            super(activity);
            View view = new View(activity);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(activity);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public GigagroupConvertAlert(Activity activity, BaseFragment baseFragment) {
        super(activity, null, true, false);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        setCustomView(linearLayout);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.utyan_gigagroup, 120, 120, null);
        rLottieImageView.playAnimation();
        linearLayout.addView(rLottieImageView, LayoutHelper.createLinear(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        zzkh.m(24.0f, textView);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setText(LocaleController.getString(R.string.GigagroupConvertTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2, 1, 0, 12, 0, 0));
        int i = 0;
        while (true) {
            if (i >= 3) {
                BottomSheetCell bottomSheetCell = new BottomSheetCell(activity);
                bottomSheetCell.setBackground(null);
                bottomSheetCell.setText(LocaleController.getString(R.string.GigagroupConvertProcessButton));
                bottomSheetCell.background.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, activity, baseFragment, 22));
                linearLayout.addView(bottomSheetCell, LayoutHelper.createLinear(-1, 50, 51, 0, 29, 0, 0));
                TextView textView2 = new TextView(activity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlue2, false));
                zzkg.m(R.string.GigagroupConvertCancelButton, textView2, 17);
                linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48, 49, 17, 0, 17, 16));
                textView2.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 23));
                return;
            }
            LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 0);
            linearLayout2.addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i2 = Theme.key_dialogTextGray3;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
            imageView.setImageResource(R.drawable.list_circle);
            TextView textView3 = new TextView(activity);
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
                linearLayoutM.addView(imageView, LayoutHelper.createLinear(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
            } else {
                linearLayoutM.addView(imageView, LayoutHelper.createLinear(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                linearLayoutM.addView(textView3, LayoutHelper.createLinear(-2, -2));
            }
            i++;
        }
    }

    public abstract void onCancel();

    public abstract void onCovert();
}
