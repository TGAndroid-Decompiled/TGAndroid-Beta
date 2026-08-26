package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.SearchTagsList;

public final class PassportActivity$$ExternalSyntheticLambda52 implements SynchronizationGuard.CriticalSection, ListenerSet.Event, NativeInstance.PayloadCallback, MediaDataController.KeywordResultCallback, AlertDialog.OnButtonClickListener, Utilities.Callback3Return {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public PassportActivity$$ExternalSyntheticLambda52(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$1 = i;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    @Override
    public Object execute() {
        ((Uploader) this.f$0).workScheduler.schedule((AutoValue_TransportContext) this.f$2, this.f$1 + 1, false);
        return null;
    }

    @Override
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        int i = this.f$1;
        listener.onPositionDiscontinuity(i);
        listener.onPositionDiscontinuity((Player.PositionInfo) this.f$0, (Player.PositionInfo) this.f$2, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 5:
                BusinessLinksActivity.AnonymousClass1 anonymousClass1 = (BusinessLinksActivity.AnonymousClass1) this.f$0;
                String string = anonymousClass1.getText().toString();
                if (string.length() <= 32) {
                    BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.f$1);
                    TL_account.TL_businessChatLink tL_businessChatLinkFindLink = businessLinksController.findLink(((TL_account.TL_businessChatLink) this.f$2).link);
                    if (tL_businessChatLinkFindLink != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = tL_businessChatLinkFindLink.message;
                        tL_inputBusinessChatLink.entities = tL_businessChatLinkFindLink.entities;
                        tL_inputBusinessChatLink.title = string;
                        businessLinksController.editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, null);
                    }
                    alertDialog.dismiss();
                } else {
                    AndroidUtilities.shakeView(anonymousClass1);
                }
                break;
            case 6:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                MessagesController messagesController = chatActivity.getMessagesController();
                TLRPC.Chat chat = chatActivity.currentChat;
                TLRPC.User user = chatActivity.currentUser;
                boolean[] zArr = (boolean[]) this.f$2;
                messagesController.pinMessage(chat, user, this.f$1, false, !zArr[1], zArr[0]);
                Bulletin bulletinCreatePinMessageBulletin = BulletinFactory.createPinMessageBulletin(chatActivity, true, null, null, chatActivity.themeDelegate);
                bulletinCreatePinMessageBulletin.show();
                Bulletin.Layout layout = bulletinCreatePinMessageBulletin.layout;
                layout.postDelayed(new ChatActivity$$ExternalSyntheticLambda420(layout, 0), 550L);
                break;
            case 7:
                ((ChatActivity) this.f$0).lambda$shareMyContact$128((MessageObject) this.f$2, this.f$1);
                break;
            case 8:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$2;
                String strTrim = editTextBoldCursor.getText().toString().trim();
                if (strTrim.length() <= this.f$1 && !strTrim.isEmpty()) {
                    ((MessagesStorage.StringCallback) this.f$0).run(strTrim);
                    alertDialog.dismiss();
                } else {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                }
                break;
            case 9:
                SearchTagsList.AnonymousClass4 anonymousClass4 = (SearchTagsList.AnonymousClass4) this.f$0;
                String string2 = anonymousClass4.getText().toString();
                if (string2.length() <= 12) {
                    MessagesController.getInstance(this.f$1).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL((TLRPC.Reaction) this.f$2), string2);
                    alertDialog.dismiss();
                } else {
                    AndroidUtilities.shakeView(anonymousClass4);
                }
                break;
            case 10:
            default:
                ((StickersActivity) this.f$0).lambda$processSelectionMenu$13(this.f$1, (ArrayList) this.f$2);
                break;
            case 11:
                GroupCallActivity.AnonymousClass6 anonymousClass6 = GroupCallActivity.AnonymousClass6.this;
                ChatObject.Call call = GroupCallActivity.this.call;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f$2;
                String string3 = editTextBoldCursor2.getText().toString();
                int i2 = this.f$1;
                call.toggleRecord(string3, i2);
                AndroidUtilities.hideKeyboard(editTextBoldCursor2);
                GroupCallActivity.this.getUndoView().showWithAction(0L, i2 == 0 ? 39 : 100, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playStartRecordSound();
                }
                break;
            case 12:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                ArrayList arrayList = launchActivity.mainFragmentsStack;
                if (!arrayList.isEmpty() && AndroidUtilities.isMapsInstalled((BaseFragment) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList))) {
                    LocationActivity locationActivity = new LocationActivity(0);
                    locationActivity.delegate = new LaunchActivity$$ExternalSyntheticLambda9((HashMap) this.f$2, this.f$1, 10);
                    launchActivity.presentFragment(locationActivity);
                }
                break;
            case 13:
                ((LocationActivity) this.f$0).shareLiveLocation(900, (TLRPC.User) this.f$2, this.f$1);
                break;
            case 14:
                ((PasscodeActivity) this.f$0).lambda$createView$4((NumberPicker) this.f$2, this.f$1);
                break;
            case 15:
                ((SessionsActivity) this.f$0).lambda$createView$19(this.f$1, (boolean[]) this.f$2);
                break;
        }
    }

    @Override
    public void run(int i, String str) {
        ((VoIPService) this.f$0).lambda$createGroupInstance$66(this.f$1, (boolean[]) this.f$2, i, str);
    }

    public PassportActivity$$ExternalSyntheticLambda52(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        TLRPC.Document document = (TLRPC.Document) obj2;
        int i = this.f$1;
        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, "😀", Integer.valueOf(i));
        String str = TextUtils.isEmpty(strFindAnimatedEmojiEmoticon) ? "😀" : strFindAnimatedEmojiEmoticon;
        AlertDialog alertDialog = new AlertDialog((Context) this.f$0, 3, null);
        TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
        tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(((TLRPC.TL_messages_stickerSet) this.f$2).set);
        tL_stickers_addStickerToSet.sticker = MediaDataController.getInputStickerSetItem(document, str);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_addStickerToSet, new GroupCallSheet$$ExternalSyntheticLambda0(alertDialog, i, document, obj, tL_stickers_addStickerToSet, 7));
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        try {
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 350L);
        } catch (Exception unused) {
        }
        return Boolean.TRUE;
    }

    public PassportActivity$$ExternalSyntheticLambda52(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }

    public PassportActivity$$ExternalSyntheticLambda52(EditTextBoldCursor editTextBoldCursor, int i, MessagesStorage.StringCallback stringCallback) {
        this.$r8$classId = 8;
        this.f$2 = editTextBoldCursor;
        this.f$1 = i;
        this.f$0 = stringCallback;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        StickersSearchAdapter.AnonymousClass1 anonymousClass1 = (StickersSearchAdapter.AnonymousClass1) this.f$0;
        StickersSearchAdapter stickersSearchAdapter = StickersSearchAdapter.this;
        if (this.f$1 != stickersSearchAdapter.emojiSearchId) {
            return;
        }
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            String str2 = ((MediaDataController.KeywordResult) arrayList.get(i)).emoji;
            HashMap map = (HashMap) this.f$2;
            ArrayList arrayList2 = map != null ? (ArrayList) map.get(str2) : null;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                anonymousClass1.clear();
                HashMap map2 = stickersSearchAdapter.emojiStickers;
                if (!map2.containsKey(arrayList2)) {
                    map2.put(arrayList2, str2);
                    stickersSearchAdapter.emojiArrays.add(arrayList2);
                    z = true;
                }
            }
        }
        if (z) {
            stickersSearchAdapter.notifyDataSetChanged();
        }
    }
}
