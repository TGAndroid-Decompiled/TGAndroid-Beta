package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class s40 implements org.telegram.ui.lq0 {
    public boolean f30985a;
    public final HashMap f30986b;
    public final ArrayList f30987c;
    public final y40 d;

    public s40(y40 y40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = y40Var;
        this.f30986b = hashMap;
        this.f30987c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f33310b.e();
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        String str;
        HashMap hashMap = this.f30986b;
        if (!hashMap.isEmpty()) {
            y40 y40Var = this.d;
            if (y40Var.f33310b != null && !this.f30985a && !z4) {
                this.f30985a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f30987c;
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
                        y40.b(y40Var, false, arrayList);
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
    public final void c(Editable editable) {
    }

    @Override
    public final void d() {
    }
}
