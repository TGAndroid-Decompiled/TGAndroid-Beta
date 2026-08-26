package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.MessageSendPreview;

public final class LinkActionView$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public LinkActionView$$ExternalSyntheticLambda4(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkActionView) this.f$0).lambda$new$9((Context) this.f$1, (BottomSheet) this.f$2, (BaseFragment) this.f$3, view);
                break;
            case 1:
                AlertsCreator.lambda$createSoundFrequencyPickerDialog$186((NumberPicker) this.f$0, (NumberPicker) this.f$1, (AlertsCreator.SoundFrequencyDelegate) this.f$2, (BottomSheet.Builder) this.f$3, view);
                break;
            case 2:
                ((ChatActivityEnterView) this.f$0).lambda$setEditingMessageObject$73((ArrayList) this.f$1, (MessagePreviewView.ToggleButton) this.f$2, (MessageSendPreview) this.f$3, view);
                break;
            case 3:
                ((ChatActivityEnterView) this.f$0).lambda$setEditingMessageObject$74((MessageObject.GroupedMessages) this.f$1, (MessageObject) this.f$2, (MessageSendPreview) this.f$3, view);
                break;
            default:
                ((ChatAttachAlert) this.f$0).lambda$new$36((Context) this.f$1, (ActionBarMenuSubItem) this.f$2, (Theme.ResourcesProvider) this.f$3, view);
                break;
        }
    }
}
