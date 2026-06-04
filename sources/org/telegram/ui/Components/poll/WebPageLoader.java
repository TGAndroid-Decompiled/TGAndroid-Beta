package org.telegram.ui.Components.poll;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class WebPageLoader {
    private final int currentAccount;
    private final HashMap pages = new HashMap();
    private final HashMap callbacks = new HashMap();

    public WebPageLoader(int i) {
        this.currentAccount = i;
    }

    public boolean isLoading(String str) {
        return this.callbacks.containsKey(str);
    }

    public TLRPC.WebPage getWebPage(String str) {
        return (TLRPC.WebPage) this.pages.get(str);
    }

    public void get(final String str, Utilities.Callback2 callback2) {
        if (this.pages.containsKey(str)) {
            callback2.run((TLRPC.WebPage) this.pages.get(str), null);
            return;
        }
        boolean zContainsKey = this.callbacks.containsKey(str);
        ArrayList arrayList = (ArrayList) this.callbacks.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.callbacks.put(str, arrayList);
        }
        arrayList.add(callback2);
        if (zContainsKey) {
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getwebpagepreview, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$get$0(str, (TL_account.webPagePreview) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$get$0(java.lang.String r4, org.telegram.tgnet.tl.TL_account.webPagePreview r5, org.telegram.tgnet.TLRPC.TL_error r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.poll.WebPageLoader.lambda$get$0(java.lang.String, org.telegram.tgnet.tl.TL_account$webPagePreview, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void apply(LongSparseArray longSparseArray) {
        for (Map.Entry entry : this.pages.entrySet()) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) longSparseArray.get(((TLRPC.WebPage) entry.getValue()).id);
            if (webPage != null) {
                entry.setValue(webPage);
            }
        }
    }
}
