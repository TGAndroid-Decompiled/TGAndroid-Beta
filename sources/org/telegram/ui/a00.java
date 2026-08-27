package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

public final class a00 extends j00 {
    public final b00 A;

    public a00(b00 b00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.A = b00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        b00 b00Var = this.A;
        b00Var.d.U.remove(tL_exportedChatlistInvite);
        b00Var.d.T();
        b00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.b70 b70VarF = org.telegram.ui.Components.b70.F(this.A.d.container, null, this);
        final int i10 = 0;
        b70VarF.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {

            public final a00 f45282b;

            {
                this.f45282b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        a00 a00Var = this.f45282b;
                        String str = a00Var.f39207x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.mc(a00Var.A.d.V, null).k(false).j();
                        }
                        break;
                    case 1:
                        this.f45282b.d();
                        break;
                    default:
                        this.f45282b.a();
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        b70VarF.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {

            public final a00 f45282b;

            {
                this.f45282b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        a00 a00Var = this.f45282b;
                        String str = a00Var.f39207x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.mc(a00Var.A.d.V, null).k(false).j();
                        }
                        break;
                    case 1:
                        this.f45282b.d();
                        break;
                    default:
                        this.f45282b.a();
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        b70VarF.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {

            public final a00 f45282b;

            {
                this.f45282b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        a00 a00Var = this.f45282b;
                        String str = a00Var.f39207x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.mc(a00Var.A.d.V, null).k(false).j();
                        }
                        break;
                    case 1:
                        this.f45282b.d();
                        break;
                    default:
                        this.f45282b.a();
                        break;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            b70VarF.f26974i = 3;
        }
        b70VarF.Z();
    }
}
