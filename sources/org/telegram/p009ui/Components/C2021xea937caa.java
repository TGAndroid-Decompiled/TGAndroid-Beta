package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2021xea937caa implements SimpleFloatPropertyCompat.Getter {
    public static final C2021xea937caa INSTANCE = new C2021xea937caa();

    private C2021xea937caa() {
    }

    @Override
    public final float get(Object obj) {
        return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
    }
}
