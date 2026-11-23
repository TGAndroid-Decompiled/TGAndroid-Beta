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
public final class iy extends org.telegram.ui.Components.dk0 {
    public final jy f48944c;

    public iy(jy jyVar) {
        this.f48944c = jyVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f48944c.H;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        jy jyVar = this.f48944c;
        if (i7 != jyVar.O && i7 != jyVar.K) {
            if (i7 == jyVar.I) {
                return 3;
            }
            if (i7 >= jyVar.M && i7 < jyVar.N) {
                return 4;
            }
            if (i7 != jyVar.L && i7 != jyVar.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        jy jyVar = this.f48944c;
        ArrayList arrayList = jyVar.f49237f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 == 0) {
            jyVar.Q = (xx) view;
            jyVar.l0();
        } else if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == jyVar.O) {
                z8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131750735, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.gd.N0(2131750734, null));
                    return;
                }
            }
            z8Var.setFixedSize(12);
        } else {
            int i11 = 1;
            if (i10 == 3) {
                cy cyVar = (cy) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                di.xb xbVar = cyVar.h;
                org.telegram.ui.ActionBar.n5 n5Var = cyVar.f46898c;
                TextView textView = cyVar.f46901n;
                ImageView imageView = cyVar.d;
                di.xb xbVar2 = cyVar.f46900f;
                cyVar.f46903s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                n5Var.l(str3, false);
                float f11 = cyVar.f46904w;
                if (str3 == null) {
                    i11 = 0;
                }
                if (f11 != i11) {
                    ValueAnimator valueAnimator = cyVar.f46905x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        cyVar.f46905x = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    cyVar.f46904w = f10;
                    ay ayVar = cyVar.f46899e;
                    ayVar.d = f10;
                    ayVar.invalidate();
                    xbVar2.setAlpha(cyVar.f46904w);
                    cyVar.h.setAlpha(cyVar.f46904w);
                    imageView.setAlpha(cyVar.f46904w);
                    textView.setAlpha(1.0f - cyVar.f46904w);
                    n5Var.setAlpha(cyVar.f46904w);
                    cyVar.f46897b.setAlpha(1.0f - cyVar.f46904w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        xbVar2.setVisibility(8);
                        xbVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    xbVar2.setVisibility(0);
                    xbVar.setVisibility(0);
                }
            } else if (i10 == 4) {
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                Long l10 = (Long) jyVar.h.get(i7 - jyVar.M);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User c22 = jyVar.getMessagesController().c2(l10);
                    if (c22 != null) {
                        str = org.telegram.messenger.n10.q(c22);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = jyVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (O0 != null) {
                        str = O0.title;
                        if (O0.participants_count != 0) {
                            if (org.telegram.messenger.v3.V(O0)) {
                                str2 = org.telegram.messenger.gd.H(',', "Subscribers", O0.participants_count);
                                chat = O0;
                            } else {
                                str2 = org.telegram.messenger.gd.H(',', "Members", O0.participants_count);
                                chat = O0;
                            }
                        } else if (org.telegram.messenger.v3.V(O0)) {
                            str2 = org.telegram.messenger.gd.O0("ChannelPublic");
                            chat = O0;
                        } else {
                            str2 = org.telegram.messenger.gd.O0("MegaPublic");
                            chat = O0;
                        }
                    } else {
                        str = null;
                        str2 = null;
                        chat = O0;
                    }
                }
                if (arrayList.contains(l10)) {
                    i4Var.setForbiddenCheck(false);
                    i4Var.c(jyVar.f49236e.contains(l10), false);
                } else {
                    i4Var.setForbiddenCheck(true);
                    i4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.gd.N0(2131750759, null);
                        } else {
                            str2 = org.telegram.messenger.gd.N0(2131750727, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.v3.V(chat)) {
                            str2 = org.telegram.messenger.gd.N0(2131750757, null);
                        } else {
                            str2 = org.telegram.messenger.gd.N0(2131750746, null);
                        }
                    }
                }
                i4Var.setTag(l10);
                i4Var.d(chat, str, str2);
            } else if (i10 == 5) {
                org.telegram.ui.Components.d00 d00Var = (org.telegram.ui.Components.d00) view;
                if (d00Var == jyVar.P) {
                    jyVar.P = null;
                }
                if (i7 == jyVar.J) {
                    d00Var.b(org.telegram.messenger.gd.N0(2131748956, null), false);
                    d00Var.a("", null);
                    return;
                }
                jyVar.P = d00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    jyVar.k0(false);
                    return;
                }
                d00Var.b(org.telegram.messenger.gd.N0(2131750741, null), false);
                d00Var.a("", null);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View d00Var;
        View view;
        jy jyVar = this.f48944c;
        View view2 = null;
        if (i7 == 0) {
            Activity parentActivity = jyVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624028, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, c8.na.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            xh.l lVar = new xh.l(parentActivity);
            frameLayout.f54116a = lVar;
            org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.B6, null);
            lVar.setTextSize(1, 14.0f);
            lVar.setGravity(17);
            lVar.setLines(2);
            frameLayout.addView(lVar, c8.na.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(jyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    d00Var = new hy(this, jyVar.getParentActivity(), jyVar);
                    d00Var.setLayoutParams(new v4.q0(-1, -2));
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, d00Var, null);
                } else if (i7 == 4) {
                    View i4Var = new org.telegram.ui.Cells.i4(jyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, i4Var, null);
                    view = i4Var;
                } else if (i7 == 5) {
                    d00Var = new org.telegram.ui.Components.d00(jyVar.getParentActivity());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, d00Var, null);
                }
                view2 = d00Var;
            }
            return new v4.f1(view2);
        }
        view2 = view;
        return new v4.f1(view2);
    }
}
