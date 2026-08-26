package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.EditTextCell;

public final class ReportAlert$$ExternalSyntheticLambda0 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;

    public ReportAlert$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((ReportAlert) this.f$0).lambda$new$0(textView, i, keyEvent);
            case 1:
                return ((ThemeEditorView.EditorAlert.SearchField) this.f$0).lambda$new$1(textView, i, keyEvent);
            case 2:
                return AlertsCreator.lambda$showAddBrowserException$25((ShareAlert$$ExternalSyntheticLambda1) this.f$0, textView, i, keyEvent);
            case 3:
                return CreateBotAlert.lambda$show$0((EditTextCell) this.f$0, textView, i, keyEvent);
            case 4:
                return CreateBotAlert.lambda$show$7((CreateBotAlert$$ExternalSyntheticLambda4) this.f$0, textView, i, keyEvent);
            case 5:
                return ((PasscodeView) this.f$0).lambda$new$0(textView, i, keyEvent);
            case 6:
                return ((SearchField) this.f$0).lambda$new$1(textView, i, keyEvent);
            case 7:
                return ((ShareAlert) this.f$0).lambda$new$2(textView, i, keyEvent);
            case 8:
                return StickersAlert.lambda$showNameEnterAlert$37((AlertDialog.Builder) this.f$0, textView, i, keyEvent);
            case 9:
                return StickersDialogs.lambda$showNameEditorDialog$4((AlertDialog) this.f$0, textView, i, keyEvent);
            default:
                return ((UsersAlertBase.SearchField) this.f$0).lambda$new$0(textView, i, keyEvent);
        }
    }
}
