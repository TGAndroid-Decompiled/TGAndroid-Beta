package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class bz0 implements org.telegram.ui.Components.dj0, org.telegram.ui.Components.fj0, sw {
    public final SaveToGallerySettingsActivity f44165a;

    public bz0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f44165a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(yw ywVar) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44165a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41901s;
        if (i7 == saveToGallerySettingsActivity.f41897e) {
            org.telegram.messenger.rv c02 = saveToGallerySettingsActivity.c0();
            c02.f25345a = !c02.f25345a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f41898f) {
            org.telegram.messenger.rv c03 = saveToGallerySettingsActivity.c0();
            c03.f25346b = !c03.f25346b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((dz0) arrayList.get(i7)).f54544a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f41894a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            yw ywVar = new yw(bundle);
            ywVar.D2 = new bz0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(ywVar);
        } else if (((dz0) arrayList.get(i7)).f54544a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((dz0) arrayList.get(i7)).f45134c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f41894a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((dz0) arrayList.get(i7)).f54544a == 4) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new tu0(saveToGallerySettingsActivity, 11), null).f27296a;
            u1Var.show();
            u1Var.i();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.xr) arrayList.get(0)).f26520a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44165a;
        bundle.putInt("type", saveToGallerySettingsActivity.f41894a);
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
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f44165a;
        ArrayList arrayList = saveToGallerySettingsActivity.f41901s;
        if (((dz0) arrayList.get(i7)).f54544a == 2) {
            org.telegram.messenger.qv qvVar = ((dz0) arrayList.get(i7)).f45134c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232106, org.telegram.messenger.id.M0(2131751280, null), false, null);
            org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232108, org.telegram.messenger.id.M0(2131751542, null), false, null);
            int i10 = org.telegram.ui.ActionBar.l6.f28086p7;
            c11.d(org.telegram.ui.ActionBar.l6.x0(null, i10, false), org.telegram.ui.ActionBar.l6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.v4.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
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
