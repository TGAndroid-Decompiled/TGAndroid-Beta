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
public final class bb extends org.telegram.ui.ActionBar.e5 {
    public final int f36757f;
    public final Object h;

    public bb(Object obj, int i10) {
        this.f36757f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f36757f) {
            case 13:
                ((eq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f36757f) {
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.h;
                boolean z10 = profileActivity.S1;
                profileActivity.S1 = !z10;
                if (z10) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.Q0;
                    w0Var.f23920e.clearFocus();
                    AndroidUtilities.hideKeyboard(w0Var.f23920e);
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
        switch (this.f36757f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.f41070v0 = "";
                obVar.I.setVisibility(0);
                if (obVar.U) {
                    obVar.U = false;
                    obVar.V0(true);
                    return;
                }
                return;
            case 1:
                kp kpVar = (kp) this.h;
                kpVar.f39980e.F(null);
                kpVar.J = false;
                kpVar.getClass();
                kpVar.f39978b.setAdapter(kpVar.f39977a);
                kpVar.f39977a.l();
                kpVar.f39978b.setFastScrollVisible(true);
                kpVar.f39978b.setVerticalScrollBarEnabled(false);
                kpVar.d.setShowAtCenter(false);
                View view = kpVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                kpVar.fragmentView.setTag(Integer.valueOf(i10));
                kpVar.d.b();
                return;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.f39629e.F(null);
                jrVar.f39644k1 = false;
                jh.e1 e1Var = jrVar.f39624c;
                e1Var.U1 = false;
                e1Var.V1 = 0;
                e1Var.setAdapter(jrVar.f39618a);
                jrVar.f39618a.l();
                jrVar.f39624c.setFastScrollVisible(true);
                jrVar.f39624c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                if (g8Var.h) {
                    g8Var.f28784f = false;
                    g8Var.h = false;
                    g8Var.setAllowNestedScroll(true);
                    g8Var.f28799s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.f28786g0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.U = false;
                jkVar.C.setVisibility(0);
                org.telegram.ui.Components.xj xjVar = jkVar.f29678r;
                f2.p0 adapter = xjVar.getAdapter();
                org.telegram.ui.Components.bk bkVar = jkVar.v;
                if (adapter != bkVar) {
                    xjVar.setAdapter(bkVar);
                }
                bkVar.l();
                jkVar.f29682y.Y(null, true);
                return;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                blVar.f27159h0 = false;
                blVar.f27160i0 = false;
                blVar.N.G(null, null);
                blVar.f0();
                blVar.L.setVisibility(0);
                blVar.J.setVisibility(0);
                blVar.M.setVisibility(8);
                blVar.v.setVisibility(8);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f35500r.G(null);
                contactsActivity.B = false;
                contactsActivity.A = false;
                contactsActivity.f35487f.setAdapter(contactsActivity.d);
                contactsActivity.f35487f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f35487f.setFastScrollVisible(true);
                contactsActivity.f35487f.setVerticalScrollBarEnabled(false);
                contactsActivity.f35487f.getFastScroll().f32670d0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                rt rtVar = (rt) this.h;
                pt ptVar = rtVar.d;
                ptVar.getClass();
                ptVar.f41460e = null;
                rtVar.f42201f = false;
                rtVar.f42200e = false;
                rtVar.f42197a.setAdapter(rtVar.f42199c);
                rtVar.f42197a.setFastScrollVisible(true);
                return;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.f37218a.getActionBar().h(false);
                cvVar.f37219b.getActionBar().h(false);
                return;
            case 9:
                c70 c70Var = (c70) this.h;
                if (c70Var.I) {
                    b70.E(c70Var.f37016f, null);
                    c70Var.I = false;
                    c70Var.d.setAdapter(c70Var.f37015e);
                    return;
                }
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35554b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35554b.setAdapter(languageSelectActivity.f35553a);
                    return;
                }
                return;
            case 11:
                rc0 rc0Var = (rc0) this.h;
                rc0Var.f42050n0 = false;
                rc0Var.f42051o0 = false;
                rc0Var.S.G(null, null);
                rc0Var.B0();
                if (rc0Var.C0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = rc0Var.V;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    rc0Var.Q.setVisibility(0);
                    rc0Var.O.setVisibility(0);
                    rc0Var.R.setAdapter(null);
                    rc0Var.R.setVisibility(8);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.z90 z90Var = ((ih0) this.h).f39274a;
                z90Var.f8141y = false;
                z90Var.j(null);
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                b31 b31Var = (b31) this.h;
                b31Var.f36679f = null;
                if (b31Var.f36676b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.f36676b.setAdapter(b31Var.f36675a);
                    return;
                }
                return;
            case 16:
                b81 b81Var = (b81) this.h;
                b81Var.f36717a.a(false, true);
                b81Var.o0(false, true);
                b81Var.f36719c.U2.N(false);
                return;
            case 17:
                ze1.b0((ze1) this.h, false);
                return;
            case 18:
                kg1 kg1Var = (kg1) this.h;
                kg1Var.h = null;
                org.telegram.ui.Components.o51 o51Var = kg1Var.f31601a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.d = false;
                u1Var.f47966e = null;
                u1Var.f47963a.U2.N(true);
                u1Var.f47963a.u0(0);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f36757f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.I.setVisibility(8);
                obVar.getClass();
                return;
            case 1:
                kp kpVar = (kp) this.h;
                kpVar.J = true;
                kpVar.d.setShowAtCenter(true);
                return;
            case 2:
                jr jrVar = (jr) this.h;
                jrVar.f39644k1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = jrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                g8Var.f28794o0 = g8Var.f28797r.N0();
                View m10 = g8Var.f28797r.m(g8Var.f28794o0);
                if (m10 == null) {
                    top = 0;
                } else {
                    top = m10.getTop();
                }
                g8Var.f28795p0 = top;
                g8Var.h = true;
                g8Var.setAllowNestedScroll(false);
                g8Var.f28799s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.f28786g0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                jkVar.U = true;
                jkVar.C.setVisibility(8);
                jkVar.f28403b.t1(jkVar.B.getSearchField(), true);
                return;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                blVar.f27159h0 = true;
                blVar.f28403b.t1(blVar.A.getSearchField(), true);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.B = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                ((rt) this.h).f42201f = true;
                return;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.f37218a.getActionBar().x("");
                cvVar.f37219b.getActionBar().x("");
                cvVar.f37220c.getSearchField().requestFocus();
                return;
            case 9:
                return;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 11:
                ((rc0) this.h).f42050n0 = true;
                return;
            case 12:
                ((ih0) this.h).f39274a.f8141y = true;
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f37886a.getActionBar().x("");
                eq0Var.f37887b.getActionBar().x("");
                eq0Var.f37888c.getSearchField().requestFocus();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                b81 b81Var = (b81) this.h;
                b81Var.f36717a.a(true, true);
                b81Var.h.I("");
                b81Var.o0(false, true);
                b81Var.f36719c.U2.N(false);
                return;
            case 17:
                ze1 ze1Var = (ze1) this.h;
                ze1.b0(ze1Var, true);
                ve1 ve1Var = ze1Var.f45182n0;
                if (!ve1Var.U.equals("")) {
                    ve1Var.K(ve1Var.f35261e[0], ve1Var.getCurrentPosition(), "", false);
                }
                ze1Var.f45182n0.setAlpha(0.0f);
                ze1Var.f45182n0.f43569j0.e(true, false);
                return;
            case 18:
                return;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.d = true;
                u1Var.f47963a.U2.N(true);
                u1Var.f47963a.u0(0);
                return;
        }
    }

    @Override
    public void o(rf.f0 f0Var) {
        switch (this.f36757f) {
            case 4:
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) this.h;
                org.telegram.ui.Components.ik ikVar = jkVar.f29682y;
                ikVar.N.remove(f0Var);
                ikVar.Y(jkVar.B.getSearchField().getText().toString(), false);
                ikVar.a0(null, null, true);
                return;
            case 17:
            default:
                return;
        }
    }

    @Override
    public void p(ig.f fVar) {
        switch (this.f36757f) {
            case 0:
                ob obVar = (ob) this.h;
                obVar.U = true;
                obVar.f41070v0 = fVar.getText().toString();
                obVar.V0(true);
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f37886a.getActionBar().w();
                eq0Var.f37887b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.jl0 jl0Var;
        int h;
        jh.e1 e1Var;
        f2.p0 p0Var;
        switch (this.f36757f) {
            case 1:
                kp kpVar = (kp) this.h;
                if (kpVar.f39980e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (jl0Var = kpVar.f39978b) != null) {
                        f2.p0 adapter = jl0Var.getAdapter();
                        jp jpVar = kpVar.f39980e;
                        if (adapter != jpVar) {
                            kpVar.f39978b.setAdapter(jpVar);
                            View view = kpVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                            kpVar.fragmentView.setTag(Integer.valueOf(i10));
                            kpVar.f39980e.l();
                            kpVar.f39978b.setFastScrollVisible(false);
                            kpVar.f39978b.setVerticalScrollBarEnabled(true);
                            kpVar.d.b();
                        }
                    }
                    kpVar.f39980e.F(obj);
                    return;
                }
                return;
            case 2:
                jr jrVar = (jr) this.h;
                if (jrVar.f39629e != null) {
                    String obj2 = editText.getText().toString();
                    if (jrVar.f39624c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = jrVar.f39624c.getAdapter().h();
                    }
                    jrVar.f39629e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = jrVar.f39624c) != null) {
                        f2.p0 adapter2 = e1Var.getAdapter();
                        fr frVar = jrVar.f39618a;
                        if (adapter2 != frVar) {
                            jh.e1 e1Var2 = jrVar.f39624c;
                            e1Var2.U1 = false;
                            e1Var2.V1 = 0;
                            e1Var2.setAdapter(frVar);
                            if (h == 0) {
                                jrVar.y0(0);
                            }
                        }
                    }
                    jrVar.f39678z1.setVisibility(8);
                    jrVar.f39676y1.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.h;
                if (editText.length() > 0) {
                    g8Var.f28799s.E(editText.getText().toString());
                    return;
                }
                g8Var.f28784f = false;
                g8Var.f28799s.E(null);
                return;
            case 4:
                ((org.telegram.ui.Components.jk) this.h).f29682y.Y(editText.getText().toString(), false);
                return;
            case 5:
                org.telegram.ui.Components.bl blVar = (org.telegram.ui.Components.bl) this.h;
                bg.x2 x2Var = blVar.J;
                jh.e1 e1Var3 = blVar.L;
                org.telegram.ui.Components.jl0 jl0Var2 = blVar.M;
                org.telegram.ui.Components.vk vkVar = blVar.N;
                if (vkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z10 = false;
                    if (obj3.length() != 0) {
                        blVar.f27160i0 = true;
                        blVar.A.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        x2Var.setVisibility(8);
                        if (jl0Var2.getAdapter() != vkVar) {
                            jl0Var2.setAdapter(vkVar);
                        }
                        jl0Var2.setVisibility(0);
                        if (vkVar.f47180s.size() == 0 && vkVar.f47179r.size() == 0) {
                            z10 = true;
                        }
                        blVar.f27161j0 = z10;
                        blVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        x2Var.setVisibility(0);
                        jl0Var2.setAdapter(null);
                        jl0Var2.setVisibility(8);
                        blVar.v.setVisibility(8);
                    }
                    vkVar.G(obj3, blVar.f27165n0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f35500r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f35482c.a(!obj4.isEmpty(), true);
                    contactsActivity.f35486e0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.A = true;
                        org.telegram.ui.Components.jl0 jl0Var3 = contactsActivity.f35487f;
                        if (jl0Var3 != null) {
                            jl0Var3.setAdapter(contactsActivity.f35500r);
                            contactsActivity.f35487f.setSectionsType(0);
                            contactsActivity.f35500r.l();
                            contactsActivity.f35487f.setFastScrollVisible(false);
                            contactsActivity.f35487f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.f35485e.e(true, true);
                        contactsActivity.f35500r.G(obj4);
                        return;
                    }
                    org.telegram.ui.Components.jl0 jl0Var4 = contactsActivity.f35487f;
                    if (jl0Var4 != null) {
                        jl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f35487f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                rt rtVar = (rt) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    pt ptVar = rtVar.d;
                    ptVar.getClass();
                    ptVar.f41460e = null;
                    rtVar.f42200e = false;
                    rtVar.f42197a.setAdapter(rtVar.f42199c);
                    rtVar.f42197a.setFastScrollVisible(true);
                    return;
                }
                pt ptVar2 = rtVar.d;
                ptVar2.getClass();
                if (obj5 == null) {
                    ptVar2.f41460e = null;
                } else {
                    try {
                        Timer timer = ptVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Timer timer2 = new Timer();
                    ptVar2.d = timer2;
                    timer2.schedule(new ot(ptVar2, obj5, 0), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    rtVar.f42200e = true;
                    return;
                }
                return;
            case 8:
                cv cvVar = (cv) this.h;
                cvVar.f37218a.getActionBar().setSearchFieldText(editText.getText().toString());
                cvVar.f37219b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 9:
                String obj6 = editText.getText().toString();
                c70 c70Var = (c70) this.h;
                b70.E(c70Var.f37016f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z11 = !isEmpty;
                if (z11 != c70Var.I) {
                    c70Var.I = z11;
                    org.telegram.ui.Components.jl0 jl0Var5 = c70Var.d;
                    if (jl0Var5 != null) {
                        if (!isEmpty) {
                            p0Var = c70Var.f37016f;
                        } else {
                            p0Var = c70Var.f37015e;
                        }
                        jl0Var5.setAdapter(p0Var);
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
                    org.telegram.ui.Components.jl0 jl0Var6 = languageSelectActivity.f35554b;
                    if (jl0Var6 != null) {
                        jl0Var6.setAdapter(languageSelectActivity.f35555c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f35554b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f35554b.setAdapter(languageSelectActivity.f35553a);
                    return;
                }
                return;
            case 11:
                rc0 rc0Var = (rc0) this.h;
                if (rc0Var.S != null) {
                    String obj8 = editText.getText().toString();
                    boolean z12 = false;
                    if (obj8.length() != 0) {
                        rc0Var.f42051o0 = true;
                        rc0Var.f42061w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.V;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        rc0Var.Q.setVisibility(8);
                        rc0Var.O.setVisibility(8);
                        f2.p0 adapter3 = rc0Var.R.getAdapter();
                        kc0 kc0Var = rc0Var.S;
                        if (adapter3 != kc0Var) {
                            rc0Var.R.setAdapter(kc0Var);
                        }
                        rc0Var.R.setVisibility(0);
                        if (rc0Var.S.h() == 0) {
                            z12 = true;
                        }
                        rc0Var.f42052p0 = z12;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = rc0Var.V;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        rc0Var.Q.setVisibility(0);
                        rc0Var.O.setVisibility(0);
                        rc0Var.R.setAdapter(null);
                        rc0Var.R.setVisibility(8);
                    }
                    rc0Var.B0();
                    rc0Var.S.G(obj8, rc0Var.f42058t0);
                    return;
                }
                return;
            case 12:
                ((ih0) this.h).f39274a.j(editText.getText().toString());
                return;
            case 13:
                eq0 eq0Var = (eq0) this.h;
                eq0Var.f37886a.getActionBar().setSearchFieldText(editText.getText().toString());
                eq0Var.f37887b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 14:
                ((ProfileActivity) this.h).f36012e.I(editText.getText().toString().toLowerCase());
                return;
            case 15:
                String obj9 = editText.getText().toString();
                b31 b31Var = (b31) this.h;
                if (obj9 == null) {
                    b31Var.f36679f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = b31Var.f36679f;
                    if (arrayList == null) {
                        b31Var.f36679f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < b31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) b31Var.h.get(i11);
                        if (language.f19642q.startsWith(lowerCase)) {
                            b31Var.f36679f.add(0, language);
                        } else if (language.f19642q.contains(lowerCase)) {
                            b31Var.f36679f.add(language);
                        }
                    }
                    b31Var.f36677c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.jl0 jl0Var7 = b31Var.f36676b;
                    if (jl0Var7 != null) {
                        jl0Var7.setAdapter(b31Var.f36677c);
                        return;
                    }
                    return;
                } else if (b31Var.f36676b != null) {
                    b31Var.d.setVisibility(8);
                    b31Var.f36676b.setAdapter(b31Var.f36675a);
                    return;
                } else {
                    return;
                }
            case 16:
                ((b81) this.h).h.I(editText.getText().toString());
                return;
            case 17:
                String obj10 = editText.getText().toString();
                ve1 ve1Var = ((ze1) this.h).f45182n0;
                if (!ve1Var.U.equals(obj10)) {
                    ve1Var.K(ve1Var.f35261e[0], ve1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 18:
                kg1 kg1Var = (kg1) this.h;
                kg1Var.h = editText.getText().toString();
                org.telegram.ui.Components.o51 o51Var = kg1Var.f31601a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    return;
                }
                return;
            case 19:
                sf.u1 u1Var = (sf.u1) this.h;
                u1Var.f47966e = editText.getText().toString();
                u1Var.f47963a.U2.N(true);
                u1Var.f47963a.u0(0);
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

    private final void w(rf.f0 f0Var) {
    }
}
