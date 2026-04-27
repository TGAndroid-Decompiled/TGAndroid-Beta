package org.telegram.ui.Components.poll;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
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
        if (arrayList == null || arrayList.isEmpty()) {
            return i2;
        }
        return !tL_messageMediaPoll.poll.countries_iso2.contains(MessagesController.getInstance(i).config.phoneCountryIso2.get()) ? i2 | 4 : i2;
    }

    public static CharSequence getVoteRestrictedToastText(MessageObject messageObject, int i) {
        int i2;
        int i3;
        if (messageObject.type != 17) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        int i4 = messageObject.currentAccount;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(message, TLRPC.TL_messageMediaPoll.class);
        if (tL_messageMediaPoll == null) {
            return null;
        }
        if (BitwiseUtils.hasFlag(i, 4)) {
            ArrayList arrayList = new ArrayList(tL_messageMediaPoll.poll.countries_iso2.size());
            Iterator<String> it = tL_messageMediaPoll.poll.countries_iso2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String countryName = LocaleController.getCountryName(next);
                if (!TextUtils.isEmpty(countryName)) {
                    next = countryName;
                }
                arrayList.add(next);
            }
            boolean z = tL_messageMediaPoll.poll.subscribers_only;
            if (arrayList.size() == 1) {
                if (z) {
                    i3 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOne;
                } else {
                    i3 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOne;
                }
                return AndroidUtilities.replaceTags(LocaleController.formatString(i3, arrayList.get(0)));
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i5 = 0; i5 < arrayList.size() - 1; i5++) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append((String) arrayList.get(i5));
            }
            if (z) {
                i2 = R.string.PollV2ToastOnlySubscribersFromCountriesCanVoteOther;
            } else {
                i2 = R.string.PollV2ToastOnlyUsersFromCountriesCanVoteOther;
            }
            return AndroidUtilities.replaceTags(LocaleController.formatString(i2, stringBuffer, arrayList.get(arrayList.size() - 1)));
        }
        if (BitwiseUtils.hasFlag(i, 1)) {
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            return AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2ToastOnlySubscribersCanVote, DialogObject.getShortName(MessagesController.getInstance(i4).getChat(Long.valueOf(-(messageFwdHeader != null ? DialogObject.getPeerDialogId(messageFwdHeader.from_id) : messageObject.getDialogId()))))));
        }
        if (BitwiseUtils.hasFlag(i, 2)) {
            return AndroidUtilities.replaceTags(LocaleController.getString(R.string.PollV2ToastOnlySubscribersJoined24hCanVote));
        }
        return null;
    }
}
