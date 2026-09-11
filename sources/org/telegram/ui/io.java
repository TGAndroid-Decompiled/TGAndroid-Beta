package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class io implements View.OnClickListener {
    public final int f37415a;
    public final long f37416b;
    public final Object f37417c;
    public final Object d;

    public io(Object obj, Object obj2, long j3, int i10) {
        this.f37415a = i10;
        this.f37417c = obj;
        this.d = obj2;
        this.f37416b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37415a) {
            case 0:
                final xo xoVar = (xo) this.f37417c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(xoVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !xoVar.M.b();
                    if (xoVar.M.getCheckBox().F == null) {
                        xoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = xoVar.getMessagesController().getBoostsController();
                    final long j3 = this.f37416b;
                    boostsController.getBoostsStats(j3, new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            xo xoVar2 = xo.this;
                            TLRPC.Chat chat = xoVar2.f42799x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                xoVar2.getMessagesController().putChat(xoVar2.f42799x0, false);
                            }
                            Switch checkBox = xoVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < xoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < xoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                xoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = xoVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new bi.i(xoVar2, b2Var2, tL_premium_boostsStatus, j10, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            xoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(xoVar2.f42799x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            xoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            xoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new di.u3(5, xoVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.b2[]) this.f37417c)[0].dismiss();
                ((org.telegram.ui.Components.as) this.d).run(-this.f37416b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f37417c)[0].dismiss();
                ((org.telegram.ui.Components.as) this.d).run(-this.f37416b);
                return;
            case 3:
                org.telegram.ui.Components.b70.N((org.telegram.ui.Components.b70) this.f37417c, (Context) this.d, this.f37416b);
                return;
            case 4:
                uy uyVar = (uy) this.f37417c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.f37416b;
                if (hasUnread) {
                    uyVar.j4(j10);
                } else {
                    uyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                uyVar.finishPreviewFragment();
                return;
            case 5:
                xo0 xo0Var = (xo0) this.f37417c;
                xo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = xo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    xo0Var.m0 = true;
                    xo0Var.f42819f[0].setText("");
                    xo0Var.m0 = false;
                    xo0Var.H0 = 0L;
                    xo0Var.L0();
                } else {
                    xo0Var.f42819f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f37416b, false, true, true, xo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = xo0Var.f42819f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                zh.w3.Y0((zh.w3) this.f37417c, (String) this.d, this.f37416b);
                return;
        }
    }
}
