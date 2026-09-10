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
public final class q70 extends org.telegram.ui.Components.ul0 {
    public final Context f35987c;
    public final s70 d;

    public q70(s70 s70Var, Context context) {
        this.d = s70Var;
        this.f35987c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        s70 s70Var = this.d;
        if ((i10 >= s70Var.E && i10 < s70Var.F) || i10 == s70Var.J) {
            return 0;
        }
        if (i10 != s70Var.f36575y && i10 != s70Var.H) {
            if (i10 != s70Var.f36574x && i10 != s70Var.K) {
                if (i10 != s70Var.I) {
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
        s70 s70Var = this.d;
        boolean z11 = s70Var.N;
        int i14 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        p70 p70Var = (p70) view;
                        if (s70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s70Var.f36571r;
                        p70Var.f35693b = z12;
                        org.telegram.ui.Components.fu fuVar = p70Var.f35692a;
                        o70 o70Var = p70Var.f35695f;
                        fuVar.removeTextChangedListener(o70Var);
                        if (tL_messages_stickerSet == null) {
                            fuVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            fuVar.setText(str);
                            fuVar.setSelection(str.length());
                        }
                        fuVar.addTextChangedListener(o70Var);
                        return;
                    }
                    return;
                } else if (i10 == s70Var.H) {
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
            } else if (i10 == s70Var.f36574x) {
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
                        ((org.telegram.ui.Cells.f9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.f9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.f9) view).setText(string);
                return;
            } else if (i10 == s70Var.K) {
                ((org.telegram.ui.Cells.f9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        if (i10 != s70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.p2) s70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(s70Var.c0());
            int i15 = i10 - s70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            n8Var.d(tL_messages_stickerSet3, z10, false);
            n8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = s70Var.f36571r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f17222id;
            } else if (s70Var.b0(s70Var.v) != null) {
                j3 = s70Var.b0(s70Var.v).f17222id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f17222id != j3) {
                z12 = false;
            }
            n8Var.b(z12, false);
            return;
        }
        n8Var.b(false, false);
        n8Var.d(s70Var.f36571r, false, false);
        n8Var.setDeleteAction(new l60(this, 3));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f35987c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                    frameLayout = m4Var;
                } else {
                    s70 s70Var = this.d;
                    p70 p70Var = new p70(s70Var, context);
                    s70Var.O = p70Var;
                    frameLayout = p70Var;
                }
            } else {
                FrameLayout f9Var = new org.telegram.ui.Cells.f9(context);
                f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                frameLayout = f9Var;
            }
        } else {
            FrameLayout n8Var = new org.telegram.ui.Cells.n8(context, 3);
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            frameLayout = n8Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
