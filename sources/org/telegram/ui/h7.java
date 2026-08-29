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
public final class h7 extends d7 {
    public final ArrayList f38773f;
    public final q7 h;

    public h7(q7 q7Var) {
        super(0);
        this.h = q7Var;
        this.f38773f = new ArrayList();
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38773f;
        arrayList.clear();
        ArrayList arrayList2 = this.f37378e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        q7 q7Var = this.h;
        if (q7Var.f41551f != null) {
            for (int i10 = 0; i10 < q7Var.f41551f.f13896b.size(); i10++) {
                ?? aVar = new zf.a(1, true);
                aVar.f39771c = (q6) q7Var.f41551f.f13896b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f9;
        boolean z11;
        if (n1Var.f6436f == 1) {
            w6 w6Var = (w6) n1Var.f6432a;
            ArrayList arrayList = this.f37378e;
            q6 q6Var = ((k7) arrayList.get(i10)).f39771c;
            q7 q7Var = this.h;
            TLObject userOrChat = q7Var.d.getMessagesController().getUserOrChat(q6Var.f41543a);
            q6 q6Var2 = w6Var.f43843a;
            if (q6Var2 != null && q6Var2.f41543a == q6Var.f41543a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6Var.f41543a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                w6Var.getImageView().getAvatarDrawable().g(14);
                w6Var.getImageView().e(null, w6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(w6Var.getImageView(), userOrChat);
            }
            w6Var.f43843a = q6Var;
            org.telegram.ui.Components.t9 imageView = w6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f9 = 12.0f;
            } else {
                f9 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f9));
            String formatFileSize = AndroidUtilities.formatFileSize(q6Var.f41545c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.o6 o6Var = w6Var.d;
            TextView textView = w6Var.f43845c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                o6Var.c(formatFileSize, false, true);
                o6Var.setVisibility(0);
            } else {
                o6Var.setVisibility(4);
            }
            w6Var.f43847f = z11;
            w6Var.setWillNotDraw(!z11);
            w6Var.requestLayout();
            boolean contains = q7Var.f41551f.f13904l.contains(Long.valueOf(q6Var.f41543a));
            org.telegram.ui.Components.hp hpVar = w6Var.f43848n;
            if (hpVar == null && !contains) {
                return;
            }
            if (hpVar == null) {
                org.telegram.ui.Components.hp hpVar2 = new org.telegram.ui.Components.hp(w6Var.getContext(), 21, w6Var.f43844b);
                w6Var.f43848n = hpVar2;
                hpVar2.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
                w6Var.f43848n.setDrawUnchecked(false);
                int i11 = 3;
                w6Var.f43848n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.hp hpVar3 = w6Var.f43848n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                w6Var.addView(hpVar3, i7.f6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            w6Var.f43848n.a(contains, z10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        w6 w6Var = null;
        if (i10 == 1) {
            w6 w6Var2 = new w6(this.h.getContext(), null);
            w6Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            w6Var = w6Var2;
        }
        return new f2.n1(w6Var);
    }
}
