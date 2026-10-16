package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n70 extends org.telegram.ui.Components.lm0 {
    public final Context f38268c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final p70 f38269f;

    public n70(p70 p70Var, Context context) {
        this.f38269f = p70Var;
        this.f38268c = context;
    }

    @Override
    public final void A(s4.b1 b1Var) {
        if (b1Var.f44841f == 2) {
            ((org.telegram.ui.Cells.g4) b1Var.f44838a).f20912a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 6 || !this.f38269f.Q) {
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
        return ((m70) this.e.get(i10)).f42904a;
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new pg.a(0, true));
        p70 p70Var = this.f38269f;
        if (p70Var.P == 5) {
            arrayList.add(new pg.a(6, true));
            arrayList.add(new m70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new pg.a(4, true));
            arrayList.add(new m70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (p70Var.T != null) {
            arrayList.add(new pg.a(1, true));
            arrayList.add(new pg.a(3, true));
            arrayList.add(new pg.a(0, true));
        }
        if (p70Var.K.size() > 0) {
            arrayList.add(new pg.a(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < p70Var.K.size(); i10++) {
                arrayList.add(new pg.a(2, true));
            }
            arrayList.add(new pg.a(7, true));
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String formatTTLString;
        boolean z10;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        ArrayList arrayList = this.e;
        boolean z11 = false;
        p70 p70Var = this.f38269f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (p70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    return;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", p70Var.K.size(), new Object[0]));
                    return;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(p70Var.getMessagesController().getUser((Long) p70Var.K.get(i10 - this.d)), null, null);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                }
                g4Var.setDrawDivider(z11);
                return;
            case 3:
                ((org.telegram.ui.Cells.ca) view).b(p70Var.T, false);
                return;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = p70Var.W;
                if (i12 == 0) {
                    formatTTLString = LocaleController.getString(R.string.PasswordOff);
                } else {
                    formatTTLString = LocaleController.formatTTLString(i12);
                }
                String str = formatTTLString;
                String string = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.m2) p70Var).fragmentBeginToShow;
                r8Var.s(string, str, z10, R.drawable.msg_autodelete, false);
                return;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((m70) arrayList.get(i10)).f37925c);
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        Context context = this.f38268c;
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
                                m4Var = new org.telegram.ui.Cells.r8(23, this.f38268c, this.f38269f.getResourceProvider(), false, true);
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
            m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        }
        return new s4.b1(m4Var);
    }
}
