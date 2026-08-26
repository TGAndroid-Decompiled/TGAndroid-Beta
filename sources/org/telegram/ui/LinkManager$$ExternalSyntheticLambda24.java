package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class LinkManager$$ExternalSyntheticLambda24 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LinkManager$$ExternalSyntheticLambda24(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleNewBot$21((TLRPC.User[]) this.f$1, (LinkManager$$ExternalSyntheticLambda23) this.f$2, (Long) obj);
                break;
            case 1:
                ((ChannelWallpaperActivity) this.f$0).lambda$new$0((TL_stories.TL_premium_boostsStatus) this.f$1, (TLRPC.Chat) this.f$2, (TL_stories.TL_premium_boostsStatus) obj);
                break;
            case 2:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$211((TLRPC.User) this.f$1, (TLRPC.TL_attachMenuBot) this.f$2, (Boolean) obj);
                break;
            case 3:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$170((TLRPC.TL_attachMenuBot) this.f$1, (LaunchActivity) this.f$2, (Boolean) obj);
                break;
            default:
                ((LaunchActivity) this.f$0).lambda$handleIntent$10((Browser.Progress) this.f$1, (int[]) this.f$2, (Long) obj);
                break;
        }
    }
}
