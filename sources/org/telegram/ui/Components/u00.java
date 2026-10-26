package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class u00 extends lm0 {
    public final Context f33197c;
    public final v00 d;

    public u00(v00 v00Var, Activity activity) {
        this.d = v00Var;
        this.f33197c = activity;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        int size = this.d.v.size();
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) e1Var.f47738a;
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.f33526w;
        ArrayList arrayList2 = v00Var.v;
        if (i10 < arrayList2.size()) {
            org.telegram.ui.ActionBar.f7.t(c3Var.getImageView(), org.telegram.ui.ActionBar.y6.J5, null, PorterDuff.Mode.MULTIPLY);
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
            org.telegram.ui.ActionBar.f7.V(c3Var.getTextView(), org.telegram.ui.ActionBar.y6.f23464j5, null);
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
            c3Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, c3Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, c3Var.getTextView().getPaint().getFontMetricsInt()), 0, new o10(v00Var.getContext(), i11, dialogFilter.color), false);
            c3Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, v00.A(v00Var)));
            boolean z10 = true;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(v00.C(v00Var)), ((Long) arrayList.get(i14)).longValue())) {
                    z10 = false;
                }
            }
            c3Var.setChecked(z10);
            return;
        }
        c3Var.getImageView().setColorFilter((ColorFilter) null);
        Context context = this.f33197c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        ImageView imageView = c3Var.getImageView();
        int i15 = org.telegram.ui.ActionBar.y6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(imageView, drawable, i15, null, mode);
        org.telegram.ui.ActionBar.f7.y(c3Var.getImageView(), drawable2, org.telegram.ui.ActionBar.y6.f23485k7, null, mode);
        ar arVar = new ar(drawable, drawable2);
        org.telegram.ui.ActionBar.f7.V(c3Var.getTextView(), org.telegram.ui.ActionBar.y6.f23597q6, null);
        c3Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, arVar, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(this.f33197c, 0, null);
        c3Var.setBackground(null);
        c3Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(c3Var);
    }
}
