package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class hy extends org.telegram.ui.ActionBar.j {
    public final ny f38070a;

    public hy(ny nyVar) {
        this.f38070a = nyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ny nyVar = this.f38070a;
        int i12 = nyVar.f40024w;
        ArrayList arrayList = nyVar.e;
        int i13 = nyVar.f40025x;
        if (i10 == -1) {
            if (nyVar.f40026y == null) {
                nyVar.Y();
            } else {
                nyVar.finishFragment();
            }
        } else if (i10 == 1 && nyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            nyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = nyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.o2) nyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(nyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(nyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(nyVar.getParentActivity(), appWidgetManager, i13);
            }
            a1 a1Var = nyVar.f40026y;
            if (a1Var != null) {
                int i15 = a1Var.f35545a;
                Object obj = a1Var.f35546b;
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
            nyVar.Y();
        }
    }
}
