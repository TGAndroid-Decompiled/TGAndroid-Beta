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
public final class l7 extends h7 {
    public final ArrayList f38182f;
    public final v7 h;

    public l7(v7 v7Var) {
        super(0);
        this.h = v7Var;
        this.f38182f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f38182f;
        arrayList.clear();
        ArrayList arrayList2 = this.f36987e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v7 v7Var = this.h;
        if (v7Var.f41574f != null) {
            for (int i10 = 0; i10 < v7Var.f41574f.f53558b.size(); i10++) {
                ?? aVar = new og.a(1, true);
                aVar.f39115c = (u6) v7Var.f41574f.f53558b.get(i10);
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
        if (c1Var.f46528f == 1) {
            z6 z6Var = (z6) c1Var.f46524a;
            ArrayList arrayList = this.f36987e;
            u6 u6Var = ((o7) arrayList.get(i10)).f39115c;
            v7 v7Var = this.h;
            TLObject userOrChat = v7Var.d.getMessagesController().getUserOrChat(u6Var.f41066a);
            u6 u6Var2 = z6Var.f43704a;
            if (u6Var2 != null && u6Var2.f41066a == u6Var.f41066a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u6Var.f41066a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                z6Var.getImageView().getAvatarDrawable().g(14);
                z6Var.getImageView().e(null, z6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(z6Var.getImageView(), userOrChat);
            }
            z6Var.f43704a = u6Var;
            org.telegram.ui.Components.w9 imageView = z6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f41068c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.p6 p6Var = z6Var.d;
            TextView textView = z6Var.f43706c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                p6Var.c(formatFileSize, false, true);
                p6Var.setVisibility(0);
            } else {
                p6Var.setVisibility(4);
            }
            z6Var.f43708f = z11;
            z6Var.setWillNotDraw(!z11);
            z6Var.requestLayout();
            boolean contains = v7Var.f41574f.f53566l.contains(Long.valueOf(u6Var.f41066a));
            org.telegram.ui.Components.qp qpVar = z6Var.f43709n;
            if (qpVar == null && !contains) {
                return;
            }
            if (qpVar == null) {
                org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(z6Var.getContext(), 21, z6Var.f43705b);
                z6Var.f43709n = qpVar2;
                qpVar2.b(-1, org.telegram.ui.ActionBar.i6.f20818d6, org.telegram.ui.ActionBar.i6.f20948k7);
                z6Var.f43709n.setDrawUnchecked(false);
                int i11 = 3;
                z6Var.f43709n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.qp qpVar3 = z6Var.f43709n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                z6Var.addView(qpVar3, w7.z5.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            z6Var.f43709n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        z6 z6Var = null;
        if (i10 == 1) {
            z6Var = new z6(this.h.getContext(), null);
        }
        return new s4.c1(z6Var);
    }
}
