package org.telegram.ui;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class jl implements gp0 {
    public final tn f39584a;

    public jl(tn tnVar) {
        this.f39584a = tnVar;
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
            this.f39584a.startActivityForResult(createChooser, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void a(ArrayList arrayList) {
    }
}
