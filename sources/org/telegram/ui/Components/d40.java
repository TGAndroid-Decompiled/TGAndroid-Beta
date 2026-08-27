package org.telegram.ui.Components;

import android.text.Editable;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

public final class d40 implements org.telegram.ui.zp0 {

    public boolean f27644a;

    public final HashMap f27645b;

    public final ArrayList f27646c;
    public final j40 d;

    public d40(j40 j40Var, HashMap map, ArrayList arrayList) {
        this.d = j40Var;
        this.f27645b = map;
        this.f27646c = arrayList;
    }

    @Override
    public final boolean e() {
        return this.d.f29570b.e();
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) throws FileNotFoundException {
        HashMap map = this.f27645b;
        if (map.isEmpty()) {
            return;
        }
        j40 j40Var = this.d;
        if (j40Var.f29570b == null || this.f27644a || z10) {
            return;
        }
        this.f27644a = true;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f27646c;
            if (i11 >= arrayList2.size()) {
                j40.b(j40Var, false, arrayList);
                return;
            }
            Object obj = map.get(arrayList2.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList.add(sendingMediaInfo);
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str = searchImage.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                CharSequence charSequence = searchImage.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
            }
            i11++;
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
