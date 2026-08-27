package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

public final class m50 extends org.telegram.ui.Components.yk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final s50 I;

    public final Context f40360c;
    public int d;

    public int f40361e;

    public int f40362f;
    public int h;

    public int f40363n;

    public int f40364r;

    public int f40365s;
    public int v;

    public int f40366w;

    public int f40367x;

    public int f40368y;

    public m50(s50 s50Var, LaunchActivity launchActivity) {
        this.I = s50Var;
        this.f40360c = launchActivity;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        s50 s50Var = this.I;
        ArrayList arrayList = s50Var.m0;
        ChatObject.Call call = s50Var.W0;
        if (call == null || call.isScheduled() || s50Var.f42467o0) {
            return;
        }
        this.f40366w = -1;
        this.f40367x = -1;
        this.f40368y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.B = 0;
        this.H = s50Var.W0.participants.h(MessageObject.getPeerId(s50Var.f42502w0)) >= 0;
        if (s50Var.o1()) {
            int i10 = this.B;
            this.B = i10 + 1;
            this.G = i10;
        }
        int i11 = this.B;
        this.C = i11;
        int size = arrayList.size() + i11;
        this.B = size;
        this.D = size;
        if (arrayList.size() > 0) {
            int i12 = this.B;
            this.B = i12 + 1;
            this.E = i12;
        }
        if (!arrayList.isEmpty() && s50Var.Q0() && s50Var.W0.call.participants_count > s50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
            int i13 = this.B;
            this.B = i13 + 1;
            this.F = i13;
        }
        this.d = this.B;
        if (!s50Var.r1()) {
            this.B = s50Var.W0.visibleParticipants.size() + this.B;
        }
        this.f40361e = this.B;
        if (s50Var.W0.invitedUsers.isEmpty() || s50Var.r1()) {
            this.f40362f = -1;
            this.h = -1;
        } else {
            int i14 = this.B;
            this.f40362f = i14;
            int size2 = s50Var.W0.invitedUsers.size() + i14;
            this.B = size2;
            this.h = size2;
        }
        if (s50Var.W0.shadyJoinParticipants.isEmpty() || s50Var.r1()) {
            this.f40363n = -1;
            this.f40364r = -1;
        } else {
            int i15 = this.B;
            this.f40363n = i15;
            int size3 = s50Var.W0.shadyJoinParticipants.size() + i15;
            this.B = size3;
            this.f40364r = size3;
        }
        if (s50Var.W0.shadyLeftParticipants.isEmpty() || s50Var.r1()) {
            this.f40365s = -1;
            this.v = -1;
        } else {
            int i16 = this.B;
            this.f40365s = i16;
            int size4 = s50Var.W0.shadyLeftParticipants.size() + i16;
            this.B = size4;
            this.v = size4;
        }
        if (s50Var.o1()) {
            int i17 = this.B;
            this.f40367x = i17;
            this.B = i17 + 2;
            this.f40368y = i17 + 1;
        } else if (!s50Var.r1() && (((!ChatObject.isChannel(s50Var.V0) || ((chat2 = s50Var.V0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(s50Var.V0)) || (ChatObject.isChannel(s50Var.V0) && (chat = s50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            int i18 = this.B;
            this.B = i18 + 1;
            this.f40366w = i18;
        }
        int i19 = this.B;
        this.B = i19 + 1;
        this.A = i19;
    }

    @Override
    public final int h() {
        return this.B;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.A) {
            return 3;
        }
        if (i10 == this.f40366w || i10 == this.f40367x || i10 == this.f40368y) {
            return 0;
        }
        if (i10 == this.E) {
            return 5;
        }
        if (i10 >= this.d && i10 < this.f40361e) {
            return 1;
        }
        if (i10 >= this.C && i10 < this.D) {
            return 4;
        }
        if (i10 == this.F) {
            return 6;
        }
        return i10 == this.G ? 7 : 2;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        z40 z40Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.y8 y8Var;
        TLRPC.User user;
        int i11;
        float f10;
        float f11;
        float f12;
        ChatObject.VideoParticipant videoParticipant;
        z40 z40Var2;
        s50 s50Var = this.I;
        ArrayList arrayList = s50Var.f42516z0;
        ArrayList arrayList2 = s50Var.B0;
        ArrayList arrayList3 = s50Var.m0;
        ArrayList arrayList4 = s50Var.A0;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        float f13 = 0.0f;
        TLRPC.FileLocation fileLocation = null;
        fileLocation = null;
        TLRPC.FileLocation fileLocation2 = null;
        l = null;
        l = null;
        l = null;
        Long l10 = null;
        fileLocation = null;
        if (i12 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == this.f40367x) {
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, ((org.telegram.ui.ActionBar.e3) s50Var).resourcesProvider);
                u3Var.a(iV0, iV0);
                u3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipConferenceAddPeople), true);
                return;
            } else {
                if (i10 == this.f40368y) {
                    int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, ((org.telegram.ui.ActionBar.e3) s50Var).resourcesProvider);
                    u3Var.a(iV1, iV1);
                    u3Var.b(R.drawable.msg_link2, LocaleController.getString(R.string.VoipConferenceShareLink), false);
                    return;
                }
                int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23207lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23260og, false), s50Var.K.getTag() != null ? 1.0f : 0.0f, 1.0f);
                u3Var.a(offsetColor, offsetColor);
                if (!ChatObject.isChannel(s50Var.V0) || (chat = s50Var.V0) == null || chat.megagroup || !ChatObject.isPublic(chat)) {
                    u3Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.VoipGroupInviteMember), false);
                    return;
                } else {
                    u3Var.b(R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareLink), false);
                    return;
                }
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
            int i13 = i10 - this.d;
            if (s50Var.f42467o0) {
                if (i13 < 0 || i13 >= arrayList.size()) {
                    groupCallParticipant = null;
                } else {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i13);
                }
            } else if (i13 < 0 || i13 >= s50Var.W0.visibleParticipants.size()) {
                groupCallParticipant = null;
            } else {
                groupCallParticipant = s50Var.W0.visibleParticipants.get(i13);
            }
            if (groupCallParticipant != null) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                long peerId2 = MessageObject.getPeerId(s50Var.f42502w0);
                if (peerId == peerId2 && (z40Var = s50Var.f42429e2) != null) {
                    fileLocation = z40Var.f45025c;
                }
                TLRPC.FileLocation fileLocation3 = fileLocation;
                float f14 = fileLocation3 != null ? s50Var.f42429e2.f45023a : 1.0f;
                boolean z13 = b4Var.getParticipant() != null && MessageObject.getPeerId(b4Var.getParticipant().peer) == peerId;
                b4Var.e(s50Var.d, groupCallParticipant, s50Var.W0, peerId2, fileLocation3, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.w3 w3Var = b4Var.f24105x;
                w3Var.setProgress(f14);
                if (f14 < 1.0f) {
                    AndroidUtilities.updateViewVisibilityAnimated(w3Var, true, 1.0f, z14);
                    return;
                } else {
                    AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, z14);
                    return;
                }
            }
            return;
        }
        if (i12 != 2) {
            if (i12 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
            ChatObject.VideoParticipant participant = lVar.getParticipant();
            int i14 = i10 - this.C;
            lVar.f33692a = s50Var.f42417c.i(i10);
            if (s50Var.f42467o0) {
                if (i14 < 0 || i14 >= arrayList4.size()) {
                    videoParticipant = null;
                } else {
                    videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i14);
                }
            } else if (i14 < 0 || i14 >= arrayList3.size()) {
                videoParticipant = null;
            } else {
                videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i14);
            }
            if (videoParticipant != null) {
                if (MessageObject.getPeerId(videoParticipant.participant.peer) == MessageObject.getPeerId(s50Var.f42502w0) && (z40Var2 = s50Var.f42429e2) != null) {
                    fileLocation2 = z40Var2.f45025c;
                }
                if (fileLocation2 != null) {
                    float f15 = s50Var.f42429e2.f45023a;
                }
                if (lVar.getParticipant() != null) {
                    lVar.getParticipant().equals(videoParticipant);
                }
                lVar.d = videoParticipant;
            }
            if (participant == null || participant.equals(videoParticipant) || !lVar.f33695e || lVar.getRenderer() == null) {
                return;
            }
            s50.N(s50Var, lVar, false);
            s50.N(s50Var, lVar, true);
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        int i15 = i10 - this.f40362f;
        int i16 = i10 - this.f40363n;
        if (i16 < 0 || i16 >= s50Var.W0.shadyJoinParticipants.size()) {
            int i17 = i10 - this.f40365s;
            if (i17 < 0 || i17 >= s50Var.W0.shadyLeftParticipants.size()) {
                if (s50Var.f42467o0) {
                    if (i15 >= 0 && i15 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i15);
                    }
                } else if (i15 >= 0 && i15 < s50Var.W0.invitedUsers.size()) {
                    l10 = s50Var.W0.invitedUsers.get(i15);
                    ChatObject.Call.InvitedUser invitedUser = s50Var.W0.invitedUsersMessageIds.get(l10);
                    z10 = invitedUser != null && invitedUser.isCalling();
                    z11 = false;
                    z12 = false;
                }
                z11 = false;
            } else {
                l10 = s50Var.W0.shadyLeftParticipants.get(i10 - this.f40365s);
                z11 = false;
                z12 = true;
                z10 = false;
            }
            if (l10 != null) {
                int i18 = ((org.telegram.ui.ActionBar.e3) s50Var).currentAccount;
                org.telegram.ui.ActionBar.h5 h5Var = t3Var.f25663c;
                org.telegram.ui.ActionBar.h5 h5Var2 = t3Var.f25662b;
                org.telegram.ui.Components.n9 n9Var = t3Var.f25661a;
                y8Var = t3Var.f25664e;
                user = MessagesController.getInstance(i18).getUser(l10);
                t3Var.f25665f = user;
                if (user == null) {
                    y8Var.g(21);
                } else {
                    y8Var.r(user);
                }
                h5Var2.l(UserObject.getUserName(t3Var.f25665f), false);
                n9Var.getImageReceiver().setCurrentAccount(i18);
                n9Var.e(t3Var.f25665f, y8Var);
                if (z12) {
                    i11 = R.string.ShadyLeaving;
                } else if (z11) {
                    i11 = R.string.ShadyJoining;
                } else if (z10) {
                    i11 = R.string.ConferenceCalling;
                } else {
                    i11 = R.string.Invited;
                }
                h5Var.l(LocaleController.getString(i11), false);
                f10 = 0.5f;
                if (!z11 || z12) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                n9Var.setAlpha(f11);
                if (!z11 || z12) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                h5Var2.setAlpha(f12);
                if (!z11 && !z12) {
                    f10 = 1.0f;
                }
                h5Var.setAlpha(f10);
                ImageView imageView = t3Var.d;
                if (!z11 && !z12) {
                    f13 = 1.0f;
                }
                imageView.setAlpha(f13);
            }
        }
        l10 = s50Var.W0.shadyJoinParticipants.get(i10 - this.f40363n);
        z11 = true;
        z12 = false;
        z10 = false;
        if (l10 != null) {
            int i19 = ((org.telegram.ui.ActionBar.e3) s50Var).currentAccount;
            org.telegram.ui.ActionBar.h5 h5Var3 = t3Var.f25663c;
            org.telegram.ui.ActionBar.h5 h5Var4 = t3Var.f25662b;
            org.telegram.ui.Components.n9 n9Var2 = t3Var.f25661a;
            y8Var = t3Var.f25664e;
            user = MessagesController.getInstance(i19).getUser(l10);
            t3Var.f25665f = user;
            if (user == null) {
                y8Var.g(21);
            } else {
                y8Var.r(user);
            }
            h5Var4.l(UserObject.getUserName(t3Var.f25665f), false);
            n9Var2.getImageReceiver().setCurrentAccount(i19);
            n9Var2.e(t3Var.f25665f, y8Var);
            if (z12) {
                i11 = R.string.ShadyLeaving;
            } else if (z11) {
                i11 = R.string.ShadyJoining;
            } else if (z10) {
                i11 = R.string.ConferenceCalling;
            } else {
                i11 = R.string.Invited;
            }
            h5Var3.l(LocaleController.getString(i11), false);
            f10 = 0.5f;
            if (z11) {
                f11 = 0.5f;
            } else {
                f11 = 0.5f;
            }
            n9Var2.setAlpha(f11);
            if (z11) {
                f12 = 0.5f;
            } else {
                f12 = 0.5f;
            }
            h5Var4.setAlpha(f12);
            if (!z11) {
                f10 = 1.0f;
            }
            h5Var3.setAlpha(f10);
            ImageView imageView2 = t3Var.d;
            if (!z11) {
                f13 = 1.0f;
            }
            imageView2.setAlpha(f13);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j50Var;
        s50 s50Var = this.I;
        AccountInstance accountInstance = s50Var.d;
        Context context = this.f40360c;
        if (i10 == 0) {
            i50 i50Var = new i50(context);
            i50Var.h = 67;
            i50Var.f25702n = 18;
            Paint paint = new Paint();
            i50Var.f25703r = paint;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false));
            i50Var.f25700e = 23;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            i50Var.f25697a = h5Var;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            h5Var.setTextSize(16);
            h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
            h5Var.setImportantForAccessibility(2);
            i50Var.addView(h5Var);
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
            i50Var.f25698b = h5Var2;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
            h5Var2.setTextSize(16);
            h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
            h5Var2.setImportantForAccessibility(2);
            i50Var.addView(h5Var2);
            ImageView imageView = new ImageView(context);
            i50Var.f25699c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false), PorterDuff.Mode.MULTIPLY));
            i50Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            i50Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            i50Var.addView(imageView2);
            i50Var.setFocusable(true);
            j50Var = i50Var;
        } else if (i10 == 1) {
            j50Var = new j50(this, context);
        } else if (i10 == 2) {
            k50 k50Var = new k50(context);
            k50Var.f25666n = org.telegram.ui.ActionBar.g6.f23311rg;
            Paint paint2 = new Paint();
            k50Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false));
            k50Var.f25664e = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            k50Var.f25661a = n9Var;
            n9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
            boolean z10 = LocaleController.isRTL;
            k50Var.addView(n9Var, h7.z5.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            k50Var.f25662b = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
            h5Var3.setTypeface(AndroidUtilities.bold());
            h5Var3.setTextSize(16);
            h5Var3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            boolean z11 = LocaleController.isRTL;
            k50Var.addView(h5Var3, h7.z5.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            k50Var.f25663c = h5Var4;
            h5Var4.setTextSize(15);
            h5Var4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            h5Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, k50Var.f25666n, false));
            h5Var4.l(LocaleController.getString(R.string.Invited), false);
            boolean z12 = LocaleController.isRTL;
            k50Var.addView(h5Var4, h7.z5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            k50Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, k50Var.f25666n, false), PorterDuff.Mode.MULTIPLY));
            k50Var.addView(imageView3, h7.z5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            k50Var.setWillNotDraw(false);
            k50Var.setFocusable(true);
            j50Var = k50Var;
        } else if (i10 == 4) {
            j50Var = new l50(this, context);
        } else if (i10 == 5) {
            j50Var = new org.telegram.ui.Components.zm(context, 14);
        } else if (i10 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                j50Var = textView;
            } else {
                textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                j50Var = textView;
            }
        } else if (i10 != 7) {
            j50Var = new View(context);
        } else {
            if (s50Var.f42456l0 == null) {
                s50Var.f42456l0 = new c50();
            }
            j50Var = new ag.s0(context, s50Var.f42456l0);
        }
        return org.telegram.ui.Cells.pa.l(j50Var, j50Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        o40 o40Var = this.I.K;
        int i10 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i10 == 1) {
            org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
            int i11 = o40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.f23311rg : org.telegram.ui.ActionBar.g6.f23225mg;
            b4Var.f(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            b4Var.setDrawDivider(o1Var.b() != this.B - 2);
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            int i12 = o40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.f23311rg : org.telegram.ui.ActionBar.g6.f23225mg;
            t3Var.a(i12, org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            t3Var.setDrawDivider(o1Var.b() != this.B - 2);
        }
    }
}
