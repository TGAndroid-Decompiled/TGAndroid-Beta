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
public final class k70 extends org.telegram.ui.Components.rl0 {
    public final Context f35585c;
    public final m70 d;

    public k70(m70 m70Var, Context context) {
        this.d = m70Var;
        this.f35585c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
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
        m70 m70Var = this.d;
        if ((i10 >= m70Var.B && i10 < m70Var.C) || i10 == m70Var.G) {
            return 0;
        }
        if (i10 != m70Var.f36225y && i10 != m70Var.E) {
            if (i10 != m70Var.f36224x && i10 != m70Var.H) {
                if (i10 != m70Var.F) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        boolean z4;
        long j10;
        int i12;
        int i13;
        m70 m70Var = this.d;
        boolean z10 = m70Var.K;
        int i14 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z11 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        j70 j70Var = (j70) view;
                        if (m70Var.G <= 0) {
                            z11 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = m70Var.f36221r;
                        j70Var.f35250b = z11;
                        org.telegram.ui.Components.vt vtVar = j70Var.f35249a;
                        i70 i70Var = j70Var.f35252f;
                        vtVar.removeTextChangedListener(i70Var);
                        if (tL_messages_stickerSet == null) {
                            vtVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            vtVar.setText(str);
                            vtVar.setSelection(str.length());
                        }
                        vtVar.addTextChangedListener(i70Var);
                        return;
                    }
                    return;
                } else if (i10 == m70Var.E) {
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
            } else if (i10 == m70Var.f36224x) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.a9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.a9) view).setText(string);
                return;
            } else if (i10 == m70Var.H) {
                ((org.telegram.ui.Cells.a9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
        if (i10 != m70Var.G) {
            i11 = ((org.telegram.ui.ActionBar.p2) m70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(m70Var.c0());
            int i15 = i10 - m70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            k8Var.d(tL_messages_stickerSet3, z4, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = m70Var.f36221r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f19211id;
            } else if (m70Var.b0(m70Var.v) != null) {
                j10 = m70Var.b0(m70Var.v).f19211id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f19211id != j10) {
                z11 = false;
            }
            k8Var.b(z11, false);
            return;
        }
        k8Var.b(false, false);
        k8Var.d(m70Var.f36221r, false, false);
        k8Var.setDeleteAction(new e60(this, 3));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f35585c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                    frameLayout = m4Var;
                } else {
                    m70 m70Var = this.d;
                    j70 j70Var = new j70(m70Var, context);
                    m70Var.L = j70Var;
                    frameLayout = j70Var;
                }
            } else {
                FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
                a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                frameLayout = a9Var;
            }
        } else {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            frameLayout = k8Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}
