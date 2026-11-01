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
public final class gz extends org.telegram.ui.Components.tk0 {
    public final hz f37594c;

    public gz(hz hzVar) {
        this.f37594c = hzVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f37594c.G;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        hz hzVar = this.f37594c;
        if (i10 != hzVar.N && i10 != hzVar.J) {
            if (i10 == hzVar.H) {
                return 3;
            }
            if (i10 >= hzVar.L && i10 < hzVar.M) {
                return 4;
            }
            if (i10 != hzVar.K && i10 != hzVar.I) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        hz hzVar = this.f37594c;
        ArrayList arrayList = hzVar.f37899f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = hzVar.d;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 == 0) {
            hzVar.P = (wy) view;
            hzVar.l0();
        } else if (i11 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == hzVar.N) {
                b9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131750748, null));
                    return;
                } else {
                    b9Var.setText(org.telegram.messenger.dd.L0(2131750747, null));
                    return;
                }
            }
            b9Var.setFixedSize(12);
        } else {
            int i12 = 1;
            if (i11 == 3) {
                az azVar = (az) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                ag.j3 j3Var = azVar.h;
                org.telegram.ui.ActionBar.u5 u5Var = azVar.f35862c;
                TextView textView = azVar.f35864n;
                ImageView imageView = azVar.d;
                ag.j3 j3Var2 = azVar.f35863f;
                azVar.f35866s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                u5Var.l(str3, false);
                float f10 = azVar.f35867w;
                if (str3 == null) {
                    i12 = 0;
                }
                if (f10 != i12) {
                    ValueAnimator valueAnimator = azVar.f35868x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        azVar.f35868x = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    azVar.f35867w = f7;
                    zy zyVar = azVar.e;
                    zyVar.d = f7;
                    zyVar.invalidate();
                    j3Var2.setAlpha(azVar.f35867w);
                    azVar.h.setAlpha(azVar.f35867w);
                    imageView.setAlpha(azVar.f35867w);
                    textView.setAlpha(1.0f - azVar.f35867w);
                    u5Var.setAlpha(azVar.f35867w);
                    azVar.f35861b.setAlpha(1.0f - azVar.f35867w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        j3Var2.setVisibility(8);
                        j3Var.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    j3Var2.setVisibility(0);
                    j3Var.setVisibility(0);
                }
            } else if (i11 == 4) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                Long l4 = (Long) hzVar.h.get(i10 - hzVar.L);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User Z1 = hzVar.getMessagesController().Z1(l4);
                    if (Z1 != null) {
                        str = org.telegram.messenger.i20.p(Z1);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = Z1;
                } else {
                    TLRPC.Chat L0 = hzVar.getMessagesController().L0(Long.valueOf(-longValue));
                    if (L0 != null) {
                        str = L0.title;
                        if (L0.participants_count != 0) {
                            if (org.telegram.messenger.w3.V(L0)) {
                                str2 = org.telegram.messenger.dd.H(',', "Subscribers", L0.participants_count);
                                chat = L0;
                            } else {
                                str2 = org.telegram.messenger.dd.H(',', "Members", L0.participants_count);
                                chat = L0;
                            }
                        } else if (org.telegram.messenger.w3.V(L0)) {
                            str2 = org.telegram.messenger.dd.M0("ChannelPublic");
                            chat = L0;
                        } else {
                            str2 = org.telegram.messenger.dd.M0("MegaPublic");
                            chat = L0;
                        }
                    } else {
                        str = null;
                        str2 = null;
                        chat = L0;
                    }
                }
                if (arrayList.contains(l4)) {
                    j4Var.setForbiddenCheck(false);
                    j4Var.c(hzVar.e.contains(l4), false);
                } else {
                    j4Var.setForbiddenCheck(true);
                    j4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.dd.L0(2131750772, null);
                        } else {
                            str2 = org.telegram.messenger.dd.L0(2131750740, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.w3.V(chat)) {
                            str2 = org.telegram.messenger.dd.L0(2131750770, null);
                        } else {
                            str2 = org.telegram.messenger.dd.L0(2131750759, null);
                        }
                    }
                }
                j4Var.setTag(l4);
                j4Var.d(chat, str, str2);
            } else if (i11 == 5) {
                org.telegram.ui.Components.g00 g00Var = (org.telegram.ui.Components.g00) view;
                if (g00Var == hzVar.O) {
                    hzVar.O = null;
                }
                if (i10 == hzVar.I) {
                    g00Var.b(org.telegram.messenger.dd.L0(2131749159, null), false);
                    g00Var.a("", null);
                    return;
                }
                hzVar.O = g00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    hzVar.k0(false);
                    return;
                }
                g00Var.b(org.telegram.messenger.dd.L0(2131750754, null), false);
                g00Var.a("", null);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View g00Var;
        View view;
        hz hzVar = this.f37594c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = hzVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624026, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            nh.p pVar = new nh.p(parentActivity);
            frameLayout.f43182a = pVar;
            org.telegram.ui.ActionBar.a7.V(pVar, org.telegram.ui.ActionBar.t6.B6, null);
            pVar.setTextSize(1, 14.0f);
            pVar.setGravity(17);
            pVar.setLines(2);
            frameLayout.addView(pVar, w7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.b9(hzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    g00Var = new fz(this, hzVar.getParentActivity(), hzVar);
                    g00Var.setLayoutParams(new s4.o0(-1, -2));
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, g00Var, null);
                } else if (i10 == 4) {
                    View j4Var = new org.telegram.ui.Cells.j4(hzVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, j4Var, null);
                    view = j4Var;
                } else if (i10 == 5) {
                    g00Var = new org.telegram.ui.Components.g00(hzVar.getParentActivity());
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, g00Var, null);
                }
                view2 = g00Var;
            }
            return new s4.c1(view2);
        }
        view2 = view;
        return new s4.c1(view2);
    }
}
