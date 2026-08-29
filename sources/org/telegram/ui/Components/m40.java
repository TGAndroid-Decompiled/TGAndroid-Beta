package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class m40 implements org.telegram.ui.yp0 {
    public boolean f30570a;
    public final HashMap f30571b;
    public final ArrayList f30572c;
    public final s40 d;

    public m40(s40 s40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = s40Var;
        this.f30571b = hashMap;
        this.f30572c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f32470b.e();
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f30571b;
        if (!hashMap.isEmpty()) {
            s40 s40Var = this.d;
            if (s40Var.f32470b != null && !this.f30570a && !z10) {
                this.f30570a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f30572c;
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
                        s40.b(s40Var, false, arrayList);
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
