package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class nb extends i7.g6 {
    public MessageObject f40767a;
    public int f40768b = 0;
    public boolean f40769c = true;
    public int d = 0;
    public int f40770e;
    public final ob f40771f;

    public nb(ob obVar) {
        this.f40771f = obVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f40767a;
        ob obVar = this.f40771f;
        if (messageObject != null) {
            int indexOf = obVar.f41061o0.indexOf(messageObject) + obVar.E.f39828f;
            if (indexOf >= 0) {
                obVar.C.i1(indexOf, this.f40770e, false);
            }
        } else {
            obVar.C.i1(this.f40768b, this.d, this.f40769c);
        }
        this.f40767a = null;
        obVar.V = true;
        obVar.e1();
        AndroidUtilities.runOnUIThread(new it0(this, 21));
    }

    @Override
    public final void c() {
        ob obVar = this.f40771f;
        obVar.K0 = obVar.getNotificationCenter().setAnimationInProgress(obVar.K0, ob.U0);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            this.f40771f.v.add((org.telegram.ui.Cells.s1) view);
        }
    }
}
