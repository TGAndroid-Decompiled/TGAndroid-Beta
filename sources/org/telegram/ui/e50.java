package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e50 extends org.telegram.ui.Components.sj0 {
    public final Context f44897c;
    public final g50 d;

    public e50(g50 g50Var, Context context) {
        this.d = g50Var;
        this.f44897c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i3) {
        g50 g50Var = this.d;
        if ((i3 >= g50Var.F && i3 < g50Var.G) || i3 == g50Var.K) {
            return 0;
        }
        if (i3 != g50Var.E && i3 != g50Var.I) {
            if (i3 != g50Var.f45543y && i3 != g50Var.L) {
                if (i3 != g50Var.J) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        long j10;
        int i11;
        int i12;
        g50 g50Var = this.d;
        boolean z11 = g50Var.O;
        int i13 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z12 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        d50 d50Var = (d50) view;
                        if (g50Var.K <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = g50Var.f45539r;
                        d50Var.f44563b = z12;
                        org.telegram.ui.Components.xs xsVar = d50Var.f44562a;
                        c50 c50Var = d50Var.f44566f;
                        xsVar.removeTextChangedListener(c50Var);
                        if (tL_messages_stickerSet == null) {
                            xsVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            xsVar.setText(str);
                            xsVar.setSelection(str.length());
                        }
                        xsVar.addTextChangedListener(c50Var);
                        return;
                    }
                    return;
                } else if (i3 == g50Var.I) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131754434, null));
                    return;
                } else {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (z11) {
                        i12 = 2131752130;
                    } else {
                        i12 = 2131752115;
                    }
                    n4Var.setText(org.telegram.messenger.bd.M0(i12, null));
                    return;
                }
            } else if (i3 == g50Var.f45543y) {
                if (z11) {
                    i11 = 2131752129;
                } else {
                    i11 = 2131752114;
                }
                String M0 = org.telegram.messenger.bd.M0(i11, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.y8) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        ((org.telegram.ui.Cells.y8) view).setText(M0);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.y8) view).setText(M0);
                return;
            } else if (i3 == g50Var.L) {
                ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        if (i3 != g50Var.K) {
            i10 = ((org.telegram.ui.ActionBar.d2) g50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.li.b0(i10).s0(g50Var.h0());
            int i14 = i3 - g50Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            if (i14 != s02.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f8Var.d(tL_messages_stickerSet3, z10, false);
            f8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = g50Var.f45539r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f27028id;
            } else if (g50Var.g0(g50Var.f45541w) != null) {
                j10 = g50Var.g0(g50Var.f45541w).f27028id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f27028id != j10) {
                z12 = false;
            }
            f8Var.b(z12, false);
            return;
        }
        f8Var.b(false, false);
        f8Var.d(g50Var.f45539r, false, false);
        f8Var.setDeleteAction(new b40(this, 2));
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = this.f44897c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 5) {
                    FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, null);
                    frameLayout = n4Var;
                } else {
                    g50 g50Var = this.d;
                    d50 d50Var = new d50(g50Var, context);
                    g50Var.P = d50Var;
                    frameLayout = d50Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            FrameLayout f8Var = new org.telegram.ui.Cells.f8(context, 3);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, f8Var, null);
            frameLayout = f8Var;
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(frameLayout);
    }
}
