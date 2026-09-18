package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q41 extends og.b {
    public final SaveToGallerySettingsActivity d;

    public q41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42705f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31451s.size();
    }

    @Override
    public final int j(int i10) {
        return ((r41) this.d.f31451s.get(i10)).f15543a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11;
        View view = c1Var.f42702a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f31451s;
        boolean z10 = false;
        if (((r41) arrayList.get(i10)).f15543a == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            r8Var.setNeedDivider(z10);
        } else if (((r41) arrayList.get(i10)).f15543a == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            w8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.ij), R.drawable.msg_filled_data_videos);
        } else if (((r41) arrayList.get(i10)).f15543a == 7) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f31447c != null) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f31445a;
                if (i12 == 1) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            e9Var.setText(((r41) arrayList.get(i10)).d);
        } else if (((r41) arrayList.get(i10)).f15543a == 5) {
            ((org.telegram.ui.Cells.l4) view).setText(((r41) arrayList.get(i10)).d);
        } else if (((r41) arrayList.get(i10)).f15543a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((r41) arrayList.get(i10)).f37083c;
            TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                if (user.self) {
                    str = LocaleController.getString(R.string.SavedMessages);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
            } else if (userOrChat instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) userOrChat).title;
            } else {
                str = null;
            }
            abVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
            abVar.d(userOrChat, str, dialogException.createDescription(i11), (i10 == arrayList.size() - 1 || ((r41) arrayList.get(i10 + 1)).f15543a == 2) ? true : true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.za zaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                r8Var.e(org.telegram.ui.ActionBar.j6.f19193v6, org.telegram.ui.ActionBar.j6.f19175u6);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                view = r8Var;
                break;
            case 2:
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                abVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                linearLayout = abVar;
                view = linearLayout;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.p6) null);
                view = zaVar;
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var2.e(-1, org.telegram.ui.ActionBar.j6.f19083p7);
                r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                zaVar = r8Var2;
                view = zaVar;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                zaVar = l4Var;
                view = zaVar;
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(viewGroup.getContext());
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                zaVar = w8Var;
                view = zaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.e9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.go0 go0Var = new org.telegram.ui.Components.go0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                s41 s41Var = new s41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                s41Var.setTextSize(AndroidUtilities.dp(13.0f));
                s41Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(s41Var, w7.x5.e(-2, -2, 83));
                s41 s41Var2 = new s41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                s41Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(s41Var2, w7.x5.e(-2, -2, 81));
                s41 s41Var3 = new s41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                s41Var3.setTextSize(AndroidUtilities.dp(13.0f));
                s41Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(s41Var3, w7.x5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.x5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(go0Var, w7.x5.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                go0Var.setReportChanges(true);
                go0Var.setDelegate(new p41(this, go0Var, s41Var, s41Var2, s41Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f7 = a4.a.e((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                go0Var.setProgress(f7);
                go0Var.f24376w.X(go0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f31446b)) {
                    i12 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f31446b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f31446b));
                }
                zaVar2.a(chat, null);
                zaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
                zaVar = zaVar2;
                view = zaVar;
                break;
            case 10:
                View a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.p6) null);
                a7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18827b7, saveToGallerySettingsActivity.getResourceProvider())));
                zaVar = a7Var;
                view = zaVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
