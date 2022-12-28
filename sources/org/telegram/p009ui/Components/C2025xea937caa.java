package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2025xea937caa implements SimpleFloatPropertyCompat.Getter {
    public static final C2025xea937caa INSTANCE = new C2025xea937caa();

    private C2025xea937caa() {
    }

    @Override
    public final float get(Object obj) {
        return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
    }
}
