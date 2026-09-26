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
public final class bo implements View.OnClickListener {
    public final int f32454a;
    public final long f32455b;
    public final Object f32456c;
    public final Object d;

    public bo(Object obj, Object obj2, long j3, int i10) {
        this.f32454a = i10;
        this.f32456c = obj;
        this.d = obj2;
        this.f32455b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32454a) {
            case 0:
                final ro roVar = (ro) this.f32456c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(roVar.getParentActivity(), 3, null);
                    a2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !roVar.M.b();
                    if (roVar.M.getCheckBox().F == null) {
                        roVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = roVar.getMessagesController().getBoostsController();
                    final long j3 = this.f32455b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ro roVar2 = ro.this;
                            TLRPC.Chat chat = roVar2.f37419x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                roVar2.getMessagesController().putChat(roVar2.f37419x0, false);
                            }
                            Switch checkBox = roVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                            if (z11 && tL_premium_boostsStatus.level < roVar2.getMessagesController().channelAutotranslationLevelMin) {
                                roVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = roVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(roVar2, a2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            roVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(roVar2.f37419x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            roVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            a2Var2.dismiss();
                            roVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.t3(5, roVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.a2[]) this.f32456c)[0].dismiss();
                ((org.telegram.ui.Components.ds) this.d).run(-this.f32455b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a2[]) this.f32456c)[0].dismiss();
                ((org.telegram.ui.Components.ds) this.d).run(-this.f32455b);
                return;
            case 3:
                org.telegram.ui.Components.n70.N((org.telegram.ui.Components.n70) this.f32456c, (Context) this.d, this.f32455b);
                return;
            case 4:
                qy qyVar = (qy) this.f32456c;
                boolean hasUnread = ((org.telegram.ui.Cells.s2) this.d).getHasUnread();
                long j10 = this.f32455b;
                if (hasUnread) {
                    qyVar.j4(j10);
                } else {
                    qyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                qyVar.finishPreviewFragment();
                return;
            case 5:
                oo0 oo0Var = (oo0) this.f32456c;
                oo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = oo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    oo0Var.m0 = true;
                    oo0Var.f36289f[0].setText("");
                    oo0Var.m0 = false;
                    oo0Var.H0 = 0L;
                    oo0Var.L0();
                } else {
                    oo0Var.f36289f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f32455b, false, true, true, oo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = oo0Var.f36289f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                yh.x3.Y0((yh.x3) this.f32456c, (String) this.d, this.f32455b);
                return;
        }
    }
}
