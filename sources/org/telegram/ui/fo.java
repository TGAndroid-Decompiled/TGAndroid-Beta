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
public final class fo implements View.OnClickListener {
    public final int f37758a;
    public final long f37759b;
    public final Object f37760c;
    public final Object d;

    public fo(Object obj, Object obj2, long j3, int i10) {
        this.f37758a = i10;
        this.f37760c = obj;
        this.d = obj2;
        this.f37759b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37758a) {
            case 0:
                final uo uoVar = (uo) this.f37760c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(uoVar.getParentActivity(), 3, null);
                    a2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !uoVar.M.b();
                    if (uoVar.M.getCheckBox().F == null) {
                        uoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = uoVar.getMessagesController().getBoostsController();
                    final long j3 = this.f37759b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            uo uoVar2 = uo.this;
                            TLRPC.Chat chat = uoVar2.f42720x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                uoVar2.getMessagesController().putChat(uoVar2.f42720x0, false);
                            }
                            Switch checkBox = uoVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < uoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (z11 && tL_premium_boostsStatus.level < uoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                uoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = uoVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(uoVar2, a2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            uoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(uoVar2.f42720x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            uoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            a2Var2.dismiss();
                            uoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.s3(5, uoVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.a2[]) this.f37760c)[0].dismiss();
                ((org.telegram.ui.Components.ss) this.d).run(-this.f37759b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a2[]) this.f37760c)[0].dismiss();
                ((org.telegram.ui.Components.ss) this.d).run(-this.f37759b);
                return;
            case 3:
                org.telegram.ui.Components.d80.O((org.telegram.ui.Components.d80) this.f37760c, (Context) this.d, this.f37759b);
                return;
            case 4:
                sy syVar = (sy) this.f37760c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j10 = this.f37759b;
                if (hasUnread) {
                    syVar.g4(j10);
                } else {
                    syVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                syVar.finishPreviewFragment();
                return;
            case 5:
                uo0 uo0Var = (uo0) this.f37760c;
                uo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = uo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    uo0Var.m0 = true;
                    uo0Var.f42740f[0].setText("");
                    uo0Var.m0 = false;
                    uo0Var.H0 = 0L;
                    uo0Var.L0();
                } else {
                    uo0Var.f42740f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f37759b, false, true, true, uo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = uo0Var.f42740f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                yh.s3.Z0((yh.s3) this.f37760c, (String) this.d, this.f37759b);
                return;
        }
    }
}
