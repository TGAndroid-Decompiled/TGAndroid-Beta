package org.telegram.ui.Stars;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda337;
import org.telegram.ui.Components.DialogsBotsAdapter;

public final class BalanceCloud$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final Context f$0;
    public final Theme.ResourcesProvider f$1;

    public BalanceCloud$$ExternalSyntheticLambda0(Context context, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = context;
        this.f$1 = resourcesProvider;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                new StarsIntroActivity.StarsOptionsSheet(this.f$0, this.f$1).show();
                break;
            default:
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                String string = LocaleController.getString(R.string.AppsTabInfoText);
                ChatActivity$$ExternalSyntheticLambda337 chatActivity$$ExternalSyntheticLambda337 = new ChatActivity$$ExternalSyntheticLambda337(alertDialogArr, 6);
                Theme.ResourcesProvider resourcesProvider = this.f$1;
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(AndroidUtilities.replaceLinks(string, resourcesProvider, chatActivity$$ExternalSyntheticLambda337));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(spannableStringBuilderReplaceTags);
                while (true) {
                    boolean zFind = matcher.find();
                    Context context = this.f$0;
                    if (!zFind) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
                        String string2 = LocaleController.getString(R.string.AppsTabInfoTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string2;
                        alertDialog.message = spannableStringBuilderReplaceTags;
                        builder.setPositiveButton(LocaleController.getString(R.string.AppsTabInfoButton), null);
                        alertDialogArr[0] = builder.show();
                    } else {
                        spannableStringBuilderReplaceTags.setSpan(new ArticleViewer.AnonymousClass1(alertDialogArr, context, matcher.group(1), 1), matcher.start(), matcher.end(), 33);
                    }
                    break;
                }
                break;
        }
    }

    public BalanceCloud$$ExternalSyntheticLambda0(DialogsBotsAdapter dialogsBotsAdapter, Theme.ResourcesProvider resourcesProvider, Context context) {
        this.f$1 = resourcesProvider;
        this.f$0 = context;
    }
}
