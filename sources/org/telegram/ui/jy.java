package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;

public final class jy extends org.telegram.ui.ActionBar.j {

    public final py f39538a;

    public jy(py pyVar) {
        this.f39538a = pyVar;
    }

    @Override
    public final void b(int i10) {
        py pyVar = this.f39538a;
        int i11 = pyVar.f41450w;
        ArrayList arrayList = pyVar.f41445e;
        int i12 = pyVar.f41451x;
        if (i10 == -1) {
            if (pyVar.f41452y != null) {
                pyVar.finishFragment();
                return;
            }
            pyVar.Y();
        }
        if (i10 != 1 || pyVar.getParentActivity() == null) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i13)).longValue(), 0L));
        }
        pyVar.getMessagesStorage().putWidgetDialogs(i12, arrayList2);
        SharedPreferences.Editor editorEdit = pyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
        editorEdit.putInt("account" + i12, ((org.telegram.ui.ActionBar.n2) pyVar).currentAccount);
        editorEdit.putInt("type" + i12, i11);
        editorEdit.commit();
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(pyVar.getParentActivity());
        if (i11 == 0) {
            ChatsWidgetProvider.updateWidget(pyVar.getParentActivity(), appWidgetManager, i12);
        } else {
            ContactsWidgetProvider.updateWidget(pyVar.getParentActivity(), appWidgetManager, i12);
        }
        c1 c1Var = pyVar.f41452y;
        if (c1Var == null) {
            pyVar.Y();
            return;
        }
        int i14 = c1Var.f36909a;
        Object obj = c1Var.f36910b;
        switch (i14) {
            case 25:
                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                int i15 = ChatsWidgetConfigActivity.B;
                Intent intent = new Intent();
                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.A);
                chatsWidgetConfigActivity.setResult(-1, intent);
                chatsWidgetConfigActivity.finish();
                break;
            default:
                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                int i16 = ContactsWidgetConfigActivity.B;
                Intent intent2 = new Intent();
                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.A);
                contactsWidgetConfigActivity.setResult(-1, intent2);
                contactsWidgetConfigActivity.finish();
                break;
        }
    }
}
