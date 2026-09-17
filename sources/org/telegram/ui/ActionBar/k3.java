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
import org.telegram.ui.Cells.xa;
import org.telegram.ui.g41;
public final class k3 implements Utilities.Callback {
    public final int f19331a;

    public k3(int i10) {
        this.f19331a = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19331a) {
            case 0:
                Boolean bool = (Boolean) obj;
                HashMap hashMap = p3.K;
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                int i10 = n3.f19430r;
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                int i11 = xa.f21648f;
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
                hashSet.addAll(g41.Y());
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
                    edit.remove("translate_button_restricted_languages");
                } else {
                    edit.putStringSet("translate_button_restricted_languages", hashSet);
                }
                edit.putInt("translate_button_restricted_languages_version", 2).apply();
                g41.f33841s = false;
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
