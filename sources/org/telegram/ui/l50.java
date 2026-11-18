package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l50 extends org.telegram.ui.Components.bk0 {
    public final Context f49438c;
    public final n50 d;

    public l50(n50 n50Var, Context context) {
        this.d = n50Var;
        this.f49438c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i7) {
        n50 n50Var = this.d;
        if ((i7 >= n50Var.F && i7 < n50Var.G) || i7 == n50Var.K) {
            return 0;
        }
        if (i7 != n50Var.E && i7 != n50Var.I) {
            if (i7 != n50Var.f50067y && i7 != n50Var.L) {
                if (i7 != n50Var.J) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        long j3;
        int i10;
        int i11;
        n50 n50Var = this.d;
        boolean z11 = n50Var.O;
        int i12 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z12 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 4) {
                    if (i12 == 5) {
                        k50 k50Var = (k50) view;
                        if (n50Var.K <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n50Var.f50063r;
                        k50Var.f49156b = z12;
                        org.telegram.ui.Components.mt mtVar = k50Var.f49155a;
                        j50 j50Var = k50Var.f49159f;
                        mtVar.removeTextChangedListener(j50Var);
                        if (tL_messages_stickerSet == null) {
                            mtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            mtVar.setText(str);
                            mtVar.setSelection(str.length());
                        }
                        mtVar.addTextChangedListener(j50Var);
                        return;
                    }
                    return;
                } else if (i7 == n50Var.I) {
                    ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.M0(2131754432, null));
                    return;
                } else {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (z11) {
                        i11 = 2131752119;
                    } else {
                        i11 = 2131752104;
                    }
                    o4Var.setText(org.telegram.messenger.gd.M0(i11, null));
                    return;
                }
            } else if (i7 == n50Var.f50067y) {
                if (z11) {
                    i10 = 2131752118;
                } else {
                    i10 = 2131752103;
                }
                String M0 = org.telegram.messenger.gd.M0(i10, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.a9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        ((org.telegram.ui.Cells.a9) view).setText(M0);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.a9) view).setText(M0);
                return;
            } else if (i7 == n50Var.L) {
                ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.gd.M0(2131754427, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.h8 h8Var = (org.telegram.ui.Cells.h8) view;
        if (i7 == n50Var.K) {
            h8Var.b(false, false);
            h8Var.d(n50Var.f50063r, false, false);
            h8Var.setDeleteAction(new j40(this, 2));
            return;
        }
        ArrayList u02 = org.telegram.messenger.ri.d0(n50.d0(n50Var)).u0(n50Var.h0());
        int i13 = i7 - n50Var.F;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) u02.get(i13);
        if (i13 != u02.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h8Var.d(tL_messages_stickerSet3, z10, false);
        h8Var.setDeleteAction(null);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = n50Var.f50063r;
        if (tL_messages_stickerSet4 != null) {
            j3 = tL_messages_stickerSet4.set.f28430id;
        } else if (n50Var.g0(n50Var.f50065w) != null) {
            j3 = n50Var.g0(n50Var.f50065w).f28430id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet2.set.f28430id != j3) {
            z12 = false;
        }
        h8Var.b(z12, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.f49438c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 5) {
                    FrameLayout o4Var = new org.telegram.ui.Cells.o4(context);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, null);
                    frameLayout = o4Var;
                } else {
                    n50 n50Var = this.d;
                    k50 k50Var = new k50(n50Var, context);
                    n50Var.P = k50Var;
                    frameLayout = k50Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            FrameLayout h8Var = new org.telegram.ui.Cells.h8(context, 3);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, h8Var, null);
            frameLayout = h8Var;
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(frameLayout);
    }
}
