package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h70 extends org.telegram.ui.Components.rm0 {
    public final Context f38302c;
    public int d;
    public final ArrayList f38303e = new ArrayList();
    public final j70 f38304f;

    public h70(j70 j70Var, Context context) {
        this.f38304f = j70Var;
        this.f38302c = context;
    }

    @Override
    public final void A(s4.d1 d1Var) {
        if (d1Var.f47752f == 2) {
            ((org.telegram.ui.Cells.g4) d1Var.f47748a).f22114a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47752f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f38304f.Q) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38303e.size();
    }

    @Override
    public final int j(int i10) {
        return ((g70) this.f38303e.get(i10)).f17175a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f38303e;
        arrayList.clear();
        arrayList.add(new og.a(0, true));
        j70 j70Var = this.f38304f;
        if (j70Var.P == 5) {
            arrayList.add(new og.a(6, true));
            arrayList.add(new g70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new og.a(4, true));
            arrayList.add(new g70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (j70Var.T != null) {
            arrayList.add(new og.a(1, true));
            arrayList.add(new og.a(3, true));
            arrayList.add(new og.a(0, true));
        }
        if (j70Var.K.size() > 0) {
            arrayList.add(new og.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < j70Var.K.size(); i10++) {
                arrayList.add(new og.a(2, true));
            }
            arrayList.add(new og.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        ArrayList arrayList = this.f38303e;
        boolean z11 = false;
        j70 j70Var = this.f38304f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (j70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", j70Var.K.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(j70Var.getMessagesController().getUser((Long) j70Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                g4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.ca) view).b(j70Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = j70Var.W;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.m2) j70Var).fragmentBeginToShow;
                r8Var.s(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((g70) arrayList.get(i10)).f37979c);
                return;
            case 6:
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                r8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                r8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f38302c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    m4Var = new org.telegram.ui.Cells.ca(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    m4Var = view;
                                }
                            } else {
                                m4Var = new org.telegram.ui.Cells.r8(23, this.f38302c, this.f38304f.getResourceProvider(), false, true);
                            }
                        } else {
                            m4Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        m4Var = new org.telegram.ui.Cells.r8(context);
                    }
                } else {
                    m4Var = new org.telegram.ui.Cells.g4(0, 3, context, false);
                }
            } else {
                org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context);
                m4Var2.setHeight(46);
                m4Var = m4Var2;
            }
        } else {
            m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        }
        return new s4.d1(m4Var);
    }
}
