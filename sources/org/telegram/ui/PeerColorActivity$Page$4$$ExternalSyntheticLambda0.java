package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class PeerColorActivity$Page$4$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final PeerColorActivity.Page.AnonymousClass4 f$0;

    public PeerColorActivity$Page$4$$ExternalSyntheticLambda0(PeerColorActivity.Page.AnonymousClass4 anonymousClass4, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass4;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBindViewHolder$2((Boolean) obj);
                break;
            case 1:
                this.f$0.lambda$onBindViewHolder$3((Integer) obj);
                break;
            default:
                this.f$0.lambda$onCreateViewHolder$0((Integer) obj);
                break;
        }
    }
}
