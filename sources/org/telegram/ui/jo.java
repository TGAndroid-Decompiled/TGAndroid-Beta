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
public final class jo implements View.OnClickListener {
    public final int f34142a;
    public final long f34143b;
    public final Object f34144c;
    public final Object d;

    public jo(Object obj, Object obj2, long j3, int i10) {
        this.f34142a = i10;
        this.f34144c = obj;
        this.d = obj2;
        this.f34143b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34142a) {
            case 0:
                final yo yoVar = (yo) this.f34144c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(yoVar.getParentActivity(), 3, null);
                    d2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !yoVar.M.b();
                    if (yoVar.M.getCheckBox().F == null) {
                        yoVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = yoVar.getMessagesController().getBoostsController();
                    final long j3 = this.f34143b;
                    boostsController.getBoostsStats(j3, new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            yo yoVar2 = yo.this;
                            TLRPC.Chat chat = yoVar2.f39070x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                yoVar2.getMessagesController().putChat(yoVar2.f39070x0, false);
                            }
                            Switch checkBox = yoVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < yoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            if (z11 && tL_premium_boostsStatus.level < yoVar2.getMessagesController().channelAutotranslationLevelMin) {
                                yoVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = yoVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new to(yoVar2, d2Var2, tL_premium_boostsStatus, j10, 0));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            yoVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(yoVar2.f39070x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            yoVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            d2Var2.dismiss();
                            yoVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new bi.m4(5, yoVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.d2[]) this.f34144c)[0].dismiss();
                ((org.telegram.ui.Components.hs) this.d).run(-this.f34143b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.d2[]) this.f34144c)[0].dismiss();
                ((org.telegram.ui.Components.hs) this.d).run(-this.f34143b);
                return;
            case 3:
                org.telegram.ui.Components.k70.N((org.telegram.ui.Components.k70) this.f34144c, (Context) this.d, this.f34143b);
                return;
            case 4:
                wy wyVar = (wy) this.f34144c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.f34143b;
                if (hasUnread) {
                    wyVar.j4(j10);
                } else {
                    wyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                wyVar.finishPreviewFragment();
                return;
            case 5:
                wo0 wo0Var = (wo0) this.f34144c;
                wo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = wo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    wo0Var.m0 = true;
                    wo0Var.f38267f[0].setText("");
                    wo0Var.m0 = false;
                    wo0Var.H0 = 0L;
                    wo0Var.L0();
                } else {
                    wo0Var.f38267f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f34143b, false, true, true, wo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = wo0Var.f38267f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                xh.x3.Y0((xh.x3) this.f34144c, (String) this.d, this.f34143b);
                return;
        }
    }
}
