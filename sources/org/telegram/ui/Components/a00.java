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

public final class a00 extends yk0 {

    public final Context f26586c;
    public final b00 d;

    public a00(b00 b00Var, Activity activity) {
        this.d = b00Var;
        this.f26586c = activity;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.f26871s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override
    public final int j(int i10) {
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) o1Var.f5789a;
        b00 b00Var = this.d;
        ArrayList arrayList = b00Var.v;
        ArrayList arrayList2 = b00Var.f26871s;
        if (i10 >= arrayList2.size()) {
            x2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.f26586c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(iW0, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false), mode));
            dq dqVar = new dq(drawable, drawable2);
            x2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            x2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, dqVar, false);
            return;
        }
        x2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        x2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        int i12 = dialogFilter.flags;
        if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
            i11 = R.drawable.msg_openprofile;
        } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i12) != 0) {
            int i13 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i12 & i13) == i13) {
                i11 = R.drawable.msg_markunread;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
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
        } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
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
        x2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, x2Var.getTextView().getPaint().getFontMetricsInt()), 0, new r00(b00Var.getContext(), i11, dialogFilter.color), false);
        x2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((org.telegram.ui.ActionBar.e3) b00Var).resourcesProvider));
        boolean z10 = true;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(((org.telegram.ui.ActionBar.e3) b00Var).currentAccount), ((Long) arrayList.get(i14)).longValue())) {
                z10 = false;
            }
        }
        x2Var.setChecked(z10);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(this.f26586c, 0, null);
        x2Var.setBackground(null);
        x2Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(x2Var);
    }
}
