package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class p41 implements org.telegram.ui.Components.al0, org.telegram.ui.Components.cl0, oy {
    public final SaveToGallerySettingsActivity f39406a;

    public p41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f39406a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean K(uy uyVar) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39406a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34055s;
        if (i10 == saveToGallerySettingsActivity.f34051e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f34052f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((s41) arrayList.get(i10)).f44071a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f34048a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            uy uyVar = new uy(bundle);
            uyVar.C2 = new p41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(uyVar);
        } else if (((s41) arrayList.get(i10)).f44071a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((s41) arrayList.get(i10)).f40300c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f34048a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((s41) arrayList.get(i10)).f44071a == 4) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new f01(saveToGallerySettingsActivity, 9), null).f20198a;
            b2Var.show();
            b2Var.h();
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39406a;
        bundle.putInt("type", saveToGallerySettingsActivity.f34048a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39406a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34055s;
        if (((s41) arrayList.get(i10)).f44071a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((s41) arrayList.get(i10)).f40300c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.j6.f20880p7;
            c11.c(org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity, Q, i10, 14));
            c11.setOnClickListener(new z(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
