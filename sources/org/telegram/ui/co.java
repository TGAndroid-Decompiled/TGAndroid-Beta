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
public final class co implements View.OnClickListener {
    public final int f32376a;
    public final long f32377b;
    public final Object f32378c;
    public final Object d;

    public co(Object obj, Object obj2, long j3, int i10) {
        this.f32376a = i10;
        this.f32378c = obj;
        this.d = obj2;
        this.f32377b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32376a) {
            case 0:
                final so soVar = (so) this.f32378c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(soVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !soVar.M.b();
                    if (soVar.M.getCheckBox().F == null) {
                        soVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = soVar.getMessagesController().getBoostsController();
                    final long j3 = this.f32377b;
                    boostsController.getBoostsStats(j3, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            so soVar2 = so.this;
                            TLRPC.Chat chat = soVar2.f37374x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                soVar2.getMessagesController().putChat(soVar2.f37374x0, false);
                            }
                            Switch checkBox = soVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < soVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < soVar2.getMessagesController().channelAutotranslationLevelMin) {
                                soVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = soVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(soVar2, b2Var2, tL_premium_boostsStatus, j10, 6));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            soVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(soVar2.f37374x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            soVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            soVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.t3(5, soVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.b2[]) this.f32378c)[0].dismiss();
                ((org.telegram.ui.Components.cs) this.d).run(-this.f32377b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f32378c)[0].dismiss();
                ((org.telegram.ui.Components.cs) this.d).run(-this.f32377b);
                return;
            case 3:
                org.telegram.ui.Components.c70.N((org.telegram.ui.Components.c70) this.f32378c, (Context) this.d, this.f32377b);
                return;
            case 4:
                ry ryVar = (ry) this.f32378c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.f32377b;
                if (hasUnread) {
                    ryVar.j4(j10);
                } else {
                    ryVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                ryVar.finishPreviewFragment();
                return;
            case 5:
                qo0 qo0Var = (qo0) this.f32378c;
                qo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = qo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    qo0Var.m0 = true;
                    qo0Var.f36496f[0].setText("");
                    qo0Var.m0 = false;
                    qo0Var.H0 = 0L;
                    qo0Var.L0();
                } else {
                    qo0Var.f36496f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f32377b, false, true, true, qo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = qo0Var.f36496f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                yh.y3.Y0((yh.y3) this.f32378c, (String) this.d, this.f32377b);
                return;
        }
    }
}
