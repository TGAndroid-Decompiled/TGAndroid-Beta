package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ArticleViewer$$ExternalSyntheticLambda31 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final TLObject f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final Object f$6;

    public ArticleViewer$$ExternalSyntheticLambda31(Browser.Progress progress, AlertDialog[] alertDialogArr, TLObject tLObject, int i, Uri uri, Context context, boolean z) {
        this.f$0 = progress;
        this.f$3 = alertDialogArr;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$4 = uri;
        this.f$6 = context;
        this.f$5 = z;
    }

    @Override
    public final void run() {
        TL_iv.Page page;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                TLObject tLObject = this.f$1;
                int i2 = this.f$2;
                TLRPC.WebPage webPage = (TLRPC.WebPage) this.f$3;
                MessageObject messageObject = (MessageObject) this.f$4;
                boolean z = this.f$5;
                String str = (String) this.f$6;
                articleViewer.getClass();
                boolean z2 = tLObject instanceof TLRPC.TL_messages_webPage;
                TLObject tLObject2 = tLObject;
                if (z2) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i2).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i2).putChats(tL_messages_webPage.chats, false);
                    tLObject2 = tL_messages_webPage.webpage;
                }
                if (tLObject2 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                    if (tL_webPage.cached_page != null) {
                        if (!articleViewer.pagesStack.isEmpty() && articleViewer.pagesStack.get(0) == webPage) {
                            if (messageObject != null) {
                                messageObject.messageOwner.media.webpage = tL_webPage;
                                TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                tL_messages_messages.messages.add(messageObject.messageOwner);
                                MessagesStorage.getInstance(i2).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                            }
                            if (z) {
                                articleViewer.pagesStack.add(tL_webPage);
                            } else {
                                articleViewer.pagesStack.set(0, tL_webPage);
                            }
                            if (articleViewer.pagesStack.size() == 1) {
                                ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                                articleViewer.updateInterfaceForCurrentPage(z ? 1 : 0, tL_webPage, false);
                                if (str != null) {
                                    articleViewer.scrollToAnchor(str, false);
                                }
                            }
                        }
                        LongSparseArray longSparseArray = new LongSparseArray(1);
                        longSparseArray.put(tL_webPage, tL_webPage.id);
                        MessagesStorage.getInstance(i2).putWebPages(longSparseArray);
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
                    TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
                    if (webPage != null && (page = webPage.cached_page) != null) {
                        int i3 = page.views;
                        int i4 = tL_webPageNotModified.cached_page_views;
                        if (i3 != i4) {
                            page.views = i4;
                            page.flags |= 8;
                            while (true) {
                                ArticleViewer.PageLayout[] pageLayoutArr = articleViewer.pages;
                                if (i < pageLayoutArr.length) {
                                    ArticleViewer.WebpageAdapter webpageAdapter = pageLayoutArr[i].adapter;
                                    if (webpageAdapter.currentPage == webPage && (viewHolderFindViewHolderForAdapterPosition = articleViewer.pages[i].listView.findViewHolderForAdapterPosition(webpageAdapter.getItemCount() - 1)) != null) {
                                        articleViewer.pages[i].adapter.onViewAttachedToWindow(viewHolderFindViewHolderForAdapterPosition);
                                    }
                                    i++;
                                } else if (messageObject != null) {
                                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                                    MessagesStorage.getInstance(i2).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$3;
                Browser.Progress progress = (Browser.Progress) this.f$0;
                if (progress != null) {
                    progress.end();
                } else {
                    try {
                        alertDialogArr[0].dismiss();
                        break;
                    } catch (Throwable unused) {
                    }
                    alertDialogArr[0] = null;
                }
                TLObject tLObject3 = this.f$1;
                boolean z3 = tLObject3 instanceof TL_account.webPagePreview;
                Uri uri = (Uri) this.f$4;
                if (z3) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject3;
                    int i5 = this.f$2;
                    MessagesController.getInstance(i5).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i5).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
                        TLRPC.WebPage webPage2 = tL_messageMediaWebPage.webpage;
                        if ((webPage2 instanceof TLRPC.TL_webPage) && webPage2.cached_page != null) {
                            NotificationCenter.getInstance(i5).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, tL_messageMediaWebPage.webpage, uri.toString());
                        }
                    }
                }
                Browser.openUrl((Context) this.f$6, uri, this.f$5, false);
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda31(ArticleViewer articleViewer, TLObject tLObject, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) {
        this.f$0 = articleViewer;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = webPage;
        this.f$4 = messageObject;
        this.f$5 = z;
        this.f$6 = str;
    }
}
