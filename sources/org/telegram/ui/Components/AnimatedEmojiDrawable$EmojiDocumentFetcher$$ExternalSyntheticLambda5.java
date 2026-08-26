package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;
    public final TLObject f$2;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher = this.f$0;
                emojiDocumentFetcher.getClass();
                AndroidUtilities.runOnUIThread(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5(emojiDocumentFetcher, this.f$1, this.f$2, 1));
                break;
            default:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher2 = this.f$0;
                emojiDocumentFetcher2.getClass();
                HashSet hashSet = new HashSet(this.f$1);
                TLObject tLObject = this.f$2;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(emojiDocumentFetcher2.currentAccount).getStorageQueue().postRunnable(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda1(emojiDocumentFetcher2, arrayList, 1));
                    emojiDocumentFetcher2.processDocuments(arrayList);
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i)).id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        emojiDocumentFetcher2.loadFromServer(new ArrayList(hashSet));
                    }
                }
                break;
        }
    }
}
