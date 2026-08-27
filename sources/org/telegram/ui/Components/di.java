package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class di extends yk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final gi F;

    public final Context f27767c;
    public int d;

    public int f27768e;

    public int f27769f;
    public final ArrayList h = new ArrayList();

    public int f27770n;

    public int f27771r;

    public int f27772s;
    public int v;

    public int f27773w;

    public int f27774x;

    public int f27775y;

    public di(gi giVar, Context context) {
        this.F = giVar;
        this.f27767c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.E;
        gi giVar = this.F;
        return (giVar.D1 == null && (giVar.f28635b0 instanceof org.telegram.ui.rn) && !giVar.D) ? MediaDataController.getInstance(giVar.F1).inlineBots.size() + i10 : i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.E) {
            return (i10 < this.f27768e || i10 >= this.f27769f) ? 0 : 1;
        }
        return 1;
    }

    @Override
    public final void l() {
        int i10 = 0;
        this.E = 0;
        this.d = -1;
        this.f27770n = -1;
        this.f27771r = -1;
        this.f27772s = -1;
        this.v = -1;
        this.f27773w = -1;
        this.f27774x = -1;
        this.f27775y = -1;
        this.A = -1;
        this.C = -1;
        this.D = -1;
        this.B = -1;
        this.f27768e = -1;
        this.f27769f = -1;
        gi giVar = this.F;
        int i11 = giVar.F1;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
        if (giVar.D) {
            this.E = 1;
            this.d = 0;
            int i12 = giVar.E;
            if (i12 == 0 || h7.a8.a(i12, 16)) {
                int i13 = this.E;
                this.E = i13 + 1;
                this.f27770n = i13;
            }
            int i14 = giVar.E;
            if (i14 == 0 || h7.a8.a(i14, 8192)) {
                int i15 = this.E;
                this.E = i15 + 1;
                this.A = i15;
            }
            int i16 = giVar.E;
            if (i16 == 0 || h7.a8.a(i16, 16384)) {
                int i17 = this.E;
                this.E = i17 + 1;
                this.B = i17;
            }
            int i18 = giVar.E;
            if (i18 == 0 || h7.a8.a(i18, 8)) {
                int i19 = this.E;
                this.E = i19 + 1;
                this.f27771r = i19;
            }
            int i20 = giVar.E;
            if (i20 == 0 || h7.a8.a(i20, 64)) {
                int i21 = this.E;
                this.E = i21 + 1;
                this.f27775y = i21;
            }
            int i22 = giVar.E;
            if (i22 == 0 || h7.a8.a(i22, 32768)) {
                int i23 = this.E;
                this.E = i23 + 1;
                this.C = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.rn)) {
            this.d = 0;
            this.E = 2;
            this.f27770n = 1;
            if (giVar.S) {
                this.E = 3;
                this.f27771r = 2;
            }
        } else if (giVar.D1 != null) {
            int i24 = giVar.C1;
            if (i24 == -1) {
                this.d = 0;
                this.f27770n = 1;
                this.E = 3;
                this.f27771r = 2;
            } else {
                if (i24 == 0) {
                    this.E = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.E;
                    this.E = i25 + 1;
                    this.f27770n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.E;
                    this.E = i26 + 1;
                    this.f27771r = i26;
                }
            }
        } else {
            TLRPC.User userI = ((org.telegram.ui.rn) n2Var).i();
            TLRPC.Chat chat = n2Var instanceof org.telegram.ui.rn ? ((org.telegram.ui.rn) n2Var).f42026e : null;
            boolean z10 = userI != null && ((org.telegram.ui.rn) n2Var).getMessagesController().getSendPaidMessagesStars(userI.f22527id) > 0;
            int i27 = this.E;
            this.E = i27 + 1;
            this.d = i27;
            if ((giVar.H1 || giVar.I1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.rn) && !((org.telegram.ui.rn) n2Var).c() && !((org.telegram.ui.rn) n2Var).x())) {
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                if (rnVar.N3 != 5) {
                    this.f27768e = this.E;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObjectI = rnVar.f42026e;
                            if (tLObjectI == null) {
                                tLObjectI = rnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObjectI)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.E;
                    this.E = size2;
                    this.f27769f = size2;
                }
            }
            int i28 = this.E;
            int i29 = i28 + 1;
            this.E = i29;
            this.f27770n = i28;
            boolean z11 = giVar.M1;
            if (z11) {
                this.E = i28 + 2;
                this.f27775y = i29;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i30 = this.E;
                this.E = i30 + 1;
                this.D = i30;
            }
            if (giVar.K1) {
                int i31 = this.E;
                this.E = i31 + 1;
                this.f27772s = i31;
            }
            if (giVar.L1) {
                int i32 = this.E;
                this.E = i32 + 1;
                this.v = i32;
            }
            if (giVar.M1) {
                int i33 = this.E;
                this.E = i33 + 1;
                this.f27773w = i33;
            }
            if ((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).N3 == 0 && userI != null && !z10 && !userI.bot && !qf.q1.f(i11).f46434b.isEmpty()) {
                int i34 = this.E;
                this.E = i34 + 1;
                this.f27774x = i34;
            }
            int i35 = this.E;
            this.E = i35 + 1;
            this.f27771r = i35;
        }
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.F.F1;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z13 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            zh zhVar = (zh) view;
            xg.b bVar = zhVar.f27104a;
            gi giVar = zhVar.d;
            bVar.getClass();
            int i13 = this.f27768e;
            if (i10 >= i13 && i10 < this.f27769f) {
                int i14 = i10 - i13;
                zhVar.setTag(Integer.valueOf(i14));
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i14);
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                if (user != null) {
                    xg.b bVar2 = zhVar.f27104a;
                    bVar2.getClass();
                    bVar2.f49437y = null;
                    bVar2.A = tL_attachMenuBot;
                    bVar2.K = 0;
                    bVar2.L = 0L;
                    bVar2.f49427a.setText(tL_attachMenuBot.short_name);
                    bVar2.f49429c.setRoundRadius(0);
                    bVar2.f49429c.s(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                    bVar2.f49429c.setLayoutParams(h7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    bVar2.I = true;
                    bVar2.a(false);
                    bVar2.f();
                    bVar2.invalidate();
                    zhVar.f35238b = user;
                    zhVar.f35239c = tL_attachMenuBot;
                    zhVar.f27104a.e(false, false);
                    zhVar.invalidate();
                    return;
                }
                return;
            }
            int i15 = i10 - this.E;
            zhVar.setTag(Integer.valueOf(i15));
            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(MediaDataController.getInstance(i11).inlineBots.get(i15).peer.user_id));
            if (user2 == null) {
                return;
            }
            xg.b bVar3 = zhVar.f27104a;
            int i16 = giVar.F1;
            bVar3.f49437y = null;
            bVar3.A = null;
            bVar3.K = 0;
            bVar3.L = 0L;
            bVar3.f49427a.setText(ContactsController.formatName(user2.first_name, user2.last_name));
            if (bVar3.Q == null) {
                bVar3.Q = new y8((org.telegram.ui.ActionBar.c6) null);
            }
            bVar3.Q.m(i16, user2);
            bVar3.f49429c.e(user2, bVar3.Q);
            bVar3.f49429c.s(-1, -1);
            bVar3.f49429c.setRoundRadius(AndroidUtilities.dp(11.33f));
            bVar3.f49429c.setLayoutParams(h7.z5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
            bVar3.f49429c.setColorFilter(null);
            bVar3.I = false;
            bVar3.invalidate();
            zhVar.f35238b = user2;
            zhVar.f35239c = null;
            zhVar.f27104a.e(false, false);
            zhVar.invalidate();
            return;
        }
        ai aiVar = (ai) view;
        aiVar.f27104a.getClass();
        int i17 = this.d;
        Context context = this.f27767c;
        if (i10 == i17) {
            aiVar.a(1, LocaleController.getString(R.string.ChatGallery), xg.a.f49421x);
            aiVar.setTag(1);
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 33 ? i18 < 23 || f0.e.b(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 : f0.e.b(context, "android.permission.READ_MEDIA_IMAGES") == 0 && f0.e.b(context, "android.permission.READ_MEDIA_VIDEO") == 0 && f0.e.b(context, "android.permission.CAMERA") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = !z12;
            z10 = false;
        } else if (i10 == this.f27770n) {
            aiVar.a(4, LocaleController.getString(R.string.ChatDocument), xg.a.f49420w);
            aiVar.setTag(4);
            int i19 = Build.VERSION.SDK_INT;
            if (i19 < 33 ? i19 < 23 || f0.e.b(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 : f0.e.b(context, "android.permission.READ_MEDIA_IMAGES") == 0 && f0.e.b(context, "android.permission.READ_MEDIA_VIDEO") == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 = !z12;
            z10 = false;
        } else {
            if (i10 == this.f27775y) {
                aiVar.a(6, LocaleController.getString(R.string.ChatLocation), xg.a.f49422y);
                aiVar.setTag(6);
            } else if (i10 == this.f27771r) {
                aiVar.a(3, LocaleController.getString(R.string.AttachMusic), xg.a.D);
                aiVar.setTag(3);
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 23) {
                    if (f0.e.b(context, i20 >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z12 = false;
                    }
                    z11 = !z12;
                    z10 = false;
                }
                z12 = true;
                z11 = !z12;
                z10 = false;
            } else if (i10 == this.f27772s) {
                aiVar.a(9, LocaleController.getString(R.string.Poll), xg.a.E);
                aiVar.setTag(9);
            } else if (i10 == this.f27773w) {
                aiVar.a(5, LocaleController.getString(R.string.AttachContact), xg.a.CONTACTS);
                aiVar.setTag(5);
                if (Build.VERSION.SDK_INT < 23 || f0.e.b(context, "android.permission.READ_CONTACTS") == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z11 = !z12;
                z10 = false;
            } else {
                if (i10 == this.f27774x) {
                    aiVar.a(11, LocaleController.getString(R.string.AttachQuickReplies), xg.a.G);
                    aiVar.setTag(11);
                } else if (i10 == this.v) {
                    aiVar.a(12, LocaleController.getString(R.string.Todo), xg.a.f49419s);
                    aiVar.setTag(12);
                } else if (i10 == this.A) {
                    aiVar.a(13, LocaleController.getString(R.string.ChatSticker), xg.a.A);
                    aiVar.setTag(13);
                } else if (i10 == this.C) {
                    aiVar.a(15, LocaleController.getString(R.string.ChatLink), xg.a.H);
                    aiVar.setTag(15);
                } else if (i10 == this.B) {
                    aiVar.a(14, LocaleController.getString(R.string.ChatEmoji), xg.a.B);
                    aiVar.setTag(14);
                } else if (i10 == this.D) {
                    aiVar.a(16, LocaleController.getString(R.string.AttachArticle), xg.a.I);
                    aiVar.setTag(16);
                    z10 = !MessagesController.getInstance(i11).storyEntitiesAllowed();
                    z11 = false;
                }
                z11 = false;
                z10 = true;
            }
            z11 = false;
            z10 = false;
        }
        aiVar.f27104a.d(z11 ? "!" : null, z11, false);
        xg.b bVar4 = aiVar.f27104a;
        if (z10 && !UserConfig.getInstance(i11).isPremium()) {
            z13 = true;
        }
        bVar4.setPremiumBadge(z13);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f27767c;
        gi giVar = this.F;
        View zhVar = i10 != 0 ? new zh(giVar, context) : new ai(giVar, context);
        zhVar.setImportantForAccessibility(1);
        zhVar.setFocusable(true);
        zhVar.setLayoutParams(new f2.y0(-2, -1));
        return new lk0(zhVar);
    }

    @Override
    public final void y(f2.o1 o1Var) {
    }
}
