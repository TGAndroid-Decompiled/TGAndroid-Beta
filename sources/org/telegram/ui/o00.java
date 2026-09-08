package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class o00 extends y00 {
    public final p00 E;

    public o00(p00 p00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = p00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        p00 p00Var = this.E;
        p00Var.d.Y.remove(tL_exportedChatlistInvite);
        p00Var.d.T();
        p00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final o00 f38828b;

            {
                this.f38828b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o00 o00Var = this.f38828b;
                        String str = o00Var.f42962x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(o00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38828b.d();
                        return;
                    default:
                        this.f38828b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final o00 f38828b;

            {
                this.f38828b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o00 o00Var = this.f38828b;
                        String str = o00Var.f42962x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(o00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38828b.d();
                        return;
                    default:
                        this.f38828b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final o00 f38828b;

            {
                this.f38828b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o00 o00Var = this.f38828b;
                        String str = o00Var.f42962x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(o00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38828b.d();
                        return;
                    default:
                        this.f38828b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f28669i = 3;
        }
        F.Z();
    }
}
