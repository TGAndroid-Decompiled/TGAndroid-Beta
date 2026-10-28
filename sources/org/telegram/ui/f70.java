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
public final class f70 extends org.telegram.ui.Components.mm0 {
    public final Context f39247c;
    public final h70 d;

    public f70(h70 h70Var, Context context) {
        this.d = h70Var;
        this.f39247c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
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
        h70 h70Var = this.d;
        if ((i10 >= h70Var.E && i10 < h70Var.F) || i10 == h70Var.J) {
            return 0;
        }
        if (i10 != h70Var.f39812y && i10 != h70Var.H) {
            if (i10 != h70Var.f39811x && i10 != h70Var.K) {
                if (i10 != h70Var.I) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13;
        h70 h70Var = this.d;
        boolean z11 = h70Var.N;
        int i14 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        e70 e70Var = (e70) view;
                        if (h70Var.J <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = h70Var.f39808r;
                        e70Var.f38770b = z12;
                        org.telegram.ui.Components.ju juVar = e70Var.f38769a;
                        d70 d70Var = e70Var.f38772f;
                        juVar.removeTextChangedListener(d70Var);
                        if (tL_messages_stickerSet == null) {
                            juVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            juVar.setText(str);
                            juVar.setSelection(str.length());
                        }
                        juVar.addTextChangedListener(d70Var);
                        return;
                    }
                    return;
                } else if (i10 == h70Var.H) {
                    ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    q4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == h70Var.f39811x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.i9) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        ((org.telegram.ui.Cells.i9) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.i9) view).setText(string);
                return;
            } else if (i10 == h70Var.K) {
                ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (i10 != h70Var.J) {
            i11 = ((org.telegram.ui.ActionBar.r2) h70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(h70Var.d0());
            int i15 = i10 - h70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            p8Var.d(tL_messages_stickerSet3, z10, false);
            p8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = h70Var.f39808r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f22055id;
            } else if (h70Var.c0(h70Var.v) != null) {
                j10 = h70Var.c0(h70Var.v).f22055id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f22055id != j10) {
                z12 = false;
            }
            p8Var.b(z12, false);
            return;
        }
        p8Var.b(false, false);
        p8Var.d(h70Var.f39808r, false, false);
        p8Var.setDeleteAction(new z50(this, 3));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f39247c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout q4Var = new org.telegram.ui.Cells.q4(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, null);
                    frameLayout = q4Var;
                } else {
                    h70 h70Var = this.d;
                    e70 e70Var = new e70(h70Var, context);
                    h70Var.O = e70Var;
                    frameLayout = e70Var;
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.i9(context);
            }
        } else {
            FrameLayout p8Var = new org.telegram.ui.Cells.p8(context, 3);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, p8Var, null);
            frameLayout = p8Var;
        }
        frameLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(frameLayout);
    }
}
