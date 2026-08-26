package org.telegram.ui.community;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda31;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.UItem;

public final class CommunitySheet$$ExternalSyntheticLambda1 implements Utilities.Callback5, OnApplyWindowInsetsListener, Utilities.Callback5Return {
    public final int $r8$classId;
    public final CommunitySheet f$0;

    public CommunitySheet$$ExternalSyntheticLambda1(CommunitySheet communitySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = communitySheet;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        CommunitySheet communitySheet = this.f$0;
        communitySheet.getClass();
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        communitySheet.systemAndImeInsets = impl.getInsets(527);
        communitySheet.systemInsets = impl.getInsets(519);
        communitySheet.filteredSearchView.setPagesPaddings(AndroidUtilities.dp(56.0f) + communitySheet.systemAndImeInsets.top, communitySheet.systemAndImeInsets.bottom, false);
        communitySheet.communityPageFadeView.invalidate();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zCanRemoveBotFromCommunity;
        long j;
        boolean z;
        boolean z2;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i = CommunitySheet.$r8$clinit;
        CommunitySheet communitySheet = this.f$0;
        communitySheet.getClass();
        Object obj6 = ((UItem) obj).object;
        boolean z3 = false;
        if (!(obj6 instanceof TLRPC.Chat)) {
            if (obj6 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj6;
                long j2 = user.id;
                boolean zIsBot = UserObject.isBot(user);
                zCanRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, communitySheet.currentCommunity);
                j = j2;
                z = false;
                z2 = zIsBot;
            }
            return Boolean.valueOf(z3);
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj6;
        long j3 = -chat.id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        zCanRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, communitySheet.currentCommunity);
        j = j3;
        z2 = false;
        z = zIsChannelAndNotMegaGroup;
        if (zCanRemoveBotFromCommunity) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(communitySheet.container, null, view);
            itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), new ChatActivity$$ExternalSyntheticLambda31(communitySheet, z2, z, j, 3), true);
            itemOptionsMakeOptions.setScrimViewBackground(communitySheet.communityPage.listView.getClipBackground(view, true));
            itemOptionsMakeOptions.show();
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CommunitySheet communitySheet = this.f$0;
        UItem uItem = (UItem) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        switch (this.$r8$classId) {
            case 0:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                communitySheet.onClickChatToAdd(uItem);
                break;
            case 1:
            default:
                num.intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                int i = CommunitySheet.$r8$clinit;
                communitySheet.checkPendingRequestClick(uItem);
                break;
            case 2:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i2 = CommunitySheet.$r8$clinit;
                communitySheet.onClickChatToAdd(uItem);
                break;
            case 3:
                num.getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                CommunitySheet.access$3100(communitySheet, uItem, view);
                break;
        }
    }
}
