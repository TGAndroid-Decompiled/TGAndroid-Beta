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
public final class p70 extends org.telegram.ui.Components.xl0 {
    public final Context f36341c;
    public final r70 d;

    public p70(r70 r70Var, Context context) {
        this.d = r70Var;
        this.f36341c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43008f == 0) {
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
        r70 r70Var = this.d;
        if ((i10 >= r70Var.E && i10 < r70Var.F) || i10 == r70Var.J) {
            return 0;
        }
        if (i10 != r70Var.f37028y && i10 != r70Var.H) {
            if (i10 != r70Var.f37027x && i10 != r70Var.K) {
                if (i10 != r70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        long j3;
        int i12;
        int i13;
        r70 r70Var = this.d;
        boolean z11 = r70Var.N;
        int i14 = c1Var.f43008f;
        View view = c1Var.f43005a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        o70 o70Var = (o70) view;
                        if (r70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = r70Var.f37024r;
                        o70Var.f36149b = z12;
                        org.telegram.ui.Components.du duVar = o70Var.f36148a;
                        n70 n70Var = o70Var.f36151f;
                        duVar.removeTextChangedListener(n70Var);
                        if (tL_messages_stickerSet == null) {
                            duVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            duVar.setText(str);
                            duVar.setSelection(str.length());
                        }
                        duVar.addTextChangedListener(n70Var);
                        return;
                    }
                    return;
                } else if (i10 == r70Var.H) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    m4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == r70Var.f37027x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
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
            } else if (i10 == r70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 != r70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.o2) r70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(r70Var.c0());
            int i15 = i10 - r70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.d(tL_messages_stickerSet3, z10, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = r70Var.f37024r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f18356id;
            } else if (r70Var.b0(r70Var.v) != null) {
                j3 = r70Var.b0(r70Var.v).f18356id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f18356id != j3) {
                z12 = false;
            }
            m8Var.b(z12, false);
            return;
        }
        m8Var.b(false, false);
        m8Var.d(r70Var.f37024r, false, false);
        m8Var.setDeleteAction(new i60(this, 3));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f36341c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                    frameLayout = m4Var;
                } else {
                    r70 r70Var = this.d;
                    o70 o70Var = new o70(r70Var, context);
                    r70Var.O = o70Var;
                    frameLayout = o70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f19021b7));
                frameLayout = e9Var;
            }
        } else {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
            frameLayout = m8Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
