package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class m00 extends rl0 {
    public final Context f26903c;
    public final n00 d;

    public m00(n00 n00Var, Activity activity) {
        this.d = n00Var;
        this.f26903c = activity;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.f27153s.size();
        if (size < 10) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) l1Var.f5785a;
        n00 n00Var = this.d;
        ArrayList arrayList = n00Var.v;
        ArrayList arrayList2 = n00Var.f27153s;
        if (i10 < arrayList2.size()) {
            z2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J5, false), PorterDuff.Mode.MULTIPLY));
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
            z2Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
            int i12 = dialogFilter.flags;
            if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
                i11 = R.drawable.msg_openprofile;
            } else {
                if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i12) != 0) {
                    int i13 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                    if ((i12 & i13) == i13) {
                        i11 = R.drawable.msg_markunread;
                    }
                }
                if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                    i11 = R.drawable.msg_channel;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                    i11 = R.drawable.msg_groups;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                    i11 = R.drawable.msg_contacts;
                } else if ((i12 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                    i11 = R.drawable.msg_bots;
                } else {
                    i11 = R.drawable.msg_folders;
                }
            }
            z2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, z2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, z2Var.getTextView().getPaint().getFontMetricsInt()), 0, new d10(n00Var.getContext(), i11, dialogFilter.color), false);
            z2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, n00.A(n00Var)));
            boolean z4 = true;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(n00.C(n00Var)), ((Long) arrayList.get(i14)).longValue())) {
                    z4 = false;
                }
            }
            z2Var.setChecked(z4);
            return;
        }
        z2Var.getImageView().setColorFilter((ColorFilter) null);
        Context context = this.f26903c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20032k7, false), mode));
        nq nqVar = new nq(drawable, drawable2);
        z2Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false));
        z2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, nqVar, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(this.f26903c, 0, null);
        z2Var.setBackground(null);
        z2Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(z2Var);
    }
}
