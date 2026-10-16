package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class bz extends org.telegram.ui.ActionBar.j {
    public final hz f34397a;

    public bz(hz hzVar) {
        this.f34397a = hzVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        hz hzVar = this.f34397a;
        int i12 = hzVar.f36677w;
        ArrayList arrayList = hzVar.e;
        int i13 = hzVar.f36678x;
        if (i10 == -1) {
            if (hzVar.f36679y == null) {
                hzVar.Y();
            } else {
                hzVar.finishFragment();
            }
        } else if (i10 == 1 && hzVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            hzVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = hzVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.m2) hzVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(hzVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(hzVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(hzVar.getParentActivity(), appWidgetManager, i13);
            }
            b1 b1Var = hzVar.f36679y;
            if (b1Var != null) {
                int i15 = b1Var.f34138a;
                Object obj = b1Var.f34139b;
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
            hzVar.Y();
        }
    }
}
