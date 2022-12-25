package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C1930xea937caa implements SimpleFloatPropertyCompat.Getter {
    public static final C1930xea937caa INSTANCE = new C1930xea937caa();

    private C1930xea937caa() {
    }

    @Override
    public final float get(Object obj) {
        return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
    }
}
