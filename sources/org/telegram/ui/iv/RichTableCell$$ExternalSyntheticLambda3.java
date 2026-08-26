package org.telegram.ui.iv;

import android.content.ClipboardManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.web.BotWebViewContainer;
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
                ((SelectAudioAlert) this.f$0).lambda$loadSharedAudio$2((TLObject) this.f$1);
                return;
            case 2:
                StoryEntry storyEntry = (StoryEntry) this.f$0;
                storyEntry.checkStickersReqId = 0;
                TLObject tLObject = (TLObject) this.f$1;
                if (tLObject instanceof Vector) {
                    storyEntry.editStickers = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i = 0; i < vector.objects.size(); i++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i);
                        TLRPC.Document document2 = stickerSetCovered.cover;
                        if (document2 == null && !stickerSetCovered.covers.isEmpty()) {
                            document2 = stickerSetCovered.covers.get(0);
                        }
                        if (document2 == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document2 = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document2 != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            storyEntry.editStickers.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 3:
                ((StoryLinkSheet) this.f$0).lambda$new$5((TLObject) this.f$1);
                return;
            case 4:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                ClipboardManager clipboardManager = (ClipboardManager) storyLinkSheet.getContext().getSystemService("clipboard");
                EditTextCell editTextCell = storyLinkSheet.urlEditText;
                boolean z = (TextUtils.isEmpty(editTextCell.editText.getText()) || TextUtils.equals(editTextCell.editText.getText(), "https://") || TextUtils.isEmpty(editTextCell.editText.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                OKLCH.m(((TextView) this.f$1).animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f), CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
                return;
            case 5:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = (StoryPrivacyBottomSheet) this.f$0;
                storyPrivacyBottomSheet.getClass();
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f$1).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(6, storyPrivacyBottomSheet, smallGroupsParticipantsCount));
                return;
            case 6:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = (StoryPrivacyBottomSheet) this.f$0;
                if (storyPrivacyBottomSheet2.smallChatsParticipantsCount == null) {
                    storyPrivacyBottomSheet2.smallChatsParticipantsCount = new HashMap();
                }
                storyPrivacyBottomSheet2.smallChatsParticipantsCount.putAll((HashMap) this.f$1);
                return;
            case 7:
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                storyRecorder.getClass();
                ((ButtonWithCounterView$$ExternalSyntheticLambda1) this.f$1).run();
                storyRecorder.upload$1();
                return;
            case 8:
                StoryRecorder storyRecorder2 = (StoryRecorder) this.f$0;
                storyRecorder2.animateGalleryListView(false);
                AndroidUtilities.cancelRunOnUIThread(storyRecorder2.afterPlayerAwait);
                storyRecorder2.afterPlayerAwait = null;
                storyRecorder2.awaitingPlayer = false;
                ((Runnable) this.f$1).run();
                return;
            case 9:
                TimelineView.VideoThumbsLoader videoThumbsLoader = (TimelineView.VideoThumbsLoader) this.f$0;
                if (!videoThumbsLoader.loading || videoThumbsLoader.destroyed) {
                    return;
                }
                videoThumbsLoader.frames.add(new TimelineView.VideoThumbsLoader.BitmapFrame(videoThumbsLoader, (Bitmap) this.f$1));
                videoThumbsLoader.loading = false;
                TimelineView.this.invalidate();
                return;
            case 10:
                int[] iArr = (int[]) this.f$0;
                int i2 = iArr[0];
                if (i2 != 0) {
                    ((ConnectionsManager) this.f$1).cancelRequest(i2, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 11:
                AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) this.f$0;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f$1;
                if (userFull != null) {
                    affiliateProgramFragment.new_program = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    affiliateProgramFragment.program = starrefprogram;
                    if (starrefprogram == null) {
                        affiliateProgramFragment.new_program = true;
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        starrefprogram2.commission_permille = Utilities.clamp(50, affiliateProgramFragment.getMessagesController().starrefMaxCommissionPermille, affiliateProgramFragment.getMessagesController().starrefMinCommissionPermille);
                        starrefprogram2.duration_months = 1;
                        affiliateProgramFragment.program = starrefprogram2;
                        affiliateProgramFragment.initialProgram = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram3 = new TL_payments.starRefProgram();
                        affiliateProgramFragment.initialProgram = starrefprogram3;
                        TL_payments.starRefProgram starrefprogram4 = affiliateProgramFragment.program;
                        starrefprogram3.commission_permille = starrefprogram4.commission_permille;
                        starrefprogram3.duration_months = starrefprogram4.duration_months;
                    }
                }
                affiliateProgramFragment.update$2(true);
                return;
            case 12:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                BulletinFactory.of(botWebViewSheet.bulletinContainer, botWebViewSheet.resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags((String) this.f$1)).setDuration(5000).show(true);
                return;
            case 13:
                BotWebViewSheet botWebViewSheet2 = (BotWebViewSheet) this.f$0;
                botWebViewSheet2.getClass();
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f$1;
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                botWebViewSheet2.applyAppBotSettings(botappsettings, true);
                return;
            case 14:
                BotWebViewSheet botWebViewSheet3 = (BotWebViewSheet) this.f$0;
                if (botWebViewSheet3.dismissed) {
                    return;
                }
                if (((TLRPC.TL_error) this.f$1) != null) {
                    botWebViewSheet3.dismiss$1(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(botWebViewSheet3.pollRunnable, 60000L);
                    return;
                }
            case 15:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment.getMessagesController().openApp((TLRPC.User) this.f$1, channelAffiliateProgramsFragment.getClassGuid());
                return;
            case 16:
                ChannelAffiliateProgramsFragment channelAffiliateProgramsFragment2 = (ChannelAffiliateProgramsFragment) this.f$0;
                channelAffiliateProgramsFragment2.getClass();
                channelAffiliateProgramsFragment2.presentFragment(ChatActivity.of(((TL_payments.connectedBotStarRef) this.f$1).bot_id));
                return;
            case 17:
                ((ChatAttachAlertBotWebViewLayout) this.f$0).lambda$new$0((TLRPC.TL_error) this.f$1);
                return;
            case 18:
                ((ChatAttachAlertBotWebViewLayout) this.f$0).lambda$showJustAddedBulletin$14((String) this.f$1);
                return;
            case 19:
                CommunityPendingRequestsActivity communityPendingRequestsActivity = (CommunityPendingRequestsActivity) this.f$0;
                communityPendingRequestsActivity.getClass();
                communityPendingRequestsActivity.presentFragment(ChatActivity.of(((CommunityPendingRequestCell.Data) this.f$1).requestFromUser.id));
                return;
            case 20:
                CommunitySheet communitySheet = (CommunitySheet) this.f$0;
                communitySheet.getClass();
                communitySheet.parentFragment.presentFragment(ChatActivity.of(((CommunityPendingRequestCell.Data) this.f$1).requestFromUser.id));
                return;
            case 21:
                boolean z2 = false;
                Latex latexRender = Latex.render(((String[]) this.f$0)[0], AndroidUtilities.dp(26.0f), false);
                if (latexRender == null) {
                    latexRender = Latex.render(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z2 = true;
                }
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((Utilities.Callback2) this.f$1, latexRender != null ? (Bitmap) latexRender.bitmap : null, z2, 14));
                return;
            case 22:
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) this.f$0;
                richAIComposeSheet.loading = false;
                richAIComposeSheet.reqId = 0;
                ButtonWithCounterView buttonWithCounterView = richAIComposeSheet.button;
                buttonWithCounterView.setLoading(false);
                TLObject tLObject2 = (TLObject) this.f$1;
                if (!(tLObject2 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject2).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(buttonWithCounterView, 4.0f);
                    return;
                }
                richAIComposeSheet.result = richMessage;
                richAIComposeSheet.previewView.set(richMessage);
                buttonWithCounterView.setText(LocaleController.getString(R.string.ArticleAIAddToPage), true);
                richAIComposeSheet.updateButtonEnabled();
                UniversalAdapter universalAdapter = richAIComposeSheet.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                    return;
                }
                return;
            case 23:
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
                if (TextUtils.isEmpty(absolutePath) || !Theme.ResourcesProvider.CC.m(absolutePath)) {
                    try {
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
                    if (TextUtils.isEmpty(string)) {
                        string = "document_" + SharedConfig.getLastLocalId();
                    }
                    strReplace = string.replace('/', '_').replace('\\', '_');
                } else {
                    str = absolutePath;
                }
                if (TextUtils.isEmpty(str) || !Theme.ResourcesProvider.CC.m(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(25, richEditorListView, str));
                return;
            case 24:
                RichEditorListView richEditorListView2 = (RichEditorListView) this.f$0;
                richEditorListView2.getClass();
                RichEditorHistory.FocusState focusState = (RichEditorHistory.FocusState) this.f$1;
                long j = focusState.rowId;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = richEditorListView2.rows;
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                    } else if (((BlockRow) arrayList.get(i3)).id != j) {
                        i3++;
                    }
                }
                if (i3 < 0) {
                    return;
                }
                KeyEvent.Callback callbackFindViewByPosition = richEditorListView2.layoutManager.findViewByPosition(i3);
                boolean z3 = callbackFindViewByPosition instanceof RichTextCell;
                int i4 = focusState.selEnd;
                int i5 = focusState.selStart;
                if (z3) {
                    RichTextCell richTextCell = (RichTextCell) callbackFindViewByPosition;
                    richTextCell.editText.requestEditFocus();
                    RichEditText editText = richTextCell.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i5, length)), Math.max(0, Math.min(i4, length)));
                    return;
                }
                if (!(callbackFindViewByPosition instanceof RichTableCell)) {
                    if (callbackFindViewByPosition instanceof RichCaptionHost) {
                        RichEditText captionEditText = ((RichCaptionHost) callbackFindViewByPosition).getCaptionEditText();
                        captionEditText.requestEditFocus();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i5, length2)), Math.max(0, Math.min(i4, length2)));
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
                richEditTextEditTextForChildPos.setSelection(Math.max(0, Math.min(i5, length3)), Math.max(0, Math.min(i4, length3)));
                return;
            case 25:
                ((RichEditorListView) this.f$0).attachDocument((String) this.f$1);
                return;
            case 26:
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
            case 27:
                RichMediaUploader richMediaUploader = (RichMediaUploader) this.f$0;
                if (richMediaUploader.cancelled) {
                    return;
                }
                richMediaUploader.requestToken = 0;
                RichMediaUploader.Listener listener = richMediaUploader.listener;
                TLObject tLObject3 = (TLObject) this.f$1;
                boolean z4 = richMediaUploader.isVideo;
                boolean z5 = richMediaUploader.isDocument;
                boolean z6 = richMediaUploader.isAudio;
                if (z4 || z6 || z5) {
                    if ((tLObject3 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject3).document) != null) {
                        if (!z5) {
                            if (z6) {
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
                            int i6 = richMediaUploader.currentAccount;
                            FileLoader.getInstance(i6).setLocalPathTo(closestPhotoSizeWithSize, richMediaUploader.documentThumbPath);
                            AndroidUtilities.copyFileSafe(new File(richMediaUploader.documentThumbPath), FileLoader.getInstance(i6).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        listener.onDocumentUploaded(document);
                        return;
                    }
                } else if ((tLObject3 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo) != null) {
                    richMediaUploader.finished = true;
                    richMediaUploader.teardown$1();
                    listener.onPhotoUploaded(photo);
                    return;
                }
                richMediaUploader.finished = true;
                richMediaUploader.teardown$1();
                listener.onError();
                return;
            case 28:
                RichMediaUploader richMediaUploader2 = (RichMediaUploader) this.f$0;
                if (richMediaUploader2.cancelled || richMediaUploader2.finished) {
                    return;
                }
                richMediaUploader2.beginUpload((String) this.f$1);
                return;
            default:
                ((BotWebViewContainer) this.f$0).lambda$loadUrl$2((String) this.f$1);
                return;
        }
    }
}
