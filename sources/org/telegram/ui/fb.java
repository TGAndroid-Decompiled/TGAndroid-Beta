package org.telegram.ui;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.TranslateController;
public final class fb extends org.telegram.ui.ActionBar.i5 {
    public final int f36754f;
    public final Object h;

    public fb(Object obj, int i10) {
        this.f36754f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f36754f) {
            case 13:
                ((rq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f36754f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z4 = profileActivity.T1;
                profileActivity.T1 = !z4;
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    w0Var.f22351e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.f22351e);
                }
                if (profileActivity.T1) {
                    profileActivity.R0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.T1);
            default:
                return super.h();
        }
    }

    @Override
    public void m() {
        switch (this.f36754f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.f41118w0 = "";
                sbVar.J.setVisibility(0);
                if (sbVar.V) {
                    sbVar.V = false;
                    sbVar.V0(true);
                    return;
                }
                return;
            case 1:
                rp rpVar = (rp) this.h;
                rpVar.f40896e.F(null);
                rpVar.K = false;
                rpVar.getClass();
                rpVar.f40894b.setAdapter(rpVar.f40893a);
                rpVar.f40893a.l();
                rpVar.f40894b.setFastScrollVisible(true);
                rpVar.f40894b.setVerticalScrollBarEnabled(false);
                rpVar.d.setShowAtCenter(false);
                View view = rpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                rpVar.fragmentView.setTag(Integer.valueOf(i10));
                rpVar.d.b();
                return;
            case 2:
                qr qrVar = (qr) this.h;
                qrVar.f40578e.F(null);
                qrVar.l1 = false;
                mh.d1 d1Var = qrVar.f40573c;
                d1Var.V1 = false;
                d1Var.W1 = 0;
                d1Var.setAdapter(qrVar.f40567a);
                qrVar.f40567a.l();
                qrVar.f40573c.setFastScrollVisible(true);
                qrVar.f40573c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = qrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (c8Var.h) {
                    c8Var.f25809f = false;
                    c8Var.h = false;
                    c8Var.setAllowNestedScroll(true);
                    c8Var.f25824s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f25812h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.V = false;
                jkVar.D.setVisibility(0);
                org.telegram.ui.Components.xj xjVar = jkVar.f28132r;
                f2.p0 adapter = xjVar.getAdapter();
                org.telegram.ui.Components.bk bkVar = jkVar.v;
                if (adapter != bkVar) {
                    xjVar.setAdapter(bkVar);
                }
                bkVar.l();
                jkVar.f28136y.Y(null, true);
                return;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                clVar.f25981i0 = false;
                clVar.f25982j0 = false;
                clVar.O.G(null, null);
                clVar.f0();
                clVar.M.setVisibility(0);
                clVar.K.setVisibility(0);
                clVar.N.setVisibility(8);
                clVar.v.setVisibility(8);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f34073r.G(null);
                contactsActivity.C = false;
                contactsActivity.B = false;
                contactsActivity.f34060f.setAdapter(contactsActivity.d);
                contactsActivity.f34060f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f34060f.setFastScrollVisible(true);
                contactsActivity.f34060f.setVerticalScrollBarEnabled(false);
                contactsActivity.f34060f.getFastScroll().f25644e0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                zt ztVar = (zt) this.h;
                xt xtVar = ztVar.d;
                xtVar.getClass();
                xtVar.f43447e = null;
                ztVar.f44020f = false;
                ztVar.f44019e = false;
                ztVar.f44016a.setAdapter(ztVar.f44018c);
                ztVar.f44016a.setFastScrollVisible(true);
                return;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.f38784a.getActionBar().h(false);
                lvVar.f38785b.getActionBar().h(false);
                return;
            case 9:
                n70 n70Var = (n70) this.h;
                if (n70Var.J) {
                    m70.E(n70Var.f39213f, null);
                    n70Var.J = false;
                    n70Var.d.setAdapter(n70Var.f39212e);
                    return;
                }
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f34128b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f34128b.setAdapter(languageSelectActivity.f34127a);
                    return;
                }
                return;
            case 11:
                bd0 bd0Var = (bd0) this.h;
                bd0Var.f35487o0 = false;
                bd0Var.f35488p0 = false;
                bd0Var.T.G(null, null);
                bd0Var.B0();
                if (bd0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = bd0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    bd0Var.R.setVisibility(0);
                    bd0Var.P.setVisibility(0);
                    bd0Var.S.setAdapter(null);
                    bd0Var.S.setVisibility(8);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.ga0 ga0Var = ((rh0) this.h).f40851a;
                ga0Var.f11325y = false;
                ga0Var.j(null);
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                t31 t31Var = (t31) this.h;
                t31Var.f41428f = null;
                if (t31Var.f41425b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.f41425b.setAdapter(t31Var.f41424a);
                    return;
                }
                return;
            case 16:
                v81 v81Var = (v81) this.h;
                v81Var.f42044a.a(false, true);
                v81Var.o0(false, true);
                v81Var.f42046c.V2.N(false);
                return;
            case 17:
                sf1.b0((sf1) this.h, false);
                return;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = null;
                org.telegram.ui.Components.a61 a61Var = eh1Var.f25523a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
                r1Var.d = false;
                r1Var.f49223e = null;
                r1Var.f49220a.V2.N(true);
                r1Var.f49220a.u0(0);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f36754f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.J.setVisibility(8);
                sbVar.getClass();
                return;
            case 1:
                rp rpVar = (rp) this.h;
                rpVar.K = true;
                rpVar.d.setShowAtCenter(true);
                return;
            case 2:
                qr qrVar = (qr) this.h;
                qrVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = qrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.f25820p0 = c8Var.f25822r.N0();
                View m9 = c8Var.f25822r.m(c8Var.f25820p0);
                if (m9 == null) {
                    top = 0;
                } else {
                    top = m9.getTop();
                }
                c8Var.f25821q0 = top;
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.f25824s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f25812h0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.V = true;
                jkVar.D.setVisibility(8);
                jkVar.f26590b.t1(jkVar.C.getSearchField(), true);
                return;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                clVar.f25981i0 = true;
                clVar.f26590b.t1(clVar.B.getSearchField(), true);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.C = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                ((zt) this.h).f44020f = true;
                return;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.f38784a.getActionBar().x("");
                lvVar.f38785b.getActionBar().x("");
                lvVar.f38786c.getSearchField().requestFocus();
                return;
            case 9:
                return;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 11:
                ((bd0) this.h).f35487o0 = true;
                return;
            case 12:
                ((rh0) this.h).f40851a.f11325y = true;
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f40911a.getActionBar().x("");
                rq0Var.f40912b.getActionBar().x("");
                rq0Var.f40913c.getSearchField().requestFocus();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                v81 v81Var = (v81) this.h;
                v81Var.f42044a.a(true, true);
                v81Var.h.I("");
                v81Var.o0(false, true);
                v81Var.f42046c.V2.N(false);
                return;
            case 17:
                sf1 sf1Var = (sf1) this.h;
                sf1.b0(sf1Var, true);
                of1 of1Var = sf1Var.f41217o0;
                if (!of1Var.V.equals("")) {
                    of1Var.K(of1Var.f28687e[0], of1Var.getCurrentPosition(), "", false);
                }
                sf1Var.f41217o0.setAlpha(0.0f);
                sf1Var.f41217o0.f39701k0.e(true, false);
                return;
            case 18:
                return;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
                r1Var.d = true;
                r1Var.f49220a.V2.N(true);
                r1Var.f49220a.u0(0);
                return;
        }
    }

    @Override
    public void o(uf.e0 e0Var) {
        switch (this.f36754f) {
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                org.telegram.ui.Components.ik ikVar = jkVar.f28136y;
                ikVar.O.remove(e0Var);
                ikVar.Y(jkVar.C.getSearchField().getText().toString(), false);
                ikVar.a0(null, null, true);
                return;
            case 17:
            default:
                return;
        }
    }

    @Override
    public void p(lg.f fVar) {
        switch (this.f36754f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.V = true;
                sbVar.f41118w0 = fVar.getText().toString();
                sbVar.V0(true);
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f40911a.getActionBar().w();
                rq0Var.f40912b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.sl0 sl0Var;
        int h;
        mh.d1 d1Var;
        f2.p0 p0Var;
        switch (this.f36754f) {
            case 1:
                rp rpVar = (rp) this.h;
                if (rpVar.f40896e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (sl0Var = rpVar.f40894b) != null) {
                        f2.p0 adapter = sl0Var.getAdapter();
                        qp qpVar = rpVar.f40896e;
                        if (adapter != qpVar) {
                            rpVar.f40894b.setAdapter(qpVar);
                            View view = rpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                            rpVar.fragmentView.setTag(Integer.valueOf(i10));
                            rpVar.f40896e.l();
                            rpVar.f40894b.setFastScrollVisible(false);
                            rpVar.f40894b.setVerticalScrollBarEnabled(true);
                            rpVar.d.b();
                        }
                    }
                    rpVar.f40896e.F(obj);
                    return;
                }
                return;
            case 2:
                qr qrVar = (qr) this.h;
                if (qrVar.f40578e != null) {
                    String obj2 = editText.getText().toString();
                    if (qrVar.f40573c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = qrVar.f40573c.getAdapter().h();
                    }
                    qrVar.f40578e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (d1Var = qrVar.f40573c) != null) {
                        f2.p0 adapter2 = d1Var.getAdapter();
                        mr mrVar = qrVar.f40567a;
                        if (adapter2 != mrVar) {
                            mh.d1 d1Var2 = qrVar.f40573c;
                            d1Var2.V1 = false;
                            d1Var2.W1 = 0;
                            d1Var2.setAdapter(mrVar);
                            if (h == 0) {
                                qrVar.y0(0);
                            }
                        }
                    }
                    qrVar.A1.setVisibility(8);
                    qrVar.f40627z1.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (editText.length() > 0) {
                    c8Var.f25824s.E(editText.getText().toString());
                    return;
                }
                c8Var.f25809f = false;
                c8Var.f25824s.E(null);
                return;
            case 4:
                ((org.telegram.ui.Components.jk) this.h).f28136y.Y(editText.getText().toString(), false);
                return;
            case 5:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.h;
                eg.s2 s2Var = clVar.K;
                mh.d1 d1Var3 = clVar.M;
                org.telegram.ui.Components.sl0 sl0Var2 = clVar.N;
                org.telegram.ui.Components.vk vkVar = clVar.O;
                if (vkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        clVar.f25982j0 = true;
                        clVar.B.setShowSearchProgress(true);
                        d1Var3.setVisibility(8);
                        s2Var.setVisibility(8);
                        if (sl0Var2.getAdapter() != vkVar) {
                            sl0Var2.setAdapter(vkVar);
                        }
                        sl0Var2.setVisibility(0);
                        if (vkVar.f48548s.size() == 0 && vkVar.f48547r.size() == 0) {
                            z4 = true;
                        }
                        clVar.f25983k0 = z4;
                        clVar.f0();
                    } else {
                        d1Var3.setVisibility(0);
                        s2Var.setVisibility(0);
                        sl0Var2.setAdapter(null);
                        sl0Var2.setVisibility(8);
                        clVar.v.setVisibility(8);
                    }
                    vkVar.G(obj3, clVar.f25987o0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f34073r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f34055c.a(!obj4.isEmpty(), true);
                    contactsActivity.f34061f0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.sl0 sl0Var3 = contactsActivity.f34060f;
                        if (sl0Var3 != null) {
                            sl0Var3.setAdapter(contactsActivity.f34073r);
                            contactsActivity.f34060f.setSectionsType(0);
                            contactsActivity.f34073r.l();
                            contactsActivity.f34060f.setFastScrollVisible(false);
                            contactsActivity.f34060f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f34058e.e(true, true);
                        contactsActivity.f34073r.G(obj4);
                        return;
                    }
                    org.telegram.ui.Components.sl0 sl0Var4 = contactsActivity.f34060f;
                    if (sl0Var4 != null) {
                        sl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f34060f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                zt ztVar = (zt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    xt xtVar = ztVar.d;
                    xtVar.getClass();
                    xtVar.f43447e = null;
                    ztVar.f44019e = false;
                    ztVar.f44016a.setAdapter(ztVar.f44018c);
                    ztVar.f44016a.setFastScrollVisible(true);
                    return;
                }
                xt xtVar2 = ztVar.d;
                xtVar2.getClass();
                if (obj5 == null) {
                    xtVar2.f43447e = null;
                } else {
                    try {
                        Timer timer = xtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    Timer timer2 = new Timer();
                    xtVar2.d = timer2;
                    timer2.schedule(new wt(xtVar2, obj5, 0), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ztVar.f44019e = true;
                    return;
                }
                return;
            case 8:
                lv lvVar = (lv) this.h;
                lvVar.f38784a.getActionBar().setSearchFieldText(editText.getText().toString());
                lvVar.f38785b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 9:
                String obj6 = editText.getText().toString();
                n70 n70Var = (n70) this.h;
                m70.E(n70Var.f39213f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != n70Var.J) {
                    n70Var.J = z10;
                    org.telegram.ui.Components.sl0 sl0Var5 = n70Var.d;
                    if (sl0Var5 != null) {
                        if (!isEmpty) {
                            p0Var = n70Var.f39213f;
                        } else {
                            p0Var = n70Var.f39212e;
                        }
                        sl0Var5.setAdapter(p0Var);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    org.telegram.ui.Components.sl0 sl0Var6 = languageSelectActivity.f34128b;
                    if (sl0Var6 != null) {
                        sl0Var6.setAdapter(languageSelectActivity.f34129c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f34128b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f34128b.setAdapter(languageSelectActivity.f34127a);
                    return;
                }
                return;
            case 11:
                bd0 bd0Var = (bd0) this.h;
                if (bd0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    boolean z11 = false;
                    if (obj8.length() != 0) {
                        bd0Var.f35488p0 = true;
                        bd0Var.f35497w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = bd0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        bd0Var.R.setVisibility(8);
                        bd0Var.P.setVisibility(8);
                        f2.p0 adapter3 = bd0Var.S.getAdapter();
                        uc0 uc0Var = bd0Var.T;
                        if (adapter3 != uc0Var) {
                            bd0Var.S.setAdapter(uc0Var);
                        }
                        bd0Var.S.setVisibility(0);
                        if (bd0Var.T.h() == 0) {
                            z11 = true;
                        }
                        bd0Var.f35489q0 = z11;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = bd0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        bd0Var.R.setVisibility(0);
                        bd0Var.P.setVisibility(0);
                        bd0Var.S.setAdapter(null);
                        bd0Var.S.setVisibility(8);
                    }
                    bd0Var.B0();
                    bd0Var.T.G(obj8, bd0Var.f35495u0);
                    return;
                }
                return;
            case 12:
                ((rh0) this.h).f40851a.j(editText.getText().toString());
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f40911a.getActionBar().setSearchFieldText(editText.getText().toString());
                rq0Var.f40912b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 14:
                ((ProfileActivity) this.h).f34589e.I(editText.getText().toString().toLowerCase());
                return;
            case 15:
                String obj9 = editText.getText().toString();
                t31 t31Var = (t31) this.h;
                if (obj9 == null) {
                    t31Var.f41428f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t31Var.f41428f;
                    if (arrayList == null) {
                        t31Var.f41428f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t31Var.h.get(i11);
                        if (language.f18079q.startsWith(lowerCase)) {
                            t31Var.f41428f.add(0, language);
                        } else if (language.f18079q.contains(lowerCase)) {
                            t31Var.f41428f.add(language);
                        }
                    }
                    t31Var.f41426c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.sl0 sl0Var7 = t31Var.f41425b;
                    if (sl0Var7 != null) {
                        sl0Var7.setAdapter(t31Var.f41426c);
                        return;
                    }
                    return;
                } else if (t31Var.f41425b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.f41425b.setAdapter(t31Var.f41424a);
                    return;
                } else {
                    return;
                }
            case 16:
                ((v81) this.h).h.I(editText.getText().toString());
                return;
            case 17:
                String obj10 = editText.getText().toString();
                of1 of1Var = ((sf1) this.h).f41217o0;
                if (!of1Var.V.equals(obj10)) {
                    of1Var.K(of1Var.f28687e[0], of1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = editText.getText().toString();
                org.telegram.ui.Components.a61 a61Var = eh1Var.f25523a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                vf.r1 r1Var = (vf.r1) this.h;
                r1Var.f49223e = editText.getText().toString();
                r1Var.f49220a.V2.N(true);
                r1Var.f49220a.u0(0);
                return;
            default:
                return;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(uf.e0 e0Var) {
    }
}
