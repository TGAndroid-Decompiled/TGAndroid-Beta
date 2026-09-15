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
public final class ho implements View.OnClickListener {
    public final int f34319a;
    public final long f34320b;
    public final Object f34321c;
    public final Object d;

    public ho(Object obj, Object obj2, long j3, int i10) {
        this.f34319a = i10;
        this.f34321c = obj;
        this.d = obj2;
        this.f34320b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34319a) {
            case 0:
                final wo woVar = (wo) this.f34321c;
                final boolean[] zArr = (boolean[]) this.d;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(woVar.getParentActivity(), 3, null);
                    b2Var.q(400L);
                    zArr[0] = true;
                    final boolean z10 = !woVar.M.b();
                    if (woVar.M.getCheckBox().F == null) {
                        woVar.M.setChecked(z10);
                    }
                    ChannelBoostsController boostsController = woVar.getMessagesController().getBoostsController();
                    final long j3 = this.f34320b;
                    boostsController.getBoostsStats(j3, new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            wo woVar2 = wo.this;
                            TLRPC.Chat chat = woVar2.f39300x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                woVar2.getMessagesController().putChat(woVar2.f39300x0, false);
                            }
                            Switch checkBox = woVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < woVar2.getMessagesController().channelAutotranslationLevelMin) {
                                i10 = R.drawable.permission_locked;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                            if (z11 && tL_premium_boostsStatus.level < woVar2.getMessagesController().channelAutotranslationLevelMin) {
                                woVar2.M.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = woVar2.getMessagesController().getBoostsController();
                                long j10 = j3;
                                boostsController2.userCanBoostChannel(j10, tL_premium_boostsStatus, new ai.l(woVar2, b2Var2, tL_premium_boostsStatus, j10, 3));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            woVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(woVar2.f39300x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            woVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            b2Var2.dismiss();
                            woVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new ci.u3(5, woVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.ActionBar.b2[]) this.f34321c)[0].dismiss();
                ((org.telegram.ui.Components.bs) this.d).run(-this.f34320b);
                return;
            case 2:
                ((org.telegram.ui.ActionBar.b2[]) this.f34321c)[0].dismiss();
                ((org.telegram.ui.Components.bs) this.d).run(-this.f34320b);
                return;
            case 3:
                org.telegram.ui.Components.b70.N((org.telegram.ui.Components.b70) this.f34321c, (Context) this.d, this.f34320b);
                return;
            case 4:
                uy uyVar = (uy) this.f34321c;
                boolean hasUnread = ((org.telegram.ui.Cells.r2) this.d).getHasUnread();
                long j10 = this.f34320b;
                if (hasUnread) {
                    uyVar.j4(j10);
                } else {
                    uyVar.getMessagesController().markDialogAsUnread(j10, null, 0L);
                }
                uyVar.finishPreviewFragment();
                return;
            case 5:
                wo0 wo0Var = (wo0) this.f34321c;
                wo0Var.getClass();
                long longValue = ((Long) ((TextView) this.d).getTag()).longValue();
                Long l4 = wo0Var.H0;
                if (l4 != null && longValue == l4.longValue()) {
                    wo0Var.m0 = true;
                    wo0Var.f39319f[0].setText("");
                    wo0Var.m0 = false;
                    wo0Var.H0 = 0L;
                    wo0Var.L0();
                } else {
                    wo0Var.f39319f[0].setText(LocaleController.getInstance().formatCurrencyString(this.f34320b, false, true, true, wo0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = wo0Var.f39319f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                yh.a4.Y0((yh.a4) this.f34321c, (String) this.d, this.f34320b);
                return;
        }
    }
}
