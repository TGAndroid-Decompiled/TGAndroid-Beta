package org.telegram.ui;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;

public final class LinkEditActivity$$ExternalSyntheticLambda9 implements Utilities.Callback {
    public final int $r8$classId;

    public LinkEditActivity$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                HashMap map = BottomSheetTabs.tabs;
                break;
            case 2:
                int i = BottomSheetTabs.TabsAccessibilityHelper.$r8$clinit;
                break;
            case 3:
                int i2 = UnconfirmedAuthHintCell.$r8$clinit;
                break;
            case 4:
                break;
            case 5:
                ((Boolean) obj).getClass();
                break;
            default:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(RestrictedLanguagesSelectActivity.getRestrictedLanguages());
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    editorEdit.remove("translate_button_restricted_languages");
                } else {
                    editorEdit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                editorEdit.putInt("translate_button_restricted_languages_version", 2).apply();
                RestrictedLanguagesSelectActivity.gotRestrictedLanguages = false;
                for (int i3 = 0; i3 < 4; i3++) {
                    try {
                        MessagesController.getInstance(i3).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                break;
        }
    }
}
