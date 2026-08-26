package org.telegram.ui.Components.poll;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public abstract class PollUtils {
    public static int getVoteRestrictedFlags(MessageObject messageObject) {
        if (messageObject.type != 17) {
            return 0;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return 0;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        int i2 = poll.closed ? 8 : 0;
        if (poll.subscribers_only) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId())));
            if (chat != null) {
                if (chat.left || chat.kicked) {
                    i2 |= 1;
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                if ((messageFwdHeader2 != null ? messageFwdHeader2.date : message.date) - chat.date < 86400) {
                    i2 |= 2;
                }
            }
        }
        ArrayList<String> arrayList = tL_messageMediaPoll.poll.countries_iso2;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i).config.phoneCountryIso2.get())) {
                return i2 | 4;
            }
        }
        return i2;
    }

    public static SpannableStringBuilder getVoteRestrictedToastText(int i, MessageObject messageObject) {
        if (messageObject.type != 17) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i2 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return null;
        }
        if (!BitwiseUtils.hasFlag(i, 4)) {
            if (BitwiseUtils.hasFlag(i, 1)) {
                TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i2).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId()))))));
            }
            if (BitwiseUtils.hasFlag(i, 2)) {
                return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
        ArrayList<String> arrayList2 = tL_messageMediaPoll.poll.countries_iso2;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList2.get(i3);
            i3++;
            String str2 = str;
            String countryName = LocaleController.getCountryName(str2);
            if (!TextUtils.isEmpty(countryName)) {
                str2 = countryName;
            }
            arrayList.add(str2);
        }
        boolean z = tL_messageMediaPoll.poll.subscribers_only;
        if (arrayList.size() == 1) {
            return AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOne : R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOne, arrayList.get(0)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append((String) arrayList.get(i4));
        }
        return AndroidUtilities.replaceTags(LocaleController.formatString(z ? R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther : R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther, stringBuffer, Fragment$$ExternalSyntheticOutline0.m(1, arrayList)));
    }
}
