package org.telegram.ui.Gifts;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.UItem;

public final class ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda10 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final String[] f$0;
    public final ResaleGiftsFragment.SelectGiftSheet.State f$1;
    public final ArrayList f$2;

    public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda10(String[] strArr, ResaleGiftsFragment.SelectGiftSheet.State state, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = strArr;
        this.f$1 = state;
        this.f$2 = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ArrayList arrayList;
        Class<ResaleGiftsFragment.EmptyView.Factory> cls = ResaleGiftsFragment.EmptyView.Factory.class;
        ArrayList arrayList2 = this.f$2;
        ResaleGiftsFragment.SelectGiftSheet.State state = this.f$1;
        String[] strArr = this.f$0;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                boolean zIsEmpty = state.resaleList.notSelectedModelAttributes.isEmpty();
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = state.resaleList;
                    boolean zContains = resaleGiftsList.notSelectedModelAttributes.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z = !zContains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) resaleGiftsList.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
                        int iIntValue = num == null ? 0 : num.intValue();
                        int i3 = ResaleGiftsFragment.ModelItem.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(ResaleGiftsFragment.ModelItem.Factory.class);
                        uItemOfFactory.object = stargiftattributemodel;
                        uItemOfFactory.text = lowerCase;
                        uItemOfFactory.intValue = iIntValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z = (zIsEmpty || zContains) ? false : true;
                        }
                        arrayList3.add(uItemOfFactory.setChecked(z));
                    }
                    cls = cls;
                }
                Class<ResaleGiftsFragment.EmptyView.Factory> cls2 = cls;
                if (arrayList3.isEmpty()) {
                    String string = LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty);
                    int i4 = ResaleGiftsFragment.EmptyView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(cls2);
                    uItemOfFactory2.text = string;
                    arrayList3.add(uItemOfFactory2);
                }
                break;
            case 1:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                boolean zIsEmpty2 = state.resaleList.notSelectedBackdropAttributes.isEmpty();
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj4 = arrayList2.get(i5);
                    i5++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = state.resaleList;
                    boolean zContains2 = resaleGiftsList2.notSelectedBackdropAttributes.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z2 = !zContains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(strTranslitSafe2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                        Integer num2 = (Integer) resaleGiftsList2.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int iIntValue2 = num2 == null ? 0 : num2.intValue();
                        int i6 = ResaleGiftsFragment.BackdropItem.Factory.$r8$clinit;
                        UItem uItemOfFactory3 = UItem.ofFactory(ResaleGiftsFragment.BackdropItem.Factory.class);
                        uItemOfFactory3.object = stargiftattributebackdrop;
                        uItemOfFactory3.text = lowerCase2;
                        uItemOfFactory3.intValue = iIntValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z2 = (zIsEmpty2 || zContains2) ? false : true;
                        }
                        arrayList4.add(uItemOfFactory3.setChecked(z2));
                    }
                }
                if (arrayList4.isEmpty()) {
                    String string2 = LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty);
                    int i7 = ResaleGiftsFragment.EmptyView.Factory.$r8$clinit;
                    UItem uItemOfFactory4 = UItem.ofFactory(cls);
                    uItemOfFactory4.text = string2;
                    arrayList4.add(uItemOfFactory4);
                }
                break;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String strTranslitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                boolean zIsEmpty3 = state.resaleList.notSelectedPatternAttributes.isEmpty();
                int size3 = arrayList2.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj5 = arrayList2.get(i8);
                    i8 += i;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = state.resaleList;
                    ArrayList arrayList6 = arrayList5;
                    boolean zContains3 = resaleGiftsList3.notSelectedPatternAttributes.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z3 = !zContains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(strTranslitSafe3) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        Integer num3 = (Integer) resaleGiftsList3.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
                        int iIntValue3 = num3 == null ? 0 : num3.intValue();
                        int i9 = ResaleGiftsFragment.PatternItem.Factory.$r8$clinit;
                        UItem uItemOfFactory5 = UItem.ofFactory(ResaleGiftsFragment.PatternItem.Factory.class);
                        uItemOfFactory5.object = stargiftattributepattern;
                        uItemOfFactory5.text = lowerCase3;
                        uItemOfFactory5.intValue = iIntValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z3 = (zIsEmpty3 || zContains3) ? false : true;
                        }
                        UItem checked = uItemOfFactory5.setChecked(z3);
                        arrayList = arrayList6;
                        arrayList.add(checked);
                    } else {
                        arrayList = arrayList6;
                    }
                    arrayList5 = arrayList;
                    i = 1;
                }
                ArrayList arrayList7 = arrayList5;
                if (arrayList7.isEmpty()) {
                    String string3 = LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty);
                    int i10 = ResaleGiftsFragment.EmptyView.Factory.$r8$clinit;
                    UItem uItemOfFactory6 = UItem.ofFactory(cls);
                    uItemOfFactory6.text = string3;
                    arrayList7.add(uItemOfFactory6);
                }
                break;
        }
    }
}
