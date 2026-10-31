package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m01 implements org.telegram.ui.Components.hk0, org.telegram.ui.Components.jk0, ux {
    public final SaveToGallerySettingsActivity f39448a;

    public m01(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f39448a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39448a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33973s;
        if (i10 == saveToGallerySettingsActivity.e) {
            org.telegram.messenger.cw b02 = saveToGallerySettingsActivity.b0();
            b02.f15091a = !b02.f15091a;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (i10 == saveToGallerySettingsActivity.f33970f) {
            org.telegram.messenger.cw b03 = saveToGallerySettingsActivity.b0();
            b03.f15092b = !b03.f15092b;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (((o01) arrayList.get(i10)).f7680a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f33967a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ay ayVar = new ay(bundle);
            ayVar.C2 = new m01(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(ayVar);
        } else if (((o01) arrayList.get(i10)).f7680a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((o01) arrayList.get(i10)).f40090c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f33967a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((o01) arrayList.get(i10)).f7680a == 4) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131747929, null), org.telegram.messenger.cd.L0(2131747930, null), org.telegram.messenger.cd.L0(2131751599, null), new wv0(saveToGallerySettingsActivity, 13), null).f20134a;
            x1Var.show();
            x1Var.i();
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.gs) arrayList.get(0)).f15760a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39448a;
        bundle.putInt("type", saveToGallerySettingsActivity.f33967a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void g() {
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39448a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33973s;
        if (((o01) arrayList.get(i10)).f7680a == 2) {
            org.telegram.messenger.bw bwVar = ((o01) arrayList.get(i10)).f40090c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232105, org.telegram.messenger.cd.L0(2131751281, null), false, null);
            org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232107, org.telegram.messenger.cd.L0(2131751543, null), false, null);
            int i11 = org.telegram.ui.ActionBar.t6.f21153p7;
            c11.d(org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new jg.w1(saveToGallerySettingsActivity, P, i10, 17));
            c11.setOnClickListener(new x(saveToGallerySettingsActivity, P, bwVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
