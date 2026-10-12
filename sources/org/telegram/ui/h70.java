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
public final class h70 extends org.telegram.ui.Components.ul0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public final j70 I;
    public final Context f36633c;
    public final hg.a2 f36634f;
    public Runnable h;
    public boolean f36635n;
    public int f36637s;
    public int v;
    public int f36638w;
    public int f36639x;
    public int f36640y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f36636r = new ArrayList();

    public h70(j70 j70Var, Context context) {
        TLRPC.Chat chat;
        String substring;
        String substring2;
        TLRPC.User user;
        this.I = j70Var;
        this.f36633c = context;
        HashSet hashSet = new HashSet();
        ContactsController contactsController = j70Var.getContactsController();
        boolean z10 = j70Var.Q;
        ArrayList<TLRPC.TL_contact> arrayList = contactsController.contacts;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User user2 = j70Var.getMessagesController().getUser(Long.valueOf(arrayList.get(i10).user_id));
            if (user2 != null && !user2.self && !user2.deleted) {
                this.f36636r.add(user2);
                hashSet.add(Long.valueOf(user2.f19363id));
            }
        }
        if (j70Var.P || j70Var.O || z10) {
            ArrayList<TLRPC.Dialog> allDialogs = j70Var.getMessagesController().getAllDialogs();
            if (z10) {
                int size = allDialogs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = allDialogs.get(i11);
                    if (DialogObject.isUserDialog(dialog.f19220id) && !hashSet.contains(Long.valueOf(dialog.f19220id)) && (user = j70Var.getMessagesController().getUser(Long.valueOf(dialog.f19220id))) != null && !UserObject.isDeleted(user) && !UserObject.isUserSelf(user) && !UserObject.isBot(user) && !UserObject.isService(dialog.f19220id) && !MessagesController.isSupportUser(user)) {
                        this.f36636r.add(user);
                        hashSet.add(Long.valueOf(user.f19363id));
                    }
                }
            } else {
                int size2 = allDialogs.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = allDialogs.get(i12);
                    if (DialogObject.isChatDialog(dialog2.f19220id) && (chat = j70Var.getMessagesController().getChat(Long.valueOf(-dialog2.f19220id))) != null && chat.migrated_to == null && (!ChatObject.isChannel(chat) || chat.megagroup)) {
                        this.f36636r.add(chat);
                    }
                }
            }
            Collections.sort(this.f36636r, new Object());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.f36636r.size()) {
                TLObject tLObject2 = (TLObject) this.f36636r.get(i13);
                if (tLObject != null) {
                    String a2 = d70.a(tLObject);
                    if (TextUtils.isEmpty(a2)) {
                        substring = "";
                    } else {
                        substring = a2.substring(0, 1);
                    }
                    String a10 = d70.a(tLObject2);
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
                ArrayList arrayList2 = this.f36636r;
                String a11 = d70.a(tLObject2);
                arrayList2.add(i13, new i70(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f36634f = a2Var;
        a2Var.f10484a = new mu(this, 11);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f21205a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 0) {
            j70 j70Var = this.I;
            if (j70Var.J != null) {
                View view = b1Var.f44838a;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    Object object = ((org.telegram.ui.Cells.g4) view).getObject();
                    if ((object instanceof TLRPC.User) && j70Var.J.h(((TLRPC.User) object).f19363id) >= 0) {
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
        if (!this.f36635n && i10 >= this.E) {
            ArrayList arrayList = this.f36636r;
            int size = arrayList.size();
            int i11 = this.E;
            if (i10 < size + i11) {
                TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
                if (tLObject instanceof i70) {
                    return ((i70) tLObject).f37052a;
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
        this.f36634f.f(null, null);
        hg.a2 a2Var = this.f36634f;
        j70 j70Var = this.I;
        if (!j70Var.O && !j70Var.P) {
            z10 = false;
        } else {
            z10 = true;
        }
        a2Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        l();
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            g70 g70Var = new g70(this, str, 0);
            this.h = g70Var;
            dispatchQueue.postRunnable(g70Var, 300L);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        j70 j70Var = this.I;
        long j10 = j70Var.H;
        long j11 = j70Var.G;
        this.G = -1;
        this.f36637s = -1;
        this.f36638w = -1;
        this.v = -1;
        this.f36639x = -1;
        this.f36640y = -1;
        if (this.f36635n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f36634f;
            int size2 = a2Var.d.size();
            int size3 = a2Var.e.size();
            int i12 = size + size2;
            if (size3 != 0) {
                i12 += size3 + 1;
            }
            this.H = i12;
            return i12;
        }
        if (j70Var.Q) {
            this.f36638w = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (j70Var.V) {
            int i13 = i10 + 1;
            this.v = i10;
            this.f36637s = i10;
            i10 += 2;
            this.f36639x = i13;
        } else if (j70Var.W) {
            int i14 = i10 + 1;
            this.v = i10;
            this.f36637s = i10;
            i10 += 2;
            this.f36640y = i14;
        } else {
            this.v = i10;
        }
        this.E = i10;
        int size4 = this.f36636r.size() + i10;
        if (j70Var.R) {
            if (j11 != 0) {
                this.F = ChatObject.canUserDoAdminAction(j70Var.getMessagesController().getChat(Long.valueOf(j11)), 3) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat chat = j70Var.getMessagesController().getChat(Long.valueOf(j10));
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
        if (this.f36635n) {
            if (i10 == this.f36634f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i10 != this.f36638w) {
            if (i10 != this.f36637s) {
                if (i10 != this.f36639x && i10 != this.f36640y) {
                    if (this.F != 0 && i10 == 0) {
                        return 2;
                    }
                    if (this.G == i10) {
                        return 3;
                    }
                    int i11 = i10 - this.E;
                    if (i11 >= 0) {
                        ArrayList arrayList = this.f36636r;
                        if (i11 < arrayList.size() && (arrayList.get(i10 - this.E) instanceof i70)) {
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
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        ArrayList arrayList = this.f36636r;
        j70 j70Var = this.I;
        if (i11 != 0) {
            boolean z11 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == this.f36638w) {
                        r8Var.m(R.drawable.menu_link_create2, LocaleController.getString(R.string.GroupCallCreateLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
                        return;
                    } else if (this.F == 2) {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.ChannelInviteViaLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.g6.f20064m6, org.telegram.ui.ActionBar.g6.G6);
                        return;
                    } else {
                        r8Var.m(R.drawable.msg_link2, LocaleController.getString(R.string.InviteToGroupByLink), false);
                        r8Var.e(org.telegram.ui.ActionBar.g6.f20064m6, org.telegram.ui.ActionBar.g6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (this.f36635n) {
                int size = this.d.size();
                hg.a2 a2Var = this.f36634f;
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
                        String str = a2Var.f10486c;
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
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false)), indexOfIgnoreCase, length + indexOfIgnoreCase, 33);
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
            } else if (i10 == this.f36639x) {
                g4Var.f21210r = true;
                g4Var.f21208f = "premium";
                g4Var.f21205a.setImageDrawable(org.telegram.ui.Cells.g4.b(g4Var.getContext(), false));
                g4Var.f21206b.l(LocaleController.getString(R.string.PrivacyPremium), false);
                org.telegram.ui.ActionBar.h5 h5Var = g4Var.f21207c;
                int i12 = org.telegram.ui.ActionBar.g6.f20288y6;
                h5Var.setTag(Integer.valueOf(i12));
                if (g4Var.K) {
                    i12 = org.telegram.ui.ActionBar.g6.f20112og;
                }
                h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, g4Var.M));
                h5Var.setEmojiColor(h5Var.getTextColor());
                h5Var.l(LocaleController.getString(R.string.PrivacyPremiumText), false);
                if (j70Var.X == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else if (i10 == this.f36640y) {
                g4Var.f21211s = true;
                g4Var.f21208f = "miniapps";
                org.telegram.ui.Components.z9 z9Var = g4Var.f21205a;
                g4Var.getContext();
                z9Var.setImageDrawable(org.telegram.ui.Cells.g4.a(false));
                g4Var.f21206b.l(LocaleController.getString(R.string.PrivacyMiniapps), false);
                org.telegram.ui.ActionBar.h5 h5Var2 = g4Var.f21207c;
                int i13 = org.telegram.ui.ActionBar.g6.f20288y6;
                h5Var2.setTag(Integer.valueOf(i13));
                if (g4Var.K) {
                    i13 = org.telegram.ui.ActionBar.g6.f20112og;
                }
                h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i13, g4Var.M));
                h5Var2.setEmojiColor(h5Var2.getTextColor());
                h5Var2.l(LocaleController.getString(R.string.PrivacyMiniappsText), false);
                if (j70Var.Y == null) {
                    z11 = false;
                }
                g4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i10 - this.E);
                spannableStringBuilder = null;
            }
            g4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f19363id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f19216id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = j70Var.J;
                if (hVar != null && hVar.h(j10) >= 0) {
                    g4Var.c(true, false);
                    g4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (j70Var.Z.h(j10) >= 0) {
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
        if (this.f36635n) {
            v3Var.setText(LocaleController.getString(R.string.GlobalSearch));
        } else if (i10 == this.f36637s) {
            v3Var.setText(LocaleController.getString(R.string.PrivacyUserTypes));
        } else {
            int i14 = i10 - this.E;
            if (i14 >= 0 && i14 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                if (tLObject2 instanceof i70) {
                    v3Var.setText(((i70) tLObject2).f37052a.toUpperCase());
                }
            }
        }
        if (i10 == this.v) {
            if (j70Var.X == null && j70Var.Z.i()) {
                string = "";
            } else {
                string = LocaleController.getString(R.string.DeselectAll);
            }
            v3Var.b(string, new t60(this, 1));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View v3Var;
        Context context = this.f36633c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    v3Var = new org.telegram.ui.Cells.r8(context);
                } else {
                    org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null, 0, null, 1);
                    s70Var.setLayoutParams(new s4.o0(-1, -1));
                    s70Var.e.setVisibility(8);
                    s70Var.d.setText(LocaleController.getString(R.string.NoContacts));
                    s70Var.setAnimateLayoutChange(true);
                    v3Var = s70Var;
                }
            } else {
                v3Var = new org.telegram.ui.Cells.g4(1, 0, context, false);
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, null);
        }
        return new s4.b1(v3Var);
    }
}
