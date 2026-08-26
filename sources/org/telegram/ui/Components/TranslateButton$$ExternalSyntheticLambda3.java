package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;

public final class TranslateButton$$ExternalSyntheticLambda3 implements Runnable {
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

    public TranslateButton$$ExternalSyntheticLambda3(ChatActivity.AnonymousClass55 anonymousClass55, boolean[] zArr, String str, LinearLayout linearLayout, ArrayList arrayList, String str2, TranslateController translateController, ActionBarPopupWindow actionBarPopupWindow, ArrayList arrayList2) {
        this.f$0 = anonymousClass55;
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
        String strCapitalFirst;
        switch (this.$r8$classId) {
            case 0:
                final ChatActivity.AnonymousClass55 anonymousClass55 = (ChatActivity.AnonymousClass55) this.f$0;
                boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    LinearLayout linearLayout = (LinearLayout) this.f$3;
                    String str = (String) this.f$2;
                    if (str != null && (strCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str, null, null))) != null) {
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(2, anonymousClass55.getContext(), anonymousClass55.resourcesProvider, false, false);
                        actionBarMenuSubItem.setChecked(true);
                        actionBarMenuSubItem.setText(strCapitalFirst);
                        linearLayout.addView(actionBarMenuSubItem);
                    }
                    ArrayList arrayList = this.f$4;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        final TranslateController translateController = (TranslateController) this.f$6;
                        final ActionBarPopupWindow actionBarPopupWindow = (ActionBarPopupWindow) this.f$7;
                        String str2 = (String) this.f$5;
                        if (i >= size) {
                            linearLayout.addView(new ActionBarPopupWindow.GapView(anonymousClass55.getContext(), Theme.key_actionBarDefaultSubmenuSeparator, anonymousClass55.resourcesProvider), LayoutHelper.createLinear(-1, 8));
                            ArrayList arrayList2 = this.f$8;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                int i3 = i2 + 1;
                                TranslateController.Language language = (TranslateController.Language) arrayList2.get(i2);
                                final String str3 = language.code;
                                if (!TextUtils.equals(str3, str2)) {
                                    boolean z = str != null && str.equals(str3);
                                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(2, anonymousClass55.getContext(), anonymousClass55.resourcesProvider, false, false);
                                    actionBarMenuSubItem2.setChecked(z);
                                    actionBarMenuSubItem2.setText(language.displayName);
                                    if (!z) {
                                        final int i4 = 1;
                                        actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view) {
                                                switch (i4) {
                                                    case 0:
                                                        ChatActivity.AnonymousClass55 anonymousClass56 = anonymousClass55;
                                                        translateController.setDialogTranslateTo(anonymousClass56.dialogId, str3);
                                                        actionBarPopupWindow.dismiss(true);
                                                        anonymousClass56.updateText$1();
                                                        break;
                                                    default:
                                                        ChatActivity.AnonymousClass55 anonymousClass57 = anonymousClass55;
                                                        translateController.setDialogTranslateTo(anonymousClass57.dialogId, str3);
                                                        actionBarPopupWindow.dismiss(true);
                                                        anonymousClass57.updateText$1();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    linearLayout.addView(actionBarMenuSubItem2);
                                }
                                i2 = i3;
                            }
                            zArr[0] = true;
                        } else {
                            int i5 = i + 1;
                            TranslateController.Language language2 = (TranslateController.Language) arrayList.get(i);
                            final String str4 = language2.code;
                            if (!TextUtils.equals(str4, str2)) {
                                ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(2, anonymousClass55.getContext(), anonymousClass55.resourcesProvider, false, false);
                                boolean z2 = str != null && str.equals(str4);
                                actionBarMenuSubItem3.setChecked(z2);
                                actionBarMenuSubItem3.setText(language2.displayName);
                                if (!z2) {
                                    final int i6 = 0;
                                    actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view) {
                                            switch (i6) {
                                                case 0:
                                                    ChatActivity.AnonymousClass55 anonymousClass56 = anonymousClass55;
                                                    translateController.setDialogTranslateTo(anonymousClass56.dialogId, str4);
                                                    actionBarPopupWindow.dismiss(true);
                                                    anonymousClass56.updateText$1();
                                                    break;
                                                default:
                                                    ChatActivity.AnonymousClass55 anonymousClass57 = anonymousClass55;
                                                    translateController.setDialogTranslateTo(anonymousClass57.dialogId, str4);
                                                    actionBarPopupWindow.dismiss(true);
                                                    anonymousClass57.updateText$1();
                                                    break;
                                            }
                                        }
                                    });
                                }
                                linearLayout.addView(actionBarMenuSubItem3);
                            }
                            i = i5;
                        }
                        break;
                    }
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f$0;
                notificationsCustomSettingsActivity.getMessagesController().putUsers(this.f$4, true);
                notificationsCustomSettingsActivity.getMessagesController().putChats(this.f$8, true);
                notificationsCustomSettingsActivity.getMessagesController().putEncryptedChats((ArrayList) this.f$1, true);
                int i7 = notificationsCustomSettingsActivity.currentType;
                if (i7 == 1) {
                    notificationsCustomSettingsActivity.exceptions = (ArrayList) this.f$2;
                } else if (i7 == 0) {
                    notificationsCustomSettingsActivity.exceptions = (ArrayList) this.f$5;
                } else if (i7 == 3) {
                    notificationsCustomSettingsActivity.exceptions = (ArrayList) this.f$3;
                    notificationsCustomSettingsActivity.autoExceptions = (ArrayList) this.f$6;
                } else {
                    notificationsCustomSettingsActivity.exceptions = (ArrayList) this.f$7;
                }
                notificationsCustomSettingsActivity.updateRows(true);
                break;
        }
    }

    public TranslateButton$$ExternalSyntheticLambda3(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
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
