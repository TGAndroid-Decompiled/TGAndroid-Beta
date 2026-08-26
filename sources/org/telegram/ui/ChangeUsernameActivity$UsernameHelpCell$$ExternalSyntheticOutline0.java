package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.LinkSpanDrawable;

public abstract class ChangeUsernameActivity$UsernameHelpCell$$ExternalSyntheticOutline0 {
    public static void m(int i, LinkSpanDrawable.LinksTextView linksTextView) {
        linksTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(i)));
    }
}
