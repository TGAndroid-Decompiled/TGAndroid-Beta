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
public final class x70 implements View.OnClickListener {
    public final int f29898a;
    public final Object f29899b;

    public x70(Object obj, int i10) {
        this.f29898a = i10;
        this.f29899b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f29898a) {
            case 0:
                z70 z70Var = (z70) this.f29899b;
                z70Var.f30490b = true;
                z70Var.dismiss();
                return;
            case 1:
                ((g80) this.f29899b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.f29899b).o(2);
                return;
            case 3:
                zb0 zb0Var = (zb0) this.f29899b;
                zb0.b(zb0Var.getContext(), zb0Var.f30536a, zb0Var.f30540n, false, zb0Var.f30544x, new xp(zb0Var, 29), zb0Var.f30538c);
                return;
            case 4:
                ((zc0) this.f29899b).onBackPressed();
                return;
            case 5:
                ae0.m((ae0) this.f29899b);
                return;
            case 6:
                if0 if0Var = (if0) this.f29899b;
                if0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.f25339y) {
                    jf0Var.N = u5Var.getCurrentColor();
                } else {
                    jf0Var.O = u5Var.getCurrentColor();
                }
                vz vzVar = jf0Var.f25322l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                jf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.f29899b).f27030a.f27328y.url)));
                return;
            case 8:
                eg0 eg0Var = (eg0) this.f29899b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.f23653r;
                    if (qf0Var != null) {
                        if (qf0Var.G) {
                            qf0Var.f();
                        } else {
                            qf0Var.g();
                        }
                    } else {
                        g71 g71Var = photoViewer.F2;
                        if (g71Var != null) {
                            if (g71Var.y()) {
                                g71Var.B();
                            } else {
                                g71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    eg0.f23635p0.z();
                    return;
                }
                return;
            case 9:
                ng0 ng0Var = (ng0) this.f29899b;
                ng0Var.getClass();
                kg0 kg0Var = (kg0) ng0Var;
                lg0 lg0Var = kg0Var.e;
                og0 og0Var = (og0) kg0Var.getTag(R.id.object_tag);
                if (og0Var.f26778b.size() > 15) {
                    boolean z10 = og0Var.e;
                    og0Var.e = !z10;
                    if (!z10) {
                        og0Var.f26780f = 10;
                    }
                    lg0Var.f25919s.O(kg0Var);
                    lg0Var.f25919s.f27033c.X(true);
                    return;
                }
                return;
            case 10:
                ((am0) this.f29899b).onBackPressed();
                return;
            case 11:
                vm0 vm0Var = ((um0) this.f29899b).f28428c;
                et.n(vm0Var.F, vm0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((wm0) this.f29899b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                hn0 hn0Var = (hn0) this.f29899b;
                hn0Var.getClass();
                new rg.x0(hn0Var.f24729b, 24, true).show();
                return;
            case 14:
                ((yn0) this.f29899b).Q(false);
                return;
            case 15:
                mq0 mq0Var = ((kq0) this.f29899b).f25668s;
                ArrayList arrayList = mq0Var.f26233s;
                if (!arrayList.isEmpty()) {
                    mq0Var.f26232r = TextUtils.join(" ", arrayList).toString();
                    mq0Var.f26231n = false;
                    mq0Var.d();
                    mq0Var.f26234w = null;
                    if (mq0Var.f26228b != 0) {
                        mq0Var.f26228b = 0;
                        lq0 lq0Var = mq0Var.H;
                        if (lq0Var != null) {
                            ((org.telegram.ui.wv) lq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                yu0 yu0Var = ((ht0) this.f29899b).f24807f;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30389v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.f30389v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((jq0) this.f29899b).run();
                return;
            case 18:
                ((yw0) this.f29899b).f30416b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f29899b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f29899b).setText("");
                return;
            case 21:
                n11 n11Var = ((p11) this.f29899b).f26925b;
                n11Var.setText("");
                AndroidUtilities.showKeyboard(n11Var);
                return;
            case 22:
                ((z11) this.f29899b).f30445b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((v31) this.f29899b).dismiss();
                return;
            case 24:
                org.telegram.ui.bo boVar = ((org.telegram.ui.zk) this.f29899b).f40215s;
                if (!boVar.getUserConfig().isPremium() && ((chat = boVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + boVar.a(), 14).commit();
                    boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 13, false));
                } else {
                    boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a());
                }
                boVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29899b).getSwipeBack().b(true);
                return;
        }
    }
}
