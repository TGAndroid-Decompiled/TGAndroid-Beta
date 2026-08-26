package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7 implements Utilities.Callback5, Utilities.Callback5Return {
    public final ChatAttachAlertAudioLayout f$0;

    public ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7(ChatAttachAlertAudioLayout chatAttachAlertAudioLayout) {
        this.f$0 = chatAttachAlertAudioLayout;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        return Boolean.valueOf(this.f$0.onItemLongClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2));
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        this.f$0.onItemClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }
}
