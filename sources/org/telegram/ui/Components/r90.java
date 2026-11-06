package org.telegram.ui.Components;

import android.content.Context;
public final class r90 implements Runnable {
    public final int f37668a;
    public final ca0 f37669b;
    public final Context f37670c;

    public r90(ca0 ca0Var, Context context, int i7) {
        this.f37668a = i7;
        this.f37669b = ca0Var;
        this.f37670c = context;
    }

    @Override
    public final void run() {
        switch (this.f37668a) {
            case 0:
                ca0 ca0Var = this.f37669b;
                ca0Var.f32503c0.a(false);
                org.telegram.messenger.g0.h3(new r90(ca0Var, this.f37670c, 1));
                return;
            default:
                Context context = this.f37670c;
                if (org.telegram.messenger.g0.E1(context)) {
                    new ug.w0(43, context, this.f37669b.f32503c0.F).show();
                    return;
                }
                return;
        }
    }
}
