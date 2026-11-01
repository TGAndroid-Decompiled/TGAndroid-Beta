package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m01 implements org.telegram.ui.Components.ik0, org.telegram.ui.Components.kk0, tx {
    public final SaveToGallerySettingsActivity f39409a;

    public m01(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f39409a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39409a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33980s;
        if (i10 == saveToGallerySettingsActivity.e) {
            org.telegram.messenger.dw c02 = saveToGallerySettingsActivity.c0();
            c02.f15447a = !c02.f15447a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i10 == saveToGallerySettingsActivity.f33977f) {
            org.telegram.messenger.dw c03 = saveToGallerySettingsActivity.c0();
            c03.f15448b = !c03.f15448b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((o01) arrayList.get(i10)).f7681a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f33974a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            zx zxVar = new zx(bundle);
            zxVar.C2 = new m01(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(zxVar);
        } else if (((o01) arrayList.get(i10)).f7681a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((o01) arrayList.get(i10)).f40002c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f33974a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((o01) arrayList.get(i10)).f7681a == 4) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.dd.L0(2131747929, null), org.telegram.messenger.dd.L0(2131747930, null), org.telegram.messenger.dd.L0(2131751599, null), new vv0(saveToGallerySettingsActivity, 13), null).f20135a;
            x1Var.show();
            x1Var.i();
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.hs) arrayList.get(0)).f16109a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39409a;
        bundle.putInt("type", saveToGallerySettingsActivity.f33974a);
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
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39409a;
        ArrayList arrayList = saveToGallerySettingsActivity.f33980s;
        if (((o01) arrayList.get(i10)).f7681a == 2) {
            org.telegram.messenger.cw cwVar = ((o01) arrayList.get(i10)).f40002c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232105, org.telegram.messenger.dd.L0(2131751281, null), false, null);
            org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232107, org.telegram.messenger.dd.L0(2131751543, null), false, null);
            int i11 = org.telegram.ui.ActionBar.t6.f21154p7;
            c11.d(org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            org.telegram.ui.ActionBar.k1 P = org.telegram.ui.Components.s4.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c10.setOnClickListener(new jg.w1(saveToGallerySettingsActivity, P, i10, 17));
            c11.setOnClickListener(new x(saveToGallerySettingsActivity, P, cwVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
