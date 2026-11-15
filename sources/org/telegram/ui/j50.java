package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class j50 extends org.telegram.ui.Components.tj0 {
    public final Context f48212c;
    public final l50 d;

    public j50(l50 l50Var, Context context) {
        this.d = l50Var;
        this.f48212c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
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
        l50 l50Var = this.d;
        if ((i7 >= l50Var.F && i7 < l50Var.G) || i7 == l50Var.K) {
            return 0;
        }
        if (i7 != l50Var.E && i7 != l50Var.I) {
            if (i7 != l50Var.f48851y && i7 != l50Var.L) {
                if (i7 != l50Var.J) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        long j3;
        int i11;
        int i12;
        l50 l50Var = this.d;
        boolean z11 = l50Var.O;
        int i13 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z12 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        i50 i50Var = (i50) view;
                        if (l50Var.K <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = l50Var.f48847r;
                        i50Var.f47896b = z12;
                        org.telegram.ui.Components.ft ftVar = i50Var.f47895a;
                        h50 h50Var = i50Var.f47899f;
                        ftVar.removeTextChangedListener(h50Var);
                        if (tL_messages_stickerSet == null) {
                            ftVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            ftVar.setText(str);
                            ftVar.setSelection(str.length());
                        }
                        ftVar.addTextChangedListener(h50Var);
                        return;
                    }
                    return;
                } else if (i7 == l50Var.I) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131754434, null));
                    return;
                } else {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (z11) {
                        i12 = 2131752130;
                    } else {
                        i12 = 2131752115;
                    }
                    n4Var.setText(org.telegram.messenger.hd.M0(i12, null));
                    return;
                }
            } else if (i7 == l50Var.f48851y) {
                if (z11) {
                    i11 = 2131752129;
                } else {
                    i11 = 2131752114;
                }
                String M0 = org.telegram.messenger.hd.M0(i11, null);
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
            } else if (i7 == l50Var.L) {
                ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.hd.M0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        if (i7 != l50Var.K) {
            i10 = ((org.telegram.ui.ActionBar.e2) l50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.si.b0(i10).s0(l50Var.h0());
            int i14 = i7 - l50Var.F;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            if (i14 != s02.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f8Var.d(tL_messages_stickerSet3, z10, false);
            f8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = l50Var.f48847r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f28078id;
            } else if (l50Var.g0(l50Var.f48849w) != null) {
                j3 = l50Var.g0(l50Var.f48849w).f28078id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f28078id != j3) {
                z12 = false;
            }
            f8Var.b(z12, false);
            return;
        }
        f8Var.b(false, false);
        f8Var.d(l50Var.f48847r, false, false);
        f8Var.setDeleteAction(new g40(this, 2));
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.f48212c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 5) {
                    FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, null);
                    frameLayout = n4Var;
                } else {
                    l50 l50Var = this.d;
                    i50 i50Var = new i50(l50Var, context);
                    l50Var.P = i50Var;
                    frameLayout = i50Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            FrameLayout f8Var = new org.telegram.ui.Cells.f8(context, 3);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, f8Var, null);
            frameLayout = f8Var;
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(frameLayout);
    }
}
