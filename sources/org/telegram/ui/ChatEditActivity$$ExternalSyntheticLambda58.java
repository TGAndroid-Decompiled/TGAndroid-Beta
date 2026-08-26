package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.web.WebBrowserSettings;

public final class ChatEditActivity$$ExternalSyntheticLambda58 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final long f$1;
    public final long f$2;

    public ChatEditActivity$$ExternalSyntheticLambda58(BaseFragment baseFragment, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run() {
        UniversalAdapter universalAdapter;
        switch (this.$r8$classId) {
            case 0:
                ((ChatEditActivity) this.f$0).lambda$createView$48(this.f$1, this.f$2);
                break;
            default:
                long j = this.f$1;
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.cacheSize = j;
                webBrowserSettings.cookiesSize = this.f$2;
                UniversalFragment.AnonymousClass3 anonymousClass3 = webBrowserSettings.listView;
                if (anonymousClass3 != null && (universalAdapter = anonymousClass3.adapter) != null && anonymousClass3.mIsAttached) {
                    universalAdapter.update(true);
                    break;
                }
                break;
        }
    }
}
