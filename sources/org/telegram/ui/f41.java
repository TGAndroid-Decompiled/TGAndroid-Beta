package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f41 implements org.telegram.ui.Components.bl0, org.telegram.ui.Components.dl0, ly {
    public final SaveToGallerySettingsActivity f33090a;

    public f41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f33090a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(ry ryVar) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f33090a;
        ArrayList arrayList = saveToGallerySettingsActivity.f31405s;
        if (i10 == saveToGallerySettingsActivity.e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f31402f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((i41) arrayList.get(i10)).f15508a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f31399a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ry ryVar = new ry(bundle);
            ryVar.C2 = new f41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(ryVar);
        } else if (((i41) arrayList.get(i10)).f15508a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((i41) arrayList.get(i10)).f34027c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f31399a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((i41) arrayList.get(i10)).f15508a == 4) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new xz0(saveToGallerySettingsActivity, 9), null).f18409a;
            b2Var.show();
            b2Var.h();
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public boolean u(ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f33090a;
        bundle.putInt("type", saveToGallerySettingsActivity.f31399a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f33090a;
        ArrayList arrayList = saveToGallerySettingsActivity.f31405s;
        if (((i41) arrayList.get(i10)).f15508a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((i41) arrayList.get(i10)).f34027c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.h6.f19008p7;
            c11.c(org.telegram.ui.ActionBar.h6.w0(null, i11, false), org.telegram.ui.ActionBar.h6.w0(null, i11, false));
            org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new org.telegram.ui.Cells.wa(saveToGallerySettingsActivity, Q, i10, 14));
            c11.setOnClickListener(new a0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
