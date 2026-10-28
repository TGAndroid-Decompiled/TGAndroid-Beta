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
public final class x80 implements View.OnClickListener {
    public final int f34699a;
    public final Object f34700b;

    public x80(Object obj, int i10) {
        this.f34699a = i10;
        this.f34700b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f34699a) {
            case 0:
                ((d90) this.f34700b).dismiss();
                return;
            case 1:
                sc0 sc0Var = (sc0) this.f34700b;
                sc0.b(sc0Var.getContext(), sc0Var.f32553a, sc0Var.f32557n, false, sc0Var.f32561x, new xa0(sc0Var, 2), sc0Var.f32555c);
                return;
            case 2:
                ((td0) this.f34700b).onBackPressed();
                return;
            case 3:
                ue0.m((ue0) this.f34700b);
                return;
            case 4:
                eg0 eg0Var = (eg0) this.f34700b;
                eg0Var.getClass();
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                int intValue = ((Integer) y5Var.getTag()).intValue();
                fg0 fg0Var = eg0Var.d;
                if (intValue == fg0Var.f28153y) {
                    fg0Var.N = y5Var.getCurrentColor();
                } else {
                    fg0Var.O = y5Var.getCurrentColor();
                }
                e00 e00Var = fg0Var.f28136l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                fg0Var.g();
                return;
            case 5:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((mg0) this.f34700b).f30537a.f30915y.url)));
                return;
            case 6:
                dh0 dh0Var = (dh0) this.f34700b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    ng0 ng0Var = dh0Var.f27462r;
                    if (ng0Var != null) {
                        if (ng0Var.G) {
                            ng0Var.f();
                        } else {
                            ng0Var.g();
                        }
                    } else {
                        t81 t81Var = photoViewer.F2;
                        if (t81Var != null) {
                            if (t81Var.y()) {
                                t81Var.B();
                            } else {
                                t81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    dh0.f27444p0.z();
                    return;
                }
                return;
            case 7:
                mh0 mh0Var = (mh0) this.f34700b;
                mh0Var.getClass();
                jh0 jh0Var = (jh0) mh0Var;
                kh0 kh0Var = jh0Var.e;
                nh0 nh0Var = (nh0) jh0Var.getTag(R.id.object_tag);
                if (nh0Var.f30920b.size() > 15) {
                    boolean z10 = nh0Var.e;
                    nh0Var.e = !z10;
                    if (!z10) {
                        nh0Var.f30922f = 10;
                    }
                    kh0Var.f29961s.Q(jh0Var);
                    kh0Var.f29961s.f31286c.X(true);
                    return;
                }
                return;
            case 8:
                ((in0) this.f34700b).onBackPressed();
                return;
            case 9:
                do0 do0Var = ((co0) this.f34700b).f27219c;
                pt.n(do0Var.F, do0Var.G);
                return;
            case 10:
                fi.c2 c2Var = ((eo0) this.f34700b).d;
                c2Var.setText("");
                AndroidUtilities.showKeyboard(c2Var);
                return;
            case 11:
                po0 po0Var = (po0) this.f34700b;
                po0Var.getClass();
                new tg.y0(po0Var.f31684b, 24, true).show();
                return;
            case 12:
                ((fp0) this.f34700b).R(false);
                return;
            case 13:
                rr0 rr0Var = ((pr0) this.f34700b).f31711s;
                ArrayList arrayList = rr0Var.f32332s;
                if (!arrayList.isEmpty()) {
                    rr0Var.f32331r = TextUtils.join(" ", arrayList).toString();
                    rr0Var.f32330n = false;
                    rr0Var.d();
                    rr0Var.f32333w = null;
                    if (rr0Var.f32327b != 0) {
                        rr0Var.f32327b = 0;
                        qr0 qr0Var = rr0Var.H;
                        if (qr0Var != null) {
                            ((org.telegram.ui.kv) qr0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                bw0 bw0Var = ((ku0) this.f34700b).f30033f;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
                if (r2Var != null && r2Var.getParentLayout() != null) {
                    ((ActionBarLayout) bw0Var.f26992x1.getParentLayout()).r();
                    return;
                }
                return;
            case 15:
                ((np0) this.f34700b).run();
                return;
            case 16:
                ((fy0) this.f34700b).f28313b.getImageReceiver().startAnimation();
                return;
            case 17:
                AndroidUtilities.runOnUIThread((di.k5) this.f34700b, 100L);
                return;
            case 18:
                ((EditTextBoldCursor) this.f34700b).setText("");
                return;
            case 19:
                x21 x21Var = ((z21) this.f34700b).f35225b;
                x21Var.setText("");
                AndroidUtilities.showKeyboard(x21Var);
                return;
            case 20:
                ((k31) this.f34700b).f29851b.getImageReceiver().startAnimation();
                return;
            case 21:
                ((g51) this.f34700b).dismiss();
                return;
            case 22:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.vk) this.f34700b).f44367y;
                if (!wnVar.getUserConfig().isPremium() && ((chat = wnVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + wnVar.a(), 14).commit();
                    wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 13, false));
                } else {
                    wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a());
                }
                wnVar.hd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34700b).getSwipeBack().b(true);
                return;
        }
    }
}
