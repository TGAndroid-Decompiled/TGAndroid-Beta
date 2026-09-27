package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class r40 implements org.telegram.ui.vq0 {
    public boolean f27901a;
    public final HashMap f27902b;
    public final ArrayList f27903c;
    public final x40 d;

    public r40(x40 x40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = x40Var;
        this.f27902b = hashMap;
        this.f27903c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f30247b.e();
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f27902b;
        if (!hashMap.isEmpty()) {
            x40 x40Var = this.d;
            if (x40Var.f30247b != null && !this.f27901a && !z10) {
                this.f27901a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f27903c;
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
                        x40.b(x40Var, false, arrayList);
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
