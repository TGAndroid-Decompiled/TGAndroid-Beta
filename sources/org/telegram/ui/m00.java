package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class m00 extends v00 {
    public final n00 B;

    public m00(n00 n00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.B = n00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        n00 n00Var = this.B;
        n00Var.d.V.remove(tL_exportedChatlistInvite);
        n00Var.d.T();
        n00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.p70 F = org.telegram.ui.Components.p70.F(this.B.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final m00 f35615b;

            {
                this.f35615b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m00 m00Var = this.f35615b;
                        String str = m00Var.f38945x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35615b.d();
                        return;
                    default:
                        this.f35615b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final m00 f35615b;

            {
                this.f35615b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m00 m00Var = this.f35615b;
                        String str = m00Var.f38945x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35615b.d();
                        return;
                    default:
                        this.f35615b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final m00 f35615b;

            {
                this.f35615b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m00 m00Var = this.f35615b;
                        String str = m00Var.f38945x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f35615b.d();
                        return;
                    default:
                        this.f35615b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f27759i = 3;
        }
        F.Z();
    }
}
