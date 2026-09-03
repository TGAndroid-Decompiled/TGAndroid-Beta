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
public final class l70 extends org.telegram.ui.Components.rl0 {
    public final Context f38563c;
    public final n70 d;

    public l70(n70 n70Var, Context context) {
        this.d = n70Var;
        this.f38563c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.D;
    }

    @Override
    public final int j(int i10) {
        n70 n70Var = this.d;
        if ((i10 >= n70Var.B && i10 < n70Var.C) || i10 == n70Var.G) {
            return 0;
        }
        if (i10 != n70Var.f39219y && i10 != n70Var.E) {
            if (i10 != n70Var.f39218x && i10 != n70Var.H) {
                if (i10 != n70Var.F) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        boolean z4;
        long j10;
        int i12;
        int i13;
        n70 n70Var = this.d;
        boolean z10 = n70Var.K;
        int i14 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z11 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        k70 k70Var = (k70) view;
                        if (n70Var.G <= 0) {
                            z11 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = n70Var.f39215r;
                        k70Var.f38199b = z11;
                        org.telegram.ui.Components.xt xtVar = k70Var.f38198a;
                        j70 j70Var = k70Var.f38202f;
                        xtVar.removeTextChangedListener(j70Var);
                        if (tL_messages_stickerSet == null) {
                            xtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            xtVar.setText(str);
                            xtVar.setSelection(str.length());
                        }
                        xtVar.addTextChangedListener(j70Var);
                        return;
                    }
                    return;
                } else if (i10 == n70Var.E) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (z10) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    m4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == n70Var.f39218x) {
                if (z10) {
                    i12 = R.string.ChooseEmojiPackMy;
                } else {
                    i12 = R.string.ChooseStickerSetMy;
                }
                String string = LocaleController.getString(i12);
                int indexOf = string.indexOf("@stickers");
                if (indexOf != -1) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.h4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.a9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        ((org.telegram.ui.Cells.a9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.a9) view).setText(string);
                return;
            } else if (i10 == n70Var.H) {
                ((org.telegram.ui.Cells.a9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
        if (i10 != n70Var.G) {
            i11 = ((org.telegram.ui.ActionBar.p2) n70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(n70Var.c0());
            int i15 = i10 - n70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            k8Var.d(tL_messages_stickerSet3, z4, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = n70Var.f39215r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f20872id;
            } else if (n70Var.b0(n70Var.v) != null) {
                j10 = n70Var.b0(n70Var.v).f20872id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f20872id != j10) {
                z11 = false;
            }
            k8Var.b(z11, false);
            return;
        }
        k8Var.b(false, false);
        k8Var.d(n70Var.f39215r, false, false);
        k8Var.setDeleteAction(new f60(this, 3));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f38563c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                    frameLayout = m4Var;
                } else {
                    n70 n70Var = this.d;
                    k70 k70Var = new k70(n70Var, context);
                    n70Var.L = k70Var;
                    frameLayout = k70Var;
                }
            } else {
                FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
                a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7));
                frameLayout = a9Var;
            }
        } else {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            frameLayout = k8Var;
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(frameLayout);
    }
}
