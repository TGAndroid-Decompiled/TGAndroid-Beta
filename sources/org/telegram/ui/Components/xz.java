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
public final class xz extends vk0 {
    public final Context f34809c;
    public final yz d;

    public xz(yz yzVar, Activity activity) {
        this.d = yzVar;
        this.f34809c = activity;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.f35117s.size();
        if (size < 10) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i9) {
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        org.telegram.ui.ActionBar.y2 y2Var = (org.telegram.ui.ActionBar.y2) q1Var.f5501a;
        yz yzVar = this.d;
        ArrayList arrayList = yzVar.v;
        ArrayList arrayList2 = yzVar.f35117s;
        if (i9 < arrayList2.size()) {
            y2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J5, false), PorterDuff.Mode.MULTIPLY));
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i9);
            y2Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
            int i11 = dialogFilter.flags;
            if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i11) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
                i10 = R.drawable.msg_openprofile;
            } else {
                if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i11) != 0) {
                    int i12 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                    if ((i11 & i12) == i12) {
                        i10 = R.drawable.msg_markunread;
                    }
                }
                if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i11) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                    i10 = R.drawable.msg_channel;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i11) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                    i10 = R.drawable.msg_groups;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i11) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                    i10 = R.drawable.msg_contacts;
                } else if ((i11 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                    i10 = R.drawable.msg_bots;
                } else {
                    i10 = R.drawable.msg_folders;
                }
            }
            y2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, y2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, y2Var.getTextView().getPaint().getFontMetricsInt()), 0, new o00(yzVar.getContext(), i10, dialogFilter.color), false);
            y2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, yz.z(yzVar)));
            boolean z10 = true;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(yz.C(yzVar)), ((Long) arrayList.get(i13)).longValue())) {
                    z10 = false;
                }
            }
            y2Var.setChecked(z10);
            return;
        }
        y2Var.getImageView().setColorFilter((ColorFilter) null);
        Context context = this.f34809c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23128k7, false), mode));
        fq fqVar = new fq(drawable, drawable2);
        y2Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        y2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, fqVar, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(this.f34809c, 0, null);
        y2Var.setBackground(null);
        y2Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(y2Var);
    }
}
