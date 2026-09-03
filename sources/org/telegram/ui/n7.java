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
    public final ArrayList f36397f;
    public final w7 h;

    public n7(w7 w7Var) {
        super(0);
        this.h = w7Var;
        this.f36397f = new ArrayList();
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f36397f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w7 w7Var = this.h;
        if (w7Var.f39283f != null) {
            for (int i10 = 0; i10 < w7Var.f39283f.f14163b.size(); i10++) {
                ?? bVar = new bg.b(1, true);
                bVar.f37321c = (w6) w7Var.f39283f.f14163b.get(i10);
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
        if (l1Var.f5777f == 1) {
            c7 c7Var = (c7) l1Var.f5774a;
            ArrayList arrayList = this.e;
            w6 w6Var = ((q7) arrayList.get(i10)).f37321c;
            w7 w7Var = this.h;
            TLObject userOrChat = w7Var.d.getMessagesController().getUserOrChat(w6Var.f39277a);
            w6 w6Var2 = c7Var.f33031a;
            if (w6Var2 != null && w6Var2.f39277a == w6Var.f39277a) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (w6Var.f39277a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                c7Var.getImageView().getAvatarDrawable().g(14);
                c7Var.getImageView().e(null, c7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(c7Var.getImageView(), userOrChat);
            }
            c7Var.f33031a = w6Var;
            org.telegram.ui.Components.p9 imageView = c7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f10 = 12.0f;
            } else {
                f10 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f10));
            String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f39279c);
            if (i10 < arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.k6 k6Var = c7Var.d;
            TextView textView = c7Var.f33033c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                k6Var.c(formatFileSize, false, true);
                k6Var.setVisibility(0);
            } else {
                k6Var.setVisibility(4);
            }
            c7Var.f33034f = z10;
            c7Var.setWillNotDraw(!z10);
            c7Var.requestLayout();
            boolean contains = w7Var.f39283f.f14170l.contains(Long.valueOf(w6Var.f39277a));
            org.telegram.ui.Components.kp kpVar = c7Var.f33035n;
            if (kpVar == null && !contains) {
                return;
            }
            if (kpVar == null) {
                org.telegram.ui.Components.kp kpVar2 = new org.telegram.ui.Components.kp(c7Var.getContext(), 21, c7Var.f33032b);
                c7Var.f33035n = kpVar2;
                kpVar2.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
                c7Var.f33035n.setDrawUnchecked(false);
                int i11 = 3;
                c7Var.f33035n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.kp kpVar3 = c7Var.f33035n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                c7Var.addView(kpVar3, k7.b6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            c7Var.f33035n.a(contains, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        c7 c7Var = null;
        if (i10 == 1) {
            c7 c7Var2 = new c7(this.h.getContext(), null);
            c7Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            c7Var = c7Var2;
        }
        return new f2.l1(c7Var);
    }
}
