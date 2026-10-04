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
public final class p00 extends yl0 {
    public final Context f29483c;
    public final q00 d;

    public p00(q00 q00Var, Activity activity) {
        this.d = q00Var;
        this.f29483c = activity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.f29860s.size();
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.y2 y2Var = (org.telegram.ui.ActionBar.y2) c1Var.f46531a;
        q00 q00Var = this.d;
        ArrayList arrayList = q00Var.v;
        ArrayList arrayList2 = q00Var.f29860s;
        if (i10 < arrayList2.size()) {
            y2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J5, false), PorterDuff.Mode.MULTIPLY));
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
            y2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20930j5, false));
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
            y2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, y2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, y2Var.getTextView().getPaint().getFontMetricsInt()), 0, new g10(q00Var.getContext(), i11, dialogFilter.color), false);
            y2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, q00.z(q00Var)));
            boolean z10 = true;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(q00.B(q00Var)), ((Long) arrayList.get(i14)).longValue())) {
                    z10 = false;
                }
            }
            y2Var.setChecked(z10);
            return;
        }
        y2Var.getImageView().setColorFilter((ColorFilter) null);
        Context context = this.f29483c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20952k7, false), mode));
        sq sqVar = new sq(drawable, drawable2);
        y2Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        y2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, sqVar, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(this.f29483c, 0, null);
        y2Var.setBackground(null);
        y2Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(y2Var);
    }
}
