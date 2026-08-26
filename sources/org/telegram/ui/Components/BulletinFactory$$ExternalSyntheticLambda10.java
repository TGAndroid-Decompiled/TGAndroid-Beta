package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class BulletinFactory$$ExternalSyntheticLambda10 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final long f$2;

    public BulletinFactory$$ExternalSyntheticLambda10(int i, Bulletin bulletin, long j) {
        this.f$0 = i;
        this.f$1 = bulletin;
        this.f$2 = j;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                BulletinFactory.lambda$createContainsEmojiBulletin$2(this.f$0, (Bulletin) this.f$1, this.f$2, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                ((SharedMediaLayout) this.f$1).lambda$openAddStoriesToAlbumSheet$72(this.f$2, this.f$0, (ArrayList) obj);
                break;
        }
    }

    public BulletinFactory$$ExternalSyntheticLambda10(SharedMediaLayout sharedMediaLayout, long j, int i) {
        this.f$1 = sharedMediaLayout;
        this.f$2 = j;
        this.f$0 = i;
    }
}
