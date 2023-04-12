package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class AlertsCreator$$ExternalSyntheticLambda94 implements TextView.OnEditorActionListener {
    public static final AlertsCreator$$ExternalSyntheticLambda94 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda94();

    private AlertsCreator$$ExternalSyntheticLambda94() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean hideKeyboard;
        hideKeyboard = AndroidUtilities.hideKeyboard(textView);
        return hideKeyboard;
    }
}
