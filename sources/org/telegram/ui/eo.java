package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class eo implements View.OnClickListener {
    public final int f36063a;
    public final long f36064b;
    public final Object f36065c;
    public final Object d;

    public eo(Object obj, Object obj2, long j3, int i10) {
        this.f36063a = i10;
        this.f36065c = obj;
        this.d = obj2;
        this.f36064b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36063a) {
            case 0:
                final to toVar = (to) this.f36065c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(toVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !toVar.M.b();
                    if (toVar.M.getCheckBox().F == null) {
                        toVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = toVar.getMessagesController().getBoostsController();
                    final long j3 = this.f36064b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            to toVar2 = to.this;
                            TLRPC.Chat chat = toVar2.f40920x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                toVar2.getMessagesController().putChat(toVar2.f40920x0, false);
                            }
                            Switch checkBox = toVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < toVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < toVar2.getMessagesController().channelAutotranslationLevelMin) {
                                toVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = toVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(toVar2, b2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            toVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(toVar2.f40920x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            toVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            toVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.t3(5, toVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.b2[]) this.f36065c)[0].dismiss();
                ((org.telegram.ui.Components.es) this.d).run(-this.f36064b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f36065c)[0].dismiss();
                ((org.telegram.ui.Components.es) this.d).run(-this.f36064b);
                return;
            case 3:
                org.telegram.ui.Components.p70.L((org.telegram.ui.Components.p70) this.f36065c, (Context) this.d, this.f36064b);
                return;
            case 4:
                uy uyVar = (uy) this.f36065c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j10 = this.f36064b;
                if (hasUnread) {
                    uyVar.s4(j10);
                } else {
                    uyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                uyVar.finishPreviewFragment();
                return;
            case 5:
                so0 so0Var = (so0) this.f36065c;
                so0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = so0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    so0Var.m0 = true;
                    so0Var.f40560f[0].setText("");
                    so0Var.m0 = false;
                    so0Var.H0 = 0L;
                    so0Var.L0();
                } else {
                    so0Var.f40560f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f36064b, false, true, true, so0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = so0Var.f40560f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                yh.x3.Y0((yh.x3) this.f36065c, (String) this.d, this.f36064b);
                return;
        }
    }
}
