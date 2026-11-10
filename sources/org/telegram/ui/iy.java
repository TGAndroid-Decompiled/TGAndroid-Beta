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
public final class iy extends org.telegram.ui.Components.oj0 {
    public final jy f46769c;

    public iy(jy jyVar) {
        this.f46769c = jyVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46769c.G;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        jy jyVar = this.f46769c;
        if (i7 != jyVar.N && i7 != jyVar.J) {
            if (i7 == jyVar.H) {
                return 3;
            }
            if (i7 >= jyVar.L && i7 < jyVar.M) {
                return 4;
            }
            if (i7 != jyVar.K && i7 != jyVar.I) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f10;
        jy jyVar = this.f46769c;
        ArrayList arrayList = jyVar.f47097f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = jyVar.d;
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 == 0) {
            jyVar.P = (yx) view;
            jyVar.l0();
        } else if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == jyVar.N) {
                z8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131750747, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131750746, null));
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
                bi.md mdVar = cyVar.h;
                org.telegram.ui.ActionBar.m5 m5Var = cyVar.f44834c;
                TextView textView = cyVar.f44837n;
                ImageView imageView = cyVar.d;
                bi.md mdVar2 = cyVar.f44836f;
                cyVar.f44839s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                m5Var.l(str3, false);
                float f11 = cyVar.f44840w;
                if (str3 == null) {
                    i11 = 0;
                }
                if (f11 != i11) {
                    ValueAnimator valueAnimator = cyVar.f44841x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        cyVar.f44841x = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    cyVar.f44840w = f10;
                    ay ayVar = cyVar.f44835e;
                    ayVar.d = f10;
                    ayVar.invalidate();
                    mdVar2.setAlpha(cyVar.f44840w);
                    cyVar.h.setAlpha(cyVar.f44840w);
                    imageView.setAlpha(cyVar.f44840w);
                    textView.setAlpha(1.0f - cyVar.f44840w);
                    m5Var.setAlpha(cyVar.f44840w);
                    cyVar.f44833b.setAlpha(1.0f - cyVar.f44840w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        mdVar2.setVisibility(8);
                        mdVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    mdVar2.setVisibility(0);
                    mdVar.setVisibility(0);
                }
            } else if (i10 == 4) {
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                Long l10 = (Long) jyVar.h.get(i7 - jyVar.L);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User a22 = jyVar.getMessagesController().a2(l10);
                    if (a22 != null) {
                        str = org.telegram.messenger.t10.p(a22);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = jyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null) {
                        str = M0.title;
                        if (M0.participants_count != 0) {
                            if (org.telegram.messenger.t3.V(M0)) {
                                str2 = org.telegram.messenger.id.H(',', "Subscribers", M0.participants_count);
                                chat = M0;
                            } else {
                                str2 = org.telegram.messenger.id.H(',', "Members", M0.participants_count);
                                chat = M0;
                            }
                        } else if (org.telegram.messenger.t3.V(M0)) {
                            str2 = org.telegram.messenger.id.N0("ChannelPublic");
                            chat = M0;
                        } else {
                            str2 = org.telegram.messenger.id.N0("MegaPublic");
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
                    h4Var.c(jyVar.f47096e.contains(l10), false);
                } else {
                    h4Var.setForbiddenCheck(true);
                    h4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.id.M0(2131750771, null);
                        } else {
                            str2 = org.telegram.messenger.id.M0(2131750739, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.t3.V(chat)) {
                            str2 = org.telegram.messenger.id.M0(2131750769, null);
                        } else {
                            str2 = org.telegram.messenger.id.M0(2131750758, null);
                        }
                    }
                }
                h4Var.setTag(l10);
                h4Var.d(chat, str, str2);
            } else if (i10 == 5) {
                org.telegram.ui.Components.sz szVar = (org.telegram.ui.Components.sz) view;
                if (szVar == jyVar.O) {
                    jyVar.O = null;
                }
                if (i7 == jyVar.I) {
                    szVar.b(org.telegram.messenger.id.M0(2131749149, null), false);
                    szVar.a("", null);
                    return;
                }
                jyVar.O = szVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    jyVar.k0(false);
                    return;
                }
                szVar.b(org.telegram.messenger.id.M0(2131750753, null), false);
                szVar.a("", null);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View szVar;
        View view;
        jy jyVar = this.f46769c;
        View view2 = null;
        if (i7 == 0) {
            Activity parentActivity = jyVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624027, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            xh.l lVar = new xh.l(parentActivity);
            frameLayout.f52145a = lVar;
            org.telegram.ui.ActionBar.t6.U(lVar, org.telegram.ui.ActionBar.m6.B6, null);
            lVar.setTextSize(1, 14.0f);
            lVar.setGravity(17);
            lVar.setLines(2);
            frameLayout.addView(lVar, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(jyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    szVar = new hy(this, jyVar.getParentActivity(), jyVar);
                    szVar.setLayoutParams(new v4.o0(-1, -2));
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, szVar, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(jyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    szVar = new org.telegram.ui.Components.sz(jyVar.getParentActivity());
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, szVar, null);
                }
                view2 = szVar;
            }
            return new v4.d1(view2);
        }
        view2 = view;
        return new v4.d1(view2);
    }
}
