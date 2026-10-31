package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i60 extends org.telegram.ui.Components.sk0 {
    public final Context f38182c;
    public final k60 d;

    public i60(k60 k60Var, Context context) {
        this.d = k60Var;
        this.f38182c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
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
        k60 k60Var = this.d;
        if ((i10 >= k60Var.E && i10 < k60Var.F) || i10 == k60Var.J) {
            return 0;
        }
        if (i10 != k60Var.D && i10 != k60Var.H) {
            if (i10 != k60Var.f38704y && i10 != k60Var.K) {
                if (i10 != k60Var.I) {
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
        k60 k60Var = this.d;
        boolean z11 = k60Var.N;
        int i13 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z12 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        h60 h60Var = (h60) view;
                        if (k60Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = k60Var.f38700r;
                        h60Var.f37763b = z12;
                        org.telegram.ui.Components.mt mtVar = h60Var.f37762a;
                        g60 g60Var = h60Var.f37765f;
                        mtVar.removeTextChangedListener(g60Var);
                        if (tL_messages_stickerSet == null) {
                            mtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            mtVar.setText(str);
                            mtVar.setSelection(str.length());
                        }
                        mtVar.addTextChangedListener(g60Var);
                        return;
                    }
                    return;
                } else if (i10 == k60Var.H) {
                    ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131754434, null));
                    return;
                } else {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (z11) {
                        i12 = 2131752130;
                    } else {
                        i12 = 2131752115;
                    }
                    p4Var.setText(org.telegram.messenger.cd.L0(i12, null));
                    return;
                }
            } else if (i10 == k60Var.f38704y) {
                if (z11) {
                    i11 = 2131752129;
                } else {
                    i11 = 2131752114;
                }
                String L0 = org.telegram.messenger.cd.L0(i11, null);
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
            } else if (i10 == k60Var.K) {
                ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.L0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
        if (i10 == k60Var.J) {
            k8Var.b(false, false);
            k8Var.d(k60Var.f38700r, false, false);
            k8Var.setDeleteAction(new f50(this, 2));
            return;
        }
        ArrayList s02 = org.telegram.messenger.ui.b0(k60.c0(k60Var)).s0(k60Var.g0());
        int i14 = i10 - k60Var.E;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
        if (i14 != s02.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.d(tL_messages_stickerSet3, z10, false);
        k8Var.setDeleteAction(null);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = k60Var.f38700r;
        if (tL_messages_stickerSet4 != null) {
            j10 = tL_messages_stickerSet4.set.f19820id;
        } else if (k60Var.f0(k60Var.f38702w) != null) {
            j10 = k60Var.f0(k60Var.f38702w).f19820id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet2.set.f19820id != j10) {
            z12 = false;
        }
        k8Var.b(z12, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f38182c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout p4Var = new org.telegram.ui.Cells.p4(context);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, null);
                    frameLayout = p4Var;
                } else {
                    k60 k60Var = this.d;
                    h60 h60Var = new h60(k60Var, context);
                    k60Var.O = h60Var;
                    frameLayout = h60Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, k8Var, null);
            frameLayout = k8Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
