package org.telegram.ui.Components.Premium.boosts;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.BubbleActivity;

public final class SelectorBottomSheet$$ExternalSyntheticLambda3 implements Utilities.Callback {
    public final int $r8$classId;
    public final SelectorBottomSheet f$0;

    public SelectorBottomSheet$$ExternalSyntheticLambda3(SelectorBottomSheet selectorBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = selectorBottomSheet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                SelectorBottomSheet selectorBottomSheet = this.f$0;
                selectorBottomSheet.query = str;
                int i = selectorBottomSheet.type;
                BubbleActivity.AnonymousClass1 anonymousClass1 = selectorBottomSheet.remoteSearchRunnable;
                if (i == 1) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    AndroidUtilities.runOnUIThread(anonymousClass1, 350L);
                    break;
                } else if (i == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                        AndroidUtilities.runOnUIThread(anonymousClass1, 350L);
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                        ArrayList arrayList = selectorBottomSheet.peers;
                        arrayList.clear();
                        arrayList.addAll(BoostRepository.getMyChannels(selectorBottomSheet.currentChat.id));
                        selectorBottomSheet.updateItems(false, true);
                        selectorBottomSheet.scrollToTop(true);
                    }
                    break;
                } else if (i == 3) {
                    selectorBottomSheet.updateItems(false, true);
                    selectorBottomSheet.scrollToTop(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                SelectorBottomSheet selectorBottomSheet2 = this.f$0;
                if (!TextUtils.isEmpty(selectorBottomSheet2.query)) {
                    ArrayList arrayList2 = selectorBottomSheet2.peers;
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    selectorBottomSheet2.updateList$1(true, true);
                    selectorBottomSheet2.scrollToTop(true);
                    break;
                }
                break;
        }
    }
}
