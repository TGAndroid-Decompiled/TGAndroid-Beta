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
public final class eq extends s4.h0 {
    public final Context f32583c;
    public final fq d;

    public eq(fq fqVar, Context context) {
        this.d = fqVar;
        this.f32583c = context;
    }

    @Override
    public final int h() {
        fq fqVar = this.d;
        ArrayList arrayList = fqVar.f32889r;
        int i10 = 0;
        if (fqVar.G) {
            if (!fqVar.d.isEmpty()) {
                i10 = arrayList.size() + 1;
            }
            return i10 + 1;
        }
        if (!fqVar.d.isEmpty()) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        int i11;
        View view = c1Var.f41610a;
        int j3 = j(i10);
        int i12 = 2;
        fq fqVar = this.d;
        if (j3 != 0) {
            if (j3 != 1) {
                if (j3 == 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    ArrayList arrayList = fqVar.f32889r;
                    if (!fqVar.G) {
                        i12 = 3;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList.get(i10 - i12);
                    boolean contains = fqVar.d.contains(tL_availableReaction.reaction);
                    i11 = ((org.telegram.ui.ActionBar.p2) fqVar).currentAccount;
                    yVar.a(tL_availableReaction, contains, i11);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        f9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        if (fqVar.G) {
            if (ChatObject.isChannelAndNotMegaGroup(fqVar.f32884a)) {
                string = LocaleController.getString(R.string.EnableReactionsChannelInfo);
            } else {
                string = LocaleController.getString(R.string.EnableReactionsGroupInfo);
            }
            f9Var.setText(string);
            return;
        }
        int i13 = fqVar.v;
        if (i13 == 1) {
            f9Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i13 == 0) {
            f9Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i13 == 2) {
            f9Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f32583c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return new s4.c1(new org.telegram.ui.Cells.y(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                fq fqVar = this.d;
                if (fqVar.f32890s.getParent() != null) {
                    ((ViewGroup) fqVar.f32890s.getParent()).removeView(fqVar.f32890s);
                }
                frameLayout.addView(fqVar.f32890s);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                return new s4.c1(frameLayout);
            }
            return new s4.c1(new org.telegram.ui.Cells.m4(context, 23));
        }
        return new s4.c1(new org.telegram.ui.Cells.f9(context));
    }
}
