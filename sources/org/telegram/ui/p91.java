package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class p91 implements org.telegram.ui.Components.ol0, le.d {
    public final ta1 f39428a;

    public p91(ta1 ta1Var) {
        this.f39428a = ta1Var;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f39428a.n0();
    }

    @Override
    public boolean d(int i10, View view) {
        final ta1 ta1Var = this.f39428a;
        org.telegram.ui.ActionBar.b2[] b2VarArr = ta1Var.f40813g0;
        y91 y91Var = ta1Var.W;
        int i11 = y91Var.I;
        if (i10 >= i11 && i10 <= y91Var.J) {
            final MessageObject messageObject = ((qa1) ta1Var.f40836y0.get(i10 - i11)).f39754b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(ta1Var, view);
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ta1 ta1Var2 = ta1Var;
                                ta1Var2.getClass();
                                ta1Var2.presentFragment(new hj0(messageObject));
                                return;
                            default:
                                ta1 ta1Var3 = ta1Var;
                                ta1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ta1Var3.f40804b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                ta1Var3.presentFragment(new yn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ta1 ta1Var2 = ta1Var;
                                ta1Var2.getClass();
                                ta1Var2.presentFragment(new hj0(messageObject));
                                return;
                            default:
                                ta1 ta1Var3 = ta1Var;
                                ta1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ta1Var3.f40804b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                ta1Var3.presentFragment(new yn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(ta1Var.S.V0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = y91Var.U;
            if (i10 >= i12 && i10 <= y91Var.V) {
                ((ma1) ta1Var.Q.get(i10 - i12)).c(ta1Var.f40802a, ta1Var, b2VarArr, true);
                return true;
            }
            int i13 = y91Var.R;
            if (i10 >= i13 && i10 <= y91Var.S) {
                ((ma1) ta1Var.O.get(i10 - i13)).c(ta1Var.f40802a, ta1Var, b2VarArr, true);
                return true;
            }
            int i14 = y91Var.X;
            if (i10 >= i14 && i10 <= y91Var.Y) {
                ((ma1) ta1Var.P.get(i10 - i14)).c(ta1Var.f40802a, ta1Var, b2VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void V(float f7, int i10) {
    }
}
