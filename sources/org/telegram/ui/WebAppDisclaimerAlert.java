package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.LayoutHelper;

public class WebAppDisclaimerAlert {
    private AlertDialog alert;
    private CheckBoxCell cell;
    private CheckBoxCell cell2;
    private TextView positiveButton;

    public static void lambda$show$0(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.WebAppDisclaimerUrl));
    }

    public static void lambda$show$1(Consumer consumer, boolean[] zArr, AlertDialog alertDialog, int i) {
        consumer.accept(Boolean.TRUE);
        zArr[0] = true;
        alertDialog.dismiss();
    }

    public static void lambda$show$3(WebAppDisclaimerAlert webAppDisclaimerAlert, View view) {
        CheckBoxCell checkBoxCell = webAppDisclaimerAlert.cell;
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
        webAppDisclaimerAlert.positiveButton.setEnabled(webAppDisclaimerAlert.cell.isChecked());
        webAppDisclaimerAlert.positiveButton.animate().alpha(webAppDisclaimerAlert.cell.isChecked() ? 1.0f : 0.5f).start();
    }

    public static void lambda$show$4(boolean[] zArr, Runnable runnable, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void show(Context context, Consumer consumer, TLRPC.User user, Runnable runnable) {
        WebAppDisclaimerAlert webAppDisclaimerAlert = new WebAppDisclaimerAlert();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(R.string.TermsOfUse));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 14.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 0, 24, 0));
        CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, null);
        webAppDisclaimerAlert.cell = checkBoxCell;
        checkBoxCell.getTextView().getLayoutParams().width = -1;
        webAppDisclaimerAlert.cell.getTextView().setTextSize(1, 14.0f);
        linearLayout.addView(webAppDisclaimerAlert.cell, LayoutHelper.createLinear(-1, 48, 3, 8, 0, 8, 0));
        boolean[] zArr = new boolean[1];
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.BotWebAppDisclaimerSubtitle, textView);
        webAppDisclaimerAlert.cell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new OAuthSheet$$ExternalSyntheticLambda7(context, 11)), "", false, false, false);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new TodoItemMenu$$ExternalSyntheticLambda7(20, consumer, zArr));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PhotoViewer$$ExternalSyntheticLambda36(4));
        AlertDialog alertDialogCreate = builder.create();
        webAppDisclaimerAlert.alert = alertDialogCreate;
        alertDialogCreate.show();
        TextView textView2 = (TextView) webAppDisclaimerAlert.alert.getButton(-1);
        webAppDisclaimerAlert.positiveButton = textView2;
        textView2.setEnabled(false);
        webAppDisclaimerAlert.positiveButton.setAlpha(0.5f);
        webAppDisclaimerAlert.cell.setOnClickListener(new PollItemMenu$$ExternalSyntheticLambda14(webAppDisclaimerAlert, 13));
        webAppDisclaimerAlert.cell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 7, -1));
        webAppDisclaimerAlert.alert.setOnDismissListener(new VoIPFragment$$ExternalSyntheticLambda23(5, (Object) runnable, zArr));
    }
}
