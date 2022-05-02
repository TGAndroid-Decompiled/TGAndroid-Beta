package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C1793x21c92f6c implements SimpleFloatPropertyCompat.Getter {
    public static final C1793x21c92f6c INSTANCE = new C1793x21c92f6c();

    private C1793x21c92f6c() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).loadProgress;
        return f;
    }
}
