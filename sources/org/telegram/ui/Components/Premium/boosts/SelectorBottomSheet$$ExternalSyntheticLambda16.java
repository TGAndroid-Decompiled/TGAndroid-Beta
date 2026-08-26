package org.telegram.ui.Components.Premium.boosts;

import j$.util.function.BiConsumer$CC;
import java.util.List;
import java.util.function.BiConsumer;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;

public final class SelectorBottomSheet$$ExternalSyntheticLambda16 implements BiConsumer {
    public final int $r8$classId;
    public final BottomSheetWithRecyclerListView f$0;

    public SelectorBottomSheet$$ExternalSyntheticLambda16(BottomSheetWithRecyclerListView bottomSheetWithRecyclerListView, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheetWithRecyclerListView;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        List list = (List) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((SelectorBottomSheet) this.f$0).countriesList.addAll(list);
                break;
            default:
                ((CountrySelectBottomSheet) this.f$0).countriesList.addAll(list);
                break;
        }
    }

    public final BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.$r8$classId;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
