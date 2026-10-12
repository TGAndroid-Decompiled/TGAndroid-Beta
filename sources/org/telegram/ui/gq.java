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
public final class gq extends s4.g0 {
    public final Context f36447c;
    public final hq d;

    public gq(hq hqVar, Context context) {
        this.d = hqVar;
        this.f36447c = context;
    }

    @Override
    public final int h() {
        hq hqVar = this.d;
        ArrayList arrayList = hqVar.f36902r;
        int i10 = 0;
        if (hqVar.G) {
            if (!hqVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!hqVar.d.isEmpty()) {
            i10 = arrayList.size() + 1;
        }
        return i10 + 2;
    }

    @Override
    public final int j(int i10) {
        if (this.d.G) {
            if (i10 == 0) {
                return 0;
            }
            if (i10 != 1) {
                return 2;
            }
            return 1;
        } else if (i10 == 0) {
            return 3;
        } else {
            if (i10 == 1) {
                return 0;
            }
            if (i10 != 2) {
                return 2;
            }
            return 1;
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        int i11;
        View view = b1Var.f44838a;
        int j10 = j(i10);
        int i12 = 2;
        hq hqVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = hqVar.f36902r;
                    if (!hqVar.G) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = hqVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.m2) hqVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        e9Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        if (hqVar.G) {
            if (ChatObject.isChannelAndNotMegaGroup(hqVar.f36897a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            e9Var.setText(string);
            return;
        }
        int i13 = hqVar.v;
        if (i13 == 1) {
            e9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            e9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            e9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f36447c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.b1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                hq hqVar = this.d;
                if (hqVar.f36903s.getParent() != null) {
                    ((ViewGroup) hqVar.f36903s.getParent()).removeView(hqVar.f36903s);
                }
                frameLayout.addView(hqVar.f36903s);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new s4.b1(frameLayout);
            }
            return new s4.b1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new s4.b1(new org.telegram.ui.Cells.e9(context));
    }
}
