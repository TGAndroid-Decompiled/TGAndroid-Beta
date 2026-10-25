package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d70 extends org.telegram.ui.Components.lm0 {
    public final Context f38743c;
    public final f70 d;

    public d70(f70 f70Var, Context context) {
        this.d = f70Var;
        this.f38743c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.G;
    }

    @Override
    public final int j(int i10) {
        f70 f70Var = this.d;
        if ((i10 >= f70Var.E && i10 < f70Var.F) || i10 == f70Var.J) {
            return 0;
        }
        if (i10 != f70Var.f39294y && i10 != f70Var.H) {
            if (i10 != f70Var.f39293x && i10 != f70Var.K) {
                if (i10 != f70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13;
        f70 f70Var = this.d;
        boolean z11 = f70Var.N;
        int i14 = e1Var.f47738f;
        View view = e1Var.f47735a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        c70 c70Var = (c70) view;
                        if (f70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = f70Var.f39290r;
                        c70Var.f38361b = z12;
                        org.telegram.ui.Components.ju juVar = c70Var.f38360a;
                        b70 b70Var = c70Var.f38363f;
                        juVar.removeTextChangedListener(b70Var);
                        if (tL_messages_stickerSet == null) {
                            juVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            juVar.setText(str);
                            juVar.setSelection(str.length());
                        }
                        juVar.addTextChangedListener(b70Var);
                        return;
                    }
                    return;
                } else if (i10 == f70Var.H) {
                    ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    q4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == f70Var.f39293x) {
                if (z11) {
                    i12 = R.string.ChooseEmojiPackMy;
                } else {
                    i12 = R.string.ChooseStickerSetMy;
                }
                String string = LocaleController.getString(i12);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.i9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.i9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.i9) view).setText(string);
                return;
            } else if (i10 == f70Var.K) {
                ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (i10 != f70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.r2) f70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(f70Var.d0());
            int i15 = i10 - f70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            p8Var.d(tL_messages_stickerSet3, z10, false);
            p8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = f70Var.f39290r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f22054id;
            } else if (f70Var.c0(f70Var.v) != null) {
                j10 = f70Var.c0(f70Var.v).f22054id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f22054id != j10) {
                z12 = false;
            }
            p8Var.b(z12, false);
            return;
        }
        p8Var.b(false, false);
        p8Var.d(f70Var.f39290r, false, false);
        p8Var.setDeleteAction(new x50(this, 3));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f38743c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout q4Var = new org.telegram.ui.Cells.q4(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, q4Var, null);
                    frameLayout = q4Var;
                } else {
                    f70 f70Var = this.d;
                    c70 c70Var = new c70(f70Var, context);
                    f70Var.O = c70Var;
                    frameLayout = c70Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            FrameLayout p8Var = new org.telegram.ui.Cells.p8(context, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, p8Var, null);
            frameLayout = p8Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
