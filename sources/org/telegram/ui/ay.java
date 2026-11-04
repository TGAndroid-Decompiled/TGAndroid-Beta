package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ay extends org.telegram.ui.Components.sj0 {
    public final cy f43857c;

    public ay(cy cyVar) {
        this.f43857c = cyVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f43857c.H;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        cy cyVar = this.f43857c;
        if (i3 != cyVar.O && i3 != cyVar.K) {
            if (i3 == cyVar.I) {
                return 3;
            }
            if (i3 >= cyVar.M && i3 < cyVar.N) {
                return 4;
            }
            if (i3 != cyVar.L && i3 != cyVar.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        cy cyVar = this.f43857c;
        ArrayList arrayList = cyVar.f44479f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = cyVar.d;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 == 0) {
            cyVar.Q = (rx) view;
            cyVar.l0();
        } else if (i10 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == cyVar.O) {
                y8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131750748, null));
                    return;
                } else {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131750747, null));
                    return;
                }
            }
            y8Var.setFixedSize(12);
        } else {
            int i11 = 1;
            if (i10 == 3) {
                ux uxVar = (ux) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ci.ec ecVar = uxVar.h;
                org.telegram.ui.ActionBar.k5 k5Var = uxVar.f50338c;
                TextView textView = uxVar.f50341n;
                ImageView imageView = uxVar.d;
                ci.ec ecVar2 = uxVar.f50340f;
                uxVar.f50343s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                k5Var.l(str3, false);
                float f11 = uxVar.f50344w;
                if (str3 == null) {
                    i11 = 0;
                }
                if (f11 != i11) {
                    ValueAnimator valueAnimator = uxVar.f50345x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        uxVar.f50345x = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    uxVar.f50344w = f10;
                    tx txVar = uxVar.f50339e;
                    txVar.d = f10;
                    txVar.invalidate();
                    ecVar2.setAlpha(uxVar.f50344w);
                    uxVar.h.setAlpha(uxVar.f50344w);
                    imageView.setAlpha(uxVar.f50344w);
                    textView.setAlpha(1.0f - uxVar.f50344w);
                    k5Var.setAlpha(uxVar.f50344w);
                    uxVar.f50337b.setAlpha(1.0f - uxVar.f50344w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        ecVar2.setVisibility(8);
                        ecVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    ecVar2.setVisibility(0);
                    ecVar.setVisibility(0);
                }
            } else if (i10 == 4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                Long l10 = (Long) cyVar.h.get(i3 - cyVar.M);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User a22 = cyVar.getMessagesController().a2(l10);
                    if (a22 != null) {
                        str = org.telegram.messenger.l10.p(a22);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = cyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null) {
                        str = M0.title;
                        if (M0.participants_count != 0) {
                            if (org.telegram.messenger.t3.V(M0)) {
                                str2 = org.telegram.messenger.bd.H(',', "Subscribers", M0.participants_count);
                                chat = M0;
                            } else {
                                str2 = org.telegram.messenger.bd.H(',', "Members", M0.participants_count);
                                chat = M0;
                            }
                        } else if (org.telegram.messenger.t3.V(M0)) {
                            str2 = org.telegram.messenger.bd.N0("ChannelPublic");
                            chat = M0;
                        } else {
                            str2 = org.telegram.messenger.bd.N0("MegaPublic");
                            chat = M0;
                        }
                    } else {
                        str = null;
                        str2 = null;
                        chat = M0;
                    }
                }
                if (arrayList.contains(l10)) {
                    h4Var.setForbiddenCheck(false);
                    h4Var.c(cyVar.f44478e.contains(l10), false);
                } else {
                    h4Var.setForbiddenCheck(true);
                    h4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.bd.M0(2131750772, null);
                        } else {
                            str2 = org.telegram.messenger.bd.M0(2131750740, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.t3.V(chat)) {
                            str2 = org.telegram.messenger.bd.M0(2131750770, null);
                        } else {
                            str2 = org.telegram.messenger.bd.M0(2131750759, null);
                        }
                    }
                }
                h4Var.setTag(l10);
                h4Var.d(chat, str, str2);
            } else if (i10 == 5) {
                org.telegram.ui.Components.oz ozVar = (org.telegram.ui.Components.oz) view;
                if (ozVar == cyVar.P) {
                    cyVar.P = null;
                }
                if (i3 == cyVar.J) {
                    ozVar.b(org.telegram.messenger.bd.M0(2131749157, null), false);
                    ozVar.a("", null);
                    return;
                }
                cyVar.P = ozVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    cyVar.k0(false);
                    return;
                }
                ozVar.b(org.telegram.messenger.bd.M0(2131750754, null), false);
                ozVar.a("", null);
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View ozVar;
        View view;
        cy cyVar = this.f43857c;
        View view2 = null;
        if (i3 == 0) {
            Activity parentActivity = cyVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624027, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, b8.mf.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            yh.l lVar = new yh.l(parentActivity);
            frameLayout.f49301a = lVar;
            org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.B6, null);
            lVar.setTextSize(1, 14.0f);
            lVar.setGravity(17);
            lVar.setLines(2);
            frameLayout.addView(lVar, b8.mf.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i3 == 2) {
                view2 = new org.telegram.ui.Cells.y8(cyVar.getParentActivity());
            } else {
                if (i3 == 3) {
                    ozVar = new zx(this, cyVar.getParentActivity(), cyVar);
                    ozVar.setLayoutParams(new u4.p0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, ozVar, null);
                } else if (i3 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(cyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, h4Var, null);
                    view = h4Var;
                } else if (i3 == 5) {
                    ozVar = new org.telegram.ui.Components.oz(cyVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, ozVar, null);
                }
                view2 = ozVar;
            }
            return new u4.d1(view2);
        }
        view2 = view;
        return new u4.d1(view2);
    }
}
