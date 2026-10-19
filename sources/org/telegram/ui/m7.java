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
public final class m7 extends i7 {
    public final ArrayList f39158f;
    public final v7 h;

    public m7(v7 v7Var) {
        super(0);
        this.h = v7Var;
        this.f39158f = new ArrayList();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f39158f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v7 v7Var = this.h;
        if (v7Var.f42121f != null) {
            for (int i10 = 0; i10 < v7Var.f42121f.f4432b.size(); i10++) {
                ?? aVar = new pg.a(1, true);
                aVar.f40085c = (v6) v7Var.f42121f.f4432b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f7;
        boolean z11;
        if (b1Var.f45913f == 1) {
            b7 b7Var = (b7) b1Var.f45910a;
            ArrayList arrayList = this.e;
            v6 v6Var = ((p7) arrayList.get(i10)).f40085c;
            v7 v7Var = this.h;
            TLObject userOrChat = v7Var.d.getMessagesController().getUserOrChat(v6Var.f42109a);
            v6 v6Var2 = b7Var.f35526a;
            if (v6Var2 != null && v6Var2.f42109a == v6Var.f42109a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (v6Var.f42109a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                b7Var.getImageView().getAvatarDrawable().g(14);
                b7Var.getImageView().e(null, b7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(b7Var.getImageView(), userOrChat);
            }
            b7Var.f35526a = v6Var;
            org.telegram.ui.Components.w9 imageView = b7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(v6Var.f42111c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.q6 q6Var = b7Var.d;
            TextView textView = b7Var.f35528c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                q6Var.c(formatFileSize, false, true);
                q6Var.setVisibility(0);
            } else {
                q6Var.setVisibility(4);
            }
            b7Var.f35529f = z11;
            b7Var.setWillNotDraw(!z11);
            b7Var.requestLayout();
            boolean contains = v7Var.f42121f.f4439l.contains(Long.valueOf(v6Var.f42109a));
            org.telegram.ui.Components.xp xpVar = b7Var.f35530n;
            if (xpVar == null && !contains) {
                return;
            }
            if (xpVar == null) {
                org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(b7Var.getContext(), 21, b7Var.f35527b);
                b7Var.f35530n = xpVar2;
                xpVar2.b(-1, org.telegram.ui.ActionBar.h6.f20989d6, org.telegram.ui.ActionBar.h6.f21117k7);
                b7Var.f35530n.setDrawUnchecked(false);
                int i11 = 3;
                b7Var.f35530n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.xp xpVar3 = b7Var.f35530n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                b7Var.addView(xpVar3, w7.z5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            b7Var.f35530n.a(contains, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        b7 b7Var = null;
        if (i10 == 1) {
            b7 b7Var2 = new b7(this.h.getContext(), null);
            b7Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
            b7Var = b7Var2;
        }
        return new s4.b1(b7Var);
    }
}
