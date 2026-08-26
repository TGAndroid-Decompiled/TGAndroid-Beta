package org.telegram.ui.community;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UItem;

public final class CommunitySheet$$ExternalSyntheticLambda0 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final CommunitySheet f$0;

    public CommunitySheet$$ExternalSyntheticLambda0(CommunitySheet communitySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = communitySheet;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i = 1;
        CommunitySheet communitySheet = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                communitySheet.fillItemsChatsToAddImpl((ArrayList) obj, true);
                break;
            case 1:
                communitySheet.lambda$onLongClickCommunity$4((TLRPC.TL_error) obj2);
                break;
            case 2:
                communitySheet.lambda$loadChatsToAddToCommunity$8((ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i2 = CommunitySheet.$r8$clinit;
                communitySheet.fillItemsChatsToAddImpl((ArrayList) obj, false);
                break;
            case 4:
                CommunitySheet.access$3200(communitySheet, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int i3 = CommunitySheet.$r8$clinit;
                communitySheet.getClass();
                arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(communitySheet.currentCommunity)) {
                    arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new CommunitySheet$$ExternalSyntheticLambda2(communitySheet, i)), true)));
                } else {
                    arrayList.add(UItem.asShadow(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(UItem.asCustom(2, communitySheet.fakeAnchorView));
                CommunityUtils.PendingRequests pendingRequests = communitySheet.pendingRequestsList;
                arrayList.add(UItem.asHeader(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", pendingRequests.totalCount, new Object[0])));
                pendingRequests.fillItems(arrayList);
                break;
        }
    }
}
