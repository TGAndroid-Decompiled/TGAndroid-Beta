package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class go0 extends org.telegram.ui.ActionBar.p0 {
    public final int f37605a;
    public Object f37606b;
    public final Object f37607c;

    public go0(lo0 lo0Var) {
        this.f37605a = 0;
        this.f37607c = lo0Var;
        this.f37606b = new mg0(this, 15);
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !sc.e.y(" ", lowerCase2, lowerCase) && !sc.e.y(".", lowerCase2, lowerCase)) {
                String N3 = org.telegram.messenger.i0.N3(lowerCase);
                String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                if (N3.startsWith(N32) || N3.contains(" ".concat(N32)) || N3.contains(".".concat(N32))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean b() {
        switch (this.f37605a) {
            case 0:
                ((lo0) this.f37607c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i10;
        int i11 = this.f37605a;
        Object obj = this.f37607c;
        switch (i11) {
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f43131w = null;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.f37606b);
                org.telegram.ui.web.h hVar = mVar.f43127f;
                if (hVar != null) {
                    hVar.c();
                    mVar.f43127f = null;
                }
                org.telegram.ui.Components.ii iiVar = mVar.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    mVar.f29837a.f30818e3.h1(0, 0);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                b1Var.f42997r = null;
                b1Var.f42996n = false;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.f37606b);
                org.telegram.ui.Components.ii iiVar2 = b1Var.f29837a;
                if (iiVar2 != null) {
                    iiVar2.f30819f3.O(true);
                    b1Var.f29837a.f30818e3.h1(0, 0);
                }
                nh.p pVar = b1Var.f43001y.d;
                if (TextUtils.isEmpty(b1Var.f42997r)) {
                    i10 = 2131742944;
                } else {
                    i10 = 2131742943;
                }
                pVar.setText(org.telegram.messenger.cd.L0(i10, null));
                return;
            case 3:
                vh.k2 k2Var = (vh.k2) obj;
                nb0 nb0Var = k2Var.d;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f37606b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                tlVar.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property3, 1.0f));
                EditTextBoldCursor searchField = k2Var.G.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                nb0Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(nb0Var, property3, 1.0f));
                nb0Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(k2Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37606b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f37606b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.f37606b).playTogether(arrayList);
                ((AnimatorSet) this.f37606b).addListener(new org.telegram.ui.Components.iw0(19, this, searchField));
                ((AnimatorSet) this.f37606b).start();
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f37605a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                vh.k2 k2Var = (vh.k2) this.f37607c;
                nb0 nb0Var = k2Var.d;
                FrameLayout frameLayout = k2Var.h;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f37606b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, property3, 0.0f));
                EditTextBoldCursor searchField = k2Var.G.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(nb0Var, property3, 0.0f));
                nb0Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                k2Var.f51395s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f37606b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f37606b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.f37606b).playTogether(arrayList);
                ((AnimatorSet) this.f37606b).addListener(new sg.r(this, 15));
                ((AnimatorSet) this.f37606b).start();
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f37605a) {
            case 0:
                ((lo0) this.f37607c).f0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        int i11 = this.f37605a;
        Object obj = this.f37607c;
        switch (i11) {
            case 0:
                mg0 mg0Var = (mg0) this.f37606b;
                lo0 lo0Var = (lo0) obj;
                if (editText.getText().length() == 0) {
                    lo0Var.f39335f.clear();
                    lo0Var.h.clear();
                    lo0Var.f39355w = null;
                    lo0Var.f39350s = true;
                    lo0Var.f39348r = false;
                    if (lo0Var.f39359y != 0) {
                        ConnectionsManager.getInstance(lo0.a0(lo0Var)).cancelRequest(lo0Var.f39359y, true);
                        lo0Var.f39359y = 0;
                    }
                    lo0Var.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
                    lo0Var.N.e(false, true);
                    lo0Var.n0();
                    return;
                }
                org.telegram.messenger.i0.r(mg0Var);
                org.telegram.messenger.i0.h3(mg0Var, 1200L);
                return;
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f43131w);
                String obj2 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f43131w, obj2)) {
                    mVar.f43131w = obj2;
                    org.telegram.ui.web.h hVar = mVar.f43127f;
                    if (hVar != null) {
                        hVar.c();
                    }
                    org.telegram.ui.web.h hVar2 = new org.telegram.ui.web.h(obj2, org.telegram.ui.web.m.f0(mVar), new org.telegram.ui.web.k(mVar, 1));
                    mVar.f43127f = hVar2;
                    hVar2.a();
                    org.telegram.ui.ActionBar.w5 w5Var = (org.telegram.ui.ActionBar.w5) this.f37606b;
                    org.telegram.messenger.i0.r(w5Var);
                    org.telegram.messenger.i0.h3(w5Var, 500L);
                }
                org.telegram.ui.Components.ii iiVar = mVar.f29837a;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj2))) {
                        mVar.f29837a.f30818e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                boolean z11 = !TextUtils.isEmpty(b1Var.f42997r);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(b1Var.f42997r, obj3)) {
                    b1Var.f42997r = obj3;
                    b1Var.f42996n = true;
                    org.telegram.ui.ActionBar.w5 w5Var2 = (org.telegram.ui.ActionBar.w5) this.f37606b;
                    org.telegram.messenger.i0.r(w5Var2);
                    org.telegram.messenger.i0.h3(w5Var2, 500L);
                    nh.p pVar = b1Var.f43001y.d;
                    if (TextUtils.isEmpty(obj3)) {
                        i10 = 2131742944;
                    } else {
                        i10 = 2131742943;
                    }
                    pVar.setText(org.telegram.messenger.cd.L0(i10, null));
                }
                org.telegram.ui.Components.ii iiVar2 = b1Var.f29837a;
                if (iiVar2 != null) {
                    iiVar2.f30819f3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj3))) {
                        b1Var.f29837a.f30818e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                String obj4 = editText.getText().toString();
                vh.e2 e2Var = ((vh.k2) obj).f51394r;
                vh.d0 d0Var = e2Var.f51309w;
                if (!TextUtils.equals(e2Var.f51305f, obj4)) {
                    if (e2Var.e != -1) {
                        ConnectionsManager.getInstance(e2Var.f51310x.f51380a).cancelRequest(e2Var.e, true);
                        e2Var.e = -1;
                    }
                    e2Var.d = false;
                    e2Var.h = null;
                }
                e2Var.f51305f = obj4;
                org.telegram.messenger.i0.r(d0Var);
                if (TextUtils.isEmpty(obj4)) {
                    e2Var.f51304c.clear();
                    e2Var.F(false);
                    e2Var.f();
                    return;
                }
                e2Var.F(true);
                org.telegram.messenger.i0.h3(d0Var, 1500L);
                return;
        }
    }

    public go0(org.telegram.ui.web.m mVar) {
        this.f37605a = 1;
        this.f37607c = mVar;
        this.f37606b = new org.telegram.ui.ActionBar.w5(this, 13);
    }

    public go0(org.telegram.ui.web.b1 b1Var) {
        this.f37605a = 2;
        this.f37607c = b1Var;
        this.f37606b = new org.telegram.ui.ActionBar.w5(this, 16);
    }

    public go0(vh.k2 k2Var) {
        this.f37605a = 3;
        this.f37607c = k2Var;
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
