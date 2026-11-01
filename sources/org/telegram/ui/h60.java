package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h60 extends org.telegram.ui.Components.tk0 {
    public final Context f37709c;
    public final j60 d;

    public h60(j60 j60Var, Context context) {
        this.d = j60Var;
        this.f37709c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.G;
    }

    @Override
    public final int d(int i10) {
        j60 j60Var = this.d;
        if ((i10 >= j60Var.E && i10 < j60Var.F) || i10 == j60Var.J) {
            return 0;
        }
        if (i10 != j60Var.D && i10 != j60Var.H) {
            if (i10 != j60Var.f38291y && i10 != j60Var.K) {
                if (i10 != j60Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        long j10;
        int i11;
        int i12;
        j60 j60Var = this.d;
        boolean z11 = j60Var.N;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z12 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        g60 g60Var = (g60) view;
                        if (j60Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = j60Var.f38287r;
                        g60Var.f37360b = z12;
                        org.telegram.ui.Components.mt mtVar = g60Var.f37359a;
                        f60 f60Var = g60Var.f37362f;
                        mtVar.removeTextChangedListener(f60Var);
                        if (tL_messages_stickerSet == null) {
                            mtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            mtVar.setText(str);
                            mtVar.setSelection(str.length());
                        }
                        mtVar.addTextChangedListener(f60Var);
                        return;
                    }
                    return;
                } else if (i10 == j60Var.H) {
                    ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.dd.L0(2131754434, null));
                    return;
                } else {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (z11) {
                        i12 = 2131752130;
                    } else {
                        i12 = 2131752115;
                    }
                    p4Var.setText(org.telegram.messenger.dd.L0(i12, null));
                    return;
                }
            } else if (i10 == j60Var.f38291y) {
                if (z11) {
                    i11 = 2131752129;
                } else {
                    i11 = 2131752114;
                }
                String L0 = org.telegram.messenger.dd.L0(i11, null);
                int indexOf = L0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.f4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.b9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        ((org.telegram.ui.Cells.b9) view).setText(L0);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.b9) view).setText(L0);
                return;
            } else if (i10 == j60Var.K) {
                ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.dd.L0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
        if (i10 == j60Var.J) {
            k8Var.b(false, false);
            k8Var.d(j60Var.f38287r, false, false);
            k8Var.setDeleteAction(new e50(this, 2));
            return;
        }
        ArrayList s02 = org.telegram.messenger.vi.b0(j60.d0(j60Var)).s0(j60Var.h0());
        int i14 = i10 - j60Var.E;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
        if (i14 != s02.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.d(tL_messages_stickerSet3, z10, false);
        k8Var.setDeleteAction(null);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = j60Var.f38287r;
        if (tL_messages_stickerSet4 != null) {
            j10 = tL_messages_stickerSet4.set.f19821id;
        } else if (j60Var.g0(j60Var.f38289w) != null) {
            j10 = j60Var.g0(j60Var.f38289w).f19821id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet2.set.f19821id != j10) {
            z12 = false;
        }
        k8Var.b(z12, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f37709c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout p4Var = new org.telegram.ui.Cells.p4(context);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, p4Var, null);
                    frameLayout = p4Var;
                } else {
                    j60 j60Var = this.d;
                    g60 g60Var = new g60(j60Var, context);
                    j60Var.O = g60Var;
                    frameLayout = g60Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, k8Var, null);
            frameLayout = k8Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
