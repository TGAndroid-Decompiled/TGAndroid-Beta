package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;

public final class RichEditor$$ExternalSyntheticLambda43 implements ChatAttachAlertLocationLayout.LocationActivityDelegate, ChatAttachAlertAudioLayout.AudioSelectDelegate {
    public final RichEditor f$0;
    public final ChatAttachAlert f$1;

    public RichEditor$$ExternalSyntheticLambda43(RichEditor richEditor, ChatAttachAlert chatAttachAlert) {
        this.f$0 = richEditor;
        this.f$1 = chatAttachAlert;
    }

    @Override
    public void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        RichEditor richEditor = this.f$0;
        richEditor.getClass();
        if (arrayList != null && !arrayList.isEmpty()) {
            richEditor.listView.attachAudio((MessageObject) arrayList.get(0));
        }
        this.f$1.dismiss(true);
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        RichEditor richEditor = this.f$0;
        richEditor.getClass();
        ChatAttachAlert chatAttachAlert = this.f$1;
        if (messageMedia == null || messageMedia.geo == null) {
            chatAttachAlert.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        richEditor.listView.addBlock(pageblockmap);
        chatAttachAlert.dismiss(true);
    }
}
