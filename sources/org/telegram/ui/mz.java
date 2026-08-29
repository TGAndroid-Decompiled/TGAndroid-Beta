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
public final class mz extends org.telegram.ui.Components.il0 {
    public final nz f40653c;

    public mz(nz nzVar) {
        this.f40653c = nzVar;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40653c.D;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        nz nzVar = this.f40653c;
        if (i10 != nzVar.K && i10 != nzVar.G) {
            if (i10 == nzVar.E) {
                return 3;
            }
            if (i10 >= nzVar.I && i10 < nzVar.J) {
                return 4;
            }
            if (i10 != nzVar.H && i10 != nzVar.F) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f9;
        int i11;
        nz nzVar = this.f40653c;
        ArrayList arrayList = nzVar.f40933f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i12 == 0) {
            nzVar.M = (ez) view;
            nzVar.g0();
        } else if (i12 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            Activity parentActivity = nzVar.getParentActivity();
            if (i10 == nzVar.K) {
                i11 = R.drawable.greydivider_bottom;
            } else {
                i11 = R.drawable.greydivider;
            }
            y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(parentActivity, i11, org.telegram.ui.ActionBar.g6.f23028b7));
            if (i10 == nzVar.K) {
                y8Var.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    y8Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                } else {
                    y8Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                }
            }
            y8Var.setFixedSize(12);
        } else {
            int i13 = 1;
            String str4 = null;
            if (i12 == 3) {
                gz gzVar = (gz) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                eg.r rVar = gzVar.h;
                org.telegram.ui.ActionBar.h5 h5Var = gzVar.f38695c;
                TextView textView = gzVar.f38698n;
                ImageView imageView = gzVar.d;
                eg.r rVar2 = gzVar.f38697f;
                gzVar.f38700s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                h5Var.l(str3, false);
                float f10 = gzVar.v;
                if (str3 == null) {
                    i13 = 0;
                }
                if (f10 != i13) {
                    ValueAnimator valueAnimator = gzVar.f38701w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        gzVar.f38701w = null;
                    }
                    if (str3 != null) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    gzVar.v = f9;
                    nh.i8 i8Var = gzVar.f38696e;
                    i8Var.f17906c = f9;
                    i8Var.invalidate();
                    rVar2.setAlpha(gzVar.v);
                    gzVar.h.setAlpha(gzVar.v);
                    imageView.setAlpha(gzVar.v);
                    textView.setAlpha(1.0f - gzVar.v);
                    h5Var.setAlpha(gzVar.v);
                    gzVar.f38694b.setAlpha(1.0f - gzVar.v);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        rVar2.setVisibility(8);
                        rVar.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    rVar2.setVisibility(0);
                    rVar.setVisibility(0);
                }
            } else if (i12 == 4) {
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                Long l10 = (Long) nzVar.h.get(i10 - nzVar.I);
                long longValue = l10.longValue();
                if (longValue >= 0) {
                    TLRPC.User user = nzVar.getMessagesController().getUser(l10);
                    if (user != null) {
                        str2 = UserObject.getUserName(user);
                        chat = user;
                    } else {
                        str2 = null;
                        chat = user;
                    }
                } else {
                    TLRPC.Chat chat2 = nzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (arrayList.contains(l10)) {
                    e4Var.setForbiddenCheck(false);
                    e4Var.c(nzVar.f40932e.contains(l10), false);
                } else {
                    e4Var.setForbiddenCheck(true);
                    e4Var.c(false, false);
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
                e4Var.setTag(l10);
                e4Var.d(chat, str2, str4);
            } else if (i12 == 5) {
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) view;
                if (v00Var == nzVar.L) {
                    nzVar.L = null;
                }
                if (i10 == nzVar.F) {
                    v00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    v00Var.a("", null);
                    return;
                }
                nzVar.L = v00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    nzVar.f0(false);
                    return;
                }
                v00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                v00Var.a("", null);
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View v00Var;
        View view;
        nz nzVar = this.f40653c;
        View view2 = null;
        if (i10 == 0) {
            Activity parentActivity = nzVar.getParentActivity();
            int i11 = R.raw.folder_share;
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(i11, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, i7.f6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            gh.s sVar = new gh.s(parentActivity);
            frameLayout.f37934a = sVar;
            sVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            sVar.setTextSize(1, 14.0f);
            sVar.setGravity(17);
            sVar.setLines(2);
            frameLayout.addView(sVar, i7.f6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.y8(nzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    v00Var = new lz(this, nzVar.getParentActivity(), nzVar);
                    v00Var.setLayoutParams(new f2.x0(-1, -2));
                    v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                } else if (i10 == 4) {
                    View e4Var = new org.telegram.ui.Cells.e4(nzVar.getParentActivity(), 1, 0, false);
                    e4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    view = e4Var;
                } else if (i10 == 5) {
                    v00Var = new org.telegram.ui.Components.v00(nzVar.getParentActivity());
                    v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                }
                view2 = v00Var;
            }
            return new f2.n1(view2);
        }
        view2 = view;
        return new f2.n1(view2);
    }
}
