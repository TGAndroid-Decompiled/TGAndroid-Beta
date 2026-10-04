package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class i41 implements org.telegram.ui.Components.nl0, org.telegram.ui.Components.pl0, oy {
    public final SaveToGallerySettingsActivity f37286a;

    public i41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.f37286a = saveToGallerySettingsActivity;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37286a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34407s;
        if (i10 == saveToGallerySettingsActivity.f34403e) {
            SaveToGallerySettingsHelper.Settings W = saveToGallerySettingsActivity.W();
            W.savePhoto = !W.savePhoto;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
        } else if (i10 == saveToGallerySettingsActivity.f34404f) {
            SaveToGallerySettingsHelper.Settings W2 = saveToGallerySettingsActivity.W();
            W2.saveVideo = !W2.saveVideo;
            saveToGallerySettingsActivity.X();
            saveToGallerySettingsActivity.Y();
        } else if (((l41) arrayList.get(i10)).f17187a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = saveToGallerySettingsActivity.f34400a;
            if (i11 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            uy uyVar = new uy(bundle);
            uyVar.C2 = new i41(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(uyVar);
        } else if (((l41) arrayList.get(i10)).f17187a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((l41) arrayList.get(i10)).f38163c.dialogId);
            bundle2.putInt("type", saveToGallerySettingsActivity.f34400a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((l41) arrayList.get(i10)).f17187a == 4) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(saveToGallerySettingsActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new hz0(saveToGallerySettingsActivity, 10), null).f20372a;
            b2Var.show();
            b2Var.h();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, yf1 yf1Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37286a;
        bundle.putInt("type", saveToGallerySettingsActivity.f34400a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public void i() {
    }

    @Override
    public void q(float f7) {
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.f37286a;
        ArrayList arrayList = saveToGallerySettingsActivity.f34407s;
        if (((l41) arrayList.get(i10)).f17187a == 2) {
            SaveToGallerySettingsHelper.DialogException dialogException = ((l41) arrayList.get(i10)).f38163c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, LocaleController.getString(R.string.EditException), false, null);
            org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_delete, LocaleController.getString(R.string.DeleteException), false, null);
            int i11 = org.telegram.ui.ActionBar.i6.f21044p7;
            c11.c(org.telegram.ui.ActionBar.i6.w0(null, i11, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            org.telegram.ui.ActionBar.n1 Q = org.telegram.ui.Components.e5.Q(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f7, f10);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(Q);
            c10.setOnClickListener(new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity, Q, i10, 14));
            c11.setOnClickListener(new a0(saveToGallerySettingsActivity, Q, dialogException, 15));
            return true;
        }
        return false;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
