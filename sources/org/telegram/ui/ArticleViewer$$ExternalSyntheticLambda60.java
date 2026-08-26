package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;

public final class ArticleViewer$$ExternalSyntheticLambda60 implements Utilities.Callback0Return {
    public final ArticleViewer f$0;
    public final String f$1;
    public final boolean[] f$2;
    public final ArticleViewer.AnonymousClass13 f$3;

    public ArticleViewer$$ExternalSyntheticLambda60(ArticleViewer articleViewer, String str, boolean[] zArr, ArticleViewer.AnonymousClass13 anonymousClass13) {
        this.f$0 = articleViewer;
        this.f$1 = str;
        this.f$2 = zArr;
        this.f$3 = anonymousClass13;
    }

    @Override
    public final Object run() {
        ArticleViewer articleViewer = this.f$0;
        articleViewer.getClass();
        String str = this.f$1;
        if (!Browser.isInternalUri(Uri.parse(str), false, this.f$2)) {
            return Boolean.FALSE;
        }
        ArticleViewer.AnonymousClass13 anonymousClass13 = this.f$3;
        if (anonymousClass13 != null) {
            anonymousClass13.onEndListener = new ArticleViewer$$ExternalSyntheticLambda8(8, articleViewer, anonymousClass13);
        } else {
            ArticleViewer.Sheet sheet = articleViewer.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
        }
        Browser.openUrl(articleViewer.parentActivity, Uri.parse(str), true, true, false, anonymousClass13, null, true, true, false);
        return Boolean.TRUE;
    }
}
