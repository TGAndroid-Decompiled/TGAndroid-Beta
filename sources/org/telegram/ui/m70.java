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
public final class m70 extends org.telegram.ui.Components.ql0 {
    public final Context f35991c;
    public final o70 d;

    public m70(o70 o70Var, Context context) {
        this.d = o70Var;
        this.f35991c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
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
        o70 o70Var = this.d;
        if ((i10 >= o70Var.B && i10 < o70Var.C) || i10 == o70Var.G) {
            return 0;
        }
        if (i10 != o70Var.f36679y && i10 != o70Var.E) {
            if (i10 != o70Var.f36678x && i10 != o70Var.H) {
                if (i10 != o70Var.F) {
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
        o70 o70Var = this.d;
        boolean z10 = o70Var.K;
        int i14 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z11 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        l70 l70Var = (l70) view;
                        if (o70Var.G <= 0) {
                            z11 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = o70Var.f36675r;
                        l70Var.f35668b = z11;
                        org.telegram.ui.Components.ut utVar = l70Var.f35667a;
                        k70 k70Var = l70Var.f35670f;
                        utVar.removeTextChangedListener(k70Var);
                        if (tL_messages_stickerSet == null) {
                            utVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            utVar.setText(str);
                            utVar.setSelection(str.length());
                        }
                        utVar.addTextChangedListener(k70Var);
                        return;
                    }
                    return;
                } else if (i10 == o70Var.E) {
                    ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    if (z10) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    l4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == o70Var.f36678x) {
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
                        ((org.telegram.ui.Cells.z8) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.z8) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.z8) view).setText(string);
                return;
            } else if (i10 == o70Var.H) {
                ((org.telegram.ui.Cells.z8) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
        if (i10 != o70Var.G) {
            i11 = ((org.telegram.ui.ActionBar.p2) o70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(o70Var.c0());
            int i15 = i10 - o70Var.B;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            j8Var.d(tL_messages_stickerSet3, z4, false);
            j8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = o70Var.f36675r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f19186id;
            } else if (o70Var.b0(o70Var.v) != null) {
                j10 = o70Var.b0(o70Var.v).f19186id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f19186id != j10) {
                z11 = false;
            }
            j8Var.b(z11, false);
            return;
        }
        j8Var.b(false, false);
        j8Var.d(o70Var.f36675r, false, false);
        j8Var.setDeleteAction(new g60(this, 3));
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f35991c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
                    l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                    frameLayout = l4Var;
                } else {
                    o70 o70Var = this.d;
                    l70 l70Var = new l70(o70Var, context);
                    o70Var.L = l70Var;
                    frameLayout = l70Var;
                }
            } else {
                FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
                z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                frameLayout = z8Var;
            }
        } else {
            FrameLayout j8Var = new org.telegram.ui.Cells.j8(context, 3);
            j8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            frameLayout = j8Var;
        }
        frameLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(frameLayout);
    }
}
