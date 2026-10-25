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
public final class w80 implements View.OnClickListener {
    public final int f34385a;
    public final Object f34386b;

    public w80(Object obj, int i10) {
        this.f34385a = i10;
        this.f34386b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f34385a) {
            case 0:
                ((c90) this.f34386b).dismiss();
                return;
            case 1:
                rc0 rc0Var = (rc0) this.f34386b;
                rc0.b(rc0Var.getContext(), rc0Var.f32210a, rc0Var.f32214n, false, rc0Var.f32218x, new wa0(rc0Var, 2), rc0Var.f32212c);
                return;
            case 2:
                ((sd0) this.f34386b).onBackPressed();
                return;
            case 3:
                te0.m((te0) this.f34386b);
                return;
            case 4:
                dg0 dg0Var = (dg0) this.f34386b;
                dg0Var.getClass();
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                int intValue = ((Integer) y5Var.getTag()).intValue();
                eg0 eg0Var = dg0Var.d;
                if (intValue == eg0Var.f27858y) {
                    eg0Var.N = y5Var.getCurrentColor();
                } else {
                    eg0Var.O = y5Var.getCurrentColor();
                }
                e00 e00Var = eg0Var.f27841l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                eg0Var.g();
                return;
            case 5:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((lg0) this.f34386b).f30206a.f30581y.url)));
                return;
            case 6:
                ch0 ch0Var = (ch0) this.f34386b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    mg0 mg0Var = ch0Var.f27175r;
                    if (mg0Var != null) {
                        if (mg0Var.G) {
                            mg0Var.f();
                        } else {
                            mg0Var.g();
                        }
                    } else {
                        s81 s81Var = photoViewer.F2;
                        if (s81Var != null) {
                            if (s81Var.y()) {
                                s81Var.B();
                            } else {
                                s81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    ch0.f27157p0.z();
                    return;
                }
                return;
            case 7:
                lh0 lh0Var = (lh0) this.f34386b;
                lh0Var.getClass();
                ih0 ih0Var = (ih0) lh0Var;
                jh0 jh0Var = ih0Var.e;
                mh0 mh0Var = (mh0) ih0Var.getTag(R.id.object_tag);
                if (mh0Var.f30585b.size() > 15) {
                    boolean z10 = mh0Var.e;
                    mh0Var.e = !z10;
                    if (!z10) {
                        mh0Var.f30587f = 10;
                    }
                    jh0Var.f29647s.Q(ih0Var);
                    jh0Var.f29647s.f30974c.X(true);
                    return;
                }
                return;
            case 8:
                ((hn0) this.f34386b).onBackPressed();
                return;
            case 9:
                co0 co0Var = ((bo0) this.f34386b).f26921c;
                pt.n(co0Var.F, co0Var.G);
                return;
            case 10:
                fi.c2 c2Var = ((do0) this.f34386b).d;
                c2Var.setText("");
                AndroidUtilities.showKeyboard(c2Var);
                return;
            case 11:
                oo0 oo0Var = (oo0) this.f34386b;
                oo0Var.getClass();
                new tg.y0(oo0Var.f31335b, 24, true).show();
                return;
            case 12:
                ((ep0) this.f34386b).R(false);
                return;
            case 13:
                qr0 qr0Var = ((or0) this.f34386b).f31369s;
                ArrayList arrayList = qr0Var.f32009s;
                if (!arrayList.isEmpty()) {
                    qr0Var.f32008r = TextUtils.join(" ", arrayList).toString();
                    qr0Var.f32007n = false;
                    qr0Var.d();
                    qr0Var.f32010w = null;
                    if (qr0Var.f32004b != 0) {
                        qr0Var.f32004b = 0;
                        pr0 pr0Var = qr0Var.H;
                        if (pr0Var != null) {
                            ((org.telegram.ui.iv) pr0Var).i(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                aw0 aw0Var = ((ju0) this.f34386b).f29723f;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
                if (r2Var != null && r2Var.getParentLayout() != null) {
                    ((ActionBarLayout) aw0Var.f26702x1.getParentLayout()).r();
                    return;
                }
                return;
            case 15:
                ((mp0) this.f34386b).run();
                return;
            case 16:
                ((ey0) this.f34386b).f28013b.getImageReceiver().startAnimation();
                return;
            case 17:
                AndroidUtilities.runOnUIThread((di.k5) this.f34386b, 100L);
                return;
            case 18:
                ((EditTextBoldCursor) this.f34386b).setText("");
                return;
            case 19:
                w21 w21Var = ((y21) this.f34386b).f34912b;
                w21Var.setText("");
                AndroidUtilities.showKeyboard(w21Var);
                return;
            case 20:
                ((j31) this.f34386b).f29470b.getImageReceiver().startAnimation();
                return;
            case 21:
                ((f51) this.f34386b).dismiss();
                return;
            case 22:
                org.telegram.ui.un unVar = ((org.telegram.ui.tk) this.f34386b).f43852y;
                if (!unVar.getUserConfig().isPremium() && ((chat = unVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + unVar.a(), 14).commit();
                    unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 13, false));
                } else {
                    unVar.getMessagesController().getTranslateController().toggleTranslatingDialog(unVar.a());
                }
                unVar.dd(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f34386b).getSwipeBack().b(true);
                return;
        }
    }
}
