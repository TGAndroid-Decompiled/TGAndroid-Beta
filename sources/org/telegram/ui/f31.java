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
public final class f31 extends pg.b {
    public final SaveToGallerySettingsActivity d;

    public f31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f33767s.size();
    }

    @Override
    public final int j(int i10) {
        return ((g31) this.d.f33767s.get(i10)).f44314a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.f45938a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f33767s;
        boolean z10 = false;
        if (((g31) arrayList.get(i10)).f44314a == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            q8Var.setNeedDivider(z10);
        } else if (((g31) arrayList.get(i10)).f44314a == 6) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                v8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            v8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.ij), R.drawable.msg_filled_data_videos);
        } else if (((g31) arrayList.get(i10)).f44314a == 7) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f33763c != null) {
                    d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f33761a;
                if (i12 == 1) {
                    d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            d9Var.setText(((g31) arrayList.get(i10)).d);
        } else if (((g31) arrayList.get(i10)).f44314a == 5) {
            ((org.telegram.ui.Cells.l4) view).setText(((g31) arrayList.get(i10)).d);
        } else if (((g31) arrayList.get(i10)).f44314a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((g31) arrayList.get(i10)).f37124c;
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
            vaVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
            CharSequence createDescription = dialogException.createDescription(i11);
            if (i10 == arrayList.size() - 1 || ((g31) arrayList.get(i10 + 1)).f44314a == 2) {
                z10 = true;
            }
            vaVar.e(userOrChat, str, createDescription, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.ua uaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                q8Var.e(org.telegram.ui.ActionBar.h6.f21319v6, org.telegram.ui.ActionBar.h6.f21302u6);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                view = q8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                linearLayout = vaVar;
                view = linearLayout;
                break;
            case 3:
                uaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.t0) null);
                view = uaVar;
                break;
            case 4:
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                q8Var2.e(-1, org.telegram.ui.ActionBar.h6.f21207p7);
                q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                uaVar = q8Var2;
                view = uaVar;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                uaVar = l4Var;
                view = uaVar;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                uaVar = v8Var;
                view = uaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.d9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.cp0 cp0Var = new org.telegram.ui.Components.cp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                h31 h31Var = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var.setTextSize(AndroidUtilities.dp(13.0f));
                h31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(h31Var, w7.z5.e(-2, -2, 83));
                h31 h31Var2 = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(h31Var2, w7.z5.e(-2, -2, 81));
                h31 h31Var3 = new h31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                h31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                h31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(h31Var3, w7.z5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(cp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                cp0Var.setReportChanges(true);
                cp0Var.setDelegate(new e31(this, cp0Var, h31Var, h31Var2, h31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.d((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                cp0Var.setProgress(f7);
                cp0Var.f25340w.L(cp0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar2 = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f33762b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f33762b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f33762b));
                }
                uaVar2.a(chat, null);
                uaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                uaVar = uaVar2;
                view = uaVar;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.t0) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20948b7, saveToGallerySettingsActivity.getResourceProvider())));
                uaVar = z6Var;
                view = uaVar;
                break;
        }
        return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
    }
}
