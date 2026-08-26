package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public final class UndoView$$ExternalSyntheticLambda6 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public UndoView$$ExternalSyntheticLambda6(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((UndoView) this.f$0).lambda$showWithAction$6((TLRPC.Message) this.f$1, view);
                break;
            case 1:
                ((GuardBotReplaceSheet) this.f$0).lambda$new$0((Runnable) this.f$1, view);
                break;
            case 2:
                ((JoinCallAlert) this.f$0).lambda$new$7((JoinCallAlert.JoinCallAlertDelegate) this.f$1, view);
                break;
            case 3:
                ((PhonebookShareAlert) this.f$0).lambda$new$6((Theme.ResourcesProvider) this.f$1, view);
                break;
            case 4:
                ((ProximitySheet) this.f$0).lambda$new$4((ProximitySheet.onRadiusPickerChange) this.f$1, view);
                break;
            case 5:
                ((QRCodeBottomSheet) this.f$0).lambda$new$0((Context) this.f$1, view);
                break;
            case 6:
                QRCodeBottomSheet.lambda$new$1((String) this.f$0, (Context) this.f$1, view);
                break;
            case 7:
                TableView.lambda$addRowMonospaced$0((CharSequence) this.f$0, (Runnable) this.f$1, view);
                break;
            case 8:
                TagEditCell.lambda$showInfoSheet$6((BottomSheet) this.f$0, (boolean[]) this.f$1, view);
                break;
            case 9:
                ((TranslateAlert3) this.f$0).lambda$fillItems$8((UniversalAdapter) this.f$1, view);
                break;
            case 10:
                ((TranslateAlert3.Header) this.f$0).lambda$set$0((View.OnClickListener) this.f$1, view);
                break;
            case 11:
                ((TranslateButton) this.f$0).lambda$onMenuClick$12((ActionBarPopupWindow) this.f$1, view);
                break;
            default:
                ((UpdateAppAlertDialog) this.f$0).lambda$new$0((File) this.f$1, view);
                break;
        }
    }
}
