package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class fy extends org.telegram.ui.ActionBar.j {
    public final ly f37144a;

    public fy(ly lyVar) {
        this.f37144a = lyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ly lyVar = this.f37144a;
        int i12 = lyVar.f39054w;
        ArrayList arrayList = lyVar.e;
        int i13 = lyVar.f39055x;
        if (i10 == -1) {
            if (lyVar.f39056y == null) {
                lyVar.Y();
            } else {
                lyVar.finishFragment();
            }
        } else if (i10 == 1 && lyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            lyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = lyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.n2) lyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(lyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(lyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(lyVar.getParentActivity(), appWidgetManager, i13);
            }
            b1 b1Var = lyVar.f39056y;
            if (b1Var != null) {
                int i15 = b1Var.f35474a;
                Object obj = b1Var.f35475b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            lyVar.Y();
        }
    }
}
