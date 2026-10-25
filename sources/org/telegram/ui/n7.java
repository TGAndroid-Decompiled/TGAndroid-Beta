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
public final class n7 extends j7 {
    public final ArrayList f41762f;
    public final x7 h;

    public n7(x7 x7Var) {
        super(0);
        this.h = x7Var;
        this.f41762f = new ArrayList();
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f41762f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        x7 x7Var = this.h;
        if (x7Var.h != null) {
            for (int i10 = 0; i10 < x7Var.h.f6370b.size(); i10++) {
                ?? aVar = new qg.a(1, true);
                aVar.f42752c = (w6) x7Var.h.f6370b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f7;
        boolean z11;
        if (e1Var.f47738f == 1) {
            b7 b7Var = (b7) e1Var.f47735a;
            ArrayList arrayList = this.e;
            w6 w6Var = ((q7) arrayList.get(i10)).f42752c;
            x7 x7Var = this.h;
            TLObject userOrChat = x7Var.e.getMessagesController().getUserOrChat(w6Var.f44983a);
            w6 w6Var2 = b7Var.f37983a;
            if (w6Var2 != null && w6Var2.f44983a == w6Var.f44983a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (w6Var.f44983a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                b7Var.getImageView().getAvatarDrawable().g(14);
                b7Var.getImageView().f(null, b7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(b7Var.getImageView(), userOrChat);
            }
            b7Var.f37983a = w6Var;
            org.telegram.ui.Components.y9 imageView = b7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f44985c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.s6 s6Var = b7Var.d;
            TextView textView = b7Var.f37985c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                s6Var.c(formatFileSize, false, true);
                s6Var.setVisibility(0);
            } else {
                s6Var.setVisibility(4);
            }
            b7Var.f37986f = z11;
            b7Var.setWillNotDraw(!z11);
            b7Var.requestLayout();
            boolean contains = x7Var.h.f6377l.contains(Long.valueOf(w6Var.f44983a));
            org.telegram.ui.Components.zp zpVar = b7Var.f37987n;
            if (zpVar == null && !contains) {
                return;
            }
            if (zpVar == null) {
                org.telegram.ui.Components.zp zpVar2 = new org.telegram.ui.Components.zp(b7Var.getContext(), 21, b7Var.f37984b);
                b7Var.f37987n = zpVar2;
                zpVar2.b(-1, org.telegram.ui.ActionBar.y6.f23354d6, org.telegram.ui.ActionBar.y6.f23483k7);
                b7Var.f37987n.setDrawUnchecked(false);
                int i11 = 3;
                b7Var.f37987n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.zp zpVar3 = b7Var.f37987n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                b7Var.addView(zpVar3, org.telegram.ui.Components.gb1.h(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            b7Var.f37987n.a(contains, z10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        b7 b7Var = null;
        if (i10 == 1) {
            b7Var = new b7(this.h.getContext(), null);
        }
        return new s4.e1(b7Var);
    }
}
