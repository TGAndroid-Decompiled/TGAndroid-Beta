package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class q00 extends a10 {
    public final r00 E;

    public q00(r00 r00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = r00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        r00 r00Var = this.E;
        r00Var.d.Y.remove(tL_exportedChatlistInvite);
        r00Var.d.T();
        r00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final q00 f35654b;

            {
                this.f35654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f35654b;
                        String str = q00Var.f30774x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.wc(q00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35654b.d();
                        return;
                    default:
                        this.f35654b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final q00 f35654b;

            {
                this.f35654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f35654b;
                        String str = q00Var.f30774x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.wc(q00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35654b.d();
                        return;
                    default:
                        this.f35654b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final q00 f35654b;

            {
                this.f35654b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        q00 q00Var = this.f35654b;
                        String str = q00Var.f30774x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.wc(q00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35654b.d();
                        return;
                    default:
                        this.f35654b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f28683i = 3;
        }
        F.Z();
    }
}
