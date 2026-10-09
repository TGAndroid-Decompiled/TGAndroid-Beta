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
    public final ArrayList f38535f;
    public final r7 h;

    public i7(r7 r7Var) {
        super(0);
        this.h = r7Var;
        this.f38535f = new ArrayList();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38535f;
        arrayList.clear();
        ArrayList arrayList2 = this.f37175e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        r7 r7Var = this.h;
        if (r7Var.f41292f != null) {
            for (int i10 = 0; i10 < r7Var.f41292f.f54701b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f39448c = (r6) r7Var.f41292f.f54701b.get(i10);
                arrayList2.add(aVar);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        String dialogPhotoTitle;
        float f7;
        boolean z11;
        if (d1Var.f47662f == 1) {
            x6 x6Var = (x6) d1Var.f47658a;
            ArrayList arrayList = this.f37175e;
            r6 r6Var = ((l7) arrayList.get(i10)).f39448c;
            r7 r7Var = this.h;
            TLObject userOrChat = r7Var.d.getMessagesController().getUserOrChat(r6Var.f41281a);
            r6 r6Var2 = x6Var.f43831a;
            if (r6Var2 != null && r6Var2.f41281a == r6Var.f41281a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r6Var.f41281a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(x6Var.getImageView(), userOrChat);
            }
            x6Var.f43831a = r6Var;
            org.telegram.ui.Components.y9 imageView = x6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(r6Var.f41283c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.r6 r6Var3 = x6Var.d;
            TextView textView = x6Var.f43833c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                r6Var3.c(formatFileSize, false, true);
                r6Var3.setVisibility(0);
            } else {
                r6Var3.setVisibility(4);
            }
            x6Var.f43835f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = r7Var.f41292f.f54709l.contains(Long.valueOf(r6Var.f41281a));
            org.telegram.ui.Components.dq dqVar = x6Var.f43836n;
            if (dqVar == null && !contains) {
                return;
            }
            if (dqVar == null) {
                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(x6Var.getContext(), 21, x6Var.f43832b);
                x6Var.f43836n = dqVar2;
                dqVar2.b(-1, org.telegram.ui.ActionBar.i6.f20797d6, org.telegram.ui.ActionBar.i6.f20926k7);
                x6Var.f43836n.setDrawUnchecked(false);
                int i11 = 3;
                x6Var.f43836n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.dq dqVar3 = x6Var.f43836n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                x6Var.addView(dqVar3, w7.x5.a(24.0f, 38.0f, 25.0f, 38.0f, 0.0f, 24, i11 | 48));
            }
            x6Var.f43836n.a(contains, z10);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        x6 x6Var = null;
        if (i10 == 1) {
            x6 x6Var2 = new x6(this.h.getContext(), null);
            x6Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
            x6Var = x6Var2;
        }
        return new s4.d1(x6Var);
    }
}
