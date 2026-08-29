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
public final class k31 extends zf.b {
    public final SaveToGallerySettingsActivity d;

    public k31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36179s.size();
    }

    @Override
    public final int j(int i10) {
        return ((l31) this.d.f36179s.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        int i11;
        View view = n1Var.f6432a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f36179s;
        boolean z10 = false;
        if (((l31) arrayList.get(i10)).f50845a == 1) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            m8Var.setNeedDivider(z10);
        } else if (((l31) arrayList.get(i10)).f50845a == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.f36175e) {
                q8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                q8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            q8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            q8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
        } else if (((l31) arrayList.get(i10)).f50845a == 7) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f36174c != null) {
                    y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f36172a;
                if (i12 == 1) {
                    y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    y8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            y8Var.setText(((l31) arrayList.get(i10)).d);
        } else if (((l31) arrayList.get(i10)).f50845a == 5) {
            ((org.telegram.ui.Cells.k4) view).setText(((l31) arrayList.get(i10)).d);
        } else if (((l31) arrayList.get(i10)).f50845a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i10)).f40083c;
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
            saVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
            saVar.d(userOrChat, str, dialogException.createDescription(i11), (i10 == arrayList.size() - 1 || ((l31) arrayList.get(i10 + 1)).f50845a == 2) ? true : true);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f9;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.ra raVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                m8Var.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                view = m8Var;
                break;
            case 2:
                View saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                linearLayout = saVar;
                view = linearLayout;
                break;
            case 3:
                raVar = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                view = raVar;
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                m8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                m8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23279p7);
                m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                raVar = m8Var2;
                view = raVar;
                break;
            case 5:
                View k4Var = new org.telegram.ui.Cells.k4(viewGroup.getContext());
                k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                raVar = k4Var;
                view = raVar;
                break;
            case 6:
                View q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                raVar = q8Var;
                view = raVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                m31 m31Var = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(m31Var, i7.f6.e(-2, -2, 83));
                m31 m31Var2 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(m31Var2, i7.f6.e(-2, -2, 81));
                m31 m31Var3 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(m31Var3, i7.f6.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, i7.f6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(ao0Var, i7.f6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                ao0Var.setReportChanges(true);
                ao0Var.setDelegate(new j31(this, ao0Var, m31Var, m31Var2, m31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f9 = u3.c.c((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f9 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                ao0Var.setProgress(f9);
                ao0Var.f26825w.W(ao0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ra raVar2 = new org.telegram.ui.Cells.ra(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f36173b)) {
                    i12 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f36173b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f36173b));
                }
                raVar2.a(chat, null);
                raVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                raVar = raVar2;
                view = raVar;
                break;
            case 10:
                View x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                x6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23028b7, saveToGallerySettingsActivity.getResourceProvider())));
                raVar = x6Var;
                view = raVar;
                break;
        }
        return th.m(view, view, -1, -2);
    }
}
