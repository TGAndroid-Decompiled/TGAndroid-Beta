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
public final class d70 extends org.telegram.ui.Components.tk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final f70 I;
    public final Context f35693c;
    public final hg.b2 f35695f;
    public Runnable h;
    public boolean f35696n;
    public int f35698s;
    public int v;
    public int f35699w;
    public int f35700x;
    public int f35701y;
    public ArrayList d = new ArrayList();
    public ArrayList f35694e = new ArrayList();
    public final ArrayList f35697r = new ArrayList();

    public d70(f70 f70Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = f70Var;
        this.f35693c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = f70Var.getContactsController();
        boolean z10 = f70Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = f70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f35697r.add(user2);
                hashSet.add(Long.valueOf(user2.f20016id));
            }
        }
        if (f70Var.P || f70Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = f70Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f19873id) && !hashSet.contains(Long.valueOf(dialog.f19873id)) && (user = f70Var.getMessagesController().getUser(Long.valueOf(dialog.f19873id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f19873id) && !MessagesController.isSupportUser(user)) {
                        this.f35697r.add(user);
                        hashSet.add(Long.valueOf(user.f20016id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f19873id) && (chat = f70Var.getMessagesController().getChat(Long.valueOf(-dialog2.f19873id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f35697r.add(chat);
                    }
                }
            }
            Collections.sort(this.f35697r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f35697r.size()) {
                TLObject tLObject2 = (TLObject) this.f35697r.get(i13);
                if (tLObject != null) {
                    String a2 = z60.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = z60.a(tLObject2);
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
                ArrayList arrayList2 = this.f35697r;
                String a11 = z60.a(tLObject2);
                arrayList2.add(i13, new e70(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        hg.b2 b2Var = new hg.b2(false);
        this.f35695f = b2Var;
        b2Var.f10979a = new iu(this, 11);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).f21908a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f != 0) {
            f70 f70Var = this.I;
            if (f70Var.J != null) {
                View view = c1Var.f45738a;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    Object object = ((org.telegram.ui.Cells.f4) view).getObject();
                    if ((object instanceof TLRPC.User) && f70Var.J.h(((TLRPC.User) object).f20016id) >= 0) {
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
        if (!this.f35696n && i10 >= this.E) {
            ArrayList arrayList = this.f35697r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof e70) {
                    return ((e70) tLObject).f35956a;
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
    public final void G(org.telegram.ui.Components.ll0 ll0Var, float f7, int[] iArr) {
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
        this.f35694e.clear();
        this.f35695f.f(null, null);
        hg.b2 b2Var = this.f35695f;
        f70 f70Var = this.I;
        if (!f70Var.O && !f70Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        b2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            c70 c70Var = new c70(this, str, 0);
            this.h = c70Var;
            dispatchQueue.postRunnable(c70Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        f70 f70Var = this.I;
        long j3 = f70Var.H;
        long j10 = f70Var.G;
        this.G = -1;
        this.f35698s = -1;
        this.f35699w = -1;
        this.v = -1;
        this.f35700x = -1;
        this.f35701y = -1;
        if (this.f35696n) {
            int size = this.d.size();
            hg.b2 b2Var = this.f35695f;
            int size2 = b2Var.d.size();
            int size3 = b2Var.f10982e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (f70Var.Q) {
            this.f35699w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (f70Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f35698s = i10;
            i10 += 2;
            this.f35700x = i13;
        } else if (f70Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f35698s = i10;
            i10 += 2;
            this.f35701y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f35697r.size() + i10;
        if (f70Var.R) {
            if (j10 != 0) {
                this.F = ChatObject.canUserDoAdminAction(f70Var.getMessagesController().getChat(Long.valueOf(j10)), 3) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat chat = f70Var.getMessagesController().getChat(Long.valueOf(j3));
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
        if (this.f35696n) {
            if (i10 == this.f35695f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f35699w) {
            if (i10 != this.f35698s) {
                if (i10 != this.f35700x && i10 != this.f35701y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f35697r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof e70)) {
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        boolean z10;
        CharSequence charSequence;
        String publicUsername;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        ArrayList arrayList = this.f35697r;
        f70 f70Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == this.f35699w) {
                        r8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.j6.f20990v6, org.telegram.ui.ActionBar.j6.f20972u6);
                        return;
                    } else if (this.F == 2) {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.j6.f20827m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    } else {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.j6.f20827m6, org.telegram.ui.ActionBar.j6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f35696n) {
                int size = this.d.size();
                hg.b2 b2Var = this.f35695f;
                ArrayList arrayList2 = b2Var.f10982e;
                ArrayList arrayList3 = b2Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i10 >= 0 && i10 < size) {
                    tLObject = (TLObject) this.d.get(i10);
                } else if (i10 >= size && i10 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i10 - size);
                } else if (i10 > size + size3 && i10 <= size2 + size + size3) {
                    tLObject = (TLObject) b2Var.f10982e.get(((i10 - size) - size3) - 1);
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
                        charSequence = (CharSequence) this.f35694e.get(i10);
                        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
                            if (charSequence.toString().startsWith("@" + publicUsername)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i10 > size && !TextUtils.isEmpty(publicUsername)) {
                        String str = b2Var.f10981c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f35700x) {
                f4Var.f21914r = true;
                f4Var.f21912f = "premium";
                f4Var.f21908a.setImageDrawable(org.telegram.ui.Cells.f4.b(f4Var.getContext(), false));
                f4Var.f21909b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.j5 j5Var = f4Var.f21910c;
                int i12 = org.telegram.ui.ActionBar.j6.f21042y6;
                j5Var.setTag(Integer.valueOf(i12));
                if (f4Var.K) {
                    i12 = org.telegram.ui.ActionBar.j6.f20871og;
                }
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f4Var.M));
                j5Var.setEmojiColor(j5Var.getTextColor());
                j5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (f70Var.X == null) {
                    z11 = false;
                }
                f4Var.c(z11, false);
                return;
            } else if (i10 == this.f35701y) {
                f4Var.f21915s = true;
                f4Var.f21912f = "miniapps";
                org.telegram.ui.Components.x9 x9Var = f4Var.f21908a;
                f4Var.getContext();
                x9Var.setImageDrawable(org.telegram.ui.Cells.f4.a(false));
                f4Var.f21909b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.j5 j5Var2 = f4Var.f21910c;
                int i13 = org.telegram.ui.ActionBar.j6.f21042y6;
                j5Var2.setTag(Integer.valueOf(i13));
                if (f4Var.K) {
                    i13 = org.telegram.ui.ActionBar.j6.f20871og;
                }
                j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f4Var.M));
                j5Var2.setEmojiColor(j5Var2.getTextColor());
                j5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (f70Var.Y == null) {
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
                j3 = ((TLRPC.User) tLObject).f20016id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j3 = -((TLRPC.Chat) tLObject).f19869id;
            } else {
                j3 = 0;
            }
            if (j3 != 0) {
                a0.i iVar = f70Var.J;
                if (iVar != null && iVar.h(j3) >= 0) {
                    f4Var.c(true, false);
                    f4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (f70Var.Z.h(j3) >= 0) {
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
        if (this.f35696n) {
            u3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f35698s) {
            u3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof e70) {
                    u3Var.setText(((e70) tLObject2).f35956a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (f70Var.X == null && f70Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            u3Var.b(string, new l60(this, 2));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View u3Var;
        Context context = this.f35693c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    u3Var = new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Components.u60 u60Var = new org.telegram.ui.Components.u60(context, null, 0, null, 1);
                    u60Var.setLayoutParams(new s4.p0(-1, -1));
                    u60Var.f32755e.setVisibility(8);
                    u60Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    u60Var.setAnimateLayoutChange(true);
                    u3Var = u60Var;
                }
            } else {
                u3Var = new org.telegram.ui.Cells.f4(context, 1, 0, false);
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, null);
        }
        return new s4.c1(u3Var);
    }
}
