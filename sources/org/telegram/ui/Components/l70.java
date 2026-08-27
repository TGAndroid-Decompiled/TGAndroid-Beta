package org.telegram.ui.Components;

import android.content.Intent;
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

public final class l70 implements View.OnClickListener {

    public final int f30316a;

    public final Object f30317b;

    public l70(Object obj, int i10) {
        this.f30316a = i10;
        this.f30317b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        switch (this.f30316a) {
            case 0:
                n70 n70Var = (n70) this.f30317b;
                n70Var.f30890b = true;
                n70Var.dismiss();
                break;
            case 1:
                ((t70) this.f30317b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f30317b).o(2);
                break;
            case 3:
                kb0 kb0Var = (kb0) this.f30317b;
                kb0.b(kb0Var.getContext(), kb0Var.f30052a, kb0Var.f30057n, false, kb0Var.f30061x, new lp(kb0Var, 29), kb0Var.f30054c);
                break;
            case 4:
                ((kc0) this.f30317b).onBackPressed();
                break;
            case 5:
                md0.m((md0) this.f30317b);
                break;
            case 6:
                ue0 ue0Var = (ue0) this.f30317b;
                ue0Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int iIntValue = ((Integer) r5Var.getTag()).intValue();
                ve0 ve0Var = ue0Var.d;
                if (iIntValue == ve0Var.f33411y) {
                    ve0Var.J = r5Var.getCurrentColor();
                } else {
                    ve0Var.K = r5Var.getCurrentColor();
                }
                jz jzVar = ve0Var.f33390h0;
                if (jzVar != null) {
                    jzVar.e(false, false, false);
                }
                ve0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cf0) this.f30317b).f27413a.f27747y.url)));
                break;
            case 8:
                sf0 sf0Var = (sf0) this.f30317b;
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null) {
                    df0 df0Var = sf0Var.f32431r;
                    if (df0Var == null) {
                        m61 m61Var = photoViewer.B2;
                        if (m61Var != null) {
                            if (m61Var.z()) {
                                m61Var.C();
                            } else {
                                m61Var.D();
                            }
                        }
                    } else if (df0Var.C) {
                        df0Var.f();
                    } else {
                        df0Var.g();
                    }
                    sf0.f32415l0.z();
                    break;
                }
                break;
            case 9:
                ag0 ag0Var = (ag0) this.f30317b;
                ag0Var.getClass();
                xf0 xf0Var = (xf0) ag0Var;
                yf0 yf0Var = xf0Var.f34612e;
                bg0 bg0Var = (bg0) xf0Var.getTag(R.id.object_tag);
                if (bg0Var.f27093b.size() > 15) {
                    boolean z10 = bg0Var.f27095e;
                    bg0Var.f27095e = !z10;
                    if (!z10) {
                        bg0Var.f27096f = 10;
                    }
                    yf0Var.f34893s.O(xf0Var);
                    yf0Var.f34893s.f27418c.X(true);
                    break;
                }
                break;
            case 10:
                ((ol0) this.f30317b).onBackPressed();
                break;
            case 11:
                jm0 jm0Var = ((im0) this.f30317b).f29408c;
                rs.n(jm0Var.B, jm0Var.C);
                break;
            case 12:
                gg.g gVar = ((km0) this.f30317b).f30149e;
                gVar.setText("");
                AndroidUtilities.showKeyboard(gVar);
                break;
            case 13:
                um0 um0Var = (um0) this.f30317b;
                um0Var.getClass();
                new ag.g2(um0Var.f33127b, 24, true).show();
                break;
            case 14:
                ((jn0) this.f30317b).Q(false);
                break;
            case 15:
                xp0 xp0Var = ((vp0) this.f30317b).f34030s;
                ArrayList arrayList = xp0Var.f34674s;
                if (!arrayList.isEmpty()) {
                    xp0Var.f34673r = TextUtils.join(" ", arrayList).toString();
                    xp0Var.f34672n = false;
                    xp0Var.d();
                    xp0Var.f34675w = null;
                    if (xp0Var.f34668b != 0) {
                        xp0Var.f34668b = 0;
                        wp0 wp0Var = xp0Var.D;
                        if (wp0Var != null) {
                            ((org.telegram.ui.mv) wp0Var).h(0);
                        }
                    }
                    break;
                }
                break;
            case 16:
                hu0 hu0Var = ((ps0) this.f30317b).f31661f;
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) hu0Var.f29145r1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((up0) this.f30317b).run();
                break;
            case 18:
                ((iw0) this.f30317b).f29504b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((jh.u4) this.f30317b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.f30317b).setText("");
                break;
            case 21:
                v01 v01Var = ((x01) this.f30317b).f34413b;
                v01Var.setText("");
                AndroidUtilities.showKeyboard(v01Var);
                break;
            case 22:
                ((h11) this.f30317b).f28899b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((b31) this.f30317b).dismiss();
                break;
            case 24:
                org.telegram.ui.rn rnVar = ((org.telegram.ui.pk) this.f30317b).f41373s;
                if (rnVar.getUserConfig().isPremium() || ((chat = rnVar.f42026e) != null && chat.autotranslation)) {
                    rnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(rnVar.a());
                } else {
                    MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).edit().putInt("dialog_show_translate_count" + rnVar.a(), 14).commit();
                    rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 13, false));
                }
                rnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30317b).getSwipeBack().b(true);
                break;
        }
    }
}
