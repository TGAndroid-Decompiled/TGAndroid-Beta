package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ArticleViewer$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final Object f$5;

    public ArticleViewer$$ExternalSyntheticLambda6(Browser.Progress progress, AlertDialog[] alertDialogArr, int i, Uri uri, Context context, boolean z) {
        this.f$0 = progress;
        this.f$2 = alertDialogArr;
        this.f$1 = i;
        this.f$3 = uri;
        this.f$5 = context;
        this.f$4 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                articleViewer.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda31(articleViewer, tLObject, this.f$1, (TLRPC.WebPage) this.f$2, (MessageObject) this.f$3, this.f$4, (String) this.f$5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda31((Browser.Progress) this.f$0, (AlertDialog[]) this.f$2, tLObject, this.f$1, (Uri) this.f$3, (Context) this.f$5, this.f$4));
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda6(ArticleViewer articleViewer, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) {
        this.f$0 = articleViewer;
        this.f$1 = i;
        this.f$2 = webPage;
        this.f$3 = messageObject;
        this.f$4 = z;
        this.f$5 = str;
    }
}
