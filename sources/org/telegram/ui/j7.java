package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class j7 extends f7 {

    public final ArrayList f39277f;
    public final s7 h;

    public j7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f39277f = new ArrayList();
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f39277f;
        arrayList.clear();
        ArrayList arrayList2 = this.f37950e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.f42534f != null) {
            for (int i10 = 0; i10 < s7Var.f42534f.f11483b.size(); i10++) {
                s6 s6Var = (s6) s7Var.f42534f.f11483b.get(i10);
                m7 m7Var = new m7(1, true);
                m7Var.f40384c = s6Var;
                arrayList2.add(m7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String dialogPhotoTitle;
        if (o1Var.f5793f != 1) {
            return;
        }
        y6 y6Var = (y6) o1Var.f5789a;
        ArrayList arrayList = this.f37950e;
        s6 s6Var = ((m7) arrayList.get(i10)).f40384c;
        s7 s7Var = this.h;
        TLObject userOrChat = s7Var.d.getMessagesController().getUserOrChat(s6Var.f42522a);
        s6 s6Var2 = y6Var.f44707a;
        boolean z10 = s6Var2 != null && s6Var2.f42522a == s6Var.f42522a;
        if (s6Var.f42522a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            y6Var.getImageView().getAvatarDrawable().g(14);
            y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(y6Var.getImageView(), userOrChat);
        }
        y6Var.f44707a = s6Var;
        y6Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String fileSize = AndroidUtilities.formatFileSize(s6Var.f42524c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.j6 j6Var = y6Var.d;
        TextView textView = y6Var.f44709c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (fileSize != null) {
            j6Var.c(fileSize, false, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        y6Var.f44711f = z11;
        y6Var.setWillNotDraw(!z11);
        y6Var.requestLayout();
        boolean zContains = s7Var.f42534f.f11491l.contains(Long.valueOf(s6Var.f42522a));
        org.telegram.ui.Components.bp bpVar = y6Var.f44712n;
        if (bpVar != null || zContains) {
            if (bpVar == null) {
                org.telegram.ui.Components.bp bpVar2 = new org.telegram.ui.Components.bp(y6Var.getContext(), 21, y6Var.f44708b);
                y6Var.f44712n = bpVar2;
                bpVar2.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
                y6Var.f44712n.setDrawUnchecked(false);
                y6Var.f44712n.setDrawBackgroundAsArc(3);
                y6Var.addView(y6Var.f44712n, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.f44712n.a(zContains, z10);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var = null;
        if (i10 == 1) {
            y6 y6Var2 = new y6(this.h.getContext(), null);
            y6Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            y6Var = y6Var2;
        }
        return new org.telegram.ui.Components.lk0(y6Var);
    }
}
