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
public final class q70 extends org.telegram.ui.Components.yl0 {
    public final Context f39728c;
    public final s70 d;

    public q70(s70 s70Var, Context context) {
        this.d = s70Var;
        this.f39728c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46542f == 0) {
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
        if (i10 != s70Var.f40370y && i10 != s70Var.H) {
            if (i10 != s70Var.f40369x && i10 != s70Var.K) {
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
        int i14 = c1Var.f46542f;
        View view = c1Var.f46538a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        p70 p70Var = (p70) view;
                        if (s70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = s70Var.f40366r;
                        p70Var.f39378b = z12;
                        org.telegram.ui.Components.eu euVar = p70Var.f39377a;
                        o70 o70Var = p70Var.f39381f;
                        euVar.removeTextChangedListener(o70Var);
                        if (tL_messages_stickerSet == null) {
                            euVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            euVar.setText(str);
                            euVar.setSelection(str.length());
                        }
                        euVar.addTextChangedListener(o70Var);
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
            } else if (i10 == s70Var.f40369x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        ((org.telegram.ui.Cells.e9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            } else if (i10 == s70Var.K) {
                ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        if (i10 != s70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.n2) s70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(s70Var.c0());
            int i15 = i10 - s70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            m8Var.d(tL_messages_stickerSet3, z10, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = s70Var.f40366r;
            if (tL_messages_stickerSet4 != null) {
                j3 = tL_messages_stickerSet4.set.f20074id;
            } else if (s70Var.b0(s70Var.v) != null) {
                j3 = s70Var.b0(s70Var.v).f20074id;
            } else {
                j3 = 0;
            }
            if (tL_messages_stickerSet2.set.f20074id != j3) {
                z12 = false;
            }
            m8Var.b(z12, false);
            return;
        }
        m8Var.b(false, false);
        m8Var.d(s70Var.f40366r, false, false);
        m8Var.setDeleteAction(new j60(this, 3));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f39728c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
                    m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
                    frameLayout = m4Var;
                } else {
                    s70 s70Var = this.d;
                    p70 p70Var = new p70(s70Var, context);
                    s70Var.O = p70Var;
                    frameLayout = p70Var;
                }
            } else {
                FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
                e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20791b7));
                frameLayout = e9Var;
            }
        } else {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
            frameLayout = m8Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(frameLayout);
    }
}
