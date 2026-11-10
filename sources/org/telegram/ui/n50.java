package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n50 extends org.telegram.ui.Components.oj0 {
    public final Context f48121c;
    public final p50 d;

    public n50(p50 p50Var, Context context) {
        this.d = p50Var;
        this.f48121c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.G;
    }

    @Override
    public final int d(int i7) {
        p50 p50Var = this.d;
        if ((i7 >= p50Var.E && i7 < p50Var.F) || i7 == p50Var.J) {
            return 0;
        }
        if (i7 != p50Var.D && i7 != p50Var.H) {
            if (i7 != p50Var.f48667y && i7 != p50Var.K) {
                if (i7 != p50Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        long j3;
        int i11;
        int i12;
        p50 p50Var = this.d;
        boolean z10 = p50Var.N;
        int i13 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        m50 m50Var = (m50) view;
                        if (p50Var.J <= 0) {
                            z11 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p50Var.f48663r;
                        m50Var.f47793b = z11;
                        org.telegram.ui.Components.ys ysVar = m50Var.f47792a;
                        l50 l50Var = m50Var.f47796f;
                        ysVar.removeTextChangedListener(l50Var);
                        if (tL_messages_stickerSet == null) {
                            ysVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            ysVar.setText(str);
                            ysVar.setSelection(str.length());
                        }
                        ysVar.addTextChangedListener(l50Var);
                        return;
                    }
                    return;
                } else if (i7 == p50Var.H) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131754434, null));
                    return;
                } else {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (z10) {
                        i12 = 2131752130;
                    } else {
                        i12 = 2131752115;
                    }
                    n4Var.setText(org.telegram.messenger.id.M0(i12, null));
                    return;
                }
            } else if (i7 == p50Var.f48667y) {
                if (z10) {
                    i11 = 2131752129;
                } else {
                    i11 = 2131752114;
                }
                String M0 = org.telegram.messenger.id.M0(i11, null);
                int indexOf = M0.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        ((org.telegram.ui.Cells.z8) view).setText(M0);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.z8) view).setText(M0);
                return;
            } else if (i7 == p50Var.K) {
                ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        if (i7 != p50Var.J) {
            i10 = ((org.telegram.ui.ActionBar.f2) p50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(p50Var.h0());
            int i14 = i7 - p50Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            if (i14 != s02.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            g8Var.d(tL_messages_stickerSet3, z9, false);
            g8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = p50Var.f48663r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f26987id;
            } else if (p50Var.g0(p50Var.f48665w) != null) {
                j3 = p50Var.g0(p50Var.f48665w).f26987id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f26987id != j3) {
                z11 = false;
            }
            g8Var.b(z11, false);
            return;
        }
        g8Var.b(false, false);
        g8Var.d(p50Var.f48663r, false, false);
        g8Var.setDeleteAction(new j40(this, 2));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.f48121c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 5) {
                    FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, n4Var, null);
                    frameLayout = n4Var;
                } else {
                    p50 p50Var = this.d;
                    m50 m50Var = new m50(p50Var, context);
                    p50Var.O = m50Var;
                    frameLayout = m50Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            FrameLayout g8Var = new org.telegram.ui.Cells.g8(context, 3);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, g8Var, null);
            frameLayout = g8Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(frameLayout);
    }
}
