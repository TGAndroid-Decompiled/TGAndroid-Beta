package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class m60 extends org.telegram.ui.Components.jk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final o60 E;

    public final Context f40374c;

    public final pf.j1 f40376f;
    public Runnable h;

    public boolean f40377n;

    public int f40379s;
    public int v;

    public int f40380w;

    public int f40381x;

    public int f40382y;
    public ArrayList d = new ArrayList();

    public ArrayList f40375e = new ArrayList();

    public final ArrayList f40378r = new ArrayList();

    public m60(o60 o60Var, Context context) {
        TLRPC.Chat chat;
        TLRPC.User user;
        this.E = o60Var;
        this.f40374c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = o60Var.getContactsController();
        boolean z10 = o60Var.M;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = o60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f40378r.add(user2);
                hashSet.add(Long.valueOf(user2.f22527id));
            }
        }
        if (o60Var.L || o60Var.K || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = o60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f22384id) && !hashSet.contains(Long.valueOf(dialog.f22384id)) && (user = o60Var.getMessagesController().getUser(Long.valueOf(dialog.f22384id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f22384id) && !MessagesController.isSupportUser(user)) {
                        this.f40378r.add(user);
                        hashSet.add(Long.valueOf(user.f22527id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f22384id) && (chat = o60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f22384id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f40378r.add(chat);
                    }
                }
            }
            Collections.sort(this.f40378r, new i60());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f40378r.size()) {
                TLObject tLObject2 = (TLObject) this.f40378r.get(i13);
                if (tLObject != null) {
                    String strA = i60.a(tLObject);
                    String strSubstring = TextUtils.isEmpty(strA) ? "" : strA.substring(0, 1);
                    String strA2 = i60.a(tLObject2);
                    if (!strSubstring.equals(TextUtils.isEmpty(strA2) ? "" : strA2.substring(0, 1))) {
                        ArrayList arrayList2 = this.f40378r;
                        String strA3 = i60.a(tLObject2);
                        arrayList2.add(i13, new n60(TextUtils.isEmpty(strA3) ? "" : strA3.substring(0, 1)));
                    }
                } else {
                    ArrayList arrayList3 = this.f40378r;
                    String strA4 = i60.a(tLObject2);
                    arrayList3.add(i13, new n60(TextUtils.isEmpty(strA4) ? "" : strA4.substring(0, 1)));
                }
                i13++;
                tLObject = tLObject2;
            }
        }
        pf.j1 j1Var = new pf.j1(false);
        this.f40376f = j1Var;
        j1Var.f45836a = new zt(this, 11);
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.d4) {
            ((org.telegram.ui.Cells.d4) view).f24204a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        if (o1Var.f5793f == 0) {
            return false;
        }
        o60 o60Var = this.E;
        if (o60Var.F == null) {
            return true;
        }
        View view = o1Var.f5789a;
        if (!(view instanceof org.telegram.ui.Cells.d4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.d4) view).getObject();
        return !(object instanceof TLRPC.User) || o60Var.F.h(((TLRPC.User) object).f22527id) < 0;
    }

    @Override
    public final String F(int i10) {
        String str;
        String str2;
        if (this.f40377n || i10 < this.A) {
            return null;
        }
        ArrayList arrayList = this.f40378r;
        int size = arrayList.size();
        int i11 = this.A;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof n60) {
            return ((n60) tLObject).f40677a;
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
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
    }

    @Override
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f40375e.clear();
        this.f40376f.f(null, null);
        pf.j1 j1Var = this.f40376f;
        o60 o60Var = this.E;
        j1Var.g(null, true, o60Var.K || o60Var.L, false, false, 0L, false, 0, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        l60 l60Var = new l60(this, str, 0);
        this.h = l60Var;
        dispatchQueue.postRunnable(l60Var, 300L);
    }

    @Override
    public final int h() {
        int i10;
        o60 o60Var = this.E;
        long j10 = o60Var.D;
        long j11 = o60Var.C;
        this.C = -1;
        this.f40379s = -1;
        this.f40380w = -1;
        this.v = -1;
        this.f40381x = -1;
        this.f40382y = -1;
        if (this.f40377n) {
            int size = this.d.size();
            pf.j1 j1Var = this.f40376f;
            int size2 = j1Var.d.size();
            int size3 = j1Var.f45839e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.D = i11;
            return i11;
        }
        if (o60Var.M) {
            this.f40380w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (o60Var.R) {
            int i12 = i10 + 1;
            this.v = i10;
            this.f40379s = i10;
            i10 += 2;
            this.f40381x = i12;
        } else if (o60Var.S) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f40379s = i10;
            i10 += 2;
            this.f40382y = i13;
        } else {
            this.v = i10;
        }
        this.A = i10;
        int size4 = this.f40378r.size() + i10;
        if (o60Var.N) {
            if (j11 != 0) {
                this.B = ChatObject.canUserDoAdminAction(o60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = o60Var.getMessagesController().getChat(Long.valueOf(j10));
                this.B = (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) ? 0 : 2;
            } else {
                this.B = 0;
            }
            if (this.B != 0) {
                this.A++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.C = 0;
            size4++;
        }
        this.D = size4;
        return size4;
    }

    @Override
    public final int j(int i10) {
        if (this.f40377n) {
            return i10 == this.f40376f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i10 == this.f40380w) {
            return 2;
        }
        if (i10 == this.f40379s) {
            return 0;
        }
        if (i10 == this.f40381x || i10 == this.f40382y) {
            return 1;
        }
        if (this.B != 0 && i10 == 0) {
            return 2;
        }
        if (this.C == i10) {
            return 3;
        }
        int i11 = i10 - this.A;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.f40378r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.A) instanceof n60)) ? 1 : 0;
    }

    @Override
    public final void l() {
        super.l();
        this.E.r0();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        long j10;
        CharSequence charSequence2;
        String publicUsername;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ArrayList arrayList = this.f40378r;
        o60 o60Var = this.E;
        if (i11 == 0) {
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (this.f40377n) {
                s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
            } else if (i10 == this.f40379s) {
                s3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
            } else {
                int i12 = i10 - this.A;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.A);
                    if (tLObject2 instanceof n60) {
                        s3Var.setText(((n60) tLObject2).f40677a.toUpperCase());
                    }
                }
            }
            if (i10 == this.v) {
                s3Var.b((o60Var.T == null && o60Var.V.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new u50(this, 2));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == this.f40380w) {
                l8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                l8Var.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                return;
            } else if (this.B == 2) {
                l8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                l8Var.e(org.telegram.ui.ActionBar.g6.f23215m6, org.telegram.ui.ActionBar.g6.G6);
                return;
            } else {
                l8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                l8Var.e(org.telegram.ui.ActionBar.g6.f23215m6, org.telegram.ui.ActionBar.g6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
        CharSequence charSequence3 = null;
        if (this.f40377n) {
            int size = this.d.size();
            pf.j1 j1Var = this.f40376f;
            ArrayList arrayList2 = j1Var.f45839e;
            ArrayList arrayList3 = j1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            if (i10 >= 0 && i10 < size) {
                tLObject = (TLObject) this.d.get(i10);
            } else if (i10 < size || i10 >= size3 + size) {
                tLObject = (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) j1Var.f45839e.get(((i10 - size) - size3) - 1);
            } else {
                tLObject = (TLObject) arrayList3.get(i10 - size);
            }
            if (tLObject == null) {
                charSequence2 = null;
            } else {
                if (tLObject instanceof TLRPC.User) {
                    publicUsername = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    publicUsername = ChatObject.getPublicUsername((TLRPC.Chat) tLObject);
                }
                if (i10 < size) {
                    charSequence2 = (CharSequence) this.f40375e.get(i10);
                    if (charSequence2 != null && !TextUtils.isEmpty(publicUsername)) {
                        if (charSequence2.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i10 <= size || TextUtils.isEmpty(publicUsername)) {
                    charSequence2 = null;
                } else {
                    String strSubstring = j1Var.f45838c;
                    if (strSubstring.startsWith("@")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) publicUsername);
                        int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                        if (iIndexOfIgnoreCase != -1) {
                            int length = strSubstring.length();
                            if (iIndexOfIgnoreCase == 0) {
                                length++;
                            } else {
                                iIndexOfIgnoreCase++;
                            }
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = publicUsername;
                    }
                }
            }
            CharSequence charSequence4 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence4;
        } else {
            if (i10 == this.f40381x) {
                d4Var.f24210r = true;
                d4Var.f24208f = "premium";
                d4Var.f24204a.setImageDrawable(org.telegram.ui.Cells.d4.b(d4Var.getContext(), false));
                d4Var.f24205b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = d4Var.f24206c;
                int i13 = org.telegram.ui.ActionBar.g6.f23423y6;
                h5Var.setTag(Integer.valueOf(i13));
                if (d4Var.G) {
                    i13 = org.telegram.ui.ActionBar.g6.f23260og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, d4Var.I));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                d4Var.c(o60Var.T != null, false);
                return;
            }
            if (i10 == this.f40382y) {
                d4Var.f24211s = true;
                d4Var.f24208f = "miniapps";
                org.telegram.ui.Components.n9 n9Var = d4Var.f24204a;
                d4Var.getContext();
                n9Var.setImageDrawable(org.telegram.ui.Cells.d4.a(false));
                d4Var.f24205b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = d4Var.f24206c;
                int i14 = org.telegram.ui.ActionBar.g6.f23423y6;
                h5Var2.setTag(Integer.valueOf(i14));
                if (d4Var.G) {
                    i14 = org.telegram.ui.ActionBar.g6.f23260og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, d4Var.I));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                d4Var.c(o60Var.U != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.A);
            charSequence = null;
        }
        d4Var.d(tLObject, charSequence3, charSequence);
        if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f22527id;
        } else {
            j10 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).f22380id : 0L;
        }
        if (j10 != 0) {
            a0.h hVar = o60Var.F;
            if (hVar == null || hVar.h(j10) < 0) {
                d4Var.c(o60Var.V.h(j10) >= 0, false);
                d4Var.setCheckBoxEnabled(true);
            } else {
                d4Var.c(true, false);
                d4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s3Var;
        Context context = this.f40374c;
        if (i10 == 0) {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        } else if (i10 == 1) {
            s3Var = new org.telegram.ui.Cells.d4(context, 1, 0, false);
        } else if (i10 != 3) {
            s3Var = new org.telegram.ui.Cells.l8(context);
        } else {
            org.telegram.ui.Components.i60 i60Var = new org.telegram.ui.Components.i60(context, null, 0, null, 1);
            i60Var.setLayoutParams(new f2.y0(-1, -1));
            i60Var.f29506e.setVisibility(8);
            i60Var.d.setText(LocaleController.getString(R.string.NoContacts));
            i60Var.setAnimateLayoutChange(true);
            s3Var = i60Var;
        }
        return new org.telegram.ui.Components.lk0(s3Var);
    }
}
