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

public final class db extends org.telegram.ui.ActionBar.e5 {

    public final int f37343f;
    public final Object h;

    public db(Object obj, int i10) {
        this.f37343f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f37343f) {
            case 13:
                ((fq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f37343f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.S1;
                profileActivity.S1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.Q0;
                    v0Var.f23859e.clearFocus();
                    AndroidUtilities.hideKeyboard(v0Var.f23859e);
                }
                if (profileActivity.S1) {
                    profileActivity.Q0.getSearchField().setText("");
                }
                return ProfileActivity.H0(profileActivity, profileActivity.S1);
            default:
                return super.h();
        }
    }

    @Override
    public void m() {
        switch (this.f37343f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.f41618v0 = "";
                qbVar.I.setVisibility(0);
                if (qbVar.U) {
                    qbVar.U = false;
                    qbVar.V0(true);
                }
                break;
            case 1:
                jp jpVar = (jp) this.h;
                jpVar.f39453e.F(null);
                jpVar.J = false;
                jpVar.getClass();
                jpVar.f39451b.setAdapter(jpVar.f39450a);
                jpVar.f39450a.l();
                jpVar.f39451b.setFastScrollVisible(true);
                jpVar.f39451b.setVerticalScrollBarEnabled(false);
                jpVar.d.setShowAtCenter(false);
                View view = jpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                jpVar.fragmentView.setTag(Integer.valueOf(i10));
                jpVar.d.b();
                break;
            case 2:
                lr lrVar = (lr) this.h;
                lrVar.f40190e.F(null);
                lrVar.f40205k1 = false;
                hh.f1 f1Var = lrVar.f40185c;
                f1Var.U1 = false;
                f1Var.V1 = 0;
                f1Var.setAdapter(lrVar.f40179a);
                lrVar.f40179a.l();
                lrVar.f40185c.setFastScrollVisible(true);
                lrVar.f40185c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.v0 v0Var = lrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(0);
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                if (b8Var.h) {
                    b8Var.f27018f = false;
                    b8Var.h = false;
                    b8Var.setAllowNestedScroll(true);
                    b8Var.f27033s.E(null);
                    org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.f27020g0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(0);
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                bkVar.U = false;
                bkVar.C.setVisibility(0);
                org.telegram.ui.Components.qj qjVar = bkVar.f27115r;
                f2.q0 adapter = qjVar.getAdapter();
                org.telegram.ui.Components.uj ujVar = bkVar.v;
                if (adapter != ujVar) {
                    qjVar.setAdapter(ujVar);
                }
                ujVar.l();
                bkVar.f27119y.Y(null, true);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                tkVar.f32805h0 = false;
                tkVar.f32806i0 = false;
                tkVar.N.G(null, null);
                tkVar.f0();
                tkVar.L.setVisibility(0);
                tkVar.J.setVisibility(0);
                tkVar.M.setVisibility(8);
                tkVar.v.setVisibility(8);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f35436r.F(null);
                contactsActivity.B = false;
                contactsActivity.A = false;
                contactsActivity.f35423f.setAdapter(contactsActivity.d);
                contactsActivity.f35423f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f35423f.setFastScrollVisible(true);
                contactsActivity.f35423f.setVerticalScrollBarEnabled(false);
                contactsActivity.f35423f.getFastScroll().f29386d0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                tt ttVar = (tt) this.h;
                rt rtVar = ttVar.d;
                rtVar.getClass();
                rtVar.f42327e = null;
                ttVar.f43008f = false;
                ttVar.f43007e = false;
                ttVar.f43004a.setAdapter(ttVar.f43006c);
                ttVar.f43004a.setFastScrollVisible(true);
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.f37853a.getActionBar().h(false);
                evVar.f37854b.getActionBar().h(false);
                break;
            case 9:
                c70 c70Var = (c70) this.h;
                if (c70Var.I) {
                    b70.E(c70Var.f36982f, null);
                    c70Var.I = false;
                    c70Var.d.setAdapter(c70Var.f36981e);
                }
                break;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35490b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35490b.setAdapter(languageSelectActivity.f35489a);
                }
                break;
            case 11:
                tc0 tc0Var = (tc0) this.h;
                tc0Var.f42873n0 = false;
                tc0Var.f42874o0 = false;
                tc0Var.S.G(null, null);
                tc0Var.B0();
                if (tc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.v0 v0Var3 = tc0Var.V;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(0);
                    }
                    tc0Var.Q.setVisibility(0);
                    tc0Var.O.setVisibility(0);
                    tc0Var.R.setAdapter(null);
                    tc0Var.R.setVisibility(8);
                }
                break;
            case 12:
                org.telegram.ui.Components.p90 p90Var = ((lh0) this.h).f40087a;
                p90Var.f6194y = false;
                p90Var.j(null);
                break;
            case 15:
                a31 a31Var = (a31) this.h;
                a31Var.f36366f = null;
                if (a31Var.f36363b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.f36363b.setAdapter(a31Var.f36362a);
                }
                break;
            case 16:
                x71 x71Var = (x71) this.h;
                x71Var.f44304a.a(false, true);
                x71Var.o0(false, true);
                x71Var.f44306c.U2.N(false);
                break;
            case 17:
                we1.b0((we1) this.h, false);
                break;
            case 18:
                hg1 hg1Var = (hg1) this.h;
                hg1Var.h = null;
                org.telegram.ui.Components.e51 e51Var = hg1Var.f28261a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.d = false;
                s1Var.f46447e = null;
                s1Var.f46444a.U2.N(true);
                s1Var.f46444a.u0(0);
                break;
        }
    }

    @Override
    public void n() {
        switch (this.f37343f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.I.setVisibility(8);
                qbVar.getClass();
                break;
            case 1:
                jp jpVar = (jp) this.h;
                jpVar.J = true;
                jpVar.d.setShowAtCenter(true);
                break;
            case 2:
                lr lrVar = (lr) this.h;
                lrVar.f40205k1 = true;
                org.telegram.ui.ActionBar.v0 v0Var = lrVar.h;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                b8Var.f27028o0 = b8Var.f27031r.N0();
                View viewM = b8Var.f27031r.m(b8Var.f27028o0);
                b8Var.f27029p0 = viewM == null ? 0 : viewM.getTop();
                b8Var.h = true;
                b8Var.setAllowNestedScroll(false);
                b8Var.f27033s.l();
                org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.f27020g0;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(8);
                }
                break;
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                bkVar.U = true;
                bkVar.C.setVisibility(8);
                bkVar.f34900b.t1(bkVar.B.getSearchField(), true);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                tkVar.f32805h0 = true;
                tkVar.f34900b.t1(tkVar.A.getSearchField(), true);
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.e0(contactsActivity);
                break;
            case 7:
                ((tt) this.h).f43008f = true;
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.f37853a.getActionBar().y("");
                evVar.f37854b.getActionBar().y("");
                evVar.f37855c.getSearchField().requestFocus();
                break;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                break;
            case 11:
                ((tc0) this.h).f42873n0 = true;
                break;
            case 12:
                ((lh0) this.h).f40087a.f6194y = true;
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.f38185a.getActionBar().y("");
                fq0Var.f38186b.getActionBar().y("");
                fq0Var.f38187c.getSearchField().requestFocus();
                break;
            case 16:
                x71 x71Var = (x71) this.h;
                x71Var.f44304a.a(true, true);
                x71Var.h.I("");
                x71Var.o0(false, true);
                x71Var.f44306c.U2.N(false);
                break;
            case 17:
                we1 we1Var = (we1) this.h;
                we1.b0(we1Var, true);
                se1 se1Var = we1Var.f43746n0;
                if (!se1Var.U.equals("")) {
                    se1Var.K(se1Var.f31545e[0], se1Var.getCurrentPosition(), "", false);
                }
                we1Var.f43746n0.setAlpha(0.0f);
                we1Var.f43746n0.f42616j0.e(true, false);
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.d = true;
                s1Var.f46444a.U2.N(true);
                s1Var.f46444a.u0(0);
                break;
        }
    }

    @Override
    public void o(pf.e0 e0Var) {
        switch (this.f37343f) {
            case 4:
                org.telegram.ui.Components.bk bkVar = (org.telegram.ui.Components.bk) this.h;
                org.telegram.ui.Components.ak akVar = bkVar.f27119y;
                akVar.N.remove(e0Var);
                akVar.Y(bkVar.B.getSearchField().getText().toString(), false);
                akVar.a0(null, null, true);
                break;
        }
    }

    @Override
    public void p(gg.g gVar) {
        switch (this.f37343f) {
            case 0:
                qb qbVar = (qb) this.h;
                qbVar.U = true;
                qbVar.f41618v0 = gVar.getText().toString();
                qbVar.V0(true);
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.f38185a.getActionBar().x();
                fq0Var.f38186b.getActionBar().x();
                break;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.zk0 zk0Var;
        hh.f1 f1Var;
        switch (this.f37343f) {
            case 1:
                jp jpVar = (jp) this.h;
                if (jpVar.f39453e != null) {
                    String string = editText.getText().toString();
                    if (string.length() != 0 && (zk0Var = jpVar.f39451b) != null) {
                        f2.q0 adapter = zk0Var.getAdapter();
                        ip ipVar = jpVar.f39453e;
                        if (adapter != ipVar) {
                            jpVar.f39451b.setAdapter(ipVar);
                            View view = jpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                            jpVar.fragmentView.setTag(Integer.valueOf(i10));
                            jpVar.f39453e.l();
                            jpVar.f39451b.setFastScrollVisible(false);
                            jpVar.f39451b.setVerticalScrollBarEnabled(true);
                            jpVar.d.b();
                        }
                    }
                    jpVar.f39453e.F(string);
                    break;
                }
                break;
            case 2:
                lr lrVar = (lr) this.h;
                if (lrVar.f40190e != null) {
                    String string2 = editText.getText().toString();
                    int iH = lrVar.f40185c.getAdapter() == null ? 0 : lrVar.f40185c.getAdapter().h();
                    lrVar.f40190e.F(string2);
                    if (TextUtils.isEmpty(string2) && (f1Var = lrVar.f40185c) != null) {
                        f2.q0 adapter2 = f1Var.getAdapter();
                        hr hrVar = lrVar.f40179a;
                        if (adapter2 != hrVar) {
                            hh.f1 f1Var2 = lrVar.f40185c;
                            f1Var2.U1 = false;
                            f1Var2.V1 = 0;
                            f1Var2.setAdapter(hrVar);
                            if (iH == 0) {
                                lrVar.y0(0);
                            }
                        }
                    }
                    lrVar.f40239z1.setVisibility(8);
                    lrVar.f40237y1.setVisibility(0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.h;
                if (editText.length() > 0) {
                    b8Var.f27033s.E(editText.getText().toString());
                } else {
                    b8Var.f27018f = false;
                    b8Var.f27033s.E(null);
                }
                break;
            case 4:
                ((org.telegram.ui.Components.bk) this.h).f27119y.Y(editText.getText().toString(), false);
                break;
            case 5:
                org.telegram.ui.Components.tk tkVar = (org.telegram.ui.Components.tk) this.h;
                ag.p1 p1Var = tkVar.J;
                hh.f1 f1Var3 = tkVar.L;
                org.telegram.ui.Components.zk0 zk0Var2 = tkVar.M;
                org.telegram.ui.Components.nk nkVar = tkVar.N;
                if (nkVar != null) {
                    String string3 = editText.getText().toString();
                    boolean z10 = false;
                    if (string3.length() != 0) {
                        tkVar.f32806i0 = true;
                        tkVar.A.setShowSearchProgress(true);
                        f1Var3.setVisibility(8);
                        p1Var.setVisibility(8);
                        if (zk0Var2.getAdapter() != nkVar) {
                            zk0Var2.setAdapter(nkVar);
                        }
                        zk0Var2.setVisibility(0);
                        if (nkVar.f45745s.size() == 0 && nkVar.f45744r.size() == 0) {
                            z10 = true;
                        }
                        tkVar.f32807j0 = z10;
                        tkVar.f0();
                    } else {
                        f1Var3.setVisibility(0);
                        p1Var.setVisibility(0);
                        zk0Var2.setAdapter(null);
                        zk0Var2.setVisibility(8);
                        tkVar.v.setVisibility(8);
                    }
                    nkVar.G(string3, tkVar.f32811n0);
                    break;
                }
                break;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f35436r != null) {
                    String string4 = editText.getText().toString();
                    contactsActivity.f35418c.a(!string4.isEmpty(), true);
                    contactsActivity.f35422e0 = string4;
                    if (string4.isEmpty()) {
                        org.telegram.ui.Components.zk0 zk0Var3 = contactsActivity.f35423f;
                        if (zk0Var3 != null) {
                            zk0Var3.setAdapter(contactsActivity.d);
                            contactsActivity.f35423f.setSectionsType(1);
                        }
                    } else {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.zk0 zk0Var4 = contactsActivity.f35423f;
                        if (zk0Var4 != null) {
                            zk0Var4.setAdapter(contactsActivity.f35436r);
                            contactsActivity.f35423f.setSectionsType(0);
                            contactsActivity.f35436r.l();
                            contactsActivity.f35423f.setFastScrollVisible(false);
                            contactsActivity.f35423f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f35421e.e(true, true);
                        contactsActivity.f35436r.F(string4);
                    }
                    break;
                }
                break;
            case 7:
                tt ttVar = (tt) this.h;
                String string5 = editText.getText().toString();
                if (TextUtils.isEmpty(string5)) {
                    rt rtVar = ttVar.d;
                    rtVar.getClass();
                    rtVar.f42327e = null;
                    ttVar.f43007e = false;
                    ttVar.f43004a.setAdapter(ttVar.f43006c);
                    ttVar.f43004a.setFastScrollVisible(true);
                } else {
                    rt rtVar2 = ttVar.d;
                    rtVar2.getClass();
                    if (string5 == null) {
                        rtVar2.f42327e = null;
                    } else {
                        try {
                            Timer timer = rtVar2.d;
                            if (timer != null) {
                                timer.cancel();
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        Timer timer2 = new Timer();
                        rtVar2.d = timer2;
                        timer2.schedule(new qt(rtVar2, string5, 0), 100L, 300L);
                    }
                    if (string5.length() != 0) {
                        ttVar.f43007e = true;
                    }
                }
                break;
            case 8:
                ev evVar = (ev) this.h;
                evVar.f37853a.getActionBar().setSearchFieldText(editText.getText().toString());
                evVar.f37854b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 9:
                String string6 = editText.getText().toString();
                c70 c70Var = (c70) this.h;
                b70.E(c70Var.f36982f, string6);
                boolean zIsEmpty = TextUtils.isEmpty(string6);
                boolean z11 = !zIsEmpty;
                if (z11 != c70Var.I) {
                    c70Var.I = z11;
                    org.telegram.ui.Components.zk0 zk0Var5 = c70Var.d;
                    if (zk0Var5 != null) {
                        zk0Var5.setAdapter(!zIsEmpty ? c70Var.f36982f : c70Var.f36981e);
                    }
                }
                break;
            case 10:
                String string7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(string7);
                if (string7.length() != 0) {
                    languageSelectActivity.getClass();
                    org.telegram.ui.Components.zk0 zk0Var6 = languageSelectActivity.f35490b;
                    if (zk0Var6 != null) {
                        zk0Var6.setAdapter(languageSelectActivity.f35491c);
                    }
                } else {
                    languageSelectActivity.getClass();
                    languageSelectActivity.getClass();
                    if (languageSelectActivity.f35490b != null) {
                        languageSelectActivity.d.setVisibility(8);
                        languageSelectActivity.f35490b.setAdapter(languageSelectActivity.f35489a);
                    }
                }
                break;
            case 11:
                tc0 tc0Var = (tc0) this.h;
                if (tc0Var.S != null) {
                    String string8 = editText.getText().toString();
                    if (string8.length() != 0) {
                        tc0Var.f42874o0 = true;
                        tc0Var.f42884w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.v0 v0Var = tc0Var.V;
                        if (v0Var != null) {
                            v0Var.setVisibility(8);
                        }
                        tc0Var.Q.setVisibility(8);
                        tc0Var.O.setVisibility(8);
                        f2.q0 adapter3 = tc0Var.R.getAdapter();
                        mc0 mc0Var = tc0Var.S;
                        if (adapter3 != mc0Var) {
                            tc0Var.R.setAdapter(mc0Var);
                        }
                        tc0Var.R.setVisibility(0);
                        tc0Var.f42875p0 = tc0Var.S.h() == 0;
                    } else {
                        org.telegram.ui.ActionBar.v0 v0Var2 = tc0Var.V;
                        if (v0Var2 != null) {
                            v0Var2.setVisibility(0);
                        }
                        tc0Var.Q.setVisibility(0);
                        tc0Var.O.setVisibility(0);
                        tc0Var.R.setAdapter(null);
                        tc0Var.R.setVisibility(8);
                    }
                    tc0Var.B0();
                    tc0Var.S.G(string8, tc0Var.f42881t0);
                    break;
                }
                break;
            case 12:
                ((lh0) this.h).f40087a.j(editText.getText().toString());
                break;
            case 13:
                fq0 fq0Var = (fq0) this.h;
                fq0Var.f38185a.getActionBar().setSearchFieldText(editText.getText().toString());
                fq0Var.f38186b.getActionBar().setSearchFieldText(editText.getText().toString());
                break;
            case 14:
                ((ProfileActivity) this.h).f35950e.I(editText.getText().toString().toLowerCase());
                break;
            case 15:
                String string9 = editText.getText().toString();
                a31 a31Var = (a31) this.h;
                if (string9 == null) {
                    a31Var.f36366f = null;
                } else {
                    String lowerCase = string9.trim().toLowerCase();
                    ArrayList arrayList = a31Var.f36366f;
                    if (arrayList == null) {
                        a31Var.f36366f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < a31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) a31Var.h.get(i11);
                        if (language.f19644q.startsWith(lowerCase)) {
                            a31Var.f36366f.add(0, language);
                        } else if (language.f19644q.contains(lowerCase)) {
                            a31Var.f36366f.add(language);
                        }
                    }
                    a31Var.f36364c.l();
                }
                if (string9.length() != 0) {
                    org.telegram.ui.Components.zk0 zk0Var7 = a31Var.f36363b;
                    if (zk0Var7 != null) {
                        zk0Var7.setAdapter(a31Var.f36364c);
                    }
                } else if (a31Var.f36363b != null) {
                    a31Var.d.setVisibility(8);
                    a31Var.f36363b.setAdapter(a31Var.f36362a);
                }
                break;
            case 16:
                ((x71) this.h).h.I(editText.getText().toString());
                break;
            case 17:
                String string10 = editText.getText().toString();
                se1 se1Var = ((we1) this.h).f43746n0;
                if (!se1Var.U.equals(string10)) {
                    se1Var.K(se1Var.f31545e[0], se1Var.getCurrentPosition(), string10, false);
                    break;
                }
                break;
            case 18:
                hg1 hg1Var = (hg1) this.h;
                hg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.e51 e51Var = hg1Var.f28261a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                break;
            case 19:
                qf.s1 s1Var = (qf.s1) this.h;
                s1Var.f46447e = editText.getText().toString();
                s1Var.f46444a.U2.N(true);
                s1Var.f46444a.u0(0);
                break;
        }
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v() {
    }

    private final void w(pf.e0 e0Var) {
    }
}
