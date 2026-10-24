package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n60 extends org.telegram.ui.Components.tl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final p60 I;
    public final Context f39737c;
    public final hg.a2 f39738f;
    public Runnable h;
    public boolean f39739n;
    public int f39741s;
    public int v;
    public int f39742w;
    public int f39743x;
    public int f39744y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f39740r = new ArrayList();

    public n60(p60 p60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = p60Var;
        this.f39737c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = p60Var.getContactsController();
        boolean z10 = p60Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = p60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f39740r.add(user2);
                hashSet.add(Long.valueOf(user2.f20491id));
            }
        }
        if (p60Var.P || p60Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = p60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f20348id) && !hashSet.contains(Long.valueOf(dialog.f20348id)) && (user = p60Var.getMessagesController().getUser(Long.valueOf(dialog.f20348id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f20348id) && !MessagesController.isSupportUser(user)) {
                        this.f39740r.add(user);
                        hashSet.add(Long.valueOf(user.f20491id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f20348id) && (chat = p60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f20348id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f39740r.add(chat);
                    }
                }
            }
            Collections.sort(this.f39740r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f39740r.size()) {
                TLObject tLObject2 = (TLObject) this.f39740r.get(i13);
                if (tLObject != null) {
                    String a2 = j60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = j60.a(tLObject2);
                    if (TextUtils.isEmpty(a10)) {
                        substring2 = "";
                    } else {
                        substring2 = a10.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.f39740r;
                String a11 = j60.a(tLObject2);
                arrayList2.add(i13, new o60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f39738f = a2Var;
        a2Var.f11819a = new xt(this, 11);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).f22358a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f != 0) {
            p60 p60Var = this.I;
            if (p60Var.J != null) {
                View view = b1Var.f46342a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    Object object = ((org.telegram.ui.Cells.f4) view).getObject();
                    if ((object instanceof TLRPC.User) && p60Var.J.h(((TLRPC.User) object).f20491id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        String str;
        String str2;
        if (!this.f39739n && i10 >= this.E) {
            ArrayList arrayList = this.f39740r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof o60) {
                    return ((o60) tLObject).f40090a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (LocaleController.nameDisplayOrder == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f39738f.f(null, null);
        hg.a2 a2Var = this.f39738f;
        p60 p60Var = this.I;
        if (!p60Var.O && !p60Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        a2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            m60 m60Var = new m60(this, str, 0);
            this.h = m60Var;
            dispatchQueue2.postRunnable(m60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        p60 p60Var = this.I;
        long j10 = p60Var.H;
        long j11 = p60Var.G;
        this.G = -1;
        this.f39741s = -1;
        this.f39742w = -1;
        this.v = -1;
        this.f39743x = -1;
        this.f39744y = -1;
        if (this.f39739n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f39738f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (p60Var.Q) {
            this.f39742w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (p60Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f39741s = i10;
            i10 += 2;
            this.f39743x = i13;
        } else if (p60Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f39741s = i10;
            i10 += 2;
            this.f39744y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f39740r.size() + i10;
        if (p60Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(p60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = p60Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.F = i11;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override
    public final int j(int i10) {
        if (this.f39739n) {
            if (i10 == this.f39738f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f39742w) {
            if (i10 != this.f39741s) {
                if (i10 != this.f39743x && i10 != this.f39744y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f39740r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof o60)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void l() {
        super.l();
        this.I.r0();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        ArrayList arrayList = this.f39740r;
        p60 p60Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == this.f39742w) {
                        r8Var.o(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        r8Var.g(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
                        return;
                    } else if (this.F == 2) {
                        r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        r8Var.g(org.telegram.ui.ActionBar.k6.f21347m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    } else {
                        r8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        r8Var.g(org.telegram.ui.ActionBar.k6.f21347m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f39739n) {
                int size = this.d.size();
                hg.a2 a2Var = this.f39738f;
                ArrayList arrayList2 = a2Var.e;
                ArrayList arrayList3 = a2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) a2Var.e.get(((i10 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        publicUsername = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                    } else {
                        return;
                    }
                    if (i10 < size) {
                        charSequence = (CharSequence) this.e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = a2Var.f11821c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) publicUsername);
                            int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                            if (indexOfIgnoreCase != -1) {
                                int length = str.length();
                                if (indexOfIgnoreCase == 0) {
                                    length++;
                                } else {
                                    indexOfIgnoreCase++;
                                }
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = publicUsername;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i10 == this.f39743x) {
                f4Var.f22363r = true;
                f4Var.f22361f = "premium";
                f4Var.f22358a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.f22359b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.n5 n5Var = f4Var.f22360c;
                int i12 = org.telegram.ui.ActionBar.k6.f21572y6;
                n5Var.setTag(Integer.valueOf(i12));
                if (f4Var.K) {
                    i12 = org.telegram.ui.ActionBar.k6.f21395og;
                }
                org.telegram.ui.ActionBar.r6.Z(n5Var, i12, f4Var.M);
                n5Var.setEmojiColor(n5Var.getTextColor());
                n5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (p60Var.X == null) {
                    z11 = false;
                }
                f4Var.c(z11, false);
                return;
            } else if (i10 == this.f39744y) {
                f4Var.f22364s = true;
                f4Var.f22361f = "miniapps";
                org.telegram.ui.Components.u9 u9Var = f4Var.f22358a;
                f4Var.getContext();
                u9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.f22359b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.n5 n5Var2 = f4Var.f22360c;
                int i13 = org.telegram.ui.ActionBar.k6.f21572y6;
                n5Var2.setTag(Integer.valueOf(i13));
                if (f4Var.K) {
                    i13 = org.telegram.ui.ActionBar.k6.f21395og;
                }
                org.telegram.ui.ActionBar.r6.Z(n5Var2, i13, f4Var.M);
                n5Var2.setEmojiColor(n5Var2.getTextColor());
                n5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (p60Var.Y == null) {
                    z11 = false;
                }
                f4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            f4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f20491id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f20344id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = p60Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    f4Var.c(true, false);
                    f4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (p60Var.Z.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f4Var.c(z10, false);
                f4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
        if (this.f39739n) {
            u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f39741s) {
            u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof o60) {
                    u3Var.setText(((o60) tLObject2).f40090a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (p60Var.X == null && p60Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            u3Var.a(string, new w50(this, 2));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.f39737c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    u3Var = new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(0, 1, context, null, null);
                    o70Var.setLayoutParams(new s4.o0(-1, -1));
                    o70Var.e.setVisibility(8);
                    o70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    o70Var.setAnimateLayoutChange(true);
                    u3Var = o70Var;
                }
            } else {
                u3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return new s4.b1(u3Var);
    }
}
