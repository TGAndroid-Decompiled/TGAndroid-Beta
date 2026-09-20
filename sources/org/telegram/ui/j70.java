package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j70 extends org.telegram.ui.Components.ul0 {
    public final Context f34770c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final l70 f34771f;

    public j70(l70 l70Var, Context context) {
        this.f34771f = l70Var;
        this.f34770c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        if (c1Var.f42977f == 2) {
            ((org.telegram.ui.Cells.h4) c1Var.f42974a).f20378a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f34771f.Q) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final int j(int i10) {
        return ((i70) this.e.get(i10)).f15704a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new og.a(0, true));
        l70 l70Var = this.f34771f;
        if (l70Var.P == 5) {
            arrayList.add(new og.a(6, true));
            arrayList.add(new i70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new og.a(4, true));
            arrayList.add(new i70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (l70Var.T != null) {
            arrayList.add(new og.a(1, true));
            arrayList.add(new og.a(3, true));
            arrayList.add(new og.a(0, true));
        }
        if (l70Var.K.size() > 0) {
            arrayList.add(new og.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < l70Var.K.size(); i10++) {
                arrayList.add(new og.a(2, true));
            }
            arrayList.add(new og.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        ArrayList arrayList = this.e;
        boolean z11 = false;
        l70 l70Var = this.f34771f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (l70Var.T != null && i10 == 1) {
                    n4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    n4Var.setText(LocaleController.formatPluralString("Members", l70Var.K.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(l70Var.getMessagesController().getUser((Long) l70Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                h4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.fa) view).b(l70Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                int i12 = l70Var.W;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.n2) l70Var).fragmentBeginToShow;
                s8Var.s(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.f9) view).setText(((i70) arrayList.get(i10)).f34470c);
                return;
            case 6:
                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                s8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                s8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n4 n4Var;
        Context context = this.f34770c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    n4Var = new org.telegram.ui.Cells.fa(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    n4Var = view;
                                }
                            } else {
                                n4Var = new org.telegram.ui.Cells.s8(23, this.f34770c, this.f34771f.getResourceProvider(), false, true);
                            }
                        } else {
                            n4Var = new org.telegram.ui.Cells.f9(context);
                        }
                    } else {
                        n4Var = new org.telegram.ui.Cells.s8(context);
                    }
                } else {
                    n4Var = new org.telegram.ui.Cells.h4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                n4Var2.setHeight(46);
                n4Var = n4Var2;
            }
        } else {
            n4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        }
        return new s4.c1(n4Var);
    }
}
