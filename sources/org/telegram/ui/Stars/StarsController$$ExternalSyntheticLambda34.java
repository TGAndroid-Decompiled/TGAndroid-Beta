package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class StarsController$$ExternalSyntheticLambda34 implements Utilities.Callback {
    public final StarsController f$0;
    public final long f$1;
    public final int f$2;
    public final boolean[] f$3;
    public final Utilities.Callback2 f$4;
    public final Context f$5;
    public final Theme.ResourcesProvider f$6;
    public final TLRPC.ChatInvite f$7;
    public final String f$8;

    public StarsController$$ExternalSyntheticLambda34(StarsController starsController, long j, int i, boolean[] zArr, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.ChatInvite chatInvite, String str) {
        this.f$0 = starsController;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = zArr;
        this.f$4 = callback2;
        this.f$5 = context;
        this.f$6 = resourcesProvider;
        this.f$7 = chatInvite;
        this.f$8 = str;
    }

    @Override
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        StarsController starsController = this.f$0;
        long j = starsController.balance.amount;
        boolean[] zArr = this.f$3;
        Utilities.Callback2 callback2 = this.f$4;
        long j2 = this.f$1;
        TLRPC.ChatInvite chatInvite = this.f$7;
        String str = this.f$8;
        if (j >= j2) {
            starsController.payAfterConfirmed(str, chatInvite, new StarsController$$ExternalSyntheticLambda69(callback, zArr, callback2));
            return;
        }
        boolean zStarsPurchaseAvailable = MessagesController.getInstance(this.f$2).starsPurchaseAvailable();
        Context context = this.f$5;
        Theme.ResourcesProvider resourcesProvider = this.f$6;
        if (zStarsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            StarsIntroActivity.StarsNeededSheet starsNeededSheet = new StarsIntroActivity.StarsNeededSheet(context, resourcesProvider, j2, 1, chatInvite.title, new StarsController$$ExternalSyntheticLambda67(starsController, zArr2, str, chatInvite, zArr, callback2, callback), 0L);
            starsNeededSheet.setOnDismissListener(new StarsController$$ExternalSyntheticLambda60(starsController, callback, zArr2, zArr, callback2, 1));
            starsNeededSheet.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        StarsController.showNoSupportDialog(context, resourcesProvider);
    }
}
