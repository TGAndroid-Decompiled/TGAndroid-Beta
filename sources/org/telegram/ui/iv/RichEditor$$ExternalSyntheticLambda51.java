package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda28;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class RichEditor$$ExternalSyntheticLambda51 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RichEditor$$ExternalSyntheticLambda51(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        MathSpan mathSpanCreate;
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                RichEditor richEditor = (RichEditor) this.f$0;
                richEditor.getClass();
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) this.f$1;
                if (pageblockmath == null) {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    richEditor.listView.addBlock(pageblockmath2);
                } else {
                    pageblockmath.source = str;
                    richEditor.listView.adapter.update(false);
                }
                break;
            case 1:
                CommunitySheet communitySheet = (CommunitySheet) this.f$0;
                communitySheet.linkToCommunity((TLRPC.Chat) this.f$1, communitySheet.communityId, ((Boolean) obj).booleanValue());
                break;
            case 2:
                String str2 = (String) obj;
                RichEditorListView richEditorListView = ((ChatAttachAlertRichLayout) this.f$0).listView;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) this.f$1;
                if (pageblockmath3 == null) {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str2;
                    richEditorListView.addBlock(pageblockmath4);
                } else {
                    pageblockmath3.source = str2;
                    richEditorListView.adapter.update(false);
                }
                break;
            case 3:
                String str3 = (String) obj;
                RichEditText richEditText = (RichEditText) this.f$0;
                richEditText.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = richEditText.getText();
                    MathSpan mathSpan = (MathSpan) this.f$1;
                    int spanStart = text.getSpanStart(mathSpan);
                    int spanEnd = text.getSpanEnd(mathSpan);
                    if (spanStart >= 0 && spanEnd >= 0 && (mathSpanCreate = MathSpan.create(str3, richEditText.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z = richEditText.locked;
                        if (z) {
                            richEditText.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(mathSpanCreate, 0, 1, 33);
                        int iMax = Math.max(0, Math.min(spanStart, richEditText.length()));
                        text.replace(iMax, Math.max(iMax, Math.min(spanEnd, richEditText.length())), spannableString);
                        richEditText.setSelection(Math.min(iMax + 1, richEditText.length()));
                        if (z) {
                            richEditText.setLocked(true);
                        }
                        break;
                    }
                }
                break;
            case 4:
                String str4 = (String) obj;
                RichEditorListView richEditorListView2 = (RichEditorListView) this.f$0;
                richEditorListView2.getClass();
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) this.f$1;
                if (!TextUtils.equals(str4, pageblockmath5.source)) {
                    RichEditorHistory richEditorHistory = richEditorListView2.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    pageblockmath5.source = str4;
                    richEditorListView2.adapter.update(false);
                    RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    richEditorListView2.delegate.onContentChanged();
                    break;
                }
                break;
            case 5:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$32((String) this.f$1, (Boolean) obj);
                break;
            case 6:
                BrowserHistory.Entry entry = (BrowserHistory.Entry) obj;
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                ((HistoryFragment[]) this.f$1)[0].finishFragment();
                ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = webBrowserSettings.whenHistoryClicked;
                if (articleViewer$$ExternalSyntheticLambda28 == null) {
                    Browser.openUrl(webBrowserSettings.getContext(), entry.url);
                } else {
                    webBrowserSettings.finishFragment();
                    articleViewer$$ExternalSyntheticLambda28.run(entry);
                }
                break;
            default:
                WebInstantView webInstantView = (WebInstantView) this.f$0;
                webInstantView.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(webInstantView, (WebInstantView.WebPhoto) this.f$1, (Bitmap) obj, 22));
                break;
        }
    }
}
