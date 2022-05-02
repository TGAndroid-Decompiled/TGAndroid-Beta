package org.telegram.p009ui.Components;

import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.SimpleFloatPropertyCompat;

public final class C1797xea937ca8 implements SimpleFloatPropertyCompat.Getter {
    public static final C1797xea937ca8 INSTANCE = new C1797xea937ca8();

    private C1797xea937ca8() {
    }

    @Override
    public final float get(Object obj) {
        return ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) obj).getSwipeOffsetY();
    }
}
