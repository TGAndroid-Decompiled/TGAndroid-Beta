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
public final class j7 extends f7 {
    public final ArrayList f34823f;
    public final s7 h;

    public j7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f34823f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f34823f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.f37266f != null) {
            for (int i10 = 0; i10 < s7Var.f37266f.f49200b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f35644c = (s6) s7Var.f37266f.f49200b.get(i10);
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
        if (c1Var.f42678f == 1) {
            y6 y6Var = (y6) c1Var.f42675a;
            ArrayList arrayList = this.e;
            s6 s6Var = ((m7) arrayList.get(i10)).f35644c;
            s7 s7Var = this.h;
            TLObject userOrChat = s7Var.d.getMessagesController().getUserOrChat(s6Var.f37257a);
            s6 s6Var2 = y6Var.f39761a;
            if (s6Var2 != null && s6Var2.f37257a == s6Var.f37257a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s6Var.f37257a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                y6Var.getImageView().getAvatarDrawable().g(14);
                y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(y6Var.getImageView(), userOrChat);
            }
            y6Var.f39761a = s6Var;
            org.telegram.ui.Components.u9 imageView = y6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(s6Var.f37259c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.n6 n6Var = y6Var.d;
            TextView textView = y6Var.f39763c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                n6Var.c(formatFileSize, false, true);
                n6Var.setVisibility(0);
            } else {
                n6Var.setVisibility(4);
            }
            y6Var.f39764f = z11;
            y6Var.setWillNotDraw(!z11);
            y6Var.requestLayout();
            boolean contains = s7Var.f37266f.f49207l.contains(Long.valueOf(s6Var.f37257a));
            org.telegram.ui.Components.np npVar = y6Var.f39765n;
            if (npVar == null && !contains) {
                return;
            }
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(y6Var.getContext(), 21, y6Var.f39762b);
                y6Var.f39765n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.i6.f18836d6, org.telegram.ui.ActionBar.i6.f18965k7);
                y6Var.f39765n.setDrawUnchecked(false);
                int i11 = 3;
                y6Var.f39765n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.np npVar3 = y6Var.f39765n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                y6Var.addView(npVar3, w7.x5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.f39765n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var = null;
        if (i10 == 1) {
            y6 y6Var2 = new y6(this.h.getContext(), null);
            y6Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
            y6Var = y6Var2;
        }
        return new s4.c1(y6Var);
    }
}
