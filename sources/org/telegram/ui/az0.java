package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class az0 implements org.telegram.ui.Components.rj0, org.telegram.ui.Components.tj0, ww {
    public final SaveToGallerySettingsActivity f45739a;

    public az0(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f45739a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f45739a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43756s;
        if (i7 == saveToGallerySettingsActivity.f43752e) {
            org.telegram.messenger.mv c02 = saveToGallerySettingsActivity.c0();
            c02.f25646a = !c02.f25646a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i7 == saveToGallerySettingsActivity.f43753f) {
            org.telegram.messenger.mv c03 = saveToGallerySettingsActivity.c0();
            c03.f25647b = !c03.f25647b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((cz0) arrayList.get(i7)).f56634a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = saveToGallerySettingsActivity.f43749a;
            if (i10 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            cx cxVar = new cx(bundle);
            cxVar.E2 = new az0(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(cxVar);
        } else if (((cz0) arrayList.get(i7)).f56634a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((cz0) arrayList.get(i7)).f46841c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.f43749a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((cz0) arrayList.get(i7)).f56634a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(saveToGallerySettingsActivity.getParentActivity(), org.telegram.messenger.hd.N0(2131747719, null), org.telegram.messenger.hd.N0(2131747720, null), org.telegram.messenger.hd.N0(2131751586, null), new ru0(saveToGallerySettingsActivity, 11), null).f28777a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((org.telegram.messenger.tr) arrayList.get(0)).f27073a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f45739a;
        bundle.putInt("type", saveToGallerySettingsActivity.f43749a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f45739a;
        ArrayList arrayList = saveToGallerySettingsActivity.f43756s;
        if (((cz0) arrayList.get(i7)).f56634a == 2) {
            org.telegram.messenger.lv lvVar = ((cz0) arrayList.get(i7)).f46841c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232108, org.telegram.messenger.hd.N0(2131751268, null), false, null);
            org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232110, org.telegram.messenger.hd.N0(2131751530, null), false, null);
            int i10 = org.telegram.ui.ActionBar.m6.f29602p7;
            c11.d(org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            org.telegram.ui.ActionBar.g1 N = org.telegram.ui.Components.c5.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c10.setOnClickListener(new bi.h5(saveToGallerySettingsActivity, N, i7, 20));
            c11.setOnClickListener(new y(saveToGallerySettingsActivity, N, lvVar, 15));
            return true;
        }
        return false;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
