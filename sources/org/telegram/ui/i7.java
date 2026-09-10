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
    public final ArrayList f33548f;
    public final r7 h;

    public i7(r7 r7Var) {
        super(0);
        this.h = r7Var;
        this.f33548f = new ArrayList();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final void F() {
        ArrayList arrayList = this.f33548f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        r7 r7Var = this.h;
        if (r7Var.f36246f != null) {
            for (int i10 = 0; i10 < r7Var.f36246f.f47173b.size(); i10++) {
                ?? aVar = new ng.a(1, true);
                aVar.f34548c = (r6) r7Var.f36246f.f47173b.get(i10);
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
        if (c1Var.f41613f == 1) {
            x6 x6Var = (x6) c1Var.f41610a;
            ArrayList arrayList = this.e;
            r6 r6Var = ((l7) arrayList.get(i10)).f34548c;
            r7 r7Var = this.h;
            TLObject userOrChat = r7Var.d.getMessagesController().getUserOrChat(r6Var.f36238a);
            r6 r6Var2 = x6Var.f38585a;
            if (r6Var2 != null && r6Var2.f36238a == r6Var.f36238a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r6Var.f36238a == Long.MAX_VALUE) {
                dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
                x6Var.getImageView().getAvatarDrawable().g(14);
                x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
            } else {
                dialogPhotoTitle = DialogObject.setDialogPhotoTitle(x6Var.getImageView(), userOrChat);
            }
            x6Var.f38585a = r6Var;
            org.telegram.ui.Components.w9 imageView = x6Var.getImageView();
            if ((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) {
                f7 = 12.0f;
            } else {
                f7 = 19.0f;
            }
            imageView.setRoundRadius(AndroidUtilities.dp(f7));
            String formatFileSize = AndroidUtilities.formatFileSize(r6Var.f36240c);
            if (i10 < arrayList.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.ui.Components.o6 o6Var = x6Var.d;
            TextView textView = x6Var.f38587c;
            textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
            if (formatFileSize != null) {
                o6Var.c(formatFileSize, false, true);
                o6Var.setVisibility(0);
            } else {
                o6Var.setVisibility(4);
            }
            x6Var.f38588f = z11;
            x6Var.setWillNotDraw(!z11);
            x6Var.requestLayout();
            boolean contains = r7Var.f36246f.f47180l.contains(Long.valueOf(r6Var.f36238a));
            org.telegram.ui.Components.tp tpVar = x6Var.f38589n;
            if (tpVar == null && !contains) {
                return;
            }
            if (tpVar == null) {
                org.telegram.ui.Components.tp tpVar2 = new org.telegram.ui.Components.tp(x6Var.getContext(), 21, x6Var.f38586b);
                x6Var.f38589n = tpVar2;
                tpVar2.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
                x6Var.f38589n.setDrawUnchecked(false);
                int i11 = 3;
                x6Var.f38589n.setDrawBackgroundAsArc(3);
                org.telegram.ui.Components.tp tpVar3 = x6Var.f38589n;
                if (LocaleController.isRTL) {
                    i11 = 5;
                }
                x6Var.addView(tpVar3, w7.a6.d(24, 24.0f, i11 | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.f38589n.a(contains, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        x6 x6Var = null;
        if (i10 == 1) {
            x6 x6Var2 = new x6(this.h.getContext(), null);
            x6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            x6Var = x6Var2;
        }
        return new s4.c1(x6Var);
    }
}
