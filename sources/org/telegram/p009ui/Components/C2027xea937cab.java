package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C2027xea937cab implements SimpleFloatPropertyCompat.Setter {
    public static final C2027xea937cab INSTANCE = new C2027xea937cab();

    private C2027xea937cab() {
    }

    @Override
    public final void set(Object obj, float f) {
        ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).setSwipeOffsetY(f);
    }
}
