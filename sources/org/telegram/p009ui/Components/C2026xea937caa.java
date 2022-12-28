package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2026xea937caa implements SimpleFloatPropertyCompat.Getter {
    public static final C2026xea937caa INSTANCE = new C2026xea937caa();

    private C2026xea937caa() {
    }

    @Override
    public final float get(Object obj) {
        return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
    }
}
