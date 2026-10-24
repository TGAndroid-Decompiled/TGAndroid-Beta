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
public final class t80 implements View.OnClickListener {
    public final int f30756a;
    public final Object f30757b;

    public t80(Object obj, int i10) {
        this.f30756a = i10;
        this.f30757b = obj;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.f30756a) {
            case 0:
                ((z80) this.f30757b).dismiss();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.f30757b).o(2);
                return;
            case 2:
                tc0 tc0Var = (tc0) this.f30757b;
                tc0.b(tc0Var.getContext(), tc0Var.f30782a, tc0Var.f30786n, false, tc0Var.f30790x, new wb0(tc0Var, 1), tc0Var.f30784c);
                return;
            case 3:
                ((ud0) this.f30757b).onBackPressed();
                return;
            case 4:
                ve0.m((ve0) this.f30757b);
                return;
            case 5:
                fg0 fg0Var = (fg0) this.f30757b;
                fg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                gg0 gg0Var = fg0Var.d;
                if (intValue == gg0Var.f26687y) {
                    gg0Var.N = t5Var.getCurrentColor();
                } else {
                    gg0Var.O = t5Var.getCurrentColor();
                }
                c00 c00Var = gg0Var.f26670l0;
                if (c00Var != null) {
                    c00Var.d(false, false, false);
                }
                gg0Var.g();
                return;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ng0) this.f30757b).f28906a.f29278y.url)));
                return;
            case 7:
                ch0 ch0Var = (ch0) this.f30757b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    og0 og0Var = ch0Var.f25331r;
                    if (og0Var != null) {
                        if (og0Var.G) {
                            og0Var.f();
                        } else {
                            og0Var.g();
                        }
                    } else {
                        j81 j81Var = photoViewer.F2;
                        if (j81Var != null) {
                            if (j81Var.y()) {
                                j81Var.B();
                            } else {
                                j81Var.C();
                            }
                        } else {
                            return;
                        }
                    }
                    ch0.f25313p0.z();
                    return;
                }
                return;
            case 8:
                lh0 lh0Var = (lh0) this.f30757b;
                lh0Var.getClass();
                ih0 ih0Var = (ih0) lh0Var;
                jh0 jh0Var = ih0Var.e;
                mh0 mh0Var = (mh0) ih0Var.getTag(R.id.object_tag);
                if (mh0Var.f28600b.size() > 15) {
                    boolean z10 = mh0Var.e;
                    mh0Var.e = !z10;
                    if (!z10) {
                        mh0Var.f28602f = 10;
                    }
                    jh0Var.f27702s.Q(ih0Var);
                    jh0Var.f27702s.f28911c.X(true);
                    return;
                }
                return;
            case 9:
                ((bn0) this.f30757b).onBackPressed();
                return;
            case 10:
                wn0 wn0Var = ((vn0) this.f30757b).f31479c;
                lt.n(wn0Var.F, wn0Var.G);
                return;
            case 11:
                ei.e2 e2Var = ((xn0) this.f30757b).d;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                return;
            case 12:
                io0 io0Var = (io0) this.f30757b;
                io0Var.getClass();
                new sg.y0(io0Var.f27453b, 24, true).show();
                return;
            case 13:
                ((zo0) this.f30757b).P(false);
                return;
            case 14:
                mr0 mr0Var = ((kr0) this.f30757b).f28080s;
                ArrayList arrayList = mr0Var.f28683s;
                if (!arrayList.isEmpty()) {
                    mr0Var.f28682r = TextUtils.join(" ", arrayList).toString();
                    mr0Var.f28681n = false;
                    mr0Var.d();
                    mr0Var.f28684w = null;
                    if (mr0Var.f28678b != 0) {
                        mr0Var.f28678b = 0;
                        lr0 lr0Var = mr0Var.H;
                        if (lr0Var != null) {
                            ((org.telegram.ui.jv) lr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 15:
                wv0 wv0Var = ((fu0) this.f30757b).f26436f;
                org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) wv0Var.f32410v1.getParentLayout()).r();
                    return;
                }
                return;
            case 16:
                ((jr0) this.f30757b).run();
                return;
            case 17:
                ((vx0) this.f30757b).f32067b.getImageReceiver().startAnimation();
                return;
            case 18:
                AndroidUtilities.runOnUIThread((ci.k5) this.f30757b, 100L);
                return;
            case 19:
                ((EditTextBoldCursor) this.f30757b).setText("");
                return;
            case 20:
                n21 n21Var = ((p21) this.f30757b).f29456b;
                n21Var.setText("");
                AndroidUtilities.showKeyboard(n21Var);
                return;
            case 21:
                ((z21) this.f30757b).f33136b.getImageReceiver().startAnimation();
                return;
            case 22:
                ((x41) this.f30757b).dismiss();
                return;
            case 23:
                org.telegram.ui.sn snVar = ((org.telegram.ui.sk) this.f30757b).f41419y;
                if (!snVar.getUserConfig().isPremium() && ((chat = snVar.e) == null || !chat.autotranslation)) {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(i10).edit();
                    edit.putInt("dialog_show_translate_count" + snVar.a(), 14).commit();
                    snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 13, false));
                } else {
                    snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a());
                }
                snVar.Xc(true);
                return;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f30757b).getSwipeBack().b(true);
                return;
        }
    }
}
