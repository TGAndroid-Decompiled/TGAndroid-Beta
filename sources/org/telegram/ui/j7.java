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
    public final ArrayList f34671f;
    public final s7 h;

    public j7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f34671f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f34671f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.f37609f != null) {
            for (int i10 = 0; i10 < s7Var.f37609f.f49469b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f35492c = (r6) s7Var.f37609f.f49469b.get(i10);
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
        if (c1Var.f42962f == 1) {
            y6 y6Var = (y6) c1Var.f42959a;
            ArrayList arrayList = this.e;
            r6 r6Var = ((m7) arrayList.get(i10)).f35492c;
            s7 s7Var = this.h;
            TLObject userOrChat = s7Var.d.getMessagesController().getUserOrChat(r6Var.f37185a);
            r6 r6Var2 = y6Var.f40059a;
            if (r6Var2 != null && r6Var2.f37185a == r6Var.f37185a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r6Var.f37185a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                y6Var.getImageView().getAvatarDrawable().g(14);
                y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(y6Var.getImageView(), userOrChat);
            }
            y6Var.f40059a = r6Var;
            org.telegram.ui.Components.w9 imageView = y6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(r6Var.f37187c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.p6 p6Var = y6Var.d;
            TextView textView = y6Var.f40061c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                p6Var.c(formatFileSize, false, true);
                p6Var.setVisibility(0);
            } else {
                p6Var.setVisibility(4);
            }
            y6Var.f40062f = z11;
            y6Var.setWillNotDraw(!z11);
            y6Var.requestLayout();
            boolean contains = s7Var.f37609f.f49476l.contains(Long.valueOf(r6Var.f37185a));
            org.telegram.ui.Components.pp ppVar = y6Var.f40063n;
            if (ppVar == null && !contains) {
                return;
            }
            if (ppVar == null) {
                org.telegram.ui.Components.pp ppVar2 = new org.telegram.ui.Components.pp(y6Var.getContext(), 21, y6Var.f40060b);
                y6Var.f40063n = ppVar2;
                ppVar2.b(-1, org.telegram.ui.ActionBar.h6.f19059d6, org.telegram.ui.ActionBar.h6.f19187k7);
                y6Var.f40063n.setDrawUnchecked(false);
                int i11 = 3;
                y6Var.f40063n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.pp ppVar3 = y6Var.f40063n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                y6Var.addView(ppVar3, w7.y5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.f40063n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var = null;
        if (i10 == 1) {
            y6 y6Var2 = new y6(this.h.getContext(), null);
            y6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
            y6Var = y6Var2;
        }
        return new s4.c1(y6Var);
    }
}
