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
public final class ko implements View.OnClickListener {
    public final int f37467a;
    public final long f37468b;
    public final Object f37469c;
    public final Object d;

    public ko(Object obj, Object obj2, long j10, int i10) {
        this.f37467a = i10;
        this.f37469c = obj;
        this.d = obj2;
        this.f37468b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37467a) {
            case 0:
                final zo zoVar = (zo) this.f37469c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(zoVar.getParentActivity(), 3, null);
                    a2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !zoVar.M.b();
                    if (zoVar.M.getCheckBox().F == null) {
                        zoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = zoVar.getMessagesController().getBoostsController();
                    final long j10 = this.f37468b;
                    boostsController.getBoostsStats(j10, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            zo zoVar2 = zo.this;
                            TLRPC.Chat chat = zoVar2.f42394x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                zoVar2.getMessagesController().putChat(zoVar2.f42394x0, false);
                            }
                            Switch checkBox = zoVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < zoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (z11 && tL_premium_boostsStatus.level < zoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                zoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = zoVar2.getMessagesController().getBoostsController();
                                long j11 = j10;
                                boostsController2.userCanBoostChannel(j11, tL_premium_boostsStatus, new bi.i(zoVar2, a2Var2, tL_premium_boostsStatus, j11, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            zoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(zoVar2.f42394x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            zoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            a2Var2.dismiss();
                            zoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new di.s3(5, zoVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.a2[]) this.f37469c)[0].dismiss();
                ((org.telegram.ui.Components.os) this.d).run(-this.f37468b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a2[]) this.f37469c)[0].dismiss();
                ((org.telegram.ui.Components.os) this.d).run(-this.f37468b);
                return;
            case 3:
                org.telegram.ui.Components.z70.O((org.telegram.ui.Components.z70) this.f37469c, (Context) this.d, this.f37468b);
                return;
            case 4:
                yy yyVar = (yy) this.f37469c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j11 = this.f37468b;
                if (hasUnread) {
                    yyVar.h4(j11);
                } else {
                    yyVar.getMessagesController().markDialogAsUnread(j11, null, 0L);
                }
                yyVar.finishPreviewFragment();
                return;
            case 5:
                ap0 ap0Var = (ap0) this.f37469c;
                ap0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = ap0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    ap0Var.m0 = true;
                    ap0Var.f34020f[0].setText("");
                    ap0Var.m0 = false;
                    ap0Var.H0 = 0L;
                    ap0Var.L0();
                } else {
                    ap0Var.f34020f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f37468b, false, true, true, ap0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = ap0Var.f34020f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                zh.r3.Z0((zh.r3) this.f37469c, (String) this.d, this.f37468b);
                return;
        }
    }
}
