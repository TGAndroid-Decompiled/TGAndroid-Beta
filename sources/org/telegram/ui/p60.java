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
public final class p60 extends org.telegram.ui.Components.tl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final r60 I;
    public final Context f42365c;
    public final ig.a2 f42366f;
    public Runnable h;
    public boolean f42367n;
    public int f42369s;
    public int v;
    public int f42370w;
    public int f42371x;
    public int f42372y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f42368r = new ArrayList();

    public p60(r60 r60Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = r60Var;
        this.f42365c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = r60Var.getContactsController();
        boolean z10 = r60Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = r60Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f42368r.add(user2);
                hashSet.add(Long.valueOf(user2.f22174id));
            }
        }
        if (r60Var.P || r60Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = r60Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f22031id) && !hashSet.contains(Long.valueOf(dialog.f22031id)) && (user = r60Var.getMessagesController().getUser(Long.valueOf(dialog.f22031id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f22031id) && !MessagesController.isSupportUser(user)) {
                        this.f42368r.add(user);
                        hashSet.add(Long.valueOf(user.f22174id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f22031id) && (chat = r60Var.getMessagesController().getChat(Long.valueOf(-dialog2.f22031id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f42368r.add(chat);
                    }
                }
            }
            Collections.sort(this.f42368r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f42368r.size()) {
                TLObject tLObject2 = (TLObject) this.f42368r.get(i13);
                if (tLObject != null) {
                    String a2 = l60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = l60.a(tLObject2);
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
                ArrayList arrayList2 = this.f42368r;
                String a11 = l60.a(tLObject2);
                arrayList2.add(i13, new q60(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        ig.a2 a2Var = new ig.a2(false);
        this.f42366f = a2Var;
        a2Var.f13988a = new qt(this, 12);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.k4) {
            ((org.telegram.ui.Cells.k4) view).f24319a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f != 0) {
            r60 r60Var = this.I;
            if (r60Var.J != null) {
                View view = e1Var.f47735a;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    Object object = ((org.telegram.ui.Cells.k4) view).getObject();
                    if ((object instanceof TLRPC.User) && r60Var.J.h(((TLRPC.User) object).f22174id) >= 0) {
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
        if (!this.f42367n && i10 >= this.E) {
            ArrayList arrayList = this.f42368r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof q60) {
                    return ((q60) tLObject).f42750a;
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
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
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
        this.f42366f.f(null, null);
        ig.a2 a2Var = this.f42366f;
        r60 r60Var = this.I;
        if (!r60Var.O && !r60Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        a2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            o60 o60Var = new o60(this, str, 0);
            this.h = o60Var;
            dispatchQueue2.postRunnable(o60Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        r60 r60Var = this.I;
        long j10 = r60Var.H;
        long j11 = r60Var.G;
        this.G = -1;
        this.f42369s = -1;
        this.f42370w = -1;
        this.v = -1;
        this.f42371x = -1;
        this.f42372y = -1;
        if (this.f42367n) {
            int size = this.d.size();
            ig.a2 a2Var = this.f42366f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (r60Var.Q) {
            this.f42370w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (r60Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f42369s = i10;
            i10 += 2;
            this.f42371x = i13;
        } else if (r60Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f42369s = i10;
            i10 += 2;
            this.f42372y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f42368r.size() + i10;
        if (r60Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(r60Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = r60Var.getMessagesController().getChat(Long.valueOf(j10));
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
        if (this.f42367n) {
            if (i10 == this.f42366f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f42370w) {
            if (i10 != this.f42369s) {
                if (i10 != this.f42371x && i10 != this.f42372y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f42368r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof q60)) {
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
        this.I.s0();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        ArrayList arrayList = this.f42368r;
        r60 r60Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (i10 == this.f42370w) {
                        v8Var.o(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23690v6, org.telegram.ui.ActionBar.y6.f23671u6);
                        return;
                    } else if (this.F == 2) {
                        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23518m6, org.telegram.ui.ActionBar.y6.G6);
                        return;
                    } else {
                        v8Var.o(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        v8Var.g(org.telegram.ui.ActionBar.y6.f23518m6, org.telegram.ui.ActionBar.y6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f42367n) {
                int size = this.d.size();
                ig.a2 a2Var = this.f42366f;
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
                        String str = a2Var.f13990c;
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
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.f23595q6, null), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f42371x) {
                k4Var.f24324r = true;
                k4Var.f24322f = "premium";
                k4Var.f24319a.setImageDrawable(org.telegram.ui.Cells.k4.b(k4Var.getContext(), false));
                k4Var.f24320b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.b6 b6Var = k4Var.f24321c;
                int i12 = org.telegram.ui.ActionBar.y6.f23746y6;
                b6Var.setTag(Integer.valueOf(i12));
                if (k4Var.K) {
                    i12 = org.telegram.ui.ActionBar.y6.f23568og;
                }
                org.telegram.ui.ActionBar.f7.Y(b6Var, i12, k4Var.M);
                b6Var.setEmojiColor(b6Var.getTextColor());
                b6Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (r60Var.X == null) {
                    z11 = false;
                }
                k4Var.c(z11, false);
                return;
            } else if (i10 == this.f42372y) {
                k4Var.f24325s = true;
                k4Var.f24322f = "miniapps";
                org.telegram.ui.Components.y9 y9Var = k4Var.f24319a;
                k4Var.getContext();
                y9Var.setImageDrawable(org.telegram.ui.Cells.k4.a(false));
                k4Var.f24320b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.b6 b6Var2 = k4Var.f24321c;
                int i13 = org.telegram.ui.ActionBar.y6.f23746y6;
                b6Var2.setTag(Integer.valueOf(i13));
                if (k4Var.K) {
                    i13 = org.telegram.ui.ActionBar.y6.f23568og;
                }
                org.telegram.ui.ActionBar.f7.Y(b6Var2, i13, k4Var.M);
                b6Var2.setEmojiColor(b6Var2.getTextColor());
                b6Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (r60Var.Y == null) {
                    z11 = false;
                }
                k4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            k4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f22174id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f22027id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = r60Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    k4Var.c(true, false);
                    k4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (r60Var.Z.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k4Var.c(z10, false);
                k4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        if (this.f42367n) {
            z3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f42369s) {
            z3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof q60) {
                    z3Var.setText(((q60) tLObject2).f42750a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (r60Var.X == null && r60Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            z3Var.a(string, new x50(this, 2));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View z3Var;
        Context context = this.f42365c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    z3Var = new org.telegram.ui.Cells.v8(context);
                } else {
                    org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(0, 1, context, null, null);
                    r70Var.setLayoutParams(new s4.q0(-1, -1));
                    r70Var.e.setVisibility(8);
                    r70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    r70Var.setAnimateLayoutChange(true);
                    z3Var = r70Var;
                }
            } else {
                z3Var = new org.telegram.ui.Cells.k4(context, 1, 0, false);
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        }
        return new s4.e1(z3Var);
    }
}
