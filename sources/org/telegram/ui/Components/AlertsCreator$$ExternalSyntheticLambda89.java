package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class AlertsCreator$$ExternalSyntheticLambda89 implements TextView.OnEditorActionListener {
    public static final AlertsCreator$$ExternalSyntheticLambda89 INSTANCE = new AlertsCreator$$ExternalSyntheticLambda89();

    private AlertsCreator$$ExternalSyntheticLambda89() {
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean hideKeyboard;
        hideKeyboard = AndroidUtilities.hideKeyboard(textView);
        return hideKeyboard;
    }
}
