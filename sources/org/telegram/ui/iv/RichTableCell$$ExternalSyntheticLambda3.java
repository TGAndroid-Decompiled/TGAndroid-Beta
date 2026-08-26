package org.telegram.ui.iv;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda1;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class RichTableCell$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RichTableCell$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        String absolutePath;
        String string;
        String strReplace;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        View viewFindViewByItemObject;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        BotWebViewContainer botWebViewContainer;
        BotWebViewContainer.Delegate delegate;
        WebInstantView$$ExternalSyntheticLambda1 webInstantView$$ExternalSyntheticLambda1;
        switch (this.$r8$classId) {
            case 0:
                RichTableCellHost richTableCellHostHostForAnchor = ((RichTableCell) this.f$0).grid.hostForAnchor((TL_iv.pageTableCell) this.f$1);
                if (richTableCellHostHostForAnchor == null) {
                    return;
                }
                RichEditText richEditText = richTableCellHostHostForAnchor.editText;
                richEditText.requestEditFocus();
                richEditText.setSelection(richEditText.length());
                return;
            case 1:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                botWebViewSheet.getClass();
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f$1;
                if (userFull == null || (botInfo = userFull.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                botWebViewSheet.applyAppBotSettings(botappsettings, true);
                return;
            case 2:
                BotWebViewSheet botWebViewSheet2 = (BotWebViewSheet) this.f$0;
                if (botWebViewSheet2.dismissed) {
                    return;
                }
                if (((TLRPC.TL_error) this.f$1) != null) {
                    botWebViewSheet2.dismiss$1(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(botWebViewSheet2.pollRunnable, 60000L);
                    return;
                }
            case 3:
                BotWebViewSheet botWebViewSheet3 = (BotWebViewSheet) this.f$0;
                Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(botWebViewSheet3.bulletinContainer, botWebViewSheet3.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f$1));
                bulletinCreateSimpleBulletinWithIconSize.duration = 5000;
                bulletinCreateSimpleBulletinWithIconSize.show(true);
                return;
            case 4:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment.getMessagesController().openApp((TLRPC.User) this.f$1, channelAffiliateProgramsFragment.getClassGuid());
                return;
            case 5:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment2 = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment2.getClass();
                channelAffiliateProgramsFragment2.presentFragment(ChatActivity.of(((TL_payments.connectedBotStarRef) this.f$1).bot_id));
                return;
            case 6:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) this.f$0;
                if (chatAttachAlertBotWebViewLayout.destroyed) {
                    return;
                }
                if (((TLRPC.TL_error) this.f$1) != null) {
                    chatAttachAlertBotWebViewLayout.parentAlert.lambda$showGiftOfferSheet$15();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(chatAttachAlertBotWebViewLayout.pollRunnable, 60000L);
                    return;
                }
            case 7:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout2 = (ChatAttachAlertBotWebViewLayout) this.f$0;
                Bulletin bulletinCreateSimpleBulletinWithIconSize2 = new BulletinFactory(chatAttachAlertBotWebViewLayout2.parentAlert.getContainer(), chatAttachAlertBotWebViewLayout2.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f$1));
                bulletinCreateSimpleBulletinWithIconSize2.duration = 5000;
                bulletinCreateSimpleBulletinWithIconSize2.show(true);
                return;
            case 8:
                CommunityPendingRequestsActivity communityPendingRequestsActivity = (CommunityPendingRequestsActivity) this.f$0;
                communityPendingRequestsActivity.getClass();
                communityPendingRequestsActivity.presentFragment(ChatActivity.of(((CommunityPendingRequestCell.Data) this.f$1).requestFromUser.id));
                return;
            case 9:
                CommunitySheet communitySheet = (CommunitySheet) this.f$0;
                communitySheet.getClass();
                communitySheet.parentFragment.presentFragment(ChatActivity.of(((CommunityPendingRequestCell.Data) this.f$1).requestFromUser.id));
                return;
            case 10:
                boolean z = false;
                Latex latexRender = Latex.render(((String[]) this.f$0)[0], AndroidUtilities.dp(26.0f), false);
                if (latexRender == null) {
                    latexRender = Latex.render(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z = true;
                }
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((Utilities.Callback2) this.f$1, latexRender != null ? (Bitmap) latexRender.bitmap : null, z, 12));
                return;
            case 11:
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) this.f$0;
                richAIComposeSheet.loading = false;
                richAIComposeSheet.reqId = 0;
                ButtonWithCounterView buttonWithCounterView = richAIComposeSheet.button;
                buttonWithCounterView.setLoading(false);
                TLObject tLObject = (TLObject) this.f$1;
                if (!(tLObject instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 4.0f);
                    return;
                }
                richAIComposeSheet.result = richMessage;
                richAIComposeSheet.previewView.set(richMessage);
                buttonWithCounterView.setText(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                richAIComposeSheet.updateButtonEnabled();
                UniversalAdapter universalAdapter = richAIComposeSheet.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                    return;
                }
                return;
            case 12:
                Uri uri = (Uri) this.f$1;
                RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.getClass();
                String str = null;
                try {
                    absolutePath = AndroidUtilities.getPath(uri);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    absolutePath = null;
                }
                if (TextUtils.isEmpty(absolutePath) || !ArticleViewer.IBlock.CC.m(absolutePath)) {
                    try {
                        Cursor cursorQuery = richEditorListView.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(0);
                                } else {
                                    string = null;
                                }
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            string = null;
                        }
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception e2) {
                                e = e2;
                                FileLog.e(e);
                            }
                        }
                        break;
                    } catch (Exception e3) {
                        e = e3;
                        string = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(string)) {
                            string = "document_" + SharedConfig.getLastLocalId();
                        }
                        strReplace = string.replace('/', '_').replace('\\', '_');
                        inputStreamOpenInputStream = richEditorListView.getContext().getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            try {
                                File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + strReplace);
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    absolutePath = file.getAbsolutePath();
                                    inputStreamOpenInputStream.close();
                                    str = absolutePath;
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    inputStreamOpenInputStream.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } else if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        if (TextUtils.isEmpty(str)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = "document_" + SharedConfig.getLastLocalId();
                    }
                    strReplace = string.replace('/', '_').replace('\\', '_');
                    try {
                        inputStreamOpenInputStream = richEditorListView.getContext().getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            File file2 = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + strReplace);
                            fileOutputStream = new FileOutputStream(file2);
                            AndroidUtilities.copyFile(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            absolutePath = file2.getAbsolutePath();
                            inputStreamOpenInputStream.close();
                            str = absolutePath;
                        } else if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                } else {
                    str = absolutePath;
                }
                if (TextUtils.isEmpty(str) || !ArticleViewer.IBlock.CC.m(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(14, richEditorListView, str));
                return;
            case 13:
                RichEditorListView richEditorListView2 = (RichEditorListView) this.f$0;
                richEditorListView2.getClass();
                RichEditorHistory.FocusState focusState = (RichEditorHistory.FocusState) this.f$1;
                long j = focusState.rowId;
                int i = 0;
                while (true) {
                    ArrayList arrayList = richEditorListView2.rows;
                    if (i >= arrayList.size()) {
                        i = -1;
                    } else if (((BlockRow) arrayList.get(i)).id != j) {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                KeyEvent.Callback callbackFindViewByPosition = richEditorListView2.layoutManager.findViewByPosition(i);
                boolean z2 = callbackFindViewByPosition instanceof RichTextCell;
                int i2 = focusState.selEnd;
                int i3 = focusState.selStart;
                if (z2) {
                    RichTextCell richTextCell = (RichTextCell) callbackFindViewByPosition;
                    richTextCell.editText.requestEditFocus();
                    RichEditText editText = richTextCell.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i3, length)), Math.max(0, Math.min(i2, length)));
                    return;
                }
                if (!(callbackFindViewByPosition instanceof RichTableCell)) {
                    if (callbackFindViewByPosition instanceof RichCaptionHost) {
                        RichEditText captionEditText = ((RichCaptionHost) callbackFindViewByPosition).getCaptionEditText();
                        captionEditText.requestEditFocus();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i3, length2)), Math.max(0, Math.min(i2, length2)));
                        return;
                    }
                    return;
                }
                RichTableCell richTableCell = (RichTableCell) callbackFindViewByPosition;
                RichEditText richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(focusState.childIndex);
                if (richEditTextEditTextForChildPos == null) {
                    richEditTextEditTextForChildPos = richTableCell.editTextForChildPos(0);
                }
                if (richEditTextEditTextForChildPos == null) {
                    return;
                }
                richEditTextEditTextForChildPos.requestEditFocus();
                int length3 = richEditTextEditTextForChildPos.length();
                richEditTextEditTextForChildPos.setSelection(Math.max(0, Math.min(i3, length3)), Math.max(0, Math.min(i2, length3)));
                return;
            case 14:
                ((RichEditorListView) this.f$0).attachDocument((String) this.f$1);
                return;
            case 15:
                RichEditorListView.AnonymousClass4 anonymousClass4 = (RichEditorListView.AnonymousClass4) this.f$0;
                BlockRow blockRow = (BlockRow) this.f$1;
                if (blockRow == null) {
                    anonymousClass4.getClass();
                    viewFindViewByItemObject = null;
                } else {
                    viewFindViewByItemObject = RichEditorListView.this.findViewByItemObject(blockRow);
                }
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    RichTextCell richTextCell2 = (RichTextCell) viewFindViewByItemObject;
                    richTextCell2.editText.requestEditFocus();
                    richTextCell2.getEditText().setSelection(richTextCell2.getEditText().length());
                    return;
                }
                return;
            case 16:
                RichMediaUploader richMediaUploader = (RichMediaUploader) this.f$0;
                if (richMediaUploader.cancelled) {
                    return;
                }
                richMediaUploader.requestToken = 0;
                RichMediaUploader.Listener listener = richMediaUploader.listener;
                TLObject tLObject2 = (TLObject) this.f$1;
                boolean z3 = richMediaUploader.isVideo;
                boolean z4 = richMediaUploader.isDocument;
                boolean z5 = richMediaUploader.isAudio;
                if (z3 || z5 || z4) {
                    if ((tLObject2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject2).document) != null) {
                        if (!z4) {
                            if (z5) {
                                richMediaUploader.finished = true;
                                richMediaUploader.teardown$1();
                                listener.onAudioUploaded(document);
                                return;
                            } else {
                                richMediaUploader.finished = true;
                                richMediaUploader.teardown$1();
                                listener.onVideoUploaded(document);
                                return;
                            }
                        }
                        if (document.id == 0 || document.access_hash == 0) {
                            richMediaUploader.finished = true;
                            richMediaUploader.teardown$1();
                            listener.onError();
                            return;
                        }
                        richMediaUploader.finished = true;
                        richMediaUploader.teardown$1();
                        if (!TextUtils.isEmpty(richMediaUploader.documentThumbPath) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            int i4 = richMediaUploader.currentAccount;
                            FileLoader.getInstance(i4).setLocalPathTo(closestPhotoSizeWithSize, richMediaUploader.documentThumbPath);
                            AndroidUtilities.copyFileSafe(new File(richMediaUploader.documentThumbPath), FileLoader.getInstance(i4).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        listener.onDocumentUploaded(document);
                        return;
                    }
                } else if ((tLObject2 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo) != null) {
                    richMediaUploader.finished = true;
                    richMediaUploader.teardown$1();
                    listener.onPhotoUploaded(photo);
                    return;
                }
                richMediaUploader.finished = true;
                richMediaUploader.teardown$1();
                listener.onError();
                return;
            case 17:
                RichMediaUploader richMediaUploader2 = (RichMediaUploader) this.f$0;
                if (richMediaUploader2.cancelled || richMediaUploader2.finished) {
                    return;
                }
                richMediaUploader2.beginUpload((String) this.f$1);
                return;
            case 18:
                BotWebViewContainer.BotWebViewProxy botWebViewProxy = (BotWebViewContainer.BotWebViewProxy) this.f$0;
                if (botWebViewProxy == null || (botWebViewContainer = botWebViewProxy.container) == null || (delegate = botWebViewContainer.delegate) == null) {
                    return;
                }
                delegate.onSharedTo((ArrayList) this.f$1);
                return;
            case 19:
                ArrayList arrayList2 = BrowserHistory.history;
                int i5 = 0;
                ArrayList arrayList3 = (ArrayList) this.f$0;
                arrayList2.addAll(0, arrayList3);
                int i6 = 0;
                while (true) {
                    LongSparseArray longSparseArray = (LongSparseArray) this.f$1;
                    if (i6 >= longSparseArray.size()) {
                        BrowserHistory.historyLoaded = true;
                        BrowserHistory.historyLoading = false;
                        ArrayList arrayList4 = BrowserHistory.callbacks;
                        if (arrayList4 != null) {
                            int size = arrayList4.size();
                            while (i5 < size) {
                                Object obj = arrayList4.get(i5);
                                i5++;
                                ((Utilities.Callback) obj).run(arrayList3);
                            }
                            BrowserHistory.callbacks = null;
                            return;
                        }
                        return;
                    }
                    BrowserHistory.historyById.put(longSparseArray.keyAt(i6), (BrowserHistory.Entry) longSparseArray.valueAt(i6));
                    i6++;
                }
                break;
            case 20:
                HistoryFragment historyFragment = HistoryFragment.this;
                historyFragment.searchResults.clear();
                historyFragment.searchResults.addAll((ArrayList) this.f$1);
                historyFragment.searchLoading = false;
                UniversalFragment.AnonymousClass3 anonymousClass3 = historyFragment.listView;
                if (anonymousClass3 != null) {
                    anonymousClass3.adapter.update(true);
                    return;
                }
                return;
            case 21:
                boolean z6 = ((WebInstantView.Loader) this.f$1).getWebPage() != null;
                ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) this.f$0;
                actionBarMenuSubItem.setEnabled(z6);
                actionBarMenuSubItem.animate().alpha(actionBarMenuSubItem.isEnabled() ? 1.0f : 0.5f);
                return;
            case 22:
                ((ArticleViewer.AnonymousClass15) this.f$0).menuListener.run((Integer) this.f$1);
                return;
            case 23:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getMessagesController().removeWebBrowserException((String) this.f$1);
                webBrowserSettings.listView.adapter.update(true);
                return;
            case 24:
                WebInstantView.Loader loader = (WebInstantView.Loader) this.f$0;
                loader.gotRemote = true;
                TLObject tLObject3 = (TLObject) this.f$1;
                int i7 = 0;
                if (tLObject3 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject3;
                    int i8 = loader.currentAccount;
                    MessagesController.getInstance(i8).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i8).putChats(tL_messages_webPage.chats, false);
                    loader.remotePage = tL_messages_webPage.webpage;
                } else if (tLObject3 instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject3;
                    if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                        loader.remotePage = tL_webPage;
                    } else {
                        loader.remotePage = null;
                    }
                } else {
                    loader.remotePage = null;
                }
                TLRPC.WebPage webPage = loader.remotePage;
                if (webPage != null && webPage.cached_page == null) {
                    loader.remotePage = null;
                }
                if (!SharedConfig.onlyLocalInstantView && loader.remotePage != null && (webInstantView$$ExternalSyntheticLambda1 = loader.cancelLocal) != null) {
                    webInstantView$$ExternalSyntheticLambda1.run();
                }
                ArrayList arrayList5 = loader.listeners;
                int size2 = arrayList5.size();
                while (i7 < size2) {
                    Object obj2 = arrayList5.get(i7);
                    i7++;
                    ((Runnable) obj2).run();
                }
                return;
            default:
                ((WebInstantView.Loader) this.f$0).listeners.remove((RichTableCell$$ExternalSyntheticLambda3) this.f$1);
                return;
        }
    }
}
