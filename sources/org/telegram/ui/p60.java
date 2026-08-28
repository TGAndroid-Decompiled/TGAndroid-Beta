package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p60 extends org.telegram.ui.Components.vk0 {
    public final Context f41346c;
    public int d;
    public final ArrayList f41347e = new ArrayList();
    public final r60 f41348f;

    public p60(r60 r60Var, Context context) {
        this.f41348f = r60Var;
        this.f41346c = context;
    }

    @Override
    public final void A(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            ((org.telegram.ui.Cells.g4) q1Var.f5501a).f24381a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 4) {
            if (i9 != 6 || !this.f41348f.M) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f41347e.size();
    }

    @Override
    public final int j(int i9) {
        return ((o60) this.f41347e.get(i9)).f48814a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f41347e;
        arrayList.clear();
        arrayList.add(new wf.a(0, true));
        r60 r60Var = this.f41348f;
        if (r60Var.L == 5) {
            arrayList.add(new wf.a(6, true));
            arrayList.add(new o60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new wf.a(4, true));
            arrayList.add(new o60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (r60Var.P != null) {
            arrayList.add(new wf.a(1, true));
            arrayList.add(new wf.a(3, true));
            arrayList.add(new wf.a(0, true));
        }
        if (r60Var.G.size() > 0) {
            arrayList.add(new wf.a(1, true));
            this.d = arrayList.size();
            for (int i9 = 0; i9 < r60Var.G.size(); i9++) {
                arrayList.add(new wf.a(2, true));
            }
            arrayList.add(new wf.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String formatTTLString;
        boolean z10;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        ArrayList arrayList = this.f41347e;
        boolean z11 = false;
        r60 r60Var = this.f41348f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (r60Var.P != null && i9 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", r60Var.G.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(r60Var.getMessagesController().getUser((Long) r60Var.G.get(i9 - this.d)), null, null);
                if (i9 != arrayList.size() - 1) {
                    z11 = true;
                }
                g4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.ba) view).b(r60Var.P, false);
                return;
            case 4:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                int i11 = r60Var.S;
                if (i11 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i11);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) r60Var).fragmentBeginToShow;
                p8Var.s(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.b9) view).setText(((o60) arrayList.get(i9)).f40992c);
                return;
            case 6:
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                p8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                p8Var2.getCheckBox().setAlpha(0.75f);
                return;
            default:
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f41346c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    m4Var = new org.telegram.ui.Cells.ba(context);
                                } else {
                                    View view = new View(context);
                                    view.setTag(-33024);
                                    m4Var = view;
                                }
                            } else {
                                m4Var = new org.telegram.ui.Cells.p8(23, this.f41346c, this.f41348f.getResourceProvider(), false, true);
                            }
                        } else {
                            m4Var = new org.telegram.ui.Cells.b9(context);
                        }
                    } else {
                        m4Var = new org.telegram.ui.Cells.p8(context);
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
            m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        }
        return new f2.q1(m4Var);
    }
}
