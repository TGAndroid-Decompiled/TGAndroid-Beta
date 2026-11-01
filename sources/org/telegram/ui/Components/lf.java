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
public final class lf implements vx {
    public final ChatActivityEnterView f28144a;

    public lf(ChatActivityEnterView chatActivityEnterView) {
        this.f28144a = chatActivityEnterView;
    }

    @Override
    public final boolean A() {
        return this.f28144a.f23824z3;
    }

    public final void B(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11, org.telegram.messenger.ff ffVar, boolean z11) {
        ag agVar;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        ag agVar2 = chatActivityEnterView.F0;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && unVar != null && knVar.f38934f) {
            unVar.pc();
        } else if (c() && i10 == 0) {
            s4.L(chatActivityEnterView.O2, unVar.a(), new org.telegram.ui.oq(this, view, obj, str, obj2, ffVar, z11), chatActivityEnterView.W3);
        } else if (chatActivityEnterView.G0 > 0 && !c()) {
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                if (view != null) {
                    agVar = view;
                } else {
                    agVar = agVar2;
                }
                sfVar.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar2.f24393c).getText(), true);
            }
        } else {
            s4.Z(chatActivityEnterView.Q, 1, chatActivityEnterView.Q2, new jd(this, obj, ffVar, z10, i10, i11, z11, str, obj2));
        }
    }

    @Override
    public final long a() {
        return this.f28144a.Q2;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.un unVar = this.f28144a.P2;
        if (unVar != null && unVar.P6()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.un unVar = this.f28144a.P2;
        if (unVar != null && unVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void d(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        kf kfVar = chatActivityEnterView.f23677a3;
        if (kfVar != null && !kfVar.I) {
            kfVar.f27002k1.b(stickerSet, inputStickerSet);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = chatActivityEnterView.P2;
        if (k2Var == null) {
            k2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
        if (k2Var2 != null && chatActivityEnterView.O2 != null) {
            if (stickerSet != null) {
                inputStickerSet = new TLRPC.TL_inputStickerSetID();
                inputStickerSet.access_hash = stickerSet.access_hash;
                inputStickerSet.f19814id = stickerSet.f19821id;
            }
            dx0 dx0Var = new dx0(chatActivityEnterView.O2, k2Var2, inputStickerSet, null, chatActivityEnterView, chatActivityEnterView.W3);
            k2Var2.showDialog(dx0Var);
            if (z10) {
                dx0Var.N0();
            }
        }
    }

    @Override
    public final void e(Object obj, Object obj2) {
        File file;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            PhotoViewer.v1().N2(null, unVar, unVar.f42288xa);
            if (obj instanceof TLRPC.Document) {
                org.telegram.messenger.b8.G(chatActivityEnterView.Q);
                file = org.telegram.messenger.b8.I((TLRPC.Document) obj);
            } else {
                file = null;
            }
            if (file != null) {
                File file2 = new File(org.telegram.messenger.b8.z(4), file.getName());
                if (!file.exists()) {
                    if (file2.exists()) {
                        file = file2;
                    } else {
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.f14602a = null;
                ffVar.f14603b = true;
                arrayList.add(ffVar);
                PhotoViewer.v1().j2(arrayList, 0, 12, false, new jf(this, obj, obj2, ffVar), chatActivityEnterView.P2);
            }
        }
    }

    @Override
    public final int f() {
        int threadMessageId;
        threadMessageId = this.f28144a.getThreadMessageId();
        return threadMessageId;
    }

    @Override
    public final boolean g() {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        if (chatActivityEnterView.Q2 == org.telegram.messenger.e20.i(chatActivityEnterView.Q).e()) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.messenger.vi.b0(chatActivityEnterView.Q).f2(chatActivityEnterView.O2, stickerSetCovered, 0, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        int i11 = ChatActivityEnterView.f23673s5;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        chatActivityEnterView.k1(i10, true);
        if (i10 != 0) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            chatActivityEnterView.l1(true, true, false, z10);
        }
        if (chatActivityEnterView.y3 && chatActivityEnterView.R1 == 2) {
            chatActivityEnterView.G();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        TextView textView = chatActivityEnterView.X4;
        if (textView == null) {
            textView = chatActivityEnterView.E0;
        }
        if (textView == null || textView.length() == 0) {
            return false;
        }
        textView.dispatchKeyEvent(new KeyEvent(0, 67));
        return true;
    }

    @Override
    public final void l(String str) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        EditText editText = chatActivityEnterView.X4;
        if (editText == null) {
            editText = chatActivityEnterView.E0;
        }
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (selectionEnd < 0) {
            selectionEnd = 0;
        }
        try {
            chatActivityEnterView.S2 = 2;
            CharSequence m10 = org.telegram.messenger.k6.m(str, editText.getPaint().getFontMetricsInt(), false, null, 0);
            editText.setText(editText.getText().insert(selectionEnd, m10));
            int length = selectionEnd + m10.length();
            editText.setSelection(length, length);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        } finally {
            chatActivityEnterView.S2 = 0;
        }
    }

    @Override
    public final void m(View view, TLRPC.Document document, String str, Object obj, org.telegram.messenger.gj gjVar, boolean z10, int i10) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        ag agVar = chatActivityEnterView.F0;
        if (!chatActivityEnterView.p5) {
            kf kfVar = chatActivityEnterView.f23677a3;
            if (kfVar != null) {
                kfVar.dismiss();
                chatActivityEnterView.f23677a3 = null;
            }
            if (chatActivityEnterView.G0 > 0 && !c()) {
                sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    if (view == null) {
                        view = agVar;
                    }
                    sfVar.e1(view, ((org.telegram.ui.ActionBar.u5) agVar.f24393c).getText(), true);
                    return;
                }
                return;
            }
            if (chatActivityEnterView.f23824z3) {
                if (chatActivityEnterView.R1 != 0) {
                    chatActivityEnterView.k1(0, true);
                    gf gfVar = chatActivityEnterView.U0;
                    long j10 = -1;
                    if (document != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= document.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                                if (!(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                    j10 = inputStickerSet.f19814id;
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    gfVar.s(j10, true);
                    chatActivityEnterView.U0.B();
                }
                chatActivityEnterView.l1(false, true, false, true);
            }
            chatActivityEnterView.a(document, str, obj, gjVar, false, z10, i10, 0);
            if (org.telegram.messenger.o5.C(chatActivityEnterView.Q2) && org.telegram.messenger.kj.s3(document, false)) {
                org.telegram.messenger.wp.r1(chatActivityEnterView.R.f15043a).q4(obj, document);
            }
        }
    }

    @Override
    public final void n() {
        Activity activity;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null && (activity = chatActivityEnterView.O2) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, chatActivityEnterView.W3);
            String L0 = org.telegram.messenger.dd.L0(2131752068, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131752069, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new t(this, 17));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            unVar.showDialog(x1Var);
        }
    }

    @Override
    public final void o(x41 x41Var) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.ui.ActionBar.k2 k2Var = chatActivityEnterView.P2;
        if (k2Var == null) {
            k2Var = LaunchActivity.Q();
        }
        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
        if (k2Var2 != null) {
            chatActivityEnterView.f23677a3 = new kf(this, chatActivityEnterView.getContext(), k2Var2, x41Var, chatActivityEnterView.W3);
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                sfVar.B(true);
            }
            k2Var2.showDialog(chatActivityEnterView.f23677a3);
        }
    }

    @Override
    public final float p() {
        return this.f28144a.f23805w0;
    }

    @Override
    public final void q() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f28144a.P2;
        if (k2Var == null) {
            k2Var = LaunchActivity.Q();
        }
        k2Var.showDialog(new kg.i1(k2Var, 11, false));
    }

    @Override
    public final void r(TLRPC.StickerSetCovered stickerSetCovered) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.messenger.vi.b0(chatActivityEnterView.Q).f2(chatActivityEnterView.O2, stickerSetCovered, 2, chatActivityEnterView.P2, false, false);
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        chatActivityEnterView.Z2.N();
        sf sfVar = chatActivityEnterView.Z2;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        sfVar.U1(z10);
        chatActivityEnterView.post(chatActivityEnterView.f23787s3);
    }

    @Override
    public final void t(ArrayList arrayList) {
        org.telegram.ui.un unVar = this.f28144a.P2;
        if (unVar != null) {
            unVar.presentFragment(new StickersActivity(5, arrayList));
        }
    }

    @Override
    public final void u() {
        this.f28144a.invalidate();
    }

    @Override
    public final void v(View view, Object obj, String str, Object obj2, boolean z10, int i10, int i11) {
        B(view, obj, str, obj2, z10, i10, i11, null, false);
    }

    @Override
    public final void w() {
        org.telegram.ui.un unVar = this.f28144a.P2;
        if (unVar != null) {
            unVar.presentFragment(new StickersActivity(0, null));
        }
    }

    @Override
    public final void x(long j10, TLRPC.Document document, String str, boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        EditTextBoldCursor editTextBoldCursor = chatActivityEnterView.X4;
        if (editTextBoldCursor == null) {
            editTextBoldCursor = chatActivityEnterView.E0;
        }
        org.telegram.messenger.i0.g3(new hf(this, editTextBoldCursor, str, document, j10, z10));
    }

    @Override
    public final void y(long j10) {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (unVar != null) {
            if (org.telegram.messenger.i0.Q1()) {
                chatActivityEnterView.i0(false);
            }
            org.telegram.ui.j60 j60Var = new org.telegram.ui.j60(j10);
            j60Var.j0(chatActivityEnterView.f23696d2);
            unVar.presentFragment(j60Var);
        }
    }

    @Override
    public final boolean z() {
        if (this.f28144a.R1 != 0) {
            return true;
        }
        return false;
    }
}
