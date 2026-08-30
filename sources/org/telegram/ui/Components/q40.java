package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class q40 implements org.telegram.ui.eq0 {
    public boolean f28052a;
    public final HashMap f28053b;
    public final ArrayList f28054c;
    public final w40 d;

    public q40(w40 w40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = w40Var;
        this.f28053b = hashMap;
        this.f28054c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f30191b.e();
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        String str;
        HashMap hashMap = this.f28053b;
        if (!hashMap.isEmpty()) {
            w40 w40Var = this.d;
            if (w40Var.f30191b != null && !this.f28052a && !z4) {
                this.f28052a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28054c;
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
                        w40.b(w40Var, false, arrayList);
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
