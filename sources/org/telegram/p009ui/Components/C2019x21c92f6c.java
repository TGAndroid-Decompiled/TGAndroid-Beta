package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2019x21c92f6c implements SimpleFloatPropertyCompat.Getter {
    public static final C2019x21c92f6c INSTANCE = new C2019x21c92f6c();

    private C2019x21c92f6c() {
    }

    @Override
    public final float get(Object obj) {
        float f;
        f = ((ChatAttachAlertBotWebViewLayout.WebProgressView) obj).loadProgress;
        return f;
    }
}
