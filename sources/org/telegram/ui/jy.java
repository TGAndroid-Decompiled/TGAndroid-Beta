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
public final class jy extends org.telegram.ui.Components.bk0 {
    public final ky f49098c;

    public jy(ky kyVar) {
        this.f49098c = kyVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49098c.H;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        ky kyVar = this.f49098c;
        if (i7 != kyVar.O && i7 != kyVar.K) {
            if (i7 == kyVar.I) {
                return 3;
            }
            if (i7 >= kyVar.M && i7 < kyVar.N) {
                return 4;
            }
            if (i7 != kyVar.L && i7 != kyVar.J) {
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
        ky kyVar = this.f49098c;
        ArrayList arrayList = kyVar.f49370f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = kyVar.d;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i10 == 0) {
            kyVar.Q = (yx) view;
            kyVar.l0();
        } else if (i10 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == kyVar.O) {
                a9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131750736, null));
                    return;
                } else {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131750735, null));
                    return;
                }
            }
            a9Var.setFixedSize(12);
        } else {
            int i11 = 1;
            if (i10 == 3) {
                dy dyVar = (dy) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                di.xb xbVar = dyVar.h;
                org.telegram.ui.ActionBar.n5 n5Var = dyVar.f47001c;
                TextView textView = dyVar.f47004n;
                ImageView imageView = dyVar.d;
                di.xb xbVar2 = dyVar.f47003f;
                dyVar.f47006s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                n5Var.l(str3, false);
                float f11 = dyVar.f47007w;
                if (str3 == null) {
                    i11 = 0;
                }
                if (f11 != i11) {
                    ValueAnimator valueAnimator = dyVar.f47008x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        dyVar.f47008x = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    dyVar.f47007w = f10;
                    cy cyVar = dyVar.f47002e;
                    cyVar.d = f10;
                    cyVar.invalidate();
                    xbVar2.setAlpha(dyVar.f47007w);
                    dyVar.h.setAlpha(dyVar.f47007w);
                    imageView.setAlpha(dyVar.f47007w);
                    textView.setAlpha(1.0f - dyVar.f47007w);
                    n5Var.setAlpha(dyVar.f47007w);
                    dyVar.f47000b.setAlpha(1.0f - dyVar.f47007w);
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
                Long l10 = (Long) kyVar.h.get(i7 - kyVar.M);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User c22 = kyVar.getMessagesController().c2(l10);
                    if (c22 != null) {
                        str = org.telegram.messenger.o10.q(c22);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = c22;
                } else {
                    TLRPC.Chat O0 = kyVar.getMessagesController().O0(Long.valueOf(-longValue));
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
                            str2 = org.telegram.messenger.gd.N0("ChannelPublic");
                            chat = O0;
                        } else {
                            str2 = org.telegram.messenger.gd.N0("MegaPublic");
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
                    i4Var.c(kyVar.f49369e.contains(l10), false);
                } else {
                    i4Var.setForbiddenCheck(true);
                    i4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.gd.M0(2131750760, null);
                        } else {
                            str2 = org.telegram.messenger.gd.M0(2131750728, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.v3.V(chat)) {
                            str2 = org.telegram.messenger.gd.M0(2131750758, null);
                        } else {
                            str2 = org.telegram.messenger.gd.M0(2131750747, null);
                        }
                    }
                }
                i4Var.setTag(l10);
                i4Var.d(chat, str, str2);
            } else if (i10 == 5) {
                org.telegram.ui.Components.d00 d00Var = (org.telegram.ui.Components.d00) view;
                if (d00Var == kyVar.P) {
                    kyVar.P = null;
                }
                if (i7 == kyVar.J) {
                    d00Var.b(org.telegram.messenger.gd.M0(2131748957, null), false);
                    d00Var.a("", null);
                    return;
                }
                kyVar.P = d00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    kyVar.k0(false);
                    return;
                }
                d00Var.b(org.telegram.messenger.gd.M0(2131750742, null), false);
                d00Var.a("", null);
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View d00Var;
        View view;
        ky kyVar = this.f49098c;
        View view2 = null;
        if (i7 == 0) {
            Activity parentActivity = kyVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624028, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, c8.ma.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            xh.l lVar = new xh.l(parentActivity);
            frameLayout.f54276a = lVar;
            org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.B6, null);
            lVar.setTextSize(1, 14.0f);
            lVar.setGravity(17);
            lVar.setLines(2);
            frameLayout.addView(lVar, c8.ma.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.a9(kyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    d00Var = new iy(this, kyVar.getParentActivity(), kyVar);
                    d00Var.setLayoutParams(new v4.q0(-1, -2));
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, d00Var, null);
                } else if (i7 == 4) {
                    View i4Var = new org.telegram.ui.Cells.i4(kyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, i4Var, null);
                    view = i4Var;
                } else if (i7 == 5) {
                    d00Var = new org.telegram.ui.Components.d00(kyVar.getParentActivity());
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, d00Var, null);
                }
                view2 = d00Var;
            }
            return new v4.f1(view2);
        }
        view2 = view;
        return new v4.f1(view2);
    }
}
