package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oy0 implements org.telegram.ui.Components.gj0, org.telegram.ui.Components.ij0, nw {
    public final SaveToGallerySettingsActivity f48382a;

    public oy0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f48382a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f48382a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41922s;
        if (i3 == saveToGallerySettingsActivity.f41918e) {
            org.telegram.messenger.jv c02 = saveToGallerySettingsActivity.c0();
            c02.f23727a = !c02.f23727a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i3 == saveToGallerySettingsActivity.f41919f) {
            org.telegram.messenger.jv c03 = saveToGallerySettingsActivity.c0();
            c03.f23728b = !c03.f23728b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((qy0) arrayList.get(i3)).f54715a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f41915a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            uw uwVar = new uw(bundle);
            uwVar.D2 = new oy0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(uwVar);
        } else if (((qy0) arrayList.get(i3)).f54715a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((qy0) arrayList.get(i3)).f48971c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f41915a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((qy0) arrayList.get(i3)).f54715a == 4) {
            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131747921, null), org.telegram.messenger.bd.M0(2131747922, null), org.telegram.messenger.bd.M0(2131751599, null), new pu0(saveToGallerySettingsActivity, 10), null).f27343a;
            s1Var.show();
            s1Var.i();
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.pr) arrayList.get(0)).f24797a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f48382a;
        bundle.putInt("type", saveToGallerySettingsActivity.f41915a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean mo20b(float f10, float f11, int i3, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f48382a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41922s;
        if (((qy0) arrayList.get(i3)).f54715a == 2) {
            org.telegram.messenger.iv ivVar = ((qy0) arrayList.get(i3)).f48971c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232106, org.telegram.messenger.bd.M0(2131751281, null), false, null);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232108, org.telegram.messenger.bd.M0(2131751543, null), false, null);
            int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
            c10.d(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            org.telegram.ui.ActionBar.f1 P = org.telegram.ui.Components.t4.P(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(P);
            c2.setOnClickListener(new ai.h3(saveToGallerySettingsActivity, P, i3, 19));
            c10.setOnClickListener(new a0(saveToGallerySettingsActivity, P, ivVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
