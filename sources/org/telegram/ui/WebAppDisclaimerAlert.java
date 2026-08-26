package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;

public final class WebAppDisclaimerAlert {
    public AlertDialog alert;
    public CheckBoxCell cell;
    public TextView positiveButton;

    public static void show(Context context, Consumer consumer, Runnable runnable) {
        WebAppDisclaimerAlert webAppDisclaimerAlert = new WebAppDisclaimerAlert();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        String string = LocaleController.getString(R.string.TermsOfUse);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 14.0f);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 0, 24, 0));
        CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, null);
        webAppDisclaimerAlert.cell = checkBoxCell;
        checkBoxCell.getTextView().getLayoutParams().width = -1;
        webAppDisclaimerAlert.cell.getTextView().setTextSize(1, 14.0f);
        linearLayoutM.addView(webAppDisclaimerAlert.cell, LayoutHelper.createLinear(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        webAppDisclaimerAlert.cell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new OAuthSheet$$ExternalSyntheticLambda0(context, 20)), "", false, false, false);
        builder.setView(linearLayoutM);
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new TodoItemMenu$$ExternalSyntheticLambda19(6, consumer, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new TopicsFragment$$ExternalSyntheticLambda25(2));
        webAppDisclaimerAlert.alert = alertDialog;
        alertDialog.show();
        TextView textView2 = (TextView) webAppDisclaimerAlert.alert.getButton(-1);
        webAppDisclaimerAlert.positiveButton = textView2;
        textView2.setEnabled(false);
        webAppDisclaimerAlert.positiveButton.setAlpha(0.5f);
        webAppDisclaimerAlert.cell.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(webAppDisclaimerAlert, 2));
        webAppDisclaimerAlert.cell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
        webAppDisclaimerAlert.alert.setOnDismissListener(new WebAppDisclaimerAlert$$ExternalSyntheticLambda4(zArr, runnable));
    }
}
