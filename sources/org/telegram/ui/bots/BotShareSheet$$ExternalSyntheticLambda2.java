package org.telegram.ui.bots;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotShareSheet$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final AlertDialog f$0;
    public final Context f$1;
    public final int f$2;
    public final long f$3;
    public final TLRPC.TL_messages_preparedInlineMessage f$4;
    public final Theme.ResourcesProvider f$5;
    public final BotWebViewContainer$$ExternalSyntheticLambda5 f$6;
    public final OAuthSheet$$ExternalSyntheticLambda18 f$7;

    public BotShareSheet$$ExternalSyntheticLambda2(AlertDialog alertDialog, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        this.f$0 = alertDialog;
        this.f$1 = context;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = tL_messages_preparedInlineMessage;
        this.f$5 = resourcesProvider;
        this.f$6 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$7 = oAuthSheet$$ExternalSyntheticLambda18;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.dismiss();
        new BotShareSheet(this.f$1, this.f$2, this.f$3, this.f$4, null, (TLRPC.WebPage) obj, this.f$5, this.f$6, this.f$7).show();
    }
}
