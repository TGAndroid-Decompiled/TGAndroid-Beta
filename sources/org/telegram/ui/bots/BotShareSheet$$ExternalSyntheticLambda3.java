package org.telegram.ui.bots;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.telegram.ui.web.HttpGetFileTask;

public final class BotShareSheet$$ExternalSyntheticLambda3 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;

    public BotShareSheet$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((RichTextCell$2$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 1:
                ((CropView) this.f$0).hasAspectRatioDialog = false;
                break;
            case 2:
                ((HttpGetFileTask) this.f$0).cancel(true);
                break;
            default:
                CommunityUtils.PendingRequests pendingRequests = (CommunityUtils.PendingRequests) this.f$0;
                ConnectionsManager.getInstance(pendingRequests.currentAccount).cancelRequest(pendingRequests.reqId, true);
                pendingRequests.progressDialog = null;
                pendingRequests.reqId = 0;
                break;
        }
    }
}
