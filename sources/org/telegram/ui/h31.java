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
public final class h31 extends pg.b {
    public final SaveToGallerySettingsActivity d;

    public h31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34085s.size();
    }

    @Override
    public final int j(int i10) {
        return ((i31) this.d.f34085s.get(i10)).f44712a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.f46342a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f34085s;
        boolean z10 = false;
        if (((i31) arrayList.get(i10)).f44712a == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            r8Var.setNeedDivider(z10);
        } else if (((i31) arrayList.get(i10)).f44712a == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            SaveToGallerySettingsHelper.Settings Y = saveToGallerySettingsActivity.Y();
            if (i10 == saveToGallerySettingsActivity.e) {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), Y.savePhoto, true);
                int i12 = org.telegram.ui.ActionBar.k6.lj;
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(i12), R.drawable.msg_filled_data_photos);
                SaveToGallerySettingsActivity.W(saveToGallerySettingsActivity, w8Var, i12);
                return;
            }
            w8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), Y.saveVideo, false);
            int i13 = org.telegram.ui.ActionBar.k6.ij;
            w8Var.c(saveToGallerySettingsActivity.getThemedColor(i13), R.drawable.msg_filled_data_videos);
            SaveToGallerySettingsActivity.W(saveToGallerySettingsActivity, w8Var, i13);
        } else if (((i31) arrayList.get(i10)).f44712a == 7) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.Y().limitVideo;
                if (saveToGallerySettingsActivity.f34081c != null) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i14 = saveToGallerySettingsActivity.f34079a;
                if (i14 == 1) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i14 == 4) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i14 == 2) {
                    e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            e9Var.setText(((i31) arrayList.get(i10)).d);
        } else if (((i31) arrayList.get(i10)).f44712a == 5) {
            ((org.telegram.ui.Cells.l4) view).setText(((i31) arrayList.get(i10)).d);
        } else if (((i31) arrayList.get(i10)).f44712a == 2) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((i31) arrayList.get(i10)).f38136c;
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
            waVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
            CharSequence createDescription = dialogException.createDescription(i11);
            if (i10 == arrayList.size() - 1 || ((i31) arrayList.get(i10 + 1)).f44712a == 2) {
                z10 = true;
            }
            waVar.d(userOrChat, str, createDescription, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.va vaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                r8Var.g(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, r8Var, null);
                view = r8Var;
                break;
            case 2:
                View waVar = new org.telegram.ui.Cells.wa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, waVar, null);
                linearLayout = waVar;
                view = linearLayout;
                break;
            case 3:
                vaVar = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                view = vaVar;
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var2.g(-1, org.telegram.ui.ActionBar.k6.f21405p7);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, r8Var2, null);
                vaVar = r8Var2;
                view = vaVar;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
                vaVar = l4Var;
                view = vaVar;
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(viewGroup.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, w8Var, null);
                vaVar = w8Var;
                view = vaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.e9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                j31 j31Var = new j31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j31Var.setTextSize(AndroidUtilities.dp(13.0f));
                j31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(j31Var, w7.z5.e(-2, -2, 83));
                j31 j31Var2 = new j31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(j31Var2, w7.z5.e(-2, -2, 81));
                j31 j31Var3 = new j31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                j31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(j31Var3, w7.z5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(gp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.Y().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                gp0Var.setReportChanges(true);
                gp0Var.setDelegate(new g31(this, gp0Var, j31Var, j31Var2, j31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.d((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                gp0Var.setProgress(f7);
                gp0Var.f26761x.L(gp0Var.getProgress(), false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, linearLayout2, null);
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.va vaVar2 = new org.telegram.ui.Cells.va(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f34080b)) {
                    i12 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f34080b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f34080b));
                }
                vaVar2.a(chat, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, vaVar2, saveToGallerySettingsActivity.getResourceProvider());
                vaVar = vaVar2;
                view = vaVar;
                break;
            case 10:
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, saveToGallerySettingsActivity.getParentActivity(), b7Var, saveToGallerySettingsActivity.getResourceProvider());
                vaVar = b7Var;
                view = vaVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
