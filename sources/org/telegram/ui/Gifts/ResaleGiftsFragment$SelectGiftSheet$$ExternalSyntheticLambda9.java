package org.telegram.ui.Gifts;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

public final class ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda9 implements Comparator {
    public final int $r8$classId;
    public final ResaleGiftsFragment.SelectGiftSheet.State f$0;

    public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda9(ResaleGiftsFragment.SelectGiftSheet.State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ResaleGiftsFragment.SelectGiftSheet.State state = this.f$0;
                Integer num = (Integer) state.resaleList.modelAttributesCounter.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num2 = (Integer) state.resaleList.modelAttributesCounter.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                ResaleGiftsFragment.SelectGiftSheet.State state2 = this.f$0;
                Integer num3 = (Integer) state2.resaleList.backdropAttributesCounter.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) state2.resaleList.backdropAttributesCounter.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                ResaleGiftsFragment.SelectGiftSheet.State state3 = this.f$0;
                Integer num5 = (Integer) state3.resaleList.patternAttributesCounter.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num6 = (Integer) state3.resaleList.patternAttributesCounter.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
