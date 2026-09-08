package org.telegram.ui.ActionBar;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.h41;
public final class j3 implements Utilities.Callback {
    public final int f20590a;

    public j3(int i10) {
        this.f20590a = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20590a) {
            case 0:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = o3.K;
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                int i10 = m3.f21219r;
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = wa.f23526f;
                return;
            case 3:
                ((Boolean) obj).getClass();
                return;
            case 4:
                Integer num = (Integer) obj;
                return;
            case 5:
                HashSet hashSet = (HashSet) obj;
                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                hashSet.addAll(h41.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                h41.f36904s = false;
                for (int i12 = 0; i12 < 4; i12++) {
                    try {
                        MessagesController.getInstance(i12).getTranslateController().checkRestrictedLanguagesUpdate();
                    } catch (Exception unused) {
                    }
                }
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                return;
        }
    }
}
