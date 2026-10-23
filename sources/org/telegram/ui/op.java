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
public final class op extends s4.g0 {
    public final Context f39956c;
    public final pp d;

    public op(pp ppVar, Context context) {
        this.d = ppVar;
        this.f39956c = context;
    }

    @Override
    public final int h() {
        pp ppVar = this.d;
        ArrayList arrayList = ppVar.f40276r;
        int i10 = 0;
        if (ppVar.G) {
            if (!ppVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!ppVar.d.isEmpty()) {
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
        View view = b1Var.f45921a;
        int j10 = j(i10);
        int i12 = 2;
        pp ppVar = this.d;
        if (j10 != 0) {
            if (j10 != 1) {
                if (j10 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = ppVar.f40276r;
                    if (!ppVar.G) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = ppVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.n2) ppVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            l4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20994d6, false));
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        if (ppVar.G) {
            if (ChatObject.isChannelAndNotMegaGroup(ppVar.f40271a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            d9Var.setText(string);
            return;
        }
        int i13 = ppVar.v;
        if (i13 == 1) {
            d9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            d9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            d9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f39956c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.b1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                pp ppVar = this.d;
                if (ppVar.f40277s.getParent() != null) {
                    ((ViewGroup) ppVar.f40277s.getParent()).removeView(ppVar.f40277s);
                }
                frameLayout.addView(ppVar.f40277s);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new s4.b1(frameLayout);
            }
            return new s4.b1(new org.telegram.ui.Cells.l4(context, 23));
        }
        return new s4.b1(new org.telegram.ui.Cells.d9(context));
    }
}
