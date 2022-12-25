package org.telegram.p009ui;

import org.telegram.p009ui.Components.voip.RTMPStreamPipOverlay;

public final class GroupCallActivity$$ExternalSyntheticLambda47 implements Runnable {
    public static final GroupCallActivity$$ExternalSyntheticLambda47 INSTANCE = new GroupCallActivity$$ExternalSyntheticLambda47();

    private GroupCallActivity$$ExternalSyntheticLambda47() {
    }

    @Override
    public final void run() {
        RTMPStreamPipOverlay.show();
    }
}
