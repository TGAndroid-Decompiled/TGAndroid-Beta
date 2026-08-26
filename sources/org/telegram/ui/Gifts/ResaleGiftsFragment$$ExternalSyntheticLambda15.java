package org.telegram.ui.Gifts;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.UItem;

public final class ResaleGiftsFragment$$ExternalSyntheticLambda15 implements Utilities.Callback5 {
    public final int $r8$classId;
    public final ResaleGiftsFragment f$0;
    public final ItemOptions f$1;

    public ResaleGiftsFragment$$ExternalSyntheticLambda15(ResaleGiftsFragment resaleGiftsFragment, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = resaleGiftsFragment;
        this.f$1 = itemOptions;
    }

    @Override
    public final void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.$r8$classId;
        UItem uItem = (UItem) obj;
        ResaleGiftsFragment resaleGiftsFragment = this.f$0;
        resaleGiftsFragment.getClass();
        switch (i) {
            case 0:
                long j = ((TL_stars.starGiftAttributePattern) uItem.object).document.id;
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = resaleGiftsFragment.list;
                boolean zContains = resaleGiftsList.notSelectedPatternAttributes.contains(Long.valueOf(j));
                HashSet hashSet = resaleGiftsList.notSelectedPatternAttributes;
                if (zContains) {
                    hashSet.remove(Long.valueOf(j));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = resaleGiftsList.patternAttributes;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj6 = arrayList.get(i2);
                        i2++;
                        long j2 = ((TL_stars.starGiftAttributePattern) obj6).document.id;
                        if (j2 != j) {
                            hashSet.add(Long.valueOf(j2));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j));
                }
                resaleGiftsList.reload();
                this.f$1.dismiss();
                break;
            case 1:
                int i3 = ((TL_stars.starGiftAttributeBackdrop) uItem.object).backdrop_id;
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = resaleGiftsFragment.list;
                boolean zContains2 = resaleGiftsList2.notSelectedBackdropAttributes.contains(Integer.valueOf(i3));
                HashSet hashSet2 = resaleGiftsList2.notSelectedBackdropAttributes;
                if (zContains2) {
                    hashSet2.remove(Integer.valueOf(i3));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = resaleGiftsList2.backdropAttributes;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj7 = arrayList2.get(i4);
                        i4++;
                        int i5 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                        if (i5 != i3) {
                            hashSet2.add(Integer.valueOf(i5));
                        }
                    }
                } else {
                    hashSet2.add(Integer.valueOf(i3));
                }
                resaleGiftsList2.reload();
                this.f$1.dismiss();
                break;
            default:
                long j3 = ((TL_stars.starGiftAttributeModel) uItem.object).document.id;
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = resaleGiftsFragment.list;
                boolean zContains3 = resaleGiftsList3.notSelectedModelAttributes.contains(Long.valueOf(j3));
                HashSet hashSet3 = resaleGiftsList3.notSelectedModelAttributes;
                if (zContains3) {
                    hashSet3.remove(Long.valueOf(j3));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = resaleGiftsList3.modelAttributes;
                    int size3 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj8 = arrayList3.get(i6);
                        i6++;
                        long j4 = ((TL_stars.starGiftAttributeModel) obj8).document.id;
                        if (j4 != j3) {
                            hashSet3.add(Long.valueOf(j4));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j3));
                }
                resaleGiftsList3.reload();
                this.f$1.dismiss();
                break;
        }
    }
}
