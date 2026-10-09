package org.telegram.ui.Components;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
public final class t91 implements org.telegram.ui.jq0 {
    public final v91 f31098a;

    public t91(v91 v91Var) {
        this.f31098a = v91Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        v91 v91Var = this.f31098a;
        try {
            if (!arrayList.isEmpty()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
                if (sendingMediaInfo.path != null) {
                    File directory = FileLoader.getDirectory(4);
                    v91Var.f31720e = new File(directory, Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(v91Var.f31720e));
                    v91Var.d.b(v91Var.f31720e, loadBitmap, true);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.f31098a.f31718b.startActivityForResult(intent, 11);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
