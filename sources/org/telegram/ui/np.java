package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class np extends f2.r0 {
    public final Context f40782c;
    public final op d;

    public np(op opVar, Context context) {
        this.d = opVar;
        this.f40782c = context;
    }

    @Override
    public final int h() {
        op opVar = this.d;
        ArrayList arrayList = opVar.f41223r;
        int i9 = 0;
        if (opVar.C) {
            if (!opVar.d.isEmpty()) {
                i9 = arrayList.size() + 1;
            }
            return i9 + 1;
        }
        if (!opVar.d.isEmpty()) {
            i9 = arrayList.size() + 1;
        }
        return i9 + 2;
    }

    @Override
    public final int j(int i9) {
        if (this.d.C) {
            if (i9 == 0) {
                return 0;
            }
            if (i9 != 1) {
                return 2;
            }
            return 1;
        } else if (i9 == 0) {
            return 3;
        } else {
            if (i9 == 1) {
                return 0;
            }
            if (i9 != 2) {
                return 2;
            }
            return 1;
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String string;
        int i10;
        View view = q1Var.f5501a;
        int j10 = j(i9);
        int i11 = 2;
        op opVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = opVar.f41223r;
                    if (!opVar.C) {
                        i11 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i9 - i11);
                    boolean contains = opVar.d.contains(tL_availableReaction.reaction);
                    i10 = ((org.telegram.ui.ActionBar.o2) opVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        if (opVar.C) {
            if (ChatObject.isChannelAndNotMegaGroup(opVar.f41217a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            b9Var.setText(string);
            return;
        }
        int i12 = opVar.v;
        if (i12 == 1) {
            b9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i12 == 0) {
            b9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i12 == 2) {
            b9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.f40782c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    return new f2.q1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                op opVar = this.d;
                if (opVar.f41224s.getParent() != null) {
                    ((ViewGroup) opVar.f41224s.getParent()).removeView(opVar.f41224s);
                }
                frameLayout.addView(opVar.f41224s);
                frameLayout.setLayoutParams(new f2.a1(-1, -2));
                return new f2.q1(frameLayout);
            }
            return new f2.q1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new f2.q1(new org.telegram.ui.Cells.b9(context));
    }
}
