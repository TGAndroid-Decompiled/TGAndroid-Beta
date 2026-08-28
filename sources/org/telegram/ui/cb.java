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
public final class cb extends org.telegram.ui.ActionBar.e5 {
    public final int f37159f;
    public final Object h;

    public cb(Object obj, int i9) {
        this.f37159f = i9;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f37159f) {
            case 13:
                ((eq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f37159f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.S1;
                profileActivity.S1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    w0Var.f23906e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.f23906e);
                }
                if (profileActivity.S1) {
                    profileActivity.Q0.getSearchField().setText("");
                }
                return ProfileActivity.G0(profileActivity, profileActivity.S1);
            default:
                return super.h();
        }
    }

    @Override
    public void m() {
        switch (this.f37159f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.f41422v0 = "";
                pbVar.I.setVisibility(0);
                if (pbVar.U) {
                    pbVar.U = false;
                    pbVar.V0(true);
                    return;
                }
                return;
            case 1:
                hp hpVar = (hp) this.h;
                hpVar.f38884e.F(null);
                hpVar.J = false;
                hpVar.getClass();
                hpVar.f38882b.setAdapter(hpVar.f38881a);
                hpVar.f38881a.l();
                hpVar.f38882b.setFastScrollVisible(true);
                hpVar.f38882b.setVerticalScrollBarEnabled(false);
                hpVar.d.setShowAtCenter(false);
                View view = hpVar.fragmentView;
                int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                hpVar.fragmentView.setTag(Integer.valueOf(i9));
                hpVar.d.b();
                return;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.f39568e.F(null);
                jrVar.f39583k1 = false;
                gh.f1 f1Var = jrVar.f39563c;
                f1Var.U1 = false;
                f1Var.V1 = 0;
                f1Var.setAdapter(jrVar.f39557a);
                jrVar.f39557a.l();
                jrVar.f39563c.setFastScrollVisible(true);
                jrVar.f39563c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (c8Var.h) {
                    c8Var.f27386f = false;
                    c8Var.h = false;
                    c8Var.setAllowNestedScroll(true);
                    c8Var.f27401s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f27388g0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                fkVar.U = false;
                fkVar.C.setVisibility(0);
                org.telegram.ui.Components.uj ujVar = fkVar.f28459r;
                f2.r0 adapter = ujVar.getAdapter();
                org.telegram.ui.Components.yj yjVar = fkVar.v;
                if (adapter != yjVar) {
                    ujVar.setAdapter(yjVar);
                }
                yjVar.l();
                fkVar.f28463y.Y(null, true);
                return;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                xkVar.f34695h0 = false;
                xkVar.f34696i0 = false;
                xkVar.N.G(null, null);
                xkVar.e0();
                xkVar.L.setVisibility(0);
                xkVar.J.setVisibility(0);
                xkVar.M.setVisibility(8);
                xkVar.v.setVisibility(8);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f35433r.G(null);
                contactsActivity.B = false;
                contactsActivity.A = false;
                contactsActivity.f35420f.setAdapter(contactsActivity.d);
                contactsActivity.f35420f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f35420f.setFastScrollVisible(true);
                contactsActivity.f35420f.setVerticalScrollBarEnabled(false);
                contactsActivity.f35420f.getFastScroll().f28470d0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.d0(contactsActivity);
                return;
            case 7:
                qt qtVar = (qt) this.h;
                ot otVar = qtVar.d;
                otVar.getClass();
                otVar.f41238e = null;
                qtVar.f42191f = false;
                qtVar.f42190e = false;
                qtVar.f42187a.setAdapter(qtVar.f42189c);
                qtVar.f42187a.setFastScrollVisible(true);
                return;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.f36996a.getActionBar().h(false);
                bvVar.f36997b.getActionBar().h(false);
                return;
            case 9:
                z60 z60Var = (z60) this.h;
                if (z60Var.I) {
                    y60.E(z60Var.f45045f, null);
                    z60Var.I = false;
                    z60Var.d.setAdapter(z60Var.f45044e);
                    return;
                }
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.h0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35487b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35487b.setAdapter(languageSelectActivity.f35486a);
                    return;
                }
                return;
            case 11:
                pc0 pc0Var = (pc0) this.h;
                pc0Var.f41459n0 = false;
                pc0Var.f41460o0 = false;
                pc0Var.S.G(null, null);
                pc0Var.A0();
                if (pc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = pc0Var.V;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    pc0Var.Q.setVisibility(0);
                    pc0Var.O.setVisibility(0);
                    pc0Var.R.setAdapter(null);
                    pc0Var.R.setVisibility(8);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.l90 l90Var = ((ih0) this.h).f39163a;
                l90Var.f5267y = false;
                l90Var.j(null);
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                b31 b31Var = (b31) this.h;
                b31Var.f36622f = null;
                if (b31Var.f36619b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.f36619b.setAdapter(b31Var.f36618a);
                    return;
                }
                return;
            case 16:
                z71 z71Var = (z71) this.h;
                z71Var.f45060a.a(false, true);
                z71Var.n0(false, true);
                z71Var.f45062c.U2.N(false);
                return;
            case 17:
                we1.a0((we1) this.h, false);
                return;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1Var.h = null;
                org.telegram.ui.Components.c51 c51Var = ig1Var.f27658a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.d = false;
                t1Var.f45784e = null;
                t1Var.f45781a.U2.N(true);
                t1Var.f45781a.u0(0);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f37159f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.I.setVisibility(8);
                pbVar.getClass();
                return;
            case 1:
                hp hpVar = (hp) this.h;
                hpVar.J = true;
                hpVar.d.setShowAtCenter(true);
                return;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.f39583k1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.f27396o0 = c8Var.f27399r.N0();
                View m10 = c8Var.f27399r.m(c8Var.f27396o0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                c8Var.f27397p0 = top;
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.f27401s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f27388g0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                fkVar.U = true;
                fkVar.C.setVisibility(8);
                fkVar.f27493b.t1(fkVar.B.getSearchField(), true);
                return;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                xkVar.f34695h0 = true;
                xkVar.f27493b.t1(xkVar.A.getSearchField(), true);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.d0(contactsActivity);
                return;
            case 7:
                ((qt) this.h).f42191f = true;
                return;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.f36996a.getActionBar().x("");
                bvVar.f36997b.getActionBar().x("");
                bvVar.f36998c.getSearchField().requestFocus();
                return;
            case 9:
                return;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 11:
                ((pc0) this.h).f41459n0 = true;
                return;
            case 12:
                ((ih0) this.h).f39163a.f5267y = true;
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f38008a.getActionBar().x("");
                eq0Var.f38009b.getActionBar().x("");
                eq0Var.f38010c.getSearchField().requestFocus();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                z71 z71Var = (z71) this.h;
                z71Var.f45060a.a(true, true);
                z71Var.h.I("");
                z71Var.n0(false, true);
                z71Var.f45062c.U2.N(false);
                return;
            case 17:
                we1 we1Var = (we1) this.h;
                we1.a0(we1Var, true);
                re1 re1Var = we1Var.f43768n0;
                if (!re1Var.U.equals("")) {
                    re1Var.K(re1Var.f31035e[0], re1Var.getCurrentPosition(), "", false);
                }
                we1Var.f43768n0.setAlpha(0.0f);
                we1Var.f43768n0.f42402j0.e(true, false);
                return;
            case 18:
                return;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.d = true;
                t1Var.f45781a.U2.N(true);
                t1Var.f45781a.u0(0);
                return;
        }
    }

    @Override
    public void o(of.m0 m0Var) {
        switch (this.f37159f) {
            case 4:
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.h;
                org.telegram.ui.Components.ek ekVar = fkVar.f28463y;
                ekVar.N.remove(m0Var);
                ekVar.Y(fkVar.B.getSearchField().getText().toString(), false);
                ekVar.a0(null, null, true);
                return;
            case 17:
            default:
                return;
        }
    }

    @Override
    public void p(fg.g gVar) {
        switch (this.f37159f) {
            case 0:
                pb pbVar = (pb) this.h;
                pbVar.U = true;
                pbVar.f41422v0 = gVar.getText().toString();
                pbVar.V0(true);
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f38008a.getActionBar().w();
                eq0Var.f38009b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.wk0 wk0Var;
        int h;
        gh.f1 f1Var;
        f2.r0 r0Var;
        switch (this.f37159f) {
            case 1:
                hp hpVar = (hp) this.h;
                if (hpVar.f38884e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (wk0Var = hpVar.f38882b) != null) {
                        f2.r0 adapter = wk0Var.getAdapter();
                        gp gpVar = hpVar.f38884e;
                        if (adapter != gpVar) {
                            hpVar.f38882b.setAdapter(gpVar);
                            View view = hpVar.fragmentView;
                            int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                            hpVar.fragmentView.setTag(Integer.valueOf(i9));
                            hpVar.f38884e.l();
                            hpVar.f38882b.setFastScrollVisible(false);
                            hpVar.f38882b.setVerticalScrollBarEnabled(true);
                            hpVar.d.b();
                        }
                    }
                    hpVar.f38884e.F(obj);
                    return;
                }
                return;
            case 2:
                jr jrVar = (jr) this.h;
                if (jrVar.f39568e != null) {
                    String obj2 = editText.getText().toString();
                    if (jrVar.f39563c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f39563c.getAdapter().h();
                    }
                    jrVar.f39568e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (f1Var = jrVar.f39563c) != null) {
                        f2.r0 adapter2 = f1Var.getAdapter();
                        er erVar = jrVar.f39557a;
                        if (adapter2 != erVar) {
                            gh.f1 f1Var2 = jrVar.f39563c;
                            f1Var2.U1 = false;
                            f1Var2.V1 = 0;
                            f1Var2.setAdapter(erVar);
                            if (h == 0) {
                                jrVar.x0(0);
                            }
                        }
                    }
                    jrVar.f39617z1.setVisibility(8);
                    jrVar.f39615y1.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (editText.length() > 0) {
                    c8Var.f27401s.E(editText.getText().toString());
                    return;
                }
                c8Var.f27386f = false;
                c8Var.f27401s.E(null);
                return;
            case 4:
                ((org.telegram.ui.Components.fk) this.h).f28463y.Y(editText.getText().toString(), false);
                return;
            case 5:
                org.telegram.ui.Components.xk xkVar = (org.telegram.ui.Components.xk) this.h;
                fh.d2 d2Var = xkVar.J;
                gh.f1 f1Var3 = xkVar.L;
                org.telegram.ui.Components.wk0 wk0Var2 = xkVar.M;
                org.telegram.ui.Components.rk rkVar = xkVar.N;
                if (rkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        xkVar.f34696i0 = true;
                        xkVar.A.setShowSearchProgress(true);
                        f1Var3.setVisibility(8);
                        d2Var.setVisibility(8);
                        if (wk0Var2.getAdapter() != rkVar) {
                            wk0Var2.setAdapter(rkVar);
                        }
                        wk0Var2.setVisibility(0);
                        if (rkVar.f19257s.size() == 0 && rkVar.f19256r.size() == 0) {
                            z10 = true;
                        }
                        xkVar.f34697j0 = z10;
                        xkVar.e0();
                    } else {
                        f1Var3.setVisibility(0);
                        d2Var.setVisibility(0);
                        wk0Var2.setAdapter(null);
                        wk0Var2.setVisibility(8);
                        xkVar.v.setVisibility(8);
                    }
                    rkVar.G(obj3, xkVar.f34701n0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f35433r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f35415c.a(!obj4.isEmpty(), true);
                    contactsActivity.f35419e0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.wk0 wk0Var3 = contactsActivity.f35420f;
                        if (wk0Var3 != null) {
                            wk0Var3.setAdapter(contactsActivity.f35433r);
                            contactsActivity.f35420f.setSectionsType(0);
                            contactsActivity.f35433r.l();
                            contactsActivity.f35420f.setFastScrollVisible(false);
                            contactsActivity.f35420f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f35418e.e(true, true);
                        contactsActivity.f35433r.G(obj4);
                        return;
                    }
                    org.telegram.ui.Components.wk0 wk0Var4 = contactsActivity.f35420f;
                    if (wk0Var4 != null) {
                        wk0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f35420f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qt qtVar = (qt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    ot otVar = qtVar.d;
                    otVar.getClass();
                    otVar.f41238e = null;
                    qtVar.f42190e = false;
                    qtVar.f42187a.setAdapter(qtVar.f42189c);
                    qtVar.f42187a.setFastScrollVisible(true);
                    return;
                }
                ot otVar2 = qtVar.d;
                otVar2.getClass();
                if (obj5 == null) {
                    otVar2.f41238e = null;
                } else {
                    try {
                        Timer timer = otVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Timer timer2 = new Timer();
                    otVar2.d = timer2;
                    timer2.schedule(new of.m1(otVar2, obj5, 1), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    qtVar.f42190e = true;
                    return;
                }
                return;
            case 8:
                bv bvVar = (bv) this.h;
                bvVar.f36996a.getActionBar().setSearchFieldText(editText.getText().toString());
                bvVar.f36997b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 9:
                String obj6 = editText.getText().toString();
                z60 z60Var = (z60) this.h;
                y60.E(z60Var.f45045f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != z60Var.I) {
                    z60Var.I = z11;
                    org.telegram.ui.Components.wk0 wk0Var5 = z60Var.d;
                    if (wk0Var5 != null) {
                        if (!isEmpty) {
                            r0Var = z60Var.f45045f;
                        } else {
                            r0Var = z60Var.f45044e;
                        }
                        wk0Var5.setAdapter(r0Var);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                String obj7 = editText.getText().toString();
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.h0(obj7);
                if (obj7.length() != 0) {
                    languageSelectActivity.getClass();
                    org.telegram.ui.Components.wk0 wk0Var6 = languageSelectActivity.f35487b;
                    if (wk0Var6 != null) {
                        wk0Var6.setAdapter(languageSelectActivity.f35488c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35487b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35487b.setAdapter(languageSelectActivity.f35486a);
                    return;
                }
                return;
            case 11:
                pc0 pc0Var = (pc0) this.h;
                if (pc0Var.S != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        pc0Var.f41460o0 = true;
                        pc0Var.f41470w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.V;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        pc0Var.Q.setVisibility(8);
                        pc0Var.O.setVisibility(8);
                        f2.r0 adapter3 = pc0Var.R.getAdapter();
                        ic0 ic0Var = pc0Var.S;
                        if (adapter3 != ic0Var) {
                            pc0Var.R.setAdapter(ic0Var);
                        }
                        pc0Var.R.setVisibility(0);
                        if (pc0Var.S.h() == 0) {
                            z12 = true;
                        }
                        pc0Var.f41461p0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = pc0Var.V;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        pc0Var.Q.setVisibility(0);
                        pc0Var.O.setVisibility(0);
                        pc0Var.R.setAdapter(null);
                        pc0Var.R.setVisibility(8);
                    }
                    pc0Var.A0();
                    pc0Var.S.G(obj8, pc0Var.f41467t0);
                    return;
                }
                return;
            case 12:
                ((ih0) this.h).f39163a.j(editText.getText().toString());
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f38008a.getActionBar().setSearchFieldText(editText.getText().toString());
                eq0Var.f38009b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 14:
                ((ProfileActivity) this.h).f35947e.I(editText.getText().toString().toLowerCase());
                return;
            case 15:
                String obj9 = editText.getText().toString();
                b31 b31Var = (b31) this.h;
                if (obj9 == null) {
                    b31Var.f36622f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = b31Var.f36622f;
                    if (arrayList == null) {
                        b31Var.f36622f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i10 = 0; i10 < b31Var.h.size(); i10++) {
                        TranslateController.Language language = (TranslateController.Language) b31Var.h.get(i10);
                        if (language.f19671q.startsWith(lowerCase)) {
                            b31Var.f36622f.add(0, language);
                        } else if (language.f19671q.contains(lowerCase)) {
                            b31Var.f36622f.add(language);
                        }
                    }
                    b31Var.f36620c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.wk0 wk0Var7 = b31Var.f36619b;
                    if (wk0Var7 != null) {
                        wk0Var7.setAdapter(b31Var.f36620c);
                        return;
                    }
                    return;
                } else if (b31Var.f36619b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.f36619b.setAdapter(b31Var.f36618a);
                    return;
                } else {
                    return;
                }
            case 16:
                ((z71) this.h).h.I(editText.getText().toString());
                return;
            case 17:
                String obj10 = editText.getText().toString();
                re1 re1Var = ((we1) this.h).f43768n0;
                if (!re1Var.U.equals(obj10)) {
                    re1Var.K(re1Var.f31035e[0], re1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 18:
                ig1 ig1Var = (ig1) this.h;
                ig1Var.h = editText.getText().toString();
                org.telegram.ui.Components.c51 c51Var = ig1Var.f27658a;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                    return;
                }
                return;
            case 19:
                pf.t1 t1Var = (pf.t1) this.h;
                t1Var.f45784e = editText.getText().toString();
                t1Var.f45781a.U2.N(true);
                t1Var.f45781a.u0(0);
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

    private final void w(of.m0 m0Var) {
    }
}
