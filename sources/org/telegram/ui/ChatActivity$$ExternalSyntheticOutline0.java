package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog;

public abstract class ChatActivity$$ExternalSyntheticOutline0 {
    public static void m(int i, AlertDialog.Builder builder, AlertDialog.OnButtonClickListener onButtonClickListener) {
        builder.setPositiveButton(LocaleController.getString(i), onButtonClickListener).show();
    }
}
