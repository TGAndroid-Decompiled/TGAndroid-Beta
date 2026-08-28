package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ob extends g7.f6 {
    public MessageObject f41038a;
    public int f41039b = 0;
    public boolean f41040c = true;
    public int d = 0;
    public int f41041e;
    public final pb f41042f;

    public ob(pb pbVar) {
        this.f41042f = pbVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f41038a;
        pb pbVar = this.f41042f;
        if (messageObject != null) {
            int indexOf = pbVar.f41413o0.indexOf(messageObject) + pbVar.E.f40102f;
            if (indexOf >= 0) {
                pbVar.C.i1(indexOf, this.f41041e, false);
            }
        } else {
            pbVar.C.i1(this.f41039b, this.d, this.f41040c);
        }
        this.f41038a = null;
        pbVar.V = true;
        pbVar.e1();
        AndroidUtilities.runOnUIThread(new kt0(this, 21));
    }

    @Override
    public final void c() {
        pb pbVar = this.f41042f;
        pbVar.K0 = pbVar.getNotificationCenter().setAnimationInProgress(pbVar.K0, pb.U0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            this.f41042f.v.add((org.telegram.ui.Cells.t1) view);
        }
    }
}
