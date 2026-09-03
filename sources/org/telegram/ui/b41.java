package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b41 implements org.telegram.ui.Components.il0, org.telegram.ui.Components.kl0, ky {
    public final SaveToGallerySettingsActivity f32731a;

    public b41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f32731a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(qy qyVar) {
        return false;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f32731a;
        ArrayList arrayList = saveToGallerySettingsActivity.f32196s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f32193f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((e41) arrayList.get(i10)).f1830a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f32190a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            qy qyVar = new qy(bundle);
            qyVar.f37649z2 = new b41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(qyVar);
        } else if (((e41) arrayList.get(i10)).f1830a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((e41) arrayList.get(i10)).f33608c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f32190a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((e41) arrayList.get(i10)).f1830a == 4) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new sz0(saveToGallerySettingsActivity, 9), null).f19478a;
            d2Var.show();
            d2Var.h();
        }
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f32731a;
        bundle.putInt("type", saveToGallerySettingsActivity.f32190a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f32731a;
        ArrayList arrayList = saveToGallerySettingsActivity.f32196s;
        if (((e41) arrayList.get(i10)).f1830a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((e41) arrayList.get(i10)).f33608c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.j6.f20097p7;
            c10.c(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            org.telegram.ui.ActionBar.p1 Q = org.telegram.ui.Components.z4.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f10, f11);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c3.setOnClickListener(new dg.m2(saveToGallerySettingsActivity, Q, i10, 18));
            c10.setOnClickListener(new c0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
