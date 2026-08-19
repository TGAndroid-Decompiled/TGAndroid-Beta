package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
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
    private TextView positiveButton;

    public static void show(final Context context, final Consumer consumer, TLRPC.User user, final Runnable runnable) {
        final WebAppDisclaimerAlert webAppDisclaimerAlert = new WebAppDisclaimerAlert();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(R.string.TermsOfUse));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
        textView.setTextSize(1, 14.0f);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 0, 24, 0));
        CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, null);
        webAppDisclaimerAlert.cell = checkBoxCell;
        checkBoxCell.getTextView().getLayoutParams().width = -1;
        webAppDisclaimerAlert.cell.getTextView().setTextSize(1, 14.0f);
        linearLayout.addView(webAppDisclaimerAlert.cell, LayoutHelper.createLinear(-1, 48, 3, 8, 0, 8, 0));
        final boolean[] zArr = new boolean[1];
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BotWebAppDisclaimerSubtitle)));
        webAppDisclaimerAlert.cell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BotWebAppDisclaimerCheck), new Runnable() {
            @Override
            public final void run() {
                Browser.openUrl(context, LocaleController.getString(R.string.WebAppDisclaimerUrl));
            }
        }), "", false, false);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                WebAppDisclaimerAlert.$r8$lambda$ieZxLpbNUQex9tFQgbaeiuh1B5I(consumer, zArr, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        webAppDisclaimerAlert.alert = alertDialogCreate;
        alertDialogCreate.show();
        TextView textView2 = (TextView) webAppDisclaimerAlert.alert.getButton(-1);
        webAppDisclaimerAlert.positiveButton = textView2;
        textView2.setEnabled(false);
        webAppDisclaimerAlert.positiveButton.setAlpha(0.5f);
        webAppDisclaimerAlert.cell.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                WebAppDisclaimerAlert.m4793$r8$lambda$ICLm3wirtfJP4fPzJ1h4N5G00Y(this.f$0, view);
            }
        });
        webAppDisclaimerAlert.cell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 7));
        webAppDisclaimerAlert.alert.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                WebAppDisclaimerAlert.$r8$lambda$LOJMvwvnO12EwW70_zmwaJs0cc4(zArr, runnable, dialogInterface);
            }
        });
    }

    public static void $r8$lambda$ieZxLpbNUQex9tFQgbaeiuh1B5I(Consumer consumer, boolean[] zArr, AlertDialog alertDialog, int i) {
        consumer.accept(Boolean.TRUE);
        zArr[0] = true;
        alertDialog.dismiss();
    }

    public static void m4793$r8$lambda$ICLm3wirtfJP4fPzJ1h4N5G00Y(WebAppDisclaimerAlert webAppDisclaimerAlert, View view) {
        CheckBoxCell checkBoxCell = webAppDisclaimerAlert.cell;
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
        webAppDisclaimerAlert.positiveButton.setEnabled(webAppDisclaimerAlert.cell.isChecked());
        webAppDisclaimerAlert.positiveButton.animate().alpha(webAppDisclaimerAlert.cell.isChecked() ? 1.0f : 0.5f).start();
    }

    public static void $r8$lambda$LOJMvwvnO12EwW70_zmwaJs0cc4(boolean[] zArr, Runnable runnable, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        if (runnable != null) {
            runnable.run();
        }
    }
}
