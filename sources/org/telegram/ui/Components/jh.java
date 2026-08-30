package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class jh implements org.telegram.ui.eq0 {
    public boolean f25978a;
    public final HashMap f25979b;
    public final ArrayList f25980c;
    public final li d;

    public jh(li liVar, HashMap hashMap, ArrayList arrayList) {
        this.d = liVar;
        this.f25979b = hashMap;
        this.f25980c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        String str;
        if (!z4) {
            HashMap hashMap = this.f25979b;
            if (!hashMap.isEmpty() && !this.f25978a) {
                this.f25978a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f25980c;
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
                        ((org.telegram.ui.xn) this.d.f26689c0).d8(i10, arrayList, z10);
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
    public final void c() {
    }
}
