package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k00 extends u00 {
    public final l00 E;

    public k00(l00 l00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = l00Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        l00 l00Var = this.E;
        l00Var.d.Y.remove(tL_exportedChatlistInvite);
        l00Var.d.T();
        l00Var.d.U(true);
    }

    @Override
    public final void c() {
        org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(this.E.d.container, null, this);
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
            public final k00 f34598b;

            {
                this.f34598b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k00 k00Var = this.f34598b;
                        String str = k00Var.f38254x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(k00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f34598b.d();
                        return;
                    default:
                        this.f34598b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
            public final k00 f34598b;

            {
                this.f34598b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k00 k00Var = this.f34598b;
                        String str = k00Var.f38254x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(k00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f34598b.d();
                        return;
                    default:
                        this.f34598b.a();
                        return;
                }
            }
        }, false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
            public final k00 f34598b;

            {
                this.f34598b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k00 k00Var = this.f34598b;
                        String str = k00Var.f38254x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.yc(k00Var.E.d.Z, null).k(false).j();
                            return;
                        }
                        return;
                    case 1:
                        this.f34598b.d();
                        return;
                    default:
                        this.f34598b.a();
                        return;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.f30529i = 3;
        }
        F.Z();
    }
}
