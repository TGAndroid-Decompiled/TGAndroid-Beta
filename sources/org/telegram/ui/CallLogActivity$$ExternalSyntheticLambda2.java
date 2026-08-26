package org.telegram.ui;

import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class CallLogActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final CallLogActivity f$0;

    public CallLogActivity$$ExternalSyntheticLambda2(CallLogActivity callLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity callLogActivity = this.f$0;
                ItemOptions itemOptions = new ItemOptions(callLogActivity, callLogActivity.otherItem, false, true);
                itemOptions.dimAlpha = 8;
                if (callLogActivity.getUserConfig().showCallsTab) {
                    itemOptions.add(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new CallLogActivity$$ExternalSyntheticLambda7(callLogActivity, 2), false);
                }
                itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new CallLogActivity$$ExternalSyntheticLambda7(callLogActivity, 3), true);
                itemOptions.show();
                itemOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
                break;
            case 1:
                CallLogActivity callLogActivity2 = this.f$0;
                callLogActivity2.getClass();
                Long l = (Long) view.getTag();
                ChatObject.Call groupCall = callLogActivity2.getMessagesController().getGroupCall(l.longValue(), false);
                TLRPC.Chat chat = callLogActivity2.getMessagesController().getChat(l);
                callLogActivity2.lastCallChat = chat;
                if (groupCall == null) {
                    callLogActivity2.waitingForCallChatId = l;
                    callLogActivity2.getMessagesController().loadFullChat(l.longValue(), 0, true);
                } else {
                    VoIPHelper.startCall(chat, null, false, null, callLogActivity2.getParentActivity(), callLogActivity2, callLogActivity2.getAccountInstance());
                }
                break;
            case 2:
                this.f$0.hideActionMode(true);
                break;
            default:
                CallLogActivity callLogActivity3 = this.f$0;
                callLogActivity3.getClass();
                callLogActivity3.presentFragment(new CallLogActivity.AnonymousClass9(zzkw.m("isCall", true), callLogActivity3.getCurrentAccount(), callLogActivity3));
                break;
        }
    }
}
