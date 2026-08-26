package org.telegram.ui.Components.poll;

import java.util.HashMap;

public final class WebPageLoader {
    public final int currentAccount;
    public final HashMap pages = new HashMap();
    public final HashMap callbacks = new HashMap();

    public WebPageLoader(int i) {
        this.currentAccount = i;
    }
}
