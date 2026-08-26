package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.web.WebActionBar;

public final class ArticleViewer$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final ArticleViewer f$0;
    public final String f$1;

    public ArticleViewer$$ExternalSyntheticLambda32(ArticleViewer articleViewer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = this.f$0;
                WebActionBar.AnonymousClass4 anonymousClass4 = articleViewer.actionBar.addressEditText;
                String str = this.f$1;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                anonymousClass4.setText(str);
                WebActionBar.AnonymousClass4 anonymousClass5 = articleViewer.actionBar.addressEditText;
                anonymousClass5.setSelection(anonymousClass5.getText().length());
                AndroidUtilities.showKeyboard(articleViewer.actionBar.addressEditText);
                break;
            default:
                Browser.openInExternalBrowser(this.f$0.parentActivity, this.f$1, false, null);
                break;
        }
    }
}
