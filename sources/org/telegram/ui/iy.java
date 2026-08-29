package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class iy extends org.telegram.ui.ActionBar.k {
    public final oy f39366a;

    public iy(oy oyVar) {
        this.f39366a = oyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        oy oyVar = this.f39366a;
        int i12 = oyVar.f41245w;
        ArrayList arrayList = oyVar.f41240e;
        int i13 = oyVar.f41246x;
        if (i10 == -1) {
            if (oyVar.f41247y == null) {
                oyVar.Y();
            } else {
                oyVar.finishFragment();
            }
        } else if (i10 == 1 && oyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            oyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = oyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.o2) oyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(oyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(oyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(oyVar.getParentActivity(), appWidgetManager, i13);
            }
            c1 c1Var = oyVar.f41247y;
            if (c1Var != null) {
                int i15 = c1Var.f36954a;
                Object obj = c1Var.f36955b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.B;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.A);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.B;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.A);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            oyVar.Y();
        }
    }
}
