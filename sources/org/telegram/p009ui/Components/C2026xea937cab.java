package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2026xea937cab implements SimpleFloatPropertyCompat.Setter {
    public static final C2026xea937cab INSTANCE = new C2026xea937cab();

    private C2026xea937cab() {
    }

    @Override
    public final void set(Object obj, float f) {
        ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).setSwipeOffsetY(f);
    }
}
