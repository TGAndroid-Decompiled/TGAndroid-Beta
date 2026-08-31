package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d70 extends org.telegram.ui.Components.sl0 {
    public final Context f36126c;
    public int d;
    public final ArrayList f36127e = new ArrayList();
    public final f70 f36128f;

    public d70(f70 f70Var, Context context) {
        this.f36128f = f70Var;
        this.f36126c = context;
    }

    @Override
    public final void A(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            ((org.telegram.ui.Cells.g4) m1Var.f5875a).f22836a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f36128f.N) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f36127e.size();
    }

    @Override
    public final int j(int i10) {
        return ((c70) this.f36127e.get(i10)).f2505a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f36127e;
        arrayList.clear();
        arrayList.add(new cg.b(0, true));
        f70 f70Var = this.f36128f;
        if (f70Var.M == 5) {
            arrayList.add(new cg.b(6, true));
            arrayList.add(new c70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new cg.b(4, true));
            arrayList.add(new c70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (f70Var.Q != null) {
            arrayList.add(new cg.b(1, true));
            arrayList.add(new cg.b(3, true));
            arrayList.add(new cg.b(0, true));
        }
        if (f70Var.H.size() > 0) {
            arrayList.add(new cg.b(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < f70Var.H.size(); i10++) {
                arrayList.add(new cg.b(2, true));
            }
            arrayList.add(new cg.b(7, true));
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String formatTTLString;
        boolean z4;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        ArrayList arrayList = this.f36127e;
        boolean z10 = false;
        f70 f70Var = this.f36128f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (f70Var.Q != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", f70Var.H.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(f70Var.getMessagesController().getUser((Long) f70Var.H.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z10 = true;
                }
                g4Var.setDrawDivider(z10);
                return;
            case 3:
                ((org.telegram.ui.Cells.aa) view).b(f70Var.Q, false);
                return;
            case 4:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                int i12 = f70Var.T;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z4 = ((org.telegram.ui.ActionBar.p2) f70Var).fragmentBeginToShow;
                o8Var.s(string, str, z4, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.a9) view).setText(((c70) arrayList.get(i10)).f35695c);
                return;
            case 6:
                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                o8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                o8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f36126c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    m4Var = new org.telegram.ui.Cells.aa(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    m4Var = view;
                                }
                            } else {
                                m4Var = new org.telegram.ui.Cells.o8(23, this.f36126c, this.f36128f.getResourceProvider(), false, true);
                            }
                        } else {
                            m4Var = new org.telegram.ui.Cells.a9(context);
                        }
                    } else {
                        m4Var = new org.telegram.ui.Cells.o8(context);
                    }
                } else {
                    m4Var = new org.telegram.ui.Cells.g4(context, 0, 3, false);
                }
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setHeight(46);
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
        }
        return new f2.m1(m4Var);
    }
}
