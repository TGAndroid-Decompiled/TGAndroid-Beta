package org.telegram.ui.Components;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StickersActivity;
public final class fg implements rx {
    public final ChatActivityEnterView f35077a;

    public fg(ChatActivityEnterView chatActivityEnterView) {
        this.f35077a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f35077a.f32646n4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10, org.telegram.messenger.ef efVar, boolean z11) {
        tg tgVar;
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        tg tgVar2 = chatActivityEnterView.G0;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && bnVar != null && rmVar.f51655f) {
            bnVar.yc();
        } else if (c() && i7 == 0) {
            b5.J(chatActivityEnterView.C3, bnVar.a(), new org.telegram.ui.sp(this, view, obj, str, obj2, efVar, z11), chatActivityEnterView.K4);
        } else if (chatActivityEnterView.H0 > 0 && !c()) {
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                if (view != null) {
                    tgVar = view;
                } else {
                    tgVar = tgVar2;
                }
                kgVar.s1(tgVar, ((org.telegram.ui.ActionBar.n5) tgVar2.f39993c).getText(), true);
            }
        } else {
            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.E3, new yd(this, obj, efVar, z10, i7, i10, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f35077a.E3;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.f35077a.D3;
        if (bnVar != null && bnVar.S6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.f35077a.D3;
        if (bnVar != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        eg egVar = chatActivityEnterView.O3;
        if (egVar != null && !egVar.J) {
            egVar.f39900o1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = chatActivityEnterView.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        if (h2Var2 != null && chatActivityEnterView.C3 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f28425id = stickerSet.f28432id;
            }
            iw0 iw0Var = new iw0(chatActivityEnterView.C3, h2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.K4);
            h2Var2.showDialog(iw0Var);
            if (z10) {
                iw0Var.O0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
            if (obj instanceof TLRPC.Document) {
                org.telegram.messenger.w7.G(chatActivityEnterView.R);
                file = org.telegram.messenger.w7.I((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(org.telegram.messenger.w7.z(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
                efVar.f27848a = null;
                efVar.f27849b = true;
                arrayList.add(efVar);
                PhotoViewer.p1().f2(arrayList, 0, 12, false, new dg(this, obj, obj2, efVar), chatActivityEnterView.D3);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f35077a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        if (chatActivityEnterView.E3 == org.telegram.messenger.j10.i(chatActivityEnterView.R).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.C3, stickerSetCovered, 0, chatActivityEnterView.D3, false, false);
    }

    @Override
    public final void i(int i7) {
        boolean z10;
        int i10 = ChatActivityEnterView.f32538n7;
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        chatActivityEnterView.L1(i7, true);
        if (i7 != 0) {
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.M1(true, true, false, z10);
        }
        if (chatActivityEnterView.f32638m4 && chatActivityEnterView.F2 == 2) {
            chatActivityEnterView.Q();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        TextView textView = chatActivityEnterView.S6;
        if (textView == null) {
            textView = chatActivityEnterView.F0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        EditText editText = chatActivityEnterView.S6;
        if (editText == null) {
            editText = chatActivityEnterView.F0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.G3 = 2;
            CharSequence m10 = org.telegram.messenger.j6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.G3 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        tg tgVar = chatActivityEnterView.G0;
        if (!chatActivityEnterView.f32627k7) {
            eg egVar = chatActivityEnterView.O3;
            if (egVar != null) {
                egVar.dismiss();
                chatActivityEnterView.O3 = null;
            }
            if (chatActivityEnterView.H0 > 0 && !c()) {
                kg kgVar = chatActivityEnterView.N3;
                if (kgVar != null) {
                    if (view == null) {
                        view = tgVar;
                    }
                    kgVar.s1(view, ((org.telegram.ui.ActionBar.n5) tgVar.f39993c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f32646n4) {
                if (chatActivityEnterView.F2 != 0) {
                    chatActivityEnterView.L1(0, true);
                    cg cgVar = chatActivityEnterView.V0;
                    long j3 = -1;
                    if (document != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= document.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    j3 = inputStickerSet.f28425id;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    cgVar.s(j3, true);
                    chatActivityEnterView.V0.A();
                }
                chatActivityEnterView.M1(false, true, false, true);
            }
            chatActivityEnterView.d(document, str, obj, bjVar, false, z10, i7, 0);
            if (org.telegram.messenger.n5.C(chatActivityEnterView.E3) && org.telegram.messenger.fj.s3(document, false)) {
                org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23221a).C4(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null && (activity = chatActivityEnterView.C3) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.K4);
            String M0 = org.telegram.messenger.gd.M0(2131752057, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131752058, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, null), new b0(this, 16));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            bnVar.showDialog(u1Var);
        }
    }

    @Override
    public final void o(h41 h41Var) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.ui.ActionBar.h2 h2Var = chatActivityEnterView.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
        if (h2Var2 != null) {
            chatActivityEnterView.O3 = new eg(this, chatActivityEnterView.getContext(), h2Var2, h41Var, chatActivityEnterView.K4);
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                kgVar.A(true);
            }
            h2Var2.showDialog(chatActivityEnterView.O3);
        }
    }

    @Override
    public final float p() {
        return this.f35077a.f32713x0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.h2 h2Var = this.f35077a.D3;
        if (h2Var == null) {
            h2Var = LaunchActivity.Q();
        }
        h2Var.showDialog(new ug.z0(h2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.C3, stickerSetCovered, 2, chatActivityEnterView.D3, false, false);
    }

    @Override
    public final void s(int i7) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        chatActivityEnterView.N3.V();
        kg kgVar = chatActivityEnterView.N3;
        if (i7 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        kgVar.n2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f32595g4);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.bn bnVar = this.f35077a.D3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f35077a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
        B(view, obj, str, obj2, z10, i7, i10, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.bn bnVar = this.f35077a.D3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.S6;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.g3(new di.m(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f35077a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.D3;
        if (bnVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.G0(false);
            }
            org.telegram.ui.n50 n50Var = new org.telegram.ui.n50(j3);
            n50Var.j0(chatActivityEnterView.R2);
            bnVar.presentFragment(n50Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f35077a.F2 != 0) {
            return true;
        }
        return false;
    }
}
