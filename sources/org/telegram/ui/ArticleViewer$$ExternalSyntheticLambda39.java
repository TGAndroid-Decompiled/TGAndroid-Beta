package org.telegram.ui;

import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ArticleViewer$$ExternalSyntheticLambda39 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda39(int i, PollItemMenu$$ExternalSyntheticLambda0 pollItemMenu$$ExternalSyntheticLambda0, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.$r8$classId = 2;
        this.f$2 = i;
        this.f$0 = pollItemMenu$$ExternalSyntheticLambda0;
        this.f$1 = baseFragment;
        this.f$3 = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer.lambda$loadChannel$60((IArticleViewer) this.f$0, (ArticleViewer.WebpageAdapter) this.f$1, this.f$2, (ArticleViewer.BlockChannelCell) this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((LaunchActivity) this.f$0).lambda$runImportRequest$35((Uri) this.f$1, this.f$2, (AlertDialog) this.f$3, tLObject, tL_error);
                break;
            default:
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) this.f$3;
                PremiumPreviewFragment.lambda$buyPremium$11(this.f$2, (PollItemMenu$$ExternalSyntheticLambda0) this.f$0, (BaseFragment) this.f$1, tL_payments_assignPlayMarketTransaction, tLObject, tL_error);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda39(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }
}
