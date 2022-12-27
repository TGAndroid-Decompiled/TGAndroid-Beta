package org.telegram.p009ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;

public class SponsoredMessageInfoView extends FrameLayout {
    public SponsoredMessageInfoView(final Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString("SponsoredMessageInfo", C1072R.string.SponsoredMessageInfo));
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView.setTextSize(1, 20.0f);
        TextView textView2 = new TextView(activity);
        textView2.setText(LocaleController.getString("SponsoredMessageInfoDescription1", C1072R.string.SponsoredMessageInfoDescription1));
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        TextView textView3 = new TextView(activity);
        textView3.setText(LocaleController.getString("SponsoredMessageInfoDescription2", C1072R.string.SponsoredMessageInfoDescription2));
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        TextView textView4 = new TextView(activity);
        textView4.setText(LocaleController.getString("SponsoredMessageInfoDescription3", C1072R.string.SponsoredMessageInfoDescription3));
        textView4.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView4.setTextSize(1, 14.0f);
        textView4.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        final Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Theme.getColor("featuredStickers_addButton", resourcesProvider));
        paint.setStrokeWidth(AndroidUtilities.m36dp(1.0f));
        TextView textView5 = new TextView(this, activity) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.m36dp(1.0f), AndroidUtilities.m36dp(1.0f), getMeasuredWidth() - AndroidUtilities.m36dp(1.0f), getMeasuredHeight() - AndroidUtilities.m36dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.m36dp(4.0f), AndroidUtilities.m36dp(4.0f), paint);
            }
        };
        textView5.setOnClickListener(new View.OnClickListener(this) {
            @Override
            public void onClick(View view) {
                Browser.openUrl(activity, LocaleController.getString("SponsoredMessageAlertLearnMoreUrl", C1072R.string.SponsoredMessageAlertLearnMoreUrl));
            }
        });
        textView5.setPadding(AndroidUtilities.m36dp(12.0f), 0, AndroidUtilities.m36dp(12.0f), 0);
        textView5.setText(LocaleController.getString("SponsoredMessageAlertLearnMoreUrl", C1072R.string.SponsoredMessageAlertLearnMoreUrl));
        textView5.setTextColor(Theme.getColor("featuredStickers_addButton", resourcesProvider));
        textView5.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("dialogBackground", resourcesProvider), 4.0f));
        textView5.setTextSize(1, 14.0f);
        textView5.setGravity(16);
        TextView textView6 = new TextView(activity);
        textView6.setText(LocaleController.getString("SponsoredMessageInfoDescription4", C1072R.string.SponsoredMessageInfoDescription4));
        textView6.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        textView6.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        textView6.setTextSize(1, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0, 0, 18, 0, 0));
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
        linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0, 0, 24, 0, 0));
        linearLayout.addView(textView5, LayoutHelper.createLinear(-2, 34, 1, 0, 14, 0, 0));
        linearLayout.addView(textView6, LayoutHelper.createLinear(-1, -2, 0, 0, 14, 0, 0));
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        addView(scrollView, LayoutHelper.createFrame(-1, -2.0f, 0, 22.0f, 12.0f, 22.0f, 22.0f));
    }
}
