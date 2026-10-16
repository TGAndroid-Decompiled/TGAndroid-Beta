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
    public final ArrayList f38267f;
    public final w7 h;

    public n7(w7 w7Var) {
        super(0);
        this.h = w7Var;
        this.f38267f = new ArrayList();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38267f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w7 w7Var = this.h;
        if (w7Var.f40880f != null) {
            for (int i10 = 0; i10 < w7Var.f40880f.f925b.size(); i10++) {
                ?? aVar = new pg.a(1, true);
                aVar.f39071c = (w6) w7Var.f40880f.f925b.get(i10);
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
        if (b1Var.f44841f == 1) {
            c7 c7Var = (c7) b1Var.f44838a;
            ArrayList arrayList = this.e;
            w6 w6Var = ((q7) arrayList.get(i10)).f39071c;
            w7 w7Var = this.h;
            TLObject userOrChat = w7Var.d.getMessagesController().getUserOrChat(w6Var.f40870a);
            w6 w6Var2 = c7Var.f34466a;
            if (w6Var2 != null && w6Var2.f40870a == w6Var.f40870a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (w6Var.f40870a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                c7Var.getImageView().getAvatarDrawable().g(14);
                c7Var.getImageView().e(null, c7Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(c7Var.getImageView(), userOrChat);
            }
            c7Var.f34466a = w6Var;
            org.telegram.ui.Components.z9 imageView = c7Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f40872c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.s6 s6Var = c7Var.d;
            TextView textView = c7Var.f34468c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                s6Var.c(formatFileSize, false, true);
                s6Var.setVisibility(0);
            } else {
                s6Var.setVisibility(4);
            }
            c7Var.f34469f = z11;
            c7Var.setWillNotDraw(!z11);
            c7Var.requestLayout();
            boolean contains = w7Var.f40880f.f932l.contains(Long.valueOf(w6Var.f40870a));
            org.telegram.ui.Components.aq aqVar = c7Var.f34470n;
            if (aqVar == null && !contains) {
                return;
            }
            if (aqVar == null) {
                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(c7Var.getContext(), 21, c7Var.f34467b);
                c7Var.f34470n = aqVar2;
                aqVar2.b(-1, org.telegram.ui.ActionBar.g6.f19601d6, org.telegram.ui.ActionBar.g6.f19729k7);
                c7Var.f34470n.setDrawUnchecked(false);
                int i11 = 3;
                c7Var.f34470n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.aq aqVar3 = c7Var.f34470n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                c7Var.addView(aqVar3, w7.z5.a(24.0f, 38.0f, 25.0f, 38.0f, 0.0f, 24, i11 | 48));
            }
            c7Var.f34470n.a(contains, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c7 c7Var = null;
        if (i10 == 1) {
            c7 c7Var2 = new c7(this.h.getContext(), null);
            c7Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            c7Var = c7Var2;
        }
        return new s4.b1(c7Var);
    }
}
