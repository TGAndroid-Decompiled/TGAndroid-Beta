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
public final class hg implements qx {
    public final ChatActivityEnterView f35730a;

    public hg(ChatActivityEnterView chatActivityEnterView) {
        this.f35730a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f35730a.f32756p4;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10, org.telegram.messenger.ef efVar, boolean z11) {
        ug ugVar;
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        ug ugVar2 = chatActivityEnterView.G0;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && bnVar != null && rmVar.f51750f) {
            bnVar.yc();
        } else if (c() && i7 == 0) {
            b5.J(chatActivityEnterView.E3, bnVar.a(), new org.telegram.ui.sp(this, view, obj, str, obj2, efVar, z11), chatActivityEnterView.M4);
        } else if (chatActivityEnterView.H0 > 0 && !c()) {
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                if (view != null) {
                    ugVar = view;
                } else {
                    ugVar = ugVar2;
                }
                mgVar.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar2.f40370c).getText(), true);
            }
        } else {
            b5.X(chatActivityEnterView.R, 1, chatActivityEnterView.G3, new zd(this, obj, efVar, z10, i7, i10, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f35730a.G3;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.f35730a.F3;
        if (bnVar != null && bnVar.S6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.f35730a.F3;
        if (bnVar != null && bnVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        gg ggVar = chatActivityEnterView.Q3;
        if (ggVar != null && !ggVar.J) {
            ggVar.f40555o1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = chatActivityEnterView.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
        if (g2Var2 != null && chatActivityEnterView.E3 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f28512id = stickerSet.f28519id;
            }
            jw0 jw0Var = new jw0(chatActivityEnterView.E3, g2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.M4);
            g2Var2.showDialog(jw0Var);
            if (z10) {
                jw0Var.O0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            PhotoViewer.p1().J2(null, bnVar, bnVar.Ba);
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
                efVar.f27962a = null;
                efVar.f27963b = true;
                arrayList.add(efVar);
                PhotoViewer.p1().g2(arrayList, 0, 12, false, new fg(this, obj, obj2, efVar), chatActivityEnterView.F3);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f35730a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        if (chatActivityEnterView.G3 == org.telegram.messenger.i10.i(chatActivityEnterView.R).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.E3, stickerSetCovered, 0, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void i(int i7) {
        boolean z10;
        int i10 = ChatActivityEnterView.f32633s7;
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        chatActivityEnterView.R1(i7, true);
        if (i7 != 0) {
            if (i7 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.S1(true, true, false, z10);
        }
        if (chatActivityEnterView.o4 && chatActivityEnterView.H2 == 2) {
            chatActivityEnterView.Q();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        TextView textView = chatActivityEnterView.U6;
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
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        EditText editText = chatActivityEnterView.U6;
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
            chatActivityEnterView.I3 = 2;
            CharSequence m10 = org.telegram.messenger.j6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        } finally {
            chatActivityEnterView.I3 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, int i7) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        ug ugVar = chatActivityEnterView.G0;
        if (!chatActivityEnterView.f32759p7) {
            gg ggVar = chatActivityEnterView.Q3;
            if (ggVar != null) {
                ggVar.dismiss();
                chatActivityEnterView.Q3 = null;
            }
            if (chatActivityEnterView.H0 > 0 && !c()) {
                mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    if (view == null) {
                        view = ugVar;
                    }
                    mgVar.s1(view, ((org.telegram.ui.ActionBar.n5) ugVar.f40370c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f32756p4) {
                if (chatActivityEnterView.H2 != 0) {
                    chatActivityEnterView.R1(0, true);
                    eg egVar = chatActivityEnterView.V0;
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
                                    j3 = inputStickerSet.f28512id;
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    egVar.s(j3, true);
                    chatActivityEnterView.V0.A();
                }
                chatActivityEnterView.S1(false, true, false, true);
            }
            chatActivityEnterView.d(document, str, obj, bjVar, false, z10, i7, 0);
            if (org.telegram.messenger.n5.C(chatActivityEnterView.G3) && org.telegram.messenger.fj.s3(document, false)) {
                org.telegram.messenger.mp.u1(chatActivityEnterView.S.f23343a).C4(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null && (activity = chatActivityEnterView.E3) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.M4);
            String N0 = org.telegram.messenger.gd.N0(2131752056, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131752057, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new b0(this, 16));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            bnVar.showDialog(t1Var);
        }
    }

    @Override
    public final void o(j41 j41Var) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.ui.ActionBar.g2 g2Var = chatActivityEnterView.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
        if (g2Var2 != null) {
            chatActivityEnterView.Q3 = new gg(this, chatActivityEnterView.getContext(), g2Var2, j41Var, chatActivityEnterView.M4);
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                mgVar.w(true);
            }
            g2Var2.showDialog(chatActivityEnterView.Q3);
        }
    }

    @Override
    public final float p() {
        return this.f35730a.f32813x0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f35730a.F3;
        if (g2Var == null) {
            g2Var = LaunchActivity.Q();
        }
        g2Var.showDialog(new ug.y0(g2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).k2(chatActivityEnterView.E3, stickerSetCovered, 2, chatActivityEnterView.F3, false, false);
    }

    @Override
    public final void s(int i7) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        chatActivityEnterView.P3.N();
        mg mgVar = chatActivityEnterView.P3;
        if (i7 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        mgVar.n2(z10);
        chatActivityEnterView.post(chatActivityEnterView.f32705i4);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.bn bnVar = this.f35730a.F3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f35730a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i7, int i10) {
        B(view, obj, str, obj2, z10, i7, i10, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.bn bnVar = this.f35730a.F3;
        if (bnVar != null) {
            bnVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j3, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.U6;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.F0;
        }
        org.telegram.messenger.g0.g3(new di.m(this, editTextBoldCursor, str, document, j3, z10));
    }

    @Override
    public final void y(long j3) {
        ChatActivityEnterView chatActivityEnterView = this.f35730a;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (bnVar != null) {
            if (org.telegram.messenger.g0.Q1()) {
                chatActivityEnterView.L0(false);
            }
            org.telegram.ui.n50 n50Var = new org.telegram.ui.n50(j3);
            n50Var.j0(chatActivityEnterView.T2);
            bnVar.presentFragment(n50Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f35730a.H2 != 0) {
            return true;
        }
        return false;
    }
}
