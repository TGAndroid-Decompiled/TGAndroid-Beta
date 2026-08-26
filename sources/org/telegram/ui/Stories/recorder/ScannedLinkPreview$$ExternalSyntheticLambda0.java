package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ScannedLinkPreview$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final ScannedLinkPreview f$0;

    public ScannedLinkPreview$$ExternalSyntheticLambda0(ScannedLinkPreview scannedLinkPreview, int i) {
        this.$r8$classId = i;
        this.f$0 = scannedLinkPreview;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ScannedLinkPreview.ResolvedLink resolvedLink = (ScannedLinkPreview.ResolvedLink) obj;
                ScannedLinkPreview scannedLinkPreview = this.f$0;
                scannedLinkPreview.currentCancel = null;
                scannedLinkPreview.resolved = resolvedLink;
                scannedLinkPreview.hasResolved = resolvedLink != null;
                scannedLinkPreview.setup();
                scannedLinkPreview.invalidate();
                StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = scannedLinkPreview.resolvedListener;
                if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                    storyRecorder$$ExternalSyntheticLambda5.run();
                }
                break;
            default:
                BaseFragment baseFragment = (BaseFragment) obj;
                ScannedLinkPreview.ResolvedLink resolvedLink2 = this.f$0.resolved;
                if (resolvedLink2 != null || baseFragment == null) {
                    resolvedLink2.open(baseFragment);
                }
                break;
        }
    }
}
