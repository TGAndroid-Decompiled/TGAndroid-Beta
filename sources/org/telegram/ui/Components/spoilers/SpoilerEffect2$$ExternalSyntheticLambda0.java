package org.telegram.ui.Components.spoilers;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class SpoilerEffect2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SpoilerEffect2 f$0;

    public SpoilerEffect2$$ExternalSyntheticLambda0(SpoilerEffect2 spoilerEffect2, int i) {
        this.$r8$classId = i;
        this.f$0 = spoilerEffect2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SpoilerEffect2 spoilerEffect2 = this.f$0;
                if (spoilerEffect2.holders.isEmpty()) {
                    spoilerEffect2.destroyed = true;
                    SpoilerEffect2.instance = null;
                    SpoilerEffect2.SpoilerThread spoilerThread = spoilerEffect2.thread;
                    if (spoilerThread != null) {
                        spoilerThread.running = false;
                        spoilerEffect2.thread = null;
                    }
                    spoilerEffect2.textureViewContainer.removeView(spoilerEffect2.textureView);
                    if (spoilerEffect2.textureViewContainer.getParent() instanceof ViewGroup) {
                        ((ViewGroup) spoilerEffect2.textureViewContainer.getParent()).removeView(spoilerEffect2.textureViewContainer);
                    }
                }
                break;
            default:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f$0.holders;
                    if (i < arrayList.size()) {
                        ((View) arrayList.get(i)).invalidate();
                        i++;
                    }
                    break;
                }
                break;
        }
    }
}
