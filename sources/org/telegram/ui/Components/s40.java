package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class s40 implements org.telegram.ui.sq0 {
    public boolean f28188a;
    public final HashMap f28189b;
    public final ArrayList f28190c;
    public final y40 d;

    public s40(y40 y40Var, HashMap hashMap, ArrayList arrayList) {
        this.d = y40Var;
        this.f28189b = hashMap;
        this.f28190c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f30581b.e();
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f28189b;
        if (!hashMap.isEmpty()) {
            y40 y40Var = this.d;
            if (y40Var.f30581b != null && !this.f28188a && !z10) {
                this.f28188a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28190c;
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
    public final void b(Editable editable) {
    }

    @Override
    public final void g() {
    }
}
