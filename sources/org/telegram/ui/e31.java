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
public final class e31 extends pg.b {
    public final SaveToGallerySettingsActivity d;

    public e31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45923f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f33785s.size();
    }

    @Override
    public final int j(int i10) {
        return ((f31) this.d.f33785s.get(i10)).f44299a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.f45920a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f33785s;
        boolean z10 = false;
        if (((f31) arrayList.get(i10)).f44299a == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            q8Var.setNeedDivider(z10);
        } else if (((f31) arrayList.get(i10)).f44299a == 6) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                v8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            v8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            v8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.ij), R.drawable.msg_filled_data_videos);
        } else if (((f31) arrayList.get(i10)).f44299a == 7) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f33781c != null) {
                    d9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f33779a;
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
            d9Var.setText(((f31) arrayList.get(i10)).d);
        } else if (((f31) arrayList.get(i10)).f44299a == 5) {
            ((org.telegram.ui.Cells.l4) view).setText(((f31) arrayList.get(i10)).d);
        } else if (((f31) arrayList.get(i10)).f44299a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((f31) arrayList.get(i10)).f36891c;
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
            if (i10 == arrayList.size() - 1 || ((f31) arrayList.get(i10 + 1)).f44299a == 2) {
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
                q8Var.e(org.telegram.ui.ActionBar.h6.f21326v6, org.telegram.ui.ActionBar.h6.f21309u6);
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                view = q8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                linearLayout = vaVar;
                view = linearLayout;
                break;
            case 3:
                uaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                view = uaVar;
                break;
            case 4:
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                q8Var2.e(-1, org.telegram.ui.ActionBar.h6.f21214p7);
                q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                uaVar = q8Var2;
                view = uaVar;
                break;
            case 5:
                View l4Var = new org.telegram.ui.Cells.l4(viewGroup.getContext());
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                uaVar = l4Var;
                view = uaVar;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                uaVar = v8Var;
                view = uaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.d9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                g31 g31Var = new g31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                g31Var.setTextSize(AndroidUtilities.dp(13.0f));
                g31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(g31Var, w7.z5.e(-2, -2, 83));
                g31 g31Var2 = new g31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                g31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(g31Var2, w7.z5.e(-2, -2, 81));
                g31 g31Var3 = new g31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                g31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                g31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(g31Var3, w7.z5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(dp0Var, w7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                dp0Var.setReportChanges(true);
                dp0Var.setDelegate(new d31(this, dp0Var, g31Var, g31Var2, g31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f7 = a1.g.d((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                dp0Var.setProgress(f7);
                dp0Var.f25602w.L(dp0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar2 = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f33780b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f33780b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f33780b));
                }
                uaVar2.a(chat, null);
                uaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
                uaVar = uaVar2;
                view = uaVar;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20955b7, saveToGallerySettingsActivity.getResourceProvider())));
                uaVar = z6Var;
                view = uaVar;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
