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
    public final ArrayList f39643f;
    public final u7 h;

    public l7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f39643f = new ArrayList();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f39643f;
        arrayList.clear();
        ArrayList arrayList2 = this.f38270e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.f42384f != null) {
            for (int i10 = 0; i10 < u7Var.f42384f.f54933b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f40569c = (u6) u7Var.f42384f.f54933b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f7;
        boolean z11;
        if (d1Var.f47901f == 1) {
            a7 a7Var = (a7) d1Var.f47897a;
            ArrayList arrayList = this.f38270e;
            u6 u6Var = ((o7) arrayList.get(i10)).f40569c;
            u7 u7Var = this.h;
            TLObject userOrChat = u7Var.d.getMessagesController().getUserOrChat(u6Var.f42373a);
            u6 u6Var2 = a7Var.f35714a;
            if (u6Var2 != null && u6Var2.f42373a == u6Var.f42373a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u6Var.f42373a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                a7Var.getImageView().getAvatarDrawable().g(14);
                a7Var.getImageView().e(null, a7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(a7Var.getImageView(), userOrChat);
            }
            a7Var.f35714a = u6Var;
            org.telegram.ui.Components.y9 imageView = a7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f42375c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.r6 r6Var = a7Var.d;
            TextView textView = a7Var.f35716c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                r6Var.c(formatFileSize, false, true);
                r6Var.setVisibility(0);
            } else {
                r6Var.setVisibility(4);
            }
            a7Var.f35718f = z11;
            a7Var.setWillNotDraw(!z11);
            a7Var.requestLayout();
            boolean contains = u7Var.f42384f.f54941l.contains(Long.valueOf(u6Var.f42373a));
            org.telegram.ui.Components.fq fqVar = a7Var.f35719n;
            if (fqVar == null && !contains) {
                return;
            }
            if (fqVar == null) {
                org.telegram.ui.Components.fq fqVar2 = new org.telegram.ui.Components.fq(a7Var.getContext(), 21, a7Var.f35715b);
                a7Var.f35719n = fqVar2;
                fqVar2.b(-1, org.telegram.ui.ActionBar.h6.f20560d6, org.telegram.ui.ActionBar.h6.f20689k7);
                a7Var.f35719n.setDrawUnchecked(false);
                int i11 = 3;
                a7Var.f35719n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.fq fqVar3 = a7Var.f35719n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                a7Var.addView(fqVar3, w7.w5.a(24.0f, 38.0f, 25.0f, 38.0f, 0.0f, 24, i11 | 48));
            }
            a7Var.f35719n.a(contains, z10);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        a7 a7Var = null;
        if (i10 == 1) {
            a7 a7Var2 = new a7(this.h.getContext(), null);
            a7Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
            a7Var = a7Var2;
        }
        return new s4.d1(a7Var);
    }
}
