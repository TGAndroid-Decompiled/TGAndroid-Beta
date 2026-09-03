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
public final class l7 extends h7 {
    public final ArrayList f38562f;
    public final u7 h;

    public l7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f38562f = new ArrayList();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38562f;
        arrayList.clear();
        ArrayList arrayList2 = this.f37232e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.f41734f != null) {
            for (int i10 = 0; i10 < u7Var.f41734f.f16252b.size(); i10++) {
                ?? bVar = new cg.b(1, true);
                bVar.f39552c = (u6) u7Var.f41734f.f16252b.get(i10);
                arrayList2.add(bVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        String dialogPhotoTitle;
        float f10;
        boolean z10;
        if (m1Var.f5879f == 1) {
            a7 a7Var = (a7) m1Var.f5875a;
            ArrayList arrayList = this.f37232e;
            u6 u6Var = ((o7) arrayList.get(i10)).f39552c;
            u7 u7Var = this.h;
            TLObject userOrChat = u7Var.d.getMessagesController().getUserOrChat(u6Var.f41727a);
            u6 u6Var2 = a7Var.f35046a;
            if (u6Var2 != null && u6Var2.f41727a == u6Var.f41727a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (u6Var.f41727a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                a7Var.getImageView().getAvatarDrawable().g(14);
                a7Var.getImageView().e(null, a7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(a7Var.getImageView(), userOrChat);
            }
            a7Var.f35046a = u6Var;
            org.telegram.ui.Components.p9 imageView = a7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f10));
            String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f41729c);
            if (i10 < arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.k6 k6Var = a7Var.d;
            TextView textView = a7Var.f35048c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                k6Var.c(formatFileSize, false, true);
                k6Var.setVisibility(0);
            } else {
                k6Var.setVisibility(4);
            }
            a7Var.f35050f = z10;
            a7Var.setWillNotDraw(!z10);
            a7Var.requestLayout();
            boolean contains = u7Var.f41734f.f16260l.contains(Long.valueOf(u6Var.f41727a));
            org.telegram.ui.Components.np npVar = a7Var.f35051n;
            if (npVar == null && !contains) {
                return;
            }
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(a7Var.getContext(), 21, a7Var.f35047b);
                a7Var.f35051n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.k6.f21661d6, org.telegram.ui.ActionBar.k6.f21788k7);
                a7Var.f35051n.setDrawUnchecked(false);
                int i11 = 3;
                a7Var.f35051n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.np npVar3 = a7Var.f35051n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                a7Var.addView(npVar3, k7.c6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            a7Var.f35051n.a(contains, z4);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        a7 a7Var = null;
        if (i10 == 1) {
            a7 a7Var2 = new a7(this.h.getContext(), null);
            a7Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            a7Var = a7Var2;
        }
        return new f2.m1(a7Var);
    }
}
