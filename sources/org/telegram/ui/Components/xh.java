package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class xh implements org.telegram.ui.ar0 {
    public boolean f29041a;
    public final HashMap f29042b;
    public final ArrayList f29043c;
    public final yi d;

    public xh(yi yiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = yiVar;
        this.f29042b = hashMap;
        this.f29043c = arrayList;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f29042b;
            if (!hashMap.isEmpty() && !this.f29041a) {
                this.f29041a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29043c;
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
                        ((org.telegram.ui.eo) this.d.f29366f0).d8(i10, arrayList, z11);
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
