package org.telegram.ui.bots;

import android.content.Context;
import java.io.File;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotShareSheet$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 0;
    public final AlertDialog f$0;
    public final Context f$1;
    public final int f$2;
    public final long f$3;
    public final TLObject f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;

    public BotShareSheet$$ExternalSyntheticLambda4(AlertDialog alertDialog, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10) {
        this.f$0 = alertDialog;
        this.f$1 = context;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = tL_messages_preparedInlineMessage;
        this.f$5 = fileArr;
        this.f$6 = resourcesProvider;
        this.f$7 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$8 = botBiometry$$ExternalSyntheticLambda10;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                new BotShareSheet(this.f$1, this.f$2, this.f$3, (TLRPC.TL_messages_preparedInlineMessage) this.f$4, ((File[]) this.f$5)[0], null, (Theme.ResourcesProvider) this.f$6, (BotWebViewContainer$$ExternalSyntheticLambda5) this.f$7, (BotBiometry$$ExternalSyntheticLambda10) this.f$8).show();
                break;
            default:
                JoinCallAlert.lambda$open$3(this.f$0, this.f$4, (AccountInstance) this.f$5, (JoinCallAlert.JoinCallAlertDelegate) this.f$6, this.f$3, this.f$1, (BaseFragment) this.f$7, this.f$2, (TLRPC.Peer) this.f$8);
                break;
        }
    }

    public BotShareSheet$$ExternalSyntheticLambda4(AlertDialog alertDialog, TLObject tLObject, AccountInstance accountInstance, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer) {
        this.f$0 = alertDialog;
        this.f$4 = tLObject;
        this.f$5 = accountInstance;
        this.f$6 = joinCallAlertDelegate;
        this.f$3 = j;
        this.f$1 = context;
        this.f$7 = baseFragment;
        this.f$2 = i;
        this.f$8 = peer;
    }
}
