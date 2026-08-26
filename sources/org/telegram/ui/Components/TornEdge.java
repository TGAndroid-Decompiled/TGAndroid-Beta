package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public abstract class TornEdge {

    public final class Params {
    }

    public static int fragmentHeight(Params params) {
        params.getClass();
        return Math.max(1, (int) Math.ceil(AndroidUtilities.density * 0.5f)) + (((int) Math.ceil(AndroidUtilities.density * 1.9f)) * 2);
    }
}
