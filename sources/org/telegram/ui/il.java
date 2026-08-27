package org.telegram.ui;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

public final class il implements ip0 {

    public final rn f39127a;

    public il(rn rnVar) {
        this.f39127a = rnVar;
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
            Intent intentCreateChooser = Intent.createChooser(intent2, null);
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            this.f39127a.startActivityForResult(intentCreateChooser, 1);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void a(ArrayList arrayList) {
    }
}
