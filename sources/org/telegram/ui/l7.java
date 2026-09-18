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
    public final ArrayList f35473f;
    public final u7 h;

    public l7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f35473f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f35473f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.f37956f != null) {
            for (int i10 = 0; i10 < u7Var.f37956f.f49228b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f36244c = (t6) u7Var.f37956f.f49228b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f7;
        boolean z11;
        if (c1Var.f42705f == 1) {
            z6 z6Var = (z6) c1Var.f42702a;
            ArrayList arrayList = this.e;
            t6 t6Var = ((o7) arrayList.get(i10)).f36244c;
            u7 u7Var = this.h;
            TLObject userOrChat = u7Var.d.getMessagesController().getUserOrChat(t6Var.f37672a);
            t6 t6Var2 = z6Var.f40130a;
            if (t6Var2 != null && t6Var2.f37672a == t6Var.f37672a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t6Var.f37672a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                z6Var.getImageView().getAvatarDrawable().g(14);
                z6Var.getImageView().e(null, z6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(z6Var.getImageView(), userOrChat);
            }
            z6Var.f40130a = t6Var;
            org.telegram.ui.Components.u9 imageView = z6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(t6Var.f37674c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.n6 n6Var = z6Var.d;
            TextView textView = z6Var.f40132c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                n6Var.c(formatFileSize, false, true);
                n6Var.setVisibility(0);
            } else {
                n6Var.setVisibility(4);
            }
            z6Var.f40133f = z11;
            z6Var.setWillNotDraw(!z11);
            z6Var.requestLayout();
            boolean contains = u7Var.f37956f.f49235l.contains(Long.valueOf(t6Var.f37672a));
            org.telegram.ui.Components.np npVar = z6Var.f40134n;
            if (npVar == null && !contains) {
                return;
            }
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(z6Var.getContext(), 21, z6Var.f40131b);
                z6Var.f40134n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.j6.f18863d6, org.telegram.ui.ActionBar.j6.f18992k7);
                z6Var.f40134n.setDrawUnchecked(false);
                int i11 = 3;
                z6Var.f40134n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.np npVar3 = z6Var.f40134n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                z6Var.addView(npVar3, w7.x5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            z6Var.f40134n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        z6 z6Var = null;
        if (i10 == 1) {
            z6Var = new z6(this.h.getContext(), null);
        }
        return new s4.c1(z6Var);
    }
}
