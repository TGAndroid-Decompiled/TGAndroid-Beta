package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class a00 extends j00 {
    public final b00 E;

    public a00(b00 b00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = b00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        b00 b00Var = this.E;
        b00Var.d.Z.remove(tL_exportedChatlistInvite);
        b00Var.d.T();
        b00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.j80 F = org.telegram.ui.Components.j80.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final a00 f44246b;

            {
                this.f44246b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a00 a00Var = this.f44246b;
                        String str = a00Var.f38428x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.f36458a0, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44246b.d();
                        return;
                    default:
                        this.f44246b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final a00 f44246b;

            {
                this.f44246b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a00 a00Var = this.f44246b;
                        String str = a00Var.f38428x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.f36458a0, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44246b.d();
                        return;
                    default:
                        this.f44246b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final a00 f44246b;

            {
                this.f44246b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a00 a00Var = this.f44246b;
                        String str = a00Var.f38428x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.f36458a0, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f44246b.d();
                        return;
                    default:
                        this.f44246b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f27562i = 3;
        }
        F.Z();
    }
}
