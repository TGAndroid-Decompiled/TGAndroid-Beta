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
    public final ArrayList f38301f;
    public final q7 h;

    public h7(q7 q7Var) {
        super(0);
        this.h = q7Var;
        this.f38301f = new ArrayList();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38301f;
        arrayList.clear();
        ArrayList arrayList2 = this.f36928e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        q7 q7Var = this.h;
        if (q7Var.f41056f != null) {
            for (int i10 = 0; i10 < q7Var.f41056f.f54788b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f39216c = (q6) q7Var.f41056f.f54788b.get(i10);
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
        if (d1Var.f47752f == 1) {
            w6 w6Var = (w6) d1Var.f47748a;
            ArrayList arrayList = this.f36928e;
            q6 q6Var = ((k7) arrayList.get(i10)).f39216c;
            q7 q7Var = this.h;
            TLObject userOrChat = q7Var.d.getMessagesController().getUserOrChat(q6Var.f41046a);
            q6 q6Var2 = w6Var.f43215a;
            if (q6Var2 != null && q6Var2.f41046a == q6Var.f41046a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q6Var.f41046a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                w6Var.getImageView().getAvatarDrawable().g(14);
                w6Var.getImageView().e(null, w6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(w6Var.getImageView(), userOrChat);
            }
            w6Var.f43215a = q6Var;
            org.telegram.ui.Components.y9 imageView = w6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(q6Var.f41048c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.r6 r6Var = w6Var.d;
            TextView textView = w6Var.f43217c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                r6Var.c(formatFileSize, false, true);
                r6Var.setVisibility(0);
            } else {
                r6Var.setVisibility(4);
            }
            w6Var.f43219f = z11;
            w6Var.setWillNotDraw(!z11);
            w6Var.requestLayout();
            boolean contains = q7Var.f41056f.f54796l.contains(Long.valueOf(q6Var.f41046a));
            org.telegram.ui.Components.dq dqVar = w6Var.f43220n;
            if (dqVar == null && !contains) {
                return;
            }
            if (dqVar == null) {
                org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(w6Var.getContext(), 21, w6Var.f43216b);
                w6Var.f43220n = dqVar2;
                dqVar2.b(-1, org.telegram.ui.ActionBar.h6.f20786d6, org.telegram.ui.ActionBar.h6.f20915k7);
                w6Var.f43220n.setDrawUnchecked(false);
                int i11 = 3;
                w6Var.f43220n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.dq dqVar3 = w6Var.f43220n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                w6Var.addView(dqVar3, w7.x5.a(24.0f, 38.0f, 25.0f, 38.0f, 0.0f, 24, i11 | 48));
            }
            w6Var.f43220n.a(contains, z10);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        w6 w6Var = null;
        if (i10 == 1) {
            w6 w6Var2 = new w6(this.h.getContext(), null);
            w6Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
            w6Var = w6Var2;
        }
        return new s4.d1(w6Var);
    }
}
