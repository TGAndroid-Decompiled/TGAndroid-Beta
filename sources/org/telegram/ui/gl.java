package org.telegram.ui;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class gl implements hp0 {
    public final qn f38563a;

    public gl(qn qnVar) {
        this.f38563a = qnVar;
    }

    @Override
    public final void b() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f38563a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void a(ArrayList arrayList) {
    }
}
