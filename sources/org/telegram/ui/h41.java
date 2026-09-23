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
public final class h41 extends og.b {
    public final SaveToGallerySettingsActivity d;

    public h41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31405s.size();
    }

    @Override
    public final int j(int i10) {
        return ((i41) this.d.f31405s.get(i10)).f15508a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        int i11;
        View view = c1Var.f42627a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.f31405s;
        boolean z10 = false;
        if (((i41) arrayList.get(i10)).f15508a == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (saveToGallerySettingsActivity.v.size() > 0) {
                z10 = true;
            }
            s8Var.setNeedDivider(z10);
        } else if (((i41) arrayList.get(i10)).f15508a == 6) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                x8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                x8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.lj), R.drawable.msg_filled_data_photos);
                return;
            }
            x8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
            x8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.ij), R.drawable.msg_filled_data_videos);
        } else if (((i41) arrayList.get(i10)).f15508a == 7) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == saveToGallerySettingsActivity.h) {
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (saveToGallerySettingsActivity.f31401c != null) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
                    return;
                }
                int i12 = saveToGallerySettingsActivity.f31399a;
                if (i12 == 1) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
                    return;
                } else if (i12 == 4) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
                    return;
                } else if (i12 == 2) {
                    f9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
                    return;
                } else {
                    return;
                }
            }
            f9Var.setText(((i41) arrayList.get(i10)).d);
        } else if (((i41) arrayList.get(i10)).f15508a == 5) {
            ((org.telegram.ui.Cells.m4) view).setText(((i41) arrayList.get(i10)).d);
        } else if (((i41) arrayList.get(i10)).f15508a == 2) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            SaveToGallerySettingsHelper.DialogException dialogException = ((i41) arrayList.get(i10)).f34027c;
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
            bbVar.setSelfAsSavedMessages(true);
            i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
            bbVar.d(userOrChat, str, dialogException.createDescription(i11), (i10 == arrayList.size() - 1 || ((i41) arrayList.get(i10 + 1)).f15508a == 2) ? true : true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout;
        float f7;
        int i11;
        TLObject chat;
        int i12;
        org.telegram.ui.Cells.ab abVar;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                s8Var.e(org.telegram.ui.ActionBar.h6.f19118v6, org.telegram.ui.ActionBar.h6.f19100u6);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                view = s8Var;
                break;
            case 2:
                View bbVar = new org.telegram.ui.Cells.bb(4, 0, viewGroup.getContext(), null, false, false);
                bbVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                linearLayout = bbVar;
                view = linearLayout;
                break;
            case 3:
                abVar = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
                view = abVar;
                break;
            case 4:
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                s8Var2.e(-1, org.telegram.ui.ActionBar.h6.f19008p7);
                s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                abVar = s8Var2;
                view = abVar;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                abVar = m4Var;
                view = abVar;
                break;
            case 6:
                View x8Var = new org.telegram.ui.Cells.x8(viewGroup.getContext());
                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                abVar = x8Var;
                view = abVar;
                break;
            case 7:
                view = new org.telegram.ui.Cells.f9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout2.setOrientation(1);
                org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                j41 j41Var = new j41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j41Var.setTextSize(AndroidUtilities.dp(13.0f));
                j41Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(j41Var, w7.x5.e(-2, -2, 83));
                j41 j41Var2 = new j41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j41Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(j41Var2, w7.x5.e(-2, -2, 81));
                j41 j41Var3 = new j41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                j41Var3.setTextSize(AndroidUtilities.dp(13.0f));
                j41Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(j41Var3, w7.x5.e(-2, -2, 85));
                linearLayout2.addView(frameLayout, w7.x5.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout2.addView(fo0Var, w7.x5.t(-1, 38, 0, 5, 0, 5, 4));
                long j3 = saveToGallerySettingsActivity.X().limitVideo;
                if (j3 < 0 || j3 > 4194304000L) {
                    j3 = 4194304000L;
                }
                fo0Var.setReportChanges(true);
                fo0Var.setDelegate(new g41(this, fo0Var, j41Var, j41Var2, j41Var3));
                if (((float) j3) > ((float) 104857600) * 0.7f) {
                    f7 = a4.a.e((float) (j3 - 104857600), (float) 4089446400L, 0.3f, 0.7f);
                } else {
                    f7 = (((float) (j3 - 524288)) / ((float) 104333312)) * 0.7f;
                }
                fo0Var.setProgress(f7);
                fo0Var.f24064w.X(fo0Var.getProgress(), false);
                linearLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                linearLayout = linearLayout2;
                view = linearLayout;
                break;
            case 9:
                org.telegram.ui.Cells.ab abVar2 = new org.telegram.ui.Cells.ab(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.f31400b)) {
                    i12 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.f31400b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.f31400b));
                }
                abVar2.a(chat, null);
                abVar2.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                abVar = abVar2;
                view = abVar;
                break;
            case 10:
                View a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
                a7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18753b7, saveToGallerySettingsActivity.getResourceProvider())));
                abVar = a7Var;
                view = abVar;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
