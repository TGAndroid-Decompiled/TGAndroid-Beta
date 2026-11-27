package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class b0 extends c79 {
    public final PremiumPreviewFragment c;

    public b0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
    public final void t(f89 f89Var, int i) {
        String str;
        View view = f89Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z = premiumPreviewFragment.i0;
        ?? r2 = premiumPreviewFragment.n;
        boolean z2 = true;
        if (i >= r2 && i < premiumPreviewFragment.r) {
            yk8 yk8Var = (yk8) view;
            sl8 sl8Var = (sl8) premiumPreviewFragment.b.get(i - (r2 == true ? 1 : 0));
            if (i == premiumPreviewFragment.r - 1) {
                z2 = false;
            }
            yk8Var.a(sl8Var, z2);
            return;
        }
        int i2 = premiumPreviewFragment.w;
        if (i >= i2 && i < premiumPreviewFragment.x) {
            yk8 yk8Var2 = (yk8) view;
            sl8 sl8Var2 = (sl8) premiumPreviewFragment.c.get(i - i2);
            if (i == premiumPreviewFragment.x - 1) {
                z2 = false;
            }
            yk8Var2.a(sl8Var2, z2);
        } else if (i == premiumPreviewFragment.y) {
            ilb ilbVar = (ilb) view;
            ilbVar.setText("");
            ilbVar.setFixedSize(12);
        } else if (i != premiumPreviewFragment.E && i != premiumPreviewFragment.F && i != premiumPreviewFragment.I) {
            if (i == premiumPreviewFragment.s) {
                ((mf5) view).setText(ob6.M0(2131746723, null));
            } else if (i == premiumPreviewFragment.H) {
                ((mf5) view).setText(ob6.M0(2131745078, null));
            } else if (i == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull Y1 = premiumPreviewFragment.getMessagesController().Y1(premiumPreviewFragment.getUserConfig().e());
                skb skbVar = (skb) view;
                String M0 = ob6.M0(2131745080, null);
                if (Y1 != null && !Y1.sponsored_enabled) {
                    z2 = false;
                }
                skbVar.l(M0, z2, false);
            }
        } else {
            ilb ilbVar2 = (ilb) view;
            if (!z) {
                ilbVar2.setTextColor(aob.p1(0.75f, -1));
                ilbVar2.getTextView().setLinkTextColor(-1);
                ilbVar2.setLinkTextRippleColor(Integer.valueOf(aob.p1(0.15f, -1)));
            }
            ilbVar2.setFixedSize(0);
            if (i == premiumPreviewFragment.I) {
                ilbVar2.setText(hl.D2(hl.N2(ob6.M0(2131745079, null), -1, 0, new uk8(this, (byte) 1), null), true));
            } else if (i == premiumPreviewFragment.E) {
                if (premiumPreviewFragment.h0) {
                    ilbVar2.setText(ob6.M0(2131746722, null));
                    return;
                }
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E;
                if (tL_help_premiumPromo != null) {
                    SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
                    ls6.h(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
                    for (smb smbVar : (smb[]) spannableString.getSpans(0, spannableString.length(), smb.class)) {
                        rmb rmbVar = smbVar.b;
                        TLRPC.MessageEntity messageEntity = rmbVar.d;
                        if (messageEntity != null) {
                            String str2 = tL_help_premiumPromo.status_text;
                            int i3 = messageEntity.offset;
                            str = TextUtils.substring(str2, i3, messageEntity.length + i3);
                        } else {
                            str = null;
                        }
                        TLRPC.MessageEntity messageEntity2 = rmbVar.d;
                        if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                            spannableString.setSpan(new c8c(str, 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                        } else if (!(messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) && !(messageEntity2 instanceof TLRPC.TL_messageEntityMention) && !(messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                            if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                                spannableString.setSpan(new h8c(c00.i("mailto:", str), rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                                if (!str.toLowerCase().contains("://")) {
                                    spannableString.setSpan(new d8c("http://".concat(str), rmbVar), rmbVar.b, rmbVar.c, 33);
                                } else {
                                    spannableString.setSpan(new d8c(str, rmbVar), rmbVar.b, rmbVar.c, 33);
                                }
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                                spannableString.setSpan(new f8c(c00.i("card:", str), rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                                String h = f78.h(str, false);
                                if (str.startsWith("+")) {
                                    h = c00.i("+", h);
                                }
                                spannableString.setSpan(new d8c(c00.i("tel:", h), rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                                h8c h8cVar = new h8c(rmbVar.d.url, rmbVar);
                                h8cVar.b = true;
                                spannableString.setSpan(h8cVar, rmbVar.b, rmbVar.c, 33);
                                if (!z) {
                                    spannableString.setSpan(new y7c(hl.o()), rmbVar.b, rmbVar.c, 33);
                                }
                            } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                                spannableString.setSpan(new i8c(String.valueOf(((TLRPC.TL_messageEntityMentionName) rmbVar.d).user_id), 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                spannableString.setSpan(new i8c(String.valueOf(((TLRPC.TL_inputMessageEntityMentionName) rmbVar.d).user_id.user_id), 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else if ((rmbVar.a & 4) != 0) {
                                spannableString.setSpan(new e8c(spannableString, rmbVar.b, rmbVar.c, (byte) 0, rmbVar), rmbVar.b, rmbVar.c, 33);
                            } else {
                                spannableString.setSpan(new smb(rmbVar, 0), rmbVar.b, rmbVar.c, 33);
                            }
                        } else {
                            spannableString.setSpan(new f8c(str, rmbVar), rmbVar.b, rmbVar.c, 33);
                        }
                        if ((rmbVar.a & 256) != 0) {
                            spannableString.setSpan(new smb(rmbVar, 0), rmbVar.b, rmbVar.c, 33);
                        }
                    }
                    ilbVar2.setText(spannableString);
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View jl8Var;
        View scaVar;
        vnb vnbVar;
        Context context = viewGroup.getContext();
        switch (i) {
            case 1:
                jl8Var = new jl8(this, context);
                break;
            case 2:
                scaVar = new sca(context, 0, 0);
                jl8Var = scaVar;
                break;
            case 3:
            default:
                jl8Var = new tb((byte) 28, context, this);
                jl8Var.setTag(-33024);
                break;
            case 4:
                scaVar = new u1(context, (byte) 0);
                jl8Var = scaVar;
                break;
            case 5:
                jl8Var = new ilb(context);
                break;
            case 6:
                jl8Var = new View(context);
                jl8Var.setTag(-33024);
                break;
            case 7:
                jl8Var = new mf5(context);
                break;
            case 8:
                vnbVar = ((org.telegram.ui.ActionBar.e) this.c).resourceProvider;
                jl8Var = new skb(23, vnbVar, context, false, true);
                break;
        }
        return qu6.h(jl8Var, jl8Var, -1, -2);
    }
}
