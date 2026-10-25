package org.telegram.ui.Components;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class a50 implements org.telegram.ui.qq0 {
    public boolean f26409a;
    public final HashMap f26410b;
    public final ArrayList f26411c;
    public final g50 d;

    public a50(g50 g50Var, HashMap hashMap, ArrayList arrayList) {
        this.d = g50Var;
        this.f26410b = hashMap;
        this.f26411c = arrayList;
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        String str;
        HashMap hashMap = this.f26410b;
        if (!hashMap.isEmpty()) {
            g50 g50Var = this.d;
            if (g50Var.f28420b != null && !this.f26409a && !z10) {
                this.f26409a = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f26411c;
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
                        g50.a(g50Var, false, arrayList);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return this.d.f28420b.e();
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
