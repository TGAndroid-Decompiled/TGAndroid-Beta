package org.telegram.p009ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class AlertsCreator$$ExternalSyntheticLambda87 implements TextView.OnEditorActionListener {
    public static final AlertsCreator$$ExternalSyntheticLambda87 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda87();

    private AlertsCreator$$ExternalSyntheticLambda87() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean hideKeyboard;
        hideKeyboard = AndroidUtilities.hideKeyboard(textView);
        return hideKeyboard;
    }
}
