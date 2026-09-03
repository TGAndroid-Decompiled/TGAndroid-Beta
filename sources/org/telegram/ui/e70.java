package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e70 extends org.telegram.ui.Components.ql0 {
    public final Context f33728c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final g70 f33729f;

    public e70(g70 g70Var, Context context) {
        this.f33729f = g70Var;
        this.f33728c = context;
    }

    @Override
    public final void A(f2.l1 l1Var) {
        if (l1Var.f5777f == 2) {
            ((org.telegram.ui.Cells.f4) l1Var.f5774a).f21019a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f33729f.N) {
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
        return ((d70) this.e.get(i10)).f1830a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new bg.b(0, true));
        g70 g70Var = this.f33729f;
        if (g70Var.M == 5) {
            arrayList.add(new bg.b(6, true));
            arrayList.add(new d70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new bg.b(4, true));
            arrayList.add(new d70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (g70Var.Q != null) {
            arrayList.add(new bg.b(1, true));
            arrayList.add(new bg.b(3, true));
            arrayList.add(new bg.b(0, true));
        }
        if (g70Var.H.size() > 0) {
            arrayList.add(new bg.b(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < g70Var.H.size(); i10++) {
                arrayList.add(new bg.b(2, true));
            }
            arrayList.add(new bg.b(7, true));
        }
        super.l();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String formatTTLString;
        boolean z4;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        ArrayList arrayList = this.e;
        boolean z10 = false;
        g70 g70Var = this.f33729f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (g70Var.Q != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", g70Var.H.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(g70Var.getMessagesController().getUser((Long) g70Var.H.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z10 = true;
                }
                f4Var.setDrawDivider(z10);
                return;
            case 3:
                ((org.telegram.ui.Cells.z9) view).b(g70Var.Q, false);
                return;
            case 4:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                int i12 = g70Var.T;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z4 = ((org.telegram.ui.ActionBar.p2) g70Var).fragmentBeginToShow;
                n8Var.s(string, str, z4, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((d70) arrayList.get(i10)).f33364c);
                return;
            case 6:
                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                n8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                n8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        Context context = this.f33728c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    l4Var = new org.telegram.ui.Cells.z9(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    l4Var = view;
                                }
                            } else {
                                l4Var = new org.telegram.ui.Cells.n8(23, this.f33728c, this.f33729f.getResourceProvider(), false, true);
                            }
                        } else {
                            l4Var = new org.telegram.ui.Cells.z8(context);
                        }
                    } else {
                        l4Var = new org.telegram.ui.Cells.n8(context);
                    }
                } else {
                    l4Var = new org.telegram.ui.Cells.f4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context);
                l4Var2.setHeight(46);
                l4Var = l4Var2;
            }
        } else {
            l4Var = new org.telegram.ui.Cells.y6(context, (b) null);
        }
        return new f2.l1(l4Var);
    }
}
