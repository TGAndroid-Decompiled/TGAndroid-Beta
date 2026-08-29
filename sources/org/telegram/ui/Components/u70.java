package org.telegram.ui.Components;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PhotoViewer;
public final class u70 implements View.OnClickListener {
    public final int f33153a;
    public final Object f33154b;

    public u70(Object obj, int i10) {
        this.f33153a = i10;
        this.f33154b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f33153a) {
            case 0:
                w70 w70Var = (w70) this.f33154b;
                w70Var.f34342b = true;
                w70Var.dismiss();
                return;
            case 1:
                ((c80) this.f33154b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a0) this.f33154b).o(2);
                return;
            case 3:
                vb0 vb0Var = (vb0) this.f33154b;
                vb0.b(vb0Var.getContext(), vb0Var.f33513a, vb0Var.f33518n, false, vb0Var.f33522x, new rp(vb0Var, 29), vb0Var.f33515c);
                return;
            case 4:
                ((vc0) this.f33154b).onBackPressed();
                return;
            case 5:
                vd0.m((vd0) this.f33154b);
                return;
            case 6:
                df0 df0Var = (df0) this.f33154b;
                df0Var.getClass();
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                ef0 ef0Var = df0Var.d;
                if (intValue == ef0Var.f28055y) {
                    ef0Var.J = s5Var.getCurrentColor();
                } else {
                    ef0Var.K = s5Var.getCurrentColor();
                }
                qz qzVar = ef0Var.f28034h0;
                if (qzVar != null) {
                    qzVar.e(false, false, false);
                }
                ef0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((lf0) this.f33154b).f30303a.f30681y.url)));
                return;
            case 8:
                bg0 bg0Var = (bg0) this.f33154b;
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null) {
                    mf0 mf0Var = bg0Var.f27092r;
                    if (mf0Var != null) {
                        if (mf0Var.C) {
                            mf0Var.f();
                        } else {
                            mf0Var.g();
                        }
                    } else {
                        x61 x61Var = photoViewer.B2;
                        if (x61Var != null) {
                            if (x61Var.z()) {
                                x61Var.C();
                            } else {
                                x61Var.D();
                            }
                        } else {
                            return;
                        }
                    }
                    bg0.f27076l0.z();
                    return;
                }
                return;
            case 9:
                jg0 jg0Var = (jg0) this.f33154b;
                jg0Var.getClass();
                gg0 gg0Var = (gg0) jg0Var;
                hg0 hg0Var = gg0Var.f28881e;
                kg0 kg0Var = (kg0) gg0Var.getTag(R.id.object_tag);
                if (kg0Var.f30038b.size() > 15) {
                    boolean z10 = kg0Var.f30040e;
                    kg0Var.f30040e = !z10;
                    if (!z10) {
                        kg0Var.f30041f = 10;
                    }
                    hg0Var.f29177s.O(gg0Var);
                    hg0Var.f29177s.f30316c.X(true);
                    return;
                }
                return;
            case 10:
                ((yl0) this.f33154b).onBackPressed();
                return;
            case 11:
                tm0 tm0Var = ((sm0) this.f33154b).f32690c;
                xs.n(tm0Var.B, tm0Var.C);
                return;
            case 12:
                ig.f fVar = ((um0) this.f33154b).f33273e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                return;
            case 13:
                en0 en0Var = (en0) this.f33154b;
                en0Var.getClass();
                new cg.p1(en0Var.f28117b, 24, true).show();
                return;
            case 14:
                ((tn0) this.f33154b).Q(false);
                return;
            case 15:
                iq0 iq0Var = ((gq0) this.f33154b).f28964s;
                ArrayList arrayList = iq0Var.f29449s;
                if (!arrayList.isEmpty()) {
                    iq0Var.f29448r = TextUtils.join(" ", arrayList).toString();
                    iq0Var.f29447n = false;
                    iq0Var.d();
                    iq0Var.f29450w = null;
                    if (iq0Var.f29443b != 0) {
                        iq0Var.f29443b = 0;
                        hq0 hq0Var = iq0Var.D;
                        if (hq0Var != null) {
                            ((org.telegram.ui.kv) hq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                qu0 qu0Var = ((ys0) this.f33154b).f35129f;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) qu0Var.f32093r1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((fq0) this.f33154b).run();
                return;
            case 18:
                ((qw0) this.f33154b).f32120b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((lh.u4) this.f33154b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f33154b).setText("");
                return;
            case 21:
                f11 f11Var = ((h11) this.f33154b).f29033b;
                f11Var.setText("");
                AndroidUtilities.showKeyboard(f11Var);
                return;
            case 22:
                ((r11) this.f33154b).f32159b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((k31) this.f33154b).dismiss();
                return;
            case 24:
                org.telegram.ui.tn tnVar = ((org.telegram.ui.qk) this.f33154b).f41741s;
                if (!tnVar.getUserConfig().isPremium() && ((chat = tnVar.f42787e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + tnVar.a(), 14).commit();
                    tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 13, false));
                } else {
                    tnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(tnVar.a());
                }
                tnVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f33154b).getSwipeBack().b(true);
                return;
        }
    }
}
