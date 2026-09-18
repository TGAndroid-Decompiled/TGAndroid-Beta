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
public final class k7 extends g7 {
    public final ArrayList f35011f;
    public final t7 h;

    public k7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f35011f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f35011f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.f37589f != null) {
            for (int i10 = 0; i10 < t7Var.f37589f.f49451b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f35829c = (s6) t7Var.f37589f.f49451b.get(i10);
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
        if (c1Var.f42932f == 1) {
            y6 y6Var = (y6) c1Var.f42929a;
            ArrayList arrayList = this.e;
            s6 s6Var = ((n7) arrayList.get(i10)).f35829c;
            t7 t7Var = this.h;
            TLObject userOrChat = t7Var.d.getMessagesController().getUserOrChat(s6Var.f37201a);
            s6 s6Var2 = y6Var.f39706a;
            if (s6Var2 != null && s6Var2.f37201a == s6Var.f37201a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s6Var.f37201a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                y6Var.getImageView().getAvatarDrawable().g(14);
                y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(y6Var.getImageView(), userOrChat);
            }
            y6Var.f39706a = s6Var;
            org.telegram.ui.Components.w9 imageView = y6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(s6Var.f37203c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.p6 p6Var = y6Var.d;
            TextView textView = y6Var.f39708c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                p6Var.c(formatFileSize, false, true);
                p6Var.setVisibility(0);
            } else {
                p6Var.setVisibility(4);
            }
            y6Var.f39709f = z11;
            y6Var.setWillNotDraw(!z11);
            y6Var.requestLayout();
            boolean contains = t7Var.f37589f.f49458l.contains(Long.valueOf(s6Var.f37201a));
            org.telegram.ui.Components.np npVar = y6Var.f39710n;
            if (npVar == null && !contains) {
                return;
            }
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(y6Var.getContext(), 21, y6Var.f39707b);
                y6Var.f39710n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.j6.f19062d6, org.telegram.ui.ActionBar.j6.f19191k7);
                y6Var.f39710n.setDrawUnchecked(false);
                int i11 = 3;
                y6Var.f39710n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.np npVar3 = y6Var.f39710n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                y6Var.addView(npVar3, w7.y5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.f39710n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var = null;
        if (i10 == 1) {
            y6Var = new y6(this.h.getContext(), null);
        }
        return new s4.c1(y6Var);
    }
}
