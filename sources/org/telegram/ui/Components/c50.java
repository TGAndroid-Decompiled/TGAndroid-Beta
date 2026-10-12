package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class c50 implements org.telegram.ui.gr0 {
    public boolean f23950a;
    public final HashMap f23951b;
    public final ArrayList f23952c;
    public final i50 d;

    public c50(i50 i50Var, HashMap hashMap, ArrayList arrayList) {
        this.d = i50Var;
        this.f23951b = hashMap;
        this.f23952c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f25830b.e();
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f23951b;
        if (!hashMap.isEmpty()) {
            i50 i50Var = this.d;
            if (i50Var.f25830b != null && !this.f23950a && !z10) {
                this.f23950a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f23952c;
                    if (i11 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i11));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        arrayList.add(sendingMediaInfo);
                        if (obj instanceof MediaController.SearchImage) {
                            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                            String str2 = searchImage.imagePath;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            } else {
                                sendingMediaInfo.searchImage = searchImage;
                            }
                            sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                            sendingMediaInfo.thumbPath = searchImage.thumbPath;
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
                        }
                        i11++;
                    } else {
                        i50.a(i50Var, false, arrayList);
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
