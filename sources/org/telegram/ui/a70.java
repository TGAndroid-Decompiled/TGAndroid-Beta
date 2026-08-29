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
public final class a70 extends org.telegram.ui.Components.il0 {
    public final Context f36447c;
    public final c70 d;

    public a70(c70 c70Var, Context context) {
        this.d = c70Var;
        this.f36447c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final int j(int i10) {
        c70 c70Var = this.d;
        if ((i10 >= c70Var.A && i10 < c70Var.B) || i10 == c70Var.F) {
            return 0;
        }
        if (i10 != c70Var.f37022y && i10 != c70Var.D) {
            if (i10 != c70Var.f37021x && i10 != c70Var.G) {
                if (i10 != c70Var.E) {
                    return 0;
                }
                return 5;
            }
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        boolean z10;
        long j10;
        int i12;
        int i13;
        c70 c70Var = this.d;
        boolean z11 = c70Var.J;
        int i14 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z12 = true;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 4) {
                    if (i14 == 5) {
                        z60 z60Var = (z60) view;
                        if (c70Var.F <= 0) {
                            z12 = false;
                        }
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = c70Var.f37018r;
                        z60Var.f45089b = z12;
                        org.telegram.ui.Components.st stVar = z60Var.f45088a;
                        y60 y60Var = z60Var.f45092f;
                        stVar.removeTextChangedListener(y60Var);
                        if (tL_messages_stickerSet == null) {
                            stVar.setText("");
                        } else {
                            String str = tL_messages_stickerSet.set.short_name;
                            stVar.setText(str);
                            stVar.setSelection(str.length());
                        }
                        stVar.addTextChangedListener(y60Var);
                        return;
                    }
                    return;
                } else if (i10 == c70Var.D) {
                    ((org.telegram.ui.Cells.k4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                    return;
                } else {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    if (z11) {
                        i13 = R.string.ChooseEmojiPackHeader;
                    } else {
                        i13 = R.string.ChooseStickerSetHeader;
                    }
                    k4Var.setText(LocaleController.getString(i13));
                    return;
                }
            } else if (i10 == c70Var.f37021x) {
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.k4(this, 3), indexOf, indexOf + 9, 18);
                        ((org.telegram.ui.Cells.y8) view).setText(spannableStringBuilder);
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        ((org.telegram.ui.Cells.y8) view).setText(string);
                        return;
                    }
                }
                ((org.telegram.ui.Cells.y8) view).setText(string);
                return;
            } else if (i10 == c70Var.G) {
                ((org.telegram.ui.Cells.y8) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
        if (i10 != c70Var.F) {
            i11 = ((org.telegram.ui.ActionBar.o2) c70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(c70Var.c0());
            int i15 = i10 - c70Var.A;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i15);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
            if (i15 != stickerSets.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i8Var.d(tL_messages_stickerSet3, z10, false);
            i8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = c70Var.f37018r;
            if (tL_messages_stickerSet4 != null) {
                j10 = tL_messages_stickerSet4.set.f22419id;
            } else if (c70Var.b0(c70Var.v) != null) {
                j10 = c70Var.b0(c70Var.v).f22419id;
            } else {
                j10 = 0;
            }
            if (tL_messages_stickerSet2.set.f22419id != j10) {
                z12 = false;
            }
            i8Var.b(z12, false);
            return;
        }
        i8Var.b(false, false);
        i8Var.d(c70Var.f37018r, false, false);
        i8Var.setDeleteAction(new t50(this, 3));
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.f36447c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 5) {
                    FrameLayout k4Var = new org.telegram.ui.Cells.k4(context);
                    k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    frameLayout = k4Var;
                } else {
                    c70 c70Var = this.d;
                    z60 z60Var = new z60(c70Var, context);
                    c70Var.K = z60Var;
                    frameLayout = z60Var;
                }
            } else {
                FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
                y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                frameLayout = y8Var;
            }
        } else {
            FrameLayout i8Var = new org.telegram.ui.Cells.i8(context, 3);
            i8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            frameLayout = i8Var;
        }
        frameLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(frameLayout);
    }
}
