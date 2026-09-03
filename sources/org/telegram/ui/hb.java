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
public final class hb extends org.telegram.ui.ActionBar.h5 {
    public final int f34626f;
    public final Object h;

    public hb(Object obj, int i10) {
        this.f34626f = i10;
        this.h = obj;
    }

    @Override
    public boolean b() {
        switch (this.f34626f) {
            case 13:
                ((rq0) this.h).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public Animator h() {
        switch (this.f34626f) {
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
        switch (this.f34626f) {
            case 0:
                ub ubVar = (ub) this.h;
                ubVar.f38758w0 = "";
                ubVar.J.setVisibility(0);
                if (ubVar.V) {
                    ubVar.V = false;
                    ubVar.V0(true);
                    return;
                }
                return;
            case 1:
                sp spVar = (sp) this.h;
                spVar.e.F(null);
                spVar.K = false;
                spVar.getClass();
                spVar.f38282b.setAdapter(spVar.f38281a);
                spVar.f38281a.l();
                spVar.f38282b.setFastScrollVisible(true);
                spVar.f38282b.setVerticalScrollBarEnabled(false);
                spVar.d.setShowAtCenter(false);
                View view = spVar.fragmentView;
                int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                spVar.fragmentView.setTag(Integer.valueOf(i10));
                spVar.d.b();
                return;
            case 2:
                rr rrVar = (rr) this.h;
                rrVar.e.F(null);
                rrVar.l1 = false;
                lh.e1 e1Var = rrVar.f37961c;
                e1Var.V1 = false;
                e1Var.W1 = 0;
                e1Var.setAdapter(rrVar.f37955a);
                rrVar.f37955a.l();
                rrVar.f37961c.setFastScrollVisible(true);
                rrVar.f37961c.setVerticalScrollBarEnabled(false);
                org.telegram.ui.ActionBar.w0 w0Var = rrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (c8Var.h) {
                    c8Var.f23847f = false;
                    c8Var.h = false;
                    c8Var.setAllowNestedScroll(true);
                    c8Var.f23862s.E(null);
                    org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f23850h0;
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
                org.telegram.ui.Components.vj vjVar = hkVar.f25436r;
                f2.o0 adapter = vjVar.getAdapter();
                org.telegram.ui.Components.zj zjVar = hkVar.v;
                if (adapter != zjVar) {
                    vjVar.setAdapter(zjVar);
                }
                zjVar.l();
                hkVar.f25440y.Y(null, true);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.f23407i0 = false;
                alVar.f23408j0 = false;
                alVar.O.G(null, null);
                alVar.f0();
                alVar.M.setVisibility(0);
                alVar.K.setVisibility(0);
                alVar.N.setVisibility(8);
                alVar.v.setVisibility(8);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.f31530r.G(null);
                contactsActivity.C = false;
                contactsActivity.B = false;
                contactsActivity.f31517f.setAdapter(contactsActivity.d);
                contactsActivity.f31517f.setSectionsType(1);
                contactsActivity.d.l();
                contactsActivity.f31517f.setFastScrollVisible(true);
                contactsActivity.f31517f.setVerticalScrollBarEnabled(false);
                contactsActivity.f31517f.getFastScroll().f23437e0 = AndroidUtilities.dp(90.0f);
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                au auVar = (au) this.h;
                yt ytVar = auVar.d;
                ytVar.getClass();
                ytVar.e = null;
                auVar.f32644f = false;
                auVar.e = false;
                auVar.f32641a.setAdapter(auVar.f32643c);
                auVar.f32641a.setFastScrollVisible(true);
                return;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.f36221a.getActionBar().h(false);
                mvVar.f36222b.getActionBar().h(false);
                return;
            case 9:
                o70 o70Var = (o70) this.h;
                if (o70Var.J) {
                    n70.E(o70Var.f36673f, null);
                    o70Var.J = false;
                    o70Var.d.setAdapter(o70Var.e);
                    return;
                }
                return;
            case 10:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.h;
                languageSelectActivity.i0(null);
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31581b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31581b.setAdapter(languageSelectActivity.f31580a);
                    return;
                }
                return;
            case 11:
                cd0 cd0Var = (cd0) this.h;
                cd0Var.f33101o0 = false;
                cd0Var.f33102p0 = false;
                cd0Var.T.G(null, null);
                cd0Var.B0();
                if (cd0Var.D0 == 8) {
                    org.telegram.ui.ActionBar.w0 w0Var3 = cd0Var.W;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(0);
                    }
                    cd0Var.R.setVisibility(0);
                    cd0Var.P.setVisibility(0);
                    cd0Var.S.setAdapter(null);
                    cd0Var.S.setVisibility(8);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.fa0 fa0Var = ((sh0) this.h).f38229a;
                fa0Var.f9480y = false;
                fa0Var.j(null);
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                t31 t31Var = (t31) this.h;
                t31Var.f38378f = null;
                if (t31Var.f38376b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.f38376b.setAdapter(t31Var.f38375a);
                    return;
                }
                return;
            case 16:
                w81 w81Var = (w81) this.h;
                w81Var.f39309a.a(false, true);
                w81Var.o0(false, true);
                w81Var.f39311c.V2.N(false);
                return;
            case 17:
                sf1.b0((sf1) this.h, false);
                return;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = null;
                org.telegram.ui.Components.a61 a61Var = eh1Var.f23568a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = false;
                r1Var.e = null;
                r1Var.f45493a.V2.N(true);
                r1Var.f45493a.u0(0);
                return;
        }
    }

    @Override
    public void n() {
        int top;
        switch (this.f34626f) {
            case 0:
                ub ubVar = (ub) this.h;
                ubVar.J.setVisibility(8);
                ubVar.getClass();
                return;
            case 1:
                sp spVar = (sp) this.h;
                spVar.K = true;
                spVar.d.setShowAtCenter(true);
                return;
            case 2:
                rr rrVar = (rr) this.h;
                rrVar.l1 = true;
                org.telegram.ui.ActionBar.w0 w0Var = rrVar.h;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                c8Var.f23858p0 = c8Var.f23860r.N0();
                View m9 = c8Var.f23860r.m(c8Var.f23858p0);
                if (m9 == null) {
                    top = 0;
                } else {
                    top = m9.getTop();
                }
                c8Var.f23859q0 = top;
                c8Var.h = true;
                c8Var.setAllowNestedScroll(false);
                c8Var.f23862s.l();
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.f23850h0;
                if (w0Var2 != null) {
                    w0Var2.setVisibility(8);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                hkVar.V = true;
                hkVar.D.setVisibility(8);
                hkVar.f24282b.t1(hkVar.C.getSearchField(), true);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                alVar.f23407i0 = true;
                alVar.f24282b.t1(alVar.B.getSearchField(), true);
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                contactsActivity.C = true;
                ContactsActivity.e0(contactsActivity);
                return;
            case 7:
                ((au) this.h).f32644f = true;
                return;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.f36221a.getActionBar().x("");
                mvVar.f36222b.getActionBar().x("");
                mvVar.f36223c.getSearchField().requestFocus();
                return;
            case 9:
                return;
            case 10:
                ((LanguageSelectActivity) this.h).getClass();
                return;
            case 11:
                ((cd0) this.h).f33101o0 = true;
                return;
            case 12:
                ((sh0) this.h).f38229a.f9480y = true;
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f37946a.getActionBar().x("");
                rq0Var.f37947b.getActionBar().x("");
                rq0Var.f37948c.getSearchField().requestFocus();
                return;
            case 14:
            default:
                return;
            case 15:
                return;
            case 16:
                w81 w81Var = (w81) this.h;
                w81Var.f39309a.a(true, true);
                w81Var.h.I("");
                w81Var.o0(false, true);
                w81Var.f39311c.V2.N(false);
                return;
            case 17:
                sf1 sf1Var = (sf1) this.h;
                sf1.b0(sf1Var, true);
                of1 of1Var = sf1Var.f38203o0;
                if (!of1Var.V.equals("")) {
                    of1Var.K(of1Var.e[0], of1Var.getCurrentPosition(), "", false);
                }
                sf1Var.f38203o0.setAlpha(0.0f);
                sf1Var.f38203o0.f36787k0.e(true, false);
                return;
            case 18:
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.d = true;
                r1Var.f45493a.V2.N(true);
                r1Var.f45493a.u0(0);
                return;
        }
    }

    @Override
    public void o(tf.e0 e0Var) {
        switch (this.f34626f) {
            case 4:
                org.telegram.ui.Components.hk hkVar = (org.telegram.ui.Components.hk) this.h;
                org.telegram.ui.Components.gk gkVar = hkVar.f25440y;
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
        switch (this.f34626f) {
            case 0:
                ub ubVar = (ub) this.h;
                ubVar.V = true;
                ubVar.f38758w0 = fVar.getText().toString();
                ubVar.V0(true);
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f37946a.getActionBar().w();
                rq0Var.f37947b.getActionBar().w();
                return;
            default:
                return;
        }
    }

    @Override
    public void q(EditText editText) {
        org.telegram.ui.Components.rl0 rl0Var;
        int h;
        lh.e1 e1Var;
        f2.o0 o0Var;
        switch (this.f34626f) {
            case 1:
                sp spVar = (sp) this.h;
                if (spVar.e != null) {
                    String obj = editText.getText().toString();
                    if (obj.length() != 0 && (rl0Var = spVar.f38282b) != null) {
                        f2.o0 adapter = rl0Var.getAdapter();
                        rp rpVar = spVar.e;
                        if (adapter != rpVar) {
                            spVar.f38282b.setAdapter(rpVar);
                            View view = spVar.fragmentView;
                            int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                            spVar.fragmentView.setTag(Integer.valueOf(i10));
                            spVar.e.l();
                            spVar.f38282b.setFastScrollVisible(false);
                            spVar.f38282b.setVerticalScrollBarEnabled(true);
                            spVar.d.b();
                        }
                    }
                    spVar.e.F(obj);
                    return;
                }
                return;
            case 2:
                rr rrVar = (rr) this.h;
                if (rrVar.e != null) {
                    String obj2 = editText.getText().toString();
                    if (rrVar.f37961c.getAdapter() == null) {
                        h = 0;
                    } else {
                        h = rrVar.f37961c.getAdapter().h();
                    }
                    rrVar.e.F(obj2);
                    if (TextUtils.isEmpty(obj2) && (e1Var = rrVar.f37961c) != null) {
                        f2.o0 adapter2 = e1Var.getAdapter();
                        nr nrVar = rrVar.f37955a;
                        if (adapter2 != nrVar) {
                            lh.e1 e1Var2 = rrVar.f37961c;
                            e1Var2.V1 = false;
                            e1Var2.W1 = 0;
                            e1Var2.setAdapter(nrVar);
                            if (h == 0) {
                                rrVar.y0(0);
                            }
                        }
                    }
                    rrVar.A1.setVisibility(8);
                    rrVar.f38014z1.setVisibility(0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.h;
                if (editText.length() > 0) {
                    c8Var.f23862s.E(editText.getText().toString());
                    return;
                }
                c8Var.f23847f = false;
                c8Var.f23862s.E(null);
                return;
            case 4:
                ((org.telegram.ui.Components.hk) this.h).f25440y.Y(editText.getText().toString(), false);
                return;
            case 5:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.h;
                dg.u2 u2Var = alVar.K;
                lh.e1 e1Var3 = alVar.M;
                org.telegram.ui.Components.rl0 rl0Var2 = alVar.N;
                org.telegram.ui.Components.tk tkVar = alVar.O;
                if (tkVar != null) {
                    String obj3 = editText.getText().toString();
                    boolean z4 = false;
                    if (obj3.length() != 0) {
                        alVar.f23408j0 = true;
                        alVar.B.setShowSearchProgress(true);
                        e1Var3.setVisibility(8);
                        u2Var.setVisibility(8);
                        if (rl0Var2.getAdapter() != tkVar) {
                            rl0Var2.setAdapter(tkVar);
                        }
                        rl0Var2.setVisibility(0);
                        if (tkVar.f44734s.size() == 0 && tkVar.f44733r.size() == 0) {
                            z4 = true;
                        }
                        alVar.f23409k0 = z4;
                        alVar.f0();
                    } else {
                        e1Var3.setVisibility(0);
                        u2Var.setVisibility(0);
                        rl0Var2.setAdapter(null);
                        rl0Var2.setVisibility(8);
                        alVar.v.setVisibility(8);
                    }
                    tkVar.G(obj3, alVar.f23413o0);
                    return;
                }
                return;
            case 6:
                ContactsActivity contactsActivity = (ContactsActivity) this.h;
                if (contactsActivity.f31530r != null) {
                    String obj4 = editText.getText().toString();
                    contactsActivity.f31513c.a(!obj4.isEmpty(), true);
                    contactsActivity.f31518f0 = obj4;
                    if (!obj4.isEmpty()) {
                        contactsActivity.B = true;
                        org.telegram.ui.Components.rl0 rl0Var3 = contactsActivity.f31517f;
                        if (rl0Var3 != null) {
                            rl0Var3.setAdapter(contactsActivity.f31530r);
                            contactsActivity.f31517f.setSectionsType(0);
                            contactsActivity.f31530r.l();
                            contactsActivity.f31517f.setFastScrollVisible(false);
                            contactsActivity.f31517f.setVerticalScrollBarEnabled(true);
                        }
                        contactsActivity.e.e(true, true);
                        contactsActivity.f31530r.G(obj4);
                        return;
                    }
                    org.telegram.ui.Components.rl0 rl0Var4 = contactsActivity.f31517f;
                    if (rl0Var4 != null) {
                        rl0Var4.setAdapter(contactsActivity.d);
                        contactsActivity.f31517f.setSectionsType(1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                au auVar = (au) this.h;
                String obj5 = editText.getText().toString();
                if (TextUtils.isEmpty(obj5)) {
                    yt ytVar = auVar.d;
                    ytVar.getClass();
                    ytVar.e = null;
                    auVar.e = false;
                    auVar.f32641a.setAdapter(auVar.f32643c);
                    auVar.f32641a.setFastScrollVisible(true);
                    return;
                }
                yt ytVar2 = auVar.d;
                ytVar2.getClass();
                if (obj5 == null) {
                    ytVar2.e = null;
                } else {
                    try {
                        Timer timer = ytVar2.d;
                        if (timer != null) {
                            timer.cancel();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    Timer timer2 = new Timer();
                    ytVar2.d = timer2;
                    timer2.schedule(new xt(ytVar2, obj5, 0), 100L, 300L);
                }
                if (obj5.length() != 0) {
                    auVar.e = true;
                    return;
                }
                return;
            case 8:
                mv mvVar = (mv) this.h;
                mvVar.f36221a.getActionBar().setSearchFieldText(editText.getText().toString());
                mvVar.f36222b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 9:
                String obj6 = editText.getText().toString();
                o70 o70Var = (o70) this.h;
                n70.E(o70Var.f36673f, obj6);
                boolean isEmpty = TextUtils.isEmpty(obj6);
                boolean z10 = !isEmpty;
                if (z10 != o70Var.J) {
                    o70Var.J = z10;
                    org.telegram.ui.Components.rl0 rl0Var5 = o70Var.d;
                    if (rl0Var5 != null) {
                        if (!isEmpty) {
                            o0Var = o70Var.f36673f;
                        } else {
                            o0Var = o70Var.e;
                        }
                        rl0Var5.setAdapter(o0Var);
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
                    org.telegram.ui.Components.rl0 rl0Var6 = languageSelectActivity.f31581b;
                    if (rl0Var6 != null) {
                        rl0Var6.setAdapter(languageSelectActivity.f31582c);
                        return;
                    }
                    return;
                }
                languageSelectActivity.getClass();
                languageSelectActivity.getClass();
                if (languageSelectActivity.f31581b != null) {
                    languageSelectActivity.d.setVisibility(8);
                    languageSelectActivity.f31581b.setAdapter(languageSelectActivity.f31580a);
                    return;
                }
                return;
            case 11:
                cd0 cd0Var = (cd0) this.h;
                if (cd0Var.T != null) {
                    String obj8 = editText.getText().toString();
                    boolean z11 = false;
                    if (obj8.length() != 0) {
                        cd0Var.f33102p0 = true;
                        cd0Var.f33111w.setShowSearchProgress(true);
                        org.telegram.ui.ActionBar.w0 w0Var = cd0Var.W;
                        if (w0Var != null) {
                            w0Var.setVisibility(8);
                        }
                        cd0Var.R.setVisibility(8);
                        cd0Var.P.setVisibility(8);
                        f2.o0 adapter3 = cd0Var.S.getAdapter();
                        vc0 vc0Var = cd0Var.T;
                        if (adapter3 != vc0Var) {
                            cd0Var.S.setAdapter(vc0Var);
                        }
                        cd0Var.S.setVisibility(0);
                        if (cd0Var.T.h() == 0) {
                            z11 = true;
                        }
                        cd0Var.f33103q0 = z11;
                    } else {
                        org.telegram.ui.ActionBar.w0 w0Var2 = cd0Var.W;
                        if (w0Var2 != null) {
                            w0Var2.setVisibility(0);
                        }
                        cd0Var.R.setVisibility(0);
                        cd0Var.P.setVisibility(0);
                        cd0Var.S.setAdapter(null);
                        cd0Var.S.setVisibility(8);
                    }
                    cd0Var.B0();
                    cd0Var.T.G(obj8, cd0Var.f33109u0);
                    return;
                }
                return;
            case 12:
                ((sh0) this.h).f38229a.j(editText.getText().toString());
                return;
            case 13:
                rq0 rq0Var = (rq0) this.h;
                rq0Var.f37946a.getActionBar().setSearchFieldText(editText.getText().toString());
                rq0Var.f37947b.getActionBar().setSearchFieldText(editText.getText().toString());
                return;
            case 14:
                ((ProfileActivity) this.h).e.I(editText.getText().toString().toLowerCase());
                return;
            case 15:
                String obj9 = editText.getText().toString();
                t31 t31Var = (t31) this.h;
                if (obj9 == null) {
                    t31Var.f38378f = null;
                } else {
                    String lowerCase = obj9.trim().toLowerCase();
                    ArrayList arrayList = t31Var.f38378f;
                    if (arrayList == null) {
                        t31Var.f38378f = new ArrayList();
                    } else {
                        arrayList.clear();
                    }
                    for (int i11 = 0; i11 < t31Var.h.size(); i11++) {
                        TranslateController.Language language = (TranslateController.Language) t31Var.h.get(i11);
                        if (language.f16671q.startsWith(lowerCase)) {
                            t31Var.f38378f.add(0, language);
                        } else if (language.f16671q.contains(lowerCase)) {
                            t31Var.f38378f.add(language);
                        }
                    }
                    t31Var.f38377c.l();
                }
                if (obj9.length() != 0) {
                    org.telegram.ui.Components.rl0 rl0Var7 = t31Var.f38376b;
                    if (rl0Var7 != null) {
                        rl0Var7.setAdapter(t31Var.f38377c);
                        return;
                    }
                    return;
                } else if (t31Var.f38376b != null) {
                    t31Var.d.setVisibility(8);
                    t31Var.f38376b.setAdapter(t31Var.f38375a);
                    return;
                } else {
                    return;
                }
            case 16:
                ((w81) this.h).h.I(editText.getText().toString());
                return;
            case 17:
                String obj10 = editText.getText().toString();
                of1 of1Var = ((sf1) this.h).f38203o0;
                if (!of1Var.V.equals(obj10)) {
                    of1Var.K(of1Var.e[0], of1Var.getCurrentPosition(), obj10, false);
                    return;
                }
                return;
            case 18:
                eh1 eh1Var = (eh1) this.h;
                eh1Var.h = editText.getText().toString();
                org.telegram.ui.Components.a61 a61Var = eh1Var.f23568a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 19:
                uf.r1 r1Var = (uf.r1) this.h;
                r1Var.e = editText.getText().toString();
                r1Var.f45493a.V2.N(true);
                r1Var.f45493a.u0(0);
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
