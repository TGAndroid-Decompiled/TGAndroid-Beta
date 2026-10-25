package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ii implements org.telegram.ui.qq0 {
    public boolean f29292a;
    public final HashMap f29293b;
    public final ArrayList f29294c;
    public final ti d;

    public ii(ti tiVar, HashMap hashMap, ArrayList arrayList) {
        this.d = tiVar;
        this.f29293b = hashMap;
        this.f29294c = arrayList;
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            HashMap hashMap = this.f29293b;
            if (!hashMap.isEmpty() && !this.f29292a) {
                this.f29292a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f29294c;
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
                        ((org.telegram.ui.un) this.d.f33018f0).k8(i10, arrayList, z11);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void b(Editable editable) {
    }
}
