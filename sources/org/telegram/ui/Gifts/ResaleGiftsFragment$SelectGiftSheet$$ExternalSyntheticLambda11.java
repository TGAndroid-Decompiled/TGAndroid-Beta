package org.telegram.ui.Gifts;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.UItem;

public final class ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda11 implements Utilities.Callback5 {
    public final int $r8$classId;
    public final ResaleGiftsFragment.SelectGiftSheet.State f$0;
    public final ItemOptions f$1;

    public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda11(ResaleGiftsFragment.SelectGiftSheet.State state, ItemOptions itemOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
        this.f$1 = itemOptions;
    }

    @Override
    public final void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        switch (this.$r8$classId) {
            case 0:
                long j = ((TL_stars.starGiftAttributeModel) uItem.object).document.id;
                ResaleGiftsFragment.SelectGiftSheet.State state = this.f$0;
                boolean zContains = state.resaleList.notSelectedModelAttributes.contains(Long.valueOf(j));
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = state.resaleList;
                if (zContains) {
                    resaleGiftsList.notSelectedModelAttributes.remove(Long.valueOf(j));
                } else {
                    boolean zIsEmpty = resaleGiftsList.notSelectedModelAttributes.isEmpty();
                    HashSet hashSet = resaleGiftsList.notSelectedModelAttributes;
                    if (zIsEmpty) {
                        ArrayList arrayList = resaleGiftsList.modelAttributes;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj6 = arrayList.get(i);
                            i++;
                            long j2 = ((TL_stars.starGiftAttributeModel) obj6).document.id;
                            if (j2 != j) {
                                hashSet.add(Long.valueOf(j2));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j));
                    }
                }
                resaleGiftsList.reload();
                this.f$1.dismiss();
                break;
            case 1:
                int i2 = ((TL_stars.starGiftAttributeBackdrop) uItem.object).backdrop_id;
                ResaleGiftsFragment.SelectGiftSheet.State state2 = this.f$0;
                boolean zContains2 = state2.resaleList.notSelectedBackdropAttributes.contains(Integer.valueOf(i2));
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = state2.resaleList;
                if (zContains2) {
                    resaleGiftsList2.notSelectedBackdropAttributes.remove(Integer.valueOf(i2));
                } else {
                    boolean zIsEmpty2 = resaleGiftsList2.notSelectedBackdropAttributes.isEmpty();
                    HashSet hashSet2 = resaleGiftsList2.notSelectedBackdropAttributes;
                    if (zIsEmpty2) {
                        ArrayList arrayList2 = resaleGiftsList2.backdropAttributes;
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj7 = arrayList2.get(i3);
                            i3++;
                            int i4 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i4 != i2) {
                                hashSet2.add(Integer.valueOf(i4));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                }
                resaleGiftsList2.reload();
                this.f$1.dismiss();
                break;
            default:
                long j3 = ((TL_stars.starGiftAttributePattern) uItem.object).document.id;
                ResaleGiftsFragment.SelectGiftSheet.State state3 = this.f$0;
                boolean zContains3 = state3.resaleList.notSelectedPatternAttributes.contains(Long.valueOf(j3));
                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = state3.resaleList;
                if (zContains3) {
                    resaleGiftsList3.notSelectedPatternAttributes.remove(Long.valueOf(j3));
                } else {
                    boolean zIsEmpty3 = resaleGiftsList3.notSelectedPatternAttributes.isEmpty();
                    HashSet hashSet3 = resaleGiftsList3.notSelectedPatternAttributes;
                    if (zIsEmpty3) {
                        ArrayList arrayList3 = resaleGiftsList3.patternAttributes;
                        int size3 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj8 = arrayList3.get(i5);
                            i5++;
                            long j4 = ((TL_stars.starGiftAttributePattern) obj8).document.id;
                            if (j4 != j3) {
                                hashSet3.add(Long.valueOf(j4));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j3));
                    }
                }
                resaleGiftsList3.reload();
                this.f$1.dismiss();
                break;
        }
    }
}
