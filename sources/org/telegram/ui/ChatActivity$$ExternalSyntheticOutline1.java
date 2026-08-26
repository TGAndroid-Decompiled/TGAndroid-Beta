package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog;

public abstract class ChatActivity$$ExternalSyntheticOutline1 {
    public static void m(int i, AlertDialog.Builder builder) {
        builder.setPositiveButton(LocaleController.getString(i), null);
        builder.show();
    }
}
