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

public final class j31 extends xf.b {
    public final SaveToGallerySettingsActivity d;

    public j31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override
    public final int h() {
        return this.d.f36117s.size();
    }

    @Override
    public final int j(int i10) {
        return ((k31) this.d.f36117s.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        View view = o1Var.f5789a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f36117s;
        if (((k31) arrayList.get(i10)).f49413a == 1) {
            ((org.telegram.ui.Cells.l8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((k31) arrayList.get(i10)).f49413a == 6) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            SaveToGallerySettingsHelper.Settings settingsX = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.f36113e) {
                p8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), settingsX.savePhoto, true);
                p8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                p8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), settingsX.saveVideo, false);
                p8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((k31) arrayList.get(i10)).f49413a != 7) {
            if (((k31) arrayList.get(i10)).f49413a == 5) {
                ((org.telegram.ui.Cells.j4) view).setText(((k31) arrayList.get(i10)).d);
                return;
            }
            if (((k31) arrayList.get(i10)).f49413a == 2) {
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((k31) arrayList.get(i10)).f39588c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    string = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    string = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                saVar.setSelfAsSavedMessages(true);
                saVar.e(userOrChat, string, dialogException.createDescription(((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount), i10 == arrayList.size() - 1 || ((k31) arrayList.get(i10 + 1)).f49413a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            x8Var.setText(((k31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.f36112c != null) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i11 = saveToGallerySettingsActivity.f36110a;
        if (i11 == 1) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i11 == 4) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i11 == 2) {
            x8Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ?? r11;
        Object w6Var;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ?? x8Var = 0;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                l8Var.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                x8Var = l8Var;
                break;
            case 2:
                org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(4, 0, viewGroup.getContext(), null, false, false);
                saVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                r11 = saVar;
                x8Var = r11;
                break;
            case 3:
                w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                x8Var = w6Var;
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                l8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = l8Var2;
                x8Var = w6Var;
                break;
            case 5:
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(viewGroup.getContext());
                j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = j4Var;
                x8Var = w6Var;
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = p8Var;
                x8Var = w6Var;
                break;
            case 7:
                x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext());
                break;
            case 8:
                ?? linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.qn0 qn0Var = new org.telegram.ui.Components.qn0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                l31 l31Var = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(l31Var, h7.z5.e(-2, -2, 83));
                l31 l31Var2 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(l31Var2, h7.z5.e(-2, -2, 81));
                l31 l31Var3 = new l31(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                l31Var3.setTextSize(AndroidUtilities.dp(13.0f));
                l31Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(l31Var3, h7.z5.e(-2, -2, 85));
                linearLayout.addView(frameLayout, h7.z5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(qn0Var, h7.z5.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                qn0Var.setReportChanges(true);
                qn0Var.setDelegate(new i31(this, qn0Var, l31Var, l31Var2, l31Var3));
                qn0Var.setProgress(((float) j10) > ((float) 104857600) * 0.7f ? s3.c.c(j10 - 104857600, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                qn0Var.f31945w.P(qn0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                r11 = linearLayout;
                x8Var = r11;
                break;
            case 9:
                org.telegram.ui.Cells.ra raVar = new org.telegram.ui.Cells.ra(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                raVar.a(DialogObject.isUserDialog(saveToGallerySettingsActivity.f36111b) ? MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount).getUser(Long.valueOf(saveToGallerySettingsActivity.f36111b)) : MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount).getChat(Long.valueOf(-saveToGallerySettingsActivity.f36111b)), null);
                raVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                w6Var = raVar;
                x8Var = w6Var;
                break;
            case 10:
                org.telegram.ui.Cells.w6 w6Var2 = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                w6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23018b7, saveToGallerySettingsActivity.getResourceProvider())));
                w6Var = w6Var2;
                x8Var = w6Var;
                break;
        }
        return org.telegram.ui.Cells.pa.l(x8Var, x8Var, -1, -2);
    }
}
