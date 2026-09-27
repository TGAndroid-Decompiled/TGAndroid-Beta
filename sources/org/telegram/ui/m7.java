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
    public final ArrayList f35533f;
    public final v7 h;

    public m7(v7 v7Var) {
        super(0);
        this.h = v7Var;
        this.f35533f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f35533f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v7 v7Var = this.h;
        if (v7Var.f38466f != null) {
            for (int i10 = 0; i10 < v7Var.f38466f.f49516b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f36340c = (u6) v7Var.f38466f.f49516b.get(i10);
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
        if (c1Var.f43008f == 1) {
            a7 a7Var = (a7) c1Var.f43005a;
            ArrayList arrayList = this.e;
            u6 u6Var = ((p7) arrayList.get(i10)).f36340c;
            v7 v7Var = this.h;
            TLObject userOrChat = v7Var.d.getMessagesController().getUserOrChat(u6Var.f38128a);
            u6 u6Var2 = a7Var.f31980a;
            if (u6Var2 != null && u6Var2.f38128a == u6Var.f38128a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u6Var.f38128a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                a7Var.getImageView().getAvatarDrawable().g(14);
                a7Var.getImageView().e(null, a7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(a7Var.getImageView(), userOrChat);
            }
            a7Var.f31980a = u6Var;
            org.telegram.ui.Components.w9 imageView = a7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f38130c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.p6 p6Var = a7Var.d;
            TextView textView = a7Var.f31982c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                p6Var.c(formatFileSize, false, true);
                p6Var.setVisibility(0);
            } else {
                p6Var.setVisibility(4);
            }
            a7Var.f31983f = z11;
            a7Var.setWillNotDraw(!z11);
            a7Var.requestLayout();
            boolean contains = v7Var.f38466f.f49523l.contains(Long.valueOf(u6Var.f38128a));
            org.telegram.ui.Components.pp ppVar = a7Var.f31984n;
            if (ppVar == null && !contains) {
                return;
            }
            if (ppVar == null) {
                org.telegram.ui.Components.pp ppVar2 = new org.telegram.ui.Components.pp(a7Var.getContext(), 21, a7Var.f31981b);
                a7Var.f31984n = ppVar2;
                ppVar2.b(-1, org.telegram.ui.ActionBar.i6.f19057d6, org.telegram.ui.ActionBar.i6.f19186k7);
                a7Var.f31984n.setDrawUnchecked(false);
                int i11 = 3;
                a7Var.f31984n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.pp ppVar3 = a7Var.f31984n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                a7Var.addView(ppVar3, w7.y5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            a7Var.f31984n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        a7 a7Var = null;
        if (i10 == 1) {
            a7Var = new a7(this.h.getContext(), null);
        }
        return new s4.c1(a7Var);
    }
}
