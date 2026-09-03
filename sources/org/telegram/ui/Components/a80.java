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
public final class a80 implements View.OnClickListener {
    public final int f23338a;
    public final Object f23339b;

    public a80(Object obj, int i10) {
        this.f23338a = i10;
        this.f23339b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f23338a) {
            case 0:
                c80 c80Var = (c80) this.f23339b;
                c80Var.f23874b = true;
                c80Var.dismiss();
                return;
            case 1:
                ((i80) this.f23339b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f23339b).o(2);
                return;
            case 3:
                bc0 bc0Var = (bc0) this.f23339b;
                bc0.b(bc0Var.getContext(), bc0Var.f23621a, bc0Var.f23625n, false, bc0Var.f23629x, new up(bc0Var, 29), bc0Var.f23623c);
                return;
            case 4:
                ((cd0) this.f23339b).onBackPressed();
                return;
            case 5:
                ee0.m((ee0) this.f23339b);
                return;
            case 6:
                nf0 nf0Var = (nf0) this.f23339b;
                nf0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                of0 of0Var = nf0Var.d;
                if (intValue == of0Var.f27555y) {
                    of0Var.K = t5Var.getCurrentColor();
                } else {
                    of0Var.L = t5Var.getCurrentColor();
                }
                vz vzVar = of0Var.f27535i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                of0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((vf0) this.f23339b).f29469a.f30246y.url)));
                return;
            case 8:
                mg0 mg0Var = (mg0) this.f23339b;
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null) {
                    wf0 wf0Var = mg0Var.f27052r;
                    if (wf0Var != null) {
                        if (wf0Var.D) {
                            wf0Var.f();
                        } else {
                            wf0Var.g();
                        }
                    } else {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            if (i71Var.y()) {
                                i71Var.B();
                            } else {
                                i71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    mg0.m0.z();
                    return;
                }
                return;
            case 9:
                ug0 ug0Var = (ug0) this.f23339b;
                ug0Var.getClass();
                rg0 rg0Var = (rg0) ug0Var;
                sg0 sg0Var = rg0Var.e;
                vg0 vg0Var = (vg0) rg0Var.getTag(R.id.object_tag);
                if (vg0Var.f29474b.size() > 15) {
                    boolean z4 = vg0Var.e;
                    vg0Var.e = !z4;
                    if (!z4) {
                        vg0Var.f29476f = 10;
                    }
                    sg0Var.f28741s.O(rg0Var);
                    sg0Var.f28741s.f30250c.X(true);
                    return;
                }
                return;
            case 10:
                ((hm0) this.f23339b).onBackPressed();
                return;
            case 11:
                cn0 cn0Var = ((bn0) this.f23339b).f23724c;
                at.n(cn0Var.C, cn0Var.D);
                return;
            case 12:
                kg.f fVar = ((dn0) this.f23339b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                return;
            case 13:
                nn0 nn0Var = (nn0) this.f23339b;
                nn0Var.getClass();
                new eg.o1(nn0Var.f27309b, 24, true).show();
                return;
            case 14:
                ((co0) this.f23339b).Q(false);
                return;
            case 15:
                qq0 qq0Var = ((oq0) this.f23339b).f27634s;
                ArrayList arrayList = qq0Var.f28243s;
                if (!arrayList.isEmpty()) {
                    qq0Var.f28242r = TextUtils.join(" ", arrayList).toString();
                    qq0Var.f28241n = false;
                    qq0Var.d();
                    qq0Var.f28244w = null;
                    if (qq0Var.f28238b != 0) {
                        qq0Var.f28238b = 0;
                        pq0 pq0Var = qq0Var.E;
                        if (pq0Var != null) {
                            ((org.telegram.ui.uv) pq0Var).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yu0 yu0Var = ((gt0) this.f23339b).f25236f;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.f31155s1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((nq0) this.f23339b).run();
                return;
            case 18:
                ((zw0) this.f23339b).f31483b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((nh.v4) this.f23339b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f23339b).setText("");
                return;
            case 21:
                q11 q11Var = ((s11) this.f23339b).f28640b;
                q11Var.setText("");
                AndroidUtilities.showKeyboard(q11Var);
                return;
            case 22:
                ((b21) this.f23339b).f23523b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((v31) this.f23339b).dismiss();
                return;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.yk) this.f23339b).f40294s;
                if (!znVar.getUserConfig().isPremium() && ((chat = znVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 13, false));
                } else {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                }
                znVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f23339b).getSwipeBack().b(true);
                return;
        }
    }
}
