package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class l00 extends u00 {
    public final m00 B;

    public l00(m00 m00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.B = m00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        m00 m00Var = this.B;
        m00Var.d.V.remove(tL_exportedChatlistInvite);
        m00Var.d.T();
        m00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.q70 F = org.telegram.ui.Components.q70.F(this.B.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final l00 f38249b;

            {
                this.f38249b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l00 l00Var = this.f38249b;
                        String str = l00Var.f41753x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38249b.d();
                        return;
                    default:
                        this.f38249b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final l00 f38249b;

            {
                this.f38249b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l00 l00Var = this.f38249b;
                        String str = l00Var.f41753x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38249b.d();
                        return;
                    default:
                        this.f38249b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final l00 f38249b;

            {
                this.f38249b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l00 l00Var = this.f38249b;
                        String str = l00Var.f41753x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f38249b.d();
                        return;
                    default:
                        this.f38249b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f30311i = 3;
        }
        F.Z();
    }
}
