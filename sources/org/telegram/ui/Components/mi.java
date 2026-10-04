package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class mi implements org.telegram.ui.vq0 {
    public boolean f28629a;
    public final HashMap f28630b;
    public final ArrayList f28631c;
    public final xi d;

    public mi(xi xiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = xiVar;
        this.f28630b = hashMap;
        this.f28631c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f28630b;
            if (!hashMap.isEmpty() && !this.f28629a) {
                this.f28629a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28631c;
                    if (i11 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i11));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        arrayList.add(sendingMediaInfo);
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        String str2 = searchImage.imagePath;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        } else {
                            sendingMediaInfo.searchImage = searchImage;
                        }
                        sendingMediaInfo.thumbPath = searchImage.thumbPath;
                        sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                        CharSequence charSequence = searchImage.caption;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        sendingMediaInfo.caption = str;
                        sendingMediaInfo.entities = searchImage.entities;
                        sendingMediaInfo.masks = searchImage.stickers;
                        sendingMediaInfo.ttl = searchImage.ttl;
                        TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                        if (botInlineResult != null && searchImage.type == 1) {
                            sendingMediaInfo.inlineResult = botInlineResult;
                            sendingMediaInfo.params = searchImage.params;
                        }
                        searchImage.date = (int) (System.currentTimeMillis() / 1000);
                        i11++;
                    } else {
                        ((org.telegram.ui.yn) this.d.f32819f0).d8(i10, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b(Editable editable) {
    }

    @Override
    public final void g() {
    }
}
