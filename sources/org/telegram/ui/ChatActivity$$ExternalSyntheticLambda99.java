package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class ChatActivity$$ExternalSyntheticLambda99 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda99(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$toggleIsAllChats$100(this.f$1, view);
                break;
            default:
                ((ChannelColorActivity.PeerColorPicker) this.f$0).lambda$setSelectedPosition$0(this.f$1, view);
                break;
        }
    }
}
