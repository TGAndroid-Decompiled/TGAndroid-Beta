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
public final class j31 extends qg.b {
    public final SaveToGallerySettingsActivity d;

    public j31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36146s.size();
    }

    @Override
    public final int j(int i10) {
        return ((k31) this.d.f36146s.get(i10)).f47037a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        int i11;
        View view = e1Var.f47735a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f36146s;
        boolean z10 = false;
        if (((k31) arrayList.get(i10)).f47037a == 1) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            v8Var.setNeedDivider(z10);
        } else if (((k31) arrayList.get(i10)).f47037a == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            SaveToGallerySettingsHelper.Settings Z = saveToGallerySettingsActivity.Z();
            if (i10 == saveToGallerySettingsActivity.e) {
                a9Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), Z.savePhoto, true);
                int i12 = org.telegram.ui.ActionBar.y6.lj;
                a9Var.c(saveToGallerySettingsActivity.getThemedColor(i12), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.X(saveToGallerySettingsActivity, a9Var, i12);
                return;
            }
            a9Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), Z.saveVideo, false);
            int i13 = org.telegram.ui.ActionBar.y6.ij;
            a9Var.c(saveToGallerySettingsActivity.getThemedColor(i13), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.X(saveToGallerySettingsActivity, a9Var, i13);
        } else if (((k31) arrayList.get(i10)).f47037a == 7) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.Z().limitVideo;
                if (saveToGallerySettingsActivity.f36142c != null) {
                    i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i14 = saveToGallerySettingsActivity.f36140a;
                if (i14 == 1) {
                    i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i14 == 4) {
                    i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i14 == 2) {
                    i9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            i9Var.setText(((k31) arrayList.get(i10)).d);
        } else if (((k31) arrayList.get(i10)).f47037a == 5) {
            ((org.telegram.ui.Cells.q4) view).setText(((k31) arrayList.get(i10)).d);
        } else if (((k31) arrayList.get(i10)).f47037a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((k31) arrayList.get(i10)).f40792c;
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
            i11 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
            CharSequence createDescription = dialogException.createDescription(i11);
            if (i10 == arrayList.size() - 1 || ((k31) arrayList.get(i10 + 1)).f47037a == 2) {
                z10 = true;
            }
            abVar.d(userOrChat, str, createDescription, z10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
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
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                v8Var.g(org.telegram.ui.ActionBar.y6.f23690v6, org.telegram.ui.ActionBar.y6.f23671u6);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, v8Var, null);
                view = v8Var;
                break;
            case 2:
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, abVar, null);
                linearLayout = abVar;
                view = linearLayout;
                break;
            case 3:
                zaVar = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                view = zaVar;
                break;
            case 4:
                org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                v8Var2.g(-1, org.telegram.ui.ActionBar.y6.f23579p7);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, v8Var2, null);
                zaVar = v8Var2;
                view = zaVar;
                break;
            case 5:
                View q4Var = new org.telegram.ui.Cells.q4(viewGroup.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, q4Var, null);
                zaVar = q4Var;
                view = zaVar;
                break;
            case 6:
                View a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, a9Var, null);
                zaVar = a9Var;
                view = zaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.i9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                l31 l31Var = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(l31Var, org.telegram.ui.Components.gb1.i(-2, -2, 83));
                l31 l31Var2 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(l31Var2, org.telegram.ui.Components.gb1.i(-2, -2, 81));
                l31 l31Var3 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(l31Var3, org.telegram.ui.Components.gb1.i(-2, -2, 85));
                linearLayout2.addView(frameLayout, org.telegram.ui.Components.gb1.x(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(lp0Var, org.telegram.ui.Components.gb1.x(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.Z().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                lp0Var.setReportChanges(true);
                lp0Var.setDelegate(new i31(this, lp0Var, l31Var, l31Var2, l31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.c((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                lp0Var.setProgress(f7);
                lp0Var.f30259x.U(lp0Var.getProgress(), false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.za zaVar2 = new org.telegram.ui.Cells.za(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f36141b)) {
                    i12 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f36141b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f36141b));
                }
                zaVar2.a(chat, null);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, zaVar2, saveToGallerySettingsActivity.getResourceProvider());
                zaVar = zaVar2;
                view = zaVar;
                break;
            case 10:
                zaVar = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                view = zaVar;
                break;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
