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
public final class c70 extends org.telegram.ui.Components.km0 {
    public final Context f36253c;
    public final e70 d;

    public c70(e70 e70Var, Context context) {
        this.d = e70Var;
        this.f36253c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
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
        e70 e70Var = this.d;
        if ((i10 >= e70Var.E && i10 < e70Var.F) || i10 == e70Var.J) {
            return 0;
        }
        if (i10 != e70Var.f36826y && i10 != e70Var.H) {
            if (i10 != e70Var.f36825x && i10 != e70Var.K) {
                if (i10 != e70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13;
        e70 e70Var = this.d;
        boolean z11 = e70Var.N;
        int i14 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        b70 b70Var = (b70) view;
                        if (e70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = e70Var.f36822r;
                        b70Var.f35941b = z12;
                        org.telegram.ui.Components.gu guVar = b70Var.f35940a;
                        a70 a70Var = b70Var.f35943f;
                        guVar.removeTextChangedListener(a70Var);
                        if (tL_messages_stickerSet == null) {
                            guVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            guVar.setText(str);
                            guVar.setSelection(str.length());
                        }
                        guVar.addTextChangedListener(a70Var);
                        return;
                    }
                    return;
                } else if (i10 == e70Var.H) {
                    ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    l4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == e70Var.f36825x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.e9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            } else if (i10 == e70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        if (i10 != e70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.o2) e70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(e70Var.c0());
            int i15 = i10 - e70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            l8Var.d(tL_messages_stickerSet3, z10, false);
            l8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = e70Var.f36822r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f20371id;
            } else if (e70Var.b0(e70Var.v) != null) {
                j10 = e70Var.b0(e70Var.v).f20371id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f20371id != j10) {
                z12 = false;
            }
            l8Var.b(z12, false);
            return;
        }
        l8Var.b(false, false);
        l8Var.d(e70Var.f36822r, false, false);
        l8Var.setDeleteAction(new w50(this, 3));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f36253c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
                    frameLayout = l4Var;
                } else {
                    e70 e70Var = this.d;
                    b70 b70Var = new b70(e70Var, context);
                    e70Var.O = b70Var;
                    frameLayout = b70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, context, e9Var, null);
                frameLayout = e9Var;
            }
        } else {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l8Var, null);
            frameLayout = l8Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(frameLayout);
    }
}
