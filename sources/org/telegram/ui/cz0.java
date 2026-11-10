package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cz0 implements org.telegram.ui.Components.cj0, org.telegram.ui.Components.ej0, tw {
    public final SaveToGallerySettingsActivity f44848a;

    public cz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f44848a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(zw zwVar) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44848a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41892s;
        if (i7 == saveToGallerySettingsActivity.f41888e) {
            org.telegram.messenger.rv c02 = saveToGallerySettingsActivity.c0();
            c02.f25349a = !c02.f25349a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f41889f) {
            org.telegram.messenger.rv c03 = saveToGallerySettingsActivity.c0();
            c03.f25350b = !c03.f25350b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((ez0) arrayList.get(i7)).f54543a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f41885a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            zw zwVar = new zw(bundle);
            zwVar.D2 = new cz0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(zwVar);
        } else if (((ez0) arrayList.get(i7)).f54543a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((ez0) arrayList.get(i7)).f45462c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f41885a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((ez0) arrayList.get(i7)).f54543a == 4) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new uu0(saveToGallerySettingsActivity, 11), null).f27300a;
            u1Var.show();
            u1Var.i();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.xr) arrayList.get(0)).f26524a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44848a;
        bundle.putInt("type", saveToGallerySettingsActivity.f41885a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void q(float f10) {
    }

    @Override
    public void i() {
    }

    @Override
    public boolean mo19f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44848a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41892s;
        if (((ez0) arrayList.get(i7)).f54543a == 2) {
            org.telegram.messenger.qv qvVar = ((ez0) arrayList.get(i7)).f45462c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232106, org.telegram.messenger.id.M0(2131751280, null), false, null);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232108, org.telegram.messenger.id.M0(2131751542, null), false, null);
            int i10 = org.telegram.ui.ActionBar.m6.f28111p7;
            c11.d(org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.u4.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c10.setOnClickListener(new bi.la(saveToGallerySettingsActivity, N, i7, 17));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, N, qvVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
