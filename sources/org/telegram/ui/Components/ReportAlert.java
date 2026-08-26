package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public abstract class ReportAlert extends BottomSheet {
    public final BottomSheetCell clearButton;
    public final EditTextBoldCursor editText;

    public final class BottomSheetCell extends FrameLayout {
        public final View background;
        public final TextView textView;

        public BottomSheetCell(Activity activity, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(activity);
            View view = new View(activity);
            this.background = view;
            view.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
            addView(view, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            TextView textView = new TextView(activity);
            this.textView = textView;
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setGravity(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            zzlj.m(Theme.key_featuredStickers_buttonText, darkThemeResourceProvider, textView, 14.0f);
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

    public ReportAlert(Activity activity, int i, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(activity, darkThemeResourceProvider, true, false);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        setCustomView(scrollView);
        FrameLayout frameLayout = new FrameLayout(activity);
        scrollView.addView(frameLayout, LayoutHelper.createScroll(-1, -2, 51));
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setAnimation(R.raw.report_police, 120, 120, null);
        rLottieImageView.playAnimation();
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(160, 160.0f, 49, 17.0f, 14.0f, 17.0f, 0.0f));
        TextView textView = new TextView(activity);
        zzkh.m(24.0f, textView);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        if (i == 0) {
            textView.setText(LocaleController.getString(R.string.ReportTitleSpam));
        } else if (i == 6) {
            textView.setText(LocaleController.getString(R.string.ReportTitleFake));
        } else if (i == 1) {
            textView.setText(LocaleController.getString(R.string.ReportTitleViolence));
        } else if (i == 2) {
            textView.setText(LocaleController.getString(R.string.ReportTitleChild));
        } else if (i == 5) {
            textView.setText(LocaleController.getString(R.string.ReportTitlePornography));
        } else if (i == 100) {
            textView.setText(LocaleController.getString(R.string.ReportChat));
        }
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 17.0f, 197.0f, 17.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
        textView2.setGravity(1);
        textView2.setText(LocaleController.getString(R.string.ReportInfo));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 49, 30.0f, 235.0f, 30.0f, 44.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(getThemedColor(i2));
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setLineColors(getThemedColor(Theme.key_windowBackgroundWhiteInputField), getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), getThemedColor(Theme.key_text_RedRegular));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setInputType(180224);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.ReportHint));
        editTextBoldCursor.setCursorColor(getThemedColor(i2));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        AlertsCreator.AnonymousClass57 anonymousClass57 = (AlertsCreator.AnonymousClass57) this;
        editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(anonymousClass57, 9));
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 36.0f, 51, 17.0f, 305.0f, 17.0f, 0.0f));
        BottomSheetCell bottomSheetCell = new BottomSheetCell(activity, darkThemeResourceProvider);
        this.clearButton = bottomSheetCell;
        bottomSheetCell.setBackground(null);
        bottomSheetCell.setText(LocaleController.getString(R.string.ReportSend));
        ScaleStateListAnimator.apply(bottomSheetCell, 0.1f, 1.5f);
        bottomSheetCell.background.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(anonymousClass57, i, 7));
        frameLayout.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 357.0f, 0.0f, 0.0f));
        this.smoothKeyboardAnimationEnabled = true;
    }
}
