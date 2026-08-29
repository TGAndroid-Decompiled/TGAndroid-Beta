package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
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
public final class k60 extends org.telegram.ui.Components.tk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final m60 E;
    public final Context f39761c;
    public final rf.k1 f39763f;
    public Runnable h;
    public boolean f39764n;
    public int f39766s;
    public int v;
    public int f39767w;
    public int f39768x;
    public int f39769y;
    public ArrayList d = new ArrayList();
    public ArrayList f39762e = new ArrayList();
    public final ArrayList f39765r = new ArrayList();

    public k60(m60 m60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.E = m60Var;
        this.f39761c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = m60Var.getContactsController();
        boolean z10 = m60Var.M;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = m60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f39765r.add(user2);
                hashSet.add(Long.valueOf(user2.f22539id));
            }
        }
        if (m60Var.L || m60Var.K || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = m60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f22396id) && !hashSet.contains(Long.valueOf(dialog.f22396id)) && (user = m60Var.getMessagesController().getUser(Long.valueOf(dialog.f22396id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f22396id) && !MessagesController.isSupportUser(user)) {
                        this.f39765r.add(user);
                        hashSet.add(Long.valueOf(user.f22539id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f22396id) && (chat = m60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f22396id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f39765r.add(chat);
                    }
                }
            }
            Collections.sort(this.f39765r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f39765r.size()) {
                TLObject tLObject2 = (TLObject) this.f39765r.get(i13);
                if (tLObject != null) {
                    String a2 = g60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = g60.a(tLObject2);
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
                ArrayList arrayList2 = this.f39765r;
                String a11 = g60.a(tLObject2);
                arrayList2.add(i13, new l60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        rf.k1 k1Var = new rf.k1(false);
        this.f39763f = k1Var;
        k1Var.f47277a = new xt(this, 11);
    }

    @Override
    public final void A(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.e4) {
            ((org.telegram.ui.Cells.e4) view).f24277a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 0) {
            m60 m60Var = this.E;
            if (m60Var.F != null) {
                View view = n1Var.f6432a;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    Object object = ((org.telegram.ui.Cells.e4) view).getObject();
                    if ((object instanceof TLRPC.User) && m60Var.F.h(((TLRPC.User) object).f22539id) >= 0) {
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
        if (!this.f39764n && i10 >= this.A) {
            ArrayList arrayList = this.f39765r;
            int size = arrayList.size();
            int i11 = this.A;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof l60) {
                    return ((l60) tLObject).f40107a;
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
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = (int) (h() * f9);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f39762e.clear();
        this.f39763f.f(null, null);
        rf.k1 k1Var = this.f39763f;
        m60 m60Var = this.E;
        if (!m60Var.K && !m60Var.L) {
            z10 = false;
        } else {
            z10 = true;
        }
        k1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            j60 j60Var = new j60(this, str, 0);
            this.h = j60Var;
            dispatchQueue.postRunnable(j60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        m60 m60Var = this.E;
        long j10 = m60Var.D;
        long j11 = m60Var.C;
        this.C = -1;
        this.f39766s = -1;
        this.f39767w = -1;
        this.v = -1;
        this.f39768x = -1;
        this.f39769y = -1;
        if (this.f39764n) {
            int size = this.d.size();
            rf.k1 k1Var = this.f39763f;
            int size2 = k1Var.d.size();
            int size3 = k1Var.f47280e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.D = i12;
            return i12;
        }
        if (m60Var.M) {
            this.f39767w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (m60Var.R) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f39766s = i10;
            i10 += 2;
            this.f39768x = i13;
        } else if (m60Var.S) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f39766s = i10;
            i10 += 2;
            this.f39769y = i14;
        } else {
            this.v = i10;
        }
        this.A = i10;
        int size4 = this.f39765r.size() + i10;
        if (m60Var.N) {
            if (j11 != 0) {
                this.B = ChatObject.canUserDoAdminAction(m60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = m60Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                this.B = i11;
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
        if (this.f39764n) {
            if (i10 == this.f39763f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f39767w) {
            if (i10 != this.f39766s) {
                if (i10 != this.f39768x && i10 != this.f39769y) {
                    if (this.B != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.C == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.A;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f39765r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.A) instanceof l60)) {
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
        this.E.r0();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        ArrayList arrayList = this.f39765r;
        m60 m60Var = this.E;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i10 == this.f39767w) {
                        m8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        m8Var.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                        return;
                    } else if (this.B == 2) {
                        m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        m8Var.e(org.telegram.ui.ActionBar.g6.f23223m6, org.telegram.ui.ActionBar.g6.G6);
                        return;
                    } else {
                        m8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        m8Var.e(org.telegram.ui.ActionBar.g6.f23223m6, org.telegram.ui.ActionBar.g6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f39764n) {
                int size = this.d.size();
                rf.k1 k1Var = this.f39763f;
                ArrayList arrayList2 = k1Var.f47280e;
                ArrayList arrayList3 = k1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) k1Var.f47280e.get(((i10 - size) - size3) - 1);
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
                        charSequence = (CharSequence) this.f39762e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = k1Var.f47279c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f39768x) {
                e4Var.f24283r = true;
                e4Var.f24281f = "premium";
                e4Var.f24277a.setImageDrawable(org.telegram.ui.Cells.e4.b(e4Var.getContext(), false));
                e4Var.f24278b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = e4Var.f24279c;
                int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
                h5Var.setTag(Integer.valueOf(i12));
                if (e4Var.G) {
                    i12 = org.telegram.ui.ActionBar.g6.f23269og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, e4Var.I));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (m60Var.T == null) {
                    z11 = false;
                }
                e4Var.c(z11, false);
                return;
            } else if (i10 == this.f39769y) {
                e4Var.f24284s = true;
                e4Var.f24281f = "miniapps";
                org.telegram.ui.Components.t9 t9Var = e4Var.f24277a;
                e4Var.getContext();
                t9Var.setImageDrawable(org.telegram.ui.Cells.e4.a(false));
                e4Var.f24278b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = e4Var.f24279c;
                int i13 = org.telegram.ui.ActionBar.g6.f23433y6;
                h5Var2.setTag(Integer.valueOf(i13));
                if (e4Var.G) {
                    i13 = org.telegram.ui.ActionBar.g6.f23269og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, e4Var.I));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (m60Var.U == null) {
                    z11 = false;
                }
                e4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.A);
                spannableStringBuilder = null;
            }
            e4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f22539id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f22392id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = m60Var.F;
                if (hVar != null && hVar.h(j10) >= 0) {
                    e4Var.c(true, false);
                    e4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (m60Var.V.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e4Var.c(z10, false);
                e4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
        if (this.f39764n) {
            s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f39766s) {
            s3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.A;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.A);
                if (tLObject2 instanceof l60) {
                    s3Var.setText(((l60) tLObject2).f40107a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (m60Var.T == null && m60Var.V.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            s3Var.b(string, new t50(this, 2));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        Context context = this.f39761c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    s3Var = new org.telegram.ui.Cells.m8(context);
                } else {
                    org.telegram.ui.Components.q60 q60Var = new org.telegram.ui.Components.q60(context, null, 0, null, 1);
                    q60Var.setLayoutParams(new f2.x0(-1, -1));
                    q60Var.f32122e.setVisibility(8);
                    q60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    q60Var.setAnimateLayoutChange(true);
                    s3Var = q60Var;
                }
            } else {
                s3Var = new org.telegram.ui.Cells.e4(context, 1, 0, false);
            }
        } else {
            s3Var = new org.telegram.ui.Cells.s3(context, null);
        }
        return new f2.n1(s3Var);
    }
}
