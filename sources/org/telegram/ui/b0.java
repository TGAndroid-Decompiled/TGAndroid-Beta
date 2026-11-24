package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class b0 extends q59 {
    public final PremiumPreviewFragment c;

    public b0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 1 || i == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.h;
    }

    @Override
    public final int d(int i) {
        if (i != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.c;
            if (i < premiumPreviewFragment.n || i >= premiumPreviewFragment.r) {
                if (i >= premiumPreviewFragment.w && i < premiumPreviewFragment.x) {
                    return 1;
                }
                if (i == 0) {
                    return 4;
                }
                if (i != premiumPreviewFragment.y && i != premiumPreviewFragment.E && i != premiumPreviewFragment.F && i != premiumPreviewFragment.I) {
                    if (i == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i != premiumPreviewFragment.s && i != premiumPreviewFragment.H) {
                        if (i == premiumPreviewFragment.showAdsRow) {
                            return 8;
                        }
                        return 0;
                    }
                    return 7;
                }
                return 5;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String str;
        View view = u69Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z = premiumPreviewFragment.i0;
        ?? r2 = premiumPreviewFragment.n;
        boolean z2 = true;
        if (i >= r2 && i < premiumPreviewFragment.r) {
            lj8 lj8Var = (lj8) view;
            hk8 hk8Var = (hk8) premiumPreviewFragment.b.get(i - (r2 == true ? 1 : 0));
            if (i == premiumPreviewFragment.r - 1) {
                z2 = false;
            }
            lj8Var.a(hk8Var, z2);
            return;
        }
        int i2 = premiumPreviewFragment.w;
        if (i >= i2 && i < premiumPreviewFragment.x) {
            lj8 lj8Var2 = (lj8) view;
            hk8 hk8Var2 = (hk8) premiumPreviewFragment.c.get(i - i2);
            if (i == premiumPreviewFragment.x - 1) {
                z2 = false;
            }
            lj8Var2.a(hk8Var2, z2);
        } else if (i == premiumPreviewFragment.y) {
            njb njbVar = (njb) view;
            njbVar.setText("");
            njbVar.setFixedSize(12);
        } else if (i != premiumPreviewFragment.E && i != premiumPreviewFragment.F && i != premiumPreviewFragment.I) {
            if (i == premiumPreviewFragment.s) {
                ((jf5) view).setText(jb6.M0(2131746729, null));
            } else if (i == premiumPreviewFragment.H) {
                ((jf5) view).setText(jb6.M0(2131745084, null));
            } else if (i == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull X1 = premiumPreviewFragment.getMessagesController().X1(premiumPreviewFragment.getUserConfig().e());
                xib xibVar = (xib) view;
                String M0 = jb6.M0(2131745086, null);
                if (X1 != null && !X1.sponsored_enabled) {
                    z2 = false;
                }
                xibVar.l(M0, z2, false);
            }
        } else {
            njb njbVar2 = (njb) view;
            if (!z) {
                njbVar2.setTextColor(cmb.p1(0.75f, -1));
                njbVar2.getTextView().setLinkTextColor(-1);
                njbVar2.setLinkTextRippleColor(Integer.valueOf(cmb.p1(0.15f, -1)));
            }
            njbVar2.setFixedSize(0);
            if (i == premiumPreviewFragment.I) {
                njbVar2.setText(gm.D2(gm.N2(jb6.M0(2131745085, null), -1, 0, new q78(this, (byte) 23), null), true));
            } else if (i == premiumPreviewFragment.E) {
                if (premiumPreviewFragment.h0) {
                    njbVar2.setText(jb6.M0(2131746728, null));
                    return;
                }
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E;
                if (tL_help_premiumPromo != null) {
                    SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
                    hs6.h(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
                    for (xkb xkbVar : (xkb[]) spannableString.getSpans(0, spannableString.length(), xkb.class)) {
                        wkb wkbVar = xkbVar.b;
                        TLRPC.MessageEntity messageEntity = wkbVar.d;
                        if (messageEntity != null) {
                            String str2 = tL_help_premiumPromo.status_text;
                            int i3 = messageEntity.offset;
                            str = TextUtils.substring(str2, i3, messageEntity.length + i3);
                        } else {
                            str = null;
                        }
                        TLRPC.MessageEntity messageEntity2 = wkbVar.d;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                            spannableString.setSpan(new d6c(str, 0, wkbVar), wkbVar.b, wkbVar.c, 33);
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) && !(messageEntity2 instanceof TLRPC.TL_messageEntityMention) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                                spannableString.setSpan(new i6c(b10.h("mailto:", str), wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                                if (!str.toLowerCase().contains("://")) {
                                    spannableString.setSpan(new e6c("http://".concat(str), wkbVar), wkbVar.b, wkbVar.c, 33);
                                } else {
                                    spannableString.setSpan(new e6c(str, wkbVar), wkbVar.b, wkbVar.c, 33);
                                }
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                                spannableString.setSpan(new g6c(b10.h("card:", str), wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                                String h = r58.h(str, false);
                                if (str.startsWith("+")) {
                                    h = b10.h("+", h);
                                }
                                spannableString.setSpan(new e6c(b10.h("tel:", h), wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                i6c i6cVar = new i6c(wkbVar.d.url, wkbVar);
                                i6cVar.b = true;
                                spannableString.setSpan(i6cVar, wkbVar.b, wkbVar.c, 33);
                                if (!z) {
                                    spannableString.setSpan(new z5c(gm.o()), wkbVar.b, wkbVar.c, 33);
                                }
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                spannableString.setSpan(new j6c(String.valueOf(((TLRPC.TL_messageEntityMentionName) wkbVar.d).user_id), 0, wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                spannableString.setSpan(new j6c(String.valueOf(((TLRPC.TL_inputMessageEntityMentionName) wkbVar.d).user_id.user_id), 0, wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else if ((wkbVar.a & 4) != 0) {
                                spannableString.setSpan(new f6c(spannableString, wkbVar.b, wkbVar.c, (byte) 0, wkbVar), wkbVar.b, wkbVar.c, 33);
                            } else {
                                spannableString.setSpan(new xkb(wkbVar, 0), wkbVar.b, wkbVar.c, 33);
                            }
                        } else {
                            spannableString.setSpan(new g6c(str, wkbVar), wkbVar.b, wkbVar.c, 33);
                        }
                        if ((wkbVar.a & 256) != 0) {
                            spannableString.setSpan(new xkb(wkbVar, 0), wkbVar.b, wkbVar.c, 33);
                        }
                    }
                    njbVar2.setText(spannableString);
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View xj8Var;
        View bbaVar;
        ylb ylbVar;
        Context context = viewGroup.getContext();
        switch (i) {
            case 1:
                xj8Var = new xj8(this, context);
                break;
            case 2:
                bbaVar = new bba(context, 0, 0);
                xj8Var = bbaVar;
                break;
            case 3:
            default:
                xj8Var = new sb((byte) 28, context, this);
                xj8Var.setTag(-33024);
                break;
            case 4:
                bbaVar = new t1(context, (byte) 0);
                xj8Var = bbaVar;
                break;
            case 5:
                xj8Var = new njb(context);
                break;
            case 6:
                xj8Var = new View(context);
                xj8Var.setTag(-33024);
                break;
            case 7:
                xj8Var = new jf5(context);
                break;
            case 8:
                ylbVar = ((org.telegram.ui.ActionBar.d) this.c).resourceProvider;
                xj8Var = new xib(23, ylbVar, context, false, true);
                break;
        }
        return kt6.h(xj8Var, xj8Var, -1, -2);
    }
}
