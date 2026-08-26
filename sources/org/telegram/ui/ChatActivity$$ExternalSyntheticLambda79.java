package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda79 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda79(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$25(tLObject);
                break;
            case 1:
                final ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                chatActivity.lambda$openAttachBotLayout$218(tLObject);
                                break;
                            case 1:
                                chatActivity.lambda$createMenu$253(tLObject);
                                break;
                            case 2:
                                ChatActivity chatActivity2 = chatActivity;
                                TLObject tLObject2 = tLObject;
                                chatActivity2.getClass();
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (BulletinFactory.canShowBulletin(chatActivity2)) {
                                            BulletinFactory.of(chatActivity2).createCopyLinkBulletin(!chatActivity2.isThreadChat() && tL_exportedMessageLink.link.contains("/c/")).show();
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                ChatActivity chatActivity3 = chatActivity;
                                chatActivity3.editingMessageObjectReqId = 0;
                                if (tLObject == null && chatActivity3.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity3.getParentActivity(), 0, chatActivity3.themeDelegate);
                                    String string = LocaleController.getString(R.string.AppName);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.EditMessageError);
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    chatActivity3.showDialog(alertDialog);
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity3.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.setEditingMessageObject(null, null, false);
                                        chatActivity3.hideFieldPanel(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                chatActivity2.lambda$openAttachBotLayout$218(tLObject);
                                break;
                            case 1:
                                chatActivity2.lambda$createMenu$253(tLObject);
                                break;
                            case 2:
                                ChatActivity chatActivity3 = chatActivity2;
                                TLObject tLObject2 = tLObject;
                                chatActivity3.getClass();
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (BulletinFactory.canShowBulletin(chatActivity3)) {
                                            BulletinFactory.of(chatActivity3).createCopyLinkBulletin(!chatActivity3.isThreadChat() && tL_exportedMessageLink.link.contains("/c/")).show();
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                ChatActivity chatActivity4 = chatActivity2;
                                chatActivity4.editingMessageObjectReqId = 0;
                                if (tLObject == null && chatActivity4.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity4.getParentActivity(), 0, chatActivity4.themeDelegate);
                                    String string = LocaleController.getString(R.string.AppName);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.EditMessageError);
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    chatActivity4.showDialog(alertDialog);
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity4.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.setEditingMessageObject(null, null, false);
                                        chatActivity4.hideFieldPanel(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                final int i3 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                chatActivity3.lambda$openAttachBotLayout$218(tLObject);
                                break;
                            case 1:
                                chatActivity3.lambda$createMenu$253(tLObject);
                                break;
                            case 2:
                                ChatActivity chatActivity4 = chatActivity3;
                                TLObject tLObject2 = tLObject;
                                chatActivity4.getClass();
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (BulletinFactory.canShowBulletin(chatActivity4)) {
                                            BulletinFactory.of(chatActivity4).createCopyLinkBulletin(!chatActivity4.isThreadChat() && tL_exportedMessageLink.link.contains("/c/")).show();
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                ChatActivity chatActivity5 = chatActivity3;
                                chatActivity5.editingMessageObjectReqId = 0;
                                if (tLObject == null && chatActivity5.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity5.getParentActivity(), 0, chatActivity5.themeDelegate);
                                    String string = LocaleController.getString(R.string.AppName);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.EditMessageError);
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    chatActivity5.showDialog(alertDialog);
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity5.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.setEditingMessageObject(null, null, false);
                                        chatActivity5.hideFieldPanel(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final ChatActivity chatActivity4 = this.f$0;
                chatActivity4.getClass();
                final int i4 = 3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                chatActivity4.lambda$openAttachBotLayout$218(tLObject);
                                break;
                            case 1:
                                chatActivity4.lambda$createMenu$253(tLObject);
                                break;
                            case 2:
                                ChatActivity chatActivity5 = chatActivity4;
                                TLObject tLObject2 = tLObject;
                                chatActivity5.getClass();
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (BulletinFactory.canShowBulletin(chatActivity5)) {
                                            BulletinFactory.of(chatActivity5).createCopyLinkBulletin(!chatActivity5.isThreadChat() && tL_exportedMessageLink.link.contains("/c/")).show();
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                ChatActivity chatActivity6 = chatActivity4;
                                chatActivity6.editingMessageObjectReqId = 0;
                                if (tLObject == null && chatActivity6.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(chatActivity6.getParentActivity(), 0, chatActivity6.themeDelegate);
                                    String string = LocaleController.getString(R.string.AppName);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.EditMessageError);
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    chatActivity6.showDialog(alertDialog);
                                    ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity6.chatActivityEnterView;
                                    if (anonymousClass39 != null) {
                                        anonymousClass39.setEditingMessageObject(null, null, false);
                                        chatActivity6.hideFieldPanel(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ChatActivity chatActivity5 = this.f$0;
                if (tL_error == null) {
                    chatActivity5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                } else {
                    chatActivity5.getClass();
                }
                break;
        }
    }
}
