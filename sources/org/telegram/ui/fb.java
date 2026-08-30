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
public final class fb extends org.telegram.ui.ActionBar.h5 {
    public final int f34206f;
    public final Object h;

    public fb(Object obj, int i10) {
        this.f34206f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f34206f) {
            case 13:
                ((kq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f34206f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z4 = profileActivity.T1;
                profileActivity.T1 = !z4;
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    w0Var.e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.e);
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
        switch (this.f34206f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.f38279w0 = "";
                sbVar.J.setVisibility(0);
                if (sbVar.V) {
                    sbVar.V = false;
                    sbVar.V0(true);
                    return;
                }
                return;
            case 1:
                qp qpVar = (qp) this.h;
                qpVar.e.F(null);
                qpVar.K = false;
                qpVar.getClass();
                qpVar.f37804b.setAdapter(qpVar.f37803a);
                qpVar.f37803a.l();
                qpVar.f37804b.setFastScrollVisible(true);
                qpVar.f37804b.setVerticalScrollBarEnabled(false);
                qpVar.d.setShowAtCenter(false);
                View view = qpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                qpVar.fragmentView.setTag(Integer.valueOf(i10));
                qpVar.d.b();
                return;
            case 2:
                pr prVar = (pr) this.h;
                prVar.e.F(null);
                prVar.l1 = false;
                lh.e1 e1Var = prVar.f37450c;
                e1Var.V1 = false;
                e1Var.W1 = 0;
                e1Var.setAdapter(prVar.f37444a);
                prVar.f37444a.l();
                prVar.f37450c.setFastScrollVisible(true);
                prVar.f37450c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = prVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (c8Var.h) {
                    c8Var.f23892f = false;
                    c8Var.h = false;
                    c8Var.setAllowNestedScroll(true);
                    c8Var.f23907s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f23895h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                hkVar.V = false;
                hkVar.D.setVisibility(0);
                org.telegram.ui.Components.vj vjVar = hkVar.f25434r;
                f2.o0 adapter = vjVar.getAdapter();
                org.telegram.ui.Components.zj zjVar = hkVar.v;
                if (adapter != zjVar) {
                    vjVar.setAdapter(zjVar);
                }
                zjVar.l();
                hkVar.f25438y.Y(null, true);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.f23426i0 = false;
                alVar.f23427j0 = false;
                alVar.O.G(null, null);
                alVar.f0();
                alVar.M.setVisibility(0);
                alVar.K.setVisibility(0);
                alVar.N.setVisibility(8);
                alVar.v.setVisibility(8);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f31556r.G(null);
                contactsActivity.C = false;
                contactsActivity.B = false;
                contactsActivity.f31543f.setAdapter(contactsActivity.d);
                contactsActivity.f31543f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f31543f.setFastScrollVisible(true);
                contactsActivity.f31543f.setVerticalScrollBarEnabled(false);
                contactsActivity.f31543f.getFastScroll().f23704e0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                yt ytVar = (yt) this.h;
                wt wtVar = ytVar.d;
                wtVar.getClass();
                wtVar.e = null;
                ytVar.f40574f = false;
                ytVar.e = false;
                ytVar.f40571a.setAdapter(ytVar.f40573c);
                ytVar.f40571a.setFastScrollVisible(true);
                return;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.f35818a.getActionBar().h(false);
                kvVar.f35819b.getActionBar().h(false);
                return;
            case 9:
                m70 m70Var = (m70) this.h;
                if (m70Var.J) {
                    l70.E(m70Var.f36219f, null);
                    m70Var.J = false;
                    m70Var.d.setAdapter(m70Var.e);
                    return;
                }
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31607b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31607b.setAdapter(languageSelectActivity.f31606a);
                    return;
                }
                return;
            case 11:
                ad0 ad0Var = (ad0) this.h;
                ad0Var.f32539o0 = false;
                ad0Var.f32540p0 = false;
                ad0Var.T.G(null, null);
                ad0Var.B0();
                if (ad0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = ad0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    ad0Var.R.setVisibility(0);
                    ad0Var.P.setVisibility(0);
                    ad0Var.S.setAdapter(null);
                    ad0Var.S.setVisibility(8);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.ea0 ea0Var = ((qh0) this.h).f37759a;
                ea0Var.f9499y = false;
                ea0Var.j(null);
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                n31 n31Var = (n31) this.h;
                n31Var.f36441f = null;
                if (n31Var.f36439b != null) {
                    n31Var.d.setVisibility(8);
                    n31Var.f36439b.setAdapter(n31Var.f36438a);
                    return;
                }
                return;
            case 16:
                o81 o81Var = (o81) this.h;
                o81Var.f36814a.a(false, true);
                o81Var.o0(false, true);
                o81Var.f36816c.V2.N(false);
                return;
            case 17:
                kf1.b0((kf1) this.h, false);
                return;
            case 18:
                wg1 wg1Var = (wg1) this.h;
                wg1Var.h = null;
                org.telegram.ui.Components.a61 a61Var = wg1Var.f23580a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = false;
                r1Var.e = null;
                r1Var.f45428a.V2.N(true);
                r1Var.f45428a.u0(0);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f34206f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.J.setVisibility(8);
                sbVar.getClass();
                return;
            case 1:
                qp qpVar = (qp) this.h;
                qpVar.K = true;
                qpVar.d.setShowAtCenter(true);
                return;
            case 2:
                pr prVar = (pr) this.h;
                prVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = prVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.f23903p0 = c8Var.f23905r.N0();
                View m9 = c8Var.f23905r.m(c8Var.f23903p0);
                if (m9 == null) {
                    top = 0;
                } else {
                    top = m9.getTop();
                }
                c8Var.f23904q0 = top;
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.f23907s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f23895h0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                hkVar.V = true;
                hkVar.D.setVisibility(8);
                hkVar.f24278b.t1(hkVar.C.getSearchField(), true);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.f23426i0 = true;
                alVar.f24278b.t1(alVar.B.getSearchField(), true);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.C = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                ((yt) this.h).f40574f = true;
                return;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.f35818a.getActionBar().x("");
                kvVar.f35819b.getActionBar().x("");
                kvVar.f35820c.getSearchField().requestFocus();
                return;
            case 9:
                return;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 11:
                ((ad0) this.h).f32539o0 = true;
                return;
            case 12:
                ((qh0) this.h).f37759a.f9499y = true;
                return;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.f35788a.getActionBar().x("");
                kq0Var.f35789b.getActionBar().x("");
                kq0Var.f35790c.getSearchField().requestFocus();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                o81 o81Var = (o81) this.h;
                o81Var.f36814a.a(true, true);
                o81Var.h.I("");
                o81Var.o0(false, true);
                o81Var.f36816c.V2.N(false);
                return;
            case 17:
                kf1 kf1Var = (kf1) this.h;
                kf1.b0(kf1Var, true);
                gf1 gf1Var = kf1Var.f35696o0;
                if (!gf1Var.V.equals("")) {
                    gf1Var.K(gf1Var.e[0], gf1Var.getCurrentPosition(), "", false);
                }
                kf1Var.f35696o0.setAlpha(0.0f);
                kf1Var.f35696o0.f34605k0.e(true, false);
                return;
            case 18:
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = true;
                r1Var.f45428a.V2.N(true);
                r1Var.f45428a.u0(0);
                return;
        }
    }

    @Override
    public void o(tf.e0 e0Var) {
        switch (this.f34206f) {
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                org.telegram.ui.Components.gk gkVar = hkVar.f25438y;
                gkVar.O.remove(e0Var);
                gkVar.Y(hkVar.C.getSearchField().getText().toString(), false);
                gkVar.a0(null, null, true);
                return;
            case 17:
            default:
                return;
        }
    }

    @Override
    public void p(kg.f fVar) {
        switch (this.f34206f) {
            case 0:
                sb sbVar = (sb) this.h;
                sbVar.V = true;
                sbVar.f38279w0 = fVar.getText().toString();
                sbVar.V0(true);
                return;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.f35788a.getActionBar().w();
                kq0Var.f35789b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.sl0 sl0Var;
        int h;
        lh.e1 e1Var;
        f2.o0 o0Var;
        switch (this.f34206f) {
            case 1:
                qp qpVar = (qp) this.h;
                if (qpVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (sl0Var = qpVar.f37804b) != null) {
                        f2.o0 adapter = sl0Var.getAdapter();
                        pp ppVar = qpVar.e;
                        if (adapter != ppVar) {
                            qpVar.f37804b.setAdapter(ppVar);
                            View view = qpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                            qpVar.fragmentView.setTag(Integer.valueOf(i10));
                            qpVar.e.l();
                            qpVar.f37804b.setFastScrollVisible(false);
                            qpVar.f37804b.setVerticalScrollBarEnabled(true);
                            qpVar.d.b();
                        }
                    }
                    qpVar.e.F(obj);
                    return;
                }
                return;
            case 2:
                pr prVar = (pr) this.h;
                if (prVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (prVar.f37450c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = prVar.f37450c.getAdapter().h();
                    }
                    prVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = prVar.f37450c) != null) {
                        f2.o0 adapter2 = e1Var.getAdapter();
                        lr lrVar = prVar.f37444a;
                        if (adapter2 != lrVar) {
                            lh.e1 e1Var2 = prVar.f37450c;
                            e1Var2.V1 = false;
                            e1Var2.W1 = 0;
                            e1Var2.setAdapter(lrVar);
                            if (h == 0) {
                                prVar.y0(0);
                            }
                        }
                    }
                    prVar.A1.setVisibility(8);
                    prVar.f37503z1.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (editText.length() > 0) {
                    c8Var.f23907s.E(editText.getText().toString());
                    return;
                }
                c8Var.f23892f = false;
                c8Var.f23907s.E(null);
                return;
            case 4:
                ((org.telegram.ui.Components.hk) this.h).f25438y.Y(editText.getText().toString(), false);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                dg.u2 u2Var = alVar.K;
                lh.e1 e1Var3 = alVar.M;
                org.telegram.ui.Components.sl0 sl0Var2 = alVar.N;
                org.telegram.ui.Components.tk tkVar = alVar.O;
                if (tkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        alVar.f23427j0 = true;
                        alVar.B.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        u2Var.setVisibility(8);
                        if (sl0Var2.getAdapter() != tkVar) {
                            sl0Var2.setAdapter(tkVar);
                        }
                        sl0Var2.setVisibility(0);
                        if (tkVar.f44672s.size() == 0 && tkVar.f44671r.size() == 0) {
                            z4 = true;
                        }
                        alVar.f23428k0 = z4;
                        alVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        u2Var.setVisibility(0);
                        sl0Var2.setAdapter(null);
                        sl0Var2.setVisibility(8);
                        alVar.v.setVisibility(8);
                    }
                    tkVar.G(obj3, alVar.f23432o0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f31556r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f31539c.a(!obj4.isEmpty(), true);
                    contactsActivity.f31544f0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.sl0 sl0Var3 = contactsActivity.f31543f;
                        if (sl0Var3 != null) {
                            sl0Var3.setAdapter(contactsActivity.f31556r);
                            contactsActivity.f31543f.setSectionsType(0);
                            contactsActivity.f31556r.l();
                            contactsActivity.f31543f.setFastScrollVisible(false);
                            contactsActivity.f31543f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f31556r.G(obj4);
                        return;
                    }
                    org.telegram.ui.Components.sl0 sl0Var4 = contactsActivity.f31543f;
                    if (sl0Var4 != null) {
                        sl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f31543f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                yt ytVar = (yt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    wt wtVar = ytVar.d;
                    wtVar.getClass();
                    wtVar.e = null;
                    ytVar.e = false;
                    ytVar.f40571a.setAdapter(ytVar.f40573c);
                    ytVar.f40571a.setFastScrollVisible(true);
                    return;
                }
                wt wtVar2 = ytVar.d;
                wtVar2.getClass();
                if (obj5 == null) {
                    wtVar2.e = null;
                } else {
                    try {
                        Timer timer = wtVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    wtVar2.d = timer2;
                    timer2.schedule(new vt(wtVar2, obj5, 0), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    ytVar.e = true;
                    return;
                }
                return;
            case 8:
                kv kvVar = (kv) this.h;
                kvVar.f35818a.getActionBar().setSearchFieldText(editText.getText().toString());
                kvVar.f35819b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 9:
                String obj6 = editText.getText().toString();
                m70 m70Var = (m70) this.h;
                l70.E(m70Var.f36219f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != m70Var.J) {
                    m70Var.J = z10;
                    org.telegram.ui.Components.sl0 sl0Var5 = m70Var.d;
                    if (sl0Var5 != null) {
                        if (!isEmpty) {
                            o0Var = m70Var.f36219f;
                        } else {
                            o0Var = m70Var.e;
                        }
                        sl0Var5.setAdapter(o0Var);
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
                    org.telegram.ui.Components.sl0 sl0Var6 = languageSelectActivity.f31607b;
                    if (sl0Var6 != null) {
                        sl0Var6.setAdapter(languageSelectActivity.f31608c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31607b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31607b.setAdapter(languageSelectActivity.f31606a);
                    return;
                }
                return;
            case 11:
                ad0 ad0Var = (ad0) this.h;
                if (ad0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    boolean z11 = false;
                    if (obj8.length() != 0) {
                        ad0Var.f32540p0 = true;
                        ad0Var.f32549w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = ad0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        ad0Var.R.setVisibility(8);
                        ad0Var.P.setVisibility(8);
                        f2.o0 adapter3 = ad0Var.S.getAdapter();
                        tc0 tc0Var = ad0Var.T;
                        if (adapter3 != tc0Var) {
                            ad0Var.S.setAdapter(tc0Var);
                        }
                        ad0Var.S.setVisibility(0);
                        if (ad0Var.T.h() == 0) {
                            z11 = true;
                        }
                        ad0Var.f32541q0 = z11;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = ad0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        ad0Var.R.setVisibility(0);
                        ad0Var.P.setVisibility(0);
                        ad0Var.S.setAdapter(null);
                        ad0Var.S.setVisibility(8);
                    }
                    ad0Var.B0();
                    ad0Var.T.G(obj8, ad0Var.f32547u0);
                    return;
                }
                return;
            case 12:
                ((qh0) this.h).f37759a.j(editText.getText().toString());
                return;
            case 13:
                kq0 kq0Var = (kq0) this.h;
                kq0Var.f35788a.getActionBar().setSearchFieldText(editText.getText().toString());
                kq0Var.f35789b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 15:
                String obj9 = editText.getText().toString();
                n31 n31Var = (n31) this.h;
                if (obj9 == null) {
                    n31Var.f36441f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = n31Var.f36441f;
                    if (arrayList == null) {
                        n31Var.f36441f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < n31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) n31Var.h.get(i11);
                        if (language.f16691q.startsWith(lowerCase)) {
                            n31Var.f36441f.add(0, language);
                        } else if (language.f16691q.contains(lowerCase)) {
                            n31Var.f36441f.add(language);
                        }
                    }
                    n31Var.f36440c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.sl0 sl0Var7 = n31Var.f36439b;
                    if (sl0Var7 != null) {
                        sl0Var7.setAdapter(n31Var.f36440c);
                        return;
                    }
                    return;
                } else if (n31Var.f36439b != null) {
                    n31Var.d.setVisibility(8);
                    n31Var.f36439b.setAdapter(n31Var.f36438a);
                    return;
                } else {
                    return;
                }
            case 16:
                ((o81) this.h).h.I(editText.getText().toString());
                return;
            case 17:
                String obj10 = editText.getText().toString();
                gf1 gf1Var = ((kf1) this.h).f35696o0;
                if (!gf1Var.V.equals(obj10)) {
                    gf1Var.K(gf1Var.e[0], gf1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 18:
                wg1 wg1Var = (wg1) this.h;
                wg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.a61 a61Var = wg1Var.f23580a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.e = editText.getText().toString();
                r1Var.f45428a.V2.N(true);
                r1Var.f45428a.u0(0);
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

    private final void w(tf.e0 e0Var) {
    }
}
