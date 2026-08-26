package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7 implements Utilities.Callback5, Utilities.Callback5Return {
    public final ChatAttachAlertAudioLayout f$0;

    public ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7(ChatAttachAlertAudioLayout chatAttachAlertAudioLayout) {
        this.f$0 = chatAttachAlertAudioLayout;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onItemClick((UItem) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onItemClick((UItem) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
