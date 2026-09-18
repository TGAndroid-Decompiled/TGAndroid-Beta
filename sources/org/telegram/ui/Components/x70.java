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
    public final int f29879a;
    public final Object f29880b;

    public x70(Object obj, int i10) {
        this.f29879a = i10;
        this.f29880b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f29879a) {
            case 0:
                z70 z70Var = (z70) this.f29880b;
                z70Var.f30411b = true;
                z70Var.dismiss();
                return;
            case 1:
                ((g80) this.f29880b).dismiss();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.a0) this.f29880b).o(2);
                return;
            case 3:
                zb0 zb0Var = (zb0) this.f29880b;
                zb0.b(zb0Var.getContext(), zb0Var.f30465a, zb0Var.f30469n, false, zb0Var.f30473x, new xp(zb0Var, 29), zb0Var.f30467c);
                return;
            case 4:
                ((zc0) this.f29880b).onBackPressed();
                return;
            case 5:
                ae0.m((ae0) this.f29880b);
                return;
            case 6:
                if0 if0Var = (if0) this.f29880b;
                if0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.f25267y) {
                    jf0Var.N = t5Var.getCurrentColor();
                } else {
                    jf0Var.O = t5Var.getCurrentColor();
                }
                vz vzVar = jf0Var.f25250l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                jf0Var.g();
                return;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.f29880b).f27023a.f27290y.url)));
                return;
            case 8:
                fg0 fg0Var = (fg0) this.f29880b;
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = fg0Var.f23932r;
                    if (qf0Var != null) {
                        if (qf0Var.G) {
                            qf0Var.f();
                        } else {
                            qf0Var.g();
                        }
                    } else {
                        h71 h71Var = photoViewer.F2;
                        if (h71Var != null) {
                            if (h71Var.y()) {
                                h71Var.B();
                            } else {
                                h71Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    fg0.f23914p0.z();
                    return;
                }
                return;
            case 9:
                og0 og0Var = (og0) this.f29880b;
                og0Var.getClass();
                lg0 lg0Var = (lg0) og0Var;
                mg0 mg0Var = lg0Var.e;
                pg0 pg0Var = (pg0) lg0Var.getTag(R.id.object_tag);
                if (pg0Var.f27026b.size() > 15) {
                    boolean z10 = pg0Var.e;
                    pg0Var.e = !z10;
                    if (!z10) {
                        pg0Var.f27028f = 10;
                    }
                    mg0Var.f26147s.O(lg0Var);
                    mg0Var.f26147s.f27302c.X(true);
                    return;
                }
                return;
            case 10:
                ((bm0) this.f29880b).onBackPressed();
                return;
            case 11:
                wm0 wm0Var = ((vm0) this.f29880b).f28831c;
                et.n(wm0Var.F, wm0Var.G);
                return;
            case 12:
                ci.h2 h2Var = ((xm0) this.f29880b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                return;
            case 13:
                jn0 jn0Var = (jn0) this.f29880b;
                jn0Var.getClass();
                new rg.x0(jn0Var.f25359b, 24, true).show();
                return;
            case 14:
                ((zn0) this.f29880b).R(false);
                return;
            case 15:
                nq0 nq0Var = ((lq0) this.f29880b).f25967s;
                ArrayList arrayList = nq0Var.f26523s;
                if (!arrayList.isEmpty()) {
                    nq0Var.f26522r = TextUtils.join(" ", arrayList).toString();
                    nq0Var.f26521n = false;
                    nq0Var.d();
                    nq0Var.f26524w = null;
                    if (nq0Var.f26518b != 0) {
                        nq0Var.f26518b = 0;
                        mq0 mq0Var = nq0Var.H;
                        if (mq0Var != null) {
                            ((org.telegram.ui.yv) mq0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                zu0 zu0Var = ((it0) this.f29880b).f25031f;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) zu0Var.f30659v1.getParentLayout()).r();
                    return;
                }
                return;
            case 17:
                ((kq0) this.f29880b).run();
                return;
            case 18:
                ((zw0) this.f29880b).f30676b.getImageReceiver().startAnimation();
                return;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.f29880b, 100L);
                return;
            case 20:
                ((EditTextBoldCursor) this.f29880b).setText("");
                return;
            case 21:
                o11 o11Var = ((q11) this.f29880b).f27194b;
                o11Var.setText("");
                AndroidUtilities.showKeyboard(o11Var);
                return;
            case 22:
                ((a21) this.f29880b).f22298b.getImageReceiver().startAnimation();
                return;
            case 23:
                ((w31) this.f29880b).dismiss();
                return;
            case 24:
                org.telegram.ui.bo boVar = ((org.telegram.ui.al) this.f29880b).f31916s;
                if (!boVar.getUserConfig().isPremium() && ((chat = boVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + boVar.a(), 14).commit();
                    boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 13, false));
                } else {
                    boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a());
                }
                boVar.Qc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29880b).getSwipeBack().b(true);
                return;
        }
    }
}
