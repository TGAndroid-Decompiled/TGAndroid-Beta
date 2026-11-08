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
public final class fy extends org.telegram.ui.Components.oj0 {
    public final gy f45720c;

    public fy(gy gyVar) {
        this.f45720c = gyVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45720c.G;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        gy gyVar = this.f45720c;
        if (i7 != gyVar.N && i7 != gyVar.J) {
            if (i7 == gyVar.H) {
                return 3;
            }
            if (i7 >= gyVar.L && i7 < gyVar.M) {
                return 4;
            }
            if (i7 != gyVar.K && i7 != gyVar.I) {
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
        gy gyVar = this.f45720c;
        ArrayList arrayList = gyVar.f46147f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = gyVar.d;
        int i10 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i10 == 0) {
            gyVar.P = (vx) view;
            gyVar.l0();
        } else if (i10 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == gyVar.N) {
                z8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131750748, null));
                    return;
                } else {
                    z8Var.setText(org.telegram.messenger.id.M0(2131750747, null));
                    return;
                }
            }
            z8Var.setFixedSize(12);
        } else {
            int i11 = 1;
            if (i10 == 3) {
                yx yxVar = (yx) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                bi.md mdVar = yxVar.h;
                org.telegram.ui.ActionBar.k5 k5Var = yxVar.f52337c;
                TextView textView = yxVar.f52340n;
                ImageView imageView = yxVar.d;
                bi.md mdVar2 = yxVar.f52339f;
                yxVar.f52342s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                k5Var.l(str3, false);
                float f11 = yxVar.f52343w;
                if (str3 == null) {
                    i11 = 0;
                }
                if (f11 != i11) {
                    ValueAnimator valueAnimator = yxVar.f52344x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        yxVar.f52344x = null;
                    }
                    if (str3 != null) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    yxVar.f52343w = f10;
                    xx xxVar = yxVar.f52338e;
                    xxVar.d = f10;
                    xxVar.invalidate();
                    mdVar2.setAlpha(yxVar.f52343w);
                    yxVar.h.setAlpha(yxVar.f52343w);
                    imageView.setAlpha(yxVar.f52343w);
                    textView.setAlpha(1.0f - yxVar.f52343w);
                    k5Var.setAlpha(yxVar.f52343w);
                    yxVar.f52336b.setAlpha(1.0f - yxVar.f52343w);
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
                Long l10 = (Long) gyVar.h.get(i7 - gyVar.L);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User a22 = gyVar.getMessagesController().a2(l10);
                    if (a22 != null) {
                        str = org.telegram.messenger.t10.p(a22);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = a22;
                } else {
                    TLRPC.Chat M0 = gyVar.getMessagesController().M0(Long.valueOf(-longValue));
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
                    h4Var.c(gyVar.f46146e.contains(l10), false);
                } else {
                    h4Var.setForbiddenCheck(true);
                    h4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = org.telegram.messenger.id.M0(2131750772, null);
                        } else {
                            str2 = org.telegram.messenger.id.M0(2131750740, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (org.telegram.messenger.t3.V(chat)) {
                            str2 = org.telegram.messenger.id.M0(2131750770, null);
                        } else {
                            str2 = org.telegram.messenger.id.M0(2131750759, null);
                        }
                    }
                }
                h4Var.setTag(l10);
                h4Var.d(chat, str, str2);
            } else if (i10 == 5) {
                org.telegram.ui.Components.tz tzVar = (org.telegram.ui.Components.tz) view;
                if (tzVar == gyVar.O) {
                    gyVar.O = null;
                }
                if (i7 == gyVar.I) {
                    tzVar.b(org.telegram.messenger.id.M0(2131749150, null), false);
                    tzVar.a("", null);
                    return;
                }
                gyVar.O = tzVar;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    gyVar.k0(false);
                    return;
                }
                tzVar.b(org.telegram.messenger.id.M0(2131750754, null), false);
                tzVar.a("", null);
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View tzVar;
        View view;
        gy gyVar = this.f45720c;
        View view2 = null;
        if (i7 == 0) {
            Activity parentActivity = gyVar.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624027, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, c8.ha.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            xh.l lVar = new xh.l(parentActivity);
            frameLayout.f50794a = lVar;
            org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.B6, null);
            lVar.setTextSize(1, 14.0f);
            lVar.setGravity(17);
            lVar.setLines(2);
            frameLayout.addView(lVar, c8.ha.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i7 == 2) {
                view2 = new org.telegram.ui.Cells.z8(gyVar.getParentActivity());
            } else {
                if (i7 == 3) {
                    tzVar = new ey(this, gyVar.getParentActivity(), gyVar);
                    tzVar.setLayoutParams(new v4.o0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, tzVar, null);
                } else if (i7 == 4) {
                    View h4Var = new org.telegram.ui.Cells.h4(gyVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, h4Var, null);
                    view = h4Var;
                } else if (i7 == 5) {
                    tzVar = new org.telegram.ui.Components.tz(gyVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, tzVar, null);
                }
                view2 = tzVar;
            }
            return new v4.d1(view2);
        }
        view2 = view;
        return new v4.d1(view2);
    }
}
