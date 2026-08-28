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
public final class i60 extends org.telegram.ui.Components.gk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public final k60 E;
    public final Context f39032c;
    public final of.v1 f39034f;
    public Runnable h;
    public boolean f39035n;
    public int f39037s;
    public int v;
    public int f39038w;
    public int f39039x;
    public int f39040y;
    public ArrayList d = new ArrayList();
    public ArrayList f39033e = new ArrayList();
    public final ArrayList f39036r = new ArrayList();

    public i60(k60 k60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.E = k60Var;
        this.f39032c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = k60Var.getContactsController();
        boolean z10 = k60Var.M;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.User user2 = k60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i9).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f39036r.add(user2);
                hashSet.add(Long.valueOf(user2.f22527id));
            }
        }
        if (k60Var.L || k60Var.K || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = k60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = allDialogs.get(i10);
                    if (DialogObject.isUserDialog(dialog.f22384id) && !hashSet.contains(Long.valueOf(dialog.f22384id)) && (user = k60Var.getMessagesController().getUser(Long.valueOf(dialog.f22384id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f22384id) && !MessagesController.isSupportUser(user)) {
                        this.f39036r.add(user);
                        hashSet.add(Long.valueOf(user.f22527id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i11);
                    if (DialogObject.isChatDialog(dialog2.f22384id) && (chat = k60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f22384id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f39036r.add(chat);
                    }
                }
            }
            Collections.sort(this.f39036r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f39036r.size()) {
                TLObject tLObject2 = (TLObject) this.f39036r.get(i12);
                if (tLObject != null) {
                    String a2 = e60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a3 = e60.a(tLObject2);
                    if (TextUtils.isEmpty(a3)) {
                        substring2 = "";
                    } else {
                        substring2 = a3.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList2 = this.f39036r;
                String a10 = e60.a(tLObject2);
                arrayList2.add(i12, new j60(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        of.v1 v1Var = new of.v1(false);
        this.f39034f = v1Var;
        v1Var.f19524a = new wt(this, 11);
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f24381a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 0) {
            k60 k60Var = this.E;
            if (k60Var.F != null) {
                View view = q1Var.f5501a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && k60Var.F.h(((TLRPC.User) object).f22527id) >= 0) {
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
    public final String F(int i9) {
        String str;
        String str2;
        if (!this.f39035n && i9 >= this.A) {
            ArrayList arrayList = this.f39036r;
            int size = arrayList.size();
            int i10 = this.A;
            if (i9 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i9 - i10);
                if (tLObject instanceof j60) {
                    return ((j60) tLObject).f39383a;
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
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f39033e.clear();
        this.f39034f.f(null, null);
        of.v1 v1Var = this.f39034f;
        k60 k60Var = this.E;
        if (!k60Var.K && !k60Var.L) {
            z10 = false;
        } else {
            z10 = true;
        }
        v1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            h60 h60Var = new h60(this, str, 0);
            this.h = h60Var;
            dispatchQueue.postRunnable(h60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i9;
        int i10;
        k60 k60Var = this.E;
        long j10 = k60Var.D;
        long j11 = k60Var.C;
        this.C = -1;
        this.f39037s = -1;
        this.f39038w = -1;
        this.v = -1;
        this.f39039x = -1;
        this.f39040y = -1;
        if (this.f39035n) {
            int size = this.d.size();
            of.v1 v1Var = this.f39034f;
            int size2 = v1Var.d.size();
            int size3 = v1Var.f19527e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.D = i11;
            return i11;
        }
        if (k60Var.M) {
            this.f39038w = 0;
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (k60Var.R) {
            int i12 = i9 + 1;
            this.v = i9;
            this.f39037s = i9;
            i9 += 2;
            this.f39039x = i12;
        } else if (k60Var.S) {
            int i13 = i9 + 1;
            this.v = i9;
            this.f39037s = i9;
            i9 += 2;
            this.f39040y = i13;
        } else {
            this.v = i9;
        }
        this.A = i9;
        int size4 = this.f39036r.size() + i9;
        if (k60Var.N) {
            if (j11 != 0) {
                this.B = ChatObject.canUserDoAdminAction(k60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = k60Var.getMessagesController().getChat(Long.valueOf(j10));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.B = i10;
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
    public final int j(int i9) {
        if (this.f39035n) {
            if (i9 == this.f39034f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i9 != this.f39038w) {
            if (i9 != this.f39037s) {
                if (i9 != this.f39039x && i9 != this.f39040y) {
                    if (this.B != 0 && i9 == 0) {
                        return 2;
                    }
                    if (this.C == i9) {
                        return 3;
                    }
                    int i10 = i9 - this.A;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f39036r;
                        if (i10 < arrayList.size() && (arrayList.get(i9 - this.A) instanceof j60)) {
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
        this.E.q0();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        ArrayList arrayList = this.f39036r;
        k60 k60Var = this.E;
        if (i10 != 0) {
            boolean z11 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (i9 == this.f39038w) {
                        p8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        p8Var.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                        return;
                    } else if (this.B == 2) {
                        p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        p8Var.e(org.telegram.ui.ActionBar.f6.f23162m6, org.telegram.ui.ActionBar.f6.G6);
                        return;
                    } else {
                        p8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        p8Var.e(org.telegram.ui.ActionBar.f6.f23162m6, org.telegram.ui.ActionBar.f6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f39035n) {
                int size = this.d.size();
                of.v1 v1Var = this.f39034f;
                ArrayList arrayList2 = v1Var.f19527e;
                ArrayList arrayList3 = v1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i9 >= 0 && i9 < size) {
                    tLObject = (TLObject) this.d.get(i9);
                } else if (i9 >= size && i9 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i9 - size);
                } else if (i9 > size + size3 && i9 <= size2 + size + size3) {
                    tLObject = (TLObject) v1Var.f19527e.get(((i9 - size) - size3) - 1);
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
                    if (i9 < size) {
                        charSequence = (CharSequence) this.f39033e.get(i9);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i9 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = v1Var.f19526c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i9 == this.f39039x) {
                g4Var.f24387r = true;
                g4Var.f24385f = "premium";
                g4Var.f24381a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f24382b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = g4Var.f24383c;
                int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
                h5Var.setTag(Integer.valueOf(i11));
                if (g4Var.G) {
                    i11 = org.telegram.ui.ActionBar.f6.f23203og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, g4Var.I));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (k60Var.T == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else if (i9 == this.f39040y) {
                g4Var.f24388s = true;
                g4Var.f24385f = "miniapps";
                org.telegram.ui.Components.o9 o9Var = g4Var.f24381a;
                g4Var.getContext();
                o9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f24382b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = g4Var.f24383c;
                int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
                h5Var2.setTag(Integer.valueOf(i12));
                if (g4Var.G) {
                    i12 = org.telegram.ui.ActionBar.f6.f23203og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, g4Var.I));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (k60Var.U == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i9 - this.A);
                spannableStringBuilder = null;
            }
            g4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f22527id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f22380id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = k60Var.F;
                if (hVar != null && hVar.h(j10) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (k60Var.V.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g4Var.c(z10, false);
                g4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
        if (this.f39035n) {
            v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i9 == this.f39037s) {
            v3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i13 = i9 - this.A;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i9 - this.A);
                if (tLObject2 instanceof j60) {
                    v3Var.setText(((j60) tLObject2).f39383a.toUpperCase());
                }
            }
        }
        if (i9 == this.v) {
            if (k60Var.T == null && k60Var.V.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            v3Var.b(string, new q50(this, 2));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View v3Var;
        Context context = this.f39032c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    v3Var = new org.telegram.ui.Cells.p8(context);
                } else {
                    org.telegram.ui.Components.d60 d60Var = new org.telegram.ui.Components.d60(context, null, 0, null, 1);
                    d60Var.setLayoutParams(new f2.a1(-1, -1));
                    d60Var.f28885e.setVisibility(8);
                    d60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    d60Var.setAnimateLayoutChange(true);
                    v3Var = d60Var;
                }
            } else {
                v3Var = new org.telegram.ui.Cells.g4(context, 1, 0, false);
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return new f2.q1(v3Var);
    }
}
