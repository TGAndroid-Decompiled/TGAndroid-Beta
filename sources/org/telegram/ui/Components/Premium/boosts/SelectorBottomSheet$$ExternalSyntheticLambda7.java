package org.telegram.ui.Components.Premium.boosts;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;

public final class SelectorBottomSheet$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final SelectorBottomSheet f$0;
    public final boolean f$1;

    public SelectorBottomSheet$$ExternalSyntheticLambda7(SelectorBottomSheet selectorBottomSheet, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = selectorBottomSheet;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Pair pair = (Pair) obj;
                boolean z = this.f$1;
                SelectorBottomSheet selectorBottomSheet = this.f$0;
                if (z) {
                    HashMap map = selectorBottomSheet.countriesMap;
                    map.putAll((Map) pair.first);
                    selectorBottomSheet.countriesLetters.addAll((Collection) pair.second);
                    j$.util.Map.EL.forEach(map, new SelectorBottomSheet$$ExternalSyntheticLambda16(selectorBottomSheet, 0));
                }
                if (selectorBottomSheet.type == 3) {
                    selectorBottomSheet.updateList$1(true, true);
                    selectorBottomSheet.scrollToTop(true);
                }
                break;
            default:
                List list = (List) obj;
                boolean z2 = this.f$1;
                SelectorBottomSheet selectorBottomSheet2 = this.f$0;
                if (z2) {
                    selectorBottomSheet2.users.addAll(list);
                }
                if (selectorBottomSheet2.type == 1) {
                    ArrayList arrayList = selectorBottomSheet2.peers;
                    arrayList.clear();
                    arrayList.addAll(list);
                    selectorBottomSheet2.updateList$1(true, true);
                    selectorBottomSheet2.scrollToTop(true);
                }
                break;
        }
    }
}
