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
public final class s00 extends km0 {
    public final Context f30398c;
    public final t00 d;

    public s00(t00 t00Var, Activity activity) {
        this.d = t00Var;
        this.f30398c = activity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) b1Var.f46342a;
        t00 t00Var = this.d;
        ArrayList arrayList = t00Var.f30678w;
        ArrayList arrayList2 = t00Var.v;
        if (i10 < arrayList2.size()) {
            org.telegram.ui.ActionBar.r6.t(z2Var.getImageView(), org.telegram.ui.ActionBar.k6.J5, null, PorterDuff.Mode.MULTIPLY);
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
            org.telegram.ui.ActionBar.r6.W(z2Var.getTextView(), org.telegram.ui.ActionBar.k6.f21290j5, null);
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
            z2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, z2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, z2Var.getTextView().getPaint().getFontMetricsInt()), 0, new j10(t00Var.getContext(), i11, dialogFilter.color), false);
            z2Var.getTextView().setEmojiColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, t00.A(t00Var)));
            boolean z10 = true;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(t00.C(t00Var)), ((Long) arrayList.get(i14)).longValue())) {
                    z10 = false;
                }
            }
            z2Var.setChecked(z10);
            return;
        }
        z2Var.getImageView().setColorFilter((ColorFilter) null);
        Context context = this.f30398c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        ImageView imageView = z2Var.getImageView();
        int i15 = org.telegram.ui.ActionBar.k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(imageView, drawable, i15, null, mode);
        org.telegram.ui.ActionBar.r6.z(z2Var.getImageView(), drawable2, org.telegram.ui.ActionBar.k6.f21312k7, null, mode);
        wq wqVar = new wq(drawable, drawable2);
        org.telegram.ui.ActionBar.r6.W(z2Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
        z2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, wqVar, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(this.f30398c, 0, null);
        z2Var.setBackground(null);
        z2Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(z2Var);
    }
}
