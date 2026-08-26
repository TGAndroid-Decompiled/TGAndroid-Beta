package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AudioPlayerCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class EditTextEmoji$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public EditTextEmoji$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((EditTextEmoji) this.f$0).lambda$new$0((SizeNotifierFrameLayout) this.f$1, (Theme.ResourcesProvider) this.f$2, view);
                break;
            case 1:
                ((AudioPlayerAlert.ListAdapter) this.f$0).lambda$onBindViewHolder$4((AudioPlayerCell) this.f$1, (MessageObject) this.f$2, view);
                break;
            case 2:
                ((MessagePreviewView.Page) this.f$0).lambda$new$15((MessagePreviewView.ToggleButton) this.f$1, (MessagePreviewView.ToggleButton) this.f$2, view);
                break;
            case 3:
                ((TranslateAlert2.HeaderView) this.f$0).lambda$openLanguagesSelect$2((Runnable[]) this.f$1, (LocaleController.LocaleInfo) this.f$2, view);
                break;
            case 4:
                ((AIEditorAlert.AiStyleAlert) this.f$0).lambda$new$3((TL_aicompose.AiComposeTone) this.f$1, (Theme.ResourcesProvider) this.f$2, view);
                break;
            case 5:
                AlertsCreator.lambda$showSecretLocationAlert$41((ArrayList) this.f$0, (Runnable) this.f$1, (AlertDialog.Builder) this.f$2, view);
                break;
            case 6:
                AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$256((boolean[]) this.f$0, (AlertsCreator.ScheduleDatePickerDelegate) this.f$1, (BottomSheet.Builder) this.f$2, view);
                break;
            case 7:
                AlertsCreator.lambda$createAccountSelectDialog$221((AlertDialog[]) this.f$0, (Runnable) this.f$1, (AlertsCreator.AccountSelectDelegate) this.f$2, view);
                break;
            case 8:
                ((ChatAttachAlert) this.f$0).lambda$new$28((BaseFragment) this.f$1, (Theme.ResourcesProvider) this.f$2, view);
                break;
            case 9:
                ((ChatAttachAlert) this.f$0).lambda$new$29((MessageObject) this.f$1, (MessagePreviewView.ToggleButton) this.f$2, view);
                break;
            case 10:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$2((Utilities.Callback) this.f$1, (ButtonWithCounterView) this.f$2, view);
                break;
            case 11:
                ((CreateRtmpStreamBottomSheet.TextDetailCellFactory) this.f$0).lambda$createView$0((Context) this.f$1, (TextDetailCell) this.f$2, view);
                break;
            case 12:
                ((EditTextCaption) this.f$0).lambda$showInputDialog$5((EditTextBoldCursor) this.f$1, (StickersAlert$$ExternalSyntheticLambda48) this.f$2, view);
                break;
            case 13:
                ((GigagroupConvertAlert) this.f$0).lambda$new$1((Context) this.f$1, (BaseFragment) this.f$2, view);
                break;
            case 14:
                ((LinkActionView) this.f$0).lambda$new$0((BottomSheet) this.f$1, (BaseFragment) this.f$2, view);
                break;
            case 15:
                ((PermanentLinkBottomSheet) this.f$0).lambda$new$2((TLRPC.ChatFull) this.f$1, (BaseFragment) this.f$2, view);
                break;
            case 16:
                ((PhotoViewerCaptionEnterView) this.f$0).lambda$new$5((PhotoViewer) this.f$1, (SizeNotifierFrameLayoutPhoto) this.f$2, view);
                break;
            case 17:
                ((PhotoViewerCoverEditor) this.f$0).lambda$new$1((Context) this.f$1, (Theme.ResourcesProvider) this.f$2, view);
                break;
            default:
                ((TranslateButton) this.f$0).lambda$onMenuClick$10((TranslateController) this.f$1, (ActionBarPopupWindow) this.f$2, view);
                break;
        }
    }
}
