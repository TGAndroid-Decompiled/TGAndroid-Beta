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

public final class u71 implements org.telegram.ui.ip0 {

    public final w71 f33001a;

    public u71(w71 w71Var) {
        this.f33001a = w71Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        w71 w71Var = this.f33001a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
            if (sendingMediaInfo.path != null) {
                w71Var.f34138e = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(w71Var.f34138e));
                w71Var.d.b(w71Var.f34138e, bitmapLoadBitmap, true);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            this.f33001a.f34136b.startActivityForResult(intent, 11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
