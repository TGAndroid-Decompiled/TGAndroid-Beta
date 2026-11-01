package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.w7;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a10;
import org.telegram.ui.e10;
import org.telegram.ui.ey;
import org.telegram.ui.hy;
import org.telegram.ui.jl0;
import org.telegram.ui.kt;
import org.telegram.ui.mb0;
import org.telegram.ui.qv;
public final class d1 implements View.OnTouchListener {
    public final int f20245a;
    public final Object f20246b;
    public final Object f20247c;

    public d1(int i10, Object obj, Object obj2) {
        this.f20245a = i10;
        this.f20246b = obj;
        this.f20247c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int i11;
        String L0;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16 = this.f20245a;
        boolean z11 = true;
        Object obj = this.f20247c;
        Object obj2 = this.f20246b;
        switch (i16) {
            case 0:
                k1 k1Var = (k1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        k1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                v7 v7Var = (v7) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    w7 w7Var = v7Var.f31219n;
                    w7Var.f32128x1.t(w7Var.f32110o1.T(wVar));
                }
                return false;
            case 2:
                cv cvVar = (cv) obj2;
                return kt.p().r(motionEvent, cvVar.f25246n1, (om) obj, cvVar.E1, cvVar.I0);
            case 3:
                return tx0.a((tx0) obj2, (org.telegram.ui.Components.k) obj, motionEvent);
            case 4:
                ey eyVar = (ey) obj2;
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) obj;
                eyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    hy hyVar = eyVar.f36925f;
                    hyVar.f37884c.t(hyVar.f37883b.T(j4Var));
                }
                return false;
            case 5:
                e10 e10Var = (e10) obj2;
                a10 a10Var = (a10) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = e10Var.e;
                    filtersSetupActivity.f33340c.t(filtersSetupActivity.f33338a.T(a10Var));
                }
                return false;
            case 6:
                jl0 jl0Var = (jl0) obj2;
                Context context = (Context) obj;
                if (jl0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.get(1);
                calendar.get(2);
                calendar.get(5);
                try {
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                    int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                    if (intValue == 8) {
                        try {
                            L0 = dd.L0(2131747483, null);
                            i11 = 0;
                            str = null;
                            i12 = 20;
                            i10 = 0;
                        } catch (Exception e) {
                            e = e;
                            f8.g(e, z11);
                            return z11;
                        }
                    } else {
                        i10 = -120;
                        i11 = -18;
                        L0 = dd.L0(2131747484, null);
                        str = null;
                        i12 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i13 = Utilities.z(split[0]).intValue();
                        i15 = Utilities.z(split[1]).intValue();
                        i14 = Utilities.z(split[2]).intValue();
                    } else {
                        i13 = -1;
                        i14 = -1;
                        i15 = -1;
                    }
                    if (intValue == 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i17 = i11;
                    int i18 = i14;
                    String str2 = str;
                    AlertDialog$Builder w9 = org.telegram.ui.Components.s4.w(context, i10, i12, i17, i13, i15, i18, L0, z10, new ag.b0(jl0Var, intValue, editTextBoldCursor, 14));
                    if (intValue == 8) {
                        w9.h(dd.L0(2131747481, str2), new qv(26, jl0Var, editTextBoldCursor));
                    }
                    jl0Var.showDialog(w9.f20135a);
                    return true;
                } catch (Exception e7) {
                    e = e7;
                    z11 = true;
                }
            default:
                vh.g1 g1Var = (vh.g1) obj2;
                kt p5 = kt.p();
                mb0 mb0Var = g1Var.f51199b;
                vh.d1 d1Var = g1Var.f51201f;
                vh.u1 u1Var = g1Var.f51203r;
                int i19 = vh.u1.f52000y1;
                return p5.r(motionEvent, mb0Var, (ag.y0) obj, d1Var, u1Var.I0);
        }
    }
}
