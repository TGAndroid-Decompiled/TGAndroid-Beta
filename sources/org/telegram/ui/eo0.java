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
public final class eo0 extends org.telegram.ui.ActionBar.p0 {
    public final int f36879a;
    public Object f36880b;
    public final Object f36881c;

    public eo0(jo0 jo0Var) {
        this.f36879a = 0;
        this.f36881c = jo0Var;
        this.f36880b = new kg0(this, 15);
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
        switch (this.f36879a) {
            case 0:
                ((jo0) this.f36881c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i10;
        int i11 = this.f36879a;
        Object obj = this.f36881c;
        switch (i11) {
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f42933w = null;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.f36880b);
                org.telegram.ui.web.h hVar = mVar.f42929f;
                if (hVar != null) {
                    hVar.c();
                    mVar.f42929f = null;
                }
                org.telegram.ui.Components.ii iiVar = mVar.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    mVar.f30217a.f31182e3.h1(0, 0);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                b1Var.f42799r = null;
                b1Var.f42798n = false;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.f36880b);
                org.telegram.ui.Components.ii iiVar2 = b1Var.f30217a;
                if (iiVar2 != null) {
                    iiVar2.f31183f3.O(true);
                    b1Var.f30217a.f31182e3.h1(0, 0);
                }
                nh.p pVar = b1Var.f42803y.d;
                if (TextUtils.isEmpty(b1Var.f42799r)) {
                    i10 = 2131742944;
                } else {
                    i10 = 2131742943;
                }
                pVar.setText(org.telegram.messenger.dd.L0(i10, null));
                return;
            case 3:
                vh.k2 k2Var = (vh.k2) obj;
                mb0 mb0Var = k2Var.d;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f36880b;
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
                mb0Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(mb0Var, property3, 1.0f));
                mb0Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(k2Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f36880b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f36880b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.f36880b).playTogether(arrayList);
                ((AnimatorSet) this.f36880b).addListener(new org.telegram.ui.Components.jw0(19, this, searchField));
                ((AnimatorSet) this.f36880b).start();
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f36879a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                vh.k2 k2Var = (vh.k2) this.f36881c;
                mb0 mb0Var = k2Var.d;
                FrameLayout frameLayout = k2Var.h;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f36880b;
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
                arrayList.add(ObjectAnimator.ofFloat(mb0Var, property3, 0.0f));
                mb0Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                k2Var.f51410s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f36880b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f36880b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.f36880b).playTogether(arrayList);
                ((AnimatorSet) this.f36880b).addListener(new sg.r(this, 15));
                ((AnimatorSet) this.f36880b).start();
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f36879a) {
            case 0:
                ((jo0) this.f36881c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        int i11 = this.f36879a;
        Object obj = this.f36881c;
        switch (i11) {
            case 0:
                kg0 kg0Var = (kg0) this.f36880b;
                jo0 jo0Var = (jo0) obj;
                if (editText.getText().length() == 0) {
                    jo0Var.f38490f.clear();
                    jo0Var.h.clear();
                    jo0Var.f38510w = null;
                    jo0Var.f38505s = true;
                    jo0Var.f38503r = false;
                    if (jo0Var.f38514y != 0) {
                        ConnectionsManager.getInstance(jo0.b0(jo0Var)).cancelRequest(jo0Var.f38514y, true);
                        jo0Var.f38514y = 0;
                    }
                    jo0Var.N.d.setText(org.telegram.messenger.dd.L0(2131748185, null));
                    jo0Var.N.e(false, true);
                    jo0Var.o0();
                    return;
                }
                org.telegram.messenger.i0.r(kg0Var);
                org.telegram.messenger.i0.h3(kg0Var, 1200L);
                return;
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f42933w);
                String obj2 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f42933w, obj2)) {
                    mVar.f42933w = obj2;
                    org.telegram.ui.web.h hVar = mVar.f42929f;
                    if (hVar != null) {
                        hVar.c();
                    }
                    org.telegram.ui.web.h hVar2 = new org.telegram.ui.web.h(obj2, org.telegram.ui.web.m.g0(mVar), new org.telegram.ui.web.k(mVar, 1));
                    mVar.f42929f = hVar2;
                    hVar2.a();
                    org.telegram.ui.ActionBar.w5 w5Var = (org.telegram.ui.ActionBar.w5) this.f36880b;
                    org.telegram.messenger.i0.r(w5Var);
                    org.telegram.messenger.i0.h3(w5Var, 500L);
                }
                org.telegram.ui.Components.ii iiVar = mVar.f30217a;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj2))) {
                        mVar.f30217a.f31182e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                boolean z11 = !TextUtils.isEmpty(b1Var.f42799r);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(b1Var.f42799r, obj3)) {
                    b1Var.f42799r = obj3;
                    b1Var.f42798n = true;
                    org.telegram.ui.ActionBar.w5 w5Var2 = (org.telegram.ui.ActionBar.w5) this.f36880b;
                    org.telegram.messenger.i0.r(w5Var2);
                    org.telegram.messenger.i0.h3(w5Var2, 500L);
                    nh.p pVar = b1Var.f42803y.d;
                    if (TextUtils.isEmpty(obj3)) {
                        i10 = 2131742944;
                    } else {
                        i10 = 2131742943;
                    }
                    pVar.setText(org.telegram.messenger.dd.L0(i10, null));
                }
                org.telegram.ui.Components.ii iiVar2 = b1Var.f30217a;
                if (iiVar2 != null) {
                    iiVar2.f31183f3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj3))) {
                        b1Var.f30217a.f31182e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                String obj4 = editText.getText().toString();
                vh.e2 e2Var = ((vh.k2) obj).f51409r;
                vh.d0 d0Var = e2Var.f51324w;
                if (!TextUtils.equals(e2Var.f51320f, obj4)) {
                    if (e2Var.e != -1) {
                        ConnectionsManager.getInstance(e2Var.f51325x.f51395a).cancelRequest(e2Var.e, true);
                        e2Var.e = -1;
                    }
                    e2Var.d = false;
                    e2Var.h = null;
                }
                e2Var.f51320f = obj4;
                org.telegram.messenger.i0.r(d0Var);
                if (TextUtils.isEmpty(obj4)) {
                    e2Var.f51319c.clear();
                    e2Var.F(false);
                    e2Var.f();
                    return;
                }
                e2Var.F(true);
                org.telegram.messenger.i0.h3(d0Var, 1500L);
                return;
        }
    }

    public eo0(org.telegram.ui.web.m mVar) {
        this.f36879a = 1;
        this.f36881c = mVar;
        this.f36880b = new org.telegram.ui.ActionBar.w5(this, 13);
    }

    public eo0(org.telegram.ui.web.b1 b1Var) {
        this.f36879a = 2;
        this.f36881c = b1Var;
        this.f36880b = new org.telegram.ui.ActionBar.w5(this, 16);
    }

    public eo0(vh.k2 k2Var) {
        this.f36879a = 3;
        this.f36881c = k2Var;
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
