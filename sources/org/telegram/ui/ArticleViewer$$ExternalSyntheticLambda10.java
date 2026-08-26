package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.WebActionBar;

public final class ArticleViewer$$ExternalSyntheticLambda10 implements Utilities.Callback {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda10(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = this.f$0;
                PhotoViewer.AnonymousClass19 anonymousClass19 = articleViewer.searchPanel;
                float f = -((Integer) obj).intValue();
                articleViewer.searchPanelTranslation = f;
                anonymousClass19.setTranslationY(((1.0f - articleViewer.searchPanelAlpha) * AndroidUtilities.dp(51.0f)) + f);
                break;
            case 1:
                String str = (String) obj;
                ArticleViewer articleViewer2 = this.f$0;
                articleViewer2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    articleViewer2.actionBar.addressEditText.setText(str);
                    WebActionBar.AnonymousClass4 anonymousClass4 = articleViewer2.actionBar.addressEditText;
                    anonymousClass4.setSelection(anonymousClass4.getText().length());
                    AndroidUtilities.showKeyboard(articleViewer2.actionBar.addressEditText);
                    break;
                }
                break;
            case 2:
                ArticleViewer articleViewer3 = this.f$0;
                String str2 = (String) obj;
                if (articleViewer3.parentActivity != null && str2 != null) {
                    articleViewer3.actionBar.showAddress(false);
                    if (Browser.isInternalUri(Uri.parse(str2), false, null)) {
                        ArticleViewer.Sheet sheet = articleViewer3.sheet;
                        if (sheet != null) {
                            sheet.dismiss(true);
                        }
                        Browser.openAsInternalIntent(articleViewer3.parentActivity, str2, false, false, null);
                    } else if (!Browser.openInExternalApp(articleViewer3.parentActivity, str2, false)) {
                        ArticleViewer.PageLayout pageLayout = articleViewer3.pages[0];
                        if (pageLayout == null || pageLayout.getWebView() == null) {
                            Browser.openInTelegramBrowser(str2);
                        } else {
                            articleViewer3.pages[0].getWebView().loadUrl(str2);
                        }
                    }
                }
                break;
            default:
                ArticleViewer articleViewer4 = this.f$0;
                BrowserHistory.Entry entry = (BrowserHistory.Entry) obj;
                if (articleViewer4.parentActivity != null && entry != null) {
                    articleViewer4.actionBar.showAddress(false);
                    ArticleViewer.PageLayout pageLayout2 = articleViewer4.pages[0];
                    if (pageLayout2 == null || pageLayout2.getWebView() == null) {
                        Browser.openInTelegramBrowser(entry.url);
                    } else {
                        articleViewer4.pages[0].getWebView().loadUrl(entry.url, entry.meta);
                    }
                    break;
                }
                break;
        }
    }
}
