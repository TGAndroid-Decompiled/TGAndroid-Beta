package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class a70 extends org.telegram.ui.Components.yk0 {

    public final Context f36446c;
    public final c70 d;

    public a70(c70 c70Var, Context context) {
        this.d = c70Var;
        this.f36446c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.d;
        if ((i10 >= c70Var.A && i10 < c70Var.B) || i10 == c70Var.F) {
            return 0;
        }
        if (i10 == c70Var.f36988y || i10 == c70Var.D) {
            return 4;
        }
        if (i10 == c70Var.f36987x || i10 == c70Var.G) {
            return 1;
        }
        return i10 == c70Var.E ? 5 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        long j10;
        c70 c70Var = this.d;
        boolean z10 = c70Var.J;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view;
            if (i10 == c70Var.F) {
                h8Var.b(false, false);
                h8Var.d(c70Var.f36984r, false, false);
                h8Var.setDeleteAction(new u50(this, 3));
                return;
            }
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) c70Var).currentAccount).getStickerSets(c70Var.c0());
            int i12 = i10 - c70Var.A;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
            h8Var.d(stickerSets.get(i12), i12 != stickerSets.size() - 1, false);
            h8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = c70Var.f36984r;
            if (tL_messages_stickerSet2 != null) {
                j10 = tL_messages_stickerSet2.set.f22407id;
            } else {
                j10 = c70Var.b0(c70Var.v) != null ? c70Var.b0(c70Var.v).f22407id : 0L;
            }
            h8Var.b(tL_messages_stickerSet.set.f22407id == j10, false);
            return;
        }
        if (i11 == 1) {
            if (i10 != c70Var.f36987x) {
                if (i10 == c70Var.G) {
                    ((org.telegram.ui.Cells.x8) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int iIndexOf = string.indexOf("@stickers");
            if (iIndexOf == -1) {
                ((org.telegram.ui.Cells.x8) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 3), iIndexOf, iIndexOf + 9, 18);
                ((org.telegram.ui.Cells.x8) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                ((org.telegram.ui.Cells.x8) view).setText(string);
                return;
            }
        }
        if (i11 == 4) {
            if (i10 == c70Var.D) {
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        z60 z60Var = (z60) view;
        boolean z11 = c70Var.F > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = c70Var.f36984r;
        z60Var.f45055b = z11;
        org.telegram.ui.Components.lt ltVar = z60Var.f45054a;
        y60 y60Var = z60Var.f45058f;
        ltVar.removeTextChangedListener(y60Var);
        if (tL_messages_stickerSet3 == null) {
            ltVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            ltVar.setText(str);
            ltVar.setSelection(str.length());
        }
        ltVar.addTextChangedListener(y60Var);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.f36446c;
        if (i10 == 0) {
            org.telegram.ui.Cells.h8 h8Var = new org.telegram.ui.Cells.h8(context, 3);
            h8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = h8Var;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            view = x8Var;
        } else if (i10 != 5) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = j4Var;
        } else {
            c70 c70Var = this.d;
            z60 z60Var = new z60(c70Var, context);
            c70Var.K = z60Var;
            view = z60Var;
        }
        view.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(view);
    }
}
