package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i31 implements org.telegram.ui.Components.al0, org.telegram.ui.Components.cl0, yx {
    public final SaveToGallerySettingsActivity f39116a;

    public i31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f39116a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39116a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36179s;
        if (i10 == saveToGallerySettingsActivity.f36175e) {
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            X.savePhoto = !X.savePhoto;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (i10 == saveToGallerySettingsActivity.f36176f) {
            SaveToGallerySettingsHelper.Settings X2 = saveToGallerySettingsActivity.X();
            X2.saveVideo = !X2.saveVideo;
            saveToGallerySettingsActivity.Y();
            saveToGallerySettingsActivity.Z();
        } else if (((l31) arrayList.get(i10)).f50845a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f36172a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            fy fyVar = new fy(bundle);
            fyVar.f38379y2 = new i31(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(fyVar);
        } else if (((l31) arrayList.get(i10)).f50845a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((l31) arrayList.get(i10)).f40083c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f36172a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((l31) arrayList.get(i10)).f50845a == 4) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(saveToGallerySettingsActivity, 11), null).f22714a;
            c2Var.show();
            c2Var.h();
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39116a;
        bundle.putInt("type", saveToGallerySettingsActivity.f36172a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void h() {
    }

    @Override
    public void r(float f9) {
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f39116a;
        ArrayList arrayList = saveToGallerySettingsActivity.f36179s;
        if (((l31) arrayList.get(i10)).f50845a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i10)).f40083c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.g6.f23279p7;
            c6.c(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            org.telegram.ui.ActionBar.o1 Q = org.telegram.ui.Components.c5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f9, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c3.setOnClickListener(new bg.p2(saveToGallerySettingsActivity, Q, i10, 18));
            c6.setOnClickListener(new c0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
