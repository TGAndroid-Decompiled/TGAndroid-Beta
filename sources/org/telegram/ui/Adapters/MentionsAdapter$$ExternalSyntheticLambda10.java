package org.telegram.ui.Adapters;

import android.hardware.Camera;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.TwoStepVerificationActivity;

public final class MentionsAdapter$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public MentionsAdapter$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3, boolean z, Serializable serializable, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$5 = obj3;
        this.f$2 = z;
        this.f$7 = serializable;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$6 = obj6;
    }

    @Override
    public final void run() {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                String str = mentionsAdapter.searchingContextQuery;
                String str2 = (String) this.f$1;
                if (str2.equals(str)) {
                    mentionsAdapter.contextQueryReqid = 0;
                    MentionsAdapter.MentionsAdapterDelegate mentionsAdapterDelegate = mentionsAdapter.delegate;
                    boolean z2 = this.f$2;
                    TLObject tLObject = (TLObject) this.f$3;
                    String str3 = (String) this.f$5;
                    if (z2 && tLObject == null) {
                        mentionsAdapter.searchForContextBotResults(false, (TLRPC.User) this.f$4, str2, str3);
                    } else if (mentionsAdapterDelegate != null) {
                        mentionsAdapterDelegate.onContextSearch(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z2 && tL_messages_botResults.cache_time != 0) {
                            ((MessagesStorage) this.f$6).saveBotCache((String) this.f$7, tL_messages_botResults);
                        }
                        mentionsAdapter.nextQueryOffset = tL_messages_botResults.next_offset;
                        if (mentionsAdapter.searchResultBotContextSwitch == null) {
                            mentionsAdapter.searchResultBotContextSwitch = tL_messages_botResults.switch_pm;
                        }
                        mentionsAdapter.searchResultBotWebViewSwitch = tL_messages_botResults.switch_webview;
                        int i = 0;
                        while (i < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i);
                                i--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i++;
                        }
                        if (mentionsAdapter.searchResultBotContext == null || str3.length() == 0) {
                            mentionsAdapter.searchResultBotContext = tL_messages_botResults.results;
                            mentionsAdapter.contextMedia = tL_messages_botResults.gallery;
                            z = false;
                        } else {
                            mentionsAdapter.searchResultBotContext.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                mentionsAdapter.nextQueryOffset = "";
                            }
                            z = true;
                        }
                        RemoteUtils$$ExternalSyntheticLambda2 remoteUtils$$ExternalSyntheticLambda2 = mentionsAdapter.cancelDelayRunnable;
                        if (remoteUtils$$ExternalSyntheticLambda2 != null) {
                            AndroidUtilities.cancelRunOnUIThread(remoteUtils$$ExternalSyntheticLambda2);
                            mentionsAdapter.cancelDelayRunnable = null;
                        }
                        mentionsAdapter.searchResultHashtags = null;
                        mentionsAdapter.stickers = null;
                        mentionsAdapter.searchResultUsernames = null;
                        mentionsAdapter.searchResultUsernamesMap = null;
                        mentionsAdapter.searchResultCommands = null;
                        mentionsAdapter.searchResultCommandsEphemeral = null;
                        mentionsAdapter.quickReplies = null;
                        mentionsAdapter.searchResultSuggestions = null;
                        mentionsAdapter.searchResultCommandsHelp = null;
                        mentionsAdapter.searchResultCommandsUsers = null;
                        mentionsAdapter.visibleByStickersSearch = false;
                        mentionsAdapterDelegate.needChangePanelVisibility((mentionsAdapter.searchResultBotContext.isEmpty() && mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? false : true);
                        if (!z) {
                            mentionsAdapter.notifyDataSetChanged();
                        } else {
                            int i2 = (mentionsAdapter.searchResultBotContextSwitch == null && mentionsAdapter.searchResultBotWebViewSwitch == null) ? 0 : 1;
                            mentionsAdapter.lambda$onBindViewHolder$31(((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2) - 1);
                            mentionsAdapter.notifyItemRangeInserted((mentionsAdapter.searchResultBotContext.size() - tL_messages_botResults.results.size()) + i2, tL_messages_botResults.results.size());
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((ContactsController) this.f$0).lambda$performSyncPhoneBook$19((HashMap) this.f$1, (HashMap) this.f$5, this.f$2, (HashMap) this.f$7, (ArrayList) this.f$3, (HashMap) this.f$4, (boolean[]) this.f$6);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$broadcastPinnedMessage$169((ArrayList) this.f$1, this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$7, (ArrayList) this.f$3, (LongSparseArray) this.f$4, (LongSparseArray) this.f$6);
                break;
            case 3:
                ((SendMessagesHelper) this.f$0).lambda$sendCallback$43((TLRPC.TL_error) this.f$1, (TLObject) this.f$3, (TwoStepVerificationActivity) this.f$5, this.f$2, (MessageObject) this.f$7, (TL_keyboard.KeyboardButtonProto) this.f$4, (ChatActivity) this.f$6);
                break;
            default:
                ((CameraController) this.f$0).lambda$recordVideo$14((Camera) this.f$1, (CameraSession) this.f$5, this.f$2, (File) this.f$7, (CameraInfo) this.f$3, (CameraController.VideoTakeCallback) this.f$4, (Runnable) this.f$6);
                break;
        }
    }

    public MentionsAdapter$$ExternalSyntheticLambda10(MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LongSparseArray longSparseArray, LongSparseArray longSparseArray2) {
        this.$r8$classId = 2;
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
        this.f$2 = z;
        this.f$5 = arrayList2;
        this.f$7 = arrayList3;
        this.f$3 = arrayList4;
        this.f$4 = longSparseArray;
        this.f$6 = longSparseArray2;
    }

    public MentionsAdapter$$ExternalSyntheticLambda10(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, ChatActivity chatActivity, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.$r8$classId = 3;
        this.f$0 = sendMessagesHelper;
        this.f$1 = tL_error;
        this.f$3 = tLObject;
        this.f$5 = twoStepVerificationActivity;
        this.f$2 = z;
        this.f$7 = messageObject;
        this.f$4 = keyboardButtonProto;
        this.f$6 = chatActivity;
    }

    public MentionsAdapter$$ExternalSyntheticLambda10(MentionsAdapter mentionsAdapter, String str, boolean z, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.$r8$classId = 0;
        this.f$0 = mentionsAdapter;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = tLObject;
        this.f$4 = user;
        this.f$5 = str2;
        this.f$6 = messagesStorage;
        this.f$7 = str3;
    }
}
