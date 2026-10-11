package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class n00 extends x00 {
    public final o00 E;

    public n00(o00 o00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = o00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        o00 o00Var = this.E;
        o00Var.d.Y.remove(tL_exportedChatlistInvite);
        o00Var.d.U();
        o00Var.d.V(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.q80 F = org.telegram.ui.Components.q80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final n00 f39786b;

            {
                this.f39786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n00 n00Var = this.f39786b;
                        String str = n00Var.f43913x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.ad(n00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39786b.d();
                        return;
                    default:
                        this.f39786b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final n00 f39786b;

            {
                this.f39786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n00 n00Var = this.f39786b;
                        String str = n00Var.f43913x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.ad(n00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39786b.d();
                        return;
                    default:
                        this.f39786b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final n00 f39786b;

            {
                this.f39786b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n00 n00Var = this.f39786b;
                        String str = n00Var.f43913x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.ad(n00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f39786b.d();
                        return;
                    default:
                        this.f39786b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f30065i = 3;
        }
        F.Z();
    }
}
