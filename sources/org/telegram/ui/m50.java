package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m50 extends org.telegram.ui.Components.pj0 {
    public final Context f47751c;
    public final o50 d;

    public m50(o50 o50Var, Context context) {
        this.d = o50Var;
        this.f47751c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 0) {
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
        o50 o50Var = this.d;
        if ((i7 >= o50Var.E && i7 < o50Var.F) || i7 == o50Var.J) {
            return 0;
        }
        if (i7 != o50Var.D && i7 != o50Var.H) {
            if (i7 != o50Var.f48350y && i7 != o50Var.K) {
                if (i7 != o50Var.I) {
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
        o50 o50Var = this.d;
        boolean z10 = o50Var.N;
        int i13 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z11 = true;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 4) {
                    if (i13 == 5) {
                        l50 l50Var = (l50) view;
                        if (o50Var.J <= 0) {
                            z11 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = o50Var.f48346r;
                        l50Var.f47466b = z11;
                        org.telegram.ui.Components.zs zsVar = l50Var.f47465a;
                        k50 k50Var = l50Var.f47469f;
                        zsVar.removeTextChangedListener(k50Var);
                        if (tL_messages_stickerSet == null) {
                            zsVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            zsVar.setText(str);
                            zsVar.setSelection(str.length());
                        }
                        zsVar.addTextChangedListener(k50Var);
                        return;
                    }
                    return;
                } else if (i7 == o50Var.H) {
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
            } else if (i7 == o50Var.f48350y) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i4(this, 3), indexOf, indexOf + 9, 18);
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
            } else if (i7 == o50Var.K) {
                ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(2131754429, null));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        if (i7 != o50Var.J) {
            i10 = ((org.telegram.ui.ActionBar.f2) o50Var).currentAccount;
            ArrayList s02 = org.telegram.messenger.ui.b0(i10).s0(o50Var.h0());
            int i14 = i7 - o50Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) s02.get(i14);
            if (i14 != s02.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            g8Var.d(tL_messages_stickerSet3, z9, false);
            g8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = o50Var.f48346r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f26983id;
            } else if (o50Var.g0(o50Var.f48348w) != null) {
                j3 = o50Var.g0(o50Var.f48348w).f26983id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f26983id != j3) {
                z11 = false;
            }
            g8Var.b(z11, false);
            return;
        }
        g8Var.b(false, false);
        g8Var.d(o50Var.f48346r, false, false);
        g8Var.setDeleteAction(new i40(this, 2));
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.f47751c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 5) {
                    FrameLayout n4Var = new org.telegram.ui.Cells.n4(context);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, n4Var, null);
                    frameLayout = n4Var;
                } else {
                    o50 o50Var = this.d;
                    l50 l50Var = new l50(o50Var, context);
                    o50Var.O = l50Var;
                    frameLayout = l50Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            FrameLayout g8Var = new org.telegram.ui.Cells.g8(context, 3);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, g8Var, null);
            frameLayout = g8Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(frameLayout);
    }
}
