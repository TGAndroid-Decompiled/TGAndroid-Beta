package org.telegram.ui.ActionBar;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.MentionsAdapter;

public final class Theme$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final boolean f$3;
    public final Object f$4;
    public final boolean f$5;

    public Theme$$ExternalSyntheticLambda4(MediaDataController mediaDataController, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        this.f$0 = mediaDataController;
        this.f$3 = z;
        this.f$1 = tL_messages_stickerSet;
        this.f$2 = i;
        this.f$4 = str;
        this.f$5 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(Theme.loadWallpaperInternal((Theme.OverrideWallpaperInfo) this.f$0, (File) this.f$1, this.f$2, this.f$3, (TLRPC.Document) this.f$4, this.f$5), 17));
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$processLoadedDiceStickers$89(this.f$3, (TLRPC.TL_messages_stickerSet) this.f$1, this.f$2, (String) this.f$4, this.f$5);
                break;
            default:
                ((MentionsAdapter) this.f$0).searchUsernameOrHashtag((CharSequence) this.f$1, this.f$2, (ArrayList) this.f$4, this.f$3, this.f$5);
                break;
        }
    }

    public Theme$$ExternalSyntheticLambda4(Theme.OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC.Document document, boolean z2) {
        this.f$0 = overrideWallpaperInfo;
        this.f$1 = file;
        this.f$2 = i;
        this.f$3 = z;
        this.f$4 = document;
        this.f$5 = z2;
    }

    public Theme$$ExternalSyntheticLambda4(MentionsAdapter mentionsAdapter, CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        this.f$0 = mentionsAdapter;
        this.f$1 = charSequence;
        this.f$2 = i;
        this.f$4 = arrayList;
        this.f$3 = z;
        this.f$5 = z2;
    }
}
