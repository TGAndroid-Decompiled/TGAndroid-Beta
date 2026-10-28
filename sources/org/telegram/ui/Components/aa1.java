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
public final class aa1 implements org.telegram.ui.bq0 {
    public final ca1 f26492a;

    public aa1(ca1 ca1Var) {
        this.f26492a = ca1Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ca1 ca1Var = this.f26492a;
        try {
            if (!arrayList.isEmpty()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList.get(0);
                if (sendingMediaInfo.path != null) {
                    File directory = FileLoader.getDirectory(4);
                    ca1Var.e = new File(directory, Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(ca1Var.e));
                    ca1Var.d.b(ca1Var.e, loadBitmap, true);
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
            this.f26492a.f27114b.startActivityForResult(intent, 11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
