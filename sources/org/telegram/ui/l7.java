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
    public final ArrayList f35969f;
    public final u7 h;

    public l7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f35969f = new ArrayList();
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f35969f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.f38857f != null) {
            for (int i10 = 0; i10 < u7Var.f38857f.f14175b.size(); i10++) {
                ?? bVar = new bg.b(1, true);
                bVar.f36801c = (u6) u7Var.f38857f.f14175b.get(i10);
                arrayList2.add(bVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        String dialogPhotoTitle;
        float f10;
        boolean z10;
        if (l1Var.f5788f == 1) {
            a7 a7Var = (a7) l1Var.f5785a;
            ArrayList arrayList = this.e;
            u6 u6Var = ((o7) arrayList.get(i10)).f36801c;
            u7 u7Var = this.h;
            TLObject userOrChat = u7Var.d.getMessagesController().getUserOrChat(u6Var.f38849a);
            u6 u6Var2 = a7Var.f32470a;
            if (u6Var2 != null && u6Var2.f38849a == u6Var.f38849a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (u6Var.f38849a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                a7Var.getImageView().getAvatarDrawable().g(14);
                a7Var.getImageView().e(null, a7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(a7Var.getImageView(), userOrChat);
            }
            a7Var.f32470a = u6Var;
            org.telegram.ui.Components.p9 imageView = a7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f10));
            String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f38851c);
            if (i10 < arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.k6 k6Var = a7Var.d;
            TextView textView = a7Var.f32472c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                k6Var.c(formatFileSize, false, true);
                k6Var.setVisibility(0);
            } else {
                k6Var.setVisibility(4);
            }
            a7Var.f32473f = z10;
            a7Var.setWillNotDraw(!z10);
            a7Var.requestLayout();
            boolean contains = u7Var.f38857f.f14182l.contains(Long.valueOf(u6Var.f38849a));
            org.telegram.ui.Components.lp lpVar = a7Var.f32474n;
            if (lpVar == null && !contains) {
                return;
            }
            if (lpVar == null) {
                org.telegram.ui.Components.lp lpVar2 = new org.telegram.ui.Components.lp(a7Var.getContext(), 21, a7Var.f32471b);
                a7Var.f32474n = lpVar2;
                lpVar2.b(-1, org.telegram.ui.ActionBar.j6.f19906d6, org.telegram.ui.ActionBar.j6.f20032k7);
                a7Var.f32474n.setDrawUnchecked(false);
                int i11 = 3;
                a7Var.f32474n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.lp lpVar3 = a7Var.f32474n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                a7Var.addView(lpVar3, k7.b6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            a7Var.f32474n.a(contains, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        a7 a7Var = null;
        if (i10 == 1) {
            a7 a7Var2 = new a7(this.h.getContext(), null);
            a7Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            a7Var = a7Var2;
        }
        return new f2.l1(a7Var);
    }
}
