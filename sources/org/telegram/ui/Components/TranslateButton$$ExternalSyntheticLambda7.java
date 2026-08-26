package org.telegram.ui.Components;

import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.NotificationsCustomSettingsActivity;

public final class TranslateButton$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Serializable f$2;
    public final Object f$3;
    public final ArrayList f$4;
    public final Serializable f$5;
    public final Object f$6;
    public final Object f$7;
    public final ArrayList f$8;

    public TranslateButton$$ExternalSyntheticLambda7(TranslateButton translateButton, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, ActionBarPopupWindow actionBarPopupWindow, ArrayList arrayList2) {
        this.f$0 = translateButton;
        this.f$1 = zArr;
        this.f$2 = str;
        this.f$3 = linearLayout;
        this.f$4 = arrayList;
        this.f$5 = str2;
        this.f$6 = translateController;
        this.f$7 = actionBarPopupWindow;
        this.f$8 = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ActionBarPopupWindow actionBarPopupWindow = (ActionBarPopupWindow) this.f$7;
                ((TranslateButton) this.f$0).lambda$onMenuClick$5((boolean[]) this.f$1, (String) this.f$2, (LinearLayout) this.f$3, this.f$4, (String) this.f$5, (TranslateController) this.f$6, actionBarPopupWindow, this.f$8);
                break;
            default:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$loadExceptions$19(this.f$4, this.f$8, (ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$5, (ArrayList) this.f$3, (ArrayList) this.f$6, (ArrayList) this.f$7);
                break;
        }
    }

    public TranslateButton$$ExternalSyntheticLambda7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        this.f$0 = notificationsCustomSettingsActivity;
        this.f$4 = arrayList;
        this.f$8 = arrayList2;
        this.f$1 = arrayList3;
        this.f$2 = arrayList4;
        this.f$5 = arrayList5;
        this.f$3 = arrayList6;
        this.f$6 = arrayList7;
        this.f$7 = arrayList8;
    }
}
