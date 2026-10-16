package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class g00 extends org.telegram.ui.Components.lm0 {
    public final h00 f36033c;

    public g00(h00 h00Var) {
        this.f36033c = h00Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36033c.H;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        h00 h00Var = this.f36033c;
        if (i10 != h00Var.O && i10 != h00Var.K) {
            if (i10 == h00Var.I) {
                return 3;
            }
            if (i10 >= h00Var.M && i10 < h00Var.N) {
                return 4;
            }
            if (i10 != h00Var.L && i10 != h00Var.J) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f7;
        int i11;
        h00 h00Var = this.f36033c;
        ArrayList arrayList = h00Var.f36355f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = h00Var.d;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 == 0) {
            h00Var.Q = (xz) view;
            h00Var.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            Activity parentActivity = h00Var.getParentActivity();
            if (i10 == h00Var.O) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(parentActivity, i11, org.telegram.ui.ActionBar.g6.f19563b7));
            if (i10 == h00Var.O) {
                e9Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    e9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            e9Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                a00 a00Var = (a00) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                bi.f4 f4Var = a00Var.h;
                org.telegram.ui.ActionBar.h5 h5Var = a00Var.f33705c;
                TextView textView = a00Var.f33707n;
                ImageView imageView = a00Var.d;
                bi.f4 f4Var2 = a00Var.f33706f;
                a00Var.f33709s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                h5Var.l(str3, false);
                float f10 = a00Var.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = a00Var.f33710w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        a00Var.f33710w = null;
                    }
                    if (str3 != null) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    a00Var.v = f7;
                    di.f9 f9Var = a00Var.e;
                    f9Var.f6955c = f7;
                    f9Var.invalidate();
                    f4Var2.setAlpha(a00Var.v);
                    a00Var.h.setAlpha(a00Var.v);
                    imageView.setAlpha(a00Var.v);
                    textView.setAlpha(1.0f - a00Var.v);
                    h5Var.setAlpha(a00Var.v);
                    a00Var.f33704b.setAlpha(1.0f - a00Var.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        f4Var2.setVisibility(8);
                        f4Var.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    f4Var2.setVisibility(0);
                    f4Var.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                Long l4 = (Long) h00Var.h.get(i10 - h00Var.M);
                long longValue = l4.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = h00Var.getMessagesController().getUser(l4);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = h00Var.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat2 != null) {
                        str4 = chat2.title;
                        if (chat2.participants_count != 0) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                                str = LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count);
                            } else {
                                str = LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            str = LocaleController.getString("ChannelPublic");
                        } else {
                            str = LocaleController.getString("MegaPublic");
                        }
                    } else {
                        str = null;
                    }
                    String str5 = str4;
                    str4 = str;
                    str2 = str5;
                    chat = chat2;
                }
                if (arrayList.contains(l4)) {
                    g4Var.setForbiddenCheck(false);
                    g4Var.c(h00Var.e.contains(l4), false);
                } else {
                    g4Var.setForbiddenCheck(true);
                    g4Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str4 = LocaleController.getString(R.string.FilterInviteBot);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteUser);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            str4 = LocaleController.getString(R.string.FilterInviteChannel);
                        } else {
                            str4 = LocaleController.getString(R.string.FilterInviteGroup);
                        }
                    }
                }
                g4Var.setTag(l4);
                g4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.l10 l10Var = (org.telegram.ui.Components.l10) view;
                if (l10Var == h00Var.P) {
                    h00Var.P = null;
                }
                if (i10 == h00Var.J) {
                    l10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    l10Var.a("", null);
                    return;
                }
                h00Var.P = l10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    h00Var.f0(false);
                    return;
                }
                l10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                l10Var.a("", null);
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l10Var;
        View view;
        h00 h00Var = this.f36033c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = h00Var.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, w7.z5.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
            wh.n nVar = new wh.n(parentActivity);
            frameLayout.f41691a = nVar;
            nVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
            nVar.setTextSize(1, 14.0f);
            nVar.setGravity(17);
            nVar.setLines(2);
            frameLayout.addView(nVar, w7.z5.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(h00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    l10Var = new f00(this, h00Var.getParentActivity(), h00Var);
                    l10Var.setLayoutParams(new s4.o0(-1, -2));
                    l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(1, 0, h00Var.getParentActivity(), false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    l10Var = new org.telegram.ui.Components.l10(h00Var.getParentActivity());
                    l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                }
                view2 = l10Var;
            }
            return new s4.b1(view2);
        }
        view2 = view;
        return new s4.b1(view2);
    }
}
