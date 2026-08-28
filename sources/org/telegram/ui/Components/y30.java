package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class y30 implements org.telegram.ui.yp0 {
    public boolean f34844a;
    public final HashMap f34845b;
    public final ArrayList f34846c;
    public final e40 d;

    public y30(e40 e40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = e40Var;
        this.f34845b = hashMap;
        this.f34846c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f27910b.e();
    }

    @Override
    public final void i(int i9, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f34845b;
        if (!hashMap.isEmpty()) {
            e40 e40Var = this.d;
            if (e40Var.f27910b != null && !this.f34844a && !z10) {
                this.f34844a = true;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f34846c;
                    if (i10 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i10));
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
                        i10++;
                    } else {
                        e40.b(e40Var, false, arrayList);
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
    public final void h() {
    }
}
