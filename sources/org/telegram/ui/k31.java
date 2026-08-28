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
public final class k31 extends wf.b {
    public final SaveToGallerySettingsActivity d;

    public k31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 2 || i9 == 4 || i9 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36114s.size();
    }

    @Override
    public final int j(int i9) {
        return ((l31) this.d.f36114s.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        int i10;
        View view = q1Var.f5501a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f36114s;
        boolean z10 = false;
        if (((l31) arrayList.get(i9)).f48814a == 1) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            p8Var.setNeedDivider(z10);
        } else if (((l31) arrayList.get(i9)).f48814a == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            SaveToGallerySettingsHelper.Settings W = saveToGallerySettingsActivity.W();
            if (i9 == saveToGallerySettingsActivity.f36110e) {
                t8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), W.savePhoto, true);
                t8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            t8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), W.saveVideo, false);
            t8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.ij), R.drawable.msg_filled_data_videos);
        } else if (((l31) arrayList.get(i9)).f48814a == 7) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == saveToGallerySettingsActivity.h) {
                long j10 = saveToGallerySettingsActivity.W().limitVideo;
                if (saveToGallerySettingsActivity.f36109c != null) {
                    b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i11 = saveToGallerySettingsActivity.f36107a;
                if (i11 == 1) {
                    b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i11 == 4) {
                    b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i11 == 2) {
                    b9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            b9Var.setText(((l31) arrayList.get(i9)).d);
        } else if (((l31) arrayList.get(i9)).f48814a == 5) {
            ((org.telegram.ui.Cells.m4) view).setText(((l31) arrayList.get(i9)).d);
        } else if (((l31) arrayList.get(i9)).f48814a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((l31) arrayList.get(i9)).f39987c;
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
            i10 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
            vaVar.e(userOrChat, str, dialogException.createDescription(i10), (i9 == arrayList.size() - 1 || ((l31) arrayList.get(i9 + 1)).f48814a == 2) ? true : true);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        LinearLayout linearLayout;
        float f10;
        int i10;
        TLObject chat;
        int i11;
        org.telegram.ui.Cells.ua uaVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i9) {
            case 1:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                p8Var.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                view = p8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                linearLayout = vaVar;
                view = linearLayout;
                break;
            case 3:
                uaVar = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                view = uaVar;
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                p8Var2.e(-1, org.telegram.ui.ActionBar.f6.f23212p7);
                p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                uaVar = p8Var2;
                view = uaVar;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                uaVar = m4Var;
                view = uaVar;
                break;
            case 6:
                View t8Var = new org.telegram.ui.Cells.t8(viewGroup.getContext());
                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                uaVar = t8Var;
                view = uaVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.b9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                m31 m31Var = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(m31Var, g7.e6.e(-2, -2, 83));
                m31 m31Var2 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(m31Var2, g7.e6.e(-2, -2, 81));
                m31 m31Var3 = new m31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                m31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                m31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(m31Var3, g7.e6.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, g7.e6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(pn0Var, g7.e6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.W().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                pn0Var.setReportChanges(true);
                pn0Var.setDelegate(new j31(this, pn0Var, m31Var, m31Var2, m31Var3));
                if (((float) j10) > ((float) 104857600) * 0.7f) {
                    f10 = org.telegram.ui.Cells.j2.b((float) (j10 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f10 = (((float) (j10 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                pn0Var.setProgress(f10);
                pn0Var.f31711w.Q(pn0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar2 = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f36108b)) {
                    i11 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getUser(Long.valueOf(saveToGallerySettingsActivity.f36108b));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-saveToGallerySettingsActivity.f36108b));
                }
                uaVar2.a(chat, null);
                uaVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                uaVar = uaVar2;
                view = uaVar;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22966b7, saveToGallerySettingsActivity.getResourceProvider())));
                uaVar = z6Var;
                view = uaVar;
                break;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
