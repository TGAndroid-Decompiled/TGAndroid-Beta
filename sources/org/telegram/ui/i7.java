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
public final class i7 extends e7 {
    public final ArrayList f39042f;
    public final r7 h;

    public i7(r7 r7Var) {
        super(0);
        this.h = r7Var;
        this.f39042f = new ArrayList();
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f39042f;
        arrayList.clear();
        ArrayList arrayList2 = this.f37834e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        r7 r7Var = this.h;
        if (r7Var.f42294f != null) {
            for (int i9 = 0; i9 < r7Var.f42294f.f10787b.size(); i9++) {
                ?? aVar = new wf.a(1, true);
                aVar.f40070c = (r6) r7Var.f42294f.f10787b.get(i9);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        String dialogPhotoTitle;
        float f10;
        boolean z11;
        if (q1Var.f5505f == 1) {
            x6 x6Var = (x6) q1Var.f5501a;
            ArrayList arrayList = this.f37834e;
            r6 r6Var = ((l7) arrayList.get(i9)).f40070c;
            r7 r7Var = this.h;
            TLObject userOrChat = r7Var.d.getMessagesController().getUserOrChat(r6Var.f42274a);
            r6 r6Var2 = x6Var.f44378a;
            if (r6Var2 != null && r6Var2.f42274a == r6Var.f42274a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r6Var.f42274a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(x6Var.getImageView(), userOrChat);
            }
            x6Var.f44378a = r6Var;
            org.telegram.ui.Components.o9 imageView = x6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f10));
            String formatFileSize = AndroidUtilities.formatFileSize(r6Var.f42276c);
            if (i9 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.j6 j6Var = x6Var.d;
            TextView textView = x6Var.f44380c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                j6Var.c(formatFileSize, false, true);
                j6Var.setVisibility(0);
            } else {
                j6Var.setVisibility(4);
            }
            x6Var.f44382f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = r7Var.f42294f.f10795l.contains(Long.valueOf(r6Var.f42274a));
            org.telegram.ui.Components.dp dpVar = x6Var.f44383n;
            if (dpVar == null && !contains) {
                return;
            }
            if (dpVar == null) {
                org.telegram.ui.Components.dp dpVar2 = new org.telegram.ui.Components.dp(x6Var.getContext(), 21, x6Var.f44379b);
                x6Var.f44383n = dpVar2;
                dpVar2.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
                x6Var.f44383n.setDrawUnchecked(false);
                int i10 = 3;
                x6Var.f44383n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.dp dpVar3 = x6Var.f44383n;
                if (LocaleController.isRTL) {
                    i10 = 5;
                }
                x6Var.addView(dpVar3, g7.e6.d(24, 24.0f, i10 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f44383n.a(contains, z10);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        x6 x6Var = null;
        if (i9 == 1) {
            x6 x6Var2 = new x6(this.h.getContext(), null);
            x6Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            x6Var = x6Var2;
        }
        return new f2.q1(x6Var);
    }
}
